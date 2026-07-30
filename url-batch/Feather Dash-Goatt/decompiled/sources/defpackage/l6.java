package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import com.appsflyer.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l6 extends TextPaint {
    public xu1 a;
    public wg1 b;
    public int c;
    public s91 d;
    public hi e;
    public op f;
    public xr g;
    public va1 h;
    public p4 i;

    public final xu1 a() {
        xu1 xu1Var = this.a;
        if (xu1Var != null) {
            return xu1Var;
        }
        xu1 xu1Var2 = new xu1(this);
        this.a = xu1Var2;
        return xu1Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r1 == null ? false : defpackage.va1.a(r1.a, r5)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final op opVar, final long j, float f) {
        if (opVar == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (opVar instanceof ec1) {
            d(y90.x(f, ((ec1) opVar).t));
            return;
        }
        if (!(opVar instanceof q91)) {
            l.a();
            return;
        }
        if (Intrinsics.a(this.f, opVar)) {
            va1 va1Var = this.h;
        }
        if (j != 9205357640488583168L) {
            this.f = opVar;
            this.h = new va1(j);
            this.g = gb0.o(new Function0() { // from class: k6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ((q91) op.this).T(j);
                }
            });
        }
        xu1 a = a();
        xr xrVar = this.g;
        a.g(xrVar != null ? (Shader) xrVar.getValue() : null);
        this.e = null;
        yr1.d0(this, f);
    }

    public final void d(long j) {
        hi hiVar = this.e;
        if ((hiVar == null ? false : hi.c(hiVar.a, j)) || j == 16) {
            return;
        }
        this.e = new hi(j);
        setColor(la0.W(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(p4 p4Var) {
        if (p4Var == null || Intrinsics.a(this.i, p4Var)) {
            return;
        }
        this.i = p4Var;
        if (p4Var.equals(uy.q)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(p4Var instanceof ze1)) {
            l.a();
            return;
        }
        a().j(1);
        xu1 a = a();
        ze1 ze1Var = (ze1) p4Var;
        ((Paint) a.b).setStrokeWidth(ze1Var.q);
        xu1 a2 = a();
        ((Paint) a2.b).setStrokeMiter(ze1Var.r);
        a().i(ze1Var.t);
        a().h(ze1Var.s);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(s91 s91Var) {
        if (s91Var == null || Intrinsics.a(this.d, s91Var)) {
            return;
        }
        this.d = s91Var;
        if (s91Var.equals(s91.d)) {
            clearShadowLayer();
            return;
        }
        s91 s91Var2 = this.d;
        float f = s91Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (s91Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), la0.W(this.d.a));
    }

    public final void g(wg1 wg1Var) {
        if (wg1Var == null || Intrinsics.a(this.b, wg1Var)) {
            return;
        }
        this.b = wg1Var;
        int i = wg1Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
