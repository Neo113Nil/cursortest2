package io.appmetrica.analytics.billingv8.impl;

import b2.C0195i;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f5368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f5369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f5368a = linkedHashMap;
        this.f5369b = map;
        this.f5370c = iVar;
    }

    @Override // l2.a
    public final Object invoke() {
        Map map = this.f5368a;
        Map map2 = this.f5369b;
        i iVar = this.f5370c;
        m.a(map, map2, iVar.f5374d, iVar.f5373c.getBillingInfoManager());
        return C0195i.f2555a;
    }
}
