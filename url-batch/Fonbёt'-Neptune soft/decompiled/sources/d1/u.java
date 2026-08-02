package d1;

import Y0.AbstractC0107a;
import Y0.AbstractC0127v;

/* loaded from: classes.dex */
public class u extends AbstractC0107a implements J0.c {

    /* renamed from: h, reason: collision with root package name */
    public final H0.d f2105h;

    public u(H0.d dVar, H0.i iVar) {
        super(iVar, true);
        this.f2105h = dVar;
    }

    @Override // Y0.Z
    public final boolean J() {
        return true;
    }

    @Override // J0.c
    public final J0.c e() {
        H0.d dVar = this.f2105h;
        if (dVar instanceof J0.c) {
            return (J0.c) dVar;
        }
        return null;
    }

    @Override // Y0.Z
    public void q(Object obj) {
        AbstractC0184a.h(i1.a.t(this.f2105h), AbstractC0127v.h(obj), null);
    }

    @Override // Y0.Z
    public void r(Object obj) {
        this.f2105h.j(AbstractC0127v.h(obj));
    }
}
