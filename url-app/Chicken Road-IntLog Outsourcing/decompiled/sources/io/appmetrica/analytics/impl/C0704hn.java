package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import t4.InterfaceC1430a;

/* renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704hn extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0729in f8363a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0704hn(C0729in c0729in) {
        super(0);
        this.f8363a = c0729in;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0729in c0729in = this.f8363a;
        String a6 = c0729in.f8463a.a();
        if (a6 != null) {
        }
        String a7 = c0729in.f8464b.a();
        if (a7 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a7);
        }
        return hashMap;
    }
}
