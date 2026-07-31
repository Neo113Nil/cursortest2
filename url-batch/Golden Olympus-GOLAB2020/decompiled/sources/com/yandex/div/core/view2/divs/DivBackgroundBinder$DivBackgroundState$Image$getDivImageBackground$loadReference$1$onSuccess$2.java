package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import com.yandex.div.internal.drawable.ScalingDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2 extends s implements Function1<Bitmap, Unit> {
    final /* synthetic */ ScalingDrawable $scaleDrawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2(ScalingDrawable scalingDrawable) {
        super(1);
        this.$scaleDrawable = scalingDrawable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$scaleDrawable.setBitmap(it);
    }
}
