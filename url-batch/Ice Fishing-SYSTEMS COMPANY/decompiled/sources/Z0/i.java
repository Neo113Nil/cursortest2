package Z0;

import X0.v;
import X0.z;
import a1.AbstractC0421e;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import f1.AbstractC4490a;
import j1.C4589b;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: A, reason: collision with root package name */
    public a1.s f4126A;

    /* renamed from: q, reason: collision with root package name */
    public final String f4127q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4128r;

    /* renamed from: s, reason: collision with root package name */
    public final s.e f4129s;

    /* renamed from: t, reason: collision with root package name */
    public final s.e f4130t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f4131u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4132v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4133w;

    /* renamed from: x, reason: collision with root package name */
    public final a1.j f4134x;

    /* renamed from: y, reason: collision with root package name */
    public final a1.j f4135y;

    /* renamed from: z, reason: collision with root package name */
    public final a1.j f4136z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(v vVar, AbstractC4490a abstractC4490a, e1.e eVar) {
        super(vVar, abstractC4490a, r5, r0 != 0 ? r0 != 1 ? r0 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, eVar.f37258j, eVar.f37253d, eVar.f37256g, eVar.f37259k, eVar.f37260l);
        int d2 = AbstractC5088e.d(eVar.f37257h);
        Paint.Cap cap = d2 != 0 ? d2 != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int d3 = AbstractC5088e.d(eVar.i);
        this.f4129s = new s.e();
        this.f4130t = new s.e();
        this.f4131u = new RectF();
        this.f4127q = eVar.f37250a;
        this.f4132v = eVar.f37251b;
        this.f4128r = eVar.f37261m;
        this.f4133w = (int) (vVar.f3746n.b() / 32.0f);
        AbstractC0421e a9 = eVar.f37252c.a();
        this.f4134x = (a1.j) a9;
        a9.a(this);
        abstractC4490a.e(a9);
        AbstractC0421e a10 = eVar.f37254e.a();
        this.f4135y = (a1.j) a10;
        a10.a(this);
        abstractC4490a.e(a10);
        AbstractC0421e a11 = eVar.f37255f.a();
        this.f4136z = (a1.j) a11;
        a11.a(this);
        abstractC4490a.e(a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z0.b, c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        super.c(colorFilter, sVar);
        if (colorFilter == z.J) {
            a1.s sVar2 = this.f4126A;
            AbstractC4490a abstractC4490a = this.f4067f;
            if (sVar2 != null) {
                abstractC4490a.o(sVar2);
            }
            a1.s sVar3 = new a1.s(sVar, null);
            this.f4126A = sVar3;
            sVar3.a(this);
            abstractC4490a.e(this.f4126A);
        }
    }

    public final int[] e(int[] iArr) {
        a1.s sVar = this.f4126A;
        if (sVar != null) {
            Integer[] numArr = (Integer[]) sVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // Z0.c
    public final String getName() {
        return this.f4127q;
    }

    @Override // Z0.b, Z0.e
    public final void h(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        Shader shader;
        Shader radialGradient;
        if (this.f4128r) {
            return;
        }
        d(this.f4131u, matrix, false);
        int i4 = this.f4132v;
        a1.j jVar = this.f4134x;
        a1.j jVar2 = this.f4136z;
        a1.j jVar3 = this.f4135y;
        if (i4 == 1) {
            long i9 = i();
            s.e eVar = this.f4129s;
            shader = (LinearGradient) eVar.j(i9, null);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                e1.c cVar = (e1.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(cVar.f37241b), cVar.f37240a, Shader.TileMode.CLAMP);
                eVar.k(i9, radialGradient);
                shader = radialGradient;
            }
            this.i.setShader(shader);
            super.h(canvas, matrix, i, c4589b);
        }
        long i10 = i();
        s.e eVar2 = this.f4130t;
        shader = (RadialGradient) eVar2.j(i10, null);
        if (shader == null) {
            PointF pointF3 = (PointF) jVar3.e();
            PointF pointF4 = (PointF) jVar2.e();
            e1.c cVar2 = (e1.c) jVar.e();
            int[] e6 = e(cVar2.f37241b);
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), e6, cVar2.f37240a, Shader.TileMode.CLAMP);
            eVar2.k(i10, radialGradient);
            shader = radialGradient;
        }
        this.i.setShader(shader);
        super.h(canvas, matrix, i, c4589b);
    }

    public final int i() {
        float f6 = this.f4135y.f4305d;
        float f9 = this.f4133w;
        int round = Math.round(f6 * f9);
        int round2 = Math.round(this.f4136z.f4305d * f9);
        int round3 = Math.round(this.f4134x.f4305d * f9);
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }
}
