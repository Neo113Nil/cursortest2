package com.google.android.gms.common.api.internal;

import a4.e;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p3.f;
import p3.g;
import p3.h;
import p3.j;
import p3.k;
import r3.o;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends j> extends g<R> {

    /* renamed from: o, reason: collision with root package name */
    static final ThreadLocal<Boolean> f2472o = new b();

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f2473p = 0;

    /* renamed from: f, reason: collision with root package name */
    private k<? super R> f2479f;

    /* renamed from: h, reason: collision with root package name */
    private R f2481h;

    /* renamed from: i, reason: collision with root package name */
    private Status f2482i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f2483j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2484k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2485l;

    /* renamed from: m, reason: collision with root package name */
    private r3.j f2486m;

    @KeepName
    private c mResultGuardian;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2474a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f2477d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<g.a> f2478e = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<com.google.android.gms.common.api.internal.a> f2480g = new AtomicReference<>();

    /* renamed from: n, reason: collision with root package name */
    private boolean f2487n = false;

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    protected final a<R> f2475b = new a<>(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    protected final WeakReference<f> f2476c = new WeakReference<>(null);

    public static class a<R extends j> extends e {
        public a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        public final void a(@RecentlyNonNull k<? super R> kVar, @RecentlyNonNull R r7) {
            int i7 = BasePendingResult.f2473p;
            sendMessage(obtainMessage(1, new Pair((k) o.i(kVar), r7)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@RecentlyNonNull Message message) {
            int i7 = message.what;
            if (i7 != 1) {
                if (i7 == 2) {
                    ((BasePendingResult) message.obj).b(Status.f2463n);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i7);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            k kVar = (k) pair.first;
            j jVar = (j) pair.second;
            try {
                kVar.a(jVar);
            } catch (RuntimeException e7) {
                BasePendingResult.g(jVar);
                throw e7;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R e() {
        R r7;
        synchronized (this.f2474a) {
            o.l(!this.f2483j, "Result has already been consumed.");
            o.l(c(), "Result is not ready.");
            r7 = this.f2481h;
            this.f2481h = null;
            this.f2479f = null;
            this.f2483j = true;
        }
        if (this.f2480g.getAndSet(null) == null) {
            return (R) o.i(r7);
        }
        throw null;
    }

    private final void f(R r7) {
        this.f2481h = r7;
        this.f2482i = r7.a();
        b bVar = null;
        this.f2486m = null;
        this.f2477d.countDown();
        if (this.f2484k) {
            this.f2479f = null;
        } else {
            k<? super R> kVar = this.f2479f;
            if (kVar != null) {
                this.f2475b.removeMessages(2);
                this.f2475b.a(kVar, e());
            } else if (this.f2481h instanceof h) {
                this.mResultGuardian = new c(this, bVar);
            }
        }
        ArrayList<g.a> arrayList = this.f2478e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).a(this.f2482i);
        }
        this.f2478e.clear();
    }

    public static void g(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).a();
            } catch (RuntimeException e7) {
                String valueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e7);
            }
        }
    }

    protected abstract R a(@RecentlyNonNull Status status);

    @Deprecated
    public final void b(@RecentlyNonNull Status status) {
        synchronized (this.f2474a) {
            if (!c()) {
                d(a(status));
                this.f2485l = true;
            }
        }
    }

    public final boolean c() {
        return this.f2477d.getCount() == 0;
    }

    public final void d(@RecentlyNonNull R r7) {
        synchronized (this.f2474a) {
            if (this.f2485l || this.f2484k) {
                g(r7);
                return;
            }
            c();
            o.l(!c(), "Results have already been set");
            o.l(!this.f2483j, "Result has already been consumed");
            f(r7);
        }
    }
}
