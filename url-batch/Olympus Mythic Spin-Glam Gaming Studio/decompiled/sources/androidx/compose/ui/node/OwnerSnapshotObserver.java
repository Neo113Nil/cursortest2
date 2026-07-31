package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OwnerSnapshotObserver.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\fJC\u0010\u0018\u001a\u00020\u0004\"\b\b\u0000\u0010\u0013*\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001aR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "Landroidx/compose/ui/node/OwnerScope;", "T", "target", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingMeasure", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayout", "onCommitAffectingLayoutModifier", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OwnerSnapshotObserver {
    private final SnapshotStateObserver observer;
    private final Function1 onCommitAffectingLayout;
    private final Function1 onCommitAffectingLayoutModifier;
    private final Function1 onCommitAffectingMeasure;

    public OwnerSnapshotObserver(Function1 onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.observer = new SnapshotStateObserver(onChangedExecutor);
        this.onCommitAffectingMeasure = new Function1() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.getIsAttached()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayout = new Function1() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.getIsAttached()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
        this.onCommitAffectingLayoutModifier = new Function1() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutNode) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutNode layoutNode) {
                Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
                if (layoutNode.getIsAttached()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
            }
        };
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode node, Function0 block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingLayout, block);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode node, Function0 block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingLayoutModifier, block);
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode node, Function0 block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.onCommitAffectingMeasure, block);
    }

    public final void observeReads$ui_release(OwnerScope target, Function1 onChanged, Function0 block) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Intrinsics.checkNotNullParameter(block, "block");
        this.observer.observeReads(target, onChanged, block);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new Function1() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!((OwnerScope) it).getIsAttached());
            }
        });
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
