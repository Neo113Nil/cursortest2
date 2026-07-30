package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONException;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0678Pe implements InterfaceC1239ee {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ VR A01;
    public final /* synthetic */ VU A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 80, 5, 87, 81, 3, 7, 0, 57, 108, 104, Utf8.REPLACEMENT_BYTE, 104, 57, 59, 44, 53, 41, 40, 35, Ascii.RS, 5, 3, Ascii.SYN, Ascii.DC2, Ascii.SI, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, Base64.padSymbol, 120, 111, 111, 114, 111, Base64.padSymbol, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, Ascii.SI, 93, 74, 95, 67, 70, 74, 75, Ascii.SI, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, Utf8.REPLACEMENT_BYTE, 62, 19, Utf8.REPLACEMENT_BYTE, Base64.padSymbol, 32, 60, 53, 36, 53, 16, 17, 58, Ascii.CR, Ascii.CR, 16, Ascii.CR};
    }

    static {
        A01();
    }

    public C0678Pe(VU vu, VR vr, long j) {
        this.A02 = vu;
        this.A01 = vr;
        this.A00 = j;
    }

    private final void A02(C1251eq c1251eq) {
        C1159dL c1159dL;
        long j;
        C1159dL c1159dL2;
        long j2;
        VV vv;
        C1159dL c1159dL3;
        C1159dL c1159dL4;
        long j3;
        VQ.A06(this.A01);
        try {
            InterfaceC1237ec response = c1251eq.A00();
            if (response != null) {
                String A6v = response.A6v();
                vv = this.A02.A06;
                c1159dL3 = this.A02.A05;
                VX serverResponse = vv.A07(c1159dL3, A6v, this.A00);
                if (serverResponse.A01() == VW.A03) {
                    PV pv = (PV) serverResponse;
                    String A042 = pv.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(pv.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A042 != null) {
                        A6v = A042;
                    }
                    c1159dL4 = this.A02.A05;
                    LH A0F = c1159dL4.A0F();
                    j3 = this.A02.A01;
                    A0F.A3O(XG.A01(j3), adErrorTypeFromCode.getErrorCode(), A6v, adErrorTypeFromCode.isPublicError());
                    this.A02.A0E(V1.A01(adErrorTypeFromCode, A6v));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c1251eq.getMessage();
            c1159dL2 = this.A02.A05;
            LH A0F2 = c1159dL2.A0F();
            j2 = this.A02.A01;
            long A01 = XG.A01(j2);
            int errorCode = adErrorType.getErrorCode();
            boolean isPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            A0F2.A3O(A01, errorCode, message, isPublicError);
            this.A02.A0E(V1.A01(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c1251eq.getMessage();
            c1159dL = this.A02.A05;
            LH A0F3 = c1159dL.A0F();
            j = this.A02.A01;
            A0F3.A3O(XG.A01(j), adErrorType2.getErrorCode(), A00(15, 15, 30) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(V1.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1239ee
    public final void ACo(InterfaceC1237ec interfaceC1237ec) {
        C1159dL c1159dL;
        C1159dL c1159dL2;
        VF.A05(A00(78, 10, 40), A00(51, 27, 87), A00(8, 7, Opcodes.FREM));
        if (interfaceC1237ec != null) {
            String A6v = interfaceC1237ec.A6v();
            c1159dL = this.A02.A05;
            int A02 = U7.A02(c1159dL);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (A02 > 0) {
                c1159dL2 = this.A02.A05;
                W2.A00(c1159dL2).A0C(A6v);
            }
            VQ.A06(this.A01);
            this.A02.A0O(A6v, this.A00, this.A01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1239ee
    public final void ADC(Exception exc) {
        C1159dL c1159dL;
        long j;
        VF.A05(A00(88, 7, 7), A00(30, 21, 101), A00(0, 8, 30));
        if (C1251eq.class.equals(exc.getClass())) {
            A02((C1251eq) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1159dL = this.A02.A05;
        LH A0F = c1159dL.A0F();
        j = this.A02.A01;
        A0F.A3O(XG.A01(j), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(V1.A01(adErrorType, errorMessage));
    }
}
