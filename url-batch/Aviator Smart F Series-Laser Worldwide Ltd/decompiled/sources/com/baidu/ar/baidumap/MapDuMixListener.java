package com.baidu.ar.baidumap;

/* loaded from: classes.dex */
public interface MapDuMixListener {
    void onCaseLoadEnd(String str);

    void onCaseLoadStart(String str);

    void onResDownloadFinish(boolean z7, int i8, String str);

    void onResDownloadStart(String str);

    void onSoDownloadFinish(boolean z7, int i8, String str);

    void onSoDownloadStart(String str);
}
