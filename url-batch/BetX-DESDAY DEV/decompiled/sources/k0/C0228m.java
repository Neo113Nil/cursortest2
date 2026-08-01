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
public final class C0228m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3174p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3175a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3176b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3177c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f3178d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3179e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3180f;

    /* renamed from: g, reason: collision with root package name */
    public final C0225j f3181g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3182j;

    /* renamed from: k, reason: collision with root package name */
    public float f3183k;

    /* renamed from: l, reason: collision with root package name */
    public int f3184l;

    /* renamed from: m, reason: collision with root package name */
    public String f3185m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3186n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3187o;

    public C0228m() {
        this.f3177c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3182j = 0.0f;
        this.f3183k = 0.0f;
        this.f3184l = 255;
        this.f3185m = null;
        this.f3186n = null;
        this.f3187o = new o.b();
        this.f3181g = new C0225j();
        this.f3175a = new Path();
        this.f3176b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3157j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0225j c0225j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0225j.f3162a.set(matrix);
        Matrix matrix3 = c0225j.f3162a;
        matrix3.preConcat(c0225j.f3169j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0225j.f3163b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0226k abstractC0226k = (AbstractC0226k) arrayList.get(i5);
            if (abstractC0226k instanceof C0225j) {
                a((C0225j) abstractC0226k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0226k instanceof AbstractC0227l) {
                AbstractC0227l abstractC0227l = (AbstractC0227l) abstractC0226k;
                float f3 = i / this.f3182j;
                float f4 = i2 / this.f3183k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3177c;
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
                    Path path = this.f3175a;
                    abstractC0227l.getClass();
                    path.reset();
                    C.g[] gVarArr = abstractC0227l.f3171a;
                    if (gVarArr != null) {
                        C.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3176b;
                    path2.reset();
                    if (abstractC0227l instanceof C0223h) {
                        path2.setFillType(abstractC0227l.f3173c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0224i c0224i = (C0224i) abstractC0227l;
                        float f6 = c0224i.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c0224i.f3158k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0224i.f3157j + f8) % f7;
                        if (this.f3180f == null) {
                            this.f3180f = new PathMeasure();
                        }
                        this.f3180f.setPath(path, r11);
                        float length = this.f3180f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3180f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3180f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3180f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0224i.f3155f;
                        if ((((Shader) dVar.f22c) == null && dVar.f21b == 0) ? r11 : true) {
                            if (this.f3179e == null) {
                                Paint paint = new Paint(1);
                                this.f3179e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3179e;
                            Shader shader = (Shader) dVar.f22c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0224i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f21b;
                                float f13 = c0224i.h;
                                PorterDuff.Mode mode = C0231p.f3199j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0224i.f3173c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0224i.f3153d;
                        if (((Shader) dVar2.f22c) != null || dVar2.f21b != 0) {
                            if (this.f3178d == null) {
                                Paint paint3 = new Paint(1);
                                this.f3178d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f3178d;
                            Paint.Join join = c0224i.f3160m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0224i.f3159l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0224i.f3161n);
                            Shader shader2 = (Shader) dVar2.f22c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0224i.f3156g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f21b;
                                float f14 = c0224i.f3156g;
                                PorterDuff.Mode mode2 = C0231p.f3199j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0224i.f3154e * abs * min);
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
        return this.f3184l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3184l = i;
    }

    public C0228m(C0228m c0228m) {
        this.f3177c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3182j = 0.0f;
        this.f3183k = 0.0f;
        this.f3184l = 255;
        this.f3185m = null;
        this.f3186n = null;
        o.b bVar = new o.b();
        this.f3187o = bVar;
        this.f3181g = new C0225j(c0228m.f3181g, bVar);
        this.f3175a = new Path(c0228m.f3175a);
        this.f3176b = new Path(c0228m.f3176b);
        this.h = c0228m.h;
        this.i = c0228m.i;
        this.f3182j = c0228m.f3182j;
        this.f3183k = c0228m.f3183k;
        this.f3184l = c0228m.f3184l;
        this.f3185m = c0228m.f3185m;
        String str = c0228m.f3185m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3186n = c0228m.f3186n;
    }
}
