package com.stripe.android.challenge.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.model.StripeIntent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class IntentConfirmationChallengeArgs implements Parcelable {
    public static final Parcelable.Creator<IntentConfirmationChallengeArgs> CREATOR = new SetupIntentResult.Creator(25);
    public final String captchaVendorName;
    public final StripeIntent intent;
    public final List productUsage;
    public final String publishableKey;

    public IntentConfirmationChallengeArgs(String str, List list, StripeIntent stripeIntent, String str2) {
        str.getClass();
        list.getClass();
        stripeIntent.getClass();
        this.publishableKey = str;
        this.productUsage = list;
        this.intent = stripeIntent;
        this.captchaVendorName = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentConfirmationChallengeArgs)) {
            return false;
        }
        IntentConfirmationChallengeArgs intentConfirmationChallengeArgs = (IntentConfirmationChallengeArgs) obj;
        return Intrinsics.areEqual(this.publishableKey, intentConfirmationChallengeArgs.publishableKey) && Intrinsics.areEqual(this.productUsage, intentConfirmationChallengeArgs.productUsage) && Intrinsics.areEqual(this.intent, intentConfirmationChallengeArgs.intent) && Intrinsics.areEqual(this.captchaVendorName, intentConfirmationChallengeArgs.captchaVendorName);
    }

    public final int hashCode() {
        int hashCode = (this.intent.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.publishableKey.hashCode() * 31, 31, this.productUsage)) * 31;
        String str = this.captchaVendorName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("IntentConfirmationChallengeArgs(publishableKey=", this.publishableKey, ", productUsage=", ", intent=", this.productUsage);
        m.append(this.intent);
        m.append(", captchaVendorName=");
        m.append(this.captchaVendorName);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.publishableKey);
        parcel.writeStringList(this.productUsage);
        parcel.writeParcelable(this.intent, i);
        parcel.writeString(this.captchaVendorName);
    }
}
