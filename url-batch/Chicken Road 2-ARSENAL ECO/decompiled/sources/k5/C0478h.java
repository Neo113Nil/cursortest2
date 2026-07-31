package k5;

import java.io.Serializable;

/* renamed from: k5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478h implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f5200f;

    public C0478h(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f5200f = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0478h) {
            return kotlin.jvm.internal.i.a(this.f5200f, ((C0478h) obj).f5200f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5200f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f5200f + ')';
    }
}
