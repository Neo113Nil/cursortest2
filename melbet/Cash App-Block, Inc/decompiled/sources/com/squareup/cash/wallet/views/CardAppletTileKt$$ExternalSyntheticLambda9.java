package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.geometry.Offset;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTileKt$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ CardAppletTileKt$$ExternalSyntheticLambda9(int i, MutableState mutableState) {
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
                return ((IssuedCardFactory.IssuedCard) mutableState.getValue()).getPan();
            case 2:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                return (CardRegistry$CardTransition$TransitionType) mutableState.getValue();
            case 3:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CardTransitionKt.LocalCardRegistry;
                return (Offset) mutableState.getValue();
            case 4:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue();
                if (heroCardDetails != null && heroCardDetails.isEnabled) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 5:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue();
                if (heroCardDetails2 != null && heroCardDetails2.isLocked) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 6:
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool = (Boolean) mutableState.getValue();
                bool.booleanValue();
                return bool;
            case 7:
                Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails3 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue();
                if (heroCardDetails3 != null) {
                    return heroCardDetails3.customizationImage;
                }
                return null;
            case 8:
                Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return Boolean.valueOf(((State) mutableState.getValue()) != null);
            case 9:
                Quat quat4 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).animation;
            case 10:
                Quat quat5 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool2 = (Boolean) mutableState.getValue();
                bool2.booleanValue();
                return bool2;
            case 11:
                Quat quat6 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).animation;
            case 12:
                Quat quat7 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return Boolean.valueOf(((State) mutableState.getValue()) != null);
            case 13:
                Quat quat8 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return (CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue();
            case 14:
                Quat quat9 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return (Quat) mutableState.getValue();
            case 15:
                Quat quat10 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).cardInteraction;
                if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1.onCardSettled(true);
                }
                return Unit.INSTANCE;
            case 16:
                Quat quat11 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return (Quat) mutableState.getValue();
            case 17:
                Quat quat12 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                return (State) mutableState.getValue();
            case 18:
                Quat quat13 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails4 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue();
                if (heroCardDetails4 != null) {
                    return heroCardDetails4.customizationImage;
                }
                return null;
            case 19:
                Quat quat14 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool3 = (Boolean) mutableState.getValue();
                bool3.booleanValue();
                return bool3;
            case 20:
                Quat quat15 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool4 = (Boolean) ((InteractiveCardState) mutableState.getValue()).flipToBack$delegate.getValue();
                bool4.booleanValue();
                return bool4;
            case 21:
                Quat quat16 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool5 = (Boolean) ((InteractiveCardState) mutableState.getValue()).flipToFront$delegate.getValue();
                bool5.booleanValue();
                return bool5;
            case 22:
                Quat quat17 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool6 = (Boolean) mutableState.getValue();
                bool6.booleanValue();
                return bool6;
            case 23:
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                Boolean bool7 = (Boolean) mutableState.getValue();
                bool7.booleanValue();
                return bool7;
            case 24:
                float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                CardModelView cardModelView = (CardModelView) mutableState.getValue();
                if (cardModelView == null) {
                    return null;
                }
                Boolean bool8 = (Boolean) cardModelView._isFacingForward$delegate.getValue();
                bool8.booleanValue();
                return bool8;
            case 25:
                float[] fArr3 = Hero3DCardViewKt.X_AXIS;
                return (CardModelView) mutableState.getValue();
            case 26:
                float[] fArr4 = Hero3DCardViewKt.X_AXIS;
                return (CardModelView) mutableState.getValue();
            case 27:
                float[] fArr5 = Hero3DCardViewKt.X_AXIS;
                return Boolean.valueOf(((State) mutableState.getValue()) != null);
            case 28:
                float[] fArr6 = Hero3DCardViewKt.X_AXIS;
                return ((CardSchemeViewModel.Module.HeroCardDetails) mutableState.getValue()).animation;
            default:
                float[] fArr7 = Hero3DCardViewKt.X_AXIS;
                Boolean bool9 = (Boolean) mutableState.getValue();
                bool9.booleanValue();
                return bool9;
        }
    }
}
