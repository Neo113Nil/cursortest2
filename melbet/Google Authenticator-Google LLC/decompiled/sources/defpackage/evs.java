package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evs {
    public final hac a;
    private final Context c;
    private final hac d;
    private final hac e;
    private volatile int f = 0;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Object g = new Object();
    private volatile hvi h = null;

    public evs(Context context, hac hacVar, hac hacVar2, hac hacVar3) {
        this.c = context;
        this.d = hacVar;
        this.e = hacVar2;
        this.a = hacVar3;
    }

    public final void a(iac iacVar, evq evqVar) {
        hvi f;
        evt evtVar = (evt) this.e.bB();
        if (evtVar == null) {
            hvi hviVar = hve.a;
            return;
        }
        int i = 1 << iacVar.h;
        if ((this.f & i) == 0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            synchronized (copyOnWriteArrayList) {
                int i2 = this.f;
                if ((i2 & i) == 0) {
                    copyOnWriteArrayList.add(evqVar);
                    this.f = i | i2;
                }
            }
        }
        if (this.h == null) {
            synchronized (this.g) {
                if (this.h == null) {
                    Context context = this.c;
                    if (djl.h(context)) {
                        cov covVar = new cov(6);
                        hac hacVar = this.d;
                        f = hti.g(djl.e(context, covVar, (Executor) hacVar.bB()), new egl(this, evtVar, 6), (Executor) hacVar.bB());
                        this.h = f;
                    } else {
                        f = ((etp) this.a.bB()).f(new evr(this, evtVar));
                        this.h = f;
                    }
                    f.c(new evp(f, 2), (Executor) this.d.bB());
                }
            }
        }
    }
}
