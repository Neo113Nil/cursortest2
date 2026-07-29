package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.internal.t;
import com.facebook.u;
import com.tapjoy.TapjoyConstants;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: FacebookTimeSpentData.java */
/* loaded from: classes.dex */
class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5986a = g.class.getCanonicalName();

    /* renamed from: b, reason: collision with root package name */
    private static final long[] f5987b = {300000, TapjoyConstants.PAID_APP_TIME, TapjoyConstants.SESSION_ID_INACTIVITY_TIME, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: c, reason: collision with root package name */
    private boolean f5988c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5989d;
    private long e;
    private long f;
    private long g;
    private long h;
    private int i;
    private String j;

    /* compiled from: FacebookTimeSpentData.java */
    private static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final long f5990a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5991b;

        /* renamed from: c, reason: collision with root package name */
        private final long f5992c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5993d;
        private final String e;

        a(long j, long j2, long j3, int i, String str) {
            this.f5990a = j;
            this.f5991b = j2;
            this.f5992c = j3;
            this.f5993d = i;
            this.e = str;
        }

        private Object readResolve() {
            return new g(this.f5990a, this.f5991b, this.f5992c, this.f5993d, this.e);
        }
    }

    g() {
        a();
    }

    private g(long j, long j2, long j3, int i, String str) {
        a();
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = i;
        this.j = str;
    }

    private Object writeReplace() {
        return new a(this.f, this.g, this.h, this.i, this.j);
    }

    void a(f fVar, long j) {
        if (!this.f5989d) {
            t.a(u.APP_EVENTS, f5986a, "Suspend for inactive app");
            return;
        }
        long j2 = j - this.f;
        if (j2 < 0) {
            t.a(u.APP_EVENTS, f5986a, "Clock skew detected");
            j2 = 0;
        }
        this.h += j2;
        this.g = j;
        this.f5989d = false;
    }

    void a(f fVar, long j, String str) {
        if (c() || j - this.e > 300000) {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str);
            fVar.a("fb_mobile_activate_app", bundle);
            this.e = j;
        }
        if (this.f5989d) {
            t.a(u.APP_EVENTS, f5986a, "Resume for active app");
            return;
        }
        long j2 = 0;
        long j3 = b() ? j - this.g : 0L;
        if (j3 < 0) {
            t.a(u.APP_EVENTS, f5986a, "Clock skew detected");
        } else {
            j2 = j3;
        }
        if (j2 > 60000) {
            b(fVar, j2);
        } else if (j2 > 1000) {
            this.i++;
        }
        if (this.i == 0) {
            this.j = str;
        }
        this.f = j;
        this.f5989d = true;
    }

    private void b(f fVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", this.i);
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", Integer.valueOf(a(j))));
        bundle.putString("fb_mobile_launch_source", this.j);
        fVar.a("fb_mobile_deactivate_app", this.h / 1000, bundle);
        a();
    }

    private static int a(long j) {
        int i = 0;
        while (i < f5987b.length && f5987b[i] < j) {
            i++;
        }
        return i;
    }

    private void a() {
        this.f5989d = false;
        this.f = -1L;
        this.g = -1L;
        this.i = 0;
        this.h = 0L;
    }

    private boolean b() {
        return this.g != -1;
    }

    private boolean c() {
        boolean z = !this.f5988c;
        this.f5988c = true;
        return z;
    }
}
