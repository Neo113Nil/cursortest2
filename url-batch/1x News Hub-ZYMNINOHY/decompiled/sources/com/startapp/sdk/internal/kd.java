package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f4058b;

    public kd(ld ldVar, String str) {
        this.f4058b = ldVar;
        this.f4057a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f4058b;
        String str = this.f4057a;
        if (ldVar.f4094g || ldVar.o || !ldVar.f4093e.equals(str) || g0.a(str)) {
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            ldVar.f4102p = true;
            Float f = (Float) ldVar.f4103q.get(str);
            if (f == null || f.floatValue() < 0.0f) {
                ldVar.f4103q.put(str, Float.valueOf((System.currentTimeMillis() - ldVar.f4104r) / 1000.0f));
            }
            synchronized (ldVar.f4092d) {
                ldVar.f4092d.removeCallbacks(ldVar.f4107u);
                ldVar.f4092d.postDelayed(ldVar.f4107u, ldVar.f4097j);
            }
        }
    }
}
