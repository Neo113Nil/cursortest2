package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7787a;

    public h(byte[] bArr) {
        this.f7787a = bArr;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        pVar.a(this.f7787a, 24);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        int length = this.f7787a.length;
        return u1.a(length) + 1 + length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        return com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f7787a);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (rVar instanceof h) {
            return com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7787a, ((h) rVar).f7787a);
        }
        return false;
    }
}
