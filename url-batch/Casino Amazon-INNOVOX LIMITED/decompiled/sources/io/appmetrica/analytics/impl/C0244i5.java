package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0244i5 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0244i5 f1301a = new C0244i5();

    public C0244i5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
