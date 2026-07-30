package com.crrepa.band.my.device.scan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityBandCaptureBinding;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.king.zxing.camera.FrontLightMode;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.v0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class BandCaptureActivity extends AppCompatActivity implements com.king.zxing.q, r1.a {
    private static final int ADDRESS_LENGTH = 12;
    private static final String ADDRESS_SPLIT = "#MAC";
    private static final int[] FLASH_ICONS = {R$drawable.ic_first_binding_flashlight_n, R$drawable.ic_first_binding_flashlight_p};
    private String bandAddress;
    private ActivityBandCaptureBinding binding;
    ActivityResultLauncher<Intent> bluetoothLauncher;
    private MaterialDialog bondDialog;
    private com.king.zxing.i captureHelper;
    ActivityResultLauncher<Intent> galleryLauncher;
    private m pairingCodeDialog;
    private String previousQrCode;
    private MaterialDialog scanDialog;
    private final com.crrepa.band.my.device.scan.presenter.b presenter = new com.crrepa.band.my.device.scan.presenter.b();
    private boolean showLocationServiceDialog = false;
    private boolean foundedBand = false;
    private boolean isFlashOpened = false;

    private void dismissBondDialog() {
        MaterialDialog materialDialog = this.bondDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        this.bondDialog.dismiss();
    }

    private void dismissPairingCodeDialog() {
        m mVar = this.pairingCodeDialog;
        if (mVar == null || !mVar.isShowing()) {
            return;
        }
        this.pairingCodeDialog.dismiss();
    }

    private void dismissScanDialog() {
        MaterialDialog materialDialog = this.scanDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        this.scanDialog.dismiss();
    }

    private String getAddress(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(ADDRESS_SPLIT)) {
            String[] split = str.split(ADDRESS_SPLIT);
            if (split.length == 2) {
                String str2 = split[1];
                if (!TextUtils.isEmpty(str2) && str2.length() == 12) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    while (i8 < str2.length()) {
                        int i9 = i8 + 2;
                        sb.append(str2.substring(i8, i9));
                        sb.append(":");
                        i8 = i9;
                    }
                    String sb2 = sb.toString();
                    return sb2.substring(0, sb2.length() - 1);
                }
            }
        }
        return null;
    }

    private Bitmap getBitmapOf29(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return com.moyoung.dafit.module.common.utils.g.rotaingBitmap(BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri)), w1.f.readExifOrientation(new ExifInterface(context.getContentResolver().openInputStream(uri)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1)));
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) BandCaptureActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        this.galleryLauncher.launch(w1.g.selectImageIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        if (resultCode == -1) {
            startScan();
        } else if (resultCode == 0) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            parseImage(activityResult.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$4(View view) {
        boolean z7 = !this.isFlashOpened;
        this.isFlashOpened = z7;
        if (z7) {
            openFlash();
            this.binding.ivFlash.setImageResource(FLASH_ICONS[1]);
        } else {
            offFlash();
            this.binding.ivFlash.setImageResource(FLASH_ICONS[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$parseImage$8(Intent intent, ObservableEmitter observableEmitter) {
        String parseQRCode = e1.a.parseQRCode(getBitmapOf29(this, intent.getData()));
        com.orhanobut.logger.f.d("url: " + parseQRCode);
        if (TextUtils.isEmpty(parseQRCode)) {
            observableEmitter.onError(new Throwable("url is null!"));
        } else {
            observableEmitter.onNext(parseQRCode);
            observableEmitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$parseImage$9(Throwable th) {
        th.printStackTrace();
        r0.showShort(this, getString(R.string.qr_code_null_hint));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderLocationServiceDisable$6(MaterialDialog materialDialog, DialogAction dialogAction) {
        com.crrepa.band.my.training.utils.i.startLocationSetting(this, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderLocationServiceDisable$7(MaterialDialog materialDialog, DialogAction dialogAction) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showQrCodeError$5(Long l8) {
        restartDecode();
    }

    private void offFlash() {
        Camera camera = this.captureHelper.getCameraManager().getOpenCamera().getCamera();
        Camera.Parameters parameters = camera.getParameters();
        parameters.setFlashMode("off");
        camera.setParameters(parameters);
    }

    @SuppressLint({"CheckResult"})
    private void parseImage(final Intent intent) {
        String imagePath = v0.getImagePath(this, intent);
        com.orhanobut.logger.f.d("path: " + imagePath);
        if (TextUtils.isEmpty(imagePath)) {
            r0.showShort(this, getString(R.string.cannot_retrieve_selected_image));
        } else {
            Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.scan.j
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    BandCaptureActivity.this.lambda$parseImage$8(intent, observableEmitter);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.scan.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BandCaptureActivity.this.onResultCallback((String) obj);
                }
            }, new Consumer() { // from class: com.crrepa.band.my.device.scan.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    BandCaptureActivity.this.lambda$parseImage$9((Throwable) obj);
                }
            });
        }
    }

    private void restartDecode() {
        this.previousQrCode = null;
        this.captureHelper.restartPreviewAndDecode();
    }

    private void showBondDialog() {
        MaterialDialog materialDialog = this.bondDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            this.bondDialog = new MaterialDialog.e(this).progress(true, 100).progressIndeterminateStyle(true).cancelable(false).title(R.string.band_bonding).titleGravity(GravityEnum.CENTER).show();
        }
    }

    @SuppressLint({"CheckResult"})
    private void showQrCodeError() {
        r0.showLong(this, getString(R.string.address_qrcode_error));
        Observable.timer(1L, TimeUnit.SECONDS).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.scan.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BandCaptureActivity.this.lambda$showQrCodeError$5((Long) obj);
            }
        });
    }

    private void startScan() {
        com.orhanobut.logger.f.d("startScan: " + this.bandAddress);
        if (!TextUtils.isEmpty(this.bandAddress) && this.presenter.startScan(this)) {
            MaterialDialog materialDialog = this.scanDialog;
            if (materialDialog == null || !materialDialog.isShowing()) {
                this.scanDialog = new MaterialDialog.e(this).title(R.string.scan_dfu_band).progress(true, 100).cancelable(false).canceledOnTouchOutside(false).show();
            }
        }
    }

    private void stopScan() {
        this.presenter.stopScan();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityBandCaptureBinding inflate = ActivityBandCaptureBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        k0.setColor(this, -16777216);
        k0.setDarkMode(this);
        ActivityBandCaptureBinding activityBandCaptureBinding = this.binding;
        com.king.zxing.i iVar = new com.king.zxing.i(this, activityBandCaptureBinding.surfaceView, activityBandCaptureBinding.viewfinderView);
        this.captureHelper = iVar;
        iVar.setOnCaptureCallback(this);
        this.captureHelper.vibrate(true).fullScreenScan(true).supportVerticalCode(true).supportLuminanceInvert(true).frontLightMode(FrontLightMode.OFF).continuousScan(false);
        this.captureHelper.onCreate();
        this.binding.ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandCaptureActivity.this.lambda$onCreate$0(view);
            }
        });
        this.binding.ivGallery.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandCaptureActivity.this.lambda$onCreate$1(view);
            }
        });
        this.bluetoothLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.scan.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BandCaptureActivity.this.lambda$onCreate$2((ActivityResult) obj);
            }
        });
        this.galleryLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.crrepa.band.my.device.scan.e
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BandCaptureActivity.this.lambda$onCreate$3((ActivityResult) obj);
            }
        });
        this.binding.ivFlash.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandCaptureActivity.this.lambda$onCreate$4(view);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        this.captureHelper.onDestroy();
        stopScan();
        dismissScanDialog();
        dismissBondDialog();
        dismissPairingCodeDialog();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.presenter.pause();
        this.captureHelper.onPause();
    }

    @Override // com.king.zxing.q
    public boolean onResultCallback(String str) {
        com.orhanobut.logger.f.d("onResultCallback: " + str);
        if (TextUtils.equals(str, this.previousQrCode)) {
            return true;
        }
        this.previousQrCode = str;
        try {
            String address = getAddress(str);
            com.orhanobut.logger.f.d("qrcode address: " + address);
            if (TextUtils.isEmpty(address)) {
                showQrCodeError();
            } else {
                this.bandAddress = address;
                startScan();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            showQrCodeError();
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.presenter.resume();
        this.captureHelper.onResume();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.captureHelper.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void openFlash() {
        Camera camera = this.captureHelper.getCameraManager().getOpenCamera().getCamera();
        Camera.Parameters parameters = camera.getParameters();
        parameters.setFlashMode("torch");
        camera.setParameters(parameters);
    }

    @Override // r1.a
    public void renderBluetoothDisable() {
        this.bluetoothLauncher.launch(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
    }

    @Override // r1.a
    public void renderBondComplete() {
        dismissBondDialog();
        startActivity(MainActivity.getCallingIntent(this));
    }

    @Override // r1.a
    public void renderBondFail() {
        dismissBondDialog();
        restartDecode();
        finish();
    }

    @Override // r1.a
    public void renderLocationServiceDisable() {
        if (this.showLocationServiceDialog) {
            finish();
        } else {
            this.showLocationServiceDialog = true;
            new MaterialDialog.e(this).title(R.string.location_service_disable).positiveText(R.string.enable).negativeText(R.string.cancel).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.scan.h
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    BandCaptureActivity.this.lambda$renderLocationServiceDisable$6(materialDialog, dialogAction);
                }
            }).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.scan.i
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    BandCaptureActivity.this.lambda$renderLocationServiceDisable$7(materialDialog, dialogAction);
                }
            }).build().show();
        }
    }

    @Override // r1.a
    public void renderNotSupportBle() {
        r0.showLong(this, getString(R.string.not_support_ble));
        finish();
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
        startActivity(BandPairResultActivity.getCallingIntent(this, str, z7));
        finish();
    }

    @Override // r1.a
    public void renderRestoreFirmware(String str) {
    }

    @Override // r1.a
    public void renderScanComplete() {
        if (this.foundedBand) {
            return;
        }
        dismissScanDialog();
        r0.showLong(this, getString(R.string.not_find_band));
        restartDecode();
    }

    @Override // r1.a
    public void renderScanDevice(BaseBandModel baseBandModel) {
        if (baseBandModel != null && TextUtils.equals(this.bandAddress.toUpperCase(), baseBandModel.getAddress().toUpperCase())) {
            dismissScanDialog();
            this.foundedBand = true;
            stopScan();
            this.presenter.addBand(baseBandModel);
            this.presenter.establishConnection(baseBandModel.isBond());
            if (baseBandModel.isBond() || baseBandModel.isScanAndCodeBond()) {
                showBondDialog();
            } else {
                renderBondComplete();
            }
        }
    }

    @Override // r1.a
    public void renderScanFail() {
        dismissScanDialog();
        restartDecode();
    }
}
