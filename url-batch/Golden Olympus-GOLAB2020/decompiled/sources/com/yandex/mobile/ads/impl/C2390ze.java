package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2390ze extends kotlin.jvm.internal.s implements Function0<IReporter> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2343xd f35571b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f35572c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1806af f35573d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f35574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2390ze(InterfaceC2343xd interfaceC2343xd, Context context, C1806af c1806af, String str) {
        super(0);
        this.f35571b = interfaceC2343xd;
        this.f35572c = context;
        this.f35573d = c1806af;
        this.f35574e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f35571b.a(this.f35572c);
        C1806af c1806af = this.f35573d;
        Context context = this.f35572c;
        String str = this.f35574e;
        c1806af.getClass();
        try {
            ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            AppMetrica.activateReporter(context, build);
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
        return AppMetrica.getReporter(this.f35572c, this.f35574e);
    }
}
