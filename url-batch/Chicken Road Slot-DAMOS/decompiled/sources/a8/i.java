package a8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: d, reason: collision with root package name */
    public final Object f345d;

    public i(Object obj) {
        this.f345d = obj;
    }

    @Override // a8.g
    public final Object a() {
        return this.f345d;
    }

    @Override // a8.g
    public final boolean b() {
        return true;
    }

    @Override // a8.g
    public final Object c() {
        return this.f345d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f345d.equals(((i) obj).f345d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f345d.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f345d);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
