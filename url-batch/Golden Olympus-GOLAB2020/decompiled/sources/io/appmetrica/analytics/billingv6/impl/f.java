package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f implements ProductDetailsResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f36902a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f36903b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f36904c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f36905d;

    /* renamed from: e, reason: collision with root package name */
    public final List f36906e;

    /* renamed from: f, reason: collision with root package name */
    public final d f36907f;

    /* renamed from: g, reason: collision with root package name */
    public final n f36908g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f36902a = str;
        this.f36903b = billingClient;
        this.f36904c = utilsProvider;
        this.f36905d = hVar;
        this.f36906e = list;
        this.f36907f = dVar;
        this.f36908g = nVar;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f36904c.getWorkerExecutor().execute(new e(this, billingResult, list));
    }
}
