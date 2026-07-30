package com.baidu.mapauto.auth.org.spongycastle.asn1;

/* loaded from: classes2.dex */
public abstract class w extends r implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7847a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7848b;

    /* renamed from: c, reason: collision with root package name */
    public d f7849c;

    public w(boolean z7, int i8, d dVar) {
        this.f7849c = null;
        this.f7848b = z7;
        this.f7847a = i8;
        if (!z7) {
            boolean z8 = dVar.c() instanceof u;
        }
        this.f7849c = dVar;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.p1
    public final r a() {
        return this;
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r g() {
        return new e1(this.f7848b, this.f7847a, this.f7849c);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final r h() {
        return new n1(this.f7848b, this.f7847a, this.f7849c);
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r, com.baidu.mapauto.auth.org.spongycastle.asn1.l
    public final int hashCode() {
        int i8 = this.f7847a;
        d dVar = this.f7849c;
        return dVar != null ? i8 ^ dVar.hashCode() : i8;
    }

    public final r i() {
        d dVar = this.f7849c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public final int j() {
        return this.f7847a;
    }

    public final String toString() {
        StringBuilder a8 = com.baidu.mapauto.auth.b.a("[");
        a8.append(this.f7847a);
        a8.append("]");
        a8.append(this.f7849c);
        return a8.toString();
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.r
    public final boolean a(r rVar) {
        if (!(rVar instanceof w)) {
            return false;
        }
        w wVar = (w) rVar;
        if (this.f7847a != wVar.f7847a || this.f7848b != wVar.f7848b) {
            return false;
        }
        d dVar = this.f7849c;
        return dVar == null ? wVar.f7849c == null : dVar.c().equals(wVar.f7849c.c());
    }
}
