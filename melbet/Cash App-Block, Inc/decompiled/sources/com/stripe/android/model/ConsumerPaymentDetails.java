package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.android.libraries.places.api.model.zzco;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes8.dex */
public final class ConsumerPaymentDetails implements StripeModel {
    public static final Parcelable.Creator<ConsumerPaymentDetails> CREATOR = new Card.Creator(22);
    public final List paymentDetails;

    public final class BankAccount extends zzco {
        public static final Parcelable.Creator<BankAccount> CREATOR = new Card.Creator(19);
        public final String bankAccountName;
        public final String bankIconCode;
        public final BillingAddress billingAddress;
        public final String billingEmailAddress;
        public final String id;
        public final boolean isDefault;
        public final String last4;
        public final String nickname;

        public BankAccount(String str, String str2, boolean z, String str3, String str4, String str5, BillingAddress billingAddress, String str6) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.last4 = str2;
            this.isDefault = z;
            this.nickname = str3;
            this.bankAccountName = str4;
            this.bankIconCode = str5;
            this.billingAddress = billingAddress;
            this.billingEmailAddress = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BankAccount)) {
                return false;
            }
            BankAccount bankAccount = (BankAccount) obj;
            return Intrinsics.areEqual(this.id, bankAccount.id) && Intrinsics.areEqual(this.last4, bankAccount.last4) && this.isDefault == bankAccount.isDefault && Intrinsics.areEqual(this.nickname, bankAccount.nickname) && Intrinsics.areEqual(this.bankAccountName, bankAccount.bankAccountName) && Intrinsics.areEqual(this.bankIconCode, bankAccount.bankIconCode) && Intrinsics.areEqual(this.billingAddress, bankAccount.billingAddress) && Intrinsics.areEqual(this.billingEmailAddress, bankAccount.billingEmailAddress);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.last4), 31, this.isDefault);
            String str = this.nickname;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bankAccountName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bankIconCode;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BillingAddress billingAddress = this.billingAddress;
            int hashCode4 = (hashCode3 + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
            String str4 = this.billingEmailAddress;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BankAccount(id=", this.id, ", last4=", this.last4, ", isDefault=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.isDefault, ", nickname=", this.nickname, ", bankAccountName=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.bankAccountName, ", bankIconCode=", this.bankIconCode, ", billingAddress=");
            m.append(this.billingAddress);
            m.append(", billingEmailAddress=");
            m.append(this.billingEmailAddress);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
            parcel.writeString(this.last4);
            parcel.writeInt(this.isDefault ? 1 : 0);
            parcel.writeString(this.nickname);
            parcel.writeString(this.bankAccountName);
            parcel.writeString(this.bankIconCode);
            BillingAddress billingAddress = this.billingAddress;
            if (billingAddress == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                billingAddress.writeToParcel(parcel, i);
            }
            parcel.writeString(this.billingEmailAddress);
        }
    }

    public final class BillingAddress implements Parcelable {
        public static final Parcelable.Creator<BillingAddress> CREATOR = new Card.Creator(20);
        public final String administrativeArea;
        public final CountryCode countryCode;
        public final String line1;
        public final String line2;
        public final String locality;
        public final String name;
        public final String postalCode;

        public BillingAddress(String str, String str2, String str3, String str4, String str5, String str6, CountryCode countryCode) {
            this.name = str;
            this.line1 = str2;
            this.line2 = str3;
            this.administrativeArea = str4;
            this.locality = str5;
            this.postalCode = str6;
            this.countryCode = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingAddress)) {
                return false;
            }
            BillingAddress billingAddress = (BillingAddress) obj;
            return Intrinsics.areEqual(this.name, billingAddress.name) && Intrinsics.areEqual(this.line1, billingAddress.line1) && Intrinsics.areEqual(this.line2, billingAddress.line2) && Intrinsics.areEqual(this.administrativeArea, billingAddress.administrativeArea) && Intrinsics.areEqual(this.locality, billingAddress.locality) && Intrinsics.areEqual(this.postalCode, billingAddress.postalCode) && Intrinsics.areEqual(this.countryCode, billingAddress.countryCode);
        }

        public final int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.line1;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.line2;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.administrativeArea;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locality;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.postalCode;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            CountryCode countryCode = this.countryCode;
            return hashCode6 + (countryCode != null ? countryCode.value.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BillingAddress(name=", this.name, ", line1=", this.line1, ", line2=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.line2, ", administrativeArea=", this.administrativeArea, ", locality=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.locality, ", postalCode=", this.postalCode, ", countryCode=");
            m.append(this.countryCode);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.line1);
            parcel.writeString(this.line2);
            parcel.writeString(this.administrativeArea);
            parcel.writeString(this.locality);
            parcel.writeString(this.postalCode);
            parcel.writeParcelable(this.countryCode, i);
        }
    }

    public final class Card extends zzco {
        public static final Parcelable.Creator<Card> CREATOR = new Card.Creator(21);
        public final BillingAddress billingAddress;
        public final String billingEmailAddress;
        public final CardBrand brand;
        public final CvcCheck cvcCheck;
        public final int expiryMonth;
        public final int expiryYear;
        public final Funding funding;
        public final String id;
        public final boolean isDefault;
        public final String last4;
        public final List networks;
        public final String nickname;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Funding {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ Funding[] $VALUES;
            public static final POPMatchingFactory Companion;
            public static final Funding Unknown;
            public final String code;

            static {
                KClasses$$Lambda$1 kClasses$$Lambda$1 = CardFunding.Companion;
                Funding funding = new Funding("Credit", 0, "CREDIT");
                KClasses$$Lambda$1 kClasses$$Lambda$12 = CardFunding.Companion;
                Funding funding2 = new Funding("Debit", 1, "DEBIT");
                KClasses$$Lambda$1 kClasses$$Lambda$13 = CardFunding.Companion;
                Funding funding3 = new Funding("Prepaid", 2, "PREPAID");
                KClasses$$Lambda$1 kClasses$$Lambda$14 = CardFunding.Companion;
                Funding funding4 = new Funding("Unknown", 3, "UNKNOWN");
                Unknown = funding4;
                Funding[] fundingArr = {funding, funding2, funding3, funding4};
                $VALUES = fundingArr;
                $ENTRIES = new EnumEntriesList(fundingArr);
                Companion = new POPMatchingFactory(12);
            }

            public Funding(String str, int i, String str2) {
                this.code = str2;
            }

            public static Funding valueOf(String str) {
                return (Funding) Enum.valueOf(Funding.class, str);
            }

            public static Funding[] values() {
                return (Funding[]) $VALUES.clone();
            }
        }

        public Card(String str, String str2, boolean z, String str3, BillingAddress billingAddress, String str4, int i, int i2, CardBrand cardBrand, List list, CvcCheck cvcCheck, Funding funding) {
            str.getClass();
            str2.getClass();
            cardBrand.getClass();
            list.getClass();
            cvcCheck.getClass();
            funding.getClass();
            this.id = str;
            this.last4 = str2;
            this.isDefault = z;
            this.nickname = str3;
            this.billingAddress = billingAddress;
            this.billingEmailAddress = str4;
            this.expiryYear = i;
            this.expiryMonth = i2;
            this.brand = cardBrand;
            this.networks = list;
            this.cvcCheck = cvcCheck;
            this.funding = funding;
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
            return Intrinsics.areEqual(this.id, card.id) && Intrinsics.areEqual(this.last4, card.last4) && this.isDefault == card.isDefault && Intrinsics.areEqual(this.nickname, card.nickname) && Intrinsics.areEqual(this.billingAddress, card.billingAddress) && Intrinsics.areEqual(this.billingEmailAddress, card.billingEmailAddress) && this.expiryYear == card.expiryYear && this.expiryMonth == card.expiryMonth && this.brand == card.brand && Intrinsics.areEqual(this.networks, card.networks) && this.cvcCheck == card.cvcCheck && this.funding == card.funding;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.last4), 31, this.isDefault);
            String str = this.nickname;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            BillingAddress billingAddress = this.billingAddress;
            int hashCode2 = (hashCode + (billingAddress == null ? 0 : billingAddress.hashCode())) * 31;
            String str2 = this.billingEmailAddress;
            return this.funding.hashCode() + ((this.cvcCheck.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.brand.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expiryMonth, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expiryYear, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31)) * 31, 31, this.networks)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Card(id=", this.id, ", last4=", this.last4, ", isDefault=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.isDefault, ", nickname=", this.nickname, ", billingAddress=");
            m.append(this.billingAddress);
            m.append(", billingEmailAddress=");
            m.append(this.billingEmailAddress);
            m.append(", expiryYear=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.expiryYear, this.expiryMonth, ", expiryMonth=", ", brand=", m);
            m.append(this.brand);
            m.append(", networks=");
            m.append(this.networks);
            m.append(", cvcCheck=");
            m.append(this.cvcCheck);
            m.append(", funding=");
            m.append(this.funding);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
            parcel.writeString(this.last4);
            parcel.writeInt(this.isDefault ? 1 : 0);
            parcel.writeString(this.nickname);
            BillingAddress billingAddress = this.billingAddress;
            if (billingAddress == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                billingAddress.writeToParcel(parcel, i);
            }
            parcel.writeString(this.billingEmailAddress);
            parcel.writeInt(this.expiryYear);
            parcel.writeInt(this.expiryMonth);
            parcel.writeString(this.brand.name());
            parcel.writeStringList(this.networks);
            parcel.writeString(this.cvcCheck.name());
            parcel.writeString(this.funding.name());
        }
    }

    public ConsumerPaymentDetails(List list) {
        list.getClass();
        this.paymentDetails = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumerPaymentDetails) && Intrinsics.areEqual(this.paymentDetails, ((ConsumerPaymentDetails) obj).paymentDetails);
    }

    public final int hashCode() {
        return this.paymentDetails.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("ConsumerPaymentDetails(paymentDetails=", ")", this.paymentDetails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.paymentDetails, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
