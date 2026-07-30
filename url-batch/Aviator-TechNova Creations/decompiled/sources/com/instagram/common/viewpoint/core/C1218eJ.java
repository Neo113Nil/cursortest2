package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.common.base.Ascii;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.eJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1218eJ {
    public static InterfaceC01604m A06;
    public static BT A07;
    public static InterfaceC0586Ln A08;
    public static C1218eJ A09;
    public static File A0A;
    public static byte[] A0B;
    public static String[] A0C = {"4y", "AwMrvrZaA3qCUMe4DaWf", "nMell2jjCxhf1iVkS1T4", "JoDZxKxhXC6KTCYPanywHJvOgx3oSz2Q", "c4TvbpAtmy9oRzm3BRhbekxSipSfphPN", "JNxty2uNXQJQugnl9tUmEGg4l4lnFcO6", "Bo5IZ2fGdsUyi7NqIQl4cfXztCU0TldF", "nOSbM9ZPEjvtyh7HAXbSWFPDuf7zpKmZ"};
    public boolean A00;
    public final C1133cu A04;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final SparseArray<C1216eH> A02 = new SparseArray<>();
    public final Runnable A05 = new RunnableC1215eG(this);
    public final BS A03 = new CN(this);

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{Ascii.VT, 6, Ascii.VT, 73, 82, 95, 78, 88, 116, 79, 68, 92, 69, 71, 68, 74, 79, 78, 79, 17, 55, 58, 55, 103, 114, 101, 116, 114, 121, 99, 118, 112, 114, 55, 115, 120, 96, 121, 123, 120, 118, 115, 114, 115, 45, 123, 118, 123, 40, 47, 58, 47, 62, 97, 35, 65, 122, 119, 102, 112, 57, 35, 33, 99, 120, 117, 100, 114, 33, 4, 4, 4, 4, 9, 91, 76, 88, 92, 76, 90, 93, 96, 77, 19, Ascii.EM, 50, 42, 51, 49, 50, 60, 57, 56, 57, 115, 125, Ascii.SO, 41, 60, 41, 56, 103, 125, 62, 9, 9, Ascii.DC4, 9, 85, 91, 40, Ascii.SI, Ascii.SUB, Ascii.SI, Ascii.RS, 65, 91, 110, 91, 73, 81, 126, 123, 113, 104, 50, 123, 112, 104, 113, 115, 112, 126, 123, 108, 37, 32, 55, 84, 86, 84, 95, 82};
    }

    static {
        A0D();
    }

    public C1218eJ(C1133cu c1133cu, BT bt) {
        this.A04 = c1133cu;
        if (bt != null) {
            A07 = bt;
            bt.A0F(this.A03);
        }
        A03().A0E();
    }

    public static synchronized InterfaceC01604m A01(Context context) {
        InterfaceC01604m interfaceC01604m;
        synchronized (C1218eJ.class) {
            if (A06 == null) {
                A06 = new C1774no(context);
            }
            interfaceC01604m = A06;
        }
        return interfaceC01604m;
    }

    private C02749j A02() {
        return new C02749j().A01(A08(Opcodes.I2D, 3, 65)).A00(null);
    }

    private synchronized BT A03() {
        A0E();
        return A07;
    }

    public static synchronized InterfaceC0586Ln A04(Context context) {
        InterfaceC0586Ln interfaceC0586Ln;
        synchronized (C1218eJ.class) {
            if (A08 == null) {
                A08 = new C1483ir(new File(A07(context), A08(Opcodes.LSHL, 14, 26)), new C7R(U7.A0T(context)));
            }
            interfaceC0586Ln = A08;
        }
        return interfaceC0586Ln;
    }

    public static C1489ix A05(C1770nk c1770nk, InterfaceC0586Ln interfaceC0586Ln) {
        return new C1489ix().A06(interfaceC0586Ln).A05(c1770nk).A04(new C1764ne()).A03(2);
    }

    public static synchronized C1218eJ A06(C1133cu c1133cu) {
        C1218eJ c1218eJ;
        synchronized (C1218eJ.class) {
            if (A09 == null) {
                A09 = new C1218eJ(c1133cu, null);
            }
            c1218eJ = A09;
        }
        return c1218eJ;
    }

    public static synchronized File A07(Context context) {
        File file;
        synchronized (C1218eJ.class) {
            if (A0A == null) {
                A0A = context.getCacheDir();
                if (A0A == null) {
                    A0A = context.getFilesDir();
                }
            }
            file = A0A;
        }
        return file;
    }

    public static String A09(C1133cu c1133cu, Uri uri) {
        try {
            if (!U7.A1r(c1133cu)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            c1133cu.A08().AAy(A08(Opcodes.L2D, 5, 50), AbstractC0772Sv.A0u, new C0773Sw(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        for (B8 b8 : A03().A0D()) {
            int requestId = b8.A07.A02.hashCode();
            C1216eH c1216eH = this.A02.get(requestId);
            boolean z = b8.A02 == 2 && b8.A01() > 0;
            String str = A08(69, 15, 44) + requestId + A08(20, 25, 18) + b8.A00() + A08(0, 20, 46) + b8.A01() + A08(45, 9, 94) + b8.A02;
            if (c1216eH != null) {
                int state = b8.A02;
                if (state != 3 && !z && b8.A00() < 100.0f) {
                    long A01 = b8.A01();
                    String[] strArr = A0C;
                    if (strArr[7].charAt(29) == strArr[4].charAt(29)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0C;
                    strArr2[3] = "Dot6Q3Penl8IgXRyTYIqC6CBr4bXo7x7";
                    strArr2[6] = "9ocSvY8ybipVJ0ZgVUYrz9Eev0RZQ1px";
                    if (A01 <= c1216eH.A00) {
                        if (state == 4 || state == 1) {
                            String str2 = A08(103, 14, 126) + state;
                            c1216eH.A01.ADD(new Throwable(String.valueOf(b8.A01)));
                            this.A02.remove(requestId);
                        }
                    }
                }
                String str3 = A08(84, 19, 88) + state + A08(54, 8, 6) + b8.A01();
                c1216eH.A01.AD5(c1216eH.A02);
                this.A02.remove(requestId);
            }
            String str4 = A08(Opcodes.LNEG, 4, 63) + requestId + A08(62, 7, 4) + b8.A01();
        }
    }

    private void A0B() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.post(this.A05);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A01.removeCallbacks(this.A05);
        this.A00 = false;
    }

    private synchronized void A0E() {
        if (A07 == null) {
            A07 = new BT(this.A04, A01(this.A04), A04(this.A04), A0H(this.A04), Executors.newFixedThreadPool(6));
            A07.A0F(this.A03);
        }
    }

    public final InterfaceC01704w A0H(Context context) {
        return A05(new C1770nk(context, (C5H) null, A02()), A04(context));
    }

    public final void A0I(Uri uri, InterfaceC1217eI interfaceC1217eI, long j) {
        String cacheKey = A09(this.A04, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean A0J = A0J(cacheKey);
        DownloadRequest A05 = new BW(uri.toString(), uri).A00(cacheKey).A05();
        A03().A0G(A05);
        this.A02.put(A05.A02.hashCode(), new C1216eH(interfaceC1217eI, j, A0J, null));
        A0B();
    }

    public final boolean A0J(String str) {
        return A04(this.A04).A74(str, 0L, 1L) > 0;
    }
}
