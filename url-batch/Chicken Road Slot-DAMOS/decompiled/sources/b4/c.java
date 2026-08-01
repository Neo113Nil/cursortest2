package b4;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1098a;

    public c(String str) {
        str.getClass();
        this.f1098a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return Intrinsics.a(this.f1098a, ((c) obj).f1098a);
    }

    public final int hashCode() {
        return this.f1098a.hashCode();
    }

    public final String toString() {
        return this.f1098a;
    }
}
