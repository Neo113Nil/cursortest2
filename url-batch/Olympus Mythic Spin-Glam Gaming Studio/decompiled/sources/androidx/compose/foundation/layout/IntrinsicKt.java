package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "intrinsicSize", "width", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/IntrinsicSize;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntrinsicKt {

    /* compiled from: Intrinsic.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IntrinsicSize.values().length];
            iArr[IntrinsicSize.Min.ordinal()] = 1;
            iArr[IntrinsicSize.Max.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Modifier width(Modifier modifier, IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i == 1) {
            return modifier.then(MinIntrinsicWidthModifier.INSTANCE);
        }
        if (i == 2) {
            return modifier.then(MaxIntrinsicWidthModifier.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }
}
