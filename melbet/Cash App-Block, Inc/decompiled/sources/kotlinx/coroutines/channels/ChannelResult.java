package kotlinx.coroutines.channels;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ChannelResult {
    public static final Failed failed = new Failed();
    public final Object holder;

    public final class Closed extends Failed {
        public final Throwable cause;

        public Closed(Throwable th) {
            this.cause = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Closed) {
                return Intrinsics.areEqual(this.cause, ((Closed) obj).cause);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public final String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    public class Failed {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ ChannelResult(Object obj) {
        this.holder = obj;
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m4190exceptionOrNullimpl(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.cause;
        }
        return null;
    }

    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final Object m4191getOrNullimpl(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final void m4192getOrThrowimpl(Object obj) {
        if (obj instanceof Failed) {
            if (!(obj instanceof Closed)) {
                a$$ExternalSyntheticBUOutline0.m$1("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th = ((Closed) obj).cause;
            if (th != null) {
                throw th;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4193toStringimpl(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ChannelResult) {
            return Intrinsics.areEqual(this.holder, ((ChannelResult) obj).holder);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.holder;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return m4193toStringimpl(this.holder);
    }
}
