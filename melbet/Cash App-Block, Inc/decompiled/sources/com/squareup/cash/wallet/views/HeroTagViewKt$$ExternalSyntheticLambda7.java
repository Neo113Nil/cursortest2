package com.squareup.cash.wallet.views;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroTagViewKt$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ HeroTagViewKt$$ExternalSyntheticLambda7(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                MiniCardScene miniCardScene = (MiniCardScene) obj;
                miniCardScene.getClass();
                mutableState.setValue(miniCardScene);
                break;
            case 1:
                CardModelView cardModelView = (CardModelView) obj;
                cardModelView.getClass();
                mutableState.setValue(cardModelView);
                break;
            case 2:
                CardScene cardScene = (CardScene) obj;
                cardScene.getClass();
                mutableState.setValue(cardScene);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 4:
                WandScene wandScene = (WandScene) obj;
                wandScene.getClass();
                mutableState.setValue(wandScene);
                break;
            case 5:
                HeartScene heartScene = (HeartScene) obj;
                heartScene.getClass();
                mutableState.setValue(heartScene);
                break;
            case 6:
                LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) obj;
                lifecycleResumePauseEffectScope.getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 7:
                CardModelView cardModelView2 = (CardModelView) obj;
                cardModelView2.getClass();
                mutableState.setValue(cardModelView2);
                break;
            case 8:
                mutableState.setValue((CardSchemeViewModel.Module.HeroTag) obj);
                break;
            case 9:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(new IntSize(layoutCoordinates.mo838getSizeYbymL2g()));
                break;
            case 10:
                ClockInOverlayViewEvent clockInOverlayViewEvent = (ClockInOverlayViewEvent) obj;
                clockInOverlayViewEvent.getClass();
                ((Function1) mutableState.getValue()).invoke(clockInOverlayViewEvent);
                break;
            case 11:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                break;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
            case 14:
                ((DisposableEffectScope) obj).getClass();
                break;
            case 15:
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                mutableState.setValue(Boolean.valueOf(focusStateImpl.isFocused()));
                break;
            case 16:
                FocusStateImpl focusStateImpl2 = (FocusStateImpl) obj;
                focusStateImpl2.getClass();
                mutableState.setValue(Boolean.valueOf(focusStateImpl2.isFocused()));
                break;
            case 17:
                ((LayoutCoordinates) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                ((LayoutCoordinates) obj).getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
