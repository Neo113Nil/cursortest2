package com.crrepa.band.my.device.watchfacenew.video.model;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.NonNull;
import b2.a;
import cn.hutool.core.text.l;
import com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.g;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.q;
import com.moyoung.dafit.module.common.utils.x;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class LocalVideoModel {

    public interface Callback {
        void onFail();

        void onSuccess(String str);
    }

    public static File createVideoFileToMd5File(File file) {
        try {
            File file2 = new File(g0.getMovieFilePath(d.get(), x.getFileMD5(file)) + ".mp4");
            q.copyFile(file, file2);
            return file2;
        } catch (IOException unused) {
            return file;
        }
    }

    public static String getAddedPaddingVideoPathFromLocalVideo() {
        return g0.getMovieFilePath(d.get(), "local_video_added_padding_video_temp.mp4");
    }

    public static String getCircleMaskPath(int i8, int i9) {
        String picturesFilePath = g0.getPicturesFilePath(d.get(), "watch_face_video_preview_mask_" + i8 + "_" + i9 + ".png");
        if (!new File(picturesFilePath).exists()) {
            a.saveCircleMaskToSDCard(i8, i9, picturesFilePath);
        }
        return picturesFilePath;
    }

    public static String getCornerMaskImgPathFromLocalVideo(int i8, int i9, int i10, int i11, int i12) {
        if (isCircleVideo(i10, i11, i12)) {
            return getCircleMaskPath(i10, i11);
        }
        String picturesFilePath = g0.getPicturesFilePath(d.get(), "local_video_mask_img_" + i8 + "_" + i9 + "_" + i12 + ".png");
        if (!new File(picturesFilePath).exists()) {
            a.saveCornerMaskToSDCard(i8, i9, (i9 - i11) / 2.0f, (i8 - i10) / 2.0f, i12, picturesFilePath);
        }
        return picturesFilePath;
    }

    public static String getCornerMaskPath(int i8, int i9, int i10) {
        String picturesFilePath = g0.getPicturesFilePath(d.get(), "watch_face_video_preview_mask_" + i8 + "_" + i9 + "_" + i10 + ".png");
        if (!new File(picturesFilePath).exists()) {
            a.saveCornerMaskToSDCard(i8, i9, i10, picturesFilePath);
        }
        return picturesFilePath;
    }

    public static String getCroppedVideoPath() {
        return g0.getMovieFilePath(d.get(), "cropped_video.mp4");
    }

    public static String getCroppedVideoPathFromLocalVideo() {
        return g0.getMovieFilePath(d.get(), "local_video_cropped_video_temp.mp4");
    }

    public static String getCroppedVideoPathWith264FromLocalVideo() {
        return g0.getMovieFilePath(d.get(), "local_video_cropped_video_temp_264.mp4");
    }

    public static String getCroppedVideoPreviewPath() {
        return g0.getMovieFilePath(d.get(), "cropped_video_preview.mp4");
    }

    public static String getCroppedVideoTempPath() {
        return g0.getMovieFilePath(d.get(), "cropped_video_temp.mp4");
    }

    @NonNull
    public static String getLocalVideoTempDir() {
        return g0.getDirPathByDirName(d.get(), Environment.DIRECTORY_MOVIES, "LocalVideoTemp");
    }

    public static String getMaskedVideoPathFromLocalVideo() {
        return g0.getMovieFilePath(d.get(), "local_video_masked_video_temp.mp4");
    }

    public static Bitmap getVideoThumbnail(String str) {
        return ThumbnailUtils.createVideoThumbnail(str, 1);
    }

    public static String getVideoWatchFaceFilePath() {
        return g0.getMovieFilePath(d.get(), "video_watch_face_file.mp4");
    }

    public static String getVideoWatchFacePreviewFilePath() {
        return g0.getMovieFilePath(d.get(), "video_watch_face_preview_file.mp4");
    }

    public static String getVideoWatchFacePreviewImgPath() {
        return g0.getPicturesFilePath(d.get(), "video_watch_face_preview_img.png");
    }

    @NonNull
    public static String getVideoWatchFaceTempDir() {
        return g0.getDirPathByDirName(d.get(), Environment.DIRECTORY_MOVIES, "VideoWatchFaceTemp");
    }

    public static boolean isCircleVideo(int i8, int i9, int i10) {
        Log.d("isCircleVideo: ", i8 + l.SPACE + i9 + l.SPACE + i10);
        return i8 == i9 && i8 == i10 * 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryVideoAbsolutePath$0(long j8, Callback callback, String str) {
        Log.d("LocalVideoModel", "end: " + (System.currentTimeMillis() - j8));
        callback.onSuccess(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryVideoAbsolutePath$1(Callback callback, Throwable th) {
        th.printStackTrace();
        callback.onFail();
    }

    @SuppressLint({"CheckResult"})
    public static void queryVideoAbsolutePath(Uri uri, String str, final Callback callback) {
        if (uri == null) {
            callback.onFail();
            return;
        }
        Cursor query = d.get().getContentResolver().query(uri, new String[]{"_display_name", "_data"}, null, null, null);
        try {
            if (query == null) {
                callback.onFail();
                return;
            }
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    final long currentTimeMillis = System.currentTimeMillis();
                    g0.queryAndCreateUriAbsolutePath(d.get(), uri, str + File.separator + string).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: a2.a
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            LocalVideoModel.lambda$queryVideoAbsolutePath$0(currentTimeMillis, callback, (String) obj);
                        }
                    }, new Consumer() { // from class: a2.b
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            LocalVideoModel.lambda$queryVideoAbsolutePath$1(LocalVideoModel.Callback.this, (Throwable) obj);
                        }
                    });
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                callback.onFail();
            }
        } finally {
            query.close();
        }
    }

    public static void renameCroppedFileToVideoWatchFaceFile() {
        new File(getCroppedVideoPath()).renameTo(new File(getVideoWatchFaceFilePath()));
        new File(getCroppedVideoPreviewPath()).renameTo(new File(getVideoWatchFacePreviewFilePath()));
    }

    public static void saveVideoWatchFacePreviewImg() {
        g.saveBitmap(getVideoThumbnail(getVideoWatchFacePreviewFilePath()), new File(getVideoWatchFacePreviewImgPath()));
    }
}
