package com.crrepa.band.my;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityMainBinding;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.muslim.model.BandMuslimUpdateLocationEvent;
import com.crrepa.band.my.device.ota.BandUpgradeActivity;
import com.crrepa.band.my.device.scan.BandPairResultActivity;
import com.crrepa.band.my.device.scan.m;
import com.crrepa.band.my.health.water.WaterReminderActivity;
import com.crrepa.band.my.health.water.model.BandWaterReminderEvent;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.home.training.model.LanguageSwitchedEvent;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.classes.coach.model.event.SportTimeUpdateEvent;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.baseui.q;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.i;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import com.orhanobut.logger.f;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class MainActivity extends BaseRequestPermissionActivity<ActivityMainBinding> implements com.crrepa.band.my.home.b {
    public static final int BOTTOM_TAB_BAND_SETTING = 2;
    private MaterialDialog bondDialog;
    private m pairingCodeDialog;
    private final com.crrepa.band.my.home.a presenter = new com.crrepa.band.my.home.a();

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 2) {
                MainActivity.this.queryBandInfo();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    class b implements MaterialDialog.l {
        b() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
        }
    }

    class c implements MaterialDialog.l {
        c() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
            MainActivity mainActivity = MainActivity.this;
            mainActivity.startActivity(BandUpgradeActivity.getRestoreCallingIntent(mainActivity));
        }
    }

    class d implements PermissionDescriptionDialog.b {
        d() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通知", true);
            com.crrepa.band.my.c.enableNotificationsPermissionWithPermissionCheck(MainActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("通知", false);
        }
    }

    private boolean dismissPairingCodeDialog() {
        m mVar = this.pairingCodeDialog;
        if (mVar == null || !mVar.isShowing()) {
            return false;
        }
        this.pairingCodeDialog.dismiss();
        return true;
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) MainActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryBandInfo() {
        this.presenter.queryBandInfo();
    }

    private void showNotificationPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_notification).setTitle(getString(R.string.guidance_permission_notifications_title, getString(R.string.app_name))).setContent(getString(R.string.guidance_permission_notifications_content, getString(R.string.app_name))).setOnClickListener(new d()).build(this).show();
    }

    @Override // com.crrepa.band.my.home.b
    public void dismissUserBondingDialog() {
        MaterialDialog materialDialog = this.bondDialog;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    void enableNotificationsPermission() {
        com.crrepa.band.my.home.guidance.c.systemPermission("通知", true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.presenter.setView(this);
        new i().setup(getApplicationContext());
        this.presenter.getViewPagerFragment();
        this.presenter.getTabLayout();
        this.presenter.showNotification(this);
        this.presenter.checkNetworkConnected(this);
        this.presenter.checkBandFirmwareVersion();
        WaterProvider.updateWaterReminderService(true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        moveTaskToBack(true);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandWaterReminderEvent(BandWaterReminderEvent bandWaterReminderEvent) {
        if (WaterProvider.isWaterReminderEnable()) {
            if (com.moyoung.dafit.module.common.baseui.a.getInstance().getActivityCount() > 0) {
                startActivity(new Intent(this, (Class<?>) WaterReminderActivity.class));
            } else {
                m1.a.showWaterReminderNotification(this);
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.presenter.destroy();
        dismissUserBondingDialog();
        dismissPairingCodeDialog();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onFindPhoneStopEvent(q qVar) {
        com.crrepa.band.my.ble.band.utils.b.getInstance().stop();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onLanguageSwitchedEvent(LanguageSwitchedEvent languageSwitchedEvent) {
        if (AIProvider.getProviderType() == 1) {
            ((ActivityMainBinding) this.binding).tlTab.postDelayed(new Runnable() { // from class: com.crrepa.band.my.b
                @Override // java.lang.Runnable
                public final void run() {
                    com.crrepa.band.my.device.ai.helper.c.initAIAgent();
                }
            }, 500L);
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onMuslimUpdateLocationEvent(BandMuslimUpdateLocationEvent bandMuslimUpdateLocationEvent) {
        com.crrepa.band.my.device.muslim.utils.b.getInstance().sendLocationChange(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        this.requestPermissionCompleted = true;
        com.crrepa.band.my.c.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onSportTimeUpdateEvent(SportTimeUpdateEvent sportTimeUpdateEvent) {
        com.crrepa.band.my.health.water.util.a.getInstance().updateSportTime();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        requestPermission();
        this.presenter.checkAppNewVersion();
    }

    @Override // com.crrepa.band.my.home.b
    public void renderEnableBluetoothDialog() {
        if (31 > Build.VERSION.SDK_INT || ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") == 0) {
            try {
                startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.crrepa.band.my.home.b
    public void renderFirmwareRestoreDialog() {
        new MaterialDialog.e(this).title(R.string.firmware_restore_title).content(R.string.firmware_restore_hint).cancelable(false).positiveText(R.string.start_upgrade).onPositive(new c()).negativeText(R.string.cancel).onNegative(new b()).show();
    }

    @Override // com.crrepa.band.my.home.b
    public void renderNetworkUnavailable() {
        r0.showLong(this, getString(R.string.network_unavailable));
    }

    @Override // com.crrepa.band.my.home.b
    public void renderNewAppDialog(boolean z7, String str, String str2) {
        com.crrepa.band.my.profile.appupgrade.d dVar = new com.crrepa.band.my.profile.appupgrade.d(this);
        dVar.setForceUpdate(z7);
        dVar.setVersionName(str);
        dVar.setChangeLog(str2);
        dVar.show();
    }

    @Override // com.crrepa.band.my.home.b
    public void renderPairingCodeDialog(int i8) {
        m mVar = this.pairingCodeDialog;
        if (mVar == null || !mVar.isShowing()) {
            m mVar2 = new m(this);
            this.pairingCodeDialog = mVar2;
            mVar2.setPairingCode(i8);
            this.pairingCodeDialog.setName(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
            this.pairingCodeDialog.show();
        }
    }

    @Override // com.crrepa.band.my.home.b
    public void renderPairingCodeResult(String str, boolean z7) {
        if (dismissPairingCodeDialog()) {
            startActivity(BandPairResultActivity.getCallingIntent(this, str, z7));
        }
    }

    @Override // com.crrepa.band.my.home.b
    public void renderTabLayout(int[] iArr) {
        ((ActivityMainBinding) this.binding).tlTab.setTabMode(1);
        VB vb = this.binding;
        ((ActivityMainBinding) vb).tlTab.setupWithViewPager(((ActivityMainBinding) vb).vpContent);
        int count = ((ActivityMainBinding) this.binding).vpContent.getAdapter().getCount();
        for (int i8 = 0; i8 < count; i8++) {
            TabLayout.Tab tabAt = ((ActivityMainBinding) this.binding).tlTab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_bottom_tab);
                ((ImageView) tabAt.getCustomView().findViewById(R.id.iv_tab_item)).setImageResource(iArr[i8]);
            }
        }
        ((ActivityMainBinding) this.binding).tlTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    @Override // com.crrepa.band.my.home.b
    public void renderUserBondingDialog() {
        MaterialDialog materialDialog = this.bondDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            this.bondDialog = new MaterialDialog.e(this).progress(true, 100).progressIndeterminateStyle(true).cancelable(false).title(R.string.band_bonding).titleGravity(GravityEnum.CENTER).show();
        }
    }

    @Override // com.crrepa.band.my.home.b
    public void renderViewPager(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        ((ActivityMainBinding) this.binding).vpContent.setAdapter(contentPagerAdapter);
        ((ActivityMainBinding) this.binding).vpContent.setOffscreenPageLimit(list.size());
    }

    public void requestPermission() {
        if (this.requestPermissionCompleted) {
            this.requestPermissionCompleted = false;
            if (33 > Build.VERSION.SDK_INT || q7.b.hasSelfPermissions(this, "android.permission.POST_NOTIFICATIONS")) {
                return;
            }
            showNotificationPermissionDialog();
        }
    }

    void showDeniedForCall() {
        com.crrepa.band.my.home.guidance.c.systemPermission("通知", false);
    }

    void showNeverAskForCall() {
        f.d("showNeverAskForCall");
        c0.jumpAppDetailsSetting(this);
    }
}
