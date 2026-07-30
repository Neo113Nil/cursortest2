package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC1688eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A01();
    }

    public NP(NO no) {
        this.A00 = no;
    }

    public /* synthetic */ NP(NO no, OV ov) {
        this(no);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AEA() {
        boolean z8;
        AbstractC2004jd abstractC2004jd;
        InterfaceC1380Yh interfaceC1380Yh;
        ZU zu;
        VA va;
        AbstractC2004jd abstractC2004jd2;
        C1690eI c1690eI;
        C1690eI c1690eI2;
        C1839gi c1839gi;
        ZU zu2;
        AbstractC2004jd abstractC2004jd3;
        AbstractC2004jd abstractC2004jd4;
        C1839gi c1839gi2;
        AbstractC2004jd abstractC2004jd5;
        AbstractC2004jd abstractC2004jd6;
        C1839gi c1839gi3;
        C1111No c1111No;
        C1839gi c1839gi4;
        C1839gi c1839gi5;
        z8 = this.A00.A0f;
        if (!z8) {
            abstractC2004jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC2004jd.A2E())) {
                va = this.A00.A0S;
                abstractC2004jd2 = this.A00.A0O;
                String A2E = abstractC2004jd2.A2E();
                C1496b9 c1496b9 = new C1496b9();
                c1690eI = this.A00.A0B;
                C1496b9 A03 = c1496b9.A03(c1690eI.getViewabilityChecker());
                c1690eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c1690eI2.getTouchDataRecorder()).A05());
                c1839gi = this.A00.A0R;
                C1335Wl A00 = C1335Wl.A00(c1839gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC2004jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC2004jd3.A2E());
                abstractC2004jd4 = this.A00.A0O;
                C1103Ng A2A = abstractC2004jd4.A2A();
                c1839gi2 = this.A00.A0R;
                C1103Ng.A07(A2A, c1839gi2);
                abstractC2004jd5 = this.A00.A0O;
                String A0y = abstractC2004jd5.A0y();
                abstractC2004jd6 = this.A00.A0O;
                AbstractC1123Oa.A02(A0y, AbstractC1359Xm.A00(abstractC2004jd6.A10()));
                c1839gi3 = this.A00.A0R;
                c1839gi3.A0F().A3L();
                c1111No = this.A00.A0P;
                if (c1111No.A0c()) {
                    c1839gi4 = this.A00.A0R;
                    c1839gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC1380Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC1380Yh.A4j(zu.A8G());
            return;
        }
        c1839gi5 = this.A00.A0R;
        c1839gi5.A0F().AET();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AEh() {
        InterfaceC1380Yh interfaceC1380Yh;
        ZU zu;
        interfaceC1380Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC1380Yh.A4j(zu.A81());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AFQ() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1688eG
    public final void AGg() {
        InterfaceC1380Yh interfaceC1380Yh;
        interfaceC1380Yh = this.A00.A0W;
        interfaceC1380Yh.ADJ(15);
    }
}
