package com.squareup.cash.tax.views;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class TaxTooltipView$Content$1$1$1 implements PointerInputEventHandler {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TaxTooltipView$Content$1$1$1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.$onEvent = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        Continuation continuation2 = null;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new ScoreHomeKt$$ExternalSyntheticLambda5(25, function1), continuation, 7);
                if (detectTapGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new SelectionGesturesKt$updateSelectionTouchMode$1$1(function1, continuation2, 0), continuation);
                if (awaitPointerEventScope != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object awaitPointerEventScope2 = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new SelectionGesturesKt$updateSelectionTouchMode$1$1(function1, continuation2, 2), continuation);
                if (awaitPointerEventScope2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object detectTapGestures$default2 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new ViewGroups$$ExternalSyntheticLambda0(14, function1), continuation, 7);
                if (detectTapGestures$default2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
