package b2;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: b2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2550a;

    public static final Throwable a(Object obj) {
        if (obj instanceof C0191e) {
            return ((C0191e) obj).f2549a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0192f) {
            return j.a(this.f2550a, ((C0192f) obj).f2550a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2550a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f2550a;
        if (obj instanceof C0191e) {
            return ((C0191e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
