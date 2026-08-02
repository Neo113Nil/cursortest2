package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.model.SourceParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SourceOrderParams implements Parcelable {
    public static final Parcelable.Creator<SourceOrderParams> CREATOR = new SourceParams.Creator(3);
    public final ArrayList items;
    public final Shipping shipping;

    public final class Item implements Parcelable {
        public static final Parcelable.Creator<Item> CREATOR = new SourceParams.Creator(4);
        public final Integer amount;
        public final String currency;
        public final String description;
        public final String parent;
        public final Integer quantity;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1445type;

        public enum Type {
            /* JADX INFO: Fake field, exist only in values array */
            Sku("sku"),
            /* JADX INFO: Fake field, exist only in values array */
            Tax("tax"),
            /* JADX INFO: Fake field, exist only in values array */
            Shipping("shipping");

            public final String code;

            Type(String str) {
                this.code = str;
            }
        }

        public Item(Type type2, Integer num, String str, String str2, String str3, Integer num2) {
            this.f1445type = type2;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.parent = str3;
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
            return this.f1445type == item.f1445type && Intrinsics.areEqual(this.amount, item.amount) && Intrinsics.areEqual(this.currency, item.currency) && Intrinsics.areEqual(this.description, item.description) && Intrinsics.areEqual(this.parent, item.parent) && Intrinsics.areEqual(this.quantity, item.quantity);
        }

        public final int hashCode() {
            Type type2 = this.f1445type;
            int hashCode = (type2 == null ? 0 : type2.hashCode()) * 31;
            Integer num = this.amount;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.currency;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.parent;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.quantity;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(type=");
            sb.append(this.f1445type);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", currency=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.currency, ", description=", this.description, ", parent=");
            sb.append(this.parent);
            sb.append(", quantity=");
            sb.append(this.quantity);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Type type2 = this.f1445type;
            if (type2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type2.name());
            }
            Integer num = this.amount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeString(this.currency);
            parcel.writeString(this.description);
            parcel.writeString(this.parent);
            Integer num2 = this.quantity;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
            }
        }
    }

    public final class Shipping implements Parcelable {
        public static final Parcelable.Creator<Shipping> CREATOR = new SourceParams.Creator(5);
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

    public SourceOrderParams(ArrayList arrayList, Shipping shipping) {
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
        if (!(obj instanceof SourceOrderParams)) {
            return false;
        }
        SourceOrderParams sourceOrderParams = (SourceOrderParams) obj;
        return this.items.equals(sourceOrderParams.items) && Intrinsics.areEqual(this.shipping, sourceOrderParams.shipping);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Shipping shipping = this.shipping;
        return hashCode + (shipping == null ? 0 : shipping.hashCode());
    }

    public final String toString() {
        return "SourceOrderParams(items=" + this.items + ", shipping=" + this.shipping + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
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
