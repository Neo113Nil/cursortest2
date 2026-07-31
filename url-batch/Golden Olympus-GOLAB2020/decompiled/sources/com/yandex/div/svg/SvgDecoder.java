package com.yandex.div.svg;

import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o0.C3276g;
import o0.C3304j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SvgDecoder {
    private final boolean useViewBoundsAsIntrinsicSize;

    public SvgDecoder(boolean z4) {
        this.useViewBoundsAsIntrinsicSize = z4;
    }

    @Nullable
    public final PictureDrawable decode(@NotNull InputStream source) {
        float h4;
        float f4;
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            C3276g l4 = C3276g.l(source);
            Intrinsics.checkNotNullExpressionValue(l4, "getFromInputStream(source)");
            RectF g4 = l4.g();
            if (!this.useViewBoundsAsIntrinsicSize || g4 == null) {
                h4 = l4.h();
                f4 = l4.f();
            } else {
                h4 = g4.width();
                f4 = g4.height();
            }
            if (g4 == null && h4 > 0.0f && f4 > 0.0f) {
                l4.t(0.0f, 0.0f, h4, f4);
            }
            return new PictureDrawable(l4.o());
        } catch (C3304j unused) {
            return null;
        }
    }

    public /* synthetic */ SvgDecoder(boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z4);
    }
}
