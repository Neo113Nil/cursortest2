package com.yandex.div.core.view2.divs;

import android.text.Spanned;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$applyRichText$1 extends s implements Function1<Spanned, Unit> {
    final /* synthetic */ TextView $this_applyRichText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$applyRichText$1(TextView textView) {
        super(1);
        this.$this_applyRichText = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Spanned) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Spanned spannedText) {
        Intrinsics.checkNotNullParameter(spannedText, "spannedText");
        this.$this_applyRichText.setText(spannedText, TextView.BufferType.NORMAL);
    }
}
