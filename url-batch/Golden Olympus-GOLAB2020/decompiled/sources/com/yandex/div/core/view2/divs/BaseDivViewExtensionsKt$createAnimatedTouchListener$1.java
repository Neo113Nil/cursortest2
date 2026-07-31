package com.yandex.div.core.view2.divs;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class BaseDivViewExtensionsKt$createAnimatedTouchListener$1 extends s implements Function2<View, MotionEvent, Boolean> {
    final /* synthetic */ Function2<View, MotionEvent, Unit> $animations;
    final /* synthetic */ GestureDetector $gestureDetector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BaseDivViewExtensionsKt$createAnimatedTouchListener$1(Function2<? super View, ? super MotionEvent, Unit> function2, GestureDetector gestureDetector) {
        super(2);
        this.$animations = function2;
        this.$gestureDetector = gestureDetector;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull View v4, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(v4, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        Function2<View, MotionEvent, Unit> function2 = this.$animations;
        if (function2 != null) {
            function2.invoke(v4, event);
        }
        GestureDetector gestureDetector = this.$gestureDetector;
        return Boolean.valueOf(gestureDetector != null ? gestureDetector.onTouchEvent(event) : false);
    }
}
