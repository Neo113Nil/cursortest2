package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f7186b;

    public kd(ld ldVar, String str) {
        this.f7186b = ldVar;
        this.f7185a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f7186b;
        String str = this.f7185a;
        if (ldVar.f7223g || ldVar.o || !ldVar.f7221e.equals(str) || g0.a(str)) {
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            ldVar.f7230p = true;
            Float f4 = (Float) ldVar.f7231q.get(str);
            if (f4 == null || f4.floatValue() < 0.0f) {
                ldVar.f7231q.put(str, Float.valueOf((System.currentTimeMillis() - ldVar.f7232r) / 1000.0f));
            }
            synchronized (ldVar.f7220d) {
                ldVar.f7220d.removeCallbacks(ldVar.f7235u);
                ldVar.f7220d.postDelayed(ldVar.f7235u, ldVar.f7226j);
            }
        }
    }
}
