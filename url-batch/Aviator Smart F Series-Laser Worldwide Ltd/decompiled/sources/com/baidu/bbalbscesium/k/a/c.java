package com.baidu.bbalbscesium.k.a;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final SecureRandom f4086b = new SecureRandom();

    /* renamed from: a, reason: collision with root package name */
    private e f4087a;

    public c() {
        this.f4087a = null;
        this.f4087a = new e(new b(), 16);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        c cVar = new c();
        cVar.a(1, bArr, bArr2);
        return cVar.a(bArr3);
    }

    public void a(int i8, byte[] bArr, byte[] bArr2) {
        this.f4087a.a(i8, bArr, bArr2, f4086b);
    }

    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            return this.f4087a.a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        c cVar = new c();
        cVar.a(2, bArr, bArr2);
        return cVar.a(bArr3);
    }
}
