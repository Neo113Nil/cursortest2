package e1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f3779a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f3779a == ((c) obj).f3779a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3779a);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.f3779a + ')';
    }
}
