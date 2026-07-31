package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class f extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f36990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i4) {
        super(0);
        this.f36989a = context;
        this.f36990b = componentName;
        this.f36991c = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f36989a.getPackageManager().getServiceInfo(this.f36990b, this.f36991c);
    }
}
