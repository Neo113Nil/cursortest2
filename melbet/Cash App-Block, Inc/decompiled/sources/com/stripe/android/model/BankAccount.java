package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.LinkResolverDef;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes8.dex */
public final class BankAccount implements StripeModel, Parcelable {
    public static final Parcelable.Creator<BankAccount> CREATOR = new Card.Creator(6);
    public final String accountHolderName;
    public final Type accountHolderType;
    public final String bankName;
    public final String countryCode;
    public final String currency;
    public final String fingerprint;
    public final String id;
    public final String last4;
    public final String routingNumber;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/stripe/android/model/BankAccount$Status", "", "Lcom/stripe/android/model/BankAccount$Status;", "", "toString", "()Ljava/lang/String;", "net/idrnd/face/iad/capture/Plane", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Status {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Status[] $VALUES;
        public static final Plane Companion;
        public final String code;

        static {
            Status[] statusArr = {new Status("New", 0, "new"), new Status("Validated", 1, "validated"), new Status("Verified", 2, "verified"), new Status("VerificationFailed", 3, "verification_failed"), new Status("Errored", 4, "errored")};
            $VALUES = statusArr;
            $ENTRIES = new EnumEntriesList(statusArr);
            Companion = new Plane(11);
        }

        public Status(String str, int i, String str2) {
            this.code = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/stripe/android/model/BankAccount$Type", "", "Lcom/stripe/android/model/BankAccount$Type;", "", "toString", "()Ljava/lang/String;", "io/noties/markwon/LinkResolverDef", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Type {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public static final LinkResolverDef Companion;
        public final String code;

        static {
            Type[] typeArr = {new Type("Company", 0, "company"), new Type("Individual", 1, "individual")};
            $VALUES = typeArr;
            $ENTRIES = new EnumEntriesList(typeArr);
            Companion = new LinkResolverDef(11);
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

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public BankAccount(String str, String str2, Type type2, String str3, String str4, String str5, String str6, String str7, String str8, Status status) {
        this.id = str;
        this.accountHolderName = str2;
        this.accountHolderType = type2;
        this.bankName = str3;
        this.countryCode = str4;
        this.currency = str5;
        this.fingerprint = str6;
        this.last4 = str7;
        this.routingNumber = str8;
        this.status = status;
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
        return Intrinsics.areEqual(this.id, bankAccount.id) && Intrinsics.areEqual(this.accountHolderName, bankAccount.accountHolderName) && this.accountHolderType == bankAccount.accountHolderType && Intrinsics.areEqual(this.bankName, bankAccount.bankName) && Intrinsics.areEqual(this.countryCode, bankAccount.countryCode) && Intrinsics.areEqual(this.currency, bankAccount.currency) && Intrinsics.areEqual(this.fingerprint, bankAccount.fingerprint) && Intrinsics.areEqual(this.last4, bankAccount.last4) && Intrinsics.areEqual(this.routingNumber, bankAccount.routingNumber) && this.status == bankAccount.status;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountHolderName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type2 = this.accountHolderType;
        int hashCode3 = (hashCode2 + (type2 == null ? 0 : type2.hashCode())) * 31;
        String str3 = this.bankName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fingerprint;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.last4;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.routingNumber;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Status status = this.status;
        return hashCode9 + (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BankAccount(id=", this.id, ", accountHolderName=", this.accountHolderName, ", accountHolderType=");
        m.append(this.accountHolderType);
        m.append(", bankName=");
        m.append(this.bankName);
        m.append(", countryCode=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.countryCode, ", currency=", this.currency, ", fingerprint=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.fingerprint, ", last4=", this.last4, ", routingNumber=");
        m.append(this.routingNumber);
        m.append(", status=");
        m.append(this.status);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.accountHolderName);
        Type type2 = this.accountHolderType;
        if (type2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type2.name());
        }
        parcel.writeString(this.bankName);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.currency);
        parcel.writeString(this.fingerprint);
        parcel.writeString(this.last4);
        parcel.writeString(this.routingNumber);
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
    }
}
