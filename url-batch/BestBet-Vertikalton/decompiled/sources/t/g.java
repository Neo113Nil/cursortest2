package t;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f4098m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f4092e = 2;
        } else {
            this.f4092e = 3;
        }
    }

    @Override // t.f
    public final void d(int i) {
        if (this.f4095j) {
            return;
        }
        this.f4095j = true;
        this.f4094g = i;
        Iterator it = this.f4096k.iterator();
        while (it.hasNext()) {
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
            interfaceC0346d.a(interfaceC0346d);
        }
    }
}
