package com.ironsource.b.b;

import com.ironsource.b.h.i;

/* compiled from: InterstitialEventsManager.java */
/* loaded from: classes2.dex */
public class d extends b {
    private static d k;
    private String l;
    private String m;

    private d() {
        this.i = "ironbeast";
        this.h = 2;
        this.j = "IS";
        this.l = "";
        this.m = "";
    }

    public static synchronized d c() {
        d dVar;
        synchronized (d.class) {
            if (k == null) {
                k = new d();
                k.a();
            }
            dVar = k;
        }
        return dVar;
    }

    @Override // com.ironsource.b.b.b
    protected boolean c(com.ironsource.a.b bVar) {
        return bVar.a() == 23 || bVar.a() == 402;
    }

    @Override // com.ironsource.b.b.b
    protected boolean d(com.ironsource.a.b bVar) {
        return bVar.a() == 25 || bVar.a() == 26 || bVar.a() == 28 || bVar.a() == 29 || bVar.a() == 34 || bVar.a() == 405 || bVar.a() == 407 || bVar.a() == 408 || bVar.a() == 414;
    }

    @Override // com.ironsource.b.b.b
    protected boolean e(com.ironsource.a.b bVar) {
        return bVar.a() == 26 || bVar.a() == 25 || bVar.a() == 405;
    }

    @Override // com.ironsource.b.b.b
    protected int f(com.ironsource.a.b bVar) {
        int b2 = i.a().b(2);
        return (bVar.a() < 400 || bVar.a() >= 500) ? b2 : i.a().b(3);
    }

    @Override // com.ironsource.b.b.b
    protected boolean h(com.ironsource.a.b bVar) {
        if (bVar.a() == 26) {
            i.a().a(2);
            return false;
        }
        if (bVar.a() != 402 || !b(bVar).equals("Mediation")) {
            return false;
        }
        i.a().a(3);
        return true;
    }

    @Override // com.ironsource.b.b.b
    protected void g(com.ironsource.a.b bVar) {
        if (bVar.a() >= 400 && bVar.a() < 500) {
            this.m = bVar.d().optString("placement");
        } else {
            this.l = bVar.d().optString("placement");
        }
    }

    @Override // com.ironsource.b.b.b
    protected String d(int i) {
        if (i >= 400 && i < 500) {
            return this.m;
        }
        return this.l;
    }
}
