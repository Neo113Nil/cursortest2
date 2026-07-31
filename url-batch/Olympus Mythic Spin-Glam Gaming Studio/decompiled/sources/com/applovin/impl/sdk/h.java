package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public class h implements AppLovinBroadcastManager.Receiver {
    private final k a;
    private final AtomicReference b;
    private final Handler c;
    private final Handler d;
    private final AtomicLong e = new AtomicLong(0);
    private long f;
    private long g;
    private long h;

    private enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.b.get() != b.MONITORING) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - h.this.e.get();
            if (currentTimeMillis >= 0 && currentTimeMillis <= h.this.f) {
                h.this.d.postDelayed(this, h.this.h);
                return;
            }
            h.this.b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            HashMap hashMap = new HashMap(3);
            hashMap.put("top_main_method", str);
            hashMap.put("source", h.this.a.z0() ? "non_first_session" : "first_session");
            hashMap.put("details", "seconds_since_app_launch=" + seconds);
            h.this.a.D().d(d2.F0, hashMap);
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.b.get() != b.MONITORING) {
                return;
            }
            h.this.e.set(System.currentTimeMillis());
            h.this.c.postDelayed(this, h.this.g);
        }
    }

    public h(k kVar) {
        this.a = kVar;
        this.b = new AtomicReference(!n7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.b, b.MONITORING, b.IDLE)) {
            this.c.removeCallbacksAndMessages(null);
            this.d.removeCallbacksAndMessages(null);
        }
    }

    private void c() {
        if (!(((Boolean) this.a.a(x4.f6)).booleanValue() && this.a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) && MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.b, b.IDLE, b.MONITORING)) {
            this.c.post(new d());
            this.d.postDelayed(new c(), this.h / 2);
        }
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f = ((Long) this.a.a(x4.c6)).longValue();
        this.g = ((Long) this.a.a(x4.d6)).longValue();
        this.h = ((Long) this.a.a(x4.e6)).longValue();
        if (((Boolean) this.a.a(x4.f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.a.a(x4.b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
