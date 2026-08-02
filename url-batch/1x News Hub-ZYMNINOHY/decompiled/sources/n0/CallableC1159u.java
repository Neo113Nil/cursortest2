package n0;

import E1.AbstractC0033i;
import U1.C0084e;
import a.AbstractC0129a;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C0208b;
import com.google.android.gms.internal.play_billing.C0279z;
import com.google.android.gms.internal.play_billing.InterfaceC0214d;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* renamed from: n0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1159u implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1143e f10127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10129d;

    public /* synthetic */ CallableC1159u(C1143e c1143e, Object obj, Object obj2, int i3) {
        this.f10126a = i3;
        this.f10127b = c1143e;
        this.f10128c = obj;
        this.f10129d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x005b, code lost:
    
        r0 = r2.w(n0.AbstractC1135O.f10026k, 119, "Service reset to null", r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Exception, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        C1123C c1123c;
        Object obj;
        InterfaceC0214d interfaceC0214d;
        C1143e c1143e = this.f10127b;
        String str = (String) this.f10128c;
        c1143e.getClass();
        AbstractC0248o0.f("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = c1143e.o;
        boolean z2 = c1143e.v;
        c1143e.f10060A.getClass();
        Bundle c3 = AbstractC0248o0.c(z, z2, c1143e.f10060A.f5087a, c1143e.f10067c, c1143e.f10064E.longValue());
        ?? r5 = 0;
        String str2 = null;
        while (true) {
            if (!c1143e.f10076m) {
                AbstractC0248o0.g("BillingClient", "getPurchaseHistory is not supported on current device");
                c1123c = new C1123C(AbstractC1135O.o, r5);
                break;
            }
            try {
                synchronized (c1143e.f10065a) {
                    try {
                        interfaceC0214d = c1143e.f10071h;
                    } catch (Throwable th) {
                        th = th;
                        obj = r5;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e3) {
                                    e = e3;
                                    c1123c = c1143e.w(AbstractC1135O.f10026k, 59, "Got exception trying to get purchase history", e);
                                    ((InterfaceC1154p) this.f10129d).onPurchaseHistoryResponse(c1123c.f9991b, c1123c.f9990a);
                                    return obj;
                                } catch (Exception e4) {
                                    e = e4;
                                    c1123c = c1143e.w(AbstractC1135O.f10024i, 59, "Got exception trying to get purchase history", e);
                                    ((InterfaceC1154p) this.f10129d).onPurchaseHistoryResponse(c1123c.f9991b, c1123c.f9990a);
                                    return obj;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (interfaceC0214d == null) {
                    break;
                }
                Bundle i3 = ((C0208b) interfaceC0214d).i(c1143e.f.getPackageName(), str, str2, c3);
                C1125E K2 = AbstractC0129a.K(i3, "getPurchaseHistory()");
                C1147i c1147i = (C1147i) K2.f9995b;
                if (c1147i != AbstractC1135O.f10025j) {
                    c1143e.H(K2.f9994a, 11, c1147i);
                    c1123c = new C1123C(c1147i, r5);
                    break;
                }
                ArrayList<String> stringArrayList = i3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = i3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = i3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i4 = 0;
                boolean z3 = false;
                Object obj2 = r5;
                while (i4 < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i4);
                    String str4 = stringArrayList3.get(i4);
                    obj = obj2;
                    AbstractC0248o0.f("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i4))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            AbstractC0248o0.g("BillingClient", "BUG: empty/null token!");
                            z3 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i4++;
                        obj2 = obj;
                    } catch (JSONException e5) {
                        c1123c = c1143e.w(AbstractC1135O.f10024i, 51, "Got an exception trying to decode the purchase!", e5);
                    }
                }
                obj = obj2;
                if (z3) {
                    c1143e.H(26, 11, AbstractC1135O.f10024i);
                }
                str2 = i3.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC0248o0.f("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    c1123c = new C1123C(AbstractC1135O.f10025j, arrayList);
                    break;
                }
                r5 = obj;
            } catch (DeadObjectException e6) {
                e = e6;
                obj = r5;
            } catch (Exception e7) {
                e = e7;
                obj = r5;
            }
        }
        obj = r5;
        ((InterfaceC1154p) this.f10129d).onPurchaseHistoryResponse(c1123c.f9991b, c1123c.f9990a);
        return obj;
    }

    private final Object b() {
        Bundle i3;
        InterfaceC0214d interfaceC0214d;
        C1143e c1143e = this.f10127b;
        String str = (String) this.f10128c;
        String str2 = (String) this.f10129d;
        try {
            synchronized (c1143e.f10065a) {
                interfaceC0214d = c1143e.f10071h;
            }
            if (interfaceC0214d == null) {
                return AbstractC0248o0.i(AbstractC1135O.f10026k, 119);
            }
            return ((C0208b) interfaceC0214d).g(c1143e.f.getPackageName(), str, str2);
        } catch (DeadObjectException e3) {
            C1147i c1147i = AbstractC1135O.f10026k;
            String a3 = AbstractC1133M.a(e3);
            i3 = AbstractC0248o0.i(c1147i, 5);
            if (a3 != null) {
                i3.putString("ADDITIONAL_LOG_DETAILS", a3);
            }
            return i3;
        } catch (Exception e4) {
            C1147i c1147i2 = AbstractC1135O.f10024i;
            String a4 = AbstractC1133M.a(e4);
            i3 = AbstractC0248o0.i(c1147i2, 5);
            if (a4 != null) {
                i3.putString("ADDITIONAL_LOG_DETAILS", a4);
            }
            return i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        InterfaceC0214d interfaceC0214d;
        int readInt;
        String str;
        T1.a aVar;
        InterfaceC0214d interfaceC0214d2;
        Exception exc;
        C1123C x3;
        ArrayList arrayList;
        InterfaceC0214d interfaceC0214d3;
        InterfaceC0214d interfaceC0214d4;
        int i3 = 20;
        int i4 = 119;
        Exception exc2 = null;
        boolean z = true;
        switch (this.f10126a) {
            case 0:
                C1143e c1143e = this.f10127b;
                C1148j c1148j = (C1148j) this.f10128c;
                B0.g gVar = (B0.g) this.f10129d;
                String str2 = c1148j.f10095b;
                try {
                    AbstractC0248o0.f("BillingClient", "Consuming purchase with token: " + str2);
                    synchronized (c1143e.f10065a) {
                        interfaceC0214d = c1143e.f10071h;
                    }
                    if (interfaceC0214d == null) {
                        c1143e.B(gVar, AbstractC1135O.f10026k, 119, "Service has been reset to null.", null);
                    } else {
                        if (c1143e.o) {
                            String packageName = c1143e.f.getPackageName();
                            boolean z2 = c1143e.o;
                            String str3 = c1143e.f10067c;
                            long longValue = c1143e.f10064E.longValue();
                            Bundle bundle = new Bundle();
                            if (z2) {
                                AbstractC0248o0.b(bundle, str3, longValue);
                            }
                            Bundle f = ((C0208b) interfaceC0214d).f(packageName, str2, bundle);
                            readInt = f.getInt("RESPONSE_CODE");
                            str = AbstractC0248o0.e(f, "BillingClient");
                        } else {
                            String packageName2 = c1143e.f.getPackageName();
                            C0208b c0208b = (C0208b) interfaceC0214d;
                            Parcel a3 = c0208b.a();
                            a3.writeInt(3);
                            a3.writeString(packageName2);
                            a3.writeString(str2);
                            Parcel b3 = c0208b.b(a3, 5);
                            readInt = b3.readInt();
                            b3.recycle();
                            str = "";
                        }
                        C1147i a4 = AbstractC1135O.a(readInt, str);
                        if (readInt == 0) {
                            AbstractC0248o0.f("BillingClient", "Successfully consumed purchase.");
                            ((C0084e) gVar.f131b).a(S0.a.j(a4));
                        } else {
                            c1143e.B(gVar, a4, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                        }
                    }
                } catch (DeadObjectException e3) {
                    c1143e.B(gVar, AbstractC1135O.f10026k, 29, "Error consuming purchase!", e3);
                } catch (Exception e4) {
                    c1143e.B(gVar, AbstractC1135O.f10024i, 29, "Error consuming purchase!", e4);
                }
                return null;
            case 1:
                Exception exc3 = null;
                boolean z3 = true;
                C1143e c1143e2 = this.f10127b;
                b0.s sVar = (b0.s) this.f10128c;
                c1143e2.getClass();
                ArrayList arrayList2 = new ArrayList();
                String str4 = ((C1157s) ((com.google.android.gms.internal.play_billing.C) sVar.f2544a).get(0)).f10122b;
                com.google.android.gms.internal.play_billing.C c3 = (com.google.android.gms.internal.play_billing.C) sVar.f2544a;
                int size = c3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        aVar = new T1.a(0, "", arrayList2);
                    } else {
                        int i6 = i5 + 20;
                        ArrayList arrayList3 = new ArrayList(c3.subList(i5, i6 > size ? size : i6));
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        int size2 = arrayList3.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            arrayList4.add(((C1157s) arrayList3.get(i7)).f10121a);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList4);
                        bundle2.putString("playBillingLibraryVersion", c1143e2.f10067c);
                        try {
                            synchronized (c1143e2.f10065a) {
                                interfaceC0214d2 = c1143e2.f10071h;
                            }
                            if (interfaceC0214d2 == null) {
                                aVar = c1143e2.v(AbstractC1135O.f10026k, 119, "Service has been reset to null.", exc3);
                            } else {
                                int i8 = z3 != c1143e2.f10084w ? 17 : i3;
                                String packageName3 = c1143e2.f.getPackageName();
                                boolean z4 = c1143e2.v && c1143e2.f10060A.f5087a;
                                String str5 = c1143e2.f10067c;
                                c1143e2.o();
                                c1143e2.o();
                                c1143e2.o();
                                c1143e2.o();
                                long longValue2 = c1143e2.f10064E.longValue();
                                Bundle bundle3 = new Bundle();
                                AbstractC0248o0.b(bundle3, str5, longValue2);
                                bundle3.putBoolean("enablePendingPurchases", true);
                                bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                if (z4) {
                                    bundle3.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                }
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                ArrayList<String> arrayList6 = new ArrayList<>();
                                int size3 = arrayList3.size();
                                int i9 = 0;
                                boolean z5 = false;
                                while (i9 < size3) {
                                    com.google.android.gms.internal.play_billing.C c4 = c3;
                                    C1157s c1157s = (C1157s) arrayList3.get(i9);
                                    int i10 = size;
                                    arrayList5.add(null);
                                    z5 |= !TextUtils.isEmpty(null);
                                    if (c1157s.f10122b.equals("first_party")) {
                                        throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    }
                                    i9++;
                                    size = i10;
                                    c3 = c4;
                                }
                                com.google.android.gms.internal.play_billing.C c5 = c3;
                                int i11 = size;
                                if (z5) {
                                    bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                                }
                                if (!arrayList6.isEmpty()) {
                                    bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                                }
                                Bundle l3 = ((C0208b) interfaceC0214d2).l(i8, packageName3, str4, bundle2, bundle3);
                                if (l3 == null) {
                                    aVar = c1143e2.v(AbstractC1135O.f10012A, 44, "queryProductDetailsAsync got empty product details response.", null);
                                } else if (l3.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = l3.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        for (int i12 = 0; i12 < stringArrayList.size(); i12++) {
                                            try {
                                                C1152n c1152n = new C1152n(stringArrayList.get(i12));
                                                AbstractC0248o0.f("BillingClient", "Got product details: ".concat(c1152n.toString()));
                                                arrayList2.add(c1152n);
                                            } catch (JSONException e5) {
                                                aVar = c1143e2.v(AbstractC1135O.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e5);
                                            }
                                        }
                                        z3 = true;
                                        i5 = i6;
                                        size = i11;
                                        c3 = c5;
                                        i3 = 20;
                                        exc3 = null;
                                    } else {
                                        aVar = c1143e2.v(AbstractC1135O.f10012A, 46, "queryProductDetailsAsync got null response list", null);
                                    }
                                } else {
                                    int a5 = AbstractC0248o0.a(l3, "BillingClient");
                                    String e6 = AbstractC0248o0.e(l3, "BillingClient");
                                    aVar = a5 != 0 ? c1143e2.v(AbstractC1135O.a(a5, e6), 23, AbstractC0033i.h(a5, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : c1143e2.v(AbstractC1135O.a(6, e6), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                }
                            }
                        } catch (DeadObjectException e7) {
                            aVar = c1143e2.v(AbstractC1135O.f10026k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e7);
                        } catch (Exception e8) {
                            aVar = c1143e2.v(AbstractC1135O.f10024i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e8);
                        }
                    }
                }
                ((InterfaceC1153o) this.f10129d).onProductDetailsResponse(AbstractC1135O.a(aVar.f1343a, (String) aVar.f1345c), (ArrayList) aVar.f1344b);
                return null;
            case 2:
                C1143e c1143e3 = this.f10127b;
                String str6 = (String) this.f10128c;
                c1143e3.getClass();
                AbstractC0248o0.f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str6)));
                ArrayList arrayList7 = new ArrayList();
                boolean z6 = c1143e3.o;
                boolean z7 = c1143e3.v;
                c1143e3.f10060A.getClass();
                Bundle c6 = AbstractC0248o0.c(z6, z7, c1143e3.f10060A.f5087a, c1143e3.f10067c, c1143e3.f10064E.longValue());
                String str7 = null;
                while (true) {
                    try {
                        synchronized (c1143e3.f10065a) {
                            try {
                                interfaceC0214d3 = c1143e3.f10071h;
                            } catch (Throwable th) {
                                th = th;
                                exc = exc2;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (DeadObjectException e9) {
                                            e = e9;
                                            x3 = c1143e3.x(AbstractC1135O.f10026k, 52, "Got exception trying to get purchases try to reconnect", e);
                                            arrayList = x3.f9990a;
                                            if (arrayList != null) {
                                            }
                                            return exc;
                                        } catch (Exception e10) {
                                            e = e10;
                                            x3 = c1143e3.x(AbstractC1135O.f10024i, 52, "Got exception trying to get purchases try to reconnect", e);
                                            arrayList = x3.f9990a;
                                            if (arrayList != null) {
                                            }
                                            return exc;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                        if (interfaceC0214d3 == null) {
                            x3 = c1143e3.x(AbstractC1135O.f10026k, i4, "Service has been reset to null", exc2);
                        } else {
                            Bundle k3 = c1143e3.o ? ((C0208b) interfaceC0214d3).k(z != c1143e3.v ? 9 : 19, c1143e3.f.getPackageName(), str6, str7, c6) : ((C0208b) interfaceC0214d3).j(c1143e3.f.getPackageName(), str6, str7);
                            C1125E K2 = AbstractC0129a.K(k3, "getPurchase()");
                            C1147i c1147i = (C1147i) K2.f9995b;
                            if (c1147i != AbstractC1135O.f10025j) {
                                x3 = c1143e3.x(c1147i, K2.f9994a, "Purchase bundle invalid", exc2);
                            } else {
                                ArrayList<String> stringArrayList2 = k3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList3 = k3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = k3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                boolean z8 = z;
                                int i13 = 0;
                                boolean z9 = false;
                                while (i13 < stringArrayList3.size()) {
                                    String str8 = stringArrayList3.get(i13);
                                    String str9 = stringArrayList4.get(i13);
                                    exc = exc2;
                                    AbstractC0248o0.f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList2.get(i13))));
                                    try {
                                        Purchase purchase = new Purchase(str8, str9);
                                        if (TextUtils.isEmpty(purchase.b())) {
                                            AbstractC0248o0.g("BillingClient", "BUG: empty/null token!");
                                            z9 = z8;
                                        }
                                        arrayList7.add(purchase);
                                        i13++;
                                        exc2 = exc;
                                    } catch (JSONException e11) {
                                        x3 = c1143e3.x(AbstractC1135O.f10024i, 51, "Got an exception trying to decode the purchase!", e11);
                                    }
                                }
                                exc = exc2;
                                if (z9) {
                                    c1143e3.H(26, 9, AbstractC1135O.f10024i);
                                }
                                str7 = k3.getString("INAPP_CONTINUATION_TOKEN");
                                AbstractC0248o0.f("BillingClient", "Continuation token: ".concat(String.valueOf(str7)));
                                if (TextUtils.isEmpty(str7)) {
                                    x3 = new C1123C(AbstractC1135O.f10025j, arrayList7);
                                } else {
                                    z = z8;
                                    exc2 = exc;
                                    i4 = 119;
                                }
                            }
                        }
                    } catch (DeadObjectException e12) {
                        e = e12;
                        exc = exc2;
                    } catch (Exception e13) {
                        e = e13;
                        exc = exc2;
                    }
                }
                exc = exc2;
                arrayList = x3.f9990a;
                if (arrayList != null) {
                    ((InterfaceC1155q) this.f10129d).onQueryPurchasesResponse(x3.f9991b, arrayList);
                } else {
                    InterfaceC1155q interfaceC1155q = (InterfaceC1155q) this.f10129d;
                    C1147i c1147i2 = x3.f9991b;
                    C0279z c0279z = com.google.android.gms.internal.play_billing.C.f2714b;
                    interfaceC1155q.onQueryPurchasesResponse(c1147i2, com.google.android.gms.internal.play_billing.Q.f2774e);
                }
                return exc;
            case 3:
                return a();
            case 4:
                return b();
            default:
                C1143e c1143e4 = this.f10127b;
                B0.g gVar2 = (B0.g) this.f10128c;
                C1140b c1140b = (C1140b) this.f10129d;
                try {
                    synchronized (c1143e4.f10065a) {
                        interfaceC0214d4 = c1143e4.f10071h;
                    }
                    if (interfaceC0214d4 == null) {
                        c1143e4.z(gVar2, AbstractC1135O.f10026k, 119, null);
                    } else {
                        String packageName4 = c1143e4.f.getPackageName();
                        String str10 = c1140b.f10054a;
                        String str11 = c1143e4.f10067c;
                        long longValue3 = c1143e4.f10064E.longValue();
                        Bundle bundle4 = new Bundle();
                        AbstractC0248o0.b(bundle4, str11, longValue3);
                        Bundle e14 = ((C0208b) interfaceC0214d4).e(packageName4, str10, bundle4);
                        ((C0084e) gVar2.f131b).a(S0.a.j(AbstractC1135O.a(AbstractC0248o0.a(e14, "BillingClient"), AbstractC0248o0.e(e14, "BillingClient"))));
                    }
                } catch (DeadObjectException e15) {
                    c1143e4.z(gVar2, AbstractC1135O.f10026k, 28, e15);
                } catch (Exception e16) {
                    c1143e4.z(gVar2, AbstractC1135O.f10024i, 28, e16);
                }
                return null;
        }
    }
}
