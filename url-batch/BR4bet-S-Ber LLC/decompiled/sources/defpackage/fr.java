package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class fr extends nf {
    public final View b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public fr(View view) {
        this.b = view;
    }

    @Override // defpackage.nf
    public final void a(ee0 ee0Var) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.nf
    public final void b(ee0 ee0Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.nf
    public final ye0 c(ye0 ye0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((ee0) it.next()).a.d() & 8) != 0) {
                this.b.setTranslationY(g3.c(this.d, 0, r0.a.c()));
                break;
            }
        }
        return ye0Var;
    }

    @Override // defpackage.nf
    public final a5 d(ee0 ee0Var, a5 a5Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
        return a5Var;
    }
}
