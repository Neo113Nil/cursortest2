package y2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: y2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1322B implements Comparable<C1322B> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f11655e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public final short f11656d;

    @Metadata
    /* renamed from: y2.B$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C1322B c1322b) {
        return Intrinsics.e(this.f11656d & 65535, c1322b.f11656d & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1322B) {
            return this.f11656d == ((C1322B) obj).f11656d;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f11656d);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f11656d);
    }
}
