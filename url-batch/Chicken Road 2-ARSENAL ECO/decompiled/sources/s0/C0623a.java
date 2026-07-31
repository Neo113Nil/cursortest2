package s0;

import H1.C;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.onesignal.inAppMessages.internal.display.impl.a;
import l0.q;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623a extends AbstractC0627e {

    /* renamed from: f, reason: collision with root package name */
    public final C f5864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0623a(Context context, B0.c cVar, int i7) {
        super(context, cVar);
        this.f5865g = i7;
        this.f5864f = new C(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // s0.AbstractC0627e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        switch (this.f5865g) {
            case 0:
                Intent registerReceiver = this.f5870b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    q.d().b(AbstractC0624b.f5866a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Intent registerReceiver2 = this.f5870b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    q.d().b(AbstractC0625c.f5867a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                boolean z5 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            default:
                Intent registerReceiver3 = this.f5870b.registerReceiver(null, f());
                boolean z6 = true;
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
                    z6 = false;
                }
                return Boolean.valueOf(z6);
        }
    }

    @Override // s0.AbstractC0627e
    public final void d() {
        q.d().a(AbstractC0626d.f5868a, getClass().getSimpleName().concat(": registering receiver"));
        this.f5870b.registerReceiver(this.f5864f, f());
    }

    @Override // s0.AbstractC0627e
    public final void e() {
        q.d().a(AbstractC0626d.f5868a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f5870b.unregisterReceiver(this.f5864f);
    }

    public final IntentFilter f() {
        switch (this.f5865g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
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
