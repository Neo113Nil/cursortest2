package u0;

/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374m extends AbstractC0377p {

    /* renamed from: a, reason: collision with root package name */
    public final int f4197a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4199c;

    public C0374m(float f2, int i, int i2) {
        this.f4197a = i;
        this.f4198b = f2;
        this.f4199c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0374m)) {
            return false;
        }
        C0374m c0374m = (C0374m) obj;
        return this.f4197a == c0374m.f4197a && Float.compare(this.f4198b, c0374m.f4198b) == 0 && this.f4199c == c0374m.f4199c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4199c) + ((Float.hashCode(this.f4198b) + (Integer.hashCode(this.f4197a) * 31)) * 31);
    }

    public final String toString() {
        return "AllDone(streak=" + this.f4197a + ", multiplier=" + this.f4198b + ", level=" + this.f4199c + ")";
    }
}
