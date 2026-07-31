package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivImageBinder$applyFiltersAndSetBitmap$1 extends s implements Function1<Bitmap, Unit> {
    final /* synthetic */ DivImageView $this_applyFiltersAndSetBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$applyFiltersAndSetBitmap$1(DivImageView divImageView) {
        super(1);
        this.$this_applyFiltersAndSetBitmap = divImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Bitmap) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$this_applyFiltersAndSetBitmap.setImageBitmap(it);
    }
}
