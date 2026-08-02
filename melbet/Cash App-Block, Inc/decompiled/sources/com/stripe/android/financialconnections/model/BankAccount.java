package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class BankAccount extends PaymentAccount {
    public final String bankName;
    public final String id;
    public final String last4;
    public final String routingNumber;
    public final boolean usesMicrodeposits;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<BankAccount> CREATOR = new Cta.Creator(2);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/BankAccount$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/BankAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return BankAccount$$serializer.INSTANCE;
        }
    }

    public BankAccount(int i, String str, String str2, String str3, String str4, boolean z) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, BankAccount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.last4 = str2;
        if ((i & 4) == 0) {
            this.bankName = null;
        } else {
            this.bankName = str3;
        }
        if ((i & 8) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str4;
        }
        if ((i & 16) == 0) {
            this.usesMicrodeposits = true;
        } else {
            this.usesMicrodeposits = z;
        }
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
        return Intrinsics.areEqual(this.id, bankAccount.id) && Intrinsics.areEqual(this.last4, bankAccount.last4) && Intrinsics.areEqual(this.bankName, bankAccount.bankName) && Intrinsics.areEqual(this.routingNumber, bankAccount.routingNumber) && this.usesMicrodeposits == bankAccount.usesMicrodeposits;
    }

    @Override // com.stripe.android.financialconnections.model.PaymentAccount
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.last4);
        String str = this.bankName;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return Boolean.hashCode(this.usesMicrodeposits) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BankAccount(id=", this.id, ", last4=", this.last4, ", bankName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.bankName, ", routingNumber=", this.routingNumber, ", usesMicrodeposits=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.usesMicrodeposits, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.last4);
        parcel.writeString(this.bankName);
        parcel.writeString(this.routingNumber);
        parcel.writeInt(this.usesMicrodeposits ? 1 : 0);
    }

    public BankAccount(String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.last4 = str2;
        this.bankName = str3;
        this.routingNumber = str4;
        this.usesMicrodeposits = z;
    }
}
