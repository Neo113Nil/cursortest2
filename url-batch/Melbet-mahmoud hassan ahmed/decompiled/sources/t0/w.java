package t0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f21875a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21876b;

    public w(int i7, float f7) {
        this.f21875a = i7;
        this.f21876b = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f21875a == wVar.f21875a && Float.compare(wVar.f21876b, this.f21876b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f21875a) * 31) + Float.floatToIntBits(this.f21876b);
    }
}
