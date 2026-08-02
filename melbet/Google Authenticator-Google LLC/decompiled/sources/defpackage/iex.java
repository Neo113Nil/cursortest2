package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iex extends kav {
    final /* synthetic */ iey a;
    private kaa b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iex(iey ieyVar, iwr iwrVar) {
        super(iwrVar);
        this.a = ieyVar;
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        boolean z;
        kbqVar.getClass();
        kaaVar.getClass();
        iey ieyVar = this.a;
        Object obj = ieyVar.a;
        iez iezVar = ieyVar.f;
        synchronized (obj) {
            z = false;
            if (!this.c) {
                if (((Boolean) iezVar.a.a(kbqVar, kaaVar)).booleanValue()) {
                    z = true;
                }
            }
        }
        if (!z) {
            kaa kaaVar2 = this.b;
            if (kaaVar2 != null) {
                this.f.b(kaaVar2);
                this.b = null;
            }
            this.f.a(kbqVar, kaaVar);
            return;
        }
        iey ieyVar2 = this.a;
        jwx jwxVar = ieyVar2.c;
        Object obj2 = ieyVar2.a;
        kae kaeVar = ieyVar2.d;
        iez iezVar2 = ieyVar2.f;
        jww jwwVar = ieyVar2.e;
        synchronized (obj2) {
            ieyVar2.g = jwxVar.b(kaeVar, (jww) iezVar2.b.a(jwwVar));
            for (Object obj3 : ieyVar2.b) {
                obj3.getClass();
                ((Runnable) obj3).run();
            }
        }
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void b(kaa kaaVar) {
        kaaVar.getClass();
        this.b = kaaVar;
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void c(Object obj) {
        kaa kaaVar = this.b;
        if (kaaVar != null) {
            this.f.b(kaaVar);
            this.b = null;
            this.c = true;
        }
        this.f.c(obj);
    }
}
