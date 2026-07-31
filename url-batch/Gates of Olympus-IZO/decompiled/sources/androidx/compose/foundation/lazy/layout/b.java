package androidx.compose.foundation.lazy.layout;

import E.w;
import F.C0060q;
import I.C0105l;
import I.C0113p;
import I.H;
import I.InterfaceC0088c0;
import I.X;
import L1.z;
import U.l;
import Y1.e;
import Y1.f;
import Z1.j;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import m.C0587a;
import r0.M;
import r0.P;
import u.AbstractC0926H;
import u.C0925G;
import u.C0951t;
import u.RunnableC0934b;
import u.U;

/* loaded from: classes.dex */
public final class b extends j implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0925G f3663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f3666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0925G c0925g, l lVar, e eVar, InterfaceC0088c0 interfaceC0088c0) {
        super(3);
        this.f3663e = c0925g;
        this.f3664f = lVar;
        this.f3665g = eVar;
        this.f3666h = interfaceC0088c0;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        l e3;
        Object obj4;
        R.c cVar = (R.c) obj;
        C0113p c0113p = (C0113p) obj2;
        ((Number) obj3).intValue();
        Object G3 = c0113p.G();
        X x3 = C0105l.f2272a;
        if (G3 == x3) {
            G3 = new C0951t(cVar, new w(this.f3666h, 4));
            c0113p.a0(G3);
        }
        C0951t c0951t = (C0951t) G3;
        Object G4 = c0113p.G();
        if (G4 == x3) {
            G4 = new P(new C2.c(c0951t));
            c0113p.a0(G4);
        }
        P p = (P) G4;
        C0925G c0925g = this.f3663e;
        if (c0925g != null) {
            c0113p.Q(205264983);
            c0113p.Q(6622915);
            Object obj5 = U.f8048a;
            if (obj5 != null) {
                c0113p.Q(1213893039);
                c0113p.p(false);
                obj4 = obj5;
            } else {
                c0113p.Q(1213931944);
                View view = (View) c0113p.k(AndroidCompositionLocals_androidKt.f3742f);
                boolean f3 = c0113p.f(view);
                Object G5 = c0113p.G();
                if (f3 || G5 == x3) {
                    G5 = new RunnableC0934b(view);
                    c0113p.a0(G5);
                }
                c0113p.p(false);
                obj4 = (RunnableC0934b) G5;
            }
            c0113p.p(false);
            Object[] objArr = {c0925g, c0951t, p, obj4};
            boolean f4 = c0113p.f(c0925g) | c0113p.h(c0951t) | c0113p.h(p) | c0113p.h(obj4);
            Object G6 = c0113p.G();
            if (f4 || G6 == x3) {
                C0587a c0587a = new C0587a(c0925g, c0951t, p, obj4, 4);
                c0113p.a0(c0587a);
                G6 = c0587a;
            }
            Y1.c cVar2 = (Y1.c) G6;
            boolean z3 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z3 |= c0113p.f(obj6);
            }
            Object G7 = c0113p.G();
            if (z3 || G7 == x3) {
                c0113p.a0(new H(cVar2));
            }
            c0113p.p(false);
        } else {
            c0113p.Q(205858881);
            c0113p.p(false);
        }
        int i3 = AbstractC0926H.f8012b;
        l lVar = this.f3664f;
        if (c0925g != null && (e3 = lVar.e(new TraversablePrefetchStateModifierElement(c0925g))) != null) {
            lVar = e3;
        }
        boolean f5 = c0113p.f(c0951t);
        e eVar = this.f3665g;
        boolean f6 = f5 | c0113p.f(eVar);
        Object G8 = c0113p.G();
        if (f6 || G8 == x3) {
            G8 = new C0060q(c0951t, 11, eVar);
            c0113p.a0(G8);
        }
        M.c(p, lVar, (e) G8, c0113p, 8);
        return z.f2729a;
    }
}
