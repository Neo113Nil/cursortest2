package b.a.b;

import b.ae;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RouteDatabase.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<ae> f1841a = new LinkedHashSet();

    public synchronized void a(ae aeVar) {
        this.f1841a.add(aeVar);
    }

    public synchronized void b(ae aeVar) {
        this.f1841a.remove(aeVar);
    }

    public synchronized boolean c(ae aeVar) {
        return this.f1841a.contains(aeVar);
    }
}
