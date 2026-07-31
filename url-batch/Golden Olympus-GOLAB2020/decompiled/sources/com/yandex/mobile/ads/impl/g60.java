package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.d60;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g60 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f26014a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f26015b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f26016c;

    public g60(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f26014a = adConfiguration;
        this.f26015b = adResponse;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f26016c = applicationContext;
    }

    @NotNull
    public final y60 a() {
        d60 a4 = new d60.b(this.f26016c).a();
        iw0 iw0Var = new iw0(this.f26016c, new hw0());
        Context context = this.f26016c;
        C2286v2 c2286v2 = this.f26014a;
        C2360y7<?> c2360y7 = this.f26015b;
        c2286v2.p().f();
        bf2 bf2Var = new bf2(context, c2286v2, c2360y7, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()), new jc2(c2286v2, c2360y7));
        Intrinsics.checkNotNull(a4);
        return new y60(a4, iw0Var, bf2Var, new fa1(), new lf2());
    }
}
