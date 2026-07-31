package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2825aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC2829aP A00(AbstractC3383jd abstractC3383jd) {
        if (abstractC3383jd.A2U()) {
            EnumC2829aP enumC2829aP = EnumC2829aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC2829aP;
        }
        return EnumC2829aP.A03;
    }

    public static void A01(C3218gi c3218gi, EnumC2826aM enumC2826aM) {
        c3218gi.A0F().AAz(enumC2826aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C3218gi c3218gi, EnumC2826aM enumC2826aM) {
        c3218gi.A0F().AB9(enumC2826aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C3218gi c3218gi, EnumC2826aM enumC2826aM) {
        c3218gi.A0F().AC7(enumC2826aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C3218gi c3218gi, EnumC2826aM enumC2826aM) {
        A01(c3218gi, enumC2826aM);
    }

    public static void A05(C3218gi c3218gi, EnumC2826aM enumC2826aM) {
        A02(c3218gi, enumC2826aM);
    }

    public static void A06(C3218gi c3218gi, EnumC2826aM enumC2826aM) {
        A03(c3218gi, enumC2826aM);
    }

    public static void A07(VI vi, C3218gi c3218gi, InterfaceC2759Yh interfaceC2759Yh, AbstractC3383jd abstractC3383jd, EnumC2826aM enumC2826aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC3383jd.A2Q()) {
            c3218gi.A0F().AB8(enumC2826aM.name().toLowerCase(Locale.US));
        }
        if (abstractC3383jd.A2U()) {
            c3218gi.A0F().AAy(enumC2826aM.name().toLowerCase(Locale.US));
        }
        C2508Og A002 = AbstractC2509Oh.A00(c3218gi.A02());
        C3214ge A02 = c3218gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (A002.A0O(A02, true)) {
            if (interfaceC2759Yh != null) {
                interfaceC2759Yh.AAo(abstractC3383jd.A2E(), abstractC3383jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC3383jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c3218gi, XB.A00(abstractC3383jd.A2C().A00()), abstractC3383jd.A2E());
        }
    }
}
