package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f36977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i4) {
        super(0);
        this.f36976a = context;
        this.f36977b = componentName;
        this.f36978c = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f36976a.getPackageManager().getActivityInfo(this.f36977b, this.f36978c);
    }
}
