package com.yandex.div.core.view2;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.errors.ErrorCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivPlaceholderLoader$applyPlaceholder$1$1 extends s implements Function1<ImageRepresentation, Unit> {
    final /* synthetic */ int $currentPlaceholderColor;
    final /* synthetic */ ErrorCollector $errorCollector;
    final /* synthetic */ Function1<Drawable, Unit> $onSetPlaceholder;
    final /* synthetic */ Function1<ImageRepresentation, Unit> $onSetPreview;
    final /* synthetic */ DivPlaceholderLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivPlaceholderLoader$applyPlaceholder$1$1(ErrorCollector errorCollector, Function1<? super Drawable, Unit> function1, DivPlaceholderLoader divPlaceholderLoader, int i4, Function1<? super ImageRepresentation, Unit> function12) {
        super(1);
        this.$errorCollector = errorCollector;
        this.$onSetPlaceholder = function1;
        this.this$0 = divPlaceholderLoader;
        this.$currentPlaceholderColor = i4;
        this.$onSetPreview = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ImageRepresentation) obj);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable ImageRepresentation imageRepresentation) {
        Div2ImageStubProvider div2ImageStubProvider;
        if (imageRepresentation != null) {
            this.$onSetPreview.invoke(imageRepresentation);
            return;
        }
        this.$errorCollector.logWarning(new Throwable("Preview doesn't contain base64 image"));
        Function1<Drawable, Unit> function1 = this.$onSetPlaceholder;
        div2ImageStubProvider = this.this$0.imageStubProvider;
        function1.invoke(div2ImageStubProvider.getImageStubDrawable(this.$currentPlaceholderColor));
    }
}
