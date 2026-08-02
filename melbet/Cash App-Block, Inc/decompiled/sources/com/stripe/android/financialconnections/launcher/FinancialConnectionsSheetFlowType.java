package com.stripe.android.financialconnections.launcher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetFlowType {
    public static final /* synthetic */ FinancialConnectionsSheetFlowType[] $VALUES;
    public static final FinancialConnectionsSheetFlowType ForData;
    public static final FinancialConnectionsSheetFlowType ForInstantDebits;
    public static final FinancialConnectionsSheetFlowType ForToken;

    static {
        FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType = new FinancialConnectionsSheetFlowType("ForData", 0);
        ForData = financialConnectionsSheetFlowType;
        FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType2 = new FinancialConnectionsSheetFlowType("ForInstantDebits", 1);
        ForInstantDebits = financialConnectionsSheetFlowType2;
        FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType3 = new FinancialConnectionsSheetFlowType("ForToken", 2);
        ForToken = financialConnectionsSheetFlowType3;
        $VALUES = new FinancialConnectionsSheetFlowType[]{financialConnectionsSheetFlowType, financialConnectionsSheetFlowType2, financialConnectionsSheetFlowType3};
    }

    public static FinancialConnectionsSheetFlowType valueOf(String str) {
        return (FinancialConnectionsSheetFlowType) Enum.valueOf(FinancialConnectionsSheetFlowType.class, str);
    }

    public static FinancialConnectionsSheetFlowType[] values() {
        return (FinancialConnectionsSheetFlowType[]) $VALUES.clone();
    }
}
