package com.yandex.div.core.view2;

import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivPlaceholderLoader$enqueueDecoding$future$1 extends s implements Function1<ImageRepresentation, Unit> {
    final /* synthetic */ LoadableImage $loadableImage;
    final /* synthetic */ Function1<ImageRepresentation, Unit> $onDecoded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivPlaceholderLoader$enqueueDecoding$future$1(Function1<? super ImageRepresentation, Unit> function1, LoadableImage loadableImage) {
        super(1);
        this.$onDecoded = function1;
        this.$loadableImage = loadableImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ImageRepresentation) obj);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable ImageRepresentation imageRepresentation) {
        this.$onDecoded.invoke(imageRepresentation);
        this.$loadableImage.cleanLoadingTask();
    }
}
