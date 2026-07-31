package m;

import I.C0089d;
import I.C0102j0;

/* renamed from: m.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585J extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public final C0102j0 f5589b;

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f5590c;

    public C0585J(l.x xVar) {
        super(0);
        I.X x3 = I.X.f2228i;
        this.f5589b = C0089d.J(xVar, x3);
        this.f5590c = C0089d.J(xVar, x3);
    }

    @Override // m.w0
    public final Object a() {
        return this.f5589b.getValue();
    }

    @Override // m.w0
    public final Object b() {
        return this.f5590c.getValue();
    }

    @Override // m.w0
    public final void c(Object obj) {
        this.f5589b.setValue(obj);
    }

    @Override // m.w0
    public final void e() {
    }

    @Override // m.w0
    public final void d(s0 s0Var) {
    }
}
