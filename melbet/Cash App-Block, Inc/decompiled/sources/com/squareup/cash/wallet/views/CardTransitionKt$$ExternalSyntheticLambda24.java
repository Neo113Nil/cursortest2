package com.squareup.cash.wallet.views;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda24 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ State f$1;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda24(float f, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$1;
        float f = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setTranslationY(((Number) state.getValue()).floatValue() * f);
                reusableGraphicsLayerScope.setAlpha(1.0f - ((Number) state.getValue()).floatValue());
                break;
            case 1:
                reusableGraphicsLayerScope.setTranslationY(-f);
                reusableGraphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
                break;
            case 2:
                reusableGraphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleX(f);
                reusableGraphicsLayerScope.setScaleY(f);
                break;
            default:
                reusableGraphicsLayerScope.setTranslationX(((Number) state.getValue()).floatValue() * f);
                break;
        }
        return Unit.INSTANCE;
    }
}
