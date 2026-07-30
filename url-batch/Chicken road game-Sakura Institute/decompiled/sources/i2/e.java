package i2;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import f7.i0;
import g0.e0;
import z0.l0;
import z0.o0;
import z0.p;
import z0.q;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public i0 f4871a;

    /* renamed from: b, reason: collision with root package name */
    public l2.j f4872b;

    /* renamed from: c, reason: collision with root package name */
    public int f4873c;

    /* renamed from: d, reason: collision with root package name */
    public o0 f4874d;

    /* renamed from: e, reason: collision with root package name */
    public p f4875e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f4876f;

    /* renamed from: g, reason: collision with root package name */
    public y0.f f4877g;

    /* renamed from: h, reason: collision with root package name */
    public b1.f f4878h;

    public final i0 a() {
        i0 i0Var = this.f4871a;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(this);
        this.f4871a = i0Var2;
        return i0Var2;
    }

    public final void b(int i7) {
        if (i7 == this.f4873c) {
            return;
        }
        a().d(i7);
        this.f4873c = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : y0.f.a(r1.f9792a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(p pVar, long j8, float f9) {
        if (pVar == null) {
            this.f4876f = null;
            this.f4875e = null;
            this.f4877g = null;
            setShader(null);
            return;
        }
        if (pVar instanceof r0) {
            d(a.a.A(((r0) pVar).f10045a, f9));
            return;
        }
        if (pVar instanceof q) {
            if (r6.k.a(this.f4875e, pVar)) {
                y0.f fVar = this.f4877g;
            }
            if (j8 != 9205357640488583168L) {
                this.f4875e = pVar;
                this.f4877g = new y0.f(j8);
                this.f4876f = g0.d.C(new androidx.lifecycle.r0(pVar, j8));
            }
            i0 a3 = a();
            e0 e0Var = this.f4876f;
            a3.h(e0Var != null ? (Shader) e0Var.getValue() : null);
            j.b(this, f9);
        }
    }

    public final void d(long j8) {
        if (j8 != 16) {
            setColor(l0.w(j8));
            this.f4876f = null;
            this.f4875e = null;
            this.f4877g = null;
            setShader(null);
        }
    }

    public final void e(b1.f fVar) {
        if (fVar == null || r6.k.a(this.f4878h, fVar)) {
            return;
        }
        this.f4878h = fVar;
        if (fVar.equals(b1.h.f1238a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (fVar instanceof b1.i) {
            a().l(1);
            b1.i iVar = (b1.i) fVar;
            a().k(iVar.f1239a);
            i0 a3 = a();
            ((Paint) a3.f3488b).setStrokeMiter(iVar.f1240b);
            a().j(iVar.f1242d);
            a().i(iVar.f1241c);
            ((Paint) a().f3488b).setPathEffect(null);
        }
    }

    public final void f(o0 o0Var) {
        if (o0Var == null || r6.k.a(this.f4874d, o0Var)) {
            return;
        }
        this.f4874d = o0Var;
        if (o0Var.equals(o0.f10030d)) {
            clearShadowLayer();
            return;
        }
        o0 o0Var2 = this.f4874d;
        float f9 = o0Var2.f10033c;
        if (f9 == 0.0f) {
            f9 = Float.MIN_VALUE;
        }
        setShadowLayer(f9, y0.c.d(o0Var2.f10032b), y0.c.e(this.f4874d.f10032b), l0.w(this.f4874d.f10031a));
    }

    public final void g(l2.j jVar) {
        if (jVar == null || r6.k.a(this.f4872b, jVar)) {
            return;
        }
        this.f4872b = jVar;
        int i7 = jVar.f5880a;
        setUnderlineText((i7 | 1) == i7);
        int i8 = this.f4872b.f5880a;
        setStrikeThruText((i8 | 2) == i8);
    }
}
