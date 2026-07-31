package com.yandex.div.core.view2;

import O1.Xb;
import O1.Z;
import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.SightActionIsEnabledObserver;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;
import h2.p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.T;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class SightActionIsEnabledObserver {

    @NotNull
    private final WeakHashMap<View, Set<Xb>> boundedActions;

    @NotNull
    private final WeakHashMap<View, Unit> hasSubscription;

    @NotNull
    private final p onDisable;

    @NotNull
    private final p onEnable;

    @NotNull
    private final HashMap<Xb, Subscription> subscriptions;

    @Metadata
    private static final class Subscription {

        @NotNull
        private final Disposable disposable;

        @NotNull
        private final WeakReference<View> owner;

        public Subscription(@NotNull Disposable disposable, @NotNull View owner) {
            Intrinsics.checkNotNullParameter(disposable, "disposable");
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.disposable = disposable;
            this.owner = new WeakReference<>(owner);
        }

        public final void close() {
            this.disposable.close();
        }

        @NotNull
        public final WeakReference<View> getOwner() {
            return this.owner;
        }
    }

    public SightActionIsEnabledObserver(@NotNull p onEnable, @NotNull p onDisable) {
        Intrinsics.checkNotNullParameter(onEnable, "onEnable");
        Intrinsics.checkNotNullParameter(onDisable, "onDisable");
        this.onEnable = onEnable;
        this.onDisable = onDisable;
        this.boundedActions = new WeakHashMap<>();
        this.subscriptions = new HashMap<>();
        this.hasSubscription = new WeakHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSubscriptionIfNeeded(final View view) {
        if (this.hasSubscription.containsKey(view) || !(view instanceof ExpressionSubscriber)) {
            return;
        }
        ((ExpressionSubscriber) view).addSubscription(new Disposable() { // from class: w1.w
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                SightActionIsEnabledObserver.addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver.this, view);
            }
        });
        this.hasSubscription.put(view, Unit.f41027a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver this$0, View this_addSubscriptionIfNeeded) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_addSubscriptionIfNeeded, "$this_addSubscriptionIfNeeded");
        Set<Xb> remove = this$0.boundedActions.remove(this_addSubscriptionIfNeeded);
        if (remove == null) {
            remove = T.e();
        }
        this$0.cancelObserving(remove);
    }

    private final void cancelObserving(Xb xb) {
        Set<Xb> set;
        Subscription remove = this.subscriptions.remove(xb);
        if (remove == null) {
            return;
        }
        remove.close();
        View view = remove.getOwner().get();
        if (view == null || (set = this.boundedActions.get(view)) == null) {
            return;
        }
        set.remove(xb);
    }

    public final void observe(@NotNull View view, @NotNull Div2View div2View, @NotNull ExpressionResolver resolver, @NotNull Z z4, @NotNull List<? extends Xb> actions) {
        Subscription remove;
        Intrinsics.checkNotNullParameter(view, "view");
        Div2View div2View2 = div2View;
        Intrinsics.checkNotNullParameter(div2View2, "div2View");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Z div = z4;
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(actions, "actions");
        addSubscriptionIfNeeded(view);
        WeakHashMap<View, Set<Xb>> weakHashMap = this.boundedActions;
        Set<Xb> set = weakHashMap.get(view);
        if (set == null) {
            set = T.e();
        }
        Set intersect = CollectionsKt.intersect(actions, set);
        Set<Xb> mutableSet = CollectionsKt.toMutableSet(intersect);
        for (Xb xb : set) {
            if (!intersect.contains(xb) && (remove = this.subscriptions.remove(xb)) != null) {
                remove.close();
            }
        }
        for (Xb xb2 : actions) {
            if (!intersect.contains(xb2)) {
                mutableSet.add(xb2);
                cancelObserving(xb2);
                this.subscriptions.put(xb2, new Subscription(xb2.isEnabled().observe(resolver, new SightActionIsEnabledObserver$observe$2$1(this, div2View2, resolver, view, div, xb2)), view));
            }
            div2View2 = div2View;
            div = z4;
        }
        weakHashMap.put(view, mutableSet);
    }

    public final void cancelObserving(@NotNull Iterable<? extends Xb> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Iterator<? extends Xb> it = actions.iterator();
        while (it.hasNext()) {
            cancelObserving(it.next());
        }
    }
}
