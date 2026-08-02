package defpackage;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class blo implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public blo(cwk cwkVar) {
        this.a = new WeakReference(cwkVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        cwk cwkVar = (cwk) this.a.get();
        if (cwkVar == null) {
            return true;
        }
        List list = cwkVar.a;
        if (list.isEmpty()) {
            return true;
        }
        int e = cwkVar.e();
        int d = cwkVar.d();
        if (!cwk.g(e, d)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((blg) arrayList.get(i)).e(e, d);
        }
        cwkVar.f();
        return true;
    }
}
