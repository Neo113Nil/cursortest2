package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class HR implements InterfaceC0770Qh {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC03197w A00;
    public Executor A01;
    public boolean A02;
    public C0775Qm A03;
    public final InterfaceC0780Qr A04 = new C0547Hn();
    public final InterfaceC0785Qw A05;
    public final InterfaceC0786Qx A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final InterfaceC0769Qg A01(AbstractC0782Qt abstractC0782Qt) throws C0783Qu {
        C0783Qu c0783Qu;
        String A072 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        HT ht = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC0782Qt.A05(), C0613Ke.A04() ? A09() : null);
                A0H(A082, abstractC0782Qt);
                A0G(A082, abstractC0782Qt);
                if (this.A06.A8x()) {
                    this.A06.A9c(A082, abstractC0782Qt.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z2 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        C0787Qy.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.A9g(A072, C03207x.A1y, new C03217y(e));
                    } catch (Exception e2) {
                        this.A00.A9g(A072, C03207x.A1x, new C03217y(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC0782Qt.A06() != null) {
                    A00(A082, abstractC0782Qt.A06());
                }
                HT A06 = A082.getDoInput() ? A06(A082) : new HT(A082, null);
                if (this.A06.A8x()) {
                    this.A06.A9d(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Exception e3) {
                try {
                    try {
                        ht = A05(null);
                    } catch (Throwable unused) {
                        if (ht == null || ht.A7v() <= 0) {
                            throw new C0783Qu(e3, ht);
                        }
                        if (this.A06.A8x()) {
                            this.A06.A9d(ht);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return ht;
                    }
                } catch (Exception unused2) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 53), e3);
                    if (ht != null && ht.A7v() > 0) {
                        if (this.A06.A8x()) {
                            InterfaceC0786Qx interfaceC0786Qx = this.A06;
                            String[] strArr = A08;
                            if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[0] = "IlkFDbfWlXmKaUvETbHYmdNk6OEHYi1H";
                            strArr2[2] = "BN3YcSqfdOqAJI6hng3gZMbRThXyngdJ";
                            interfaceC0786Qx.A9d(ht);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return ht;
                    }
                    c0783Qu = new C0783Qu(e3, ht);
                }
                if (ht == null || ht.A7v() <= 0) {
                    c0783Qu = new C0783Qu(e3, ht);
                    throw c0783Qu;
                }
                if (this.A06.A8x()) {
                    this.A06.A9d(ht);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                return ht;
            }
        } catch (Throwable th) {
            if (this.A06.A8x()) {
                this.A06.A9d(ht);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, Ascii.DC2, 55, 58, 95, 55, 53, 74, 71, Ascii.SO, 74, 72, Ascii.SI, 76, 90, 93, 67, Ascii.SI, Ascii.SO, 71, 93, Ascii.SO, 64, 65, 90, Ascii.SO, 79, Ascii.SO, 88, 79, 66, 71, 74, Ascii.SO, 123, 124, 98, Ascii.SO, 65, 72, Ascii.SO, 94, 102, 106, 9, Ascii.RS, 106, 119, 106, Ascii.FS, 16, 98, 100, 16, Ascii.CR, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, Ascii.CR, Ascii.FS, Ascii.US, 7, Ascii.SUB, 3, 72, Ascii.CR, Ascii.SUB, Ascii.SUB, 7, Ascii.SUB, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Byte.MAX_VALUE, 126, Byte.MAX_VALUE, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, Ascii.CAN, 4, 4, 0, 94, 0, 2, Ascii.US, 8, 9, 56, Ascii.US, 3, 4, Byte.MAX_VALUE, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
    
        if (r30.A04 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0188, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:
    
        r7.A9X(r1, r10, 0, r3, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 27)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        r3 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[EDGE_INSN: B:50:0x0108->B:51:0x0108 BREAK  A[LOOP:0: B:2:0x002a->B:24:0x00cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0769Qg A0J(AbstractC0782Qt abstractC0782Qt) throws C0783Qu {
        InterfaceC0769Qg A00;
        long j;
        InterfaceC0769Qg A01;
        int i = 0;
        long currentTimeMillis = System.currentTimeMillis();
        int A012 = abstractC0782Qt.A02().A01();
        long A03 = abstractC0782Qt.A02().A03();
        long currentTimeMillis2 = System.currentTimeMillis() + abstractC0782Qt.A02().A04();
        while (true) {
            if (A08[5].length() != 28) {
                break;
            }
            A08[5] = "uw7CndVwumsNWx3tR5uVNB4kWYqq";
            if (i >= A012 || currentTimeMillis2 <= System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.A8x()) {
                    String str = (i + 1) + A07(37, 4, 115) + A012 + A07(56, 9, 70) + abstractC0782Qt.A05();
                }
                currentTimeMillis = System.currentTimeMillis();
                A01 = A01(abstractC0782Qt);
            } catch (C0783Qu e) {
                if (!A0I(e, currentTimeMillis, abstractC0782Qt) || i >= A012 - 1) {
                    InterfaceC0785Qw interfaceC0785Qw = this.A05;
                    if (A08[5].length() != 28) {
                        A08[4] = "RTCgSwX4E1qAS9DeUF79c1CzYGzjCcSq";
                        if (!interfaceC0785Qw.ABK(e)) {
                            A00 = e.A00();
                            InterfaceC03197w interfaceC03197w = this.A00;
                            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                            if (A00 != null || A00.A63() == null) {
                                j = 0;
                            } else {
                                byte[] A63 = A00.A63();
                                String[] strArr = A08;
                                if (strArr[3].length() != strArr[6].length()) {
                                    String[] strArr2 = A08;
                                    strArr2[3] = "kZCGiI5zGihRv0GXktBIsysHbk9bX5";
                                    strArr2[6] = "FynZg164G";
                                    j = A63.length;
                                }
                            }
                            interfaceC03197w.A9X(currentTimeMillis, currentTimeMillis3, j, abstractC0782Qt.A04 == null ? 0L : abstractC0782Qt.A04.length, A00 == null ? 0 : A00.A7v(), e);
                            throw e;
                        }
                        if (i < A012 - 1) {
                            A00 = e.A00();
                            InterfaceC03197w interfaceC03197w2 = this.A00;
                            long currentTimeMillis32 = System.currentTimeMillis() - currentTimeMillis;
                            if (A00 != null) {
                            }
                            j = 0;
                            interfaceC03197w2.A9X(currentTimeMillis, currentTimeMillis32, j, abstractC0782Qt.A04 == null ? 0L : abstractC0782Qt.A04.length, A00 == null ? 0 : A00.A7v(), e);
                            throw e;
                        }
                        if (A03 > 0) {
                            try {
                                Thread.sleep(A03);
                            } catch (InterruptedException e2) {
                                this.A00.A9X(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, 0L, abstractC0782Qt.A04 != null ? abstractC0782Qt.A04.length : 0L, 0, e2);
                                throw e;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        A08[4] = "QCV1DKlppK5B8d9XgS0nl0pavHf";
                        if (!interfaceC0785Qw.ABK(e)) {
                            A00 = e.A00();
                            InterfaceC03197w interfaceC03197w22 = this.A00;
                            long currentTimeMillis322 = System.currentTimeMillis() - currentTimeMillis;
                            if (A00 != null) {
                            }
                            j = 0;
                            interfaceC03197w22.A9X(currentTimeMillis, currentTimeMillis322, j, abstractC0782Qt.A04 == null ? 0L : abstractC0782Qt.A04.length, A00 == null ? 0 : A00.A7v(), e);
                            throw e;
                        }
                        if (i < A012 - 1) {
                        }
                    }
                } else {
                    continue;
                }
            }
            if (A01 != null) {
                this.A00.A9X(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, A01.A63().length, abstractC0782Qt.A04 == null ? 0L : abstractC0782Qt.A04.length, A01.A7v(), null);
                return A01;
            }
            continue;
            i++;
        }
        throw new RuntimeException();
    }

    static {
        A0A();
        A09 = InterfaceC0770Qh.class.getSimpleName();
    }

    public HR(C0775Qm c0775Qm, InterfaceC03197w interfaceC03197w, Executor executor) {
        A0B();
        this.A03 = c0775Qm;
        final HH hh = new HH(c0775Qm.A04());
        this.A06 = hh;
        this.A05 = new AbstractC0546Hm(hh) { // from class: com.facebook.ads.redexgen.X.4U
        };
        this.A01 = executor;
        this.A00 = interfaceC03197w;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.ADg(httpURLConnection);
            if (outputStream != null) {
                this.A05.AGV(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC0769Qg A02(AbstractC0782Qt abstractC0782Qt) {
        if (this.A03.A04()) {
            A0C(abstractC0782Qt);
        }
        InterfaceC0769Qg interfaceC0769Qg = null;
        try {
            interfaceC0769Qg = A01(abstractC0782Qt);
            return interfaceC0769Qg;
        } catch (C0783Qu hre) {
            this.A05.ABK(hre);
            return interfaceC0769Qg;
        } catch (Exception e) {
            this.A05.ABK(new C0783Qu(e, interfaceC0769Qg));
            return interfaceC0769Qg;
        }
    }

    private final InterfaceC0769Qg A03(String str, C0784Qv c0784Qv, C0778Qp c0778Qp) {
        return A02(new C0538He(str, c0784Qv, c0778Qp));
    }

    private final InterfaceC0769Qg A04(String str, String str2, byte[] bArr, C0778Qp c0778Qp) {
        return A02(new HW(str, null, str2, bArr, c0778Qp));
    }

    private final HT A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AEG(inputStream);
            }
            HT ht = new HT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return ht;
        } catch (Throwable th) {
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            A08[4] = "eS";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HT A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.ADf(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AEG(inputStream);
            }
            HT ht = new HT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return ht;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ADe(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(Opcodes.CHECKCAST, 14, 45));
        String proxyAddress = System.getProperty(A07(206, 14, 74));
        int i = -1;
        if (proxyAddress != null) {
            try {
                i = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        if (portStr.charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!isEmpty && i > 0 && i <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (HR.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC0782Qt abstractC0782Qt) {
        StringBuilder sb = new StringBuilder(A07(Opcodes.INVOKEVIRTUAL, 10, 17));
        boolean equals = abstractC0782Qt.A03().equals(EnumC0781Qs.A06);
        String A072 = A07(41, 1, 33);
        if (equals && abstractC0782Qt.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(abstractC0782Qt.A06(), Charset.forName(A07(130, 5, 42))));
            sb.append(A072);
        }
        Map<String, String> A06 = abstractC0782Qt.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 109));
        sb.append(abstractC0782Qt.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(AbstractC0782Qt abstractC0782Qt, InterfaceC0771Qi interfaceC0771Qi) {
        this.A04.A5y(this, interfaceC0771Qi, this.A01).A04(abstractC0782Qt);
        if (this.A03.A04()) {
            A0C(abstractC0782Qt);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 114) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC0771Qi interfaceC0771Qi, C0778Qp c0778Qp) {
        HW req = new HW(str, null, str2, bArr, c0778Qp);
        A0D(req, interfaceC0771Qi);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC0782Qt abstractC0782Qt) {
        Map<String, String> A06 = abstractC0782Qt.A02().A06();
        InterfaceC0768Qf A05 = abstractC0782Qt.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A5k = A05.A5k(this.A03.A03());
            for (String str2 : A5k.keySet()) {
                httpURLConnection.setRequestProperty(str2, A5k.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC0782Qt abstractC0782Qt) throws IOException {
        C0778Qp A02 = abstractC0782Qt.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.ADw(httpURLConnection, abstractC0782Qt.A03(), abstractC0782Qt.A04());
    }

    private final boolean A0I(Throwable th, long j, AbstractC0782Qt abstractC0782Qt) {
        C0778Qp A02 = abstractC0782Qt.A02();
        long elapsedTime = (System.currentTimeMillis() - j) + 10;
        if (this.A06.A8x()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= A00;
    }

    public final C0775Qm A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Qh
    @Deprecated
    public final InterfaceC0769Qg ADo(String str, Map<String, String> parameters) {
        return A03(str, new C0784Qv(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Qh
    @Deprecated
    public final InterfaceC0769Qg ADp(String str, byte[] bArr) {
        return A04(str, A07(Opcodes.I2D, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Qh
    public final void ADq(String str, byte[] bArr, InterfaceC0771Qi interfaceC0771Qi) {
        A0F(str, A07(Opcodes.I2D, 47, 70), bArr, interfaceC0771Qi, this.A03.A00());
    }
}
