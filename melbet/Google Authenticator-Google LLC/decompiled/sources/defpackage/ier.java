package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ier extends iws {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    final /* synthetic */ jwx c;
    final /* synthetic */ kae d;
    final /* synthetic */ jww e;
    public iws f;

    public ier(jwx jwxVar, kae kaeVar, jww jwwVar) {
        this.c = jwxVar;
        this.d = kaeVar;
        this.e = jwwVar;
        this.f = jwxVar.b(kaeVar, jwwVar);
    }

    @Override // defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        synchronized (this.a) {
            kaa kaaVar2 = new kaa();
            kaaVar2.g(kaaVar);
            this.b.add(new gbm(this, iwrVar, kaaVar2, 11));
            f().a(new ieq(this, iwrVar), kaaVar);
        }
    }

    @Override // defpackage.iws
    public final void c() {
        synchronized (this.a) {
            this.b.add(new iaq(this, 2));
            f().c();
        }
    }

    @Override // defpackage.iws
    public final void d(int i) {
        synchronized (this.a) {
            this.b.add(new vz(this, i, 5));
            f().d(i);
        }
    }

    @Override // defpackage.iws
    public final void e(Object obj) {
        synchronized (this.a) {
            this.b.add(new iep(this, obj, 0));
            f().e(obj);
        }
    }

    public final iws f() {
        iws iwsVar;
        synchronized (this.a) {
            iwsVar = this.f;
        }
        return iwsVar;
    }

    @Override // defpackage.iws
    public final void r(String str, Throwable th) {
        synchronized (this.a) {
            this.b.add(new gbm(this, str, th, 10));
            f().r(str, th);
        }
    }
}
