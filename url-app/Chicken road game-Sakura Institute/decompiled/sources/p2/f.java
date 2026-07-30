package p2;

import a2.j0;
import android.graphics.Paint;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import f7.i0;
import java.util.ArrayList;
import java.util.List;
import r1.f0;
import s1.f1;
import s1.l2;
import t3.b0;
import w.o0;
import w.z0;
import z0.l0;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7134i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f7135j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7136k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7137l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        super(1);
        this.f7132g = i7;
        this.f7133h = obj;
        this.f7134i = obj2;
        this.f7135j = obj3;
        this.f7136k = obj4;
        this.f7137l = obj5;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        List list;
        int i7 = this.f7132g;
        d6.z zVar = d6.z.f2639a;
        Object obj2 = this.f7137l;
        Object obj3 = this.f7136k;
        Object obj4 = this.f7135j;
        Object obj5 = this.f7134i;
        Object obj6 = this.f7133h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                v vVar = (v) obj6;
                vVar.f7183s.addView(vVar, vVar.f7184t);
                vVar.i((q6.a) obj5, (z) obj4, (String) obj3, (m2.k) obj2);
                break;
            case 1:
                t3.h hVar = (t3.h) obj;
                r6.t tVar = (r6.t) obj4;
                r6.k.f(hVar, "entry");
                ((r6.r) obj6).f7964f = true;
                ArrayList arrayList = (ArrayList) obj5;
                int indexOf = arrayList.indexOf(hVar);
                if (indexOf != -1) {
                    int i8 = indexOf + 1;
                    list = arrayList.subList(tVar.f7966f, i8);
                    tVar.f7966f = i8;
                } else {
                    list = e6.u.f2826f;
                }
                ((b0) obj3).a(hVar.f8792g, (Bundle) obj2, hVar, list);
                break;
            case 2:
                f0 f0Var = (f0) obj;
                f0Var.b();
                b1.c cVar = f0Var.f7767f;
                float e9 = ((y.j) obj6).f9718b.e();
                if (e9 != 0.0f) {
                    long j8 = ((g2.w) obj4).f4066b;
                    int i9 = j0.f407c;
                    int b9 = ((g2.q) obj5).b((int) (j8 >> 32));
                    z0 d8 = ((w.j0) obj3).d();
                    y0.d c4 = d8 != null ? d8.f9471a.c(b9) : new y0.d(0.0f, 0.0f, 0.0f, 0.0f);
                    float y4 = f0Var.y(o0.f9375a);
                    float f9 = y4 / 2;
                    float f10 = c4.f9780a + f9;
                    float d9 = y0.f.d(cVar.d()) - f9;
                    if (f10 > d9) {
                        f10 = d9;
                    }
                    if (f10 >= f9) {
                        f9 = f10;
                    }
                    long a3 = u3.r.a(f9, c4.f9781b);
                    long a9 = u3.r.a(f9, c4.f9783d);
                    r0 r0Var = (r0) obj2;
                    z0.r rVar = cVar.f1233f.f1227c;
                    i0 i0Var = cVar.f1236i;
                    if (i0Var == null) {
                        i0Var = l0.g();
                        i0Var.l(1);
                        cVar.f1236i = i0Var;
                    }
                    Paint paint = (Paint) i0Var.f3488b;
                    r0Var.a(e9, cVar.d(), i0Var);
                    if (!r6.k.a((z0.m) i0Var.f3490d, null)) {
                        i0Var.f(null);
                    }
                    if (i0Var.f3487a != 3) {
                        i0Var.d(3);
                    }
                    if (paint.getStrokeWidth() != y4) {
                        i0Var.k(y4);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (i0Var.a() != 0) {
                        i0Var.i(0);
                    }
                    if (i0Var.b() != 0) {
                        i0Var.j(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        i0Var.g(1);
                    }
                    rVar.a(a3, a9, i0Var);
                    break;
                }
                break;
            default:
                y.u uVar = (y.u) obj;
                y.q qVar = ((y.d) obj5).f9709a;
                uVar.f9754h = (g2.w) obj6;
                uVar.f9755i = (g2.m) obj4;
                uVar.f9749c = (c.h) obj3;
                uVar.f9750d = (q6.c) obj2;
                uVar.f9751e = qVar != null ? qVar.f9725t : null;
                uVar.f9752f = qVar != null ? qVar.f9726u : null;
                uVar.f9753g = qVar != null ? (l2) r1.f.i(qVar, f1.f8228q) : null;
                break;
        }
        return zVar;
    }
}
