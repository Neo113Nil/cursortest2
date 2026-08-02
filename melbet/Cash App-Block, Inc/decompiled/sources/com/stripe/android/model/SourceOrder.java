package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SourceOrder implements StripeModel {
    public static final Parcelable.Creator<SourceOrder> CREATOR = new Source.Creator(29);
    public final Integer amount;
    public final String currency;
    public final String email;
    public final ArrayList items;
    public final Shipping shipping;

    public final class Item implements StripeModel {
        public static final Parcelable.Creator<Item> CREATOR = new SourceParams.Creator(1);
        public final Integer amount;
        public final String currency;
        public final String description;
        public final Integer quantity;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1444type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES = {new Type("Sku", 0), new Type("Tax", 1), new Type("Shipping", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            Type EF5;

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Item(Type type2, Integer num, String str, String str2, Integer num2) {
            type2.getClass();
            this.f1444type = type2;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.quantity = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.f1444type == item.f1444type && Intrinsics.areEqual(this.amount, item.amount) && Intrinsics.areEqual(this.currency, item.currency) && Intrinsics.areEqual(this.description, item.description) && Intrinsics.areEqual(this.quantity, item.quantity);
        }

        public final int hashCode() {
            int hashCode = this.f1444type.hashCode() * 31;
            Integer num = this.amount;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.currency;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.quantity;
            return hashCode4 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(type=");
            sb.append(this.f1444type);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", currency=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.currency, ", description=", this.description, ", quantity=");
            return NavAction$$ExternalSyntheticOutline0.m(sb, this.quantity, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f1444type.name());
            Integer num = this.amount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeString(this.currency);
            parcel.writeString(this.description);
            Integer num2 = this.quantity;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
            }
        }
    }

    public final class Shipping implements StripeModel {
        public static final Parcelable.Creator<Shipping> CREATOR = new SourceParams.Creator(2);
        public final Address address;
        public final String carrier;
        public final String name;
        public final String phone;
        public final String trackingNumber;

        public Shipping(Address address, String str, String str2, String str3, String str4) {
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
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
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
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.carrier);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }
    }

    public SourceOrder(Integer num, String str, String str2, ArrayList arrayList, Shipping shipping) {
        this.amount = num;
        this.currency = str;
        this.email = str2;
        this.items = arrayList;
        this.shipping = shipping;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceOrder)) {
            return false;
        }
        SourceOrder sourceOrder = (SourceOrder) obj;
        return Intrinsics.areEqual(this.amount, sourceOrder.amount) && Intrinsics.areEqual(this.currency, sourceOrder.currency) && Intrinsics.areEqual(this.email, sourceOrder.email) && this.items.equals(sourceOrder.items) && Intrinsics.areEqual(this.shipping, sourceOrder.shipping);
    }

    public final int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Shipping shipping = this.shipping;
        return m + (shipping != null ? shipping.hashCode() : 0);
    }

    public final String toString() {
        return "SourceOrder(amount=" + this.amount + ", currency=" + this.currency + ", email=" + this.email + ", items=" + this.items + ", shipping=" + this.shipping + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.amount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeString(this.currency);
        parcel.writeString(this.email);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.items, parcel);
        while (m.hasNext()) {
            ((Item) m.next()).writeToParcel(parcel, i);
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shipping.writeToParcel(parcel, i);
        }
    }
}
