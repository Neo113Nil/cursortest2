package j0;

import android.content.Context;
import d0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f18053f = j.f("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    protected final n0.a f18054a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f18055b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18056c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Set<h0.a<T>> f18057d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    T f18058e;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f18059f;

        a(List list) {
            this.f18059f = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f18059f.iterator();
            while (it.hasNext()) {
                ((h0.a) it.next()).a(d.this.f18058e);
            }
        }
    }

    d(Context context, n0.a aVar) {
        this.f18055b = context.getApplicationContext();
        this.f18054a = aVar;
    }

    public void a(h0.a<T> aVar) {
        synchronized (this.f18056c) {
            if (this.f18057d.add(aVar)) {
                if (this.f18057d.size() == 1) {
                    this.f18058e = b();
                    j.c().a(f18053f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f18058e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f18058e);
            }
        }
    }

    public abstract T b();

    public void c(h0.a<T> aVar) {
        synchronized (this.f18056c) {
            if (this.f18057d.remove(aVar) && this.f18057d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t6) {
        synchronized (this.f18056c) {
            T t7 = this.f18058e;
            if (t7 != t6 && (t7 == null || !t7.equals(t6))) {
                this.f18058e = t6;
                this.f18054a.a().execute(new a(new ArrayList(this.f18057d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
