package k5;

/* renamed from: k5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483m implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final byte f5210f;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.i.g(this.f5210f & 255, ((C0483m) obj).f5210f & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0483m) {
            return this.f5210f == ((C0483m) obj).f5210f;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f5210f);
    }

    public final String toString() {
        return String.valueOf(this.f5210f & 255);
    }
}
