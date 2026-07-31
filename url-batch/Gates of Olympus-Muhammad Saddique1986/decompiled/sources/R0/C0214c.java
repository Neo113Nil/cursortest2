package R0;

import e2.InterfaceC0422a;
import t2.C1034E;
import t2.InterfaceC1071x;
import x.Q;
import z.C1242f;

/* renamed from: R0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214c extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4068i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0214c(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        super(0);
        this.f4064e = i3;
        this.f4065f = obj;
        this.f4066g = obj2;
        this.f4067h = obj3;
        this.f4068i = obj4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        InterfaceC1071x i3;
        switch (this.f4064e) {
            case 0:
                ((x) this.f4065f).h((InterfaceC0422a) this.f4066g, (v) this.f4067h, (O0.k) this.f4068i);
                return R1.y.f4171a;
            default:
                if (!((Q) this.f4065f).b()) {
                    ((Z.p) this.f4066g).a(Z.i.f4681i);
                }
                int i4 = ((I0.m) this.f4067h).f3075d;
                if (!I0.o.a(i4, 7) && !I0.o.a(i4, 8) && (i3 = ((C1242f) this.f4068i).i()) != null) {
                    ((C1034E) i3).c(R1.y.f4171a);
                }
                return Boolean.TRUE;
        }
    }
}
