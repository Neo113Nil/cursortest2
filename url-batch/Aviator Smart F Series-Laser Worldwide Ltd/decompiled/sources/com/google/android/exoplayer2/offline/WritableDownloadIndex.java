package com.google.android.exoplayer2.offline;

import androidx.annotation.WorkerThread;

@WorkerThread
@Deprecated
/* loaded from: classes3.dex */
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download);

    void removeDownload(String str);

    void setDownloadingStatesToQueued();

    void setStatesToRemoving();

    void setStopReason(int i8);

    void setStopReason(String str, int i8);
}
