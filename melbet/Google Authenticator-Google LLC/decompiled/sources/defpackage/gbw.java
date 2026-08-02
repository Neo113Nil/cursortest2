package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbw {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public gbw(fog fogVar) {
        this.i = new foe();
        this.a = new foe();
        this.e = new foe();
        this.c = new foe();
        this.d = new fnt(0.0f);
        this.k = new fnt(0.0f);
        this.f = new fnt(0.0f);
        this.b = new fnt(0.0f);
        this.h = new fny();
        this.l = new fny();
        this.j = new fny();
        this.g = new fny();
        this.i = fogVar.j;
        this.a = fogVar.k;
        this.e = fogVar.l;
        this.c = fogVar.m;
        this.d = fogVar.b;
        this.k = fogVar.c;
        this.f = fogVar.d;
        this.b = fogVar.e;
        this.h = fogVar.f;
        this.l = fogVar.g;
        this.j = fogVar.h;
        this.g = fogVar.i;
    }

    private static void p(fny fnyVar) {
        if (fnyVar instanceof foe) {
            float f = ((foe) fnyVar).a;
        } else if (fnyVar instanceof fnx) {
            float f2 = ((fnx) fnyVar).a;
        }
    }

    public final gca a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5 = this.a;
        if (obj5 == null || (obj = this.b) == null || (obj2 = this.d) == null || (obj3 = this.f) == null || (obj4 = this.i) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" workerClass");
            }
            if (this.b == null) {
                sb.append(" constraints");
            }
            if (this.d == null) {
                sb.append(" initialDelay");
            }
            if (this.f == null) {
                sb.append(" inputData");
            }
            if (this.i == null) {
                sb.append(" tags");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj6 = this.c;
        Object obj7 = this.e;
        Object obj8 = this.g;
        Object obj9 = this.h;
        gzp gzpVar = (gzp) this.j;
        gzp gzpVar2 = (gzp) obj8;
        gzp gzpVar3 = (gzp) obj6;
        gby gbyVar = (gby) obj2;
        ary aryVar = (ary) obj;
        Class cls = (Class) obj5;
        gca gcaVar = new gca(cls, aryVar, gzpVar3, gbyVar, (gzp) obj7, (asa) obj3, gzpVar2, (gzp) obj9, (hfm) obj4, gzpVar, (gzp) this.k, (gzp) this.l);
        if (gcaVar.l.f()) {
            hoq.y(!((String) r0.b()).contains(":"), "Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
        }
        return gcaVar;
    }

    public final void b(art artVar, gby gbyVar) {
        this.k = gzp.h(gbyVar);
        this.j = gzp.h(artVar);
    }

    public final void c(ary aryVar) {
        if (aryVar == null) {
            throw new NullPointerException("Null constraints");
        }
        this.b = aryVar;
    }

    public final void d(Set set) {
        this.i = hfm.n(set);
    }

    public final void e(String str) {
        this.l = gzp.h(str);
    }

    public final void f(gbz gbzVar) {
        this.h = gzp.h(gbzVar);
    }

    public final void g(float f) {
        this.b = new fnt(f);
    }

    public final void h(float f) {
        this.f = new fnt(f);
    }

    public final void i(float f) {
        this.d = new fnt(f);
    }

    public final void j(float f) {
        this.k = new fnt(f);
    }

    public final void k(float f) {
        i(f);
        j(f);
        h(f);
        g(f);
    }

    public final void l(fny fnyVar) {
        this.c = fnyVar;
        p(fnyVar);
    }

    public final void m(fny fnyVar) {
        this.e = fnyVar;
        p(fnyVar);
    }

    public final void n(fny fnyVar) {
        this.i = fnyVar;
        p(fnyVar);
    }

    public final void o(fny fnyVar) {
        this.a = fnyVar;
        p(fnyVar);
    }

    public gbw() {
        gyf gyfVar = gyf.a;
        this.c = gyfVar;
        this.e = gyfVar;
        this.g = gyfVar;
        this.h = gyfVar;
        this.j = gyfVar;
        this.k = gyfVar;
        this.l = gyfVar;
    }

    public gbw(gca gcaVar) {
        gyf gyfVar = gyf.a;
        this.c = gyfVar;
        this.e = gyfVar;
        this.g = gyfVar;
        this.h = gyfVar;
        this.j = gyfVar;
        this.k = gyfVar;
        this.l = gyfVar;
        this.a = gcaVar.a;
        this.b = gcaVar.b;
        this.c = gcaVar.c;
        this.d = gcaVar.d;
        this.e = gcaVar.e;
        this.f = gcaVar.f;
        this.g = gcaVar.g;
        this.h = gcaVar.h;
        this.i = gcaVar.i;
        this.j = gcaVar.j;
        this.k = gcaVar.k;
        this.l = gcaVar.l;
    }

    public gbw(byte[] bArr) {
        this.i = new foe();
        this.a = new foe();
        this.e = new foe();
        this.c = new foe();
        this.d = new fnt(0.0f);
        this.k = new fnt(0.0f);
        this.f = new fnt(0.0f);
        this.b = new fnt(0.0f);
        this.h = new fny();
        this.l = new fny();
        this.j = new fny();
        this.g = new fny();
    }
}
