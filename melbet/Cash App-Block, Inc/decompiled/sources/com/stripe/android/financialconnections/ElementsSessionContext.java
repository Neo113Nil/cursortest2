package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.Token;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ElementsSessionContext implements Parcelable {
    public static final Parcelable.Creator<ElementsSessionContext> CREATOR = new Creator(0);
    public final AllowRedisplay allowRedisplay;
    public final Long amount;
    public final BillingDetails billingDetails;
    public final String currency;
    public final LinkMode linkMode;
    public final PrefillDetails prefillDetails;

    public enum AllowRedisplay implements StripeModel {
        /* JADX INFO: Fake field, exist only in values array */
        Unspecified("unspecified"),
        /* JADX INFO: Fake field, exist only in values array */
        Limited("limited"),
        /* JADX INFO: Fake field, exist only in values array */
        Always("always");

        public static final Parcelable.Creator<AllowRedisplay> CREATOR = new Creator(1);
        public final String value;

        AllowRedisplay(String str) {
            this.value = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }

    public final class BillingDetails implements Parcelable {
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator(3);
        public final Address address;
        public final String email;
        public final String name;
        public final String phone;

        public final class Address implements Parcelable {
            public static final Parcelable.Creator<Address> CREATOR = new Creator(2);
            public final String city;
            public final String country;
            public final String line1;
            public final String line2;
            public final String postalCode;
            public final String state;

            public Address(String str, String str2, String str3, String str4, String str5, String str6) {
                this.line1 = str;
                this.line2 = str2;
                this.postalCode = str3;
                this.city = str4;
                this.state = str5;
                this.country = str6;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Address)) {
                    return false;
                }
                Address address = (Address) obj;
                return Intrinsics.areEqual(this.line1, address.line1) && Intrinsics.areEqual(this.line2, address.line2) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.state, address.state) && Intrinsics.areEqual(this.country, address.country);
            }

            public final int hashCode() {
                String str = this.line1;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.line2;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.postalCode;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.city;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.state;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.country;
                return hashCode5 + (str6 != null ? str6.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Address(line1=", this.line1, ", line2=", this.line2, ", postalCode=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.postalCode, ", city=", this.city, ", state=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.state, ", country=", this.country, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.line1);
                parcel.writeString(this.line2);
                parcel.writeString(this.postalCode);
                parcel.writeString(this.city);
                parcel.writeString(this.state);
                parcel.writeString(this.country);
            }
        }

        public BillingDetails(String str, String str2, String str3, Address address) {
            this.name = str;
            this.phone = str2;
            this.email = str3;
            this.address = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) obj;
            return Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.address, billingDetails.address);
        }

        public final int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.phone;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address = this.address;
            return hashCode3 + (address != null ? address.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BillingDetails(name=", this.name, ", phone=", this.phone, ", email=");
            m.append(this.email);
            m.append(", address=");
            m.append(this.address);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.email);
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
        }
    }

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
                    Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    String readString = parcel.readString();
                    LinkMode valueOf2 = parcel.readInt() == 0 ? null : LinkMode.valueOf(parcel.readString());
                    AllowRedisplay createFromParcel = parcel.readInt() == 0 ? null : AllowRedisplay.CREATOR.createFromParcel(parcel);
                    BillingDetails createFromParcel2 = parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel);
                    PrefillDetails createFromParcel3 = PrefillDetails.CREATOR.createFromParcel(parcel);
                    if (parcel.readParcelable(ElementsSessionContext.class.getClassLoader()) == null) {
                        return new ElementsSessionContext(valueOf, readString, valueOf2, createFromParcel, createFromParcel2, createFromParcel3);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                case 1:
                    parcel.getClass();
                    return AllowRedisplay.valueOf(parcel.readString());
                case 2:
                    parcel.getClass();
                    return new BillingDetails.Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 3:
                    parcel.getClass();
                    return new BillingDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? BillingDetails.Address.CREATOR.createFromParcel(parcel) : null);
                case 4:
                    parcel.getClass();
                    return new PrefillDetails(parcel.readString(), parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new FinancialConnectionsSheetConfiguration(parcel.readString(), parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return FinancialConnectionsSheetForTokenResult$Canceled.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new FinancialConnectionsSheetForTokenResult$Completed(FinancialConnectionsSession.CREATOR.createFromParcel(parcel), (Token) parcel.readParcelable(FinancialConnectionsSheetForTokenResult$Completed.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new FinancialConnectionsSheetForTokenResult$Failed((Throwable) parcel.readSerializable());
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return FinancialConnectionsSheetResult.Canceled.INSTANCE;
                case 10:
                    parcel.getClass();
                    return new FinancialConnectionsSheetResult.Completed(FinancialConnectionsSession.CREATOR.createFromParcel(parcel));
                default:
                    parcel.getClass();
                    return new FinancialConnectionsSheetResult.Failed((Throwable) parcel.readSerializable());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ElementsSessionContext[i];
                case 1:
                    return new AllowRedisplay[i];
                case 2:
                    return new BillingDetails.Address[i];
                case 3:
                    return new BillingDetails[i];
                case 4:
                    return new PrefillDetails[i];
                case 5:
                    return new FinancialConnectionsSheetConfiguration[i];
                case 6:
                    return new FinancialConnectionsSheetForTokenResult$Canceled[i];
                case 7:
                    return new FinancialConnectionsSheetForTokenResult$Completed[i];
                case 8:
                    return new FinancialConnectionsSheetForTokenResult$Failed[i];
                case 9:
                    return new FinancialConnectionsSheetResult.Canceled[i];
                case 10:
                    return new FinancialConnectionsSheetResult.Completed[i];
                default:
                    return new FinancialConnectionsSheetResult.Failed[i];
            }
        }
    }

    public final class PrefillDetails implements Parcelable, Serializable {
        public static final Parcelable.Creator<PrefillDetails> CREATOR = new Creator(4);
        public final String email;
        public final String phone;
        public final String phoneCountryCode;

        public PrefillDetails(String str, String str2, String str3) {
            this.email = str;
            this.phone = str2;
            this.phoneCountryCode = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrefillDetails)) {
                return false;
            }
            PrefillDetails prefillDetails = (PrefillDetails) obj;
            return Intrinsics.areEqual(this.email, prefillDetails.email) && Intrinsics.areEqual(this.phone, prefillDetails.phone) && Intrinsics.areEqual(this.phoneCountryCode, prefillDetails.phoneCountryCode);
        }

        public final int hashCode() {
            String str = this.email;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.phone;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phoneCountryCode;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PrefillDetails(email=", this.email, ", phone=", this.phone, ", phoneCountryCode="), this.phoneCountryCode, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.email);
            parcel.writeString(this.phone);
            parcel.writeString(this.phoneCountryCode);
        }
    }

    public ElementsSessionContext(Long l, String str, LinkMode linkMode, AllowRedisplay allowRedisplay, BillingDetails billingDetails, PrefillDetails prefillDetails) {
        prefillDetails.getClass();
        this.amount = l;
        this.currency = str;
        this.linkMode = linkMode;
        this.allowRedisplay = allowRedisplay;
        this.billingDetails = billingDetails;
        this.prefillDetails = prefillDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementsSessionContext)) {
            return false;
        }
        ElementsSessionContext elementsSessionContext = (ElementsSessionContext) obj;
        return Intrinsics.areEqual(this.amount, elementsSessionContext.amount) && Intrinsics.areEqual(this.currency, elementsSessionContext.currency) && this.linkMode == elementsSessionContext.linkMode && this.allowRedisplay == elementsSessionContext.allowRedisplay && Intrinsics.areEqual(this.billingDetails, elementsSessionContext.billingDetails) && Intrinsics.areEqual(this.prefillDetails, elementsSessionContext.prefillDetails);
    }

    public final int hashCode() {
        Long l = this.amount;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LinkMode linkMode = this.linkMode;
        int hashCode3 = (hashCode2 + (linkMode == null ? 0 : linkMode.hashCode())) * 31;
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        int hashCode4 = (hashCode3 + (allowRedisplay == null ? 0 : allowRedisplay.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        return (this.prefillDetails.hashCode() + ((hashCode4 + (billingDetails != null ? billingDetails.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "ElementsSessionContext(amount=" + this.amount + ", currency=" + this.currency + ", linkMode=" + this.linkMode + ", allowRedisplay=" + this.allowRedisplay + ", billingDetails=" + this.billingDetails + ", prefillDetails=" + this.prefillDetails + ", incentiveEligibilitySession=null)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Long l = this.amount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.currency);
        LinkMode linkMode = this.linkMode;
        if (linkMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkMode.name());
        }
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        if (allowRedisplay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allowRedisplay.writeToParcel(parcel, i);
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingDetails.writeToParcel(parcel, i);
        }
        this.prefillDetails.writeToParcel(parcel, i);
        parcel.writeParcelable(null, i);
    }
}
