package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import java.util.Set;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class io implements t70 {
    public final t01 a;
    public final uw1 b;
    public final qi2 c;
    public final rj0 d;

    public io(t01 t01Var, uw1 uw1Var, qi2 qi2Var, rj0 rj0Var) {
        this.a = t01Var;
        this.b = uw1Var;
        this.c = qi2Var;
        this.d = rj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0058, code lost:
    
        if (defpackage.tj0.a.contains(r9) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s70 a(io ioVar) {
        gj0 gj0Var;
        Exception exc;
        Context context;
        int i;
        boolean z;
        int min;
        double max;
        Exception exc2;
        Bitmap createBitmap;
        ColorSpace colorSpace;
        int e;
        jj0 c;
        int e2;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        uw1 uw1Var = ioVar.b;
        t01 t01Var = ioVar.a;
        fo foVar = new fo(t01Var.n());
        p62 p62Var = new p62(foVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new o62(new p62(new q02(p62Var))), null, options);
        Exception exc3 = foVar.n;
        if (exc3 != null) {
            throw exc3;
        }
        options.inJustDecodeBounds = false;
        Paint paint = sj0.a;
        String str = options.outMimeType;
        rj0 rj0Var = ioVar.d;
        Set set = tj0.a;
        int ordinal = rj0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    a.b();
                    return null;
                }
            } else if (str != null) {
            }
            nj0 nj0Var = new nj0(new oj0(new o62(new p62(new q02(p62Var)))));
            jj0 c2 = nj0Var.c("Orientation");
            if (c2 != null) {
                try {
                    e = c2.e(nj0Var.e);
                } catch (NumberFormatException unused) {
                }
                boolean z2 = e != 2 || e == 7 || e == 4 || e == 5;
                c = nj0Var.c("Orientation");
                if (c != null) {
                    try {
                        e2 = c.e(nj0Var.e);
                    } catch (NumberFormatException unused2) {
                    }
                    switch (e2) {
                        case 3:
                        case 4:
                            i2 = 180;
                            break;
                        case 5:
                        case 8:
                            i2 = 270;
                            break;
                        case 6:
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            i2 = 90;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    gj0Var = new gj0(i2, z2);
                    int i3 = gj0Var.b;
                    boolean z3 = gj0Var.a;
                    exc = foVar.n;
                    if (exc == null) {
                        throw exc;
                    }
                    options.inMutable = false;
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 26 && (colorSpace = uw1Var.c) != null) {
                        options.inPreferredColorSpace = colorSpace;
                    }
                    boolean z4 = uw1Var.h;
                    Context context2 = uw1Var.a;
                    pl2 pl2Var = uw1Var.d;
                    options.inPremultiplied = z4;
                    Bitmap.Config config = uw1Var.b;
                    if ((z3 || i3 > 0) && (config == null || k31.o(config))) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (uw1Var.g && config == Bitmap.Config.ARGB_8888 && Intrinsics.b(options.outMimeType, "image/jpeg")) {
                        config = Bitmap.Config.RGB_565;
                    }
                    if (i4 >= 26) {
                        Bitmap.Config config2 = options.outConfig;
                        Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                        if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                            config = config3;
                        }
                    }
                    options.inPreferredConfig = config;
                    yj1 m = t01Var.m();
                    try {
                        if (!(m instanceof q92) || !Intrinsics.b(pl2Var, pl2.c)) {
                            int i5 = options.outWidth;
                            if (i5 > 0) {
                                int i6 = options.outHeight;
                                if (i6 <= 0) {
                                    i = 1;
                                    context = context2;
                                } else {
                                    int i7 = (i3 == 90 || i3 == 270) ? i6 : i5;
                                    if (i3 != 90 && i3 != 270) {
                                        i5 = i6;
                                    }
                                    me2 me2Var = uw1Var.e;
                                    pl2 pl2Var2 = pl2.c;
                                    int d = Intrinsics.b(pl2Var, pl2Var2) ? i7 : l.d(pl2Var.a, me2Var);
                                    int d2 = Intrinsics.b(pl2Var, pl2Var2) ? i5 : l.d(pl2Var.b, me2Var);
                                    int highestOneBit = Integer.highestOneBit(i7 / d);
                                    int highestOneBit2 = Integer.highestOneBit(i5 / d2);
                                    int ordinal2 = me2Var.ordinal();
                                    if (ordinal2 == 0) {
                                        min = Math.min(highestOneBit, highestOneBit2);
                                    } else {
                                        if (ordinal2 != 1) {
                                            a.b();
                                            return null;
                                        }
                                        min = Math.max(highestOneBit, highestOneBit2);
                                    }
                                    if (min < 1) {
                                        min = 1;
                                    }
                                    options.inSampleSize = min;
                                    double d3 = min;
                                    context = context2;
                                    double d4 = d / (i7 / d3);
                                    double d5 = d2 / (i5 / d3);
                                    int ordinal3 = me2Var.ordinal();
                                    if (ordinal3 == 0) {
                                        max = Math.max(d4, d5);
                                    } else {
                                        if (ordinal3 != 1) {
                                            a.b();
                                            return null;
                                        }
                                        max = Math.min(d4, d5);
                                    }
                                    if (uw1Var.f && max > 1.0d) {
                                        max = 1.0d;
                                    }
                                    boolean z5 = max == 1.0d;
                                    options.inScaled = !z5;
                                    if (!z5) {
                                        if (max > 1.0d) {
                                            options.inDensity = si1.a(2.147483647E9d / max);
                                            options.inTargetDensity = Integer.MAX_VALUE;
                                        } else {
                                            options.inDensity = Integer.MAX_VALUE;
                                            options.inTargetDensity = si1.a(2.147483647E9d * max);
                                        }
                                    }
                                }
                            } else {
                                context = context2;
                                i = 1;
                            }
                            options.inSampleSize = i;
                            z = false;
                            options.inScaled = false;
                            Bitmap decodeStream = BitmapFactory.decodeStream(new o62(p62Var), null, options);
                            p62Var.close();
                            exc2 = foVar.n;
                            if (exc2 == null) {
                                throw exc2;
                            }
                            if (decodeStream == null) {
                                lh.g("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                                return null;
                            }
                            decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                            if (z3 || i3 > 0) {
                                Matrix matrix = new Matrix();
                                float width = decodeStream.getWidth() / 2.0f;
                                float height = decodeStream.getHeight() / 2.0f;
                                if (z3) {
                                    matrix.postScale(-1.0f, 1.0f, width, height);
                                }
                                if (i3 > 0) {
                                    matrix.postRotate(i3, width, height);
                                }
                                RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                                matrix.mapRect(rectF);
                                float f = rectF.left;
                                if (f != 0.0f || rectF.top != 0.0f) {
                                    matrix.postTranslate(-f, -rectF.top);
                                }
                                if (i3 == 90 || i3 == 270) {
                                    int height2 = decodeStream.getHeight();
                                    int width2 = decodeStream.getWidth();
                                    Bitmap.Config config4 = decodeStream.getConfig();
                                    if (config4 == null) {
                                        config4 = Bitmap.Config.ARGB_8888;
                                    }
                                    createBitmap = Bitmap.createBitmap(height2, width2, config4);
                                } else {
                                    int width3 = decodeStream.getWidth();
                                    int height3 = decodeStream.getHeight();
                                    Bitmap.Config config5 = decodeStream.getConfig();
                                    if (config5 == null) {
                                        config5 = Bitmap.Config.ARGB_8888;
                                    }
                                    createBitmap = Bitmap.createBitmap(width3, height3, config5);
                                }
                                new Canvas(createBitmap).drawBitmap(decodeStream, matrix, sj0.a);
                                decodeStream.recycle();
                                decodeStream = createBitmap;
                            }
                            return new s70(new BitmapDrawable(context.getResources(), decodeStream), (options.inSampleSize > 1 || options.inScaled) ? true : z);
                        }
                        options.inSampleSize = 1;
                        options.inScaled = true;
                        options.inDensity = ((q92) m).q;
                        options.inTargetDensity = context2.getResources().getDisplayMetrics().densityDpi;
                        context = context2;
                        Bitmap decodeStream2 = BitmapFactory.decodeStream(new o62(p62Var), null, options);
                        p62Var.close();
                        exc2 = foVar.n;
                        if (exc2 == null) {
                        }
                    } finally {
                    }
                    z = false;
                }
                e2 = 1;
                switch (e2) {
                }
                gj0Var = new gj0(i2, z2);
                int i32 = gj0Var.b;
                boolean z32 = gj0Var.a;
                exc = foVar.n;
                if (exc == null) {
                }
            }
            e = 1;
            if (e != 2) {
            }
            c = nj0Var.c("Orientation");
            if (c != null) {
            }
            e2 = 1;
            switch (e2) {
            }
            gj0Var = new gj0(i2, z2);
            int i322 = gj0Var.b;
            boolean z322 = gj0Var.a;
            exc = foVar.n;
            if (exc == null) {
            }
        }
        gj0Var = gj0.c;
        int i3222 = gj0Var.b;
        boolean z3222 = gj0Var.a;
        exc = foVar.n;
        if (exc == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r30 r30Var) {
        ho hoVar;
        b50 b50Var;
        int i;
        qi2 qi2Var;
        Throwable th;
        qi2 qi2Var2;
        Object V;
        try {
            if (r30Var instanceof ho) {
                hoVar = (ho) r30Var;
                int i2 = hoVar.q;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hoVar.q = i2 - Integer.MIN_VALUE;
                    Object obj = hoVar.o;
                    b50Var = b50.m;
                    i = hoVar.q;
                    o30 o30Var = null;
                    int i3 = 1;
                    if (i != 0) {
                        ca2.b(obj);
                        hoVar.m = this;
                        qi2Var = this.c;
                        hoVar.n = qi2Var;
                        hoVar.q = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qi2Var2 = (qi2) hoVar.m;
                            try {
                                ca2.b(obj);
                                s70 s70Var = (s70) obj;
                                qi2Var2.d();
                                return s70Var;
                            } catch (Throwable th2) {
                                th = th2;
                                qi2Var2.d();
                                throw th;
                            }
                        }
                        qi2 qi2Var3 = hoVar.n;
                        io ioVar = (io) hoVar.m;
                        ca2.b(obj);
                        qi2Var = qi2Var3;
                        this = ioVar;
                    }
                    dj djVar = new dj(i3, this);
                    hoVar.m = qi2Var;
                    hoVar.n = null;
                    hoVar.q = 2;
                    V = z71.V(h.m, new p50(3, o30Var, djVar), hoVar);
                    if (V != b50Var) {
                        qi2 qi2Var4 = qi2Var;
                        obj = V;
                        qi2Var2 = qi2Var4;
                        s70 s70Var2 = (s70) obj;
                        qi2Var2.d();
                        return s70Var2;
                    }
                    return b50Var;
                }
            }
            dj djVar2 = new dj(i3, this);
            hoVar.m = qi2Var;
            hoVar.n = null;
            hoVar.q = 2;
            V = z71.V(h.m, new p50(3, o30Var, djVar2), hoVar);
            if (V != b50Var) {
            }
            return b50Var;
        } catch (Throwable th3) {
            qi2 qi2Var5 = qi2Var;
            th = th3;
            qi2Var2 = qi2Var5;
            qi2Var2.d();
            throw th;
        }
        hoVar = new ho(this, r30Var);
        Object obj2 = hoVar.o;
        b50Var = b50.m;
        i = hoVar.q;
        o30 o30Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
    }
}
