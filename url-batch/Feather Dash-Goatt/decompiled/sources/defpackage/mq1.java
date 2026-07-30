package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.feathherdashh.dashgame.R;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class mq1 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kq1 a(o oVar, ml mlVar, hk hkVar) {
        d4 d4Var;
        kq1 kq1Var;
        Object[] objArr = 0;
        if (y40.a.compareAndSet(false, true)) {
            we i = yr1.i(1, 6, null);
            uq1.N(la0.f((CoroutineContext) p6.q.getValue()), null, new f(i, objArr == true ? 1 : 0, 8), 3);
            a3 a3Var = new a3(12, i);
            synchronized (pb1.c) {
                pb1.i = CollectionsKt.v(pb1.i, a3Var);
            }
            pb1.a();
        }
        if (oVar.getChildCount() > 0) {
            View childAt = oVar.getChildAt(0);
            if (childAt instanceof d4) {
                d4Var = (d4) childAt;
                if (d4Var == null) {
                    d4Var = new d4(oVar.getContext(), mlVar.j());
                    oVar.addView(d4Var.getView(), a);
                }
                Object tag = d4Var.getView().getTag(R.id.wrapped_composition_tag);
                kq1Var = tag instanceof kq1 ? (kq1) tag : null;
                if (kq1Var == null) {
                    kq1Var = new kq1(d4Var, new tl(mlVar, new mk1(d4Var.getRoot())));
                    d4Var.getView().setTag(R.id.wrapped_composition_tag, kq1Var);
                }
                kq1Var.f(hkVar);
                if (!Intrinsics.a(d4Var.getCoroutineContext(), mlVar.j())) {
                    d4Var.setCoroutineContext(mlVar.j());
                }
                d4Var.setFrameEndScheduler$ui(new lq1(mlVar));
                return kq1Var;
            }
        } else {
            oVar.removeAllViews();
        }
        d4Var = null;
        if (d4Var == null) {
        }
        Object tag2 = d4Var.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof kq1) {
        }
        if (kq1Var == null) {
        }
        kq1Var.f(hkVar);
        if (!Intrinsics.a(d4Var.getCoroutineContext(), mlVar.j())) {
        }
        d4Var.setFrameEndScheduler$ui(new lq1(mlVar));
        return kq1Var;
    }
}
