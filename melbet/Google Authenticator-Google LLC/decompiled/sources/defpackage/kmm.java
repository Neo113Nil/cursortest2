package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmm {
    public static final kmm a = new kmm(new ixj[0]);
    public final ixj[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public kmm(ixj[] ixjVarArr) {
        this.b = ixjVarArr;
    }

    public static /* synthetic */ void d(kmm kmmVar) {
        int i = 0;
        while (true) {
            ixj[] ixjVarArr = kmmVar.b;
            if (i >= ixjVarArr.length) {
                return;
            }
            ixj ixjVar = ixjVarArr[i];
            i++;
        }
    }

    public final void a(long j) {
        int i = 0;
        while (true) {
            ixj[] ixjVarArr = this.b;
            if (i >= ixjVarArr.length) {
                return;
            }
            ixjVarArr[i].b(j);
            i++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            ixj[] ixjVarArr = this.b;
            if (i >= ixjVarArr.length) {
                return;
            }
            ixjVarArr[i].c(j);
            i++;
        }
    }

    public final void c() {
        if (this.c.compareAndSet(false, true)) {
            for (ixj ixjVar : this.b) {
            }
        }
    }
}
