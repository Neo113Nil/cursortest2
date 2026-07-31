package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001aA\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012\u001a\u001e\u0010\u0015\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a=\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "start", ViewHierarchyConstants.DIMENSION_TOP_KEY, "end", "bottom", "padding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", VastAttributes.PADDING, "horizontal", "vertical", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "all", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "calculateStartPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateEndPadding", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "PaddingValues", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaddingKt {
    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m337paddingqDBjuR0(Modifier padding, final float f, final float f2, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(VastAttributes.PADDING);
                inspectorInfo.getProperties().set("start", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set(ViewHierarchyConstants.DIMENSION_TOP_KEY, Dp.m2505boximpl(f2));
                inspectorInfo.getProperties().set("end", Dp.m2505boximpl(f3));
                inspectorInfo.getProperties().set("bottom", Dp.m2505boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m335paddingVpY3zN4(Modifier padding, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(VastAttributes.PADDING);
                inspectorInfo.getProperties().set("horizontal", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("vertical", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m334padding3ABfNKs(Modifier padding, final float f) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.PaddingKt$padding-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(VastAttributes.PADDING);
                inspectorInfo.setValue(Dp.m2505boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(VastAttributes.PADDING);
                inspectorInfo.getProperties().set("paddingValues", PaddingValues.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m331PaddingValuesYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2507constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2507constructorimpl(0);
        }
        return m330PaddingValuesYgX7TsA(f, f2);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m333PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2507constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2507constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m2507constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m2507constructorimpl(0);
        }
        return m332PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m336paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2507constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2507constructorimpl(0);
        }
        return m335paddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m338paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2507constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2507constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m2507constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m2507constructorimpl(0);
        }
        return m337paddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo320calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo321calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo321calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo320calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m329PaddingValues0680j_4(float f) {
        return new PaddingValues(f, f, f, f, null);
    }

    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m330PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValues(f, f2, f, f2, null);
    }

    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m332PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValues(f, f2, f3, f4, null);
    }
}
