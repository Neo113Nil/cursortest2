package n0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3352p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3353a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3354b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3355c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3356e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3357f;

    /* renamed from: g, reason: collision with root package name */
    public final C0273j f3358g;

    /* renamed from: h, reason: collision with root package name */
    public float f3359h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3360j;

    /* renamed from: k, reason: collision with root package name */
    public float f3361k;

    /* renamed from: l, reason: collision with root package name */
    public int f3362l;

    /* renamed from: m, reason: collision with root package name */
    public String f3363m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3364n;

    /* renamed from: o, reason: collision with root package name */
    public final p.b f3365o;

    public C0276m() {
        this.f3355c = new Matrix();
        this.f3359h = RecyclerView.A0;
        this.i = RecyclerView.A0;
        this.f3360j = RecyclerView.A0;
        this.f3361k = RecyclerView.A0;
        this.f3362l = 255;
        this.f3363m = null;
        this.f3364n = null;
        this.f3365o = new p.b();
        this.f3358g = new C0273j();
        this.f3353a = new Path();
        this.f3354b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3335j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0273j c0273j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0273j.f3340a.set(matrix);
        Matrix matrix3 = c0273j.f3340a;
        matrix3.preConcat(c0273j.f3347j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0273j.f3341b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0274k abstractC0274k = (AbstractC0274k) arrayList.get(i5);
            if (abstractC0274k instanceof C0273j) {
                a((C0273j) abstractC0274k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0274k instanceof AbstractC0275l) {
                AbstractC0275l abstractC0275l = (AbstractC0275l) abstractC0274k;
                float f3 = i / this.f3360j;
                float f4 = i2 / this.f3361k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3355c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {RecyclerView.A0, 1.0f, 1.0f, RecyclerView.A0};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > RecyclerView.A0 ? Math.abs(f5) / max : 0.0f;
                if (abs != RecyclerView.A0) {
                    Path path = this.f3353a;
                    abstractC0275l.getClass();
                    path.reset();
                    D.f[] fVarArr = abstractC0275l.f3349a;
                    if (fVarArr != null) {
                        D.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3354b;
                    path2.reset();
                    if (abstractC0275l instanceof C0271h) {
                        path2.setFillType(abstractC0275l.f3351c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0272i c0272i = (C0272i) abstractC0275l;
                        float f6 = c0272i.i;
                        float f7 = f6 == RecyclerView.A0 ? 1.0f : 1.0f;
                        float f8 = c0272i.f3336k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0272i.f3335j + f8) % f7;
                        if (this.f3357f == null) {
                            this.f3357f = new PathMeasure();
                        }
                        this.f3357f.setPath(path, r11);
                        float length = this.f3357f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3357f.getSegment(f11, length, path, true);
                            PathMeasure pathMeasure = this.f3357f;
                            f2 = RecyclerView.A0;
                            pathMeasure.getSegment(RecyclerView.A0, f12, path, true);
                        } else {
                            f2 = RecyclerView.A0;
                            this.f3357f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        C.d dVar = c0272i.f3332f;
                        if ((((Shader) dVar.f75c) == null && dVar.f74b == 0) ? r11 : true) {
                            if (this.f3356e == null) {
                                Paint paint = new Paint(1);
                                this.f3356e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3356e;
                            Shader shader = (Shader) dVar.f75c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0272i.f3334h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f74b;
                                float f13 = c0272i.f3334h;
                                PorterDuff.Mode mode = C0279p.f3377j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0272i.f3351c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C.d dVar2 = c0272i.d;
                        if (((Shader) dVar2.f75c) != null || dVar2.f74b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0272i.f3338m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0272i.f3337l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0272i.f3339n);
                            Shader shader2 = (Shader) dVar2.f75c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0272i.f3333g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f74b;
                                float f14 = c0272i.f3333g;
                                PorterDuff.Mode mode2 = C0279p.f3377j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0272i.f3331e * abs * min);
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
        return this.f3362l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3362l = i;
    }

    public C0276m(C0276m c0276m) {
        this.f3355c = new Matrix();
        this.f3359h = RecyclerView.A0;
        this.i = RecyclerView.A0;
        this.f3360j = RecyclerView.A0;
        this.f3361k = RecyclerView.A0;
        this.f3362l = 255;
        this.f3363m = null;
        this.f3364n = null;
        p.b bVar = new p.b();
        this.f3365o = bVar;
        this.f3358g = new C0273j(c0276m.f3358g, bVar);
        this.f3353a = new Path(c0276m.f3353a);
        this.f3354b = new Path(c0276m.f3354b);
        this.f3359h = c0276m.f3359h;
        this.i = c0276m.i;
        this.f3360j = c0276m.f3360j;
        this.f3361k = c0276m.f3361k;
        this.f3362l = c0276m.f3362l;
        this.f3363m = c0276m.f3363m;
        String str = c0276m.f3363m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3364n = c0276m.f3364n;
    }
}
