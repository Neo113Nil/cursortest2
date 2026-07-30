package R5;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: R5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167g implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final C0166f f2414e = new C0166f(null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0167g f2415i = new C0167g();

    /* renamed from: d, reason: collision with root package name */
    public final int f2416d = 131860;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0167g other = (C0167g) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f2416d - other.f2416d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0167g c0167g = obj instanceof C0167g ? (C0167g) obj : null;
        return c0167g != null && this.f2416d == c0167g.f2416d;
    }

    public final int hashCode() {
        return this.f2416d;
    }

    public final String toString() {
        return "2.3.20";
    }
}
