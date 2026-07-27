package androidx.compose.foundation.lazy.layout;

import C.v;
import D.C0120c;
import G.C0208l;
import G.C0216p;
import G.G;
import G.InterfaceC0191c0;
import M2.p;
import S.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.C0772a;
import l2.g;
import p0.AbstractC0960V;
import p0.C0963Y;
import s.AbstractC1085A;
import s.C1113q;
import s.RunnableC1097a;
import s.z;

/* loaded from: classes.dex */
public final class b extends p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f5103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5104e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f5105i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f5106j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z zVar, o oVar, Function2 function2, InterfaceC0191c0 interfaceC0191c0) {
        super(3);
        this.f5103d = zVar;
        this.f5104e = oVar;
        this.f5105i = function2;
        this.f5106j = interfaceC0191c0;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        o h4;
        P.c cVar = (P.c) obj;
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        Object I3 = c0216p.I();
        Object obj4 = C0208l.f2826a;
        if (I3 == obj4) {
            I3 = new C1113q(cVar, new v(2, this.f5106j));
            c0216p.c0(I3);
        }
        C1113q c1113q = (C1113q) I3;
        Object I4 = c0216p.I();
        if (I4 == obj4) {
            I4 = new C0963Y(new g(c1113q));
            c0216p.c0(I4);
        }
        C0963Y c0963y = (C0963Y) I4;
        z zVar = this.f5103d;
        if (zVar != null) {
            c0216p.S(205264983);
            c0216p.S(6622915);
            View view = (View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f);
            boolean f4 = c0216p.f(view);
            Object I5 = c0216p.I();
            if (f4 || I5 == obj4) {
                I5 = new RunnableC1097a(view);
                c0216p.c0(I5);
            }
            Object obj5 = (RunnableC1097a) I5;
            c0216p.q(false);
            Object[] objArr = {zVar, c1113q, c0963y, obj5};
            boolean f5 = c0216p.f(zVar) | c0216p.h(c1113q) | c0216p.h(c0963y) | c0216p.h(obj5);
            Object I6 = c0216p.I();
            if (f5 || I6 == obj4) {
                Object c0772a = new C0772a(zVar, c1113q, c0963y, obj5, 2);
                c0216p.c0(c0772a);
                I6 = c0772a;
            }
            Function1 function1 = (Function1) I6;
            boolean z4 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z4 |= c0216p.f(obj6);
            }
            Object I7 = c0216p.I();
            if (z4 || I7 == obj4) {
                c0216p.c0(new G(function1));
            }
            c0216p.q(false);
        } else {
            c0216p.S(205858881);
            c0216p.q(false);
        }
        int i2 = AbstractC1085A.f9875b;
        o oVar = this.f5104e;
        if (zVar != null && (h4 = oVar.h(new TraversablePrefetchStateModifierElement(zVar))) != null) {
            oVar = h4;
        }
        boolean f6 = c0216p.f(c1113q);
        Function2 function2 = this.f5105i;
        boolean f7 = f6 | c0216p.f(function2);
        Object I8 = c0216p.I();
        if (f7 || I8 == obj4) {
            I8 = new C0120c(c1113q, function2, 11);
            c0216p.c0(I8);
        }
        AbstractC0960V.c(c0963y, oVar, (Function2) I8, c0216p, 8);
        return Unit.f7487a;
    }
}
