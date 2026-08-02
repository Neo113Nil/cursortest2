package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gim implements ghh {
    private volatile ghm a;
    private her b;
    private boolean c;
    private ikm d;

    public gim(Map map, ghm ghmVar) {
        this.a = ghmVar;
        this.b = hnu.ad(map);
    }

    @Override // defpackage.ghh
    public final ggn a(String str, krt krtVar) {
        fao.c();
        Object p = ixd.p(this.b, str);
        p.getClass();
        ggn ggnVar = (ggn) p;
        if (!this.c) {
            krtVar.a(this.a);
        }
        this.c = true;
        return ggnVar;
    }

    @Override // defpackage.ghh
    public final ghm b() {
        return this.a;
    }

    @Override // defpackage.ghh
    public final void c() {
        fao.c();
        ikm ikmVar = this.d;
        ikmVar.getClass();
        this.b = (her) ikmVar.b;
        ikmVar.getClass();
        this.a = (ghm) ikmVar.a;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.ghh
    public final boolean d() {
        fao.c();
        return this.d != null;
    }

    @Override // defpackage.ghh
    public final boolean e(Map map, ghm ghmVar) {
        fao.c();
        her ad = hnu.ad(map);
        if (this.c) {
            this.d = new ikm(ad, ghmVar, (short[]) null);
            return false;
        }
        this.b = ad;
        this.a = ghmVar;
        return true;
    }
}
