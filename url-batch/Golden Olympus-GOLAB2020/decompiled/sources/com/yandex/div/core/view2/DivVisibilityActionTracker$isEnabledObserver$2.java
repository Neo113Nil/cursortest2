package com.yandex.div.core.view2;

import O1.M4;
import O1.Wf;
import O1.Xb;
import O1.Z;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import h2.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivVisibilityActionTracker$isEnabledObserver$2 extends s implements p {
    final /* synthetic */ DivVisibilityActionTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVisibilityActionTracker$isEnabledObserver$2(DivVisibilityActionTracker divVisibilityActionTracker) {
        super(5);
        this.this$0 = divVisibilityActionTracker;
    }

    @Override // h2.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke((Div2View) obj, (ExpressionResolver) obj2, (View) obj3, (Z) obj4, (Xb) obj5);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Div2View scope, @NotNull ExpressionResolver resolver, @NotNull View view, @NotNull Z z4, @NotNull Xb action) {
        DivVisibilityTokenHolder divVisibilityTokenHolder;
        DivVisibilityTokenHolder divVisibilityTokenHolder2;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 2>");
        Intrinsics.checkNotNullParameter(z4, "<anonymous parameter 3>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof Wf) {
            DivVisibilityActionTracker divVisibilityActionTracker = this.this$0;
            divVisibilityTokenHolder2 = divVisibilityActionTracker.appearTrackedTokens;
            divVisibilityActionTracker.shouldTrackVisibilityAction(scope, resolver, null, action, 0, divVisibilityTokenHolder2);
        } else if (action instanceof M4) {
            DivVisibilityActionTracker divVisibilityActionTracker2 = this.this$0;
            divVisibilityTokenHolder = divVisibilityActionTracker2.disappearTrackedTokens;
            divVisibilityActionTracker2.shouldTrackVisibilityAction(scope, resolver, null, action, 0, divVisibilityTokenHolder);
        }
    }
}
