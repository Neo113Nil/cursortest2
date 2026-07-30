package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class VU {
    public static byte[] A08;
    public static String[] A09 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final XS A0A;
    public static final Executor A0B;
    public static final AtomicReference<VY> A0C;
    public long A00;
    public long A01;
    public VT A02;
    public Map<String, String> A03;
    public final O2 A04;
    public final C1159dL A05;
    public final VV A06;
    public final String A07;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{108, 107, 113, -99, 111, -99, -100, 115, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, 89, -117, -121, 115, 89, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, Ascii.VT, -30, 5, 8, 8, -28, Ascii.VT, Ascii.VT, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0B();
        A0A = new XS();
        A0B = Executors.newCachedThreadPool(A0A);
        A0C = new AtomicReference<>();
    }

    public VU(C1159dL c1159dL) {
        this(c1159dL, O3.A00(c1159dL.A02()));
    }

    public VU(C1159dL c1159dL, O2 o2) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A05 = c1159dL;
        this.A06 = VV.A00();
        this.A07 = VZ.A01(c1159dL);
        this.A04 = o2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0678Pe A03(long j, VR vr) {
        return new C0678Pe(this, vr, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A05 == null || !C1256ev.A0A(this.A05)) {
            return;
        }
        C0773Sw c0773Sw = new C0773Sw(A06(8, 5, 102));
        c0773Sw.A05(1);
        this.A05.A08().AAy(A06(86, 7, 32), AbstractC0772Sv.A1x, c0773Sw);
    }

    private void A0C(int i, String str) {
        String A06 = A06(37, 16, 59);
        String A062 = A06(0, 8, 1);
        String A063 = A06(93, 10, 99);
        VF.A05(A063, A06, A062);
        VF.A04(A063, String.format(Locale.US, A06(53, 26, 82), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(V1 v1) {
        if (this.A02 != null) {
            this.A02.ADB(v1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(V1 v1) {
        XJ.A00(new PX(this, v1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(PW pw) {
        if (this.A02 != null) {
            this.A02.AFO(pw);
        } else {
            if (pw.A00() == null || pw.A00().A06() == null) {
                return;
            }
            W2.A00(this.A05).A0D(pw.A00().A06().toString(), pw.A00().A0B());
        }
    }

    private void A0M(PW pw) {
        SW syncModule;
        XJ.A00(new C0675Pb(this, pw));
        if (U7.A2W(this.A05) && (syncModule = this.A05.A06()) != null) {
            syncModule.A6V();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, VR vr) {
        String clientChallenge;
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            VX A07 = this.A06.A07(this.A05, str, j);
            TE A00 = A07.A00();
            if (A00 != null) {
                U7.A0V(this.A05).A2y(A00.A0A());
                if (U7.A0x(this.A05) && A00.A08() != null) {
                    TO.A04(this.A05.A02(), A00.A08());
                }
                if (U7.A0y(this.A05) && A00.A0D() != null) {
                    TO.A05(this.A05.A02(), A00.A0D());
                }
                this.A05.A08().ABq();
                this.A04.A0N(A00.A07());
                VQ.A05(A00.A05().A0B(), vr);
                C0880Xd.A01(this.A05, A0B, A00);
                C0773Sw c0773Sw = new C0773Sw(A06(30, 7, 0) + C0863Wm.A02());
                c0773Sw.A06(1);
                c0773Sw.A0A(false);
                this.A05.A08().ABZ(A06(79, 7, 63), AbstractC0772Sv.A1W, c0773Sw);
            }
            switch (A07.A01()) {
                case A02:
                    PW pw = (PW) A07;
                    if (A00 != null) {
                        if (A00.A05().A0E()) {
                            VQ.A07(str, vr);
                        }
                        if (this.A03 != null) {
                            clientChallenge = this.A03.get(A06(13, 17, 107));
                        } else {
                            clientChallenge = null;
                        }
                        if (!TextUtils.isEmpty(A07.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                            this.A05.A03().AHy(this.A05, clientChallenge, A07.A02());
                        }
                    }
                    this.A05.A0F().A3P(XG.A01(this.A01), XG.A02(this.A01, this.A00));
                    A0M(pw);
                    return;
                case A03:
                    PV pv = (PV) A07;
                    String A04 = pv.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(pv.A03(), AdErrorType.ERROR_MESSAGE);
                    A0C(pv.A03(), A04);
                    if (A04 == null) {
                        A04 = str;
                    }
                    this.A05.A0F().A3O(XG.A01(this.A01), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                    A0E(V1.A01(adErrorTypeFromCode, A04));
                    return;
                default:
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A05.A0F().A3O(XG.A01(this.A01), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0E(V1.A01(adErrorType, str));
                    return;
            }
        } catch (Exception e2) {
            e = e2;
            String message = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            C1159dL c1159dL = this.A05;
            if (A09[0].length() == 29) {
                throw new RuntimeException();
            }
            A09[0] = "STn1t4NLUPoQ";
            c1159dL.A0F().A3O(XG.A01(this.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0E(V1.A01(adErrorType2, message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j, VR vr) {
        A0B.execute(new C0679Pf(this, str, j, vr));
    }

    private boolean A0P(VR vr) {
        String adPlacementType = vr.A06().toString();
        if (W2.A00(this.A05).A0F(adPlacementType)) {
            return false;
        }
        int A0A2 = W2.A00(this.A05).A0A(adPlacementType);
        int storedAdsCount = U7.A0J(this.A05);
        int A092 = W2.A00(this.A05).A09(adPlacementType);
        if (A0A2 >= storedAdsCount || A0A2 > A092) {
            W2 A00 = W2.A00(this.A05);
            String type = vr.A06().toString();
            Pair<String, String> A0B2 = A00.A0B(type);
            if (A0B2 != null) {
                Object obj = A0B2.second;
                String[] strArr = A09;
                String str = strArr[1];
                String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && A0B2.first != null) {
                    A0O(A0B2.second.toString(), 0L, vr);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0Q(VR vr) {
        this.A01 = System.currentTimeMillis();
        T5.A0B(this.A05);
        A0C.get();
        if (0 != 0) {
            throw new NullPointerException(A06(103, 7, 52));
        }
        if (U7.A02(this.A05) > 0 && A0P(vr)) {
            return;
        }
        if (VQ.A08(vr)) {
            XU.A06.execute(new C0681Ph(this));
            String A02 = VQ.A02(vr);
            if (A02 != null) {
                this.A05.A0F().AJv();
                A0O(A02, 0L, vr);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A05.A0F().A3O(XG.A01(this.A01), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0E(V1.A01(error, null));
                return;
            }
        }
        A0B.execute(new C0680Pg(this, vr));
    }

    public final void A0R(VT vt) {
        this.A02 = vt;
    }
}
