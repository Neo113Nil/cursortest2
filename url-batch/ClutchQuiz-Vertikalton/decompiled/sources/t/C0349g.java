package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0349g extends C0348f {

    /* renamed from: m, reason: collision with root package name */
    public int f3699m;

    public C0349g(AbstractC0358p abstractC0358p) {
        super(abstractC0358p);
        if (abstractC0358p instanceof C0353k) {
            this.f3693e = 2;
        } else {
            this.f3693e = 3;
        }
    }

    @Override // t.C0348f
    public final void d(int i) {
        if (this.f3696j) {
            return;
        }
        this.f3696j = true;
        this.f3695g = i;
        Iterator it = this.f3697k.iterator();
        while (it.hasNext()) {
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
            interfaceC0346d.a(interfaceC0346d);
        }
    }
}
