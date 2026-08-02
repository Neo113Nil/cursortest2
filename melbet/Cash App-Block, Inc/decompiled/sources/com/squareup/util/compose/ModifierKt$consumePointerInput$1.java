package com.squareup.util.compose;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.squareup.cash.arcade.components.ToastKt$Toast$12$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class ModifierKt$consumePointerInput$1 implements PointerInputEventHandler {
    public final /* synthetic */ boolean $enabled;

    public ModifierKt$consumePointerInput$1(boolean z) {
        this.$enabled = z;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object awaitEachGesture;
        return (this.$enabled && (awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new ToastKt$Toast$12$1$1.AnonymousClass1(2, null, 4), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? awaitEachGesture : Unit.INSTANCE;
    }
}
