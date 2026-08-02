package com.squareup.cash.support.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportDisputeTrackerViewModel {

    public final class Failed implements SupportDisputeTrackerViewModel {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 1691355868;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class Loaded implements SupportDisputeTrackerViewModel {
        public final List disputes;
        public final boolean showListLoadingSpinner;

        public Loaded(List list, boolean z) {
            list.getClass();
            this.disputes = list;
            this.showListLoadingSpinner = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.disputes, loaded.disputes) && this.showListLoadingSpinner == loaded.showListLoadingSpinner;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showListLoadingSpinner) + (this.disputes.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(disputes=" + this.disputes + ", showListLoadingSpinner=" + this.showListLoadingSpinner + ")";
        }
    }

    public final class Loading implements SupportDisputeTrackerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1979302275;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
