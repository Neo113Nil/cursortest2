package o;

import W2.InterfaceC0302y;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l.AbstractC0779e;
import l.C0772a;
import l.C0788n;
import l.C0789o;
import l.C0796w;
import y2.AbstractC1343r;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896l extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public M2.B f8818k;

    /* renamed from: l, reason: collision with root package name */
    public C0788n f8819l;

    /* renamed from: m, reason: collision with root package name */
    public int f8820m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f8821n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0898m f8822o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0899m0 f8823p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0896l(float f4, C0898m c0898m, C0899m0 c0899m0, C2.a aVar) {
        super(2, aVar);
        this.f8821n = f4;
        this.f8822o = c0898m;
        this.f8823p = c0899m0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0896l) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0896l(this.f8821n, this.f8822o, this.f8823p, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        float f4;
        C0788n c0788n;
        C0788n c0788n2;
        M2.B b4;
        C0796w c0796w;
        C0772a c0772a;
        Object obj2 = D2.a.f2163d;
        int i2 = this.f8820m;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            f4 = this.f8821n;
            if (Math.abs(f4) > 1.0f) {
                M2.B b5 = new M2.B();
                b5.f3577d = f4;
                M2.B b6 = new M2.B();
                l.v0 v0Var = l.w0.f7856a;
                C0788n c0788n3 = new C0788n(v0Var, Float.valueOf(0.0f), new C0789o(f4), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    C0898m c0898m = this.f8822o;
                    c0796w = c0898m.f8828a;
                    c0772a = new C0772a(b6, this.f8823p, b5, c0898m, 1);
                    this.f8818k = b5;
                    this.f8819l = c0788n3;
                    this.f8820m = 1;
                    c0788n = c0788n3;
                } catch (CancellationException unused) {
                    c0788n = c0788n3;
                }
                try {
                    Object b7 = AbstractC0779e.b(c0788n3, new g2.s(c0796w, v0Var, c0788n3.f7813e.getValue(), c0788n3.f7814i), Long.MIN_VALUE, c0772a, this);
                    if (b7 != obj2) {
                        b7 = Unit.f7487a;
                    }
                    if (b7 == obj2) {
                        return obj2;
                    }
                    b4 = b5;
                } catch (CancellationException unused2) {
                    c0788n2 = c0788n;
                    b4 = b5;
                    b4.f3577d = ((Number) c0788n2.f7812d.f7854b.invoke(c0788n2.f7814i)).floatValue();
                    f4 = b4.f3577d;
                    return new Float(f4);
                }
            }
            return new Float(f4);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0788n2 = this.f8819l;
        b4 = this.f8818k;
        try {
            AbstractC1343r.b(obj);
        } catch (CancellationException unused3) {
            b4.f3577d = ((Number) c0788n2.f7812d.f7854b.invoke(c0788n2.f7814i)).floatValue();
            f4 = b4.f3577d;
            return new Float(f4);
        }
        f4 = b4.f3577d;
        return new Float(f4);
    }
}
