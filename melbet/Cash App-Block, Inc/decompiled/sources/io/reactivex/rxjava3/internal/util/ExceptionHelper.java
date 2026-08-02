package io.reactivex.rxjava3.internal.util;

/* loaded from: classes9.dex */
public abstract class ExceptionHelper {
    public static final Throwable TERMINATED = new Termination("No further exceptions");

    final class Termination extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public static NullPointerException createNullPointerException(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void nullCheck(Object obj, String str) {
        if (obj == null) {
            throw createNullPointerException(str);
        }
    }

    public static RuntimeException wrapOrThrow(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
