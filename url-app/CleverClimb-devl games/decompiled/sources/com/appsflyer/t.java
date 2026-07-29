package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t {
    private static final BitSet g = new BitSet(6);
    private static final Handler h = new Handler(Looper.getMainLooper());
    private static volatile t i;

    /* renamed from: a, reason: collision with root package name */
    final Handler f3491a;

    /* renamed from: c, reason: collision with root package name */
    boolean f3493c;
    private final SensorManager l;
    private boolean m;

    /* renamed from: b, reason: collision with root package name */
    final Object f3492b = new Object();
    private final Map<s, s> j = new HashMap(g.size());
    private final Map<s, Map<String, Object>> k = new HashMap(g.size());

    /* renamed from: d, reason: collision with root package name */
    final Runnable f3494d = new AnonymousClass3();
    final Runnable e = new Runnable() { // from class: com.appsflyer.t.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (t.this.f3492b) {
                t.this.a();
                t.this.f3491a.postDelayed(t.this.f3494d, 500L);
                t.this.f3493c = true;
            }
        }
    };
    final Runnable f = new Runnable() { // from class: com.appsflyer.t.2
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (t.this.f3492b) {
                if (t.this.f3493c) {
                    t.this.f3491a.removeCallbacks(t.this.e);
                    t.this.f3491a.removeCallbacks(t.this.f3494d);
                    t.this.b();
                    t.this.f3493c = false;
                }
            }
        }
    };

    static {
        g.set(1);
        g.set(2);
        g.set(4);
    }

    /* renamed from: com.appsflyer.t$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private static String f3497b;

        /* renamed from: c, reason: collision with root package name */
        private static String f3498c;

        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (t.this.f3492b) {
                t.this.b();
                t.this.f3491a.postDelayed(t.this.e, TapjoyConstants.SESSION_ID_INACTIVITY_TIME);
            }
        }

        AnonymousClass3() {
        }

        static void a(String str) {
            f3497b = str;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
            f3498c = sb.toString();
        }

        static void b(String str) {
            if (f3497b == null) {
                a(j.a().a("AppsFlyerKey"));
            }
            if (f3497b == null || !str.contains(f3497b)) {
                return;
            }
            d.d(str.replace(f3497b, f3498c));
        }
    }

    private t(SensorManager sensorManager, Handler handler) {
        this.l = sensorManager;
        this.f3491a = handler;
    }

    static t a(Context context) {
        return a((SensorManager) context.getApplicationContext().getSystemService(com.umeng.commonsdk.proguard.d.aa), h);
    }

    private static t a(SensorManager sensorManager, Handler handler) {
        if (i == null) {
            synchronized (t.class) {
                if (i == null) {
                    i = new t(sensorManager, handler);
                }
            }
        }
        return i;
    }

    final void a() {
        try {
            for (Sensor sensor : this.l.getSensorList(-1)) {
                int type = sensor.getType();
                if (type >= 0 && g.get(type)) {
                    s a2 = s.a(sensor);
                    if (!this.j.containsKey(a2)) {
                        this.j.put(a2, a2);
                    }
                    this.l.registerListener(this.j.get(a2), sensor, 0);
                }
            }
        } catch (Throwable unused) {
        }
        this.m = true;
    }

    final void b() {
        try {
            if (!this.j.isEmpty()) {
                for (s sVar : this.j.values()) {
                    this.l.unregisterListener(sVar);
                    sVar.a(this.k);
                }
            }
        } catch (Throwable unused) {
        }
        this.m = false;
    }

    final List<Map<String, Object>> c() {
        synchronized (this.f3492b) {
            if (!this.j.isEmpty() && this.m) {
                Iterator<s> it = this.j.values().iterator();
                while (it.hasNext()) {
                    it.next().b(this.k);
                }
            }
            if (this.k.isEmpty()) {
                return Collections.emptyList();
            }
            return new ArrayList(this.k.values());
        }
    }
}
