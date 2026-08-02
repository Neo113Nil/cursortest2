package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import b2.C0195i;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f5464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i3, int i4) {
        super(0);
        this.f5463a = context;
        this.f5464b = componentName;
        this.f5465c = i3;
        this.f5466d = i4;
    }

    @Override // l2.a
    public final Object invoke() {
        this.f5463a.getPackageManager().setComponentEnabledSetting(this.f5464b, this.f5465c, this.f5466d);
        return C0195i.f2555a;
    }
}
