package com.yandex.div.core.view2.divs;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX WARN: Incorrect field signature: TT; */
@Metadata
/* loaded from: classes2.dex */
final class TextViewExtensionsKt$observeTextColor$1 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ TextView $this_observeTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    TextViewExtensionsKt$observeTextColor$1(TextView textView) {
        super(1);
        this.$this_observeTextColor = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4) {
        this.$this_observeTextColor.setTextColor(i4);
    }
}
