package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;

@Deprecated
/* loaded from: classes3.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(String str) {
        this(str, C.TIME_UNSET);
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, long j8) {
        super(str);
        this.presentationTimeUs = j8;
    }

    public static VideoFrameProcessingException from(Exception exc, long j8) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j8);
    }

    public VideoFrameProcessingException(String str, Throwable th) {
        this(str, th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th, long j8) {
        super(str, th);
        this.presentationTimeUs = j8;
    }

    public VideoFrameProcessingException(Throwable th) {
        this(th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th, long j8) {
        super(th);
        this.presentationTimeUs = j8;
    }
}
