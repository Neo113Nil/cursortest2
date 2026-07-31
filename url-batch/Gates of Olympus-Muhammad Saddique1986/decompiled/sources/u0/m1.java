package u0;

import I.C0176u;
import android.view.View;
import android.view.ViewGroup;
import com.gatesof.olympus.martu.marku.R;
import q2.AbstractC0837y;
import r0.C0929z;

/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f9406a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final k1 a(AbstractC1088a abstractC1088a, I.r rVar, Q.a aVar) {
        C1123s c1123s;
        k1 k1Var;
        if (AbstractC1117o0.f9415a.compareAndSet(false, true)) {
            s2.g a3 = n.r.a(1, 6, null);
            AbstractC0837y.r(AbstractC0837y.a((V1.i) W.f9278p.getValue()), null, null, new C1115n0(a3, null), 3);
            C0929z c0929z = new C0929z(8, a3);
            synchronized (S.p.f4241b) {
                S.p.f4247h = S1.l.T0(S.p.f4247h, c0929z);
            }
            S.p.a();
        }
        if (abstractC1088a.getChildCount() > 0) {
            View childAt = abstractC1088a.getChildAt(0);
            if (childAt instanceof C1123s) {
                c1123s = (C1123s) childAt;
                if (c1123s == null) {
                    c1123s = new C1123s(abstractC1088a.getContext(), rVar.h());
                    abstractC1088a.addView(c1123s.getView(), f9406a);
                }
                C0176u c0176u = new C0176u(rVar, new G1.m(c1123s.getRoot()));
                Object tag = c1123s.getView().getTag(R.id.wrapped_composition_tag);
                k1Var = tag instanceof k1 ? (k1) tag : null;
                if (k1Var == null) {
                    k1Var = new k1(c1123s, c0176u);
                    c1123s.getView().setTag(R.id.wrapped_composition_tag, k1Var);
                }
                k1Var.f(aVar);
                if (!f2.j.a(c1123s.getCoroutineContext(), rVar.h())) {
                    c1123s.setCoroutineContext(rVar.h());
                }
                return k1Var;
            }
        } else {
            abstractC1088a.removeAllViews();
        }
        c1123s = null;
        if (c1123s == null) {
        }
        C0176u c0176u2 = new C0176u(rVar, new G1.m(c1123s.getRoot()));
        Object tag2 = c1123s.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof k1) {
        }
        if (k1Var == null) {
        }
        k1Var.f(aVar);
        if (!f2.j.a(c1123s.getCoroutineContext(), rVar.h())) {
        }
        return k1Var;
    }
}
