package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gn1;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fn1<V extends View & gn1> extends kg2<V, String> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mp1 f25875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn1(@NotNull V ratingView, @NotNull mp1 reporter) {
        super(ratingView);
        Intrinsics.checkNotNullParameter(ratingView, "ratingView");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f25875c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRating(0.0f);
        super.a(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.kg2
    public final void b(View view, String str) {
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            ((gn1) view).setRating(kotlin.ranges.g.c(Float.parseFloat(value), 0.0f));
        } catch (NumberFormatException e4) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{value}, 1)), "format(...)");
            Object[] args = new Object[0];
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            this.f25875c.reportError("Could not parse rating value", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(View view, String str) {
        String value = str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(value, "value");
        return true;
    }
}
