package B1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z implements B {

    /* renamed from: a, reason: collision with root package name */
    public final String f1034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1035b;

    public z(String url, boolean z4) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1034a = url;
        this.f1035b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.a(this.f1034a, zVar.f1034a) && this.f1035b == zVar.f1035b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1035b) + (this.f1034a.hashCode() * 31);
    }

    public final String toString() {
        return "Page(url=" + this.f1034a + ", consent=" + this.f1035b + ")";
    }
}
