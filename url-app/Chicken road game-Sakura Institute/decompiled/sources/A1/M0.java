package A1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f505b;

    public M0(String title, String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f504a = title;
        this.f505b = body;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        return Intrinsics.a(this.f504a, m02.f504a) && Intrinsics.a(this.f505b, m02.f505b);
    }

    public final int hashCode() {
        return this.f505b.hashCode() + (this.f504a.hashCode() * 31);
    }

    public final String toString() {
        return "RuleEntry(title=" + this.f504a + ", body=" + this.f505b + ")";
    }
}
