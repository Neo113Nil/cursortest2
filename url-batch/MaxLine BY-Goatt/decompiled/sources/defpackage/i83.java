package defpackage;

import android.view.View;
import com.majelw.libystne.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i83 {
    public static final WeakHashMap u = new WeakHashMap();
    public final fc a = dq2.c(4, "captionBar");
    public final fc b;
    public final fc c;
    public final fc d;
    public final fc e;
    public final fc f;
    public final fc g;
    public final fc h;
    public final fc i;
    public final s33 j;
    public final s33 k;
    public final s33 l;
    public final s33 m;
    public final s33 n;
    public final s33 o;
    public final s33 p;
    public final s33 q;
    public final boolean r;
    public int s;
    public final b31 t;

    public i83(View view) {
        fc c = dq2.c(128, "displayCutout");
        this.b = c;
        fc c2 = dq2.c(8, "ime");
        this.c = c2;
        fc c3 = dq2.c(32, "mandatorySystemGestures");
        this.d = c3;
        this.e = dq2.c(2, "navigationBars");
        this.f = dq2.c(1, "statusBars");
        fc c4 = dq2.c(519, "systemBars");
        this.g = c4;
        fc c5 = dq2.c(16, "systemGestures");
        this.h = c5;
        fc c6 = dq2.c(64, "tappableElement");
        this.i = c6;
        s33 s33Var = new s33(new f31(0, 0, 0, 0), "waterfall");
        this.j = s33Var;
        new c23(new c23(c4, c2), c);
        new c23(new c23(new c23(c6, c3), c5), s33Var);
        this.k = dq2.f(4, "captionBarIgnoringVisibility");
        this.l = dq2.f(2, "navigationBarsIgnoringVisibility");
        this.m = dq2.f(1, "statusBarsIgnoringVisibility");
        this.n = dq2.f(519, "systemBarsIgnoringVisibility");
        this.o = dq2.f(64, "tappableElementIgnoringVisibility");
        this.p = dq2.f(8, "imeAnimationTarget");
        this.q = dq2.f(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.r = bool != null ? bool.booleanValue() : true;
        this.t = new b31(this);
    }

    public static void a(i83 i83Var, c83 c83Var) {
        boolean z = false;
        i83Var.a.f(c83Var, 0);
        i83Var.c.f(c83Var, 0);
        i83Var.b.f(c83Var, 0);
        i83Var.e.f(c83Var, 0);
        i83Var.f.f(c83Var, 0);
        i83Var.g.f(c83Var, 0);
        i83Var.h.f(c83Var, 0);
        i83Var.i.f(c83Var, 0);
        i83Var.d.f(c83Var, 0);
        i83Var.k.f(mh2.r(c83Var.a.i(4)));
        i83Var.l.f(mh2.r(c83Var.a.i(2)));
        i83Var.m.f(mh2.r(c83Var.a.i(1)));
        i83Var.n.f(mh2.r(c83Var.a.i(519)));
        i83Var.o.f(mh2.r(c83Var.a.i(64)));
        wb0 g = c83Var.a.g();
        if (g != null) {
            i83Var.j.f(mh2.r(g.a()));
        }
        synchronized (tm2.c) {
            un1 un1Var = tm2.j.h;
            if (un1Var != null) {
                if (un1Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            tm2.a();
        }
    }
}
