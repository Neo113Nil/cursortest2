package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import com.my.tracker.obfuscated.C1621d;
import com.my.tracker.obfuscated.C1631f0;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1626e implements C1631f0.a, C1621d.b {

    /* renamed from: a, reason: collision with root package name */
    final C1631f0 f21264a;

    /* renamed from: b, reason: collision with root package name */
    final C1676q1 f21265b;

    /* renamed from: c, reason: collision with root package name */
    final C1621d f21266c;

    private C1626e(C1631f0 c1631f0, C1676q1 c1676q1, C1621d.a aVar) {
        this.f21264a = c1631f0;
        this.f21265b = c1676q1;
        this.f21266c = aVar.a(this);
    }

    @Override // com.my.tracker.obfuscated.C1621d.b
    public void c(List list) {
        if (list.isEmpty()) {
            AbstractC1708y2.a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f21264a.c(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f21265b.b() < 86400000) {
            AbstractC1708y2.a("AppGalleryPurchaseHandler: not yet time for tracking");
        } else {
            this.f21266c.a();
            this.f21265b.a(currentTimeMillis);
        }
    }

    public void a() {
        this.f21264a.a(this);
        c();
    }

    void c() {
        AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.U
            @Override // java.lang.Runnable
            public final void run() {
                C1626e.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj, String str, String str2, String str3, Map map) {
        JSONObject a4 = C1621d.a(obj);
        if (a4 == null) {
            AbstractC1708y2.a("AppGalleryPurchaseHandler: error parse productInfo object");
        } else {
            this.f21264a.a(a4, str, str2, str3, map);
        }
    }

    @Override // com.my.tracker.obfuscated.C1631f0.a
    public void b(List list) {
        if (list.isEmpty()) {
            AbstractC1708y2.a("AppGalleryPurchaseHandler: empty subs raw purchases list");
        } else {
            this.f21266c.a(list);
        }
    }

    public static C1626e a(C1631f0 c1631f0, C1676q1 c1676q1, Context context) {
        C1621d.a a4 = C1621d.a(context.getApplicationContext());
        if (a4 != null) {
            return new C1626e(c1631f0, c1676q1, a4);
        }
        AbstractC1708y2.a("AppGalleryPurchaseHandler: can't support appGallery purchases ");
        return null;
    }

    public void b(final Object obj, final String str, final String str2, final String str3, final Map map) {
        AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.T
            @Override // java.lang.Runnable
            public final void run() {
                C1626e.this.a(obj, str, str2, str3, map);
            }
        });
    }

    public void a(int i4, Intent intent) {
        if (i4 != -1) {
            AbstractC1708y2.a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            AbstractC1708y2.a("AppGalleryPurchaseHandler: empty intent has been received");
        } else {
            this.f21266c.a(intent);
        }
    }

    @Override // com.my.tracker.obfuscated.C1621d.b
    public void a(List list) {
        if (list.isEmpty()) {
            AbstractC1708y2.a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f21264a.a(list, this);
        }
    }
}
