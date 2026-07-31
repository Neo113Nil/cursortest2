package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "DefaultLayerBlock", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Constraints;", "DefaultConstraints", "J", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PlaceableKt {
    private static final Function1 DefaultLayerBlock = new Function1() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GraphicsLayerScope) obj);
            return Unit.INSTANCE;
        }
    };
    private static final long DefaultConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
}
