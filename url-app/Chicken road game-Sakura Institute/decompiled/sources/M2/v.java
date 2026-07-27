package M2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements InterfaceC0255g {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3609a;

    public v(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter("", "moduleName");
        this.f3609a = jClass;
    }

    @Override // M2.InterfaceC0255g
    public final Class a() {
        return this.f3609a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            if (Intrinsics.a(this.f3609a, ((v) obj).f3609a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3609a.hashCode();
    }

    public final String toString() {
        return this.f3609a.toString() + " (Kotlin reflection is not available)";
    }
}
