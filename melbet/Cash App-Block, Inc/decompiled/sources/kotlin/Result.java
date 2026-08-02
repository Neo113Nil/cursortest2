package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Result implements Serializable {
    public static final Companion Companion = new Companion(null);
    public final Object value;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable th) {
            th.getClass();
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                return Intrinsics.areEqual(this.exception, ((Failure) obj).exception);
            }
            return false;
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m4120exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4121toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            return Intrinsics.areEqual(this.value, ((Result) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return m4121toStringimpl(this.value);
    }
}
