package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o50 {
    public final t7 a;
    public final mh b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public nv2 j;
    public bw2 k;
    public cu1 l;
    public w72 n;
    public w72 o;
    public final Object c = new Object();
    public Function1 m = o3.K;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = ti1.a();
    public final Matrix r = new Matrix();

    public o50(t7 t7Var, mh mhVar) {
        this.a = t7Var;
        this.b = mhVar;
    }

    public final void a() {
        boolean z;
        mh mhVar = this.b;
        y91 y91Var = (y91) mhVar.o;
        InputMethodManager inputMethodManager = (InputMethodManager) y91Var.getValue();
        View view = (View) mhVar.n;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.m;
            float[] fArr = this.q;
            function1.invoke(new ti1(fArr));
            this.a.t(fArr);
            Matrix matrix = this.r;
            l41.Y(matrix, fArr);
            nv2 nv2Var = this.j;
            nv2Var.getClass();
            long j = nv2Var.b;
            cu1 cu1Var = this.l;
            cu1Var.getClass();
            bw2 bw2Var = this.k;
            bw2Var.getClass();
            w72 w72Var = this.n;
            w72Var.getClass();
            w72 w72Var2 = this.o;
            w72Var2.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
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
                boolean t = o70.t(w72Var, b, c.b);
                boolean t2 = o70.t(w72Var, b, c.d);
                boolean z6 = bw2Var.a(g) == k92.n;
                int i = (t || t2) ? 1 : 0;
                if (!t || !t2) {
                    i |= 2;
                }
                if (z6) {
                    i |= 4;
                }
                int i2 = i;
                float f = c.b;
                float f2 = c.d;
                builder.setInsertionMarkerLocation(b, f, f2, f2, i2);
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
                        float f3 = fArr2[i4];
                        int i5 = d;
                        float f4 = fArr2[i4 + 1];
                        int i6 = g2;
                        float f5 = fArr2[i4 + 2];
                        float f6 = fArr2[i4 + 3];
                        int i7 = i3;
                        int i8 = (w72Var.a < f5 ? 1 : 0) & (f3 < w72Var.c ? 1 : 0) & (w72Var.b < f6 ? 1 : 0) & (f4 < w72Var.d ? 1 : 0);
                        if (!o70.t(w72Var, f3, f4) || !o70.t(w72Var, f5, f6)) {
                            i8 |= 2;
                        }
                        if (bw2Var.a(g4) == k92.n) {
                            i8 |= 4;
                        }
                        builder.addCharacterBounds(i7, f3, f4, f5, f6, i8);
                        i3 = i7 + 1;
                        d = i5;
                        g2 = i6;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z4) {
                d2.k(builder, w72Var2);
            }
            if (i9 >= 34 && z5) {
                v1.a(builder, bw2Var, w72Var);
            }
            ((InputMethodManager) y91Var.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
