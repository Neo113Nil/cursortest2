package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$lambda$45$0$$inlined$onPauseOrDispose$1 implements LifecyclePauseOrDisposeEffectResult {
    public final /* synthetic */ MutableState $active$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$lambda$45$0$$inlined$onPauseOrDispose$1(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$active$inlined = mutableState;
    }

    @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
    public final void runPauseOrOnDisposeEffect() {
        int i = this.$r8$classId;
        MutableState mutableState = this.$active$inlined;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 1:
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                mutableState.setValue(Boolean.FALSE);
                break;
        }
    }
}
