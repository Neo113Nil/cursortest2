package com.anythink.expressad.foundation.g.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19545a = "k";

    /* renamed from: b, reason: collision with root package name */
    private Context f19546b;

    /* renamed from: g, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.e.a f19551g;

    /* renamed from: d, reason: collision with root package name */
    private Set<j> f19548d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private ExecutorService f19549e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* renamed from: f, reason: collision with root package name */
    private AtomicInteger f19550f = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private c f19547c = new d(new Handler(Looper.getMainLooper()));

    public interface a {
        boolean a(j<?> jVar);
    }

    public k(Context context) {
        this.f19546b = context.getApplicationContext();
    }

    private int a() {
        return this.f19550f.incrementAndGet();
    }

    public final void b(j jVar) {
        synchronized (this) {
            this.f19548d.remove(jVar);
        }
    }

    private void a(a aVar) {
        synchronized (this) {
            try {
                for (j jVar : this.f19548d) {
                    if (aVar.a(jVar)) {
                        jVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private k(Context context, com.anythink.expressad.foundation.g.f.e.a aVar) {
        this.f19551g = aVar;
        this.f19546b = context.getApplicationContext();
    }

    private void a(final Object obj) {
        if (obj != null) {
            a(new a() { // from class: com.anythink.expressad.foundation.g.f.k.1
                @Override // com.anythink.expressad.foundation.g.f.k.a
                public final boolean a(j<?> jVar) {
                    return jVar.b() == obj;
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public final void a(final j jVar) {
        jVar.a(this);
        synchronized (this) {
            this.f19548d.add(jVar);
        }
        jVar.a(this.f19550f.incrementAndGet());
        this.f19549e.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.k.2
            @Override // java.lang.Runnable
            public final void run() {
                if (k.this.f19551g == null) {
                    Context unused = k.this.f19546b;
                    new i(null, k.this.f19547c).a(jVar);
                } else {
                    Context unused2 = k.this.f19546b;
                    new i(null, k.this.f19547c, k.this.f19551g).a(jVar);
                }
            }
        });
    }
}
