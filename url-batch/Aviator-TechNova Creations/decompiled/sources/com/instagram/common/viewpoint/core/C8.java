package com.instagram.common.viewpoint.core;

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
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class C8 implements InterfaceC1238ed {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public InterfaceC0771Su A00;
    public Executor A01;
    public boolean A02;
    public C1243ei A03;
    public final InterfaceC1248en A04 = new CH();
    public final InterfaceC1253es A05;
    public final InterfaceC1254et A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final InterfaceC1237ec A01(AbstractC1250ep abstractC1250ep) throws C1251eq {
        C1251eq c1251eq;
        String A072 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        C9 c9 = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC1250ep.A05(), WS.A04() ? A09() : null);
                A0H(A082, abstractC1250ep);
                A0G(A082, abstractC1250ep);
                if (this.A06.AAQ()) {
                    this.A06.ABN(A082, abstractC1250ep.A06());
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
                        AbstractC1255eu.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.ABR(A072, AbstractC0772Sv.A1z, new C0773Sw(e));
                    } catch (Exception e2) {
                        this.A00.ABR(A072, AbstractC0772Sv.A1y, new C0773Sw(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC1250ep.A06() != null) {
                    A00(A082, abstractC1250ep.A06());
                }
                C9 A06 = A082.getDoInput() ? A06(A082) : new C9(A082, null);
                if (this.A06.AAQ()) {
                    this.A06.ABO(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Throwable th) {
                if (this.A06.AAQ()) {
                    this.A06.ABO(c9);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            try {
                try {
                    c9 = A05(null);
                } catch (Throwable unused) {
                    if (c9 == null || c9.A94() <= 0) {
                        throw new C1251eq(e3, c9);
                    }
                    if (this.A06.AAQ()) {
                        this.A06.ABO(c9);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c9;
                }
            } catch (Exception unused2) {
                Log.e(getClass().getSimpleName(), A07(Opcodes.LNEG, 13, 98), e3);
                if (0 != 0 && c9.A94() > 0) {
                    if (this.A06.AAQ()) {
                        this.A06.ABO(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                c1251eq = new C1251eq(e3, null);
            }
            if (A08[7].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
            if (c9 == null || c9.A94() <= 0) {
                c1251eq = new C1251eq(e3, c9);
                throw c1251eq;
            }
            if (this.A06.AAQ()) {
                this.A06.ABO(c9);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            return c9;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, Ascii.SO, 102, 100, 77, 64, 9, 77, 79, Ascii.RS, 93, 75, 76, 82, Ascii.RS, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, Ascii.US, Ascii.SYN, 80, 75, 120, 116, Ascii.ETB, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, Base64.padSymbol, Ascii.SYN, 7, 4, Ascii.FS, 1, Ascii.CAN, 83, Ascii.SYN, 1, 1, Ascii.FS, 1, Ascii.ETB, Ascii.SYN, 4, 111, 122, Ascii.SYN, 7, 7, Ascii.ESC, Ascii.RS, Ascii.DC4, Ascii.SYN, 3, Ascii.RS, Ascii.CAN, Ascii.EM, 88, Ascii.SI, 90, 0, 0, 0, 90, 17, Ascii.CAN, 5, Ascii.SUB, 90, 2, 5, Ascii.ESC, Ascii.DC2, Ascii.EM, Ascii.DC4, Ascii.CAN, 19, Ascii.DC2, 19, 76, Ascii.DC4, Ascii.US, Ascii.SYN, 5, 4, Ascii.DC2, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, Ascii.SUB, Ascii.ETB, 81, Ascii.SUB, Ascii.ETB, 83, 120, 100, 100, 96, 62, 96, 98, Byte.MAX_VALUE, 104, 105, 88, Byte.MAX_VALUE, 99, 100, Ascii.ESC, 7, 7, 3, 93, 3, 1, Ascii.FS, Ascii.VT, 10, 35, Ascii.FS, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r9.A6u() != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r3 = r9.A6u().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        if (r30.A04 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
    
        r7.ABI(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1237ec A0J(AbstractC1250ep abstractC1250ep) throws C1251eq {
        long j;
        InterfaceC1237ec A01;
        int i = 0;
        long currentTimeMillis = System.currentTimeMillis();
        int A012 = abstractC1250ep.A02().A01();
        long A03 = abstractC1250ep.A02().A03();
        long currentTimeMillis2 = System.currentTimeMillis() + abstractC1250ep.A02().A04();
        while (true) {
            if (i >= A012 || currentTimeMillis2 <= System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.AAQ()) {
                    String str = (i + 1) + A07(37, 4, 97) + A012 + A07(56, 9, 27) + abstractC1250ep.A05();
                }
                currentTimeMillis = System.currentTimeMillis();
                A01 = A01(abstractC1250ep);
            } catch (C1251eq e) {
                if (A0I(e, currentTimeMillis, abstractC1250ep)) {
                    int i2 = A012 - 1;
                    if (A08[1].charAt(0) == 'l') {
                        throw new RuntimeException();
                    }
                    A08[1] = "iDEOxz3pTPjJqVLmMx3mPs9K2XOoyKBI";
                    if (i < i2) {
                        continue;
                    }
                }
                if (!this.A05.ADE(e) || i >= A012 - 1) {
                    InterfaceC1237ec A00 = e.A00();
                    InterfaceC0771Su interfaceC0771Su = this.A00;
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    if (A08[1].charAt(0) != 'l') {
                        A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                    } else {
                        A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                    }
                    interfaceC0771Su.ABI(currentTimeMillis, currentTimeMillis3, j, abstractC1250ep.A04 == null ? 0L : abstractC1250ep.A04.length, A00 == null ? 0 : A00.A94(), e);
                    throw e;
                }
                if (A03 > 0) {
                    try {
                        Thread.sleep(A03);
                    } catch (InterruptedException e2) {
                        this.A00.ABI(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, 0L, abstractC1250ep.A04 != null ? abstractC1250ep.A04.length : 0L, 0, e2);
                        throw e;
                    }
                } else {
                    continue;
                }
            }
            if (A01 != null) {
                this.A00.ABI(currentTimeMillis, System.currentTimeMillis() - currentTimeMillis, A01.A6u().length, abstractC1250ep.A04 == null ? 0L : abstractC1250ep.A04.length, A01.A94(), null);
                return A01;
            }
            continue;
            i++;
        }
    }

    static {
        A0A();
        A09 = InterfaceC1238ed.class.getSimpleName();
    }

    public C8(C1243ei c1243ei, InterfaceC0771Su interfaceC0771Su, Executor executor) {
        A0B();
        this.A03 = c1243ei;
        this.A06 = new C7(c1243ei.A04());
        final InterfaceC1254et interfaceC1254et = this.A06;
        this.A05 = new CF(interfaceC1254et) { // from class: com.facebook.ads.redexgen.X.21
        };
        this.A01 = executor;
        this.A00 = interfaceC0771Su;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AG3(httpURLConnection);
            if (outputStream != null) {
                this.A05.AKN(outputStream, bArr);
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

    private final InterfaceC1237ec A02(AbstractC1250ep abstractC1250ep) {
        if (this.A03.A04()) {
            A0C(abstractC1250ep);
        }
        InterfaceC1237ec interfaceC1237ec = null;
        try {
            interfaceC1237ec = A01(abstractC1250ep);
            return interfaceC1237ec;
        } catch (C1251eq hre) {
            this.A05.ADE(hre);
            return interfaceC1237ec;
        } catch (Exception e) {
            this.A05.ADE(new C1251eq(e, interfaceC1237ec));
            return interfaceC1237ec;
        }
    }

    private final InterfaceC1237ec A03(String str, C1252er c1252er, C1246el c1246el) {
        return A02(new CB(str, c1252er, c1246el));
    }

    private final InterfaceC1237ec A04(String str, String str2, byte[] bArr, C1246el c1246el) {
        return A02(new CA(str, null, str2, bArr, c1246el));
    }

    private final C9 A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AGj(inputStream);
            }
            C9 c9 = new C9(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c9;
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

    private final C9 A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AG2(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AGj(inputStream);
            }
            C9 c9 = new C9(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c9;
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
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
            return this.A05.AG1(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(Opcodes.CHECKCAST, 14, 1));
        String proxyAddress = System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (C8.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC1250ep abstractC1250ep) {
        StringBuilder sb = new StringBuilder(A07(Opcodes.INVOKEVIRTUAL, 10, 43));
        boolean equals = abstractC1250ep.A03().equals(EnumC1249eo.A06);
        String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = abstractC1250ep.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new String(abstractC1250ep.A06(), Charset.forName(A07(130, 5, 83))));
                sb.append(A072);
            }
        }
        for (Map.Entry<String, String> entry : abstractC1250ep.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 10));
        sb.append(abstractC1250ep.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(AbstractC1250ep abstractC1250ep, InterfaceC1239ee interfaceC1239ee) {
        this.A04.A6q(this, interfaceC1239ee, this.A01).A04(abstractC1250ep);
        if (this.A03.A04()) {
            A0C(abstractC1250ep);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 47) + i + A07(65, 1, 96) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC1239ee interfaceC1239ee, C1246el c1246el) {
        CA req = new CA(str, null, str2, bArr, c1246el);
        A0D(req, interfaceC1239ee);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC1250ep abstractC1250ep) {
        Map<String, String> A06 = abstractC1250ep.A02().A06();
        InterfaceC1236eb A05 = abstractC1250ep.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A6Y = A05.A6Y(this.A03.A03());
            for (String str2 : A6Y.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6Y.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC1250ep abstractC1250ep) throws IOException {
        C1246el A02 = abstractC1250ep.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AGM(httpURLConnection, abstractC1250ep.A03(), abstractC1250ep.A04());
    }

    private final boolean A0I(Throwable th, long j, AbstractC1250ep abstractC1250ep) {
        C1246el A02 = abstractC1250ep.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.A06.AAQ()) {
            String str = A07(67, 15, Opcodes.FNEG) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            long A022 = A02.A02();
            if (A08[4].charAt(1) == 'Y') {
                throw new RuntimeException();
            }
            A08[7] = "tgQXMymp9cIZW";
            return currentTimeMillis >= A022;
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final C1243ei A0K() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238ed
    @Deprecated
    public final InterfaceC1237ec AGC(String str, Map<String, String> parameters) {
        return A03(str, new C1252er(parameters), this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238ed
    @Deprecated
    public final InterfaceC1237ec AGD(String str, byte[] bArr) {
        return A04(str, A07(Opcodes.I2D, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238ed
    public final void AGE(String str, byte[] bArr, InterfaceC1239ee interfaceC1239ee) {
        A0F(str, A07(Opcodes.I2D, 47, 102), bArr, interfaceC1239ee, this.A03.A00());
    }
}
