package com.baidu.platform.comjni.map.searchengine;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: classes2.dex */
public class NASearchEngine extends NativeComponent {
    public NASearchEngine() {
        create();
    }

    private static native boolean nativeCancelRequest(long j8, int i8);

    private static native long nativeCreate();

    private static native String nativeGetJsonResult(long j8, int i8);

    private static native String nativeGetLogId(long j8, int i8);

    private static native byte[] nativeGetProtobufResult(long j8, int i8);

    private static native boolean nativeInit(long j8, int i8);

    private static native boolean nativeInitWithBundle(long j8, String str);

    private static native int nativeRelease(long j8);

    private static native int nativeRequest(long j8, String str);

    private static native boolean nativeRequestData(long j8, byte[] bArr);

    private static native void nativeUpdateOfflineSearchPath(long j8, String str);

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
        this.mNativePointer = nativeCreate();
        return this.mNativePointer;
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
        if (this.mNativePointer != 0) {
            return nativeRelease(this.mNativePointer);
        }
        return 0;
    }
}
