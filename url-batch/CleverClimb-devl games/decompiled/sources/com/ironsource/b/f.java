package com.ironsource.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CallbackThrotteler.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private com.ironsource.b.f.j f6838c = null;

    /* renamed from: d, reason: collision with root package name */
    private com.ironsource.b.f.f f6839d = null;

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Long> f6836a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f6837b = new HashMap();

    public void a(com.ironsource.b.f.j jVar) {
        this.f6838c = jVar;
    }

    public void a(com.ironsource.b.f.f fVar) {
        this.f6839d = fVar;
    }

    public void a(com.ironsource.b.d.b bVar) {
        synchronized (this) {
            c("mediation", bVar);
        }
    }

    public void a(String str, com.ironsource.b.d.b bVar) {
        synchronized (this) {
            c(str, bVar);
        }
    }

    public boolean a(String str) {
        boolean b2;
        synchronized (this) {
            b2 = b(str);
        }
        return b2;
    }

    private boolean b(String str) {
        if (!TextUtils.isEmpty(str) && this.f6837b.containsKey(str)) {
            return this.f6837b.get(str).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.ironsource.b.d.b bVar) {
        this.f6836a.put(str, Long.valueOf(System.currentTimeMillis()));
        if (str.equalsIgnoreCase("mediation")) {
            if (this.f6838c != null) {
                this.f6838c.a_(bVar);
            }
        } else if (this.f6839d != null) {
            this.f6839d.onInterstitialAdLoadFailed(str, bVar);
        }
    }

    private void c(final String str, final com.ironsource.b.d.b bVar) {
        if (b(str)) {
            return;
        }
        if (!this.f6836a.containsKey(str)) {
            b(str, bVar);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f6836a.get(str).longValue();
        if (currentTimeMillis > 15000) {
            b(str, bVar);
            return;
        }
        this.f6837b.put(str, true);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ironsource.b.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.b(str, bVar);
                f.this.f6837b.put(str, false);
            }
        }, 15000 - currentTimeMillis);
    }
}
