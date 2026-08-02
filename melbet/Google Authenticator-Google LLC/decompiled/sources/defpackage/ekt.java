package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ekt implements ekq {
    final /* synthetic */ hac a;
    final /* synthetic */ hac b;
    final /* synthetic */ ekv c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public ekt(ekv ekvVar, hac hacVar, hac hacVar2, Object obj, int i) {
        this.e = i;
        this.a = hacVar;
        this.b = hacVar2;
        this.d = obj;
        this.c = ekvVar;
    }

    private final void a() {
        ekv ekvVar = this.c;
        ekp ekpVar = ekvVar.b;
        if (ekpVar != null) {
            ((elf) this.d).g.remove(ekpVar);
            ekvVar.b = null;
        }
    }

    private final void b() {
        ekv ekvVar = this.c;
        ekw ekwVar = ekvVar.a;
        if (ekwVar != null) {
            ((bry) this.d).h(ekwVar);
            ekvVar.a = null;
        }
    }

    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        int i = this.e;
        hac hacVar = this.a;
        if (i != 0) {
            if (((Boolean) hacVar.bB()).booleanValue()) {
                this.c.c.k(eikVar);
                return;
            } else if (((Boolean) this.b.bB()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.k(eikVar);
                return;
            }
        }
        if (((Boolean) hacVar.bB()).booleanValue()) {
            this.c.c.k(eikVar);
        } else if (((Boolean) this.b.bB()).booleanValue()) {
            this.c.c.k(eikVar);
        } else {
            a();
        }
    }

    @Override // defpackage.ekq
    public final void j(eik eikVar) {
        int i = this.e;
        hac hacVar = this.a;
        if (i != 0) {
            if (((Boolean) hacVar.bB()).booleanValue()) {
                this.c.c.l(eikVar);
                return;
            } else if (((Boolean) this.b.bB()).booleanValue()) {
                b();
                return;
            } else {
                this.c.c.l(eikVar);
                return;
            }
        }
        if (((Boolean) hacVar.bB()).booleanValue()) {
            this.c.c.l(eikVar);
        } else if (((Boolean) this.b.bB()).booleanValue()) {
            this.c.c.l(eikVar);
        } else {
            a();
        }
    }
}
