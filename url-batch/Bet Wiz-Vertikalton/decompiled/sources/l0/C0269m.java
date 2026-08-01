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

/* renamed from: l0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3130p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3132b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3133c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3134e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3135f;

    /* renamed from: g, reason: collision with root package name */
    public final C0266j f3136g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3137j;

    /* renamed from: k, reason: collision with root package name */
    public float f3138k;

    /* renamed from: l, reason: collision with root package name */
    public int f3139l;

    /* renamed from: m, reason: collision with root package name */
    public String f3140m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3141n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3142o;

    public C0269m() {
        this.f3133c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3137j = 0.0f;
        this.f3138k = 0.0f;
        this.f3139l = 255;
        this.f3140m = null;
        this.f3141n = null;
        this.f3142o = new o.b();
        this.f3136g = new C0266j();
        this.f3131a = new Path();
        this.f3132b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3114j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0266j c0266j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0266j.f3119a.set(matrix);
        Matrix matrix3 = c0266j.f3119a;
        matrix3.preConcat(c0266j.f3125j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0266j.f3120b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0267k abstractC0267k = (AbstractC0267k) arrayList.get(i5);
            if (abstractC0267k instanceof C0266j) {
                a((C0266j) abstractC0267k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0267k instanceof AbstractC0268l) {
                AbstractC0268l abstractC0268l = (AbstractC0268l) abstractC0267k;
                float f3 = i / this.f3137j;
                float f4 = i2 / this.f3138k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3133c;
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
                    Path path = this.f3131a;
                    abstractC0268l.getClass();
                    path.reset();
                    C.f[] fVarArr = abstractC0268l.f3127a;
                    if (fVarArr != null) {
                        C.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3132b;
                    path2.reset();
                    if (abstractC0268l instanceof C0264h) {
                        path2.setFillType(abstractC0268l.f3129c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0265i c0265i = (C0265i) abstractC0268l;
                        float f6 = c0265i.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c0265i.f3115k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0265i.f3114j + f8) % f7;
                        if (this.f3135f == null) {
                            this.f3135f = new PathMeasure();
                        }
                        this.f3135f.setPath(path, r11);
                        float length = this.f3135f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3135f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3135f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3135f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0265i.f3112f;
                        if ((((Shader) dVar.f14c) == null && dVar.f13b == 0) ? r11 : true) {
                            if (this.f3134e == null) {
                                Paint paint = new Paint(1);
                                this.f3134e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3134e;
                            Shader shader = (Shader) dVar.f14c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0265i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f13b;
                                float f13 = c0265i.h;
                                PorterDuff.Mode mode = C0272p.f3153j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0265i.f3129c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0265i.d;
                        if (((Shader) dVar2.f14c) != null || dVar2.f13b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0265i.f3117m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0265i.f3116l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0265i.f3118n);
                            Shader shader2 = (Shader) dVar2.f14c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0265i.f3113g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f13b;
                                float f14 = c0265i.f3113g;
                                PorterDuff.Mode mode2 = C0272p.f3153j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0265i.f3111e * abs * min);
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
        return this.f3139l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3139l = i;
    }

    public C0269m(C0269m c0269m) {
        this.f3133c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3137j = 0.0f;
        this.f3138k = 0.0f;
        this.f3139l = 255;
        this.f3140m = null;
        this.f3141n = null;
        o.b bVar = new o.b();
        this.f3142o = bVar;
        this.f3136g = new C0266j(c0269m.f3136g, bVar);
        this.f3131a = new Path(c0269m.f3131a);
        this.f3132b = new Path(c0269m.f3132b);
        this.h = c0269m.h;
        this.i = c0269m.i;
        this.f3137j = c0269m.f3137j;
        this.f3138k = c0269m.f3138k;
        this.f3139l = c0269m.f3139l;
        this.f3140m = c0269m.f3140m;
        String str = c0269m.f3140m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3141n = c0269m.f3141n;
    }
}
