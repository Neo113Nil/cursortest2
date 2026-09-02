package u0;

/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685o {

    /* renamed from: a, reason: collision with root package name */
    public String f5998a;

    /* renamed from: b, reason: collision with root package name */
    public int f5999b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0685o)) {
            return false;
        }
        C0685o c0685o = (C0685o) obj;
        return kotlin.jvm.internal.i.a(this.f5998a, c0685o.f5998a) && this.f5999b == c0685o.f5999b;
    }

    public final int hashCode() {
        return N.p.c(this.f5999b) + (this.f5998a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f5998a + ", state=" + W4.o.h(this.f5999b) + ')';
    }
}
