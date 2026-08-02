package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hux {
    public final AtomicInteger c;
    public final hvi[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public hux(hvi[] hviVarArr) {
        this.d = hviVarArr;
        this.c = new AtomicInteger(hviVarArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (hvi hviVar : this.d) {
                if (hviVar != null) {
                    hviVar.cancel(this.b);
                }
            }
        }
    }
}
