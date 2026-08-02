package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rj extends rc {
    @Override // defpackage.rc
    public final void a(rk rkVar, rk rkVar2) {
        rkVar.next = rkVar2;
    }

    @Override // defpackage.rc
    public final void b(rk rkVar, Thread thread) {
        rkVar.thread = thread;
    }

    @Override // defpackage.rc
    public final boolean c(rl rlVar, rg rgVar, rg rgVar2) {
        synchronized (rlVar) {
            if (rlVar.listeners != rgVar) {
                return false;
            }
            rlVar.listeners = rgVar2;
            return true;
        }
    }

    @Override // defpackage.rc
    public final boolean d(rl rlVar, Object obj, Object obj2) {
        synchronized (rlVar) {
            if (rlVar.value != obj) {
                return false;
            }
            rlVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.rc
    public final boolean e(rl rlVar, rk rkVar, rk rkVar2) {
        synchronized (rlVar) {
            if (rlVar.waiters != rkVar) {
                return false;
            }
            rlVar.waiters = rkVar2;
            return true;
        }
    }
}
