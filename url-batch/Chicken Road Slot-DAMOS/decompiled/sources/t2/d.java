package t2;

import a2.r;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import k1.e0;
import k1.h0;
import k1.m;
import k1.p;
import k1.v;
import kotlin.jvm.internal.Intrinsics;
import n0.y;
import y6.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public l f9238a;

    /* renamed from: b, reason: collision with root package name */
    public w2.l f9239b;

    /* renamed from: c, reason: collision with root package name */
    public int f9240c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f9241d;

    /* renamed from: e, reason: collision with root package name */
    public p f9242e;

    /* renamed from: f, reason: collision with root package name */
    public v f9243f;
    public y g;

    /* renamed from: h, reason: collision with root package name */
    public j1.e f9244h;

    /* renamed from: i, reason: collision with root package name */
    public m1.c f9245i;

    public final l a() {
        l lVar = this.f9238a;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f9238a = lVar2;
        return lVar2;
    }

    public final void b(int i3) {
        if (i3 == this.f9240c) {
            return;
        }
        a().g(i3);
        this.f9240c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : j1.e.a(r1.f4927a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(v vVar, long j, float f3) {
        if (vVar == null) {
            this.g = null;
            this.f9243f = null;
            this.f9244h = null;
            setShader(null);
            return;
        }
        if (vVar instanceof h0) {
            d(k7.e.A(((h0) vVar).f5325f, f3));
            return;
        }
        if (!(vVar instanceof m)) {
            r.p();
            return;
        }
        if (Intrinsics.a(this.f9243f, vVar)) {
            j1.e eVar = this.f9244h;
        }
        if (j != 9205357640488583168L) {
            this.f9243f = vVar;
            this.f9244h = new j1.e(j);
            this.g = n0.h.o(new a1.b(vVar, j));
        }
        l a9 = a();
        y yVar = this.g;
        Shader shader = yVar != null ? (Shader) yVar.getValue() : null;
        a9.f10661i = shader;
        ((Paint) a9.f10660e).setShader(shader);
        this.f9242e = null;
        i.b(this, f3);
    }

    public final void d(long j) {
        p pVar = this.f9242e;
        if (pVar == null ? false : p.c(pVar.f5342a, j)) {
            return;
        }
        if (j != 16) {
            this.f9242e = new p(j);
            setColor(v.r(j));
            this.g = null;
            this.f9243f = null;
            this.f9244h = null;
            setShader(null);
        }
    }

    public final void e(m1.c cVar) {
        if (cVar == null || Intrinsics.a(this.f9245i, cVar)) {
            return;
        }
        this.f9245i = cVar;
        if (cVar.equals(m1.f.f6411b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(cVar instanceof m1.g)) {
            r.p();
            return;
        }
        a().j(1);
        m1.g gVar = (m1.g) cVar;
        ((Paint) a().f10660e).setStrokeWidth(gVar.f6412b);
        ((Paint) a().f10660e).setStrokeMiter(gVar.f6413c);
        l a9 = a();
        int i3 = gVar.f6415e;
        ((Paint) a9.f10660e).setStrokeJoin(i3 == 0 ? Paint.Join.MITER : i3 == 2 ? Paint.Join.BEVEL : i3 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
        l a10 = a();
        int i10 = gVar.f6414d;
        ((Paint) a10.f10660e).setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
        ((Paint) a().f10660e).setPathEffect(null);
    }

    public final void f(e0 e0Var) {
        if (e0Var == null || Intrinsics.a(this.f9241d, e0Var)) {
            return;
        }
        this.f9241d = e0Var;
        if (e0Var.equals(e0.f5315d)) {
            clearShadowLayer();
            return;
        }
        e0 e0Var2 = this.f9241d;
        float f3 = e0Var2.f5318c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, Float.intBitsToFloat((int) (e0Var2.f5317b >> 32)), Float.intBitsToFloat((int) (this.f9241d.f5317b & 4294967295L)), v.r(this.f9241d.f5316a));
    }

    public final void g(w2.l lVar) {
        if (lVar == null || Intrinsics.a(this.f9239b, lVar)) {
            return;
        }
        this.f9239b = lVar;
        int i3 = lVar.f10046a;
        setUnderlineText((i3 | 1) == i3);
        int i10 = this.f9239b.f10046a;
        setStrikeThruText((i10 | 2) == i10);
    }
}
