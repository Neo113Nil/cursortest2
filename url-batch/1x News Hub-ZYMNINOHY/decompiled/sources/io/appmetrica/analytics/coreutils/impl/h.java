package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i3) {
        super(0);
        this.f5455a = context;
        this.f5456b = intent;
        this.f5457c = i3;
    }

    @Override // l2.a
    public final Object invoke() {
        return this.f5455a.getPackageManager().resolveActivity(this.f5456b, this.f5457c);
    }
}
