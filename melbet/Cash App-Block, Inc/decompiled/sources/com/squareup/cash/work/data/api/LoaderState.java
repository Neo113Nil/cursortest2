package com.squareup.cash.work.data.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class LoaderState {

    public final class Error extends LoaderState {
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
            return this.throwable.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }
    }

    public final class Loading extends LoaderState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1285274433;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Success extends LoaderState {
        public final Object data;

        public Success(Object obj) {
            this.data = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.data, ((Success) obj).data);
        }

        public final int hashCode() {
            Object obj = this.data;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(data=", ")", this.data);
        }
    }
}
