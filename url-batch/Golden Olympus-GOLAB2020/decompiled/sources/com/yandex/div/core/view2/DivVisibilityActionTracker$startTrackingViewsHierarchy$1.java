package com.yandex.div.core.view2;

import O1.Z;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivVisibilityActionTracker$startTrackingViewsHierarchy$1 extends s implements Function2<View, Z, Boolean> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ DivVisibilityActionTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVisibilityActionTracker$startTrackingViewsHierarchy$1(DivVisibilityActionTracker divVisibilityActionTracker, BindingContext bindingContext) {
        super(2);
        this.this$0 = divVisibilityActionTracker;
        this.$context = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull View currentView, @Nullable Z z4) {
        ViewVisibilityCalculator viewVisibilityCalculator;
        WeakHashMap weakHashMap;
        boolean z5;
        WeakHashMap weakHashMap2;
        Intrinsics.checkNotNullParameter(currentView, "currentView");
        viewVisibilityCalculator = this.this$0.viewVisibilityCalculator;
        boolean isViewFullyVisible = viewVisibilityCalculator.isViewFullyVisible(currentView);
        if (isViewFullyVisible) {
            weakHashMap2 = this.this$0.previousVisibilityIsFull;
            if (Intrinsics.areEqual(weakHashMap2.get(currentView), Boolean.TRUE)) {
                z5 = false;
                return Boolean.valueOf(z5);
            }
        }
        Boolean valueOf = Boolean.valueOf(isViewFullyVisible);
        weakHashMap = this.this$0.previousVisibilityIsFull;
        weakHashMap.put(currentView, valueOf);
        if (z4 != null) {
            DivVisibilityActionTracker divVisibilityActionTracker = this.this$0;
            BindingContext bindingContext = this.$context;
            DivVisibilityActionTracker.trackVisibilityActionsOf$default(divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), currentView, z4, null, null, 48, null);
        }
        z5 = true;
        return Boolean.valueOf(z5);
    }
}
