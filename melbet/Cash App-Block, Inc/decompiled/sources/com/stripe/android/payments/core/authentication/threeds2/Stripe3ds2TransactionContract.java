package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Args", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Stripe3ds2TransactionContract extends ActivityResultContract<Args, PaymentFlowResult$Unvalidated> {

    public final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new AppInfo.Creator(2);
        public final PaymentAuthConfig.Stripe3ds2Config config;
        public final boolean enableLogging;
        public final StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData;
        public final Set productUsage;
        public final String publishableKey;
        public final ApiRequest.Options requestOptions;
        public final SdkTransactionId sdkTransactionId;
        public final Integer statusBarColor;
        public final StripeIntent stripeIntent;

        public Args(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2, ApiRequest.Options options, boolean z, Integer num, String str, Set set) {
            sdkTransactionId.getClass();
            stripe3ds2Config.getClass();
            stripeIntent.getClass();
            use3DS2.getClass();
            options.getClass();
            str.getClass();
            set.getClass();
            this.sdkTransactionId = sdkTransactionId;
            this.config = stripe3ds2Config;
            this.stripeIntent = stripeIntent;
            this.nextActionData = use3DS2;
            this.requestOptions = options;
            this.enableLogging = z;
            this.statusBarColor = num;
            this.publishableKey = str;
            this.productUsage = set;
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
            return Intrinsics.areEqual(this.sdkTransactionId, args.sdkTransactionId) && Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.stripeIntent, args.stripeIntent) && Intrinsics.areEqual(this.nextActionData, args.nextActionData) && Intrinsics.areEqual(this.requestOptions, args.requestOptions) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && Intrinsics.areEqual(this.productUsage, args.productUsage);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.requestOptions.hashCode() + ((this.nextActionData.hashCode() + ((this.stripeIntent.hashCode() + ((this.config.hashCode() + (this.sdkTransactionId.value.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.enableLogging);
            Integer num = this.statusBarColor;
            return this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (num == null ? 0 : num.hashCode())) * 31, 31, this.publishableKey);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Args(sdkTransactionId=");
            sb.append(this.sdkTransactionId);
            sb.append(", config=");
            sb.append(this.config);
            sb.append(", stripeIntent=");
            sb.append(this.stripeIntent);
            sb.append(", nextActionData=");
            sb.append(this.nextActionData);
            sb.append(", requestOptions=");
            sb.append(this.requestOptions);
            sb.append(", enableLogging=");
            sb.append(this.enableLogging);
            sb.append(", statusBarColor=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.statusBarColor, ", publishableKey=", this.publishableKey, ", productUsage=");
            sb.append(this.productUsage);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.sdkTransactionId, i);
            this.config.writeToParcel(parcel, i);
            parcel.writeParcelable(this.stripeIntent, i);
            this.nextActionData.writeToParcel(parcel, i);
            parcel.writeParcelable(this.requestOptions, i);
            parcel.writeInt(this.enableLogging ? 1 : 0);
            Integer num = this.statusBarColor;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeString(this.publishableKey);
            Set set = this.productUsage;
            parcel.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString((String) it.next());
            }
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Args args = (Args) obj;
        args.getClass();
        Intent putExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(BundleKt.bundleOf(new Pair("extra_args", args)));
        putExtras.getClass();
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated;
        return (intent == null || (paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) intent.getParcelableExtra("extra_args")) == null) ? new PaymentFlowResult$Unvalidated((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127) : paymentFlowResult$Unvalidated;
    }
}
