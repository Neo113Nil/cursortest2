package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dg3 {
    public static volatile dg3 g;
    public final ExecutorService a;
    public final ph b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile he3 f;

    public dg3(Context context, Bundle bundle) {
        e90 e90Var = new e90(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), e90Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new ph(this);
        this.c = new ArrayList();
        int i = 0;
        try {
            if (th2.o(context, gk2.h(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, dg3.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new hf3(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new cg3(i, this));
        }
    }

    public static dg3 e(Context context, Bundle bundle) {
        ll3.v(context);
        if (g == null) {
            synchronized (dg3.class) {
                try {
                    if (g == null) {
                        g = new dg3(context, bundle);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final Map a(String str, String str2, boolean z) {
        ee3 ee3Var = new ee3();
        c(new af3(this, str, str2, z, ee3Var));
        Bundle d = ee3Var.d(5000L);
        if (d == null || d.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(d.size());
        for (String str3 : d.keySet()) {
            Object obj = d.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final int b(String str) {
        ee3 ee3Var = new ee3();
        c(new hf3(this, str, ee3Var));
        Integer num = (Integer) ee3.H(ee3Var.d(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(uf3 uf3Var) {
        this.a.execute(uf3Var);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new hf3(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void f(bl3 bl3Var) {
        ll3.v(bl3Var);
        ArrayList arrayList = this.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (bl3Var.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            wf3 wf3Var = new wf3(bl3Var);
            arrayList.add(new Pair(bl3Var, wf3Var));
            if (this.f != null) {
                try {
                    this.f.registerOnMeasurementEventListener(wf3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c(new sf3(this, wf3Var, 0));
        }
    }

    public final List g(String str, String str2) {
        ee3 ee3Var = new ee3();
        c(new cf3(this, str, str2, ee3Var));
        List list = (List) ee3.H(ee3Var.d(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
