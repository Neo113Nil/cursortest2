package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class vs {
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
        int b;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((q20) this.k.get(i2)).a;
            c20 c20Var = (c20) view3.getLayoutParams();
            if (view3 != view && !c20Var.a.h() && (b = (c20Var.a.b() - this.d) * this.e) >= 0 && b < i) {
                view2 = view3;
                if (b == 0) {
                    break;
                } else {
                    i = b;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((c20) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(h20 h20Var) {
        List list = this.k;
        if (list == null) {
            View d = h20Var.d(this.d);
            this.d += this.e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((q20) this.k.get(i)).a;
            c20 c20Var = (c20) view.getLayoutParams();
            if (!c20Var.a.h() && this.d == c20Var.a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
