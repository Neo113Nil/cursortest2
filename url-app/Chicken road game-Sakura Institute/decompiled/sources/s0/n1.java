package s0;

import B1.C0097d;
import G.C0225u;
import android.view.View;
import android.view.ViewGroup;
import com.chicken.road.kedro.laqer.R;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f10278a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l1 a(AbstractC1131a abstractC1131a, G.r rVar, O.a aVar) {
        C1166s c1166s;
        l1 l1Var;
        int i2 = 0;
        if (AbstractC1162p0.f10284a.compareAndSet(false, true)) {
            Y2.e a4 = Y2.l.a(1, 6, null);
            W2.B.m(W2.B.a((CoroutineContext) V.f10139s.getValue()), null, null, new C1158n0(a4, null), 3);
            C1160o0 c1160o0 = new C1160o0(i2, a4);
            synchronized (Q.q.f3878b) {
                Q.q.f3884h = C1403G.A(Q.q.f3884h, c1160o0);
                Unit unit = Unit.f7487a;
            }
            Q.q.a();
        }
        if (abstractC1131a.getChildCount() > 0) {
            View childAt = abstractC1131a.getChildAt(0);
            if (childAt instanceof C1166s) {
                c1166s = (C1166s) childAt;
                if (c1166s == null) {
                    c1166s = new C1166s(abstractC1131a.getContext(), rVar.h());
                    abstractC1131a.addView(c1166s.getView(), f10278a);
                }
                C0225u c0225u = new C0225u(rVar, new C0097d(c1166s.getRoot()));
                Object tag = c1166s.getView().getTag(R.id.wrapped_composition_tag);
                l1Var = tag instanceof l1 ? (l1) tag : null;
                if (l1Var == null) {
                    l1Var = new l1(c1166s, c0225u);
                    c1166s.getView().setTag(R.id.wrapped_composition_tag, l1Var);
                }
                l1Var.e(aVar);
                if (!Intrinsics.a(c1166s.getCoroutineContext(), rVar.h())) {
                    c1166s.setCoroutineContext(rVar.h());
                }
                return l1Var;
            }
        } else {
            abstractC1131a.removeAllViews();
        }
        c1166s = null;
        if (c1166s == null) {
        }
        C0225u c0225u2 = new C0225u(rVar, new C0097d(c1166s.getRoot()));
        Object tag2 = c1166s.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof l1) {
        }
        if (l1Var == null) {
        }
        l1Var.e(aVar);
        if (!Intrinsics.a(c1166s.getCoroutineContext(), rVar.h())) {
        }
        return l1Var;
    }
}
