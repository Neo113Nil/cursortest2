package v;

import java.util.Iterator;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0398g extends C0397f {

    /* renamed from: m, reason: collision with root package name */
    public int f4424m;

    public C0398g(AbstractC0406o abstractC0406o) {
        super(abstractC0406o);
        if (abstractC0406o instanceof C0402k) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // v.C0397f
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f4420g = i;
        Iterator it = this.f4422k.iterator();
        while (it.hasNext()) {
            InterfaceC0395d interfaceC0395d = (InterfaceC0395d) it.next();
            interfaceC0395d.a(interfaceC0395d);
        }
    }
}
