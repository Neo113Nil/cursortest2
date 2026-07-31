package com.yandex.div.internal.widget;

import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TransientViewMixin$invalidateView$$inlined$filterIsInstance$1 extends s implements Function1<Object, Boolean> {
    public static final TransientViewMixin$invalidateView$$inlined$filterIsInstance$1 INSTANCE = new TransientViewMixin$invalidateView$$inlined$filterIsInstance$1();

    public TransientViewMixin$invalidateView$$inlined$filterIsInstance$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@Nullable Object obj) {
        return Boolean.valueOf(obj instanceof DivBorderSupports);
    }
}
