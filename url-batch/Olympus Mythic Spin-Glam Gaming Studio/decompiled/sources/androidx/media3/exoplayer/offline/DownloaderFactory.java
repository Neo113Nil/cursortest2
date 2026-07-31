package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes11.dex */
public interface DownloaderFactory {
    Downloader createDownloader(DownloadRequest downloadRequest);
}
