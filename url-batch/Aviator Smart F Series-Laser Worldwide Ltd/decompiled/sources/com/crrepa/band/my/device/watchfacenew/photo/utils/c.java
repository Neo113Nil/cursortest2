package com.crrepa.band.my.device.watchfacenew.photo.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.delegate.img.i;
import com.crrepa.band.my.device.watchfacenew.video.model.LocalVideoModel;
import com.crrepa.band.my.training.utils.l;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.g;
import com.moyoung.dafit.module.common.utils.g0;
import java.io.File;

/* loaded from: classes2.dex */
public class c {
    public static Bitmap getThumbBitmapWithLabel(Bitmap bitmap, boolean z7) {
        return getThumbBitmapWithLabel(bitmap, z7, true);
    }

    public static Bitmap getVideoFirstFrameBitmap(ImageView imageView) {
        Bitmap videoThumbnail;
        String croppedVideoPreviewPath = LocalVideoModel.getCroppedVideoPreviewPath();
        if (new File(croppedVideoPreviewPath).exists()) {
            videoThumbnail = LocalVideoModel.getVideoThumbnail(croppedVideoPreviewPath);
        } else {
            String videoWatchFacePreviewFilePath = LocalVideoModel.getVideoWatchFacePreviewFilePath();
            videoThumbnail = new File(videoWatchFacePreviewFilePath).exists() ? LocalVideoModel.getVideoThumbnail(videoWatchFacePreviewFilePath) : g.drawableToBitmap(imageView.getDrawable(), imageView.getWidth(), imageView.getHeight());
        }
        Bitmap roundBitmap = g.getRoundBitmap(videoThumbnail, i.getScreenWidth(), i.getScreenHeight(), i.getCornerRadius());
        if (roundBitmap != null) {
            g.saveBitmap(roundBitmap, new File(g0.getPicturesFilePath(d.get(), "video_first_frame.png")));
        }
        return roundBitmap;
    }

    private static Bitmap getWatchFaceLabelBitmap(boolean z7) {
        int i8 = z7 ? R.drawable.img_time_pointer : R.drawable.img_new_watch_face_label;
        int thumbWidth = i.getThumbWidth();
        int thumbHeight = i.getThumbHeight();
        Bitmap roundBitmap = g.getRoundBitmap(g.drawableResToBitmap(i8, thumbWidth, thumbHeight), thumbWidth, thumbHeight, i.getThumbRadius());
        g.saveBitmap(roundBitmap, new File(g0.getPicturesFilePath(d.get(), "watch_face_label.png")));
        return roundBitmap;
    }

    public static Bitmap getThumbBitmapWithLabel(Bitmap bitmap, boolean z7, boolean z8) {
        int thumbWidth = i.getThumbWidth();
        int thumbHeight = i.getThumbHeight();
        Bitmap changeBitmapSize = g.changeBitmapSize(bitmap, thumbWidth, thumbHeight);
        if (z8) {
            changeBitmapSize = l.jointBitmapOverlap(changeBitmapSize, getWatchFaceLabelBitmap(z7));
        }
        Bitmap roundBitmap = g.getRoundBitmap(changeBitmapSize, thumbWidth, thumbHeight, i.getThumbRadius());
        g.saveBitmap(roundBitmap, new File(g0.getPicturesFilePath(d.get(), "watch_face_img_with_label.png")));
        return roundBitmap;
    }
}
