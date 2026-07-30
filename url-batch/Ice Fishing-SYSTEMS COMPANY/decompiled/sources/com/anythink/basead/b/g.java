package com.anythink.basead.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        String stringExtra2;
        String action = intent.getAction();
        if (action != null) {
            stringExtra = intent.getStringExtra("receiver_extra_offer_id");
            stringExtra2 = intent.getStringExtra("receiver_extra_click_id");
            switch (action) {
                case "at_offer_action_1":
                    h.a(context.getApplicationContext()).a(stringExtra, stringExtra2);
                    break;
                case "at_offer_action_2":
                    h.a(context.getApplicationContext()).b(stringExtra, stringExtra2);
                    break;
                case "at_offer_action_3":
                    h.a(context.getApplicationContext()).c(stringExtra, stringExtra2);
                    break;
                case "at_offer_action_4":
                    h.a(context.getApplicationContext()).d(stringExtra, stringExtra2);
                    break;
            }
        }
    }
}
