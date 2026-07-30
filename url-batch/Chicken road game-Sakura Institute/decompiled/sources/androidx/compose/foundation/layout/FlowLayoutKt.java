package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001ag\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u001b2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010!\u001a5\u0010\"\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&\u001a\u0095\u0001\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2#\u0010,\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172#\u0010.\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0002¢\u0006\u0002\u00102\u001a[\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0002¢\u0006\u0002\u00106\u001aS\u00107\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2#\u0010,\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172\u0006\u00108\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0002\u001a\u0090\u0001\u00109\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2#\u0010,\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172#\u0010.\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172\u0006\u00108\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0002\u001a%\u0010:\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010;\u001a5\u0010<\u001a\u00020#2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010=\u001a\\\u0010>\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020J2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001a\u001c\u0010M\u001a\u00020\u000f*\u00020+2\u0006\u0010N\u001a\u00020O2\u0006\u0010,\u001a\u00020\u000fH\u0000\u001a\u001c\u0010P\u001a\u00020\u000f*\u00020+2\u0006\u0010N\u001a\u00020O2\u0006\u0010.\u001a\u00020\u000fH\u0000\u001a<\u0010Q\u001a\u00020(*\u00020E2\u0006\u0010A\u001a\u00020B2\u0006\u0010I\u001a\u00020R2\u0014\u0010S\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u00020\u00070\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001aT\u0010W\u001a\u00020?*\u00020@2\u0006\u0010I\u001a\u00020J2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020?0[2\u0006\u0010\\\u001a\u00020B2\u0006\u0010]\u001a\u000204H\u0000ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\u001e\u0010`\u001a\u0004\u0018\u00010E*\b\u0012\u0004\u0012\u00020E0D2\b\u0010a\u001a\u0004\u0018\u00010bH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_START", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "mainAxisSizes", "", "crossAxisSizes", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "crossAxisMin", "isHorizontal", "", "mainAxisMin", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", "items", "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(Alignment.INSTANCE.getTop());
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(Alignment.INSTANCE.getStart());

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ab, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, int i2, FlowRowOverflow flowRowOverflow, final Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        Arrangement.Vertical vertical2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        FlowRowOverflow clip;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object obj;
        boolean changed;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        final Arrangement.Vertical vertical3;
        final int i12;
        Modifier modifier2;
        FlowRowOverflow flowRowOverflow2;
        final int i13;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(437853230);
        ComposerKt.sourceInformation(startRestartGroup, "C(FlowRow)P(4,1,6,2,3,5)93@4089L65,96@4179L166,103@4391L261,110@4658L105:FlowLayout.kt#2w3rfo");
        int i14 = i4 & 1;
        if (i14 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            horizontal2 = horizontal;
            i5 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                vertical2 = vertical;
                i5 |= startRestartGroup.changed(vertical2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i8 = i;
                    i5 |= startRestartGroup.changed(i8) ? 2048 : 1024;
                    i9 = i4 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i10 = i2;
                        i5 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i4 & 32;
                        if (i11 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(flowRowOverflow) ? 131072 : 65536;
                        }
                        if ((i4 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier;
                            if (i15 != 0) {
                                horizontal2 = Arrangement.INSTANCE.getStart();
                            }
                            Arrangement.Vertical top = i6 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                            int i16 = i7 != 0 ? Integer.MAX_VALUE : i8;
                            int i17 = i9 == 0 ? i10 : Integer.MAX_VALUE;
                            clip = i11 != 0 ? FlowRowOverflow.INSTANCE.getClip() : flowRowOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(437853230, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:92)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
                            int i18 = i5 & 458752;
                            z = i18 == 131072;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Arrangement.Vertical vertical4 = top;
                            int i19 = i17;
                            int i20 = i16;
                            FlowRowOverflow flowRowOverflow3 = clip;
                            MultiContentMeasurePolicy rowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(horizontal2, top, i16, i17, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & 8190);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
                            z2 = ((3670016 & i5) == 1048576) | (i18 == 131072);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue3;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ComposableLambdaKt.composableLambdaInstance(-139531073, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i21) {
                                    ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                                    if ((i21 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-139531073, i21, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                                    }
                                    function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            flowRowOverflow3.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
                            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts((List) obj);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
                            changed = startRestartGroup.changed(rowMeasurementMultiContentHelper);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(rowMeasurementMultiContentHelper);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical3 = vertical4;
                            i12 = i20;
                            modifier2 = companion;
                            flowRowOverflow2 = flowRowOverflow3;
                            i13 = i19;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            flowRowOverflow2 = flowRowOverflow;
                            vertical3 = vertical2;
                            i12 = i8;
                            i13 = i10;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final Arrangement.Horizontal horizontal3 = horizontal2;
                            final FlowRowOverflow flowRowOverflow4 = flowRowOverflow2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i21) {
                                    FlowLayoutKt.FlowRow(Modifier.this, horizontal3, vertical3, i12, i13, flowRowOverflow4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i2;
                    i11 = i4 & 32;
                    if (i11 != 0) {
                    }
                    if ((i4 & 64) != 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
                    int i182 = i5 & 458752;
                    if (i182 == 131072) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Arrangement.Vertical vertical42 = top;
                    int i192 = i17;
                    int i202 = i16;
                    FlowRowOverflow flowRowOverflow32 = clip;
                    MultiContentMeasurePolicy rowMeasurementMultiContentHelper2 = rowMeasurementMultiContentHelper(horizontal2, top, i16, i17, flowLayoutOverflowState2, startRestartGroup, (i5 >> 3) & 8190);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
                    if (i182 == 131072) {
                    }
                    z2 = ((3670016 & i5) == 1048576) | (i182 == 131072);
                    Object rememberedValue32 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ComposableLambdaKt.composableLambdaInstance(-139531073, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i21) {
                            ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                            if ((i21 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-139531073, i21, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                            }
                            function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                    flowRowOverflow32.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
                    startRestartGroup.updateRememberedValue(arrayList2);
                    obj = arrayList2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
                    Function2<Composer, Integer, Unit> combineAsVirtualLayouts2 = LayoutKt.combineAsVirtualLayouts((List) obj);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
                    changed = startRestartGroup.changed(rowMeasurementMultiContentHelper2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(rowMeasurementMultiContentHelper2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl.getInserting()) {
                    }
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    combineAsVirtualLayouts2.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    vertical3 = vertical42;
                    i12 = i202;
                    modifier2 = companion;
                    flowRowOverflow2 = flowRowOverflow32;
                    i13 = i192;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i;
                i9 = i4 & 16;
                if (i9 == 0) {
                }
                i10 = i2;
                i11 = i4 & 32;
                if (i11 != 0) {
                }
                if ((i4 & 64) != 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 == 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
                int i1822 = i5 & 458752;
                if (i1822 == 131072) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Arrangement.Vertical vertical422 = top;
                int i1922 = i17;
                int i2022 = i16;
                FlowRowOverflow flowRowOverflow322 = clip;
                MultiContentMeasurePolicy rowMeasurementMultiContentHelper22 = rowMeasurementMultiContentHelper(horizontal2, top, i16, i17, flowLayoutOverflowState22, startRestartGroup, (i5 >> 3) & 8190);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
                if (i1822 == 131072) {
                }
                z2 = ((3670016 & i5) == 1048576) | (i1822 == 131072);
                Object rememberedValue322 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                ArrayList arrayList22 = new ArrayList();
                arrayList22.add(ComposableLambdaKt.composableLambdaInstance(-139531073, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i21) {
                        ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                        if ((i21 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-139531073, i21, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                        }
                        function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                flowRowOverflow322.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
                startRestartGroup.updateRememberedValue(arrayList22);
                obj = arrayList22;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
                Function2<Composer, Integer, Unit> combineAsVirtualLayouts22 = LayoutKt.combineAsVirtualLayouts((List) obj);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
                changed = startRestartGroup.changed(rowMeasurementMultiContentHelper22);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(rowMeasurementMultiContentHelper22);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                MeasurePolicy measurePolicy22 = (MeasurePolicy) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl.getInserting()) {
                }
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                combineAsVirtualLayouts22.invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                vertical3 = vertical422;
                i12 = i2022;
                modifier2 = companion;
                flowRowOverflow2 = flowRowOverflow322;
                i13 = i1922;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            vertical2 = vertical;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i;
            i9 = i4 & 16;
            if (i9 == 0) {
            }
            i10 = i2;
            i11 = i4 & 32;
            if (i11 != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 == 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
            int i18222 = i5 & 458752;
            if (i18222 == 131072) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Arrangement.Vertical vertical4222 = top;
            int i19222 = i17;
            int i20222 = i16;
            FlowRowOverflow flowRowOverflow3222 = clip;
            MultiContentMeasurePolicy rowMeasurementMultiContentHelper222 = rowMeasurementMultiContentHelper(horizontal2, top, i16, i17, flowLayoutOverflowState222, startRestartGroup, (i5 >> 3) & 8190);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
            if (i18222 == 131072) {
            }
            z2 = ((3670016 & i5) == 1048576) | (i18222 == 131072);
            Object rememberedValue3222 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            ArrayList arrayList222 = new ArrayList();
            arrayList222.add(ComposableLambdaKt.composableLambdaInstance(-139531073, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i21) {
                    ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                    if ((i21 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-139531073, i21, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                    }
                    function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            flowRowOverflow3222.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
            startRestartGroup.updateRememberedValue(arrayList222);
            obj = arrayList222;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts222 = LayoutKt.combineAsVirtualLayouts((List) obj);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
            changed = startRestartGroup.changed(rowMeasurementMultiContentHelper222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(rowMeasurementMultiContentHelper222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            MeasurePolicy measurePolicy222 = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, measurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl.getInserting()) {
            }
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts222.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            vertical3 = vertical4222;
            i12 = i20222;
            modifier2 = companion;
            flowRowOverflow2 = flowRowOverflow3222;
            i13 = i19222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        horizontal2 = horizontal;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        vertical2 = vertical;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i;
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i4 & 32;
        if (i11 != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 == 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
        int i182222 = i5 & 458752;
        if (i182222 == 131072) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Arrangement.Vertical vertical42222 = top;
        int i192222 = i17;
        int i202222 = i16;
        FlowRowOverflow flowRowOverflow32222 = clip;
        MultiContentMeasurePolicy rowMeasurementMultiContentHelper2222 = rowMeasurementMultiContentHelper(horizontal2, top, i16, i17, flowLayoutOverflowState2222, startRestartGroup, (i5 >> 3) & 8190);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
        if (i182222 == 131072) {
        }
        z2 = ((3670016 & i5) == 1048576) | (i182222 == 131072);
        Object rememberedValue32222 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        ArrayList arrayList2222 = new ArrayList();
        arrayList2222.add(ComposableLambdaKt.composableLambdaInstance(-139531073, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i21) {
                ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                if ((i21 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-139531073, i21, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                }
                function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        flowRowOverflow32222.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
        startRestartGroup.updateRememberedValue(arrayList2222);
        obj = arrayList2222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
        Function2<Composer, Integer, Unit> combineAsVirtualLayouts2222 = LayoutKt.combineAsVirtualLayouts((List) obj);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
        changed = startRestartGroup.changed(rowMeasurementMultiContentHelper2222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(rowMeasurementMultiContentHelper2222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        MeasurePolicy measurePolicy2222 = (MeasurePolicy) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, measurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        combineAsVirtualLayouts2222.invoke(startRestartGroup, 0);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        vertical3 = vertical42222;
        i12 = i202222;
        modifier2 = companion;
        flowRowOverflow2 = flowRowOverflow32222;
        i13 = i192222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ab, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, int i2, FlowColumnOverflow flowColumnOverflow, final Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        int i5;
        Arrangement.Vertical vertical2;
        int i6;
        Arrangement.Horizontal horizontal2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        FlowColumnOverflow clip;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object obj;
        boolean changed;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        final Arrangement.Horizontal horizontal3;
        final int i12;
        Modifier modifier2;
        FlowColumnOverflow flowColumnOverflow2;
        final int i13;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1704849416);
        ComposerKt.sourceInformation(startRestartGroup, "C(FlowColumn)P(4,6,1,2,3,5)157@6483L65,160@6573L172,167@6791L264,173@7060L105:FlowLayout.kt#2w3rfo");
        int i14 = i4 & 1;
        if (i14 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            vertical2 = vertical;
            i5 |= startRestartGroup.changed(vertical2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                horizontal2 = horizontal;
                i5 |= startRestartGroup.changed(horizontal2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i8 = i;
                    i5 |= startRestartGroup.changed(i8) ? 2048 : 1024;
                    i9 = i4 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i10 = i2;
                        i5 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i4 & 32;
                        if (i11 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(flowColumnOverflow) ? 131072 : 65536;
                        }
                        if ((i4 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier;
                            if (i15 != 0) {
                                vertical2 = Arrangement.INSTANCE.getTop();
                            }
                            Arrangement.Horizontal start = i6 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                            int i16 = i7 != 0 ? Integer.MAX_VALUE : i8;
                            int i17 = i9 == 0 ? i10 : Integer.MAX_VALUE;
                            clip = i11 != 0 ? FlowColumnOverflow.INSTANCE.getClip() : flowColumnOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1704849416, i5, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:156)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
                            int i18 = i5 & 458752;
                            z = i18 == 131072;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Arrangement.Horizontal horizontal4 = start;
                            int i19 = i17;
                            int i20 = i16;
                            FlowColumnOverflow flowColumnOverflow3 = clip;
                            MultiContentMeasurePolicy columnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(vertical2, start, i16, i17, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & 8190);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
                            z2 = ((3670016 & i5) == 1048576) | (i18 == 131072);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue3;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ComposableLambdaKt.composableLambdaInstance(985886665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i21) {
                                    ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                                    if ((i21 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(985886665, i21, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                                    }
                                    function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            flowColumnOverflow3.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
                            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts((List) obj);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
                            changed = startRestartGroup.changed(columnMeasurementMultiContentHelper);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(columnMeasurementMultiContentHelper);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            horizontal3 = horizontal4;
                            i12 = i20;
                            modifier2 = companion;
                            flowColumnOverflow2 = flowColumnOverflow3;
                            i13 = i19;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            flowColumnOverflow2 = flowColumnOverflow;
                            horizontal3 = horizontal2;
                            i12 = i8;
                            i13 = i10;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final Arrangement.Vertical vertical3 = vertical2;
                            final FlowColumnOverflow flowColumnOverflow4 = flowColumnOverflow2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i21) {
                                    FlowLayoutKt.FlowColumn(Modifier.this, vertical3, horizontal3, i12, i13, flowColumnOverflow4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i2;
                    i11 = i4 & 32;
                    if (i11 != 0) {
                    }
                    if ((i4 & 64) != 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
                    int i182 = i5 & 458752;
                    if (i182 == 131072) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Arrangement.Horizontal horizontal42 = start;
                    int i192 = i17;
                    int i202 = i16;
                    FlowColumnOverflow flowColumnOverflow32 = clip;
                    MultiContentMeasurePolicy columnMeasurementMultiContentHelper2 = columnMeasurementMultiContentHelper(vertical2, start, i16, i17, flowLayoutOverflowState2, startRestartGroup, (i5 >> 3) & 8190);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
                    if (i182 == 131072) {
                    }
                    z2 = ((3670016 & i5) == 1048576) | (i182 == 131072);
                    Object rememberedValue32 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(ComposableLambdaKt.composableLambdaInstance(985886665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i21) {
                            ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                            if ((i21 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(985886665, i21, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                            }
                            function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                    flowColumnOverflow32.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
                    startRestartGroup.updateRememberedValue(arrayList2);
                    obj = arrayList2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
                    Function2<Composer, Integer, Unit> combineAsVirtualLayouts2 = LayoutKt.combineAsVirtualLayouts((List) obj);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
                    changed = startRestartGroup.changed(columnMeasurementMultiContentHelper2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(columnMeasurementMultiContentHelper2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl.getInserting()) {
                    }
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    combineAsVirtualLayouts2.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    horizontal3 = horizontal42;
                    i12 = i202;
                    modifier2 = companion;
                    flowColumnOverflow2 = flowColumnOverflow32;
                    i13 = i192;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i;
                i9 = i4 & 16;
                if (i9 == 0) {
                }
                i10 = i2;
                i11 = i4 & 32;
                if (i11 != 0) {
                }
                if ((i4 & 64) != 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 == 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
                int i1822 = i5 & 458752;
                if (i1822 == 131072) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Arrangement.Horizontal horizontal422 = start;
                int i1922 = i17;
                int i2022 = i16;
                FlowColumnOverflow flowColumnOverflow322 = clip;
                MultiContentMeasurePolicy columnMeasurementMultiContentHelper22 = columnMeasurementMultiContentHelper(vertical2, start, i16, i17, flowLayoutOverflowState22, startRestartGroup, (i5 >> 3) & 8190);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
                if (i1822 == 131072) {
                }
                z2 = ((3670016 & i5) == 1048576) | (i1822 == 131072);
                Object rememberedValue322 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                ArrayList arrayList22 = new ArrayList();
                arrayList22.add(ComposableLambdaKt.composableLambdaInstance(985886665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i21) {
                        ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                        if ((i21 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(985886665, i21, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                        }
                        function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                flowColumnOverflow322.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
                startRestartGroup.updateRememberedValue(arrayList22);
                obj = arrayList22;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
                Function2<Composer, Integer, Unit> combineAsVirtualLayouts22 = LayoutKt.combineAsVirtualLayouts((List) obj);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
                changed = startRestartGroup.changed(columnMeasurementMultiContentHelper22);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(columnMeasurementMultiContentHelper22);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                MeasurePolicy measurePolicy22 = (MeasurePolicy) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl.getInserting()) {
                }
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                combineAsVirtualLayouts22.invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontal3 = horizontal422;
                i12 = i2022;
                modifier2 = companion;
                flowColumnOverflow2 = flowColumnOverflow322;
                i13 = i1922;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            horizontal2 = horizontal;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i;
            i9 = i4 & 16;
            if (i9 == 0) {
            }
            i10 = i2;
            i11 = i4 & 32;
            if (i11 != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 == 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
            int i18222 = i5 & 458752;
            if (i18222 == 131072) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Arrangement.Horizontal horizontal4222 = start;
            int i19222 = i17;
            int i20222 = i16;
            FlowColumnOverflow flowColumnOverflow3222 = clip;
            MultiContentMeasurePolicy columnMeasurementMultiContentHelper222 = columnMeasurementMultiContentHelper(vertical2, start, i16, i17, flowLayoutOverflowState222, startRestartGroup, (i5 >> 3) & 8190);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
            if (i18222 == 131072) {
            }
            z2 = ((3670016 & i5) == 1048576) | (i18222 == 131072);
            Object rememberedValue3222 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            ArrayList arrayList222 = new ArrayList();
            arrayList222.add(ComposableLambdaKt.composableLambdaInstance(985886665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i21) {
                    ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                    if ((i21 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(985886665, i21, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                    }
                    function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            flowColumnOverflow3222.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
            startRestartGroup.updateRememberedValue(arrayList222);
            obj = arrayList222;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts222 = LayoutKt.combineAsVirtualLayouts((List) obj);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
            changed = startRestartGroup.changed(columnMeasurementMultiContentHelper222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(columnMeasurementMultiContentHelper222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            MeasurePolicy measurePolicy222 = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, measurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl.getInserting()) {
            }
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts222.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            horizontal3 = horizontal4222;
            i12 = i20222;
            modifier2 = companion;
            flowColumnOverflow2 = flowColumnOverflow3222;
            i13 = i19222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        vertical2 = vertical;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        horizontal2 = horizontal;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i;
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i4 & 32;
        if (i11 != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 == 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
        int i182222 = i5 & 458752;
        if (i182222 == 131072) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Arrangement.Horizontal horizontal42222 = start;
        int i192222 = i17;
        int i202222 = i16;
        FlowColumnOverflow flowColumnOverflow32222 = clip;
        MultiContentMeasurePolicy columnMeasurementMultiContentHelper2222 = columnMeasurementMultiContentHelper(vertical2, start, i16, i17, flowLayoutOverflowState2222, startRestartGroup, (i5 >> 3) & 8190);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
        if (i182222 == 131072) {
        }
        z2 = ((3670016 & i5) == 1048576) | (i182222 == 131072);
        Object rememberedValue32222 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        ArrayList arrayList2222 = new ArrayList();
        arrayList2222.add(ComposableLambdaKt.composableLambdaInstance(985886665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowColumn$list$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i21) {
                ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                if ((i21 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(985886665, i21, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                }
                function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        flowColumnOverflow32222.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
        startRestartGroup.updateRememberedValue(arrayList2222);
        obj = arrayList2222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
        Function2<Composer, Integer, Unit> combineAsVirtualLayouts2222 = LayoutKt.combineAsVirtualLayouts((List) obj);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
        changed = startRestartGroup.changed(columnMeasurementMultiContentHelper2222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(columnMeasurementMultiContentHelper2222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        MeasurePolicy measurePolicy2222 = (MeasurePolicy) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, measurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        combineAsVirtualLayouts2222.invoke(startRestartGroup, 0);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        horizontal3 = horizontal42222;
        i12 = i202222;
        modifier2 = companion;
        flowColumnOverflow2 = flowColumnOverflow32222;
        i13 = i192222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r20.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, Composer composer, int i2) {
        boolean z;
        boolean z2;
        MeasurePolicy rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1479255111, "C(rowMeasurementHelper)P(!1,2)380@13086L883:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:379)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -75342195, "CC(remember):FlowLayout.kt#9igjgp");
        if (((i2 & 14) ^ 6) <= 4) {
        }
        if ((i2 & 6) != 4) {
            z = false;
            z2 = z | ((((i2 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
            rememberedValue = composer.rememberedValue();
            if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        return MultiContentMeasurePolicy.this.mo629measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return measurePolicy;
        }
        z = true;
        if (((i2 & 896) ^ 384) > 256) {
            z2 = z | ((((i2 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
            rememberedValue = composer.rememberedValue();
            if (!z2) {
            }
            final MultiContentMeasurePolicy flowMeasurePolicy2 = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    return MultiContentMeasurePolicy.this.mo629measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
                }
            };
            composer.updateRememberedValue(rememberedValue);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return measurePolicy2;
        }
        z2 = z | ((((i2 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
        rememberedValue = composer.rememberedValue();
        if (!z2) {
        }
        final MultiContentMeasurePolicy flowMeasurePolicy22 = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
        rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                return MultiContentMeasurePolicy.this.mo629measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
            }
        };
        composer.updateRememberedValue(rememberedValue);
        MeasurePolicy measurePolicy22 = (MeasurePolicy) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return measurePolicy22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r22.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i3) {
        boolean z;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, -2134502475, "C(rowMeasurementMultiContentHelper)P(!1,4)414@14301L649:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2134502475, i3, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 744443043, "CC(remember):FlowLayout.kt#9igjgp");
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
            z = false;
            changed = z | ((((i3 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
            rememberedValue = composer.rememberedValue();
            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, i2, flowLayoutOverflowState, null);
                composer.updateRememberedValue(rememberedValue);
            }
            FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return flowMeasurePolicy;
        }
        z = true;
        if (((i3 & 7168) ^ 3072) > 2048) {
            changed = z | ((((i3 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, i2, flowLayoutOverflowState, null);
            composer.updateRememberedValue(rememberedValue);
            FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return flowMeasurePolicy2;
        }
        changed = z | ((((i3 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, i2, flowLayoutOverflowState, null);
        composer.updateRememberedValue(rememberedValue);
        FlowMeasurePolicy flowMeasurePolicy22 = (FlowMeasurePolicy) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return flowMeasurePolicy22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r20.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, Composer composer, int i2) {
        boolean z;
        boolean z2;
        MeasurePolicy rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, -2013098357, "C(columnMeasurementHelper)P(2)443@15212L856:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i2, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:442)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1837869538, "CC(remember):FlowLayout.kt#9igjgp");
        if (((i2 & 14) ^ 6) <= 4) {
        }
        if ((i2 & 6) != 4) {
            z = false;
            z2 = z | ((((i2 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
            rememberedValue = composer.rememberedValue();
            if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        return FlowMeasurePolicy.this.mo629measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return measurePolicy;
        }
        z = true;
        if (((i2 & 896) ^ 384) > 256) {
            z2 = z | ((((i2 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
            rememberedValue = composer.rememberedValue();
            if (!z2) {
            }
            final FlowMeasurePolicy flowMeasurePolicy2 = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    return FlowMeasurePolicy.this.mo629measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
                }
            };
            composer.updateRememberedValue(rememberedValue);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return measurePolicy2;
        }
        z2 = z | ((((i2 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
        rememberedValue = composer.rememberedValue();
        if (!z2) {
        }
        final FlowMeasurePolicy flowMeasurePolicy22 = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
        rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                return FlowMeasurePolicy.this.mo629measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
            }
        };
        composer.updateRememberedValue(rememberedValue);
        MeasurePolicy measurePolicy22 = (MeasurePolicy) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return measurePolicy22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r22.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i3) {
        boolean z;
        boolean changed;
        Object rememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 748776953, "C(columnMeasurementMultiContentHelper)P(4)475@16365L652:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(748776953, i3, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:474)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 287541334, "CC(remember):FlowLayout.kt#9igjgp");
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
            z = false;
            changed = z | ((((i3 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
            rememberedValue = composer.rememberedValue();
            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, i2, flowLayoutOverflowState, null);
                composer.updateRememberedValue(rememberedValue);
            }
            FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return flowMeasurePolicy;
        }
        z = true;
        if (((i3 & 7168) ^ 3072) > 2048) {
            changed = z | ((((i3 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, i2, flowLayoutOverflowState, null);
            composer.updateRememberedValue(rememberedValue);
            FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return flowMeasurePolicy2;
        }
        changed = z | ((((i3 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, i2, flowLayoutOverflowState, null);
        composer.updateRememberedValue(rememberedValue);
        FlowMeasurePolicy flowMeasurePolicy22 = (FlowMeasurePolicy) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return flowMeasurePolicy22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r5v13, types: [kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i7 = 0; i7 < size2; i7++) {
            iArr2[i7] = 0;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            int intValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i8), Integer.valueOf(i)).intValue();
            iArr[i8] = intValue;
            iArr2[i8] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i8), Integer.valueOf(intValue)).intValue();
        }
        int i9 = Integer.MAX_VALUE;
        if (i5 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
            i9 = i4 * i5;
        }
        int min = Math.min(i9 - (((i9 >= list.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i9 < list.size() || i5 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int sum = ArraysKt.sum(iArr) + ((list.size() - 1) * i2);
        if (size2 != 0) {
            int i10 = iArr2[0];
            ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i11 = iArr2[it.nextInt()];
                if (i10 < i11) {
                    i10 = i11;
                }
            }
            if (size != 0) {
                int i12 = iArr[0];
                ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i13 = iArr[it2.nextInt()];
                    if (i12 < i13) {
                        i12 = i13;
                    }
                }
                int i14 = i12;
                int i15 = sum;
                while (i14 <= i15 && i10 != i) {
                    int i16 = (i14 + i15) / 2;
                    int i17 = i15;
                    int i18 = i14;
                    long intrinsicCrossAxisSize = intrinsicCrossAxisSize(list, iArr, iArr2, i16, i2, i3, i4, i5, flowLayoutOverflowState);
                    i10 = IntIntPair.m28getFirstimpl(intrinsicCrossAxisSize);
                    int m29getSecondimpl = IntIntPair.m29getSecondimpl(intrinsicCrossAxisSize);
                    if (i10 > i || m29getSecondimpl < min) {
                        i14 = i16 + 1;
                        if (i14 > i17) {
                            return i14;
                        }
                        i15 = i17;
                        sum = i16;
                    } else {
                        if (i10 >= i) {
                            return i16;
                        }
                        i15 = i16 - 1;
                        sum = i16;
                        i14 = i18;
                    }
                }
                return sum;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        return intrinsicCrossAxisSize(list, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i6, int i7) {
                return Integer.valueOf(iArr[i6]);
            }
        }, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i6, int i7) {
                return Integer.valueOf(iArr2[i6]);
            }
        }, i, i2, i3, i4, i5, flowLayoutOverflowState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6;
        int i7;
        int i8 = 0;
        if (list.isEmpty()) {
            return IntIntPair.m24constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, OrientationIndependentConstraints.m648constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int intValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        if (flowLayoutBuildingBlocks.m604getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m24constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m21boximpl(IntIntPair.m24constructorimpl(intValue2, intValue)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair m609ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m609ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m24constructorimpl(m609ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m29getSecondimpl(m609ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i12 = i;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 >= size) {
                i6 = i14;
                break;
            }
            int i16 = i12 - intValue2;
            i6 = i13 + 1;
            int max = Math.max(i11, intValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i6);
            int intValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(i)).intValue() : i8;
            int intValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(intValue3)).intValue() + i2 : 0;
            boolean z = i13 + 2 < list.size();
            int i17 = i6 - i15;
            FlowLayoutBuildingBlocks.WrapInfo m604getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m604getWrapInfoOpUlnko(z, i17, IntIntPair.m24constructorimpl(i16, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m21boximpl(IntIntPair.m24constructorimpl(intValue4, intValue3)), i9, i10, max, false, false);
            if (m604getWrapInfoOpUlnko.getIsLastItemInLine()) {
                i10 += max + i3;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m604getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i9, i10, i16, i17);
                int i18 = intValue4 - i2;
                i9++;
                if (!m604getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    i7 = i;
                    intValue2 = i18;
                    i15 = i6;
                    i11 = 0;
                } else if (wrapEllipsisInfo != null) {
                    long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                    if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                        i10 += IntIntPair.m29getSecondimpl(ellipsisSize) + i3;
                    }
                }
            } else {
                i11 = max;
                i7 = i16;
                intValue2 = intValue4;
            }
            i13 = i6;
            i14 = i13;
            i8 = 0;
            i12 = i7;
            intValue = intValue3;
        }
        return IntIntPair.m24constructorimpl(i10 - i3, i6);
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        Measurable next;
        try {
            if (it instanceof ContextualFlowItemIterator) {
                Intrinsics.checkNotNull(flowLineInfo);
                next = ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
            } else {
                next = it.next();
            }
            return next;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m607measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j, Function1<? super Placeable, Unit> function1) {
        FlowLayoutData flowLayoutData;
        Measurable measurable2 = measurable;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable2)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable2);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j);
                function1.invoke(mo5175measureBRTryo0);
                return IntIntPair.m24constructorimpl(flowLineMeasurePolicy.mainAxisSize(mo5175measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(mo5175measureBRTryo0));
            }
        }
        int mainAxisMin = mainAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m24constructorimpl(mainAxisMin, crossAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), mainAxisMin));
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m608placeHelperBmaY500(MeasureScope measureScope, long j, int i, int i2, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int i3;
        boolean isHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (isHorizontal) {
            if (verticalArrangement == null) {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
            i3 = RangesKt.coerceIn((measureScope.mo367roundToPx0680j_4(verticalArrangement.getSpacing()) * (mutableVector.getSize() - 1)) + i2, Constraints.m6253getMinHeightimpl(j), Constraints.m6251getMaxHeightimpl(j));
            verticalArrangement.arrange(measureScope, i3, iArr, iArr2);
        } else {
            if (horizontalArrangement == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
            int coerceIn = RangesKt.coerceIn((measureScope.mo367roundToPx0680j_4(horizontalArrangement.getSpacing()) * (mutableVector.getSize() - 1)) + i2, Constraints.m6253getMinHeightimpl(j), Constraints.m6251getMaxHeightimpl(j));
            horizontalArrangement.arrange(measureScope, coerceIn, iArr, measureScope.getLayoutDirection(), iArr2);
            i3 = coerceIn;
        }
        int coerceIn2 = RangesKt.coerceIn(i, Constraints.m6254getMinWidthimpl(j), Constraints.m6252getMaxWidthimpl(j));
        if (!isHorizontal) {
            int i4 = i3;
            i3 = coerceIn2;
            coerceIn2 = i4;
        }
        return MeasureScope.layout$default(measureScope, coerceIn2, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    MeasureResult[] content = mutableVector2.getContent();
                    int i5 = 0;
                    do {
                        content[i5].placeChildren();
                        i5++;
                    } while (i5 < size);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = function3.invoke(list.get(i4), Integer.valueOf(i4), Integer.valueOf(i)).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, (i7 + intValue) - i2);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m606breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f, float f2, long j, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        Measurable measurable;
        Integer num;
        FlowLineInfo flowLineInfo;
        Measurable measurable2;
        Ref.ObjectRef objectRef;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        long j2;
        MutableIntList mutableIntList;
        MutableVector mutableVector;
        MutableIntList mutableIntList2;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        MutableIntObjectMap mutableIntObjectMap;
        ArrayList arrayList2;
        int i6;
        int i7;
        int height;
        int width;
        int i8;
        MutableIntObjectMap mutableIntObjectMap2;
        ArrayList arrayList3;
        int i9;
        int i10;
        long j3;
        IntIntPair intIntPair;
        FlowLineInfo flowLineInfo2;
        IntIntPair m21boximpl;
        MutableIntList mutableIntList3;
        MutableIntList mutableIntList4;
        int i11;
        int i12;
        Integer num2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i18;
        int i19;
        int coerceAtLeast;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector2 = new MutableVector(new MeasureResult[16], 0);
        int m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j);
        int m6254getMinWidthimpl = Constraints.m6254getMinWidthimpl(j);
        int m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j);
        MutableIntObjectMap mutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList4 = new ArrayList();
        int ceil = (int) Math.ceil(measureScope.mo373toPx0680j_4(f));
        int ceil2 = (int) Math.ceil(measureScope.mo373toPx0680j_4(f2));
        long m648constructorimpl = OrientationIndependentConstraints.m648constructorimpl(0, m6252getMaxWidthimpl, 0, m6251getMaxHeightimpl);
        long m663toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m663toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m652copyyUG9Ft0$default(m648constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        int i20 = 0;
        FlowLineInfo flowLineInfo3 = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope.mo370toDpu2uoSUM(m6252getMaxWidthimpl), measureScope.mo370toDpu2uoSUM(m6251getMaxHeightimpl), null) : null;
        Measurable safeNext = !it.hasNext() ? null : safeNext(it2, flowLineInfo3);
        IntIntPair m21boximpl2 = safeNext != null ? IntIntPair.m21boximpl(m607measureAndCacherqJ1uqs(safeNext, flowLineMeasurePolicy, m663toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                invoke2(placeable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable placeable) {
                objectRef2.element = placeable;
            }
        })) : null;
        Integer valueOf = m21boximpl2 != null ? Integer.valueOf(IntIntPair.m28getFirstimpl(m21boximpl2.getPackedValue())) : null;
        if (m21boximpl2 != null) {
            measurable = safeNext;
            num = Integer.valueOf(IntIntPair.m29getSecondimpl(m21boximpl2.getPackedValue()));
        } else {
            measurable = safeNext;
            num = null;
        }
        FlowLineInfo flowLineInfo4 = flowLineInfo3;
        MutableIntList mutableIntList5 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList6 = new MutableIntList(0, 1, null);
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j, i2, ceil, ceil2, null);
        FlowLayoutBuildingBlocks.WrapInfo m604getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m604getWrapInfoOpUlnko(it.hasNext(), 0, IntIntPair.m24constructorimpl(m6252getMaxWidthimpl, m6251getMaxHeightimpl), m21boximpl2, 0, 0, 0, false, false);
        if (m604getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            flowLineInfo = flowLineInfo4;
            objectRef = objectRef2;
            j2 = m663toBoxConstraintsOenEA2s;
            boolean z = m21boximpl2 != null;
            i3 = ceil2;
            i4 = ceil;
            measurable2 = measurable;
            i5 = m6254getMinWidthimpl;
            mutableVector = mutableVector2;
            arrayList = arrayList4;
            mutableIntList = mutableIntList5;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m604getWrapInfoOpUlnko, z, -1, 0, m6252getMaxWidthimpl, 0);
        } else {
            flowLineInfo = flowLineInfo4;
            measurable2 = measurable;
            objectRef = objectRef2;
            i3 = ceil2;
            i4 = ceil;
            i5 = m6254getMinWidthimpl;
            arrayList = arrayList4;
            j2 = m663toBoxConstraintsOenEA2s;
            mutableIntList = mutableIntList5;
            mutableVector = mutableVector2;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = null;
        }
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        MutableIntList mutableIntList7 = mutableIntList;
        int i21 = m6251getMaxHeightimpl;
        Measurable measurable3 = measurable2;
        int i22 = i5;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = m6252getMaxWidthimpl;
        while (!m604getWrapInfoOpUlnko.getIsLastItemInContainer() && measurable3 != null) {
            Intrinsics.checkNotNull(valueOf);
            int intValue = valueOf.intValue();
            Intrinsics.checkNotNull(num);
            int i29 = m6251getMaxHeightimpl;
            int i30 = i26 + intValue;
            int max = Math.max(i27, num.intValue());
            int i31 = i28 - intValue;
            MutableIntList mutableIntList8 = mutableIntList2;
            int i32 = i25 + 1;
            int i33 = m6252getMaxWidthimpl;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i32);
            arrayList.add(measurable3);
            final Ref.ObjectRef objectRef3 = objectRef;
            mutableIntObjectMapOf.set(i25, objectRef3.element);
            int i34 = i32 - i23;
            int i35 = i23;
            FlowLineInfo flowLineInfo5 = flowLineInfo;
            boolean z2 = i34 < i;
            if (flowLineInfo5 != null) {
                int i36 = z2 ? i20 : i20 + 1;
                mutableIntObjectMap2 = mutableIntObjectMapOf;
                int i37 = z2 ? i34 : 0;
                if (z2) {
                    arrayList3 = arrayList;
                    i9 = i32;
                    i18 = 0;
                    i19 = RangesKt.coerceAtLeast(i31 - i4, 0);
                } else {
                    arrayList3 = arrayList;
                    i9 = i32;
                    i18 = 0;
                    i19 = i33;
                }
                float f3 = measureScope.mo370toDpu2uoSUM(i19);
                if (z2) {
                    i8 = i22;
                    coerceAtLeast = i21;
                } else {
                    i8 = i22;
                    coerceAtLeast = RangesKt.coerceAtLeast((i21 - max) - i3, i18);
                }
                flowLineInfo5.m617update4j6BHR0$foundation_layout_release(i36, i37, f3, measureScope.mo370toDpu2uoSUM(coerceAtLeast));
            } else {
                i8 = i22;
                mutableIntObjectMap2 = mutableIntObjectMapOf;
                arrayList3 = arrayList;
                i9 = i32;
            }
            Measurable safeNext2 = !it.hasNext() ? null : safeNext(it2, flowLineInfo5);
            objectRef3.element = null;
            if (safeNext2 != null) {
                i10 = i30;
                j3 = j2;
                intIntPair = IntIntPair.m21boximpl(m607measureAndCacherqJ1uqs(safeNext2, flowLineMeasurePolicy, j3, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                        invoke2(placeable);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable placeable) {
                        objectRef3.element = placeable;
                    }
                }));
            } else {
                i10 = i30;
                j3 = j2;
                intIntPair = null;
            }
            Integer valueOf2 = intIntPair != null ? Integer.valueOf(IntIntPair.m28getFirstimpl(intIntPair.getPackedValue()) + i4) : null;
            Integer valueOf3 = intIntPair != null ? Integer.valueOf(IntIntPair.m29getSecondimpl(intIntPair.getPackedValue())) : null;
            boolean hasNext = it.hasNext();
            long m24constructorimpl = IntIntPair.m24constructorimpl(i31, i21);
            if (intIntPair == null) {
                flowLineInfo2 = flowLineInfo5;
                m21boximpl = null;
            } else {
                Intrinsics.checkNotNull(valueOf2);
                int intValue2 = valueOf2.intValue();
                Intrinsics.checkNotNull(valueOf3);
                flowLineInfo2 = flowLineInfo5;
                m21boximpl = IntIntPair.m21boximpl(IntIntPair.m24constructorimpl(intValue2, valueOf3.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo m604getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m604getWrapInfoOpUlnko(hasNext, i34, m24constructorimpl, m21boximpl, i20, i24, max, false, false);
            if (m604getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                int min = Math.min(Math.max(i8, i10), i33);
                int i38 = i24 + max;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m604getWrapInfoOpUlnko2, intIntPair != null, i20, i38, i31, i34);
                mutableIntList3 = mutableIntList8;
                mutableIntList3.add(max);
                int i39 = (i29 - i38) - i3;
                MutableIntList mutableIntList9 = mutableIntList7;
                i16 = i9;
                mutableIntList9.add(i16);
                i20++;
                i24 = i38 + i3;
                m604getWrapInfoOpUlnko = m604getWrapInfoOpUlnko2;
                i12 = i33;
                mutableIntList4 = mutableIntList9;
                i11 = i16;
                num2 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - i4) : null;
                i13 = 0;
                i14 = i39;
                i15 = min;
                i17 = 0;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                m6252getMaxWidthimpl = i12;
            } else {
                m604getWrapInfoOpUlnko = m604getWrapInfoOpUlnko2;
                int i40 = i10;
                int i41 = i8;
                mutableIntList3 = mutableIntList8;
                m6252getMaxWidthimpl = i33;
                mutableIntList4 = mutableIntList7;
                i11 = i9;
                i12 = i31;
                num2 = valueOf2;
                i13 = max;
                i14 = i21;
                i15 = i41;
                i16 = i35;
                i17 = i40;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            mutableIntList7 = mutableIntList4;
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            i23 = i16;
            arrayList = arrayList3;
            num = valueOf3;
            it2 = it;
            objectRef = objectRef3;
            measurable3 = safeNext2;
            i25 = i11;
            i28 = i12;
            long j4 = j3;
            i22 = i15;
            i26 = i17;
            i27 = i13;
            i21 = i14;
            m6251getMaxHeightimpl = i29;
            mutableIntList2 = mutableIntList3;
            valueOf = num2;
            mutableIntObjectMapOf = mutableIntObjectMap2;
            flowLineInfo = flowLineInfo2;
            j2 = j4;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapOf;
        ArrayList arrayList5 = arrayList;
        MutableIntList mutableIntList10 = mutableIntList2;
        MutableIntList mutableIntList11 = mutableIntList7;
        int i42 = i22;
        if (wrapEllipsisInfo3 != null) {
            arrayList2 = arrayList5;
            arrayList2.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList2.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i43 = mutableIntList11._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int size = mutableIntList11.getSize() - 1;
                mutableIntList10.set(i43, Math.max(mutableIntList10.get(i43), IntIntPair.m29getSecondimpl(wrapEllipsisInfo3.getEllipsisSize())));
                mutableIntList11.set(size, mutableIntList11.last() + 1);
            } else {
                mutableIntList10.add(IntIntPair.m29getSecondimpl(wrapEllipsisInfo3.getEllipsisSize()));
                mutableIntList11.add(mutableIntList11.last() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
            arrayList2 = arrayList5;
        }
        int size2 = arrayList2.size();
        Placeable[] placeableArr = new Placeable[size2];
        for (int i44 = 0; i44 < size2; i44++) {
            placeableArr[i44] = mutableIntObjectMap.get(i44);
        }
        int size3 = mutableIntList11.getSize();
        int[] iArr = new int[size3];
        for (int i45 = 0; i45 < size3; i45++) {
            iArr[i45] = 0;
        }
        int i46 = 0;
        int size4 = mutableIntList11.getSize();
        int[] iArr2 = new int[size4];
        for (int i47 = 0; i47 < size4; i47++) {
            iArr2[i47] = 0;
        }
        MutableIntList mutableIntList12 = mutableIntList11;
        int[] iArr3 = mutableIntList12.content;
        int i48 = mutableIntList12._size;
        int i49 = i42;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i50 < i48) {
            int i53 = iArr3[i50];
            int i54 = i49;
            int i55 = i48;
            int[] iArr4 = iArr3;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            int i56 = i52;
            Placeable[] placeableArr3 = placeableArr2;
            MutableIntList mutableIntList13 = mutableIntList10;
            int i57 = i46;
            int i58 = i50;
            MeasureResult measure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy, i49, Constraints.m6253getMinHeightimpl(m648constructorimpl), Constraints.m6252getMaxWidthimpl(m648constructorimpl), mutableIntList10.get(i50), i4, measureScope, arrayList2, placeableArr2, i56, i53, iArr6, i50);
            if (flowLineMeasurePolicy.isHorizontal()) {
                height = measure.getWidth();
                width = measure.getHeight();
            } else {
                height = measure.getHeight();
                width = measure.getWidth();
            }
            iArr5[i58] = width;
            i51 += width;
            i49 = Math.max(i54, height);
            mutableVector.add(measure);
            i50 = i58 + 1;
            placeableArr2 = placeableArr3;
            i52 = i53;
            i48 = i55;
            iArr3 = iArr4;
            iArr2 = iArr5;
            iArr = iArr6;
            mutableIntList10 = mutableIntList13;
            i46 = i57;
        }
        int i59 = i49;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        int i60 = i46;
        MutableVector mutableVector3 = mutableVector;
        if (mutableVector3.isEmpty()) {
            i6 = i60;
            i7 = i6;
        } else {
            i6 = i59;
            i7 = i51;
        }
        return m608placeHelperBmaY500(measureScope, j, i6, i7, iArr7, mutableVector3, flowLineMeasurePolicy, iArr8);
    }
}
