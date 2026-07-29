package com.moat.analytics.mobile.tjy;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
class av implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private static final long f7240b = 90000;

    /* renamed from: a, reason: collision with root package name */
    private final aa f7241a;

    /* renamed from: c, reason: collision with root package name */
    private final String f7242c;

    /* renamed from: d, reason: collision with root package name */
    private final ax f7243d;
    private ar e;

    private av(String str, aa aaVar, ax axVar) {
        this.e = ar.OFF;
        this.f7241a = aaVar;
        this.f7243d = axVar;
        this.f7242c = "https://z.moatads.com/" + str + "/android/" + "8ace5ca5da6b9adb3c0f055aad4a98c2aedf4bd7".substring(0, 7) + "/status.json";
    }

    /* synthetic */ av(String str, aa aaVar, ax axVar, at atVar) {
        this(str, aaVar, axVar);
    }

    private void a() {
        long j = 0;
        while (true) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis < f7240b) {
                try {
                    Thread.sleep((f7240b + 10) - currentTimeMillis);
                } catch (InterruptedException unused) {
                }
            }
            j = System.currentTimeMillis();
            ar b2 = b();
            Handler handler = new Handler(Looper.getMainLooper());
            b2.equals(this.e);
            this.e = b2;
            handler.post(new aw(this, b2));
        }
    }

    private ar b() {
        com.moat.analytics.mobile.tjy.base.functional.a a2 = this.f7241a.a(this.f7242c + "?ts=" + System.currentTimeMillis() + "&v=1.7.10");
        if (!a2.c()) {
            return ar.OFF;
        }
        u uVar = new u((String) a2.b());
        boolean unused = as.f7237d = uVar.a();
        int unused2 = as.e = uVar.c();
        return uVar.b() ? ar.ON : ar.OFF;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Exception e) {
            this.e = ar.OFF;
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
