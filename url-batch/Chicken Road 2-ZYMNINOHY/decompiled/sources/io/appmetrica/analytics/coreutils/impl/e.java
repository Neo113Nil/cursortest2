package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i4) {
        super(0);
        this.f9701a = context;
        this.f9702b = str;
        this.f9703c = i4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return this.f9701a.getPackageManager().getPackageInfo(this.f9702b, this.f9703c);
    }
}
