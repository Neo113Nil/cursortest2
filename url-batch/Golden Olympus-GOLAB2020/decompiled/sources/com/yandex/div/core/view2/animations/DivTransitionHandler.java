package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC3204l;
import k0.AbstractC3205m;
import k0.AbstractC3206n;
import k0.C3208p;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivTransitionHandler {

    @NotNull
    private List<TransitionData> activeTransitions;

    @NotNull
    private final Div2View divView;

    @NotNull
    private List<TransitionData> pendingTransitions;
    private boolean posted;

    @Metadata
    public static abstract class ChangeType {

        @Metadata
        public static final class Visibility extends ChangeType {

            /* renamed from: new, reason: not valid java name */
            private final int f2new;

            public Visibility(int i4) {
                super(null);
                this.f2new = i4;
            }

            public void apply(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.setVisibility(this.f2new);
            }

            public final int getNew() {
                return this.f2new;
            }
        }

        public /* synthetic */ ChangeType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ChangeType() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static final class TransitionData {

        @NotNull
        private final List<ChangeType.Visibility> changes;

        @NotNull
        private final List<ChangeType.Visibility> savedChanges;

        @NotNull
        private final View target;

        @NotNull
        private final AbstractC3204l transition;

        public TransitionData(@NotNull AbstractC3204l transition, @NotNull View target, @NotNull List<ChangeType.Visibility> changes, @NotNull List<ChangeType.Visibility> savedChanges) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(changes, "changes");
            Intrinsics.checkNotNullParameter(savedChanges, "savedChanges");
            this.transition = transition;
            this.target = target;
            this.changes = changes;
            this.savedChanges = savedChanges;
        }

        @NotNull
        public final List<ChangeType.Visibility> getChanges() {
            return this.changes;
        }

        @NotNull
        public final List<ChangeType.Visibility> getSavedChanges() {
            return this.savedChanges;
        }

        @NotNull
        public final View getTarget() {
            return this.target;
        }

        @NotNull
        public final AbstractC3204l getTransition() {
            return this.transition;
        }
    }

    public DivTransitionHandler(@NotNull Div2View divView) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        this.divView = divView;
        this.pendingTransitions = new ArrayList();
        this.activeTransitions = new ArrayList();
    }

    private final void beginDelayedTransitions(ViewGroup viewGroup, boolean z4) {
        if (!viewGroup.isAttachedToWindow()) {
            this.pendingTransitions.clear();
            return;
        }
        if (z4) {
            AbstractC3206n.c(viewGroup);
        }
        final C3208p c3208p = new C3208p();
        Iterator<T> it = this.pendingTransitions.iterator();
        while (it.hasNext()) {
            c3208p.p(((TransitionData) it.next()).getTransition());
        }
        c3208p.addListener(new AbstractC3205m() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$beginDelayedTransitions$$inlined$doOnEnd$1
            @Override // k0.AbstractC3204l.f
            public void onTransitionEnd(@NotNull AbstractC3204l transition) {
                List list;
                Intrinsics.checkNotNullParameter(transition, "transition");
                list = this.activeTransitions;
                list.clear();
                AbstractC3204l.this.removeListener(this);
            }
        });
        AbstractC3206n.a(viewGroup, c3208p);
        for (TransitionData transitionData : this.pendingTransitions) {
            for (ChangeType.Visibility visibility : transitionData.getChanges()) {
                visibility.apply(transitionData.getTarget());
                transitionData.getSavedChanges().add(visibility);
            }
        }
        this.activeTransitions.clear();
        this.activeTransitions.addAll(this.pendingTransitions);
        this.pendingTransitions.clear();
    }

    static /* synthetic */ void beginDelayedTransitions$default(DivTransitionHandler divTransitionHandler, ViewGroup viewGroup, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            viewGroup = divTransitionHandler.divView;
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        divTransitionHandler.beginDelayedTransitions(viewGroup, z4);
    }

    private final List<ChangeType.Visibility> getChange(List<TransitionData> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (TransitionData transitionData : list) {
            ChangeType.Visibility visibility = Intrinsics.areEqual(transitionData.getTarget(), view) ? (ChangeType.Visibility) CollectionsKt.lastOrNull((List) transitionData.getSavedChanges()) : null;
            if (visibility != null) {
                arrayList.add(visibility);
            }
        }
        return arrayList;
    }

    private final void postTransitions() {
        if (this.posted) {
            return;
        }
        this.posted = true;
        this.divView.post(new Runnable() { // from class: x1.a
            @Override // java.lang.Runnable
            public final void run() {
                DivTransitionHandler.postTransitions$lambda$0(DivTransitionHandler.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTransitions$lambda$0(DivTransitionHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.posted) {
            beginDelayedTransitions$default(this$0, null, false, 3, null);
        }
        this$0.posted = false;
    }

    @Nullable
    public final ChangeType.Visibility getLastChange(@NotNull View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        ChangeType.Visibility visibility = (ChangeType.Visibility) CollectionsKt.lastOrNull((List) getChange(this.pendingTransitions, target));
        if (visibility != null) {
            return visibility;
        }
        ChangeType.Visibility visibility2 = (ChangeType.Visibility) CollectionsKt.lastOrNull((List) getChange(this.activeTransitions, target));
        if (visibility2 != null) {
            return visibility2;
        }
        return null;
    }

    public final void putTransition(@NotNull AbstractC3204l transition, @NotNull View view, @NotNull ChangeType.Visibility changeType) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(changeType, "changeType");
        this.pendingTransitions.add(new TransitionData(transition, view, CollectionsKt.mutableListOf(changeType), new ArrayList()));
        postTransitions();
    }

    public final void runTransitions(@NotNull ViewGroup root, boolean z4) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.posted = false;
        beginDelayedTransitions(root, z4);
    }
}
