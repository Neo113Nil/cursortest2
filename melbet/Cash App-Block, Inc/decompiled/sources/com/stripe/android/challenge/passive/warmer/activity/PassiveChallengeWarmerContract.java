package com.stripe.android.challenge.passive.warmer.activity;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerCompleted;", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassiveChallengeWarmerContract extends ActivityResultContract<Object, PassiveChallengeWarmerCompleted> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final /* bridge */ /* synthetic */ Object parseResult(int i, Intent intent) {
        return PassiveChallengeWarmerCompleted.INSTANCE;
    }
}
