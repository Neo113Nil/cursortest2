package com.baidu.xclient.gdid.jni;

import com.baidu.xclient.gdid.k.f;

/* loaded from: classes2.dex */
public class Native {

    /* renamed from: a, reason: collision with root package name */
    public static String f10755a = "";

    static {
        try {
            System.loadLibrary("tiny_magic");
        } catch (Throwable th) {
            f10755a = f.b(th).replaceAll("\t", ";").replaceAll("\n", ";");
            throw th;
        }
    }

    public String a() {
        return f10755a;
    }

    public native byte[] ac(byte[] bArr, byte[] bArr2);

    public native byte[] acn(byte[] bArr, byte[] bArr2);

    public native byte[] dc(byte[] bArr, byte[] bArr2);

    public native byte[] dcn(byte[] bArr, byte[] bArr2);

    public native Object jnictl(int i8, Object obj, Object obj2, Object obj3);
}
