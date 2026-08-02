package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awk extends awn {
    @Override // defpackage.awn
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.awp
    public final /* bridge */ /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        asq.a().c(awl.a, "getInitialState - null intent received");
        return false;
    }

    @Override // defpackage.awn
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        asq.a();
        String str = awl.a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    f(true);
                }
            } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                f(false);
            }
        }
    }
}
