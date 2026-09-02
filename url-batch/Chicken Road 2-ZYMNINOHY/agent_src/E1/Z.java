package E1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC0340p0;
import com.google.android.gms.internal.play_billing.AbstractC0346t;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0315f1;
import com.google.android.gms.internal.play_billing.C0354x;
import com.google.android.gms.internal.play_billing.P0;
import com.google.android.gms.internal.play_billing.l1;
import java.util.ArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class Z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f559a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f561c;

    public Z(a0 a0Var, boolean z) {
        this.f561c = a0Var;
        this.f560b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f559a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f560b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f559a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f559a) {
            AbstractC0352w.h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f559a = false;
        }
    }

    public final void c(Bundle bundle, C0037m c0037m, int i4, l1 l1Var, long j4, boolean z) {
        AbstractC0340p0 y4;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((l2.e) ((V) this.f561c.f569e)).y(U.b(23, i4, c0037m, null, l1Var), j4, z);
                return;
            }
            V v = (V) this.f561c.f569e;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i5 = AbstractC0340p0.f5994a;
            synchronized (AbstractC0340p0.class) {
                int i6 = AbstractC0340p0.f5994a;
                P0 p02 = P0.f5897c;
                y4 = AbstractC0347t0.y();
                int i7 = AbstractC0340p0.f5994a;
            }
            ((l2.e) v).y(C0315f1.n(byteArray, y4), j4, z);
        } catch (Throwable unused) {
            AbstractC0352w.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        char c4;
        C0037m e4;
        int intValue;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                c4 = 0;
            }
            c4 = 65535;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                c4 = 2;
            }
            c4 = 65535;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                c4 = 1;
            }
            c4 = 65535;
        }
        l1 l1Var = l1.LOCAL_PURCHASES_UPDATED_ACTION;
        l1 l1Var2 = l1.PURCHASES_UPDATED_ACTION;
        l1 l1Var3 = l1.ALTERNATIVE_BILLING_ACTION;
        l1 l1Var4 = c4 != 0 ? c4 != 1 ? c4 != 2 ? l1.BROADCAST_ACTION_UNSPECIFIED : l1Var3 : l1Var : l1Var2;
        int i4 = (l1Var4.equals(l1Var) || l1Var4.equals(l1Var3)) ? 2 : l1Var4.equals(l1Var2) ? 32 : 1;
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        a0 a0Var = this.f561c;
        if (extras == null) {
            AbstractC0352w.h("BillingBroadcastManager", "Bundle is null.");
            V v = (V) a0Var.f569e;
            C0037m c0037m = W.f540h;
            ((l2.e) v).v(U.b(11, i4, c0037m, null, l1Var4));
            InterfaceC0047x interfaceC0047x = (InterfaceC0047x) a0Var.f567c;
            if (interfaceC0047x != null) {
                interfaceC0047x.onPurchasesUpdated(c0037m, null);
                return;
            }
            return;
        }
        if (i4 == 2) {
            int i5 = AbstractC0352w.f6025a;
            C0036l a3 = C0037m.a();
            a3.f630a = AbstractC0352w.a(intent.getExtras(), "BillingBroadcastManager");
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                AbstractC0352w.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    AbstractC0352w.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a3.f631b = intValue;
                    a3.f632c = AbstractC0352w.f(intent.getExtras(), "BillingBroadcastManager");
                    e4 = a3.a();
                } else {
                    AbstractC0352w.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a3.f631b = intValue;
            a3.f632c = AbstractC0352w.f(intent.getExtras(), "BillingBroadcastManager");
            e4 = a3.a();
        } else {
            e4 = AbstractC0352w.e(intent, "BillingBroadcastManager");
        }
        C0037m c0037m2 = e4;
        long j4 = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (l1Var4.equals(l1Var2) || l1Var4.equals(l1Var)) {
            ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            if (stringArrayList == null || stringArrayList2 == null) {
                Purchase j5 = AbstractC0352w.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                if (j5 == null) {
                    AbstractC0352w.g("BillingHelper", "Couldn't find single purchase data as well.");
                    if (c0037m2.f633a != 0) {
                        ((l2.e) ((V) a0Var.f569e)).C(U.c(i4, l1Var4), j4, z);
                    } else {
                        c(extras, c0037m2, i4, l1Var4, j4, z);
                    }
                    ((InterfaceC0047x) a0Var.f567c).onPurchasesUpdated(c0037m2, arrayList);
                    return;
                }
                arrayList2.add(j5);
            } else {
                AbstractC0352w.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                for (int i6 = 0; i6 < stringArrayList.size() && i6 < stringArrayList2.size(); i6++) {
                    Purchase j6 = AbstractC0352w.j(stringArrayList.get(i6), stringArrayList2.get(i6));
                    if (j6 != null) {
                        arrayList2.add(j6);
                    }
                }
            }
            arrayList = arrayList2;
            if (c0037m2.f633a != 0) {
            }
            ((InterfaceC0047x) a0Var.f567c).onPurchasesUpdated(c0037m2, arrayList);
            return;
        }
        if (l1Var4.equals(l1Var3)) {
            if (c0037m2.f633a != 0) {
                c(extras, c0037m2, i4, l1Var4, j4, z);
                InterfaceC0047x interfaceC0047x2 = (InterfaceC0047x) a0Var.f567c;
                com.google.android.gms.internal.play_billing.r rVar = AbstractC0346t.f6014b;
                interfaceC0047x2.onPurchasesUpdated(c0037m2, C0354x.f6026e);
                return;
            }
            a0Var.getClass();
            InterfaceC0047x interfaceC0047x3 = (InterfaceC0047x) a0Var.f567c;
            V v4 = (V) a0Var.f569e;
            C c5 = (C) a0Var.f568d;
            if (c5 == null) {
                AbstractC0352w.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                C0037m c0037m3 = W.f540h;
                ((l2.e) v4).y(U.b(77, i4, c0037m3, null, l1Var4), j4, z);
                com.google.android.gms.internal.play_billing.r rVar2 = AbstractC0346t.f6014b;
                interfaceC0047x3.onPurchasesUpdated(c0037m3, C0354x.f6026e);
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                AbstractC0352w.h("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                C0037m c0037m4 = W.f540h;
                ((l2.e) v4).y(U.b(16, i4, c0037m4, null, l1Var4), j4, z);
                com.google.android.gms.internal.play_billing.r rVar3 = AbstractC0346t.f6014b;
                interfaceC0047x3.onPurchasesUpdated(c0037m4, C0354x.f6026e);
                return;
            }
            try {
                ((io.flutter.plugins.inapppurchase.f) c5).g(new E(string));
                ((l2.e) v4).C(U.c(i4, l1Var4), j4, z);
            } catch (JSONException unused) {
                AbstractC0352w.h("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + "]");
                C0037m c0037m5 = W.f540h;
                ((l2.e) v4).y(U.b(17, i4, c0037m5, null, l1Var4), j4, z);
                com.google.android.gms.internal.play_billing.r rVar4 = AbstractC0346t.f6014b;
                interfaceC0047x3.onPurchasesUpdated(c0037m5, C0354x.f6026e);
            }
        }
    }
}
