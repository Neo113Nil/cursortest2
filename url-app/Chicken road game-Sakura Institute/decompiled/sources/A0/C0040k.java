package A0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: A0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040k extends AbstractC0042m {

    /* renamed from: a, reason: collision with root package name */
    public final String f341a;

    /* renamed from: b, reason: collision with root package name */
    public final J f342b;

    public C0040k(String str, J j4) {
        this.f341a = str;
        this.f342b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0040k)) {
            return false;
        }
        C0040k c0040k = (C0040k) obj;
        if (!Intrinsics.a(this.f341a, c0040k.f341a)) {
            return false;
        }
        if (!Intrinsics.a(this.f342b, c0040k.f342b)) {
            return false;
        }
        c0040k.getClass();
        return Intrinsics.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f341a.hashCode() * 31;
        J j4 = this.f342b;
        return (hashCode + (j4 != null ? j4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f341a, ')');
    }
}
