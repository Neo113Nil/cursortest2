package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tp {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f32543d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ tp[] f32544e;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f32545b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f32546c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        tp[] tpVarArr = {new tp(0, "CONSENT_STRING", "IABConsent_ConsentString", "IABTCF_TCString"), new tp(1, "GDPR", "IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"), new tp(2, "CMP_PRESENT", "IABConsent_CMPPresent", "IABTCF_CmpSdkID"), new tp(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"), new tp(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"), new tp(5, "ADDITIONAL_CONSENT", null, "IABTCF_AddtlConsent")};
        f32544e = tpVarArr;
        AbstractC1372b.a(tpVarArr);
        f32543d = new a(0);
    }

    private tp(int i4, String str, String str2, String str3) {
        this.f32545b = str2;
        this.f32546c = str3;
    }

    public static tp valueOf(String str) {
        return (tp) Enum.valueOf(tp.class, str);
    }

    public static tp[] values() {
        return (tp[]) f32544e.clone();
    }

    @Nullable
    public final String a() {
        return this.f32545b;
    }

    @NotNull
    public final String b() {
        return this.f32546c;
    }
}
