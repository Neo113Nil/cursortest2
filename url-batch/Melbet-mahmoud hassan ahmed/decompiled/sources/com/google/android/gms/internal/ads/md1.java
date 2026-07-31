package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class md1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<nd1> f8498f;

    @Override // java.lang.Runnable
    public final void run() {
        nd1 nd1Var = this.f8498f.get();
        if (nd1Var != null) {
            nd1Var.R0(new kg1() { // from class: com.google.android.gms.internal.ads.kd1
                @Override // com.google.android.gms.internal.ads.kg1
                public final void c(Object obj) {
                    ((od1) obj).zza();
                }
            });
        }
    }
}
