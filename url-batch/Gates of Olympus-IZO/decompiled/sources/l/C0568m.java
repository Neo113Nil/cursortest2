package l;

import I.C0089d;
import I.C0102j0;
import I.X;
import j.AbstractC0478D;
import j.C0506x;
import m.m0;
import m.s0;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568m implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f5479a;

    /* renamed from: b, reason: collision with root package name */
    public U.d f5480b;

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f5481c = C0089d.J(new M0.i(0), X.f2228i);

    /* renamed from: d, reason: collision with root package name */
    public final C0506x f5482d;

    public C0568m(s0 s0Var, U.d dVar) {
        this.f5479a = s0Var;
        this.f5480b = dVar;
        long[] jArr = AbstractC0478D.f5136a;
        this.f5482d = new C0506x();
    }

    @Override // m.m0
    public final Object b() {
        return this.f5479a.f().b();
    }

    @Override // m.m0
    public final Object c() {
        return this.f5479a.f().c();
    }
}
