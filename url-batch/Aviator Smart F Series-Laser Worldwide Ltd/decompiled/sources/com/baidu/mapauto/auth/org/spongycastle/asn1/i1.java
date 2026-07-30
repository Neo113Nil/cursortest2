package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public final class i1 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7795a;

    public i1(byte[] bArr) {
        this.f7795a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(this.f7795a, 26);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f7795a.length) + 1 + this.f7795a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f7795a);
    }

    public final String toString() {
        return com.baidu.mapauto.auth.org.spongycastle.util.d.a(this.f7795a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof i1) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7795a, ((i1) rVar).f7795a);
        }
        return false;
    }
}
