package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import com.yandex.mobile.ads.impl.ew1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ch1 extends AbstractC2372yj<lc1> {

    /* renamed from: w, reason: collision with root package name */
    private static final int f24215w = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch1(@NotNull Context context, @NotNull String url, @NotNull AbstractC2372yj.a<lc1> listener) {
        super(context, url, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a(context);
        r();
        s();
    }

    @Override // com.yandex.mobile.ads.impl.op1
    @NotNull
    protected final qq1<lc1> a(@NotNull lc1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        qq1<lc1> a4 = qq1.a(response, ch0.a(response));
        Intrinsics.checkNotNullExpressionValue(a4, "success(...)");
        return a4;
    }

    private final void a(Context context) {
        Integer J3;
        Integer T3;
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        int intValue = (a4 == null || (T3 = a4.T()) == null) ? f24215w : T3.intValue();
        Intrinsics.checkNotNullParameter(context, "context");
        du1 a5 = ew1.a.a().a(context);
        a(new b00(1.0f, intValue, (a5 == null || (J3 = a5.J()) == null) ? 0 : J3.intValue()));
    }
}
