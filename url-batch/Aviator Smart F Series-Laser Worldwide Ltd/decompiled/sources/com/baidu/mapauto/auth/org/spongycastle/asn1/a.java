package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public abstract class a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7759b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7760c;

    public a(boolean z7, int i8, byte[] bArr) {
        this.f7758a = z7;
        this.f7759b = i8;
        this.f7760c = com.baidu.mapauto.auth.org.spongycastle.util.a.a(bArr);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof a)) {
            return false;
        }
        a aVar = (a) rVar;
        return this.f7758a == aVar.f7758a && this.f7759b == aVar.f7759b && com.baidu.mapauto.auth.org.spongycastle.util.a.a(this.f7760c, aVar.f7760c);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return u1.a(this.f7760c.length) + u1.b(this.f7759b) + this.f7760c.length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return this.f7758a;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        boolean z7 = this.f7758a;
        return ((z7 ? 1 : 0) ^ this.f7759b) ^ com.baidu.mapauto.auth.org.spongycastle.util.a.b(this.f7760c);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public void a(p pVar) {
        int i8 = this.f7758a ? 96 : 64;
        int i9 = this.f7759b;
        byte[] bArr = this.f7760c;
        pVar.a(i8, i9);
        pVar.b(bArr.length);
        pVar.f7818a.write(bArr);
    }
}
