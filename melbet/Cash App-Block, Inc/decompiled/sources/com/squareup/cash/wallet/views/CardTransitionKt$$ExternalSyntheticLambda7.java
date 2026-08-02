package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardRegistry f$0;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda7(CardRegistry cardRegistry, int i) {
        this.$r8$classId = i;
        this.f$0 = cardRegistry;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r1.getInTransition() == true) goto L9;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Animatable animatable;
        boolean z;
        int i = this.$r8$classId;
        CardRegistry cardRegistry = this.f$0;
        switch (i) {
            case 0:
                return Float.valueOf((cardRegistry == null || (animatable = (Animatable) cardRegistry.cardNuxAnimation$delegate.getValue()) == null) ? RecyclerView.DECELERATION_RATE : ((Number) animatable.getValue()).floatValue());
            default:
                if (cardRegistry != null) {
                    z = true;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
