package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

@WorkerThread
@Deprecated
/* loaded from: classes3.dex */
public interface DownloadIndex {
    @Nullable
    Download getDownload(String str);

    DownloadCursor getDownloads(int... iArr);
}
