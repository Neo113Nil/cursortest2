package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20184o extends BroadcastReceiver {
    public final /* synthetic */ C20194p A00;

    public C20184o(C20194p c20194p) {
        this.A00 = c20194p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A00;
        A00 = C20194p.A00(context);
        if (C5C.A02 >= 31 && A00 == 5) {
            C20164m.A02(context, this.A00);
        } else {
            this.A00.A07(A00);
        }
    }
}
