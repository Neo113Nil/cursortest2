package com.baidu.ar.baidumap;

/* loaded from: classes.dex */
public interface CaseDownloadListener {
    void onDownloadFinish(boolean z7, String str, String str2, int i8, String str3);

    void onDownloadProgress(int i8, String str);

    void onRefused();
}
