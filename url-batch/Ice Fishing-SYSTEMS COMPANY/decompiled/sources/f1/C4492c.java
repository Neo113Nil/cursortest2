package f1;

import B2.N;
import X0.v;
import X0.x;
import X0.z;
import a1.s;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import b1.C0523a;
import com.anythink.basead.exoplayer.k.p;
import j1.AbstractC4591d;
import j1.C4589b;
import j1.j;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4492c extends AbstractC4490a {

    /* renamed from: D, reason: collision with root package name */
    public final Y0.a f37589D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f37590E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f37591F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f37592G;

    /* renamed from: H, reason: collision with root package name */
    public final x f37593H;

    /* renamed from: I, reason: collision with root package name */
    public s f37594I;
    public s J;

    /* renamed from: K, reason: collision with root package name */
    public final a1.h f37595K;

    /* renamed from: L, reason: collision with root package name */
    public j1.i f37596L;

    /* renamed from: M, reason: collision with root package name */
    public G1.a f37597M;

    public C4492c(v vVar, C4493d c4493d) {
        super(vVar, c4493d);
        x xVar;
        this.f37589D = new Y0.a(3, 0);
        this.f37590E = new Rect();
        this.f37591F = new Rect();
        this.f37592G = new RectF();
        X0.i iVar = vVar.f3746n;
        if (iVar == null) {
            xVar = null;
        } else {
            xVar = (x) ((HashMap) iVar.c()).get(c4493d.f37604g);
        }
        this.f37593H = xVar;
        N n9 = this.f37569p.f37620x;
        if (n9 != null) {
            this.f37595K = new a1.h(this, this, n9);
        }
    }

    @Override // f1.AbstractC4490a, c1.f
    public final void c(ColorFilter colorFilter, S0.s sVar) {
        super.c(colorFilter, sVar);
        if (colorFilter == z.f3780I) {
            this.f37594I = new s(sVar, null);
            return;
        }
        if (colorFilter == z.f3782L) {
            this.J = new s(sVar, null);
            return;
        }
        a1.h hVar = this.f37595K;
        if (colorFilter == 5 && hVar != null) {
            hVar.f4313c.j(sVar);
            return;
        }
        if (colorFilter == z.f3776E && hVar != null) {
            hVar.c(sVar);
            return;
        }
        if (colorFilter == z.f3777F && hVar != null) {
            hVar.f4315e.j(sVar);
            return;
        }
        if (colorFilter == z.f3778G && hVar != null) {
            hVar.f4316f.j(sVar);
        } else {
            if (colorFilter != z.f3779H || hVar == null) {
                return;
            }
            hVar.f4317g.j(sVar);
        }
    }

    @Override // f1.AbstractC4490a, Z0.e
    public final void d(RectF rectF, Matrix matrix, boolean z8) {
        super.d(rectF, matrix, z8);
        x xVar = this.f37593H;
        if (xVar != null) {
            float c4 = j.c();
            boolean z9 = this.f37568o.f3727F;
            int i = xVar.f3767b;
            int i4 = xVar.f3766a;
            if (z9) {
                rectF.set(0.0f, 0.0f, i4 * c4, i * c4);
            } else {
                if (s() != null) {
                    rectF.set(0.0f, 0.0f, r0.getWidth() * c4, r0.getHeight() * c4);
                } else {
                    rectF.set(0.0f, 0.0f, i4 * c4, i * c4);
                }
            }
            this.f37567n.mapRect(rectF);
        }
    }

    @Override // f1.AbstractC4490a
    public final void k(Canvas canvas, Matrix matrix, int i, C4589b c4589b) {
        x xVar;
        Bitmap s3 = s();
        if (s3 == null || s3.isRecycled() || (xVar = this.f37593H) == null) {
            return;
        }
        float c4 = j.c();
        Y0.a aVar = this.f37589D;
        aVar.setAlpha(i);
        s sVar = this.f37594I;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        a1.h hVar = this.f37595K;
        if (hVar != null) {
            c4589b = hVar.b(matrix, i);
        }
        int width = s3.getWidth();
        int height = s3.getHeight();
        Rect rect = this.f37590E;
        rect.set(0, 0, width, height);
        boolean z8 = this.f37568o.f3727F;
        Rect rect2 = this.f37591F;
        if (z8) {
            rect2.set(0, 0, (int) (xVar.f3766a * c4), (int) (xVar.f3767b * c4));
        } else {
            rect2.set(0, 0, (int) (s3.getWidth() * c4), (int) (s3.getHeight() * c4));
        }
        boolean z9 = c4589b != null;
        if (z9) {
            if (this.f37596L == null) {
                this.f37596L = new j1.i();
            }
            if (this.f37597M == null) {
                this.f37597M = new G1.a((byte) 0, 16);
            }
            G1.a aVar2 = this.f37597M;
            aVar2.f1194u = p.f8630b;
            aVar2.f1195v = null;
            c4589b.getClass();
            C4589b c4589b2 = new C4589b(c4589b);
            aVar2.f1195v = c4589b2;
            c4589b2.b(i);
            RectF rectF = this.f37592G;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            matrix.mapRect(rectF);
            canvas = this.f37596L.e(canvas, rectF, this.f37597M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(s3, rect, rect2, aVar);
        if (z9) {
            this.f37596L.c();
            if (this.f37596L.f38510c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1.f3763z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r4 == r2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap s() {
        Bitmap bitmap;
        Bitmap bitmap2;
        s sVar = this.J;
        if (sVar != null && (bitmap2 = (Bitmap) sVar.e()) != null) {
            return bitmap2;
        }
        String str = this.f37569p.f37604g;
        v vVar = this.f37568o;
        C0523a c0523a = vVar.f3763z;
        if (c0523a != null) {
            Context h9 = vVar.h();
            Context context = c0523a.f5520a;
            if (h9 != null) {
                if (context instanceof Application) {
                    h9 = h9.getApplicationContext();
                }
            }
        }
        if (vVar.f3763z == null) {
            vVar.f3763z = new C0523a(vVar.getCallback(), vVar.f3722A, vVar.f3746n.c());
        }
        C0523a c0523a2 = vVar.f3763z;
        if (c0523a2 != null) {
            String str2 = c0523a2.f5521b;
            x xVar = (x) c0523a2.f5522c.get(str);
            if (xVar != null) {
                bitmap = xVar.f3771f;
                if (bitmap == null) {
                    Context context2 = c0523a2.f5520a;
                    if (context2 != null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        String str3 = xVar.f3769d;
                        boolean startsWith = str3.startsWith("data:");
                        int i = xVar.f3767b;
                        int i4 = xVar.f3766a;
                        if (!startsWith || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap decodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (decodeStream == null) {
                                        AbstractC4591d.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = j.d(decodeStream, i4, i);
                                        synchronized (C0523a.f5519d) {
                                            ((x) c0523a2.f5522c.get(str)).f3771f = bitmap;
                                        }
                                    }
                                } catch (IllegalArgumentException e6) {
                                    AbstractC4591d.c("Unable to decode image `" + str + "`.", e6);
                                }
                            } catch (IOException e9) {
                                AbstractC4591d.c("Unable to open asset.", e9);
                            }
                        } else {
                            try {
                                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    if (decodeByteArray == null) {
                                        AbstractC4591d.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = j.d(decodeByteArray, i4, i);
                                        synchronized (C0523a.f5519d) {
                                            ((x) c0523a2.f5522c.get(str)).f3771f = bitmap;
                                        }
                                    }
                                } catch (IllegalArgumentException e10) {
                                    AbstractC4591d.c("Unable to decode image `" + str + "`.", e10);
                                }
                            } catch (IllegalArgumentException e11) {
                                AbstractC4591d.c("data URL did not have correct base64 format.", e11);
                            }
                        }
                    }
                }
                if (bitmap == null) {
                    return bitmap;
                }
                x xVar2 = this.f37593H;
                if (xVar2 != null) {
                    return xVar2.f3771f;
                }
                return null;
            }
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }
}
