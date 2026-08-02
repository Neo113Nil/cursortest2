package com.withpersona.sdk2.inquiry.advancedCustomizations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ViewControllerVersion {
    public static final /* synthetic */ ViewControllerVersion[] $VALUES = {new ViewControllerVersion("DefaultSelfie", 0), new ViewControllerVersion("DefaultGovIdCapture", 1), new ViewControllerVersion("DefaultGovIdReview", 2), new ViewControllerVersion("DefaultSelectCountryAndIdClass", 3), new ViewControllerVersion("K0000Selfie", 4), new ViewControllerVersion("K0000GovIdCapture", 5), new ViewControllerVersion("K0000GovIdReview", 6), new ViewControllerVersion("K0000SelectCountryAndIdClass", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    ViewControllerVersion EF5;

    public static ViewControllerVersion valueOf(String str) {
        return (ViewControllerVersion) Enum.valueOf(ViewControllerVersion.class, str);
    }

    public static ViewControllerVersion[] values() {
        return (ViewControllerVersion[]) $VALUES.clone();
    }
}
