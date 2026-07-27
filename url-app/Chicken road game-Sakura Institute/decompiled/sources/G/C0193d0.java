package G;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2800a;

    public C0193d0(String str) {
        this.f2800a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0193d0) && Intrinsics.a(this.f2800a, ((C0193d0) obj).f2800a);
    }

    public final int hashCode() {
        return this.f2800a.hashCode();
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("OpaqueKey(key="), this.f2800a, ')');
    }
}
