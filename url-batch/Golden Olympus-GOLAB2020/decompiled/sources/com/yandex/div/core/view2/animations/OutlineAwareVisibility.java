package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.TransientView;
import k0.AbstractC3204l;
import k0.AbstractC3205m;
import k0.N;
import k0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class OutlineAwareVisibility extends N {
    @Override // k0.N
    @Nullable
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @Nullable s sVar, int i4, @Nullable final s sVar2, int i5) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Object obj = sVar2 != null ? sVar2.f40980b : null;
        final TransientView transientView = obj instanceof TransientView ? (TransientView) obj : null;
        if (transientView != null) {
            View view = sVar2.f40980b;
            Intrinsics.checkNotNullExpressionValue(view, "endValues.view");
            transientView.transitionStarted(view);
        }
        addListener(new AbstractC3205m() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onAppear$$inlined$doOnEnd$1
            @Override // k0.AbstractC3204l.f
            public void onTransitionEnd(@NotNull AbstractC3204l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    View view2 = sVar2.f40980b;
                    Intrinsics.checkNotNullExpressionValue(view2, "endValues.view");
                    transientView2.transitionFinished(view2);
                }
                AbstractC3204l.this.removeListener(this);
            }
        });
        return super.onAppear(sceneRoot, sVar, i4, sVar2, i5);
    }

    @Override // k0.N
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @Nullable final s sVar, int i4, @Nullable s sVar2, int i5) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Object obj = sVar != null ? sVar.f40980b : null;
        final TransientView transientView = obj instanceof TransientView ? (TransientView) obj : null;
        if (transientView != null) {
            View view = sVar.f40980b;
            Intrinsics.checkNotNullExpressionValue(view, "startValues.view");
            transientView.transitionStarted(view);
        }
        addListener(new AbstractC3205m() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onDisappear$$inlined$doOnEnd$1
            @Override // k0.AbstractC3204l.f
            public void onTransitionEnd(@NotNull AbstractC3204l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    View view2 = sVar.f40980b;
                    Intrinsics.checkNotNullExpressionValue(view2, "startValues.view");
                    transientView2.transitionFinished(view2);
                }
                AbstractC3204l.this.removeListener(this);
            }
        });
        return super.onDisappear(sceneRoot, sVar, i4, sVar2, i5);
    }
}
