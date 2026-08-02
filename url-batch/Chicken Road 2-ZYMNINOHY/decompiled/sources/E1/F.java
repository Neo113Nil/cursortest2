package E1;

import E.AbstractC0005f;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC0346t;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0298a;
import com.google.android.gms.internal.play_billing.C0354x;
import com.google.android.gms.internal.play_billing.InterfaceC0304c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0029e f490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f492d;

    public /* synthetic */ F(C0029e c0029e, Object obj, Object obj2, int i4) {
        this.f489a = i4;
        this.f490b = c0029e;
        this.f491c = obj;
        this.f492d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0093, code lost:
    
        r0 = r2.H(E1.W.f542j, 107, "Service has been reset to null", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        Exception exc;
        l2.e H4;
        List list;
        InterfaceC0304c interfaceC0304c;
        Bundle bundle;
        Bundle j4;
        C0037m a3;
        int i4;
        C0029e c0029e = this.f490b;
        Exception exc2 = null;
        int i5 = 9;
        if (!c0029e.x()) {
            C0037m c0037m = W.f542j;
            c0029e.J(2, 9, c0037m);
            InterfaceC0046w interfaceC0046w = (InterfaceC0046w) this.f491c;
            com.google.android.gms.internal.play_billing.r rVar = AbstractC0346t.f6014b;
            interfaceC0046w.onQueryPurchasesResponse(c0037m, C0354x.f6026e);
            return null;
        }
        String str = (String) this.f492d;
        if (TextUtils.isEmpty(str)) {
            AbstractC0352w.h("BillingClient", "Please provide a valid product type.");
            C0037m c0037m2 = W.f537e;
            c0029e.J(50, 9, c0037m2);
            InterfaceC0046w interfaceC0046w2 = (InterfaceC0046w) this.f491c;
            com.google.android.gms.internal.play_billing.r rVar2 = AbstractC0346t.f6014b;
            interfaceC0046w2.onQueryPurchasesResponse(c0037m2, C0354x.f6026e);
            return null;
        }
        AbstractC0352w.g("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = c0029e.f607p;
        boolean z4 = c0029e.f613w;
        c0029e.f589C.getClass();
        boolean z5 = c0029e.f589C.f636a;
        long longValue = c0029e.f592F.longValue();
        Bundle bundle2 = new Bundle();
        AbstractC0352w.b(bundle2, c0029e.f596c, c0029e.f597d, longValue);
        int i6 = 1;
        if (z) {
            bundle2.putBoolean("enablePendingPurchases", true);
        }
        if (z4 && z5) {
            bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (c0029e.f594a) {
                    try {
                        interfaceC0304c = c0029e.f602i;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e4) {
                                    e = e4;
                                    H4 = c0029e.H(W.f542j, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) H4.f14270b;
                                    if (list != null) {
                                    }
                                    return exc;
                                } catch (Exception e5) {
                                    e = e5;
                                    H4 = c0029e.H(W.f540h, 52, "Got exception trying to get purchases try to reconnect", e);
                                    list = (List) H4.f14270b;
                                    if (list != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (interfaceC0304c == null) {
                    break;
                }
                if (c0029e.f607p) {
                    bundle = bundle2;
                    j4 = ((C0298a) interfaceC0304c).j(c0029e.f588B ? 26 : c0029e.f587A ? 24 : c0029e.f613w ? 19 : i5, c0029e.f600g.getPackageName(), str, str2, bundle);
                } else {
                    j4 = ((C0298a) interfaceC0304c).i(c0029e.f600g.getPackageName(), str, str2);
                    bundle = bundle2;
                }
                C0037m c0037m3 = W.f540h;
                if (j4 == null) {
                    AbstractC0352w.h("BillingClient", "getPurchase() got null owned items list");
                    i4 = 54;
                } else {
                    int a4 = AbstractC0352w.a(j4, "BillingClient");
                    String f4 = AbstractC0352w.f(j4, "BillingClient");
                    C0036l a5 = C0037m.a();
                    a5.f630a = a4;
                    a5.f632c = f4;
                    a3 = a5.a();
                    if (a4 != 0) {
                        AbstractC0352w.h("BillingClient", "getPurchase() failed. Response code: " + a4);
                        i4 = 23;
                    } else if (j4.containsKey("INAPP_PURCHASE_ITEM_LIST") && j4.containsKey("INAPP_PURCHASE_DATA_LIST") && j4.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = j4.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = j4.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = j4.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            AbstractC0352w.h("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            i4 = 56;
                        } else if (stringArrayList2 == null) {
                            AbstractC0352w.h("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            i4 = 57;
                        } else if (stringArrayList3 == null) {
                            AbstractC0352w.h("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            i4 = 58;
                        } else {
                            a3 = W.f541i;
                            i4 = i6;
                        }
                    } else {
                        AbstractC0352w.h("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        i4 = 55;
                    }
                    if (a3 == W.f541i) {
                        H4 = c0029e.H(a3, i4, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = j4.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = j4.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = j4.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    exc = exc2;
                    boolean z6 = false;
                    for (int i7 = 0; i7 < stringArrayList5.size(); i7++) {
                        String str3 = stringArrayList5.get(i7);
                        String str4 = stringArrayList6.get(i7);
                        AbstractC0352w.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i7))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.b())) {
                                AbstractC0352w.h("BillingClient", "BUG: empty/null token!");
                                z6 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e6) {
                            H4 = c0029e.H(W.f540h, 51, "Got an exception trying to decode the purchase!", e6);
                        }
                    }
                    if (z6) {
                        i5 = 9;
                        c0029e.J(26, 9, c0037m3);
                    } else {
                        i5 = 9;
                    }
                    str2 = j4.getString("INAPP_CONTINUATION_TOKEN");
                    AbstractC0352w.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        H4 = new l2.e(W.f541i, arrayList, 4, false);
                        break;
                    }
                    bundle2 = bundle;
                    exc2 = exc;
                    i6 = 1;
                }
                a3 = c0037m3;
                if (a3 == W.f541i) {
                }
            } catch (DeadObjectException e7) {
                e = e7;
                exc = exc2;
            } catch (Exception e8) {
                e = e8;
                exc = exc2;
            }
        }
        exc = exc2;
        list = (List) H4.f14270b;
        if (list != null) {
            ((InterfaceC0046w) this.f491c).onQueryPurchasesResponse((C0037m) H4.f14271c, list);
        } else {
            InterfaceC0046w interfaceC0046w3 = (InterfaceC0046w) this.f491c;
            C0037m c0037m4 = (C0037m) H4.f14271c;
            com.google.android.gms.internal.play_billing.r rVar3 = AbstractC0346t.f6014b;
            interfaceC0046w3.onQueryPurchasesResponse(c0037m4, C0354x.f6026e);
        }
        return exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [io.flutter.plugins.inapppurchase.f] */
    /* JADX WARN: Type inference failed for: r3v13, types: [io.flutter.plugins.inapppurchase.f] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC0304c interfaceC0304c;
        Exception exc;
        DeadObjectException deadObjectException;
        InterfaceC0304c interfaceC0304c2;
        int readInt;
        String str;
        N n;
        InterfaceC0304c interfaceC0304c3;
        ArrayList arrayList;
        int i4;
        Bundle c4;
        InterfaceC0304c interfaceC0304c4;
        io.flutter.plugins.inapppurchase.f fVar = 5;
        io.flutter.plugins.inapppurchase.f fVar2 = 5;
        io.flutter.plugins.inapppurchase.f fVar3 = 5;
        fVar = 5;
        Exception exc2 = null;
        int i5 = 107;
        switch (this.f489a) {
            case 0:
                C0029e c0029e = this.f490b;
                io.flutter.plugins.inapppurchase.f fVar4 = (io.flutter.plugins.inapppurchase.f) this.f491c;
                C3.v vVar = (C3.v) this.f492d;
                try {
                    if (!c0029e.x()) {
                        C0037m c0037m = W.f542j;
                        c0029e.J(2, 3, c0037m);
                        fVar4.a(c0037m);
                    } else if (TextUtils.isEmpty(vVar.f321b)) {
                        AbstractC0352w.h("BillingClient", "Please provide a valid purchase token.");
                        C0037m c0037m2 = W.f539g;
                        c0029e.J(26, 3, c0037m2);
                        fVar4.a(c0037m2);
                    } else if (c0029e.f607p) {
                        synchronized (c0029e.f594a) {
                            interfaceC0304c = c0029e.f602i;
                        }
                        if (interfaceC0304c == null) {
                            c0029e.k(fVar4, W.f542j, 107, null);
                        } else {
                            String packageName = c0029e.f600g.getPackageName();
                            String str2 = vVar.f321b;
                            String str3 = c0029e.f596c;
                            String str4 = c0029e.f597d;
                            long longValue = c0029e.f592F.longValue();
                            int i6 = AbstractC0352w.f6025a;
                            Bundle bundle = new Bundle();
                            AbstractC0352w.b(bundle, str3, str4, longValue);
                            Bundle e4 = ((C0298a) interfaceC0304c).e(packageName, str2, bundle);
                            fVar4.a(W.a(AbstractC0352w.a(e4, "BillingClient"), AbstractC0352w.f(e4, "BillingClient")));
                        }
                    } else {
                        C0037m c0037m3 = W.f533a;
                        c0029e.J(27, 3, c0037m3);
                        fVar4.a(c0037m3);
                    }
                } catch (DeadObjectException e5) {
                    c0029e.k(fVar4, W.f542j, 28, e5);
                } catch (Exception e6) {
                    c0029e.k(fVar4, W.f540h, 28, e6);
                }
                return null;
            case 1:
                C0029e c0029e2 = this.f490b;
                io.flutter.plugins.inapppurchase.f fVar5 = (io.flutter.plugins.inapppurchase.f) this.f491c;
                C3.v vVar2 = (C3.v) this.f492d;
                if (!c0029e2.x()) {
                    C0037m c0037m4 = W.f542j;
                    c0029e2.J(2, 4, c0037m4);
                    fVar5.f(c0037m4, vVar2.f321b);
                    return null;
                }
                String str5 = "Error consuming purchase with token. Response code: ";
                String str6 = vVar2.f321b;
                try {
                    AbstractC0352w.g("BillingClient", "Consuming purchase with token: " + str6);
                    synchronized (c0029e2.f594a) {
                        try {
                            try {
                                interfaceC0304c2 = c0029e2.f602i;
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (DeadObjectException e7) {
                            e = e7;
                        } catch (Exception e8) {
                            e = e8;
                        }
                    }
                    try {
                        if (interfaceC0304c2 == null) {
                            fVar = fVar5;
                            str5 = str6;
                            try {
                                c0029e2.m(fVar, str5, W.f542j, 107, "Service has been reset to null.", null);
                                return null;
                            } catch (DeadObjectException e9) {
                                e = e9;
                                deadObjectException = e;
                                fVar2 = fVar;
                                c0029e2.m(fVar2, str5, W.f542j, 29, "Error consuming purchase!", deadObjectException);
                                return null;
                            } catch (Exception e10) {
                                e = e10;
                                exc = e;
                                fVar3 = fVar;
                                c0029e2.m(fVar3, str5, W.f540h, 29, "Error consuming purchase!", exc);
                                return null;
                            }
                        }
                        fVar = fVar5;
                        try {
                            if (c0029e2.f607p) {
                                String packageName2 = c0029e2.f600g.getPackageName();
                                boolean z = c0029e2.f607p;
                                String str7 = c0029e2.f596c;
                                String str8 = c0029e2.f597d;
                                long longValue2 = c0029e2.f592F.longValue();
                                Bundle bundle2 = new Bundle();
                                if (z) {
                                    AbstractC0352w.b(bundle2, str7, str8, longValue2);
                                }
                                Bundle f4 = ((C0298a) interfaceC0304c2).f(packageName2, str6, bundle2);
                                readInt = f4.getInt("RESPONSE_CODE");
                                str = AbstractC0352w.f(f4, "BillingClient");
                            } else {
                                String packageName3 = c0029e2.f600g.getPackageName();
                                try {
                                    C0298a c0298a = (C0298a) interfaceC0304c2;
                                    Parcel a3 = c0298a.a();
                                    a3.writeInt(3);
                                    a3.writeString(packageName3);
                                    a3.writeString(str6);
                                    Parcel b4 = c0298a.b(a3, 5);
                                    readInt = b4.readInt();
                                    b4.recycle();
                                    str = "";
                                } catch (DeadObjectException e11) {
                                    e = e11;
                                    str5 = str6;
                                    deadObjectException = e;
                                    fVar2 = fVar;
                                    c0029e2.m(fVar2, str5, W.f542j, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e12) {
                                    e = e12;
                                    str5 = str6;
                                    exc = e;
                                    fVar3 = fVar;
                                    c0029e2.m(fVar3, str5, W.f540h, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            C0037m a4 = W.a(readInt, str);
                            if (readInt == 0) {
                                AbstractC0352w.g("BillingClient", "Successfully consumed purchase.");
                                fVar.f(a4, str6);
                                return null;
                            }
                            c0029e2.m(fVar, str6, a4, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e13) {
                            e = e13;
                        } catch (Exception e14) {
                            e = e14;
                        }
                    } catch (DeadObjectException e15) {
                        deadObjectException = e15;
                        str5 = str6;
                        c0029e2.m(fVar2, str5, W.f542j, 29, "Error consuming purchase!", deadObjectException);
                        return null;
                    } catch (Exception e16) {
                        exc = e16;
                        str5 = str6;
                        c0029e2.m(fVar3, str5, W.f540h, 29, "Error consuming purchase!", exc);
                        return null;
                    }
                } catch (DeadObjectException e17) {
                    e = e17;
                    fVar = fVar5;
                } catch (Exception e18) {
                    e = e18;
                    fVar = fVar5;
                }
            case 2:
                C0029e c0029e3 = this.f490b;
                InterfaceC0044u interfaceC0044u = (InterfaceC0044u) this.f491c;
                C0048y c0048y = (C0048y) this.f492d;
                if (!c0029e3.x()) {
                    C0037m c0037m5 = W.f542j;
                    c0029e3.J(2, 7, c0037m5);
                    com.google.android.gms.internal.play_billing.r rVar = AbstractC0346t.f6014b;
                    C0354x c0354x = C0354x.f6026e;
                    interfaceC0044u.onProductDetailsResponse(c0037m5, new A(c0354x, c0354x));
                } else {
                    if (c0029e3.f612u) {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int i7 = 0;
                        String str9 = ((C0049z) c0048y.f671a.get(0)).f673b;
                        AbstractC0346t abstractC0346t = c0048y.f671a;
                        int size = abstractC0346t.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                n = new N(0, "", arrayList2, arrayList3);
                            } else {
                                int i9 = i8 + 20;
                                ArrayList arrayList4 = new ArrayList(abstractC0346t.subList(i8, i9 > size ? size : i9));
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                int size2 = arrayList4.size();
                                for (int i10 = i7; i10 < size2; i10++) {
                                    arrayList5.add(((C0049z) arrayList4.get(i10)).f672a);
                                }
                                Bundle bundle3 = new Bundle();
                                bundle3.putStringArrayList("ITEM_ID_LIST", arrayList5);
                                String str10 = c0029e3.f596c;
                                bundle3.putString("playBillingLibraryVersion", str10);
                                try {
                                    synchronized (c0029e3.f594a) {
                                        interfaceC0304c3 = c0029e3.f602i;
                                    }
                                    if (interfaceC0304c3 == null) {
                                        n = c0029e3.C(W.f542j, i5, "Service has been reset to null.", exc2);
                                    } else {
                                        boolean z4 = c0029e3.f613w && c0029e3.f589C.f636a;
                                        c0029e3.F();
                                        c0029e3.F();
                                        c0029e3.F();
                                        c0029e3.F();
                                        AbstractC0346t abstractC0346t2 = abstractC0346t;
                                        ArrayList arrayList6 = arrayList4;
                                        int i11 = i9;
                                        Bundle k4 = ((C0298a) interfaceC0304c3).k(true != c0029e3.f614x ? 17 : 20, c0029e3.f600g.getPackageName(), str9, bundle3, AbstractC0352w.d(str10, c0029e3.f597d, arrayList4, new E2.b(z4), c0029e3.f592F.longValue()));
                                        if (k4 == null) {
                                            n = c0029e3.C(W.f528A, 44, "queryProductDetailsAsync got empty product details response.", null);
                                        } else if (k4.containsKey("DETAILS_LIST")) {
                                            ArrayList<String> stringArrayList = k4.getStringArrayList("DETAILS_LIST");
                                            if (stringArrayList == null) {
                                                n = c0029e3.C(W.f528A, 46, "queryProductDetailsAsync got null response list", null);
                                            } else {
                                                ArrayList arrayList7 = new ArrayList();
                                                int size3 = stringArrayList.size();
                                                int i12 = 0;
                                                while (i12 < size3) {
                                                    try {
                                                        C0043t c0043t = new C0043t(stringArrayList.get(i12));
                                                        AbstractC0352w.g("BillingClient", "Got product details: ".concat(c0043t.toString()));
                                                        arrayList7.add(c0043t);
                                                        i12++;
                                                        i11 = i11;
                                                    } catch (JSONException e19) {
                                                        n = c0029e3.C(W.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e19);
                                                    }
                                                }
                                                int i13 = i11;
                                                ArrayList<String> stringArrayList2 = k4.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                                new ArrayList();
                                                try {
                                                    ArrayList arrayList8 = new ArrayList();
                                                    if (stringArrayList2 != null) {
                                                        int size4 = stringArrayList2.size();
                                                        int i14 = 0;
                                                        while (i14 < size4) {
                                                            String str11 = stringArrayList2.get(i14);
                                                            i14++;
                                                            B b5 = new B(str11);
                                                            AbstractC0352w.g("BillingClient", "Got unfetchedProduct: ".concat(b5.toString()));
                                                            arrayList8.add(b5);
                                                        }
                                                    } else {
                                                        int size5 = arrayList6.size();
                                                        int i15 = 0;
                                                        while (i15 < size5) {
                                                            Object obj = arrayList6.get(i15);
                                                            i15++;
                                                            C0049z c0049z = (C0049z) obj;
                                                            int size6 = arrayList7.size();
                                                            int i16 = 0;
                                                            while (true) {
                                                                if (i16 < size6) {
                                                                    Object obj2 = arrayList7.get(i16);
                                                                    i16++;
                                                                    C0043t c0043t2 = (C0043t) obj2;
                                                                    arrayList = arrayList6;
                                                                    i4 = size5;
                                                                    if (!c0049z.f672a.equals(c0043t2.f661c) || !c0049z.f673b.equals(c0043t2.f662d)) {
                                                                        arrayList6 = arrayList;
                                                                        size5 = i4;
                                                                    }
                                                                } else {
                                                                    arrayList = arrayList6;
                                                                    i4 = size5;
                                                                    arrayList8.add(new B(new JSONObject().put("productId", c0049z.f672a).put("type", c0049z.f673b).put("statusCode", 0).toString()));
                                                                }
                                                            }
                                                            arrayList6 = arrayList;
                                                            size5 = i4;
                                                        }
                                                    }
                                                    arrayList2.addAll(arrayList7);
                                                    arrayList3.addAll(arrayList8);
                                                    i8 = i13;
                                                    abstractC0346t = abstractC0346t2;
                                                    exc2 = null;
                                                    i5 = 107;
                                                    i7 = 0;
                                                } catch (JSONException e20) {
                                                    n = c0029e3.C(W.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e20);
                                                }
                                            }
                                        } else {
                                            int a5 = AbstractC0352w.a(k4, "BillingClient");
                                            String f5 = AbstractC0352w.f(k4, "BillingClient");
                                            n = a5 != 0 ? c0029e3.C(W.a(a5, f5), 23, AbstractC0005f.j(a5, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : c0029e3.C(W.a(6, f5), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                        }
                                    }
                                } catch (DeadObjectException e21) {
                                    n = c0029e3.C(W.f542j, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e21);
                                } catch (Exception e22) {
                                    n = c0029e3.C(W.f540h, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e22);
                                }
                            }
                        }
                        interfaceC0044u.onProductDetailsResponse(W.a(n.f511a, (String) n.f514d), new A((ArrayList) n.f512b, (ArrayList) n.f513c));
                        return null;
                    }
                    AbstractC0352w.h("BillingClient", "Querying product details is not supported.");
                    C0037m c0037m6 = W.f548r;
                    c0029e3.J(20, 7, c0037m6);
                    com.google.android.gms.internal.play_billing.r rVar2 = AbstractC0346t.f6014b;
                    C0354x c0354x2 = C0354x.f6026e;
                    interfaceC0044u.onProductDetailsResponse(c0037m6, new A(c0354x2, c0354x2));
                }
                return null;
            case 3:
                return a();
            default:
                C0029e c0029e4 = this.f490b;
                String str12 = (String) this.f491c;
                String str13 = (String) this.f492d;
                try {
                    synchronized (c0029e4.f594a) {
                        interfaceC0304c4 = c0029e4.f602i;
                    }
                    if (interfaceC0304c4 == null) {
                        return AbstractC0352w.c(107, W.f542j);
                    }
                    return ((C0298a) interfaceC0304c4).g(c0029e4.f600g.getPackageName(), str12, str13);
                } catch (DeadObjectException e23) {
                    C0037m c0037m7 = W.f542j;
                    String a6 = U.a(e23);
                    c4 = AbstractC0352w.c(5, c0037m7);
                    if (a6 != null) {
                        c4.putString("ADDITIONAL_LOG_DETAILS", a6);
                    }
                    return c4;
                } catch (Exception e24) {
                    C0037m c0037m8 = W.f540h;
                    String a7 = U.a(e24);
                    c4 = AbstractC0352w.c(5, c0037m8);
                    if (a7 != null) {
                        c4.putString("ADDITIONAL_LOG_DETAILS", a7);
                    }
                    return c4;
                }
        }
    }

    public F(C0029e c0029e, InterfaceC0046w interfaceC0046w, String str) {
        this.f489a = 3;
        this.f491c = interfaceC0046w;
        this.f492d = str;
        Objects.requireNonNull(c0029e);
        this.f490b = c0029e;
    }
}
