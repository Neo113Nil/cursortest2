package x0;

import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f8321a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f8322b;

    public g(int i, Integer num) {
        this.f8321a = i;
        this.f8322b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f8321a == gVar.f8321a && i.a(this.f8322b, gVar.f8322b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f8321a) * 31;
        Integer num = this.f8322b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f8321a + ", dataOffset=" + this.f8322b + ')';
    }
}
