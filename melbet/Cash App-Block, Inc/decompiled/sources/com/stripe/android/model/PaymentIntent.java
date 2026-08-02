package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.LinkAuthIntent;
import com.stripe.android.model.LinkConsumerIncentive;
import com.stripe.android.model.MobileFallbackWebviewParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.wallets.Wallet;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.Regex;
import net.idrnd.face.iad.capture.Plane;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final class PaymentIntent implements StripeIntent {
    public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator(0);
    public final Long amount;
    public final boolean automaticPaymentMethodsEnabled;
    public final long canceledAt;
    public final CancellationReason cancellationReason;
    public final CaptureMethod captureMethod;
    public final String clientSecret;
    public final ConfirmationMethod confirmationMethod;
    public final String countryCode;
    public final long created;
    public final String currency;
    public final String description;
    public final String id;
    public final boolean isLiveMode;
    public final Error lastPaymentError;
    public final List linkFundingSources;
    public final StripeIntent.NextActionData nextActionData;
    public final PaymentMethod paymentMethod;
    public final String paymentMethodId;
    public final String paymentMethodOptionsJsonString;
    public final List paymentMethodTypes;
    public final String receiptEmail;
    public final StripeIntent.Usage setupFutureUsage;
    public final Shipping shipping;
    public final StripeIntent.Status status;
    public final List unactivatedPaymentMethods;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CancellationReason {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ CancellationReason[] $VALUES;
        public static final KClasses$$Lambda$1 Companion;
        public final String code;

        static {
            CancellationReason[] cancellationReasonArr = {new CancellationReason("Duplicate", 0, "duplicate"), new CancellationReason("Fraudulent", 1, "fraudulent"), new CancellationReason("RequestedByCustomer", 2, "requested_by_customer"), new CancellationReason("Abandoned", 3, "abandoned"), new CancellationReason("FailedInvoice", 4, "failed_invoice"), new CancellationReason("VoidInvoice", 5, "void_invoice"), new CancellationReason("Automatic", 6, "automatic")};
            $VALUES = cancellationReasonArr;
            $ENTRIES = new EnumEntriesList(cancellationReasonArr);
            Companion = new KClasses$$Lambda$1(12);
        }

        public CancellationReason(String str, int i, String str2) {
            this.code = str2;
        }

        public static CancellationReason valueOf(String str) {
            return (CancellationReason) Enum.valueOf(CancellationReason.class, str);
        }

        public static CancellationReason[] values() {
            return (CancellationReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CaptureMethod {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ CaptureMethod[] $VALUES;
        public static final CaptureMethod Automatic;
        public static final POPMatchingFactory Companion;
        public final String code;

        static {
            CaptureMethod captureMethod = new CaptureMethod("Automatic", 0, "automatic");
            Automatic = captureMethod;
            CaptureMethod[] captureMethodArr = {captureMethod, new CaptureMethod("AutomaticAsync", 1, "automatic_async"), new CaptureMethod("Manual", 2, "manual")};
            $VALUES = captureMethodArr;
            $ENTRIES = new EnumEntriesList(captureMethodArr);
            Companion = new POPMatchingFactory(13);
        }

        public CaptureMethod(String str, int i, String str2) {
            this.code = str2;
        }

        public static CaptureMethod valueOf(String str) {
            return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
        }

        public static CaptureMethod[] values() {
            return (CaptureMethod[]) $VALUES.clone();
        }
    }

    public final class ClientSecret {
        public static final Pattern PATTERN = Pattern.compile("^pi_[^_]+_(scoped_)?secret_[^_]+$");
        public final String paymentIntentId;
        public final String value;

        public ClientSecret(String str) {
            Collection collection;
            str.getClass();
            this.value = str;
            List split = new Regex("_(scoped_)?secret").split(0, str);
            if (!split.isEmpty()) {
                ListIterator listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.INSTANCE;
            this.paymentIntentId = ((String[]) collection.toArray(new String[0]))[0];
            String str2 = this.value;
            str2.getClass();
            if (PATTERN.matcher(str2).matches()) {
                return;
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Invalid Payment Intent client secret: ", this.value));
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSecret) && Intrinsics.areEqual(this.value, ((ClientSecret) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientSecret(value=", this.value, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ConfirmationMethod {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ ConfirmationMethod[] $VALUES;
        public static final ConfirmationMethod Automatic;
        public static final Plane Companion;
        public final String code;

        static {
            ConfirmationMethod confirmationMethod = new ConfirmationMethod("Automatic", 0, "automatic");
            Automatic = confirmationMethod;
            ConfirmationMethod[] confirmationMethodArr = {confirmationMethod, new ConfirmationMethod("Manual", 1, "manual")};
            $VALUES = confirmationMethodArr;
            $ENTRIES = new EnumEntriesList(confirmationMethodArr);
            Companion = new Plane(13);
        }

        public ConfirmationMethod(String str, int i, String str2) {
            this.code = str2;
        }

        public static ConfirmationMethod valueOf(String str) {
            return (ConfirmationMethod) Enum.valueOf(ConfirmationMethod.class, str);
        }

        public static ConfirmationMethod[] values() {
            return (ConfirmationMethod[]) $VALUES.clone();
        }
    }

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Parcelable parcelable;
            Long l;
            boolean z;
            PaymentMethod.SepaDebit sepaDebit;
            PaymentMethod.Netbanking createFromParcel;
            PaymentMethod.Netbanking netbanking;
            PaymentMethod.USBankAccount createFromParcel2;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new PaymentIntent(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : CancellationReason.valueOf(parcel.readString()), CaptureMethod.valueOf(parcel.readString()), parcel.readString(), ConfirmationMethod.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Error.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Shipping.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(PaymentIntent.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                case 1:
                    parcel.getClass();
                    return new ConsumerSessionRefresh(ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkAuthIntent.CREATOR.createFromParcel(parcel));
                case 2:
                    parcel.getClass();
                    return new ConsumerSessionSignup(ConsumerSession.CREATOR.createFromParcel(parcel), parcel.readString());
                case 3:
                    parcel.getClass();
                    return new DisplayablePaymentDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                case 4:
                    parcel.getClass();
                    return new FinancialConnectionsSession(parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new LinkAuthIntent(LinkAuthIntent.Status.valueOf(parcel.readString()));
                case 6:
                    parcel.getClass();
                    return new LinkConsumerIncentive(LinkConsumerIncentive.IncentiveParams.CREATOR.createFromParcel(parcel), parcel.readString());
                case 7:
                    parcel.getClass();
                    return new LinkConsumerIncentive.IncentiveParams(parcel.readString());
                case 8:
                    parcel.getClass();
                    return new MandateDataParams((MandateDataParams$Type$Online) parcel.readParcelable(MandateDataParams.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new MandateDataParams$Type$Online(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 10:
                    parcel.getClass();
                    return new MobileFallbackWebviewParams(MobileFallbackWebviewParams.WebviewRequirementType.valueOf(parcel.readString()), parcel.readString());
                case 11:
                    parcel.getClass();
                    return new PassiveCaptchaParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Error.Type.valueOf(parcel.readString()));
                case 13:
                    parcel.getClass();
                    return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentMethod.AfterRedirectAction.None.INSTANCE;
                case 15:
                    parcel.getClass();
                    return new PaymentMethod.AfterRedirectAction.Poll(parcel.readLong());
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return PaymentMethod.AfterRedirectAction.Refresh.INSTANCE;
                case 17:
                    parcel.getClass();
                    return PaymentMethod.AllowRedisplay.valueOf(parcel.readString());
                case 18:
                    parcel.getClass();
                    return new PaymentMethod.AuBecsDebit(parcel.readString(), parcel.readString(), parcel.readString());
                case 19:
                    parcel.getClass();
                    return new PaymentMethod.BacsDebit(parcel.readString(), parcel.readString(), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new PaymentMethod.BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
                case 21:
                    parcel.getClass();
                    return new PaymentMethod.Card.CardArt.ArtImage(parcel.readString(), parcel.readString());
                case 22:
                    parcel.getClass();
                    return new PaymentMethod.Card.CardArt(parcel.readInt() == 0 ? null : PaymentMethod.Card.CardArt.ArtImage.CREATOR.createFromParcel(parcel), parcel.readString());
                case 23:
                    parcel.getClass();
                    return new PaymentMethod.Card.Checks(parcel.readString(), parcel.readString(), parcel.readString());
                case 24:
                    parcel.getClass();
                    return new PaymentMethod.Card(CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PaymentMethod.Card.Checks.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.Card.ThreeDSecureUsage.CREATOR.createFromParcel(parcel), (Wallet) parcel.readParcelable(PaymentMethod.Card.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentMethod.Card.Networks.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.Card.CardArt.CREATOR.createFromParcel(parcel));
                case 25:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new PaymentMethod.Card.Networks(parcel.readString(), linkedHashSet, parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    return new PaymentMethod.Card.ThreeDSecureUsage(parcel.readInt() != 0);
                case 27:
                    parcel.getClass();
                    return new PaymentMethod.CardPresent(parcel.readInt() != 0);
                case 28:
                    parcel.getClass();
                    String readString = parcel.readString();
                    Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    if (parcel.readInt() != 0) {
                        parcelable = null;
                        l = valueOf;
                        z = true;
                    } else {
                        parcelable = null;
                        l = valueOf;
                        z = false;
                    }
                    String readString2 = parcel.readString();
                    PaymentMethod.Type type2 = (PaymentMethod.Type) (parcel.readInt() == 0 ? parcelable : PaymentMethod.Type.CREATOR.createFromParcel(parcel));
                    PaymentMethod.BillingDetails billingDetails = (PaymentMethod.BillingDetails) (parcel.readInt() == 0 ? parcelable : PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel));
                    Parcelable parcelable2 = parcelable;
                    String readString3 = parcel.readString();
                    PaymentMethod.Card card = (PaymentMethod.Card) (parcel.readInt() == 0 ? parcelable2 : PaymentMethod.Card.CREATOR.createFromParcel(parcel));
                    PaymentMethod.CardPresent cardPresent = (PaymentMethod.CardPresent) (parcel.readInt() == 0 ? parcelable2 : PaymentMethod.CardPresent.CREATOR.createFromParcel(parcel));
                    PaymentMethod.Fpx fpx = (PaymentMethod.Fpx) (parcel.readInt() == 0 ? parcelable2 : PaymentMethod.Fpx.CREATOR.createFromParcel(parcel));
                    PaymentMethod.Ideal ideal = (PaymentMethod.Ideal) (parcel.readInt() == 0 ? parcelable2 : PaymentMethod.Ideal.CREATOR.createFromParcel(parcel));
                    PaymentMethod.SepaDebit sepaDebit2 = (PaymentMethod.SepaDebit) (parcel.readInt() == 0 ? parcelable2 : PaymentMethod.SepaDebit.CREATOR.createFromParcel(parcel));
                    PaymentMethod.AuBecsDebit auBecsDebit = (PaymentMethod.AuBecsDebit) (parcel.readInt() == 0 ? parcelable2 : PaymentMethod.AuBecsDebit.CREATOR.createFromParcel(parcel));
                    if (parcel.readInt() != 0) {
                        parcelable2 = PaymentMethod.BacsDebit.CREATOR.createFromParcel(parcel);
                    }
                    PaymentMethod.BacsDebit bacsDebit = (PaymentMethod.BacsDebit) parcelable2;
                    if (parcel.readInt() == 0) {
                        sepaDebit = sepaDebit2;
                        createFromParcel = null;
                    } else {
                        sepaDebit = sepaDebit2;
                        createFromParcel = PaymentMethod.Netbanking.CREATOR.createFromParcel(parcel);
                    }
                    PaymentMethod.Netbanking netbanking2 = createFromParcel;
                    if (parcel.readInt() == 0) {
                        netbanking = netbanking2;
                        createFromParcel2 = null;
                    } else {
                        netbanking = netbanking2;
                        createFromParcel2 = PaymentMethod.USBankAccount.CREATOR.createFromParcel(parcel);
                    }
                    PaymentMethod.USBankAccount uSBankAccount = createFromParcel2;
                    if (parcel.readParcelable(PaymentMethod.class.getClassLoader()) == null) {
                        return new PaymentMethod(readString, l, z, readString2, type2, billingDetails, readString3, card, cardPresent, fpx, ideal, sepaDebit, auBecsDebit, bacsDebit, netbanking, uSBankAccount, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.AllowRedisplay.CREATOR.createFromParcel(parcel));
                    }
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                default:
                    parcel.getClass();
                    return new PaymentMethod.Fpx(parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new PaymentIntent[i];
                case 1:
                    return new ConsumerSessionRefresh[i];
                case 2:
                    return new ConsumerSessionSignup[i];
                case 3:
                    return new DisplayablePaymentDetails[i];
                case 4:
                    return new FinancialConnectionsSession[i];
                case 5:
                    return new LinkAuthIntent[i];
                case 6:
                    return new LinkConsumerIncentive[i];
                case 7:
                    return new LinkConsumerIncentive.IncentiveParams[i];
                case 8:
                    return new MandateDataParams[i];
                case 9:
                    return new MandateDataParams$Type$Online[i];
                case 10:
                    return new MobileFallbackWebviewParams[i];
                case 11:
                    return new PassiveCaptchaParams[i];
                case 12:
                    return new Error[i];
                case 13:
                    return new Shipping[i];
                case 14:
                    return new PaymentMethod.AfterRedirectAction.None[i];
                case 15:
                    return new PaymentMethod.AfterRedirectAction.Poll[i];
                case 16:
                    return new PaymentMethod.AfterRedirectAction.Refresh[i];
                case 17:
                    return new PaymentMethod.AllowRedisplay[i];
                case 18:
                    return new PaymentMethod.AuBecsDebit[i];
                case 19:
                    return new PaymentMethod.BacsDebit[i];
                case 20:
                    return new PaymentMethod.BillingDetails[i];
                case 21:
                    return new PaymentMethod.Card.CardArt.ArtImage[i];
                case 22:
                    return new PaymentMethod.Card.CardArt[i];
                case 23:
                    return new PaymentMethod.Card.Checks[i];
                case 24:
                    return new PaymentMethod.Card[i];
                case 25:
                    return new PaymentMethod.Card.Networks[i];
                case 26:
                    return new PaymentMethod.Card.ThreeDSecureUsage[i];
                case 27:
                    return new PaymentMethod.CardPresent[i];
                case 28:
                    return new PaymentMethod[i];
                default:
                    return new PaymentMethod.Fpx[i];
            }
        }
    }

    public final class Error implements StripeModel {
        public static final Parcelable.Creator<Error> CREATOR = new Creator(12);
        public final String charge;
        public final String code;
        public final String declineCode;
        public final String docUrl;
        public final String message;
        public final String param;
        public final PaymentMethod paymentMethod;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1439type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ Type[] $VALUES;
            public static final LinkResolverDef Companion;
            public final String code;

            static {
                Type[] typeArr = {new Type("ApiConnectionError", 0, "api_connection_error"), new Type("ApiError", 1, "api_error"), new Type("AuthenticationError", 2, "authentication_error"), new Type("CardError", 3, "card_error"), new Type("IdempotencyError", 4, "idempotency_error"), new Type("InvalidRequestError", 5, "invalid_request_error"), new Type("RateLimitError", 6, "rate_limit_error")};
                $VALUES = typeArr;
                $ENTRIES = new EnumEntriesList(typeArr);
                Companion = new LinkResolverDef(13);
            }

            public Type(String str, int i, String str2) {
                this.code = str2;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod, Type type2) {
            this.charge = str;
            this.code = str2;
            this.declineCode = str3;
            this.docUrl = str4;
            this.message = str5;
            this.param = str6;
            this.paymentMethod = paymentMethod;
            this.f1439type = type2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.charge, error.charge) && Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.declineCode, error.declineCode) && Intrinsics.areEqual(this.docUrl, error.docUrl) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.param, error.param) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && this.f1439type == error.f1439type;
        }

        public final int hashCode() {
            String str = this.charge;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.declineCode;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.docUrl;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.message;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.param;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode7 = (hashCode6 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type2 = this.f1439type;
            return hashCode7 + (type2 != null ? type2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(charge=", this.charge, ", code=", this.code, ", declineCode=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.declineCode, ", docUrl=", this.docUrl, ", message=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.message, ", param=", this.param, ", paymentMethod=");
            m.append(this.paymentMethod);
            m.append(", type=");
            m.append(this.f1439type);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.charge);
            parcel.writeString(this.code);
            parcel.writeString(this.declineCode);
            parcel.writeString(this.docUrl);
            parcel.writeString(this.message);
            parcel.writeString(this.param);
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                paymentMethod.writeToParcel(parcel, i);
            }
            Type type2 = this.f1439type;
            if (type2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type2.name());
            }
        }
    }

    public final class Shipping implements StripeModel {
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator(13);
        public final Address address;
        public final String carrier;
        public final String name;
        public final String phone;
        public final String trackingNumber;

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            address.getClass();
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) obj;
            return Intrinsics.areEqual(this.address, shipping.address) && Intrinsics.areEqual(this.carrier, shipping.carrier) && Intrinsics.areEqual(this.name, shipping.name) && Intrinsics.areEqual(this.phone, shipping.phone) && Intrinsics.areEqual(this.trackingNumber, shipping.trackingNumber);
        }

        public final int hashCode() {
            int hashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Shipping(address=");
            sb.append(this.address);
            sb.append(", carrier=");
            sb.append(this.carrier);
            sb.append(", name=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.name, ", phone=", this.phone, ", trackingNumber=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.trackingNumber, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.address.writeToParcel(parcel, i);
            parcel.writeString(this.carrier);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }
    }

    public PaymentIntent(String str, List list, Long l, long j, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, String str3, long j2, String str4, String str5, boolean z, PaymentMethod paymentMethod, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List list2, List list3, StripeIntent.NextActionData nextActionData, String str8, boolean z2) {
        list.getClass();
        captureMethod.getClass();
        confirmationMethod.getClass();
        list2.getClass();
        list3.getClass();
        this.id = str;
        this.paymentMethodTypes = list;
        this.amount = l;
        this.canceledAt = j;
        this.cancellationReason = cancellationReason;
        this.captureMethod = captureMethod;
        this.clientSecret = str2;
        this.confirmationMethod = confirmationMethod;
        this.countryCode = str3;
        this.created = j2;
        this.currency = str4;
        this.description = str5;
        this.isLiveMode = z;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str6;
        this.receiptEmail = str7;
        this.status = status;
        this.setupFutureUsage = usage;
        this.lastPaymentError = error;
        this.shipping = shipping;
        this.unactivatedPaymentMethods = list2;
        this.linkFundingSources = list3;
        this.nextActionData = nextActionData;
        this.paymentMethodOptionsJsonString = str8;
        this.automaticPaymentMethodsEnabled = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentIntent)) {
            return false;
        }
        PaymentIntent paymentIntent = (PaymentIntent) obj;
        return Intrinsics.areEqual(this.id, paymentIntent.id) && Intrinsics.areEqual(this.paymentMethodTypes, paymentIntent.paymentMethodTypes) && Intrinsics.areEqual(this.amount, paymentIntent.amount) && this.canceledAt == paymentIntent.canceledAt && this.cancellationReason == paymentIntent.cancellationReason && this.captureMethod == paymentIntent.captureMethod && Intrinsics.areEqual(this.clientSecret, paymentIntent.clientSecret) && this.confirmationMethod == paymentIntent.confirmationMethod && Intrinsics.areEqual(this.countryCode, paymentIntent.countryCode) && this.created == paymentIntent.created && Intrinsics.areEqual(this.currency, paymentIntent.currency) && Intrinsics.areEqual(this.description, paymentIntent.description) && this.isLiveMode == paymentIntent.isLiveMode && Intrinsics.areEqual(this.paymentMethod, paymentIntent.paymentMethod) && Intrinsics.areEqual(this.paymentMethodId, paymentIntent.paymentMethodId) && Intrinsics.areEqual(this.receiptEmail, paymentIntent.receiptEmail) && this.status == paymentIntent.status && this.setupFutureUsage == paymentIntent.setupFutureUsage && Intrinsics.areEqual(this.lastPaymentError, paymentIntent.lastPaymentError) && Intrinsics.areEqual(this.shipping, paymentIntent.shipping) && Intrinsics.areEqual(this.unactivatedPaymentMethods, paymentIntent.unactivatedPaymentMethods) && Intrinsics.areEqual(this.linkFundingSources, paymentIntent.linkFundingSources) && Intrinsics.areEqual(this.nextActionData, paymentIntent.nextActionData) && Intrinsics.areEqual(this.paymentMethodOptionsJsonString, paymentIntent.paymentMethodOptionsJsonString) && this.automaticPaymentMethodsEnabled == paymentIntent.automaticPaymentMethodsEnabled;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final String getId() {
        return this.id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final StripeIntent.NextActionType getNextActionType() {
        StripeIntent.NextActionData nextActionData = this.nextActionData;
        if (nextActionData instanceof StripeIntent.NextActionData.SdkData) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayBoletoDetails) {
            return StripeIntent.NextActionType.DisplayBoletoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayKonbiniDetails) {
            return StripeIntent.NextActionType.DisplayKonbiniDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayMultibancoDetails) {
            return StripeIntent.NextActionType.DisplayMultibancoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayPayNowDetails) {
            return StripeIntent.NextActionType.DisplayPayNowDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayPromptPayDetails) {
            return StripeIntent.NextActionType.DisplayPromptPayDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits) {
            return StripeIntent.NextActionType.VerifyWithMicrodeposits;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.BlikAuthorize) {
            return StripeIntent.NextActionType.BlikAuthorize;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.SwishRedirect) {
            return StripeIntent.NextActionType.SwishRedirect;
        }
        if (!(nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) && !(nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect) && nextActionData != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
        return null;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final StripeIntent.Status getStatus() {
        return this.status;
    }

    public final int hashCode() {
        String str = this.id;
        int m = Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.paymentMethodTypes);
        Long l = this.amount;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.canceledAt);
        CancellationReason cancellationReason = this.cancellationReason;
        int hashCode = (this.captureMethod.hashCode() + ((m2 + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31)) * 31;
        String str2 = this.clientSecret;
        int hashCode2 = (this.confirmationMethod.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.countryCode;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.created);
        String str4 = this.currency;
        int hashCode3 = (m3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.isLiveMode);
        PaymentMethod paymentMethod = this.paymentMethod;
        int hashCode4 = (m4 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str6 = this.paymentMethodId;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.receiptEmail;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent.Status status = this.status;
        int hashCode7 = (hashCode6 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.setupFutureUsage;
        int hashCode8 = (hashCode7 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastPaymentError;
        int hashCode9 = (hashCode8 + (error == null ? 0 : error.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int m5 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (shipping == null ? 0 : shipping.hashCode())) * 31, 31, this.unactivatedPaymentMethods), 31, this.linkFundingSources);
        StripeIntent.NextActionData nextActionData = this.nextActionData;
        int hashCode10 = (m5 + (nextActionData == null ? 0 : nextActionData.hashCode())) * 31;
        String str8 = this.paymentMethodOptionsJsonString;
        return Boolean.hashCode(this.automaticPaymentMethodsEnabled) + ((hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    @Override // com.stripe.android.model.StripeIntent
    public final boolean isLiveMode() {
        return this.isLiveMode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public final boolean requiresAction() {
        return this.status == StripeIntent.Status.RequiresAction;
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PaymentIntent(id=", this.id, ", paymentMethodTypes=", ", amount=", this.paymentMethodTypes);
        m.append(this.amount);
        m.append(", canceledAt=");
        m.append(this.canceledAt);
        m.append(", cancellationReason=");
        m.append(this.cancellationReason);
        m.append(", captureMethod=");
        m.append(this.captureMethod);
        m.append(", clientSecret=");
        m.append(this.clientSecret);
        m.append(", confirmationMethod=");
        m.append(this.confirmationMethod);
        m.append(", countryCode=");
        m.append(this.countryCode);
        m.append(", created=");
        Fragment$5$$ExternalSyntheticOutline0.m(this.created, ", currency=", this.currency, m);
        m.append(", description=");
        m.append(this.description);
        m.append(", isLiveMode=");
        m.append(this.isLiveMode);
        m.append(", paymentMethod=");
        m.append(this.paymentMethod);
        m.append(", paymentMethodId=");
        m.append(this.paymentMethodId);
        m.append(", receiptEmail=");
        m.append(this.receiptEmail);
        m.append(", status=");
        m.append(this.status);
        m.append(", setupFutureUsage=");
        m.append(this.setupFutureUsage);
        m.append(", lastPaymentError=");
        m.append(this.lastPaymentError);
        m.append(", shipping=");
        m.append(this.shipping);
        m.append(", unactivatedPaymentMethods=");
        m.append(this.unactivatedPaymentMethods);
        m.append(", linkFundingSources=");
        m.append(this.linkFundingSources);
        m.append(", nextActionData=");
        m.append(this.nextActionData);
        m.append(", paymentMethodOptionsJsonString=");
        m.append(this.paymentMethodOptionsJsonString);
        m.append(", automaticPaymentMethodsEnabled=");
        m.append(this.automaticPaymentMethodsEnabled);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeStringList(this.paymentMethodTypes);
        Long l = this.amount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeLong(this.canceledAt);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cancellationReason.name());
        }
        parcel.writeString(this.captureMethod.name());
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.confirmationMethod.name());
        parcel.writeString(this.countryCode);
        parcel.writeLong(this.created);
        parcel.writeString(this.currency);
        parcel.writeString(this.description);
        parcel.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethod.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentMethodId);
        parcel.writeString(this.receiptEmail);
        StripeIntent.Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        Error error = this.lastPaymentError;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, i);
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shipping.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.unactivatedPaymentMethods);
        parcel.writeStringList(this.linkFundingSources);
        parcel.writeParcelable(this.nextActionData, i);
        parcel.writeString(this.paymentMethodOptionsJsonString);
        parcel.writeInt(this.automaticPaymentMethodsEnabled ? 1 : 0);
    }
}
