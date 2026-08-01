package l1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f2669p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f2670a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f2671b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f2672c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f2673e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f2674f;

    /* renamed from: g, reason: collision with root package name */
    public final i f2675g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2676j;

    /* renamed from: k, reason: collision with root package name */
    public float f2677k;

    /* renamed from: l, reason: collision with root package name */
    public int f2678l;

    /* renamed from: m, reason: collision with root package name */
    public String f2679m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f2680n;

    /* renamed from: o, reason: collision with root package name */
    public final q.f f2681o;

    public l() {
        this.f2672c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f2676j = 0.0f;
        this.f2677k = 0.0f;
        this.f2678l = 255;
        this.f2679m = null;
        this.f2680n = null;
        this.f2681o = new q.f(0);
        this.f2675g = new i();
        this.f2670a = new Path();
        this.f2671b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(i iVar, Matrix matrix, Canvas canvas, int i, int i4) {
        int i5;
        float f5;
        int i6;
        float f6;
        Matrix matrix2 = iVar.f2658a;
        ArrayList arrayList = iVar.f2659b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f2658a;
        matrix3.preConcat(iVar.f2664j);
        canvas.save();
        char c5 = 0;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            j jVar = (j) arrayList.get(i7);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i, i4);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f7 = i / this.f2676j;
                float f8 = i4 / this.f2677k;
                float min = Math.min(f7, f8);
                Matrix matrix4 = this.f2672c;
                matrix4.set(matrix3);
                matrix4.postScale(f7, f8);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c5], fArr[1]);
                boolean z4 = c5;
                i5 = i7;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f9 = (fArr[z4 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f9) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f2670a;
                    path.reset();
                    f0.d[] dVarArr = kVar.f2666a;
                    if (dVarArr != null) {
                        f0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f2671b;
                    path2.reset();
                    if (kVar instanceof g) {
                        path2.setFillType(kVar.f2668c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f10 = hVar.i;
                        if (f10 != 0.0f || hVar.f2653j != 1.0f) {
                            float f11 = hVar.f2654k;
                            float f12 = (f10 + f11) % 1.0f;
                            float f13 = (hVar.f2653j + f11) % 1.0f;
                            if (this.f2674f == null) {
                                this.f2674f = new PathMeasure();
                            }
                            this.f2674f.setPath(path, z4);
                            float length = this.f2674f.getLength();
                            float f14 = f12 * length;
                            float f15 = f13 * length;
                            path.reset();
                            if (f14 > f15) {
                                this.f2674f.getSegment(f14, length, path, true);
                                f5 = 0.0f;
                                this.f2674f.getSegment(0.0f, f15, path, true);
                            } else {
                                f5 = 0.0f;
                                this.f2674f.getSegment(f14, f15, path, true);
                            }
                            path.rLineTo(f5, f5);
                        }
                        path2.addPath(path, matrix4);
                        e0.d dVar = hVar.f2651f;
                        if (((Shader) dVar.f1322c) == null && dVar.f1321b == 0) {
                            f6 = 255.0f;
                            i6 = 16777215;
                        } else {
                            if (this.f2673e == null) {
                                i6 = 16777215;
                                Paint paint = new Paint(1);
                                this.f2673e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i6 = 16777215;
                            }
                            Paint paint2 = this.f2673e;
                            Shader shader = (Shader) dVar.f1322c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(hVar.h * 255.0f));
                                f6 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i8 = dVar.f1321b;
                                float f16 = hVar.h;
                                PorterDuff.Mode mode = o.f2692o;
                                f6 = 255.0f;
                                paint2.setColor((i8 & i6) | (((int) (Color.alpha(i8) * f16)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(hVar.f2668c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        e0.d dVar2 = hVar.d;
                        if (((Shader) dVar2.f1322c) != null || dVar2.f1321b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = hVar.f2656m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f2655l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f2657n);
                            Shader shader2 = (Shader) dVar2.f1322c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f2652g * f6));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i9 = dVar2.f1321b;
                                float f17 = hVar.f2652g;
                                PorterDuff.Mode mode2 = o.f2692o;
                                paint4.setColor((i9 & i6) | (((int) (Color.alpha(i9) * f17)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(hVar.f2650e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i7 = i5 + 1;
                c5 = 0;
            }
            i5 = i7;
            i7 = i5 + 1;
            c5 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2678l;
    }

    public void setAlpha(float f5) {
        setRootAlpha((int) (f5 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f2678l = i;
    }

    public l(l lVar) {
        this.f2672c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f2676j = 0.0f;
        this.f2677k = 0.0f;
        this.f2678l = 255;
        this.f2679m = null;
        this.f2680n = null;
        q.f fVar = new q.f(0);
        this.f2681o = fVar;
        this.f2675g = new i(lVar.f2675g, fVar);
        this.f2670a = new Path(lVar.f2670a);
        this.f2671b = new Path(lVar.f2671b);
        this.h = lVar.h;
        this.i = lVar.i;
        this.f2676j = lVar.f2676j;
        this.f2677k = lVar.f2677k;
        this.f2678l = lVar.f2678l;
        this.f2679m = lVar.f2679m;
        String str = lVar.f2679m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f2680n = lVar.f2680n;
    }
}
