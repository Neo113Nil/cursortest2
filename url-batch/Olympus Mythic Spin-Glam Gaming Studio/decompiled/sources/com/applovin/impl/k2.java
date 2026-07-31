package com.applovin.impl;

import com.applovin.impl.d6;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class k2 {
    private static boolean a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar) {
        if (a) {
            return;
        }
        kVar.D().a(d2.S0, "no_ads_loaded");
    }

    public static void b(final com.applovin.impl.sdk.k kVar) {
        Long l = (Long) kVar.a(r3.n8);
        if (l.longValue() <= 0) {
            return;
        }
        kVar.q0().a(new r6(kVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.k2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                k2.a(com.applovin.impl.sdk.k.this);
            }
        }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        a = true;
    }
}
