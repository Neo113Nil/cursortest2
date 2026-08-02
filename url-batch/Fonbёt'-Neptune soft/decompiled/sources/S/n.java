package S;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import h0.C0202j;
import java.util.ArrayList;
import n.C0268a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f1034p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f1035a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f1036b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f1037c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f1038d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f1039e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f1040f;

    /* renamed from: g, reason: collision with root package name */
    public final k f1041g;

    /* renamed from: h, reason: collision with root package name */
    public float f1042h;

    /* renamed from: i, reason: collision with root package name */
    public float f1043i;

    /* renamed from: j, reason: collision with root package name */
    public float f1044j;

    /* renamed from: k, reason: collision with root package name */
    public float f1045k;

    /* renamed from: l, reason: collision with root package name */
    public int f1046l;

    /* renamed from: m, reason: collision with root package name */
    public String f1047m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f1048n;

    /* renamed from: o, reason: collision with root package name */
    public final C0268a f1049o;

    public n() {
        this.f1037c = new Matrix();
        this.f1042h = 0.0f;
        this.f1043i = 0.0f;
        this.f1044j = 0.0f;
        this.f1045k = 0.0f;
        this.f1046l = 255;
        this.f1047m = null;
        this.f1048n = null;
        this.f1049o = new C0268a();
        this.f1041g = new k();
        this.f1035a = new Path();
        this.f1036b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
    
        if (r0.f1015j != 1.0f) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i2, int i3) {
        Matrix matrix2;
        float f2;
        char c2 = 1;
        kVar.f1020a.set(matrix);
        Matrix matrix3 = kVar.f1020a;
        matrix3.preConcat(kVar.f1029j);
        canvas.save();
        ?? r11 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = kVar.f1021b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            l lVar = (l) arrayList.get(i4);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i2, i3);
            } else if (lVar instanceof m) {
                m mVar = (m) lVar;
                float f3 = i2 / this.f1044j;
                float f4 = i3 / this.f1045k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f1037c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[c2]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f1035a;
                    mVar.getClass();
                    path.reset();
                    t.d[] dVarArr = mVar.f1031a;
                    if (dVarArr != null) {
                        t.d.b(dVarArr, path);
                    }
                    Path path2 = this.f1036b;
                    path2.reset();
                    if (mVar instanceof i) {
                        path2.setFillType(mVar.f1033c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        j jVar = (j) mVar;
                        float f6 = jVar.f1014i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = jVar.f1016k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (jVar.f1015j + f8) % f7;
                        if (this.f1040f == null) {
                            this.f1040f = new PathMeasure();
                        }
                        this.f1040f.setPath(path, r11);
                        float length = this.f1040f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f1040f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f1040f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f1040f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        C0202j c0202j = jVar.f1011f;
                        if ((((Shader) c0202j.f2319b) == null && c0202j.f2318a == 0) ? false : true) {
                            if (this.f1039e == null) {
                                Paint paint = new Paint(1);
                                this.f1039e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f1039e;
                            Shader shader = (Shader) c0202j.f2319b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(jVar.f1013h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i5 = c0202j.f2318a;
                                float f13 = jVar.f1013h;
                                PorterDuff.Mode mode = q.f1063n;
                                paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(jVar.f1033c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0202j c0202j2 = jVar.f1009d;
                        if (((Shader) c0202j2.f2319b) != null || c0202j2.f2318a != 0) {
                            if (this.f1038d == null) {
                                Paint paint3 = new Paint(1);
                                this.f1038d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f1038d;
                            Paint.Join join = jVar.f1018m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = jVar.f1017l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(jVar.f1019n);
                            Shader shader2 = (Shader) c0202j2.f2319b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(jVar.f1012g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i6 = c0202j2.f2318a;
                                float f14 = jVar.f1012g;
                                PorterDuff.Mode mode2 = q.f1063n;
                                paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(jVar.f1010e * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i4++;
                matrix3 = matrix2;
                c2 = 1;
                r11 = 0;
            }
            matrix2 = matrix3;
            i4++;
            matrix3 = matrix2;
            c2 = 1;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1046l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f1046l = i2;
    }

    public n(n nVar) {
        this.f1037c = new Matrix();
        this.f1042h = 0.0f;
        this.f1043i = 0.0f;
        this.f1044j = 0.0f;
        this.f1045k = 0.0f;
        this.f1046l = 255;
        this.f1047m = null;
        this.f1048n = null;
        C0268a c0268a = new C0268a();
        this.f1049o = c0268a;
        this.f1041g = new k(nVar.f1041g, c0268a);
        this.f1035a = new Path(nVar.f1035a);
        this.f1036b = new Path(nVar.f1036b);
        this.f1042h = nVar.f1042h;
        this.f1043i = nVar.f1043i;
        this.f1044j = nVar.f1044j;
        this.f1045k = nVar.f1045k;
        this.f1046l = nVar.f1046l;
        this.f1047m = nVar.f1047m;
        String str = nVar.f1047m;
        if (str != null) {
            c0268a.put(str, this);
        }
        this.f1048n = nVar.f1048n;
    }
}
