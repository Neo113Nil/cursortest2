package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class st {
    public static final rt b = new rt();
    public final Object a;

    public static final Object a(Object obj) {
        if (obj instanceof rt) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof st) {
            return Intrinsics.b(this.a, ((st) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof qt) {
            return ((qt) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
