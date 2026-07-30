package com.baidu.platform.comjni.map.commonmemcache;

import com.baidu.platform.comjni.NativeComponent;

/* loaded from: classes2.dex */
public class NACommonMemCache extends NativeComponent {
    public NACommonMemCache() {
        create();
    }

    private static native long nativeCreate();

    private static native String nativeDecodeUsync(long j8, String str);

    private static native String nativeEnCrypt(long j8, String str);

    private static native String nativeEnCryptWithType(long j8, String str, String str2);

    private static native String nativeEnCryptWithUsync(long j8, String str);

    private static native String nativeGetKeyBundleString(long j8, String str);

    private static native String nativeGetKeyString(long j8, String str);

    private static native String nativeGetPhoneInfoBundle(long j8, boolean z7);

    private static native String nativeGetPhoneInfoUrl(long j8);

    private static native String nativeGetSataInfo(long j8, boolean z7, int i8, int i9);

    private static native void nativeIncCountOfPolicyCodes(long j8, int[] iArr, int i8);

    private static native void nativeInit(long j8, String str);

    private static native int nativeRelease(long j8);

    private static native void nativeSetAuthBlkBid(long j8, boolean z7, String[] strArr);

    private static native void nativeSetKeyBundle(long j8, String str, String str2);

    private static native void nativeSetKeyDouble(long j8, String str, double d8);

    private static native void nativeSetKeyFloat(long j8, String str, float f8);

    private static native void nativeSetKeyInt(long j8, String str, int i8);

    private static native void nativeSetKeyString(long j8, String str, String str2);

    public void a(String str, String str2) {
        nativeSetKeyString(this.mNativePointer, str, str2);
    }

    public void b(String str) {
        nativeInit(this.mNativePointer, str);
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

    public String a(String str) {
        return nativeGetKeyBundleString(this.mNativePointer, str);
    }

    public void b(String str, String str2) {
        nativeSetKeyBundle(this.mNativePointer, str, str2);
    }
}
