package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Sh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2775Sh {

    /* renamed from: a, reason: collision with root package name */
    public String f27586a;

    /* renamed from: b, reason: collision with root package name */
    public C3469kM f27587b;

    /* renamed from: c, reason: collision with root package name */
    public C3256gN f27588c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f27589d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f27590e = new AtomicBoolean(false);

    public C2775Sh(ScheduledExecutorService scheduledExecutorService) {
        this.f27589d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String d2 = com.bumptech.glide.h.s("GET_VARIATIONS_HEADER") ? H0.e.d() : null;
            if (d2 != null && !d2.isEmpty()) {
                this.f27586a = d2;
                byte[] decode = Base64.decode(d2, 10);
                this.f27587b = C3469kM.A(decode, YK.a());
                C3151ea c3151ea = AbstractC3368ia.da;
                q2.r rVar = q2.r.f40116e;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar.f40119c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue()) {
                    this.f27588c = C3256gN.A(decode, YK.a());
                }
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.ba)).booleanValue() && ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.aa)).booleanValue()) {
                    this.f27589d.schedule(new RunnableC3068d(26, this), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.ca)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (C3845rL e6) {
            e = e6;
            p2.j.f39798C.f39808h.e("ChromeVariations", e);
        } catch (IllegalArgumentException e9) {
            e = e9;
            p2.j.f39798C.f39808h.e("ChromeVariations", e);
        }
    }
}
