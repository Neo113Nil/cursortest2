package wd;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f10162a;

    public u(Class cls) {
        cls.getClass();
        this.f10162a = cls;
    }

    @Override // wd.f
    public final Class a() {
        return this.f10162a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return Intrinsics.a(this.f10162a, ((u) obj).f10162a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10162a.hashCode();
    }

    public final String toString() {
        return this.f10162a.toString() + " (Kotlin reflection is not available)";
    }
}
