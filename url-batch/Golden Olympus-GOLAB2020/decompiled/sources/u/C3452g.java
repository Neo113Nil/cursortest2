package u;

import u.C3451f;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3452g extends C3451f {

    /* renamed from: m, reason: collision with root package name */
    public int f46344m;

    public C3452g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f46327e = C3451f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f46327e = C3451f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // u.C3451f
    public void d(int i4) {
        if (this.f46332j) {
            return;
        }
        this.f46332j = true;
        this.f46329g = i4;
        for (InterfaceC3449d interfaceC3449d : this.f46333k) {
            interfaceC3449d.a(interfaceC3449d);
        }
    }
}
