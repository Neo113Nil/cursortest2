package h7;

import c7.a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class p extends c7.a implements j6.d {

    /* renamed from: i, reason: collision with root package name */
    public final h6.d f4702i;

    public p(h6.d dVar, h6.i iVar) {
        super(iVar, true);
        this.f4702i = dVar;
    }

    @Override // c7.f1
    public final boolean M() {
        return true;
    }

    @Override // j6.d
    public final j6.d getCallerFrame() {
        h6.d dVar = this.f4702i;
        if (dVar instanceof j6.d) {
            return (j6.d) dVar;
        }
        return null;
    }

    @Override // c7.f1
    public void i(Object obj) {
        a.h(a8.m.A(this.f4702i), a0.q(obj));
    }

    @Override // c7.f1
    public void j(Object obj) {
        this.f4702i.resumeWith(a0.q(obj));
    }
}
