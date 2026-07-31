package t;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892b {

    /* renamed from: a, reason: collision with root package name */
    public final long f7571a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0892b) {
            return this.f7571a == ((C0892b) obj).f7571a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7571a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f7571a + ')';
    }
}
