package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifs {
    public static final ifs a = new ifs(1, null, null, null);
    public static final ifs b = new ifs(5, null, null, null);
    public final jww c;
    public final int d;
    public final ikm e;
    private final hvi f;

    public ifs(int i, ikm ikmVar, hvi hviVar, jww jwwVar) {
        this.d = i;
        this.e = ikmVar;
        this.f = hviVar;
        this.c = jwwVar;
    }

    public static ifs b(kbq kbqVar, kaa kaaVar) {
        kbqVar.getClass();
        hoq.I(!kbqVar.g(), "Error status must not be ok");
        return new ifs(2, new ikm(kbqVar, kaaVar), null, null);
    }

    public static ifs c(hvi hviVar) {
        hviVar.getClass();
        return new ifs(4, null, hviVar, null);
    }

    public final hvi a() {
        hoq.H(this.d == 4);
        return this.f;
    }
}
