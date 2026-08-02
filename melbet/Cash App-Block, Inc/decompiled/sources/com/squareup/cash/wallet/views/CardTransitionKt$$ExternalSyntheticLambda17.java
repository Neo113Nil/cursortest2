package com.squareup.cash.wallet.views;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.squareup.cash.graphics.swampgl.Engine;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardTransitionKt$$ExternalSyntheticLambda17 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Engine f$0;

    public /* synthetic */ CardTransitionKt$$ExternalSyntheticLambda17(Engine engine, int i) {
        this.$r8$classId = i;
        this.f$0 = engine;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final Engine engine = this.f$0;
        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
        switch (i) {
            case 0:
                disposableEffectScope.getClass();
                final int i2 = 0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$2$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i3 = i2;
                        Engine engine2 = engine;
                        switch (i3) {
                            case 0:
                                engine2.shutdown();
                                break;
                            default:
                                engine2.shutdown();
                                break;
                        }
                    }
                };
            default:
                disposableEffectScope.getClass();
                final int i3 = 1;
                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$lambda$2$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i32 = i3;
                        Engine engine2 = engine;
                        switch (i32) {
                            case 0:
                                engine2.shutdown();
                                break;
                            default:
                                engine2.shutdown();
                                break;
                        }
                    }
                };
        }
    }
}
