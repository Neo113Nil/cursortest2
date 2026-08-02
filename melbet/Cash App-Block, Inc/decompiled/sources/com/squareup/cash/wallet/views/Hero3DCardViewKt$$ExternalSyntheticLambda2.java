package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class Hero3DCardViewKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Animatable f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ State f$2;

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda2(Animatable animatable, MutableState mutableState, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = animatable;
        this.f$1 = mutableState;
        this.f$2 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        State state = this.f$2;
        MutableState mutableState = this.f$1;
        Animatable animatable = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setTranslationX(reusableGraphicsLayerScope.graphicsDensity.getDensity() * ((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope.setTranslationY(((Number) ((InteractiveCardState) mutableState.getValue()).lockOffset.getValue()).floatValue() * Float.intBitsToFloat((int) (reusableGraphicsLayerScope.size & BodyPartID.bodyIdMax)));
                reusableGraphicsLayerScope.setScaleX(((Number) ((InteractiveCardState) mutableState.getValue()).lockScale.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) ((InteractiveCardState) mutableState.getValue()).lockScale.getValue()).floatValue());
                reusableGraphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
                break;
            default:
                reusableGraphicsLayerScope.setTranslationX(reusableGraphicsLayerScope.graphicsDensity.getDensity() * ((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope.setTranslationY(((Number) ((InteractiveCardState) mutableState.getValue()).lockOffset.getValue()).floatValue() * Float.intBitsToFloat((int) (reusableGraphicsLayerScope.size & BodyPartID.bodyIdMax)));
                reusableGraphicsLayerScope.setScaleX(((Number) ((InteractiveCardState) mutableState.getValue()).lockScale.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) ((InteractiveCardState) mutableState.getValue()).lockScale.getValue()).floatValue());
                reusableGraphicsLayerScope.setAlpha(((Number) state.getValue()).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
