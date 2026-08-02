package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahh {
    public boolean c;
    public cfz d;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        cfz cfzVar = this.d;
        if (cfzVar == null) {
            return;
        }
        if (!this.c) {
            cfzVar.d(this, null);
        }
        Object obj = cfzVar.d;
        Object obj2 = cfzVar.c;
        ahi ahiVar = (ahi) obj;
        if (ksp.b(this, ahiVar.e) && ahiVar.d == -1) {
            ahe aheVar = ahiVar.c;
            if (aheVar == null) {
                aheVar = ahiVar.a(-1);
            }
            ahiVar.c = null;
            ahiVar.d = 0;
            ahiVar.e = null;
            if (aheVar == null) {
                ?? r0 = ((oe) ((kee) obj2).a).a;
                if (r0 != 0) {
                    r0.run();
                }
            } else {
                aheVar.b();
            }
            ahiVar.f.d(ahj.a);
        }
        this.c = false;
    }

    protected void a(boolean z) {
    }
}
