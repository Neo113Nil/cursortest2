package com.squareup.cash.transfers.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.franklin.api.CashInstrumentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface InstrumentLinkingOptionsViewEvent {

    public final class Close implements InstrumentLinkingOptionsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -227356741;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class LinkClick implements InstrumentLinkingOptionsViewEvent {
        public final CashInstrumentType cashInstrumentType;

        public LinkClick(CashInstrumentType cashInstrumentType) {
            cashInstrumentType.getClass();
            this.cashInstrumentType = cashInstrumentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkClick) && this.cashInstrumentType == ((LinkClick) obj).cashInstrumentType;
        }

        public final int hashCode() {
            return this.cashInstrumentType.hashCode();
        }

        public final String toString() {
            return "LinkClick(cashInstrumentType=" + this.cashInstrumentType + ")";
        }
    }

    public final class ReplaceClick implements InstrumentLinkingOptionsViewEvent {
        public final CashInstrumentType cashInstrumentType;

        public ReplaceClick(CashInstrumentType cashInstrumentType) {
            cashInstrumentType.getClass();
            this.cashInstrumentType = cashInstrumentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReplaceClick) && this.cashInstrumentType == ((ReplaceClick) obj).cashInstrumentType;
        }

        public final int hashCode() {
            return this.cashInstrumentType.hashCode();
        }

        public final String toString() {
            return "ReplaceClick(cashInstrumentType=" + this.cashInstrumentType + ")";
        }
    }

    public final class ReplaceInstrumentClick implements InstrumentLinkingOptionsViewEvent {
        public final CashInstrumentType cashInstrumentType;
        public final String instrumentToken;

        public ReplaceInstrumentClick(CashInstrumentType cashInstrumentType, String str) {
            cashInstrumentType.getClass();
            str.getClass();
            this.cashInstrumentType = cashInstrumentType;
            this.instrumentToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReplaceInstrumentClick)) {
                return false;
            }
            ReplaceInstrumentClick replaceInstrumentClick = (ReplaceInstrumentClick) obj;
            return this.cashInstrumentType == replaceInstrumentClick.cashInstrumentType && Intrinsics.areEqual(this.instrumentToken, replaceInstrumentClick.instrumentToken);
        }

        public final int hashCode() {
            return this.instrumentToken.hashCode() + (this.cashInstrumentType.hashCode() * 31);
        }

        public final String toString() {
            return "ReplaceInstrumentClick(cashInstrumentType=" + this.cashInstrumentType + ", instrumentToken=" + this.instrumentToken + ")";
        }
    }
}
