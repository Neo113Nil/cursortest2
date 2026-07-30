package com.baidu.platform.comjni.base.sdkauth;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: classes2.dex */
public class NASDKAuth extends NativeComponent {
    public NASDKAuth() {
        create();
    }

    private static native long nativeCreate();

    private static native int nativeRelease(long j8);

    public static native boolean nativeSetAuth(long j8, String str, int i8);

    public boolean a(String str, int i8) {
        return nativeSetAuth(this.mNativePointer, str, i8);
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
        this.mNativePointer = nativeCreate();
        return this.mNativePointer;
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
        if (this.mNativePointer == 0) {
            return 0;
        }
        this.mNativePointer = 0L;
        return 0;
    }
}
