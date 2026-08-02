package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import o3.InterfaceC1328a;

/* renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597en extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0623fn f11813a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0597en(C0623fn c0623fn) {
        super(0);
        this.f11813a = c0623fn;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0623fn c0623fn = this.f11813a;
        String a3 = c0623fn.f11882a.a();
        if (a3 != null) {
        }
        String a4 = c0623fn.f11883b.a();
        if (a4 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a4);
        }
        return hashMap;
    }
}
