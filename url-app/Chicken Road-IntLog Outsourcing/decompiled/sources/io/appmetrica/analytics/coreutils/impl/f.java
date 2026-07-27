package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f6216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i2) {
        super(0);
        this.f6215a = context;
        this.f6216b = componentName;
        this.f6217c = i2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        return this.f6215a.getPackageManager().getServiceInfo(this.f6216b, this.f6217c);
    }
}
