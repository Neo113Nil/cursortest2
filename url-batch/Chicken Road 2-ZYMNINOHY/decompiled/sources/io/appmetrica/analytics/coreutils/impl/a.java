package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f9692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i4) {
        super(0);
        this.f9691a = context;
        this.f9692b = componentName;
        this.f9693c = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return this.f9691a.getPackageManager().getActivityInfo(this.f9692b, this.f9693c);
    }
}
