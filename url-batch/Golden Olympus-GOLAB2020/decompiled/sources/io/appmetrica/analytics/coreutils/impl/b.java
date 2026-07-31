package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36981c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i4) {
        super(0);
        this.f36979a = context;
        this.f36980b = str;
        this.f36981c = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f36979a.getPackageManager().getApplicationInfo(this.f36980b, this.f36981c);
    }
}
