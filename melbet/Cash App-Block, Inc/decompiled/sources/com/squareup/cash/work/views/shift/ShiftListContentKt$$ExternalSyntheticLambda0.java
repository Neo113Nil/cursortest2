package com.squareup.cash.work.views.shift;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftListContentKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImmutableList f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ShiftListContentKt$$ExternalSyntheticLambda0(ImmutableList immutableList, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = immutableList;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        ImmutableList immutableList = this.f$0;
        LazyListScope lazyListScope = (LazyListScope) obj;
        switch (i) {
            case 0:
                lazyListScope.getClass();
                lazyListScope.items(immutableList.size(), new OverridingUtil.AnonymousClass7(8, new StripePaymentController$$ExternalSyntheticLambda1(20), immutableList), new OverridingUtil.AnonymousClass7(9, new StripePaymentController$$ExternalSyntheticLambda1(21), immutableList), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(0, function1, immutableList), true, 802480018));
                break;
            default:
                lazyListScope.getClass();
                lazyListScope.items(immutableList.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(immutableList, 9), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(7, function1, immutableList), true, 802480018));
                break;
        }
        return Unit.INSTANCE;
    }
}
