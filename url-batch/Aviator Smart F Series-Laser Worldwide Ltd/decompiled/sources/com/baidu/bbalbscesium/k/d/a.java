package com.baidu.bbalbscesium.k.d;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private c f4128a;

    private a() {
    }

    public static a a() {
        a aVar = new a();
        c cVar = new c();
        aVar.f4128a = cVar;
        cVar.b(c.f4136p);
        return aVar;
    }

    public void a(int i8, d dVar) {
        this.f4128a.a(i8, dVar, b.f4129a);
    }

    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            return this.f4128a.a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
