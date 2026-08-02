package com.squareup.cash.work.data.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ClockInEssentialsState {

    public final class Error implements ClockInEssentialsState {
        public final Throwable exception;

        public Error(Throwable th) {
            th.getClass();
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Error(exception=", ")", this.exception);
        }
    }

    public final class Loading implements ClockInEssentialsState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2025307988;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
