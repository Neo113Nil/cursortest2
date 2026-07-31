package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class j extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f37000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i4) {
        super(0);
        this.f36999a = context;
        this.f37000b = intent;
        this.f37001c = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f36999a.getPackageManager().resolveService(this.f37000b, this.f37001c);
    }
}
