package com.ironsource.b.b;

import com.ironsource.b.h.i;

/* compiled from: RewardedVideoEventsManager.java */
/* loaded from: classes2.dex */
public class g extends b {
    private static g k;
    private String l;
    private String m;

    private g() {
        this.i = "outcome";
        this.h = 3;
        this.j = "RV";
        this.l = "";
        this.m = "";
    }

    public static synchronized g c() {
        g gVar;
        synchronized (g.class) {
            if (k == null) {
                k = new g();
                k.a();
            }
            gVar = k;
        }
        return gVar;
    }

    @Override // com.ironsource.b.b.b
    protected boolean c(com.ironsource.a.b bVar) {
        return bVar.a() == 2 || bVar.a() == 10;
    }

    @Override // com.ironsource.b.b.b
    protected boolean d(com.ironsource.a.b bVar) {
        return bVar.a() == 5 || bVar.a() == 6 || bVar.a() == 8 || bVar.a() == 9 || bVar.a() == 19 || bVar.a() == 20 || bVar.a() == 305;
    }

    @Override // com.ironsource.b.b.b
    protected boolean e(com.ironsource.a.b bVar) {
        return bVar.a() == 6 || bVar.a() == 5 || bVar.a() == 10 || bVar.a() == 14 || bVar.a() == 305;
    }

    @Override // com.ironsource.b.b.b
    protected int f(com.ironsource.a.b bVar) {
        int b2 = i.a().b(1);
        return (bVar.a() == 15 || (bVar.a() >= 300 && bVar.a() < 400)) ? i.a().b(0) : b2;
    }

    @Override // com.ironsource.b.b.b
    protected void g(com.ironsource.a.b bVar) {
        if (bVar.a() == 15 || (bVar.a() >= 300 && bVar.a() < 400)) {
            this.m = bVar.d().optString("placement");
        } else {
            this.l = bVar.d().optString("placement");
        }
    }

    @Override // com.ironsource.b.b.b
    protected String d(int i) {
        if (i == 15 || (i >= 300 && i < 400)) {
            return this.m;
        }
        return this.l;
    }

    @Override // com.ironsource.b.b.b
    protected boolean h(com.ironsource.a.b bVar) {
        if (bVar.a() == 6) {
            i.a().a(1);
            return false;
        }
        if (bVar.a() != 305) {
            return false;
        }
        i.a().a(0);
        return false;
    }
}
