package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f10297a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10299c;

    public G(int i4, int i5, int i6) {
        this.f10297a = i4;
        this.f10298b = i5;
        this.f10299c = i6;
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
        G g4 = (G) obj;
        return this.f10297a == g4.f10297a && this.f10298b == g4.f10298b && this.f10299c == g4.f10299c;
    }

    public final int hashCode() {
        return K7.a(this.f10299c) + ((K7.a(this.f10298b) + (K7.a(this.f10297a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f10297a) + ", canTrackHoaid=" + H.a(this.f10298b) + ", canTrackYandexAdvId=" + H.a(this.f10299c) + ')';
    }
}
