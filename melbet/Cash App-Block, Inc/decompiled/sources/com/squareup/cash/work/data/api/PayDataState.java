package com.squareup.cash.work.data.api;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface PayDataState {

    public final class Error implements PayDataState {
        public final Exception throwable;

        public Error(Exception exc) {
            this.throwable = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.throwable.equals(((Error) obj).throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode() + (Boolean.hashCode(false) * 31);
        }

        public final String toString() {
            return "Error(hasPayrollFeatures=false, throwable=" + this.throwable + ")";
        }
    }

    public final class Loaded implements PayDataState {
        public final PayData data;
        public final boolean hasPayrollFeatures;

        public Loaded(boolean z, PayData payData) {
            this.hasPayrollFeatures = z;
            this.data = payData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.hasPayrollFeatures == loaded.hasPayrollFeatures && this.data.equals(loaded.data);
        }

        public final int hashCode() {
            return this.data.hashCode() + (Boolean.hashCode(this.hasPayrollFeatures) * 31);
        }

        public final String toString() {
            return "Loaded(hasPayrollFeatures=" + this.hasPayrollFeatures + ", data=" + this.data + ")";
        }
    }

    public final class Loading implements PayDataState {
        public final boolean hasPayrollFeatures;

        public Loading(boolean z) {
            this.hasPayrollFeatures = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.hasPayrollFeatures == ((Loading) obj).hasPayrollFeatures;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasPayrollFeatures);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Loading(hasPayrollFeatures=", ")", this.hasPayrollFeatures);
        }
    }
}
