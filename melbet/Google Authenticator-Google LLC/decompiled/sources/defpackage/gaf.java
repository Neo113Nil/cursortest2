package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gaf extends Service {
    public iyi a;

    public final iyi a() {
        iyi iyiVar = this.a;
        if (iyiVar != null) {
            return iyiVar;
        }
        ksp.a("registry");
        return null;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.getClass();
        gau g = a().g(getClass());
        synchronized (g.b) {
            Iterator it = g.c.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println(((Map.Entry) it.next()).toString());
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((gae) hnu.bp(this, gae.class)).q(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        guq guqVar;
        kri kriVar = new kri() { // from class: gad
            @Override // defpackage.kri
            public final Object a() {
                gaf gafVar = gaf.this;
                gau g = gafVar.a().g(gafVar.getClass());
                Object obj = g.b;
                Intent intent2 = intent;
                int i3 = i2;
                synchronized (obj) {
                    if (intent2 != null) {
                        g.g = gafVar;
                        g.h = i3;
                        g.f = gat.c;
                        IdentityHashMap identityHashMap = g.c;
                        if (identityHashMap.isEmpty()) {
                            g.a(gafVar, (Notification) intent2.getParcelableExtra("fallback_notification"));
                            g.b();
                        } else {
                            gar garVar = g.i;
                            hoq.I(!identityHashMap.isEmpty(), "Can't select a best notification if thare are none");
                            gar garVar2 = null;
                            for (gar garVar3 : identityHashMap.values()) {
                                if (garVar2 != null) {
                                    int i4 = garVar3.b;
                                    if (garVar == garVar3) {
                                        int i5 = garVar.b;
                                    }
                                }
                                garVar2 = garVar3;
                            }
                            g.i = garVar2;
                            Notification notification = g.i.a;
                            g.a(gafVar, null);
                        }
                    } else if (g.f == gat.a) {
                        gafVar.stopSelf(i3);
                    }
                }
                return kow.a;
            }
        };
        if (intent != null) {
            long j = gvx.a;
            guqVar = gvx.m(intent, true);
        } else {
            guqVar = null;
        }
        if (guqVar == null) {
            kriVar.a();
            return 2;
        }
        gun a = gta.a();
        guq g = gta.g(a, guqVar);
        try {
            kriVar.a();
            return 2;
        } catch (Throwable th) {
            try {
                gsv.c(th);
                throw th;
            } finally {
                gta.g(a, g);
            }
        }
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        gau g = a().g(getClass());
        synchronized (g.b) {
            if (g.f.ordinal() == 2) {
                g.b();
                gas gasVar = new gas();
                hdu hduVar = g.d;
                Collection collection = hduVar.c;
                if (collection == null) {
                    collection = new hbn(hduVar);
                    hduVar.c = collection;
                }
                hfk hfkVar = new hfk();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    hfkVar.c(((gvz) it.next()).a);
                }
                hfm<guq> g2 = hfkVar.g();
                gwd gwdVar = new gwd(gasVar, new StackTraceElement[0]);
                hen henVar = new hen(4);
                for (guq guqVar : g2) {
                    gwd gwdVar2 = new gwd(null, gwd.l(guqVar, null));
                    gwdVar.addSuppressed(gwdVar2);
                    henVar.g(guqVar, gwdVar2);
                }
                her d = henVar.d(true);
                gwd.h(d);
                gwd.f(d);
                ((hkf) ((hkf) ((hkf) gau.a.f()).h(gwdVar)).i("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "onTimeout", 431, "ForegroundServiceTracker.java")).s("Timeout elapsed");
                g.e.clear();
                hduVar.k();
            }
        }
    }
}
