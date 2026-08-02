package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class kgx extends kaq {
    public final kaq b;

    public kgx(kaq kaqVar) {
        this.b = kaqVar;
    }

    @Override // defpackage.kaq
    public final String a() {
        return this.b.a();
    }

    @Override // defpackage.kaq
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.kaq
    public void c() {
        throw null;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", this.b);
        return T.toString();
    }
}
