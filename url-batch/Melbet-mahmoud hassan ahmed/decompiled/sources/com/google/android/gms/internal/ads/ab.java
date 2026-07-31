package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
final class ab implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bb f2708f;

    ab(bb bbVar) {
        this.f2708f = bbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z6;
        gc gcVar;
        ConditionVariable conditionVariable2;
        if (this.f2708f.f3310b != null) {
            return;
        }
        conditionVariable = bb.f3306c;
        synchronized (conditionVariable) {
            if (this.f2708f.f3310b != null) {
                return;
            }
            boolean z7 = false;
            try {
                z6 = m10.L1.e().booleanValue();
            } catch (IllegalStateException unused) {
                z6 = false;
            }
            if (z6) {
                try {
                    gcVar = this.f2708f.f3309a;
                    bb.f3307d = y23.b(gcVar.f5536a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z7 = z6;
            this.f2708f.f3310b = Boolean.valueOf(z7);
            conditionVariable2 = bb.f3306c;
            conditionVariable2.open();
        }
    }
}
