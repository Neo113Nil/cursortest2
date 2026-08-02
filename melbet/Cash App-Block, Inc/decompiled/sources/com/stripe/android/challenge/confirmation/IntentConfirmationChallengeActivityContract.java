package com.stripe.android.challenge.confirmation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import coil3.size.SizeKt;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityResult;
import com.stripe.android.model.StripeIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityContract$Args;", "Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityResult;", "Args", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntentConfirmationChallengeActivityContract extends ActivityResultContract<Args, IntentConfirmationChallengeActivityResult> {

    public final class Args {
        public final StripeIntent intent;
        public final Set productUsage;
        public final String publishableKey;

        public Args(String str, Set set, StripeIntent stripeIntent) {
            str.getClass();
            set.getClass();
            stripeIntent.getClass();
            this.publishableKey = str;
            this.productUsage = set;
            this.intent = stripeIntent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return Intrinsics.areEqual(this.publishableKey, args.publishableKey) && Intrinsics.areEqual(this.productUsage, args.productUsage) && Intrinsics.areEqual(this.intent, args.intent);
        }

        public final int hashCode() {
            return this.intent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.publishableKey.hashCode() * 31, 31, this.productUsage);
        }

        public final String toString() {
            return "Args(publishableKey=" + this.publishableKey + ", productUsage=" + this.productUsage + ", intent=" + this.intent + ")";
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge.StripeJs stripeJs;
        Args args = (Args) obj;
        args.getClass();
        StripeIntent stripeIntent = args.intent;
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        String str = null;
        StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge intentConfirmationChallenge = nextActionData instanceof StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge ? (StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge) nextActionData : null;
        if (intentConfirmationChallenge != null && (stripeJs = intentConfirmationChallenge.stripeJs) != null) {
            str = stripeJs.captchaVendorName;
        }
        int i = IntentConfirmationChallengeActivity.$r8$clinit;
        Intent putExtras = new Intent(context, (Class<?>) IntentConfirmationChallengeActivity.class).putExtras(BundleKt.bundleOf(new Pair("intent_confirmation_challenge_args", new IntentConfirmationChallengeArgs(args.publishableKey, CollectionsKt.toList(args.productUsage), stripeIntent, str))));
        putExtras.getClass();
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        Bundle extras;
        IntentConfirmationChallengeActivityResult intentConfirmationChallengeActivityResult = (intent == null || (extras = intent.getExtras()) == null) ? null : (IntentConfirmationChallengeActivityResult) SizeKt.getParcelable(extras, "com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract.extra_result", IntentConfirmationChallengeActivityResult.class);
        return intentConfirmationChallengeActivityResult == null ? new IntentConfirmationChallengeActivityResult.Failed(null, new Throwable("No result")) : intentConfirmationChallengeActivityResult;
    }
}
