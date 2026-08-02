package io.appmetrica.analytics.billingv8.impl;

import c3.C0297i;
import java.util.LinkedHashMap;
import java.util.Map;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f9618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f9619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f9620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f9618a = linkedHashMap;
        this.f9619b = map;
        this.f9620c = iVar;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        Map map = this.f9618a;
        Map map2 = this.f9619b;
        i iVar = this.f9620c;
        m.a(map, map2, iVar.f9624d, iVar.f9623c.getBillingInfoManager());
        return C0297i.f5732a;
    }
}
