package com.crrepa.band.my.device.alarm;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityBandAlarmBinding;
import com.crrepa.band.my.device.alarm.adapter.BandAlarmAdapter;
import com.crrepa.band.my.model.db.Alarm;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.yanzhenjie.recyclerview.k;
import com.yanzhenjie.recyclerview.l;
import java.util.List;

/* loaded from: classes2.dex */
public class BandAlarmActivity extends BaseVBActivity<ActivityBandAlarmBinding> implements j {
    private static final int EDIT_REQUEST_CODE = 1;
    private final i presenter = new i();
    private final BandAlarmAdapter alarmAdapter = new BandAlarmAdapter();
    private final k swipeMenuCreator = new k() { // from class: com.crrepa.band.my.device.alarm.d
        @Override // com.yanzhenjie.recyclerview.k
        public final void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
            BandAlarmActivity.this.lambda$new$4(iVar, iVar2, i8);
        }
    };
    private final com.yanzhenjie.recyclerview.g menuItemClickListener = new com.yanzhenjie.recyclerview.g() { // from class: com.crrepa.band.my.device.alarm.e
        @Override // com.yanzhenjie.recyclerview.g
        public final void onItemClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
            BandAlarmActivity.this.lambda$new$5(jVar, i8);
        }
    };

    private void deleteAlarm(int i8) {
        this.presenter.deleteAlarm(this.alarmAdapter.getItem(i8), i8);
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) BandAlarmActivity.class);
    }

    private void initAlarmList() {
        ((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.setLayoutManager(new LinearLayoutManager(this));
        this.alarmAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.alarm.f
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                BandAlarmActivity.this.lambda$initAlarmList$3(baseQuickAdapter, view, i8);
            }
        });
    }

    private void initScrollingTitle() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityBandAlarmBinding) this.binding).appbar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityBandAlarmBinding) vb).appbar.tvTitle, ((ActivityBandAlarmBinding) vb).appbar.tvExpandedTitle);
        setSupportActionBar(((ActivityBandAlarmBinding) this.binding).appbar.toolbar);
        ((ActivityBandAlarmBinding) this.binding).appbar.tvTitle.setText(R.string.daily_alarm_clock);
        ((ActivityBandAlarmBinding) this.binding).appbar.tvExpandedTitle.setText(R.string.daily_alarm_clock);
        ((ActivityBandAlarmBinding) this.binding).appbar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityBandAlarmBinding) this.binding).appbar.ivHistory.setImageResource(R$drawable.ic_title_add);
        ((ActivityBandAlarmBinding) this.binding).appbar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.alarm.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandAlarmActivity.this.lambda$initScrollingTitle$1(view);
            }
        });
        ((ActivityBandAlarmBinding) this.binding).appbar.ivHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.alarm.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandAlarmActivity.this.lambda$initScrollingTitle$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAlarmList$3(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        startAlarmEditActivity(((Alarm) baseQuickAdapter.getData().get(i8)).getAlarm_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        onAddAlarmClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScrollingTitle$2(View view) {
        onAddAlarmClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
        iVar2.addMenuItem(new l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.color_swipe_menu_item_bg)).setImage(R$drawable.ic_delete).setWidth(getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(com.yanzhenjie.recyclerview.j jVar, int i8) {
        jVar.closeMenu();
        deleteAlarm(i8);
    }

    private void startAlarmEditActivity(int i8) {
        startActivityForResult(BandAlarmEditActivity.getEditCallingIntent(this, i8, this.presenter.isNewAlarm()), 1);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        this.presenter.setView(this);
        initScrollingTitle();
        initAlarmList();
        this.presenter.getAllAlarm();
        ((ActivityBandAlarmBinding) this.binding).shadowAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.alarm.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandAlarmActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (1 == i8 && -1 == i9) {
            this.presenter.updateAlarnList();
        }
    }

    public void onAddAlarmClicked() {
        startActivityForResult(BandAlarmEditActivity.getAddCallingIntent(this, this.presenter.getMaxAlarmCount()), 1);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // com.crrepa.band.my.device.alarm.j
    public void renderAddAlarmVisible(boolean z7) {
        if (z7) {
            if (this.alarmAdapter.getData().size() > 0) {
                ((ActivityBandAlarmBinding) this.binding).rlEmpty.setVisibility(8);
            } else {
                ((ActivityBandAlarmBinding) this.binding).rlEmpty.setVisibility(0);
            }
        }
        ((ActivityBandAlarmBinding) this.binding).appbar.ivHistory.setVisibility(z7 ? 0 : 8);
    }

    @Override // com.crrepa.band.my.device.alarm.j
    public void renderAlarmHint(int i8) {
        ((ActivityBandAlarmBinding) this.binding).tvAlarmHint.setVisibility(0);
        ((ActivityBandAlarmBinding) this.binding).tvAlarmHint.setText(getString(R.string.alarm_use_guidance_tips, String.valueOf(i8)));
    }

    @Override // com.crrepa.band.my.device.alarm.j
    public void renderAlarmList(List<Alarm> list, boolean z7) {
        if (((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.getAdapter() == null) {
            if (z7) {
                ((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.setSwipeMenuCreator(this.swipeMenuCreator);
                ((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.setOnItemMenuClickListener(this.menuItemClickListener);
            }
            ((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.setAdapter(this.alarmAdapter);
        }
        if (list == null || list.size() == 0) {
            ((ActivityBandAlarmBinding) this.binding).rlEmpty.setVisibility(0);
            ((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.setVisibility(8);
            return;
        }
        ((ActivityBandAlarmBinding) this.binding).rlEmpty.setVisibility(8);
        ((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.setVisibility(0);
        List<Alarm> data = this.alarmAdapter.getData();
        if (data.isEmpty() || list.size() != data.size()) {
            this.alarmAdapter.setNewData(list);
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!list.get(i8).equals(data.get(i8))) {
                data.set(i8, list.get(i8));
                this.alarmAdapter.notifyItemChanged(i8);
            }
        }
    }

    @Override // com.crrepa.band.my.device.alarm.j
    public void renderDeleteAlarm(int i8, boolean z7) {
        if (z7) {
            this.alarmAdapter.remove(i8);
            if (this.alarmAdapter.getData().size() == 0) {
                ((ActivityBandAlarmBinding) this.binding).rlEmpty.setVisibility(0);
                ((ActivityBandAlarmBinding) this.binding).rcvBandAlarm.setVisibility(8);
            }
        } else {
            r0.showLong(this, getString(R.string.band_setting_send_fail));
        }
        renderAddAlarmVisible(true);
    }
}
