package h0;

import F.C0047j0;
import d0.InterfaceC0323d;

/* renamed from: h0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0419C {

    /* renamed from: a, reason: collision with root package name */
    public C0047j0 f4868a;

    public abstract void a(InterfaceC0323d interfaceC0323d);

    public Y1.c b() {
        return this.f4868a;
    }

    public final void c() {
        Y1.c b2 = b();
        if (b2 != null) {
            b2.j(this);
        }
    }

    public void d(C0047j0 c0047j0) {
        this.f4868a = c0047j0;
    }
}
