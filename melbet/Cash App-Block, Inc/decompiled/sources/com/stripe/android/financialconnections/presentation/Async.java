package com.stripe.android.financialconnections.presentation;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class Async {
    public final Object value;

    public final class Fail extends Async {
        public final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fail(Throwable th) {
            super(null);
            th.getClass();
            this.error = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fail) && Intrinsics.areEqual(this.error, ((Fail) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Fail(error=", ")", this.error);
        }
    }

    public final class Loading extends Async {
        public final Object value;

        public Loading(Object obj) {
            super(obj);
            this.value = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.value, ((Loading) obj).value);
        }

        public final int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(value=", ")", this.value);
        }
    }

    public final class Success extends Async {
        public final Object value;

        public Success(Object obj) {
            super(obj);
            this.value = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.value, ((Success) obj).value);
        }

        public final int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // com.stripe.android.financialconnections.presentation.Async
        public final Object invoke() {
            return this.value;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(value=", ")", this.value);
        }
    }

    public final class Uninitialized extends Async {
        public static final Uninitialized INSTANCE = new Uninitialized(null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Uninitialized);
        }

        public final int hashCode() {
            return 1877812804;
        }

        public final String toString() {
            return "Uninitialized";
        }
    }

    public Async(Object obj) {
        this.value = obj;
    }

    public Object invoke() {
        return this.value;
    }
}
