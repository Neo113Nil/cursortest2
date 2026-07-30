package M2;

import F.m;
import F.n;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import r4.l;
import s4.o;
import s4.p;
import s4.q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: l, reason: collision with root package name */
    public static final ExecutorService f1728l = Executors.newSingleThreadExecutor(new m(1));

    /* renamed from: d, reason: collision with root package name */
    public Context f1729d;

    /* renamed from: e, reason: collision with root package name */
    public q f1730e;

    /* renamed from: i, reason: collision with root package name */
    public s4.f f1731i;

    public static void d(String str, p pVar) {
        h(new F.a(pVar, 15, str));
    }

    public static void e(p pVar) {
        h(new F.b(6, pVar));
    }

    public static void f(Object obj, p pVar) {
        h(new F.a(pVar, 14, obj));
    }

    public static void h(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public final void a(s4.f fVar, String str, o oVar) {
        q qVar = new q(fVar, str);
        qVar.b(oVar);
        if (this.f1730e != null) {
            return;
        }
        this.f1731i = fVar;
        this.f1730e = qVar;
    }

    public final void b(String str, HashMap hashMap) {
        h(new n(this, (Object) str, (Object) hashMap, 3));
    }

    public final void c(s4.f fVar, String str, o oVar) {
        if (fVar == null || fVar == this.f1731i) {
            return;
        }
        this.f1731i = fVar;
        q qVar = new q(fVar, str);
        this.f1730e = qVar;
        qVar.b(oVar);
    }

    public final void g(l lVar, Runnable runnable) {
        f1728l.execute(new F.a(this, runnable, lVar));
    }
}
