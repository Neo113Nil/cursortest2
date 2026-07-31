package m;

import I.C0143d;
import I.C0156j0;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610F extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final C0156j0 f6606b;

    /* renamed from: c, reason: collision with root package name */
    public final C0156j0 f6607c;

    public C0610F(Object obj) {
        super(0);
        I.W w2 = I.W.f2783i;
        this.f6606b = C0143d.K(obj, w2);
        this.f6607c = C0143d.K(obj, w2);
    }

    @Override // m.s0
    public final Object a() {
        return this.f6606b.getValue();
    }

    @Override // m.s0
    public final Object b() {
        return this.f6607c.getValue();
    }

    @Override // m.s0
    public final void c(Object obj) {
        this.f6606b.setValue(obj);
    }

    @Override // m.s0
    public final void e() {
    }

    @Override // m.s0
    public final void d(l0 l0Var) {
    }
}
