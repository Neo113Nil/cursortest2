package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhx {
    public static final bbk a = new bbk("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", baw.c, bbk.a);
    public static final bbk b = new bbk("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, bbk.a);
    public static final bbk c;
    public static final bbk d;
    public static final bbk e;
    public static final bhw f;
    private static final Queue j;
    public final List g;
    public final bek h;
    public final brn i;
    private final bed k;
    private final DisplayMetrics l;
    private final big m = big.a();

    static {
        bhu bhuVar = bhu.b;
        c = new bbk("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false, bbk.a);
        d = new bbk("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false, bbk.a);
        e = new bbk("com.bumptech.glide.load.resource.bitmap.Downsampler.BypassTransformationsForHardwareBitmaps", false, bbk.a);
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f = new bhv();
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = bmi.a;
        j = new ArrayDeque(0);
    }

    public bhx(List list, DisplayMetrics displayMetrics, bed bedVar, bek bekVar, brn brnVar) {
        this.g = list;
        a.v(displayMetrics, "Argument must not be null");
        this.l = displayMetrics;
        this.k = bedVar;
        this.h = bekVar;
        this.i = brnVar;
    }

    private static int b(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int c(double d2) {
        return (int) (d2 + 0.5d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap d(bij bijVar, BitmapFactory.Options options, bhw bhwVar, bed bedVar) {
        String str;
        Bitmap d2;
        if (!options.inJustDecodeBounds) {
            bhwVar.b();
            bijVar.d();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str2 = options.outMimeType;
        bir.c.lock();
        try {
            try {
                d2 = bijVar.b(options);
            } catch (IllegalArgumentException e2) {
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    str = null;
                } else {
                    String str3 = " (" + bitmap.getAllocationByteCount() + ")";
                    str = "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str3;
                }
                IOException iOException = new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str2 + ", inBitmap: " + str, e2);
                if (options.inBitmap == null) {
                    throw iOException;
                }
                try {
                    bedVar.d(options.inBitmap);
                    options.inBitmap = null;
                    d2 = d(bijVar, options, bhwVar, bedVar);
                } catch (IOException unused) {
                    throw iOException;
                }
            }
            return d2;
        } finally {
            bir.c.unlock();
        }
    }

    private static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        synchronized (bhx.class) {
            Queue queue = j;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options != null) {
                return options;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            g(options2);
            return options2;
        }
    }

    private static void f(BitmapFactory.Options options) {
        g(options);
        Queue queue = j;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static boolean h(int i) {
        return i == 90 || i == 270;
    }

    private static boolean i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] j(bij bijVar, BitmapFactory.Options options, bhw bhwVar, bed bedVar) {
        options.inJustDecodeBounds = true;
        d(bijVar, options, bhwVar, bedVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x025d A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6 A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0236 A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ac A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02bc A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0274 A[Catch: all -> 0x00bb, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:163:0x00ad, B:27:0x00c6, B:31:0x00cf, B:36:0x022a, B:38:0x0236, B:39:0x0265, B:46:0x02a1, B:49:0x02ac, B:51:0x02b2, B:52:0x02b4, B:54:0x02bc, B:56:0x02c2, B:58:0x02c8, B:60:0x02d2, B:61:0x02db, B:62:0x02d7, B:63:0x02e2, B:65:0x02ed, B:68:0x0348, B:70:0x034e, B:71:0x0353, B:80:0x02fc, B:81:0x0309, B:83:0x0339, B:84:0x030d, B:85:0x0311, B:86:0x031a, B:87:0x031e, B:88:0x0327, B:89:0x0330, B:90:0x0334, B:92:0x026e, B:94:0x0274, B:95:0x027e, B:97:0x0240, B:102:0x0246, B:104:0x0250, B:105:0x0255, B:107:0x025d, B:100:0x0261, B:108:0x0253), top: B:162:0x00ad }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bdv a(bij bijVar, int i, int i2, bbl bblVar, bhw bhwVar) {
        int a2;
        int i3;
        boolean z;
        int i4;
        bbm bbmVar;
        int i5;
        boolean z2;
        boolean z3;
        float f2;
        Bitmap.Config config;
        Bitmap d2;
        Bitmap bitmap;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        boolean isWideGamut;
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Bitmap.Config config5;
        int i6;
        int floor;
        int floor2;
        brn brnVar;
        bhx bhxVar = this;
        byte[] bArr = (byte[]) bhxVar.h.a(65536, byte[].class);
        BitmapFactory.Options e2 = e();
        e2.inTempStorage = bArr;
        baw bawVar = (baw) bblVar.b(a);
        bbm bbmVar2 = (bbm) bblVar.b(b);
        bhu bhuVar = (bhu) bblVar.b(bhu.g);
        if (bhuVar == bhu.f && (brnVar = bhxVar.i) != null && brnVar.v(azr.class)) {
            bhuVar = bhu.c;
        }
        boolean booleanValue = ((Boolean) bblVar.b(c)).booleanValue();
        bbk bbkVar = d;
        boolean z4 = bblVar.b(bbkVar) != null && ((Boolean) bblVar.b(bbkVar)).booleanValue();
        try {
            double d3 = bmd.a;
            SystemClock.elapsedRealtimeNanos();
            bed bedVar = bhxVar.k;
            int[] j2 = j(bijVar, e2, bhwVar, bedVar);
            int i7 = j2[0];
            int i8 = j2[1];
            String str = e2.outMimeType;
            if (i7 != -1) {
                if (i8 == -1) {
                    i8 = -1;
                }
                a2 = bijVar.a();
                Paint paint = bir.a;
                switch (a2) {
                    case 3:
                    case 4:
                        i3 = 180;
                        z = booleanValue;
                        break;
                    case 5:
                    case 6:
                        i3 = 90;
                        z = booleanValue;
                        break;
                    case 7:
                    case 8:
                        i3 = 270;
                        z = booleanValue;
                        break;
                    default:
                        z = booleanValue;
                        i3 = 0;
                        break;
                }
                boolean f3 = bir.f(a2);
                i4 = i;
                if (i4 != Integer.MIN_VALUE) {
                    try {
                        if (h(i3)) {
                            bbmVar = bbmVar2;
                            i4 = i8;
                        } else {
                            bbmVar = bbmVar2;
                            i4 = i7;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bArr = bArr;
                        f(e2);
                        bhxVar.h.c(bArr);
                        throw th;
                    }
                } else {
                    bbmVar = bbmVar2;
                }
                i5 = i2;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = h(i3) ? i7 : i8;
                }
                ImageHeaderParser$ImageType c2 = bijVar.c();
                if (i7 > 0) {
                    z2 = z4;
                    z3 = f3;
                    f2 = 1.0f;
                } else {
                    if (i8 <= 0) {
                        z2 = z4;
                        z3 = f3;
                        f2 = 1.0f;
                        if (bhxVar.m.b(i4, i5, z2, z3)) {
                            config5 = Bitmap.Config.HARDWARE;
                            e2.inPreferredConfig = config5;
                            e2.inMutable = false;
                        } else if (bawVar != baw.a) {
                            if (bijVar.c().hasAlpha()) {
                                config = Bitmap.Config.ARGB_8888;
                                e2.inPreferredConfig = config;
                                if (e2.inPreferredConfig == Bitmap.Config.RGB_565) {
                                    e2.inDither = true;
                                }
                            }
                            config = Bitmap.Config.RGB_565;
                            e2.inPreferredConfig = config;
                            if (e2.inPreferredConfig == Bitmap.Config.RGB_565) {
                            }
                        } else {
                            e2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        }
                        int i9 = e2.inSampleSize;
                        if (i7 >= 0 || i8 < 0 || !z) {
                            float f4 = i(e2) ? e2.inTargetDensity / e2.inDensity : f2;
                            float f5 = e2.inSampleSize;
                            int ceil = (int) Math.ceil(i7 / f5);
                            int ceil2 = (int) Math.ceil(i8 / f5);
                            i4 = Math.round(ceil * f4);
                            i5 = Math.round(ceil2 * f4);
                        }
                        if (i4 > 0 && i5 > 0) {
                            bed bedVar2 = bhxVar.k;
                            config2 = e2.inPreferredConfig;
                            config3 = Bitmap.Config.HARDWARE;
                            if (config2 != config3) {
                                config4 = e2.outConfig;
                                if (config4 == null) {
                                    config4 = e2.inPreferredConfig;
                                }
                                e2.inBitmap = bedVar2.b(i4, i5, config4);
                            }
                        }
                        if (bbmVar != null) {
                            if (bbmVar == bbm.b) {
                                colorSpace2 = e2.outColorSpace;
                                if (colorSpace2 != null) {
                                    colorSpace3 = e2.outColorSpace;
                                    isWideGamut = colorSpace3.isWideGamut();
                                    if (isWideGamut) {
                                        named = ColorSpace.Named.DISPLAY_P3;
                                        colorSpace = ColorSpace.get(named);
                                        e2.inPreferredColorSpace = colorSpace;
                                    }
                                }
                            }
                            named = ColorSpace.Named.SRGB;
                            colorSpace = ColorSpace.get(named);
                            e2.inPreferredColorSpace = colorSpace;
                        }
                        bed bedVar3 = bhxVar.k;
                        d2 = d(bijVar, e2, bhwVar, bedVar3);
                        bhwVar.a(bedVar3, d2);
                        if (d2 != null) {
                            d2.setDensity(bhxVar.l.densityDpi);
                            if (bir.f(a2)) {
                                Matrix matrix = new Matrix();
                                switch (a2) {
                                    case 2:
                                        matrix.setScale(-1.0f, f2);
                                        break;
                                    case 3:
                                        matrix.setRotate(180.0f);
                                        break;
                                    case 4:
                                        matrix.setRotate(180.0f);
                                        matrix.postScale(-1.0f, f2);
                                        break;
                                    case 5:
                                        matrix.setRotate(90.0f);
                                        matrix.postScale(-1.0f, 1.0f);
                                        break;
                                    case 6:
                                        matrix.setRotate(90.0f);
                                        break;
                                    case 7:
                                        matrix.setRotate(-90.0f);
                                        matrix.postScale(-1.0f, f2);
                                        break;
                                    case 8:
                                        matrix.setRotate(-90.0f);
                                        break;
                                }
                                bitmap = Bitmap.createBitmap(d2, 0, 0, d2.getWidth(), d2.getHeight(), matrix, true);
                            } else {
                                bitmap = d2;
                            }
                            if (!d2.equals(bitmap)) {
                                bedVar3.d(d2);
                            }
                        } else {
                            bitmap = null;
                        }
                        bil g = bil.g(bitmap, bedVar3);
                        f(e2);
                        bhxVar.h.c(bArr);
                        return g;
                    }
                    f2 = 1.0f;
                    try {
                        boolean h = h(i3);
                        z2 = z4;
                        if (true != h) {
                            z3 = f3;
                            i6 = i8;
                        } else {
                            z3 = f3;
                            i6 = i7;
                        }
                        int i10 = true != h ? i7 : i8;
                        float a3 = bhuVar.a(i10, i6, i4, i5);
                        if (a3 <= 0.0f) {
                            throw new IllegalArgumentException("Cannot scale with factor: " + a3 + " from: " + String.valueOf(bhuVar) + ", source: [" + i7 + "x" + i8 + "], target: [" + i4 + "x" + i5 + "]");
                        }
                        int b2 = bhuVar.b(i10, i6, i4, i5);
                        float f6 = i10;
                        int i11 = i10;
                        int c3 = c(a3 * f6);
                        float f7 = i6;
                        int c4 = c(a3 * f7);
                        int i12 = i11 / c3;
                        int i13 = i6 / c4;
                        int max = Math.max(1, Integer.highestOneBit(b2 == 1 ? Math.max(i12, i13) : Math.min(i12, i13)));
                        if (b2 == 1 && max < 1.0f / a3) {
                            max += max;
                        }
                        e2.inSampleSize = max;
                        if (c2 == ImageHeaderParser$ImageType.JPEG) {
                            float min = Math.min(max, 8);
                            floor = (int) Math.ceil(f6 / min);
                            floor2 = (int) Math.ceil(f7 / min);
                            int i14 = max / 8;
                            if (i14 > 0) {
                                floor /= i14;
                                floor2 /= i14;
                            }
                        } else {
                            if (c2 != ImageHeaderParser$ImageType.PNG && c2 != ImageHeaderParser$ImageType.PNG_A) {
                                if (c2.isWebp()) {
                                    float f8 = max;
                                    floor = Math.round(f6 / f8);
                                    floor2 = Math.round(f7 / f8);
                                } else {
                                    if (i11 % max == 0 && i6 % max == 0) {
                                        floor = i11 / max;
                                        floor2 = i6 / max;
                                    }
                                    int[] j3 = j(bijVar, e2, bhwVar, bedVar);
                                    floor = j3[0];
                                    floor2 = j3[1];
                                }
                            }
                            float f9 = max;
                            floor = (int) Math.floor(f6 / f9);
                            floor2 = (int) Math.floor(f7 / f9);
                        }
                        double a4 = bhuVar.a(floor, floor2, i4, i5);
                        e2.inTargetDensity = c((a4 / (r5 / r4)) * c(b(a4) * a4));
                        e2.inDensity = b(a4);
                        if (i(e2)) {
                            e2.inScaled = true;
                        } else {
                            e2.inTargetDensity = 0;
                            e2.inDensity = 0;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bhxVar = this;
                        bArr = bArr;
                        f(e2);
                        bhxVar.h.c(bArr);
                        throw th;
                    }
                }
                bhxVar = this;
                if (bhxVar.m.b(i4, i5, z2, z3)) {
                }
                int i92 = e2.inSampleSize;
                if (i7 >= 0) {
                }
                if (i(e2)) {
                }
                float f52 = e2.inSampleSize;
                int ceil3 = (int) Math.ceil(i7 / f52);
                int ceil22 = (int) Math.ceil(i8 / f52);
                i4 = Math.round(ceil3 * f4);
                i5 = Math.round(ceil22 * f4);
                if (i4 > 0) {
                    bed bedVar22 = bhxVar.k;
                    config2 = e2.inPreferredConfig;
                    config3 = Bitmap.Config.HARDWARE;
                    if (config2 != config3) {
                    }
                }
                if (bbmVar != null) {
                }
                bed bedVar32 = bhxVar.k;
                d2 = d(bijVar, e2, bhwVar, bedVar32);
                bhwVar.a(bedVar32, d2);
                if (d2 != null) {
                }
                bil g2 = bil.g(bitmap, bedVar32);
                f(e2);
                bhxVar.h.c(bArr);
                return g2;
            }
            z4 = false;
            a2 = bijVar.a();
            Paint paint2 = bir.a;
            switch (a2) {
            }
            boolean f32 = bir.f(a2);
            i4 = i;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = i2;
            if (i5 == Integer.MIN_VALUE) {
            }
            ImageHeaderParser$ImageType c22 = bijVar.c();
            if (i7 > 0) {
            }
            bhxVar = this;
            if (bhxVar.m.b(i4, i5, z2, z3)) {
            }
            int i922 = e2.inSampleSize;
            if (i7 >= 0) {
            }
            if (i(e2)) {
            }
            float f522 = e2.inSampleSize;
            int ceil32 = (int) Math.ceil(i7 / f522);
            int ceil222 = (int) Math.ceil(i8 / f522);
            i4 = Math.round(ceil32 * f4);
            i5 = Math.round(ceil222 * f4);
            if (i4 > 0) {
            }
            if (bbmVar != null) {
            }
            bed bedVar322 = bhxVar.k;
            d2 = d(bijVar, e2, bhwVar, bedVar322);
            bhwVar.a(bedVar322, d2);
            if (d2 != null) {
            }
            bil g22 = bil.g(bitmap, bedVar322);
            f(e2);
            bhxVar.h.c(bArr);
            return g22;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
