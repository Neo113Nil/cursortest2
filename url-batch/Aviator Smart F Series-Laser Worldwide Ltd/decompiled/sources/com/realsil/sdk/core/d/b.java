package com.realsil.sdk.core.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15648a;

    public b(f fVar) {
        this.f15648a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
            Locale locale = Locale.US;
            ZLogger.v("[" + action + "] " + intExtra2 + " -> " + intExtra);
            if (intExtra == 10 && this.f15648a.isScanning()) {
                new Thread(new a(this)).start();
            }
        }
    }
}
