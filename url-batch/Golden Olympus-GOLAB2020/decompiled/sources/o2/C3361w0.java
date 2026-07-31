package o2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o2.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3361w0 extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient InterfaceC3359v0 f42107b;

    public C3361w0(String str, Throwable th, InterfaceC3359v0 interfaceC3359v0) {
        super(str);
        this.f42107b = interfaceC3359v0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3361w0)) {
            return false;
        }
        C3361w0 c3361w0 = (C3361w0) obj;
        return Intrinsics.areEqual(c3361w0.getMessage(), getMessage()) && Intrinsics.areEqual(c3361w0.f42107b, this.f42107b) && Intrinsics.areEqual(c3361w0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = ((message.hashCode() * 31) + this.f42107b.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f42107b;
    }
}
