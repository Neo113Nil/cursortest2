package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import k0.AbstractC3204l;
import k0.AbstractC3205m;
import k0.AbstractC3206n;
import k0.C3203k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class SceneRootWatcher {

    @NotNull
    public static final SceneRootWatcher INSTANCE = new SceneRootWatcher();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static final class OnDetachListener implements View.OnAttachStateChangeListener {

        @NotNull
        private final ViewGroup sceneRoot;

        public OnDetachListener(@NotNull ViewGroup sceneRoot) {
            Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
            this.sceneRoot = sceneRoot;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.sceneRoot.removeOnAttachStateChangeListener(this);
            AbstractC3206n.c(this.sceneRoot);
        }
    }

    private SceneRootWatcher() {
    }

    public final void watchFor(@NotNull C3203k scene, @NotNull AbstractC3204l transition) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(transition, "transition");
        ViewGroup d4 = scene.d();
        Intrinsics.checkNotNullExpressionValue(d4, "scene.sceneRoot");
        watchFor(d4, transition);
    }

    public final void watchFor(@NotNull final ViewGroup sceneRoot, @NotNull final AbstractC3204l transition) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(transition, "transition");
        final OnDetachListener onDetachListener = new OnDetachListener(sceneRoot);
        sceneRoot.addOnAttachStateChangeListener(onDetachListener);
        transition.addListener(new AbstractC3205m() { // from class: com.yandex.div.core.view2.animations.SceneRootWatcher$watchFor$$inlined$doOnEnd$1
            @Override // k0.AbstractC3204l.f
            public void onTransitionEnd(@NotNull AbstractC3204l transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
                sceneRoot.removeOnAttachStateChangeListener(onDetachListener);
                AbstractC3204l.this.removeListener(this);
            }
        });
    }
}
