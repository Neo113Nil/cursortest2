package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ekv {
    public ekw a;
    public ekp b;
    public final eku c = new eku();

    public ekv(bry bryVar, elf elfVar, koe koeVar, koe koeVar2) {
        int i = 0;
        hac v = hoq.v(new eks(koeVar, i));
        hac v2 = hoq.v(new eks(koeVar2, i));
        if (!((Boolean) v2.bB()).booleanValue()) {
            d(bryVar, v, v2);
            c(elfVar, v, v2);
        } else if (((Boolean) v.bB()).booleanValue()) {
            c(elfVar, v, v2);
        } else {
            d(bryVar, v, v2);
        }
    }

    private final void c(elf elfVar, hac hacVar, hac hacVar2) {
        this.b = new ekp(new ekt(this, hacVar2, hacVar, elfVar, 0));
        elfVar.g.add(this.b);
    }

    private final void d(bry bryVar, hac hacVar, hac hacVar2) {
        ekw ekwVar = new ekw(new ekt(this, hacVar2, hacVar, bryVar, 1));
        this.a = ekwVar;
        bryVar.g(ekwVar);
    }

    public final void a(ekq ekqVar) {
        this.c.b.add(ekqVar);
    }

    public final void b(ekq ekqVar) {
        this.c.b.remove(ekqVar);
    }
}
