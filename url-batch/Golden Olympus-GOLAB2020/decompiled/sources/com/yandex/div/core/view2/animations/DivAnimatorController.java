package com.yandex.div.core.view2.animations;

import O1.C0910l0;
import O1.E2;
import O1.InterfaceC0752c3;
import O1.Z;
import android.animation.Animator;
import android.view.View;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.animation.DivVariableAnimatorBuilder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivAnimatorController {

    @NotNull
    private final Div2View divView;

    @NotNull
    private final Map<Pair<String, String>, Animator> runningAnimators;

    public DivAnimatorController(@NotNull Div2View divView) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        this.divView = divView;
        this.runningAnimators = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final E2 findAnimator(View view, String str) {
        InterfaceC0752c3 b4;
        if (view instanceof DivHolderView) {
            Z div = ((DivHolderView) view).getDiv();
            E2 findAnimator = findAnimator((List<? extends E2>) ((div == null || (b4 = div.b()) == null) ? null : b4.u()), str);
            if (findAnimator != null) {
                return findAnimator;
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return findAnimator(view2, str);
            }
            return null;
        }
        if (!(view instanceof Div2View)) {
            Object parent2 = view.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            if (view3 != null) {
                return findAnimator(view3, str);
            }
            return null;
        }
        DivActionTypedUtilsKt.logWarning(this.divView, new RuntimeException("Unable to find animator with id '" + str + '\''));
        return null;
    }

    public final void onDetachedFromWindow() {
        ArrayList arrayList = new ArrayList(this.runningAnimators.values());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Animator) obj).cancel();
        }
        this.runningAnimators.clear();
    }

    public final void startAnimator(@NotNull String scopeId, @NotNull View targetView, @NotNull C0910l0 action, @NotNull ExpressionResolver resolver) {
        Animator remove;
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        String str = action.f6879a;
        E2 findAnimator = findAnimator(targetView, str);
        if (findAnimator == null) {
            return;
        }
        final Pair<String, String> pair = TuplesKt.to(scopeId, str);
        if (this.runningAnimators.containsKey(pair) && (remove = this.runningAnimators.remove(pair)) != null) {
            remove.cancel();
        }
        Animator build = DivVariableAnimatorBuilder.INSTANCE.build(this.divView, findAnimator, action, resolver);
        if (build == null) {
            return;
        }
        build.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Map map;
                map = DivAnimatorController.this.runningAnimators;
                map.remove(pair);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        build.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                Map map;
                map = DivAnimatorController.this.runningAnimators;
                map.remove(pair);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        this.runningAnimators.put(pair, build);
        build.start();
    }

    public final void stopAnimator(@NotNull String scopeId, @NotNull String animatorId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(animatorId, "animatorId");
        Animator remove = this.runningAnimators.remove(TuplesKt.to(scopeId, animatorId));
        if (remove == null) {
            return;
        }
        remove.cancel();
    }

    private final E2 findAnimator(List<? extends E2> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((E2) obj).b().getId(), str)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() <= 1) {
            return (E2) CollectionsKt.first((List) arrayList);
        }
        return null;
    }
}
