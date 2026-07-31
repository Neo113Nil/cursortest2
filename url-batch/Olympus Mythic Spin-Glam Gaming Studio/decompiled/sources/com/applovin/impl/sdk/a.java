package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class a implements AppLovinBroadcastManager.Receiver {
    private static final long e = TimeUnit.SECONDS.toMillis(2);
    private final k a;
    private final o b;
    private final HashSet c = new HashSet();
    private final Object d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0083a {
        void onAdExpired(t1 t1Var);
    }

    public a(k kVar) {
        this.a = kVar;
        this.b = kVar.O();
    }

    private b b(t1 t1Var) {
        synchronized (this.d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (t1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(t1 t1Var, InterfaceC0083a interfaceC0083a) {
        synchronized (this.d) {
            try {
                if (b(t1Var) != null) {
                    if (o.a()) {
                        this.b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                    }
                    return true;
                }
                if (t1Var.getTimeToLiveMillis() <= e) {
                    if (o.a()) {
                        this.b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                    }
                    t1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
                }
                if (this.c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.c.add(b.a(t1Var, interfaceC0083a, this.a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.d) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    t1 b = bVar.b();
                    if (b == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = b.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + b);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (o.a()) {
                                this.b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + b);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(t1 t1Var) {
        synchronized (this.d) {
            try {
                b b = b(t1Var);
                if (b != null) {
                    if (o.a()) {
                        this.b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                    }
                    b.a();
                    a(b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.d) {
            try {
                this.c.remove(bVar);
                if (this.c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.d) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
