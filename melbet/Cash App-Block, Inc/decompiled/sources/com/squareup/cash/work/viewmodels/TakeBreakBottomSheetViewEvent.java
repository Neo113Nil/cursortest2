package com.squareup.cash.work.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TakeBreakBottomSheetViewEvent {

    public final class BreakSelected implements TakeBreakBottomSheetViewEvent {
        public final String token;
        public final long versionNumber;

        public BreakSelected(String str, long j) {
            str.getClass();
            this.token = str;
            this.versionNumber = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakSelected)) {
                return false;
            }
            BreakSelected breakSelected = (BreakSelected) obj;
            return Intrinsics.areEqual(this.token, breakSelected.token) && this.versionNumber == breakSelected.versionNumber;
        }

        public final int hashCode() {
            return Long.hashCode(this.versionNumber) + (this.token.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("BreakSelected(token=", this.token, ", versionNumber=", this.versionNumber);
            m.append(")");
            return m.toString();
        }
    }

    public final class Dismiss implements TakeBreakBottomSheetViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 861535809;
        }

        public final String toString() {
            return "Dismiss";
        }
    }
}
