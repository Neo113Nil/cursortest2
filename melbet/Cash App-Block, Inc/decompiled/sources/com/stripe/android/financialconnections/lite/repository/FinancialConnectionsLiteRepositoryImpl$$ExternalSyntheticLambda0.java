package com.stripe.android.financialconnections.lite.repository;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinancialConnectionsSheetConfiguration f$0;

    public /* synthetic */ FinancialConnectionsLiteRepositoryImpl$$ExternalSyntheticLambda0(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, int i) {
        this.$r8$classId = i;
        this.f$0 = financialConnectionsSheetConfiguration;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = this.f$0;
        switch (i) {
            case 0:
                return financialConnectionsSheetConfiguration.publishableKey;
            default:
                return financialConnectionsSheetConfiguration.stripeAccountId;
        }
    }
}
