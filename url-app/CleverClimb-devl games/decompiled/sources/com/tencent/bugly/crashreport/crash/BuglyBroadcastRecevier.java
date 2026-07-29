package com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class BuglyBroadcastRecevier extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    private static BuglyBroadcastRecevier f8613d;

    /* renamed from: b, reason: collision with root package name */
    private Context f8615b;

    /* renamed from: c, reason: collision with root package name */
    private String f8616c;
    private boolean e = true;

    /* renamed from: a, reason: collision with root package name */
    private IntentFilter f8614a = new IntentFilter();

    public static synchronized BuglyBroadcastRecevier getInstance() {
        BuglyBroadcastRecevier buglyBroadcastRecevier;
        synchronized (BuglyBroadcastRecevier.class) {
            if (f8613d == null) {
                f8613d = new BuglyBroadcastRecevier();
            }
            buglyBroadcastRecevier = f8613d;
        }
        return buglyBroadcastRecevier;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f8615b != null) {
            this.f8615b.unregisterReceiver(this);
        }
    }

    public synchronized void addFilter(String str) {
        if (!this.f8614a.hasAction(str)) {
            this.f8614a.addAction(str);
        }
        x.c("add action %s", str);
    }

    public synchronized void register(Context context) {
        this.f8615b = context;
        z.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.BuglyBroadcastRecevier.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    x.a(BuglyBroadcastRecevier.f8613d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        BuglyBroadcastRecevier.this.f8615b.registerReceiver(BuglyBroadcastRecevier.f8613d, BuglyBroadcastRecevier.this.f8614a);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public synchronized void unregister(Context context) {
        try {
            x.a(getClass(), "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f8615b = context;
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private synchronized boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.e) {
                    this.e = false;
                    return true;
                }
                String e = com.tencent.bugly.crashreport.common.info.b.e(this.f8615b);
                x.c("is Connect BC " + e, new Object[0]);
                x.a("network %s changed to %s", this.f8616c, e);
                if (e == null) {
                    this.f8616c = null;
                    return true;
                }
                String str = this.f8616c;
                this.f8616c = e;
                long currentTimeMillis = System.currentTimeMillis();
                com.tencent.bugly.crashreport.common.strategy.a a2 = com.tencent.bugly.crashreport.common.strategy.a.a();
                u a3 = u.a();
                com.tencent.bugly.crashreport.common.info.a a4 = com.tencent.bugly.crashreport.common.info.a.a(context);
                if (a2 != null && a3 != null && a4 != null) {
                    if (!e.equals(str)) {
                        if (currentTimeMillis - a3.a(c.f8651a) > 30000) {
                            x.a("try to upload crash on network changed.", new Object[0]);
                            c a5 = c.a();
                            if (a5 != null) {
                                a5.a(0L);
                            }
                        }
                        if (currentTimeMillis - a3.a(1001) > 30000) {
                            x.a("try to upload userinfo on network changed.", new Object[0]);
                            com.tencent.bugly.crashreport.biz.b.f8588a.b();
                        }
                    }
                    return true;
                }
                x.d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
