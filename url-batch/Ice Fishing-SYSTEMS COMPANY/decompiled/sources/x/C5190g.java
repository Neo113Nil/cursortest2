package x;

import java.util.Iterator;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5190g extends C5189f {

    /* renamed from: m, reason: collision with root package name */
    public int f41744m;

    public C5190g(AbstractC5199p abstractC5199p) {
        super(abstractC5199p);
        if (abstractC5199p instanceof C5194k) {
            this.f41737e = 2;
        } else {
            this.f41737e = 3;
        }
    }

    @Override // x.C5189f
    public final void d(int i) {
        if (this.f41741j) {
            return;
        }
        this.f41741j = true;
        this.f41739g = i;
        Iterator it = this.f41742k.iterator();
        while (it.hasNext()) {
            InterfaceC5187d interfaceC5187d = (InterfaceC5187d) it.next();
            interfaceC5187d.a(interfaceC5187d);
        }
    }
}
