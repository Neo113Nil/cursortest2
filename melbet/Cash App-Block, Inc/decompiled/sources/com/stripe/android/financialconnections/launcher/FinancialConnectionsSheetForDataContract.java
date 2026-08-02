package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetForDataContract extends ActivityResultContract<FinancialConnectionsSheetActivityArgs.ForData, FinancialConnectionsSheetResult> {
    public final Function1 intentBuilder;

    public FinancialConnectionsSheetForDataContract(Function1 function1) {
        this.intentBuilder = function1;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        FinancialConnectionsSheetActivityArgs.ForData forData = (FinancialConnectionsSheetActivityArgs.ForData) obj;
        forData.getClass();
        return (Intent) this.intentBuilder.invoke(forData);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult;
        if (i != 0) {
            if (intent == null || (financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) intent.getParcelableExtra("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result")) == null) {
                return new FinancialConnectionsSheetResult.Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult."));
            }
            if (!(financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled)) {
                if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
                    return new FinancialConnectionsSheetResult.Failed(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).error);
                }
                if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
                    FinancialConnectionsSession financialConnectionsSession = ((FinancialConnectionsSheetActivityResult.Completed) financialConnectionsSheetActivityResult).financialConnectionsSession;
                    return financialConnectionsSession == null ? new FinancialConnectionsSheetResult.Failed(new IllegalArgumentException("financialConnectionsSession not set.")) : new FinancialConnectionsSheetResult.Completed(financialConnectionsSession);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return FinancialConnectionsSheetResult.Canceled.INSTANCE;
    }
}
