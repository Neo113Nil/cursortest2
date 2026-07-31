package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g00 implements vy {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f25958a;

    public g00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25958a = context;
    }

    @Override // com.yandex.mobile.ads.impl.vy
    @NotNull
    public final C2276uf<?> a() {
        CharSequence text = this.f25958a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_default);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new C2276uf<>("sponsored", "string", text, null, false, true);
    }
}
