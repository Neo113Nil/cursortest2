package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {
    private pvs pvs;

    public interface pvs {
        void icD();

        void pvs();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: ".concat(String.valueOf(action)));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                Log.i("HomeReceiver", "reason: ".concat(String.valueOf(stringExtra)));
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    pvs pvsVar = this.pvs;
                    if (pvsVar != null) {
                        pvsVar.pvs();
                        return;
                    }
                    return;
                }
                if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    pvs pvsVar2 = this.pvs;
                    if (pvsVar2 != null) {
                        pvsVar2.icD();
                        return;
                    }
                    return;
                }
                if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        } catch (Throwable unused) {
            Ju.pvs("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }

    public void pvs(pvs pvsVar) {
        this.pvs = pvsVar;
    }
}
