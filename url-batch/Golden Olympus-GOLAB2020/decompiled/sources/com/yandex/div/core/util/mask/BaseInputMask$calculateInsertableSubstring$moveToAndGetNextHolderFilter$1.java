package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1 extends s implements Function0<Regex> {
    final /* synthetic */ E $index;
    final /* synthetic */ BaseInputMask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1(E e4, BaseInputMask baseInputMask) {
        super(0);
        this.$index = e4;
        this.this$0 = baseInputMask;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Regex invoke() {
        while (this.$index.f41130b < this.this$0.getDestructedValue().size() && !(this.this$0.getDestructedValue().get(this.$index.f41130b) instanceof BaseInputMask.MaskChar.Dynamic)) {
            this.$index.f41130b++;
        }
        Object orNull = CollectionsKt.getOrNull(this.this$0.getDestructedValue(), this.$index.f41130b);
        BaseInputMask.MaskChar.Dynamic dynamic = orNull instanceof BaseInputMask.MaskChar.Dynamic ? (BaseInputMask.MaskChar.Dynamic) orNull : null;
        if (dynamic != null) {
            return dynamic.getFilter();
        }
        return null;
    }
}
