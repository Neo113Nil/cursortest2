package C0;

/* renamed from: C0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035k extends AbstractC0037m {

    /* renamed from: a, reason: collision with root package name */
    public final String f609a;

    /* renamed from: b, reason: collision with root package name */
    public final I f610b;

    public C0035k(String str, I i3) {
        this.f609a = str;
        this.f610b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0035k)) {
            return false;
        }
        C0035k c0035k = (C0035k) obj;
        if (!f2.j.a(this.f609a, c0035k.f609a)) {
            return false;
        }
        if (!f2.j.a(this.f610b, c0035k.f610b)) {
            return false;
        }
        c0035k.getClass();
        return f2.j.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f609a.hashCode() * 31;
        I i3 = this.f610b;
        return (hashCode + (i3 != null ? i3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.f609a + ')';
    }
}
