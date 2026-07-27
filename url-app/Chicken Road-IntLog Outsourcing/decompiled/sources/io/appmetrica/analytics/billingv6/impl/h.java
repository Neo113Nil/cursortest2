package io.appmetrica.analytics.billingv6.impl;

import f4.v;
import java.util.LinkedHashMap;
import java.util.Map;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f6076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f6077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f6078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f6076a = linkedHashMap;
        this.f6077b = map;
        this.f6078c = iVar;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        Map map = this.f6076a;
        Map map2 = this.f6077b;
        i iVar = this.f6078c;
        m.a(map, map2, iVar.f6082d, iVar.f6081c.getBillingInfoManager());
        return v.f5689a;
    }
}
