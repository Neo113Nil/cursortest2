package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajb {
    public final ajd a;
    public final aka b;
    public final List c;
    public final amn d;
    public amj e;
    public final alh f;

    public ajb(ajd ajdVar, krt krtVar, krx krxVar) {
        this.a = ajdVar;
        this.b = new ajr();
        this.c = ajdVar.d;
        ajd ajdVar2 = new ajd(ajdVar.a, ajdVar.b, ajdVar.c, ajdVar.q, ixc.m(ajdVar.d, new ajs(new ajq(this, 0))), ajdVar.e, ajdVar.p, ajdVar.f, ajdVar.g, ajdVar.h, ajdVar.i, ajdVar.j, ajdVar.k, ajdVar.l, ajdVar.m);
        ajdVar2.n = ajdVar.n;
        ajdVar2.o = ajdVar.o;
        amn amnVar = (amn) krtVar.a(ajdVar2);
        this.d = amnVar;
        brn brnVar = new brn(amnVar);
        String str = ajdVar.b;
        this.f = new alh(brnVar, str == null ? ":memory:" : str, krxVar);
        b();
    }

    private final void b() {
        amn amnVar = this.d;
        if (amnVar != null) {
            amnVar.d(this.a.p == 3);
        }
    }

    public final void a(ana anaVar) {
        yj.o(anaVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        yj.o(anaVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.b.b + "')");
    }

    public ajb(ajd ajdVar, aka akaVar, krx krxVar) {
        this.a = ajdVar;
        this.b = akaVar;
        this.c = ajdVar.d;
        amn a = ajdVar.c.a(yj.m(ajdVar.a, ajdVar.b, new amk(this, akaVar.a), false, false));
        this.d = a;
        brn brnVar = new brn(a);
        String str = ajdVar.b;
        this.f = new alh(brnVar, str == null ? ":memory:" : str, krxVar);
        b();
    }
}
