package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class flc extends flv {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private float o;
    private final RectF p;
    private final Pair q;

    public flc(fln flnVar) {
        super(flnVar);
        this.p = new RectF();
        this.q = new Pair(new gdy(), new gdy());
    }

    private final int j() {
        fln flnVar = (fln) this.a;
        int i = flnVar.r;
        int i2 = flnVar.s;
        return i + i2 + i2;
    }

    private final void k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                k(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f9 = (-0.99f) + f6;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float f11 = this.o;
        float f12 = 1.0f - f11;
        float f13 = (1.0f - f6) * 0.0f;
        float f14 = f6 * f11;
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = (((f13 + f14) * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f15 = ((1.0f - f7) * f12) + f7;
        if (degrees3 <= 0.0f) {
            return;
        }
        fln flnVar = (fln) this.a;
        boolean z2 = false;
        if (flnVar.c(this.n) && z && f3 > 0.0f) {
            z2 = true;
        }
        float f16 = (f15 * 360.0f) + degrees2;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f17 = this.g;
        float f18 = f17 + f17;
        float f19 = degrees + degrees;
        if (degrees3 < f19) {
            float f20 = degrees3 / f19;
            float f21 = f16 + (degrees * f20);
            gdy gdyVar = new gdy();
            if (z2) {
                PathMeasure pathMeasure = this.d;
                float length = ((f21 / 360.0f) * pathMeasure.getLength()) / 2.0f;
                float f22 = this.h * f3;
                float f23 = this.i;
                if (f23 != this.m || f22 != this.k) {
                    this.k = f22;
                    this.m = f23;
                    g();
                }
                pathMeasure.getPosTan(length, (float[]) gdyVar.b, (float[]) gdyVar.c);
            } else {
                gdyVar.h(f21 + 90.0f);
                gdyVar.e(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            l(canvas, paint, gdyVar, f18, this.f, f20);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(flnVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f24 = f16 + degrees;
        float f25 = degrees3 - f19;
        Pair pair = this.q;
        ((gdy) pair.first).g();
        ((gdy) pair.second).g();
        if (z2) {
            PathMeasure pathMeasure2 = this.d;
            Path path = this.c;
            float f26 = f24 / 360.0f;
            float f27 = f25 / 360.0f;
            float f28 = this.h * f3;
            int i4 = this.n ? flnVar.j : flnVar.k;
            float f29 = this.i;
            if (f29 != this.m || f28 != this.k || i4 != this.l) {
                this.k = f28;
                this.l = i4;
                this.m = f29;
                g();
            }
            path.rewind();
            float i5 = pj.i(f27, 0.0f, 1.0f);
            if (flnVar.c(this.n)) {
                float f30 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f26 += f30;
                f5 = -(f30 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f31 = f26 % 1.0f;
            float length2 = (pathMeasure2.getLength() * f31) / 2.0f;
            float length3 = ((f31 + i5) * pathMeasure2.getLength()) / 2.0f;
            pathMeasure2.getSegment(length2, length3, path, true);
            gdy gdyVar2 = (gdy) pair.first;
            gdyVar2.g();
            pathMeasure2.getPosTan(length2, (float[]) gdyVar2.b, (float[]) gdyVar2.c);
            gdy gdyVar3 = (gdy) pair.second;
            gdyVar3.g();
            pathMeasure2.getPosTan(length3, (float[]) gdyVar3.b, (float[]) gdyVar3.c);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f5);
            gdyVar2.h(f5);
            gdyVar3.h(f5);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((gdy) pair.first).h(f24 + 90.0f);
            ((gdy) pair.first).e(-this.i);
            ((gdy) pair.second).h(f24 + f25 + 90.0f);
            ((gdy) pair.second).e(-this.i);
            RectF rectF = this.p;
            float f32 = this.i;
            float f33 = -f32;
            rectF.set(f33, f33, f32, f32);
            canvas.drawArc(rectF, f24, f25, false, paint);
            canvas2 = canvas;
        }
        if (flnVar.f() || this.g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        l(canvas2, paint, (gdy) pair.first, f18, this.f, 1.0f);
        l(canvas, paint, (gdy) pair.second, f18, this.f, 1.0f);
    }

    private final void l(Canvas canvas, Paint paint, gdy gdyVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.f);
        float f4 = (this.g * min) / this.f;
        float f5 = -f;
        float f6 = f / 2.0f;
        float min2 = Math.min(f6, f4);
        RectF rectF = new RectF(f5 / 2.0f, (-min) / 2.0f, f6, min / 2.0f);
        canvas.save();
        float[] fArr = (float[]) gdyVar.b;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i((float[]) gdyVar.c));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    @Override // defpackage.flv
    public final int a() {
        return j();
    }

    @Override // defpackage.flv
    public final int b() {
        return j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r4.h == 3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r4.h == 2) goto L28;
     */
    @Override // defpackage.flv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float width = rect.width();
        float j = j();
        float height = rect.height();
        float j2 = j();
        fln flnVar = (fln) this.a;
        int i = flnVar.r;
        float f2 = (i / 2.0f) + flnVar.s;
        float f3 = width / j;
        float f4 = height / j2;
        canvas.translate((f2 * f3) + rect.left, (f2 * f4) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(f3, f4);
        if (flnVar.t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f5 = -f2;
        canvas.clipRect(f5, f5, f2, f2);
        float f6 = flnVar.a;
        this.f = f6 * f;
        this.g = Math.min(r11 / 2, flnVar.a()) * f;
        this.h = flnVar.l * f;
        float f7 = (i - r11) / 2.0f;
        this.i = f7;
        boolean z3 = true;
        if (!z) {
            if (z2) {
                z2 = true;
            }
            f = 1.0f;
            this.o = f;
        }
        float f8 = ((1.0f - f) * f6) / 2.0f;
        if ((z && flnVar.g == 2) || (z2 && flnVar.h == 1)) {
            this.i = f7 + f8;
        } else {
            if (z && flnVar.g == 1) {
                z3 = z2;
            } else if (z2) {
            }
            this.i = f7 - f8;
            z2 = z3;
        }
        if (z2) {
        }
        f = 1.0f;
        this.o = f;
    }

    @Override // defpackage.flv
    public final void e(Canvas canvas, Paint paint, flu fluVar, int i) {
        int b = fhq.b(fluVar.c, i);
        canvas.save();
        canvas.rotate(fluVar.g);
        this.n = fluVar.h;
        float f = fluVar.a;
        float f2 = fluVar.b;
        int i2 = fluVar.d;
        k(canvas, paint, f, f2, b, i2, i2, fluVar.e, fluVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.flv
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int b = fhq.b(i, i2);
        this.n = false;
        k(canvas, paint, f, f2, b, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.flv
    public final void g() {
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        if (((fln) this.a).c(this.n)) {
            PathMeasure pathMeasure = this.d;
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            int max = Math.max(3, (int) ((length / (this.n ? r1.j : r1.k)) / 2.0f));
            int i2 = max + max;
            this.j = length / i2;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                gdy gdyVar = new gdy();
                float f3 = i3;
                pathMeasure.getPosTan(this.j * f3, (float[]) gdyVar.b, (float[]) gdyVar.c);
                gdy gdyVar2 = new gdy();
                float f4 = this.j;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) gdyVar2.b, (float[]) gdyVar2.c);
                arrayList.add(gdyVar);
                gdyVar2.e(f2 + f2);
                arrayList.add(gdyVar2);
            }
            arrayList.add((gdy) arrayList.get(0));
            gdy gdyVar3 = (gdy) arrayList.get(0);
            float[] fArr = (float[]) gdyVar3.b;
            path.moveTo(fArr[0], fArr[1]);
            int i4 = 1;
            while (i4 < arrayList.size()) {
                gdy gdyVar4 = (gdy) arrayList.get(i4);
                float f5 = this.j / 2.0f;
                gdy gdyVar5 = new gdy(gdyVar3);
                gdy gdyVar6 = new gdy(gdyVar4);
                float f6 = f5 * 0.48f;
                gdyVar5.f(f6);
                gdyVar6.f(-f6);
                float[] fArr2 = (float[]) gdyVar5.b;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) gdyVar6.b;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) gdyVar4.b;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i4++;
                gdyVar3 = gdyVar4;
            }
        }
        this.d.setPath(path, false);
    }

    @Override // defpackage.flv
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
    }
}
