package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class k extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f37003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i4, int i5) {
        super(0);
        this.f37002a = context;
        this.f37003b = componentName;
        this.f37004c = i4;
        this.f37005d = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f37002a.getPackageManager().setComponentEnabledSetting(this.f37003b, this.f37004c, this.f37005d);
        return Unit.f41027a;
    }
}
