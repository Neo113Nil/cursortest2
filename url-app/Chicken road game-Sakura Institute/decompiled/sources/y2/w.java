package y2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class w implements Comparable<w> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11685e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f11686d;

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(w wVar) {
        return Intrinsics.e(this.f11686d ^ Integer.MIN_VALUE, wVar.f11686d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f11686d == ((w) obj).f11686d;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11686d);
    }

    public final String toString() {
        return String.valueOf(this.f11686d & 4294967295L);
    }
}
