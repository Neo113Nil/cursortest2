package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public final class y0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7856a;

    public y0(byte[] bArr) {
        this.f7856a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(this.f7856a, 19);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f7856a.length) + 1 + this.f7856a.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f7856a);
    }

    public final String toString() {
        return com.baidu.mapauto.auth.org.spongycastle.util.d.a(this.f7856a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof y0) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7856a, ((y0) rVar).f7856a);
        }
        return false;
    }
}
