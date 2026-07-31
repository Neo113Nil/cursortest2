package F;

import I.C0156j0;
import I.InterfaceC0142c0;
import e2.InterfaceC0424c;
import m.C0610F;
import t1.C1013A;
import t1.C1028h;

/* renamed from: F.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129x0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1878e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1881h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1882i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1883j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129x0(f2.q qVar, f2.q qVar2, C1013A c1013a, boolean z3, S1.j jVar) {
        super(1);
        this.f1880g = qVar;
        this.f1881h = qVar2;
        this.f1882i = c1013a;
        this.f1879f = z3;
        this.f1883j = jVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f1878e) {
            case 0:
                b0.O o3 = (b0.O) obj;
                C0610F c0610f = (C0610F) this.f1880g;
                float f3 = 0.8f;
                m.i0 i0Var = (m.i0) this.f1882i;
                float f4 = 1.0f;
                C0156j0 c0156j0 = c0610f.f6607c;
                boolean z3 = this.f1879f;
                o3.f(!z3 ? ((Number) i0Var.f6815m.getValue()).floatValue() : ((Boolean) c0156j0.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z3) {
                    f3 = ((Number) i0Var.f6815m.getValue()).floatValue();
                } else if (((Boolean) c0156j0.getValue()).booleanValue()) {
                    f3 = 1.0f;
                }
                o3.g(f3);
                if (!z3) {
                    f4 = ((Number) ((m.i0) this.f1883j).f6815m.getValue()).floatValue();
                } else if (!((Boolean) c0156j0.getValue()).booleanValue()) {
                    f4 = 0.0f;
                }
                o3.b(f4);
                o3.m(((b0.U) ((InterfaceC0142c0) this.f1881h).getValue()).f5402a);
                break;
            default:
                C1028h c1028h = (C1028h) obj;
                f2.j.f(c1028h, "entry");
                ((f2.q) this.f1880g).f5828d = true;
                ((f2.q) this.f1881h).f5828d = true;
                ((C1013A) this.f1882i).l(c1028h, this.f1879f, (S1.j) this.f1883j);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129x0(boolean z3, C0610F c0610f, InterfaceC0142c0 interfaceC0142c0, m.i0 i0Var, m.i0 i0Var2) {
        super(1);
        this.f1879f = z3;
        this.f1880g = c0610f;
        this.f1881h = interfaceC0142c0;
        this.f1882i = i0Var;
        this.f1883j = i0Var2;
    }
}
