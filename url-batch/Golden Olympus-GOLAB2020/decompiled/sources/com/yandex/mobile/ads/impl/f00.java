package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f00 implements vy {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f25530a;

    public f00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25530a = context;
    }

    @Override // com.yandex.mobile.ads.impl.vy
    @NotNull
    public final C2276uf<?> a() {
        CharSequence text = this.f25530a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_social);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new C2276uf<>("sponsored", "string", text, null, false, true);
    }
}
