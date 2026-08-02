package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.DefaultCardFundingFilter;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Config;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result;
import com.stripe.android.model.ClientAttributionMetadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "Args", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherContractV2 extends ActivityResultContract<Args, GooglePayPaymentMethodLauncher$Result> {

    public final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new GooglePayLauncher$Config.Creator(12);
        public final long amount;
        public final DefaultCardBrandFilter cardBrandFilter;
        public final DefaultCardFundingFilter cardFundingFilter;
        public final ClientAttributionMetadata clientAttributionMetadata;
        public final GooglePayPaymentMethodLauncher$Config config;
        public final String currencyCode;
        public final boolean isElements;
        public final String label;
        public final String publishableKey;
        public final String transactionId;

        public Args(GooglePayPaymentMethodLauncher$Config googlePayPaymentMethodLauncher$Config, String str, long j, String str2, String str3, DefaultCardBrandFilter defaultCardBrandFilter, DefaultCardFundingFilter defaultCardFundingFilter, ClientAttributionMetadata clientAttributionMetadata, boolean z, String str4) {
            googlePayPaymentMethodLauncher$Config.getClass();
            str.getClass();
            defaultCardBrandFilter.getClass();
            defaultCardFundingFilter.getClass();
            this.config = googlePayPaymentMethodLauncher$Config;
            this.currencyCode = str;
            this.amount = j;
            this.label = str2;
            this.transactionId = str3;
            this.cardBrandFilter = defaultCardBrandFilter;
            this.cardFundingFilter = defaultCardFundingFilter;
            this.clientAttributionMetadata = clientAttributionMetadata;
            this.isElements = z;
            this.publishableKey = str4;
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
            return Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.currencyCode, args.currencyCode) && this.amount == args.amount && Intrinsics.areEqual(this.label, args.label) && Intrinsics.areEqual(this.transactionId, args.transactionId) && Intrinsics.areEqual(this.cardBrandFilter, args.cardBrandFilter) && Intrinsics.areEqual(this.cardFundingFilter, args.cardFundingFilter) && Intrinsics.areEqual(this.clientAttributionMetadata, args.clientAttributionMetadata) && this.isElements == args.isElements && Intrinsics.areEqual(this.publishableKey, args.publishableKey);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.config.hashCode() * 31, 31, this.currencyCode), 31, this.amount);
            String str = this.label;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            int hashCode2 = (this.cardFundingFilter.hashCode() + ((this.cardBrandFilter.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
            ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (clientAttributionMetadata == null ? 0 : clientAttributionMetadata.hashCode())) * 31, 31, this.isElements);
            String str3 = this.publishableKey;
            return m2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Args(config=");
            sb.append(this.config);
            sb.append(", currencyCode=");
            sb.append(this.currencyCode);
            sb.append(", amount=");
            Fragment$5$$ExternalSyntheticOutline0.m(this.amount, ", label=", this.label, sb);
            sb.append(", transactionId=");
            sb.append(this.transactionId);
            sb.append(", cardBrandFilter=");
            sb.append(this.cardBrandFilter);
            sb.append(", cardFundingFilter=");
            sb.append(this.cardFundingFilter);
            sb.append(", clientAttributionMetadata=");
            sb.append(this.clientAttributionMetadata);
            sb.append(", isElements=");
            sb.append(this.isElements);
            sb.append(", publishableKey=");
            sb.append(this.publishableKey);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.config.writeToParcel(parcel, i);
            parcel.writeString(this.currencyCode);
            parcel.writeLong(this.amount);
            parcel.writeString(this.label);
            parcel.writeString(this.transactionId);
            parcel.writeParcelable(this.cardBrandFilter, i);
            parcel.writeParcelable(this.cardFundingFilter, i);
            ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
            if (clientAttributionMetadata == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clientAttributionMetadata.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isElements ? 1 : 0);
            parcel.writeString(this.publishableKey);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Args args = (Args) obj;
        args.getClass();
        Intent putExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(BundleKt.bundleOf(new Pair("extra_args", args)));
        putExtras.getClass();
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        GooglePayPaymentMethodLauncher$Result googlePayPaymentMethodLauncher$Result;
        return (intent == null || (googlePayPaymentMethodLauncher$Result = (GooglePayPaymentMethodLauncher$Result) intent.getParcelableExtra("extra_result")) == null) ? new GooglePayPaymentMethodLauncher$Result.Failed(new IllegalArgumentException("Could not parse a valid result."), 1) : googlePayPaymentMethodLauncher$Result;
    }
}
