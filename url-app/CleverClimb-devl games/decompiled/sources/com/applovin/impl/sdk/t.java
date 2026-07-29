package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f3371a = {TJAdUnitConstants.String.VIDEO_PAUSED, "saved_instance_state"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f3372b = {"saved_instance_state", TJAdUnitConstants.String.VIDEO_PAUSED};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f3373c = {TJAdUnitConstants.String.VIDEO_PAUSED, TJAdUnitConstants.String.VIDEO_STOPPED};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f3374d = {TJAdUnitConstants.String.VIDEO_PAUSED, "saved_instance_state", TJAdUnitConstants.String.VIDEO_STOPPED, "started"};
    private static final String[] e = {TJAdUnitConstants.String.VIDEO_PAUSED, TJAdUnitConstants.String.VIDEO_STOPPED, "saved_instance_state", "started"};
    private static final String[] f = {"saved_instance_state", TJAdUnitConstants.String.VIDEO_PAUSED, TJAdUnitConstants.String.VIDEO_STOPPED, "started"};
    private final j g;
    private volatile boolean l;
    private Date m;
    private Date n;
    private final List<String> h = new ArrayList();
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicBoolean j = new AtomicBoolean();
    private final AtomicBoolean k = new AtomicBoolean();
    private final List<a> o = new ArrayList();
    private final Object p = new Object();

    public interface a {
        void b();

        void c();
    }

    t(j jVar) {
        this.g = jVar;
    }

    private void a(boolean z) {
        this.l = true;
        l();
        if (!z && ((Boolean) this.g.a(com.applovin.impl.sdk.b.b.ef)).booleanValue()) {
            boolean booleanValue = ((Boolean) this.g.a(com.applovin.impl.sdk.b.b.ec)).booleanValue();
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.g.a(com.applovin.impl.sdk.b.b.ee)).longValue());
            if (this.m == null || System.currentTimeMillis() - this.m.getTime() >= millis) {
                ((EventServiceImpl) this.g.p()).a(TJAdUnitConstants.String.VIDEO_PAUSED, false);
                if (booleanValue) {
                    this.m = new Date();
                }
            }
            if (booleanValue) {
                return;
            }
            this.m = new Date();
        }
    }

    private static boolean a(List<String> list, String[] strArr) {
        int size = list.size();
        int length = strArr.length;
        if (size == 0 || length == 0 || size < strArr.length) {
            return false;
        }
        int i = size - length;
        for (int i2 = i; i2 < length; i2++) {
            if (!list.get(i2).equals(strArr[i2 - i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.h.add(TJAdUnitConstants.String.VIDEO_PAUSED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (a(this.h, f3373c)) {
            a(this.k.get());
        }
        this.h.add("saved_instance_state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (a(this.h, f3371a) || a(this.h, f3372b)) {
            a(this.k.get());
        }
        this.h.add(TJAdUnitConstants.String.VIDEO_STOPPED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.h.isEmpty()) {
            return;
        }
        String str = this.h.get(this.h.size() - 1);
        if (TJAdUnitConstants.String.VIDEO_STOPPED.equals(str) || "saved_instance_state".equals(str)) {
            this.h.add("started");
        } else {
            this.h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (a(this.h, f3374d) || a(this.h, e) || a(this.h, f)) {
            boolean booleanValue = ((Boolean) this.g.a(com.applovin.impl.sdk.b.b.ec)).booleanValue();
            long longValue = ((Long) this.g.a(com.applovin.impl.sdk.b.b.ed)).longValue();
            this.l = false;
            m();
            if (this.k.getAndSet(false)) {
                return;
            }
            long millis = TimeUnit.MINUTES.toMillis(longValue);
            if (this.n == null || System.currentTimeMillis() - this.n.getTime() >= millis) {
                ((EventServiceImpl) this.g.p()).a("resumed", false);
                if (booleanValue) {
                    this.n = new Date();
                }
            }
            if (!booleanValue) {
                this.n = new Date();
            }
            this.g.D().a(com.applovin.impl.sdk.c.g.n);
            this.j.set(true);
        }
        this.h.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.h.clear();
    }

    private void l() {
        ArrayList arrayList;
        synchronized (this.p) {
            arrayList = new ArrayList(this.o);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
    }

    private void m() {
        ArrayList arrayList;
        synchronized (this.p) {
            arrayList = new ArrayList(this.o);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
    }

    void a(Context context) {
        if (context == null || !com.applovin.impl.sdk.e.d.b() || !((Boolean) this.g.a(com.applovin.impl.sdk.b.b.eb)).booleanValue() || this.i.getAndSet(true)) {
            return;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.applovin.impl.sdk.t.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                t.this.k();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                t.this.k();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                t.this.f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                t.this.j();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                t.this.g();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                t.this.i();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                t.this.h();
            }
        });
    }

    public void a(a aVar) {
        synchronized (this.p) {
            this.o.add(aVar);
        }
    }

    public boolean a() {
        return this.l;
    }

    public void b() {
        this.k.set(true);
    }

    public void b(a aVar) {
        synchronized (this.p) {
            this.o.remove(aVar);
        }
    }

    public void c() {
        this.k.set(false);
    }

    boolean d() {
        return this.i.get();
    }

    boolean e() {
        return this.j.getAndSet(false);
    }
}
