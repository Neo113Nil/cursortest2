package hd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final l f4511e = new l(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f4512d;

    public /* synthetic */ n(Object obj) {
        this.f4512d = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).f4510d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Intrinsics.a(this.f4512d, ((n) obj).f4512d);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4512d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f4512d;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
