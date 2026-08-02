package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqn {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final aql d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final qi l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public aqn(aqn aqnVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        qi qiVar = new qi();
        this.l = qiVar;
        this.d = new aql(aqnVar.d, qiVar);
        this.m = new Path(aqnVar.m);
        this.n = new Path(aqnVar.n);
        this.e = aqnVar.e;
        this.f = aqnVar.f;
        this.g = aqnVar.g;
        this.h = aqnVar.h;
        int i = aqnVar.q;
        this.q = 0;
        this.i = aqnVar.i;
        this.j = aqnVar.j;
        String str = aqnVar.j;
        if (str != null) {
            qiVar.put(str, this);
        }
        this.k = aqnVar.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(aql aqlVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        Matrix matrix2;
        float f;
        Matrix matrix3 = aqlVar.a;
        matrix3.set(matrix);
        matrix3.preConcat(aqlVar.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = aqlVar.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            ym ymVar = (ym) arrayList.get(i4);
            if (ymVar instanceof aql) {
                a((aql) ymVar, matrix3, canvas, i, i2);
            } else if (ymVar instanceof aqm) {
                aqm aqmVar = (aqm) ymVar;
                float f2 = i / this.g;
                float f3 = i2 / this.h;
                Matrix matrix4 = this.o;
                float min = Math.min(f2, f3);
                matrix4.set(matrix3);
                matrix4.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z = c;
                i3 = i4;
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = fArr[z ? 1 : 0];
                float f5 = fArr[1];
                float f6 = fArr[2];
                float f7 = f4 * fArr[3];
                float f8 = f5 * f6;
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f7 - f8) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    vc[] vcVarArr = aqmVar.m;
                    if (vcVarArr != null) {
                        pi.s(vcVarArr, path);
                    }
                    Path path2 = this.n;
                    path2.reset();
                    if (aqmVar.s()) {
                        path2.setFillType(aqmVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        aqk aqkVar = (aqk) aqmVar;
                        float f9 = aqkVar.e;
                        if (f9 == 0.0f && aqkVar.f == 1.0f) {
                            matrix2 = matrix3;
                        } else {
                            float f10 = aqkVar.g;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (aqkVar.f + f10) % 1.0f;
                            PathMeasure pathMeasure = this.p;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.p = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.p.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            PathMeasure pathMeasure4 = this.p;
                            if (f13 > f14) {
                                matrix2 = matrix3;
                                pathMeasure4.getSegment(f13, length, path, true);
                                f = 0.0f;
                                this.p.getSegment(0.0f, f14, path, true);
                            } else {
                                matrix2 = matrix3;
                                f = 0.0f;
                                pathMeasure4.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        if (aqkVar.l.g()) {
                            ifn ifnVar = aqkVar.l;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (ifnVar.d()) {
                                Shader shader = (Shader) ifnVar.c;
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(aqkVar.d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(aqq.a(ifnVar.b, aqkVar.d));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(aqkVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        if (aqkVar.k.g()) {
                            ifn ifnVar2 = aqkVar.k;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = aqkVar.i;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = aqkVar.h;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(aqkVar.j);
                            if (ifnVar2.d()) {
                                Shader shader2 = (Shader) ifnVar2.c;
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(aqkVar.c * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(aqq.a(ifnVar2.b, aqkVar.c));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(aqkVar.b * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                        i4 = i3 + 1;
                        matrix3 = matrix2;
                        c = 0;
                    }
                }
                matrix2 = matrix3;
                i4 = i3 + 1;
                matrix3 = matrix2;
                c = 0;
            }
            matrix2 = matrix3;
            i3 = i4;
            i4 = i3 + 1;
            matrix3 = matrix2;
            c = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public aqn() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new qi();
        this.d = new aql();
        this.m = new Path();
        this.n = new Path();
    }
}
