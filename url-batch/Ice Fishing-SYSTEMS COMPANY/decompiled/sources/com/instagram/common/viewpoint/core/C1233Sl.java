package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1233Sl implements InterfaceC1791fw {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ WA A01;
    public final /* synthetic */ WD A02;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 81, 3, 85, 87, 7, 80, 3, 60, 111, 51, c.f16476c, 51, c.f16476c, 107, 60, 44, 53, 41, 40, 35, 30, 5, 3, 22, 18, 15, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, 61, 120, 111, 111, 114, 111, 61, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, 15, 93, 74, 95, 67, 70, 74, 75, 15, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, c.f16476c, 62, 19, c.f16476c, 61, 32, 60, 53, 36, 53, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C1233Sl(WD wd, WA wa, long j9) {
        this.A02 = wd;
        this.A01 = wa;
        this.A00 = j9;
    }

    private final void A02(C1803g8 c1803g8) {
        C1839gi c1839gi;
        long j9;
        C1839gi c1839gi2;
        long j10;
        WE we;
        C1839gi c1839gi3;
        C1839gi c1839gi4;
        long j11;
        W9.A06(this.A01);
        try {
            InterfaceC1789fu response = c1803g8.A00();
            if (response != null) {
                String A73 = response.A73();
                we = this.A02.A06;
                c1839gi3 = this.A02.A05;
                WG serverResponse = we.A07(c1839gi3, A73, this.A00);
                if (serverResponse.A01() == WF.A03) {
                    R4 r42 = (R4) serverResponse;
                    String A042 = r42.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(r42.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A73 = A042;
                    }
                    c1839gi4 = this.A02.A05;
                    InterfaceC1065Lt A0F = c1839gi4.A0F();
                    j11 = this.A02.A01;
                    A0F.A3W(Y1.A01(j11), adErrorTypeFromCode.getErrorCode(), A73, adErrorTypeFromCode.isPublicError());
                    this.A02.A0E(C1311Vm.A01(adErrorTypeFromCode, A73));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c1803g8.getMessage();
            c1839gi2 = this.A02.A05;
            InterfaceC1065Lt A0F2 = c1839gi2.A0F();
            j10 = this.A02.A01;
            long A01 = Y1.A01(j10);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0F2.A3W(A01, errorCode, message, isPublicError);
            this.A02.A0E(C1311Vm.A01(adErrorType, message));
        } catch (JSONException e6) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c1803g8.getMessage();
            c1839gi = this.A02.A05;
            InterfaceC1065Lt A0F3 = c1839gi.A0F();
            j9 = this.A02.A01;
            A0F3.A3W(Y1.A01(j9), adErrorType2.getErrorCode(), A00(16, 15, 30) + e6.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(C1311Vm.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1791fw
    public final void ADR(InterfaceC1789fu interfaceC1789fu) {
        C1839gi c1839gi;
        C1839gi c1839gi2;
        AbstractC1322Vy.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, 114));
        if (interfaceC1789fu != null) {
            String A73 = interfaceC1789fu.A73();
            c1839gi = this.A02.A05;
            int A02 = C1289Up.A02(c1839gi);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1839gi2 = this.A02.A05;
                C1335Wl.A00(c1839gi2).A0C(A73);
            }
            W9.A06(this.A01);
            this.A02.A0O(A73, this.A00, this.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1791fw
    public final void ADq(Exception exc) {
        C1839gi c1839gi;
        long j9;
        AbstractC1322Vy.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (C1803g8.class.equals(exc.getClass())) {
            A02((C1803g8) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1839gi = this.A02.A05;
        InterfaceC1065Lt A0F = c1839gi.A0F();
        j9 = this.A02.A01;
        A0F.A3W(Y1.A01(j9), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(C1311Vm.A01(adErrorType, errorMessage));
    }
}
