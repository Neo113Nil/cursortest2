package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
abstract class s {
    static int a(RecyclerView.A a4, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z4) {
        if (pVar2.getChildCount() == 0 || a4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(pVar2.getPosition(view) - pVar2.getPosition(view2)) + 1;
        }
        return Math.min(pVar.o(), pVar.d(view2) - pVar.g(view));
    }

    static int b(RecyclerView.A a4, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z4, boolean z5) {
        if (pVar2.getChildCount() == 0 || a4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z5 ? Math.max(0, (a4.b() - Math.max(pVar2.getPosition(view), pVar2.getPosition(view2))) - 1) : Math.max(0, Math.min(pVar2.getPosition(view), pVar2.getPosition(view2)));
        if (z4) {
            return Math.round((max * (Math.abs(pVar.d(view2) - pVar.g(view)) / (Math.abs(pVar2.getPosition(view) - pVar2.getPosition(view2)) + 1))) + (pVar.n() - pVar.g(view)));
        }
        return max;
    }

    static int c(RecyclerView.A a4, p pVar, View view, View view2, RecyclerView.p pVar2, boolean z4) {
        if (pVar2.getChildCount() == 0 || a4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return a4.b();
        }
        return (int) (((pVar.d(view2) - pVar.g(view)) / (Math.abs(pVar2.getPosition(view) - pVar2.getPosition(view2)) + 1)) * a4.b());
    }
}
