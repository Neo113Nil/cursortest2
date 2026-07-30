package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final class Yu implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public ScheduledFuture f28910A;

    /* renamed from: u, reason: collision with root package name */
    public final Zu f28913u;

    /* renamed from: v, reason: collision with root package name */
    public String f28914v;

    /* renamed from: x, reason: collision with root package name */
    public String f28916x;

    /* renamed from: y, reason: collision with root package name */
    public C2518Df f28917y;

    /* renamed from: z, reason: collision with root package name */
    public C4927z0 f28918z;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f28912n = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public int f28911B = 2;

    /* renamed from: w, reason: collision with root package name */
    public int f28915w = 2;

    public Yu(Zu zu) {
        this.f28913u = zu;
    }

    public final synchronized void a(Vu vu) {
        try {
            if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
                ArrayList arrayList = this.f28912n;
                vu.i();
                arrayList.add(vu);
                ScheduledFuture scheduledFuture = this.f28910A;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f28910A = AbstractC3212fg.f30741d.schedule(this, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.W9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
                if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19281e) && !arrayList.contains("BANNER")) {
                    if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19280d) && !arrayList.contains("INTERSTITIAL")) {
                        if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19277a) && !arrayList.contains("NATIVE")) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.f28911B = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                    this.f28911B = 6;
                                }
                            }
                            this.f28911B = 5;
                        }
                        this.f28911B = 8;
                    }
                    this.f28911B = 4;
                }
                this.f28911B = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean matches;
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.X9), str);
            }
            if (matches) {
                this.f28914v = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            this.f28915w = K3.b.K(bundle);
        }
    }

    public final synchronized void e(C2518Df c2518Df) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            this.f28917y = c2518Df;
        }
    }

    public final synchronized void f(C4927z0 c4927z0) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            this.f28918z = c4927z0;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            this.f28916x = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f28910A;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f28912n;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Vu vu = (Vu) it.next();
                    int i = this.f28911B;
                    if (i != 2) {
                        vu.l(i);
                    }
                    if (!TextUtils.isEmpty(this.f28914v)) {
                        vu.C(this.f28914v);
                    }
                    if (!TextUtils.isEmpty(this.f28916x) && !vu.k()) {
                        vu.p0(this.f28916x);
                    }
                    C2518Df c2518Df = this.f28917y;
                    if (c2518Df != null) {
                        vu.j(c2518Df);
                    } else {
                        C4927z0 c4927z0 = this.f28918z;
                        if (c4927z0 != null) {
                            vu.g(c4927z0);
                        }
                    }
                    vu.s(this.f28915w);
                    this.f28913u.b(vu.m());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
            this.f28911B = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
