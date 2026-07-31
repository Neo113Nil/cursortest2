package l;

import I.C0143d;
import I.C0156j0;
import I.W;
import j.AbstractC0522D;
import j.C0550x;
import m.g0;
import m.l0;

/* renamed from: l.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586l implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f6501a;

    /* renamed from: b, reason: collision with root package name */
    public U.d f6502b;

    /* renamed from: c, reason: collision with root package name */
    public final C0156j0 f6503c = C0143d.K(new O0.j(0), W.f2783i);

    /* renamed from: d, reason: collision with root package name */
    public final C0550x f6504d;

    public C0586l(l0 l0Var, U.d dVar) {
        this.f6501a = l0Var;
        this.f6502b = dVar;
        long[] jArr = AbstractC0522D.f6254a;
        this.f6504d = new C0550x();
    }

    @Override // m.g0
    public final Object b() {
        return this.f6501a.f().b();
    }

    @Override // m.g0
    public final Object c() {
        return this.f6501a.f().c();
    }
}
