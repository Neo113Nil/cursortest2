package com.cmplay.kinfoc.report;

/* loaded from: classes.dex */
public class KInfocReportClient {
    protected long mNativeClient;

    private native void nativeClientAddInfo(long j, String str);

    private native void nativeClientAddString(long j, String str, String str2);

    private native void nativeClientSetTable(long j, String str);

    public KInfocReportClient(long j) {
        this.mNativeClient = j;
    }

    public void SetTable(String str) {
        nativeClientSetTable(this.mNativeClient, str);
    }

    public void AddString(String str, String str2) {
        nativeClientAddString(this.mNativeClient, str, str2);
    }

    public void AddInfo(String str) {
        nativeClientAddInfo(this.mNativeClient, str);
    }
}
