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
public final class C0276m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3183p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3184a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3185b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3186c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3187e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3188f;

    /* renamed from: g, reason: collision with root package name */
    public final C0273j f3189g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3190j;

    /* renamed from: k, reason: collision with root package name */
    public float f3191k;

    /* renamed from: l, reason: collision with root package name */
    public int f3192l;

    /* renamed from: m, reason: collision with root package name */
    public String f3193m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3194n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3195o;

    public C0276m() {
        this.f3186c = new Matrix();
        this.h = RecyclerView.f1559A0;
        this.i = RecyclerView.f1559A0;
        this.f3190j = RecyclerView.f1559A0;
        this.f3191k = RecyclerView.f1559A0;
        this.f3192l = 255;
        this.f3193m = null;
        this.f3194n = null;
        this.f3195o = new o.b();
        this.f3189g = new C0273j();
        this.f3184a = new Path();
        this.f3185b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3167j != 1.0f) goto L33;
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
        c0273j.f3172a.set(matrix);
        Matrix matrix3 = c0273j.f3172a;
        matrix3.preConcat(c0273j.f3178j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0273j.f3173b;
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
                float f3 = i / this.f3190j;
                float f4 = i2 / this.f3191k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3186c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {RecyclerView.f1559A0, 1.0f, 1.0f, RecyclerView.f1559A0};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > RecyclerView.f1559A0 ? Math.abs(f5) / max : 0.0f;
                if (abs != RecyclerView.f1559A0) {
                    Path path = this.f3184a;
                    abstractC0275l.getClass();
                    path.reset();
                    C.f[] fVarArr = abstractC0275l.f3180a;
                    if (fVarArr != null) {
                        C.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3185b;
                    path2.reset();
                    if (abstractC0275l instanceof C0271h) {
                        path2.setFillType(abstractC0275l.f3182c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0272i c0272i = (C0272i) abstractC0275l;
                        float f6 = c0272i.i;
                        float f7 = f6 == RecyclerView.f1559A0 ? 1.0f : 1.0f;
                        float f8 = c0272i.f3168k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0272i.f3167j + f8) % f7;
                        if (this.f3188f == null) {
                            this.f3188f = new PathMeasure();
                        }
                        this.f3188f.setPath(path, r11);
                        float length = this.f3188f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3188f.getSegment(f11, length, path, true);
                            PathMeasure pathMeasure = this.f3188f;
                            f2 = RecyclerView.f1559A0;
                            pathMeasure.getSegment(RecyclerView.f1559A0, f12, path, true);
                        } else {
                            f2 = RecyclerView.f1559A0;
                            this.f3188f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0272i.f3165f;
                        if ((((Shader) dVar.f34c) == null && dVar.f33b == 0) ? r11 : true) {
                            if (this.f3187e == null) {
                                Paint paint = new Paint(1);
                                this.f3187e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3187e;
                            Shader shader = (Shader) dVar.f34c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0272i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f33b;
                                float f13 = c0272i.h;
                                PorterDuff.Mode mode = C0279p.f3206j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0272i.f3182c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0272i.d;
                        if (((Shader) dVar2.f34c) != null || dVar2.f33b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0272i.f3170m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0272i.f3169l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0272i.f3171n);
                            Shader shader2 = (Shader) dVar2.f34c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0272i.f3166g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f33b;
                                float f14 = c0272i.f3166g;
                                PorterDuff.Mode mode2 = C0279p.f3206j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0272i.f3164e * abs * min);
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
        return this.f3192l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3192l = i;
    }

    public C0276m(C0276m c0276m) {
        this.f3186c = new Matrix();
        this.h = RecyclerView.f1559A0;
        this.i = RecyclerView.f1559A0;
        this.f3190j = RecyclerView.f1559A0;
        this.f3191k = RecyclerView.f1559A0;
        this.f3192l = 255;
        this.f3193m = null;
        this.f3194n = null;
        o.b bVar = new o.b();
        this.f3195o = bVar;
        this.f3189g = new C0273j(c0276m.f3189g, bVar);
        this.f3184a = new Path(c0276m.f3184a);
        this.f3185b = new Path(c0276m.f3185b);
        this.h = c0276m.h;
        this.i = c0276m.i;
        this.f3190j = c0276m.f3190j;
        this.f3191k = c0276m.f3191k;
        this.f3192l = c0276m.f3192l;
        this.f3193m = c0276m.f3193m;
        String str = c0276m.f3193m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3194n = c0276m.f3194n;
    }
}
