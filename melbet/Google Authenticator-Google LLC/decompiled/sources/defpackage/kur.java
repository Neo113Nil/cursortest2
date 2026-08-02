package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kur extends kum implements kxr {
    public final Thread b;
    public final kwf c;

    public kur(kqn kqnVar, Thread thread, kwf kwfVar) {
        super(kqnVar, true);
        this.b = thread;
        this.c = kwfVar;
    }

    @Override // defpackage.kqx
    public final /* bridge */ StackTraceElement f() {
        return kxp.a(this);
    }

    @Override // defpackage.kqx
    public final /* bridge */ kqx g() {
        int i;
        if (!kxq.a || N()) {
            return null;
        }
        List D = ixc.D(this.b.getStackTrace());
        if (N()) {
            return null;
        }
        Iterator it = D.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (ixi.e((StackTraceElement) it.next())) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        int size = D.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                break;
            }
            if (!ixi.e((StackTraceElement) D.get(i2))) {
                i = i2;
                break;
            }
        }
        return ixi.d(D, i);
    }

    @Override // defpackage.kxr
    public final /* bridge */ StackTraceElement m() {
        return kxq.e;
    }

    @Override // defpackage.kxb
    protected final void n(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.b;
        if (ksp.b(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // defpackage.kxb
    protected final boolean o() {
        return true;
    }
}
