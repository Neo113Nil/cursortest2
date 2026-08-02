package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import coil3.RealImageLoader$execute$result$1;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.SegmentedCircleInteractableState;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1 implements PointerInputEventHandler {
    public final /* synthetic */ Object $dragScope;
    public final /* synthetic */ Object $indicatorBounce;
    public final /* synthetic */ Object $onIconTap;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $scene;

    public CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1(CoroutineScope coroutineScope, MutableState mutableState, MutableInteractionSourceImpl mutableInteractionSourceImpl, MutableState mutableState2) {
        this.$r8$classId = 1;
        this.$dragScope = coroutineScope;
        this.$scene = mutableState;
        this.$onIconTap = mutableInteractionSourceImpl;
        this.$indicatorBounce = mutableState2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$indicatorBounce;
        Object obj2 = this.$dragScope;
        Object obj3 = this.$onIconTap;
        Object obj4 = this.$scene;
        switch (i) {
            case 0:
                Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2$1((CardScene) obj4, (Function0) obj3, (CoroutineScope) obj2, (Animatable) obj, null), continuation);
                if (awaitEachGesture != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1((CoroutineScope) obj2, (MutableState) obj4, (MutableInteractionSourceImpl) obj3, (Continuation) null);
                DateInputKt$$ExternalSyntheticLambda5 dateInputKt$$ExternalSyntheticLambda5 = new DateInputKt$$ExternalSyntheticLambda5(3, (MutableState) obj);
                CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = TapGestureDetectorKt.NoPressGesture;
                Object coroutineScope = JobKt.coroutineScope(new RealImageLoader$execute$result$1(pointerInputScope, textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, dateInputKt$$ExternalSyntheticLambda5, new PressGestureScopeImpl(pointerInputScope), (Continuation) null, 1), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (coroutineScope != coroutineSingletons) {
                    coroutineScope = Unit.INSTANCE;
                }
                if (coroutineScope != coroutineSingletons) {
                    break;
                }
                break;
            default:
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(ref$BooleanRef, (SegmentedCircleInteractableState) obj4, (Function0) obj3, ref$ObjectRef, pointerInputScope, 12);
                final Function0 function0 = (Function0) obj2;
                final int i2 = 0;
                Function0 function02 = new Function0() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$handlePercentageDrag$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        Function0 function03 = function0;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        switch (i3) {
                            case 0:
                                ref$BooleanRef2.element = false;
                                ref$ObjectRef2.element = null;
                                function03.invoke();
                                break;
                            default:
                                ref$BooleanRef2.element = false;
                                ref$ObjectRef2.element = null;
                                function03.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i3 = 1;
                Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, overlayKt$$ExternalSyntheticLambda3, function02, new Function0() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$handlePercentageDrag$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i32 = i3;
                        Function0 function03 = function0;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        switch (i32) {
                            case 0:
                                ref$BooleanRef2.element = false;
                                ref$ObjectRef2.element = null;
                                function03.invoke();
                                break;
                            default:
                                ref$BooleanRef2.element = false;
                                ref$ObjectRef2.element = null;
                                function03.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(ref$BooleanRef, ref$ObjectRef, pointerInputScope, (Function1) obj, 19), continuation);
                if (detectDragGestures != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1(Object obj, Function0 function0, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.$scene = obj;
        this.$onIconTap = function0;
        this.$dragScope = obj2;
        this.$indicatorBounce = obj3;
    }
}
