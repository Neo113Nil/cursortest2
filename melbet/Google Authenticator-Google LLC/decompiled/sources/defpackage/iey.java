package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iey extends iws {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    final /* synthetic */ jwx c;
    final /* synthetic */ kae d;
    final /* synthetic */ jww e;
    final /* synthetic */ iez f;
    public iws g;

    public iey(jwx jwxVar, kae kaeVar, jww jwwVar, iez iezVar) {
        this.c = jwxVar;
        this.d = kaeVar;
        this.e = jwwVar;
        this.f = iezVar;
        this.g = jwxVar.b(kaeVar, jwwVar);
    }

    @Override // defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        iwrVar.getClass();
        kaaVar.getClass();
        synchronized (this.a) {
            kaa kaaVar2 = new kaa();
            kaaVar2.g(kaaVar);
            this.b.add(new gbm(this, iwrVar, kaaVar2, 13));
            f().a(new iex(this, iwrVar), kaaVar);
        }
    }

    @Override // defpackage.iws
    public final void c() {
        synchronized (this.a) {
            this.b.add(new iaq(this, 3));
            f().c();
        }
    }

    @Override // defpackage.iws
    public final void d(int i) {
        synchronized (this.a) {
            this.b.add(new vz(this, i, 6));
            f().d(i);
        }
    }

    @Override // defpackage.iws
    public final void e(Object obj) {
        synchronized (this.a) {
            this.b.add(new iep(this, obj, 2));
            f().e(obj);
        }
    }

    public final iws f() {
        iws iwsVar;
        synchronized (this.a) {
            iwsVar = this.g;
        }
        return iwsVar;
    }

    @Override // defpackage.iws
    public final void r(String str, Throwable th) {
        synchronized (this.a) {
            this.b.add(new gbm(this, str, th, 12));
            f().r(str, th);
        }
    }
}
