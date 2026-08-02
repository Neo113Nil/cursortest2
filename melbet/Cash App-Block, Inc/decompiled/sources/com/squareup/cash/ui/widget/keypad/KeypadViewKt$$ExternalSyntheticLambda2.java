package com.squareup.cash.ui.widget.keypad;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.room.util.RelationUtil;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final /* synthetic */ class KeypadViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ KeypadViewModel.KeypadKey f$0;
    public final /* synthetic */ KeypadViewModel f$1;
    public final /* synthetic */ RealHapticVibrator f$2;
    public final /* synthetic */ Haptics f$3;
    public final /* synthetic */ PlatformHapticFeedback f$4;
    public final /* synthetic */ CoroutineScope f$5;
    public final /* synthetic */ MutableState f$6;

    public /* synthetic */ KeypadViewKt$$ExternalSyntheticLambda2(KeypadViewModel.KeypadKey keypadKey, KeypadViewModel keypadViewModel, RealHapticVibrator realHapticVibrator, Haptics haptics, PlatformHapticFeedback platformHapticFeedback, CoroutineScope coroutineScope, MutableState mutableState) {
        this.f$0 = keypadKey;
        this.f$1 = keypadViewModel;
        this.f$2 = realHapticVibrator;
        this.f$3 = haptics;
        this.f$4 = platformHapticFeedback;
        this.f$5 = coroutineScope;
        this.f$6 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                KeypadViewModel.KeypadKey keypadKey = this.f$0;
                boolean isClear = keypadKey.isClear();
                KeypadViewModel keypadViewModel = this.f$1;
                if (isClear) {
                    keypadViewModel.onClear.invoke();
                }
                RelationUtil.KeypadView_ww6aTOc$lambda$3$0$0$0$handleClick(keypadKey, keypadViewModel, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                break;
            default:
                RelationUtil.KeypadView_ww6aTOc$lambda$3$0$0$0$handleClick(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                break;
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ KeypadViewKt$$ExternalSyntheticLambda2(KeypadViewModel keypadViewModel, RealHapticVibrator realHapticVibrator, Haptics haptics, PlatformHapticFeedback platformHapticFeedback, KeypadViewModel.KeypadKey keypadKey, CoroutineScope coroutineScope, MutableState mutableState) {
        this.f$1 = keypadViewModel;
        this.f$2 = realHapticVibrator;
        this.f$3 = haptics;
        this.f$4 = platformHapticFeedback;
        this.f$0 = keypadKey;
        this.f$5 = coroutineScope;
        this.f$6 = mutableState;
    }
}
