package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e03 implements iz2 {

    /* renamed from: g, reason: collision with root package name */
    private static final e03 f4415g = new e03();

    /* renamed from: h, reason: collision with root package name */
    private static final Handler f4416h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    private static Handler f4417i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final Runnable f4418j = new a03();

    /* renamed from: k, reason: collision with root package name */
    private static final Runnable f4419k = new b03();

    /* renamed from: b, reason: collision with root package name */
    private int f4421b;

    /* renamed from: f, reason: collision with root package name */
    private long f4425f;

    /* renamed from: a, reason: collision with root package name */
    private final List<d03> f4420a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final xz2 f4423d = new xz2();

    /* renamed from: c, reason: collision with root package name */
    private final kz2 f4422c = new kz2();

    /* renamed from: e, reason: collision with root package name */
    private final yz2 f4424e = new yz2(new h03());

    e03() {
    }

    public static e03 d() {
        return f4415g;
    }

    static /* bridge */ /* synthetic */ void g(e03 e03Var) {
        e03Var.f4421b = 0;
        e03Var.f4425f = System.nanoTime();
        e03Var.f4423d.i();
        long nanoTime = System.nanoTime();
        jz2 a7 = e03Var.f4422c.a();
        if (e03Var.f4423d.e().size() > 0) {
            Iterator<String> it = e03Var.f4423d.e().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a8 = sz2.a(0, 0, 0, 0);
                View a9 = e03Var.f4423d.a(next);
                jz2 b7 = e03Var.f4422c.b();
                String c7 = e03Var.f4423d.c(next);
                if (c7 != null) {
                    JSONObject b8 = b7.b(a9);
                    sz2.b(b8, next);
                    sz2.e(b8, c7);
                    sz2.c(a8, b8);
                }
                sz2.h(a8);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                e03Var.f4424e.c(a8, hashSet, nanoTime);
            }
        }
        if (e03Var.f4423d.f().size() > 0) {
            JSONObject a10 = sz2.a(0, 0, 0, 0);
            e03Var.k(null, a7, a10, 1);
            sz2.h(a10);
            e03Var.f4424e.d(a10, e03Var.f4423d.f(), nanoTime);
        } else {
            e03Var.f4424e.b();
        }
        e03Var.f4423d.g();
        long nanoTime2 = System.nanoTime() - e03Var.f4425f;
        if (e03Var.f4420a.size() > 0) {
            for (d03 d03Var : e03Var.f4420a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                d03Var.a();
                if (d03Var instanceof c03) {
                    ((c03) d03Var).zza();
                }
            }
        }
    }

    private final void k(View view, jz2 jz2Var, JSONObject jSONObject, int i7) {
        jz2Var.c(view, jSONObject, this, i7 == 1);
    }

    private static final void l() {
        Handler handler = f4417i;
        if (handler != null) {
            handler.removeCallbacks(f4419k);
            f4417i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.iz2
    public final void a(View view, jz2 jz2Var, JSONObject jSONObject) {
        int j7;
        if (vz2.b(view) != null || (j7 = this.f4423d.j(view)) == 3) {
            return;
        }
        JSONObject b7 = jz2Var.b(view);
        sz2.c(jSONObject, b7);
        String d7 = this.f4423d.d(view);
        if (d7 != null) {
            sz2.b(b7, d7);
            this.f4423d.h();
        } else {
            wz2 b8 = this.f4423d.b(view);
            if (b8 != null) {
                sz2.d(b7, b8);
            }
            k(view, jz2Var, b7, j7);
        }
        this.f4421b++;
    }

    public final void h() {
        l();
    }

    public final void i() {
        if (f4417i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f4417i = handler;
            handler.post(f4418j);
            f4417i.postDelayed(f4419k, 200L);
        }
    }

    public final void j() {
        l();
        this.f4420a.clear();
        f4416h.post(new zz2(this));
    }
}
