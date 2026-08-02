package com.squareup.cash.ui.widget.keypad;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.room.util.RelationUtil;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final /* synthetic */ class KeypadViewKt$KeypadView$1$1$1$1$2$1 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ PlatformHapticFeedback $hapticFeedback;
    public final /* synthetic */ Haptics $haptics;
    public final /* synthetic */ KeypadViewModel.KeypadKey $key;
    public final /* synthetic */ MutableState $keyClicked$delegate;
    public final /* synthetic */ KeypadViewModel $model;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ CoroutineScope $scope;
    public final /* synthetic */ RealHapticVibrator $vibrator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeypadViewKt$KeypadView$1$1$1$1$2$1(KeypadViewModel.KeypadKey keypadKey, KeypadViewModel keypadViewModel, RealHapticVibrator realHapticVibrator, Haptics haptics, PlatformHapticFeedback platformHapticFeedback, CoroutineScope coroutineScope, MutableState mutableState) {
        super(0, ArrayIteratorKt.class, "handleLongClick", "KeypadView_ww6aTOc$lambda$3$0$0$0$handleLongClick(Lcom/squareup/cash/ui/widget/keypad/KeypadViewModel$KeypadKey;Lcom/squareup/cash/ui/widget/keypad/KeypadViewModel;Lcom/squareup/cash/arcade/components/haptic/HapticVibrator;Lcom/squareup/cash/arcade/Haptics;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;J)V", 0);
        this.$key = keypadKey;
        this.$model = keypadViewModel;
        this.$vibrator = realHapticVibrator;
        this.$haptics = haptics;
        this.$hapticFeedback = platformHapticFeedback;
        this.$scope = coroutineScope;
        this.$keyClicked$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                KeypadViewModel.KeypadKey keypadKey = this.$key;
                boolean isClear = keypadKey.isClear();
                KeypadViewModel keypadViewModel = this.$model;
                if (isClear) {
                    keypadViewModel.onClear.invoke();
                }
                RelationUtil.KeypadView_ww6aTOc$lambda$3$0$0$0$handleClick(keypadKey, keypadViewModel, this.$vibrator, this.$haptics, this.$hapticFeedback, this.$scope, this.$keyClicked$delegate);
                break;
            default:
                RelationUtil.KeypadView_ww6aTOc$lambda$3$0$0$0$handleClick(this.$key, this.$model, this.$vibrator, this.$haptics, this.$hapticFeedback, this.$scope, this.$keyClicked$delegate);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeypadViewKt$KeypadView$1$1$1$1$2$1(KeypadViewModel keypadViewModel, RealHapticVibrator realHapticVibrator, Haptics haptics, PlatformHapticFeedback platformHapticFeedback, KeypadViewModel.KeypadKey keypadKey, CoroutineScope coroutineScope, MutableState mutableState) {
        super(0, ArrayIteratorKt.class, "handleClick", "KeypadView_ww6aTOc$lambda$3$0$0$0$handleClick(Lcom/squareup/cash/ui/widget/keypad/KeypadViewModel;Lcom/squareup/cash/arcade/components/haptic/HapticVibrator;Lcom/squareup/cash/arcade/Haptics;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Lcom/squareup/cash/ui/widget/keypad/KeypadViewModel$KeypadKey;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;J)V", 0);
        this.$model = keypadViewModel;
        this.$vibrator = realHapticVibrator;
        this.$haptics = haptics;
        this.$hapticFeedback = platformHapticFeedback;
        this.$key = keypadKey;
        this.$scope = coroutineScope;
        this.$keyClicked$delegate = mutableState;
    }
}
