package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.oN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3686oN implements InterfaceC3140eH {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33138n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f33139u;

    public C3686oN(String str, int i) {
        this.f33138n = i;
        switch (i) {
            case 1:
                this.f33139u = Logger.getLogger(str);
                break;
            default:
                this.f33139u = str;
                break;
        }
    }

    public static C3999uD A(J3.a aVar, XA xa, Executor executor) {
        int i = AbstractRunnableC4053vD.f34741C;
        C3999uD c3999uD = new C3999uD(aVar, xa);
        aVar.c(c3999uD, YD.h(executor, c3999uD));
        return c3999uD;
    }

    public static int B(int i, byte[] bArr, int i4, int i9, InterfaceC3630nL interfaceC3630nL, LK lk) {
        C3254gL c3254gL = (C3254gL) interfaceC3630nL;
        int b9 = b(bArr, i4, lk);
        c3254gL.e(lk.f26141a);
        while (b9 < i9) {
            int b10 = b(bArr, b9, lk);
            if (i != lk.f26141a) {
                break;
            }
            b9 = b(bArr, b10, lk);
            c3254gL.e(lk.f26141a);
        }
        return b9;
    }

    public static int C(byte[] bArr, int i, InterfaceC3630nL interfaceC3630nL, LK lk) {
        C3254gL c3254gL = (C3254gL) interfaceC3630nL;
        int b9 = b(bArr, i, lk);
        int i4 = lk.f26141a + b9;
        while (b9 < i4) {
            b9 = b(bArr, b9, lk);
            c3254gL.e(lk.f26141a);
        }
        if (b9 == i4) {
            return b9;
        }
        throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int D(OL ol, int i, byte[] bArr, int i4, int i9, InterfaceC3630nL interfaceC3630nL, LK lk) {
        AbstractC3199fL a9 = ol.a();
        OL ol2 = ol;
        byte[] bArr2 = bArr;
        int i10 = i9;
        LK lk2 = lk;
        int x3 = x(a9, ol2, bArr2, i4, i10, lk2);
        ol2.h(a9);
        lk2.f26143c = a9;
        interfaceC3630nL.add(a9);
        while (x3 < i10) {
            LK lk3 = lk2;
            int i11 = i10;
            int b9 = b(bArr2, x3, lk3);
            if (i != lk3.f26141a) {
                break;
            }
            byte[] bArr3 = bArr2;
            OL ol3 = ol2;
            AbstractC3199fL a10 = ol3.a();
            x3 = x(a10, ol3, bArr3, b9, i11, lk3);
            ol2 = ol3;
            bArr2 = bArr3;
            i10 = i11;
            lk2 = lk3;
            ol2.h(a10);
            lk2.f26143c = a10;
            interfaceC3630nL.add(a10);
        }
        return x3;
    }

    public static int E(int i, byte[] bArr, int i4, int i9, XL xl, LK lk) {
        if ((i >>> 3) == 0) {
            throw new C3845rL("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            int k6 = k(bArr, i4, lk);
            xl.d(i, Long.valueOf(lk.f26142b));
            return k6;
        }
        if (i10 == 1) {
            xl.d(i, Long.valueOf(q(i4, bArr)));
            return i4 + 8;
        }
        if (i10 == 2) {
            int b9 = b(bArr, i4, lk);
            int i11 = lk.f26141a;
            if (i11 < 0) {
                throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - b9) {
                throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                xl.d(i, SK.f27529u);
            } else {
                xl.d(i, SK.s(bArr, b9, i11));
            }
            return b9 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new C3845rL("Protocol message contained an invalid tag (zero).");
            }
            xl.d(i, Integer.valueOf(o(i4, bArr)));
            return i4 + 4;
        }
        int i12 = (i & (-8)) | 4;
        XL a9 = XL.a();
        int i13 = lk.f26144d + 1;
        lk.f26144d = i13;
        G(i13);
        int i14 = 0;
        while (true) {
            if (i4 >= i9) {
                break;
            }
            int b10 = b(bArr, i4, lk);
            int i15 = lk.f26141a;
            if (i15 == i12) {
                i14 = i15;
                i4 = b10;
                break;
            }
            i4 = E(i15, bArr, b10, i9, a9, lk);
            i14 = i15;
        }
        lk.f26144d--;
        if (i4 > i9 || i14 != i12) {
            throw new C3845rL("Failed to parse the message.");
        }
        xl.d(i, a9);
        return i4;
    }

    public static int F(int i, byte[] bArr, int i4, int i9, LK lk) {
        if ((i >>> 3) == 0) {
            throw new C3845rL("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i & 7;
        if (i10 == 0) {
            return k(bArr, i4, lk);
        }
        if (i10 == 1) {
            return i4 + 8;
        }
        if (i10 == 2) {
            return b(bArr, i4, lk) + lk.f26141a;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i4 + 4;
            }
            throw new C3845rL("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i & (-8)) | 4;
        int i12 = lk.f26144d + 1;
        lk.f26144d = i12;
        G(i12);
        int i13 = 0;
        while (i4 < i9) {
            i4 = b(bArr, i4, lk);
            i13 = lk.f26141a;
            if (i13 == i11) {
                break;
            }
            i4 = F(i13, bArr, i4, i9, lk);
        }
        lk.f26144d--;
        if (i4 > i9 || i13 != i11) {
            throw new C3845rL("Failed to parse the message.");
        }
        return i4;
    }

    public static void G(int i) {
        if (i >= 100) {
            throw new C3845rL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public static Object H(Future future) {
        if (future.isDone()) {
            return AbstractC3137eE.b(future);
        }
        throw new IllegalStateException(AbstractC3194fG.u("Future was expected to be done: %s", future));
    }

    public static Object I(C3320hg c3320hg) {
        try {
            return AbstractC3137eE.b(c3320hg);
        } catch (ExecutionException e6) {
            if (e6.getCause() instanceof Error) {
                throw new D7.a((Error) e6.getCause());
            }
            throw new B0.c(e6.getCause());
        }
    }

    public static int a(int i) {
        int i4 = 0;
        while (i > 0) {
            i >>>= 1;
            i4++;
        }
        return i4;
    }

    public static int b(byte[] bArr, int i, LK lk) {
        int i4 = i + 1;
        byte b9 = bArr[i];
        if (b9 < 0) {
            return f(b9, bArr, i4, lk);
        }
        lk.f26141a = b9;
        return i4;
    }

    public static OD c(Object obj) {
        return obj == null ? OD.f26665u : new OD(obj);
    }

    public static void e(long[] jArr, long[] jArr2, int i) {
        for (int i4 = 0; i4 < 10; i4++) {
            int i9 = (int) jArr[i4];
            jArr[i4] = ((-i) & (((int) jArr2[i4]) ^ i9)) ^ i9;
        }
    }

    public static int f(int i, byte[] bArr, int i4, LK lk) {
        byte b9 = bArr[i4];
        int i9 = i4 + 1;
        int i10 = i & com.anythink.expressad.video.module.a.a.f21886R;
        if (b9 >= 0) {
            lk.f26141a = i10 | (b9 << 7);
            return i9;
        }
        int i11 = i10 | ((b9 & Byte.MAX_VALUE) << 7);
        int i12 = i4 + 2;
        byte b10 = bArr[i9];
        if (b10 >= 0) {
            lk.f26141a = i11 | (b10 << 14);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 14);
        int i14 = i4 + 3;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            lk.f26141a = i13 | (b11 << 21);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 21);
        int i16 = i4 + 4;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            lk.f26141a = i15 | (b12 << 28);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                lk.f26141a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(boolean z8) {
        List supportedPerformancePoints;
        boolean covers;
        try {
            C4065vP c4065vP = new C4065vP();
            c4065vP.e(com.anythink.basead.exoplayer.k.o.f8608h);
            TP tp = new TP(c4065vP);
            if (tp.f27776o != null) {
                C3675oC b9 = AbstractC3419jQ.b(C3796qP.f33728z, tp, z8, false);
                for (int i = 0; i < b9.f33117w; i++) {
                    if (((C2986bQ) b9.get(i)).f29493d != null && (r2 = ((C2986bQ) b9.get(i)).f29493d.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        R2.a.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint c4 = R2.a.c();
                        for (int i4 = 0; i4 < supportedPerformancePoints.size(); i4++) {
                            covers = R2.a.e(supportedPerformancePoints.get(i4)).covers(c4);
                            if (covers) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C3259gQ unused) {
        }
        return 0;
    }

    public static C2478Aq h(Lr lr, boolean z8, boolean z9) {
        if (z8) {
            m(3, lr, false);
        }
        lr.k((int) lr.a(), StandardCharsets.UTF_8);
        long a9 = lr.a();
        String[] strArr = new String[(int) a9];
        for (int i = 0; i < a9; i++) {
            strArr[i] = lr.k((int) lr.a(), StandardCharsets.UTF_8);
        }
        if (z9 && (lr.K() & 1) == 0) {
            throw W4.a(null, "framing bit expected to be set");
        }
        return new C2478Aq(13, strArr);
    }

    public static InterfaceC3140eH i(C3031cH c3031cH) {
        Mu mu = c3031cH.f29664c;
        C3195fH c3195fH = new C3195fH(((C3791qK) mu.f26395u).b());
        try {
            Provider e6 = AbstractC2720Pd.e();
            if (e6 == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", e6);
            return new C4164xG(3, c3195fH, new C4164xG(((C3791qK) mu.f26395u).b(), e6));
        } catch (GeneralSecurityException unused) {
            return c3195fH;
        }
    }

    public static C3686oN j(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new C3686oN(cls.getSimpleName(), 0) : new C3686oN(cls.getSimpleName(), 1);
    }

    public static int k(byte[] bArr, int i, LK lk) {
        long j9 = bArr[i];
        int i4 = i + 1;
        if (j9 >= 0) {
            lk.f26142b = j9;
            return i4;
        }
        int i9 = i + 2;
        byte b9 = bArr[i4];
        long j10 = (j9 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b9 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j10 |= (r10 & Byte.MAX_VALUE) << i10;
            b9 = bArr[i9];
            i9 = i11;
        }
        lk.f26142b = j10;
        return i9;
    }

    public static ND l(Throwable th) {
        th.getClass();
        ND nd = new ND();
        nd.e(th);
        return nd;
    }

    public static boolean m(int i, Lr lr, boolean z8) {
        if (lr.B() < 7) {
            if (z8) {
                return false;
            }
            int B8 = lr.B();
            StringBuilder sb = new StringBuilder(String.valueOf(B8).length() + 18);
            sb.append("too short header: ");
            sb.append(B8);
            throw W4.a(null, sb.toString());
        }
        if (lr.K() != i) {
            if (z8) {
                return false;
            }
            throw W4.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i))));
        }
        if (lr.K() == 118 && lr.K() == 111 && lr.K() == 114 && lr.K() == 98 && lr.K() == 105 && lr.K() == 115) {
            return true;
        }
        if (z8) {
            return false;
        }
        throw W4.a(null, "expected characters 'vorbis'");
    }

    public static int o(int i, byte[] bArr) {
        int i4 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i9 << 8) | i4 | (i10 << 16);
    }

    public static RunnableFutureC3083dE p(Callable callable, Executor executor) {
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE(callable);
        executor.execute(runnableFutureC3083dE);
        return runnableFutureC3083dE;
    }

    public static long q(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int r(byte[] bArr, int i, LK lk) {
        int b9 = b(bArr, i, lk);
        int i4 = lk.f26141a;
        if (i4 < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            lk.f26143c = "";
            return b9;
        }
        lk.f26143c = AbstractC3145eM.d(bArr, b9, i4);
        return b9 + i4;
    }

    public static RunnableFutureC3083dE s(BD bd, SD sd) {
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE();
        runnableFutureC3083dE.f29990A = new C3028cE(runnableFutureC3083dE, bd);
        sd.execute(runnableFutureC3083dE);
        return runnableFutureC3083dE;
    }

    public static int t(byte[] bArr, int i, LK lk) {
        int b9 = b(bArr, i, lk);
        int i4 = lk.f26141a;
        if (i4 < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - b9) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            lk.f26143c = SK.f27529u;
            return b9;
        }
        lk.f26143c = SK.s(bArr, b9, i4);
        return b9 + i4;
    }

    public static ZC u(J3.a aVar, Class cls, XA xa, Executor executor) {
        int i = AbstractRunnableC2918aD.f29183D;
        ZC zc = new ZC(aVar, cls, xa);
        aVar.c(zc, YD.h(executor, zc));
        return zc;
    }

    public static YC v(J3.a aVar, Class cls, CD cd, Executor executor) {
        int i = AbstractRunnableC2918aD.f29183D;
        YC yc = new YC(aVar, cls, cd);
        aVar.c(yc, YD.h(executor, yc));
        return yc;
    }

    public static J3.a w(J3.a aVar, long j9, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aVar.isDone()) {
            return aVar;
        }
        C2974bE c2974bE = new C2974bE();
        c2974bE.f29435A = aVar;
        RunnableC3873rw runnableC3873rw = new RunnableC3873rw();
        runnableC3873rw.f34142u = c2974bE;
        c2974bE.f29436B = scheduledExecutorService.schedule(runnableC3873rw, j9, timeUnit);
        aVar.c(runnableC3873rw, HD.f25326n);
        return c2974bE;
    }

    public static int x(Object obj, OL ol, byte[] bArr, int i, int i4, LK lk) {
        int i9 = i + 1;
        int i10 = bArr[i];
        if (i10 < 0) {
            i9 = f(i10, bArr, i9, lk);
            i10 = lk.f26141a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i4 - i11) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = lk.f26144d + 1;
        lk.f26144d = i12;
        G(i12);
        int i13 = i11 + i10;
        ol.d(obj, bArr, i11, i13, lk);
        lk.f26144d--;
        lk.f26143c = obj;
        return i13;
    }

    public static C3945tD y(J3.a aVar, CD cd, Executor executor) {
        int i = AbstractRunnableC4053vD.f34741C;
        C3945tD c3945tD = new C3945tD(aVar, cd);
        aVar.c(c3945tD, YD.h(executor, c3945tD));
        return c3945tD;
    }

    public static int z(Object obj, OL ol, byte[] bArr, int i, int i4, int i9, LK lk) {
        int i10 = lk.f26144d + 1;
        lk.f26144d = i10;
        G(i10);
        int y6 = ((DL) ol).y(obj, bArr, i, i4, i9, lk);
        lk.f26144d--;
        lk.f26143c = obj;
        return y6;
    }

    public final void d(String str) {
        switch (this.f33138n) {
            case 0:
                String str2 = (String) this.f33139u;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                Log.d("isoparser", sb.toString());
                break;
            default:
                ((Logger) this.f33139u).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
