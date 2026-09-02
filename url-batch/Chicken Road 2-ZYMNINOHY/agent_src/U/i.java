package U;

import E.AbstractC0005f;
import T.F;
import W.AbstractC0108a;
import W.C0112e;
import W.InterfaceC0113f;
import a.AbstractC0124a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import com.google.android.gms.internal.play_billing.F1;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.U0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import o3.InterfaceC1328a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.AbstractC1404a;
import w.C1482b;
import w.C1483c;
import w.C1484d;
import w.InterfaceC1481a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static AudioManager f3044a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f3045b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f3046c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Field f3047d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3048e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3049f = true;

    public static void A(W.t tVar) {
        int i4;
        int i5 = tVar.i(2);
        if (i5 == 0) {
            tVar.t(6);
            return;
        }
        int v = v(tVar, 5, 8, 16) + 1;
        if (i5 == 1) {
            tVar.t(v * 7);
            return;
        }
        if (i5 == 2) {
            boolean h2 = tVar.h();
            int i6 = h2 ? 1 : 5;
            int i7 = h2 ? 7 : 5;
            int i8 = h2 ? 8 : 6;
            int i9 = 0;
            while (i9 < v) {
                if (tVar.h()) {
                    tVar.t(7);
                    i4 = 0;
                } else {
                    if (tVar.i(2) == 3 && tVar.i(i7) * i6 != 0) {
                        tVar.s();
                    }
                    i4 = tVar.i(i8) * i6;
                    if (i4 != 0 && i4 != 180) {
                        tVar.s();
                    }
                    tVar.s();
                }
                if (i4 != 0 && i4 != 180 && tVar.h()) {
                    i9++;
                }
                i9++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean B(y0.k kVar, boolean z) {
        int i4;
        W.u uVar = new W.u(16);
        boolean z4 = true;
        while (true) {
            uVar.J(8);
            if (!kVar.l(uVar.f3351a, 0, 8, true)) {
                break;
            }
            long B4 = uVar.B();
            int m4 = uVar.m();
            if (B4 != 1) {
                i4 = 8;
            } else {
                if (!kVar.l(uVar.f3351a, 8, 8, true)) {
                    break;
                }
                B4 = uVar.F();
                i4 = 16;
            }
            long j4 = i4;
            if (B4 < j4) {
                break;
            }
            int i5 = (int) (B4 - j4);
            if (z4) {
                if (m4 != 1718909296 || i5 < 8) {
                    break;
                }
                uVar.J(4);
                kVar.l(uVar.f3351a, 0, 4, false);
                if (uVar.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                kVar.a(i5 - 4, false);
                z4 = false;
            } else {
                if (m4 == 1836086884) {
                    break;
                }
                if (i5 != 0) {
                    kVar.a(i5, false);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void C(V0.d dVar, V0.k kVar, InterfaceC0113f interfaceC0113f) {
        int b4;
        boolean z;
        int i4;
        long j4 = kVar.f3208a;
        if (j4 == -9223372036854775807L) {
            b4 = 0;
        } else {
            b4 = dVar.b(j4);
            if (b4 == -1) {
                b4 = dVar.f();
            }
            if (b4 > 0 && dVar.c(b4 - 1) == j4) {
                b4--;
            }
        }
        if (j4 != -9223372036854775807L && b4 < dVar.f()) {
            List e4 = dVar.e(j4);
            long c4 = dVar.c(b4);
            if (!e4.isEmpty()) {
                long j5 = kVar.f3208a;
                if (j5 < c4) {
                    interfaceC0113f.accept(new V0.a(j5, c4 - j5, e4));
                    z = true;
                    for (i4 = b4; i4 < dVar.f(); i4++) {
                        s(dVar, i4, interfaceC0113f);
                    }
                    if (kVar.f3209b) {
                        return;
                    }
                    if (z) {
                        b4--;
                    }
                    for (int i5 = 0; i5 < b4; i5++) {
                        s(dVar, i5, interfaceC0113f);
                    }
                    if (z) {
                        interfaceC0113f.accept(new V0.a(dVar.c(b4), j4 - dVar.c(b4), dVar.e(j4)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i4 < dVar.f()) {
        }
        if (kVar.f3209b) {
        }
    }

    public static String D(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            if (p(str.charAt(i4))) {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (p(c4)) {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static String E(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static final boolean F(String str, InterfaceC1328a interfaceC1328a) {
        try {
            boolean booleanValue = ((Boolean) interfaceC1328a.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static void G(int i4, int i5) {
        String B4;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                B4 = V3.b.B("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(AbstractC0005f.j(i5, "negative size: "));
                }
                B4 = V3.b.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(B4);
        }
    }

    public static void I(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(O(i4, i5, "index"));
        }
    }

    public static void L(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? O(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? O(i5, i6, "end index") : V3.b.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static String O(int i4, int i5, String str) {
        if (i4 < 0) {
            return V3.b.B("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return V3.b.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(AbstractC0005f.j(i5, "negative size: "));
    }

    public static void a(int i4, int i5, int i6) {
        if (i4 >= 0 && i5 <= i6) {
            if (i4 > i5) {
                throw new IllegalArgumentException(AbstractC0005f.i(i4, i5, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
    }

    public static byte b(long j4) {
        AbstractC0124a.i((j4 >> 8) == 0, "out of range: %s", j4);
        return (byte) j4;
    }

    public static final void c(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                O3.d.c(th, th2);
            }
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean e(File file, Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean f4 = f(file, inputStream);
                d(inputStream);
                return f4;
            } catch (Throwable th) {
                th = th;
                d(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean f(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            d(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean g(Method method, kotlin.jvm.internal.d dVar) {
        Class a3 = dVar.a();
        kotlin.jvm.internal.i.c(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a3);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean h(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U.i.h(java.lang.String, java.lang.String):boolean");
    }

    public static G3.t i(String str) {
        if (str.equals("http/1.0")) {
            return G3.t.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return G3.t.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return G3.t.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return G3.t.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return G3.t.SPDY_3;
        }
        if (str.equals("quic")) {
            return G3.t.QUIC;
        }
        throw new IOException(kotlin.jvm.internal.i.h(str, "Unexpected protocol: "));
    }

    public static synchronized AudioManager j(Context context) {
        synchronized (i.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f3044a = null;
                }
                AudioManager audioManager = f3044a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    C0112e c0112e = new C0112e();
                    AbstractC0108a.g().execute(new R1.e(applicationContext, 1, c0112e));
                    c0112e.a();
                    AudioManager audioManager2 = f3044a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f3044a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File k(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + TokenBuilder.TOKEN_DELIMITER + Process.myTid() + TokenBuilder.TOKEN_DELIMITER;
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int m(String str) {
        char c4;
        if (str == null) {
            return -1;
        }
        String n = F.n(str);
        n.getClass();
        switch (n.hashCode()) {
            case -2123537834:
                if (n.equals("audio/eac3-joc")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1662384011:
                if (n.equals("video/mp2p")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1662384007:
                if (n.equals("video/mp2t")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -1662095187:
                if (n.equals("video/webm")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -1606874997:
                if (n.equals("audio/amr-wb")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -1487656890:
                if (n.equals("image/avif")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -1487464693:
                if (n.equals("image/heic")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -1487464690:
                if (n.equals("image/heif")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -1487394660:
                if (n.equals("image/jpeg")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case -1487018032:
                if (n.equals("image/webp")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case -1248337486:
                if (n.equals("application/mp4")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case -1079884372:
                if (n.equals("video/x-msvideo")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case -1004728940:
                if (n.equals("text/vtt")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case -879272239:
                if (n.equals("image/bmp")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case -879258763:
                if (n.equals("image/png")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case -387023398:
                if (n.equals("audio/x-matroska")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case -43467528:
                if (n.equals("application/webm")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 13915911:
                if (n.equals("video/x-flv")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (n.equals("audio/ac3")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case 187078297:
                if (n.equals("audio/ac4")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 187078669:
                if (n.equals("audio/amr")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 187090232:
                if (n.equals("audio/mp4")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            case 187091926:
                if (n.equals("audio/ogg")) {
                    c4 = 22;
                    break;
                }
                c4 = 65535;
                break;
            case 187099443:
                if (n.equals("audio/wav")) {
                    c4 = 23;
                    break;
                }
                c4 = 65535;
                break;
            case 1331848029:
                if (n.equals("video/mp4")) {
                    c4 = 24;
                    break;
                }
                c4 = 65535;
                break;
            case 1503095341:
                if (n.equals("audio/3gpp")) {
                    c4 = 25;
                    break;
                }
                c4 = 65535;
                break;
            case 1504578661:
                if (n.equals("audio/eac3")) {
                    c4 = 26;
                    break;
                }
                c4 = 65535;
                break;
            case 1504619009:
                if (n.equals("audio/flac")) {
                    c4 = 27;
                    break;
                }
                c4 = 65535;
                break;
            case 1504824762:
                if (n.equals("audio/midi")) {
                    c4 = 28;
                    break;
                }
                c4 = 65535;
                break;
            case 1504831518:
                if (n.equals("audio/mpeg")) {
                    c4 = 29;
                    break;
                }
                c4 = 65535;
                break;
            case 1505118770:
                if (n.equals("audio/webm")) {
                    c4 = 30;
                    break;
                }
                c4 = 65535;
                break;
            case 2039520277:
                if (n.equals("video/x-matroska")) {
                    c4 = 31;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
        }
        return -1;
    }

    public static int n(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static boolean o(byte b4) {
        return b4 > -65;
    }

    public static boolean p(char c4) {
        return c4 >= 'A' && c4 <= 'Z';
    }

    public static String q(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            sb.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb.append(str2.charAt(i4));
            }
        }
        return sb.toString();
    }

    public static MappedByteBuffer r(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void s(V0.d dVar, int i4, InterfaceC0113f interfaceC0113f) {
        long c4 = dVar.c(i4);
        List e4 = dVar.e(c4);
        if (e4.isEmpty()) {
            return;
        }
        if (i4 == dVar.f() - 1) {
            throw new IllegalStateException();
        }
        long c5 = dVar.c(i4 + 1) - dVar.c(i4);
        if (c5 > 0) {
            interfaceC0113f.accept(new V0.a(c4, c5, e4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC1481a t(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i4;
        int i5;
        String str;
        String str2;
        ?? r32;
        long j4;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        do {
            next = xmlResourceParser.next();
            i4 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            y(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1404a.f15204a);
        int i6 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i7 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1404a.f15205b);
                        int i8 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i9 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i10 = obtainAttributes2.getInt(i9, 0);
                        int i11 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                        String string7 = obtainAttributes2.getString(i11);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            y(xmlResourceParser);
                        }
                        arrayList.add(new C1483c(i8, i10, resourceId2, string7, string6, z));
                    } else {
                        y(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C1482b((C1483c[]) arrayList.toArray(new C1483c[0]));
        }
        List u4 = u(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i7) {
            if (xmlResourceParser.getEventType() == i4) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1404a.f15206c);
                    int i12 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i6);
                        String string9 = obtainAttributes3.getString(1);
                        String string10 = obtainAttributes3.getString(i4);
                        if (string8 == null) {
                            r32 = obtainAttributes3;
                            j4 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                y(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = obtainAttributes3;
                                j4 = 1;
                            }
                        }
                        try {
                            r32 = obtainAttributes3;
                            str2 = string4;
                            i5 = i12;
                            str = string3;
                            j4 = 1;
                            try {
                                B.f fVar = new B.f(string, string2, string8, u4, string9, string10);
                                if (r32 instanceof AutoCloseable) {
                                    ((AutoCloseable) r32).close();
                                } else if (r32 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r32;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z4 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z4) {
                                                    executorService.shutdownNow();
                                                    z4 = true;
                                                }
                                            }
                                        }
                                        if (z4) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r32.recycle();
                                }
                                arrayList2.add(fVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r32 = obtainAttributes3;
                            j4 = 1;
                            th = th;
                            typedArray = r32;
                            if (typedArray != null) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r32 = obtainAttributes3;
                    }
                    th = th;
                    typedArray = r32;
                    if (typedArray != null) {
                        throw th;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                            throw th;
                        }
                        if (!(typedArray instanceof ExecutorService)) {
                            typedArray.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) typedArray;
                        if (executorService2 == ForkJoinPool.commonPool()) {
                            throw th;
                        }
                        boolean isTerminated2 = executorService2.isTerminated();
                        if (isTerminated2) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z5 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j4, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z5) {
                                    executorService2.shutdownNow();
                                    z5 = true;
                                }
                            }
                        }
                        if (!z5) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i5 = integer;
                str = string3;
                str2 = string4;
                y(xmlResourceParser);
                integer = i5;
                string3 = str;
                string4 = str2;
                i4 = 2;
                i6 = 0;
                i7 = 3;
            }
        }
        int i13 = integer;
        String str3 = string3;
        String str4 = string4;
        if (!arrayList2.isEmpty()) {
            return new C1484d(arrayList2, i13, integer2, string5);
        }
        if (str3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new B.f(string, string2, str3, u4, null, null));
        if (str4 != null) {
            arrayList2.add(new B.f(string, string2, str4, u4, null, null));
        }
        return new C1484d(arrayList2, i13, integer2, string5);
    }

    public static List u(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i4);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int v(W.t tVar, int i4, int i5, int i6) {
        AbstractC0124a.h(Math.max(Math.max(i4, i5), i6) <= 31);
        int i7 = (1 << i4) - 1;
        int i8 = (1 << i5) - 1;
        AbstractC0124a.u(AbstractC0124a.u(i7, i8), 1 << i6);
        if (tVar.b() < i4) {
            return -1;
        }
        int i9 = tVar.i(i4);
        if (i9 == i7) {
            if (tVar.b() < i5) {
                return -1;
            }
            int i10 = tVar.i(i5);
            i9 += i10;
            if (i10 == i8) {
                if (tVar.b() < i6) {
                    return -1;
                }
                return tVar.i(i6) + i9;
            }
        }
        return i9;
    }

    public static void y(XmlPullParser xmlPullParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    public static void z(W.t tVar) {
        tVar.t(3);
        tVar.t(8);
        boolean h2 = tVar.h();
        boolean h4 = tVar.h();
        if (h2) {
            tVar.t(5);
        }
        if (h4) {
            tVar.t(6);
        }
    }

    public abstract void H(F1 f12, F1 f13);

    public abstract void J(F1 f12, Thread thread);

    public abstract boolean K(G1 g12, U0 u02, U0 u03);

    public abstract boolean M(G1 g12, Object obj, Object obj2);

    public abstract boolean N(G1 g12, F1 f12, F1 f13);

    public float l(View view) {
        float transitionAlpha;
        if (f3049f) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f3049f = false;
            }
        }
        return view.getAlpha();
    }

    public void w(View view, float f4) {
        if (f3049f) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f3049f = false;
            }
        }
        view.setAlpha(f4);
    }

    public void x(View view, int i4) {
        if (!f3048e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3047d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f3048e = true;
        }
        Field field = f3047d;
        if (field != null) {
            try {
                f3047d.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
