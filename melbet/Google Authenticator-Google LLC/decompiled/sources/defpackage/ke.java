package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ke {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(le leVar) {
        List list = this.l;
        if (list == null) {
            View n = leVar.n(this.d);
            this.d += this.e;
            return n;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((lp) this.l.get(i)).a;
            kz kzVar = (kz) view.getLayoutParams();
            if (!kzVar.c() && this.d == kzVar.a()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(View view) {
        int a;
        int size = this.l.size();
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((lp) this.l.get(i)).a;
            kz kzVar = (kz) view3.getLayoutParams();
            if (view3 != view && !kzVar.c() && (a = (kzVar.a() - this.d) * this.e) >= 0 && a < i2) {
                if (a == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = a;
                }
            }
            i++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((kz) view2.getLayoutParams()).a();
        }
    }

    public final boolean c(lm lmVar) {
        int i = this.d;
        return i >= 0 && i < lmVar.a();
    }
}
