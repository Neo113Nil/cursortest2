package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i3) {
        super(0);
        this.f5447a = context;
        this.f5448b = str;
        this.f5449c = i3;
    }

    @Override // l2.a
    public final Object invoke() {
        return this.f5447a.getPackageManager().getPackageInfo(this.f5448b, this.f5449c);
    }
}
