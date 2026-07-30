package com.baidu.platform.comjni.bikenavi;

/* loaded from: classes2.dex */
public class JNIEngineManager {
    public native int getSubSysHandle(long j8, int i8, long[] jArr);

    public native int initBaseAr(long j8, long j9);

    public native int initBaseManager(Object obj, long j8, long[] jArr);

    public native void registTTS(long j8);

    public native void unInitBaseAr(long j8);

    public native void uninitBaseManager(long j8);
}
