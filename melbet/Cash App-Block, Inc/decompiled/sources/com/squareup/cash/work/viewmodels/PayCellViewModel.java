package com.squareup.cash.work.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PayCellViewModel {

    public final class Loaded implements PayCellViewModel {
        public final String amount;
        public final String dateRange;

        public Loaded(String str, String str2) {
            str.getClass();
            this.amount = str;
            this.dateRange = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.amount, loaded.amount) && this.dateRange.equals(loaded.dateRange);
        }

        public final int hashCode() {
            return this.dateRange.hashCode() + (this.amount.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Loaded(amount=", this.amount, ", dateRange=", this.dateRange, ")");
        }
    }

    public final class Loading implements PayCellViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1534857316;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
