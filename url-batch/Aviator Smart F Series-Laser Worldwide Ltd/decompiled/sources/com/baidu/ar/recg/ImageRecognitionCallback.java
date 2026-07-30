package com.baidu.ar.recg;

/* loaded from: classes.dex */
public interface ImageRecognitionCallback {
    void onFeatureDBInit(boolean z7);

    void onFeatureDownloadStart();

    void onRecognizeResult(boolean z7, String str, String str2);

    void onResourceDownload(boolean z7);

    void onResourceRequest(boolean z7, int i8, String str);

    void onSoLoadDownloadStart();

    void onSoLoadState(boolean z7);
}
