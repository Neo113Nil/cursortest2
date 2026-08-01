package q0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: q0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3966p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3967a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3968b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3969c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f3970d;
    public Paint e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3971f;

    /* renamed from: g, reason: collision with root package name */
    public final C0341j f3972g;

    /* renamed from: h, reason: collision with root package name */
    public float f3973h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f3974k;

    /* renamed from: l, reason: collision with root package name */
    public int f3975l;

    /* renamed from: m, reason: collision with root package name */
    public String f3976m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3977n;

    /* renamed from: o, reason: collision with root package name */
    public final q.b f3978o;

    public C0344m() {
        this.f3969c = new Matrix();
        this.f3973h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.f3974k = 0.0f;
        this.f3975l = 255;
        this.f3976m = null;
        this.f3977n = null;
        this.f3978o = new q.b();
        this.f3972g = new C0341j();
        this.f3967a = new Path();
        this.f3968b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0341j c0341j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0341j.f3955a.set(matrix);
        Matrix matrix3 = c0341j.f3955a;
        matrix3.preConcat(c0341j.j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0341j.f3956b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0342k abstractC0342k = (AbstractC0342k) arrayList.get(i5);
            if (abstractC0342k instanceof C0341j) {
                a((C0341j) abstractC0342k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0342k instanceof AbstractC0343l) {
                AbstractC0343l abstractC0343l = (AbstractC0343l) abstractC0342k;
                float f3 = i / this.j;
                float f4 = i2 / this.f3974k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3969c;
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
                    Path path = this.f3967a;
                    abstractC0343l.getClass();
                    path.reset();
                    E.f[] fVarArr = abstractC0343l.f3963a;
                    if (fVarArr != null) {
                        E.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3968b;
                    path2.reset();
                    if (abstractC0343l instanceof C0339h) {
                        path2.setFillType(abstractC0343l.f3965c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0340i c0340i = (C0340i) abstractC0343l;
                        float f6 = c0340i.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c0340i.f3951k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0340i.j + f8) % f7;
                        if (this.f3971f == null) {
                            this.f3971f = new PathMeasure();
                        }
                        this.f3971f.setPath(path, r11);
                        float length = this.f3971f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3971f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3971f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3971f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        D.d dVar = c0340i.f3948f;
                        if ((((Shader) dVar.f169c) == null && dVar.f168b == 0) ? r11 : true) {
                            if (this.e == null) {
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) dVar.f169c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0340i.f3950h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f168b;
                                float f13 = c0340i.f3950h;
                                PorterDuff.Mode mode = C0347p.j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0340i.f3965c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        D.d dVar2 = c0340i.f3947d;
                        if (((Shader) dVar2.f169c) != null || dVar2.f168b != 0) {
                            if (this.f3970d == null) {
                                Paint paint3 = new Paint(1);
                                this.f3970d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f3970d;
                            Paint.Join join = c0340i.f3953m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0340i.f3952l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0340i.f3954n);
                            Shader shader2 = (Shader) dVar2.f169c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0340i.f3949g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f168b;
                                float f14 = c0340i.f3949g;
                                PorterDuff.Mode mode2 = C0347p.j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0340i.e * abs * min);
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
        return this.f3975l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3975l = i;
    }

    public C0344m(C0344m c0344m) {
        this.f3969c = new Matrix();
        this.f3973h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.f3974k = 0.0f;
        this.f3975l = 255;
        this.f3976m = null;
        this.f3977n = null;
        q.b bVar = new q.b();
        this.f3978o = bVar;
        this.f3972g = new C0341j(c0344m.f3972g, bVar);
        this.f3967a = new Path(c0344m.f3967a);
        this.f3968b = new Path(c0344m.f3968b);
        this.f3973h = c0344m.f3973h;
        this.i = c0344m.i;
        this.j = c0344m.j;
        this.f3974k = c0344m.f3974k;
        this.f3975l = c0344m.f3975l;
        this.f3976m = c0344m.f3976m;
        String str = c0344m.f3976m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3977n = c0344m.f3977n;
    }
}
