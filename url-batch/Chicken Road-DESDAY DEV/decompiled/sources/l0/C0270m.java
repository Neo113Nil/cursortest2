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
public final class C0270m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3077p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3078a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3079b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3080c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3081e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3082f;

    /* renamed from: g, reason: collision with root package name */
    public final C0267j f3083g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3084j;

    /* renamed from: k, reason: collision with root package name */
    public float f3085k;

    /* renamed from: l, reason: collision with root package name */
    public int f3086l;

    /* renamed from: m, reason: collision with root package name */
    public String f3087m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3088n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3089o;

    public C0270m() {
        this.f3080c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3084j = 0.0f;
        this.f3085k = 0.0f;
        this.f3086l = 255;
        this.f3087m = null;
        this.f3088n = null;
        this.f3089o = new o.b();
        this.f3083g = new C0267j();
        this.f3078a = new Path();
        this.f3079b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3061j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0267j c0267j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0267j.f3066a.set(matrix);
        Matrix matrix3 = c0267j.f3066a;
        matrix3.preConcat(c0267j.f3072j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0267j.f3067b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0268k abstractC0268k = (AbstractC0268k) arrayList.get(i5);
            if (abstractC0268k instanceof C0267j) {
                a((C0267j) abstractC0268k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0268k instanceof AbstractC0269l) {
                AbstractC0269l abstractC0269l = (AbstractC0269l) abstractC0268k;
                float f3 = i / this.f3084j;
                float f4 = i2 / this.f3085k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3080c;
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
                    Path path = this.f3078a;
                    abstractC0269l.getClass();
                    path.reset();
                    C.f[] fVarArr = abstractC0269l.f3074a;
                    if (fVarArr != null) {
                        C.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3079b;
                    path2.reset();
                    if (abstractC0269l instanceof C0265h) {
                        path2.setFillType(abstractC0269l.f3076c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0266i c0266i = (C0266i) abstractC0269l;
                        float f6 = c0266i.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c0266i.f3062k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0266i.f3061j + f8) % f7;
                        if (this.f3082f == null) {
                            this.f3082f = new PathMeasure();
                        }
                        this.f3082f.setPath(path, r11);
                        float length = this.f3082f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3082f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3082f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3082f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0266i.f3059f;
                        if ((((Shader) dVar.f16c) == null && dVar.f15b == 0) ? r11 : true) {
                            if (this.f3081e == null) {
                                Paint paint = new Paint(1);
                                this.f3081e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3081e;
                            Shader shader = (Shader) dVar.f16c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0266i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f15b;
                                float f13 = c0266i.h;
                                PorterDuff.Mode mode = C0273p.f3100j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0266i.f3076c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0266i.d;
                        if (((Shader) dVar2.f16c) != null || dVar2.f15b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0266i.f3064m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0266i.f3063l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0266i.f3065n);
                            Shader shader2 = (Shader) dVar2.f16c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0266i.f3060g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f15b;
                                float f14 = c0266i.f3060g;
                                PorterDuff.Mode mode2 = C0273p.f3100j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0266i.f3058e * abs * min);
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
        return this.f3086l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3086l = i;
    }

    public C0270m(C0270m c0270m) {
        this.f3080c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3084j = 0.0f;
        this.f3085k = 0.0f;
        this.f3086l = 255;
        this.f3087m = null;
        this.f3088n = null;
        o.b bVar = new o.b();
        this.f3089o = bVar;
        this.f3083g = new C0267j(c0270m.f3083g, bVar);
        this.f3078a = new Path(c0270m.f3078a);
        this.f3079b = new Path(c0270m.f3079b);
        this.h = c0270m.h;
        this.i = c0270m.i;
        this.f3084j = c0270m.f3084j;
        this.f3085k = c0270m.f3085k;
        this.f3086l = c0270m.f3086l;
        this.f3087m = c0270m.f3087m;
        String str = c0270m.f3087m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3088n = c0270m.f3088n;
    }
}
