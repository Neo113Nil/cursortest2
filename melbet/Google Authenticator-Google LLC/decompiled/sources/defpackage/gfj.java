package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gfj implements gmv {
    private final /* synthetic */ int a;

    public /* synthetic */ gfj(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [hvi, java.lang.Object] */
    @Override // defpackage.gmv
    public final void a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            hrz hrzVar = (hrz) obj;
            fao.c();
            Object obj2 = hrzVar.a;
            obj2.getClass();
            gzp gzpVar = ((gfp) obj2).b;
            if (gzpVar.f()) {
                gzpVar.b().cancel(false);
            }
            hrzVar.a = null;
            return;
        }
        qi qiVar = (qi) obj;
        for (gfv gfvVar : qiVar.values()) {
            fao.c();
            hoq.H(!gfvVar.d);
            gfu gfuVar = gfvVar.b;
            if (gfuVar != null) {
                gfvVar.e.m(gfuVar.a, gfuVar);
                gfvVar.b.close();
                gfvVar.b = null;
            }
            gfvVar.d = true;
        }
        qiVar.clear();
    }
}
