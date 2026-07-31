package androidx.compose.foundation.layout;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.safedk.android.analytics.brandsafety.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "insets", "union", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE, m.l, "Landroidx/compose/foundation/layout/PaddingValues;", "asInsets", "(Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/foundation/layout/WindowInsets;", "", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "WindowInsets", "(IIII)Landroidx/compose/foundation/layout/WindowInsets;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WindowInsetsKt {
    public static final WindowInsets union(WindowInsets windowInsets, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new UnionInsets(windowInsets, insets);
    }

    public static final WindowInsets exclude(WindowInsets windowInsets, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new ExcludeInsets(windowInsets, insets);
    }

    public static final WindowInsets add(WindowInsets windowInsets, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new AddedInsets(windowInsets, insets);
    }

    public static final WindowInsets asInsets(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        return new PaddingValues(paddingValues);
    }

    public static final WindowInsets WindowInsets(int i, int i2, int i3, int i4) {
        return new Insets(i, i2, i3, i4);
    }
}
