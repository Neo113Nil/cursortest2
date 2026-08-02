package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardLockViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Animatable f$0;

    public /* synthetic */ CardLockViewKt$$ExternalSyntheticLambda1(Animatable animatable, int i) {
        this.$r8$classId = i;
        this.f$0 = animatable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float floatValue;
        int i = this.$r8$classId;
        Animatable animatable = this.f$0;
        switch (i) {
            case 0:
                floatValue = ((Number) animatable.getValue()).floatValue();
                break;
            case 1:
                floatValue = ((Number) animatable.getValue()).floatValue();
                break;
            case 2:
                return Boolean.valueOf(((Number) animatable.getValue()).floatValue() < 0.5f);
            case 3:
                floatValue = ((Number) animatable.getValue()).floatValue();
                break;
            case 4:
                floatValue = ((Number) animatable.getValue()).floatValue();
                break;
            default:
                floatValue = ((Number) animatable.getValue()).floatValue();
                break;
        }
        return Float.valueOf(floatValue);
    }
}
