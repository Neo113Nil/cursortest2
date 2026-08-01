package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class hq {
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
            View view3 = ((nz) this.k.get(i2)).a;
            yy yyVar = (yy) view3.getLayoutParams();
            if (view3 != view && !yyVar.a.i() && (c = (yyVar.a.c() - this.d) * this.e) >= 0 && c < i) {
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
            this.d = ((yy) view2.getLayoutParams()).a.c();
        }
    }

    public final View b(ez ezVar) {
        List list = this.k;
        if (list == null) {
            View d = ezVar.d(this.d);
            this.d += this.e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((nz) this.k.get(i)).a;
            yy yyVar = (yy) view.getLayoutParams();
            if (!yyVar.a.i() && this.d == yyVar.a.c()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
