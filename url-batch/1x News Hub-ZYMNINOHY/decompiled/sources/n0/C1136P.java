package n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.A1;
import com.google.android.gms.internal.play_billing.AbstractC0207a1;
import com.google.android.gms.internal.play_billing.AbstractC0216d1;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C0279z;
import com.google.android.gms.internal.play_billing.Q1;
import f0.C0322a;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136P extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10039a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1137Q f10041c;

    public C1136P(C1137Q c1137q, boolean z) {
        this.f10041c = c1137q;
        this.f10040b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f10039a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f10040b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f10039a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f10039a) {
            AbstractC0248o0.g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f10039a = false;
        }
    }

    public final void c(Bundle bundle, C1147i c1147i, int i3) {
        AbstractC0207a1 p3;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                this.f10041c.f10045d.v(AbstractC1133M.b(23, i3, c1147i));
                return;
            }
            C0322a c0322a = this.f10041c.f10045d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i4 = AbstractC0207a1.f2832a;
            synchronized (AbstractC0207a1.class) {
                int i5 = AbstractC0207a1.f2832a;
                A1 a12 = A1.f2703c;
                p3 = AbstractC0216d1.p();
                int i6 = AbstractC0207a1.f2832a;
            }
            c0322a.v(Q1.n(byteArray, p3));
        } catch (Throwable unused) {
            AbstractC0248o0.g("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        C1137Q c1137q = this.f10041c;
        if (extras == null) {
            AbstractC0248o0.g("BillingBroadcastManager", "Bundle is null.");
            C0322a c0322a = c1137q.f10045d;
            C1147i c1147i = AbstractC1135O.f10024i;
            c0322a.v(AbstractC1133M.b(11, 1, c1147i));
            InterfaceC1156r interfaceC1156r = c1137q.f10043b;
            if (interfaceC1156r != null) {
                interfaceC1156r.onPurchasesUpdated(c1147i, null);
                return;
            }
            return;
        }
        C1147i d3 = AbstractC0248o0.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i3 = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        int i4 = 0;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            if (stringArrayList == null || stringArrayList2 == null) {
                Purchase j3 = AbstractC0248o0.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                if (j3 == null) {
                    AbstractC0248o0.f("BillingHelper", "Couldn't find single purchase data as well.");
                    if (d3.f10092a != 0) {
                        c1137q.f10045d.x(AbstractC1133M.d(i3));
                    } else {
                        c(extras, d3, i3);
                    }
                    c1137q.f10043b.onPurchasesUpdated(d3, arrayList);
                    return;
                }
                arrayList2.add(j3);
            } else {
                AbstractC0248o0.f("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                while (i4 < stringArrayList.size() && i4 < stringArrayList2.size()) {
                    Purchase j4 = AbstractC0248o0.j(stringArrayList.get(i4), stringArrayList2.get(i4));
                    if (j4 != null) {
                        arrayList2.add(j4);
                    }
                    i4++;
                }
            }
            arrayList = arrayList2;
            if (d3.f10092a != 0) {
            }
            c1137q.f10043b.onPurchasesUpdated(d3, arrayList);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (d3.f10092a != 0) {
                c(extras, d3, i3);
                InterfaceC1156r interfaceC1156r2 = c1137q.f10043b;
                C0279z c0279z = com.google.android.gms.internal.play_billing.C.f2714b;
                interfaceC1156r2.onPurchasesUpdated(d3, com.google.android.gms.internal.play_billing.Q.f2774e);
                return;
            }
            c1137q.getClass();
            InterfaceC1156r interfaceC1156r3 = c1137q.f10043b;
            B0.k kVar = c1137q.f10044c;
            C0322a c0322a2 = c1137q.f10045d;
            if (kVar == null) {
                AbstractC0248o0.g("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                C1147i c1147i2 = AbstractC1135O.f10024i;
                c0322a2.v(AbstractC1133M.b(77, i3, c1147i2));
                C0279z c0279z2 = com.google.android.gms.internal.play_billing.C.f2714b;
                interfaceC1156r3.onPurchasesUpdated(c1147i2, com.google.android.gms.internal.play_billing.Q.f2774e);
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                AbstractC0248o0.g("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                C1147i c1147i3 = AbstractC1135O.f10024i;
                c0322a2.v(AbstractC1133M.b(16, i3, c1147i3));
                C0279z c0279z3 = com.google.android.gms.internal.play_billing.C.f2714b;
                interfaceC1156r3.onPurchasesUpdated(c1147i3, com.google.android.gms.internal.play_billing.Q.f2774e);
                return;
            }
            try {
                if (kVar != null) {
                    kVar.a(new C0322a(string));
                    c0322a2.x(AbstractC1133M.d(i3));
                    return;
                }
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray == null) {
                    throw null;
                }
                while (i4 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                    if (optJSONObject != null) {
                        arrayList3.add(new C1128H(optJSONObject));
                    }
                    i4++;
                }
                throw null;
            } catch (JSONException unused) {
                AbstractC0248o0.g("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + "]");
                C1147i c1147i4 = AbstractC1135O.f10024i;
                c0322a2.v(AbstractC1133M.b(17, i3, c1147i4));
                C0279z c0279z4 = com.google.android.gms.internal.play_billing.C.f2714b;
                interfaceC1156r3.onPurchasesUpdated(c1147i4, com.google.android.gms.internal.play_billing.Q.f2774e);
            }
        }
    }
}
