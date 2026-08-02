package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.Regex;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final class SetupIntent implements StripeIntent {
    public static final Parcelable.Creator<SetupIntent> CREATOR = new Source.Creator(25);
    public final boolean automaticPaymentMethodsEnabled;
    public final CancellationReason cancellationReason;
    public final String clientSecret;
    public final String countryCode;
    public final long created;
    public final String description;
    public final String id;
    public final boolean isLiveMode;
    public final Error lastSetupError;
    public final List linkFundingSources;
    public final StripeIntent.NextActionData nextActionData;
    public final PaymentMethod paymentMethod;
    public final String paymentMethodId;
    public final String paymentMethodOptionsJsonString;
    public final List paymentMethodTypes;
    public final StripeIntent.Status status;
    public final List unactivatedPaymentMethods;
    public final StripeIntent.Usage usage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CancellationReason {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ CancellationReason[] $VALUES;
        public static final KClasses$$Lambda$1 Companion;
        public final String code;

        static {
            CancellationReason[] cancellationReasonArr = {new CancellationReason("Duplicate", 0, "duplicate"), new CancellationReason("RequestedByCustomer", 1, "requested_by_customer"), new CancellationReason("Abandoned", 2, "abandoned")};
            $VALUES = cancellationReasonArr;
            $ENTRIES = new EnumEntriesList(cancellationReasonArr);
            Companion = new KClasses$$Lambda$1(13);
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

    public final class ClientSecret {
        public static final Pattern PATTERN = Pattern.compile("^seti_[^_]+_secret_[^_]+$");
        public final String setupIntentId;
        public final String value;

        public ClientSecret(String str) {
            Collection collection;
            str.getClass();
            this.value = str;
            List split = new Regex("_secret").split(0, str);
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
            this.setupIntentId = ((String[]) collection.toArray(new String[0]))[0];
            String str2 = this.value;
            str2.getClass();
            if (PATTERN.matcher(str2).matches()) {
                return;
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Invalid Setup Intent client secret: ", this.value));
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

    public final class Error implements StripeModel {
        public static final Parcelable.Creator<Error> CREATOR = new Source.Creator(26);
        public final String code;
        public final String declineCode;
        public final String docUrl;
        public final String message;
        public final String param;
        public final PaymentMethod paymentMethod;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1442type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ Type[] $VALUES;
            public static final POPMatchingFactory Companion;
            public final String code;

            static {
                Type[] typeArr = {new Type("ApiConnectionError", 0, "api_connection_error"), new Type("ApiError", 1, "api_error"), new Type("AuthenticationError", 2, "authentication_error"), new Type("CardError", 3, "card_error"), new Type("IdempotencyError", 4, "idempotency_error"), new Type("InvalidRequestError", 5, "invalid_request_error"), new Type("RateLimitError", 6, "rate_limit_error")};
                $VALUES = typeArr;
                $ENTRIES = new EnumEntriesList(typeArr);
                Companion = new POPMatchingFactory(14);
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

        public Error(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type2) {
            this.code = str;
            this.declineCode = str2;
            this.docUrl = str3;
            this.message = str4;
            this.param = str5;
            this.paymentMethod = paymentMethod;
            this.f1442type = type2;
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
            return Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.declineCode, error.declineCode) && Intrinsics.areEqual(this.docUrl, error.docUrl) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.param, error.param) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && this.f1442type == error.f1442type;
        }

        public final int hashCode() {
            String str = this.code;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.declineCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.docUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.param;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode6 = (hashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type2 = this.f1442type;
            return hashCode6 + (type2 != null ? type2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(code=", this.code, ", declineCode=", this.declineCode, ", docUrl=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.docUrl, ", message=", this.message, ", param=");
            m.append(this.param);
            m.append(", paymentMethod=");
            m.append(this.paymentMethod);
            m.append(", type=");
            m.append(this.f1442type);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
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
            Type type2 = this.f1442type;
            if (type2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type2.name());
            }
        }
    }

    public SetupIntent(String str, CancellationReason cancellationReason, long j, String str2, String str3, String str4, boolean z, PaymentMethod paymentMethod, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, Error error, ArrayList arrayList, ArrayList arrayList2, StripeIntent.NextActionData nextActionData, String str6, boolean z2) {
        list.getClass();
        arrayList.getClass();
        arrayList2.getClass();
        this.id = str;
        this.cancellationReason = cancellationReason;
        this.created = j;
        this.countryCode = str2;
        this.clientSecret = str3;
        this.description = str4;
        this.isLiveMode = z;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str5;
        this.paymentMethodTypes = list;
        this.status = status;
        this.usage = usage;
        this.lastSetupError = error;
        this.unactivatedPaymentMethods = arrayList;
        this.linkFundingSources = arrayList2;
        this.nextActionData = nextActionData;
        this.paymentMethodOptionsJsonString = str6;
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
        if (!(obj instanceof SetupIntent)) {
            return false;
        }
        SetupIntent setupIntent = (SetupIntent) obj;
        return Intrinsics.areEqual(this.id, setupIntent.id) && this.cancellationReason == setupIntent.cancellationReason && this.created == setupIntent.created && Intrinsics.areEqual(this.countryCode, setupIntent.countryCode) && Intrinsics.areEqual(this.clientSecret, setupIntent.clientSecret) && Intrinsics.areEqual(this.description, setupIntent.description) && this.isLiveMode == setupIntent.isLiveMode && Intrinsics.areEqual(this.paymentMethod, setupIntent.paymentMethod) && Intrinsics.areEqual(this.paymentMethodId, setupIntent.paymentMethodId) && Intrinsics.areEqual(this.paymentMethodTypes, setupIntent.paymentMethodTypes) && this.status == setupIntent.status && this.usage == setupIntent.usage && Intrinsics.areEqual(this.lastSetupError, setupIntent.lastSetupError) && Intrinsics.areEqual(this.unactivatedPaymentMethods, setupIntent.unactivatedPaymentMethods) && Intrinsics.areEqual(this.linkFundingSources, setupIntent.linkFundingSources) && Intrinsics.areEqual(this.nextActionData, setupIntent.nextActionData) && Intrinsics.areEqual(this.paymentMethodOptionsJsonString, setupIntent.paymentMethodOptionsJsonString) && this.automaticPaymentMethodsEnabled == setupIntent.automaticPaymentMethodsEnabled;
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
        if (nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits) {
            return StripeIntent.NextActionType.VerifyWithMicrodeposits;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        if (!(nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) && !(nextActionData instanceof StripeIntent.NextActionData.BlikAuthorize) && !(nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect) && !(nextActionData instanceof StripeIntent.NextActionData.SwishRedirect) && !(nextActionData instanceof StripeIntent.NextActionData.DisplayPayNowDetails) && !(nextActionData instanceof StripeIntent.NextActionData.DisplayPromptPayDetails) && nextActionData != null) {
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
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CancellationReason cancellationReason = this.cancellationReason;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31, 31, this.created);
        String str2 = this.countryCode;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientSecret;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isLiveMode);
        PaymentMethod paymentMethod = this.paymentMethod;
        int hashCode4 = (m2 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str5 = this.paymentMethodId;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.paymentMethodTypes);
        StripeIntent.Status status = this.status;
        int hashCode5 = (m3 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.usage;
        int hashCode6 = (hashCode5 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastSetupError;
        int m4 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (error == null ? 0 : error.hashCode())) * 31, 31, this.unactivatedPaymentMethods), 31, this.linkFundingSources);
        StripeIntent.NextActionData nextActionData = this.nextActionData;
        int hashCode7 = (m4 + (nextActionData == null ? 0 : nextActionData.hashCode())) * 31;
        String str6 = this.paymentMethodOptionsJsonString;
        return Boolean.hashCode(this.automaticPaymentMethodsEnabled) + ((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31);
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
        StringBuilder sb = new StringBuilder("SetupIntent(id=");
        sb.append(this.id);
        sb.append(", cancellationReason=");
        sb.append(this.cancellationReason);
        sb.append(", created=");
        Fragment$5$$ExternalSyntheticOutline0.m(this.created, ", countryCode=", this.countryCode, sb);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", clientSecret=", this.clientSecret, ", description=", this.description);
        sb.append(", isLiveMode=");
        sb.append(this.isLiveMode);
        sb.append(", paymentMethod=");
        sb.append(this.paymentMethod);
        sb.append(", paymentMethodId=");
        sb.append(this.paymentMethodId);
        sb.append(", paymentMethodTypes=");
        sb.append(this.paymentMethodTypes);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", usage=");
        sb.append(this.usage);
        sb.append(", lastSetupError=");
        sb.append(this.lastSetupError);
        sb.append(", unactivatedPaymentMethods=");
        sb.append(this.unactivatedPaymentMethods);
        sb.append(", linkFundingSources=");
        sb.append(this.linkFundingSources);
        sb.append(", nextActionData=");
        sb.append(this.nextActionData);
        sb.append(", paymentMethodOptionsJsonString=");
        sb.append(this.paymentMethodOptionsJsonString);
        sb.append(", automaticPaymentMethodsEnabled=");
        sb.append(this.automaticPaymentMethodsEnabled);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cancellationReason.name());
        }
        parcel.writeLong(this.created);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.clientSecret);
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
        parcel.writeStringList(this.paymentMethodTypes);
        StripeIntent.Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        StripeIntent.Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        Error error = this.lastSetupError;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.unactivatedPaymentMethods);
        parcel.writeStringList(this.linkFundingSources);
        parcel.writeParcelable(this.nextActionData, i);
        parcel.writeString(this.paymentMethodOptionsJsonString);
        parcel.writeInt(this.automaticPaymentMethodsEnabled ? 1 : 0);
    }
}
