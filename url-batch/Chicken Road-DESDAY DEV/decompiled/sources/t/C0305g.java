package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0305g extends C0304f {

    /* renamed from: m, reason: collision with root package name */
    public int f3726m;

    public C0305g(AbstractC0313o abstractC0313o) {
        super(abstractC0313o);
        if (abstractC0313o instanceof C0309k) {
            this.f3720e = 2;
        } else {
            this.f3720e = 3;
        }
    }

    @Override // t.C0304f
    public final void d(int i) {
        if (this.f3723j) {
            return;
        }
        this.f3723j = true;
        this.f3722g = i;
        Iterator it = this.f3724k.iterator();
        while (it.hasNext()) {
            InterfaceC0302d interfaceC0302d = (InterfaceC0302d) it.next();
            interfaceC0302d.a(interfaceC0302d);
        }
    }
}
