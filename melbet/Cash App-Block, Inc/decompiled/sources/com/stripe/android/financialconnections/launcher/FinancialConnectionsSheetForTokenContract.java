package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.google.android.libraries.places.api.model.zzco;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult$Canceled;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult$Completed;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult$Failed;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;", "Lcom/google/android/libraries/places/api/model/zzco;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetForTokenContract extends ActivityResultContract<FinancialConnectionsSheetActivityArgs.ForToken, zzco> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        ((FinancialConnectionsSheetActivityArgs.ForToken) obj).getClass();
        throw null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult;
        if (intent == null || (financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) intent.getParcelableExtra("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result")) == null) {
            return new FinancialConnectionsSheetForTokenResult$Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult."));
        }
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            return FinancialConnectionsSheetForTokenResult$Canceled.INSTANCE;
        }
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
            return new FinancialConnectionsSheetForTokenResult$Failed(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).error);
        }
        if (!(financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        FinancialConnectionsSheetActivityResult.Completed completed = (FinancialConnectionsSheetActivityResult.Completed) financialConnectionsSheetActivityResult;
        FinancialConnectionsSession financialConnectionsSession = completed.financialConnectionsSession;
        if (financialConnectionsSession == null) {
            return new FinancialConnectionsSheetForTokenResult$Failed(new IllegalArgumentException("FinancialConnectionsSession is not set"));
        }
        Token token = completed.token;
        return token == null ? new FinancialConnectionsSheetForTokenResult$Failed(new IllegalArgumentException("PaymentAccount is not set on FinancialConnectionsSession")) : new FinancialConnectionsSheetForTokenResult$Completed(financialConnectionsSession, token);
    }
}
