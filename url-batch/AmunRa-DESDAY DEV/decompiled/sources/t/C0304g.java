package t;

import java.util.Iterator;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0304g extends C0303f {

    /* renamed from: m, reason: collision with root package name */
    public int f3851m;

    public C0304g(AbstractC0312o abstractC0312o) {
        super(abstractC0312o);
        if (abstractC0312o instanceof C0308k) {
            this.f3845e = 2;
        } else {
            this.f3845e = 3;
        }
    }

    @Override // t.C0303f
    public final void d(int i) {
        if (this.f3848j) {
            return;
        }
        this.f3848j = true;
        this.f3847g = i;
        Iterator it = this.f3849k.iterator();
        while (it.hasNext()) {
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
            interfaceC0301d.a(interfaceC0301d);
        }
    }
}
