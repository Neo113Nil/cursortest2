package u0;

import D1.C0014b;
import I.C0122u;
import android.view.View;
import android.view.ViewGroup;
import com.gates.olympus.miruv.R;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f8310a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Z0 a(AbstractC0960a abstractC0960a, I.r rVar, Q.a aVar) {
        C0997t c0997t;
        Z0 z02;
        if (AbstractC0977i0.f8335a.compareAndSet(false, true)) {
            m2.e a3 = m2.l.a(1, 6, null);
            AbstractC0552y.q(AbstractC0552y.a((P1.i) S.p.getValue()), null, null, new C0975h0(a3, null), 3);
            t.x xVar = new t.x(7, a3);
            synchronized (S.q.f3235b) {
                S.q.f3241h = M1.l.v0(S.q.f3241h, xVar);
            }
            S.q.a();
        }
        if (abstractC0960a.getChildCount() > 0) {
            View childAt = abstractC0960a.getChildAt(0);
            if (childAt instanceof C0997t) {
                c0997t = (C0997t) childAt;
                if (c0997t == null) {
                    c0997t = new C0997t(abstractC0960a.getContext(), rVar.h());
                    abstractC0960a.addView(c0997t.getView(), f8310a);
                }
                C0122u c0122u = new C0122u(rVar, new C0014b(c0997t.getRoot()));
                Object tag = c0997t.getView().getTag(R.id.wrapped_composition_tag);
                z02 = tag instanceof Z0 ? (Z0) tag : null;
                if (z02 == null) {
                    z02 = new Z0(c0997t, c0122u);
                    c0997t.getView().setTag(R.id.wrapped_composition_tag, z02);
                }
                z02.d(aVar);
                if (!Z1.i.a(c0997t.getCoroutineContext(), rVar.h())) {
                    c0997t.setCoroutineContext(rVar.h());
                }
                return z02;
            }
        } else {
            abstractC0960a.removeAllViews();
        }
        c0997t = null;
        if (c0997t == null) {
        }
        C0122u c0122u2 = new C0122u(rVar, new C0014b(c0997t.getRoot()));
        Object tag2 = c0997t.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof Z0) {
        }
        if (z02 == null) {
        }
        z02.d(aVar);
        if (!Z1.i.a(c0997t.getCoroutineContext(), rVar.h())) {
        }
        return z02;
    }
}
