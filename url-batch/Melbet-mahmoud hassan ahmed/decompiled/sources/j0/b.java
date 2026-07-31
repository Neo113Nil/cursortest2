package j0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d0.j;

/* loaded from: classes.dex */
public class b extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f18049i = j.f("BatteryNotLowTracker");

    public b(Context context, n0.a aVar) {
        super(context, aVar);
    }

    @Override // j0.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // j0.c
    public void h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        j.c().a(f18049i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        d(bool);
    }

    @Override // j0.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f18055b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        j.c().b(f18049i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
