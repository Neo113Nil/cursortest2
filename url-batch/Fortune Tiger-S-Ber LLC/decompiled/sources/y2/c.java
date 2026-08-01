package y2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final c f3620i = new c(1, 0, 1);

    @Override // y2.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f3617f == cVar.f3617f && this.g == cVar.g;
    }

    @Override // y2.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3617f * 31) + this.g;
    }

    @Override // y2.a
    public final boolean isEmpty() {
        return this.f3617f > this.g;
    }

    @Override // y2.a
    public final String toString() {
        return this.f3617f + ".." + this.g;
    }
}
