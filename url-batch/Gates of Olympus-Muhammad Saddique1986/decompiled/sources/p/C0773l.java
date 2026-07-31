package p;

import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import m.AbstractC0620e;
import m.C0616a;
import m.C0628m;
import m.C0629n;
import m.C0636v;
import m.C0637w;
import q2.InterfaceC0835w;

/* renamed from: p.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773l extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public f2.r f7706h;

    /* renamed from: i, reason: collision with root package name */
    public C0628m f7707i;

    /* renamed from: j, reason: collision with root package name */
    public int f7708j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7709k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0775m f7710l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0784q0 f7711m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0773l(float f3, C0775m c0775m, C0784q0 c0784q0, V1.d dVar) {
        super(2, dVar);
        this.f7709k = f3;
        this.f7710l = c0775m;
        this.f7711m = c0784q0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0773l) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0773l(this.f7709k, this.f7710l, this.f7711m, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        float f3;
        C0628m c0628m;
        C0628m c0628m2;
        f2.r rVar;
        C0637w c0637w;
        C0616a c0616a;
        Object obj2 = W1.a.f4608d;
        int i3 = this.f7708j;
        if (i3 == 0) {
            R1.a.e(obj);
            f3 = this.f7709k;
            if (Math.abs(f3) > 1.0f) {
                f2.r rVar2 = new f2.r();
                rVar2.f5829d = f3;
                f2.r rVar3 = new f2.r();
                m.u0 u0Var = m.v0.f6899a;
                C0628m c0628m3 = new C0628m(u0Var, Float.valueOf(0.0f), new C0629n(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    C0775m c0775m = this.f7710l;
                    c0637w = c0775m.f7715a;
                    c0616a = new C0616a(rVar3, this.f7711m, rVar2, c0775m, 1);
                    this.f7706h = rVar2;
                    this.f7707i = c0628m3;
                    this.f7708j = 1;
                    c0628m = c0628m3;
                } catch (CancellationException unused) {
                    c0628m = c0628m3;
                }
                try {
                    Object b3 = AbstractC0620e.b(c0628m3, new C0636v(c0637w, u0Var, c0628m3.f6849e.getValue(), c0628m3.f6850f), Long.MIN_VALUE, c0616a, this);
                    if (b3 != obj2) {
                        b3 = R1.y.f4171a;
                    }
                    if (b3 == obj2) {
                        return obj2;
                    }
                    rVar = rVar2;
                } catch (CancellationException unused2) {
                    c0628m2 = c0628m;
                    rVar = rVar2;
                    rVar.f5829d = ((Number) c0628m2.f6848d.f6890b.n(c0628m2.f6850f)).floatValue();
                    f3 = rVar.f5829d;
                    return new Float(f3);
                }
            }
            return new Float(f3);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0628m2 = this.f7707i;
        rVar = this.f7706h;
        try {
            R1.a.e(obj);
        } catch (CancellationException unused3) {
            rVar.f5829d = ((Number) c0628m2.f6848d.f6890b.n(c0628m2.f6850f)).floatValue();
            f3 = rVar.f5829d;
            return new Float(f3);
        }
        f3 = rVar.f5829d;
        return new Float(f3);
    }
}
