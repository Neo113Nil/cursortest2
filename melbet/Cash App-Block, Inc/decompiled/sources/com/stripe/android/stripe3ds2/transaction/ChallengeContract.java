package com.stripe.android.stripe3ds2.transaction;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.ui.window.Api33Impl;
import androidx.core.os.BundleKt;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "3ds2sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChallengeContract extends ActivityResultContract<ChallengeViewArgs, ChallengeResult> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        ChallengeViewArgs challengeViewArgs = (ChallengeViewArgs) obj;
        challengeViewArgs.getClass();
        Intent putExtras = new Intent(context, (Class<?>) ChallengeActivity.class).putExtras(BundleKt.bundleOf(new Pair("extra_args", challengeViewArgs)));
        putExtras.getClass();
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        Object parcelableExtra;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelableExtra = Api33Impl.getParcelableExtra(intent, "extra_result", ChallengeResult.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("extra_result");
                if (!ChallengeResult.class.isInstance(parcelableExtra)) {
                    parcelableExtra = null;
                }
            }
            ChallengeResult challengeResult = (ChallengeResult) parcelableExtra;
            if (challengeResult != null) {
                return challengeResult;
            }
        }
        return new ChallengeResult.RuntimeError(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, IntentData.EMPTY);
    }
}
