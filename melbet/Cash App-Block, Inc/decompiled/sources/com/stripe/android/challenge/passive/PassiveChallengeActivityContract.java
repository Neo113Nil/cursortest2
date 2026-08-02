package com.stripe.android.challenge.passive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import coil3.size.SizeKt;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.challenge.passive.PassiveChallengeActivityResult;
import com.stripe.android.model.PassiveCaptchaParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/challenge/passive/PassiveChallengeActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/challenge/passive/PassiveChallengeActivityContract$Args;", "Lcom/stripe/android/challenge/passive/PassiveChallengeActivityResult;", "Args", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassiveChallengeActivityContract extends ActivityResultContract<Args, PassiveChallengeActivityResult> {

    public final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new SetupIntentResult.Creator(26);
        public final PassiveCaptchaParams passiveCaptchaParams;
        public final LinkedHashSet productUsage;
        public final String publishableKey;

        public Args(PassiveCaptchaParams passiveCaptchaParams, String str, LinkedHashSet linkedHashSet) {
            passiveCaptchaParams.getClass();
            str.getClass();
            this.passiveCaptchaParams = passiveCaptchaParams;
            this.publishableKey = str;
            this.productUsage = linkedHashSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return Intrinsics.areEqual(this.passiveCaptchaParams, args.passiveCaptchaParams) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && this.productUsage.equals(args.productUsage);
        }

        public final int hashCode() {
            return this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.passiveCaptchaParams.hashCode() * 31, 31, this.publishableKey);
        }

        public final String toString() {
            return "Args(passiveCaptchaParams=" + this.passiveCaptchaParams + ", publishableKey=" + this.publishableKey + ", productUsage=" + this.productUsage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.passiveCaptchaParams.writeToParcel(parcel, i);
            parcel.writeString(this.publishableKey);
            LinkedHashSet linkedHashSet = this.productUsage;
            parcel.writeInt(linkedHashSet.size());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                parcel.writeString((String) it.next());
            }
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Args args = (Args) obj;
        args.getClass();
        int i = PassiveChallengeActivity.$r8$clinit;
        Intent putExtra = new Intent(context, (Class<?>) PassiveChallengeActivity.class).putExtra("passive_challenge_args", new PassiveChallengeArgs(args.passiveCaptchaParams, args.publishableKey, CollectionsKt.toList(args.productUsage)));
        putExtra.getClass();
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        Bundle extras;
        PassiveChallengeActivityResult passiveChallengeActivityResult = (intent == null || (extras = intent.getExtras()) == null) ? null : (PassiveChallengeActivityResult) SizeKt.getParcelable(extras, "com.stripe.android.challenge.PassiveChallengeActivityContract.extra_result", PassiveChallengeActivityResult.class);
        return passiveChallengeActivityResult == null ? new PassiveChallengeActivityResult.Failed(new Throwable("No result")) : passiveChallengeActivityResult;
    }
}
