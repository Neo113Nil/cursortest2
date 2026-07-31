package com.yandex.div.core.view2.animations;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class UtilsKt$asTouchListener$1 extends s implements Function2<View, MotionEvent, Unit> {
    final /* synthetic */ Animation $directAnimation;
    final /* synthetic */ Animation $reverseAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UtilsKt$asTouchListener$1(Animation animation, Animation animation2) {
        super(2);
        this.$directAnimation = animation;
        this.$reverseAnimation = animation2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (MotionEvent) obj2);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull View v4, @NotNull MotionEvent event) {
        Animation animation;
        Intrinsics.checkNotNullParameter(v4, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        if (v4.isEnabled() && v4.isClickable() && v4.hasOnClickListeners()) {
            int action = event.getAction();
            if (action == 0) {
                Animation animation2 = this.$directAnimation;
                if (animation2 != null) {
                    v4.startAnimation(animation2);
                    return;
                }
                return;
            }
            if ((action == 1 || action == 3) && (animation = this.$reverseAnimation) != null) {
                v4.startAnimation(animation);
            }
        }
    }
}
