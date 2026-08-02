package com.withpersona.sdk2.inquiry.shared.inquiry_session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GpsPrecisionAuthorization {
    public static final /* synthetic */ GpsPrecisionAuthorization[] $VALUES;
    public static final GpsPrecisionAuthorization PRECISE;
    public static final GpsPrecisionAuthorization ROUGH;

    static {
        GpsPrecisionAuthorization gpsPrecisionAuthorization = new GpsPrecisionAuthorization("ROUGH", 0);
        ROUGH = gpsPrecisionAuthorization;
        GpsPrecisionAuthorization gpsPrecisionAuthorization2 = new GpsPrecisionAuthorization("PRECISE", 1);
        PRECISE = gpsPrecisionAuthorization2;
        $VALUES = new GpsPrecisionAuthorization[]{gpsPrecisionAuthorization, gpsPrecisionAuthorization2};
    }

    public static GpsPrecisionAuthorization valueOf(String str) {
        return (GpsPrecisionAuthorization) Enum.valueOf(GpsPrecisionAuthorization.class, str);
    }

    public static GpsPrecisionAuthorization[] values() {
        return (GpsPrecisionAuthorization[]) $VALUES.clone();
    }
}
