package com.squareup.cash.tabs.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotToolbarSharedElementConfig {
    public final AnimatedVisibilityScope animatedVisibilityScope;
    public final Object leadingButtonKey;
    public final SharedTransitionScope sharedTransitionScope;
    public final Object trailingButtonKey;

    public MoneybotToolbarSharedElementConfig(AnimatedVisibilityScope animatedVisibilityScope, SharedTransitionScope sharedTransitionScope, Object obj, Object obj2) {
        animatedVisibilityScope.getClass();
        sharedTransitionScope.getClass();
        obj.getClass();
        obj2.getClass();
        this.animatedVisibilityScope = animatedVisibilityScope;
        this.sharedTransitionScope = sharedTransitionScope;
        this.leadingButtonKey = obj;
        this.trailingButtonKey = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotToolbarSharedElementConfig)) {
            return false;
        }
        MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig = (MoneybotToolbarSharedElementConfig) obj;
        return Intrinsics.areEqual(this.animatedVisibilityScope, moneybotToolbarSharedElementConfig.animatedVisibilityScope) && Intrinsics.areEqual(this.sharedTransitionScope, moneybotToolbarSharedElementConfig.sharedTransitionScope) && Intrinsics.areEqual(this.leadingButtonKey, moneybotToolbarSharedElementConfig.leadingButtonKey) && Intrinsics.areEqual(this.trailingButtonKey, moneybotToolbarSharedElementConfig.trailingButtonKey);
    }

    public final int hashCode() {
        return this.trailingButtonKey.hashCode() + ((this.leadingButtonKey.hashCode() + ((this.sharedTransitionScope.hashCode() + (this.animatedVisibilityScope.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MoneybotToolbarSharedElementConfig(animatedVisibilityScope=" + this.animatedVisibilityScope + ", sharedTransitionScope=" + this.sharedTransitionScope + ", leadingButtonKey=" + this.leadingButtonKey + ", trailingButtonKey=" + this.trailingButtonKey + ")";
    }
}
