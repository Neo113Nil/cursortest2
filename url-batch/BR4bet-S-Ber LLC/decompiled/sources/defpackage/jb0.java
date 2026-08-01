package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jb0 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final gb0 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final x6 o;

    public jb0(jb0 jb0Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        x6 x6Var = new x6(0);
        this.o = x6Var;
        this.g = new gb0(jb0Var.g, x6Var);
        this.a = new Path(jb0Var.a);
        this.b = new Path(jb0Var.b);
        this.h = jb0Var.h;
        this.i = jb0Var.i;
        this.j = jb0Var.j;
        this.k = jb0Var.k;
        this.l = jb0Var.l;
        this.m = jb0Var.m;
        String str = jb0Var.m;
        if (str != null) {
            x6Var.put(str, this);
        }
        this.n = jb0Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(gb0 gb0Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = gb0Var.a;
        ArrayList arrayList = gb0Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = gb0Var.a;
        matrix3.preConcat(gb0Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            hb0 hb0Var = (hb0) arrayList.get(i5);
            if (hb0Var instanceof gb0) {
                a((gb0) hb0Var, matrix3, canvas, i, i2);
            } else if (hb0Var instanceof ib0) {
                ib0 ib0Var = (ib0) hb0Var;
                float f3 = i / this.j;
                float f4 = i2 / this.k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    vz[] vzVarArr = ib0Var.a;
                    if (vzVarArr != null) {
                        vz.b(vzVarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (ib0Var instanceof eb0) {
                        path2.setFillType(ib0Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        fb0 fb0Var = (fb0) ib0Var;
                        float f6 = fb0Var.i;
                        if (f6 != 0.0f || fb0Var.j != 1.0f) {
                            float f7 = fb0Var.k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (fb0Var.j + f7) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z);
                            float length = this.f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f;
                            if (f10 > f11) {
                                pathMeasure.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        w4 w4Var = fb0Var.f;
                        if (((Shader) w4Var.c) == null && w4Var.b == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) w4Var.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(fb0Var.h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = w4Var.b;
                                float f12 = fb0Var.h;
                                PorterDuff.Mode mode = mb0.o;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(fb0Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        w4 w4Var2 = fb0Var.d;
                        if (((Shader) w4Var2.c) != null || w4Var2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = fb0Var.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = fb0Var.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(fb0Var.n);
                            Shader shader2 = (Shader) w4Var2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(fb0Var.g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = w4Var2.b;
                                float f13 = fb0Var.g;
                                PorterDuff.Mode mode2 = mb0.o;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(fb0Var.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public jb0() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new x6(0);
        this.g = new gb0();
        this.a = new Path();
        this.b = new Path();
    }
}
