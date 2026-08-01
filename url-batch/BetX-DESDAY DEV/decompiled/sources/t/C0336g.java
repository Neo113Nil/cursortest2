package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0336g extends C0335f {

    /* renamed from: m, reason: collision with root package name */
    public int f4182m;

    public C0336g(AbstractC0344o abstractC0344o) {
        super(abstractC0344o);
        if (abstractC0344o instanceof C0340k) {
            this.f4176e = 2;
        } else {
            this.f4176e = 3;
        }
    }

    @Override // t.C0335f
    public final void d(int i) {
        if (this.f4179j) {
            return;
        }
        this.f4179j = true;
        this.f4178g = i;
        Iterator it = this.f4180k.iterator();
        while (it.hasNext()) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
            interfaceC0333d.a(interfaceC0333d);
        }
    }
}
