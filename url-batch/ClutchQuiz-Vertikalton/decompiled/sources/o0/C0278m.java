package o0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: o0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3276p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3277a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3278b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3279c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3280e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3281f;

    /* renamed from: g, reason: collision with root package name */
    public final C0275j f3282g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3283j;

    /* renamed from: k, reason: collision with root package name */
    public float f3284k;

    /* renamed from: l, reason: collision with root package name */
    public int f3285l;

    /* renamed from: m, reason: collision with root package name */
    public String f3286m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3287n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3288o;

    public C0278m() {
        this.f3279c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3283j = 0.0f;
        this.f3284k = 0.0f;
        this.f3285l = 255;
        this.f3286m = null;
        this.f3287n = null;
        this.f3288o = new o.b();
        this.f3282g = new C0275j();
        this.f3277a = new Path();
        this.f3278b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3260j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0275j c0275j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0275j.f3265a.set(matrix);
        Matrix matrix3 = c0275j.f3265a;
        matrix3.preConcat(c0275j.f3271j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0275j.f3266b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0276k abstractC0276k = (AbstractC0276k) arrayList.get(i5);
            if (abstractC0276k instanceof C0275j) {
                a((C0275j) abstractC0276k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0276k instanceof AbstractC0277l) {
                AbstractC0277l abstractC0277l = (AbstractC0277l) abstractC0276k;
                float f3 = i / this.f3283j;
                float f4 = i2 / this.f3284k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3279c;
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
                    Path path = this.f3277a;
                    abstractC0277l.getClass();
                    path.reset();
                    C.g[] gVarArr = abstractC0277l.f3273a;
                    if (gVarArr != null) {
                        C.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3278b;
                    path2.reset();
                    if (abstractC0277l instanceof C0273h) {
                        path2.setFillType(abstractC0277l.f3275c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0274i c0274i = (C0274i) abstractC0277l;
                        float f6 = c0274i.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c0274i.f3261k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0274i.f3260j + f8) % f7;
                        if (this.f3281f == null) {
                            this.f3281f = new PathMeasure();
                        }
                        this.f3281f.setPath(path, r11);
                        float length = this.f3281f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3281f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3281f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3281f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0274i.f3258f;
                        if ((((Shader) dVar.f44b) == null && dVar.f43a == 0) ? r11 : true) {
                            if (this.f3280e == null) {
                                Paint paint = new Paint(1);
                                this.f3280e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3280e;
                            Shader shader = (Shader) dVar.f44b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0274i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f43a;
                                float f13 = c0274i.h;
                                PorterDuff.Mode mode = C0281p.f3299j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0274i.f3275c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0274i.d;
                        if (((Shader) dVar2.f44b) != null || dVar2.f43a != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0274i.f3263m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0274i.f3262l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0274i.f3264n);
                            Shader shader2 = (Shader) dVar2.f44b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0274i.f3259g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f43a;
                                float f14 = c0274i.f3259g;
                                PorterDuff.Mode mode2 = C0281p.f3299j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0274i.f3257e * abs * min);
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
        return this.f3285l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3285l = i;
    }

    public C0278m(C0278m c0278m) {
        this.f3279c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3283j = 0.0f;
        this.f3284k = 0.0f;
        this.f3285l = 255;
        this.f3286m = null;
        this.f3287n = null;
        o.b bVar = new o.b();
        this.f3288o = bVar;
        this.f3282g = new C0275j(c0278m.f3282g, bVar);
        this.f3277a = new Path(c0278m.f3277a);
        this.f3278b = new Path(c0278m.f3278b);
        this.h = c0278m.h;
        this.i = c0278m.i;
        this.f3283j = c0278m.f3283j;
        this.f3284k = c0278m.f3284k;
        this.f3285l = c0278m.f3285l;
        this.f3286m = c0278m.f3286m;
        String str = c0278m.f3286m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3287n = c0278m.f3287n;
    }
}
