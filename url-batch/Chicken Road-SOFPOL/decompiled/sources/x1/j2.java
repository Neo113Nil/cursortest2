package x1;

import android.view.View;
import android.view.ViewGroup;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f8485a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i2 a(a aVar, m0.v vVar, u0.c cVar) {
        t tVar;
        i2 i2Var;
        Object[] objArr = 0;
        if (i1.f8456a.compareAndSet(false, true)) {
            c7.c a8 = c7.j.a(1, null, 6);
            a7.x.n(a7.x.a((g6.h) m0.f8498p.getValue()), null, new b0.c((Object) a8, (g6.c) (objArr == true ? 1 : 0), 16), 3);
            b1.e eVar = new b1.e(18, a8);
            synchronized (w0.m.f7537c) {
                w0.m.i = d6.m.a0(w0.m.i, eVar);
            }
            w0.m.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof t) {
                tVar = (t) childAt;
                if (tVar == null) {
                    tVar = new t(aVar.getContext(), vVar.j());
                    aVar.addView(tVar.getView(), f8485a);
                }
                Object tag = tVar.getView().getTag(R.id.wrapped_composition_tag);
                i2Var = tag instanceof i2 ? (i2) tag : null;
                if (i2Var == null) {
                    i2Var = new i2(tVar, new m0.y(vVar, new w1.y1(tVar.getRoot())));
                    tVar.getView().setTag(R.id.wrapped_composition_tag, i2Var);
                }
                i2Var.f(cVar);
                if (!q6.i.a(tVar.getCoroutineContext(), vVar.j())) {
                    tVar.setCoroutineContext(vVar.j());
                }
                return i2Var;
            }
        } else {
            aVar.removeAllViews();
        }
        tVar = null;
        if (tVar == null) {
        }
        Object tag2 = tVar.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof i2) {
        }
        if (i2Var == null) {
        }
        i2Var.f(cVar);
        if (!q6.i.a(tVar.getCoroutineContext(), vVar.j())) {
        }
        return i2Var;
    }
}
