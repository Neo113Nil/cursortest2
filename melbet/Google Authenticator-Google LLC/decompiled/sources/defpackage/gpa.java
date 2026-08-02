package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpa implements jwz {
    public long a;
    public final ikj b;
    private final gzp c;
    private final gzp d;

    public gpa(ikj ikjVar, gzp gzpVar, gzp gzpVar2) {
        this.b = ikjVar;
        this.c = gzpVar;
        this.d = gzpVar2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, koe] */
    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        if (!((Boolean) this.c.d(false)).booleanValue()) {
            return jwxVar.b(kaeVar, jwwVar);
        }
        return new goz(this, jwxVar.b(kaeVar, jwwVar), (iee) ((gzs) this.d).a.b());
    }
}
