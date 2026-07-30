package com.baidu.location.c;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.baidu.location.b.s;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public c f5001a = null;

    /* renamed from: b, reason: collision with root package name */
    public Location f5002b = null;

    /* renamed from: c, reason: collision with root package name */
    public Location f5003c = null;

    /* renamed from: d, reason: collision with root package name */
    public long f5004d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f5005e = 0;

    /* renamed from: f, reason: collision with root package name */
    private Timer f5006f = null;

    /* renamed from: g, reason: collision with root package name */
    private TimerTask f5007g = null;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            e.this.b();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static e f5009a = new e();
    }

    private class c implements s.d {
        private c() {
        }

        @Override // com.baidu.location.b.s.d
        public void a(Location location) {
            if (location == null) {
                return;
            }
            e eVar = e.this;
            eVar.f5002b = location;
            eVar.f5005e = System.currentTimeMillis();
        }

        /* synthetic */ c(e eVar, a aVar) {
            this();
        }
    }

    public static e a() {
        return b.f5009a;
    }

    private synchronized void d() {
        try {
            TimerTask timerTask = this.f5007g;
            if (timerTask != null) {
                timerTask.cancel();
                this.f5007g = null;
            }
            Timer timer = this.f5006f;
            if (timer != null) {
                timer.cancel();
                this.f5006f.purge();
                this.f5006f = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String b(Location location) {
        if (location != null) {
            return String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d&ll_r=%d", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf((float) (location.getSpeed() * 3.6d)), Float.valueOf(location.getBearing()), 0, Long.valueOf(location.getTime() / 1000), Integer.valueOf((int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f)));
        }
        return null;
    }

    public Location c() {
        return System.currentTimeMillis() - this.f5004d < 30000 ? this.f5003c : System.currentTimeMillis() - this.f5005e < 30000 ? this.f5002b : null;
    }

    public void a(Context context) {
        if (Build.VERSION.SDK_INT >= 31 && com.baidu.location.e.i.S != 0) {
            if (!com.baidu.location.e.i.h(context)) {
                b();
                return;
            }
            d();
            if (this.f5006f == null && this.f5007g == null) {
                this.f5006f = new Timer();
                a aVar = new a();
                this.f5007g = aVar;
                this.f5006f.schedule(aVar, 60000L);
            }
            if (this.f5001a == null) {
                this.f5001a = new c(this, null);
                com.baidu.location.b.s.a().a(this.f5001a, context, Looper.myLooper());
            }
        }
    }

    public synchronized void b() {
        try {
            if (this.f5001a != null) {
                com.baidu.location.b.s.a().a(this.f5001a);
                this.f5001a = null;
            }
            d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(Location location) {
        this.f5003c = location;
        this.f5004d = System.currentTimeMillis();
    }

    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= 31 && com.baidu.location.b.a.a().f4452t != 0 && com.baidu.location.e.i.h(context)) {
            if (this.f5001a == null) {
                this.f5001a = new c(this, null);
            }
            com.baidu.location.b.s.a().a(this.f5001a, context, Looper.getMainLooper());
        }
    }

    public boolean a(Location location, Location location2) {
        float[] fArr;
        if (location2 == null) {
            return false;
        }
        if (location == null) {
            return true;
        }
        try {
            fArr = new float[2];
            Location.distanceBetween(location.getLatitude(), location.getLongitude(), location2.getLatitude(), location2.getLongitude(), fArr);
        } catch (Exception unused) {
        }
        return fArr[0] >= 100.0f;
    }
}
