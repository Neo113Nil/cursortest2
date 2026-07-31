package androidx.work;

import android.os.Build;
import d0.g;
import d0.i;
import d0.q;
import d0.v;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final Executor f1419a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f1420b;

    /* renamed from: c, reason: collision with root package name */
    final v f1421c;

    /* renamed from: d, reason: collision with root package name */
    final i f1422d;

    /* renamed from: e, reason: collision with root package name */
    final q f1423e;

    /* renamed from: f, reason: collision with root package name */
    final g f1424f;

    /* renamed from: g, reason: collision with root package name */
    final String f1425g;

    /* renamed from: h, reason: collision with root package name */
    final int f1426h;

    /* renamed from: i, reason: collision with root package name */
    final int f1427i;

    /* renamed from: j, reason: collision with root package name */
    final int f1428j;

    /* renamed from: k, reason: collision with root package name */
    final int f1429k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f1430l;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0029a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f1431a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1432b;

        ThreadFactoryC0029a(boolean z6) {
            this.f1432b = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f1432b ? "WM.task-" : "androidx.work-") + this.f1431a.incrementAndGet());
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        Executor f1434a;

        /* renamed from: b, reason: collision with root package name */
        v f1435b;

        /* renamed from: c, reason: collision with root package name */
        i f1436c;

        /* renamed from: d, reason: collision with root package name */
        Executor f1437d;

        /* renamed from: e, reason: collision with root package name */
        q f1438e;

        /* renamed from: f, reason: collision with root package name */
        g f1439f;

        /* renamed from: g, reason: collision with root package name */
        String f1440g;

        /* renamed from: h, reason: collision with root package name */
        int f1441h = 4;

        /* renamed from: i, reason: collision with root package name */
        int f1442i = 0;

        /* renamed from: j, reason: collision with root package name */
        int f1443j = Integer.MAX_VALUE;

        /* renamed from: k, reason: collision with root package name */
        int f1444k = 20;

        public a a() {
            return new a(this);
        }
    }

    public interface c {
        a a();
    }

    a(b bVar) {
        Executor executor = bVar.f1434a;
        this.f1419a = executor == null ? a(false) : executor;
        Executor executor2 = bVar.f1437d;
        if (executor2 == null) {
            this.f1430l = true;
            executor2 = a(true);
        } else {
            this.f1430l = false;
        }
        this.f1420b = executor2;
        v vVar = bVar.f1435b;
        this.f1421c = vVar == null ? v.c() : vVar;
        i iVar = bVar.f1436c;
        this.f1422d = iVar == null ? i.c() : iVar;
        q qVar = bVar.f1438e;
        this.f1423e = qVar == null ? new e0.a() : qVar;
        this.f1426h = bVar.f1441h;
        this.f1427i = bVar.f1442i;
        this.f1428j = bVar.f1443j;
        this.f1429k = bVar.f1444k;
        this.f1424f = bVar.f1439f;
        this.f1425g = bVar.f1440g;
    }

    private Executor a(boolean z6) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z6));
    }

    private ThreadFactory b(boolean z6) {
        return new ThreadFactoryC0029a(z6);
    }

    public String c() {
        return this.f1425g;
    }

    public g d() {
        return this.f1424f;
    }

    public Executor e() {
        return this.f1419a;
    }

    public i f() {
        return this.f1422d;
    }

    public int g() {
        return this.f1428j;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f1429k / 2 : this.f1429k;
    }

    public int i() {
        return this.f1427i;
    }

    public int j() {
        return this.f1426h;
    }

    public q k() {
        return this.f1423e;
    }

    public Executor l() {
        return this.f1420b;
    }

    public v m() {
        return this.f1421c;
    }
}
