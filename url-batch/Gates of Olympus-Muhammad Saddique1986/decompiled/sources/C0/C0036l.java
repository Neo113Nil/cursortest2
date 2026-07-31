package C0;

/* renamed from: C0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036l extends AbstractC0037m {

    /* renamed from: a, reason: collision with root package name */
    public final String f611a;

    /* renamed from: b, reason: collision with root package name */
    public final I f612b;

    public C0036l(String str, I i3) {
        this.f611a = str;
        this.f612b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0036l)) {
            return false;
        }
        C0036l c0036l = (C0036l) obj;
        if (!f2.j.a(this.f611a, c0036l.f611a)) {
            return false;
        }
        if (!f2.j.a(this.f612b, c0036l.f612b)) {
            return false;
        }
        c0036l.getClass();
        return f2.j.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f611a.hashCode() * 31;
        I i3 = this.f612b;
        return (hashCode + (i3 != null ? i3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.f611a + ')';
    }
}
