package A0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final D f295a;

    /* renamed from: b, reason: collision with root package name */
    public final D f296b;

    /* renamed from: c, reason: collision with root package name */
    public final D f297c;

    /* renamed from: d, reason: collision with root package name */
    public final D f298d;

    public J(D d4, D d5, D d6, D d7) {
        this.f295a = d4;
        this.f296b = d5;
        this.f297c = d6;
        this.f298d = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j4 = (J) obj;
        return Intrinsics.a(this.f295a, j4.f295a) && Intrinsics.a(this.f296b, j4.f296b) && Intrinsics.a(this.f297c, j4.f297c) && Intrinsics.a(this.f298d, j4.f298d);
    }

    public final int hashCode() {
        D d4 = this.f295a;
        int hashCode = (d4 != null ? d4.hashCode() : 0) * 31;
        D d5 = this.f296b;
        int hashCode2 = (hashCode + (d5 != null ? d5.hashCode() : 0)) * 31;
        D d6 = this.f297c;
        int hashCode3 = (hashCode2 + (d6 != null ? d6.hashCode() : 0)) * 31;
        D d7 = this.f298d;
        return hashCode3 + (d7 != null ? d7.hashCode() : 0);
    }
}
