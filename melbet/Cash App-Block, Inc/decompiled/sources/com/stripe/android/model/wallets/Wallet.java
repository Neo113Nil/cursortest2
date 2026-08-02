package com.stripe.android.model.wallets;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Address;
import com.stripe.android.model.Token;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.Plane;
import sqip.internal.nonce.CreateNonceCall;

/* loaded from: classes8.dex */
public abstract class Wallet implements StripeModel {
    public final Type walletType;

    public final class AmexExpressCheckoutWallet extends Wallet {
        public static final Parcelable.Creator<AmexExpressCheckoutWallet> CREATOR = new Token.Creator(5);
        public final String dynamicLast4;

        public AmexExpressCheckoutWallet(String str) {
            super(Type.AmexExpressCheckout);
            this.dynamicLast4 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmexExpressCheckoutWallet) && Intrinsics.areEqual(this.dynamicLast4, ((AmexExpressCheckoutWallet) obj).dynamicLast4);
        }

        public final int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmexExpressCheckoutWallet(dynamicLast4=", this.dynamicLast4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dynamicLast4);
        }
    }

    public final class ApplePayWallet extends Wallet {
        public static final Parcelable.Creator<ApplePayWallet> CREATOR = new Token.Creator(6);
        public final String dynamicLast4;

        public ApplePayWallet(String str) {
            super(Type.ApplePay);
            this.dynamicLast4 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplePayWallet) && Intrinsics.areEqual(this.dynamicLast4, ((ApplePayWallet) obj).dynamicLast4);
        }

        public final int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ApplePayWallet(dynamicLast4=", this.dynamicLast4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dynamicLast4);
        }
    }

    public final class GooglePayWallet extends Wallet {
        public static final Parcelable.Creator<GooglePayWallet> CREATOR = new Token.Creator(7);
        public final String dynamicLast4;

        public GooglePayWallet(String str) {
            super(Type.GooglePay);
            this.dynamicLast4 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GooglePayWallet) && Intrinsics.areEqual(this.dynamicLast4, ((GooglePayWallet) obj).dynamicLast4);
        }

        public final int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GooglePayWallet(dynamicLast4=", this.dynamicLast4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dynamicLast4);
        }
    }

    public final class LinkWallet extends Wallet {
        public static final Parcelable.Creator<LinkWallet> CREATOR = new Token.Creator(8);
        public final String dynamicLast4;

        public LinkWallet(String str) {
            super(Type.Link);
            this.dynamicLast4 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkWallet) && Intrinsics.areEqual(this.dynamicLast4, ((LinkWallet) obj).dynamicLast4);
        }

        public final int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkWallet(dynamicLast4=", this.dynamicLast4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dynamicLast4);
        }
    }

    public final class MasterpassWallet extends Wallet {
        public static final Parcelable.Creator<MasterpassWallet> CREATOR = new Token.Creator(9);
        public final Address billingAddress;
        public final String email;
        public final String name;
        public final Address shippingAddress;

        public MasterpassWallet(Address address, String str, String str2, Address address2) {
            super(Type.Masterpass);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MasterpassWallet)) {
                return false;
            }
            MasterpassWallet masterpassWallet = (MasterpassWallet) obj;
            return Intrinsics.areEqual(this.billingAddress, masterpassWallet.billingAddress) && Intrinsics.areEqual(this.email, masterpassWallet.email) && Intrinsics.areEqual(this.name, masterpassWallet.name) && Intrinsics.areEqual(this.shippingAddress, masterpassWallet.shippingAddress);
        }

        public final int hashCode() {
            Address address = this.billingAddress;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address2 = this.shippingAddress;
            return hashCode3 + (address2 != null ? address2.hashCode() : 0);
        }

        public final String toString() {
            return "MasterpassWallet(billingAddress=" + this.billingAddress + ", email=" + this.email + ", name=" + this.name + ", shippingAddress=" + this.shippingAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Address address = this.billingAddress;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, i);
            }
        }
    }

    public final class SamsungPayWallet extends Wallet {
        public static final Parcelable.Creator<SamsungPayWallet> CREATOR = new Token.Creator(10);
        public final String dynamicLast4;

        public SamsungPayWallet(String str) {
            super(Type.SamsungPay);
            this.dynamicLast4 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SamsungPayWallet) && Intrinsics.areEqual(this.dynamicLast4, ((SamsungPayWallet) obj).dynamicLast4);
        }

        public final int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SamsungPayWallet(dynamicLast4=", this.dynamicLast4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dynamicLast4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type AmexExpressCheckout;
        public static final Type ApplePay;
        public static final Plane Companion;
        public static final Type GooglePay;
        public static final Type Link;
        public static final Type Masterpass;
        public static final Type SamsungPay;
        public static final Type VisaCheckout;
        public final String code;

        static {
            Type type2 = new Type("AmexExpressCheckout", 0, "amex_express_checkout");
            AmexExpressCheckout = type2;
            Type type3 = new Type("ApplePay", 1, "apple_pay");
            ApplePay = type3;
            Type type4 = new Type("GooglePay", 2, CreateNonceCall.DEBUG_CODE_PREFIX);
            GooglePay = type4;
            Type type5 = new Type("Masterpass", 3, "master_pass");
            Masterpass = type5;
            Type type6 = new Type("SamsungPay", 4, "samsung_pay");
            SamsungPay = type6;
            Type type7 = new Type("VisaCheckout", 5, "visa_checkout");
            VisaCheckout = type7;
            Type type8 = new Type("Link", 6, "link");
            Link = type8;
            Type[] typeArr = {type2, type3, type4, type5, type6, type7, type8};
            $VALUES = typeArr;
            $ENTRIES = new EnumEntriesList(typeArr);
            Companion = new Plane(15);
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

    public final class VisaCheckoutWallet extends Wallet {
        public static final Parcelable.Creator<VisaCheckoutWallet> CREATOR = new Token.Creator(11);
        public final Address billingAddress;
        public final String dynamicLast4;
        public final String email;
        public final String name;
        public final Address shippingAddress;

        public VisaCheckoutWallet(Address address, String str, String str2, Address address2, String str3) {
            super(Type.VisaCheckout);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
            this.dynamicLast4 = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VisaCheckoutWallet)) {
                return false;
            }
            VisaCheckoutWallet visaCheckoutWallet = (VisaCheckoutWallet) obj;
            return Intrinsics.areEqual(this.billingAddress, visaCheckoutWallet.billingAddress) && Intrinsics.areEqual(this.email, visaCheckoutWallet.email) && Intrinsics.areEqual(this.name, visaCheckoutWallet.name) && Intrinsics.areEqual(this.shippingAddress, visaCheckoutWallet.shippingAddress) && Intrinsics.areEqual(this.dynamicLast4, visaCheckoutWallet.dynamicLast4);
        }

        public final int hashCode() {
            Address address = this.billingAddress;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address2 = this.shippingAddress;
            int hashCode4 = (hashCode3 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str3 = this.dynamicLast4;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisaCheckoutWallet(billingAddress=");
            sb.append(this.billingAddress);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", shippingAddress=");
            sb.append(this.shippingAddress);
            sb.append(", dynamicLast4=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.dynamicLast4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Address address = this.billingAddress;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.dynamicLast4);
        }
    }

    public Wallet(Type type2) {
        this.walletType = type2;
    }
}
