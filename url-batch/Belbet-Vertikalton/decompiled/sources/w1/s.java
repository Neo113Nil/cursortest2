package w1;

import c1.InterfaceC0107d;
import r1.AbstractC0351a;
import r1.AbstractC0369t;

/* loaded from: classes.dex */
public class s extends AbstractC0351a implements InterfaceC0107d {

    /* renamed from: d, reason: collision with root package name */
    public final a1.d f4498d;

    public s(a1.d dVar, a1.i iVar) {
        super(iVar, true);
        this.f4498d = dVar;
    }

    @Override // r1.V
    public void e(Object obj) {
        a.i(H1.l.C(this.f4498d), AbstractC0369t.i(obj), null);
    }

    @Override // r1.V
    public void f(Object obj) {
        this.f4498d.resumeWith(AbstractC0369t.i(obj));
    }

    @Override // c1.InterfaceC0107d
    public final InterfaceC0107d getCallerFrame() {
        a1.d dVar = this.f4498d;
        if (dVar instanceof InterfaceC0107d) {
            return (InterfaceC0107d) dVar;
        }
        return null;
    }

    @Override // r1.V
    public final boolean w() {
        return true;
    }
}
