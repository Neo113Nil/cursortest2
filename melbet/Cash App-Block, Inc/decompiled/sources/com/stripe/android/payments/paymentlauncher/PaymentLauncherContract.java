package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "Args", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentLauncherContract extends ActivityResultContract<Args, InternalPaymentResult> {

    public abstract class Args implements Parcelable {

        public final class HashedPaymentIntentNextActionArgs extends Args {
            public static final Parcelable.Creator<HashedPaymentIntentNextActionArgs> CREATOR = new AppInfo.Creator(6);
            public final Lazy decodedValue$delegate;
            public final boolean enableLogging;
            public final String hashedValue;
            public final boolean includePaymentSheetNextHandlers;
            public final LinkedHashSet productUsage;
            public final Integer statusBarColor;
            public final String stripeAccountId;

            public HashedPaymentIntentNextActionArgs(String str, boolean z, LinkedHashSet linkedHashSet, boolean z2, String str2, Integer num) {
                str2.getClass();
                this.stripeAccountId = str;
                this.enableLogging = z;
                this.productUsage = linkedHashSet;
                this.includePaymentSheetNextHandlers = z2;
                this.hashedValue = str2;
                this.statusBarColor = num;
                this.decodedValue$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 21));
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HashedPaymentIntentNextActionArgs)) {
                    return false;
                }
                HashedPaymentIntentNextActionArgs hashedPaymentIntentNextActionArgs = (HashedPaymentIntentNextActionArgs) obj;
                return Intrinsics.areEqual(this.stripeAccountId, hashedPaymentIntentNextActionArgs.stripeAccountId) && this.enableLogging == hashedPaymentIntentNextActionArgs.enableLogging && this.productUsage.equals(hashedPaymentIntentNextActionArgs.productUsage) && this.includePaymentSheetNextHandlers == hashedPaymentIntentNextActionArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.hashedValue, hashedPaymentIntentNextActionArgs.hashedValue) && Intrinsics.areEqual(this.statusBarColor, hashedPaymentIntentNextActionArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Set getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getPublishableKey() {
                String str;
                Object obj = ((Result) this.decodedValue$delegate.getValue()).value;
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                Pair pair = (Pair) obj;
                return (pair == null || (str = (String) pair.first) == null) ? "UNKNOWN" : str;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                String str = this.stripeAccountId;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.enableLogging)) * 31, 31, this.includePaymentSheetNextHandlers), 31, this.hashedValue);
                Integer num = this.statusBarColor;
                return m + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("HashedPaymentIntentNextActionArgs(stripeAccountId=", this.stripeAccountId, ", enableLogging=", ", productUsage=", this.enableLogging);
                m1540m.append(this.productUsage);
                m1540m.append(", includePaymentSheetNextHandlers=");
                m1540m.append(this.includePaymentSheetNextHandlers);
                m1540m.append(", hashedValue=");
                m1540m.append(this.hashedValue);
                m1540m.append(", statusBarColor=");
                m1540m.append(this.statusBarColor);
                m1540m.append(")");
                return m1540m.toString();
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            /* renamed from: validate-d1pmJ48 */
            public final Object mo4059validated1pmJ48() {
                Object obj = ((Result) this.decodedValue$delegate.getValue()).value;
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                Result.Companion companion = Result.Companion;
                return Unit.INSTANCE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                LinkedHashSet linkedHashSet = this.productUsage;
                parcel.writeInt(linkedHashSet.size());
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    parcel.writeString((String) it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeString(this.hashedValue);
                Integer num = this.statusBarColor;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
            }
        }

        public final class IntentConfirmationArgs extends Args {
            public static final Parcelable.Creator<IntentConfirmationArgs> CREATOR = new AppInfo.Creator(7);
            public final ConfirmStripeIntentParams confirmStripeIntentParams;
            public final boolean enableLogging;
            public final boolean includePaymentSheetNextHandlers;
            public final LinkedHashSet productUsage;
            public final String publishableKey;
            public final Integer statusBarColor;
            public final String stripeAccountId;

            public IntentConfirmationArgs(String str, String str2, boolean z, LinkedHashSet linkedHashSet, boolean z2, ConfirmStripeIntentParams confirmStripeIntentParams, Integer num) {
                str.getClass();
                confirmStripeIntentParams.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.enableLogging = z;
                this.productUsage = linkedHashSet;
                this.includePaymentSheetNextHandlers = z2;
                this.confirmStripeIntentParams = confirmStripeIntentParams;
                this.statusBarColor = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IntentConfirmationArgs)) {
                    return false;
                }
                IntentConfirmationArgs intentConfirmationArgs = (IntentConfirmationArgs) obj;
                return Intrinsics.areEqual(this.publishableKey, intentConfirmationArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, intentConfirmationArgs.stripeAccountId) && this.enableLogging == intentConfirmationArgs.enableLogging && this.productUsage.equals(intentConfirmationArgs.productUsage) && this.includePaymentSheetNextHandlers == intentConfirmationArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.confirmStripeIntentParams, intentConfirmationArgs.confirmStripeIntentParams) && Intrinsics.areEqual(this.statusBarColor, intentConfirmationArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Set getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int hashCode2 = (this.confirmStripeIntentParams.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.enableLogging)) * 31, 31, this.includePaymentSheetNextHandlers)) * 31;
                Integer num = this.statusBarColor;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IntentConfirmationArgs(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", enableLogging=");
                m.append(this.enableLogging);
                m.append(", productUsage=");
                m.append(this.productUsage);
                m.append(", includePaymentSheetNextHandlers=");
                m.append(this.includePaymentSheetNextHandlers);
                m.append(", confirmStripeIntentParams=");
                m.append(this.confirmStripeIntentParams);
                m.append(", statusBarColor=");
                return NavAction$$ExternalSyntheticOutline0.m(m, this.statusBarColor, ")");
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            /* renamed from: validate-d1pmJ48 */
            public final Object mo4059validated1pmJ48() {
                Result.Companion companion = Result.Companion;
                return Unit.INSTANCE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                LinkedHashSet linkedHashSet = this.productUsage;
                parcel.writeInt(linkedHashSet.size());
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    parcel.writeString((String) it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeParcelable(this.confirmStripeIntentParams, i);
                Integer num = this.statusBarColor;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
            }
        }

        public final class PaymentIntentNextActionArgs extends Args {
            public static final Parcelable.Creator<PaymentIntentNextActionArgs> CREATOR = new AppInfo.Creator(8);
            public final boolean enableLogging;
            public final boolean includePaymentSheetNextHandlers;
            public final String paymentIntentClientSecret;
            public final LinkedHashSet productUsage;
            public final String publishableKey;
            public final Integer statusBarColor;
            public final String stripeAccountId;

            public PaymentIntentNextActionArgs(String str, String str2, boolean z, LinkedHashSet linkedHashSet, boolean z2, String str3, Integer num) {
                str.getClass();
                str3.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.enableLogging = z;
                this.productUsage = linkedHashSet;
                this.includePaymentSheetNextHandlers = z2;
                this.paymentIntentClientSecret = str3;
                this.statusBarColor = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaymentIntentNextActionArgs)) {
                    return false;
                }
                PaymentIntentNextActionArgs paymentIntentNextActionArgs = (PaymentIntentNextActionArgs) obj;
                return Intrinsics.areEqual(this.publishableKey, paymentIntentNextActionArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, paymentIntentNextActionArgs.stripeAccountId) && this.enableLogging == paymentIntentNextActionArgs.enableLogging && this.productUsage.equals(paymentIntentNextActionArgs.productUsage) && this.includePaymentSheetNextHandlers == paymentIntentNextActionArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.paymentIntentClientSecret, paymentIntentNextActionArgs.paymentIntentClientSecret) && Intrinsics.areEqual(this.statusBarColor, paymentIntentNextActionArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Set getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.enableLogging)) * 31, 31, this.includePaymentSheetNextHandlers), 31, this.paymentIntentClientSecret);
                Integer num = this.statusBarColor;
                return m + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentIntentNextActionArgs(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", enableLogging=");
                m.append(this.enableLogging);
                m.append(", productUsage=");
                m.append(this.productUsage);
                m.append(", includePaymentSheetNextHandlers=");
                NavAction$$ExternalSyntheticOutline0.m(m, this.includePaymentSheetNextHandlers, ", paymentIntentClientSecret=", this.paymentIntentClientSecret, ", statusBarColor=");
                return NavAction$$ExternalSyntheticOutline0.m(m, this.statusBarColor, ")");
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            /* renamed from: validate-d1pmJ48 */
            public final Object mo4059validated1pmJ48() {
                Result.Companion companion = Result.Companion;
                return Unit.INSTANCE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                LinkedHashSet linkedHashSet = this.productUsage;
                parcel.writeInt(linkedHashSet.size());
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    parcel.writeString((String) it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeString(this.paymentIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
            }
        }

        public final class SetupIntentNextActionArgs extends Args {
            public static final Parcelable.Creator<SetupIntentNextActionArgs> CREATOR = new AppInfo.Creator(9);
            public final boolean enableLogging;
            public final boolean includePaymentSheetNextHandlers;
            public final LinkedHashSet productUsage;
            public final String publishableKey;
            public final String setupIntentClientSecret;
            public final Integer statusBarColor;
            public final String stripeAccountId;

            public SetupIntentNextActionArgs(String str, String str2, boolean z, LinkedHashSet linkedHashSet, boolean z2, String str3, Integer num) {
                str.getClass();
                str3.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.enableLogging = z;
                this.productUsage = linkedHashSet;
                this.includePaymentSheetNextHandlers = z2;
                this.setupIntentClientSecret = str3;
                this.statusBarColor = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupIntentNextActionArgs)) {
                    return false;
                }
                SetupIntentNextActionArgs setupIntentNextActionArgs = (SetupIntentNextActionArgs) obj;
                return Intrinsics.areEqual(this.publishableKey, setupIntentNextActionArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, setupIntentNextActionArgs.stripeAccountId) && this.enableLogging == setupIntentNextActionArgs.enableLogging && this.productUsage.equals(setupIntentNextActionArgs.productUsage) && this.includePaymentSheetNextHandlers == setupIntentNextActionArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.setupIntentClientSecret, setupIntentNextActionArgs.setupIntentClientSecret) && Intrinsics.areEqual(this.statusBarColor, setupIntentNextActionArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Set getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.enableLogging)) * 31, 31, this.includePaymentSheetNextHandlers), 31, this.setupIntentClientSecret);
                Integer num = this.statusBarColor;
                return m + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SetupIntentNextActionArgs(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", enableLogging=");
                m.append(this.enableLogging);
                m.append(", productUsage=");
                m.append(this.productUsage);
                m.append(", includePaymentSheetNextHandlers=");
                NavAction$$ExternalSyntheticOutline0.m(m, this.includePaymentSheetNextHandlers, ", setupIntentClientSecret=", this.setupIntentClientSecret, ", statusBarColor=");
                return NavAction$$ExternalSyntheticOutline0.m(m, this.statusBarColor, ")");
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            /* renamed from: validate-d1pmJ48 */
            public final Object mo4059validated1pmJ48() {
                Result.Companion companion = Result.Companion;
                return Unit.INSTANCE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                LinkedHashSet linkedHashSet = this.productUsage;
                parcel.writeInt(linkedHashSet.size());
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    parcel.writeString((String) it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeString(this.setupIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
            }
        }

        public final class StripeIntentNextActionWithIntentArgs extends Args {
            public static final Parcelable.Creator<StripeIntentNextActionWithIntentArgs> CREATOR = new AppInfo.Creator(10);
            public final boolean enableLogging;
            public final boolean includePaymentSheetNextHandlers;
            public final LinkedHashSet productUsage;
            public final String publishableKey;
            public final Integer statusBarColor;
            public final String stripeAccountId;
            public final StripeIntent stripeIntent;

            public StripeIntentNextActionWithIntentArgs(String str, String str2, boolean z, LinkedHashSet linkedHashSet, boolean z2, StripeIntent stripeIntent, Integer num) {
                str.getClass();
                stripeIntent.getClass();
                this.publishableKey = str;
                this.stripeAccountId = str2;
                this.enableLogging = z;
                this.productUsage = linkedHashSet;
                this.includePaymentSheetNextHandlers = z2;
                this.stripeIntent = stripeIntent;
                this.statusBarColor = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StripeIntentNextActionWithIntentArgs)) {
                    return false;
                }
                StripeIntentNextActionWithIntentArgs stripeIntentNextActionWithIntentArgs = (StripeIntentNextActionWithIntentArgs) obj;
                return Intrinsics.areEqual(this.publishableKey, stripeIntentNextActionWithIntentArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, stripeIntentNextActionWithIntentArgs.stripeAccountId) && this.enableLogging == stripeIntentNextActionWithIntentArgs.enableLogging && this.productUsage.equals(stripeIntentNextActionWithIntentArgs.productUsage) && this.includePaymentSheetNextHandlers == stripeIntentNextActionWithIntentArgs.includePaymentSheetNextHandlers && Intrinsics.areEqual(this.stripeIntent, stripeIntentNextActionWithIntentArgs.stripeIntent) && Intrinsics.areEqual(this.statusBarColor, stripeIntentNextActionWithIntentArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Set getProductUsage() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final int hashCode() {
                int hashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int hashCode2 = (this.stripeIntent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.productUsage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.enableLogging)) * 31, 31, this.includePaymentSheetNextHandlers)) * 31;
                Integer num = this.statusBarColor;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StripeIntentNextActionWithIntentArgs(publishableKey=", this.publishableKey, ", stripeAccountId=", this.stripeAccountId, ", enableLogging=");
                m.append(this.enableLogging);
                m.append(", productUsage=");
                m.append(this.productUsage);
                m.append(", includePaymentSheetNextHandlers=");
                m.append(this.includePaymentSheetNextHandlers);
                m.append(", stripeIntent=");
                m.append(this.stripeIntent);
                m.append(", statusBarColor=");
                return NavAction$$ExternalSyntheticOutline0.m(m, this.statusBarColor, ")");
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.Args
            /* renamed from: validate-d1pmJ48 */
            public final Object mo4059validated1pmJ48() {
                Result.Companion companion = Result.Companion;
                return Unit.INSTANCE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                LinkedHashSet linkedHashSet = this.productUsage;
                parcel.writeInt(linkedHashSet.size());
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    parcel.writeString((String) it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeParcelable(this.stripeIntent, i);
                Integer num = this.statusBarColor;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
            }
        }

        public abstract boolean getEnableLogging();

        public abstract boolean getIncludePaymentSheetNextHandlers();

        public abstract Set getProductUsage();

        public abstract String getPublishableKey();

        public abstract Integer getStatusBarColor();

        public abstract String getStripeAccountId();

        /* renamed from: validate-d1pmJ48, reason: not valid java name */
        public abstract Object mo4059validated1pmJ48();
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Args args = (Args) obj;
        args.getClass();
        Intent putExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(BundleKt.bundleOf(new Pair("extra_args", args)));
        putExtras.getClass();
        return putExtras;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        InternalPaymentResult internalPaymentResult;
        return (intent == null || (internalPaymentResult = (InternalPaymentResult) intent.getParcelableExtra("extra_args")) == null) ? new InternalPaymentResult.Failed(new IllegalStateException("Failed to get PaymentSheetResult from Intent")) : internalPaymentResult;
    }
}
