package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1446aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1450aP A00(AbstractC2004jd abstractC2004jd) {
        if (abstractC2004jd.A2U()) {
            EnumC1450aP enumC1450aP = EnumC1450aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1450aP;
        }
        return EnumC1450aP.A03;
    }

    public static void A01(C1839gi c1839gi, EnumC1447aM enumC1447aM) {
        c1839gi.A0F().AAz(enumC1447aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C1839gi c1839gi, EnumC1447aM enumC1447aM) {
        c1839gi.A0F().AB9(enumC1447aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C1839gi c1839gi, EnumC1447aM enumC1447aM) {
        c1839gi.A0F().AC7(enumC1447aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C1839gi c1839gi, EnumC1447aM enumC1447aM) {
        A01(c1839gi, enumC1447aM);
    }

    public static void A05(C1839gi c1839gi, EnumC1447aM enumC1447aM) {
        A02(c1839gi, enumC1447aM);
    }

    public static void A06(C1839gi c1839gi, EnumC1447aM enumC1447aM) {
        A03(c1839gi, enumC1447aM);
    }

    public static void A07(VI vi, C1839gi c1839gi, InterfaceC1380Yh interfaceC1380Yh, AbstractC2004jd abstractC2004jd, EnumC1447aM enumC1447aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC2004jd.A2Q()) {
            c1839gi.A0F().AB8(enumC1447aM.name().toLowerCase(Locale.US));
        }
        if (abstractC2004jd.A2U()) {
            c1839gi.A0F().AAy(enumC1447aM.name().toLowerCase(Locale.US));
        }
        C1129Og A002 = AbstractC1130Oh.A00(c1839gi.A02());
        C1835ge A02 = c1839gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (A002.A0O(A02, true)) {
            if (interfaceC1380Yh != null) {
                interfaceC1380Yh.AAo(abstractC2004jd.A2E(), abstractC2004jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC2004jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c1839gi, XB.A00(abstractC2004jd.A2C().A00()), abstractC2004jd.A2E());
        }
    }
}
