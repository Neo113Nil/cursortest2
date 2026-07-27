package A0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: A0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041l extends AbstractC0042m {

    /* renamed from: a, reason: collision with root package name */
    public final String f343a;

    /* renamed from: b, reason: collision with root package name */
    public final J f344b;

    public C0041l(String str, J j4) {
        this.f343a = str;
        this.f344b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0041l)) {
            return false;
        }
        C0041l c0041l = (C0041l) obj;
        if (!Intrinsics.a(this.f343a, c0041l.f343a)) {
            return false;
        }
        if (!Intrinsics.a(this.f344b, c0041l.f344b)) {
            return false;
        }
        c0041l.getClass();
        return Intrinsics.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f343a.hashCode() * 31;
        J j4 = this.f344b;
        return (hashCode + (j4 != null ? j4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("LinkAnnotation.Url(url="), this.f343a, ')');
    }
}
