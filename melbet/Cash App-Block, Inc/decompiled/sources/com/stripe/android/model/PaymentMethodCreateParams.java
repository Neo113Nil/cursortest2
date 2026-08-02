package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Source;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.y0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class PaymentMethodCreateParams implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodCreateParams> CREATOR = new Source.Creator(14);
    public final PaymentMethod.AllowRedisplay allowRedisplay;
    public final AuBecsDebit auBecsDebit;
    public final BacsDebit bacsDebit;
    public final PaymentMethod.BillingDetails billingDetails;
    public final Card card;
    public final CashAppPay cashAppPay;
    public final ClientAttributionMetadata clientAttributionMetadata;
    public final String code;
    public final Fpx fpx;
    public final Ideal ideal;
    public final Link link;
    public final Map metadata;
    public final Netbanking netbanking;
    public final Map overrideParamMap;
    public final Set productUsage;
    public final RadarOptions radarOptions;
    public final boolean requiresMandate;
    public final SepaDebit sepaDebit;
    public final ShopPay shopPay;
    public final Swish swish;
    public final USBankAccount usBankAccount;

    public final class AuBecsDebit implements Parcelable {
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Source.Creator(9);
        public String accountNumber;
        public String bsbNumber;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) obj;
            return this.bsbNumber.equals(auBecsDebit.bsbNumber) && this.accountNumber.equals(auBecsDebit.accountNumber);
        }

        public final int hashCode() {
            return this.accountNumber.hashCode() + (this.bsbNumber.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("AuBecsDebit(bsbNumber=", this.bsbNumber, ", accountNumber=", this.accountNumber, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.accountNumber);
        }
    }

    public final class BacsDebit implements Parcelable {
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Source.Creator(10);
        public String accountNumber;
        public String sortCode;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) obj;
            return this.accountNumber.equals(bacsDebit.accountNumber) && this.sortCode.equals(bacsDebit.sortCode);
        }

        public final int hashCode() {
            return this.sortCode.hashCode() + (this.accountNumber.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("BacsDebit(accountNumber=", this.accountNumber, ", sortCode=", this.sortCode, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.sortCode);
        }
    }

    public final class Card implements Parcelable {
        public static final Parcelable.Creator<Card> CREATOR = new Source.Creator(11);
        public final Set attribution;
        public final String cvc;
        public final Integer expiryMonth;
        public final Integer expiryYear;
        public final Networks networks;
        public final String number;
        public final String token;

        public final class Networks implements Parcelable {
            public static final Parcelable.Creator<Networks> CREATOR = new Source.Creator(12);
            public final String preferred;

            public Networks(String str) {
                this.preferred = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return (obj instanceof Networks) && Intrinsics.areEqual(((Networks) obj).preferred, this.preferred);
            }

            public final int hashCode() {
                return Objects.hash(this.preferred);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentMethodCreateParams.Card.Networks(preferred=", this.preferred, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.preferred);
            }
        }

        public Card(String str, Integer num, Integer num2, String str2, String str3, Set set, Networks networks) {
            this.number = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.cvc = str2;
            this.token = str3;
            this.attribution = set;
            this.networks = networks;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return Intrinsics.areEqual(this.number, card.number) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && Intrinsics.areEqual(this.cvc, card.cvc) && Intrinsics.areEqual(this.token, card.token) && Intrinsics.areEqual(this.attribution, card.attribution) && Intrinsics.areEqual(this.networks, card.networks);
        }

        public final int hashCode() {
            String str = this.number;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.expiryMonth;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.cvc;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.token;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set set = this.attribution;
            int hashCode6 = (hashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            Networks networks = this.networks;
            return hashCode6 + (networks != null ? networks.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.expiryMonth, "Card(number=", this.number, ", expiryMonth=", ", expiryYear=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.expiryYear, ", cvc=", this.cvc, ", token=");
            m.append(this.token);
            m.append(", attribution=");
            m.append(this.attribution);
            m.append(", networks=");
            m.append(this.networks);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.number);
            Integer num = this.expiryMonth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
            }
            parcel.writeString(this.cvc);
            parcel.writeString(this.token);
            Set set = this.attribution;
            if (set == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString((String) it.next());
                }
            }
            Networks networks = this.networks;
            if (networks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(networks.preferred);
            }
        }
    }

    public final class CashAppPay implements Parcelable {
        public static final Parcelable.Creator<CashAppPay> CREATOR = new Source.Creator(13);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Fpx implements Parcelable {
        public static final Parcelable.Creator<Fpx> CREATOR = new Source.Creator(15);
        public String bank;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fpx) && Intrinsics.areEqual(this.bank, ((Fpx) obj).bank);
        }

        public final int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Fpx(bank=", this.bank, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bank);
        }
    }

    public final class Ideal implements Parcelable {
        public static final Parcelable.Creator<Ideal> CREATOR = new Source.Creator(16);
        public String bank;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ideal) && Intrinsics.areEqual(this.bank, ((Ideal) obj).bank);
        }

        public final int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ideal(bank=", this.bank, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bank);
        }
    }

    public final class Link implements Parcelable {
        public static final Parcelable.Creator<Link> CREATOR = new Source.Creator(17);
        public final String consumerSessionClientSecret;
        public final Map extraParams;
        public final String originalPaymentMethodCode;
        public final String paymentDetailsId;

        public Link(String str, String str2, LinkedHashMap linkedHashMap, String str3) {
            str.getClass();
            str2.getClass();
            this.paymentDetailsId = str;
            this.consumerSessionClientSecret = str2;
            this.extraParams = linkedHashMap;
            this.originalPaymentMethodCode = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return Intrinsics.areEqual(this.paymentDetailsId, link.paymentDetailsId) && Intrinsics.areEqual(this.consumerSessionClientSecret, link.consumerSessionClientSecret) && Intrinsics.areEqual(this.extraParams, link.extraParams) && Intrinsics.areEqual(this.originalPaymentMethodCode, link.originalPaymentMethodCode);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.paymentDetailsId.hashCode() * 31, 31, this.consumerSessionClientSecret);
            Map map = this.extraParams;
            int hashCode = (m + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.originalPaymentMethodCode;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Link(paymentDetailsId=", this.paymentDetailsId, ", consumerSessionClientSecret=", this.consumerSessionClientSecret, ", extraParams=");
            m.append(this.extraParams);
            m.append(", originalPaymentMethodCode=");
            m.append(this.originalPaymentMethodCode);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.paymentDetailsId);
            parcel.writeString(this.consumerSessionClientSecret);
            Map map = this.extraParams;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
                while (m.hasNext()) {
                    Map.Entry entry = (Map.Entry) m.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeValue(entry.getValue());
                }
            }
            parcel.writeString(this.originalPaymentMethodCode);
        }
    }

    public final class Netbanking implements Parcelable {
        public static final Parcelable.Creator<Netbanking> CREATOR = new Source.Creator(18);
        public String bank;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Netbanking) && this.bank.equals(((Netbanking) obj).bank);
        }

        public final int hashCode() {
            return this.bank.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Netbanking(bank=", this.bank, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.bank);
        }
    }

    public final class SepaDebit implements Parcelable {
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Source.Creator(19);
        public String iban;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SepaDebit) && Intrinsics.areEqual(this.iban, ((SepaDebit) obj).iban);
        }

        public final int hashCode() {
            String str = this.iban;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SepaDebit(iban=", this.iban, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.iban);
        }
    }

    public final class ShopPay implements Parcelable {
        public static final Parcelable.Creator<ShopPay> CREATOR = new Source.Creator(20);
        public String externalSourceId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShopPay) && this.externalSourceId.equals(((ShopPay) obj).externalSourceId);
        }

        public final int hashCode() {
            return this.externalSourceId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShopPay(externalSourceId=", this.externalSourceId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.externalSourceId);
        }
    }

    public final class Swish implements Parcelable {
        public static final Parcelable.Creator<Swish> CREATOR = new Source.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class USBankAccount implements Parcelable {
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Source.Creator(22);
        public PaymentMethod.USBankAccount.USBankAccountHolderType accountHolderType;
        public String accountNumber;
        public PaymentMethod.USBankAccount.USBankAccountType accountType;
        public String linkAccountSessionId;
        public String routingNumber;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) obj;
            return Intrinsics.areEqual(this.linkAccountSessionId, uSBankAccount.linkAccountSessionId) && Intrinsics.areEqual(this.accountNumber, uSBankAccount.accountNumber) && Intrinsics.areEqual(this.routingNumber, uSBankAccount.routingNumber) && this.accountType == uSBankAccount.accountType && this.accountHolderType == uSBankAccount.accountHolderType;
        }

        public final int hashCode() {
            String str = this.linkAccountSessionId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.routingNumber;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            int hashCode4 = (hashCode3 + (uSBankAccountType == null ? 0 : uSBankAccountType.hashCode())) * 31;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            return hashCode4 + (uSBankAccountHolderType != null ? uSBankAccountHolderType.hashCode() : 0);
        }

        public final String toString() {
            String str = this.linkAccountSessionId;
            String str2 = this.accountNumber;
            String str3 = this.routingNumber;
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("USBankAccount(linkAccountSessionId=", str, ", accountNumber=", str2, ", routingNumber=");
            m.append(str3);
            m.append(", accountType=");
            m.append(uSBankAccountType);
            m.append(", accountHolderType=");
            m.append(uSBankAccountHolderType);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.linkAccountSessionId);
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.routingNumber);
            PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = this.accountType;
            if (uSBankAccountType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uSBankAccountType.writeToParcel(parcel, i);
            }
            PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = this.accountHolderType;
            if (uSBankAccountHolderType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uSBankAccountHolderType.writeToParcel(parcel, i);
            }
        }
    }

    public PaymentMethodCreateParams(String str, boolean z, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Netbanking netbanking, USBankAccount uSBankAccount, Link link, CashAppPay cashAppPay, Swish swish, ShopPay shopPay, PaymentMethod.BillingDetails billingDetails, PaymentMethod.AllowRedisplay allowRedisplay, RadarOptions radarOptions, Map map, Set set, ClientAttributionMetadata clientAttributionMetadata, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.code = str;
        this.requiresMandate = z;
        this.card = card;
        this.ideal = ideal;
        this.fpx = fpx;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.link = link;
        this.cashAppPay = cashAppPay;
        this.swish = swish;
        this.shopPay = shopPay;
        this.billingDetails = billingDetails;
        this.allowRedisplay = allowRedisplay;
        this.radarOptions = radarOptions;
        this.metadata = map;
        this.productUsage = set;
        this.clientAttributionMetadata = clientAttributionMetadata;
        this.overrideParamMap = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodCreateParams)) {
            return false;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) obj;
        return Intrinsics.areEqual(this.code, paymentMethodCreateParams.code) && this.requiresMandate == paymentMethodCreateParams.requiresMandate && Intrinsics.areEqual(this.card, paymentMethodCreateParams.card) && Intrinsics.areEqual(this.ideal, paymentMethodCreateParams.ideal) && Intrinsics.areEqual(this.fpx, paymentMethodCreateParams.fpx) && Intrinsics.areEqual(this.sepaDebit, paymentMethodCreateParams.sepaDebit) && Intrinsics.areEqual(this.auBecsDebit, paymentMethodCreateParams.auBecsDebit) && Intrinsics.areEqual(this.bacsDebit, paymentMethodCreateParams.bacsDebit) && Intrinsics.areEqual(this.netbanking, paymentMethodCreateParams.netbanking) && Intrinsics.areEqual(this.usBankAccount, paymentMethodCreateParams.usBankAccount) && Intrinsics.areEqual(this.link, paymentMethodCreateParams.link) && Intrinsics.areEqual(this.cashAppPay, paymentMethodCreateParams.cashAppPay) && Intrinsics.areEqual(this.swish, paymentMethodCreateParams.swish) && Intrinsics.areEqual(this.shopPay, paymentMethodCreateParams.shopPay) && Intrinsics.areEqual(this.billingDetails, paymentMethodCreateParams.billingDetails) && this.allowRedisplay == paymentMethodCreateParams.allowRedisplay && Intrinsics.areEqual(this.radarOptions, paymentMethodCreateParams.radarOptions) && Intrinsics.areEqual(this.metadata, paymentMethodCreateParams.metadata) && Intrinsics.areEqual(this.productUsage, paymentMethodCreateParams.productUsage) && Intrinsics.areEqual(this.clientAttributionMetadata, paymentMethodCreateParams.clientAttributionMetadata) && Intrinsics.areEqual(this.overrideParamMap, paymentMethodCreateParams.overrideParamMap);
    }

    public final Set getAttribution() {
        Set set;
        y0 y0Var = PaymentMethod.Type.Companion;
        boolean areEqual = Intrinsics.areEqual(this.code, "card");
        Set set2 = this.productUsage;
        if (!areEqual) {
            return set2;
        }
        Card card = this.card;
        if (card == null || (set = card.attribution) == null) {
            set = EmptySet.INSTANCE;
        }
        return SetsKt___SetsKt.plus(set, (Iterable) set2);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.code.hashCode() * 31, 31, this.requiresMandate);
        Card card = this.card;
        int hashCode = (m + (card == null ? 0 : card.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int hashCode2 = (hashCode + (ideal == null ? 0 : ideal.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int hashCode3 = (hashCode2 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int hashCode4 = (hashCode3 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int hashCode5 = (hashCode4 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int hashCode6 = (hashCode5 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int hashCode7 = (hashCode6 + (netbanking == null ? 0 : netbanking.bank.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int hashCode8 = (hashCode7 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        Link link = this.link;
        int hashCode9 = (hashCode8 + (link == null ? 0 : link.hashCode())) * 31;
        CashAppPay cashAppPay = this.cashAppPay;
        int hashCode10 = (hashCode9 + (cashAppPay == null ? 0 : cashAppPay.hashCode())) * 31;
        Swish swish = this.swish;
        int hashCode11 = (hashCode10 + (swish == null ? 0 : swish.hashCode())) * 31;
        ShopPay shopPay = this.shopPay;
        int hashCode12 = (hashCode11 + (shopPay == null ? 0 : shopPay.externalSourceId.hashCode())) * 31;
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        int hashCode13 = (hashCode12 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        PaymentMethod.AllowRedisplay allowRedisplay = this.allowRedisplay;
        int hashCode14 = (hashCode13 + (allowRedisplay == null ? 0 : allowRedisplay.hashCode())) * 31;
        RadarOptions radarOptions = this.radarOptions;
        int hashCode15 = (hashCode14 + (radarOptions == null ? 0 : radarOptions.hashCode())) * 31;
        Map map = this.metadata;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode15 + (map == null ? 0 : map.hashCode())) * 31, 31, this.productUsage);
        ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
        int hashCode16 = (m2 + (clientAttributionMetadata == null ? 0 : clientAttributionMetadata.hashCode())) * 31;
        Map map2 = this.overrideParamMap;
        return hashCode16 + (map2 != null ? map2.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0294  */
    /* JADX WARN: Type inference failed for: r3v95, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map toParamMap() {
        Map map;
        ShopPay shopPay;
        Map m;
        Map m2;
        Map m3;
        Object obj;
        Map map2 = this.overrideParamMap;
        if (map2 == null) {
            String str = this.code;
            Map m4 = Thread$State$EnumUnboxingLocalUtility.m("type", str);
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            if (billingDetails != null) {
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                Address address = billingDetails.address;
                Map m5 = address != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("address", address.toParamMap()) : null;
                if (m5 == null) {
                    m5 = emptyMap;
                }
                LinkedHashMap plus = MapsKt__MapsKt.plus(emptyMap, m5);
                String str2 = billingDetails.email;
                Map m6 = str2 != null ? Thread$State$EnumUnboxingLocalUtility.m("email", str2) : null;
                if (m6 == null) {
                    m6 = emptyMap;
                }
                LinkedHashMap plus2 = MapsKt__MapsKt.plus(plus, m6);
                String str3 = billingDetails.name;
                Map m7 = str3 != null ? Thread$State$EnumUnboxingLocalUtility.m("name", str3) : null;
                if (m7 == null) {
                    m7 = emptyMap;
                }
                LinkedHashMap plus3 = MapsKt__MapsKt.plus(plus2, m7);
                String str4 = billingDetails.phone;
                EmptyMap m8 = str4 != null ? Thread$State$EnumUnboxingLocalUtility.m("phone", str4) : null;
                if (m8 != null) {
                    emptyMap = m8;
                }
                map = MapsKt__MapsJVMKt.mapOf(new Pair("billing_details", MapsKt__MapsKt.plus(plus3, emptyMap)));
            } else {
                map = null;
            }
            if (map == null) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
            LinkedHashMap plus4 = MapsKt__MapsKt.plus(m4, map);
            y0 y0Var = PaymentMethod.Type.Companion;
            if (Intrinsics.areEqual(str, "card")) {
                Card card = this.card;
                if (card != null) {
                    Pair pair = new Pair(InquiryField.FloatField.TYPE2, card.number);
                    Pair pair2 = new Pair("exp_month", card.expiryMonth);
                    Pair pair3 = new Pair("exp_year", card.expiryYear);
                    Pair pair4 = new Pair("cvc", card.cvc);
                    Pair pair5 = new Pair("token", card.token);
                    Card.Networks networks = card.networks;
                    if (networks != null) {
                        String str5 = networks.preferred;
                        if (str5 != null) {
                            obj = Thread$State$EnumUnboxingLocalUtility.m("preferred", str5);
                        } else {
                            obj = EmptyMap.INSTANCE;
                            obj.getClass();
                        }
                    } else {
                        obj = null;
                    }
                    List<Pair> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{pair, pair2, pair3, pair4, pair5, new Pair("networks", obj)});
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair6 : listOf) {
                        Object obj2 = pair6.second;
                        Pair pair7 = obj2 != null ? new Pair(pair6.first, obj2) : null;
                        if (pair7 != null) {
                            arrayList.add(pair7);
                        }
                    }
                    m = MapsKt__MapsKt.toMap(arrayList);
                    if (m != null || m.isEmpty()) {
                        m = null;
                    }
                    m2 = m == null ? BalanceFeedKt$$ExternalSyntheticOutline0.m(str, m) : null;
                    if (m2 == null) {
                        m2 = EmptyMap.INSTANCE;
                        m2.getClass();
                    }
                    LinkedHashMap plus5 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map3 = this.metadata;
                    m3 = map3 == null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("metadata", map3) : null;
                    if (m3 == null) {
                        m3 = EmptyMap.INSTANCE;
                        m3.getClass();
                    }
                    map2 = MapsKt__MapsKt.plus(plus5, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus52 = MapsKt__MapsKt.plus(plus4, m2);
                Map map32 = this.metadata;
                if (map32 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus52, m3);
            } else if (Intrinsics.areEqual(str, "ideal")) {
                Ideal ideal = this.ideal;
                if (ideal != null) {
                    String str6 = ideal.bank;
                    m = str6 != null ? Thread$State$EnumUnboxingLocalUtility.m("bank", str6) : null;
                    if (m == null) {
                        m = EmptyMap.INSTANCE;
                        m.getClass();
                    }
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus522 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map322 = this.metadata;
                    if (map322 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus522, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus5222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map3222 = this.metadata;
                if (map3222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus5222, m3);
            } else if (Intrinsics.areEqual(str, "fpx")) {
                Fpx fpx = this.fpx;
                if (fpx != null) {
                    String str7 = fpx.bank;
                    m = str7 != null ? Thread$State$EnumUnboxingLocalUtility.m("bank", str7) : null;
                    if (m == null) {
                        m = EmptyMap.INSTANCE;
                        m.getClass();
                    }
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus52222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map32222 = this.metadata;
                    if (map32222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus52222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus522222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map322222 = this.metadata;
                if (map322222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus522222, m3);
            } else if (Intrinsics.areEqual(str, "sepa_debit")) {
                SepaDebit sepaDebit = this.sepaDebit;
                if (sepaDebit != null) {
                    String str8 = sepaDebit.iban;
                    m = str8 != null ? Thread$State$EnumUnboxingLocalUtility.m("iban", str8) : null;
                    if (m == null) {
                        m = EmptyMap.INSTANCE;
                        m.getClass();
                    }
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus5222222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map3222222 = this.metadata;
                    if (map3222222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus5222222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus52222222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map32222222 = this.metadata;
                if (map32222222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus52222222, m3);
            } else if (Intrinsics.areEqual(str, "au_becs_debit")) {
                AuBecsDebit auBecsDebit = this.auBecsDebit;
                if (auBecsDebit != null) {
                    m = MapsKt__MapsKt.mapOf(new Pair("bsb_number", auBecsDebit.bsbNumber), new Pair("account_number", auBecsDebit.accountNumber));
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus522222222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map322222222 = this.metadata;
                    if (map322222222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus522222222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus5222222222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map3222222222 = this.metadata;
                if (map3222222222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus5222222222, m3);
            } else if (Intrinsics.areEqual(str, "bacs_debit")) {
                BacsDebit bacsDebit = this.bacsDebit;
                if (bacsDebit != null) {
                    m = MapsKt__MapsKt.mapOf(new Pair("account_number", bacsDebit.accountNumber), new Pair("sort_code", bacsDebit.sortCode));
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus52222222222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map32222222222 = this.metadata;
                    if (map32222222222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus52222222222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus522222222222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map322222222222 = this.metadata;
                if (map322222222222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus522222222222, m3);
            } else if (Intrinsics.areEqual(str, "netbanking")) {
                Netbanking netbanking = this.netbanking;
                if (netbanking != null) {
                    String lowerCase = netbanking.bank.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    m = MapsKt__MapsJVMKt.mapOf(new Pair("bank", lowerCase));
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus5222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map3222222222222 = this.metadata;
                    if (map3222222222222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus5222222222222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus52222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map32222222222222 = this.metadata;
                if (map32222222222222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus52222222222222, m3);
            } else if (Intrinsics.areEqual(str, "us_bank_account")) {
                USBankAccount uSBankAccount = this.usBankAccount;
                if (uSBankAccount != null) {
                    String str9 = uSBankAccount.linkAccountSessionId;
                    if (str9 != null) {
                        m = Thread$State$EnumUnboxingLocalUtility.m("link_account_session", str9);
                    } else {
                        String str10 = uSBankAccount.accountNumber;
                        str10.getClass();
                        Pair pair8 = new Pair("account_number", str10);
                        String str11 = uSBankAccount.routingNumber;
                        str11.getClass();
                        Pair pair9 = new Pair("routing_number", str11);
                        PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType = uSBankAccount.accountType;
                        uSBankAccountType.getClass();
                        Pair pair10 = new Pair("account_type", uSBankAccountType.value);
                        PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType = uSBankAccount.accountHolderType;
                        uSBankAccountHolderType.getClass();
                        m = MapsKt__MapsKt.mapOf(pair8, pair9, pair10, new Pair("account_holder_type", uSBankAccountHolderType.value));
                    }
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus522222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map322222222222222 = this.metadata;
                    if (map322222222222222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus522222222222222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus5222222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map3222222222222222 = this.metadata;
                if (map3222222222222222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus5222222222222222, m3);
            } else if (Intrinsics.areEqual(str, "link")) {
                Link link = this.link;
                if (link != null) {
                    Map mapOf = MapsKt__MapsKt.mapOf(new Pair("payment_details_id", link.paymentDetailsId), new Pair("credentials", Thread$State$EnumUnboxingLocalUtility.m("consumer_session_client_secret", link.consumerSessionClientSecret)));
                    Map map4 = link.extraParams;
                    if (map4 == null) {
                        map4 = EmptyMap.INSTANCE;
                        map4.getClass();
                    }
                    m = MapsKt__MapsKt.plus(mapOf, map4);
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus52222222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map32222222222222222 = this.metadata;
                    if (map32222222222222222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus52222222222222222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus522222222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map322222222222222222 = this.metadata;
                if (map322222222222222222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus522222222222222222, m3);
            } else {
                if (Intrinsics.areEqual(str, "shop_pay") && (shopPay = this.shopPay) != null) {
                    m = Thread$State$EnumUnboxingLocalUtility.m("external_source_id", shopPay.externalSourceId);
                    if (m != null) {
                    }
                    m = null;
                    if (m == null) {
                    }
                    if (m2 == null) {
                    }
                    LinkedHashMap plus5222222222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                    Map map3222222222222222222 = this.metadata;
                    if (map3222222222222222222 == null) {
                    }
                    if (m3 == null) {
                    }
                    map2 = MapsKt__MapsKt.plus(plus5222222222222222222, m3);
                }
                m = null;
                if (m != null) {
                }
                m = null;
                if (m == null) {
                }
                if (m2 == null) {
                }
                LinkedHashMap plus52222222222222222222 = MapsKt__MapsKt.plus(plus4, m2);
                Map map32222222222222222222 = this.metadata;
                if (map32222222222222222222 == null) {
                }
                if (m3 == null) {
                }
                map2 = MapsKt__MapsKt.plus(plus52222222222222222222, m3);
            }
        }
        PaymentMethod.AllowRedisplay allowRedisplay = this.allowRedisplay;
        Map m9 = allowRedisplay != null ? Thread$State$EnumUnboxingLocalUtility.m("allow_redisplay", allowRedisplay.value) : null;
        if (m9 == null) {
            m9 = EmptyMap.INSTANCE;
            m9.getClass();
        }
        LinkedHashMap plus6 = MapsKt__MapsKt.plus(map2, m9);
        RadarOptions radarOptions = this.radarOptions;
        Map m10 = radarOptions != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("radar_options", radarOptions.toParamMap()) : null;
        if (m10 == null) {
            m10 = EmptyMap.INSTANCE;
            m10.getClass();
        }
        LinkedHashMap plus7 = MapsKt__MapsKt.plus(plus6, m10);
        ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
        Map m11 = clientAttributionMetadata != null ? BalanceFeedKt$$ExternalSyntheticOutline0.m("client_attribution_metadata", clientAttributionMetadata.toParamMap()) : null;
        if (m11 == null) {
            m11 = EmptyMap.INSTANCE;
            m11.getClass();
        }
        return MapsKt__MapsKt.plus(plus7, m11);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("PaymentMethodCreateParams(code=", this.code, ", requiresMandate=", ", card=", this.requiresMandate);
        m1540m.append(this.card);
        m1540m.append(", ideal=");
        m1540m.append(this.ideal);
        m1540m.append(", fpx=");
        m1540m.append(this.fpx);
        m1540m.append(", sepaDebit=");
        m1540m.append(this.sepaDebit);
        m1540m.append(", auBecsDebit=");
        m1540m.append(this.auBecsDebit);
        m1540m.append(", bacsDebit=");
        m1540m.append(this.bacsDebit);
        m1540m.append(", netbanking=");
        m1540m.append(this.netbanking);
        m1540m.append(", usBankAccount=");
        m1540m.append(this.usBankAccount);
        m1540m.append(", link=");
        m1540m.append(this.link);
        m1540m.append(", cashAppPay=");
        m1540m.append(this.cashAppPay);
        m1540m.append(", swish=");
        m1540m.append(this.swish);
        m1540m.append(", shopPay=");
        m1540m.append(this.shopPay);
        m1540m.append(", billingDetails=");
        m1540m.append(this.billingDetails);
        m1540m.append(", allowRedisplay=");
        m1540m.append(this.allowRedisplay);
        m1540m.append(", radarOptions=");
        m1540m.append(this.radarOptions);
        m1540m.append(", metadata=");
        m1540m.append(this.metadata);
        m1540m.append(", productUsage=");
        m1540m.append(this.productUsage);
        m1540m.append(", clientAttributionMetadata=");
        m1540m.append(this.clientAttributionMetadata);
        m1540m.append(", overrideParamMap=");
        return re$$ExternalSyntheticOutline0.m(")", m1540m, this.overrideParamMap);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.code);
        parcel.writeInt(this.requiresMandate ? 1 : 0);
        Card card = this.card;
        if (card == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            card.writeToParcel(parcel, i);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ideal.bank);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fpx.bank);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sepaDebit.iban);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auBecsDebit.writeToParcel(parcel, i);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bacsDebit.writeToParcel(parcel, i);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(netbanking.bank);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uSBankAccount.writeToParcel(parcel, i);
        }
        Link link = this.link;
        if (link == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, i);
        }
        if (this.cashAppPay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
        if (this.swish == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
        ShopPay shopPay = this.shopPay;
        if (shopPay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(shopPay.externalSourceId);
        }
        PaymentMethod.BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingDetails.writeToParcel(parcel, i);
        }
        PaymentMethod.AllowRedisplay allowRedisplay = this.allowRedisplay;
        if (allowRedisplay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allowRedisplay.writeToParcel(parcel, i);
        }
        RadarOptions radarOptions = this.radarOptions;
        if (radarOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            radarOptions.writeToParcel(parcel, i);
        }
        Map map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Set set = this.productUsage;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        ClientAttributionMetadata clientAttributionMetadata = this.clientAttributionMetadata;
        if (clientAttributionMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clientAttributionMetadata.writeToParcel(parcel, i);
        }
        Map map2 = this.overrideParamMap;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator m2 = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map2);
        while (m2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) m2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentMethodCreateParams(PaymentMethod.Type type2, Card card, PaymentMethod.BillingDetails billingDetails, ClientAttributionMetadata clientAttributionMetadata, int i) {
        this(type2.code, type2.requiresMandate, r6, null, null, null, null, null, null, null, null, null, null, null, billingDetails, null, null, null, r22, r23, null);
        Card card2 = (i & 2) != 0 ? null : card;
        EmptySet emptySet = EmptySet.INSTANCE;
        ClientAttributionMetadata clientAttributionMetadata2 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : clientAttributionMetadata;
        emptySet.getClass();
    }
}
