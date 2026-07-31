package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class nc {

    /* renamed from: e, reason: collision with root package name */
    public static final int f18334e = -1;

    /* renamed from: a, reason: collision with root package name */
    private Runnable f18335a = new a();

    /* renamed from: b, reason: collision with root package name */
    private int f18336b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1530p f18337c;

    /* renamed from: d, reason: collision with root package name */
    private yl f18338d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            if (nc.this.f18337c != null) {
                nc.this.f18337c.a();
            }
        }
    }

    public nc(int i4, InterfaceC1530p interfaceC1530p) {
        this.f18337c = interfaceC1530p;
        this.f18336b = i4;
    }

    public boolean b() {
        return this.f18336b > 0;
    }

    public void a() {
        if (!b() || this.f18338d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f18338d.e();
        this.f18338d = null;
    }

    public void a(long j4) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f18336b) - Math.max(j4, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f18337c.a();
                return;
            }
            a();
            this.f18338d = new yl(millis, this.f18335a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}
