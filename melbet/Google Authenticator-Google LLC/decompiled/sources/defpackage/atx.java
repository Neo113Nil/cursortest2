package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atx implements awt {
    public static final String a = asq.b("Processor");
    public final Context c;
    public final arv d;
    public final WorkDatabase e;
    public final ldt l;
    public final Map g = new HashMap();
    public final Map f = new HashMap();
    public final Set i = new HashSet();
    public final List j = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object k = new Object();
    public final Map h = new HashMap();

    public atx(Context context, arv arvVar, ldt ldtVar, WorkDatabase workDatabase) {
        this.c = context;
        this.d = arvVar;
        this.l = ldtVar;
        this.e = workDatabase;
    }

    public static void g(avi aviVar, int i) {
        if (aviVar == null) {
            asq.a();
            return;
        }
        aviVar.j.s(new ava(i));
        asq.a();
    }

    public final avi a(String str) {
        Map map = this.f;
        avi aviVar = (avi) map.remove(str);
        boolean z = aviVar != null;
        if (!z) {
            aviVar = (avi) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                if (map.isEmpty()) {
                    Context context = this.c;
                    int i = awv.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        asq.a().d(a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
        }
        return aviVar;
    }

    public final avi b(String str) {
        avi aviVar = (avi) this.f.get(str);
        return aviVar == null ? (avi) this.g.get(str) : aviVar;
    }

    public final void c(atm atmVar) {
        synchronized (this.k) {
            this.j.add(atmVar);
        }
    }

    public final void d(atm atmVar) {
        synchronized (this.k) {
            this.j.remove(atmVar);
        }
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.k) {
            z = b(str) != null;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(axl axlVar) {
        this.l.d.execute(new avl((Object) this, (Object) axlVar, 1, (char[]) null));
    }
}
