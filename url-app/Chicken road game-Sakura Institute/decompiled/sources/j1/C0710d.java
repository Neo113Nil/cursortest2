package j1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710d {

    /* renamed from: a, reason: collision with root package name */
    public final String f7149a;

    public C0710d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f7149a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0710d)) {
            return false;
        }
        return Intrinsics.a(this.f7149a, ((C0710d) obj).f7149a);
    }

    public final int hashCode() {
        return this.f7149a.hashCode();
    }

    public final String toString() {
        return this.f7149a;
    }
}
