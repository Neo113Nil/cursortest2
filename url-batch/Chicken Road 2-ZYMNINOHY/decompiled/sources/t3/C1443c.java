package t3;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443c extends C1441a {

    /* renamed from: d, reason: collision with root package name */
    public static final C1443c f15431d = new C1443c(1, 0, 1);

    @Override // t3.C1441a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1443c)) {
            return false;
        }
        if (isEmpty() && ((C1443c) obj).isEmpty()) {
            return true;
        }
        C1443c c1443c = (C1443c) obj;
        return this.f15424a == c1443c.f15424a && this.f15425b == c1443c.f15425b;
    }

    @Override // t3.C1441a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f15424a * 31) + this.f15425b;
    }

    @Override // t3.C1441a
    public final boolean isEmpty() {
        return this.f15424a > this.f15425b;
    }

    @Override // t3.C1441a
    public final String toString() {
        return this.f15424a + ".." + this.f15425b;
    }
}
