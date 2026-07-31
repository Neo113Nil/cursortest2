package p1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import m1.AbstractC0521b;
import x1.InterfaceC0726a;
import x1.InterfaceC0727b;

/* loaded from: classes.dex */
public final class i implements InterfaceC0727b, InterfaceC0726a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5683a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f5684b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.i f5685c;

    public i() {
        q1.i iVar = q1.i.f5781f;
        this.f5683a = new HashMap();
        this.f5684b = new ArrayDeque();
        this.f5685c = iVar;
    }

    public final void a(B1.g gVar) {
        q1.i iVar = this.f5685c;
        synchronized (this) {
            try {
                iVar.getClass();
                if (!this.f5683a.containsKey(AbstractC0521b.class)) {
                    this.f5683a.put(AbstractC0521b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f5683a.get(AbstractC0521b.class)).put(gVar, iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
