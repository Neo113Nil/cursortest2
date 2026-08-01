package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0290g extends C0289f {

    /* renamed from: m, reason: collision with root package name */
    public int f3803m;

    public C0290g(AbstractC0298o abstractC0298o) {
        super(abstractC0298o);
        if (abstractC0298o instanceof C0294k) {
            this.f3797e = 2;
        } else {
            this.f3797e = 3;
        }
    }

    @Override // t.C0289f
    public final void d(int i) {
        if (this.f3800j) {
            return;
        }
        this.f3800j = true;
        this.f3799g = i;
        Iterator it = this.f3801k.iterator();
        while (it.hasNext()) {
            InterfaceC0287d interfaceC0287d = (InterfaceC0287d) it.next();
            interfaceC0287d.a(interfaceC0287d);
        }
    }
}
