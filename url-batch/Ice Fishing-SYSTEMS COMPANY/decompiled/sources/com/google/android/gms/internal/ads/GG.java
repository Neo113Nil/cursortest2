package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class GG {

    /* renamed from: a, reason: collision with root package name */
    public final Class f25133a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f25134b;

    public /* synthetic */ GG(Class cls, Class cls2) {
        this.f25133a = cls;
        this.f25134b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GG)) {
            return false;
        }
        GG gg = (GG) obj;
        return gg.f25133a.equals(this.f25133a) && gg.f25134b.equals(this.f25134b);
    }

    public final int hashCode() {
        return Objects.hash(this.f25133a, this.f25134b);
    }

    public final String toString() {
        String simpleName = this.f25133a.getSimpleName();
        String simpleName2 = this.f25134b.getSimpleName();
        return D.y.o(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
