package com.stripe.android.payments.financialconnections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class FinancialConnectionsAvailability {
    public static final /* synthetic */ FinancialConnectionsAvailability[] $VALUES;
    public static final FinancialConnectionsAvailability Full;

    static {
        FinancialConnectionsAvailability financialConnectionsAvailability = new FinancialConnectionsAvailability("Full", 0);
        Full = financialConnectionsAvailability;
        $VALUES = new FinancialConnectionsAvailability[]{financialConnectionsAvailability, new FinancialConnectionsAvailability("Lite", 1)};
    }

    public static FinancialConnectionsAvailability valueOf(String str) {
        return (FinancialConnectionsAvailability) Enum.valueOf(FinancialConnectionsAvailability.class, str);
    }

    public static FinancialConnectionsAvailability[] values() {
        return (FinancialConnectionsAvailability[]) $VALUES.clone();
    }
}
