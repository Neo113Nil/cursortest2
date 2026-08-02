package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f5451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i3) {
        super(0);
        this.f5450a = context;
        this.f5451b = componentName;
        this.f5452c = i3;
    }

    @Override // l2.a
    public final Object invoke() {
        return this.f5450a.getPackageManager().getServiceInfo(this.f5451b, this.f5452c);
    }
}
