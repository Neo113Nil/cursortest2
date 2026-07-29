package com.aiming.mdt.a;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0024 implements X509TrustManager {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f9 = 0;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f10 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static char[] f11 = {'S', 28193, 56395, 19059, 47146, 9789, 38090, 763, 28895, 57072, 19643, 47808, 10573, 38731, 1398, 29480, 57625, 20250, 48602, 11249, 39413, 1979, 30172, 58286, 21089, 49219, 11891, 39955, 2575, 30756, 59076, 21702, 49813, 12467, 40635, 3437, 31579, 59755, 22293, 50463, 13126, 41409, 4004, 32143, 8291, 20075, 64527, 27137, 38963, 1542, 46287, 8907, 20727, 65175, 27779, 39638, 2382, 46936, 9558, 21299, 49428, 28424, 40423, 3047, 47558, 10169, 21956, 50093, 29264, 57409, 3680, 48145, 10818, 22557, 50865, 29847, 58091, 4349, 48785, 11603, 23422, 51469, 30468, 58661, 4902, 33267, 12261, 23965, 'q', 28287, 56437, 18997, 47144, 9817, 38109, 706, 28867, 56963, 19692, 47801, 10563, 38731, 1345, 29496, 57605, 20249, 48629, 11219, 39368, 1951, 30114, 58255, 21106, 49220, 11785, 39989, 2619, 30778, 59121, 21701, 49807, 12473, 40634, 3450, 31606, 59672, 22320, 50487, 13078, 41460, 4041, 32143, 23077, 13352, 34315, 4197, 57907, 31818, 52925, 22769, 10881, 34024, 5861, 57558, 29550, 52537, 24346, 10607, 47948, 5449, 59311, 29129, 50064, 24032, 12253, 47557, 2098, 39435, 29726, 50810, 20546, 8769, 48314, 3777, 39144, 27381, 50374, 22304, 8509, 'v', 28275, 56414, 18987, 47166, 9735, 38119, 763, 28868, 57007, 19635, 47772, 10546, 49911, 44279, 7903, 34962, 31409, 58496, 22082, 49269, 45637, 7208, 36408, 30802, 60408, 22015, 51143, 45497, 9178, 's', 28261, 56384, 12464, 24192, 60589, 31429, 35010, 5883, 42014, 12810, 16418, 60993, 31818, 35361, 6546, 42910, 13799, 17367, 53756, 32753, 36191, 6968, 43301, 14109, 17763, 54139, 25238, 61606, 7867, 44228, 15103, 18605, 54795, 25648, 62016, 'Q', 44607, 15833, 7076, 1947, 27048, 56197, 19941, 49146, 8646, 37636, 1332, 30466, 55641, 19301, 48460, 11952, 37025, 690, 29920, 59077, 18652, 47648, 11276, 40449, '%', 29300, 58437, 21929, 51096, 10628, 39917, 3560, 32720, 57638, 21266, 50486, ']'};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static long f12 = 4913267443745910294L;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final List<String> f13 = Arrays.asList(m17(0, 44, 0).intern(), m17(8210, 44, 44).intern(), m17(0, 44, 88).intern());

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m17(char c2, int i, int i2) {
        char[] cArr;
        int i3;
        int i4 = f10 + 41;
        f9 = i4 % 128;
        if (!(i4 % 2 != 0)) {
            cArr = new char[i];
            i3 = 0;
        } else {
            cArr = new char[i];
            i3 = 1;
        }
        while (i3 < i) {
            int i5 = f9 + 47;
            f10 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr[i3] = (char) ((f11[i2 - i3] * (i3 / f12)) ^ c2);
                i3 += 82;
            } else {
                cArr[i3] = (char) ((f11[i2 + i3] ^ (i3 * f12)) ^ c2);
                i3++;
            }
        }
        return new String(cArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r8 = r7.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r1 >= r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r3 = new com.aiming.mdt.a.C0158(r7[r1]).toString();
        m17(0, 13, 169).intern();
        com.aiming.mdt.a.C0044.m108();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r6.f13.contains(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r3 == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r7 = com.aiming.mdt.a.C0024.f9 + 95;
        com.aiming.mdt.a.C0024.f10 = r7 % 128;
        r7 = r7 % 2;
        m17(49792, 17, 182).intern();
        com.aiming.mdt.a.C0044.m108();
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r7 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        com.aiming.mdt.a.C0162.m619().m624(m17(0, 3, 199).intern(), (java.lang.Object) 1);
        r8 = new java.lang.StringBuilder();
        r8.append(m17(12531, 36, 202).intern());
        r8.append(r6.f13.toString());
        r8.append(m17(7053, 1, 238).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bd, code lost:
    
        throw new java.security.cert.CertificateException(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001e, code lost:
    
        if (r8 != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r7.length != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d1, code lost:
    
        throw new java.lang.IllegalArgumentException(m17(23115, 37, 132).intern());
     */
    @Override // javax.net.ssl.X509TrustManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        int i = f10 + 53;
        f9 = i % 128;
        if ((i % 2 != 0 ? '&' : '\b') == '&') {
            int length = x509CertificateArr.length;
            Object obj = null;
            super.hashCode();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m17((char) 1995, 33, 239).intern());
        sb.append(this.f13.toString());
        sb.append(m17((char) 0, 1, 272).intern());
        String obj = sb.toString();
        int i = f9 + 87;
        f10 = i % 128;
        if ((i % 2 == 0 ? '$' : 'O') != 'O') {
        }
        return obj;
    }
}
