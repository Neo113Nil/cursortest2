package com.yandex.div.core.view2.divs;

import android.text.Spanned;
import com.yandex.div.internal.widget.EllipsizedTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$applyRichEllipsis$1 extends s implements Function1<Spanned, Unit> {
    final /* synthetic */ EllipsizedTextView $this_applyRichEllipsis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$applyRichEllipsis$1(EllipsizedTextView ellipsizedTextView) {
        super(1);
        this.$this_applyRichEllipsis = ellipsizedTextView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Spanned) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Spanned ellipsis) {
        Intrinsics.checkNotNullParameter(ellipsis, "ellipsis");
        this.$this_applyRichEllipsis.setEllipsis(ellipsis);
    }
}
