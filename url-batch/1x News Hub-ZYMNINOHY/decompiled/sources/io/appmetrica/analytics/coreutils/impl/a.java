package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f5438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i3) {
        super(0);
        this.f5437a = context;
        this.f5438b = componentName;
        this.f5439c = i3;
    }

    @Override // l2.a
    public final Object invoke() {
        return this.f5437a.getPackageManager().getActivityInfo(this.f5438b, this.f5439c);
    }
}
