package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.ProduceStateScope;
import com.squareup.cash.graphics.views.effect.LightSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final /* synthetic */ class CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProduceStateScope f$0;

    public /* synthetic */ CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0(ProduceStateScope produceStateScope, int i) {
        this.$r8$classId = i;
        this.f$0 = produceStateScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ProduceStateScope produceStateScope = this.f$0;
        switch (i) {
            case 0:
                produceStateScope.setValue(((Animatable) obj).getValue());
                break;
            case 1:
                LightSource lightSource = (LightSource) obj;
                lightSource.getClass();
                produceStateScope.setValue(lightSource);
                break;
            case 2:
                produceStateScope.setValue(((Animatable) obj).getValue());
                break;
            default:
                produceStateScope.setValue(((Animatable) obj).getValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
