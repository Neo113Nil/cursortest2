package com.facebook.ads.redexgen.core;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2567Qr extends Observable<AbstractC2568Qs> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC2568Qs) this.mObservers.get(size)).A00();
        }
    }
}
