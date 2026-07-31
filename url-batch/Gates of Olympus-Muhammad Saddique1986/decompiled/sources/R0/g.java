package R0;

import C0.J;
import a0.C0239d;
import a0.C0241f;
import android.graphics.Paint;
import android.os.Bundle;
import b0.AbstractC0347p;
import b0.C0339h;
import b0.C0344m;
import b0.M;
import d0.C0401b;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC0993f;
import t0.G;
import t1.C1013A;
import t1.C1028h;
import u0.AbstractC1101g0;
import u0.O0;
import x.C1204q;
import x.Q;
import x.b0;
import x.p0;
import z.C1242f;
import z.C1249m;
import z.C1258v;

/* loaded from: classes.dex */
public final class g extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4085g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4086h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4087i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4088j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        super(1);
        this.f4083e = i3;
        this.f4084f = obj;
        this.f4085g = obj2;
        this.f4086h = obj3;
        this.f4087i = obj4;
        this.f4088j = obj5;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        List list;
        R1.y yVar = R1.y.f4171a;
        Object obj2 = this.f4088j;
        Object obj3 = this.f4087i;
        Object obj4 = this.f4086h;
        Object obj5 = this.f4084f;
        Object obj6 = this.f4085g;
        switch (this.f4083e) {
            case 0:
                A a3 = (A) obj5;
                a3.f4045q.addView(a3, a3.f4046r);
                a3.i((InterfaceC0422a) obj6, (E) obj4, (String) obj3, (O0.k) obj2);
                break;
            case 1:
                C1028h c1028h = (C1028h) obj;
                f2.j.f(c1028h, "entry");
                ((f2.q) obj5).f5828d = true;
                ArrayList arrayList = (ArrayList) obj6;
                int indexOf = arrayList.indexOf(c1028h);
                if (indexOf != -1) {
                    f2.s sVar = (f2.s) obj4;
                    int i3 = indexOf + 1;
                    list = arrayList.subList(sVar.f5830d, i3);
                    sVar.f5830d = i3;
                } else {
                    list = S1.u.f4320d;
                }
                ((C1013A) obj3).a(c1028h.f8874e, (Bundle) obj2, c1028h, list);
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                G g3 = (G) obj;
                g3.b();
                float g4 = ((C1249m) obj5).f10459b.g();
                if (g4 != 0.0f) {
                    int i4 = J.f568c;
                    int b3 = ((I0.t) obj6).b((int) (((I0.z) obj4).f3098b >> 32));
                    p0 d3 = ((Q) obj3).d();
                    C0239d c2 = d3 != null ? d3.f10230a.c(b3) : new C0239d(0.0f, 0.0f, 0.0f, 0.0f);
                    float J3 = g3.J(b0.f10057a);
                    float f3 = J3 / 2;
                    float f4 = c2.f4724a + f3;
                    C0401b c0401b = g3.f8573d;
                    float u3 = O2.d.u(O2.d.v(f4, C0241f.d(c0401b.d()) - f3), f3);
                    long e3 = l0.c.e(u3, c2.f4725b);
                    long e4 = l0.c.e(u3, c2.f4727d);
                    b0.r rVar = c0401b.f5648d.f5646c;
                    C0339h c0339h = c0401b.f5651g;
                    if (c0339h == null) {
                        c0339h = M.g();
                        c0339h.i(1);
                        c0401b.f5651g = c0339h;
                    }
                    AbstractC0347p abstractC0347p = (AbstractC0347p) obj2;
                    if (abstractC0347p != null) {
                        abstractC0347p.a(g4, c0401b.d(), c0339h);
                    } else if (((Paint) c0339h.f5415b).getAlpha() / 255.0f != g4) {
                        c0339h.c(g4);
                    }
                    if (!f2.j.a((C0344m) c0339h.f5417d, null)) {
                        c0339h.f(null);
                    }
                    if (!M.p(c0339h.f5414a, 3)) {
                        c0339h.d(3);
                    }
                    Paint paint = (Paint) c0339h.f5415b;
                    if (paint.getStrokeWidth() != J3) {
                        ((Paint) c0339h.f5415b).setStrokeWidth(J3);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        ((Paint) c0339h.f5415b).setStrokeMiter(4.0f);
                    }
                    if (!M.s(c0339h.a(), 0)) {
                        c0339h.g(0);
                    }
                    if (!M.t(c0339h.b(), 0)) {
                        c0339h.h(0);
                    }
                    if (!f2.j.a(null, null)) {
                        ((Paint) c0339h.f5415b).setPathEffect(null);
                    }
                    if (!M.r(paint.isFilterBitmap() ? 1 : 0, 1)) {
                        ((Paint) c0339h.f5415b).setFilterBitmap(!M.r(1, 0));
                    }
                    rVar.g(e3, e4, c0339h);
                    break;
                }
                break;
            default:
                z.z zVar = (z.z) obj;
                C1258v c1258v = ((C1242f) obj6).f10447a;
                zVar.f10501h = (I0.z) obj5;
                zVar.f10502i = (I0.m) obj4;
                zVar.f10496c = (R.h) obj3;
                zVar.f10497d = (C1204q) obj2;
                zVar.f10498e = c1258v != null ? c1258v.f10472r : null;
                zVar.f10499f = c1258v != null ? c1258v.f10473s : null;
                zVar.f10500g = c1258v != null ? (O0) AbstractC0993f.i(c1258v, AbstractC1101g0.f9365q) : null;
                break;
        }
        return yVar;
    }
}
