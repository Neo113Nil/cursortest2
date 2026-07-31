package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.i;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {
    public static int h = -1;
    private static final Float i = Float.valueOf(15.0f);
    private final AudioManager a;
    private final Context b;
    private final k c;
    private final Set d = new HashSet();
    private final Object e = new Object();
    private boolean f;
    private int g;

    public interface a {
        void a(int i);
    }

    i(k kVar) {
        this.c = kVar;
        Context o = k.o();
        this.b = o;
        this.a = (AudioManager) o.getSystemService("audio");
    }

    public static boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private void d() {
        this.c.O();
        if (o.a()) {
            this.c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.g = h;
        this.b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.c.O();
        if (o.a()) {
            this.c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public Float b() {
        if (this.a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th) {
            this.c.O();
            if (o.a()) {
                this.c.O().a("AudioSessionManager", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    public int c() {
        return this.a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.a.getRingerMode());
        }
    }

    private Float a() {
        if (this.a == null) {
            return i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th) {
            this.c.O();
            if (o.a()) {
                this.c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th);
            }
            return i;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f = true;
            this.g = this.a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f = false;
            if (this.g != this.a.getRingerMode()) {
                this.g = h;
                b(this.a.getRingerMode());
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.e) {
            try {
                if (this.d.contains(aVar)) {
                    return;
                }
                this.d.add(aVar);
                if (this.d.size() == 1) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.e) {
            try {
                if (this.d.contains(aVar)) {
                    this.d.remove(aVar);
                    if (this.d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(final int i2) {
        if (this.f) {
            return;
        }
        this.c.O();
        if (o.a()) {
            this.c.O().a("AudioSessionManager", "Ringer mode is " + i2);
        }
        synchronized (this.e) {
            try {
                for (final a aVar : this.d) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.i$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.a.this.a(i2);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
