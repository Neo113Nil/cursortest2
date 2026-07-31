package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zy implements vy {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f35817a;

    public zy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35817a = context;
    }

    @Override // com.yandex.mobile.ads.impl.vy
    @NotNull
    public final C2276uf<?> a() {
        CharSequence text = this.f35817a.getResources().getText(R.string.monetization_ads_internal_instream_call_to_action);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new C2276uf<>("call_to_action", "string", text, null, true, true);
    }
}
