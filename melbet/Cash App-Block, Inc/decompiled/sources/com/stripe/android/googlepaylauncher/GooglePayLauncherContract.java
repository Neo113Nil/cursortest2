package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Config;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Result;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "PaymentIntentArgs", "SetupIntentArgs", "Args", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GooglePayLauncherContract extends ActivityResultContract<Args, GooglePayLauncher$Result> {

    public abstract class Args implements Parcelable {
        public abstract GooglePayLauncher$Config getConfig$payments_core_release();
    }

    public final class PaymentIntentArgs extends Args {
        public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new GooglePayLauncher$Config.Creator(5);
        public final String clientSecret;
        public final GooglePayLauncher$Config config;
        public final String label;

        public PaymentIntentArgs(String str, GooglePayLauncher$Config googlePayLauncher$Config, String str2) {
            str.getClass();
            googlePayLauncher$Config.getClass();
            this.clientSecret = str;
            this.config = googlePayLauncher$Config;
            this.label = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentIntentArgs)) {
                return false;
            }
            PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) obj;
            return Intrinsics.areEqual(this.clientSecret, paymentIntentArgs.clientSecret) && Intrinsics.areEqual(this.config, paymentIntentArgs.config) && Intrinsics.areEqual(this.label, paymentIntentArgs.label);
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public final GooglePayLauncher$Config getConfig$payments_core_release() {
            return this.config;
        }

        public final int hashCode() {
            int hashCode = (this.config.hashCode() + (this.clientSecret.hashCode() * 31)) * 31;
            String str = this.label;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaymentIntentArgs(clientSecret=");
            sb.append(this.clientSecret);
            sb.append(", config=");
            sb.append(this.config);
            sb.append(", label=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.label, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.clientSecret);
            this.config.writeToParcel(parcel, i);
            parcel.writeString(this.label);
        }
    }

    public final class SetupIntentArgs extends Args {
        public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new GooglePayLauncher$Config.Creator(6);
        public final Long amount;
        public final String clientSecret;
        public final GooglePayLauncher$Config config;
        public final String currencyCode;
        public final String label;

        public SetupIntentArgs(String str, GooglePayLauncher$Config googlePayLauncher$Config, String str2, Long l, String str3) {
            str.getClass();
            googlePayLauncher$Config.getClass();
            str2.getClass();
            this.clientSecret = str;
            this.config = googlePayLauncher$Config;
            this.currencyCode = str2;
            this.amount = l;
            this.label = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetupIntentArgs)) {
                return false;
            }
            SetupIntentArgs setupIntentArgs = (SetupIntentArgs) obj;
            return Intrinsics.areEqual(this.clientSecret, setupIntentArgs.clientSecret) && Intrinsics.areEqual(this.config, setupIntentArgs.config) && Intrinsics.areEqual(this.currencyCode, setupIntentArgs.currencyCode) && Intrinsics.areEqual(this.amount, setupIntentArgs.amount) && Intrinsics.areEqual(this.label, setupIntentArgs.label);
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public final GooglePayLauncher$Config getConfig$payments_core_release() {
            return this.config;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.config.hashCode() + (this.clientSecret.hashCode() * 31)) * 31, 31, this.currencyCode);
            Long l = this.amount;
            int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.label;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetupIntentArgs(clientSecret=");
            sb.append(this.clientSecret);
            sb.append(", config=");
            sb.append(this.config);
            sb.append(", currencyCode=");
            Request$Priority$EnumUnboxingLocalUtility.m(this.amount, this.currencyCode, ", amount=", ", label=", sb);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.label, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.clientSecret);
            this.config.writeToParcel(parcel, i);
            parcel.writeString(this.currencyCode);
            Long l = this.amount;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeString(this.label);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Args args = (Args) obj;
        args.getClass();
        Intent putExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(BundleKt.bundleOf(new Pair("extra_args", args)));
        putExtras.getClass();
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        GooglePayLauncher$Result googlePayLauncher$Result;
        return (intent == null || (googlePayLauncher$Result = (GooglePayLauncher$Result) intent.getParcelableExtra("extra_result")) == null) ? new GooglePayLauncher$Result.Failed(new IllegalStateException("Error while processing result from Google Pay.")) : googlePayLauncher$Result;
    }
}
