package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import c3.C0297i;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f9718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i4, int i5) {
        super(0);
        this.f9717a = context;
        this.f9718b = componentName;
        this.f9719c = i4;
        this.f9720d = i5;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        this.f9717a.getPackageManager().setComponentEnabledSetting(this.f9718b, this.f9719c, this.f9720d);
        return C0297i.f5732a;
    }
}
