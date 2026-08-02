package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evh {
    public hvi a = null;
    public final ConcurrentMap b = new ConcurrentHashMap();

    public final synchronized void a(etd etdVar) {
        if (this.a == null) {
            this.a = djl.e(etdVar.c, new ect(this, 20), etdVar.d());
        }
    }
}
