package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ux {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int c;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((x80) this.k.get(i2)).a;
            i80 i80Var = (i80) view3.getLayoutParams();
            if (view3 != view && !i80Var.a.i() && (c = (i80Var.a.c() - this.d) * this.e) >= 0 && c < i) {
                view2 = view3;
                if (c == 0) {
                    break;
                } else {
                    i = c;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((i80) view2.getLayoutParams()).a.c();
        }
    }

    public final View b(o80 o80Var) {
        List list = this.k;
        if (list == null) {
            View d = o80Var.d(this.d);
            this.d += this.e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((x80) this.k.get(i)).a;
            i80 i80Var = (i80) view.getLayoutParams();
            if (!i80Var.a.i() && this.d == i80Var.a.c()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
