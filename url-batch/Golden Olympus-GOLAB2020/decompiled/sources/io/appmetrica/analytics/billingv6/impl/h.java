package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class h extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f36912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f36913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f36912a = linkedHashMap;
        this.f36913b = map;
        this.f36914c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f36912a;
        Map map2 = this.f36913b;
        i iVar = this.f36914c;
        m.a(map, map2, iVar.f36918d, iVar.f36917c.getBillingInfoManager());
        return Unit.f41027a;
    }
}
