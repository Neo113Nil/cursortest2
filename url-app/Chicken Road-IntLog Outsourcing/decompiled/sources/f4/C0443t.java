package f4;

/* renamed from: f4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443t implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final short f5687a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.i.g(this.f5687a & 65535, ((C0443t) obj).f5687a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0443t) {
            return this.f5687a == ((C0443t) obj).f5687a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f5687a);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f5687a);
    }
}
