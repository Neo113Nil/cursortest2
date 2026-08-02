package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f9705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i4) {
        super(0);
        this.f9704a = context;
        this.f9705b = componentName;
        this.f9706c = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return this.f9704a.getPackageManager().getServiceInfo(this.f9705b, this.f9706c);
    }
}
