package com.squareup.cash.work.data.api;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;

/* loaded from: classes7.dex */
public interface LoadPhase {

    public final class Error implements LoadPhase {
        public final ClosedRange range;
        public final Throwable throwable;

        public Error(ClosedRange closedRange, Throwable th) {
            closedRange.getClass();
            this.range = closedRange;
            this.throwable = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.range, error.range) && this.throwable.equals(error.throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode() + (this.range.hashCode() * 31);
        }

        public final String toString() {
            return "Error(range=" + this.range + ", throwable=" + this.throwable + ")";
        }
    }

    public final class Idle implements LoadPhase {
        public static final Idle INSTANCE = new Idle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public final int hashCode() {
            return -900994854;
        }

        public final String toString() {
            return "Idle";
        }
    }
}
