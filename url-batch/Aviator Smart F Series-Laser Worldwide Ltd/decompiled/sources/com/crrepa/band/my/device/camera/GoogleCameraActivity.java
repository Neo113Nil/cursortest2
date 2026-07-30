package com.crrepa.band.my.device.camera;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityGoogleCameraBinding;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.google.android.cameraview.CameraView;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.e;
import com.moyoung.instructions.utils.InstructionsType;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class GoogleCameraActivity extends BaseRequestPermissionActivity<ActivityGoogleCameraBinding> {
    private MediaPlayer mediaPlayer;
    private static final int[] FLASH_OPTIONS = {3, 0, 1};
    private static final int[] FLASH_ICONS = {R.drawable.ic_flash_auto, R.drawable.ic_flash_off, R.drawable.ic_flash_on};
    private com.moyoung.dafit.module.common.widgets.e countDownTimer = new com.moyoung.dafit.module.common.widgets.e(3);
    private boolean takingPictures = false;
    private boolean camreaStarted = false;
    private boolean enterCamera = false;
    private int currentFlash = 0;
    private CameraView.Callback cameraCallback = new g(this);

    class a implements e.d {
        a() {
        }

        @Override // com.moyoung.dafit.module.common.widgets.e.d
        public void onComplete() {
            if (GoogleCameraActivity.this.camreaStarted) {
                GoogleCameraActivity.this.takePicture();
            }
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Bitmap bitmap) {
            r.save2Gallery(GoogleCameraActivity.this, bitmap);
        }
    }

    class c implements Function {
        final /* synthetic */ int val$orientation;

        c(int i8) {
            this.val$orientation = i8;
        }

        @Override // io.reactivex.functions.Function
        public Bitmap apply(byte[] bArr) {
            return com.moyoung.dafit.module.common.utils.g.rotaingBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), this.val$orientation);
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Bitmap bitmap) {
            GoogleCameraActivity.this.showPreviewPhoto(bitmap);
        }
    }

    class e implements Function {
        final /* synthetic */ int val$orientation;

        e(int i8) {
            this.val$orientation = i8;
        }

        @Override // io.reactivex.functions.Function
        public Bitmap apply(byte[] bArr) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 4;
            return com.moyoung.dafit.module.common.utils.g.rotaingBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), this.val$orientation);
        }
    }

    class f implements PermissionDescriptionDialog.b {
        f() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("android.permission.CAMERA", true);
            com.crrepa.band.my.device.camera.f.startCameraWithPermissionCheck(GoogleCameraActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("android.permission.CAMERA", false);
            GoogleCameraActivity.this.finish();
        }
    }

    private static class g extends CameraView.Callback {
        private final WeakReference<GoogleCameraActivity> weakReference;

        public g(GoogleCameraActivity googleCameraActivity) {
            this.weakReference = new WeakReference<>(googleCameraActivity);
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
            if (((ActivityGoogleCameraBinding) ((BaseVBActivity) this.weakReference.get()).binding).cameraView.getFacing() == 0) {
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
            GoogleCameraActivity googleCameraActivity = this.weakReference.get();
            int cameraOrientation = getCameraOrientation(bArr);
            com.orhanobut.logger.f.d("orientation: " + cameraOrientation);
            googleCameraActivity.takingPictures = false;
            googleCameraActivity.setPreviewPhoto(bArr, cameraOrientation);
            googleCameraActivity.saveCameraResult(bArr, cameraOrientation);
            googleCameraActivity.setTakingPictures(false);
        }
    }

    private void closeCamera() {
        if (this.camreaStarted) {
            com.orhanobut.logger.f.d("closeCamera");
            ((ActivityGoogleCameraBinding) this.binding).cameraView.stop();
            this.camreaStarted = false;
        }
    }

    public static Intent getCallingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) GoogleCameraActivity.class);
        intent.addFlags(268435456);
        return intent;
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
        ((ActivityGoogleCameraBinding) this.binding).ivFlash.setImageResource(FLASH_ICONS[length]);
        ((ActivityGoogleCameraBinding) this.binding).cameraView.setFlash(iArr[this.currentFlash]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        if (isTakingPictures()) {
            return;
        }
        ((ActivityGoogleCameraBinding) this.binding).cameraView.setFacing(((ActivityGoogleCameraBinding) this.binding).cameraView.getFacing() == 1 ? 0 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        takePhoto(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$3(View view) {
        startActivity(w1.g.getGalleryIntent(this));
    }

    private void openCamera() {
        this.requestPermissionCompleted = true;
        if (!hasCameraPermission()) {
            com.orhanobut.logger.f.d("startCamera has not Camera Permission");
            return;
        }
        if (this.camreaStarted) {
            com.orhanobut.logger.f.d("The camera is started");
            return;
        }
        try {
            com.orhanobut.logger.f.e("openCamera", new Object[0]);
            ((ActivityGoogleCameraBinding) this.binding).cameraView.start();
            this.camreaStarted = true;
            if (this.enterCamera) {
                return;
            }
            this.enterCamera = true;
            i4.getInstance().enterCameraView();
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
    @SuppressLint({"CheckResult"})
    public void saveCameraResult(byte[] bArr, int i8) {
        Observable.just(bArr).map(new c(i8)).subscribeOn(Schedulers.io()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void setPreviewPhoto(byte[] bArr, int i8) {
        Observable.just(bArr).map(new e(i8)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakingPictures(boolean z7) {
        this.takingPictures = z7;
    }

    private void showCameraPermissionDialog() {
        PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_camera).setTitle(R.string.permission_camera_title).setContent(R.string.permission_camera_content).setOnClickListener(new f()).build(this).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPreviewPhoto(Bitmap bitmap) {
        ((ActivityGoogleCameraBinding) this.binding).ivHistoryPreview.setImageBitmap(bitmap);
        ((ActivityGoogleCameraBinding) this.binding).ivHistoryPreview.setVisibility(0);
    }

    private void startDownTimer() {
        this.countDownTimer.setTextView(((ActivityGoogleCameraBinding) this.binding).tvCameraCountDown).setShowGo(false).setOnCompleteListener(new a());
        this.countDownTimer.start();
    }

    private void stopCameraSound() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    private void takePhoto(boolean z7) {
        com.orhanobut.logger.f.d("takePhoto started: " + this.camreaStarted);
        if (this.camreaStarted) {
            com.orhanobut.logger.f.d("takePhoto isTakingPictures: " + isTakingPictures());
            if (isTakingPictures()) {
                return;
            }
            setTakingPictures(true);
            if (z7) {
                startDownTimer();
            } else {
                takePicture();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void takePicture() {
        playCameraSound();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((ActivityGoogleCameraBinding) this.binding).cameraView, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((ActivityGoogleCameraBinding) this.binding).cameraView, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
        ((ActivityGoogleCameraBinding) this.binding).cameraView.takePicture();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setColorNoTranslucent(this, -16777216);
        k0.setDarkMode(this);
        ((ActivityGoogleCameraBinding) this.binding).cameraView.addCallback(this.cameraCallback);
        org.greenrobot.eventbus.c.getDefault().register(this);
        com.moyoung.instructions.c.hook(InstructionsType.TAKE_PHOTOS, findViewById(R.id.iv_help_take_photos));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityGoogleCameraBinding) this.binding).ivFlash.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.camera.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleCameraActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityGoogleCameraBinding) this.binding).ivSwitchCamera.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.camera.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleCameraActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityGoogleCameraBinding) this.binding).ivShutter.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.camera.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleCameraActivity.this.lambda$initOnClickListener$2(view);
            }
        });
        ((ActivityGoogleCameraBinding) this.binding).ivHistoryPreview.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.camera.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleCameraActivity.this.lambda$initOnClickListener$3(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandTakePhotoEvent(com.crrepa.band.my.device.camera.a aVar) {
        com.orhanobut.logger.f.d("onBandTakePhotoEvent: " + aVar.isExit());
        if (aVar.isExit()) {
            onBackPressedSupport();
        } else {
            takePhoto(true);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        com.orhanobut.logger.f.d("onDestroy");
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        stopCameraSound();
        this.countDownTimer.cancel();
        i4.getInstance().exitCameraView();
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
        com.moyoung.instructions.c.hideDialog(this);
        super.onPause();
        com.orhanobut.logger.f.d("onPause");
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        this.requestPermissionCompleted = true;
        com.crrepa.band.my.device.camera.f.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.orhanobut.logger.f.d("onResume");
        openCamera();
        com.moyoung.instructions.c.resumeDialog(this);
        s0.logPage(getClass(), "拍照控制");
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

    void showDeniedForCamera() {
        com.crrepa.band.my.home.guidance.c.systemPermission("相机", false);
        finish();
    }

    void showNeverAskForCamera() {
        c0.jumpAppDetailsSetting(this);
    }

    void startCamera() {
        com.crrepa.band.my.home.guidance.c.systemPermission("相机", true);
    }
}
