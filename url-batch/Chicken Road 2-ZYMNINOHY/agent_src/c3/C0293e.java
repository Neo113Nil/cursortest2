package c3;

import java.io.Serializable;

/* renamed from: c3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5726a;

    public C0293e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f5726a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0293e) {
            return kotlin.jvm.internal.i.a(this.f5726a, ((C0293e) obj).f5726a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5726a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f5726a + ')';
    }
}
