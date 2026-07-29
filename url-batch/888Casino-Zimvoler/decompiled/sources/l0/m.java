package l0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3121p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3122a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3123b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3124c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3125e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3126f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3127g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3128j;

    /* renamed from: k, reason: collision with root package name */
    public float f3129k;

    /* renamed from: l, reason: collision with root package name */
    public int f3130l;

    /* renamed from: m, reason: collision with root package name */
    public String f3131m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3132n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3133o;

    public m() {
        this.f3124c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3128j = 0.0f;
        this.f3129k = 0.0f;
        this.f3130l = 255;
        this.f3131m = null;
        this.f3132n = null;
        this.f3133o = new o.b();
        this.f3127g = new j();
        this.f3122a = new Path();
        this.f3123b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3105j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        jVar.f3110a.set(matrix);
        Matrix matrix3 = jVar.f3110a;
        matrix3.preConcat(jVar.f3116j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = jVar.f3111b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i5);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f3 = i / this.f3128j;
                float f4 = i2 / this.f3129k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3124c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f3122a;
                    lVar.getClass();
                    path.reset();
                    C.g[] gVarArr = lVar.f3118a;
                    if (gVarArr != null) {
                        C.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3123b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f3120c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f6 = iVar.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = iVar.f3106k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (iVar.f3105j + f8) % f7;
                        if (this.f3126f == null) {
                            this.f3126f = new PathMeasure();
                        }
                        this.f3126f.setPath(path, r11);
                        float length = this.f3126f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3126f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3126f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3126f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = iVar.f3103f;
                        if ((((Shader) dVar.f19c) == null && dVar.f18b == 0) ? r11 : true) {
                            if (this.f3125e == null) {
                                Paint paint = new Paint(1);
                                this.f3125e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3125e;
                            Shader shader = (Shader) dVar.f19c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f18b;
                                float f13 = iVar.h;
                                PorterDuff.Mode mode = p.f3144j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f3120c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = iVar.d;
                        if (((Shader) dVar2.f19c) != null || dVar2.f18b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f3108m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f3107l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f3109n);
                            Shader shader2 = (Shader) dVar2.f19c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f3104g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f18b;
                                float f14 = iVar.f3104g;
                                PorterDuff.Mode mode2 = p.f3144j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f3102e * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i3 = 1;
            } else {
                matrix2 = matrix3;
                i3 = i4;
            }
            i5 += i3;
            i4 = i3;
            matrix3 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3130l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3130l = i;
    }

    public m(m mVar) {
        this.f3124c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3128j = 0.0f;
        this.f3129k = 0.0f;
        this.f3130l = 255;
        this.f3131m = null;
        this.f3132n = null;
        o.b bVar = new o.b();
        this.f3133o = bVar;
        this.f3127g = new j(mVar.f3127g, bVar);
        this.f3122a = new Path(mVar.f3122a);
        this.f3123b = new Path(mVar.f3123b);
        this.h = mVar.h;
        this.i = mVar.i;
        this.f3128j = mVar.f3128j;
        this.f3129k = mVar.f3129k;
        this.f3130l = mVar.f3130l;
        this.f3131m = mVar.f3131m;
        String str = mVar.f3131m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3132n = mVar.f3132n;
    }
}
