package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f6815a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6816b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6817c;

    public G(int i2, int i3, int i6) {
        this.f6815a = i2;
        this.f6816b = i3;
        this.f6817c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g6 = (G) obj;
        return this.f6815a == g6.f6815a && this.f6816b == g6.f6816b && this.f6817c == g6.f6817c;
    }

    public final int hashCode() {
        return Q7.a(this.f6817c) + ((Q7.a(this.f6816b) + (Q7.a(this.f6815a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f6815a) + ", canTrackHoaid=" + H.a(this.f6816b) + ", canTrackYandexAdvId=" + H.a(this.f6817c) + ')';
    }
}
