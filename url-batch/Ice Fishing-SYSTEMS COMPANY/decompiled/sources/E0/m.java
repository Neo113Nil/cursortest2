package E0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f774p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f775a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f776b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f777c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f778d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f779e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f780f;

    /* renamed from: g, reason: collision with root package name */
    public final j f781g;

    /* renamed from: h, reason: collision with root package name */
    public float f782h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f783j;

    /* renamed from: k, reason: collision with root package name */
    public float f784k;

    /* renamed from: l, reason: collision with root package name */
    public int f785l;

    /* renamed from: m, reason: collision with root package name */
    public String f786m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f787n;

    /* renamed from: o, reason: collision with root package name */
    public final s.b f788o;

    public m() {
        this.f777c = new Matrix();
        this.f782h = 0.0f;
        this.i = 0.0f;
        this.f783j = 0.0f;
        this.f784k = 0.0f;
        this.f785l = com.anythink.basead.exoplayer.k.p.f8630b;
        this.f786m = null;
        this.f787n = null;
        this.f788o = new s.b();
        this.f781g = new j();
        this.f775a = new Path();
        this.f776b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i4) {
        char c4;
        float f6;
        float f9;
        int i9;
        j jVar2 = jVar;
        char c9 = 1;
        jVar2.f761a.set(matrix);
        Matrix matrix2 = jVar2.f761a;
        matrix2.preConcat(jVar2.f769j);
        canvas.save();
        char c10 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = jVar2.f762b;
            if (i10 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i10);
            if (kVar instanceof j) {
                a((j) kVar, matrix2, canvas, i, i4);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f10 = i / this.f783j;
                float f11 = i4 / this.f784k;
                float min = Math.min(f10, f11);
                Matrix matrix3 = this.f777c;
                matrix3.set(matrix2);
                matrix3.postScale(f10, f11);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c10], fArr[c9]);
                boolean z8 = c9;
                boolean z9 = c10;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f12 = (fArr[z9 ? 1 : 0] * fArr[3]) - (fArr[z8 ? 1 : 0] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f12) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f775a;
                    lVar.getClass();
                    path.reset();
                    G.i[] iVarArr = lVar.f771a;
                    if (iVarArr != null) {
                        G.i.b(iVarArr, path);
                    }
                    Path path2 = this.f776b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f773c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f13 = iVar.i;
                        if (f13 != 0.0f || iVar.f756j != 1.0f) {
                            float f14 = iVar.f757k;
                            float f15 = (f13 + f14) % 1.0f;
                            float f16 = (iVar.f756j + f14) % 1.0f;
                            if (this.f780f == null) {
                                this.f780f = new PathMeasure();
                            }
                            this.f780f.setPath(path, z9);
                            float length = this.f780f.getLength();
                            float f17 = f15 * length;
                            float f18 = f16 * length;
                            path.reset();
                            if (f17 > f18) {
                                this.f780f.getSegment(f17, length, path, z8);
                                f6 = 0.0f;
                                this.f780f.getSegment(0.0f, f18, path, z8);
                            } else {
                                f6 = 0.0f;
                                this.f780f.getSegment(f17, f18, path, z8);
                            }
                            path.rLineTo(f6, f6);
                        }
                        path2.addPath(path, matrix3);
                        F.d dVar = iVar.f753f;
                        if ((((Shader) dVar.f909c) == null && dVar.f908b == 0) ? false : true) {
                            if (this.f779e == null) {
                                i9 = 16777215;
                                Paint paint = new Paint(1);
                                this.f779e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i9 = 16777215;
                            }
                            Paint paint2 = this.f779e;
                            Shader shader = (Shader) dVar.f909c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f755h * 255.0f));
                                f9 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(com.anythink.basead.exoplayer.k.p.f8630b);
                                int i11 = dVar.f908b;
                                float f19 = iVar.f755h;
                                PorterDuff.Mode mode = p.f801C;
                                f9 = 255.0f;
                                paint2.setColor((i11 & i9) | (((int) (Color.alpha(i11) * f19)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f773c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f9 = 255.0f;
                            i9 = 16777215;
                        }
                        F.d dVar2 = iVar.f751d;
                        if (((Shader) dVar2.f909c) != null || dVar2.f908b != 0) {
                            if (this.f778d == null) {
                                Paint paint3 = new Paint(1);
                                this.f778d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f778d;
                            Paint.Join join = iVar.f759m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f758l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f760n);
                            Shader shader2 = (Shader) dVar2.f909c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f754g * f9));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(com.anythink.basead.exoplayer.k.p.f8630b);
                                int i12 = dVar2.f908b;
                                float f20 = iVar.f754g;
                                PorterDuff.Mode mode2 = p.f801C;
                                paint4.setColor((i12 & i9) | (((int) (Color.alpha(i12) * f20)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f752e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c4 = 1;
                i10++;
                jVar2 = jVar;
                c9 = c4;
                c10 = 0;
            }
            c4 = c9;
            i10++;
            jVar2 = jVar;
            c9 = c4;
            c10 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f785l;
    }

    public void setAlpha(float f6) {
        setRootAlpha((int) (f6 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f785l = i;
    }

    public m(m mVar) {
        this.f777c = new Matrix();
        this.f782h = 0.0f;
        this.i = 0.0f;
        this.f783j = 0.0f;
        this.f784k = 0.0f;
        this.f785l = com.anythink.basead.exoplayer.k.p.f8630b;
        this.f786m = null;
        this.f787n = null;
        s.b bVar = new s.b();
        this.f788o = bVar;
        this.f781g = new j(mVar.f781g, bVar);
        this.f775a = new Path(mVar.f775a);
        this.f776b = new Path(mVar.f776b);
        this.f782h = mVar.f782h;
        this.i = mVar.i;
        this.f783j = mVar.f783j;
        this.f784k = mVar.f784k;
        this.f785l = mVar.f785l;
        this.f786m = mVar.f786m;
        String str = mVar.f786m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f787n = mVar.f787n;
    }
}
