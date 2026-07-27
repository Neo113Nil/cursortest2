package B;

import G0.C0051a;
import G0.C0061k;
import G0.InterfaceC0067q;
import G0.J;
import I1.o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import k1.C1205a;
import k1.ExecutorC1212h;
import k1.m;
import k1.n;
import s0.s;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132a;

    /* renamed from: b, reason: collision with root package name */
    public Object f133b;

    /* renamed from: c, reason: collision with root package name */
    public Object f134c;

    /* renamed from: d, reason: collision with root package name */
    public Object f135d;

    public /* synthetic */ l(int i2) {
        this.f132a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Object obj;
        int i2;
        o d6;
        switch (this.f132a) {
            case 0:
                try {
                    obj = ((e) this.f133b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f135d).post(new A0.a((f) this.f134c, obj, 2, false));
                return;
            case 1:
                ((t0.o) this.f133b).f11887f.h((t0.j) this.f134c, (B4.i) this.f135d);
                return;
            case 2:
                ((J) this.f133b).N((B1.g) this.f134c, (InterfaceC0067q) this.f135d);
                return;
            case 3:
                ((J) this.f133b).M((D3.g) this.f135d, (C0061k) this.f134c);
                return;
            case 4:
                ((J) this.f133b).L((C0051a) this.f134c, (D3.g) this.f135d);
                return;
            case 5:
                C1205a c1205a = (C1205a) this.f134c;
                Intent intent = c1205a.f10670a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID);
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    d6 = B0.f.r(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = c1205a.f10670a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID);
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = c1205a.f10670a;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    bundle.putBoolean("supports_message_handled", true);
                    n c2 = n.c((Context) this.f133b);
                    synchronized (c2) {
                        i2 = c2.f10711a;
                        c2.f10711a = i2 + 1;
                    }
                    d6 = c2.d(new m(i2, 2, bundle, 0));
                }
                d6.f(ExecutorC1212h.f10688b, new I1.j((CountDownLatch) this.f135d));
                return;
            case 6:
                try {
                    z = ((Boolean) ((D0.k) this.f135d).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                    z = true;
                }
                ((t0.f) this.f133b).d((B0.j) this.f134c, z);
                return;
            default:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f135d;
                Context context = (Context) this.f134c;
                Intent intent4 = (Intent) this.f133b;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    s.d().a(ConstraintProxyUpdateReceiver.f4736a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    C0.l.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    C0.l.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    C0.l.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    C0.l.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i2) {
        this.f132a = i2;
        this.f133b = obj;
        this.f134c = obj2;
        this.f135d = obj3;
    }
}
