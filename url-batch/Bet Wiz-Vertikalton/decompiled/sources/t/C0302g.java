package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0302g extends C0301f {

    /* renamed from: m, reason: collision with root package name */
    public int f3706m;

    public C0302g(AbstractC0310o abstractC0310o) {
        super(abstractC0310o);
        if (abstractC0310o instanceof C0306k) {
            this.f3700e = 2;
        } else {
            this.f3700e = 3;
        }
    }

    @Override // t.C0301f
    public final void d(int i) {
        if (this.f3703j) {
            return;
        }
        this.f3703j = true;
        this.f3702g = i;
        Iterator it = this.f3704k.iterator();
        while (it.hasNext()) {
            InterfaceC0299d interfaceC0299d = (InterfaceC0299d) it.next();
            interfaceC0299d.a(interfaceC0299d);
        }
    }
}
