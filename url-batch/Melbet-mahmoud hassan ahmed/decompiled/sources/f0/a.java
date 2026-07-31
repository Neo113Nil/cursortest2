package f0;

import d0.j;
import d0.q;
import java.util.HashMap;
import java.util.Map;
import l0.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    static final String f16082d = j.f("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final b f16083a;

    /* renamed from: b, reason: collision with root package name */
    private final q f16084b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Runnable> f16085c = new HashMap();

    /* renamed from: f0.a$a, reason: collision with other inner class name */
    class RunnableC0060a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f16086f;

        RunnableC0060a(p pVar) {
            this.f16086f = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c().a(a.f16082d, String.format("Scheduling work %s", this.f16086f.f18477a), new Throwable[0]);
            a.this.f16083a.d(this.f16086f);
        }
    }

    public a(b bVar, q qVar) {
        this.f16083a = bVar;
        this.f16084b = qVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f16085c.remove(pVar.f18477a);
        if (remove != null) {
            this.f16084b.b(remove);
        }
        RunnableC0060a runnableC0060a = new RunnableC0060a(pVar);
        this.f16085c.put(pVar.f18477a, runnableC0060a);
        this.f16084b.a(pVar.a() - System.currentTimeMillis(), runnableC0060a);
    }

    public void b(String str) {
        Runnable remove = this.f16085c.remove(str);
        if (remove != null) {
            this.f16084b.b(remove);
        }
    }
}
