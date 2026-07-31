package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntrinsicsPolicy.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicyFromState", "()Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "", "updateFrom", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/MutableState;", "measurePolicyState", "Landroidx/compose/runtime/MutableState;", "pendingMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntrinsicsPolicy {
    private static final Companion Companion = new Companion(null);
    private final LayoutNode layoutNode;
    private MutableState measurePolicyState;
    private MeasurePolicy pendingMeasurePolicy;

    public IntrinsicsPolicy(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
    }

    public final void updateFrom(MeasurePolicy measurePolicy) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        MutableState mutableState = this.measurePolicyState;
        if (mutableState != null) {
            Intrinsics.checkNotNull(mutableState);
            mutableState.setValue(measurePolicy);
        } else {
            this.pendingMeasurePolicy = measurePolicy;
        }
    }

    public final int minIntrinsicWidth(int height) {
        return measurePolicyFromState().minIntrinsicWidth(this.layoutNode.getMeasureScope(), this.layoutNode.getChildren$ui_release(), height);
    }

    public final int minIntrinsicHeight(int width) {
        return measurePolicyFromState().minIntrinsicHeight(this.layoutNode.getMeasureScope(), this.layoutNode.getChildren$ui_release(), width);
    }

    public final int maxIntrinsicWidth(int height) {
        return measurePolicyFromState().maxIntrinsicWidth(this.layoutNode.getMeasureScope(), this.layoutNode.getChildren$ui_release(), height);
    }

    public final int maxIntrinsicHeight(int width) {
        return measurePolicyFromState().maxIntrinsicHeight(this.layoutNode.getMeasureScope(), this.layoutNode.getChildren$ui_release(), width);
    }

    private final MeasurePolicy measurePolicyFromState() {
        MutableState mutableState = this.measurePolicyState;
        if (mutableState == null) {
            MeasurePolicy measurePolicy = this.pendingMeasurePolicy;
            if (measurePolicy == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
            }
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(measurePolicy, null, 2, null);
        }
        this.measurePolicyState = mutableState;
        return (MeasurePolicy) mutableState.getValue();
    }

    /* compiled from: IntrinsicsPolicy.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;", "", "()V", "NoPolicyError", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
