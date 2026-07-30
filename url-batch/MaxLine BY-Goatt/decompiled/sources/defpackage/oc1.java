package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oc1 {
    public final ca a;
    public final t21 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public nv2 j;
    public bw2 k;
    public cu1 l;
    public w72 m;
    public w72 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = ti1.a();
    public final Matrix q = new Matrix();

    public oc1(ca caVar, t21 t21Var) {
        this.a = caVar;
        this.b = t21Var;
    }

    public final void a() {
        boolean z;
        t21 t21Var = this.b;
        InputMethodManager y = t21Var.y();
        View view = (View) t21Var.n;
        if (y.isActive(view)) {
            float[] fArr = this.p;
            ti1.d(fArr);
            t81 t81Var = (t81) this.a.o.D.getValue();
            if (t81Var != null) {
                if (!t81Var.y()) {
                    t81Var = null;
                }
                if (t81Var != null) {
                    t81Var.J(fArr);
                }
            }
            Unit unit = Unit.a;
            w72 w72Var = this.n;
            w72Var.getClass();
            float f = -w72Var.a;
            w72 w72Var2 = this.n;
            w72Var2.getClass();
            ti1.f(fArr, f, -w72Var2.b);
            Matrix matrix = this.q;
            l41.Y(matrix, fArr);
            nv2 nv2Var = this.j;
            nv2Var.getClass();
            long j = nv2Var.b;
            cu1 cu1Var = this.l;
            cu1Var.getClass();
            bw2 bw2Var = this.k;
            bw2Var.getClass();
            w72 w72Var3 = this.m;
            w72Var3.getClass();
            w72 w72Var4 = this.n;
            w72Var4.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder = this.o;
            builder.reset();
            builder.setMatrix(matrix);
            jw2 jw2Var = nv2Var.c;
            int e = jw2.e(j);
            builder.setSelectionRange(e, jw2.d(j));
            if (!z2 || e < 0) {
                z = z3;
            } else {
                int g = cu1Var.g(e);
                w72 c = bw2Var.c(g);
                z = z3;
                float b = d.b(c.a, 0.0f, (int) (bw2Var.c >> 32));
                boolean s = j8.s(w72Var3, b, c.b);
                boolean s2 = j8.s(w72Var3, b, c.d);
                boolean z6 = bw2Var.a(g) == k92.n;
                int i = (s || s2) ? 1 : 0;
                if (!s || !s2) {
                    i |= 2;
                }
                if (z6) {
                    i |= 4;
                }
                int i2 = i;
                float f2 = c.b;
                float f3 = c.d;
                builder.setInsertionMarkerLocation(b, f2, f3, f3, i2);
            }
            if (z) {
                int e2 = jw2Var != null ? jw2.e(jw2Var.a) : -1;
                int d = jw2Var != null ? jw2.d(jw2Var.a) : -1;
                if (e2 >= 0 && e2 < d) {
                    builder.setComposingText(e2, nv2Var.a.n.subSequence(e2, d));
                    int g2 = cu1Var.g(e2);
                    int g3 = cu1Var.g(d);
                    float[] fArr2 = new float[(g3 - g2) * 4];
                    bw2Var.b.a(th2.a(g2, g3), fArr2);
                    int i3 = e2;
                    while (i3 < d) {
                        int g4 = cu1Var.g(i3);
                        int i4 = (g4 - g2) * 4;
                        float f4 = fArr2[i4];
                        int i5 = d;
                        float f5 = fArr2[i4 + 1];
                        int i6 = g2;
                        float f6 = fArr2[i4 + 2];
                        float f7 = fArr2[i4 + 3];
                        int i7 = i3;
                        int i8 = (w72Var3.a < f6 ? 1 : 0) & (f4 < w72Var3.c ? 1 : 0) & (w72Var3.b < f7 ? 1 : 0) & (f5 < w72Var3.d ? 1 : 0);
                        if (!j8.s(w72Var3, f4, f5) || !j8.s(w72Var3, f6, f7)) {
                            i8 |= 2;
                        }
                        if (bw2Var.a(g4) == k92.n) {
                            i8 |= 4;
                        }
                        builder.addCharacterBounds(i7, f4, f5, f6, f7, i8);
                        i3 = i7 + 1;
                        d = i5;
                        g2 = i6;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z4) {
                m50.a(builder, w72Var4);
            }
            if (i9 >= 34 && z5) {
                n50.a(builder, bw2Var, w72Var3);
            }
            t21Var.y().updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
