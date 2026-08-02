package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajk {
    public final ajw a;
    public final akt b;
    public final Map c;
    public final ReentrantLock d;
    public final AtomicInteger e;
    public final kri f;
    public final kri g;
    public final Object h;
    public yp i;
    private final Map j;
    private final Map k;
    private final String[] l;

    public ajk(ajw ajwVar, Map map, Map map2, String... strArr) {
        this.a = ajwVar;
        this.j = map;
        this.k = map2;
        this.l = strArr;
        akt aktVar = new akt(ajwVar, map, map2, strArr, ajwVar.h, new gdg((Object) this, 1, (byte[]) null));
        this.b = aktVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new AtomicInteger(0);
        this.f = new aji(0);
        this.g = new aji(2);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.h = new Object();
        aktVar.f = new nb(this, 6);
    }

    public final Object a(kqj kqjVar) {
        Object e = this.b.e(kqjVar);
        return e == kqp.a ? e : kow.a;
    }

    public final void b() {
        this.b.f(this.f, this.g);
    }
}
