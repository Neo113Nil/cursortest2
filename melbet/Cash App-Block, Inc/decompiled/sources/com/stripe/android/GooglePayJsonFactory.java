package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.appsflyer.AppsFlyerProperties;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.uicore.format.CurrencyFormatter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GooglePayJsonFactory {
    public static final List ALLOWED_AUTH_METHODS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"PAN_ONLY", "CRYPTOGRAM_3DS"});
    public static final List DEFAULT_CARD_NETWORKS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"AMEX", "DISCOVER", "MASTERCARD", "VISA"});
    public static final Map networkStringToCardBrandMap = MapsKt__MapsKt.mapOf(new Pair("AMEX", CardBrand.AmericanExpress), new Pair("DISCOVER", CardBrand.Discover), new Pair("MASTERCARD", CardBrand.MasterCard), new Pair("VISA", CardBrand.Visa), new Pair("JCB", CardBrand.JCB));
    public final List additionalEnabledNetworks;
    public final DefaultCardBrandFilter cardBrandFilter;
    public final DefaultCardFundingFilter cardFundingFilter;
    public final GooglePayConfig googlePayConfig;
    public final boolean isJcbEnabled;

    public final class BillingAddressParameters implements Parcelable {
        public static final Parcelable.Creator<BillingAddressParameters> CREATOR = new SetupIntentResult.Creator(9);

        /* renamed from: format, reason: collision with root package name */
        public final Format f1425format;
        public final boolean isPhoneNumberRequired;
        public final boolean isRequired;

        public enum Format {
            Min("MIN"),
            Full("FULL");

            public final String code;

            Format(String str) {
                this.code = str;
            }
        }

        public BillingAddressParameters(boolean z, Format format2, boolean z2) {
            format2.getClass();
            this.isRequired = z;
            this.f1425format = format2;
            this.isPhoneNumberRequired = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingAddressParameters)) {
                return false;
            }
            BillingAddressParameters billingAddressParameters = (BillingAddressParameters) obj;
            return this.isRequired == billingAddressParameters.isRequired && this.f1425format == billingAddressParameters.f1425format && this.isPhoneNumberRequired == billingAddressParameters.isPhoneNumberRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isPhoneNumberRequired) + ((this.f1425format.hashCode() + (Boolean.hashCode(this.isRequired) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BillingAddressParameters(isRequired=");
            sb.append(this.isRequired);
            sb.append(", format=");
            sb.append(this.f1425format);
            sb.append(", isPhoneNumberRequired=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isPhoneNumberRequired, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isRequired ? 1 : 0);
            parcel.writeString(this.f1425format.name());
            parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }
    }

    public final class MerchantInfo implements Parcelable {
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new SetupIntentResult.Creator(10);
        public final String merchantName;
        public final SoftwareInfo softwareInfo;

        public MerchantInfo(String str, SoftwareInfo softwareInfo) {
            softwareInfo.getClass();
            this.merchantName = str;
            this.softwareInfo = softwareInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchantInfo)) {
                return false;
            }
            MerchantInfo merchantInfo = (MerchantInfo) obj;
            return Intrinsics.areEqual(this.merchantName, merchantInfo.merchantName) && Intrinsics.areEqual(this.softwareInfo, merchantInfo.softwareInfo);
        }

        public final int hashCode() {
            String str = this.merchantName;
            return this.softwareInfo.id.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "MerchantInfo(merchantName=" + this.merchantName + ", softwareInfo=" + this.softwareInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.merchantName);
            this.softwareInfo.writeToParcel(parcel, i);
        }
    }

    public final class SoftwareInfo implements Parcelable {
        public static final Parcelable.Creator<SoftwareInfo> CREATOR = new SetupIntentResult.Creator(11);
        public final SoftwareId id;

        public enum SoftwareId {
            Launcher("android/stripe-launcher"),
            /* JADX INFO: Fake field, exist only in values array */
            Manual("android/stripe-manual-api"),
            Elements("android/stripe-elements");

            public final String code;

            SoftwareId(String str) {
                this.code = str;
            }
        }

        public SoftwareInfo(SoftwareId softwareId) {
            softwareId.getClass();
            this.id = softwareId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SoftwareInfo) && this.id == ((SoftwareInfo) obj).id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return "SoftwareInfo(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id.name());
        }
    }

    public final class TransactionInfo implements Parcelable {
        public static final Parcelable.Creator<TransactionInfo> CREATOR = new SetupIntentResult.Creator(12);
        public final CheckoutOption checkoutOption;
        public final String countryCode;
        public final String currencyCode;
        public final Long totalPrice;
        public final String totalPriceLabel;
        public final TotalPriceStatus totalPriceStatus;
        public final String transactionId;

        public enum CheckoutOption {
            Default("DEFAULT"),
            CompleteImmediatePurchase("COMPLETE_IMMEDIATE_PURCHASE");

            public final String code;

            CheckoutOption(String str) {
                this.code = str;
            }
        }

        public enum TotalPriceStatus {
            NotCurrentlyKnown("NOT_CURRENTLY_KNOWN"),
            Estimated("ESTIMATED"),
            Final("FINAL");

            public final String code;

            TotalPriceStatus(String str) {
                this.code = str;
            }
        }

        public TransactionInfo(String str, TotalPriceStatus totalPriceStatus, String str2, String str3, Long l, String str4, CheckoutOption checkoutOption) {
            str.getClass();
            totalPriceStatus.getClass();
            this.currencyCode = str;
            this.totalPriceStatus = totalPriceStatus;
            this.countryCode = str2;
            this.transactionId = str3;
            this.totalPrice = l;
            this.totalPriceLabel = str4;
            this.checkoutOption = checkoutOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionInfo)) {
                return false;
            }
            TransactionInfo transactionInfo = (TransactionInfo) obj;
            return Intrinsics.areEqual(this.currencyCode, transactionInfo.currencyCode) && this.totalPriceStatus == transactionInfo.totalPriceStatus && Intrinsics.areEqual(this.countryCode, transactionInfo.countryCode) && Intrinsics.areEqual(this.transactionId, transactionInfo.transactionId) && Intrinsics.areEqual(this.totalPrice, transactionInfo.totalPrice) && Intrinsics.areEqual(this.totalPriceLabel, transactionInfo.totalPriceLabel) && this.checkoutOption == transactionInfo.checkoutOption;
        }

        public final int hashCode() {
            int hashCode = (this.totalPriceStatus.hashCode() + (this.currencyCode.hashCode() * 31)) * 31;
            String str = this.countryCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.totalPrice;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            String str3 = this.totalPriceLabel;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CheckoutOption checkoutOption = this.checkoutOption;
            return hashCode5 + (checkoutOption != null ? checkoutOption.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TransactionInfo(currencyCode=");
            sb.append(this.currencyCode);
            sb.append(", totalPriceStatus=");
            sb.append(this.totalPriceStatus);
            sb.append(", countryCode=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.countryCode, ", transactionId=", this.transactionId, ", totalPrice=");
            ViewEvent$State$EnumUnboxingLocalUtility.m(this.totalPrice, ", totalPriceLabel=", this.totalPriceLabel, ", checkoutOption=", sb);
            sb.append(this.checkoutOption);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.currencyCode);
            parcel.writeString(this.totalPriceStatus.name());
            parcel.writeString(this.countryCode);
            parcel.writeString(this.transactionId);
            Long l = this.totalPrice;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
            }
            parcel.writeString(this.totalPriceLabel);
            CheckoutOption checkoutOption = this.checkoutOption;
            if (checkoutOption == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(checkoutOption.name());
            }
        }
    }

    public GooglePayJsonFactory(GooglePayConfig googlePayConfig, boolean z, List list, DefaultCardBrandFilter defaultCardBrandFilter, DefaultCardFundingFilter defaultCardFundingFilter) {
        list.getClass();
        defaultCardBrandFilter.getClass();
        defaultCardFundingFilter.getClass();
        this.googlePayConfig = googlePayConfig;
        this.isJcbEnabled = z;
        this.additionalEnabledNetworks = list;
        this.cardBrandFilter = defaultCardBrandFilter;
        this.cardFundingFilter = defaultCardFundingFilter;
    }

    public static JSONObject createPaymentDataRequest$payments_core_release$default(GooglePayJsonFactory googlePayJsonFactory, TransactionInfo transactionInfo, MerchantInfo merchantInfo, BillingAddressParameters billingAddressParameters, boolean z, Boolean bool) {
        String format2;
        googlePayJsonFactory.getClass();
        transactionInfo.getClass();
        String str = transactionInfo.currencyCode;
        String str2 = merchantInfo.merchantName;
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(googlePayJsonFactory.createCardPaymentMethod(billingAddressParameters, bool, false)));
        JSONObject jSONObject = new JSONObject();
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        JSONObject put2 = jSONObject.put(AppsFlyerProperties.CURRENCY_CODE, upperCase).put("totalPriceStatus", transactionInfo.totalPriceStatus.code);
        String str3 = transactionInfo.countryCode;
        if (str3 != null) {
            String upperCase2 = str3.toUpperCase(locale);
            upperCase2.getClass();
            put2.put("countryCode", upperCase2);
        }
        String str4 = transactionInfo.transactionId;
        if (str4 != null) {
            put2.put("transactionId", str4);
        }
        Long l = transactionInfo.totalPrice;
        if (l != null) {
            long longValue = l.longValue();
            String upperCase3 = str.toUpperCase(locale);
            upperCase3.getClass();
            Currency currency = Currency.getInstance(upperCase3);
            currency.getClass();
            int defaultDecimalDigits = CurrencyFormatter.getDefaultDecimalDigits(currency);
            int length = String.valueOf(longValue).length();
            StringBuilder sb = new StringBuilder();
            if (defaultDecimalDigits == 0) {
                for (int i = 0; i < length; i++) {
                    sb.append('#');
                }
                DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
                decimalFormat.setCurrency(currency);
                decimalFormat.setGroupingUsed(false);
                format2 = decimalFormat.format(longValue);
                format2.getClass();
            } else {
                int i2 = length - defaultDecimalDigits;
                for (int i3 = 0; i3 < i2; i3++) {
                    sb.append('#');
                }
                if (length <= defaultDecimalDigits) {
                    sb.append('0');
                }
                sb.append('.');
                for (int i4 = 0; i4 < defaultDecimalDigits; i4++) {
                    sb.append('0');
                }
                double pow = Math.pow(10.0d, defaultDecimalDigits);
                DecimalFormat decimalFormat2 = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
                decimalFormat2.setCurrency(currency);
                decimalFormat2.setGroupingUsed(false);
                format2 = decimalFormat2.format(longValue / pow);
                format2.getClass();
            }
            put2.put("totalPrice", format2);
        }
        String str5 = transactionInfo.totalPriceLabel;
        if (str5 != null) {
            put2.put("totalPriceLabel", str5);
        }
        TransactionInfo.CheckoutOption checkoutOption = transactionInfo.checkoutOption;
        if (checkoutOption != null) {
            put2.put("checkoutOption", checkoutOption.code);
        }
        put2.getClass();
        JSONObject put3 = put.put("transactionInfo", put2).put("emailRequired", z);
        JSONObject jSONObject2 = new JSONObject();
        if (str2 != null && str2.length() != 0) {
            jSONObject2.put("merchantName", str2);
        }
        jSONObject2.put("softwareInfo", new JSONObject().put("id", merchantInfo.softwareInfo.id.code).put("version", "23.9.1"));
        put3.put("merchantInfo", jSONObject2);
        return put3;
    }

    public final JSONObject createCardPaymentMethod(BillingAddressParameters billingAddressParameters, Boolean bool, boolean z) {
        List listOf;
        ArrayList arrayList;
        List list = this.additionalEnabledNetworks;
        boolean z2 = this.isJcbEnabled;
        List list2 = DEFAULT_CARD_NETWORKS;
        if (z) {
            List list3 = list2;
            listOf = z2 ? CollectionsKt__CollectionsJVMKt.listOf("JCB") : null;
            arrayList = CollectionsKt.plus((Iterable) list, (Collection) CollectionsKt.plus(listOf != null ? listOf : EmptyList.INSTANCE, (Collection) list3));
        } else {
            List list4 = list2;
            listOf = z2 ? CollectionsKt__CollectionsJVMKt.listOf("JCB") : null;
            ArrayList plus = CollectionsKt.plus((Iterable) list, (Collection) CollectionsKt.plus(listOf != null ? listOf : EmptyList.INSTANCE, (Collection) list4));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = plus.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                CardBrand cardBrand = (CardBrand) networkStringToCardBrandMap.get((String) next);
                if (cardBrand == null) {
                    cardBrand = CardBrand.Unknown;
                }
                this.cardBrandFilter.getClass();
                cardBrand.getClass();
                arrayList2.add(next);
            }
            arrayList = arrayList2;
        }
        JSONObject put = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) ALLOWED_AUTH_METHODS)).put("allowedCardNetworks", new JSONArray((Collection) arrayList));
        put.getClass();
        if (billingAddressParameters.isRequired) {
            put.put("billingAddressRequired", true);
            put.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", billingAddressParameters.isPhoneNumberRequired).put("format", billingAddressParameters.f1425format.code));
        }
        KClasses$$Lambda$1 kClasses$$Lambda$1 = CardFunding.Companion;
        this.cardFundingFilter.getClass();
        put.put("allowCreditCards", bool.booleanValue());
        put.put("allowPrepaidCards", true);
        JSONObject put2 = new JSONObject().put("type", "CARD").put("parameters", put);
        JSONObject put3 = new JSONObject().put("type", "PAYMENT_GATEWAY");
        JSONObject put4 = new JSONObject().put("gateway", "stripe");
        GooglePayConfig googlePayConfig = this.googlePayConfig;
        JSONObject put5 = put4.put("stripe:version", "StripeAndroid/" + googlePayConfig.sdkVersion);
        String str = googlePayConfig.connectedAccountId;
        String str2 = googlePayConfig.validPublishableKey;
        if (str != null) {
            str2 = Recorder$$ExternalSyntheticOutline2.m(str2, "/", str);
        }
        JSONObject put6 = put3.put("parameters", put5.put("stripe:publishableKey", str2));
        put6.getClass();
        JSONObject put7 = put2.put("tokenizationSpecification", put6);
        put7.getClass();
        return put7;
    }

    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters, Boolean bool, Boolean bool2) {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(createCardPaymentMethod(billingAddressParameters, bool2, true)));
        put.put("existingPaymentMethodRequired", bool.booleanValue());
        put.getClass();
        return put;
    }
}
