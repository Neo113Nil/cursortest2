package androidx.compose.foundation.lazy.layout;

import E.v;
import F.C0087c;
import I.C0159l;
import I.C0167p;
import I.G;
import I.InterfaceC0142c0;
import I.W;
import R1.y;
import U.q;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import f2.k;
import java.util.Arrays;
import m.C0616a;
import r0.AbstractC0898U;
import r0.C0901X;
import t.AbstractC0972B;
import t.C0971A;
import t.L;
import t.M;
import t.RunnableC0974b;
import t.r;
import z.C1256t;

/* loaded from: classes.dex */
public final class b extends k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0971A f4848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f4849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f4850g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f4851h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0971A c0971a, q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0142c0 interfaceC0142c0) {
        super(3);
        this.f4848e = c0971a;
        this.f4849f = qVar;
        this.f4850g = interfaceC0426e;
        this.f4851h = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        q i3;
        L l3;
        R.c cVar = (R.c) obj;
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        Object G3 = c0167p.G();
        W w2 = C0159l.f2829a;
        if (G3 == w2) {
            G3 = new r(cVar, new v(this.f4851h, 2));
            c0167p.a0(G3);
        }
        r rVar = (r) G3;
        Object G4 = c0167p.G();
        if (G4 == w2) {
            G4 = new C0901X(new C1256t(rVar));
            c0167p.a0(G4);
        }
        C0901X c0901x = (C0901X) G4;
        C0971A c0971a = this.f4848e;
        if (c0971a != null) {
            c0167p.Q(205264983);
            c0167p.Q(6622915);
            L l4 = M.f8459a;
            if (l4 != null) {
                c0167p.Q(1213893039);
                c0167p.p(false);
                l3 = l4;
            } else {
                c0167p.Q(1213931944);
                View view = (View) c0167p.k(AndroidCompositionLocals_androidKt.f4942f);
                boolean f3 = c0167p.f(view);
                Object G5 = c0167p.G();
                if (f3 || G5 == w2) {
                    G5 = new RunnableC0974b(view);
                    c0167p.a0(G5);
                }
                c0167p.p(false);
                l3 = (RunnableC0974b) G5;
            }
            c0167p.p(false);
            Object[] objArr = {c0971a, rVar, c0901x, l3};
            boolean f4 = c0167p.f(c0971a) | c0167p.h(rVar) | c0167p.h(c0901x) | c0167p.h(l3);
            Object G6 = c0167p.G();
            if (f4 || G6 == w2) {
                C0616a c0616a = new C0616a(c0971a, rVar, c0901x, l3, 2);
                c0167p.a0(c0616a);
                G6 = c0616a;
            }
            InterfaceC0424c interfaceC0424c = (InterfaceC0424c) G6;
            boolean z3 = false;
            for (Object obj4 : Arrays.copyOf(objArr, 4)) {
                z3 |= c0167p.f(obj4);
            }
            Object G7 = c0167p.G();
            if (z3 || G7 == w2) {
                c0167p.a0(new G(interfaceC0424c));
            }
            c0167p.p(false);
        } else {
            c0167p.Q(205858881);
            c0167p.p(false);
        }
        int i4 = AbstractC0972B.f8423b;
        q qVar = this.f4849f;
        if (c0971a != null && (i3 = qVar.i(new TraversablePrefetchStateModifierElement(c0971a))) != null) {
            qVar = i3;
        }
        boolean f5 = c0167p.f(rVar);
        InterfaceC0426e interfaceC0426e = this.f4850g;
        boolean f6 = f5 | c0167p.f(interfaceC0426e);
        Object G8 = c0167p.G();
        if (f6 || G8 == w2) {
            G8 = new C0087c(rVar, interfaceC0426e, 10);
            c0167p.a0(G8);
        }
        AbstractC0898U.c(c0901x, qVar, (InterfaceC0426e) G8, c0167p, 8);
        return y.f4171a;
    }
}
