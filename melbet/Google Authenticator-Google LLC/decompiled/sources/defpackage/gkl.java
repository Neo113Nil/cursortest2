package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkl extends agd {
    public volatile Object a;
    public final jrm b;
    public final jrn c;
    public final Object d = new Object();
    public glt e;
    public final jxh f;

    public gkl(Object obj, jqw jqwVar, jrm jrmVar, jrn jrnVar) {
        this.a = obj;
        this.f = new jxh(jqwVar);
        this.b = jrmVar;
        this.c = jrnVar;
    }

    @Override // defpackage.agd
    protected final void c() {
        jqg a;
        synchronized (this.d) {
            glt gltVar = this.e;
            a = gltVar != null ? ((gkm) imq.a(gltVar, gkm.class)).a() : null;
        }
        if (a != null) {
            a.a();
        }
    }
}
