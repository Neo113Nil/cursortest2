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
public final class C0267m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3221p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3222a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3223b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3224c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3225e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3226f;

    /* renamed from: g, reason: collision with root package name */
    public final C0264j f3227g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3228j;

    /* renamed from: k, reason: collision with root package name */
    public float f3229k;

    /* renamed from: l, reason: collision with root package name */
    public int f3230l;

    /* renamed from: m, reason: collision with root package name */
    public String f3231m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3232n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3233o;

    public C0267m() {
        this.f3224c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3228j = 0.0f;
        this.f3229k = 0.0f;
        this.f3230l = 255;
        this.f3231m = null;
        this.f3232n = null;
        this.f3233o = new o.b();
        this.f3227g = new C0264j();
        this.f3222a = new Path();
        this.f3223b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3205j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0264j c0264j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0264j.f3210a.set(matrix);
        Matrix matrix3 = c0264j.f3210a;
        matrix3.preConcat(c0264j.f3216j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0264j.f3211b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0265k abstractC0265k = (AbstractC0265k) arrayList.get(i5);
            if (abstractC0265k instanceof C0264j) {
                a((C0264j) abstractC0265k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0265k instanceof AbstractC0266l) {
                AbstractC0266l abstractC0266l = (AbstractC0266l) abstractC0265k;
                float f3 = i / this.f3228j;
                float f4 = i2 / this.f3229k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3224c;
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
                    Path path = this.f3222a;
                    abstractC0266l.getClass();
                    path.reset();
                    C.f[] fVarArr = abstractC0266l.f3218a;
                    if (fVarArr != null) {
                        C.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3223b;
                    path2.reset();
                    if (abstractC0266l instanceof C0262h) {
                        path2.setFillType(abstractC0266l.f3220c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0263i c0263i = (C0263i) abstractC0266l;
                        float f6 = c0263i.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c0263i.f3206k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0263i.f3205j + f8) % f7;
                        if (this.f3226f == null) {
                            this.f3226f = new PathMeasure();
                        }
                        this.f3226f.setPath(path, r11);
                        float length = this.f3226f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3226f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3226f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3226f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0263i.f3203f;
                        if ((((Shader) dVar.f14c) == null && dVar.f13b == 0) ? r11 : true) {
                            if (this.f3225e == null) {
                                Paint paint = new Paint(1);
                                this.f3225e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3225e;
                            Shader shader = (Shader) dVar.f14c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0263i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f13b;
                                float f13 = c0263i.h;
                                PorterDuff.Mode mode = C0270p.f3244j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0263i.f3220c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0263i.d;
                        if (((Shader) dVar2.f14c) != null || dVar2.f13b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0263i.f3208m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0263i.f3207l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0263i.f3209n);
                            Shader shader2 = (Shader) dVar2.f14c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0263i.f3204g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f13b;
                                float f14 = c0263i.f3204g;
                                PorterDuff.Mode mode2 = C0270p.f3244j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0263i.f3202e * abs * min);
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
        return this.f3230l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3230l = i;
    }

    public C0267m(C0267m c0267m) {
        this.f3224c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3228j = 0.0f;
        this.f3229k = 0.0f;
        this.f3230l = 255;
        this.f3231m = null;
        this.f3232n = null;
        o.b bVar = new o.b();
        this.f3233o = bVar;
        this.f3227g = new C0264j(c0267m.f3227g, bVar);
        this.f3222a = new Path(c0267m.f3222a);
        this.f3223b = new Path(c0267m.f3223b);
        this.h = c0267m.h;
        this.i = c0267m.i;
        this.f3228j = c0267m.f3228j;
        this.f3229k = c0267m.f3229k;
        this.f3230l = c0267m.f3230l;
        this.f3231m = c0267m.f3231m;
        String str = c0267m.f3231m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3232n = c0267m.f3232n;
    }
}
