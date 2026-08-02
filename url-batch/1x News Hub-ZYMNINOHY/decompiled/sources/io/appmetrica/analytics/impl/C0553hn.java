package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553hn extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0578in f7482a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0553hn(C0578in c0578in) {
        super(0);
        this.f7482a = c0578in;
    }

    @Override // l2.a
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0578in c0578in = this.f7482a;
        String a3 = c0578in.f7574a.a();
        if (a3 != null) {
        }
        String a4 = c0578in.f7575b.a();
        if (a4 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a4);
        }
        return hashMap;
    }
}
