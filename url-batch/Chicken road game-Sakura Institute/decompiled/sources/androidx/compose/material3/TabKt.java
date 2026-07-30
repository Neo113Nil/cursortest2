package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0082\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u008a\u0001\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001az\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b\u0018¢\u0006\u0002\b*H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a7\u0010-\u001a\u00020\u00122\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u00182\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0002\b\u0018H\u0003¢\u0006\u0002\u0010.\u001a=\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00142\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aD\u00104\u001a\u00020\u0012*\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\rH\u0002\u001a\u001c\u0010?\u001a\u00020\u0012*\u0002052\u0006\u0010@\u001a\u0002092\u0006\u0010<\u001a\u00020\rH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "getHorizontalTextPadding", "()F", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "LeadingIconTab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Tab", "Tab-wqdebIU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-bogVsAg", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material3_release", "color"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m3140getContainerHeightD9Ej5fM();
    private static final float LargeTabHeight = Dp.m6299constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m6299constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m6299constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m6299constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m6299constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff  */
    /* renamed from: Tab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2259TabwqdebIU(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, long j, long j2, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int i7;
        long j3;
        int i8;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        long j5;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        final boolean z4;
        final long j6;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final long j7;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-350627181);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3!1,7!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)99@4483L7,121@5133L65,113@4964L234:Tab.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function23 = function2;
                        i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                            if ((1572864 & i) == 0) {
                                if ((i2 & 64) == 0 && startRestartGroup.changed(j)) {
                                    i9 = 1048576;
                                    i3 |= i9;
                                }
                                i9 = 524288;
                                i3 |= i9;
                            }
                            if ((i & 12582912) != 0) {
                                j3 = j2;
                                i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                            } else {
                                j3 = j2;
                            }
                            i8 = i2 & 256;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i5 != 0) {
                                        z3 = true;
                                    }
                                    if (i6 != 0) {
                                        function23 = null;
                                    }
                                    function24 = i7 == 0 ? null : function22;
                                    if ((i2 & 64) == 0) {
                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        j4 = ((Color) consume).m3850unboximpl();
                                        i3 &= -3670017;
                                    } else {
                                        j4 = j;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                        j3 = j4;
                                    }
                                    if (i8 == 0) {
                                        j5 = j3;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        j5 = j3;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    function24 = function22;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    companion = modifier2;
                                    j5 = j3;
                                    j4 = j;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-350627181, i3, -1, "androidx.compose.material3.Tab (Tab.kt:102)");
                                }
                                startRestartGroup.startReplaceGroup(79583089);
                                ComposerKt.sourceInformation(startRestartGroup, "*105@4702L247");
                                final ComposableLambda rememberComposableLambda = function23 != null ? ComposableLambdaKt.rememberComposableLambda(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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

                                    public final void invoke(Composer composer2, int i10) {
                                        TextStyle m5810copyp1EtxEg;
                                        ComposerKt.sourceInformation(composer2, "C107@4793L5,110@4896L39:Tab.kt#uh7d8r");
                                        if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(708874428, i10, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                                            }
                                            m5810copyp1EtxEg = r3.m5810copyp1EtxEg((r48 & 1) != 0 ? r3.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r3.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r3.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                                            TextKt.ProvideTextStyle(m5810copyp1EtxEg, function23, composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54) : null;
                                startRestartGroup.endReplaceGroup();
                                int i10 = (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                                int i11 = i3 >> 6;
                                m2258TabbogVsAg(z, function0, companion, z3, j4, j5, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                        invoke(columnScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(ColumnScope columnScope, Composer composer2, int i12) {
                                        ComposerKt.sourceInformation(composer2, "C122@5143L49:Tab.kt#uh7d8r");
                                        if ((i12 & 17) == 16 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1540996038, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                                        }
                                        TabKt.TabBaselineLayout(rememberComposableLambda, function24, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, i10 | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = companion;
                                z4 = z3;
                                j6 = j4;
                                function25 = function24;
                                function26 = function23;
                                j7 = j5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier3 = modifier2;
                                z4 = z3;
                                function26 = function23;
                                j7 = j3;
                                function25 = function22;
                                j6 = j;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$2
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

                                    public final void invoke(Composer composer2, int i12) {
                                        TabKt.m2259TabwqdebIU(z, function0, modifier3, z4, function26, function25, j6, j7, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((1572864 & i) == 0) {
                        }
                        if ((i & 12582912) != 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                        }
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(79583089);
                        ComposerKt.sourceInformation(startRestartGroup, "*105@4702L247");
                        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda2 = function23 != null ? ComposableLambdaKt.rememberComposableLambda(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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

                            public final void invoke(Composer composer2, int i102) {
                                TextStyle m5810copyp1EtxEg;
                                ComposerKt.sourceInformation(composer2, "C107@4793L5,110@4896L39:Tab.kt#uh7d8r");
                                if ((i102 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(708874428, i102, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                                    }
                                    m5810copyp1EtxEg = r3.m5810copyp1EtxEg((r48 & 1) != 0 ? r3.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r3.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r3.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                                    TextKt.ProvideTextStyle(m5810copyp1EtxEg, function23, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54) : null;
                        startRestartGroup.endReplaceGroup();
                        int i102 = (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                        int i112 = i3 >> 6;
                        m2258TabbogVsAg(z, function0, companion, z3, j4, j5, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                invoke(columnScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope columnScope, Composer composer2, int i12) {
                                ComposerKt.sourceInformation(composer2, "C122@5143L49:Tab.kt#uh7d8r");
                                if ((i12 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1540996038, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                                }
                                TabKt.TabBaselineLayout(rememberComposableLambda2, function24, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, i102 | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = companion;
                        z4 = z3;
                        j6 = j4;
                        function25 = function24;
                        function26 = function23;
                        j7 = j5;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function23 = function2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) != 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(79583089);
                    ComposerKt.sourceInformation(startRestartGroup, "*105@4702L247");
                    final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda22 = function23 != null ? ComposableLambdaKt.rememberComposableLambda(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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

                        public final void invoke(Composer composer2, int i1022) {
                            TextStyle m5810copyp1EtxEg;
                            ComposerKt.sourceInformation(composer2, "C107@4793L5,110@4896L39:Tab.kt#uh7d8r");
                            if ((i1022 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(708874428, i1022, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                                }
                                m5810copyp1EtxEg = r3.m5810copyp1EtxEg((r48 & 1) != 0 ? r3.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r3.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r3.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                                TextKt.ProvideTextStyle(m5810copyp1EtxEg, function23, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54) : null;
                    startRestartGroup.endReplaceGroup();
                    int i1022 = (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i1122 = i3 >> 6;
                    m2258TabbogVsAg(z, function0, companion, z3, j4, j5, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope columnScope, Composer composer2, int i12) {
                            ComposerKt.sourceInformation(composer2, "C122@5143L49:Tab.kt#uh7d8r");
                            if ((i12 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1540996038, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                            }
                            TabKt.TabBaselineLayout(rememberComposableLambda22, function24, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, i1022 | (57344 & i1122) | (458752 & i1122) | (i1122 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = companion;
                    z4 = z3;
                    j6 = j4;
                    function25 = function24;
                    function26 = function23;
                    j7 = j5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function23 = function2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i8 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(79583089);
                ComposerKt.sourceInformation(startRestartGroup, "*105@4702L247");
                final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda222 = function23 != null ? ComposableLambdaKt.rememberComposableLambda(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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

                    public final void invoke(Composer composer2, int i10222) {
                        TextStyle m5810copyp1EtxEg;
                        ComposerKt.sourceInformation(composer2, "C107@4793L5,110@4896L39:Tab.kt#uh7d8r");
                        if ((i10222 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(708874428, i10222, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                            }
                            m5810copyp1EtxEg = r3.m5810copyp1EtxEg((r48 & 1) != 0 ? r3.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r3.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r3.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                            TextKt.ProvideTextStyle(m5810copyp1EtxEg, function23, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54) : null;
                startRestartGroup.endReplaceGroup();
                int i10222 = (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i11222 = i3 >> 6;
                m2258TabbogVsAg(z, function0, companion, z3, j4, j5, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope columnScope, Composer composer2, int i12) {
                        ComposerKt.sourceInformation(composer2, "C122@5143L49:Tab.kt#uh7d8r");
                        if ((i12 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1540996038, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                        }
                        TabKt.TabBaselineLayout(rememberComposableLambda222, function24, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, i10222 | (57344 & i11222) | (458752 & i11222) | (i11222 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier3 = companion;
                z4 = z3;
                j6 = j4;
                function25 = function24;
                function26 = function23;
                j7 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z3 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function23 = function2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i8 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(79583089);
            ComposerKt.sourceInformation(startRestartGroup, "*105@4702L247");
            final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda2222 = function23 != null ? ComposableLambdaKt.rememberComposableLambda(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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

                public final void invoke(Composer composer2, int i102222) {
                    TextStyle m5810copyp1EtxEg;
                    ComposerKt.sourceInformation(composer2, "C107@4793L5,110@4896L39:Tab.kt#uh7d8r");
                    if ((i102222 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(708874428, i102222, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                        }
                        m5810copyp1EtxEg = r3.m5810copyp1EtxEg((r48 & 1) != 0 ? r3.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r3.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r3.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                        TextKt.ProvideTextStyle(m5810copyp1EtxEg, function23, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54) : null;
            startRestartGroup.endReplaceGroup();
            int i102222 = (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i112222 = i3 >> 6;
            m2258TabbogVsAg(z, function0, companion, z3, j4, j5, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope columnScope, Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C122@5143L49:Tab.kt#uh7d8r");
                    if ((i12 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1540996038, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                    }
                    TabKt.TabBaselineLayout(rememberComposableLambda2222, function24, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, i102222 | (57344 & i112222) | (458752 & i112222) | (i112222 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier3 = companion;
            z4 = z3;
            j6 = j4;
            function25 = function24;
            function26 = function23;
            j7 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function23 = function2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i8 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(79583089);
        ComposerKt.sourceInformation(startRestartGroup, "*105@4702L247");
        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda22222 = function23 != null ? ComposableLambdaKt.rememberComposableLambda(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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

            public final void invoke(Composer composer2, int i1022222) {
                TextStyle m5810copyp1EtxEg;
                ComposerKt.sourceInformation(composer2, "C107@4793L5,110@4896L39:Tab.kt#uh7d8r");
                if ((i1022222 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(708874428, i1022222, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                    }
                    m5810copyp1EtxEg = r3.m5810copyp1EtxEg((r48 & 1) != 0 ? r3.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r3.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r3.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                    TextKt.ProvideTextStyle(m5810copyp1EtxEg, function23, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54) : null;
        startRestartGroup.endReplaceGroup();
        int i1022222 = (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168);
        int i1122222 = i3 >> 6;
        m2258TabbogVsAg(z, function0, companion, z3, j4, j5, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope columnScope, Composer composer2, int i12) {
                ComposerKt.sourceInformation(composer2, "C122@5143L49:Tab.kt#uh7d8r");
                if ((i12 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1540996038, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                }
                TabKt.TabBaselineLayout(rememberComposableLambda22222, function24, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, i1022222 | (57344 & i1122222) | (458752 & i1122222) | (i1122222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        mutableInteractionSource3 = mutableInteractionSource2;
        modifier3 = companion;
        z4 = z3;
        j6 = j4;
        function25 = function24;
        function26 = function23;
        j7 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a5  */
    /* renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2257LeadingIconTabwqdebIU(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        long j3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        long j4;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        long j5;
        Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource4;
        final long j6;
        final long j7;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-777316544);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingIconTab)P(5,4,7,1,3!1,6:c#ui.graphics.Color,8:c#ui.graphics.Color)164@7036L7,171@7399L76,173@7551L950,173@7481L1020:Tab.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0 && startRestartGroup.changed(j)) {
                        i7 = 1048576;
                        i3 |= i7;
                    }
                    i7 = 524288;
                    i3 |= i7;
                }
                if ((12582912 & i) == 0) {
                    j3 = j2;
                    i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                } else {
                    j3 = j2;
                }
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                } else if ((100663296 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            boolean z5 = i4 == 0 ? true : z2;
                            if ((i2 & 64) == 0) {
                                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j4 = ((Color) consume).m3850unboximpl();
                                i3 &= -3670017;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 128) != 0) {
                                i3 = (-29360129) & i3;
                                j3 = j4;
                            }
                            if (i5 == 0) {
                                mutableInteractionSource3 = null;
                                i6 = i3;
                                j5 = j3;
                                z3 = z5;
                                modifier3 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-777316544, i6, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:167)");
                                }
                                final Indication m2087rippleOrFallbackImplementation9IZ8Weo = RippleKt.m2087rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i6 >> 12) & 896) | 6, 2);
                                final Modifier modifier4 = modifier3;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                final boolean z6 = z3;
                                Modifier modifier5 = modifier3;
                                int i9 = i6;
                                int i10 = i9 >> 18;
                                m2260TabTransitionKlgxPg(j4, j5, z, ComposableLambdaKt.rememberComposableLambda(-429037564, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
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

                                    public final void invoke(Composer composer2, int i11) {
                                        float f;
                                        float f2;
                                        TextStyle m5810copyp1EtxEg;
                                        ComposerKt.sourceInformation(composer2, "C174@7561L934:Tab.kt#uh7d8r");
                                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-429037564, i11, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
                                            }
                                            Modifier modifier6 = Modifier.this;
                                            f = TabKt.SmallTabHeight;
                                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m683paddingVpY3zN4$default(SelectableKt.m932selectableO2vRcR0(SizeKt.m712height3ABfNKs(modifier6, f), z, mutableInteractionSource5, m2087rippleOrFallbackImplementation9IZ8Weo, z6, Role.m5587boximpl(Role.INSTANCE.m5600getTabo7Vup1c()), function0), TabKt.getHorizontalTextPadding(), 0.0f, 2, null), 0.0f, 1, null);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function2<Composer, Integer, Unit> function23 = function22;
                                            Function2<Composer, Integer, Unit> function24 = function2;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                                            Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2028967152, "C191@8233L6,192@8252L59,194@8393L5,195@8446L39:Tab.kt#uh7d8r");
                                            function23.invoke(composer2, 0);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            f2 = TabKt.TextDistanceFromLeadingIcon;
                                            SpacerKt.Spacer(SizeKt.m723requiredWidth3ABfNKs(companion, f2), composer2, 6);
                                            m5810copyp1EtxEg = r7.m5810copyp1EtxEg((r48 & 1) != 0 ? r7.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r7.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r7.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r7.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r7.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r7.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r7.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r7.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r7.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r7.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r7.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r7.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r7.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r7.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r7.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r7.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r7.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r7.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r7.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r7.platformStyle : null, (r48 & 1048576) != 0 ? r7.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r7.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r7.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                                            TextKt.ProvideTextStyle(m5810copyp1EtxEg, function24, composer2, 0);
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
                                }, startRestartGroup, 54), startRestartGroup, (i10 & 112) | (i10 & 14) | 3072 | ((i9 << 6) & 896));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z4 = z3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier2 = modifier5;
                                j6 = j4;
                                j7 = j5;
                            } else {
                                z3 = z5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            z3 = z2;
                            j4 = j;
                        }
                        modifier3 = modifier2;
                        j5 = j3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i6 = i3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Indication m2087rippleOrFallbackImplementation9IZ8Weo2 = RippleKt.m2087rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i6 >> 12) & 896) | 6, 2);
                        final Modifier modifier42 = modifier3;
                        final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                        final boolean z62 = z3;
                        Modifier modifier52 = modifier3;
                        int i92 = i6;
                        int i102 = i92 >> 18;
                        m2260TabTransitionKlgxPg(j4, j5, z, ComposableLambdaKt.rememberComposableLambda(-429037564, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
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

                            public final void invoke(Composer composer2, int i11) {
                                float f;
                                float f2;
                                TextStyle m5810copyp1EtxEg;
                                ComposerKt.sourceInformation(composer2, "C174@7561L934:Tab.kt#uh7d8r");
                                if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-429037564, i11, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
                                    }
                                    Modifier modifier6 = Modifier.this;
                                    f = TabKt.SmallTabHeight;
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m683paddingVpY3zN4$default(SelectableKt.m932selectableO2vRcR0(SizeKt.m712height3ABfNKs(modifier6, f), z, mutableInteractionSource52, m2087rippleOrFallbackImplementation9IZ8Weo2, z62, Role.m5587boximpl(Role.INSTANCE.m5600getTabo7Vup1c()), function0), TabKt.getHorizontalTextPadding(), 0.0f, 2, null), 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function23 = function22;
                                    Function2<Composer, Integer, Unit> function24 = function2;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                                    Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2028967152, "C191@8233L6,192@8252L59,194@8393L5,195@8446L39:Tab.kt#uh7d8r");
                                    function23.invoke(composer2, 0);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    f2 = TabKt.TextDistanceFromLeadingIcon;
                                    SpacerKt.Spacer(SizeKt.m723requiredWidth3ABfNKs(companion, f2), composer2, 6);
                                    m5810copyp1EtxEg = r7.m5810copyp1EtxEg((r48 & 1) != 0 ? r7.spanStyle.m5734getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r7.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r7.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r7.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r7.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r7.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r7.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r7.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r7.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r7.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r7.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r7.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r7.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r7.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r7.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r7.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m6188getCentere0LSkKk(), (r48 & 65536) != 0 ? r7.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r7.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r7.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r7.platformStyle : null, (r48 & 1048576) != 0 ? r7.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r7.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r7.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer2, 6).paragraphStyle.getTextMotion() : null);
                                    TextKt.ProvideTextStyle(m5810copyp1EtxEg, function24, composer2, 0);
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
                        }, startRestartGroup, 54), startRestartGroup, (i102 & 112) | (i102 & 14) | 3072 | ((i92 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier2 = modifier52;
                        j6 = j4;
                        j7 = j5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        j7 = j3;
                        j6 = j;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
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

                            public final void invoke(Composer composer2, int i11) {
                                TabKt.m2257LeadingIconTabwqdebIU(z, function0, function2, function22, modifier2, z4, j6, j7, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i5 == 0) {
                }
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i5 == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b5  */
    /* renamed from: Tab-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2258TabbogVsAg(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        long j3;
        long j4;
        int i5;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier2;
        final boolean z4;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-202735880);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3,1,6:c#ui.graphics.Color,7:c#ui.graphics.Color,2)238@10306L7,246@10715L76,248@10867L600,248@10797L670:Tab.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        j3 = j;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        j4 = j2;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                    if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j3 = ((Color) consume).m3850unboximpl();
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                j4 = j3;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                                final boolean z5 = z3;
                                long j7 = j3;
                                long j8 = j4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-202735880, i3, -1, "androidx.compose.material3.Tab (Tab.kt:242)");
                                }
                                final Indication m2087rippleOrFallbackImplementation9IZ8Weo = RippleKt.m2087rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, j7, startRestartGroup, ((i3 >> 6) & 896) | 6, 2);
                                final Modifier modifier3 = companion;
                                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                int i9 = i3 >> 12;
                                m2260TabTransitionKlgxPg(j7, j8, z, ComposableLambdaKt.rememberComposableLambda(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
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

                                    public final void invoke(Composer composer2, int i10) {
                                        ComposerKt.sourceInformation(composer2, "C249@10877L584:Tab.kt#uh7d8r");
                                        if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-551896140, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                                            }
                                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m932selectableO2vRcR0(Modifier.this, z, mutableInteractionSource3, m2087rippleOrFallbackImplementation9IZ8Weo, z5, Role.m5587boximpl(Role.INSTANCE.m5600getTabo7Vup1c()), function0), 0.0f, 1, null);
                                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                                            Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                            function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
                                }, startRestartGroup, 54), startRestartGroup, (i9 & 112) | (i9 & 14) | 3072 | ((i3 << 6) & 896));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                z4 = z5;
                                j5 = j7;
                                j6 = j8;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        final boolean z52 = z3;
                        long j72 = j3;
                        long j82 = j4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Indication m2087rippleOrFallbackImplementation9IZ8Weo2 = RippleKt.m2087rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, j72, startRestartGroup, ((i3 >> 6) & 896) | 6, 2);
                        final Modifier modifier32 = companion;
                        final MutableInteractionSource mutableInteractionSource32 = mutableInteractionSource2;
                        int i92 = i3 >> 12;
                        m2260TabTransitionKlgxPg(j72, j82, z, ComposableLambdaKt.rememberComposableLambda(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
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

                            public final void invoke(Composer composer2, int i10) {
                                ComposerKt.sourceInformation(composer2, "C249@10877L584:Tab.kt#uh7d8r");
                                if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-551896140, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                                    }
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m932selectableO2vRcR0(Modifier.this, z, mutableInteractionSource32, m2087rippleOrFallbackImplementation9IZ8Weo2, z52, Role.m5587boximpl(Role.INSTANCE.m5600getTabo7Vup1c()), function0), 0.0f, 1, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                                    Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
                        }, startRestartGroup, 54), startRestartGroup, (i92 & 112) | (i92 & 14) | 3072 | ((i3 << 6) & 896));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        z4 = z52;
                        j5 = j72;
                        j6 = j82;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        mutableInteractionSource2 = mutableInteractionSource;
                        z4 = z3;
                        j5 = j3;
                        j6 = j4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$4
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

                            public final void invoke(Composer composer2, int i10) {
                                TabKt.m2258TabbogVsAg(z, function0, modifier2, z4, j5, j6, mutableInteractionSource4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i5 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                final boolean z522 = z3;
                long j722 = j3;
                long j822 = j4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Indication m2087rippleOrFallbackImplementation9IZ8Weo22 = RippleKt.m2087rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, j722, startRestartGroup, ((i3 >> 6) & 896) | 6, 2);
                final Modifier modifier322 = companion;
                final MutableInteractionSource mutableInteractionSource322 = mutableInteractionSource2;
                int i922 = i3 >> 12;
                m2260TabTransitionKlgxPg(j722, j822, z, ComposableLambdaKt.rememberComposableLambda(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
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

                    public final void invoke(Composer composer2, int i10) {
                        ComposerKt.sourceInformation(composer2, "C249@10877L584:Tab.kt#uh7d8r");
                        if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-551896140, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m932selectableO2vRcR0(Modifier.this, z, mutableInteractionSource322, m2087rippleOrFallbackImplementation9IZ8Weo22, z522, Role.m5587boximpl(Role.INSTANCE.m5600getTabo7Vup1c()), function0), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                            Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
                }, startRestartGroup, 54), startRestartGroup, (i922 & 112) | (i922 & 14) | 3072 | ((i3 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                z4 = z522;
                j5 = j722;
                j6 = j822;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            final boolean z5222 = z3;
            long j7222 = j3;
            long j8222 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final Indication m2087rippleOrFallbackImplementation9IZ8Weo222 = RippleKt.m2087rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, j7222, startRestartGroup, ((i3 >> 6) & 896) | 6, 2);
            final Modifier modifier3222 = companion;
            final MutableInteractionSource mutableInteractionSource3222 = mutableInteractionSource2;
            int i9222 = i3 >> 12;
            m2260TabTransitionKlgxPg(j7222, j8222, z, ComposableLambdaKt.rememberComposableLambda(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
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

                public final void invoke(Composer composer2, int i10) {
                    ComposerKt.sourceInformation(composer2, "C249@10877L584:Tab.kt#uh7d8r");
                    if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-551896140, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m932selectableO2vRcR0(Modifier.this, z, mutableInteractionSource3222, m2087rippleOrFallbackImplementation9IZ8Weo222, z5222, Role.m5587boximpl(Role.INSTANCE.m5600getTabo7Vup1c()), function0), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                        Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
            }, startRestartGroup, 54), startRestartGroup, (i9222 & 112) | (i9222 & 14) | 3072 | ((i3 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            z4 = z5222;
            j5 = j7222;
            j6 = j8222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        final boolean z52222 = z3;
        long j72222 = j3;
        long j82222 = j4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final Indication m2087rippleOrFallbackImplementation9IZ8Weo2222 = RippleKt.m2087rippleOrFallbackImplementation9IZ8Weo(true, 0.0f, j72222, startRestartGroup, ((i3 >> 6) & 896) | 6, 2);
        final Modifier modifier32222 = companion;
        final MutableInteractionSource mutableInteractionSource32222 = mutableInteractionSource2;
        int i92222 = i3 >> 12;
        m2260TabTransitionKlgxPg(j72222, j82222, z, ComposableLambdaKt.rememberComposableLambda(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
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

            public final void invoke(Composer composer2, int i10) {
                ComposerKt.sourceInformation(composer2, "C249@10877L584:Tab.kt#uh7d8r");
                if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-551896140, i10, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m932selectableO2vRcR0(Modifier.this, z, mutableInteractionSource32222, m2087rippleOrFallbackImplementation9IZ8Weo2222, z52222, Role.m5587boximpl(Role.INSTANCE.m5600getTabo7Vup1c()), function0), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                    Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
        }, startRestartGroup, 54), startRestartGroup, (i92222 & 112) | (i92222 & 14) | 3072 | ((i3 << 6) & 896));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        z4 = z52222;
        j5 = j72222;
        j6 = j82222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m2260TabTransitionKlgxPg(final long j, final long j2, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(735731848);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)280@11898L26,282@11961L548,297@12514L77:Tab.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735731848, i2, -1, "androidx.compose.material3.TabTransition (Tab.kt:279)");
            }
            int i3 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, startRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i4) {
                    TweenSpec tween$default;
                    composer2.startReplaceGroup(-899623535);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-899623535, i4, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:284)");
                    }
                    if (segment.isTransitioningTo(false, true)) {
                        tween$default = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
                    } else {
                        tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(-1997025499);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j3 = booleanValue ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m3844getColorSpaceimpl = Color.m3844getColorSpaceimpl(j3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m3844getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceGroup(-1997025499);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j4 = booleanValue2 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m3830boximpl = Color.m3830boximpl(j4);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(-1997025499);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j5 = booleanValue3 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl, Color.m3830boximpl(j5), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(TabTransition_Klgx_Pg$lambda$2(createTransitionAnimation))), function2, startRestartGroup, (i3 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$TabTransition$1
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

                public final void invoke(Composer composer2, int i4) {
                    TabKt.m2260TabTransitionKlgxPg(j, j2, z, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(514131524);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabBaselineLayout)P(1)314@13233L2042,307@12989L2286:Tab.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(514131524, i2, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 370960155, "CC(remember):Tab.kt#9igjgp");
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        final Placeable placeable;
                        final Placeable placeable2;
                        long j2;
                        if (function2 != null) {
                            int size = list.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                Measurable measurable = list.get(i4);
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "text")) {
                                    placeable = measurable.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable = null;
                        if (function22 != null) {
                            int size2 = list.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                Measurable measurable2 = list.get(i5);
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                    placeable2 = measurable2.mo5175measureBRTryo0(j);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeable2 = null;
                        final int max = Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
                        int i6 = measureScope.mo367roundToPx0680j_4((placeable == null || placeable2 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                        int height = placeable2 != null ? placeable2.getHeight() : 0;
                        int height2 = placeable != null ? placeable.getHeight() : 0;
                        j2 = TabKt.IconDistanceFromBaseline;
                        final int max2 = Math.max(i6, height + height2 + measureScope.mo366roundToPxR2X_6o(j2));
                        final Integer valueOf = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline())) : null;
                        final Integer valueOf2 = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline())) : null;
                        return MeasureScope.layout$default(measureScope, max, max2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1.1
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
                                Placeable placeable3;
                                Placeable placeable4 = Placeable.this;
                                if (placeable4 == null || (placeable3 = placeable2) == null) {
                                    if (placeable4 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable4, max2);
                                        return;
                                    }
                                    Placeable placeable5 = placeable2;
                                    if (placeable5 != null) {
                                        TabKt.placeTextOrIcon(placementScope, placeable5, max2);
                                        return;
                                    }
                                    return;
                                }
                                MeasureScope measureScope2 = measureScope;
                                int i7 = max;
                                int i8 = max2;
                                Integer num = valueOf;
                                Intrinsics.checkNotNull(num);
                                int intValue = num.intValue();
                                Integer num2 = valueOf2;
                                Intrinsics.checkNotNull(num2);
                                TabKt.placeTextAndIcon(placementScope, measureScope2, placeable4, placeable3, i7, i8, intValue, num2.intValue());
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1248753480, "C:Tab.kt#uh7d8r");
            startRestartGroup.startReplaceGroup(871566271);
            ComposerKt.sourceInformation(startRestartGroup, "309@13038L85");
            if (function2 != null) {
                Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "text"), HorizontalTextPadding, 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m683paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 719667646, "C309@13115L6:Tab.kt#uh7d8r");
                function2.invoke(startRestartGroup, Integer.valueOf(i3));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(871570579);
            ComposerKt.sourceInformation(startRestartGroup, "312@13174L41");
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "icon");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 719758910, "C312@13207L6:Tab.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$3
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

                public final void invoke(Composer composer2, int i4) {
                    TabKt.TabBaselineLayout(function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        float f;
        if (i3 == i4) {
            f = SingleLineTextBaselineWithIcon;
        } else {
            f = DoubleLineTextBaselineWithIcon;
        }
        int mo367roundToPx0680j_4 = density.mo367roundToPx0680j_4(f) + density.mo367roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m3138getActiveIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo366roundToPxR2X_6o(IconDistanceFromBaseline)) - i3;
        int i5 = (i2 - i4) - mo367roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - height, 0.0f, 4, null);
    }

    public static final float getHorizontalTextPadding() {
        return HorizontalTextPadding;
    }

    private static final long TabTransition_Klgx_Pg$lambda$2(State<Color> state) {
        return state.getValue().m3850unboximpl();
    }
}
