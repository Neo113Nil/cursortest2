package com.squareup.cash.transfers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.CashInstrumentType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface LinkedAccountsViewEvent {

    public final class ExitFlow implements LinkedAccountsViewEvent {
        public static final ExitFlow INSTANCE = new ExitFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitFlow);
        }

        public final int hashCode() {
            return 2063783051;
        }

        public final String toString() {
            return "ExitFlow";
        }
    }

    public final class Link implements LinkedAccountsViewEvent {
        public final List types;

        public Link(List list) {
            list.getClass();
            this.types = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Link) && Intrinsics.areEqual(this.types, ((Link) obj).types);
        }

        public final int hashCode() {
            return this.types.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Link(types=", ")", this.types);
        }
    }

    public final class ShowCardOptionsSheet implements LinkedAccountsViewEvent {
        public final CashInstrumentType cashInstrumentType;
        public final String instrumentToken;

        public ShowCardOptionsSheet(CashInstrumentType cashInstrumentType, String str) {
            str.getClass();
            cashInstrumentType.getClass();
            this.instrumentToken = str;
            this.cashInstrumentType = cashInstrumentType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowCardOptionsSheet)) {
                return false;
            }
            ShowCardOptionsSheet showCardOptionsSheet = (ShowCardOptionsSheet) obj;
            return Intrinsics.areEqual(this.instrumentToken, showCardOptionsSheet.instrumentToken) && this.cashInstrumentType == showCardOptionsSheet.cashInstrumentType;
        }

        public final int hashCode() {
            return this.cashInstrumentType.hashCode() + (this.instrumentToken.hashCode() * 31);
        }

        public final String toString() {
            return "ShowCardOptionsSheet(instrumentToken=" + this.instrumentToken + ", cashInstrumentType=" + this.cashInstrumentType + ")";
        }
    }
}
