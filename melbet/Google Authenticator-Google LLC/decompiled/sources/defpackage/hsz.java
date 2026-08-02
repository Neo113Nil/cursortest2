package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hsz extends hsx {
    @Override // defpackage.hsx
    public final hst a(hte hteVar, hst hstVar) {
        hst hstVar2;
        synchronized (hteVar) {
            hstVar2 = hteVar.listenersField;
            if (hstVar2 != hstVar) {
                hteVar.listenersField = hstVar;
            }
        }
        return hstVar2;
    }

    @Override // defpackage.hsx
    public final htd b(hte hteVar, htd htdVar) {
        htd htdVar2;
        synchronized (hteVar) {
            htdVar2 = hteVar.waitersField;
            if (htdVar2 != htdVar) {
                hteVar.waitersField = htdVar;
            }
        }
        return htdVar2;
    }

    @Override // defpackage.hsx
    public final void c(htd htdVar, htd htdVar2) {
        htdVar.next = htdVar2;
    }

    @Override // defpackage.hsx
    public final void d(htd htdVar, Thread thread) {
        htdVar.thread = thread;
    }

    @Override // defpackage.hsx
    public final boolean e(hte hteVar, hst hstVar, hst hstVar2) {
        synchronized (hteVar) {
            if (hteVar.listenersField != hstVar) {
                return false;
            }
            hteVar.listenersField = hstVar2;
            return true;
        }
    }

    @Override // defpackage.hsx
    public final boolean f(hte hteVar, Object obj, Object obj2) {
        synchronized (hteVar) {
            if (hteVar.valueField != obj) {
                return false;
            }
            hteVar.valueField = obj2;
            return true;
        }
    }

    @Override // defpackage.hsx
    public final boolean g(hte hteVar, htd htdVar, htd htdVar2) {
        synchronized (hteVar) {
            if (hteVar.waitersField != htdVar) {
                return false;
            }
            hteVar.waitersField = htdVar2;
            return true;
        }
    }
}
