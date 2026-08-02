package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifp {
    public static final ifp a = new ifp(new iyi());
    public final hel b;
    public final hel c;
    private final String d;

    private ifp(iyi iyiVar) {
        this.d = (String) iyiVar.a;
        this.b = ((heg) iyiVar.c).g();
        this.c = ((heg) iyiVar.b).g();
    }

    public final String toString() {
        return this.d + "@" + Integer.toHexString(hashCode());
    }
}
