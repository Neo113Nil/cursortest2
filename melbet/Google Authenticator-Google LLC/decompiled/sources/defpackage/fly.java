package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fly extends flv {
    final Pair f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private boolean n;
    private float o;

    public fly(fmg fmgVar) {
        super(fmgVar);
        this.g = 300.0f;
        this.f = new Pair(new gdy(), new gdy());
    }

    private final void j(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        float f7;
        float f8;
        Canvas canvas2;
        Pair pair;
        float f9 = 1.0f - this.o;
        float i4 = pj.i(f, 0.0f, 1.0f);
        float f10 = ((1.0f - i4) * f9) + i4;
        float f11 = this.g;
        float f12 = f10 * f11;
        float i5 = pj.i(f2, 0.0f, 1.0f);
        float f13 = ((1.0f - i5) * f9) + i5;
        float f14 = this.i;
        float f15 = this.j;
        int i6 = (int) (f12 + ((int) ((i2 * pj.i(f10, 0.0f, 0.01f)) / 0.01f)));
        int i7 = (int) ((f11 * f13) - ((int) ((i3 * (1.0f - pj.i(f13, 0.99f, 1.0f))) / 0.01f)));
        if (f14 != f15) {
            float max = Math.max(f14, f15);
            float f16 = this.g;
            float f17 = max / f16;
            float f18 = this.i;
            float f19 = this.j;
            float i8 = pj.i(i6 / f16, 0.0f, f17) / f17;
            float i9 = pj.i((f16 - i7) / f16, 0.0f, f17) / f17;
            float f20 = ((1.0f - i9) * f18) + (i9 * f19);
            f5 = ((1.0f - i8) * f18) + (i8 * f19);
            f6 = f20;
        } else {
            f5 = f14;
            f6 = f5;
        }
        float f21 = -this.g;
        fmg fmgVar = (fmg) this.a;
        boolean z2 = fmgVar.c(this.n) && z && f3 > 0.0f;
        if (i6 <= i7) {
            float f22 = f21 / 2.0f;
            float f23 = i6 + f5;
            float f24 = i7 - f6;
            float f25 = f5 + f5;
            boolean z3 = z2;
            float f26 = f6 + f6;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.h);
            Pair pair2 = this.f;
            ((gdy) pair2.first).g();
            ((gdy) pair2.second).g();
            ((gdy) pair2.first).j(f23 + f22);
            ((gdy) pair2.second).j(f22 + f24);
            if (i6 == 0 && f24 + f6 < f23 + f5) {
                k(canvas, paint, (gdy) pair2.first, f25, this.h, f5, (gdy) pair2.second, f26, this.h, f6, true);
                return;
            }
            if (f23 - f5 > f24 - f6) {
                k(canvas, paint, (gdy) pair2.second, f26, this.h, f6, (gdy) pair2.first, f25, this.h, f5, false);
                return;
            }
            float f27 = f6;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(fmgVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z3) {
                PathMeasure pathMeasure = this.d;
                Path path = this.c;
                float f28 = this.g;
                float f29 = f23 / f28;
                float f30 = f24 / f28;
                int i10 = this.n ? fmgVar.j : fmgVar.k;
                if (i10 != this.m) {
                    this.m = i10;
                    g();
                }
                path.rewind();
                float f31 = (-this.g) / 2.0f;
                boolean c = fmgVar.c(this.n);
                if (c) {
                    float f32 = this.g;
                    f7 = f25;
                    float f33 = this.l;
                    float f34 = f32 / f33;
                    float f35 = f4 / f34;
                    f31 -= f33 * f4;
                    float f36 = f34 / (f34 + 1.0f);
                    f30 = (f30 + f35) * f36;
                    f29 = (f29 + f35) * f36;
                } else {
                    f7 = f25;
                }
                float length = f29 * pathMeasure.getLength();
                float length2 = f30 * pathMeasure.getLength();
                pathMeasure.getSegment(length, length2, path, true);
                gdy gdyVar = (gdy) pair2.first;
                gdyVar.g();
                f8 = f5;
                pathMeasure.getPosTan(length, (float[]) gdyVar.b, (float[]) gdyVar.c);
                gdy gdyVar2 = (gdy) pair2.second;
                gdyVar2.g();
                pathMeasure.getPosTan(length2, (float[]) gdyVar2.b, (float[]) gdyVar2.c);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f31, 0.0f);
                gdyVar.j(f31);
                gdyVar2.j(f31);
                if (c) {
                    float f37 = this.k * f3;
                    matrix.postScale(1.0f, f37);
                    gdyVar.i(f37);
                    gdyVar2.i(f37);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                canvas.drawLine(((float[]) ((gdy) pair2.first).b)[0], ((float[]) ((gdy) pair2.first).b)[1], ((float[]) ((gdy) pair2.second).b)[0], ((float[]) ((gdy) pair2.second).b)[1], paint);
                canvas2 = canvas;
                f7 = f25;
                f8 = f5;
            }
            if (fmgVar.f()) {
                return;
            }
            if (f23 <= 0.0f || f8 <= 0.0f) {
                pair = pair2;
            } else {
                pair = pair2;
                k(canvas2, paint, (gdy) pair2.first, f7, this.h, f8, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f24 >= this.g || f27 <= 0.0f) {
                return;
            }
            k(canvas, paint, (gdy) pair.second, f26, this.h, f27, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    private final void k(Canvas canvas, Paint paint, gdy gdyVar, float f, float f2, float f3, gdy gdyVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float min = Math.min(f2, this.h);
        float f9 = -min;
        float f10 = min / 2.0f;
        float f11 = (-f) / 2.0f;
        float f12 = f9 / 2.0f;
        float f13 = f / 2.0f;
        RectF rectF = new RectF(f11, f12, f13, f10);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (gdyVar2 != null) {
            float min2 = Math.min(f5, this.h);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.h);
            RectF rectF2 = new RectF();
            if (z) {
                c = 1;
                float f14 = (((float[]) gdyVar2.b)[0] - min3) - (((float[]) gdyVar.b)[0] - f3);
                if (f14 > 0.0f) {
                    gdyVar2.j((-f14) / 2.0f);
                    f8 = f4 + f14;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f12, f13, f10);
            } else {
                c = 1;
                float f15 = (((float[]) gdyVar2.b)[0] + min3) - (((float[]) gdyVar.b)[0] + f3);
                if (f15 < 0.0f) {
                    gdyVar2.j((-f15) / 2.0f);
                    f7 = f4 - f15;
                } else {
                    f7 = f4;
                }
                rectF2.set(f11, f12, 0.0f, f10);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            float[] fArr = (float[]) gdyVar2.b;
            canvas.translate(fArr[0], fArr[c]);
            canvas.rotate(i((float[]) gdyVar2.c));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i((float[]) gdyVar2.c));
            float[] fArr2 = (float[]) gdyVar2.b;
            canvas.translate(-fArr2[0], -fArr2[c]);
            float[] fArr3 = (float[]) gdyVar.b;
            canvas.translate(fArr3[0], fArr3[c]);
            canvas.rotate(i((float[]) gdyVar.c));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = (float[]) gdyVar.b;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i((float[]) gdyVar.c));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.flv
    public final int a() {
        fmg fmgVar = (fmg) this.a;
        int i = fmgVar.a;
        int i2 = fmgVar.l;
        return i + i2 + i2;
    }

    @Override // defpackage.flv
    public final int b() {
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r10.h == 3) goto L29;
     */
    @Override // defpackage.flv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.g != rect.width()) {
            this.g = rect.width();
            g();
        }
        float a = a();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - a) / 2.0f));
        fmg fmgVar = (fmg) this.a;
        if (fmgVar.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.g / 2.0f;
        float f3 = a / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        float f4 = fmgVar.a;
        this.h = f4 * f;
        this.i = Math.min(r0 / 2, fmgVar.a()) * f;
        this.k = fmgVar.l * f;
        this.j = Math.min(f4 / 2.0f, fmgVar.g()) * f;
        if (!z) {
            if (z2) {
                z2 = true;
            }
            f = 1.0f;
            this.o = f;
        }
        if ((z && fmgVar.g == 2) || (z2 && fmgVar.h == 1)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (z || fmgVar.h != 3) {
            canvas.translate(0.0f, (f4 * (1.0f - f)) / 2.0f);
        }
        if (z2) {
        }
        f = 1.0f;
        this.o = f;
    }

    @Override // defpackage.flv
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
        int b = fhq.b(i, i2);
        this.n = false;
        fmg fmgVar = (fmg) this.a;
        int i3 = fmgVar.t;
        int min = Math.min(i3, fmgVar.a);
        if (min <= 0 || b == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(b);
        Integer num = fmgVar.u;
        float f = min;
        k(canvas, paint, new gdy(new float[]{(this.g / 2.0f) - (num != null ? num.floatValue() + (i3 / 2.0f) : this.h / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f, f, (this.i * f) / this.h, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // defpackage.flv
    public final void e(Canvas canvas, Paint paint, flu fluVar, int i) {
        int b = fhq.b(fluVar.c, i);
        this.n = fluVar.h;
        float f = fluVar.a;
        float f2 = fluVar.b;
        int i2 = fluVar.d;
        j(canvas, paint, f, f2, b, i2, i2, fluVar.e, fluVar.f, true);
    }

    @Override // defpackage.flv
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int b = fhq.b(i, i2);
        this.n = false;
        j(canvas, paint, f, f2, b, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.flv
    public final void g() {
        Path path = this.b;
        path.rewind();
        fmg fmgVar = (fmg) this.a;
        if (fmgVar.c(this.n)) {
            int i = this.n ? fmgVar.j : fmgVar.k;
            float f = this.g;
            int i2 = (int) (f / i);
            this.l = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 + i3;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                path.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.l / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.g, 0.0f);
        }
        this.d.setPath(path, false);
    }
}
