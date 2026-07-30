package com.crrepa.band.my.device.muslim;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityMuslimHomeBinding;
import com.crrepa.band.my.device.ContentPagerAdapter;
import com.crrepa.band.my.device.muslim.adapter.FunctionAdapter;
import com.crrepa.band.my.device.muslim.model.MuslimFunction;
import com.crrepa.band.my.device.muslim.model.MuslimPray;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.training.GpsStateChangeReceiver;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class MuslimHomeActivity extends BaseVBActivity<ActivityMuslimHomeBinding> implements com.crrepa.band.my.device.muslim.view.c, OnItemClickListener {
    private MaterialDialog locationOpenDialog;
    private GpsStateChangeReceiver receiver;
    private final com.crrepa.band.my.device.muslim.presenter.c presenter = new com.crrepa.band.my.device.muslim.presenter.c();
    private int pageIndex = 0;

    class a extends ViewPager2.OnPageChangeCallback {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i8) {
            super.onPageSelected(i8);
            MuslimHomeActivity.this.pageIndex = i8;
            MuslimHomeActivity.this.presenter.showCurrentPager(i8);
        }
    }

    private void dismissLocationOpenDialog() {
        MaterialDialog materialDialog = this.locationOpenDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        this.locationOpenDialog.dismiss();
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) MuslimHomeActivity.class);
    }

    private void initListener() {
        ((ActivityMuslimHomeBinding) this.binding).btnPrev.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MuslimHomeActivity.this.lambda$initListener$2(view);
            }
        });
        ((ActivityMuslimHomeBinding) this.binding).btnNext.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MuslimHomeActivity.this.lambda$initListener$3(view);
            }
        });
        ((ActivityMuslimHomeBinding) this.binding).vpPray.registerOnPageChangeCallback(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        if (((ActivityMuslimHomeBinding) this.binding).vpPray.getAdapter() == null && ((ActivityMuslimHomeBinding) this.binding).vpPray.getAdapter().getItemCount() == 0) {
            return;
        }
        int i8 = this.pageIndex - 1;
        this.pageIndex = i8;
        if (i8 < 0) {
            this.presenter.updateMonthDateList(-1, false);
            this.pageIndex = ((ActivityMuslimHomeBinding) this.binding).vpPray.getAdapter().getItemCount() - 1;
        }
        ((ActivityMuslimHomeBinding) this.binding).vpPray.setCurrentItem(this.pageIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3(View view) {
        if (((ActivityMuslimHomeBinding) this.binding).vpPray.getAdapter() == null && ((ActivityMuslimHomeBinding) this.binding).vpPray.getAdapter().getItemCount() == 0) {
            return;
        }
        int i8 = this.pageIndex + 1;
        this.pageIndex = i8;
        if (i8 >= ((ActivityMuslimHomeBinding) this.binding).vpPray.getAdapter().getItemCount()) {
            this.presenter.updateMonthDateList(1, false);
            this.pageIndex = 0;
        }
        ((ActivityMuslimHomeBinding) this.binding).vpPray.setCurrentItem(this.pageIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderNextPray$4(MuslimPray muslimPray) {
        int width = ((ActivityMuslimHomeBinding) this.binding).rlNextPray.getWidth();
        int height = ((ActivityMuslimHomeBinding) this.binding).rlNextPray.getHeight();
        int width2 = ((ActivityMuslimHomeBinding) this.binding).ivNextPrayBg.getWidth();
        int height2 = ((ActivityMuslimHomeBinding) this.binding).ivNextPrayBg.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(com.moyoung.dafit.module.common.utils.g.drawableToBitmap(ResourcesCompat.getDrawable(getResources(), muslimPray.getIcon(), null), width, height), (width - width2) / 2, (height - height2) / 2, width2, height2);
        if (createBitmap != null) {
            ((ActivityMuslimHomeBinding) this.binding).ivNextPrayBg.setBackground(com.moyoung.dafit.module.common.utils.g.blur(this, createBitmap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$1(View view) {
        startActivity(new Intent(this, (Class<?>) PrayTimingSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationOpenDialog$5(MaterialDialog materialDialog, DialogAction dialogAction) {
        com.crrepa.band.my.training.utils.i.startLocationSetting(this, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showLocationOpenDialog$6(MaterialDialog materialDialog, DialogAction dialogAction) {
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityMuslimHomeBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityMuslimHomeBinding) vb).topBar.tvTitle, ((ActivityMuslimHomeBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityMuslimHomeBinding) this.binding).topBar.toolbar);
        ((ActivityMuslimHomeBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_title);
        ((ActivityMuslimHomeBinding) this.binding).topBar.toolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.color_assist_3));
        ((ActivityMuslimHomeBinding) this.binding).topBar.toolbarLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.color_assist_3));
        ((ActivityMuslimHomeBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_title);
        ((ActivityMuslimHomeBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityMuslimHomeBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MuslimHomeActivity.this.lambda$setSupportActionBar$0(view);
            }
        });
        ((ActivityMuslimHomeBinding) this.binding).topBar.ivHistory.setImageResource(R$drawable.ic_musilm_setting);
        ((ActivityMuslimHomeBinding) this.binding).topBar.ivHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MuslimHomeActivity.this.lambda$setSupportActionBar$1(view);
            }
        });
    }

    private void showLocation() {
        if (!this.presenter.isLocationOpen()) {
            renderLocationFailure(false);
        } else if (com.crrepa.band.my.training.utils.i.isPermission(this)) {
            ((ActivityMuslimHomeBinding) this.binding).tvGpsOffHint.locationOffHint.setVisibility(8);
            this.presenter.getPrayTimeList(this, true, false);
        } else {
            com.crrepa.band.my.device.muslim.utils.b.setLocationError();
            renderLocationFailure(true);
        }
    }

    private void showLocationOpenDialog() {
        if (this.locationOpenDialog == null) {
            this.locationOpenDialog = new MaterialDialog.e(this).title(R.string.muslim_location_fail_dialog_title).positiveText(R.string.muslim_settings).negativeText(R.string.muslim_cancel).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.muslim.t
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MuslimHomeActivity.this.lambda$showLocationOpenDialog$5(materialDialog, dialogAction);
                }
            }).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.muslim.u
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MuslimHomeActivity.lambda$showLocationOpenDialog$6(materialDialog, dialogAction);
                }
            }).canceledOnTouchOutside(false).build();
        }
        this.locationOpenDialog.show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        this.presenter.setView(this, this);
        this.receiver = com.crrepa.band.my.device.muslim.utils.b.getInstance().registerGpsStateChangeReceiver(this);
        com.moyoung.dafit.module.common.utils.k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_assist_3));
        setSupportActionBar();
        initListener();
        this.presenter.showErrorLocationPager(this);
        this.presenter.getFunctionList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        com.crrepa.band.my.device.muslim.utils.b.getInstance().unregisterGpsStateChangeReceiver(this, this.receiver);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        this.presenter.startActivity(i8, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        showLocation();
        if (this.presenter.isLocationOpen() && ((ActivityMuslimHomeBinding) this.binding).tvGpsOffHint.locationOffHint.getVisibility() == 8 && com.crrepa.band.my.device.muslim.utils.d.is12HourTime != BandTimeSystemProvider.is12HourTime()) {
            this.presenter.getPrayTimeList(this, false, false);
        }
        if (!this.presenter.isLocationOpen() && this.presenter.isToDirection()) {
            this.presenter.setToDirection(false);
            dismissLocationOpenDialog();
        }
        this.presenter.resume();
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderLocationFailure(boolean z7) {
        if (!z7) {
            showLocationOpenDialog();
            return;
        }
        dismissLocationOpenDialog();
        ((ActivityMuslimHomeBinding) this.binding).tvGpsOffHint.locationOffHint.setVisibility(0);
        this.presenter.showErrorLocationPager(this);
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderLocationSuccess() {
        dismissLocationOpenDialog();
        ((ActivityMuslimHomeBinding) this.binding).tvGpsOffHint.locationOffHint.setVisibility(8);
        this.presenter.getPrayTimeList(this, false, true);
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderMuslimFunctionList(List<MuslimFunction> list) {
        FunctionAdapter functionAdapter = new FunctionAdapter();
        ((ActivityMuslimHomeBinding) this.binding).rcvMuslimFunction.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityMuslimHomeBinding) this.binding).rcvMuslimFunction.setAdapter(functionAdapter);
        functionAdapter.setNewData(list);
        functionAdapter.setOnItemClickListener(this);
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderNextPray(final MuslimPray muslimPray) {
        ((ActivityMuslimHomeBinding) this.binding).rlNextPray.setBackgroundResource(muslimPray.getIcon());
        ((ActivityMuslimHomeBinding) this.binding).tvPrayName.setText(muslimPray.getName());
        ((ActivityMuslimHomeBinding) this.binding).tvPrayTime.setText(muslimPray.getTime() == null ? "" : muslimPray.getTime());
        ((ActivityMuslimHomeBinding) this.binding).rlNextPray.post(new Runnable() { // from class: com.crrepa.band.my.device.muslim.s
            @Override // java.lang.Runnable
            public final void run() {
                MuslimHomeActivity.this.lambda$renderNextPray$4(muslimPray);
            }
        });
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderNextPrayCountDown(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ActivityMuslimHomeBinding) this.binding).tvCountDown.setText(str);
        } else {
            ((ActivityMuslimHomeBinding) this.binding).tvCountDown.setText(getString(R.string.muslim_pray_start_time, str));
        }
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderPageDate(Date date) {
        ((ActivityMuslimHomeBinding) this.binding).tvDate.setText(com.moyoung.dafit.module.common.utils.m.formatMonthEn(date, getString(R.string.month_day_year_format)));
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderPageIndex(int i8) {
        ((ActivityMuslimHomeBinding) this.binding).vpPray.setCurrentItem(i8, false);
    }

    @Override // com.crrepa.band.my.device.muslim.view.c
    public void renderPrayPager(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(this);
        contentPagerAdapter.setContentFragments(list);
        ((ActivityMuslimHomeBinding) this.binding).vpPray.setAdapter(contentPagerAdapter);
        ((ActivityMuslimHomeBinding) this.binding).vpPray.setOffscreenPageLimit(2);
    }
}
