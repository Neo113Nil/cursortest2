package com.valentinilk.shimmer;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public abstract class ShimmerThemeKt {
    public static final StaticProvidableCompositionLocal LocalShimmerTheme;
    public static final ShimmerTheme defaultShimmerTheme;

    static {
        Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = EasingKt.LinearEasing;
        drop$$ExternalSyntheticBUOutline0.getClass();
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig(false);
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        keyframesSpecConfig.at(valueOf, 0).easing = drop$$ExternalSyntheticBUOutline0;
        Float valueOf2 = Float.valueOf(1.0f);
        keyframesSpecConfig.at(valueOf2, 800);
        keyframesSpecConfig.at(valueOf2, 2300);
        keyframesSpecConfig.durationMillis = 2300;
        InfiniteRepeatableSpec m154infiniteRepeatable9IiC70o$default = AnimatableKt.m154infiniteRepeatable9IiC70o$default(new KeyframesSpec(keyframesSpecConfig), RepeatMode.Restart, 4);
        long j = Color.White;
        defaultShimmerTheme = new ShimmerTheme(m154infiniteRepeatable9IiC70o$default, 6, 15.0f, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.m675copywmQWz5c$default(0.25f, j, 14)), new Color(Color.m675copywmQWz5c$default(1.0f, j, 14)), new Color(Color.m675copywmQWz5c$default(0.25f, j, 14))}), CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{valueOf, Float.valueOf(0.5f), valueOf2}));
        LocalShimmerTheme = new StaticProvidableCompositionLocal(new ShimmerThemeKt$$ExternalSyntheticLambda0(0));
    }
}
