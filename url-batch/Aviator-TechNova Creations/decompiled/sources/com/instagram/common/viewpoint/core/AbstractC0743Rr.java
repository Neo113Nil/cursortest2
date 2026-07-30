package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0743Rr {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<C0741Rp> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
            i4++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, Ascii.ESC, Ascii.SYN, 17, 33, 40, Ascii.ETB, 36, 36, Ascii.ESC, Ascii.SYN, Ascii.ETB, 17, Ascii.SI, Ascii.CAN, Ascii.SI, Ascii.FS, 19, Ascii.CR, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static C0741Rp A00() {
        C0741Rp advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return C0741Rp.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0741Rp A01(SQ sq, C0741Rp c0741Rp) {
        if (c0741Rp != null) {
            try {
            } catch (Throwable t) {
                sq.A08().AAy(A04(12, 7, 84), AbstractC0772Sv.A1Q, new C0773Sw(t));
            }
        }
        return AbstractC0748Rx.A00(sq);
        return c0741Rp;
    }

    public static C0741Rp A02(SQ sq, C0741Rp c0741Rp, C0742Rq c0742Rq) {
        C0744Rs c0744Rs = null;
        try {
            if (U6.A06(sq) && (c0741Rp == null || TextUtils.isEmpty(c0741Rp.A03()))) {
                c0744Rs = AbstractC0745Rt.A00(sq.getContentResolver());
            }
        } catch (Throwable th) {
            sq.A08().AAy(A04(12, 7, 84), AbstractC0772Sv.A1S, new C0773Sw(th));
        }
        if (c0744Rs != null && c0744Rs.A01 != null) {
            A03.set(c0744Rs.A01);
            c0742Rq.A05(c0744Rs.A01);
        }
        if (c0741Rp == null && c0744Rs != null && !TextUtils.isEmpty(c0744Rs.A00)) {
            return new C0741Rp(c0744Rs.A00, c0744Rs.A02, EnumC0740Ro.A04);
        }
        return c0741Rp;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(C0742Rq c0742Rq) {
        A02.set(c0742Rq.A02());
        A03.set(c0742Rq.A03());
    }

    public static void A07(SQ sq) {
        long j;
        C0741Rp advertisingIdInfo;
        try {
            C0742Rq c0742Rq = new C0742Rq(sq);
            A06(c0742Rq);
            if (A08()) {
                return;
            }
            C0741Rp advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j = advertisingIdInfo2.A01();
            } else {
                j = -1;
            }
            if (j > 0 && System.currentTimeMillis() - j < U6.A00(sq)) {
                return;
            }
            if (U6.A07(sq)) {
                advertisingIdInfo = A01(sq, A02(sq, null, c0742Rq));
            } else {
                advertisingIdInfo = A02(sq, A01(sq, null), c0742Rq);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c0742Rq.A04(advertisingIdInfo);
            }
        } catch (Throwable t) {
            sq.A08().AAy(A04(12, 7, 84), AbstractC0772Sv.A1R, new C0773Sw(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = WS.A04();
        if (updated) {
            String A04 = A04(0, 12, 92);
            boolean updated2 = WS.A05(A04);
            if (updated2) {
                A03.set(WS.A01(A04));
                z = true;
            }
        }
        boolean A042 = WS.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!A042) {
            return z;
        }
        String A043 = A04(19, 13, 108);
        boolean updated3 = WS.A05(A043);
        if (updated3) {
            String A012 = WS.A01(A043);
            AtomicReference<C0741Rp> atomicReference = A02;
            if (A012 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    A012 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    A012 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new C0741Rp(A012, false, EnumC0740Ro.A03));
            return true;
        }
        return z;
    }
}
