package j0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import d0.j;

/* loaded from: classes.dex */
public class a extends c<Boolean> {

    /* renamed from: i, reason: collision with root package name */
    private static final String f18048i = j.f("BatteryChrgTracker");

    public a(Context context, n0.a aVar) {
        super(context, aVar);
    }

    private boolean j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    @Override // j0.c
    public IntentFilter g() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // j0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(Context context, Intent intent) {
        Boolean bool;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c7 = 1;
        j.c().a(f18048i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -54942926:
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
            case 0:
            case 1:
                bool = Boolean.FALSE;
                break;
            case 2:
            case 3:
                bool = Boolean.TRUE;
                break;
            default:
                return;
        }
        d(bool);
    }

    @Override // j0.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f18055b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(j(registerReceiver));
        }
        j.c().b(f18048i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
