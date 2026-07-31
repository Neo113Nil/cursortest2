package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InspectableValue.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\n\u001a\u00060\tR\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectableModifier$End;", "end", "Landroidx/compose/ui/platform/InspectableModifier$End;", "getEnd", "()Landroidx/compose/ui/platform/InspectableModifier$End;", "End", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    private final End end;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier$End;", "Landroidx/compose/ui/Modifier$Element;", "(Landroidx/compose/ui/platform/InspectableModifier;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class End implements Modifier.Element {
        public End() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectableModifier(Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.end = new End();
    }

    public final End getEnd() {
        return this.end;
    }
}
