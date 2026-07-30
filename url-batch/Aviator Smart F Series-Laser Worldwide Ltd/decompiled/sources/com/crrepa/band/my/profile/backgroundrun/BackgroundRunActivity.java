package com.crrepa.band.my.profile.backgroundrun;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.databinding.ActivityBackgroundRunBinding;
import com.crrepa.band.my.profile.backgroundrun.view.c;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public class BackgroundRunActivity extends BaseVBActivity<ActivityBackgroundRunBinding> {
    private com.crrepa.band.my.profile.backgroundrun.view.c permissionRequestHintDialog;

    class a implements c.a {
        a() {
        }

        @Override // com.crrepa.band.my.profile.backgroundrun.view.c.a
        public void onCancel() {
            if (BackgroundRunActivity.this.permissionRequestHintDialog != null) {
                BackgroundRunActivity.this.permissionRequestHintDialog.dismiss();
                BackgroundRunActivity.this.permissionRequestHintDialog = null;
            }
        }

        @Override // com.crrepa.band.my.profile.backgroundrun.view.c.a
        public void onPermit(int i8) {
            if (BackgroundRunActivity.this.permissionRequestHintDialog != null) {
                BackgroundRunActivity.this.permissionRequestHintDialog.dismiss();
                BackgroundRunActivity.this.permissionRequestHintDialog = null;
            }
            if (i8 == 0) {
                BackgroundRunActivity.this.goVendorBatteryOptimization();
            } else if (i8 == 1) {
                BackgroundRunActivity.this.goApplicationDetailsSetting();
            } else if (i8 == 2) {
                BackgroundRunActivity.this.goSelfStart();
            }
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) BackgroundRunActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goApplicationDetailsSetting() {
        try {
            u3.b.startApplicationDetailsSettingsAction(this);
        } catch (Exception unused) {
            r0.showShort(this, R.string.bg_not_support_jump_hint);
        }
    }

    private void goOperationTutorial(int i8, String str, int i9) {
        startActivity(WebActivity.getCallingIntent(this, getString(i8), "https://sdk-dafit.moyoung.com/dafit/" + str + i9, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goSelfStart() {
        if (u3.c.isHuawei()) {
            u3.c.goHuaweiAutoStart(this);
            return;
        }
        if (u3.c.isXiaomi()) {
            u3.c.goXiaomiAutoStart(this);
            return;
        }
        if (u3.c.isVIVO() || u3.c.isIQOO()) {
            u3.c.goVIVOSetting(this);
            return;
        }
        if (u3.c.isOPPO()) {
            u3.c.goOPPOSetting(this);
            return;
        }
        if (u3.c.isOnePlus()) {
            u3.c.goOnePlusSetting(this);
            return;
        }
        if (u3.c.isMeiZu()) {
            u3.c.goMeiZuSetting(this);
            return;
        }
        if (u3.c.isSamsung()) {
            u3.c.goSamsungSetting(this);
            return;
        }
        if (u3.c.isSmartisan()) {
            u3.c.goSmartisanSetting(this);
        } else if (u3.c.isLeTV()) {
            u3.c.goLeTvSetting(this);
        } else {
            goApplicationDetailsSetting();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goVendorBatteryOptimization() {
        if (u3.c.isHuawei()) {
            u3.c.goHuaweiBatterySetting(this);
            return;
        }
        if (u3.c.isXiaomi()) {
            u3.c.goXiaomiBatterySetting(this);
        } else if (u3.c.isVIVO() || u3.c.isIQOO()) {
            u3.c.goVIVOSetting(this);
        } else {
            goApplicationDetailsSetting();
        }
    }

    private void initVendorTitle() {
        if (u3.c.isVIVO() || u3.c.isIQOO()) {
            ((ActivityBackgroundRunBinding) this.binding).tvBatteryVendor.setText(R.string.bg_vivo_battery_title);
            ((ActivityBackgroundRunBinding) this.binding).tvBatteryVendorHint.setText(R.string.bg_vivo_battery_hint);
            final String str = "vivo.html?page=";
            ((ActivityBackgroundRunBinding) this.binding).clVendorWhiteList.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$5(str, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$6(str, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clLock.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$7(str, view);
                }
            });
            return;
        }
        if (u3.c.isXiaomi()) {
            ((ActivityBackgroundRunBinding) this.binding).tvBatteryVendor.setText(R.string.bg_miui_battery_title);
            ((ActivityBackgroundRunBinding) this.binding).tvBatteryVendorHint.setText(R.string.bg_miui_battery_hint);
            final String str2 = "xiaomi.html?page=";
            ((ActivityBackgroundRunBinding) this.binding).clVendorWhiteList.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$8(str2, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$9(str2, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clLock.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$10(str2, view);
                }
            });
            return;
        }
        if (u3.c.isOPPO() || u3.c.isOnePlus()) {
            ((ActivityBackgroundRunBinding) this.binding).clVendorWhiteList.setVisibility(8);
            final String str3 = "oppo.html?page=";
            ((ActivityBackgroundRunBinding) this.binding).clBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$11(str3, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clLock.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$12(str3, view);
                }
            });
            return;
        }
        if (u3.c.isHuawei()) {
            ((ActivityBackgroundRunBinding) this.binding).tvBatteryVendor.setText(R.string.bg_huawei_battery_title);
            ((ActivityBackgroundRunBinding) this.binding).tvBatteryVendorHint.setText(R.string.bg_huawei_battery_hint);
            final String str4 = "huawei.html?page=";
            ((ActivityBackgroundRunBinding) this.binding).clVendorWhiteList.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$13(str4, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$14(str4, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clLock.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$15(str4, view);
                }
            });
            return;
        }
        if (u3.c.isSamsung()) {
            ((ActivityBackgroundRunBinding) this.binding).clVendorWhiteList.setVisibility(8);
            final String str5 = "sanxing.html?page=";
            ((ActivityBackgroundRunBinding) this.binding).clBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$16(str5, view);
                }
            });
            ((ActivityBackgroundRunBinding) this.binding).clLock.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$17(str5, view);
                }
            });
            return;
        }
        if (u3.c.isLenovo()) {
            ((ActivityBackgroundRunBinding) this.binding).clVendorWhiteList.setVisibility(8);
            ((ActivityBackgroundRunBinding) this.binding).clLock.setVisibility(8);
            final String str6 = "lianxiang.html?page=";
            ((ActivityBackgroundRunBinding) this.binding).clBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BackgroundRunActivity.this.lambda$initVendorTitle$18(str6, view);
                }
            });
            return;
        }
        ((ActivityBackgroundRunBinding) this.binding).clVendorWhiteList.setVisibility(8);
        ((ActivityBackgroundRunBinding) this.binding).clLock.setVisibility(8);
        final String str7 = "others.html?page=";
        ((ActivityBackgroundRunBinding) this.binding).clBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackgroundRunActivity.this.lambda$initVendorTitle$19(str7, view);
            }
        });
    }

    private void initView() {
        setActionBar();
        setTitle();
        initVendorTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        u3.b.startIgnoreBatteryOptimizationsAction(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        showPermissionDialog(0, R.string.bg_allow_battery_title, R.string.bg_allow_battery_hint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        showPermissionDialog(1, R.string.bg_allow_location_permission_title, R.string.bg_allow_location_hint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        showPermissionDialog(2, R.string.bg_allow_background_run_title, R.string.bg_allow_background_run_hint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$10(String str, View view) {
        goOperationTutorial(R.string.bg_background_run_lock, str, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$11(String str, View view) {
        goOperationTutorial(R.string.background_run_guide, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$12(String str, View view) {
        goOperationTutorial(R.string.bg_background_run_lock, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$13(String str, View view) {
        goOperationTutorial(R.string.bg_huawei_battery_title, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$14(String str, View view) {
        goOperationTutorial(R.string.background_run_guide, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$15(String str, View view) {
        goOperationTutorial(R.string.bg_background_run_lock, str, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$16(String str, View view) {
        goOperationTutorial(R.string.background_run_guide, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$17(String str, View view) {
        goOperationTutorial(R.string.bg_background_run_lock, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$18(String str, View view) {
        goOperationTutorial(R.string.background_run_guide, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$19(String str, View view) {
        goOperationTutorial(R.string.background_run_guide, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$5(String str, View view) {
        goOperationTutorial(R.string.bg_vivo_battery_title, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$6(String str, View view) {
        goOperationTutorial(R.string.background_run_guide, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$7(String str, View view) {
        goOperationTutorial(R.string.bg_background_run_lock, str, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$8(String str, View view) {
        goOperationTutorial(R.string.bg_miui_battery_title, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVendorTitle$9(String str, View view) {
        goOperationTutorial(R.string.background_run_guide, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$4(View view) {
        onBackPressed();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityBackgroundRunBinding) this.binding).appbar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityBackgroundRunBinding) vb).appbar.tvTitle, ((ActivityBackgroundRunBinding) vb).appbar.tvExpandedTitle);
        setSupportActionBar(((ActivityBackgroundRunBinding) this.binding).appbar.toolbar);
    }

    private void setTitle() {
        ((ActivityBackgroundRunBinding) this.binding).appbar.tvTitle.setText(R.string.background_run_guide);
        ((ActivityBackgroundRunBinding) this.binding).appbar.tvExpandedTitle.setVisibility(8);
        ((ActivityBackgroundRunBinding) this.binding).appbar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityBackgroundRunBinding) this.binding).appbar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackgroundRunActivity.this.lambda$setTitle$4(view);
            }
        });
    }

    private void showPermissionDialog(int i8, int i9, int i10) {
        com.crrepa.band.my.profile.backgroundrun.view.c cVar = this.permissionRequestHintDialog;
        if (cVar != null) {
            cVar.show();
            return;
        }
        com.crrepa.band.my.profile.backgroundrun.view.c cVar2 = new com.crrepa.band.my.profile.backgroundrun.view.c(this, i8, i9, i10);
        this.permissionRequestHintDialog = cVar2;
        cVar2.setOnChoiceClickListener(new a());
        this.permissionRequestHintDialog.show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @RequiresApi(api = 23)
    protected void initBinding() {
        super.initBinding();
        initView();
        ((ActivityBackgroundRunBinding) this.binding).btnSystemBatteryWhiteList.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackgroundRunActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityBackgroundRunBinding) this.binding).btnVendorBatteryWhiteList.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackgroundRunActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityBackgroundRunBinding) this.binding).btnLocationPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackgroundRunActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityBackgroundRunBinding) this.binding).btnBackgroundRunPermission.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.backgroundrun.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackgroundRunActivity.this.lambda$initBinding$3(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (u3.b.isIgnoredBatteryOptimizations(this)) {
            ((ActivityBackgroundRunBinding) this.binding).btnSystemBatteryWhiteList.setText(R.string.bg_already_open);
        }
        if (u3.b.isOpenAllowLocationAllTime(this)) {
            ((ActivityBackgroundRunBinding) this.binding).btnLocationPermission.setText(R.string.bg_already_open);
        }
    }
}
