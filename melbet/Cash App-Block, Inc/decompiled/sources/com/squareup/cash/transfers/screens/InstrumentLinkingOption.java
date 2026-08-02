package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.protos.franklin.api.CashInstrumentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface InstrumentLinkingOption extends Parcelable {

    public final class Link implements InstrumentLinkingOption, Parcelable {
        public static final Parcelable.Creator<Link> CREATOR = new TaxMenuSheet.Creator(20);
        public final CashInstrumentType cashInstrumentType;

        public Link(CashInstrumentType cashInstrumentType) {
            cashInstrumentType.getClass();
            this.cashInstrumentType = cashInstrumentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Link) && this.cashInstrumentType == ((Link) obj).cashInstrumentType;
        }

        @Override // com.squareup.cash.transfers.screens.InstrumentLinkingOption
        public final CashInstrumentType getCashInstrumentType() {
            return this.cashInstrumentType;
        }

        public final int hashCode() {
            return this.cashInstrumentType.hashCode();
        }

        public final String toString() {
            return "Link(cashInstrumentType=" + this.cashInstrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.cashInstrumentType.name());
        }
    }

    public final class Replace implements InstrumentLinkingOption, Parcelable {
        public static final Parcelable.Creator<Replace> CREATOR = new TaxMenuSheet.Creator(21);
        public final CashInstrumentType cashInstrumentType;

        public Replace(CashInstrumentType cashInstrumentType) {
            cashInstrumentType.getClass();
            this.cashInstrumentType = cashInstrumentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Replace) && this.cashInstrumentType == ((Replace) obj).cashInstrumentType;
        }

        @Override // com.squareup.cash.transfers.screens.InstrumentLinkingOption
        public final CashInstrumentType getCashInstrumentType() {
            return this.cashInstrumentType;
        }

        public final int hashCode() {
            return this.cashInstrumentType.hashCode();
        }

        public final String toString() {
            return "Replace(cashInstrumentType=" + this.cashInstrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.cashInstrumentType.name());
        }
    }

    public final class ReplaceInstrument implements InstrumentLinkingOption, Parcelable {
        public static final Parcelable.Creator<ReplaceInstrument> CREATOR = new TaxMenuSheet.Creator(22);
        public final CashInstrumentType cashInstrumentType;
        public final String instrumentToken;

        public ReplaceInstrument(CashInstrumentType cashInstrumentType, String str) {
            cashInstrumentType.getClass();
            str.getClass();
            this.cashInstrumentType = cashInstrumentType;
            this.instrumentToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReplaceInstrument)) {
                return false;
            }
            ReplaceInstrument replaceInstrument = (ReplaceInstrument) obj;
            return this.cashInstrumentType == replaceInstrument.cashInstrumentType && Intrinsics.areEqual(this.instrumentToken, replaceInstrument.instrumentToken);
        }

        @Override // com.squareup.cash.transfers.screens.InstrumentLinkingOption
        public final CashInstrumentType getCashInstrumentType() {
            return this.cashInstrumentType;
        }

        public final int hashCode() {
            return this.instrumentToken.hashCode() + (this.cashInstrumentType.hashCode() * 31);
        }

        public final String toString() {
            return "ReplaceInstrument(cashInstrumentType=" + this.cashInstrumentType + ", instrumentToken=" + this.instrumentToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.cashInstrumentType.name());
            parcel.writeString(this.instrumentToken);
        }
    }

    CashInstrumentType getCashInstrumentType();
}
