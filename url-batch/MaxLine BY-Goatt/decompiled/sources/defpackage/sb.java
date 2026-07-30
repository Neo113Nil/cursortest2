package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sb extends TextPaint {
    public vs3 a;
    public xt2 b;
    public int c;
    public dk2 d;
    public aw e;
    public cq f;
    public ia0 g;
    public ql2 h;
    public ae0 i;

    public final vs3 a() {
        vs3 vs3Var = this.a;
        if (vs3Var != null) {
            return vs3Var;
        }
        vs3 vs3Var2 = new vs3(this);
        this.a = vs3Var2;
        return vs3Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : defpackage.ql2.a(r1.a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(cq cqVar, long j, float f) {
        if (cqVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (cqVar instanceof nn2) {
            d(ij2.i(((nn2) cqVar).a, f));
            return;
        }
        if (!(cqVar instanceof bk2)) {
            a.b();
            return;
        }
        if (Intrinsics.b(this.f, cqVar)) {
            ql2 ql2Var = this.h;
        }
        if (j != 9205357640488583168L) {
            this.f = cqVar;
            this.h = new ql2(j);
            this.g = ij2.f(new rb(0, j, cqVar));
        }
        vs3 a = a();
        ia0 ia0Var = this.g;
        Shader shader = ia0Var != null ? (Shader) ia0Var.getValue() : null;
        a.c = shader;
        ((Paint) a.b).setShader(shader);
        this.e = null;
        s03.L(this, f);
    }

    public final void d(long j) {
        aw awVar = this.e;
        if ((awVar == null ? false : aw.c(awVar.a, j)) || j == 16) {
            return;
        }
        this.e = new aw(j);
        setColor(ap.H(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(ae0 ae0Var) {
        if (ae0Var == null || Intrinsics.b(this.i, ae0Var)) {
            return;
        }
        this.i = ae0Var;
        if (ae0Var.equals(vl0.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(ae0Var instanceof xp2)) {
            a.b();
            return;
        }
        a().i(1);
        vs3 a = a();
        xp2 xp2Var = (xp2) ae0Var;
        ((Paint) a.b).setStrokeWidth(xp2Var.a);
        vs3 a2 = a();
        ((Paint) a2.b).setStrokeMiter(xp2Var.b);
        a().h(xp2Var.d);
        a().g(xp2Var.c);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(dk2 dk2Var) {
        if (dk2Var == null || Intrinsics.b(this.d, dk2Var)) {
            return;
        }
        this.d = dk2Var;
        if (dk2Var.equals(dk2.d)) {
            clearShadowLayer();
            return;
        }
        dk2 dk2Var2 = this.d;
        float f = dk2Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (dk2Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), ap.H(this.d.a));
    }

    public final void g(xt2 xt2Var) {
        if (xt2Var == null || Intrinsics.b(this.b, xt2Var)) {
            return;
        }
        this.b = xt2Var;
        int i = xt2Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
