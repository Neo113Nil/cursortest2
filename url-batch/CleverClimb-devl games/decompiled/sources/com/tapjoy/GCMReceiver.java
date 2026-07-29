package com.tapjoy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tapjoy.internal.hc;

/* loaded from: classes2.dex */
public class GCMReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean a2 = hc.b(context).a(intent);
        if (isOrderedBroadcast()) {
            setResult(-1, null, null);
            if (a2) {
                abortBroadcast();
            }
        }
    }
}
