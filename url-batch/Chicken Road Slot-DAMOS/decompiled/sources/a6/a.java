package a6;

import a1.n;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: f, reason: collision with root package name */
    public final d f293f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, n nVar, int i3) {
        super(context, nVar);
        this.g = i3;
        this.f293f = new d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // a6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        switch (this.g) {
            case 0:
                Intent registerReceiver = this.f303b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    o.d().b(b.f294a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent registerReceiver2 = this.f303b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    o.d().b(c.f295a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                boolean z10 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                Intent registerReceiver3 = this.f303b.registerReceiver(null, f());
                boolean z11 = true;
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (hashCode == -730838620) {
                            break;
                        }
                    }
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }

    @Override // a6.g
    public final void d() {
        o.d().a(e.f298a, getClass().getSimpleName().concat(": registering receiver"));
        this.f303b.registerReceiver(this.f293f, f());
    }

    @Override // a6.g
    public final void e() {
        o.d().a(e.f298a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f303b.unregisterReceiver(this.f293f);
    }

    public final IntentFilter f() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
