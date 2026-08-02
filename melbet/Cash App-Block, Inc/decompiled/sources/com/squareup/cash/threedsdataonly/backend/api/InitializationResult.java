package com.squareup.cash.threedsdataonly.backend.api;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public abstract class InitializationResult {

    public final class Failure extends InitializationResult {
        public final Throwable throwable;

        public Failure(Throwable th) {
            this.throwable = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.throwable.equals(((Failure) obj).throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failure(throwable=", ")", this.throwable);
        }
    }

    public final class Success extends InitializationResult {
        public final boolean alreadyInitialized;

        public Success(boolean z) {
            this.alreadyInitialized = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.alreadyInitialized == ((Success) obj).alreadyInitialized;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.alreadyInitialized);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Success(alreadyInitialized=", ")", this.alreadyInitialized);
        }
    }
}
