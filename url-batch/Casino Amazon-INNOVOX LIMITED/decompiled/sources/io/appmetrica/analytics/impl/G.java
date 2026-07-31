package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f852a;
    public final int b;
    public final int c;

    public G(int i, int i2, int i3) {
        this.f852a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(G.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g = (G) obj;
        return this.f852a == g.f852a && this.b == g.b && this.c == g.c;
    }

    public final int hashCode() {
        return L7.a(this.c) + ((L7.a(this.b) + (L7.a(this.f852a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f852a) + ", canTrackHoaid=" + H.a(this.b) + ", canTrackYandexAdvId=" + H.a(this.c) + ')';
    }
}
