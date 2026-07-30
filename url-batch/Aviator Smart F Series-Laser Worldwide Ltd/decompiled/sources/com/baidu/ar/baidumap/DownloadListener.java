package com.baidu.ar.baidumap;

/* loaded from: classes.dex */
public interface DownloadListener {
    void onDownloadComplete(boolean z7);

    void onDownloadError(int i8, String str);

    void onDownloadProcess(int i8);

    void onDownloadStart(boolean z7);
}
