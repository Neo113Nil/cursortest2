package com.squareup.cash.wallet.views;

import androidx.compose.runtime.State;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.profile.devicemanager.presenters.DataLoadingState;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LocalizationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardAppletTileKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ CardAppletTileKt$$ExternalSyntheticLambda1(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Long l;
        int i = this.$r8$classId;
        State state = this.f$0;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Number) state.getValue()).floatValue() > RecyclerView.DECELERATION_RATE);
            case 1:
                LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) state.getValue();
                return Boolean.valueOf(languageDisclosure != null ? Intrinsics.areEqual(languageDisclosure.accepted, Boolean.TRUE) : false);
            case 2:
                Money money = (Money) state.getValue();
                if (money != null && (l = money.amount) != null && l.longValue() >= 500) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 3:
                return (DataLoadingState) state.getValue();
            case 4:
                return (String) state.getValue();
            case 5:
                return (String) state.getValue();
            case 6:
                Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool = (Boolean) state.getValue();
                bool.booleanValue();
                return bool;
            case 7:
                return Boolean.valueOf(!CoreInteractiveCardKt.InteractiveCardEffect$lambda$20(state));
            case 8:
                Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool2 = (Boolean) state.getValue();
                bool2.getClass();
                return bool2;
            case 9:
                Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                Boolean bool3 = (Boolean) state.getValue();
                bool3.booleanValue();
                return bool3;
            case 10:
                int i2 = HeroCardViewKt.$r8$clinit;
                Boolean bool4 = (Boolean) state.getValue();
                bool4.booleanValue();
                return bool4;
            case 11:
                int i3 = HeroCardViewKt.$r8$clinit;
                Boolean bool5 = (Boolean) state.getValue();
                bool5.booleanValue();
                return bool5;
            case 12:
                Boolean bool6 = (Boolean) state.getValue();
                bool6.booleanValue();
                return bool6;
            default:
                return Float.valueOf(((Number) state.getValue()).floatValue());
        }
    }
}
