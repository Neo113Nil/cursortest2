package v;

import java.util.Iterator;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0284g extends C0283f {

    /* renamed from: m, reason: collision with root package name */
    public int f3823m;

    public C0284g(AbstractC0292o abstractC0292o) {
        super(abstractC0292o);
        if (abstractC0292o instanceof C0288k) {
            this.f3817e = 2;
        } else {
            this.f3817e = 3;
        }
    }

    @Override // v.C0283f
    public final void d(int i) {
        if (this.f3820j) {
            return;
        }
        this.f3820j = true;
        this.f3819g = i;
        Iterator it = this.f3821k.iterator();
        while (it.hasNext()) {
            InterfaceC0281d interfaceC0281d = (InterfaceC0281d) it.next();
            interfaceC0281d.a(interfaceC0281d);
        }
    }
}
