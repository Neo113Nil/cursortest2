package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class e extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i4) {
        super(0);
        this.f36986a = context;
        this.f36987b = str;
        this.f36988c = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f36986a.getPackageManager().getPackageInfo(this.f36987b, this.f36988c);
    }
}
