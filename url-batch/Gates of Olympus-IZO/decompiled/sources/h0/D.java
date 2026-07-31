package h0;

import D1.C0014b;
import d0.InterfaceC0323d;

/* loaded from: classes.dex */
public final class D extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E f4870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(E e3, int i3) {
        super(1);
        this.f4869e = i3;
        this.f4870f = e3;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [Y1.a, Z1.j] */
    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f4869e) {
            case 0:
                E e3 = this.f4870f;
                e3.f4873d = true;
                e3.f4875f.b();
                return L1.z.f2729a;
            default:
                InterfaceC0323d interfaceC0323d = (InterfaceC0323d) obj;
                E e4 = this.f4870f;
                C0422c c0422c = e4.f4871b;
                float f3 = e4.f4880k;
                float f4 = e4.f4881l;
                C0014b P2 = interfaceC0323d.P();
                long m3 = P2.m();
                P2.h().f();
                try {
                    ((A2.g) P2.f536b).s(f3, f4, 0L);
                    c0422c.a(interfaceC0323d);
                    P2.h().a();
                    P2.y(m3);
                    return L1.z.f2729a;
                } catch (Throwable th) {
                    P2.h().a();
                    P2.y(m3);
                    throw th;
                }
        }
    }
}
