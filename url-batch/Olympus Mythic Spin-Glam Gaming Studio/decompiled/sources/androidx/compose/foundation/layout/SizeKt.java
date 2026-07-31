package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a!\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\n\u001a-\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\n\u001aA\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0004\u001a!\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0004\u001a)\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\n\u001a-\u0010!\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\n\u001aA\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0019\u001a\u001d\u0010&\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010\u0004\u001a\u001d\u0010'\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010\u0004\u001a\u001d\u0010(\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b(\u0010\u0004\u001a'\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.\u001a-\u00100\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\n\u001a\u0017\u00102\u001a\u0002012\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b2\u00103\u001a\u0017\u00104\u001a\u0002012\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b4\u00103\u001a\u0017\u00105\u001a\u0002012\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b5\u00103\u001a\u001f\u00108\u001a\u0002072\u0006\u0010*\u001a\u0002062\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b8\u00109\u001a\u001f\u0010;\u001a\u0002072\u0006\u0010*\u001a\u00020:2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u0002072\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b=\u0010>\"\u0014\u0010?\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010A\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@\"\u0014\u0010B\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@\"\u0014\u0010C\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\"\u0014\u0010E\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010D\"\u0014\u0010F\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010D\"\u0014\u0010G\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010D\"\u0014\u0010H\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010D\"\u0014\u0010I\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010D\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "width-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "height-3ABfNKs", "size", "size-3ABfNKs", "size-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "size-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "min", "max", "widthIn-VpY3zN4", "widthIn", "heightIn-VpY3zN4", "heightIn", "minWidth", "minHeight", "maxWidth", "maxHeight", "sizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "sizeIn", "requiredWidth-3ABfNKs", "requiredWidth", "requiredSize-3ABfNKs", "requiredSize", "requiredSize-VpY3zN4", "requiredHeightIn-VpY3zN4", "requiredHeightIn", "requiredSizeIn-qDBjuR0", "requiredSizeIn", "", "fraction", "fillMaxWidth", "fillMaxHeight", "fillMaxSize", "Landroidx/compose/ui/Alignment;", "align", "", "unbounded", "wrapContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/Modifier;", "defaultMinSize-VpY3zN4", "defaultMinSize", "Landroidx/compose/foundation/layout/FillModifier;", "createFillWidthModifier", "(F)Landroidx/compose/foundation/layout/FillModifier;", "createFillHeightModifier", "createFillSizeModifier", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/foundation/layout/WrapContentModifier;", "createWrapContentWidthModifier", "(Landroidx/compose/ui/Alignment$Horizontal;Z)Landroidx/compose/foundation/layout/WrapContentModifier;", "Landroidx/compose/ui/Alignment$Vertical;", "createWrapContentHeightModifier", "(Landroidx/compose/ui/Alignment$Vertical;Z)Landroidx/compose/foundation/layout/WrapContentModifier;", "createWrapContentSizeModifier", "(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/foundation/layout/WrapContentModifier;", "FillWholeMaxWidth", "Landroidx/compose/foundation/layout/FillModifier;", "FillWholeMaxHeight", "FillWholeMaxSize", "WrapContentWidthCenter", "Landroidx/compose/foundation/layout/WrapContentModifier;", "WrapContentWidthStart", "WrapContentHeightCenter", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    private static final WrapContentModifier WrapContentHeightCenter;
    private static final WrapContentModifier WrapContentHeightTop;
    private static final WrapContentModifier WrapContentSizeCenter;
    private static final WrapContentModifier WrapContentSizeTopStart;
    private static final WrapContentModifier WrapContentWidthCenter;
    private static final WrapContentModifier WrapContentWidthStart;
    private static final FillModifier FillWholeMaxWidth = createFillWidthModifier(1.0f);
    private static final FillModifier FillWholeMaxHeight = createFillHeightModifier(1.0f);
    private static final FillModifier FillWholeMaxSize = createFillSizeModifier(1.0f);

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m362width3ABfNKs(Modifier width, final float f) {
        Intrinsics.checkNotNullParameter(width, "$this$width");
        return width.then(new SizeModifier(f, 0.0f, f, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m2505boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m347height3ABfNKs(Modifier height, final float f) {
        Intrinsics.checkNotNullParameter(height, "$this$height");
        return height.then(new SizeModifier(0.0f, f, 0.0f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m2505boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m352requiredSize3ABfNKs(Modifier requiredSize, final float f) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f, f, f, f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m2505boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m353requiredSizeVpY3zN4(Modifier requiredSize, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new SizeModifier(f, f2, f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("height", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m357size3ABfNKs(Modifier size, final float f) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f, f, f, f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.setValue(Dp.m2505boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m359sizeVpY3zN4(Modifier size, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return size.then(new SizeModifier(f, f2, f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("size");
                inspectorInfo.getProperties().set("width", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("height", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m358size6HolHcs(Modifier size, long j) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return m359sizeVpY3zN4(size, DpSize.m2538getWidthD9Ej5fM(j), DpSize.m2537getHeightD9Ej5fM(j));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m364widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        return m363widthInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m363widthInVpY3zN4(Modifier widthIn, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        return widthIn.then(new SizeModifier(f, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set("min", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m349heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        return m348heightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m348heightInVpY3zN4(Modifier heightIn, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        return heightIn.then(new SizeModifier(0.0f, f, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set("min", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m361sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        return m360sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m360sizeInqDBjuR0(Modifier sizeIn, final float f, final float f2, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        return sizeIn.then(new SizeModifier(f, f2, f3, f4, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("minHeight", Dp.m2505boximpl(f2));
                inspectorInfo.getProperties().set("maxWidth", Dp.m2505boximpl(f3));
                inspectorInfo.getProperties().set("maxHeight", Dp.m2505boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m356requiredWidth3ABfNKs(Modifier requiredWidth, final float f) {
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        return requiredWidth.then(new SizeModifier(f, 0.0f, f, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m2505boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m351requiredHeightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        return m350requiredHeightInVpY3zN4(modifier, f, f2);
    }

    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m350requiredHeightInVpY3zN4(Modifier requiredHeightIn, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.then(new SizeModifier(0.0f, f, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set("min", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("max", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m355requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        return m354requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m354requiredSizeInqDBjuR0(Modifier requiredSizeIn, final float f, final float f2, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.then(new SizeModifier(f, f2, f3, f4, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set("minWidth", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("minHeight", Dp.m2505boximpl(f2));
                inspectorInfo.getProperties().set("maxWidth", Dp.m2505boximpl(f3));
                inspectorInfo.getProperties().set("maxHeight", Dp.m2505boximpl(f4));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f == 1.0f ? FillWholeMaxWidth : createFillWidthModifier(f));
    }

    static {
        Alignment.Companion companion = Alignment.INSTANCE;
        WrapContentWidthCenter = createWrapContentWidthModifier(companion.getCenterHorizontally(), false);
        WrapContentWidthStart = createWrapContentWidthModifier(companion.getStart(), false);
        WrapContentHeightCenter = createWrapContentHeightModifier(companion.getCenterVertically(), false);
        WrapContentHeightTop = createWrapContentHeightModifier(companion.getTop(), false);
        WrapContentSizeCenter = createWrapContentSizeModifier(companion.getCenter(), false);
        WrapContentSizeTopStart = createWrapContentSizeModifier(companion.getTopStart(), false);
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f == 1.0f ? FillWholeMaxHeight : createFillHeightModifier(f));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(f == 1.0f ? FillWholeMaxSize : createFillSizeModifier(f));
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    public static final Modifier wrapContentSize(Modifier modifier, Alignment align, boolean z) {
        WrapContentModifier createWrapContentSizeModifier;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.INSTANCE;
        if (Intrinsics.areEqual(align, companion.getCenter()) && !z) {
            createWrapContentSizeModifier = WrapContentSizeCenter;
        } else if (Intrinsics.areEqual(align, companion.getTopStart()) && !z) {
            createWrapContentSizeModifier = WrapContentSizeTopStart;
        } else {
            createWrapContentSizeModifier = createWrapContentSizeModifier(align, z);
        }
        return modifier.then(createWrapContentSizeModifier);
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m346defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        return m345defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m345defaultMinSizeVpY3zN4(Modifier defaultMinSize, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsModifier(f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$defaultMinSize-VpY3zN4$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("defaultMinSize");
                inspectorInfo.getProperties().set("minWidth", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("minHeight", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    private static final FillModifier createFillWidthModifier(final float f) {
        return new FillModifier(Direction.Horizontal, f, new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$createFillWidthModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxWidth");
                $receiver.getProperties().set("fraction", Float.valueOf(f));
            }
        });
    }

    private static final FillModifier createFillHeightModifier(final float f) {
        return new FillModifier(Direction.Vertical, f, new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$createFillHeightModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxHeight");
                $receiver.getProperties().set("fraction", Float.valueOf(f));
            }
        });
    }

    private static final FillModifier createFillSizeModifier(final float f) {
        return new FillModifier(Direction.Both, f, new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$createFillSizeModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("fillMaxSize");
                $receiver.getProperties().set("fraction", Float.valueOf(f));
            }
        });
    }

    private static final WrapContentModifier createWrapContentWidthModifier(final Alignment.Horizontal horizontal, final boolean z) {
        return new WrapContentModifier(Direction.Horizontal, z, new Function2() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return IntOffset.m2545boximpl(m367invoke5SAbXVA(((IntSize) obj).getPackedValue(), (LayoutDirection) obj2));
            }

            /* renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m367invoke5SAbXVA(long j, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return IntOffsetKt.IntOffset(Alignment.Horizontal.this.align(0, IntSize.m2567getWidthimpl(j), layoutDirection), 0);
            }
        }, horizontal, new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentWidthModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentWidth");
                $receiver.getProperties().set("align", Alignment.Horizontal.this);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z));
            }
        });
    }

    private static final WrapContentModifier createWrapContentHeightModifier(final Alignment.Vertical vertical, final boolean z) {
        return new WrapContentModifier(Direction.Vertical, z, new Function2() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return IntOffset.m2545boximpl(m365invoke5SAbXVA(((IntSize) obj).getPackedValue(), (LayoutDirection) obj2));
            }

            /* renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m365invoke5SAbXVA(long j, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
                return IntOffsetKt.IntOffset(0, Alignment.Vertical.this.align(0, IntSize.m2566getHeightimpl(j)));
            }
        }, vertical, new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentHeightModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentHeight");
                $receiver.getProperties().set("align", Alignment.Vertical.this);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z));
            }
        });
    }

    private static final WrapContentModifier createWrapContentSizeModifier(final Alignment alignment, final boolean z) {
        return new WrapContentModifier(Direction.Both, z, new Function2() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return IntOffset.m2545boximpl(m366invoke5SAbXVA(((IntSize) obj).getPackedValue(), (LayoutDirection) obj2));
            }

            /* renamed from: invoke-5SAbXVA, reason: not valid java name */
            public final long m366invoke5SAbXVA(long j, @NotNull LayoutDirection layoutDirection) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                return Alignment.this.mo1228alignKFBX0sM(IntSize.INSTANCE.m2571getZeroYbymL2g(), j, layoutDirection);
            }
        }, alignment, new Function1() { // from class: androidx.compose.foundation.layout.SizeKt$createWrapContentSizeModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.setName("wrapContentSize");
                $receiver.getProperties().set("align", Alignment.this);
                $receiver.getProperties().set("unbounded", Boolean.valueOf(z));
            }
        });
    }
}
