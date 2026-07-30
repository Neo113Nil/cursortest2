package com.baidu.bbalbscesium.k.a;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    final b f4108a;

    /* renamed from: b, reason: collision with root package name */
    final int f4109b;

    /* renamed from: c, reason: collision with root package name */
    byte[] f4110c;

    f(b bVar) {
        this.f4108a = bVar;
        this.f4109b = bVar.a();
    }

    final b a() {
        return this.f4108a;
    }

    abstract void a(boolean z7, String str, byte[] bArr, byte[] bArr2);

    abstract void a(byte[] bArr, int i8, int i9, byte[] bArr2, int i10);

    abstract void b();

    void b(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        a(bArr, i8, i9, bArr2, i10);
    }

    abstract void c();

    abstract void c(byte[] bArr, int i8, int i9, byte[] bArr2, int i10);

    abstract void d();

    void d(byte[] bArr, int i8, int i9, byte[] bArr2, int i10) {
        c(bArr, i8, i9, bArr2, i10);
    }
}
