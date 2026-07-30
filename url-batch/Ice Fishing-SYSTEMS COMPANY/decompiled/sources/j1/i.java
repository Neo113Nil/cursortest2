package j1;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import f4.m;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: B, reason: collision with root package name */
    public static final Matrix f38506B = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    public C4589b f38507A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f38508a;

    /* renamed from: b, reason: collision with root package name */
    public G1.a f38509b;

    /* renamed from: c, reason: collision with root package name */
    public int f38510c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f38511d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f38512e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f38513f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f38514g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f38515h;
    public Rect i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f38516j;

    /* renamed from: k, reason: collision with root package name */
    public Y0.a f38517k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f38518l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f38519m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f38520n;

    /* renamed from: o, reason: collision with root package name */
    public Y0.a f38521o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f38522p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f38523q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f38524r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f38525s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f38526t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f38527u;

    /* renamed from: v, reason: collision with root package name */
    public Y0.a f38528v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f38529w;

    /* renamed from: x, reason: collision with root package name */
    public float f38530x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f38531y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f38532z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, C4589b c4589b) {
        if (this.f38512e == null) {
            this.f38512e = new RectF();
        }
        if (this.f38514g == null) {
            this.f38514g = new RectF();
        }
        this.f38512e.set(rectF);
        this.f38512e.offsetTo(rectF.left + c4589b.f38480b, rectF.top + c4589b.f38481c);
        RectF rectF2 = this.f38512e;
        float f6 = c4589b.f38479a;
        rectF2.inset(-f6, -f6);
        this.f38514g.set(rectF);
        this.f38512e.union(this.f38514g);
        return this.f38512e;
    }

    public final void c() {
        float f6;
        Y0.a aVar;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.f38508a == null || this.f38509b == null || this.f38523q == null || this.f38511d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int d2 = AbstractC5088e.d(this.f38510c);
        if (d2 == 0) {
            this.f38508a.restore();
        } else if (d2 != 1) {
            if (d2 != 2) {
                if (d2 == 3) {
                    if (this.f38531y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f38508a.save();
                    Canvas canvas = this.f38508a;
                    float[] fArr = this.f38523q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f38531y.endRecording();
                    if (this.f38509b.d()) {
                        Canvas canvas2 = this.f38508a;
                        C4589b c4589b = (C4589b) this.f38509b.f1195v;
                        if (this.f38531y == null || this.f38532z == null) {
                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                        }
                        if (i < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f38523q;
                        float f9 = fArr2 != null ? fArr2[0] : 1.0f;
                        f6 = fArr2 != null ? fArr2[4] : 1.0f;
                        C4589b c4589b2 = this.f38507A;
                        if (c4589b2 == null || c4589b.f38479a != c4589b2.f38479a || c4589b.f38480b != c4589b2.f38480b || c4589b.f38481c != c4589b2.f38481c || c4589b.f38482d != c4589b2.f38482d) {
                            createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c4589b.f38482d, PorterDuff.Mode.SRC_IN));
                            float f10 = c4589b.f38479a;
                            if (f10 > 0.0f) {
                                float f11 = ((f9 + f6) * f10) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                createColorFilterEffect = RenderEffect.createBlurEffect(f11, f11, createColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f38532z.setRenderEffect(createColorFilterEffect);
                            this.f38507A = c4589b;
                        }
                        RectF b9 = b(this.f38511d, c4589b);
                        RectF rectF = new RectF(b9.left * f9, b9.top * f6, b9.right * f9, b9.bottom * f6);
                        this.f38532z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        beginRecording = this.f38532z.beginRecording((int) rectF.width(), (int) rectF.height());
                        beginRecording.translate((c4589b.f38480b * f9) + (-rectF.left), (c4589b.f38481c * f6) + (-rectF.top));
                        beginRecording.drawRenderNode(this.f38531y);
                        this.f38532z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f38532z);
                        canvas2.restore();
                    }
                    this.f38508a.drawRenderNode(this.f38531y);
                    this.f38508a.restore();
                }
            } else {
                if (this.f38518l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f38509b.d()) {
                    Canvas canvas3 = this.f38508a;
                    C4589b c4589b3 = (C4589b) this.f38509b.f1195v;
                    RectF rectF2 = this.f38511d;
                    if (rectF2 == null || this.f38518l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF b10 = b(rectF2, c4589b3);
                    if (this.f38513f == null) {
                        this.f38513f = new Rect();
                    }
                    this.f38513f.set((int) Math.floor(b10.left), (int) Math.floor(b10.top), (int) Math.ceil(b10.right), (int) Math.ceil(b10.bottom));
                    float[] fArr3 = this.f38523q;
                    float f12 = fArr3 != null ? fArr3[0] : 1.0f;
                    f6 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f38515h == null) {
                        this.f38515h = new RectF();
                    }
                    this.f38515h.set(b10.left * f12, b10.top * f6, b10.right * f12, b10.bottom * f6);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.f38515h.width()), Math.round(this.f38515h.height()));
                    if (d(this.f38524r, this.f38515h)) {
                        Bitmap bitmap = this.f38524r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f38525s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f38524r = a(this.f38515h, Bitmap.Config.ARGB_8888);
                        this.f38525s = a(this.f38515h, Bitmap.Config.ALPHA_8);
                        this.f38526t = new Canvas(this.f38524r);
                        this.f38527u = new Canvas(this.f38525s);
                    } else {
                        Canvas canvas4 = this.f38526t;
                        if (canvas4 == null || this.f38527u == null || (aVar = this.f38521o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.i, aVar);
                        this.f38527u.drawRect(this.i, this.f38521o);
                    }
                    if (this.f38525s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f38528v == null) {
                        this.f38528v = new Y0.a(1, 0);
                    }
                    RectF rectF3 = this.f38511d;
                    this.f38527u.drawBitmap(this.f38518l, Math.round((rectF3.left - b10.left) * f12), Math.round((rectF3.top - b10.top) * f6), (Paint) null);
                    if (this.f38529w == null || this.f38530x != c4589b3.f38479a) {
                        float f13 = ((f12 + f6) * c4589b3.f38479a) / 2.0f;
                        if (f13 > 0.0f) {
                            this.f38529w = new BlurMaskFilter(f13, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f38529w = null;
                        }
                        this.f38530x = c4589b3.f38479a;
                    }
                    this.f38528v.setColor(c4589b3.f38482d);
                    if (c4589b3.f38479a > 0.0f) {
                        this.f38528v.setMaskFilter(this.f38529w);
                    } else {
                        this.f38528v.setMaskFilter(null);
                    }
                    this.f38528v.setFilterBitmap(true);
                    this.f38526t.drawBitmap(this.f38525s, Math.round(c4589b3.f38480b * f12), Math.round(c4589b3.f38481c * f6), this.f38528v);
                    canvas3.drawBitmap(this.f38524r, this.i, this.f38513f, this.f38517k);
                }
                if (this.f38520n == null) {
                    this.f38520n = new Rect();
                }
                this.f38520n.set(0, 0, (int) (this.f38511d.width() * this.f38523q[0]), (int) (this.f38511d.height() * this.f38523q[4]));
                this.f38508a.drawBitmap(this.f38518l, this.f38520n, this.f38511d, this.f38517k);
            }
        } else {
            this.f38508a.restore();
        }
        this.f38508a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, G1.a aVar) {
        RecordingCanvas beginRecording;
        if (this.f38508a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f38523q == null) {
            this.f38523q = new float[9];
        }
        if (this.f38522p == null) {
            this.f38522p = new Matrix();
        }
        canvas.getMatrix(this.f38522p);
        this.f38522p.getValues(this.f38523q);
        float[] fArr = this.f38523q;
        float f6 = fArr[0];
        int i = 4;
        float f9 = fArr[4];
        if (this.f38516j == null) {
            this.f38516j = new RectF();
        }
        this.f38516j.set(rectF.left * f6, rectF.top * f9, rectF.right * f6, rectF.bottom * f9);
        this.f38508a = canvas;
        this.f38509b = aVar;
        if (aVar.f1194u >= 255 && !aVar.d()) {
            i = 1;
        } else if (aVar.d()) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 29 || !canvas.isHardwareAccelerated() || i4 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.f38510c = i;
        if (this.f38511d == null) {
            this.f38511d = new RectF();
        }
        this.f38511d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f38517k == null) {
            this.f38517k = new Y0.a();
        }
        this.f38517k.reset();
        int d2 = AbstractC5088e.d(this.f38510c);
        if (d2 == 0) {
            canvas.save();
            return canvas;
        }
        if (d2 == 1) {
            this.f38517k.setAlpha(aVar.f1194u);
            this.f38517k.setColorFilter(null);
            Y0.a aVar2 = this.f38517k;
            Matrix matrix = j.f38533a;
            canvas.saveLayer(rectF, aVar2);
            return canvas;
        }
        Matrix matrix2 = f38506B;
        if (d2 == 2) {
            if (this.f38521o == null) {
                Y0.a aVar3 = new Y0.a();
                this.f38521o = aVar3;
                aVar3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.f38518l, this.f38516j)) {
                Bitmap bitmap = this.f38518l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f38518l = a(this.f38516j, Bitmap.Config.ARGB_8888);
                this.f38519m = new Canvas(this.f38518l);
            } else {
                Canvas canvas2 = this.f38519m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix2);
                this.f38519m.drawRect(-1.0f, -1.0f, this.f38516j.width() + 1.0f, this.f38516j.height() + 1.0f, this.f38521o);
            }
            G.h.a(this.f38517k, null);
            this.f38517k.setColorFilter(null);
            this.f38517k.setAlpha(aVar.f1194u);
            Canvas canvas3 = this.f38519m;
            canvas3.scale(f6, f9);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (d2 != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f38531y == null) {
            this.f38531y = m.c();
        }
        if (aVar.d() && this.f38532z == null) {
            this.f38532z = m.q();
            this.f38507A = null;
        }
        this.f38531y.setAlpha(aVar.f1194u / 255.0f);
        if (aVar.d()) {
            RenderNode renderNode = this.f38532z;
            if (renderNode == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode.setAlpha(aVar.f1194u / 255.0f);
        }
        this.f38531y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f38531y;
        RectF rectF2 = this.f38516j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        beginRecording = this.f38531y.beginRecording((int) this.f38516j.width(), (int) this.f38516j.height());
        beginRecording.setMatrix(matrix2);
        beginRecording.scale(f6, f9);
        beginRecording.translate(-rectF.left, -rectF.top);
        return beginRecording;
    }
}
