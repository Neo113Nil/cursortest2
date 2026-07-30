package s1;

import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.R;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f8210a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c3 a(a aVar, g0.r rVar, o0.a aVar2) {
        r rVar2;
        c3 c3Var;
        Object[] objArr = 0;
        if (m1.f8287a.compareAndSet(false, true)) {
            e7.e C = j1.c.C(1, 6, null);
            c7.a0.p(c7.a0.a((h6.i) t0.f8420r.getValue()), null, null, new a0.a0((Object) C, (h6.d) (objArr == true ? 1 : 0), 20), 3);
            l0 l0Var = new l0(1, C);
            synchronized (q0.n.f7427b) {
                q0.n.f7433h = e6.l.q0(q0.n.f7433h, l0Var);
            }
            q0.n.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof r) {
                rVar2 = (r) childAt;
                if (rVar2 == null) {
                    rVar2 = new r(aVar.getContext(), rVar.h());
                    aVar.addView(rVar2.getView(), f8210a);
                }
                g0.u uVar = new g0.u(rVar, new b1.b(rVar2.getRoot()));
                Object tag = rVar2.getView().getTag(R.id.wrapped_composition_tag);
                c3Var = tag instanceof c3 ? (c3) tag : null;
                if (c3Var == null) {
                    c3Var = new c3(rVar2, uVar);
                    rVar2.getView().setTag(R.id.wrapped_composition_tag, c3Var);
                }
                c3Var.d(aVar2);
                if (!r6.k.a(rVar2.getCoroutineContext(), rVar.h())) {
                    rVar2.setCoroutineContext(rVar.h());
                }
                return c3Var;
            }
        } else {
            aVar.removeAllViews();
        }
        rVar2 = null;
        if (rVar2 == null) {
        }
        g0.u uVar2 = new g0.u(rVar, new b1.b(rVar2.getRoot()));
        Object tag2 = rVar2.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof c3) {
        }
        if (c3Var == null) {
        }
        c3Var.d(aVar2);
        if (!r6.k.a(rVar2.getCoroutineContext(), rVar.h())) {
        }
        return c3Var;
    }
}
