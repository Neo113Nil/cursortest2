package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjd {
    protected final Context a;
    protected final String b;
    protected cjy c = cjy.a;
    public String d;
    public cjn e;
    public cjl f;
    public int g;
    public ddw h;

    public cjd(Context context, String str) {
        oy.at(context);
        this.a = context;
        oy.ar(str);
        this.b = str;
    }

    public final cji a() {
        cjl cjlVar;
        String str = this.d;
        cjy cjyVar = this.c;
        cjl cjlVar2 = this.f;
        int i = 0;
        if (cjlVar2 == null || (cjlVar2.b & 4) == 0 || (i = a.A(cjlVar2.e)) != 0) {
            cjlVar = cjlVar2;
        } else {
            cjlVar = cjlVar2;
            i = 1;
        }
        Context context = this.a;
        int i2 = i;
        ddw ddwVar = this.h;
        int i3 = this.g;
        cks cksVar = null;
        if (cjlVar != null && i3 != 0) {
            int i4 = hel.d;
            heg hegVar = new heg(4);
            if ((cjlVar.b & 2) != 0) {
                cjk cjkVar = cjlVar.d;
                if (cjkVar == null) {
                    cjkVar = cjk.a;
                }
                hegVar.h(new ckv(i3, cjkVar));
            }
            if ((1 & cjlVar.b) != 0) {
                cjj cjjVar = cjlVar.c;
                if (cjjVar == null) {
                    cjjVar = cjj.a;
                }
                hegVar.h(new cku(i3, cjjVar, new ckz(context)));
            }
            hel g = hegVar.g();
            if (!g.isEmpty()) {
                cksVar = new cks(g);
            }
        }
        return new cji(context, this.b, str, cjyVar, i2, ddwVar, null, cksVar, this.e);
    }

    public final void b(cjy cjyVar) {
        oy.at(cjyVar);
        this.c = cjyVar;
        cje.b(cjyVar);
    }
}
