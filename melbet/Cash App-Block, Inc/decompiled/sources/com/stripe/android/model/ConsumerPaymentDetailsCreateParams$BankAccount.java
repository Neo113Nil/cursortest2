package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.model.Card;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ConsumerPaymentDetailsCreateParams$BankAccount implements Parcelable {
    public static final Parcelable.Creator<ConsumerPaymentDetailsCreateParams$BankAccount> CREATOR = new Card.Creator(23);
    public final String bankAccountId;
    public final Map billingAddress;
    public final String billingEmailAddress;
    public final Map clientAttributionMetadata;

    public ConsumerPaymentDetailsCreateParams$BankAccount(String str, LinkedHashMap linkedHashMap, String str2, Map map) {
        str.getClass();
        map.getClass();
        this.bankAccountId = str;
        this.billingAddress = linkedHashMap;
        this.billingEmailAddress = str2;
        this.clientAttributionMetadata = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumerPaymentDetailsCreateParams$BankAccount)) {
            return false;
        }
        ConsumerPaymentDetailsCreateParams$BankAccount consumerPaymentDetailsCreateParams$BankAccount = (ConsumerPaymentDetailsCreateParams$BankAccount) obj;
        return Intrinsics.areEqual(this.bankAccountId, consumerPaymentDetailsCreateParams$BankAccount.bankAccountId) && Intrinsics.areEqual(this.billingAddress, consumerPaymentDetailsCreateParams$BankAccount.billingAddress) && Intrinsics.areEqual(this.billingEmailAddress, consumerPaymentDetailsCreateParams$BankAccount.billingEmailAddress) && Intrinsics.areEqual(this.clientAttributionMetadata, consumerPaymentDetailsCreateParams$BankAccount.clientAttributionMetadata);
    }

    public final int hashCode() {
        int hashCode = this.bankAccountId.hashCode() * 31;
        Map map = this.billingAddress;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.billingEmailAddress;
        return this.clientAttributionMetadata.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BankAccount(bankAccountId=" + this.bankAccountId + ", billingAddress=" + this.billingAddress + ", billingEmailAddress=" + this.billingEmailAddress + ", clientAttributionMetadata=" + this.clientAttributionMetadata + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.bankAccountId);
        Map map = this.billingAddress;
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
        parcel.writeString(this.billingEmailAddress);
        Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.clientAttributionMetadata, parcel);
        while (m2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) m2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
    }
}
