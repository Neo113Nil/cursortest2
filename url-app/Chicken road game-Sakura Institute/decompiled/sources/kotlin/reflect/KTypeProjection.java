package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class KTypeProjection {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7508a = new a(null);

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        ((KTypeProjection) obj).getClass();
        return Intrinsics.a(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "*";
    }
}
