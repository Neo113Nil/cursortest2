package com.yandex.div.core.view2;

import com.yandex.div.DivDataTag;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivVisibilityActionDispatcher$reset$1$1 extends s implements Function1<CompositeLogId, Boolean> {
    final /* synthetic */ DivDataTag $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVisibilityActionDispatcher$reset$1$1(DivDataTag divDataTag) {
        super(1);
        this.$tag = divDataTag;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull CompositeLogId compositeLogId) {
        Intrinsics.checkNotNullParameter(compositeLogId, "compositeLogId");
        return Boolean.valueOf(Intrinsics.areEqual(compositeLogId.getDataTag(), this.$tag.getId()));
    }
}
