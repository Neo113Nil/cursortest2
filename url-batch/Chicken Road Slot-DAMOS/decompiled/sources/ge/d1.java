package ge;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d1 extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient k1 f4344d;

    public d1(String str, Throwable th, k1 k1Var) {
        super(str);
        this.f4344d = k1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (!Intrinsics.a(d1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = d1Var.f4344d;
        if (obj2 == null) {
            obj2 = n1.f4381e;
        }
        Object obj3 = this.f4344d;
        if (obj3 == null) {
            obj3 = n1.f4381e;
        }
        return Intrinsics.a(obj2, obj3) && Intrinsics.a(d1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.f4344d;
        if (obj == null) {
            obj = n1.f4381e;
        }
        int hashCode2 = (obj.hashCode() + hashCode) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f4344d;
        if (obj == null) {
            obj = n1.f4381e;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
