package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f6022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6023b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6024c;

    public G(int i3, int i4, int i5) {
        this.f6022a = i3;
        this.f6023b = i4;
        this.f6024c = i5;
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
        G g3 = (G) obj;
        return this.f6022a == g3.f6022a && this.f6023b == g3.f6023b && this.f6024c == g3.f6024c;
    }

    public final int hashCode() {
        return Q7.a(this.f6024c) + ((Q7.a(this.f6023b) + (Q7.a(this.f6022a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f6022a) + ", canTrackHoaid=" + H.a(this.f6023b) + ", canTrackYandexAdvId=" + H.a(this.f6024c) + ')';
    }
}
