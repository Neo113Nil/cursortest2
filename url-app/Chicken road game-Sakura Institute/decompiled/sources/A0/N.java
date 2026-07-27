package A0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f307a;

    public N(String str) {
        this.f307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            return Intrinsics.a(this.f307a, ((N) obj).f307a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f307a.hashCode();
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f307a, ')');
    }
}
