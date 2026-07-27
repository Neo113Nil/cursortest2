package s1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185a extends v {
    @Override // s1.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1185a)) {
            return false;
        }
        if (super.equals(obj)) {
            if (Intrinsics.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // s1.v
    public final int hashCode() {
        return super.hashCode() * 961;
    }

    @Override // s1.v
    public final String toString() {
        String str = super.toString();
        Intrinsics.checkNotNullExpressionValue(str, "sb.toString()");
        return str;
    }
}
