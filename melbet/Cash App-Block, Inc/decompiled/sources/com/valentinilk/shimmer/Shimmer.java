package com.valentinilk.shimmer;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class Shimmer {
    public final StateFlowImpl boundsFlow;
    public final ShimmerEffect effect;
    public final ShimmerTheme theme;

    public Shimmer(ShimmerTheme shimmerTheme, ShimmerEffect shimmerEffect, Rect rect) {
        shimmerEffect.getClass();
        this.theme = shimmerTheme;
        this.effect = shimmerEffect;
        this.boundsFlow = FlowKt.MutableStateFlow(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Shimmer.class != obj.getClass()) {
            return false;
        }
        Shimmer shimmer = (Shimmer) obj;
        return this.theme.equals(shimmer.theme) && Intrinsics.areEqual(this.effect, shimmer.effect);
    }

    public final int hashCode() {
        return this.effect.hashCode() + (this.theme.hashCode() * 31);
    }
}
