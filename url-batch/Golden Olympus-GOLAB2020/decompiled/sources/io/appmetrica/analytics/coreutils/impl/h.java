package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class h extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f36995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Intent intent, int i4) {
        super(0);
        this.f36994a = context;
        this.f36995b = intent;
        this.f36996c = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f36994a.getPackageManager().resolveActivity(this.f36995b, this.f36996c);
    }
}
