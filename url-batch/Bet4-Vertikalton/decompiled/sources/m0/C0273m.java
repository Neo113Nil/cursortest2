package m0;

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

/* renamed from: m0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3159p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3161b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3162c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3163e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3164f;

    /* renamed from: g, reason: collision with root package name */
    public final C0270j f3165g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3166j;

    /* renamed from: k, reason: collision with root package name */
    public float f3167k;

    /* renamed from: l, reason: collision with root package name */
    public int f3168l;

    /* renamed from: m, reason: collision with root package name */
    public String f3169m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3170n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3171o;

    public C0273m() {
        this.f3162c = new Matrix();
        this.h = RecyclerView.f1530C0;
        this.i = RecyclerView.f1530C0;
        this.f3166j = RecyclerView.f1530C0;
        this.f3167k = RecyclerView.f1530C0;
        this.f3168l = 255;
        this.f3169m = null;
        this.f3170n = null;
        this.f3171o = new o.b();
        this.f3165g = new C0270j();
        this.f3160a = new Path();
        this.f3161b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3143j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0270j c0270j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0270j.f3148a.set(matrix);
        Matrix matrix3 = c0270j.f3148a;
        matrix3.preConcat(c0270j.f3154j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0270j.f3149b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0271k abstractC0271k = (AbstractC0271k) arrayList.get(i5);
            if (abstractC0271k instanceof C0270j) {
                a((C0270j) abstractC0271k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0271k instanceof AbstractC0272l) {
                AbstractC0272l abstractC0272l = (AbstractC0272l) abstractC0271k;
                float f3 = i / this.f3166j;
                float f4 = i2 / this.f3167k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3162c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {RecyclerView.f1530C0, 1.0f, 1.0f, RecyclerView.f1530C0};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > RecyclerView.f1530C0 ? Math.abs(f5) / max : 0.0f;
                if (abs != RecyclerView.f1530C0) {
                    Path path = this.f3160a;
                    abstractC0272l.getClass();
                    path.reset();
                    C.f[] fVarArr = abstractC0272l.f3156a;
                    if (fVarArr != null) {
                        C.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3161b;
                    path2.reset();
                    if (abstractC0272l instanceof C0268h) {
                        path2.setFillType(abstractC0272l.f3158c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0269i c0269i = (C0269i) abstractC0272l;
                        float f6 = c0269i.i;
                        float f7 = f6 == RecyclerView.f1530C0 ? 1.0f : 1.0f;
                        float f8 = c0269i.f3144k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0269i.f3143j + f8) % f7;
                        if (this.f3164f == null) {
                            this.f3164f = new PathMeasure();
                        }
                        this.f3164f.setPath(path, r11);
                        float length = this.f3164f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3164f.getSegment(f11, length, path, true);
                            PathMeasure pathMeasure = this.f3164f;
                            f2 = RecyclerView.f1530C0;
                            pathMeasure.getSegment(RecyclerView.f1530C0, f12, path, true);
                        } else {
                            f2 = RecyclerView.f1530C0;
                            this.f3164f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0269i.f3141f;
                        if ((((Shader) dVar.f20c) == null && dVar.f19b == 0) ? r11 : true) {
                            if (this.f3163e == null) {
                                Paint paint = new Paint(1);
                                this.f3163e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3163e;
                            Shader shader = (Shader) dVar.f20c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0269i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f19b;
                                float f13 = c0269i.h;
                                PorterDuff.Mode mode = C0276p.f3182j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0269i.f3158c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0269i.d;
                        if (((Shader) dVar2.f20c) != null || dVar2.f19b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0269i.f3146m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0269i.f3145l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0269i.f3147n);
                            Shader shader2 = (Shader) dVar2.f20c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0269i.f3142g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f19b;
                                float f14 = c0269i.f3142g;
                                PorterDuff.Mode mode2 = C0276p.f3182j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0269i.f3140e * abs * min);
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
        return this.f3168l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3168l = i;
    }

    public C0273m(C0273m c0273m) {
        this.f3162c = new Matrix();
        this.h = RecyclerView.f1530C0;
        this.i = RecyclerView.f1530C0;
        this.f3166j = RecyclerView.f1530C0;
        this.f3167k = RecyclerView.f1530C0;
        this.f3168l = 255;
        this.f3169m = null;
        this.f3170n = null;
        o.b bVar = new o.b();
        this.f3171o = bVar;
        this.f3165g = new C0270j(c0273m.f3165g, bVar);
        this.f3160a = new Path(c0273m.f3160a);
        this.f3161b = new Path(c0273m.f3161b);
        this.h = c0273m.h;
        this.i = c0273m.i;
        this.f3166j = c0273m.f3166j;
        this.f3167k = c0273m.f3167k;
        this.f3168l = c0273m.f3168l;
        this.f3169m = c0273m.f3169m;
        String str = c0273m.f3169m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3170n = c0273m.f3170n;
    }
}
