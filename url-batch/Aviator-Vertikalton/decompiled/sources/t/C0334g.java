package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0334g extends C0333f {

    /* renamed from: m, reason: collision with root package name */
    public int f4178m;

    public C0334g(AbstractC0342o abstractC0342o) {
        super(abstractC0342o);
        if (abstractC0342o instanceof C0338k) {
            this.f4172e = 2;
        } else {
            this.f4172e = 3;
        }
    }

    @Override // t.C0333f
    public final void d(int i) {
        if (this.f4175j) {
            return;
        }
        this.f4175j = true;
        this.f4174g = i;
        Iterator it = this.f4176k.iterator();
        while (it.hasNext()) {
            InterfaceC0331d interfaceC0331d = (InterfaceC0331d) it.next();
            interfaceC0331d.a(interfaceC0331d);
        }
    }
}
