package y2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class u implements Comparable<u> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11682e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public final byte f11683d;

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(u uVar) {
        return Intrinsics.e(this.f11683d & 255, uVar.f11683d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f11683d == ((u) obj).f11683d;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f11683d);
    }

    public final String toString() {
        return String.valueOf(this.f11683d & 255);
    }
}
