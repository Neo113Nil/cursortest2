package com.baidu.platform.comjni.map.msgcenter;

import com.baidu.platform.comjni.JNIBaseApi;

/* loaded from: classes2.dex */
public class NAMsgCenter extends JNIBaseApi {

    /* renamed from: a, reason: collision with root package name */
    private long f10615a = 0;

    private native boolean nativeCancelRequest(long j8);

    private native long nativeCreate();

    private native boolean nativeFetchAccessToken(long j8);

    private native String nativeGetCenterParam(long j8, String str);

    private native boolean nativeMSGCStartup(long j8);

    private native boolean nativeRegMsgCenter(long j8, String str);

    private native int nativeRelease(long j8);

    private native boolean nativeSetCenterParam(long j8, String str);
}
