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

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, int i2, FlowRowOverflow flowRowOverflow, final Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
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
        Composer m3316constructorimpl;
        final FlowRowOverflow flowRowOverflow2;
        final Arrangement.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final int i12;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(437853230);
        ComposerKt.sourceInformation(startRestartGroup, "C(FlowRow)P(4,1,6,2,3,5)93@4089L65,96@4179L166,103@4391L261,110@4658L105:FlowLayout.kt#2w3rfo");
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
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
                            Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                            Arrangement.Horizontal start = i14 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                            if (i6 != 0) {
                                vertical2 = Arrangement.INSTANCE.getTop();
                            }
                            if (i7 != 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                            int i15 = i9 != 0 ? Integer.MAX_VALUE : i10;
                            clip = i11 != 0 ? FlowRowOverflow.INSTANCE.getClip() : flowRowOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(437853230, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:92)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
                            int i16 = 458752 & i5;
                            z = i16 == 131072;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Arrangement.Vertical vertical4 = vertical2;
                            Arrangement.Horizontal horizontal4 = start;
                            MultiContentMeasurePolicy rowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(horizontal4, vertical4, i8, i15, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & 8190);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
                            z2 = ((i5 & 3670016) == 1048576) | (i16 == 131072);
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

                                public final void invoke(Composer composer2, int i17) {
                                    ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-139531073, i17, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                                    }
                                    function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
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
                            Modifier modifier4 = companion;
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
                            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                            Updater.m3323setimpl(m3316constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            flowRowOverflow2 = clip;
                            horizontal3 = horizontal4;
                            vertical3 = vertical4;
                            i12 = i15;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            flowRowOverflow2 = flowRowOverflow;
                            modifier3 = modifier2;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                            i12 = i10;
                        }
                        final int i17 = i8;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
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

                                public final void invoke(Composer composer2, int i18) {
                                    FlowLayoutKt.FlowRow(Modifier.this, horizontal3, vertical3, i17, i12, flowRowOverflow2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
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
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
                    int i162 = 458752 & i5;
                    if (i162 == 131072) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Arrangement.Vertical vertical42 = vertical2;
                    Arrangement.Horizontal horizontal42 = start;
                    MultiContentMeasurePolicy rowMeasurementMultiContentHelper2 = rowMeasurementMultiContentHelper(horizontal42, vertical42, i8, i15, flowLayoutOverflowState2, startRestartGroup, (i5 >> 3) & 8190);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
                    if (i162 == 131072) {
                    }
                    z2 = ((i5 & 3670016) == 1048576) | (i162 == 131072);
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

                        public final void invoke(Composer composer2, int i172) {
                            ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                            if ((i172 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-139531073, i172, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                            }
                            function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                    clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
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
                    Modifier modifier42 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                    Updater.m3323setimpl(m3316constructorimpl, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3316constructorimpl.getInserting()) {
                    }
                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    combineAsVirtualLayouts2.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    flowRowOverflow2 = clip;
                    horizontal3 = horizontal42;
                    vertical3 = vertical42;
                    i12 = i15;
                    modifier3 = modifier42;
                    final int i172 = i8;
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
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
                int i1622 = 458752 & i5;
                if (i1622 == 131072) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Arrangement.Vertical vertical422 = vertical2;
                Arrangement.Horizontal horizontal422 = start;
                MultiContentMeasurePolicy rowMeasurementMultiContentHelper22 = rowMeasurementMultiContentHelper(horizontal422, vertical422, i8, i15, flowLayoutOverflowState22, startRestartGroup, (i5 >> 3) & 8190);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
                if (i1622 == 131072) {
                }
                z2 = ((i5 & 3670016) == 1048576) | (i1622 == 131072);
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

                    public final void invoke(Composer composer2, int i1722) {
                        ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                        if ((i1722 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-139531073, i1722, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                        }
                        function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
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
                Modifier modifier422 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                Updater.m3323setimpl(m3316constructorimpl, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3316constructorimpl.getInserting()) {
                }
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                combineAsVirtualLayouts22.invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                flowRowOverflow2 = clip;
                horizontal3 = horizontal422;
                vertical3 = vertical422;
                i12 = i15;
                modifier3 = modifier422;
                final int i1722 = i8;
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
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
            int i16222 = 458752 & i5;
            if (i16222 == 131072) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Arrangement.Vertical vertical4222 = vertical2;
            Arrangement.Horizontal horizontal4222 = start;
            MultiContentMeasurePolicy rowMeasurementMultiContentHelper222 = rowMeasurementMultiContentHelper(horizontal4222, vertical4222, i8, i15, flowLayoutOverflowState222, startRestartGroup, (i5 >> 3) & 8190);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
            if (i16222 == 131072) {
            }
            z2 = ((i5 & 3670016) == 1048576) | (i16222 == 131072);
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

                public final void invoke(Composer composer2, int i17222) {
                    ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                    if ((i17222 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-139531073, i17222, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                    }
                    function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
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
            Modifier modifier4222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, measurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3316constructorimpl.getInserting()) {
            }
            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts222.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            flowRowOverflow2 = clip;
            horizontal3 = horizontal4222;
            vertical3 = vertical4222;
            i12 = i15;
            modifier3 = modifier4222;
            final int i17222 = i8;
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
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454955587, "CC(remember):FlowLayout.kt#9igjgp");
        int i162222 = 458752 & i5;
        if (i162222 == 131072) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Arrangement.Vertical vertical42222 = vertical2;
        Arrangement.Horizontal horizontal42222 = start;
        MultiContentMeasurePolicy rowMeasurementMultiContentHelper2222 = rowMeasurementMultiContentHelper(horizontal42222, vertical42222, i8, i15, flowLayoutOverflowState2222, startRestartGroup, (i5 >> 3) & 8190);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 454965447, "CC(remember):FlowLayout.kt#9igjgp");
        if (i162222 == 131072) {
        }
        z2 = ((i5 & 3670016) == 1048576) | (i162222 == 131072);
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

            public final void invoke(Composer composer2, int i172222) {
                ComposerKt.sourceInformation(composer2, "C105@4547L9:FlowLayout.kt#2w3rfo");
                if ((i172222 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-139531073, i172222, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
                }
                function3.invoke(FlowRowScopeInstance.INSTANCE, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
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
        Modifier modifier42222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
        Updater.m3323setimpl(m3316constructorimpl, measurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        combineAsVirtualLayouts2222.invoke(startRestartGroup, 0);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        flowRowOverflow2 = clip;
        horizontal3 = horizontal42222;
        vertical3 = vertical42222;
        i12 = i15;
        modifier3 = modifier42222;
        final int i172222 = i8;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, int i2, FlowColumnOverflow flowColumnOverflow, final Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
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
        Composer m3316constructorimpl;
        final FlowColumnOverflow flowColumnOverflow2;
        final Arrangement.Vertical vertical3;
        final Arrangement.Horizontal horizontal3;
        final int i12;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1704849416);
        ComposerKt.sourceInformation(startRestartGroup, "C(FlowColumn)P(4,6,1,2,3,5)157@6483L65,160@6573L172,167@6791L264,173@7060L105:FlowLayout.kt#2w3rfo");
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
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
                            Modifier.Companion companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                            Arrangement.Vertical top = i14 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                            if (i6 != 0) {
                                horizontal2 = Arrangement.INSTANCE.getStart();
                            }
                            if (i7 != 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                            int i15 = i9 != 0 ? Integer.MAX_VALUE : i10;
                            clip = i11 != 0 ? FlowColumnOverflow.INSTANCE.getClip() : flowColumnOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1704849416, i5, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:156)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
                            int i16 = 458752 & i5;
                            z = i16 == 131072;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout_release();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Arrangement.Horizontal horizontal4 = horizontal2;
                            Arrangement.Vertical vertical4 = top;
                            MultiContentMeasurePolicy columnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(vertical4, horizontal4, i8, i15, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & 8190);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
                            z2 = ((i5 & 3670016) == 1048576) | (i16 == 131072);
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

                                public final void invoke(Composer composer2, int i17) {
                                    ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(985886665, i17, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                                    }
                                    function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState, arrayList);
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
                            Modifier modifier4 = companion;
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
                            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                            Updater.m3323setimpl(m3316constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            flowColumnOverflow2 = clip;
                            vertical3 = vertical4;
                            horizontal3 = horizontal4;
                            i12 = i15;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            flowColumnOverflow2 = flowColumnOverflow;
                            modifier3 = modifier2;
                            vertical3 = vertical2;
                            horizontal3 = horizontal2;
                            i12 = i10;
                        }
                        final int i17 = i8;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
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

                                public final void invoke(Composer composer2, int i18) {
                                    FlowLayoutKt.FlowColumn(Modifier.this, vertical3, horizontal3, i17, i12, flowColumnOverflow2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
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
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
                    int i162 = 458752 & i5;
                    if (i162 == 131072) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = clip.createOverflowState$foundation_layout_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    FlowLayoutOverflowState flowLayoutOverflowState2 = (FlowLayoutOverflowState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Arrangement.Horizontal horizontal42 = horizontal2;
                    Arrangement.Vertical vertical42 = top;
                    MultiContentMeasurePolicy columnMeasurementMultiContentHelper2 = columnMeasurementMultiContentHelper(vertical42, horizontal42, i8, i15, flowLayoutOverflowState2, startRestartGroup, (i5 >> 3) & 8190);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
                    if (i162 == 131072) {
                    }
                    z2 = ((i5 & 3670016) == 1048576) | (i162 == 131072);
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

                        public final void invoke(Composer composer2, int i172) {
                            ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                            if ((i172 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(985886665, i172, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                            }
                            function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                    clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2, arrayList2);
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
                    Modifier modifier42 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                    Updater.m3323setimpl(m3316constructorimpl, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3316constructorimpl.getInserting()) {
                    }
                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    combineAsVirtualLayouts2.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    flowColumnOverflow2 = clip;
                    vertical3 = vertical42;
                    horizontal3 = horizontal42;
                    i12 = i15;
                    modifier3 = modifier42;
                    final int i172 = i8;
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
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
                int i1622 = 458752 & i5;
                if (i1622 == 131072) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = clip.createOverflowState$foundation_layout_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
                FlowLayoutOverflowState flowLayoutOverflowState22 = (FlowLayoutOverflowState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Arrangement.Horizontal horizontal422 = horizontal2;
                Arrangement.Vertical vertical422 = top;
                MultiContentMeasurePolicy columnMeasurementMultiContentHelper22 = columnMeasurementMultiContentHelper(vertical422, horizontal422, i8, i15, flowLayoutOverflowState22, startRestartGroup, (i5 >> 3) & 8190);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
                if (i1622 == 131072) {
                }
                z2 = ((i5 & 3670016) == 1048576) | (i1622 == 131072);
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

                    public final void invoke(Composer composer2, int i1722) {
                        ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                        if ((i1722 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(985886665, i1722, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                        }
                        function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState22, arrayList22);
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
                Modifier modifier422 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                Updater.m3323setimpl(m3316constructorimpl, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3316constructorimpl.getInserting()) {
                }
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                combineAsVirtualLayouts22.invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                flowColumnOverflow2 = clip;
                vertical3 = vertical422;
                horizontal3 = horizontal422;
                i12 = i15;
                modifier3 = modifier422;
                final int i1722 = i8;
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
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
            int i16222 = 458752 & i5;
            if (i16222 == 131072) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = clip.createOverflowState$foundation_layout_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
            FlowLayoutOverflowState flowLayoutOverflowState222 = (FlowLayoutOverflowState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Arrangement.Horizontal horizontal4222 = horizontal2;
            Arrangement.Vertical vertical4222 = top;
            MultiContentMeasurePolicy columnMeasurementMultiContentHelper222 = columnMeasurementMultiContentHelper(vertical4222, horizontal4222, i8, i15, flowLayoutOverflowState222, startRestartGroup, (i5 >> 3) & 8190);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
            if (i16222 == 131072) {
            }
            z2 = ((i5 & 3670016) == 1048576) | (i16222 == 131072);
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

                public final void invoke(Composer composer2, int i17222) {
                    ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                    if ((i17222 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(985886665, i17222, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                    }
                    function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState222, arrayList222);
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
            Modifier modifier4222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, measurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3316constructorimpl.getInserting()) {
            }
            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts222.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            flowColumnOverflow2 = clip;
            vertical3 = vertical4222;
            horizontal3 = horizontal4222;
            i12 = i15;
            modifier3 = modifier4222;
            final int i17222 = i8;
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
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515615249, "CC(remember):FlowLayout.kt#9igjgp");
        int i162222 = 458752 & i5;
        if (i162222 == 131072) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = clip.createOverflowState$foundation_layout_release();
        startRestartGroup.updateRememberedValue(rememberedValue);
        FlowLayoutOverflowState flowLayoutOverflowState2222 = (FlowLayoutOverflowState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Arrangement.Horizontal horizontal42222 = horizontal2;
        Arrangement.Vertical vertical42222 = top;
        MultiContentMeasurePolicy columnMeasurementMultiContentHelper2222 = columnMeasurementMultiContentHelper(vertical42222, horizontal42222, i8, i15, flowLayoutOverflowState2222, startRestartGroup, (i5 >> 3) & 8190);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1515605194, "CC(remember):FlowLayout.kt#9igjgp");
        if (i162222 == 131072) {
        }
        z2 = ((i5 & 3670016) == 1048576) | (i162222 == 131072);
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

            public final void invoke(Composer composer2, int i172222) {
                ComposerKt.sourceInformation(composer2, "C169@6950L9:FlowLayout.kt#2w3rfo");
                if ((i172222 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(985886665, i172222, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
                }
                function3.invoke(FlowColumnScopeInstance.INSTANCE, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        clip.addOverflowComposables$foundation_layout_release(flowLayoutOverflowState2222, arrayList2222);
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
        Modifier modifier42222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
        Updater.m3323setimpl(m3316constructorimpl, measurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        combineAsVirtualLayouts2222.invoke(startRestartGroup, 0);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        flowColumnOverflow2 = clip;
        vertical3 = vertical42222;
        horizontal3 = horizontal42222;
        i12 = i15;
        modifier3 = modifier42222;
        final int i172222 = i8;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1479255111, "C(rowMeasurementHelper)P(!1,2)380@13086L883:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:379)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -75342195, "CC(remember):FlowLayout.kt#9igjgp");
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
        MeasurePolicy rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    return MultiContentMeasurePolicy.this.mo621measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
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

    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -2134502475, "C(rowMeasurementMultiContentHelper)P(!1,4)414@14301L649:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2134502475, i3, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 744443043, "CC(remember):FlowLayout.kt#9igjgp");
        boolean changed = ((((i3 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, i2, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            rememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return flowMeasurePolicy2;
    }

    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2013098357, "C(columnMeasurementHelper)P(2)443@15212L856:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i2, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:442)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1837869538, "CC(remember):FlowLayout.kt#9igjgp");
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
        MeasurePolicy rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, Integer.MAX_VALUE, FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout_release(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    return FlowMeasurePolicy.this.mo621measure3p2s80s(measureScope, CollectionsKt.listOf(list), j);
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

    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 748776953, "C(columnMeasurementMultiContentHelper)P(4)475@16365L652:FlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(748776953, i3, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:474)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 287541334, "CC(remember):FlowLayout.kt#9igjgp");
        boolean changed = ((((i3 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(i)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i2)) || (i3 & 3072) == 2048) | composer.changed(flowLayoutOverflowState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, i2, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            rememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return flowMeasurePolicy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r9v13, types: [kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6 = i4;
        int i7 = i5;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i9 = 0; i9 < size2; i9++) {
            iArr2[i9] = 0;
        }
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i10);
            int intValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i10), Integer.valueOf(i)).intValue();
            iArr[i10] = intValue;
            iArr2[i10] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i10), Integer.valueOf(intValue)).intValue();
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i11 = Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE && i6 != Integer.MAX_VALUE) {
            i11 = i6 * i7;
        }
        int min = Math.min(i11 - (((i11 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i11 < list2.size() || i7 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int sum = ArraysKt.sum(iArr) + ((list2.size() - 1) * i2);
        if (size2 != 0) {
            int i12 = iArr2[0];
            ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i13 = iArr2[it.nextInt()];
                if (i12 < i13) {
                    i12 = i13;
                }
            }
            if (size != 0) {
                int i14 = iArr[0];
                ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i15 = iArr[it2.nextInt()];
                    if (i14 < i15) {
                        i14 = i15;
                    }
                }
                int i16 = i14;
                int i17 = sum;
                while (i16 <= i17 && i12 != i) {
                    int i18 = (i16 + i17) / 2;
                    long intrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i18, i2, i3, i6, i7, flowLayoutOverflowState);
                    int m23getFirstimpl = IntIntPair.m23getFirstimpl(intrinsicCrossAxisSize);
                    int m24getSecondimpl = IntIntPair.m24getSecondimpl(intrinsicCrossAxisSize);
                    if (m23getFirstimpl > i || m24getSecondimpl < min) {
                        i16 = i18 + 1;
                        if (i16 > i17) {
                            return i16;
                        }
                    } else {
                        if (m23getFirstimpl >= i) {
                            return i18;
                        }
                        i17 = i18 - 1;
                    }
                    list2 = list;
                    i6 = i4;
                    i7 = i5;
                    sum = i18;
                    i12 = m23getFirstimpl;
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
        if (list.isEmpty()) {
            return IntIntPair.m19constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, OrientationIndependentConstraints.m640constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int intValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int i7 = 0;
        int i8 = 0;
        if (flowLayoutBuildingBlocks.m596getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m19constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m16boximpl(IntIntPair.m19constructorimpl(intValue2, intValue)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair m601ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m601ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m19constructorimpl(m601ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m24getSecondimpl(m601ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i8;
            if (i10 >= size) {
                i6 = i11;
                break;
            }
            int i15 = i9 - intValue2;
            int i16 = i10 + 1;
            i8 = Math.max(i14, intValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i16);
            int intValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i16), Integer.valueOf(i)).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i16), Integer.valueOf(intValue3)).intValue() + i2 : 0;
            int i17 = i16 - i12;
            i6 = i16;
            int i18 = i13;
            FlowLayoutBuildingBlocks.WrapInfo m596getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m596getWrapInfoOpUlnko(i10 + 2 < list.size(), i17, IntIntPair.m19constructorimpl(i15, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m16boximpl(IntIntPair.m19constructorimpl(intValue4, intValue3)), i18, i7, i8, false, false);
            if (m596getWrapInfoOpUlnko.getIsLastItemInLine()) {
                int i19 = i7 + i8 + i3;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m596getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i18, i19, i15, i17);
                intValue4 -= i2;
                i13 = i18 + 1;
                if (m596getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            i19 += IntIntPair.m24getSecondimpl(ellipsisSize) + i3;
                        }
                    }
                    i7 = i19;
                } else {
                    i9 = i;
                    i12 = i6;
                    i7 = i19;
                    i8 = 0;
                }
            } else {
                i9 = i15;
                i13 = i18;
            }
            intValue2 = intValue4;
            intValue = intValue3;
            i10 = i6;
            i11 = i10;
        }
        return IntIntPair.m19constructorimpl(i7 - i3, i6);
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        try {
            if (it instanceof ContextualFlowItemIterator) {
                Intrinsics.checkNotNull(flowLineInfo);
                return ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
            }
            return it.next();
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
    public static final long m599measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j, Function1<? super Placeable, Unit> function1) {
        FlowLayoutData flowLayoutData;
        Measurable measurable2 = measurable;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable2)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable2);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable mo5152measureBRTryo0 = measurable.mo5152measureBRTryo0(j);
                function1.invoke(mo5152measureBRTryo0);
                return IntIntPair.m19constructorimpl(flowLineMeasurePolicy.mainAxisSize(mo5152measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(mo5152measureBRTryo0));
            }
        }
        int mainAxisMin = mainAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m19constructorimpl(mainAxisMin, crossAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), mainAxisMin));
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m600placeHelperBmaY500(MeasureScope measureScope, long j, int i, int i2, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int i3;
        int i4;
        int i5;
        boolean isHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (isHorizontal) {
            if (verticalArrangement == null) {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
            i3 = RangesKt.coerceIn(i2 + (measureScope.mo359roundToPx0680j_4(verticalArrangement.getSpacing()) * (mutableVector.getSize() - 1)), Constraints.m6219getMinHeightimpl(j), Constraints.m6217getMaxHeightimpl(j));
            verticalArrangement.arrange(measureScope, i3, iArr, iArr2);
        } else {
            if (horizontalArrangement == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
            int coerceIn = RangesKt.coerceIn(i2 + (measureScope.mo359roundToPx0680j_4(horizontalArrangement.getSpacing()) * (mutableVector.getSize() - 1)), Constraints.m6219getMinHeightimpl(j), Constraints.m6217getMaxHeightimpl(j));
            horizontalArrangement.arrange(measureScope, coerceIn, iArr, measureScope.getLayoutDirection(), iArr2);
            i3 = coerceIn;
        }
        int coerceIn2 = RangesKt.coerceIn(i, Constraints.m6220getMinWidthimpl(j), Constraints.m6218getMaxWidthimpl(j));
        if (isHorizontal) {
            i5 = coerceIn2;
            i4 = i3;
        } else {
            i4 = coerceIn2;
            i5 = i3;
        }
        return MeasureScope.layout$default(measureScope, i5, i4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$5
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
                    int i6 = 0;
                    do {
                        content[i6].placeChildren();
                        i6++;
                    } while (i6 < size);
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
    public static final MeasureResult m598breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f, float f2, long j, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i3;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        MutableIntObjectMap mutableIntObjectMap;
        ArrayList arrayList;
        int i4;
        int i5;
        MeasureScope measureScope2;
        int[] iArr;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr2;
        long j2;
        int height;
        int width;
        int i6;
        MutableIntObjectMap mutableIntObjectMap2;
        ArrayList arrayList2;
        MutableIntList mutableIntList;
        MutableIntList mutableIntList2;
        int i7;
        int i8;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i9;
        int i10;
        int i11;
        int coerceAtLeast;
        MeasureScope measureScope3 = measureScope;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j);
        int m6220getMinWidthimpl = Constraints.m6220getMinWidthimpl(j);
        int m6217getMaxHeightimpl = Constraints.m6217getMaxHeightimpl(j);
        MutableIntObjectMap mutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList3 = new ArrayList();
        int ceil = (int) Math.ceil(measureScope3.mo365toPx0680j_4(f));
        int ceil2 = (int) Math.ceil(measureScope3.mo365toPx0680j_4(f2));
        long m640constructorimpl = OrientationIndependentConstraints.m640constructorimpl(0, m6218getMaxWidthimpl, 0, m6217getMaxHeightimpl);
        long m655toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m655toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m644copyyUG9Ft0$default(m640constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        FlowLineInfo flowLineInfo = it instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo362toDpu2uoSUM(m6218getMaxWidthimpl), measureScope3.mo362toDpu2uoSUM(m6217getMaxHeightimpl), null) : null;
        Measurable safeNext = !it.hasNext() ? null : safeNext(it, flowLineInfo);
        IntIntPair m16boximpl = safeNext != null ? IntIntPair.m16boximpl(m599measureAndCacherqJ1uqs(safeNext, flowLineMeasurePolicy, m655toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
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
                objectRef.element = placeable;
            }
        })) : null;
        Integer valueOf = m16boximpl != null ? Integer.valueOf(IntIntPair.m23getFirstimpl(m16boximpl.getPackedValue())) : null;
        Integer valueOf2 = m16boximpl != null ? Integer.valueOf(IntIntPair.m24getSecondimpl(m16boximpl.getPackedValue())) : null;
        Integer num = valueOf;
        Measurable measurable = safeNext;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j, i2, ceil, ceil2, null);
        FlowLayoutBuildingBlocks.WrapInfo m596getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m596getWrapInfoOpUlnko(it.hasNext(), 0, IntIntPair.m19constructorimpl(m6218getMaxWidthimpl, m6217getMaxHeightimpl), m16boximpl, 0, 0, 0, false, false);
        if (m596getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m596getWrapInfoOpUlnko, m16boximpl != null, -1, 0, m6218getMaxWidthimpl, 0);
            i3 = m6218getMaxWidthimpl;
        } else {
            i3 = m6218getMaxWidthimpl;
            wrapEllipsisInfo = null;
        }
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        MutableIntList mutableIntList5 = mutableIntList3;
        int i12 = m6217getMaxHeightimpl;
        int i13 = i3;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = m596getWrapInfoOpUlnko;
        int i14 = m6220getMinWidthimpl;
        Measurable measurable2 = measurable;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (!wrapInfo.getIsLastItemInContainer() && measurable2 != null) {
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            Intrinsics.checkNotNull(valueOf2);
            MutableIntList mutableIntList6 = mutableIntList4;
            int i21 = i3;
            int i22 = i18 + intValue;
            int max = Math.max(i15, valueOf2.intValue());
            int i23 = i13 - intValue;
            int i24 = i16 + 1;
            int i25 = i14;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i24);
            arrayList3.add(measurable2);
            mutableIntObjectMapOf.set(i16, objectRef.element);
            int i26 = i24 - i17;
            boolean z = i26 < i;
            if (flowLineInfo != null) {
                if (z) {
                    i6 = i26;
                    i9 = i19;
                } else {
                    i6 = i26;
                    i9 = i19 + 1;
                }
                int i27 = z ? i6 : 0;
                if (z) {
                    mutableIntObjectMap2 = mutableIntObjectMapOf;
                    i10 = 0;
                    i11 = RangesKt.coerceAtLeast(i23 - ceil, 0);
                } else {
                    mutableIntObjectMap2 = mutableIntObjectMapOf;
                    i10 = 0;
                    i11 = i21;
                }
                float f3 = measureScope3.mo362toDpu2uoSUM(i11);
                if (z) {
                    arrayList2 = arrayList3;
                    coerceAtLeast = i12;
                } else {
                    arrayList2 = arrayList3;
                    coerceAtLeast = RangesKt.coerceAtLeast((i12 - max) - ceil2, i10);
                }
                flowLineInfo.m609update4j6BHR0$foundation_layout_release(i9, i27, f3, measureScope3.mo362toDpu2uoSUM(coerceAtLeast));
            } else {
                i6 = i26;
                mutableIntObjectMap2 = mutableIntObjectMapOf;
                arrayList2 = arrayList3;
            }
            measurable2 = !it.hasNext() ? null : safeNext(it, flowLineInfo);
            IntIntPair intIntPair = null;
            objectRef.element = null;
            IntIntPair m16boximpl2 = measurable2 != null ? IntIntPair.m16boximpl(m599measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy, m655toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
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
                    objectRef.element = placeable;
                }
            })) : null;
            Integer valueOf3 = m16boximpl2 != null ? Integer.valueOf(IntIntPair.m23getFirstimpl(m16boximpl2.getPackedValue()) + ceil) : null;
            valueOf2 = m16boximpl2 != null ? Integer.valueOf(IntIntPair.m24getSecondimpl(m16boximpl2.getPackedValue())) : null;
            boolean hasNext = it.hasNext();
            int i28 = i19;
            long m19constructorimpl = IntIntPair.m19constructorimpl(i23, i12);
            if (m16boximpl2 != null) {
                Intrinsics.checkNotNull(valueOf3);
                int intValue2 = valueOf3.intValue();
                Intrinsics.checkNotNull(valueOf2);
                intIntPair = IntIntPair.m16boximpl(IntIntPair.m19constructorimpl(intValue2, valueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo m596getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m596getWrapInfoOpUlnko(hasNext, i6, m19constructorimpl, intIntPair, i28, i20, max, false, false);
            if (m596getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                int min = Math.min(Math.max(i25, i22), i21);
                int i29 = i20 + max;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m596getWrapInfoOpUlnko2, m16boximpl2 != null, i28, i29, i23, i6);
                mutableIntList2 = mutableIntList6;
                mutableIntList2.add(max);
                i8 = (i12 - i29) - ceil2;
                MutableIntList mutableIntList7 = mutableIntList5;
                mutableIntList7.add(i24);
                i19 = i28 + 1;
                num = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - ceil) : null;
                i13 = i21;
                i21 = i13;
                i17 = i24;
                i20 = i29 + ceil2;
                i7 = 0;
                i14 = min;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                mutableIntList = mutableIntList7;
                i22 = 0;
            } else {
                i14 = i25;
                mutableIntList = mutableIntList5;
                mutableIntList2 = mutableIntList6;
                num = valueOf3;
                i7 = max;
                i13 = i23;
                i19 = i28;
                i8 = i12;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            mutableIntList5 = mutableIntList;
            i15 = i7;
            i12 = i8;
            i16 = i24;
            arrayList3 = arrayList2;
            wrapInfo = m596getWrapInfoOpUlnko2;
            mutableIntList4 = mutableIntList2;
            mutableIntObjectMapOf = mutableIntObjectMap2;
            i18 = i22;
            i3 = i21;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapOf;
        ArrayList arrayList4 = arrayList3;
        MutableIntList mutableIntList8 = mutableIntList4;
        MutableIntList mutableIntList9 = mutableIntList5;
        if (wrapEllipsisInfo3 != null) {
            arrayList = arrayList4;
            arrayList.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i30 = mutableIntList9._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int size = mutableIntList9.getSize() - 1;
                mutableIntList8.set(i30, Math.max(mutableIntList8.get(i30), IntIntPair.m24getSecondimpl(wrapEllipsisInfo3.getEllipsisSize())));
                mutableIntList9.set(size, mutableIntList9.last() + 1);
            } else {
                mutableIntList8.add(IntIntPair.m24getSecondimpl(wrapEllipsisInfo3.getEllipsisSize()));
                mutableIntList9.add(mutableIntList9.last() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
            arrayList = arrayList4;
        }
        int size2 = arrayList.size();
        int i31 = i14;
        Placeable[] placeableArr = new Placeable[size2];
        for (int i32 = 0; i32 < size2; i32++) {
            placeableArr[i32] = mutableIntObjectMap.get(i32);
        }
        int size3 = mutableIntList9.getSize();
        int[] iArr3 = new int[size3];
        for (int i33 = 0; i33 < size3; i33++) {
            iArr3[i33] = 0;
        }
        int size4 = mutableIntList9.getSize();
        int[] iArr4 = new int[size4];
        for (int i34 = 0; i34 < size4; i34++) {
            iArr4[i34] = 0;
        }
        MutableIntList mutableIntList10 = mutableIntList9;
        int[] iArr5 = mutableIntList10.content;
        int i35 = mutableIntList10._size;
        int i36 = i31;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        while (i38 < i35) {
            int i40 = iArr5[i38];
            MutableIntList mutableIntList11 = mutableIntList8;
            int i41 = i35;
            MeasureResult measure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy, i36, Constraints.m6219getMinHeightimpl(m640constructorimpl), Constraints.m6218getMaxWidthimpl(m640constructorimpl), mutableIntList11.get(i38), ceil, measureScope3, arrayList, placeableArr, i37, i40, iArr3, i38);
            if (flowLineMeasurePolicy.isHorizontal()) {
                height = measure.getWidth();
                width = measure.getHeight();
            } else {
                height = measure.getHeight();
                width = measure.getWidth();
            }
            iArr4[i38] = width;
            i39 += width;
            i36 = Math.max(i36, height);
            mutableVector.add(measure);
            i38++;
            i37 = i40;
            i35 = i41;
            mutableIntList8 = mutableIntList11;
            measureScope3 = measureScope;
        }
        if (mutableVector.isEmpty()) {
            i4 = 0;
            i5 = 0;
            measureScope2 = measureScope;
            j2 = j;
            iArr = iArr3;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr2 = iArr4;
        } else {
            i4 = i36;
            i5 = i39;
            measureScope2 = measureScope;
            iArr = iArr3;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr2 = iArr4;
            j2 = j;
        }
        return m600placeHelperBmaY500(measureScope2, j2, i4, i5, iArr2, mutableVector, flowLineMeasurePolicy2, iArr);
    }
}
