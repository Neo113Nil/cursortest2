package k2;

import A.m;
import A.n;
import N3.j;
import O3.i;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0467a {

    /* renamed from: i, reason: collision with root package name */
    public static final ExecutorService f5175i = Executors.newSingleThreadExecutor(new m(1));

    /* renamed from: f, reason: collision with root package name */
    public Context f5176f;

    /* renamed from: g, reason: collision with root package name */
    public B0.c f5177g;

    /* renamed from: h, reason: collision with root package name */
    public O3.e f5178h;

    public static void d(j jVar, String str) {
        i(new A.a(jVar, 18, str));
    }

    public static void e(j jVar) {
        i(new A.b(17, jVar));
    }

    public static void f(j jVar, Object obj) {
        i(new A.a(jVar, 17, obj));
    }

    public static void i(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public final void a(O3.e eVar, String str, i iVar) {
        B0.c cVar = new B0.c(eVar, str);
        cVar.C(iVar);
        if (this.f5177g != null) {
            return;
        }
        this.f5178h = eVar;
        this.f5177g = cVar;
    }

    public final void b(String str, HashMap hashMap) {
        i(new n(this, (Object) str, (Object) hashMap, 2));
    }

    public final void c(O3.e eVar, String str, i iVar) {
        if (eVar == null || eVar == this.f5178h) {
            return;
        }
        this.f5178h = eVar;
        B0.c cVar = new B0.c(eVar, str);
        this.f5177g = cVar;
        cVar.C(iVar);
    }

    public final void h(j jVar, Runnable runnable) {
        f5175i.execute(new A.a(this, runnable, jVar));
    }
}
