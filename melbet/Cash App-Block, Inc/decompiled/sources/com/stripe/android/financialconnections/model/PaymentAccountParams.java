package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.financialconnections.model.ServerLink;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class PaymentAccountParams implements Parcelable {

    /* renamed from: type, reason: collision with root package name */
    public final String f1433type;

    public final class BankAccount extends PaymentAccountParams {
        public static final Parcelable.Creator<BankAccount> CREATOR = new ServerLink.Creator(9);
        public final String accountNumber;
        public final String routingNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccount(String str, String str2) {
            super("bank_account");
            str.getClass();
            str2.getClass();
            this.routingNumber = str;
            this.accountNumber = str2;
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
            return Intrinsics.areEqual(this.routingNumber, bankAccount.routingNumber) && Intrinsics.areEqual(this.accountNumber, bankAccount.accountNumber);
        }

        public final int hashCode() {
            return this.accountNumber.hashCode() + (this.routingNumber.hashCode() * 31);
        }

        @Override // com.stripe.android.financialconnections.model.PaymentAccountParams
        public final Map toParamMap() {
            String str = this.f1433type;
            return MapsKt__MapsKt.mapOf(new Pair("type", str), new Pair(str.concat("[routing_number]"), this.routingNumber), new Pair(str.concat("[account_number]"), this.accountNumber));
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("BankAccount(routingNumber=", this.routingNumber, ", accountNumber=", this.accountNumber, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.routingNumber);
            parcel.writeString(this.accountNumber);
        }
    }

    public final class LinkedAccount extends PaymentAccountParams {
        public static final Parcelable.Creator<LinkedAccount> CREATOR = new ServerLink.Creator(10);
        public final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedAccount(String str) {
            super("linked_account");
            str.getClass();
            this.id = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkedAccount) && Intrinsics.areEqual(this.id, ((LinkedAccount) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        @Override // com.stripe.android.financialconnections.model.PaymentAccountParams
        public final Map toParamMap() {
            String str = this.f1433type;
            return MapsKt__MapsKt.mapOf(new Pair("type", str), new Pair(str.concat("[id]"), this.id));
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkedAccount(id=", this.id, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
        }
    }

    public PaymentAccountParams(String str) {
        this.f1433type = str;
    }

    public abstract Map toParamMap();
}
