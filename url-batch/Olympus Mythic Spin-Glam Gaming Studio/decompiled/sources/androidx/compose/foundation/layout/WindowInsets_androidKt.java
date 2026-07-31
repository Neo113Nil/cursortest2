package androidx.compose.foundation.layout;

import androidx.core.graphics.Insets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsets.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/core/graphics/Insets;", "Landroidx/compose/foundation/layout/InsetsValues;", "toInsetsValues", "(Landroidx/core/graphics/Insets;)Landroidx/compose/foundation/layout/InsetsValues;", "insets", "", "name", "Landroidx/compose/foundation/layout/ValueInsets;", "ValueInsets", "(Landroidx/core/graphics/Insets;Ljava/lang/String;)Landroidx/compose/foundation/layout/ValueInsets;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WindowInsets_androidKt {
    public static final InsetsValues toInsetsValues(Insets insets) {
        Intrinsics.checkNotNullParameter(insets, "<this>");
        return new InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final ValueInsets ValueInsets(Insets insets, String name) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ValueInsets(toInsetsValues(insets), name);
    }
}
