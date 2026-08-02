package com.stripe.android.stripe3ds2.init;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeLabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeTextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.transaction.AcsData;
import com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeParameters;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import java.security.interfaces.ECPublicKey;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AppInfo implements Parcelable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new Creator(0);
    public final String sdkAppId;
    public final int version;

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
                    return new AppInfo(parcel.readString(), parcel.readInt());
                case 1:
                    parcel.getClass();
                    return new CollectBankAccountResultInternal.Failed((Throwable) parcel.readSerializable());
                case 2:
                    SdkTransactionId sdkTransactionId = (SdkTransactionId) NavAction$$ExternalSyntheticOutline0.m(parcel, Stripe3ds2TransactionContract.Args.class);
                    PaymentAuthConfig.Stripe3ds2Config createFromParcel = PaymentAuthConfig.Stripe3ds2Config.CREATOR.createFromParcel(parcel);
                    StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Stripe3ds2TransactionContract.Args.class.getClassLoader());
                    StripeIntent.NextActionData.SdkData.Use3DS2 createFromParcel2 = StripeIntent.NextActionData.SdkData.Use3DS2.CREATOR.createFromParcel(parcel);
                    ApiRequest.Options options = (ApiRequest.Options) parcel.readParcelable(Stripe3ds2TransactionContract.Args.class.getClassLoader());
                    boolean z = parcel.readInt() != 0;
                    Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new Stripe3ds2TransactionContract.Args(sdkTransactionId, createFromParcel, stripeIntent, createFromParcel2, options, z, valueOf, readString, linkedHashSet);
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return InternalPaymentResult.Canceled.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new InternalPaymentResult.Completed((StripeIntent) parcel.readParcelable(InternalPaymentResult.Completed.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new InternalPaymentResult.Failed((Throwable) parcel.readSerializable());
                case 6:
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    boolean z2 = parcel.readInt() != 0;
                    int readInt2 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        linkedHashSet2.add(parcel.readString());
                    }
                    return new PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs(readString2, z2, linkedHashSet2, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 7:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    boolean z3 = parcel.readInt() != 0;
                    int readInt3 = parcel.readInt();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        linkedHashSet3.add(parcel.readString());
                    }
                    return new PaymentLauncherContract.Args.IntentConfirmationArgs(readString3, readString4, z3, linkedHashSet3, parcel.readInt() != 0, (ConfirmStripeIntentParams) parcel.readParcelable(PaymentLauncherContract.Args.IntentConfirmationArgs.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 8:
                    parcel.getClass();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    boolean z4 = parcel.readInt() != 0;
                    int readInt4 = parcel.readInt();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt4);
                    for (int i4 = 0; i4 != readInt4; i4++) {
                        linkedHashSet4.add(parcel.readString());
                    }
                    return new PaymentLauncherContract.Args.PaymentIntentNextActionArgs(readString5, readString6, z4, linkedHashSet4, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 9:
                    parcel.getClass();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    boolean z5 = parcel.readInt() != 0;
                    int readInt5 = parcel.readInt();
                    LinkedHashSet linkedHashSet5 = new LinkedHashSet(readInt5);
                    for (int i5 = 0; i5 != readInt5; i5++) {
                        linkedHashSet5.add(parcel.readString());
                    }
                    return new PaymentLauncherContract.Args.SetupIntentNextActionArgs(readString7, readString8, z5, linkedHashSet5, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 10:
                    parcel.getClass();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    boolean z6 = parcel.readInt() != 0;
                    int readInt6 = parcel.readInt();
                    LinkedHashSet linkedHashSet6 = new LinkedHashSet(readInt6);
                    for (int i6 = 0; i6 != readInt6; i6++) {
                        linkedHashSet6.add(parcel.readString());
                    }
                    return new PaymentLauncherContract.Args.StripeIntentNextActionWithIntentArgs(readString9, readString10, z6, linkedHashSet6, parcel.readInt() != 0, (StripeIntent) parcel.readParcelable(PaymentLauncherContract.Args.StripeIntentNextActionWithIntentArgs.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 11:
                    parcel.getClass();
                    return new Warning(parcel.readString(), parcel.readString(), Warning.Severity.valueOf(parcel.readString()));
                case 12:
                    StripeButtonCustomization stripeButtonCustomization = new StripeButtonCustomization(parcel);
                    stripeButtonCustomization.mBackgroundColor = parcel.readString();
                    stripeButtonCustomization.mCornerRadius = parcel.readInt();
                    return stripeButtonCustomization;
                case 13:
                    StripeLabelCustomization stripeLabelCustomization = new StripeLabelCustomization(parcel);
                    stripeLabelCustomization.mHeadingTextColor = parcel.readString();
                    stripeLabelCustomization.mHeadingTextFontName = parcel.readString();
                    stripeLabelCustomization.mHeadingTextFontSize = parcel.readInt();
                    return stripeLabelCustomization;
                case 14:
                    StripeTextBoxCustomization stripeTextBoxCustomization = new StripeTextBoxCustomization(parcel);
                    stripeTextBoxCustomization.mBorderWidth = parcel.readInt();
                    stripeTextBoxCustomization.mBorderColor = parcel.readString();
                    stripeTextBoxCustomization.mCornerRadius = parcel.readInt();
                    stripeTextBoxCustomization.mHintTextColor = parcel.readString();
                    return stripeTextBoxCustomization;
                case 15:
                    StripeToolbarCustomization stripeToolbarCustomization = new StripeToolbarCustomization(parcel);
                    stripeToolbarCustomization.mBackgroundColor = parcel.readString();
                    stripeToolbarCustomization.mStatusBarColor = parcel.readString();
                    stripeToolbarCustomization.mHeaderText = parcel.readString();
                    stripeToolbarCustomization.mButtonText = parcel.readString();
                    return stripeToolbarCustomization;
                case 16:
                    return new StripeUiCustomization(parcel);
                case 17:
                    parcel.getClass();
                    return new AcsData(parcel.readString(), (ECPublicKey) parcel.readSerializable(), (ECPublicKey) parcel.readSerializable());
                case 18:
                    parcel.getClass();
                    return new AuthenticationRequestParameters(parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return ChallengeAction.Cancel.INSTANCE;
                case 20:
                    parcel.getClass();
                    return new ChallengeAction.HtmlForm(parcel.readString());
                case 21:
                    parcel.getClass();
                    return new ChallengeAction.NativeForm(parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
                case 22:
                    parcel.getClass();
                    return new ChallengeAction.Oob(parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return ChallengeAction.Resend.INSTANCE;
                case 24:
                    parcel.getClass();
                    return new ChallengeParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 25:
                    parcel.getClass();
                    return new ChallengeRequestExecutor$Config((DefaultMessageTransformer) parcel.readSerializable(), parcel.readString(), ChallengeRequestData.CREATOR.createFromParcel(parcel), parcel.readString(), ChallengeRequestExecutor$Config.Keys.CREATOR.createFromParcel(parcel));
                case 26:
                    parcel.getClass();
                    return new ChallengeRequestExecutor$Config.Keys(parcel.createByteArray(), parcel.createByteArray());
                case 27:
                    parcel.getClass();
                    return new ChallengeRequestResult.ProtocolError(ErrorData.CREATOR.createFromParcel(parcel));
                case 28:
                    parcel.getClass();
                    return new ChallengeRequestResult.RuntimeError((Throwable) parcel.readSerializable());
                default:
                    parcel.getClass();
                    return new ChallengeRequestResult.Success(ChallengeRequestData.CREATOR.createFromParcel(parcel), ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestExecutor$Config.CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new AppInfo[i];
                case 1:
                    return new CollectBankAccountResultInternal.Failed[i];
                case 2:
                    return new Stripe3ds2TransactionContract.Args[i];
                case 3:
                    return new InternalPaymentResult.Canceled[i];
                case 4:
                    return new InternalPaymentResult.Completed[i];
                case 5:
                    return new InternalPaymentResult.Failed[i];
                case 6:
                    return new PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs[i];
                case 7:
                    return new PaymentLauncherContract.Args.IntentConfirmationArgs[i];
                case 8:
                    return new PaymentLauncherContract.Args.PaymentIntentNextActionArgs[i];
                case 9:
                    return new PaymentLauncherContract.Args.SetupIntentNextActionArgs[i];
                case 10:
                    return new PaymentLauncherContract.Args.StripeIntentNextActionWithIntentArgs[i];
                case 11:
                    return new Warning[i];
                case 12:
                    return new StripeButtonCustomization[i];
                case 13:
                    return new StripeLabelCustomization[i];
                case 14:
                    return new StripeTextBoxCustomization[i];
                case 15:
                    return new StripeToolbarCustomization[i];
                case 16:
                    return new StripeUiCustomization[i];
                case 17:
                    return new AcsData[i];
                case 18:
                    return new AuthenticationRequestParameters[i];
                case 19:
                    return new ChallengeAction.Cancel[i];
                case 20:
                    return new ChallengeAction.HtmlForm[i];
                case 21:
                    return new ChallengeAction.NativeForm[i];
                case 22:
                    return new ChallengeAction.Oob[i];
                case 23:
                    return new ChallengeAction.Resend[i];
                case 24:
                    return new ChallengeParameters[i];
                case 25:
                    return new ChallengeRequestExecutor$Config[i];
                case 26:
                    return new ChallengeRequestExecutor$Config.Keys[i];
                case 27:
                    return new ChallengeRequestResult.ProtocolError[i];
                case 28:
                    return new ChallengeRequestResult.RuntimeError[i];
                default:
                    return new ChallengeRequestResult.Success[i];
            }
        }
    }

    public AppInfo(String str, int i) {
        str.getClass();
        this.sdkAppId = str;
        this.version = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return Intrinsics.areEqual(this.sdkAppId, appInfo.sdkAppId) && this.version == appInfo.version;
    }

    public final int hashCode() {
        return Integer.hashCode(this.version) + (this.sdkAppId.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("AppInfo(sdkAppId=", this.version, this.sdkAppId, ", version=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sdkAppId);
        parcel.writeInt(this.version);
    }
}
