package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a©\u0001\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001at\u0010'\u001a\u00020\u00172\u0013\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001a2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001a2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019¢\u0006\u0002\b\u001aH\u0003¢\u0006\u0002\u0010-\u001a5\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001a\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aV\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020<2\u0006\u00107\u001a\u0002082\u0006\u00106\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aN\u0010G\u001a\u00020<*\u00020=2\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020<2\u0006\u0010M\u001a\u00020<2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020Q*\u00020R2\u0006\u0010S\u001a\u00020<H\u0002\u001an\u0010T\u001a\u00020U*\u00020V2\u0006\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020<2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z2\b\u0010\\\u001a\u0004\u0018\u00010Z2\b\u0010]\u001a\u0004\u0018\u00010Z2\b\u0010^\u001a\u0004\u0018\u00010Z2\u0006\u0010_\u001a\u00020Q2\u0006\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020<H\u0002\u001a\u0014\u0010c\u001a\u00020<*\u00020<2\u0006\u0010d\u001a\u00020<H\u0002\"\u001e\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0007\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005\"\u001e\u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\u0005\"\u001e\u0010\r\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\u0005\"\u001e\u0010\u0010\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0005\"\u001e\u0010\u0013\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0006\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"LeadingContentEndPadding", "Landroidx/compose/ui/unit/Dp;", "getLeadingContentEndPadding$annotations", "()V", "getLeadingContentEndPadding", "()F", "F", "ListItemEndPadding", "getListItemEndPadding$annotations", "getListItemEndPadding", "ListItemStartPadding", "getListItemStartPadding$annotations", "getListItemStartPadding", "ListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "getListItemThreeLineVerticalPadding", "ListItemVerticalPadding", "getListItemVerticalPadding$annotations", "getListItemVerticalPadding", "TrailingContentStartPadding", "getTrailingContentStartPadding$annotations", "getTrailingContentStartPadding", "ListItem", "", "headlineContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "colors", "Landroidx/compose/material3/ListItemColors;", "tonalElevation", "shadowElevation", "ListItem-HXNGIdc", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "ListItemLayout", "leading", "trailing", "headline", "overline", "supporting", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ProvideTextStyleFromToken", "color", "Landroidx/compose/ui/graphics/Color;", "textToken", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "content", "ProvideTextStyleFromToken-3J-VO9M", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "verticalPadding", "listItemType", "Landroidx/compose/material3/ListItemType;", "verticalPadding-yh95HIg", "(I)F", "calculateHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "leadingHeight", "trailingHeight", "headlineHeight", "overlineHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateHeight-N4Jib3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I", "calculateWidth", "leadingWidth", "trailingWidth", "headlineWidth", "overlineWidth", "supportingWidth", "horizontalPadding", "calculateWidth-yeHjK3Y", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I", "isSupportingMultilineHeuristic", "", "Landroidx/compose/ui/unit/Density;", "estimatedSupportingHeight", "place", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "width", "height", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "isThreeLine", "startPadding", "endPadding", "topPadding", "subtractConstraintSafely", "n", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = Dp.m6299constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = Dp.m6299constructorimpl(12);

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int subtractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1875ListItemHXNGIdc(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, ListItemColors listItemColors, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        int i12;
        int i13;
        ListItemColors listItemColors2;
        float m1874getElevationD9Ej5fM;
        float m1874getElevationD9Ej5fM2;
        int i14;
        final ListItemColors listItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function211;
        ComposableLambda rememberComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function212;
        ComposableLambda rememberComposableLambda2;
        Function2<? super Composer, ? super Integer, Unit> function213;
        ComposableLambda rememberComposableLambda3;
        Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        float f4;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        ListItemColors listItemColors4;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1647707763);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)P(1,3,4,6,2,8!1,7:c#ui.unit.Dp,5:c#ui.unit.Dp)100@4555L8,104@4735L176,157@6562L5,162@6761L288,155@6438L611:ListItem.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function26 = function22;
                i3 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function27 = function23;
                    i3 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function28 = function24;
                        i3 |= startRestartGroup.changedInstance(function28) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(listItemColors)) ? 1048576 : 524288;
                            }
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                                i10 = i2 & 256;
                                if (i10 != 0) {
                                    i3 |= 100663296;
                                } else if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    f3 = f2;
                                    i3 |= startRestartGroup.changed(f3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        ComposableLambda composableLambda = null;
                                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            companion = i15 == 0 ? Modifier.INSTANCE : modifier;
                                            if (i4 != 0) {
                                                function26 = null;
                                            }
                                            if (i5 != 0) {
                                                function27 = null;
                                            }
                                            function29 = i6 == 0 ? null : function28;
                                            function210 = i7 == 0 ? null : function25;
                                            if ((i2 & 64) == 0) {
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColors2 = ListItemDefaults.INSTANCE.m1873colorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 805306368, FrameMetricsAggregator.EVERY_DURATION);
                                                i3 &= -3670017;
                                            } else {
                                                i12 = i9;
                                                i13 = i11;
                                                listItemColors2 = listItemColors;
                                            }
                                            m1874getElevationD9Ej5fM = i12 == 0 ? ListItemDefaults.INSTANCE.m1874getElevationD9Ej5fM() : f;
                                            m1874getElevationD9Ej5fM2 = i13 == 0 ? ListItemDefaults.INSTANCE.m1874getElevationD9Ej5fM() : f2;
                                            ListItemColors listItemColors5 = listItemColors2;
                                            i14 = i3;
                                            listItemColors3 = listItemColors5;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i2 & 64) != 0) {
                                                i3 &= -3670017;
                                            }
                                            companion = modifier;
                                            function210 = function25;
                                            m1874getElevationD9Ej5fM = f;
                                            i14 = i3;
                                            function29 = function28;
                                            m1874getElevationD9Ej5fM2 = f3;
                                            listItemColors3 = listItemColors;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1647707763, i14, -1, "androidx.compose.material3.ListItem (ListItem.kt:103)");
                                        }
                                        final ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                                            public final void invoke(Composer composer2, int i16) {
                                                ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                                                if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-403249643, i16, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                                                    }
                                                    ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }, startRestartGroup, 54);
                                        startRestartGroup.startReplaceGroup(1640970492);
                                        ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
                                        if (function27 != null) {
                                            function211 = function27;
                                            rememberComposableLambda = null;
                                        } else {
                                            function211 = function27;
                                            rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1020860251, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1
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

                                                public final void invoke(Composer composer2, int i16) {
                                                    ComposerKt.sourceInformation(composer2, "C114@5039L172:ListItem.kt#uh7d8r");
                                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1020860251, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:114)");
                                                        }
                                                        ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1871supportingColor0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemSupportingTextFont(), function27, composer2, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, startRestartGroup, 54);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1640980724);
                                        ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
                                        if (function26 != null) {
                                            function212 = function26;
                                            rememberComposableLambda2 = null;
                                        } else {
                                            function212 = function26;
                                            rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-764441232, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1
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

                                                public final void invoke(Composer composer2, int i16) {
                                                    ComposerKt.sourceInformation(composer2, "C124@5359L164:ListItem.kt#uh7d8r");
                                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-764441232, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:124)");
                                                        }
                                                        ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1870overlineColor0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemOverlineFont(), function26, composer2, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, startRestartGroup, 54);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1640990750);
                                        ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
                                        if (function29 != null) {
                                            function213 = function29;
                                            rememberComposableLambda3 = null;
                                        } else {
                                            function213 = function29;
                                            rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1400509200, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1
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

                                                public final void invoke(Composer composer2, int i16) {
                                                    ComposerKt.sourceInformation(composer2, "C134@5669L270:ListItem.kt#uh7d8r");
                                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1400509200, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:134)");
                                                        }
                                                        Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ListItemKt.getLeadingContentEndPadding(), 0.0f, 11, null);
                                                        ListItemColors listItemColors6 = ListItemColors.this;
                                                        Function2<Composer, Integer, Unit> function218 = function29;
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                        if (!(composer2.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer2.startReusableNode();
                                                        if (composer2.getInserting()) {
                                                            composer2.createNode(constructor);
                                                        } else {
                                                            composer2.useNode();
                                                        }
                                                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 690160162, "C135@5745L176:ListItem.kt#uh7d8r");
                                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(listItemColors6.m1869leadingIconColorvNxB06k$material3_release(true))), function218, composer2, ProvidedValue.$stable);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        composer2.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, startRestartGroup, 54);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1641004177);
                                        ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
                                        if (function210 != null) {
                                            function214 = function210;
                                        } else {
                                            function214 = function210;
                                            composableLambda = ComposableLambdaKt.rememberComposableLambda(1512306332, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1
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

                                                public final void invoke(Composer composer2, int i16) {
                                                    ComposerKt.sourceInformation(composer2, "C145@6087L321:ListItem.kt#uh7d8r");
                                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1512306332, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:145)");
                                                        }
                                                        Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(Modifier.INSTANCE, ListItemKt.getTrailingContentStartPadding(), 0.0f, 0.0f, 0.0f, 14, null);
                                                        ListItemColors listItemColors6 = ListItemColors.this;
                                                        Function2<Composer, Integer, Unit> function218 = function210;
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                        if (!(composer2.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer2.startReusableNode();
                                                        if (composer2.getInserting()) {
                                                            composer2.createNode(constructor);
                                                        } else {
                                                            composer2.useNode();
                                                        }
                                                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 690581204, "C146@6168L222:ListItem.kt#uh7d8r");
                                                        ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(listItemColors6.m1872trailingIconColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), function218, composer2, 48);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        composer2.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, startRestartGroup, 54);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final ComposableLambda composableLambda2 = rememberComposableLambda3;
                                        final ComposableLambda composableLambda3 = composableLambda;
                                        final ComposableLambda composableLambda4 = rememberComposableLambda2;
                                        final ComposableLambda composableLambda5 = rememberComposableLambda;
                                        int i16 = i14 >> 9;
                                        SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                                                ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                                                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                                                    }
                                                    ListItemKt.ListItemLayout(composableLambda2, composableLambda3, rememberComposableLambda4, composableLambda4, composableLambda5, composer2, 384);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, (57344 & i16) | 12582912 | (i16 & 458752), 64);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function215 = function211;
                                        function26 = function212;
                                        f4 = m1874getElevationD9Ej5fM;
                                        f3 = m1874getElevationD9Ej5fM2;
                                        function216 = function214;
                                        function217 = function213;
                                        listItemColors4 = listItemColors3;
                                        modifier2 = companion;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        function216 = function25;
                                        listItemColors4 = listItemColors;
                                        function215 = function27;
                                        function217 = function28;
                                        f4 = f;
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        final Modifier modifier3 = modifier2;
                                        final Function2<? super Composer, ? super Integer, Unit> function218 = function26;
                                        final ListItemColors listItemColors6 = listItemColors4;
                                        final float f5 = f4;
                                        final float f6 = f3;
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$3
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
                                                ListItemKt.m1875ListItemHXNGIdc(function2, modifier3, function218, function215, function217, function216, listItemColors6, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i11 = i10;
                                f3 = f2;
                                if ((i3 & 38347923) == 38347922) {
                                }
                                startRestartGroup.startDefaults();
                                ComposableLambda composableLambda6 = null;
                                if ((i & 1) != 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                ListItemColors listItemColors52 = listItemColors2;
                                i14 = i3;
                                listItemColors3 = listItemColors52;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda42 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                                    public final void invoke(Composer composer2, int i162) {
                                        ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                                        if ((i162 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-403249643, i162, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                                            }
                                            ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.startReplaceGroup(1640970492);
                                ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
                                if (function27 != null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1640980724);
                                ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
                                if (function26 != null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1640990750);
                                ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
                                if (function29 != null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1641004177);
                                ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
                                if (function210 != null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final Function2<? super Composer, ? super Integer, Unit> composableLambda22 = rememberComposableLambda3;
                                final Function2<? super Composer, ? super Integer, Unit> composableLambda32 = composableLambda6;
                                final Function2<? super Composer, ? super Integer, Unit> composableLambda42 = rememberComposableLambda2;
                                final Function2<? super Composer, ? super Integer, Unit> composableLambda52 = rememberComposableLambda;
                                int i162 = i14 >> 9;
                                SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                                        ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                                            }
                                            ListItemKt.ListItemLayout(composableLambda22, composableLambda32, rememberComposableLambda42, composableLambda42, composableLambda52, composer2, 384);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (57344 & i162) | 12582912 | (i162 & 458752), 64);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function215 = function211;
                                function26 = function212;
                                f4 = m1874getElevationD9Ej5fM;
                                f3 = m1874getElevationD9Ej5fM2;
                                function216 = function214;
                                function217 = function213;
                                listItemColors4 = listItemColors3;
                                modifier2 = companion;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i9 = i8;
                            i10 = i2 & 256;
                            if (i10 != 0) {
                            }
                            i11 = i10;
                            f3 = f2;
                            if ((i3 & 38347923) == 38347922) {
                            }
                            startRestartGroup.startDefaults();
                            ComposableLambda composableLambda62 = null;
                            if ((i & 1) != 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            ListItemColors listItemColors522 = listItemColors2;
                            i14 = i3;
                            listItemColors3 = listItemColors522;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda422 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                                public final void invoke(Composer composer2, int i1622) {
                                    ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                                    if ((i1622 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-403249643, i1622, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                                        }
                                        ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54);
                            startRestartGroup.startReplaceGroup(1640970492);
                            ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
                            if (function27 != null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1640980724);
                            ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
                            if (function26 != null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1640990750);
                            ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
                            if (function29 != null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1641004177);
                            ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
                            if (function210 != null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final Function2<? super Composer, ? super Integer, Unit> composableLambda222 = rememberComposableLambda3;
                            final Function2<? super Composer, ? super Integer, Unit> composableLambda322 = composableLambda62;
                            final Function2<? super Composer, ? super Integer, Unit> composableLambda422 = rememberComposableLambda2;
                            final Function2<? super Composer, ? super Integer, Unit> composableLambda522 = rememberComposableLambda;
                            int i1622 = i14 >> 9;
                            SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }
                            }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                                    ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                                    if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                                        }
                                        ListItemKt.ListItemLayout(composableLambda222, composableLambda322, rememberComposableLambda422, composableLambda422, composableLambda522, composer2, 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, (57344 & i1622) | 12582912 | (i1622 & 458752), 64);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function215 = function211;
                            function26 = function212;
                            f4 = m1874getElevationD9Ej5fM;
                            f3 = m1874getElevationD9Ej5fM2;
                            function216 = function214;
                            function217 = function213;
                            listItemColors4 = listItemColors3;
                            modifier2 = companion;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        if ((i & 1572864) == 0) {
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        f3 = f2;
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        ComposableLambda composableLambda622 = null;
                        if ((i & 1) != 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        ListItemColors listItemColors5222 = listItemColors2;
                        i14 = i3;
                        listItemColors3 = listItemColors5222;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda4222 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                            public final void invoke(Composer composer2, int i16222) {
                                ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                                if ((i16222 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-403249643, i16222, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                                    }
                                    ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54);
                        startRestartGroup.startReplaceGroup(1640970492);
                        ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
                        if (function27 != null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1640980724);
                        ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
                        if (function26 != null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1640990750);
                        ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
                        if (function29 != null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1641004177);
                        ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
                        if (function210 != null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda2222 = rememberComposableLambda3;
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda3222 = composableLambda622;
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda4222 = rememberComposableLambda2;
                        final Function2<? super Composer, ? super Integer, Unit> composableLambda5222 = rememberComposableLambda;
                        int i16222 = i14 >> 9;
                        SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                                ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                                    }
                                    ListItemKt.ListItemLayout(composableLambda2222, composableLambda3222, rememberComposableLambda4222, composableLambda4222, composableLambda5222, composer2, 384);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, (57344 & i16222) | 12582912 | (i16222 & 458752), 64);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function215 = function211;
                        function26 = function212;
                        f4 = m1874getElevationD9Ej5fM;
                        f3 = m1874getElevationD9Ej5fM2;
                        function216 = function214;
                        function217 = function213;
                        listItemColors4 = listItemColors3;
                        modifier2 = companion;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function28 = function24;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    f3 = f2;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    ComposableLambda composableLambda6222 = null;
                    if ((i & 1) != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    ListItemColors listItemColors52222 = listItemColors2;
                    i14 = i3;
                    listItemColors3 = listItemColors52222;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda42222 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                        public final void invoke(Composer composer2, int i162222) {
                            ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                            if ((i162222 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-403249643, i162222, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                                }
                                ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54);
                    startRestartGroup.startReplaceGroup(1640970492);
                    ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
                    if (function27 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1640980724);
                    ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
                    if (function26 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1640990750);
                    ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
                    if (function29 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1641004177);
                    ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
                    if (function210 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda22222 = rememberComposableLambda3;
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda32222 = composableLambda6222;
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda42222 = rememberComposableLambda2;
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda52222 = rememberComposableLambda;
                    int i162222 = i14 >> 9;
                    SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                            ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                            if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                                }
                                ListItemKt.ListItemLayout(composableLambda22222, composableLambda32222, rememberComposableLambda42222, composableLambda42222, composableLambda52222, composer2, 384);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, (57344 & i162222) | 12582912 | (i162222 & 458752), 64);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function215 = function211;
                    function26 = function212;
                    f4 = m1874getElevationD9Ej5fM;
                    f3 = m1874getElevationD9Ej5fM2;
                    function216 = function214;
                    function217 = function213;
                    listItemColors4 = listItemColors3;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function27 = function23;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function28 = function24;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                f3 = f2;
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                ComposableLambda composableLambda62222 = null;
                if ((i & 1) != 0) {
                }
                if (i15 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                ListItemColors listItemColors522222 = listItemColors2;
                i14 = i3;
                listItemColors3 = listItemColors522222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda422222 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                    public final void invoke(Composer composer2, int i1622222) {
                        ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                        if ((i1622222 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-403249643, i1622222, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                            }
                            ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54);
                startRestartGroup.startReplaceGroup(1640970492);
                ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
                if (function27 != null) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1640980724);
                ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
                if (function26 != null) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1640990750);
                ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
                if (function29 != null) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1641004177);
                ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
                if (function210 != null) {
                }
                startRestartGroup.endReplaceGroup();
                final Function2<? super Composer, ? super Integer, Unit> composableLambda222222 = rememberComposableLambda3;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda322222 = composableLambda62222;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda422222 = rememberComposableLambda2;
                final Function2<? super Composer, ? super Integer, Unit> composableLambda522222 = rememberComposableLambda;
                int i1622222 = i14 >> 9;
                SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                        ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                            }
                            ListItemKt.ListItemLayout(composableLambda222222, composableLambda322222, rememberComposableLambda422222, composableLambda422222, composableLambda522222, composer2, 384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, (57344 & i1622222) | 12582912 | (i1622222 & 458752), 64);
                if (ComposerKt.isTraceInProgress()) {
                }
                function215 = function211;
                function26 = function212;
                f4 = m1874getElevationD9Ej5fM;
                f3 = m1874getElevationD9Ej5fM2;
                function216 = function214;
                function217 = function213;
                listItemColors4 = listItemColors3;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function26 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function27 = function23;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function28 = function24;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            f3 = f2;
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            ComposableLambda composableLambda622222 = null;
            if ((i & 1) != 0) {
            }
            if (i15 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            ListItemColors listItemColors5222222 = listItemColors2;
            i14 = i3;
            listItemColors3 = listItemColors5222222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda4222222 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                public final void invoke(Composer composer2, int i16222222) {
                    ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                    if ((i16222222 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-403249643, i16222222, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                        }
                        ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54);
            startRestartGroup.startReplaceGroup(1640970492);
            ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
            if (function27 != null) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1640980724);
            ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
            if (function26 != null) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1640990750);
            ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
            if (function29 != null) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1641004177);
            ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
            if (function210 != null) {
            }
            startRestartGroup.endReplaceGroup();
            final Function2<? super Composer, ? super Integer, Unit> composableLambda2222222 = rememberComposableLambda3;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda3222222 = composableLambda622222;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda4222222 = rememberComposableLambda2;
            final Function2<? super Composer, ? super Integer, Unit> composableLambda5222222 = rememberComposableLambda;
            int i16222222 = i14 >> 9;
            SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                    ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                    if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                        }
                        ListItemKt.ListItemLayout(composableLambda2222222, composableLambda3222222, rememberComposableLambda4222222, composableLambda4222222, composableLambda5222222, composer2, 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, (57344 & i16222222) | 12582912 | (i16222222 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
            }
            function215 = function211;
            function26 = function212;
            f4 = m1874getElevationD9Ej5fM;
            f3 = m1874getElevationD9Ej5fM2;
            function216 = function214;
            function217 = function213;
            listItemColors4 = listItemColors3;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function26 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function27 = function23;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function28 = function24;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        f3 = f2;
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        ComposableLambda composableLambda6222222 = null;
        if ((i & 1) != 0) {
        }
        if (i15 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        ListItemColors listItemColors52222222 = listItemColors2;
        i14 = i3;
        listItemColors3 = listItemColors52222222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda42222222 = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

            public final void invoke(Composer composer2, int i162222222) {
                ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                if ((i162222222 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-403249643, i162222222, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                    }
                    ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m1868headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54);
        startRestartGroup.startReplaceGroup(1640970492);
        ComposerKt.sourceInformation(startRestartGroup, "*113@5021L204");
        if (function27 != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1640980724);
        ComposerKt.sourceInformation(startRestartGroup, "*123@5341L196");
        if (function26 != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1640990750);
        ComposerKt.sourceInformation(startRestartGroup, "*133@5651L302");
        if (function29 != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1641004177);
        ComposerKt.sourceInformation(startRestartGroup, "*144@6069L353");
        if (function210 != null) {
        }
        startRestartGroup.endReplaceGroup();
        final Function2<? super Composer, ? super Integer, Unit> composableLambda22222222 = rememberComposableLambda3;
        final Function2<? super Composer, ? super Integer, Unit> composableLambda32222222 = composableLambda6222222;
        final Function2<? super Composer, ? super Integer, Unit> composableLambda42222222 = rememberComposableLambda2;
        final Function2<? super Composer, ? super Integer, Unit> composableLambda52222222 = rememberComposableLambda;
        int i162222222 = i14 >> 9;
        SurfaceKt.m2223SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }).then(companion), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors3.getContainerColor(), listItemColors3.m1868headlineColorvNxB06k$material3_release(true), m1874getElevationD9Ej5fM, m1874getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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
                ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1502590376, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                    }
                    ListItemKt.ListItemLayout(composableLambda22222222, composableLambda32222222, rememberComposableLambda42222222, composableLambda42222222, composableLambda52222222, composer2, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, (57344 & i162222222) | 12582912 | (i162222222 & 458752), 64);
        if (ComposerKt.isTraceInProgress()) {
        }
        function215 = function211;
        function26 = function212;
        f4 = m1874getElevationD9Ej5fM;
        f3 = m1874getElevationD9Ej5fM2;
        function216 = function214;
        function217 = function213;
        listItemColors4 = listItemColors3;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2052297037);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItemLayout)P(1,4)181@7324L36,182@7365L261:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, i2, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -748109790, "CC(remember):ListItem.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ListItemMeasurePolicy();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Function2[] function2Arr = new Function2[5];
            function2Arr[0] = function23;
            function2Arr[1] = function24 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1645getLambda1$material3_release() : function24;
            function2Arr[2] = function25 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1646getLambda2$material3_release() : function25;
            function2Arr[3] = function2 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1647getLambda3$material3_release() : function2;
            function2Arr[4] = function22 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1648getLambda4$material3_release() : function22;
            List listOf = CollectionsKt.listOf((Object[]) function2Arr);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290761997, "CC(remember):Layout.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
            Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
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
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItemLayout$1
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

                public final void invoke(Composer composer2, int i3) {
                    ListItemKt.ListItemLayout(function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m1882calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (Constraints.m6248getHasBoundedWidthimpl(j)) {
            return Constraints.m6252getMaxWidthimpl(j);
        }
        return i6 + i + Math.max(i3, Math.max(i4, i5)) + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m1881calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float m2996getListItemTwoLineContainerHeightD9Ej5fM;
        if (ListItemType.m1888equalsimpl0(i6, ListItemType.INSTANCE.m1893getOneLineAlXitO8())) {
            m2996getListItemTwoLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m2991getListItemOneLineContainerHeightD9Ej5fM();
        } else {
            m2996getListItemTwoLineContainerHeightD9Ej5fM = ListItemType.m1888equalsimpl0(i6, ListItemType.INSTANCE.m1895getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m2996getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m2993getListItemThreeLineContainerHeightD9Ej5fM();
        }
        return RangesKt.coerceAtMost(Math.max(Math.max(Constraints.m6253getMinHeightimpl(j), intrinsicMeasureScope.mo367roundToPx0680j_4(m2996getListItemTwoLineContainerHeightD9Ej5fM)), i7 + Math.max(i, Math.max(i3 + i4 + i5, i2))), Constraints.m6251getMaxHeightimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i, final int i2, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z, final int i3, final int i4, final int i5) {
        return MeasureScope.layout$default(measureScope, i, i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ListItemKt$place$1
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
                int align;
                Placeable placeable6 = Placeable.this;
                if (placeable6 != null) {
                    int i6 = i3;
                    boolean z2 = z;
                    int i7 = i5;
                    int i8 = i2;
                    if (!z2) {
                        i7 = Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), i8);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, i6, i7, 0.0f, 4, null);
                }
                Placeable placeable7 = placeable2;
                if (placeable7 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - i4) - placeable7.getWidth(), z ? i5 : Alignment.INSTANCE.getCenterVertically().align(placeable7.getHeight(), i2), 0.0f, 4, null);
                }
                int widthOrZero = i3 + TextFieldImplKt.widthOrZero(Placeable.this);
                if (z) {
                    align = i5;
                } else {
                    align = Alignment.INSTANCE.getCenterVertically().align(TextFieldImplKt.heightOrZero(placeable3) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable5), i2);
                }
                Placeable placeable8 = placeable4;
                if (placeable8 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, widthOrZero, align, 0.0f, 4, null);
                }
                int heightOrZero = align + TextFieldImplKt.heightOrZero(placeable4);
                Placeable placeable9 = placeable3;
                if (placeable9 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, widthOrZero, heightOrZero, 0.0f, 4, null);
                }
                int heightOrZero2 = heightOrZero + TextFieldImplKt.heightOrZero(placeable3);
                Placeable placeable10 = placeable5;
                if (placeable10 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, widthOrZero, heightOrZero2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m1876ProvideTextStyleFromToken3JVO9M(final long j, final TypographyKeyTokens typographyKeyTokens, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1133967795);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyleFromToken)P(0:c#ui.graphics.Color,2)659@26906L5,657@26816L128:ListItem.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:657)");
            }
            ProvideContentColorTextStyleKt.m2583ProvideContentColorTextStyle3JVO9M(j, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 3) & 14), function2, startRestartGroup, i2 & 910);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
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

                public final void invoke(Composer composer2, int i3) {
                    ListItemKt.m1876ProvideTextStyleFromToken3JVO9M(j, typographyKeyTokens, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i) {
        return i > density.mo366roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m1883verticalPaddingyh95HIg(int i) {
        return ListItemType.m1888equalsimpl0(i, ListItemType.INSTANCE.m1894getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }

    static {
        float f = 16;
        ListItemStartPadding = Dp.m6299constructorimpl(f);
        ListItemEndPadding = Dp.m6299constructorimpl(f);
        LeadingContentEndPadding = Dp.m6299constructorimpl(f);
        TrailingContentStartPadding = Dp.m6299constructorimpl(f);
    }
}
