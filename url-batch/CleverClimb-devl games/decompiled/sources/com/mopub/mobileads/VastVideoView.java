package com.mopub.mobileads;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.VideoView;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;

/* loaded from: classes2.dex */
public class VastVideoView extends VideoView {
    private static final int MAX_VIDEO_RETRIES = 1;
    private static final int VIDEO_VIEW_FILE_PERMISSION_ERROR = Integer.MIN_VALUE;
    private VastVideoBlurLastVideoFrameTask mBlurLastVideoFrameTask;
    private MediaMetadataRetriever mMediaMetadataRetriever;

    public VastVideoView(Context context) {
        super(context);
        Preconditions.checkNotNull(context, "context cannot be null");
        this.mMediaMetadataRetriever = new MediaMetadataRetriever();
    }

    public void prepareBlurredLastVideoFrame(ImageView imageView, String str) {
        if (this.mMediaMetadataRetriever != null) {
            this.mBlurLastVideoFrameTask = new VastVideoBlurLastVideoFrameTask(this.mMediaMetadataRetriever, imageView, getDuration());
            try {
                AsyncTasks.safeExecuteOnExecutor(this.mBlurLastVideoFrameTask, str);
            } catch (Exception e) {
                MoPubLog.d("Failed to blur last video frame", e);
            }
        }
    }

    public void onDestroy() {
        if (this.mBlurLastVideoFrameTask == null || this.mBlurLastVideoFrameTask.getStatus() == AsyncTask.Status.FINISHED) {
            return;
        }
        this.mBlurLastVideoFrameTask.cancel(true);
    }

    @VisibleForTesting
    @Deprecated
    void setMediaMetadataRetriever(MediaMetadataRetriever mediaMetadataRetriever) {
        this.mMediaMetadataRetriever = mediaMetadataRetriever;
    }

    @VisibleForTesting
    @Deprecated
    VastVideoBlurLastVideoFrameTask getBlurLastVideoFrameTask() {
        return this.mBlurLastVideoFrameTask;
    }

    @VisibleForTesting
    @Deprecated
    void setBlurLastVideoFrameTask(VastVideoBlurLastVideoFrameTask vastVideoBlurLastVideoFrameTask) {
        this.mBlurLastVideoFrameTask = vastVideoBlurLastVideoFrameTask;
    }
}
