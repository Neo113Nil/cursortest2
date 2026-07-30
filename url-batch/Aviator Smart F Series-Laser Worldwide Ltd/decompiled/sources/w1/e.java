package w1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.yalantis.ucrop.UCrop;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/* loaded from: classes2.dex */
public class e {
    private static final int COMPRESSION_QUALITY = 100;
    private static final String CROPPED_IMAGE_NAME = "CropTempImage.jpg";
    private static final String WATCH_FACE_BG_NAME = "watch_face_bg.jpg";

    public static UCrop crop(Context context, @NonNull Uri uri, boolean z7, boolean z8) {
        UCrop.Options options = new UCrop.Options();
        options.setCompressionFormat(Bitmap.CompressFormat.JPEG);
        options.setCompressionQuality(100);
        options.setHideBottomControls(true);
        options.setFreeStyleCropEnabled(z8);
        options.setToolbarColor(ContextCompat.getColor(context, R.color.light_teal));
        options.setStatusBarColor(ContextCompat.getColor(context, R.color.light_teal));
        options.setToolbarWidgetColor(-1);
        options.setCircleDimmedLayer(z7);
        options.setShowCropFrame(true);
        options.setShowCropGrid(false);
        return UCrop.of(uri, Uri.fromFile(new File(com.moyoung.dafit.module.common.utils.d.get().getCacheDir(), CROPPED_IMAGE_NAME))).withAspectRatio(DefaultWatchFaceProvider.getWatchFaceWidth(), DefaultWatchFaceProvider.getWatchFaceHeight()).withMaxResultSize(DefaultWatchFaceProvider.getWatchFaceWidth(), DefaultWatchFaceProvider.getWatchFaceHeight()).withOptions(options);
    }

    @SuppressLint({"CheckResult"})
    public static Observable<Uri> cropOf29(final Context context, @NonNull final Uri uri) {
        return Observable.create(new ObservableOnSubscribe() { // from class: w1.d
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                e.lambda$cropOf29$0(context, uri, observableEmitter);
            }
        });
    }

    private static Bitmap getCropBitmap(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            int readExifOrientation = f.readExifOrientation(new ExifInterface(context.getContentResolver().openInputStream(uri)).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
            com.orhanobut.logger.f.d("orientation: " + readExifOrientation);
            return com.moyoung.dafit.module.common.utils.g.rotaingBitmap(BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri)), readExifOrientation);
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"CheckResult"})
    public static Observable<Bitmap> getCropResult(@NonNull Intent intent, final boolean z7) {
        return Observable.just(intent).map(new Function() { // from class: w1.c
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap lambda$getCropResult$1;
                lambda$getCropResult$1 = e.lambda$getCropResult$1(z7, (Intent) obj);
                return lambda$getCropResult$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cropOf29$0(Context context, Uri uri, ObservableEmitter observableEmitter) {
        Bitmap cropBitmap = getCropBitmap(context, uri);
        if (cropBitmap != null) {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), WATCH_FACE_BG_NAME);
            com.orhanobut.logger.f.e("filepath:" + file.getAbsolutePath(), new Object[0]);
            com.moyoung.dafit.module.common.utils.g.saveBitmap(cropBitmap, file);
            observableEmitter.onNext(Uri.fromFile(file));
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bitmap lambda$getCropResult$1(boolean z7, Intent intent) {
        Uri output = UCrop.getOutput(intent);
        if (output == null) {
            return null;
        }
        File file = new File(new URI(output.toString()));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath(), options);
        int height = decodeFile.getHeight();
        com.orhanobut.logger.f.d("width: " + decodeFile.getWidth() + ",height: " + height);
        return z7 ? com.moyoung.dafit.module.common.utils.g.getCirleBitmap(decodeFile) : decodeFile;
    }
}
