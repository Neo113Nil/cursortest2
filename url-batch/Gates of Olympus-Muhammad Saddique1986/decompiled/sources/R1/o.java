package R1;

/* loaded from: classes.dex */
public final class o implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final byte f4159d;

    public /* synthetic */ o(byte b3) {
        this.f4159d = b3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return f2.j.g(this.f4159d & 255, ((o) obj).f4159d & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f4159d == ((o) obj).f4159d;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f4159d);
    }

    public final String toString() {
        return String.valueOf(this.f4159d & 255);
    }
}
