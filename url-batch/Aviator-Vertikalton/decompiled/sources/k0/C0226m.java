package k0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3170p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3171a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3172b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3173c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f3174d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3175e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3176f;

    /* renamed from: g, reason: collision with root package name */
    public final C0223j f3177g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3178j;

    /* renamed from: k, reason: collision with root package name */
    public float f3179k;

    /* renamed from: l, reason: collision with root package name */
    public int f3180l;

    /* renamed from: m, reason: collision with root package name */
    public String f3181m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3182n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3183o;

    public C0226m() {
        this.f3173c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3178j = 0.0f;
        this.f3179k = 0.0f;
        this.f3180l = 255;
        this.f3181m = null;
        this.f3182n = null;
        this.f3183o = new o.b();
        this.f3177g = new C0223j();
        this.f3171a = new Path();
        this.f3172b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3153j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0223j c0223j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0223j.f3158a.set(matrix);
        Matrix matrix3 = c0223j.f3158a;
        matrix3.preConcat(c0223j.f3165j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0223j.f3159b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0224k abstractC0224k = (AbstractC0224k) arrayList.get(i5);
            if (abstractC0224k instanceof C0223j) {
                a((C0223j) abstractC0224k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0224k instanceof AbstractC0225l) {
                AbstractC0225l abstractC0225l = (AbstractC0225l) abstractC0224k;
                float f3 = i / this.f3178j;
                float f4 = i2 / this.f3179k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3173c;
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
                    Path path = this.f3171a;
                    abstractC0225l.getClass();
                    path.reset();
                    C.g[] gVarArr = abstractC0225l.f3167a;
                    if (gVarArr != null) {
                        C.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3172b;
                    path2.reset();
                    if (abstractC0225l instanceof C0221h) {
                        path2.setFillType(abstractC0225l.f3169c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0222i c0222i = (C0222i) abstractC0225l;
                        float f6 = c0222i.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c0222i.f3154k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0222i.f3153j + f8) % f7;
                        if (this.f3176f == null) {
                            this.f3176f = new PathMeasure();
                        }
                        this.f3176f.setPath(path, r11);
                        float length = this.f3176f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3176f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3176f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3176f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0222i.f3151f;
                        if ((((Shader) dVar.f22c) == null && dVar.f21b == 0) ? r11 : true) {
                            if (this.f3175e == null) {
                                Paint paint = new Paint(1);
                                this.f3175e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3175e;
                            Shader shader = (Shader) dVar.f22c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0222i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f21b;
                                float f13 = c0222i.h;
                                PorterDuff.Mode mode = C0229p.f3195j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0222i.f3169c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0222i.f3149d;
                        if (((Shader) dVar2.f22c) != null || dVar2.f21b != 0) {
                            if (this.f3174d == null) {
                                Paint paint3 = new Paint(1);
                                this.f3174d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f3174d;
                            Paint.Join join = c0222i.f3156m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0222i.f3155l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0222i.f3157n);
                            Shader shader2 = (Shader) dVar2.f22c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0222i.f3152g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f21b;
                                float f14 = c0222i.f3152g;
                                PorterDuff.Mode mode2 = C0229p.f3195j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0222i.f3150e * abs * min);
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
        return this.f3180l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3180l = i;
    }

    public C0226m(C0226m c0226m) {
        this.f3173c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3178j = 0.0f;
        this.f3179k = 0.0f;
        this.f3180l = 255;
        this.f3181m = null;
        this.f3182n = null;
        o.b bVar = new o.b();
        this.f3183o = bVar;
        this.f3177g = new C0223j(c0226m.f3177g, bVar);
        this.f3171a = new Path(c0226m.f3171a);
        this.f3172b = new Path(c0226m.f3172b);
        this.h = c0226m.h;
        this.i = c0226m.i;
        this.f3178j = c0226m.f3178j;
        this.f3179k = c0226m.f3179k;
        this.f3180l = c0226m.f3180l;
        this.f3181m = c0226m.f3181m;
        String str = c0226m.f3181m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3182n = c0226m.f3182n;
    }
}
