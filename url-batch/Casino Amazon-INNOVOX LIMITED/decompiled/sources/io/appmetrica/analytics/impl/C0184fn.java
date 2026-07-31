package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0184fn extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0210gn f1263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184fn(C0210gn c0210gn) {
        super(0);
        this.f1263a = c0210gn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C0210gn c0210gn = this.f1263a;
        String a2 = c0210gn.f1278a.a();
        if (a2 != null) {
        }
        String a3 = c0210gn.b.a();
        if (a3 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a3);
        }
        return hashMap;
    }
}
