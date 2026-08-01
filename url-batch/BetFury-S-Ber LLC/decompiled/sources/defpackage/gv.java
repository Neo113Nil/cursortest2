package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gv extends co0 {
    public final View b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public gv(View view) {
        this.b = view;
    }

    @Override // defpackage.co0
    public final void a(jo0 jo0Var) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.co0
    public final void b(jo0 jo0Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.co0
    public final dp0 c(dp0 dp0Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((jo0) it.next()).a.d() & 8) != 0) {
                this.b.setTranslationY(o3.c(this.d, 0, r0.a.c()));
                break;
            }
        }
        return dp0Var;
    }

    @Override // defpackage.co0
    public final tl0 d(jo0 jo0Var, tl0 tl0Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
        return tl0Var;
    }
}
