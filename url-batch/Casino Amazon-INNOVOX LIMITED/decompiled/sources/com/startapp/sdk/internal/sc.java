package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f422a;
    public final /* synthetic */ tc b;

    public sc(tc tcVar, String str) {
        this.b = tcVar;
        this.f422a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        String str = this.f422a;
        if (tcVar.g || tcVar.o || !tcVar.e.equals(str) || e0.a(str)) {
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            tcVar.p = true;
            Float f = (Float) tcVar.q.get(str);
            if (f == null || f.floatValue() < 0.0f) {
                tcVar.q.put(str, Float.valueOf((System.currentTimeMillis() - tcVar.r) / 1000.0f));
            }
            synchronized (tcVar.d) {
                tcVar.d.removeCallbacks(tcVar.u);
                tcVar.d.postDelayed(tcVar.u, tcVar.j);
            }
        }
    }
}
