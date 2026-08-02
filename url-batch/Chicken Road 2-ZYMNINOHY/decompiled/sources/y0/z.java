package y0;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f16224c = new z(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f16225a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16226b;

    public z(long j4, long j5) {
        this.f16225a = j4;
        this.f16226b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f16225a == zVar.f16225a && this.f16226b == zVar.f16226b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16225a) * 31) + ((int) this.f16226b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f16225a);
        sb.append(", position=");
        return AbstractC0005f.p(sb, this.f16226b, "]");
    }
}
