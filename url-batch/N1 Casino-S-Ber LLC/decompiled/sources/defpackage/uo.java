package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class uo extends vd {
    public final View b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public uo(View view) {
        this.b = view;
    }

    @Override // defpackage.vd
    public final void a(xa0 xa0Var) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.vd
    public final void b(xa0 xa0Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.vd
    public final rb0 c(rb0 rb0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((xa0) it.next()).a.d() & 8) != 0) {
                this.b.setTranslationY(w2.c(this.d, 0, r0.a.c()));
                break;
            }
        }
        return rb0Var;
    }

    @Override // defpackage.vd
    public final q4 d(xa0 xa0Var, q4 q4Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
        return q4Var;
    }
}
