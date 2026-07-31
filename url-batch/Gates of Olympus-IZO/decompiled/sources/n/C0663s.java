package n;

import D1.C0014b;
import a0.AbstractC0158a;
import b0.C0265P;
import d0.C0321b;
import d0.C0326g;
import d0.InterfaceC0323d;
import f.AbstractC0382a;

/* renamed from: n.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663s extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0265P f6150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f6152h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f6153i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f6154j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f6155k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0326g f6156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0663s(boolean z3, C0265P c0265p, long j3, float f3, float f4, long j4, long j5, C0326g c0326g) {
        super(1);
        this.f6149e = z3;
        this.f6150f = c0265p;
        this.f6151g = j3;
        this.f6152h = f3;
        this.f6153i = f4;
        this.f6154j = j4;
        this.f6155k = j5;
        this.f6156l = c0326g;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        t0.F f3 = (t0.F) obj;
        f3.b();
        if (this.f6149e) {
            InterfaceC0323d.J(f3, this.f6150f, 0L, 0L, this.f6151g, null, 246);
        } else {
            long j3 = this.f6151g;
            float b2 = AbstractC0158a.b(j3);
            float f4 = this.f6152h;
            if (b2 < f4) {
                float f5 = this.f6153i;
                C0321b c0321b = f3.f7748d;
                float d3 = a0.f.d(c0321b.c());
                float f6 = this.f6153i;
                float f7 = d3 - f6;
                float b3 = a0.f.b(c0321b.c()) - f6;
                C0265P c0265p = this.f6150f;
                long j4 = this.f6151g;
                C0014b c0014b = c0321b.f4444e;
                long m3 = c0014b.m();
                c0014b.h().f();
                try {
                    ((C0014b) ((A2.g) c0014b.f536b).f83b).h().q(f5, f5, f7, b3, 0);
                    InterfaceC0323d.J(f3, c0265p, 0L, 0L, j4, null, 246);
                } finally {
                    c0014b.h().a();
                    c0014b.y(m3);
                }
            } else {
                InterfaceC0323d.J(f3, this.f6150f, this.f6154j, this.f6155k, AbstractC0382a.y(j3, f4), this.f6156l, 208);
            }
        }
        return L1.z.f2729a;
    }
}
