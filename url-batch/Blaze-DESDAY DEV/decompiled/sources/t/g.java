package t;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f3751m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f3745e = 2;
        } else {
            this.f3745e = 3;
        }
    }

    @Override // t.f
    public final void d(int i) {
        if (this.f3748j) {
            return;
        }
        this.f3748j = true;
        this.f3747g = i;
        Iterator it = this.f3749k.iterator();
        while (it.hasNext()) {
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
            interfaceC0301d.a(interfaceC0301d);
        }
    }
}
