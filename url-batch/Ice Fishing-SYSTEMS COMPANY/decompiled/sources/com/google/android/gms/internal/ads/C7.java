package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class C7 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24142a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24143b;

    public C7(D7 d72) {
        this.f24143b = d72;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z8) {
        switch (this.f24142a) {
            case 0:
                if (z8) {
                    D7 d72 = (D7) this.f24143b;
                    d72.f24340a = System.currentTimeMillis();
                    d72.f24343d = true;
                    return;
                }
                D7 d73 = (D7) this.f24143b;
                long j9 = d73.f24341b;
                long currentTimeMillis = System.currentTimeMillis();
                if (j9 > 0) {
                    long j10 = d73.f24341b;
                    if (currentTimeMillis >= j10) {
                        d73.f24342c = currentTimeMillis - j10;
                    }
                }
                d73.f24343d = false;
                return;
            default:
                C4050vA c4050vA = (C4050vA) this.f24143b;
                synchronized (c4050vA) {
                    try {
                        if (z8) {
                            c4050vA.f34736c = System.currentTimeMillis();
                            c4050vA.f34739f = true;
                        } else {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j11 = c4050vA.f34737d;
                            if (j11 > 0 && currentTimeMillis2 >= j11) {
                                c4050vA.f34738e = currentTimeMillis2 - j11;
                            }
                            c4050vA.f34739f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public C7(C4050vA c4050vA) {
        Objects.requireNonNull(c4050vA);
        this.f24143b = c4050vA;
    }
}
