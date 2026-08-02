package com.stripe.android.payments.bankaccount.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.model.Token;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "Args", "Result", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CollectBankAccountContract extends ActivityResultContract<Args, CollectBankAccountResultInternal> {

    public abstract class Args implements Parcelable {
        public final boolean attachToIntent;
        public final String clientSecret;

        public final class ForDeferredPaymentIntent extends Args {
            public static final Parcelable.Creator<ForDeferredPaymentIntent> CREATOR = new Token.Creator(16);
            public final Integer amount;
            public final CollectBankAccountConfiguration configuration;
            public final String currency;
            public final String customerId;
            public final String elementsSessionId;
            public final FinancialConnectionsAvailability financialConnectionsAvailability;
            public final String hostedSurface;
            public final String onBehalfOf;
            public final String publishableKey;
            public final String stripeAccountId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredPaymentIntent(String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, FinancialConnectionsAvailability financialConnectionsAvailability, String str3, String str4, String str5, String str6, Integer num, String str7) {
                super(null, false);
                str.getClass();
                collectBankAccountConfiguration.getClass();
                str4.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.configuration = collectBankAccountConfiguration;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.hostedSurface = str3;
                this.elementsSessionId = str4;
                this.customerId = str5;
                this.onBehalfOf = str6;
                this.amount = num;
                this.currency = str7;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ForDeferredPaymentIntent)) {
                    return false;
                }
                ForDeferredPaymentIntent forDeferredPaymentIntent = (ForDeferredPaymentIntent) obj;
                return Intrinsics.areEqual(this.publishableKey, forDeferredPaymentIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forDeferredPaymentIntent.stripeAccountId) && Intrinsics.areEqual(this.configuration, forDeferredPaymentIntent.configuration) && this.financialConnectionsAvailability == forDeferredPaymentIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.hostedSurface, forDeferredPaymentIntent.hostedSurface) && Intrinsics.areEqual(this.elementsSessionId, forDeferredPaymentIntent.elementsSessionId) && Intrinsics.areEqual(this.customerId, forDeferredPaymentIntent.customerId) && Intrinsics.areEqual(this.onBehalfOf, forDeferredPaymentIntent.onBehalfOf) && Intrinsics.areEqual(this.amount, forDeferredPaymentIntent.amount) && Intrinsics.areEqual(this.currency, forDeferredPaymentIntent.currency);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int hashCode2 = (this.configuration.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int hashCode3 = (hashCode2 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31;
                String str2 = this.hostedSurface;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.elementsSessionId);
                String str3 = this.customerId;
                int hashCode4 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.amount;
                int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.currency;
                return hashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ForDeferredPaymentIntent(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", configuration=");
                m.append(this.configuration);
                m.append(", financialConnectionsAvailability=");
                m.append(this.financialConnectionsAvailability);
                m.append(", hostedSurface=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.hostedSurface, ", elementsSessionId=", this.elementsSessionId, ", customerId=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.customerId, ", onBehalfOf=", this.onBehalfOf, ", amount=");
                m.append(this.amount);
                m.append(", currency=");
                m.append(this.currency);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeParcelable(this.configuration, i);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(financialConnectionsAvailability.name());
                }
                parcel.writeString(this.hostedSurface);
                parcel.writeString(this.elementsSessionId);
                parcel.writeString(this.customerId);
                parcel.writeString(this.onBehalfOf);
                Integer num = this.amount;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
                parcel.writeString(this.currency);
            }
        }

        public final class ForDeferredSetupIntent extends Args {
            public static final Parcelable.Creator<ForDeferredSetupIntent> CREATOR = new Token.Creator(17);
            public final CollectBankAccountConfiguration configuration;
            public final String customerId;
            public final String elementsSessionId;
            public final FinancialConnectionsAvailability financialConnectionsAvailability;
            public final String hostedSurface;
            public final String onBehalfOf;
            public final String publishableKey;
            public final String stripeAccountId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredSetupIntent(String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, String str3, FinancialConnectionsAvailability financialConnectionsAvailability, String str4, String str5, String str6) {
                super(null, false);
                str.getClass();
                collectBankAccountConfiguration.getClass();
                str4.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.configuration = collectBankAccountConfiguration;
                this.hostedSurface = str3;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.elementsSessionId = str4;
                this.customerId = str5;
                this.onBehalfOf = str6;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ForDeferredSetupIntent)) {
                    return false;
                }
                ForDeferredSetupIntent forDeferredSetupIntent = (ForDeferredSetupIntent) obj;
                return Intrinsics.areEqual(this.publishableKey, forDeferredSetupIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forDeferredSetupIntent.stripeAccountId) && Intrinsics.areEqual(this.configuration, forDeferredSetupIntent.configuration) && Intrinsics.areEqual(this.hostedSurface, forDeferredSetupIntent.hostedSurface) && this.financialConnectionsAvailability == forDeferredSetupIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.elementsSessionId, forDeferredSetupIntent.elementsSessionId) && Intrinsics.areEqual(this.customerId, forDeferredSetupIntent.customerId) && Intrinsics.areEqual(this.onBehalfOf, forDeferredSetupIntent.onBehalfOf);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int hashCode2 = (this.configuration.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.hostedSurface;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31, 31, this.elementsSessionId);
                String str3 = this.customerId;
                int hashCode4 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ForDeferredSetupIntent(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", configuration=");
                m.append(this.configuration);
                m.append(", hostedSurface=");
                m.append(this.hostedSurface);
                m.append(", financialConnectionsAvailability=");
                m.append(this.financialConnectionsAvailability);
                m.append(", elementsSessionId=");
                m.append(this.elementsSessionId);
                m.append(", customerId=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.customerId, ", onBehalfOf=", this.onBehalfOf, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeParcelable(this.configuration, i);
                parcel.writeString(this.hostedSurface);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(financialConnectionsAvailability.name());
                }
                parcel.writeString(this.elementsSessionId);
                parcel.writeString(this.customerId);
                parcel.writeString(this.onBehalfOf);
            }
        }

        public final class ForPaymentIntent extends Args {
            public static final Parcelable.Creator<ForPaymentIntent> CREATOR = new Token.Creator(18);
            public final boolean attachToIntent;
            public final String clientSecret;
            public final CollectBankAccountConfiguration configuration;
            public final FinancialConnectionsAvailability financialConnectionsAvailability;
            public final String hostedSurface;
            public final String publishableKey;
            public final String stripeAccountId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForPaymentIntent(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str4) {
                super(str3, z);
                str.getClass();
                str3.getClass();
                collectBankAccountConfiguration.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.clientSecret = str3;
                this.configuration = collectBankAccountConfiguration;
                this.attachToIntent = z;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.hostedSurface = str4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ForPaymentIntent)) {
                    return false;
                }
                ForPaymentIntent forPaymentIntent = (ForPaymentIntent) obj;
                return Intrinsics.areEqual(this.publishableKey, forPaymentIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forPaymentIntent.stripeAccountId) && Intrinsics.areEqual(this.clientSecret, forPaymentIntent.clientSecret) && Intrinsics.areEqual(this.configuration, forPaymentIntent.configuration) && this.attachToIntent == forPaymentIntent.attachToIntent && this.financialConnectionsAvailability == forPaymentIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.hostedSurface, forPaymentIntent.hostedSurface);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.configuration.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.clientSecret)) * 31, 31, this.attachToIntent);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int hashCode2 = (m + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31;
                String str2 = this.hostedSurface;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ForPaymentIntent(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", clientSecret=");
                m.append(this.clientSecret);
                m.append(", configuration=");
                m.append(this.configuration);
                m.append(", attachToIntent=");
                m.append(this.attachToIntent);
                m.append(", financialConnectionsAvailability=");
                m.append(this.financialConnectionsAvailability);
                m.append(", hostedSurface=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hostedSurface, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeString(this.clientSecret);
                parcel.writeParcelable(this.configuration, i);
                parcel.writeInt(this.attachToIntent ? 1 : 0);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(financialConnectionsAvailability.name());
                }
                parcel.writeString(this.hostedSurface);
            }
        }

        public final class ForSetupIntent extends Args {
            public static final Parcelable.Creator<ForSetupIntent> CREATOR = new Token.Creator(19);
            public final boolean attachToIntent;
            public final String clientSecret;
            public final CollectBankAccountConfiguration configuration;
            public final FinancialConnectionsAvailability financialConnectionsAvailability;
            public final String hostedSurface;
            public final String publishableKey;
            public final String stripeAccountId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForSetupIntent(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str4) {
                super(str3, z);
                str.getClass();
                str3.getClass();
                collectBankAccountConfiguration.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.clientSecret = str3;
                this.configuration = collectBankAccountConfiguration;
                this.attachToIntent = z;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.hostedSurface = str4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ForSetupIntent)) {
                    return false;
                }
                ForSetupIntent forSetupIntent = (ForSetupIntent) obj;
                return Intrinsics.areEqual(this.publishableKey, forSetupIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forSetupIntent.stripeAccountId) && Intrinsics.areEqual(this.clientSecret, forSetupIntent.clientSecret) && Intrinsics.areEqual(this.configuration, forSetupIntent.configuration) && this.attachToIntent == forSetupIntent.attachToIntent && this.financialConnectionsAvailability == forSetupIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.hostedSurface, forSetupIntent.hostedSurface);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.configuration.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.clientSecret)) * 31, 31, this.attachToIntent);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int hashCode2 = (m + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31;
                String str2 = this.hostedSurface;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ForSetupIntent(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", clientSecret=");
                m.append(this.clientSecret);
                m.append(", configuration=");
                m.append(this.configuration);
                m.append(", attachToIntent=");
                m.append(this.attachToIntent);
                m.append(", financialConnectionsAvailability=");
                m.append(this.financialConnectionsAvailability);
                m.append(", hostedSurface=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hostedSurface, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeString(this.clientSecret);
                parcel.writeParcelable(this.configuration, i);
                parcel.writeInt(this.attachToIntent ? 1 : 0);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(financialConnectionsAvailability.name());
                }
                parcel.writeString(this.hostedSurface);
            }
        }

        public Args(String str, boolean z) {
            this.clientSecret = str;
            this.attachToIntent = z;
        }

        public boolean getAttachToIntent() {
            return this.attachToIntent;
        }

        public String getClientSecret() {
            return this.clientSecret;
        }

        public abstract CollectBankAccountConfiguration getConfiguration();

        public abstract FinancialConnectionsAvailability getFinancialConnectionsAvailability();

        public abstract String getPublishableKey();

        public abstract String getStripeAccountId();
    }

    public final class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new Token.Creator(20);
        public final CollectBankAccountResultInternal collectBankAccountResult;

        public Result(CollectBankAccountResultInternal collectBankAccountResultInternal) {
            collectBankAccountResultInternal.getClass();
            this.collectBankAccountResult = collectBankAccountResultInternal;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.areEqual(this.collectBankAccountResult, ((Result) obj).collectBankAccountResult);
        }

        public final int hashCode() {
            return this.collectBankAccountResult.hashCode();
        }

        public final String toString() {
            return "Result(collectBankAccountResult=" + this.collectBankAccountResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.collectBankAccountResult, i);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Args args = (Args) obj;
        args.getClass();
        Intent putExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", args);
        putExtra.getClass();
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        Result result;
        CollectBankAccountResultInternal collectBankAccountResultInternal = (intent == null || (result = (Result) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) == null) ? null : result.collectBankAccountResult;
        return collectBankAccountResultInternal == null ? new CollectBankAccountResultInternal.Failed(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult.")) : collectBankAccountResultInternal;
    }
}
