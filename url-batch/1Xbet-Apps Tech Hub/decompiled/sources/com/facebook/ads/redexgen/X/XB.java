package com.facebook.ads.redexgen.X;

import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.redexgen.X.BL;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class XB<T extends BL> implements BJ<T> {
    public static byte[] A0K;
    public static String[] A0L = {"uQUfDqzhtv2TEfF5ErUwTUru4TZb3y9r", "Tl0hhVUFPPlUVXrrXAgT1phq5Y1870jG", "HsvEKssxmSZ10qjOSm6w6MmWGLuRxxq7", "RRlXFcbfMO2PvOuBXchDACh7boJ4mCH9", "7xiHj3yO3zbCG5YWXi9fkMnCOt343i", "LdJPi6TRHARXjQG7Ef48CiURnDQxO4BC", "abcggVaWrh85SzZKtbF9Hz68lxkZOGh", "I6iBxKBCu2jt9neSbJF"};
    public int A00;
    public int A01;
    public HandlerThread A02;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/XB<TT;>.PostRequestHandler; */
    public HandlerC0398Az A03;
    public BH A04;
    public T A05;
    public Object A06;
    public Object A07;
    public byte[] A08;
    public byte[] A09;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/XB<TT;>.PostResponseHandler; */
    public final B0 A0A;
    public final BV A0B;
    public final UUID A0C;
    public final int A0D;
    public final int A0E;
    public final B1<T> A0F;
    public final B7 A0G;
    public final DrmInitData.SchemeData A0H;
    public final BR<T> A0I;
    public final HashMap<String, String> A0J;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{41, 8, Ascii.VT, Ascii.FF, Ascii.CAN, 1, Ascii.EM, 41, Ascii.US, 0, 62, 8, Ascii.RS, Ascii.RS, 4, 2, 3, 112, 70, 89, 102, 81, 69, 65, 81, 71, 64, 124, 85, 90, 80, 88, 81, 70, 44, Ascii.ESC, Ascii.ESC, 6, Ascii.ESC, 73, Ascii.GS, Ascii.ESC, 16, 0, 7, Ascii.SO, 73, Ascii.GS, 6, 73, Ascii.ESC, Ascii.FF, Ascii.SUB, Ascii.GS, 6, Ascii.ESC, Ascii.FF, 73, 62, 0, Ascii.CR, Ascii.FF, Ascii.US, 0, 7, Ascii.FF, 73, 2, Ascii.FF, 16, Ascii.SUB, 71, 75, 98, 98, 104, 109, 106, 97, 36, 104, 109, 103, 97, 106, 119, 97, 36, 108, 101, 119, 36, 97, 124, 116, 109, 118, 97, 96, 36, 107, 118, 36, 115, 109, 104, 104, 36, 97, 124, 116, 109, 118, 97, 36, 119, 107, 107, 106, 42, 36, 86, 97, 105, 101, 109, 106, 109, 106, 99, 36, 119, 97, 103, 107, 106, 96, 119, 62, 36};
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B1 != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession$ProvisioningManager<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.facebook.ads.internal.exoplayer2.thirdparty.drm.ExoMediaDrm<T extends com.facebook.ads.redexgen.X.BL> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public XB(UUID uuid, BR<T> br, B1<T> b1, DrmInitData.SchemeData schemeData, int i, byte[] bArr, HashMap<String, String> hashMap, BV bv, Looper looper, B7 b7, int i2) {
        this.A0C = uuid;
        this.A0F = b1;
        this.A0I = br;
        this.A0E = i;
        this.A08 = bArr;
        this.A0H = bArr != null ? null : schemeData;
        this.A0J = hashMap;
        this.A0B = bv;
        this.A0D = i2;
        this.A0G = b7;
        this.A01 = 2;
        this.A0A = new B0(this, looper);
        HandlerThread handlerThread = new HandlerThread(A02(17, 17, 50));
        this.A02 = handlerThread;
        handlerThread.start();
        this.A03 = new HandlerC0398Az(this, this.A02.getLooper());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private long A01() {
        if (!C9E.A05.equals(this.A0C)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> A01 = BZ.A01(this);
        long longValue = ((Long) A01.first).longValue();
        Long l = (Long) A01.second;
        String[] strArr = A0L;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[6] = "kwmCjQVSEE2MSEtk5P0J6XyfUzOepuN";
        strArr2[5] = "iy4DUBbCBKkWs1QdyI1n8wUj9ER6POyN";
        return Math.min(longValue, l.longValue());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private void A03() {
        if (this.A01 == 4) {
            this.A01 = 3;
            A08(new BU());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private void A05(int i, boolean z) {
        byte[] bArr = i == 3 ? this.A08 : this.A09;
        byte[] bArr2 = null;
        String mimeType = null;
        String licenseServerUrl = null;
        DrmInitData.SchemeData schemeData = this.A0H;
        if (schemeData != null) {
            bArr2 = schemeData.A04;
            mimeType = this.A0H.A02;
            licenseServerUrl = this.A0H.A01;
        } else {
            String[] strArr = A0L;
            String mimeType2 = strArr[6];
            if (mimeType2.length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[4] = "HiRVbgHs01WUsvKQWWbzdKShVEXCb4";
            strArr2[7] = "rsxdpsdulfr8NHFIQbC";
        }
        try {
            Pair create = Pair.create(this.A0I.getKeyRequest(bArr, bArr2, mimeType, i, this.A0J), licenseServerUrl);
            this.A06 = create;
            this.A03.A02(1, create, z);
        } catch (Exception e) {
            if (A0L[3].charAt(29) != 'C') {
                A09(e);
                return;
            }
            String[] strArr3 = A0L;
            strArr3[0] = "yinyKCIX8OHy4tbAh09wDu9TYn4QapKY";
            strArr3[2] = "YH01MZvN3itOxbtS4y7wvPRo5LdL3aoc";
            A09(e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private void A08(Exception exc) {
        this.A04 = new BH(exc);
        this.A0G.A04(exc);
        if (this.A01 != 4) {
            this.A01 = 1;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private void A09(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.A0F.AE4(this);
        } else {
            A08(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r4 == 3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        r1 = r5.A0I;
        r0 = r5.A09;
        r2 = r1.provideKeyResponse(r0, r7);
        r1 = r5.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r1 == 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r0 = r5.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        r5.A01 = 4;
        r5.A0G.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r2.length == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r5.A08 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r1 = r5.A0I;
        r0 = r5.A08;
        r1.provideKeyResponse(r0, r7);
        r5.A0G.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r4 == 3) goto L21;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A0A(Object obj, Object obj2) {
        if (obj != this.A06 || !A0D()) {
            return;
        }
        this.A06 = null;
        boolean z = obj2 instanceof Exception;
        String[] strArr = A0L;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[0] = "9JnvKkphvxmLuhmX98tw0qe05owUNTRp";
        strArr2[2] = "ft4SvIUq5otQylphxMLwb1JjgU4mSaGo";
        if (z) {
            A09((Exception) obj2);
            return;
        }
        try {
            byte[] bArr = (byte[]) obj2;
            int i = this.A0E;
            if (A0L[3].charAt(29) != 'C') {
                String[] strArr3 = A0L;
                strArr3[0] = "bP0m20ptfIMRFe5YkcUw3xf0jvGpYKsJ";
                strArr3[2] = "kVN8Is4OR8esdUtwldSwhPSVBOCGQMXU";
            } else {
                A0L[3] = "aqi8N0zhP27f6NVz8lVl4dA11qd5ZCKR";
            }
        } catch (Exception e) {
            A09(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public void A0B(Object obj, Object obj2) {
        if (obj != this.A07) {
            return;
        }
        if (this.A01 != 2) {
            boolean A0D = A0D();
            String[] strArr = A0L;
            if (strArr[6].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0L[1] = "7g5olCk59crpyXcTpohub2paBJQfOBC8";
            if (!A0D) {
                return;
            }
        }
        this.A07 = null;
        if (obj2 instanceof Exception) {
            B1<T> b1 = this.A0F;
            String[] strArr2 = A0L;
            if (strArr2[0].charAt(19) == strArr2[2].charAt(19)) {
                A0L[1] = "QkoncgzFytlqAAhEJ0Qlx7x4X03bYeDS";
                b1.ACc((Exception) obj2);
                return;
            } else {
                String[] strArr3 = A0L;
                strArr3[6] = "avEJwbhwMRn38jmRQBD1FC49w8wW0nz";
                strArr3[5] = "XMN7l9eNtKuFM3Fev0Kexs32ktc0Cq6l";
                b1.ACc((Exception) obj2);
                return;
            }
        }
        try {
            this.A0I.provideProvisionResponse((byte[]) obj2);
            this.A0F.ACb();
        } catch (Exception e) {
            this.A0F.ACc(e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private void A0C(boolean z) {
        switch (this.A0E) {
            case 0:
            case 1:
                if (this.A08 == null) {
                    A05(1, z);
                    return;
                }
                if (this.A01 != 4 && !A0E()) {
                    return;
                }
                long licenseDurationRemainingSec = A01();
                if (this.A0E == 0 && licenseDurationRemainingSec <= 60) {
                    String str = A02(72, 68, 2) + licenseDurationRemainingSec;
                    A05(2, z);
                    return;
                } else if (licenseDurationRemainingSec <= 0) {
                    A08(new BU());
                    return;
                } else {
                    this.A01 = 4;
                    this.A0G.A02();
                    return;
                }
            case 2:
                if (this.A08 == null) {
                    A05(2, z);
                    return;
                } else {
                    if (!A0E()) {
                        return;
                    }
                    A05(2, z);
                    return;
                }
            case 3:
                if (A0E()) {
                    String[] strArr = A0L;
                    if (strArr[0].charAt(19) != strArr[2].charAt(19)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0L;
                    strArr2[0] = "tKB853gw0QxIoSbJdPpwjheJWY3E7MZE";
                    strArr2[2] = "oZWJSNTcJkrmOm7J4lVwlLSneItLKulz";
                    A05(3, z);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private boolean A0D() {
        int i = this.A01;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    private boolean A0E() {
        try {
            this.A0I.restoreKeys(this.A09, this.A08);
            return true;
        } catch (Exception e) {
            Log.e(A02(0, 17, 107), A02(34, 38, 111), e);
            A08(e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r4.A0F.AE4(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        A08(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r5 != false) goto L12;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0F(boolean z) {
        if (A0D()) {
            return true;
        }
        try {
            byte[] openSession = this.A0I.openSession();
            this.A09 = openSession;
            this.A05 = this.A0I.createMediaCrypto(openSession);
            this.A01 = 3;
            return true;
        } catch (NotProvisionedException e) {
            String[] strArr = A0L;
            if (strArr[4].length() != strArr[7].length()) {
                String[] strArr2 = A0L;
                strArr2[4] = "hcP5iGmUCTCBubOCm4y34akhSFLITz";
                strArr2[7] = "kkACDG4miePlwwqXadR";
            }
        } catch (Exception e2) {
            if (A0L[1].charAt(26) == 'I') {
                Exception e3 = new RuntimeException();
                throw e3;
            }
            String[] strArr3 = A0L;
            strArr3[6] = "3MIbmxUKwpHsMOPA0O36aL8zgPm2spB";
            strArr3[5] = "QZdNO4E2RTzuGVfMqJkx34O55UWQfpPY";
            A08(e2);
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final void A0G() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 1 && this.A01 != 1 && A0F(true)) {
            A0C(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final void A0H() {
        if (A0F(false)) {
            A0C(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final void A0I() {
        X7 provisionRequest = this.A0I.getProvisionRequest();
        this.A07 = provisionRequest;
        this.A03.A02(0, provisionRequest, true);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final void A0J(int i) {
        if (!A0D()) {
        }
        switch (i) {
            case 1:
                this.A01 = 3;
                this.A0F.AE4(this);
                break;
            case 2:
                A0C(false);
                break;
            case 3:
                A03();
                break;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final void A0K(Exception exc) {
        A08(exc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final boolean A0L() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i != 0) {
            return false;
        }
        this.A01 = 0;
        this.A0A.removeCallbacksAndMessages(null);
        this.A03.removeCallbacksAndMessages(null);
        this.A03 = null;
        this.A02.quit();
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A07 = null;
        byte[] bArr = this.A09;
        if (bArr != null) {
            BR<T> br = this.A0I;
            String[] strArr = A0L;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[6] = "deu86LfLTKjM93IlTO01zYKbww8cuOj";
            strArr2[5] = "ojEkjq8yeaej09Uo0dOQA5yJgKQBg80C";
            br.closeSession(bArr);
            this.A09 = null;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final boolean A0M(byte[] bArr) {
        DrmInitData.SchemeData schemeData = this.A0H;
        return Arrays.equals(schemeData != null ? schemeData.A04 : null, bArr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    public final boolean A0N(byte[] bArr) {
        return Arrays.equals(this.A09, bArr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.BJ
    public final BH A6q() {
        if (this.A01 == 1) {
            return this.A04;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.BJ
    public final T A7G() {
        return this.A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.BJ
    public final int A7t() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BL> */
    @Override // com.facebook.ads.redexgen.X.BJ
    public final Map<String, String> AE5() {
        byte[] bArr = this.A09;
        if (bArr == null) {
            return null;
        }
        return this.A0I.queryKeyStatus(bArr);
    }
}
