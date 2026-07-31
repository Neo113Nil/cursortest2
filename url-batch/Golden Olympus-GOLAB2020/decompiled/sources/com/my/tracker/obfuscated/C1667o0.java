package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.my.tracker.obfuscated.C1631f0;
import com.my.tracker.obfuscated.C1663n0;
import com.my.tracker.obfuscated.C1667o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1667o0 {

    /* renamed from: a, reason: collision with root package name */
    final Context f21466a;

    /* renamed from: b, reason: collision with root package name */
    final C1631f0 f21467b;

    /* renamed from: c, reason: collision with root package name */
    final C1631f0.c f21468c = new C1631f0.c() { // from class: com.my.tracker.obfuscated.n3
        @Override // com.my.tracker.obfuscated.C1631f0.c
        public final void a(List list) {
            C1667o0.this.b(list);
        }
    };

    /* renamed from: com.my.tracker.obfuscated.o0$a */
    final class a implements C1663n0.b {

        /* renamed from: a, reason: collision with root package name */
        private final List f21469a;

        a(List list) {
            this.f21469a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Map map) {
            for (C1671p0 c1671p0 : this.f21469a) {
                c1671p0.a((JSONObject) map.get(c1671p0.c()));
            }
            C1667o0.this.f21467b.d(this.f21469a);
        }

        @Override // com.my.tracker.obfuscated.C1663n0.b
        public void a(int i4, final Map map) {
            if (i4 == 1) {
                AbstractC1708y2.b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.q3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1667o0.a.this.a(map);
                    }
                });
            }
        }
    }

    private C1667o0(C1631f0 c1631f0, Context context) {
        this.f21467b = c1631f0;
        this.f21466a = context.getApplicationContext();
    }

    public void a() {
        this.f21467b.a(this.f21468c);
    }

    void b(List list) {
        AbstractC1708y2.a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1671p0 c1671p0 = (C1671p0) it.next();
            String c4 = c1671p0.c();
            if (c1671p0.g()) {
                AbstractC1708y2.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + c4);
                arrayList2.add(c1671p0);
            } else {
                AbstractC1708y2.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + c4);
                arrayList.add(c1671p0);
            }
        }
        a((List) arrayList, false);
        a((List) arrayList2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        C1671p0 a4 = C1671p0.a(str, str2, AbstractC1700w2.a());
        if (a4 == null) {
            return;
        }
        this.f21467b.a(Collections.singletonList(a4), this.f21468c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        AbstractC1708y2.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1671p0 a4 = C1663n0.a(it.next());
            if (a4 == null) {
                AbstractC1708y2.a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(a4);
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.f21467b.a(arrayList, this.f21468c);
        }
    }

    public static C1667o0 a(C1631f0 c1631f0, Context context) {
        return new C1667o0(c1631f0, context);
    }

    public void a(int i4, Intent intent) {
        if (!C1663n0.f21445g.booleanValue()) {
            AbstractC1708y2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
            return;
        }
        if (i4 != -1) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
            return;
        }
        if (intent == null) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: empty intent has been received");
            return;
        }
        final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (TextUtils.isEmpty(stringExtra)) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: empty purchase data in intent");
            return;
        }
        final String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (stringExtra2 == null) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: null data signature in intent");
        } else {
            AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.o3
                @Override // java.lang.Runnable
                public final void run() {
                    C1667o0.this.a(stringExtra, stringExtra2);
                }
            });
        }
    }

    public void a(int i4, final List list) {
        if (i4 != 0) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
            return;
        }
        if (list == null || list.isEmpty()) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
        } else if (C1663n0.f21445g.booleanValue()) {
            AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.p3
                @Override // java.lang.Runnable
                public final void run() {
                    C1667o0.this.a(list);
                }
            });
        } else {
            AbstractC1708y2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
        }
    }

    void a(List list, boolean z4) {
        if (!list.isEmpty()) {
            C1663n0.a(list, z4, new a(list), this.f21466a);
        } else if (z4) {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: empty inapp raw purchases list");
        } else {
            AbstractC1708y2.a("GooglePlayPurchaseHandler: empty subs raw purchases list");
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.f21467b.a(jSONObject, jSONObject2, str, map);
    }
}
