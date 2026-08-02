package com.stripe.android.payments.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.model.Token;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface CollectBankAccountConfiguration extends Parcelable {

    public final class InstantDebits implements Parcelable, CollectBankAccountConfiguration {
        public static final Parcelable.Creator<InstantDebits> CREATOR = new Token.Creator(13);
        public final ElementsSessionContext elementsSessionContext;
        public final String email;

        public InstantDebits(String str, ElementsSessionContext elementsSessionContext) {
            this.email = str;
            this.elementsSessionContext = elementsSessionContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstantDebits)) {
                return false;
            }
            InstantDebits instantDebits = (InstantDebits) obj;
            return Intrinsics.areEqual(this.email, instantDebits.email) && Intrinsics.areEqual(this.elementsSessionContext, instantDebits.elementsSessionContext);
        }

        public final int hashCode() {
            String str = this.email;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return hashCode + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public final String toString() {
            return "InstantDebits(email=" + this.email + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.email);
            parcel.writeParcelable(this.elementsSessionContext, i);
        }
    }

    public final class USBankAccount implements CollectBankAccountConfiguration {
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Token.Creator(14);
        public final String email;
        public final String name;

        public USBankAccount(String str, String str2) {
            str.getClass();
            this.name = str;
            this.email = str2;
        }

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
            return Intrinsics.areEqual(this.name, uSBankAccount.name) && Intrinsics.areEqual(this.email, uSBankAccount.email);
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("USBankAccount(name=", this.name, ", email=", this.email, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.email);
        }
    }

    public final class USBankAccountInternal implements Parcelable, CollectBankAccountConfiguration {
        public static final Parcelable.Creator<USBankAccountInternal> CREATOR = new Token.Creator(15);
        public final ElementsSessionContext elementsSessionContext;
        public final String email;
        public final String name;

        public USBankAccountInternal(String str, String str2, ElementsSessionContext elementsSessionContext) {
            str.getClass();
            this.name = str;
            this.email = str2;
            this.elementsSessionContext = elementsSessionContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof USBankAccountInternal)) {
                return false;
            }
            USBankAccountInternal uSBankAccountInternal = (USBankAccountInternal) obj;
            return Intrinsics.areEqual(this.name, uSBankAccountInternal.name) && Intrinsics.areEqual(this.email, uSBankAccountInternal.email) && Intrinsics.areEqual(this.elementsSessionContext, uSBankAccountInternal.elementsSessionContext);
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return hashCode2 + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("USBankAccountInternal(name=", this.name, ", email=", this.email, ", elementsSessionContext=");
            m.append(this.elementsSessionContext);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.email);
            parcel.writeParcelable(this.elementsSessionContext, i);
        }
    }
}
