package A0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final String f306a;

    public M(String str) {
        this.f306a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return Intrinsics.a(this.f306a, ((M) obj).f306a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f306a.hashCode();
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("UrlAnnotation(url="), this.f306a, ')');
    }
}
