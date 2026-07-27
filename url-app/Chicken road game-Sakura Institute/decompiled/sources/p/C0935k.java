package p;

import Z2.G;
import Z2.H;
import Z2.InterfaceC0330f;
import kotlin.Unit;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935k implements InterfaceC0934j {

    /* renamed from: a, reason: collision with root package name */
    public final G f8972a = H.b(0, 16, Y2.a.f4399e, 1);

    @Override // p.InterfaceC0934j
    public final InterfaceC0330f a() {
        return this.f8972a;
    }

    public final Object b(InterfaceC0933i interfaceC0933i, E2.c cVar) {
        Object d4 = this.f8972a.d(interfaceC0933i, cVar);
        return d4 == D2.a.f2163d ? d4 : Unit.f7487a;
    }

    public final void c(InterfaceC0933i interfaceC0933i) {
        this.f8972a.b(interfaceC0933i);
    }
}
