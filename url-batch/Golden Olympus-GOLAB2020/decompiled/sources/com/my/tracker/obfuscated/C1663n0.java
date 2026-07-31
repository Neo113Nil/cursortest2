package com.my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1663n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Boolean f21445g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f21446h;

    /* renamed from: a, reason: collision with root package name */
    final BillingClientStateListener f21447a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f21448b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final List f21449c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21450d;

    /* renamed from: e, reason: collision with root package name */
    private final b f21451e;

    /* renamed from: f, reason: collision with root package name */
    private final BillingClient f21452f;

    /* renamed from: com.my.tracker.obfuscated.n0$a */
    class a implements BillingClientStateListener {

        /* renamed from: a, reason: collision with root package name */
        final AtomicInteger f21453a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f21454b;

        a(b bVar) {
            this.f21454b = bVar;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            if (this.f21453a.incrementAndGet() >= 3 || !C1663n0.this.c()) {
                AbstractC1708y2.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                this.f21454b.a(1, Collections.EMPTY_MAP);
                C1663n0.this.a();
            }
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                AbstractC1708y2.a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
            } else {
                AbstractC1708y2.a("GooglePlayProductHelper: connection with billing client has been established");
                this.f21453a.set(0);
                C1663n0.this.b();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.n0$b */
    public interface b {
        void a(int i4, Map map);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    static {
        boolean z4;
        if (Purchase.class.equals(Purchase.class)) {
            if (BillingClient.class.equals(BillingClient.class)) {
                z4 = true;
                f21445g = Boolean.valueOf(z4);
                f21446h = !z4 ? new HashSet() : Collections.EMPTY_SET;
            }
        }
        z4 = false;
        f21445g = Boolean.valueOf(z4);
        f21446h = !z4 ? new HashSet() : Collections.EMPTY_SET;
    }

    private C1663n0(List list, String str, b bVar, Context context) {
        this.f21449c = list;
        this.f21451e = bVar;
        this.f21452f = BillingClient.newBuilder(context).setListener(new PurchasesUpdatedListener() { // from class: com.my.tracker.obfuscated.k3
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list2) {
                C1663n0.a(billingResult, list2);
            }
        }).enablePendingPurchases().build();
        this.f21450d = str;
        this.f21447a = new a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BillingResult billingResult, List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final BillingResult billingResult, final List list) {
        AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.j3
            @Override // java.lang.Runnable
            public final void run() {
                C1663n0.this.b(billingResult, list);
            }
        });
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(BillingResult billingResult, List list) {
        if (!this.f21448b.compareAndSet(false, true)) {
            AbstractC1708y2.a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            AbstractC1708y2.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + (billingResult != null ? billingResult.getDebugMessage() : "{empty message}"));
            this.f21451e.a(1, Collections.EMPTY_MAP);
            return;
        }
        if (list == null || list.isEmpty()) {
            AbstractC1708y2.a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.f21451e.a(0, Collections.EMPTY_MAP);
            return;
        }
        HashMap hashMap = new HashMap();
        AbstractC1708y2.a("GooglePlayProductHelper: populating map of skuDetails data");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it.next();
            try {
                hashMap.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
            } catch (Throwable th) {
                AbstractC1708y2.b("GooglePlayProductHelper error: exception while parsing skuData", th);
            }
        }
        this.f21451e.a(0, hashMap);
    }

    public static C1671p0 a(Object obj) {
        if (!f21445g.booleanValue()) {
            AbstractC1708y2.b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return C1671p0.a(purchase.getOriginalJson(), purchase.getSignature(), AbstractC1700w2.a());
            }
        } catch (Throwable th) {
            AbstractC1708y2.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    void b() {
        try {
            AbstractC1708y2.a("GooglePlayProductHelper: querying for " + this.f21450d);
            this.f21452f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.f21449c).setType(this.f21450d).build(), new SkuDetailsResponseListener() { // from class: com.my.tracker.obfuscated.l3
                @Override // com.android.billingclient.api.SkuDetailsResponseListener
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    C1663n0.this.c(billingResult, list);
                }
            });
        } catch (Throwable th) {
            AbstractC1708y2.b("GooglePlayProductHelper error: exception while querying details for " + this.f21450d, th);
            a();
        }
    }

    boolean c() {
        try {
            AbstractC1708y2.a("GooglePlayProductHelper: start connection with billing client");
            this.f21452f.startConnection(this.f21447a);
            f21446h.add(this);
            return true;
        } catch (Throwable th) {
            AbstractC1708y2.b("GooglePlayProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    void a() {
        try {
            AbstractC1708y2.a("GooglePlayProductHelper: end connection with billing client");
            f21446h.remove(this);
            this.f21452f.endConnection();
        } catch (Throwable th) {
            AbstractC1708y2.b("GooglePlayProductHelper error: exception while end connection:", th);
        }
    }

    public static void a(List list, boolean z4, final b bVar, final Context context) {
        if (list.isEmpty()) {
            AbstractC1708y2.a("GooglePlayProductHelper: empty purchases list");
            bVar.a(0, Collections.EMPTY_MAP);
            return;
        }
        final String str = z4 ? "subs" : "inapp";
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c4 = ((C1671p0) it.next()).c();
            if (!arrayList.contains(c4)) {
                arrayList.add(c4);
            }
        }
        AbstractC1658m.f(new Runnable() { // from class: com.my.tracker.obfuscated.i3
            @Override // java.lang.Runnable
            public final void run() {
                C1663n0.a(arrayList, str, bVar, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list, String str, b bVar, Context context) {
        C1663n0 c1663n0;
        try {
            c1663n0 = new C1663n0(list, str, bVar, context);
        } catch (Throwable th) {
            AbstractC1708y2.b("GooglePlayProductHelper error: error while creating ProductHelper", th);
        }
        if (c1663n0.c()) {
            return;
        }
        c1663n0.a();
        bVar.a(1, Collections.EMPTY_MAP);
    }
}
