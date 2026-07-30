package com.baidu.platform.comjni.base.logstatistics;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: classes2.dex */
public class NALogStatistics extends NativeComponent {
    public NALogStatistics() {
        create();
    }

    public static native boolean nativeAddLog(long j8, int i8, int i9, String str, String str2, String str3);

    public static native long nativeCreate();

    public static native boolean nativeRegisterCallback(long j8);

    public static native int nativeRelease(long j8);

    public static native boolean nativeSave(long j8);

    public boolean a(int i8, int i9, String str, String str2, String str3) {
        return nativeAddLog(this.mNativePointer, i8, i9, str, str2, str3);
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
        int nativeRelease = nativeRelease(this.mNativePointer);
        this.mNativePointer = 0L;
        return nativeRelease;
    }

    public boolean a() {
        return nativeSave(this.mNativePointer);
    }
}
