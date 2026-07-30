package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class n0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public m f7809a;

    /* renamed from: b, reason: collision with root package name */
    public j f7810b;

    /* renamed from: c, reason: collision with root package name */
    public r f7811c;

    /* renamed from: d, reason: collision with root package name */
    public int f7812d;

    /* renamed from: e, reason: collision with root package name */
    public r f7813e;

    public n0(e eVar) {
        int i8 = 0;
        r a8 = a(0, eVar);
        if (a8 instanceof m) {
            this.f7809a = (m) a8;
            a8 = a(1, eVar);
            i8 = 1;
        }
        if (a8 instanceof j) {
            this.f7810b = (j) a8;
            i8++;
            a8 = a(i8, eVar);
        }
        if (!(a8 instanceof w)) {
            this.f7811c = a8;
            i8++;
            a8 = a(i8, eVar);
        }
        if (eVar.a() != i8 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(a8 instanceof w)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        w wVar = (w) a8;
        a(wVar.j());
        this.f7813e = wVar.i();
    }

    public final void a(int i8) {
        if (i8 >= 0 && i8 <= 2) {
            this.f7812d = i8;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i8);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final int e() {
        return d().length;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean f() {
        return true;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        m mVar = this.f7809a;
        int hashCode = mVar != null ? mVar.f7803a.hashCode() : 0;
        j jVar = this.f7810b;
        if (jVar != null) {
            hashCode ^= jVar.hashCode();
        }
        r rVar = this.f7811c;
        if (rVar != null) {
            hashCode ^= rVar.hashCode();
        }
        return hashCode ^ this.f7813e.hashCode();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        r rVar2;
        j jVar;
        m mVar;
        if (!(rVar instanceof n0)) {
            return false;
        }
        if (this == rVar) {
            return true;
        }
        n0 n0Var = (n0) rVar;
        m mVar2 = this.f7809a;
        if (mVar2 != null && ((mVar = n0Var.f7809a) == null || !mVar.equals(mVar2))) {
            return false;
        }
        j jVar2 = this.f7810b;
        if (jVar2 != null && ((jVar = n0Var.f7810b) == null || !jVar.equals(jVar2))) {
            return false;
        }
        r rVar3 = this.f7811c;
        if (rVar3 == null || ((rVar2 = n0Var.f7811c) != null && rVar2.equals(rVar3))) {
            return this.f7813e.equals(n0Var.f7813e);
        }
        return false;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final void a(p pVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m mVar = this.f7809a;
        if (mVar != null) {
            byteArrayOutputStream.write(mVar.a("DER"));
        }
        j jVar = this.f7810b;
        if (jVar != null) {
            byteArrayOutputStream.write(jVar.a("DER"));
        }
        r rVar = this.f7811c;
        if (rVar != null) {
            byteArrayOutputStream.write(rVar.a("DER"));
        }
        byteArrayOutputStream.write(new e1(true, this.f7812d, this.f7813e).a("DER"));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        pVar.a(32, 8);
        pVar.b(byteArray.length);
        pVar.f7818a.write(byteArray);
    }

    public static r a(int i8, e eVar) {
        if (eVar.f7778a.size() > i8) {
            return eVar.a(i8).c();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }
}
