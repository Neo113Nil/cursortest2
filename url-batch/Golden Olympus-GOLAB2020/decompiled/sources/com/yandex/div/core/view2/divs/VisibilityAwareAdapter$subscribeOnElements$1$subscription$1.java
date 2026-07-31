package com.yandex.div.core.view2.divs;

import O1.Vf;
import com.yandex.div.internal.core.DivItemBuilderResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VisibilityAwareAdapter$subscribeOnElements$1$subscription$1 extends s implements Function1<Vf, Unit> {
    final /* synthetic */ IndexedValue<DivItemBuilderResult> $item;
    final /* synthetic */ VisibilityAwareAdapter<VH> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VisibilityAwareAdapter$subscribeOnElements$1$subscription$1(VisibilityAwareAdapter<VH> visibilityAwareAdapter, IndexedValue<DivItemBuilderResult> indexedValue) {
        super(1);
        this.this$0 = visibilityAwareAdapter;
        this.$item = indexedValue;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Vf) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Vf it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.updateItemVisibility(this.$item.a(), it);
    }
}
