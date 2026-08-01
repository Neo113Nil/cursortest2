package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Pi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0745Pi extends ContentObserver {
    public final C0751Po A00;

    public C0745Pi(Handler handler, C0751Po c0751Po) {
        super(handler);
        this.A00 = c0751Po;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0Z();
    }
}
