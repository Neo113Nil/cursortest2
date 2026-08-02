package com.squareup.cash.support.backend.api.activities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AmountTreatment {
    public static final /* synthetic */ AmountTreatment[] $VALUES;
    public static final AmountTreatment FADED;
    public static final AmountTreatment FADED_AND_STRIKE_THROUGH;
    public static final AmountTreatment STANDARD;

    static {
        AmountTreatment amountTreatment = new AmountTreatment("STANDARD", 0);
        STANDARD = amountTreatment;
        AmountTreatment amountTreatment2 = new AmountTreatment("FADED", 1);
        FADED = amountTreatment2;
        AmountTreatment amountTreatment3 = new AmountTreatment("FADED_AND_STRIKE_THROUGH", 2);
        FADED_AND_STRIKE_THROUGH = amountTreatment3;
        $VALUES = new AmountTreatment[]{amountTreatment, amountTreatment2, amountTreatment3};
    }

    public static AmountTreatment valueOf(String str) {
        return (AmountTreatment) Enum.valueOf(AmountTreatment.class, str);
    }

    public static AmountTreatment[] values() {
        return (AmountTreatment[]) $VALUES.clone();
    }
}
