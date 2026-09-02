package k1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f2197p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f2198a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f2199b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f2200c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f2201e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f2202f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2203g;

    /* renamed from: h, reason: collision with root package name */
    public float f2204h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f2205j;

    /* renamed from: k, reason: collision with root package name */
    public float f2206k;

    /* renamed from: l, reason: collision with root package name */
    public int f2207l;

    /* renamed from: m, reason: collision with root package name */
    public String f2208m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f2209n;

    /* renamed from: o, reason: collision with root package name */
    public final q.f f2210o;

    public m() {
        this.f2200c = new Matrix();
        this.f2204h = 0.0f;
        this.i = 0.0f;
        this.f2205j = 0.0f;
        this.f2206k = 0.0f;
        this.f2207l = 255;
        this.f2208m = null;
        this.f2209n = null;
        this.f2210o = new q.f(0);
        this.f2203g = new j();
        this.f2198a = new Path();
        this.f2199b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i4) {
        int i5;
        float f2;
        int i6;
        float f4;
        Matrix matrix2 = jVar.f2185a;
        ArrayList arrayList = jVar.f2186b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f2185a;
        matrix3.preConcat(jVar.f2192j);
        canvas.save();
        char c4 = 0;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            k kVar = (k) arrayList.get(i7);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i, i4);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f5 = i / this.f2205j;
                float f6 = i4 / this.f2206k;
                float min = Math.min(f5, f6);
                Matrix matrix4 = this.f2200c;
                matrix4.set(matrix3);
                matrix4.postScale(f5, f6);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c4], fArr[1]);
                boolean z3 = c4;
                i5 = i7;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f7 = (fArr[z3 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f7) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f2198a;
                    path.reset();
                    f0.e[] eVarArr = lVar.f2194a;
                    if (eVarArr != null) {
                        f0.e.b(eVarArr, path);
                    }
                    Path path2 = this.f2199b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f2196c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f8 = iVar.i;
                        if (f8 != 0.0f || iVar.f2180j != 1.0f) {
                            float f9 = iVar.f2181k;
                            float f10 = (f8 + f9) % 1.0f;
                            float f11 = (iVar.f2180j + f9) % 1.0f;
                            if (this.f2202f == null) {
                                this.f2202f = new PathMeasure();
                            }
                            this.f2202f.setPath(path, z3);
                            float length = this.f2202f.getLength();
                            float f12 = f10 * length;
                            float f13 = f11 * length;
                            path.reset();
                            if (f12 > f13) {
                                this.f2202f.getSegment(f12, length, path, true);
                                f2 = 0.0f;
                                this.f2202f.getSegment(0.0f, f13, path, true);
                            } else {
                                f2 = 0.0f;
                                this.f2202f.getSegment(f12, f13, path, true);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix4);
                        e0.d dVar = iVar.f2177f;
                        if (((Shader) dVar.f1139b) == null && dVar.f1138a == 0) {
                            f4 = 255.0f;
                            i6 = 16777215;
                        } else {
                            if (this.f2201e == null) {
                                i6 = 16777215;
                                Paint paint = new Paint(1);
                                this.f2201e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i6 = 16777215;
                            }
                            Paint paint2 = this.f2201e;
                            Shader shader = (Shader) dVar.f1139b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f2179h * 255.0f));
                                f4 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i8 = dVar.f1138a;
                                float f14 = iVar.f2179h;
                                PorterDuff.Mode mode = p.f2222o;
                                f4 = 255.0f;
                                paint2.setColor((i8 & i6) | (((int) (Color.alpha(i8) * f14)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f2196c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        e0.d dVar2 = iVar.d;
                        if (((Shader) dVar2.f1139b) != null || dVar2.f1138a != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f2183m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f2182l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f2184n);
                            Shader shader2 = (Shader) dVar2.f1139b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f2178g * f4));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i9 = dVar2.f1138a;
                                float f15 = iVar.f2178g;
                                PorterDuff.Mode mode2 = p.f2222o;
                                paint4.setColor((i9 & i6) | (((int) (Color.alpha(i9) * f15)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f2176e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i7 = i5 + 1;
                c4 = 0;
            }
            i5 = i7;
            i7 = i5 + 1;
            c4 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2207l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f2207l = i;
    }

    public m(m mVar) {
        this.f2200c = new Matrix();
        this.f2204h = 0.0f;
        this.i = 0.0f;
        this.f2205j = 0.0f;
        this.f2206k = 0.0f;
        this.f2207l = 255;
        this.f2208m = null;
        this.f2209n = null;
        q.f fVar = new q.f(0);
        this.f2210o = fVar;
        this.f2203g = new j(mVar.f2203g, fVar);
        this.f2198a = new Path(mVar.f2198a);
        this.f2199b = new Path(mVar.f2199b);
        this.f2204h = mVar.f2204h;
        this.i = mVar.i;
        this.f2205j = mVar.f2205j;
        this.f2206k = mVar.f2206k;
        this.f2207l = mVar.f2207l;
        this.f2208m = mVar.f2208m;
        String str = mVar.f2208m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f2209n = mVar.f2209n;
    }
}
