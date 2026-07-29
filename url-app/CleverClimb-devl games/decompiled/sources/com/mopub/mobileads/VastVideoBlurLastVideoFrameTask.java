package com.mopub.mobileads;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.ImageUtils;

/* loaded from: classes2.dex */
public class VastVideoBlurLastVideoFrameTask extends AsyncTask<String, Void, Boolean> {
    private static final int MICROSECONDS_PER_MILLISECOND = 1000;
    private static final int OFFSET_IN_MICROSECONDS = 200000;
    private Bitmap mBlurredLastVideoFrame;
    private final ImageView mBlurredLastVideoFrameImageView;
    private Bitmap mLastVideoFrame;
    private final MediaMetadataRetriever mMediaMetadataRetriever;
    private int mVideoDuration;

    public VastVideoBlurLastVideoFrameTask(MediaMetadataRetriever mediaMetadataRetriever, ImageView imageView, int i) {
        this.mMediaMetadataRetriever = mediaMetadataRetriever;
        this.mBlurredLastVideoFrameImageView = imageView;
        this.mVideoDuration = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(String... strArr) {
        if (strArr == null || strArr.length == 0 || strArr[0] == null) {
            return false;
        }
        try {
            this.mMediaMetadataRetriever.setDataSource(strArr[0]);
            this.mLastVideoFrame = this.mMediaMetadataRetriever.getFrameAtTime((this.mVideoDuration * 1000) - OFFSET_IN_MICROSECONDS, 3);
            if (this.mLastVideoFrame == null) {
                return false;
            }
            this.mBlurredLastVideoFrame = ImageUtils.applyFastGaussianBlurToBitmap(this.mLastVideoFrame, 4);
            return true;
        } catch (Exception e) {
            MoPubLog.d("Failed to blur last video frame", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        if (isCancelled()) {
            onCancelled();
        } else {
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            this.mBlurredLastVideoFrameImageView.setImageBitmap(this.mBlurredLastVideoFrame);
            this.mBlurredLastVideoFrameImageView.setImageAlpha(100);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        MoPubLog.d("VastVideoBlurLastVideoFrameTask was cancelled.");
    }

    @VisibleForTesting
    @Deprecated
    Bitmap getBlurredLastVideoFrame() {
        return this.mBlurredLastVideoFrame;
    }
}
