package B0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f299a;

    public r(q qVar) {
        this.f299a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!Z1.i.a(this.f299a, rVar.f299a)) {
            return false;
        }
        rVar.getClass();
        return Z1.i.a(null, null);
    }

    public final int hashCode() {
        q qVar = this.f299a;
        if (qVar != null) {
            return qVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f299a + ')';
    }
}
