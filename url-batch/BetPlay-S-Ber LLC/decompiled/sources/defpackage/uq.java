package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class uq {
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
            View view3 = ((c00) this.k.get(i2)).a;
            oz ozVar = (oz) view3.getLayoutParams();
            if (view3 != view && !ozVar.a.h() && (b = (ozVar.a.b() - this.d) * this.e) >= 0 && b < i) {
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
            this.d = ((oz) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(tz tzVar) {
        List list = this.k;
        if (list == null) {
            View d = tzVar.d(this.d);
            this.d += this.e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((c00) this.k.get(i)).a;
            oz ozVar = (oz) view.getLayoutParams();
            if (!ozVar.a.h() && this.d == ozVar.a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
