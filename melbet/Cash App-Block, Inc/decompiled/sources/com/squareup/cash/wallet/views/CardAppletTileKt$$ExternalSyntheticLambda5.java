package com.squareup.cash.wallet.views;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardAppletTileKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;
    public final /* synthetic */ State f$1;
    public final /* synthetic */ State f$2;

    public /* synthetic */ CardAppletTileKt$$ExternalSyntheticLambda5(State state, State state2, State state3, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
        this.f$1 = state2;
        this.f$2 = state3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$2;
        State state2 = this.f$1;
        State state3 = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setAlpha(((Number) state2.getValue()).floatValue() * ((Number) state3.getValue()).floatValue() * (state != null ? ((Number) state.getValue()).floatValue() : 1.0f));
                break;
            case 1:
                reusableGraphicsLayerScope.setAlpha(((Number) state3.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleX(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) state2.getValue()).floatValue());
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(ColorKt.TransformOrigin(0.5f, 1.0f));
                reusableGraphicsLayerScope.setTranslationY(reusableGraphicsLayerScope.graphicsDensity.getDensity() * ((Dp) state.getValue()).value);
                break;
            default:
                reusableGraphicsLayerScope.setAlpha(((Number) state2.getValue()).floatValue() * ((Number) state3.getValue()).floatValue() * (state != null ? ((Number) state.getValue()).floatValue() : 1.0f));
                break;
        }
        return Unit.INSTANCE;
    }
}
