package com.crrepa.band.my.device.scan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityBandScanBinding;
import com.crrepa.band.my.device.ota.restore.RestoreFirmwareActivity;
import com.crrepa.band.my.device.scan.adapter.BandScanAdapter;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.util.BandManger;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.band.my.profile.userinfo.UserInfoActivity;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class BandScanActivity extends BaseRequestPermissionActivity<ActivityBandScanBinding> implements r1.a, OnItemClickListener {
    public static final int REQUEST_ENABLE_BT = 1;
    private MaterialDialog bondDialog;
    private boolean isFirstOpenApp;
    private m pairingCodeDialog;
    private final com.crrepa.band.my.device.scan.presenter.b presenter = new com.crrepa.band.my.device.scan.presenter.b();
    private final BandScanAdapter bandScanAdapter = new BandScanAdapter();
    private boolean showLocationServiceDialog = false;
    private boolean onPause = false;
    private boolean addDevice = false;

    class a implements MaterialDialog.l {
        a() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            BandScanActivity.this.finishNotFirstOpenApp();
        }
    }

    class b implements MaterialDialog.l {
        b() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            com.crrepa.band.my.training.utils.i.startLocationSetting(BandScanActivity.this, 17);
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(BaseBandModel baseBandModel) {
            BandScanActivity.this.addScanResult(baseBandModel);
            if (baseBandModel.isScanAndCodeBond()) {
                BandScanActivity.this.showQrCodeScanning();
            }
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            BandScanActivity.this.showNoSearchView();
        }
    }

    class e implements PermissionDescriptionDialog.b {
        e() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("定位", true);
            t.needLocationPermissionSuccessWithPermissionCheck(BandScanActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("定位", false);
            BandScanActivity.this.finishNotFirstOpenApp();
        }
    }

    class f implements PermissionDescriptionDialog.b {
        f() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("蓝牙", true);
            t.needBluetoothPermissionSuccessWithPermissionCheck(BandScanActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("蓝牙", false);
            BandScanActivity.this.finishNotFirstOpenApp();
        }
    }

    class g implements PermissionDescriptionDialog.b {
        g() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("相机", true);
            t.startCameraWithPermissionCheck(BandScanActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("相机", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addScanResult(BaseBandModel baseBandModel) {
        this.bandScanAdapter.addData(baseBandModel);
    }

    private void bondComplete() {
        setResult(-1, new Intent());
        skipToMainActivity();
        finish();
    }

    private void dismissBondDialog() {
        MaterialDialog materialDialog = this.bondDialog;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    private void dismissPairingCodeDialog() {
        m mVar = this.pairingCodeDialog;
        if (mVar == null || !mVar.isShowing()) {
            return;
        }
        this.pairingCodeDialog.dismiss();
    }

    public static Intent getCallingIntent(Context context, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) BandScanActivity.class);
        intent.putExtra(BaseParamNames.FIRST_OPEN_APP, z7);
        return intent;
    }

    private boolean hasBluetoothPermission(String[] strArr) {
        for (String str : strArr) {
            if (TextUtils.equals(str, "android.permission.BLUETOOTH_SCAN")) {
                return true;
            }
        }
        return false;
    }

    private void initScanList() {
        ((ActivityBandScanBinding) this.binding).rcvScanBand.setLayoutManager(new LinearLayoutManager(this));
        this.bandScanAdapter.addFooterView(getLayoutInflater().inflate(R.layout.footer_band_scan, (ViewGroup) ((ActivityBandScanBinding) this.binding).rcvScanBand, false));
        View inflate = getLayoutInflater().inflate(R.layout.view_empty_scan_device, (ViewGroup) null);
        inflate.findViewById(R.id.tv_look_help).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandScanActivity.this.lambda$initScanList$3(view);
            }
        });
        this.bandScanAdapter.setEmptyView(inflate);
        this.bandScanAdapter.setUseEmpty(false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandScanActivity.this.lambda$initScanList$4(view);
            }
        });
        ((ActivityBandScanBinding) this.binding).rcvScanBand.setAdapter(this.bandScanAdapter);
        this.bandScanAdapter.setOnItemClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        startActivity(UserInfoActivity.getCallingIntent(this, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScanList$3(View view) {
        startActivity(new Intent(this, (Class<?>) ScanHelpActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScanList$4(View view) {
        this.bandScanAdapter.setUseEmpty(false);
        this.bandScanAdapter.notifyDataSetChanged();
        if (!this.isFirstOpenApp) {
            startScan();
        } else if (q7.b.hasSelfPermissions(this, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            needLocationPermissionSuccess();
        } else {
            showLocationPermissionDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$2(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showQrCodeScanning$5(View view) {
        if (q7.b.hasSelfPermissions(this, "android.permission.CAMERA")) {
            startCamera();
        } else {
            showCameraPermissionDialog();
        }
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityBandScanBinding) this.binding).titleBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityBandScanBinding) vb).titleBar.tvTitle, ((ActivityBandScanBinding) vb).titleBar.tvExpandedTitle);
        setSupportActionBar(((ActivityBandScanBinding) this.binding).titleBar.toolbar);
    }

    private void setTitle() {
        ((ActivityBandScanBinding) this.binding).titleBar.tvTitle.setText(R.string.add_band);
        ((ActivityBandScanBinding) this.binding).titleBar.tvExpandedTitle.setText(R.string.add_band);
        if (this.isFirstOpenApp) {
            ((ActivityBandScanBinding) this.binding).titleBar.ivTitleBack.setVisibility(4);
        } else {
            ((ActivityBandScanBinding) this.binding).titleBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
            ((ActivityBandScanBinding) this.binding).titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BandScanActivity.this.lambda$setTitle$2(view);
                }
            });
        }
    }

    private void showBlePermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_bluetooth).setTitle(R.string.permission_ble_title).setContent(getString(R.string.permission_ble_content, getString(R.string.app_name))).setOnClickListener(new f()).build(this).show();
    }

    private void showBondDialog() {
        MaterialDialog materialDialog = this.bondDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            this.bondDialog = new MaterialDialog.e(this).progress(true, 100).progressIndeterminateStyle(true).cancelable(false).title(R.string.band_bonding).titleGravity(GravityEnum.CENTER).show();
        }
    }

    private void showCameraPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_camera).setTitle(R.string.permission_camera_title).setContent(R.string.permission_camera_content).setOnClickListener(new g()).build(this).show();
    }

    private void showLocationPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_location).setTitle(R.string.permission_location_title).setContent(getString(R.string.permission_location_content, getString(R.string.app_name))).setTips(R.string.permission_location_tips).setOnClickListener(new e()).build(this).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNoSearchView() {
        this.bandScanAdapter.setUseEmpty(true);
        this.bandScanAdapter.notifyDataSetChanged();
    }

    private void skipToMainActivity() {
        startActivity(MainActivity.getCallingIntent(getApplicationContext()));
    }

    public void finishNotFirstOpenApp() {
        if (!this.isFirstOpenApp) {
            finish();
        } else {
            stopScan();
            showNoSearchView();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        boolean booleanExtra = getIntent().getBooleanExtra(BaseParamNames.FIRST_OPEN_APP, false);
        this.isFirstOpenApp = booleanExtra;
        if (booleanExtra) {
            BandManger.removeBand(this);
            ((ActivityBandScanBinding) this.binding).tvSkip.setVisibility(0);
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) ((ActivityBandScanBinding) this.binding).rlDeviceList.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, com.moyoung.dafit.module.common.utils.o.dp2px(this, 156.0f));
            ((ActivityBandScanBinding) this.binding).rlDeviceList.setLayoutParams(layoutParams);
            com.crrepa.band.my.home.guidance.b.setGuidanceState(0);
        }
        this.presenter.setView(this);
        this.presenter.registerBluetoothStateReceiver(this);
        setActionBar();
        setTitle();
        initScanList();
        ((ActivityBandScanBinding) this.binding).titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandScanActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityBandScanBinding) this.binding).tvSkip.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandScanActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    void needBluetoothPermissionSuccess() {
        com.crrepa.band.my.home.guidance.c.systemPermission("蓝牙", true);
        startScan();
    }

    void needLocationPermissionSuccess() {
        com.crrepa.band.my.home.guidance.c.systemPermission("定位", true);
        if (Build.VERSION.SDK_INT < 31) {
            startScan();
        } else if (q7.b.hasSelfPermissions(this, "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT")) {
            needBluetoothPermissionSuccess();
        } else {
            showBlePermissionDialog();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 1) {
            if (i9 == -1) {
                startScan();
            } else if (i9 == 0) {
                finishNotFirstOpenApp();
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        if (this.isFirstOpenApp) {
            return;
        }
        super.onBackPressedSupport();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.unregisterBluetoothStateReceiver(this);
        this.presenter.destroy();
        dismissBondDialog();
        dismissPairingCodeDialog();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        stopScan();
        this.addDevice = true;
        BaseBandModel baseBandModel = (BaseBandModel) baseQuickAdapter.getItem(i8);
        if (baseBandModel == null) {
            finishNotFirstOpenApp();
            return;
        }
        this.presenter.addBand(baseBandModel);
        if (baseBandModel.isBond() || baseBandModel.isScanAndCodeBond()) {
            this.presenter.establishConnection(true);
            showBondDialog();
            return;
        }
        com.crrepa.band.my.ble.band.connect.a.startConnectService();
        if (!this.isFirstOpenApp) {
            bondComplete();
        } else {
            startActivity(new Intent(this, (Class<?>) DeviceBindingSuccessActivity.class));
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
        this.onPause = true;
        stopScan();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"NeedOnRequestPermissionsResult"})
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        com.orhanobut.logger.f.d("onRequestPermissionsResult: " + i8);
        com.orhanobut.logger.f.d("onRequestPermissionsResult: " + Arrays.toString(strArr));
        com.orhanobut.logger.f.d("onRequestPermissionsResult: " + Arrays.toString(iArr));
        if (!hasBluetoothPermission(strArr)) {
            t.onRequestPermissionsResult(this, i8, iArr);
            return;
        }
        if (q7.b.verifyPermissions(iArr)) {
            needBluetoothPermissionSuccess();
        } else if (q7.b.shouldShowRequestPermissionRationale(this, strArr)) {
            showDeniedForBluetooth();
        } else {
            showNeverAskForBluetooth();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        this.onPause = false;
        s0.logPage(getClass(), "绑定设备页");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (q7.b.hasSelfPermissions(this, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            needLocationPermissionSuccess();
        } else {
            showLocationPermissionDialog();
        }
    }

    @Override // r1.a
    public void renderBluetoothDisable() {
        if (31 > Build.VERSION.SDK_INT || ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") == 0) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        } else {
            t.needBluetoothPermissionSuccessWithPermissionCheck(this);
        }
    }

    @Override // r1.a
    public void renderBondComplete() {
        dismissBondDialog();
        if (!this.isFirstOpenApp) {
            bondComplete();
        } else {
            startActivity(new Intent(this, (Class<?>) DeviceBindingSuccessActivity.class));
            finish();
        }
    }

    @Override // r1.a
    public void renderBondFail() {
        dismissBondDialog();
    }

    @Override // r1.a
    public void renderLocationServiceDisable() {
        if (this.showLocationServiceDialog) {
            finishNotFirstOpenApp();
        } else {
            this.showLocationServiceDialog = true;
            new MaterialDialog.e(this).title(R.string.location_service_disable).positiveText(R.string.enable).negativeText(R.string.cancel).onPositive(new b()).onNegative(new a()).build().show();
        }
    }

    @Override // r1.a
    public void renderNotSupportBle() {
        r0.showLong(this, getString(R.string.not_support_ble));
        finishNotFirstOpenApp();
    }

    @Override // r1.a
    public void renderPairingCode(int i8) {
        dismissBondDialog();
        m mVar = this.pairingCodeDialog;
        if (mVar == null || !mVar.isShowing()) {
            m mVar2 = new m(this);
            this.pairingCodeDialog = mVar2;
            mVar2.setPairingCode(i8);
            this.pairingCodeDialog.setName(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
            this.pairingCodeDialog.show();
        }
    }

    @Override // r1.a
    public void renderPairingCodeResult(String str, boolean z7) {
        dismissPairingCodeDialog();
        startActivity(BandPairResultActivity.getCallingIntent(this, str, z7, this.isFirstOpenApp));
        finish();
    }

    @Override // r1.a
    public void renderRestoreFirmware(String str) {
        startActivity(RestoreFirmwareActivity.getCallingIntent(this, str));
        finish();
    }

    @Override // r1.a
    @SuppressLint({"CheckResult"})
    public void renderScanComplete() {
        if (this.onPause) {
            return;
        }
        List<BaseBandModel> data = this.bandScanAdapter.getData();
        if (data == null || data.isEmpty()) {
            Observable.just(0).observeOn(AndroidSchedulers.mainThread()).subscribe(new d());
        }
    }

    @Override // r1.a
    @SuppressLint({"CheckResult"})
    public void renderScanDevice(BaseBandModel baseBandModel) {
        Observable.just(baseBandModel).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
    }

    @Override // r1.a
    public void renderScanFail() {
    }

    @SuppressLint({"InlinedApi"})
    void showDeniedForBluetooth() {
        com.crrepa.band.my.home.guidance.c.systemPermission("蓝牙", false);
        r0.showLong(this, getString(R.string.permission_bluetooth_rationale));
        finishNotFirstOpenApp();
    }

    void showDeniedForCamera() {
        com.crrepa.band.my.home.guidance.c.systemPermission("相机", false);
    }

    void showDeniedForLocation() {
        com.crrepa.band.my.home.guidance.c.systemPermission("定位", false);
        r0.showLong(this, getString(R.string.permission_location_rationale));
        finishNotFirstOpenApp();
    }

    void showNeverAskForBluetooth() {
        c0.jumpAppDetailsSetting(this);
    }

    void showNeverAskForCamera() {
        c0.jumpAppDetailsSetting(this);
    }

    void showNeverAskForLocation() {
        c0.jumpAppDetailsSetting(this);
    }

    public void showQrCodeScanning() {
        ((ActivityBandScanBinding) this.binding).titleBar.ivHistory.setImageResource(R$drawable.ic_nav_scan);
        ((ActivityBandScanBinding) this.binding).titleBar.ivHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandScanActivity.this.lambda$showQrCodeScanning$5(view);
            }
        });
    }

    void startCamera() {
        com.crrepa.band.my.home.guidance.c.systemPermission("相机", true);
        startActivity(BandCaptureActivity.getCallingIntent(this));
    }

    public void startScan() {
        MaterialDialog materialDialog = this.bondDialog;
        if ((materialDialog == null || !materialDialog.isShowing()) && !this.addDevice) {
            this.presenter.startScan(this);
        }
    }

    public void stopScan() {
        this.presenter.stopScan();
    }
}
