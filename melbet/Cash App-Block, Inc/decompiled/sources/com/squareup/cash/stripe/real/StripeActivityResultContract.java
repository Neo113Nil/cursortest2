package com.squareup.cash.stripe.real;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.cash.stripe.api.StripeLinkParams;
import com.squareup.cash.stripe.api.StripeLinkResult;
import com.squareup.cash.stripe.api.StripeLinkResult$Failure$InitializationError;
import com.squareup.cash.stripe.api.StripeLinkResult$Failure$Unknown;
import com.squareup.cash.stripe.integration.StripeLinkActivity;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult$Failure$InitializationError;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult$Failure$Unknown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/stripe/real/StripeActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/squareup/cash/stripe/api/StripeLinkParams;", "Lcom/squareup/cash/stripe/api/StripeLinkResult;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
final class StripeActivityResultContract extends ActivityResultContract<StripeLinkParams, StripeLinkResult> {
    public final ComponentActivity activity;

    public StripeActivityResultContract(ComponentActivity componentActivity) {
        this.activity = componentActivity;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        StripeLinkParams stripeLinkParams = (StripeLinkParams) obj;
        stripeLinkParams.getClass();
        Intent intent = new Intent(this.activity, (Class<?>) StripeLinkActivity.class);
        intent.putExtra("client_secret", stripeLinkParams.getClientSecret());
        intent.putExtra("publishable_key", stripeLinkParams.getPublishableKey());
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if ((intent != null ? intent.getExtras() : null) != null && i == -1) {
            intent.getClass();
            Bundle extras = intent.getExtras();
            extras.getClass();
            Object obj = extras.get("StripeLinkActivityResult");
            obj.getClass();
            StripeLinkActivityResult stripeLinkActivityResult = (StripeLinkActivityResult) obj;
            if (!stripeLinkActivityResult.equals(StripeLinkActivityResult.Canceled.INSTANCE)) {
                if (stripeLinkActivityResult.equals(StripeLinkActivityResult$Failure$Unknown.INSTANCE)) {
                    return StripeLinkResult$Failure$Unknown.INSTANCE;
                }
                if (stripeLinkActivityResult.equals(StripeLinkActivityResult$Failure$InitializationError.INSTANCE)) {
                    return StripeLinkResult$Failure$InitializationError.INSTANCE;
                }
                if (stripeLinkActivityResult instanceof StripeLinkActivityResult.Success) {
                    StripeLinkActivityResult.Success success = (StripeLinkActivityResult.Success) stripeLinkActivityResult;
                    return new StripeLinkResult.Success(success.getAccountId(), success.getPaymentMethodId(), success.getInstitutionName());
                }
                if (stripeLinkActivityResult.equals(StripeLinkActivityResult.ManualLink.INSTANCE)) {
                    return StripeLinkResult.ManualLink.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return StripeLinkResult.Canceled.INSTANCE;
    }
}
