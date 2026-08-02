package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crd {
    private static crd b;
    private static final cre c = new cre(0, false, false, 0, 0);
    public cre a;

    public static synchronized crd a() {
        crd crdVar;
        synchronized (crd.class) {
            crdVar = b;
            if (crdVar == null) {
                crdVar = new crd();
                b = crdVar;
            }
        }
        return crdVar;
    }

    public final synchronized void b(cre creVar) {
        if (creVar == null) {
            this.a = c;
            return;
        }
        cre creVar2 = this.a;
        if (creVar2 != null) {
            if (creVar2.a >= creVar.a) {
                return;
            }
        }
        this.a = creVar;
    }
}
