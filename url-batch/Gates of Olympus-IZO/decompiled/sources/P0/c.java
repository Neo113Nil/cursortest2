package P0;

import L1.z;
import m.C0579D;
import m.C0580E;
import m.C0583H;
import m.j0;
import m.z0;

/* loaded from: classes.dex */
public final class c extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3027g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3028h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3029i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        super(0);
        this.f3025e = i3;
        this.f3026f = obj;
        this.f3027g = obj2;
        this.f3028h = obj3;
        this.f3029i = obj4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f3025e) {
            case 0:
                ((q) this.f3026f).h((Y1.a) this.f3027g, (o) this.f3028h, (M0.j) this.f3029i);
                break;
            default:
                C0580E c0580e = (C0580E) this.f3027g;
                Float f3 = c0580e.f5568d;
                Float f4 = (Float) this.f3026f;
                boolean equals = f4.equals(f3);
                Float f5 = (Float) this.f3028h;
                if (!equals || !f5.equals(c0580e.f5569e)) {
                    c0580e.f5568d = f4;
                    c0580e.f5569e = f5;
                    c0580e.f5571g = new j0((C0579D) this.f3029i, z0.f5885a, f4, f5, null);
                    C0583H c0583h = c0580e.f5575k;
                    c0583h.f5583b.setValue(Boolean.TRUE);
                    c0580e.f5572h = false;
                    c0580e.f5573i = true;
                }
                break;
        }
        return z.f2729a;
    }
}
