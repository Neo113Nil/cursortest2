package h0;

import d0.InterfaceC0403d;
import e2.InterfaceC0424c;

/* renamed from: h0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0450C {

    /* renamed from: a, reason: collision with root package name */
    public A0.l f5856a;

    public abstract void a(InterfaceC0403d interfaceC0403d);

    public InterfaceC0424c b() {
        return this.f5856a;
    }

    public final void c() {
        InterfaceC0424c b3 = b();
        if (b3 != null) {
            b3.n(this);
        }
    }

    public void d(A0.l lVar) {
        this.f5856a = lVar;
    }
}
