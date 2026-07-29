package com.cmplay.gppay.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    boolean f4068a = false;

    /* renamed from: b, reason: collision with root package name */
    String f4069b = "IabHelper";

    /* renamed from: c, reason: collision with root package name */
    boolean f4070c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f4071d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    String h = "";
    Context i;
    com.android.vending.a.a j;
    ServiceConnection k;
    int l;
    String m;
    String n;
    c o;

    public interface a {
        void a(g gVar, com.cmplay.gppay.a.c cVar);
    }

    /* renamed from: com.cmplay.gppay.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0326b {
        void a(List<g> list, List<com.cmplay.gppay.a.c> list2);
    }

    public interface c {
        void a(com.cmplay.gppay.a.c cVar, g gVar);
    }

    public interface d {
        void a(com.cmplay.gppay.a.c cVar);
    }

    public interface e {
        void a(com.cmplay.gppay.a.c cVar, com.cmplay.gppay.a.d dVar);
    }

    public b(Context context, String str) {
        this.n = null;
        this.i = context.getApplicationContext();
        this.n = str;
        c("IAB helper created.");
    }

    public static String a(int i) {
        StringBuilder sb;
        String str;
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000) {
            int i2 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(i));
            str = ":Unknown IAB Helper Error";
        } else {
            if (i >= 0 && i < split.length) {
                return split[i];
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(i));
            str = ":Unknown";
        }
        sb.append(str);
        return sb.toString();
    }

    private void e() {
        if (this.f4071d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    int a(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            d("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        d("Unexpected type for intent response code.");
        d(obj.getClass().getName());
        throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
    }

    int a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        d("Unexpected type for bundle response code.");
        d(obj.getClass().getName());
        throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0181, code lost:
    
        if (r4 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0183, code lost:
    
        return -1003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0180, code lost:
    
        return -1002;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int a(com.cmplay.gppay.a.d dVar, String str) {
        c("Querying owned items, item type: " + str);
        c("Package name: " + this.i.getPackageName());
        String str2 = null;
        boolean z = false;
        while (true) {
            c("Calling getPurchases with continuation token: " + str2);
            boolean z2 = true;
            if (this.j == null || this.i == null) {
                break;
            }
            Bundle a2 = this.j.a(3, this.i.getPackageName(), str, str2);
            int a3 = a(a2);
            c("Owned items response: " + String.valueOf(a3));
            if (a3 != 0) {
                c("getPurchases() failed: " + a(a3));
                return a3;
            }
            if (!a2.containsKey("INAPP_PURCHASE_ITEM_LIST") || !a2.containsKey("INAPP_PURCHASE_DATA_LIST") || !a2.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                break;
            }
            ArrayList<String> stringArrayList = a2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = a2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = a2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            boolean z3 = z;
            for (int i = 0; i < stringArrayList2.size(); i++) {
                String str3 = stringArrayList2.get(i);
                String str4 = stringArrayList3.get(i);
                String str5 = stringArrayList.get(i);
                if (h.a(this.n, str3, str4)) {
                    c("Sku is owned: " + str5);
                    g gVar = new g(str, str3, str4);
                    if (TextUtils.isEmpty(gVar.e())) {
                        e("BUG: empty/null token!");
                        c("Purchase data: " + str3);
                    }
                    dVar.a(gVar);
                } else {
                    e("Purchase signature verification **FAILED**. Not adding item.");
                    c("   Purchase data: " + str3);
                    c("   Signature: " + str4);
                    z3 = true;
                }
            }
            str2 = a2.getString("INAPP_CONTINUATION_TOKEN");
            c("Continuation token: " + str2);
            if (TextUtils.isEmpty(str2)) {
                z2 = z3;
                break;
            }
            z = z3;
        }
    }

    int a(String str, com.cmplay.gppay.a.d dVar, List<String> list) {
        c("Querying SKU details.");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dVar.c(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() / 20;
        int size2 = arrayList.size() % 20;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList3 = new ArrayList();
            int i2 = i * 20;
            Iterator it = arrayList.subList(i2, i2 + 20).iterator();
            while (it.hasNext()) {
                arrayList3.add((String) it.next());
            }
            arrayList2.add(arrayList3);
        }
        if (size2 != 0) {
            ArrayList arrayList4 = new ArrayList();
            int i3 = size * 20;
            Iterator it2 = arrayList.subList(i3, size2 + i3).iterator();
            while (it2.hasNext()) {
                arrayList4.add((String) it2.next());
            }
            arrayList2.add(arrayList4);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ArrayList<String> arrayList5 = (ArrayList) it3.next();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
            Bundle a2 = this.j.a(3, this.i.getPackageName(), str, bundle);
            if (!a2.containsKey("DETAILS_LIST")) {
                int a3 = a(a2);
                if (a3 == 0) {
                    d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return -1002;
                }
                c("getSkuDetails() failed: " + a(a3));
                return a3;
            }
            Iterator<String> it4 = a2.getStringArrayList("DETAILS_LIST").iterator();
            while (it4.hasNext()) {
                j jVar = new j(str, it4.next());
                c("Got sku details: " + jVar);
                dVar.a(jVar);
            }
        }
        return 0;
    }

    public com.cmplay.gppay.a.d a(boolean z, List<String> list) {
        return a(z, list, list);
    }

    public com.cmplay.gppay.a.d a(boolean z, List<String> list, List<String> list2) {
        int a2;
        int a3;
        e();
        a("queryInventory");
        try {
            com.cmplay.gppay.a.d dVar = new com.cmplay.gppay.a.d();
            int a4 = a(dVar, "inapp");
            if (a4 != 0) {
                throw new com.cmplay.gppay.a.a(a4, "Error refreshing inventory (querying owned items).");
            }
            if (z && (a3 = a("inapp", dVar, list)) != 0) {
                throw new com.cmplay.gppay.a.a(a3, "Error refreshing inventory (querying prices of items).");
            }
            if (this.e) {
                int a5 = a(dVar, "subs");
                if (a5 != 0) {
                    throw new com.cmplay.gppay.a.a(a5, "Error refreshing inventory (querying owned subscriptions).");
                }
                if (z && (a2 = a("subs", dVar, list2)) != 0) {
                    throw new com.cmplay.gppay.a.a(a2, "Error refreshing inventory (querying prices of subscriptions).");
                }
            }
            return dVar;
        } catch (RemoteException e2) {
            throw new com.cmplay.gppay.a.a(-1001, "Remote exception while refreshing inventory.", e2);
        } catch (JSONException e3) {
            throw new com.cmplay.gppay.a.a(-1002, "Error parsing JSON response while refreshing inventory.", e3);
        }
    }

    public void a() {
        c("Disposing.");
        this.f4070c = false;
        if (this.k != null) {
            c("Unbinding from service.");
            if (this.i != null) {
                this.i.unbindService(this.k);
            }
        }
        this.f4071d = true;
        this.i = null;
        this.k = null;
        this.j = null;
        this.o = null;
    }

    public void a(Activity activity, String str, int i, c cVar) {
        a(activity, str, i, cVar, "");
    }

    public void a(Activity activity, String str, int i, c cVar, String str2) {
        a(activity, str, "inapp", null, i, cVar, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6 A[Catch: RemoteException -> 0x0151, SendIntentException -> 0x017b, TryCatch #2 {SendIntentException -> 0x017b, RemoteException -> 0x0151, blocks: (B:12:0x004a, B:14:0x0068, B:17:0x006f, B:19:0x007a, B:21:0x0088, B:24:0x008c, B:25:0x00ba, B:27:0x00d6, B:29:0x00fa, B:32:0x00fe, B:34:0x00a1), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe A[Catch: RemoteException -> 0x0151, SendIntentException -> 0x017b, TRY_LEAVE, TryCatch #2 {SendIntentException -> 0x017b, RemoteException -> 0x0151, blocks: (B:12:0x004a, B:14:0x0068, B:17:0x006f, B:19:0x007a, B:21:0x0088, B:24:0x008c, B:25:0x00ba, B:27:0x00d6, B:29:0x00fa, B:32:0x00fe, B:34:0x00a1), top: B:11:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Activity activity, String str, String str2, List<String> list, int i, c cVar, String str3) {
        com.cmplay.gppay.a.c cVar2;
        Bundle a2;
        int a3;
        e();
        a("launchPurchaseFlow");
        b("launchPurchaseFlow");
        Log.v("gp_pay", "-----launchPurchaseFlow itemType = " + str2);
        if (str2.equals("subs") && !this.e) {
            com.cmplay.gppay.a.c cVar3 = new com.cmplay.gppay.a.c(-1009, "Subscriptions are not available.");
            b();
            if (cVar != null) {
                cVar.a(cVar3, null);
                return;
            }
            return;
        }
        try {
            c("Constructing buy intent for " + str + ", item type: " + str2);
            if (list != null && !list.isEmpty()) {
                Log.v("gp_pay", "-----upgrade/downgrade subs ReplaceSkus");
                if (!this.f) {
                    com.cmplay.gppay.a.c cVar4 = new com.cmplay.gppay.a.c(-1011, "Subscription updates are not available.");
                    b();
                    if (cVar != null) {
                        cVar.a(cVar4, null);
                        return;
                    }
                    return;
                }
                a2 = this.j.a(5, this.i.getPackageName(), list, str, str2, str3);
                a3 = a(a2);
                Log.v("gp_pay", "----- response = " + a3);
                if (a3 == 0) {
                    d("Unable to buy item, Error response: " + a(a3));
                    b();
                    com.cmplay.gppay.a.c cVar5 = new com.cmplay.gppay.a.c(a3, "Unable to buy item");
                    if (cVar != null) {
                        cVar.a(cVar5, null);
                        return;
                    }
                    return;
                }
                PendingIntent pendingIntent = (PendingIntent) a2.getParcelable("BUY_INTENT");
                c("Launching buy intent for " + str + ". Request code: " + i);
                this.l = i;
                this.o = cVar;
                this.m = str2;
                IntentSender intentSender = pendingIntent.getIntentSender();
                Intent intent = new Intent();
                Integer num = 0;
                int intValue = num.intValue();
                Integer num2 = 0;
                Integer num3 = 0;
                activity.startIntentSenderForResult(intentSender, i, intent, intValue, num2.intValue(), num3.intValue());
                return;
            }
            Log.v("gp_pay", "-----buy new subs");
            a2 = this.j.a(3, this.i.getPackageName(), str, str2, str3);
            a3 = a(a2);
            Log.v("gp_pay", "----- response = " + a3);
            if (a3 == 0) {
            }
        } catch (IntentSender.SendIntentException e2) {
            d("SendIntentException while launching purchase flow for sku " + str);
            e2.printStackTrace();
            b();
            cVar2 = new com.cmplay.gppay.a.c(-1004, "Failed to send intent.");
            if (cVar == null) {
                return;
            }
            cVar.a(cVar2, null);
        } catch (RemoteException e3) {
            d("RemoteException while launching purchase flow for sku " + str);
            e3.printStackTrace();
            b();
            cVar2 = new com.cmplay.gppay.a.c(-1001, "Remote exception while starting purchase flow");
            if (cVar == null) {
                return;
            }
            cVar.a(cVar2, null);
        }
    }

    public void a(final d dVar) {
        e();
        if (this.f4070c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        c("Starting in-app billing setup.");
        this.k = new ServiceConnection() { // from class: com.cmplay.gppay.a.b.1
            /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
            @Override // android.content.ServiceConnection
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b bVar;
                if (b.this.f4071d) {
                    return;
                }
                b.this.c("Billing service connected.");
                b.this.j = a.AbstractBinderC0292a.a(iBinder);
                String packageName = b.this.i.getPackageName();
                try {
                    b.this.c("Checking for in-app billing 3 support.");
                    int a2 = b.this.j.a(3, packageName, "inapp");
                    if (a2 != 0) {
                        if (dVar != null) {
                            dVar.a(new com.cmplay.gppay.a.c(a2, "Error checking for billing v3 support."));
                        }
                        b.this.e = false;
                        b.this.f = false;
                        return;
                    }
                    b.this.c("In-app billing version 3 supported for " + packageName);
                    if (b.this.j.a(5, packageName, "subs") == 0) {
                        Log.v("gp_pay", "------isBillingSupported 5");
                        b.this.c("Subscription re-signup AVAILABLE.");
                        b.this.f = true;
                    } else {
                        b.this.c("Subscription re-signup not available.");
                        b.this.f = false;
                    }
                    if (b.this.f) {
                        bVar = b.this;
                    } else {
                        int a3 = b.this.j.a(3, packageName, "subs");
                        if (a3 != 0) {
                            b.this.c("Subscriptions NOT AVAILABLE. Response: " + a3);
                            b.this.e = false;
                            b.this.f = false;
                            b.this.f4070c = true;
                            if (dVar == null) {
                                dVar.a(new com.cmplay.gppay.a.c(0, "Setup successful."));
                                return;
                            }
                            return;
                        }
                        b.this.c("Subscriptions AVAILABLE.");
                        bVar = b.this;
                    }
                    bVar.e = true;
                    b.this.f4070c = true;
                    if (dVar == null) {
                    }
                } catch (RemoteException e2) {
                    if (dVar != null) {
                        dVar.a(new com.cmplay.gppay.a.c(-1001, "RemoteException while setting up in-app billing."));
                    }
                    e2.printStackTrace();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b.this.c("Billing service disconnected.");
                b.this.j = null;
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        if (!this.i.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
            this.i.bindService(intent, this.k, 1);
        } else if (dVar != null) {
            dVar.a(new com.cmplay.gppay.a.c(3, "Billing service unavailable on device."));
        }
    }

    public void a(e eVar) {
        if (c()) {
            return;
        }
        a(true, (List<String>) null, eVar);
    }

    void a(g gVar) {
        e();
        a("consume");
        if (!gVar.f4096a.equals("inapp")) {
            throw new com.cmplay.gppay.a.a(-1010, "Items of type '" + gVar.f4096a + "' can't be consumed.");
        }
        try {
            String e2 = gVar.e();
            String d2 = gVar.d();
            if (e2 == null || e2.equals("")) {
                d("Can't consume " + d2 + ". No token.");
                throw new com.cmplay.gppay.a.a(-1007, "PurchaseInfo is missing token for sku: " + d2 + " " + gVar);
            }
            c("Consuming sku: " + d2 + ", token: " + e2);
            int b2 = this.j.b(3, this.i.getPackageName(), e2);
            if (b2 == 0) {
                c("Successfully consumed sku: " + d2);
                return;
            }
            c("Error consuming consuming sku " + d2 + ". " + a(b2));
            throw new com.cmplay.gppay.a.a(b2, "Error consuming sku " + d2);
        } catch (RemoteException e3) {
            throw new com.cmplay.gppay.a.a(-1001, "Remote exception while consuming. PurchaseInfo: " + gVar, e3);
        }
    }

    public void a(g gVar, a aVar) {
        e();
        a("consume");
        ArrayList arrayList = new ArrayList();
        arrayList.add(gVar);
        a(arrayList, aVar, (InterfaceC0326b) null);
    }

    void a(String str) {
        if (this.f4070c) {
            return;
        }
        d("Illegal state for operation (" + str + "): IAB helper is not set up.");
        throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
    }

    void a(final List<g> list, final a aVar, final InterfaceC0326b interfaceC0326b) {
        final Handler handler = new Handler();
        b("consume");
        new Thread(new Runnable() { // from class: com.cmplay.gppay.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                final ArrayList arrayList = new ArrayList();
                for (g gVar : list) {
                    try {
                        b.this.a(gVar);
                        arrayList.add(new com.cmplay.gppay.a.c(0, "Successful consume of sku " + gVar.d()));
                    } catch (com.cmplay.gppay.a.a e2) {
                        arrayList.add(e2.a());
                    }
                }
                b.this.b();
                if (!b.this.f4071d && aVar != null) {
                    handler.post(new Runnable() { // from class: com.cmplay.gppay.a.b.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.a((g) list.get(0), (com.cmplay.gppay.a.c) arrayList.get(0));
                        }
                    });
                }
                if (b.this.f4071d || interfaceC0326b == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.cmplay.gppay.a.b.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        interfaceC0326b.a(list, arrayList);
                    }
                });
            }
        }).start();
    }

    public void a(final boolean z, final List<String> list, final e eVar) {
        final Handler handler = new Handler();
        e();
        a("queryInventory");
        b("refresh inventory");
        new Thread(new Runnable() { // from class: com.cmplay.gppay.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                final com.cmplay.gppay.a.d dVar;
                final com.cmplay.gppay.a.c cVar = new com.cmplay.gppay.a.c(0, "Inventory refresh successful.");
                try {
                    dVar = b.this.a(z, list);
                } catch (com.cmplay.gppay.a.a e2) {
                    cVar = e2.a();
                    dVar = null;
                }
                b.this.b();
                if (b.this.f4071d || eVar == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.cmplay.gppay.a.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        eVar.a(cVar, dVar);
                    }
                });
            }
        }).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a1, code lost:
    
        if (r7.o != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d3, code lost:
    
        if (r7.o != null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i, int i2, Intent intent) {
        com.cmplay.gppay.a.c cVar;
        if (i != this.l) {
            return false;
        }
        e();
        a("handleActivityResult");
        b();
        if (intent == null) {
            d("Null data in IAB activity result.");
            com.cmplay.gppay.a.c cVar2 = new com.cmplay.gppay.a.c(-1002, "Null data in IAB result");
            if (this.o != null) {
                this.o.a(cVar2, null);
            }
            return true;
        }
        int a2 = a(intent);
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i2 == -1 && a2 == 0) {
            c("Successful resultcode from purchase activity.");
            c("Purchase data: " + stringExtra);
            c("Data signature: " + stringExtra2);
            c("Extras: " + intent.getExtras());
            c("Expected item type: " + this.m);
            if (stringExtra == null || stringExtra2 == null) {
                d("BUG: either purchaseData or dataSignature is null.");
                c("Extras: " + intent.getExtras().toString());
                com.cmplay.gppay.a.c cVar3 = new com.cmplay.gppay.a.c(-1008, "IAB returned null purchaseData or dataSignature");
                if (this.o != null) {
                    this.o.a(cVar3, null);
                }
                return true;
            }
            try {
                g gVar = new g(this.m, stringExtra, stringExtra2);
                String d2 = gVar.d();
                if (!h.a(this.n, stringExtra, stringExtra2)) {
                    d("Purchase signature verification FAILED for sku " + d2);
                    com.cmplay.gppay.a.c cVar4 = new com.cmplay.gppay.a.c(-1003, "Signature verification failed for sku " + d2);
                    if (this.o != null) {
                        this.o.a(cVar4, gVar);
                    }
                    return true;
                }
                c("Purchase signature successfully verified.");
                if (this.o != null) {
                    this.o.a(new com.cmplay.gppay.a.c(0, "Success"), gVar);
                }
            } catch (JSONException e2) {
                d("Failed to parse purchase data.");
                e2.printStackTrace();
                com.cmplay.gppay.a.c cVar5 = new com.cmplay.gppay.a.c(-1002, "Failed to parse purchase data.");
                if (this.o != null) {
                    this.o.a(cVar5, null);
                }
                return true;
            }
        } else if (i2 == -1) {
            c("Result code was OK but in-app billing response was not OK: " + a(a2));
            if (this.o != null) {
                cVar = new com.cmplay.gppay.a.c(a2, "Problem purchashing item.");
                this.o.a(cVar, null);
            }
        } else if (i2 == 0) {
            c("Purchase canceled - Response: " + a(a2));
            cVar = new com.cmplay.gppay.a.c(a2, -1005, "User canceled.");
        } else {
            d("Purchase failed. Result code: " + Integer.toString(i2) + ". Response: " + a(a2));
            cVar = new com.cmplay.gppay.a.c(-1006, "Unknown purchase response.");
        }
        return true;
    }

    public void b() {
        c("Ending async operation: " + this.h);
        this.h = "";
        this.g = false;
    }

    public void b(Activity activity, String str, int i, c cVar) {
        a(activity, str, "subs", null, i, cVar, "");
    }

    void b(String str) {
        if (this.g) {
            throw new IllegalStateException("Can't start async operation (" + str + ") because another async operation(" + this.h + ") is in progress.");
        }
        this.h = str;
        this.g = true;
        c("Starting async operation: " + str);
    }

    void c(String str) {
        if (this.f4068a) {
            Log.d(this.f4069b, str);
        }
    }

    public boolean c() {
        return this.g;
    }

    public com.android.vending.a.a d() {
        return this.j;
    }

    void d(String str) {
        Log.e(this.f4069b, "In-app billing error: " + str);
    }

    void e(String str) {
        Log.w(this.f4069b, "In-app billing warning: " + str);
    }
}
