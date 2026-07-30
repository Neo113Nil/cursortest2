package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public final class f extends r {

    /* renamed from: b, reason: collision with root package name */
    public static f[] f7780b = new f[12];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7781a;

    public f(byte[] bArr) {
        if (!com.baidu.mapauto.auth.org.spongycastle.util.c.a() && j.b(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        this.f7781a = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(this.f7781a, 10);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f7781a.length) + 1 + this.f7781a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f7781a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof f) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7781a, ((f) rVar).f7781a);
        }
        return false;
    }
}
