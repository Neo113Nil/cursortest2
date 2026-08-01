package g1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f1794p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f1795a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f1796b;
    public final Matrix c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f1797d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f1798e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f1799f;
    public final j g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f1800i;

    /* renamed from: j, reason: collision with root package name */
    public float f1801j;

    /* renamed from: k, reason: collision with root package name */
    public float f1802k;

    /* renamed from: l, reason: collision with root package name */
    public int f1803l;

    /* renamed from: m, reason: collision with root package name */
    public String f1804m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f1805n;

    /* renamed from: o, reason: collision with root package name */
    public final n.f f1806o;

    public m() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.f1800i = 0.0f;
        this.f1801j = 0.0f;
        this.f1802k = 0.0f;
        this.f1803l = 255;
        this.f1804m = null;
        this.f1805n = null;
        this.f1806o = new n.f(0);
        this.g = new j();
        this.f1795a = new Path();
        this.f1796b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i4, int i5) {
        int i6;
        float f4;
        int i7;
        float f5;
        Matrix matrix2 = jVar.f1784a;
        ArrayList arrayList = jVar.f1785b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f1784a;
        matrix3.preConcat(jVar.f1790j);
        canvas.save();
        char c = 0;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            k kVar = (k) arrayList.get(i8);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i4, i5);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f6 = i4 / this.f1801j;
                float f7 = i5 / this.f1802k;
                float min = Math.min(f6, f7);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f6, f7);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z3 = c;
                i6 = i8;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f8 = (fArr[z3 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f8) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f1795a;
                    path.reset();
                    c0.e[] eVarArr = lVar.f1792a;
                    if (eVarArr != null) {
                        c0.e.b(eVarArr, path);
                    }
                    Path path2 = this.f1796b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f9 = iVar.f1778i;
                        if (f9 != 0.0f || iVar.f1779j != 1.0f) {
                            float f10 = iVar.f1780k;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (iVar.f1779j + f10) % 1.0f;
                            if (this.f1799f == null) {
                                this.f1799f = new PathMeasure();
                            }
                            this.f1799f.setPath(path, z3);
                            float length = this.f1799f.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                this.f1799f.getSegment(f13, length, path, true);
                                f4 = 0.0f;
                                this.f1799f.getSegment(0.0f, f14, path, true);
                            } else {
                                f4 = 0.0f;
                                this.f1799f.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f4, f4);
                        }
                        path2.addPath(path, matrix4);
                        b0.d dVar = iVar.f1777f;
                        if (((Shader) dVar.c) == null && dVar.f699b == 0) {
                            f5 = 255.0f;
                            i7 = 16777215;
                        } else {
                            if (this.f1798e == null) {
                                i7 = 16777215;
                                Paint paint = new Paint(1);
                                this.f1798e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i7 = 16777215;
                            }
                            Paint paint2 = this.f1798e;
                            Shader shader = (Shader) dVar.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f5 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i9 = dVar.f699b;
                                float f15 = iVar.h;
                                PorterDuff.Mode mode = p.f1817o;
                                f5 = 255.0f;
                                paint2.setColor((i9 & i7) | (((int) (Color.alpha(i9) * f15)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        b0.d dVar2 = iVar.f1775d;
                        if (((Shader) dVar2.c) != null || dVar2.f699b != 0) {
                            if (this.f1797d == null) {
                                Paint paint3 = new Paint(1);
                                this.f1797d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f1797d;
                            Paint.Join join = iVar.f1782m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f1781l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f1783n);
                            Shader shader2 = (Shader) dVar2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.g * f5));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i10 = dVar2.f699b;
                                float f16 = iVar.g;
                                PorterDuff.Mode mode2 = p.f1817o;
                                paint4.setColor((i10 & i7) | (((int) (Color.alpha(i10) * f16)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f1776e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i8 = i6 + 1;
                c = 0;
            }
            i6 = i8;
            i8 = i6 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1803l;
    }

    public void setAlpha(float f4) {
        setRootAlpha((int) (f4 * 255.0f));
    }

    public void setRootAlpha(int i4) {
        this.f1803l = i4;
    }

    public m(m mVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.f1800i = 0.0f;
        this.f1801j = 0.0f;
        this.f1802k = 0.0f;
        this.f1803l = 255;
        this.f1804m = null;
        this.f1805n = null;
        n.f fVar = new n.f(0);
        this.f1806o = fVar;
        this.g = new j(mVar.g, fVar);
        this.f1795a = new Path(mVar.f1795a);
        this.f1796b = new Path(mVar.f1796b);
        this.h = mVar.h;
        this.f1800i = mVar.f1800i;
        this.f1801j = mVar.f1801j;
        this.f1802k = mVar.f1802k;
        this.f1803l = mVar.f1803l;
        this.f1804m = mVar.f1804m;
        String str = mVar.f1804m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f1805n = mVar.f1805n;
    }
}
