package t;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f3783m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f3777e = 2;
        } else {
            this.f3777e = 3;
        }
    }

    @Override // t.f
    public final void d(int i) {
        if (this.f3780j) {
            return;
        }
        this.f3780j = true;
        this.f3779g = i;
        Iterator it = this.f3781k.iterator();
        while (it.hasNext()) {
            InterfaceC0300d interfaceC0300d = (InterfaceC0300d) it.next();
            interfaceC0300d.a(interfaceC0300d);
        }
    }
}
