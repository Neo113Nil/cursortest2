package p2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final x f7624a;

    public e(x xVar) {
        this.f7624a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.a(this.f7624a, ((e) obj).f7624a);
    }

    public final int hashCode() {
        return this.f7624a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f7624a + ", loaderKey=null)";
    }
}
