package com.crrepa.band.my.device.watchface.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.watchface.model.BandWatchFaceChangeEvent;
import com.crrepa.band.my.model.PresetWatchFaceModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandPresetWatchFaceProvider;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.proxy.WatchFaceDaoProxy;
import com.crrepa.ble.conn.bean.CRPWatchFaceBackgroundInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.moyoung.dafit.module.common.utils.x;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.v;
import com.yalantis.ucrop.UCrop;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class f implements com.moyoung.dafit.module.common.baseui.f {
    private static final int COMPRESSION_QUALITY = 100;
    private static final String CROP_TEMP_IMAGE_NAME = "CropTempImage.jpg";
    private static final String TEMP_IMAGE_NAME = "temp_wf.jpg";
    private static final int TRANS_COMPLETE_PERCENT = 100;
    private static final String WATCH_FACE_BG_NAME = "watch_face_bg.jpg";
    private Bitmap newWatchFaceBitmap;
    private x1.c view;
    private WatchFace watchFace;
    private n transListener = new n(this);
    private boolean transStarted = false;
    private boolean transCompleted = false;
    private final boolean circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
    private final boolean roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();
    private int previousPercent = 0;
    private w1.b transTimeManager = new w1.b();
    private boolean transTimeout = false;
    private int index = 0;
    private int currentPresetIndex = -1;
    private int newPresetIndex = -1;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            f.this.showCropError();
        }
    }

    class b implements Function {
        b() {
        }

        @Override // io.reactivex.functions.Function
        public Bitmap apply(Intent intent) {
            Uri output = UCrop.getOutput(intent);
            if (output == null) {
                return null;
            }
            File file = new File(new URI(output.toString()));
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath(), options);
            int height = decodeFile.getHeight();
            int width = decodeFile.getWidth();
            com.orhanobut.logger.f.d("width: " + width + ",height: " + height);
            if (width == f.this.getWatchFaceWidth() && height == f.this.getWatchFaceHeight()) {
                return f.this.circleScreen ? com.moyoung.dafit.module.common.utils.g.getCirleBitmap(decodeFile) : decodeFile;
            }
            return null;
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            f.this.view.renderTransProgressStarting();
        }
    }

    class d implements Consumer {
        final /* synthetic */ int val$percent;

        d(int i8) {
            this.val$percent = i8;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            f.this.view.renderTransProgressChanged(this.val$percent);
        }
    }

    class e implements Consumer {
        e() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            f.this.view.renderTransTimeout();
        }
    }

    /* renamed from: com.crrepa.band.my.device.watchface.presenter.f$f, reason: collision with other inner class name */
    class C0190f implements Consumer {
        final /* synthetic */ Context val$context;
        final /* synthetic */ Bitmap val$previewBitmap;

        C0190f(Context context, Bitmap bitmap) {
            this.val$context = context;
            this.val$previewBitmap = bitmap;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Bitmap bitmap) {
            f.this.sendBandWatchFace(this.val$context, bitmap, this.val$previewBitmap);
        }
    }

    class g implements Consumer {
        g() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            f.this.showTransError();
        }
    }

    class h implements ObservableOnSubscribe {
        final /* synthetic */ PresetWatchFaceModel val$watchFaceModel;

        h(PresetWatchFaceModel presetWatchFaceModel) {
            this.val$watchFaceModel = presetWatchFaceModel;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(@NonNull ObservableEmitter<Bitmap> observableEmitter) {
            try {
                observableEmitter.onNext(this.val$watchFaceModel.getRequestCreator().resize(f.this.getWatchFaceWidth(), f.this.getWatchFaceHeight()).get());
            } catch (IOException e8) {
                observableEmitter.onError(e8);
            }
            observableEmitter.onComplete();
        }
    }

    class i implements Consumer {
        i() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            f.this.view.renderTransCompleted();
        }
    }

    class j implements Consumer {
        final /* synthetic */ Context val$context;

        j(Context context) {
            this.val$context = context;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Uri uri) {
            f.this.crop(this.val$context, uri);
        }
    }

    class k implements Consumer {
        k() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
            f.this.showCropError();
        }
    }

    class l implements ObservableOnSubscribe {
        final /* synthetic */ Context val$context;
        final /* synthetic */ Uri val$uri;

        l(Context context, Uri uri) {
            this.val$context = context;
            this.val$uri = uri;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Uri> observableEmitter) {
            Bitmap cropBitmap = f.this.getCropBitmap(this.val$context, this.val$uri);
            if (cropBitmap != null) {
                File file = new File(this.val$context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), f.WATCH_FACE_BG_NAME);
                com.moyoung.dafit.module.common.utils.g.saveBitmap(cropBitmap, file);
                observableEmitter.onNext(Uri.fromFile(file));
            }
            observableEmitter.onComplete();
        }
    }

    class m implements Consumer {
        m() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Bitmap bitmap) {
            if (bitmap != null) {
                f.this.showCustomizeWatchFace(bitmap);
            } else {
                f.this.showCropError();
            }
        }
    }

    private static class n implements CRPFileTransListener {
        private WeakReference<f> weakReference;

        public n(f fVar) {
            this.weakReference = new WeakReference<>(fVar);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            com.orhanobut.logger.f.d("onError: " + i8);
            f fVar = this.weakReference.get();
            if (fVar != null) {
                fVar.showTransTimeout();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            com.orhanobut.logger.f.d("onTransCompleted");
            f fVar = this.weakReference.get();
            if (fVar != null) {
                fVar.onTransProgressChanged(100);
                fVar.transCompleted();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            com.orhanobut.logger.f.d("onTransProgressChanged: " + i8);
            f fVar = this.weakReference.get();
            if (fVar != null) {
                fVar.onTransProgressChanged(i8);
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            com.orhanobut.logger.f.d("onTransProgressStarting");
            f fVar = this.weakReference.get();
            if (fVar != null) {
                fVar.onTransProgressStarting();
            }
        }
    }

    public f() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void abortWatchFaceBackground() {
        sendDefaultWatchFace();
        saveWatchFaceLayout();
        i4.getInstance().abortWatchFaceBackground();
        org.greenrobot.eventbus.c.getDefault().post(new BandWatchFaceChangeEvent(this.watchFace));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void crop(Context context, @androidx.annotation.NonNull Uri uri) {
        UCrop.Options options = new UCrop.Options();
        options.setCompressionFormat(Bitmap.CompressFormat.JPEG);
        options.setCompressionQuality(100);
        options.setHideBottomControls(true);
        options.setFreeStyleCropEnabled(false);
        options.setToolbarColor(ContextCompat.getColor(context, R.color.light_teal));
        options.setStatusBarColor(ContextCompat.getColor(context, R.color.light_teal));
        options.setToolbarWidgetColor(-1);
        options.setCircleDimmedLayer(this.circleScreen);
        options.setShowCropFrame(true);
        options.setShowCropGrid(false);
        this.view.renderCropView(UCrop.of(uri, Uri.fromFile(new File(com.moyoung.dafit.module.common.utils.d.get().getCacheDir(), CROP_TEMP_IMAGE_NAME))).withAspectRatio(getWatchFaceWidth(), getWatchFaceHeight()).withMaxResultSize(getWatchFaceWidth(), getWatchFaceHeight()).withOptions(options));
    }

    @SuppressLint({"CheckResult"})
    private void cropOf29(Context context, @androidx.annotation.NonNull Uri uri) {
        Observable.create(new l(context, uri)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new j(context), new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getCropBitmap(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            int readExifOrientation = w1.f.readExifOrientation(new ExifInterface(context.getContentResolver().openInputStream(uri)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
            com.orhanobut.logger.f.d("orientation: " + readExifOrientation);
            return com.moyoung.dafit.module.common.utils.g.rotaingBitmap(BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri)), readExifOrientation);
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWatchFaceHeight() {
        WatchFace watchFace = this.watchFace;
        if (watchFace == null || watchFace.getHeight() == null) {
            return 240;
        }
        return this.watchFace.getHeight().intValue();
    }

    private String getWatchFacePictureMd5(File file) {
        if (file == null || !file.exists()) {
            return "00000000000000000000000000000000";
        }
        try {
            return x.getFileMD5(file);
        } catch (IOException e8) {
            e8.printStackTrace();
            return "00000000000000000000000000000000";
        }
    }

    private float getWatchFaceRatio() {
        if (this.watchFace == null) {
            return 1.0f;
        }
        float intValue = r0.getWidth().intValue() / this.watchFace.getHeight().floatValue();
        if (1.0f < intValue) {
            return 1.0f;
        }
        return intValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWatchFaceWidth() {
        WatchFace watchFace = this.watchFace;
        if (watchFace == null || watchFace.getWidth() == null) {
            return 240;
        }
        return this.watchFace.getWidth().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void onTransProgressChanged(int i8) {
        if (this.view == null) {
            return;
        }
        if (!this.transTimeManager.isTimeout() || this.transTimeout) {
            if (i8 == this.previousPercent) {
                return;
            }
            this.previousPercent = i8;
            Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(i8));
            return;
        }
        com.orhanobut.logger.f.d("onTransProgressChanged timeout");
        this.transTimeout = true;
        abortWatchFaceBackground();
        i4.getInstance().checkFirmwareVersion(BandInfoManager.getFirmwareVersion(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void onTransProgressStarting() {
        if (this.view != null) {
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
        }
    }

    private void recycleBitmap() {
        if (this.newWatchFaceBitmap != null) {
            this.newWatchFaceBitmap = null;
        }
    }

    private v resizeRequestCreator(v vVar) {
        return vVar.resize(getWatchFaceWidth(), getWatchFaceHeight());
    }

    private File saveWatchFaceBackgroundPicture(Bitmap bitmap, @androidx.annotation.NonNull File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (bitmap == null) {
            return null;
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e9) {
            e = e9;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
        return file;
    }

    private void saveWatchFaceLayout() {
        CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo = w1.j.toCRPWatchFaceLayoutInfo(this.watchFace);
        if (cRPWatchFaceLayoutInfo != null) {
            com.orhanobut.logger.f.d("sendWatchFaceLayout: " + cRPWatchFaceLayoutInfo);
            i4.getInstance().sendWatchFaceLayout(cRPWatchFaceLayoutInfo);
        }
        new WatchFaceDaoProxy().insert(this.watchFace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sendBandWatchFace(Context context, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null) {
            saveWatchFaceLayout();
            showTransCompeled();
        } else {
            if (BandBatteryProvider.isOtaLowBattery()) {
                this.view.renderLowBatteryHint();
                return true;
            }
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (height != getWatchFaceHeight() || width != getWatchFaceWidth() || com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() == null) {
                return false;
            }
            this.transStarted = true;
            this.transCompleted = false;
            this.newWatchFaceBitmap = bitmap;
            sendWatchFaceBackground(context, bitmap, bitmap2);
        }
        return true;
    }

    private void sendDefaultWatchFace() {
        File customizeWatchFaceFile = com.crrepa.band.my.ble.band.utils.a.getInstance().getCustomizeWatchFaceFile(this.watchFace.getIndex().intValue());
        if (customizeWatchFaceFile.exists()) {
            customizeWatchFaceFile.delete();
        }
        this.watchFace.setMd5("00000000000000000000000000000000");
        this.watchFace.setType(1);
    }

    private void sendWatchFaceBackground(Context context, Bitmap bitmap, Bitmap bitmap2) {
        boolean z7;
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (this.circleScreen) {
            bitmap = com.moyoung.dafit.module.common.utils.g.getCirleBitmap(bitmap);
        }
        Integer thumHeight = this.watchFace.getThumHeight();
        Integer thumWidth = this.watchFace.getThumWidth();
        com.orhanobut.logger.f.d("thum width: " + thumWidth);
        com.orhanobut.logger.f.d("thum height: " + thumWidth);
        if (!com.crrepa.band.my.ble.band.utils.a.getInstance().isBluetrum()) {
            bitmap2 = bitmap;
        }
        if (thumHeight == null || thumHeight.intValue() <= 0 || thumWidth == null || thumWidth.intValue() <= 0) {
            z7 = false;
        } else {
            if (this.roundedRectangleScreen) {
                int thumFilletRadius = connectBand.getThumFilletRadius();
                if (connectBand instanceof CustomizeBandModel) {
                    thumFilletRadius = ((CustomizeBandModel) connectBand).getThumbRadiusForWatch(this.watchFace.getWidth().intValue(), thumWidth.intValue());
                }
                bitmap2 = com.moyoung.dafit.module.common.utils.g.getRoundBitmap(bitmap2, thumWidth.intValue(), thumHeight.intValue(), thumFilletRadius);
            } else {
                bitmap2 = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(bitmap2, thumWidth.intValue(), thumHeight.intValue());
            }
            com.moyoung.dafit.module.common.utils.g.saveBitmap(bitmap2, new File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "thum.png"));
            z7 = true;
        }
        Integer compressionType = this.watchFace.getCompressionType();
        CRPWatchFaceLayoutInfo.CompressionType valueOf = compressionType == null ? CRPWatchFaceLayoutInfo.CompressionType.ORIGINAL : CRPWatchFaceLayoutInfo.CompressionType.valueOf(compressionType.intValue());
        int i8 = this.newPresetIndex;
        String watchFacePictureMd5 = i8 == -1 ? getWatchFacePictureMd5(saveWatchFaceBackgroundPicture(this.newWatchFaceBitmap, new File(context.getCacheDir(), TEMP_IMAGE_NAME))) : BandPresetWatchFaceProvider.getPresetWatchFaceMd5(i8);
        if (!TextUtils.isEmpty(watchFacePictureMd5)) {
            this.watchFace.setMd5(watchFacePictureMd5);
        }
        saveWatchFaceLayout();
        CRPWatchFaceBackgroundInfo cRPWatchFaceBackgroundInfo = new CRPWatchFaceBackgroundInfo(bitmap, valueOf);
        if (z7) {
            cRPWatchFaceBackgroundInfo.setThumBitmap(bitmap2);
        }
        i4.getInstance().sendBandWatchFaceBackground(cRPWatchFaceBackgroundInfo, this.transListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCropError() {
        this.view.renderCropError(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cannot_retrieve_cropped_image));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCustomizeWatchFace(Bitmap bitmap) {
        this.view.renderWatchFaceBackground(bitmap, 3);
    }

    private void showPresetWatchFaceList(int i8, String str, int i9) {
        v load;
        boolean z7;
        v load2;
        com.orhanobut.logger.f.d("showPresetWatchFaceList: " + i8 + ", " + str + ", " + i9);
        ArrayList arrayList = new ArrayList();
        Picasso picasso = Picasso.get();
        if (AIProvider.isSupportAIWatchFace()) {
            i8--;
        }
        File bandWatchFaceFile = com.crrepa.band.my.ble.band.utils.a.getInstance().getBandWatchFaceFile(i8);
        picasso.load(bandWatchFaceFile);
        PresetWatchFaceModel presetWatchFaceModel = new PresetWatchFaceModel(1, resizeRequestCreator(picasso.load(bandWatchFaceFile)), BandPresetWatchFaceProvider.isDefault(str));
        arrayList.add(presetWatchFaceModel);
        this.currentPresetIndex = BandPresetWatchFaceProvider.getPresetWatchFaceIndex(str);
        boolean z8 = false;
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            int[] iArr = BandPresetWatchFaceProvider.DEFAULT_WATCH_FACE_LIST;
            if (i10 >= iArr.length) {
                break;
            }
            boolean z10 = this.currentPresetIndex == i10;
            arrayList.add(new PresetWatchFaceModel(2, resizeRequestCreator(picasso.load(iArr[i10])), z10));
            if (z10) {
                z9 = true;
            }
            i10++;
        }
        File watchFaceFile = w1.j.getWatchFaceFile(i8, str);
        boolean isDressWatchFace = BandPresetWatchFaceProvider.isDressWatchFace(i9);
        if (isDressWatchFace && watchFaceFile != null && watchFaceFile.exists()) {
            load = picasso.load(watchFaceFile);
            z7 = true;
        } else {
            load = picasso.load(R$drawable.bg_watchface_ai);
            z7 = false;
        }
        PresetWatchFaceModel presetWatchFaceModel2 = new PresetWatchFaceModel(4, resizeRequestCreator(load), isDressWatchFace);
        presetWatchFaceModel2.setHasWatchFace(z7);
        arrayList.add(presetWatchFaceModel2);
        boolean isGalleryWatchface = BandPresetWatchFaceProvider.isGalleryWatchface(i9);
        if (isGalleryWatchface && watchFaceFile != null && watchFaceFile.exists()) {
            load2 = picasso.load(watchFaceFile);
            z8 = true;
        } else {
            load2 = picasso.load(R.drawable.img_watchface_preset_default);
        }
        PresetWatchFaceModel presetWatchFaceModel3 = new PresetWatchFaceModel(3, resizeRequestCreator(load2), isGalleryWatchface);
        presetWatchFaceModel3.setHasWatchFace(z8);
        arrayList.add(presetWatchFaceModel3);
        if (!z9 && !isDressWatchFace && !isGalleryWatchface) {
            presetWatchFaceModel.setChecked(true);
        }
        this.view.renderPresetWatchFace(arrayList);
    }

    @SuppressLint({"CheckResult"})
    private void showTransCompeled() {
        if (this.view != null) {
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTransError() {
        this.transCompleted = true;
        abortWatchFaceBackground();
        showWatchFaceBackground(this.watchFace.getIndex().intValue(), "00000000000000000000000000000000");
        this.view.renderTransError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showTransTimeout() {
        this.transCompleted = true;
        if (this.view != null) {
            abortWatchFaceBackground();
            Observable.just(1).observeOn(AndroidSchedulers.mainThread()).subscribe(new e());
        }
    }

    private void showWatchFaceBackground(int i8, String str) {
        int presetWatchFaceIndex = BandPresetWatchFaceProvider.getPresetWatchFaceIndex(str);
        com.orhanobut.logger.f.d("showWatchFaceBackground md5: " + str + ", presetIndex: " + presetWatchFaceIndex);
        if (presetWatchFaceIndex >= 0) {
            this.view.renderWatchFaceBackground(Picasso.get().load(BandPresetWatchFaceProvider.DEFAULT_WATCH_FACE_LIST[presetWatchFaceIndex]));
            return;
        }
        File watchFaceFile = w1.j.getWatchFaceFile(i8, str);
        if (watchFaceFile == null || !watchFaceFile.exists()) {
            return;
        }
        com.orhanobut.logger.f.d("showWatchFaceBackground path: " + watchFaceFile.getAbsolutePath());
        this.view.renderWatchFaceBackground(Picasso.get().load(watchFaceFile));
    }

    private void showWatchFaceTextColorIndex(int i8) {
        this.view.renderWatchFaceTextColor(i8);
    }

    private void showWatchFaceTimeBottomContent(int i8) {
        this.view.renderWatchFaceTimeBottomContent(i8, getWatchFaceRatio());
    }

    private void showWatchFaceTimePosition(int i8) {
        this.view.renderWatchFaceTimePosition(i8, this.circleScreen, this.roundedRectangleScreen, getWatchFaceRatio());
    }

    private void showWatchFaceTimeTopContent(int i8) {
        this.view.renderWatchFaceTimeTopContent(i8, getWatchFaceRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transCompleted() {
        this.transCompleted = true;
        Picasso.get().invalidate(saveWatchFaceBackgroundPicture(this.newWatchFaceBitmap, com.crrepa.band.my.ble.band.utils.a.getInstance().getCustomizeWatchFaceFile(this.watchFace.getIndex().intValue())));
        showTransCompeled();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        recycleBitmap();
        if (!this.transStarted || this.transCompleted) {
            return;
        }
        this.watchFace.setMd5("00000000000000000000000000000000");
        this.watchFace.setType(1);
        com.orhanobut.logger.f.d("id: " + new WatchFaceDaoProxy().insert(this.watchFace));
    }

    @SuppressLint({"CheckResult"})
    public void getCropResult(@androidx.annotation.NonNull Intent intent) {
        Observable.just(intent).map(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new m(), new a());
    }

    public void getWatchFaceLayout(int i8) {
        this.index = i8;
        String name = com.crrepa.band.my.ble.band.utils.a.getInstance().getName();
        if (TextUtils.isEmpty(name)) {
            return;
        }
        WatchFace watchFace = new WatchFaceDaoProxy().getWatchFace(name);
        if (watchFace == null) {
            this.watchFace = w1.j.getDefaultWatchFace(name, i8);
        } else {
            this.watchFace = watchFace.copy();
        }
        if (this.circleScreen) {
            this.view.rendercCircleScreen();
        } else if (this.roundedRectangleScreen) {
            this.view.renderRoundedRectangleScreen();
        }
        String md5 = this.watchFace.getMd5();
        int i9 = 1;
        if (!BandPresetWatchFaceProvider.isDefault(md5) && this.watchFace.getType() != null) {
            i9 = this.watchFace.getType().intValue();
        }
        showPresetWatchFaceList(i8, md5, i9);
        this.view.renderWatchFaceRatio(getWatchFaceRatio());
        showWatchFaceBackground(this.watchFace.getIndex().intValue(), md5);
        showWatchFaceTimePosition(this.watchFace.getTimePosition().intValue());
        showWatchFaceTimeTopContent(this.watchFace.getTimeTopContent().intValue());
        showWatchFaceTimeBottomContent(this.watchFace.getTimeBottomComtent().intValue());
        showWatchFaceTextColorIndex(this.watchFace.getTextColor().intValue());
    }

    public int getWatchFaceTextColorIndex() {
        return this.watchFace.getTextColor().intValue();
    }

    public int getWatchFaceTimeBottomContent() {
        return this.watchFace.getTimeBottomComtent().intValue();
    }

    public int getWatchFaceTimePosition() {
        return this.watchFace.getTimePosition().intValue();
    }

    public int getWatchFaceTimeTopContent() {
        return this.watchFace.getTimeTopContent().intValue();
    }

    public void handleCropError(@androidx.annotation.NonNull Intent intent) {
        Throwable error = UCrop.getError(intent);
        if (error != null) {
            com.orhanobut.logger.f.e("handleCropError: ", error);
            showCropError();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandDfuStateChangeEvent(l0.e eVar) {
        if (eVar.getState() != 0 || !this.transStarted || this.transCompleted || this.transTimeout) {
            return;
        }
        showTransError();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandWatchFaceChangeEvent(BandWatchFaceChangeEvent bandWatchFaceChangeEvent) {
        WatchFace watchFace = bandWatchFaceChangeEvent.getWatchFace();
        if (watchFace != null) {
            this.watchFace.setHeight(watchFace.getHeight());
            this.watchFace.setWidth(watchFace.getWidth());
            this.watchFace.setThumHeight(watchFace.getThumHeight());
            this.watchFace.setThumWidth(watchFace.getThumWidth());
            getWatchFaceLayout(this.index);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    @SuppressLint({"CheckResult"})
    public void saveWatchFace(Context context, PresetWatchFaceModel presetWatchFaceModel, int i8, Bitmap bitmap) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            this.view.renderDisconnectHint();
            return;
        }
        this.newPresetIndex = -1;
        int type = presetWatchFaceModel.getType();
        this.watchFace.setType(Integer.valueOf(type));
        if (type == 1) {
            sendDefaultWatchFace();
            saveWatchFaceLayout();
            showTransCompeled();
        } else {
            if (type != 2) {
                Bitmap bitmap2 = presetWatchFaceModel.getBitmap();
                if (bitmap2 != null && type == 4) {
                    bitmap2 = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(bitmap2, getWatchFaceWidth(), getWatchFaceHeight());
                }
                sendBandWatchFace(context, bitmap2, bitmap);
                return;
            }
            int i9 = i8 - 1;
            if (this.currentPresetIndex == i9) {
                saveWatchFaceLayout();
                showTransCompeled();
            } else {
                this.newPresetIndex = i9;
                Observable.create(new h(presetWatchFaceModel)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0190f(context, bitmap), new g());
            }
        }
    }

    public void saveWatchFaceTextColor(int i8) {
        this.watchFace.setTextColor(Integer.valueOf(i8));
        showWatchFaceTextColorIndex(i8);
    }

    public void saveWatchFaceTimeBottomContent(int i8) {
        this.watchFace.setTimeBottomComtent(Integer.valueOf(i8));
        showWatchFaceTimeBottomContent(i8);
    }

    public void saveWatchFaceTimePosition(int i8) {
        this.watchFace.setTimePosition(Integer.valueOf(i8));
        showWatchFaceTimePosition(i8);
    }

    public void saveWatchFaceTimeTopContent(int i8) {
        this.watchFace.setTimeTopContent(Integer.valueOf(i8));
        showWatchFaceTimeTopContent(i8);
    }

    public void setView(x1.c cVar) {
        this.view = cVar;
    }

    public void startCrop(Context context, @androidx.annotation.NonNull Uri uri) {
        if (29 <= Build.VERSION.SDK_INT) {
            cropOf29(context, uri);
        } else {
            crop(context, uri);
        }
    }
}
