package s0;

import D4.C0007g;
import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import h1.C0478a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import u0.C1475a;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11788c;

    public /* synthetic */ m(Object obj, int i2, Object obj2) {
        this.f11786a = i2;
        this.f11787b = obj;
        this.f11788c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11786a) {
            case 0:
                C0007g c0007g = (C0007g) this.f11787b;
                try {
                    c0007g.resumeWith(((J1.a) this.f11788c).get());
                    return;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        c0007g.n(cause);
                        return;
                    } else {
                        c0007g.resumeWith(e5.g.l(cause));
                        return;
                    }
                }
            case 1:
                try {
                    ((Worker) this.f11788c).getClass();
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th2) {
                    ((D0.k) this.f11787b).l(th2);
                    return;
                }
            case 2:
                if (((t0.q) this.f11788c).f11918q.f428a instanceof D0.a) {
                    return;
                }
                try {
                    ((D0.k) this.f11787b).get();
                    s.d().a(t0.q.f11901s, "Starting work for " + ((t0.q) this.f11788c).f11906e.f175c);
                    t0.q qVar = (t0.q) this.f11788c;
                    qVar.f11918q.m(qVar.f11907f.startWork());
                    return;
                } catch (Throwable th3) {
                    ((t0.q) this.f11788c).f11918q.l(th3);
                    return;
                }
            case 3:
                String str = (String) this.f11787b;
                t0.q qVar2 = (t0.q) this.f11788c;
                try {
                    try {
                        q qVar3 = (q) qVar2.f11918q.get();
                        if (qVar3 == null) {
                            s.d().b(t0.q.f11901s, qVar2.f11906e.f175c + " returned a null result. Treating it as a failure.");
                        } else {
                            s.d().a(t0.q.f11901s, qVar2.f11906e.f175c + " returned a " + qVar3 + ".");
                            qVar2.f11909h = qVar3;
                        }
                    } catch (Throwable th4) {
                        qVar2.b();
                        throw th4;
                    }
                } catch (InterruptedException e3) {
                    e = e3;
                    s.d().c(t0.q.f11901s, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e6) {
                    s d6 = s.d();
                    String str2 = t0.q.f11901s;
                    String str3 = str + " was cancelled";
                    if (d6.f11793a <= 4) {
                        Log.i(str2, str3, e6);
                    }
                } catch (ExecutionException e7) {
                    e = e7;
                    s.d().c(t0.q.f11901s, str + " failed because it threw an exception/error", e);
                }
                qVar2.b();
                return;
            case 4:
                s d7 = s.d();
                String str4 = C1475a.f12031d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                B0.q qVar4 = (B0.q) this.f11787b;
                sb.append(qVar4.f173a);
                d7.a(str4, sb.toString());
                ((C1475a) this.f11788c).f12032a.f(qVar4);
                return;
            default:
                x1.e eVar = (x1.e) this.f11787b;
                Context context = (Context) eVar.f12265a;
                String string = x1.e.w(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j2 = x1.e.w((Context) eVar.f12265a).getLong("app_set_id_last_used_time", -1L);
                long j6 = j2 != -1 ? 33696000000L + j2 : -1L;
                I1.h hVar = (I1.h) this.f11788c;
                if (string == null || System.currentTimeMillis() > j6) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new x1.d("Failed to store the app set ID.");
                        }
                        x1.e.x(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new x1.d("Failed to store the app set ID creation time.");
                        }
                    } catch (x1.d e8) {
                        hVar.a(e8);
                        return;
                    }
                } else {
                    try {
                        x1.e.x(context);
                    } catch (x1.d e9) {
                        hVar.a(e9);
                        return;
                    }
                }
                hVar.b(new C0478a(string, 1));
                return;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, int i2, boolean z) {
        this.f11786a = i2;
        this.f11788c = obj;
        this.f11787b = obj2;
    }
}
