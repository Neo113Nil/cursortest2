package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.core.CardMaterial;
import com.squareup.cash.card.onboarding.core.CardScene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda18 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardScene f$0;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda18(CardScene cardScene, int i) {
        this.$r8$classId = i;
        this.f$0 = cardScene;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CardScene cardScene = this.f$0;
        switch (i) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                return new CardTransitionKt$sceneCache$lambda$4$0$$inlined$onDispose$1(cardScene, 0);
            default:
                float floatValue = ((Number) ((Animatable) obj).getValue()).floatValue();
                Float valueOf = Float.valueOf(1.0f);
                if (cardScene.isTransitioning) {
                    float coerceIn = RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f);
                    cardScene.crossfadeProgress = coerceIn;
                    float coerceIn2 = RangesKt___RangesKt.coerceIn(coerceIn / 0.25f, RecyclerView.DECELERATION_RATE, 1.0f);
                    float coerceIn3 = RangesKt___RangesKt.coerceIn((cardScene.crossfadeProgress - 0.25f) / 0.75f, RecyclerView.DECELERATION_RATE, 1.0f);
                    boolean z = cardScene.activeSlotIsA;
                    CardMaterial cardMaterial = z ? cardScene.slotAMaterial : cardScene.slotBMaterial;
                    CardMaterial cardMaterial2 = z ? cardScene.slotBMaterial : cardScene.slotAMaterial;
                    Pair pair = coerceIn3 <= RecyclerView.DECELERATION_RATE ? new Pair(valueOf, Float.valueOf(coerceIn2)) : new Pair(Float.valueOf(1.0f - coerceIn3), valueOf);
                    float floatValue2 = ((Number) pair.first).floatValue();
                    float floatValue3 = ((Number) pair.second).floatValue();
                    if (cardMaterial != null) {
                        cardMaterial.crossfadeMultiplier = floatValue2;
                    }
                    if (cardMaterial2 != null) {
                        cardMaterial2.crossfadeMultiplier = floatValue3;
                    }
                    cardScene.markDirty();
                }
                return Unit.INSTANCE;
        }
    }
}
