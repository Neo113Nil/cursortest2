package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda15 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda15(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                return Boolean.valueOf(((State) mutableState.getValue()) != null);
            case 2:
                float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                return ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).animation;
            case 3:
                float[] fArr3 = Hero3DCardViewKt.X_AXIS;
                return (CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue();
            case 4:
                float[] fArr4 = Hero3DCardViewKt.X_AXIS;
                return (Quat) mutableState.getValue();
            case 5:
                float[] fArr5 = Hero3DCardViewKt.X_AXIS;
                CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).cardInteraction;
                if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1.onCardSettled(true);
                }
                return Unit.INSTANCE;
            case 6:
                float[] fArr6 = Hero3DCardViewKt.X_AXIS;
                return (Quat) mutableState.getValue();
            case 7:
                float[] fArr7 = Hero3DCardViewKt.X_AXIS;
                return Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue());
            case 8:
                float[] fArr8 = Hero3DCardViewKt.X_AXIS;
                Boolean bool = (Boolean) mutableState.getValue();
                bool.booleanValue();
                return bool;
            case 9:
                float[] fArr9 = Hero3DCardViewKt.X_AXIS;
                return (CardModelView) mutableState.getValue();
            case 10:
                float[] fArr10 = Hero3DCardViewKt.X_AXIS;
                Boolean bool2 = (Boolean) mutableState.getValue();
                bool2.booleanValue();
                return bool2;
            case 11:
                float[] fArr11 = Hero3DCardViewKt.X_AXIS;
                return (CardModelView) mutableState.getValue();
            case 12:
                float[] fArr12 = Hero3DCardViewKt.X_AXIS;
                Boolean bool3 = (Boolean) ((InteractiveCardState) mutableState.getValue()).flipToBack$delegate.getValue();
                bool3.booleanValue();
                return bool3;
            case 13:
                float[] fArr13 = Hero3DCardViewKt.X_AXIS;
                Boolean bool4 = (Boolean) ((InteractiveCardState) mutableState.getValue()).flipToFront$delegate.getValue();
                bool4.booleanValue();
                return bool4;
            case 14:
                float[] fArr14 = Hero3DCardViewKt.X_AXIS;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue();
                if (heroCardDetails != null) {
                    return heroCardDetails.customizationImage;
                }
                return null;
            case 15:
                float[] fArr15 = Hero3DCardViewKt.X_AXIS;
                Boolean bool5 = (Boolean) mutableState.getValue();
                bool5.getClass();
                return bool5;
            case 16:
                int i2 = HeroCardViewKt.$r8$clinit;
                return (InteractiveCardState) mutableState.getValue();
            case 17:
                int i3 = HeroCardViewKt.$r8$clinit;
                return (CardModelView) mutableState.getValue();
            case 18:
                int i4 = HeroCardViewKt.$r8$clinit;
                return (CardScene) mutableState.getValue();
            case 19:
                Boolean bool6 = (Boolean) mutableState.getValue();
                bool6.booleanValue();
                return bool6;
            case 20:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 21:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 22:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 23:
                return (List) mutableState.getValue();
            case 24:
                Boolean bool7 = (Boolean) mutableState.getValue();
                bool7.getClass();
                return bool7;
            case 25:
                return Boolean.valueOf(((State) mutableState.getValue()) != null);
            case 26:
                return (CardModelView) mutableState.getValue();
            case 27:
                return Boolean.valueOf(((State) mutableState.getValue()) != null);
            case 28:
                Boolean bool8 = (Boolean) mutableState.getValue();
                bool8.booleanValue();
                return bool8;
            default:
                return Boolean.valueOf(((State) mutableState.getValue()) != null);
        }
    }
}
