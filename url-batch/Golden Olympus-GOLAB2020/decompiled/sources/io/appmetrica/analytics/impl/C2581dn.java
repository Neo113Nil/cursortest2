package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2581dn extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2607en f38882a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2581dn(C2607en c2607en) {
        super(0);
        this.f38882a = c2607en;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C2607en c2607en = this.f38882a;
        String a4 = c2607en.f38937a.a();
        if (a4 != null) {
        }
        String a5 = c2607en.f38938b.a();
        if (a5 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a5);
        }
        return hashMap;
    }
}
