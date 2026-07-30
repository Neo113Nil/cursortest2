package com.crrepa.band.my.device.cricket;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityCricketBinding;
import com.crrepa.band.my.device.cricket.adapter.CricketMatchesPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class CricketActivity extends BaseRequestPermissionVBActivity<ActivityCricketBinding> implements b1.f {
    private com.crrepa.band.my.device.cricket.presenter.j presenter = new com.crrepa.band.my.device.cricket.presenter.j();

    class a implements TabLayout.OnTabSelectedListener {
        final /* synthetic */ TabLayout val$tabLayout;

        a(TabLayout tabLayout) {
            this.val$tabLayout = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 1) {
                this.val$tabLayout.setBackgroundResource(R.drawable.shape_cricket_tab_half_top_corner);
            } else {
                this.val$tabLayout.setBackgroundResource(R.drawable.shape_cricket_tab_corner_bg);
            }
            ((TextView) tab.getCustomView().findViewById(R.id.tv_tab_name)).setTextColor(ContextCompat.getColor(CricketActivity.this, R.color.black));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) tab.getCustomView().findViewById(R.id.tv_tab_name)).setTextColor(ContextCompat.getColor(CricketActivity.this, R.color.assist_7_B3));
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) CricketActivity.class);
    }

    private void initWindow() {
        Window window = getWindow();
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onStop$0(Context context) {
        com.crrepa.band.my.device.cricket.notify.d.getInstance().setGameReminder(context, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$1(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$2(View view) {
        renderToSetting();
    }

    private void renderToSetting() {
        startActivity(CricketSettingActivity.getCallingIntent(this));
    }

    private void setActionBar() {
        ((ActivityCricketBinding) this.binding).includedTitle.appbar.setBackgroundColor(0);
        ((ActivityCricketBinding) this.binding).includedTitle.toolbarLayout.setBackgroundColor(0);
        ((ActivityCricketBinding) this.binding).includedTitle.toolbar.setBackgroundColor(0);
    }

    private void setTitle() {
        ((ActivityCricketBinding) this.binding).includedTitle.tvExpandedTitle.setText(R.string.cricket_matches_title);
        ((ActivityCricketBinding) this.binding).includedTitle.tvExpandedTitle.setTextColor(ContextCompat.getColor(this, R.color.white));
        ((ActivityCricketBinding) this.binding).includedTitle.ivTitleBack.setImageResource(R.drawable.ic_back_w);
        ((ActivityCricketBinding) this.binding).includedTitle.ivHistory.setImageResource(R$drawable.ic_set);
        ((ActivityCricketBinding) this.binding).includedTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.cricket.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CricketActivity.this.lambda$setTitle$1(view);
            }
        });
        ((ActivityCricketBinding) this.binding).includedTitle.ivHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.cricket.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CricketActivity.this.lambda$setTitle$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        initWindow();
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        this.presenter.loadViewPagerFragment();
        this.presenter.initTabLayout(this);
        this.presenter.updateCricketSchedule();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    void onNeverAskAgain() {
        com.orhanobut.logger.f.d("onNeverAskAgain");
    }

    void onPermissionDenied() {
        com.orhanobut.logger.f.d("onPermissionDenied");
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        d.syncCalendarWithPermissionCheck(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        Observable.just(this).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.cricket.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CricketActivity.lambda$onStop$0((Context) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
    }

    @Override // b1.f
    public void renderTabLayout(String[] strArr) {
        VB vb = this.binding;
        TabLayout tabLayout = ((ActivityCricketBinding) vb).tabCricketType;
        tabLayout.setupWithViewPager(((ActivityCricketBinding) vb).pagerCricket);
        int count = ((ActivityCricketBinding) this.binding).pagerCricket.getAdapter().getCount();
        for (int i8 = 0; i8 < count; i8++) {
            TabLayout.Tab tabAt = ((ActivityCricketBinding) this.binding).tabCricketType.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_cricket_tab);
                TextView textView = (TextView) tabAt.getCustomView().findViewById(R.id.tv_tab_name);
                textView.setText(strArr[i8]);
                if (i8 == 0) {
                    textView.setTextColor(ContextCompat.getColor(this, R.color.black));
                } else {
                    textView.setTextColor(ContextCompat.getColor(this, R.color.assist_7_B3));
                }
            }
        }
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a(tabLayout));
    }

    @Override // b1.f
    public void renderViewPager(List<Fragment> list) {
        CricketMatchesPagerAdapter cricketMatchesPagerAdapter = new CricketMatchesPagerAdapter(getSupportFragmentManager());
        cricketMatchesPagerAdapter.setContentFragments(list);
        ((ActivityCricketBinding) this.binding).pagerCricket.setAdapter(cricketMatchesPagerAdapter);
        ((ActivityCricketBinding) this.binding).pagerCricket.setOffscreenPageLimit(list.size());
    }

    void showRationaleForCalendar(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForCalendar");
        aVar.proceed();
    }

    @SuppressLint({"IntentReset", "CheckResult"})
    void syncCalendar() {
    }
}
