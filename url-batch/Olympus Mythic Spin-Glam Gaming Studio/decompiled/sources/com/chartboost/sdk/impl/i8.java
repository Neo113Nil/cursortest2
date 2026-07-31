package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i8 {
    public final b8 a;

    public i8(b8 downloadManager) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        this.a = downloadManager;
    }

    public final MediaItem a(hk asset) {
        Download a;
        DownloadRequest downloadRequest;
        Intrinsics.checkNotNullParameter(asset, "asset");
        y6 b = this.a.b(asset.d());
        if (b == null || (a = b.a()) == null || (downloadRequest = a.request) == null) {
            return null;
        }
        return downloadRequest.toMediaItem();
    }
}
