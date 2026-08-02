package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avp {
    public final brr a;
    private final asz b;
    private final long c;
    private final Object d = new Object();
    private final Map e = new LinkedHashMap();

    public avp(asz aszVar, brr brrVar, long j) {
        this.b = aszVar;
        this.a = brrVar;
        this.c = j;
    }

    public final void a(brn brnVar) {
        Runnable runnable;
        brnVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(brnVar);
        }
        if (runnable != null) {
            this.b.a(runnable);
        }
    }

    public final void b(brn brnVar) {
        avl avlVar = new avl((Object) this, (Object) brnVar, 2, (short[]) null);
        synchronized (this.d) {
        }
        this.b.b(this.c, avlVar);
    }
}
