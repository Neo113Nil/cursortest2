package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2312w5 implements nm0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f33926c = R.string.monetization_ads_internal_instream_ad_position;

    /* renamed from: a, reason: collision with root package name */
    private final int f33927a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33928b;

    public C2312w5(int i4, int i5) {
        this.f33927a = i4;
        this.f33928b = i5;
    }

    @Override // com.yandex.mobile.ads.impl.nm0
    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView b4 = uiElements.b();
        if (b4 != null) {
            String string = b4.getContext().getResources().getString(f33926c);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f33927a), Integer.valueOf(this.f33928b)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            b4.setText(format);
        }
    }
}
