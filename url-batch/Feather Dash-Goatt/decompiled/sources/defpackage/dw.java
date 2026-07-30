package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dw implements gf1, s01 {
    public final HashMap a;
    public ArrayDeque b;
    public final uk1 c;

    public dw() {
        uk1 uk1Var = uk1.d;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = uk1Var;
    }

    public final void a(af afVar) {
        uk1 uk1Var = this.c;
        synchronized (this) {
            try {
                uk1Var.getClass();
                if (!this.a.containsKey(mo.class)) {
                    this.a.put(mo.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(mo.class)).put(afVar, uk1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
