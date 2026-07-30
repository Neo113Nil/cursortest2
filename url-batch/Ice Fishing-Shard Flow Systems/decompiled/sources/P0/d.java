package P0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2191a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f2192b;

    public d(String key, Long l7) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f2191a = key;
        this.f2192b = l7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f2191a, dVar.f2191a) && Intrinsics.a(this.f2192b, dVar.f2192b);
    }

    public final int hashCode() {
        int hashCode = this.f2191a.hashCode() * 31;
        Long l7 = this.f2192b;
        return hashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f2191a + ", value=" + this.f2192b + ')';
    }
}
