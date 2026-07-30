package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j8, long j9, float f8);
    }

    void cancel();

    void download(@Nullable ProgressListener progressListener);

    void remove();
}
