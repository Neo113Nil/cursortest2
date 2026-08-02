package b2;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2549a;

    public C0191e(Throwable exception) {
        j.e(exception, "exception");
        this.f2549a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0191e) {
            return j.a(this.f2549a, ((C0191e) obj).f2549a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2549a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2549a + ')';
    }
}
