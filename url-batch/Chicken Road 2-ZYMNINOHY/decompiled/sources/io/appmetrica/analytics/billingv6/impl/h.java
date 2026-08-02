package io.appmetrica.analytics.billingv6.impl;

import c3.C0297i;
import java.util.LinkedHashMap;
import java.util.Map;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f9565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f9566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f9567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f9565a = linkedHashMap;
        this.f9566b = map;
        this.f9567c = iVar;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        Map map = this.f9565a;
        Map map2 = this.f9566b;
        i iVar = this.f9567c;
        m.a(map, map2, iVar.f9571d, iVar.f9570c.getBillingInfoManager());
        return C0297i.f5732a;
    }
}
