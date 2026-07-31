package P1;

import I2.l;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: d, reason: collision with root package name */
    public final h f3066d;

    public a(h hVar) {
        this.f3066d = hVar;
    }

    @Override // P1.g
    public final h getKey() {
        return this.f3066d;
    }

    @Override // P1.i
    public g k(h hVar) {
        return l.A(this, hVar);
    }

    @Override // P1.i
    public final i o(i iVar) {
        return l.M(this, iVar);
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // P1.i
    public i x(h hVar) {
        return l.H(this, hVar);
    }
}
