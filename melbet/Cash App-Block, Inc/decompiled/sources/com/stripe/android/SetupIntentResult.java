package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.SparseArrayCompat;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.work.screens.WorkPayHistoryListScreen;
import com.squareup.cash.work.screens.WorkPayHomeScreen;
import com.squareup.cash.work.screens.WorkTaxFormDownloaderScreen;
import com.squareup.cash.work.screens.WorkTaxFormsListScreen;
import com.squareup.cash.work.webview.screens.WorkWebKey;
import com.squareup.cash.work.webview.screens.WorkWebScreen;
import com.squareup.scannerview.AspectRatio;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentRelayStarter$Args;
import com.stripe.android.challenge.confirmation.BridgeErrorParams;
import com.stripe.android.challenge.confirmation.BridgeSuccessParams;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityResult;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeArgs;
import com.stripe.android.challenge.passive.PassiveChallengeActivityContract;
import com.stripe.android.challenge.passive.PassiveChallengeActivityResult;
import com.stripe.android.challenge.passive.PassiveChallengeArgs;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PassiveCaptchaParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SetupIntentResult extends StripeIntentResult {
    public static final Parcelable.Creator<SetupIntentResult> CREATOR = new Creator(0);
    public final String failureMessage;
    public final SetupIntent intent;
    public final int outcomeFromFlow;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new SetupIntentResult(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return WorkPayHistoryListScreen.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return WorkPayHomeScreen.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new WorkTaxFormDownloaderScreen(parcel.readString(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    parcel.readInt();
                    return WorkTaxFormsListScreen.INSTANCE;
                case 5:
                    parcel.getClass();
                    return new WorkWebScreen(parcel.readString(), parcel.readInt() != 0, WorkWebKey.valueOf(parcel.readString()), parcel.readString());
                case 6:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    SparseArrayCompat sparseArrayCompat = AspectRatio.sCache;
                    return EntitySyncerKt.of(readInt, readInt2);
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return DefaultCardBrandFilter.INSTANCE;
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return DefaultCardFundingFilter.INSTANCE;
                case 9:
                    parcel.getClass();
                    return new GooglePayJsonFactory.BillingAddressParameters(parcel.readInt() != 0, GooglePayJsonFactory.BillingAddressParameters.Format.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 10:
                    parcel.getClass();
                    return new GooglePayJsonFactory.MerchantInfo(parcel.readString(), GooglePayJsonFactory.SoftwareInfo.CREATOR.createFromParcel(parcel));
                case 11:
                    parcel.getClass();
                    return new GooglePayJsonFactory.SoftwareInfo(GooglePayJsonFactory.SoftwareInfo.SoftwareId.valueOf(parcel.readString()));
                case 12:
                    parcel.getClass();
                    return new GooglePayJsonFactory.TransactionInfo(parcel.readString(), GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? GooglePayJsonFactory.TransactionInfo.CheckoutOption.valueOf(parcel.readString()) : null);
                case 13:
                    parcel.getClass();
                    return new PaymentAuthConfig.Stripe3ds2Config(parcel.readInt(), PaymentAuthConfig.Stripe3ds2UiCustomization.CREATOR.createFromParcel(parcel));
                case 14:
                    parcel.getClass();
                    return new PaymentAuthConfig.Stripe3ds2UiCustomization((StripeUiCustomization) parcel.readParcelable(PaymentAuthConfig.Stripe3ds2UiCustomization.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    return new PaymentConfiguration(parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new PaymentIntentResult(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
                case 17:
                    parcel.getClass();
                    Serializable readSerializable = parcel.readSerializable();
                    readSerializable.getClass();
                    return new PaymentRelayStarter$Args.ErrorArgs((StripeException) readSerializable, parcel.readInt());
                case 18:
                    parcel.getClass();
                    return new PaymentRelayStarter$Args.PaymentIntentArgs(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                case 19:
                    parcel.getClass();
                    return new PaymentRelayStarter$Args.SetupIntentArgs(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new BridgeErrorParams(parcel.readString(), parcel.readString(), parcel.readString());
                case 21:
                    parcel.getClass();
                    return new BridgeSuccessParams(parcel.readString());
                case 22:
                    parcel.getClass();
                    return new IntentConfirmationChallengeActivityResult.Canceled(parcel.readString());
                case 23:
                    parcel.getClass();
                    return new IntentConfirmationChallengeActivityResult.Failed(parcel.readString(), (Throwable) parcel.readSerializable());
                case 24:
                    parcel.getClass();
                    return new IntentConfirmationChallengeActivityResult.Success(parcel.readString());
                case 25:
                    parcel.getClass();
                    return new IntentConfirmationChallengeArgs(parcel.readString(), parcel.createStringArrayList(), (StripeIntent) parcel.readParcelable(IntentConfirmationChallengeArgs.class.getClassLoader()), parcel.readString());
                case 26:
                    parcel.getClass();
                    PassiveCaptchaParams createFromParcel = PassiveCaptchaParams.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    int readInt3 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt3);
                    for (int i = 0; i != readInt3; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new PassiveChallengeActivityContract.Args(createFromParcel, readString, linkedHashSet);
                case 27:
                    parcel.getClass();
                    return new PassiveChallengeActivityResult.Failed((Throwable) parcel.readSerializable());
                case 28:
                    parcel.getClass();
                    return new PassiveChallengeActivityResult.Success(parcel.readString());
                default:
                    parcel.getClass();
                    return new PassiveChallengeArgs(PassiveCaptchaParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new SetupIntentResult[i];
                case 1:
                    return new WorkPayHistoryListScreen[i];
                case 2:
                    return new WorkPayHomeScreen[i];
                case 3:
                    return new WorkTaxFormDownloaderScreen[i];
                case 4:
                    return new WorkTaxFormsListScreen[i];
                case 5:
                    return new WorkWebScreen[i];
                case 6:
                    return new AspectRatio[i];
                case 7:
                    return new DefaultCardBrandFilter[i];
                case 8:
                    return new DefaultCardFundingFilter[i];
                case 9:
                    return new GooglePayJsonFactory.BillingAddressParameters[i];
                case 10:
                    return new GooglePayJsonFactory.MerchantInfo[i];
                case 11:
                    return new GooglePayJsonFactory.SoftwareInfo[i];
                case 12:
                    return new GooglePayJsonFactory.TransactionInfo[i];
                case 13:
                    return new PaymentAuthConfig.Stripe3ds2Config[i];
                case 14:
                    return new PaymentAuthConfig.Stripe3ds2UiCustomization[i];
                case 15:
                    return new PaymentConfiguration[i];
                case 16:
                    return new PaymentIntentResult[i];
                case 17:
                    return new PaymentRelayStarter$Args.ErrorArgs[i];
                case 18:
                    return new PaymentRelayStarter$Args.PaymentIntentArgs[i];
                case 19:
                    return new PaymentRelayStarter$Args.SetupIntentArgs[i];
                case 20:
                    return new BridgeErrorParams[i];
                case 21:
                    return new BridgeSuccessParams[i];
                case 22:
                    return new IntentConfirmationChallengeActivityResult.Canceled[i];
                case 23:
                    return new IntentConfirmationChallengeActivityResult.Failed[i];
                case 24:
                    return new IntentConfirmationChallengeActivityResult.Success[i];
                case 25:
                    return new IntentConfirmationChallengeArgs[i];
                case 26:
                    return new PassiveChallengeActivityContract.Args[i];
                case 27:
                    return new PassiveChallengeActivityResult.Failed[i];
                case 28:
                    return new PassiveChallengeActivityResult.Success[i];
                default:
                    return new PassiveChallengeArgs[i];
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentResult(SetupIntent setupIntent, int i, String str) {
        super(i);
        setupIntent.getClass();
        this.intent = setupIntent;
        this.outcomeFromFlow = i;
        this.failureMessage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetupIntentResult)) {
            return false;
        }
        SetupIntentResult setupIntentResult = (SetupIntentResult) obj;
        return Intrinsics.areEqual(this.intent, setupIntentResult.intent) && this.outcomeFromFlow == setupIntentResult.outcomeFromFlow && Intrinsics.areEqual(this.failureMessage, setupIntentResult.failureMessage);
    }

    @Override // com.stripe.android.StripeIntentResult
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    @Override // com.stripe.android.StripeIntentResult
    public final StripeIntent getIntent() {
        return this.intent;
    }

    public final int hashCode() {
        int hashCode = ((this.intent.hashCode() * 31) + this.outcomeFromFlow) * 31;
        String str = this.failureMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetupIntentResult(intent=");
        sb.append(this.intent);
        sb.append(", outcomeFromFlow=");
        sb.append(this.outcomeFromFlow);
        sb.append(", failureMessage=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.failureMessage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.intent.writeToParcel(parcel, i);
        parcel.writeInt(this.outcomeFromFlow);
        parcel.writeString(this.failureMessage);
    }
}
