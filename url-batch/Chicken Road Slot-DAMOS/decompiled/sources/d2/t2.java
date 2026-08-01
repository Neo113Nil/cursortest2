package d2;

import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.R;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f3539a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r2 a(a aVar, c1 c1Var, x0.d dVar) {
        v vVar;
        r2 r2Var;
        Object[] objArr = 0;
        if (h1.f3417a.compareAndSet(false, true)) {
            ie.c a9 = ie.j.a(1, 6, null);
            ge.a0.s(ge.a0.b((CoroutineContext) l0.A.getValue()), null, new b5.t((Object) a9, (ld.a) (objArr == true ? 1 : 0), 2), 3);
            a3.e eVar = new a3.e(9, a9);
            synchronized (b1.r.f1030c) {
                b1.r.f1035i = CollectionsKt.F(b1.r.f1035i, eVar);
            }
            b1.r.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            vVar = childAt instanceof v ? (v) childAt : null;
            if (vVar != null) {
                vVar.setComposeViewContext(c1Var);
                if (vVar == null) {
                    vVar = new v(aVar.getContext(), c1Var);
                    aVar.addView(vVar.getView(), f3539a);
                }
                vVar.setComposeViewContext(c1Var);
                if (aVar.getComposeViewContext$ui() != null) {
                    c1Var.c();
                    vVar.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                Object tag = vVar.getTag(R.id.wrapped_composition_tag);
                r2Var = tag instanceof r2 ? (r2) tag : null;
                if (r2Var == null) {
                    r2Var = new r2(vVar, new n0.q(c1Var.f3354b, new a1.n(vVar.getRoot())));
                    vVar.setTag(R.id.wrapped_composition_tag, r2Var);
                }
                r2Var.c(dVar);
                vVar.setFrameEndScheduler$ui(new s2(c1Var.f3354b));
                return r2Var;
            }
        } else {
            aVar.removeAllViews();
        }
        vVar = null;
        if (vVar == null) {
        }
        vVar.setComposeViewContext(c1Var);
        if (aVar.getComposeViewContext$ui() != null) {
        }
        Object tag2 = vVar.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof r2) {
        }
        if (r2Var == null) {
        }
        r2Var.c(dVar);
        vVar.setFrameEndScheduler$ui(new s2(c1Var.f3354b));
        return r2Var;
    }
}
