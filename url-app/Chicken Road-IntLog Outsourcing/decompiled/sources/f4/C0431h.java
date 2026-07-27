package f4;

import java.io.Serializable;

/* renamed from: f4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5670a;

    public C0431h(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f5670a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0431h) {
            if (kotlin.jvm.internal.i.a(this.f5670a, ((C0431h) obj).f5670a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5670a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f5670a + ')';
    }
}
