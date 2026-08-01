package u;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f3931m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f3924e = 2;
        } else {
            this.f3924e = 3;
        }
    }

    @Override // u.f
    public final void d(int i) {
        if (this.f3928j) {
            return;
        }
        this.f3928j = true;
        this.f3926g = i;
        Iterator it = this.f3929k.iterator();
        while (it.hasNext()) {
            InterfaceC0303d interfaceC0303d = (InterfaceC0303d) it.next();
            interfaceC0303d.a(interfaceC0303d);
        }
    }
}
