package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.b0;
import g0.f0;
import g0.p;
import g0.z0;
import java.util.Arrays;
import p1.s0;
import p1.v0;
import q5.g;
import q6.e;
import q6.f;
import r6.l;
import s.k0;
import s.y;
import s.z;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends l implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f660g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f661h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f662i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0 f663j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y yVar, o oVar, e eVar, z0 z0Var) {
        super(3);
        this.f660g = yVar;
        this.f661h = oVar;
        this.f662i = eVar;
        this.f663j = z0Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        o j8;
        p0.c cVar = (p0.c) obj;
        p pVar = (p) obj2;
        ((Number) obj3).intValue();
        Object G = pVar.G();
        Object obj4 = g0.l.f3784a;
        if (G == obj4) {
            G = new s.p(cVar, new c0.o(this.f663j, 2));
            pVar.a0(G);
        }
        s.p pVar2 = (s.p) G;
        Object G2 = pVar.G();
        if (G2 == obj4) {
            G2 = new v0(new g(pVar2));
            pVar.a0(G2);
        }
        v0 v0Var = (v0) G2;
        y yVar = this.f660g;
        if (yVar != null) {
            pVar.Q(205264983);
            pVar.Q(6622915);
            Object obj5 = k0.f8034a;
            if (obj5 != null) {
                pVar.Q(1213893039);
                pVar.p(false);
            } else {
                pVar.Q(1213931944);
                View view = (View) pVar.k(AndroidCompositionLocals_androidKt.f743f);
                boolean f9 = pVar.f(view);
                Object G3 = pVar.G();
                if (f9 || G3 == obj4) {
                    G3 = new s.a(view);
                    pVar.a0(G3);
                }
                obj5 = (s.a) G3;
                pVar.p(false);
            }
            Object obj6 = obj5;
            pVar.p(false);
            Object[] objArr = {yVar, pVar2, v0Var, obj6};
            boolean f10 = pVar.f(yVar) | pVar.h(pVar2) | pVar.h(v0Var) | pVar.h(obj6);
            Object G4 = pVar.G();
            if (f10 || G4 == obj4) {
                Object aVar = new l.a(yVar, pVar2, v0Var, obj6, 3);
                pVar.a0(aVar);
                G4 = aVar;
            }
            q6.c cVar2 = (q6.c) G4;
            boolean z8 = false;
            for (Object obj7 : Arrays.copyOf(objArr, 4)) {
                z8 |= pVar.f(obj7);
            }
            Object G5 = pVar.G();
            if (z8 || G5 == obj4) {
                pVar.a0(new f0(cVar2));
            }
            pVar.p(false);
        } else {
            pVar.Q(205858881);
            pVar.p(false);
        }
        int i7 = z.f8074b;
        o oVar = this.f661h;
        if (yVar != null && (j8 = oVar.j(new TraversablePrefetchStateModifierElement(yVar))) != null) {
            oVar = j8;
        }
        boolean f11 = pVar.f(pVar2);
        Object obj8 = this.f662i;
        boolean f12 = f11 | pVar.f(obj8);
        Object G6 = pVar.G();
        if (f12 || G6 == obj4) {
            G6 = new b0(pVar2, 14, obj8);
            pVar.a0(G6);
        }
        s0.b(v0Var, oVar, (e) G6, pVar, 8);
        return d6.z.f2639a;
    }
}
