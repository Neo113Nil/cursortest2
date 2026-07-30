package com.my.lib.enums;

import a6.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PaymentModel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PaymentModel[] $VALUES;
    public static final PaymentModel C_END_PAY = new PaymentModel("C_END_PAY", 0, 0);
    public static final PaymentModel LICENSE_PAY = new PaymentModel("LICENSE_PAY", 1, 1);
    private final int value;

    private static final /* synthetic */ PaymentModel[] $values() {
        return new PaymentModel[]{C_END_PAY, LICENSE_PAY};
    }

    static {
        PaymentModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.enumEntries($values);
    }

    private PaymentModel(String str, int i8, int i9) {
        this.value = i9;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PaymentModel valueOf(String str) {
        return (PaymentModel) Enum.valueOf(PaymentModel.class, str);
    }

    public static PaymentModel[] values() {
        return (PaymentModel[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
