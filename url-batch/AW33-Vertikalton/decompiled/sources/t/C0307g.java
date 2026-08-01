package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0307g extends C0306f {

    /* renamed from: m, reason: collision with root package name */
    public int f3778m;

    public C0307g(AbstractC0315o abstractC0315o) {
        super(abstractC0315o);
        if (abstractC0315o instanceof C0311k) {
            this.f3772e = 2;
        } else {
            this.f3772e = 3;
        }
    }

    @Override // t.C0306f
    public final void d(int i) {
        if (this.f3775j) {
            return;
        }
        this.f3775j = true;
        this.f3774g = i;
        Iterator it = this.f3776k.iterator();
        while (it.hasNext()) {
            InterfaceC0304d interfaceC0304d = (InterfaceC0304d) it.next();
            interfaceC0304d.a(interfaceC0304d);
        }
    }
}
