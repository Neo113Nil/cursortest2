package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dda implements ddj {
    public final Object a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public dda(Executor executor, Object obj, int i) {
        this.d = i;
        this.a = new Object();
        this.c = executor;
        this.b = obj;
    }

    @Override // defpackage.ddj
    public final void b(ddi ddiVar) {
        int i = this.d;
        if (i == 0) {
            if (((ddm) ddiVar).c) {
                synchronized (this.a) {
                }
                this.c.execute(new ath(this, 8, null));
                return;
            }
            return;
        }
        if (i == 1) {
            new avl(this, ddiVar, 15, (int[]) null).run();
            return;
        }
        if (i == 2) {
            synchronized (this.a) {
            }
            this.c.execute(new avl(this, ddiVar, 17, (int[]) null));
        } else {
            if (i != 3) {
                if (ddiVar.f()) {
                    synchronized (this.a) {
                    }
                    this.c.execute(new avl(this, ddiVar, 19, (int[]) null));
                    return;
                }
                return;
            }
            if (ddiVar.f() || ((ddm) ddiVar).c) {
                return;
            }
            synchronized (this.a) {
            }
            this.c.execute(new avl(this, ddiVar, 18, (int[]) null));
        }
    }

    public dda(Executor executor, dcy dcyVar, ddm ddmVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = dcyVar;
        this.a = ddmVar;
    }
}
