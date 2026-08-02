package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hlh implements hkr {
    private final hkr a;
    private final Object b;

    public hlh(hkr hkrVar, Object obj) {
        hkrVar.getClass();
        this.a = hkrVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hlh)) {
            return false;
        }
        hlh hlhVar = (hlh) obj;
        return this.a.equals(hlhVar.a) && this.b.equals(hlhVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
