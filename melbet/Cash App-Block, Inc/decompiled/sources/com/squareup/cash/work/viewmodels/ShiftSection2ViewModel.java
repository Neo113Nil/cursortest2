package com.squareup.cash.work.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ShiftSection2ViewModel {

    public final class Empty implements ShiftSection2ViewModel {
        public final boolean showClockInUnscheduledButton;

        public Empty(boolean z) {
            this.showClockInUnscheduledButton = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Empty) && this.showClockInUnscheduledButton == ((Empty) obj).showClockInUnscheduledButton;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showClockInUnscheduledButton);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Empty(showClockInUnscheduledButton=", ")", this.showClockInUnscheduledButton);
        }
    }

    public final class Error implements ShiftSection2ViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1900459933;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements ShiftSection2ViewModel {
        public final List shifts;
        public final boolean showClockInUnscheduledButton;

        public Loaded(List list, boolean z) {
            list.getClass();
            this.shifts = list;
            this.showClockInUnscheduledButton = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.shifts, loaded.shifts) && this.showClockInUnscheduledButton == loaded.showClockInUnscheduledButton;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showClockInUnscheduledButton) + (this.shifts.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(shifts=" + this.shifts + ", showClockInUnscheduledButton=" + this.showClockInUnscheduledButton + ")";
        }
    }

    public final class Loading implements ShiftSection2ViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 834743511;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
