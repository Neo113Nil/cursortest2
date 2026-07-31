package B;

import b0.C0338g;
import b0.C0344m;
import d0.C0401b;
import d0.InterfaceC0403d;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;

/* renamed from: B.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0338g f406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0344m f407h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007h(InterfaceC0422a interfaceC0422a, boolean z3, C0338g c0338g, C0344m c0344m) {
        super(1);
        this.f404e = interfaceC0422a;
        this.f405f = z3;
        this.f406g = c0338g;
        this.f407h = c0344m;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        t0.G g3 = (t0.G) obj;
        g3.b();
        if (((Boolean) this.f404e.b()).booleanValue()) {
            boolean z3 = this.f405f;
            C0344m c0344m = this.f407h;
            C0338g c0338g = this.f406g;
            if (z3) {
                C0401b c0401b = g3.f8573d;
                long y3 = c0401b.y();
                G1.m mVar = c0401b.f5649e;
                long n3 = mVar.n();
                mVar.h().f();
                try {
                    ((Y) mVar.f2116b).o(-1.0f, 1.0f, y3);
                    InterfaceC0403d.x(g3, c0338g, c0344m);
                } finally {
                    A.k.q(mVar, n3);
                }
            } else {
                InterfaceC0403d.x(g3, c0338g, c0344m);
            }
        }
        return R1.y.f4171a;
    }
}
