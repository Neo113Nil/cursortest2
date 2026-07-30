package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0496Ib implements InterfaceC1061bk {
    public static byte[] A01;
    public static String[] A02 = {"6Ak70sx20HAu1BK2okLsJl8UIfFL7Thw", "WSdr2bwsModx8vqlXsCh2pEoV44R6fWS", "6pV", "IuCwGgbRSGcwid05Jmd", "uJw8pmawU", "I8uJtZilJAfxYDsx8vrQS9VBJj4oHqwc", "yyzynLMQXuMe1chn921CH2O0saed", "KEJISc72f74GCBhZaRDCVEoQGHcnATpn"};
    public final /* synthetic */ C5K A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "LF603a9wKS17yr1vDnM";
            strArr2[4] = "LZWmWJ2r4";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Opcodes.LREM);
            i4++;
        }
    }

    public static void A01() {
        byte[] bArr = {92, 64, 77, 85};
        String[] strArr = A02;
        if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[5] = "ka1vQ6UiXKbqG0foqwxWJkzjeHAuiIwi";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C0496Ib(C5K c5k) {
        this.A00 = c5k;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1061bk
    public final void AFh(String str, JSONObject jSONObject) {
        C1070bt c1070bt;
        C1159dL c1159dL;
        C1159dL c1159dL2;
        if (str.equals(A00(0, 4, 93))) {
            this.A00.AJS();
            c1159dL = this.A00.A07;
            if (U7.A1u(c1159dL)) {
                c1159dL2 = this.A00.A07;
                c1159dL2.A0B().ACx();
            }
        }
        c1070bt = this.A00.A0F;
        if (A02[5].charAt(30) != 'w') {
            throw new RuntimeException();
        }
        A02[5] = "i1qJJe2Rv2sTY7cj85c4P5DDFviddUwN";
        c1070bt.A0h(str, jSONObject);
    }
}
