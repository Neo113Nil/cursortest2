package com.xinyan.algorithm;

import r5.a;

/* loaded from: classes4.dex */
public class MrAlgorithm {

    public interface CallBack {
        void onECGData(int[] iArr);

        void onEvent(int i8, int i9, String str, boolean z7);

        void onHR(int i8);

        void onSummaryInfo(a aVar);
    }

    public interface Log {
    }

    static {
        System.loadLibrary("mralgorithm");
    }

    public native void enableLog(Log log);

    public native String getArrType();

    public native int getHR();

    public native int getRemainCount();

    public native String getToken(String str, String str2);

    public native String init(String str, CallBack callBack);

    public native void pushData(byte[] bArr);

    public native void pushWaveData(int[] iArr);

    public native boolean term();
}
