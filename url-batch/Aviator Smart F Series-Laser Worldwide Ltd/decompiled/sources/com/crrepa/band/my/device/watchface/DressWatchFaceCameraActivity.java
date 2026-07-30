package com.crrepa.band.my.device.watchface;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityDressWatchFaceCameraBinding;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.google.android.cameraview.CameraView;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.yalantis.ucrop.UCrop;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class DressWatchFaceCameraActivity extends BaseRequestPermissionActivity<ActivityDressWatchFaceCameraBinding> {
    private static final int REQUEST_GALLERY = 101;
    private MediaPlayer mediaPlayer;
    private static final int[] FLASH_OPTIONS = {0, 1, 3};
    private static final int[] FLASH_ICONS = {R$drawable.ic_ai_camera_bright_n, R$drawable.ic_ai_camera_bright_h, R$drawable.ic_ai_camera_bright_auto};
    private boolean takingPictures = false;
    private boolean cameraStarted = false;
    private int currentFlash = 0;
    private boolean isFromGalleryOrAiCropForResult = false;
    private CameraView.Callback cameraCallback = new g(this);
    private final boolean circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Bitmap bitmap) {
            Uri save2Gallery = com.moyoung.dafit.module.common.utils.r.save2Gallery(DressWatchFaceCameraActivity.this, bitmap);
            DressWatchFaceCameraActivity dressWatchFaceCameraActivity = DressWatchFaceCameraActivity.this;
            dressWatchFaceCameraActivity.startCrop(dressWatchFaceCameraActivity, save2Gallery);
        }
    }

    class b implements Function {
        final /* synthetic */ int val$orientation;

        b(int i8) {
            this.val$orientation = i8;
        }

        @Override // io.reactivex.functions.Function
        public Bitmap apply(byte[] bArr) {
            return com.moyoung.dafit.module.common.utils.g.rotaingBitmap(com.moyoung.dafit.module.common.utils.g.byteToBitmap(bArr, DefaultWatchFaceProvider.getWatchFaceWidth(), DefaultWatchFaceProvider.getWatchFaceHeight()), this.val$orientation);
        }
    }

    class c implements Consumer {
        final /* synthetic */ Context val$context;

        c(Context context) {
            this.val$context = context;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Uri uri) {
            DressWatchFaceCameraActivity.this.startToCropActivity(w1.e.crop(this.val$context, uri, DressWatchFaceCameraActivity.this.circleScreen, false));
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class e implements PermissionDescriptionDialog.b {
        e() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("相机", true);
            t.showAgreeCameraWithPermissionCheck(DressWatchFaceCameraActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("相机", false);
            DressWatchFaceCameraActivity.this.finish();
        }
    }

    class f implements PermissionDescriptionDialog.b {
        f() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("存储权限", true);
            t.showAgreeForStorageWithPermissionCheck(DressWatchFaceCameraActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("存储权限", false);
        }
    }

    private static class g extends CameraView.Callback {
        private final WeakReference<DressWatchFaceCameraActivity> weakReference;

        public g(DressWatchFaceCameraActivity dressWatchFaceCameraActivity) {
            this.weakReference = new WeakReference<>(dressWatchFaceCameraActivity);
        }

        private int getCameraOrientation(byte[] bArr) {
            try {
                return w1.f.readExifOrientation(new ExifInterface(new ByteArrayInputStream(bArr)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
            } catch (IOException e8) {
                e8.printStackTrace();
                return 0;
            }
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onCameraClosed(CameraView cameraView) {
            com.orhanobut.logger.f.d("onCameraClosed");
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onCameraOpened(CameraView cameraView) {
            com.orhanobut.logger.f.d("onCameraOpened");
            if (((ActivityDressWatchFaceCameraBinding) ((BaseVBActivity) this.weakReference.get()).binding).cameraView.getFacing() == 0) {
                cameraView.setAutoFocus(true);
            }
        }

        @Override // com.google.android.cameraview.CameraView.Callback
        public void onPictureTaken(CameraView cameraView, byte[] bArr) {
            com.orhanobut.logger.f.d("onPictureTaken " + bArr.length);
            if (bArr.length < 1000) {
                return;
            }
            com.orhanobut.logger.f.d("thread name: " + Thread.currentThread().getName());
            DressWatchFaceCameraActivity dressWatchFaceCameraActivity = this.weakReference.get();
            int cameraOrientation = getCameraOrientation(bArr);
            com.orhanobut.logger.f.d("orientation: " + cameraOrientation);
            dressWatchFaceCameraActivity.saveCameraResult(bArr, cameraOrientation);
            dressWatchFaceCameraActivity.setTakingPictures(false);
        }
    }

    private void closeCamera() {
        if (this.cameraStarted) {
            com.orhanobut.logger.f.d("closeCamera");
            ((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.stop();
            this.cameraStarted = false;
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) DressWatchFaceCameraActivity.class);
    }

    private boolean hasCameraPermission() {
        return q7.b.hasSelfPermissions(this, "android.permission.CAMERA");
    }

    private boolean isTakingPictures() {
        return this.takingPictures;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        int i8 = this.currentFlash + 1;
        int[] iArr = FLASH_OPTIONS;
        int length = i8 % iArr.length;
        this.currentFlash = length;
        ((ActivityDressWatchFaceCameraBinding) this.binding).ivFlash.setImageResource(FLASH_ICONS[length]);
        ((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.setFlash(iArr[this.currentFlash]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        if (isTakingPictures()) {
            return;
        }
        ((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.setFacing(((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.getFacing() == 1 ? 0 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        takePhoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$3(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$4(View view) {
        startActivityForResult(Intent.createChooser(w1.g.selectImageIntent(), getString(R.string.select_picture)), 101);
        overridePendingTransition(0, 0);
    }

    private void openCamera() {
        this.requestPermissionCompleted = true;
        if (this.isFromGalleryOrAiCropForResult) {
            this.isFromGalleryOrAiCropForResult = false;
            com.orhanobut.logger.f.d("isFromGalleryOrAiCropForResult");
            return;
        }
        if (!hasCameraPermission()) {
            com.orhanobut.logger.f.d("startCamera has not Camera Permission");
            return;
        }
        if (this.cameraStarted) {
            com.orhanobut.logger.f.d("The camera is started");
            return;
        }
        try {
            com.orhanobut.logger.f.e("openCamera", new Object[0]);
            ((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.start();
            this.cameraStarted = true;
        } catch (Exception e8) {
            e8.printStackTrace();
            finish();
        }
    }

    private void playCameraSound() {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = MediaPlayer.create(this, R.raw.camera);
        }
        this.mediaPlayer.start();
    }

    private void requestCameraPermission() {
        if (hasCameraPermission()) {
            com.orhanobut.logger.f.d("requestCameraPermission has Camera Permission");
            return;
        }
        com.orhanobut.logger.f.d("requestCameraPermission: " + this.requestPermissionCompleted);
        if (this.requestPermissionCompleted) {
            this.requestPermissionCompleted = false;
            showCameraPermissionDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveCameraResult(byte[] bArr, int i8) {
        Observable.just(bArr).map(new b(i8)).subscribeOn(Schedulers.io()).subscribe(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakingPictures(boolean z7) {
        this.takingPictures = z7;
    }

    private void showCameraPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_camera).setTitle(R.string.permission_camera_title).setContent(R.string.permission_camera_content).setOnClickListener(new e()).build(this).show();
    }

    private void showPermissionRationDialog(q7.a aVar) {
        if (q7.b.hasSelfPermissions(this, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            return;
        }
        showRationaleDialog(R.string.permission_storage_rationale, R.string.allow, R.string.deny, aVar);
    }

    private void showStoragePermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_storage).setTitle(R.string.permission_external_storage_title).setContent(getString(R.string.permission_watch_face_storage_content, getString(R.string.app_name))).setOnClickListener(new f()).build(this).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startToCropActivity(UCrop uCrop) {
        Intent intent = uCrop.getIntent(this);
        intent.setClass(this, DressPhotoCropActivity.class);
        startActivityForResult(intent, 69);
        overridePendingTransition(0, 0);
    }

    private void stopCameraSound() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    private void takePhoto() {
        com.orhanobut.logger.f.d("takePhoto started: " + this.cameraStarted);
        if (this.cameraStarted) {
            com.orhanobut.logger.f.d("takePhoto isTakingPictures: " + isTakingPictures());
            if (isTakingPictures()) {
                return;
            }
            setTakingPictures(true);
            takePicture();
        }
    }

    private void takePicture() {
        playCameraSound();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((ActivityDressWatchFaceCameraBinding) this.binding).cameraView, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((ActivityDressWatchFaceCameraBinding) this.binding).cameraView, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        ((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.takePicture();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        ((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.addCallback(this.cameraCallback);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityDressWatchFaceCameraBinding) this.binding).ivFlash.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceCameraActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityDressWatchFaceCameraBinding) this.binding).ivSwitchCamera.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceCameraActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityDressWatchFaceCameraBinding) this.binding).ivShutter.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceCameraActivity.this.lambda$initOnClickListener$2(view);
            }
        });
        ((ActivityDressWatchFaceCameraBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceCameraActivity.this.lambda$initOnClickListener$3(view);
            }
        });
        ((ActivityDressWatchFaceCameraBinding) this.binding).ivGalleryPreview.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DressWatchFaceCameraActivity.this.lambda$initOnClickListener$4(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        com.orhanobut.logger.f.e("onActivityResult " + i9, new Object[0]);
        if (i9 == -1) {
            this.isFromGalleryOrAiCropForResult = true;
            if (i8 == 101) {
                Uri data = intent.getData();
                if (data != null) {
                    startCrop(this, data);
                    return;
                } else {
                    com.moyoung.dafit.module.common.utils.r0.showShort(this, getString(R.string.cannot_retrieve_selected_image));
                    return;
                }
            }
            if (i8 == 69) {
                Uri output = UCrop.getOutput(intent);
                if (output != null) {
                    startActivityForResult(DressWatchFaceActivity.getCallingIntent(this, output.toString()), 102);
                    overridePendingTransition(0, 0);
                    return;
                }
                return;
            }
            if (i8 == 102) {
                setResult(-1, intent);
                finish();
                overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        setResult(0);
        finish();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandTakePhotoEvent(com.crrepa.band.my.device.camera.a aVar) {
        com.orhanobut.logger.f.d("onBandTakePhotoEvent");
        takePhoto();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        com.orhanobut.logger.f.d("onDestroy");
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        ((ActivityDressWatchFaceCameraBinding) this.binding).cameraView.removeCallback(this.cameraCallback);
        stopCameraSound();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (i8 == 24 || i8 == 25) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        closeCamera();
        super.onPause();
        com.orhanobut.logger.f.d("onPause");
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        this.requestPermissionCompleted = true;
        t.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.orhanobut.logger.f.d("onResume");
        openCamera();
        com.moyoung.dafit.module.common.utils.s0.logPage(getClass(), "表盘_自定义_AI表盘");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.orhanobut.logger.f.d("onStart");
        requestCameraPermission();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        com.orhanobut.logger.f.d("onStop");
        super.onStop();
        setTakingPictures(false);
    }

    void showAgreeCamera() {
        com.crrepa.band.my.home.guidance.c.systemPermission("相机", true);
        if (Build.VERSION.SDK_INT >= 33 || q7.b.hasSelfPermissions(this, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return;
        }
        showStoragePermissionDialog();
    }

    void showAgreeForStorage() {
        com.crrepa.band.my.home.guidance.c.systemPermission("存储权限", true);
    }

    void showDeniedForCamera() {
        com.crrepa.band.my.home.guidance.c.systemPermission("相机", false);
        finish();
    }

    void showDeniedForStorage() {
        com.orhanobut.logger.f.d("showDeniedForStorage");
        com.crrepa.band.my.home.guidance.c.systemPermission("存储权限", false);
        showNeverAskDialog(R.string.permission_storage_rationale, R.string.allow, R.string.deny, false);
    }

    void showNeverAskForCamera() {
        com.moyoung.dafit.module.common.utils.c0.jumpAppDetailsSetting(this);
    }

    void showNeverAskForStorage() {
        if (q7.b.hasSelfPermissions(this, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            return;
        }
        com.moyoung.dafit.module.common.utils.c0.jumpAppDetailsSetting(this);
    }

    void showRationaleForStorage(q7.a aVar) {
        com.orhanobut.logger.f.d("showRationaleForStorage");
        if (aVar == null) {
            return;
        }
        if (this.requestDenied) {
            showPermissionRationDialog(aVar);
        } else {
            aVar.proceed();
        }
    }

    public void startCrop(Context context, @NonNull Uri uri) {
        if (29 <= Build.VERSION.SDK_INT) {
            w1.e.cropOf29(context, uri).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(context), new d());
        } else {
            startToCropActivity(w1.e.crop(context, uri, this.circleScreen, false));
        }
    }
}
