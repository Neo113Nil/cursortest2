package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfp implements jrw {
    private final jsb a;
    private final jsb b;
    private final /* synthetic */ int c;

    public dfp(jsb jsbVar, jsb jsbVar2, int i) {
        this.c = i;
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    public final hvm a() {
        int i = this.c;
        if (i == 0) {
            hvm e = dja.e(this.a, (gzp) ((jrx) this.b).a);
            e.getClass();
            return e;
        }
        if (i == 1) {
            hvm e2 = dja.e(this.a, (gzp) ((jrx) this.b).a);
            e2.getClass();
            return e2;
        }
        hvm e3 = dja.e(this.a, (gzp) ((jrx) this.b).a);
        e3.getClass();
        return e3;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = this.c;
        return i != 0 ? i != 1 ? a() : a() : a();
    }
}
