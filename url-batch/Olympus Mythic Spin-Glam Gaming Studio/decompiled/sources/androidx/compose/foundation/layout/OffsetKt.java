package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "offset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OffsetKt {
    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m324offsetVpY3zN4(Modifier offset, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return offset.then(new OffsetModifier(f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.OffsetKt$offset-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set(VastAttributes.HORIZONTAL_POSITION, Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set(VastAttributes.VERTICAL_POSITION, Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static final Modifier offset(Modifier modifier, final Function1 offset) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return modifier.then(new OffsetPxModifier(offset, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", Function1.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m325offsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2507constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2507constructorimpl(0);
        }
        return m324offsetVpY3zN4(modifier, f, f2);
    }
}
