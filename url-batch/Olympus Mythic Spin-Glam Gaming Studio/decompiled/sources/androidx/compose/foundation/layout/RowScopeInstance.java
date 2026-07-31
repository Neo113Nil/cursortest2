package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Row.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RowScopeInstance implements RowScope {
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier modifier, final float f, final boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f <= 0.0d) {
            throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
        }
        return modifier.then(new LayoutWeightImpl(f, z, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.RowScopeInstance$weight$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("weight");
                inspectorInfo.setValue(Float.valueOf(f));
                inspectorInfo.getProperties().set("weight", Float.valueOf(f));
                inspectorInfo.getProperties().set("fill", Boolean.valueOf(z));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier modifier, final Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return modifier.then(new VerticalAlignModifier(alignment, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.RowScopeInstance$align$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("align");
                inspectorInfo.setValue(Alignment.Vertical.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
