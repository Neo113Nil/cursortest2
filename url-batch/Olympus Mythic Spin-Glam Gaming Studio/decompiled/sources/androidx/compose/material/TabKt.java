package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
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
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001av\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0002\b\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a@\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010 \u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b \u0010!\u001a#\u0010'\u001a\u00020\u0003*\u00020\"2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(\u001aK\u00100\u001a\u00020\u0003*\u00020\"2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020%H\u0002¢\u0006\u0004\b0\u00101\"\u0017\u00103\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b3\u00104\"\u0017\u00105\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b5\u00104\"\u0017\u00106\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00104\"\u0017\u00107\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b7\u00104\"\u0017\u00108\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u00104\"\u0017\u0010:\u001a\u0002098\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b:\u0010;\"\u0017\u0010<\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b<\u00104\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "content", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "textOrIconPlaceable", "", "tabHeight", "placeTextOrIcon", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;I)V", "Landroidx/compose/ui/unit/Density;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "placeTextAndIcon", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IIII)V", "Landroidx/compose/ui/unit/Dp;", "SmallTabHeight", "F", "LargeTabHeight", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/TextUnit;", "IconDistanceFromBaseline", "J", "TextDistanceFromLeadingIcon", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TabKt {
    private static final float SmallTabHeight = Dp.m2507constructorimpl(48);
    private static final float LargeTabHeight = Dp.m2507constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m2507constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m2507constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m2507constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m2507constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f6  */
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1008Tab0nDMI0(final boolean z, final Function0 onClick, Modifier modifier, boolean z2, Function2 function2, Function2 function22, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        Function2 function23;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        MutableInteractionSource mutableInteractionSource3;
        long j4;
        Modifier modifier2;
        boolean z3;
        MutableInteractionSource mutableInteractionSource4;
        long j5;
        long j6;
        final Function2 function24;
        final Function2 function25;
        boolean z4;
        Composer composer2;
        final Function2 function26;
        final Modifier modifier3;
        final Function2 function27;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource5;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1486097588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(function2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        function23 = function22;
                        i3 |= startRestartGroup.changed(function23) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i & 3670016) == 0) {
                                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 29360128) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(j)) {
                                i8 = 8388608;
                                i3 |= i8;
                            }
                            i8 = 4194304;
                            i3 |= i8;
                        }
                        if ((i & 234881024) == 0) {
                            j3 = j2;
                            i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? 67108864 : 33554432;
                        } else {
                            j3 = j2;
                        }
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            ComposableLambda composableLambda = null;
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z6 = i4 != 0 ? true : z2;
                                Function2 function28 = i5 != 0 ? null : function2;
                                if (i6 != 0) {
                                    function23 = null;
                                }
                                if (i7 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i2 & 128) != 0) {
                                    j4 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue();
                                    i3 &= -29360129;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 256) != 0) {
                                    j3 = Color.m1445copywmQWz5c$default(j4, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i3 &= -234881025;
                                }
                                modifier2 = modifier4;
                                z3 = z6;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                j5 = j3;
                                j6 = j4;
                                function24 = function23;
                                function25 = function28;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                modifier2 = modifier;
                                z3 = z2;
                                j6 = j;
                                j5 = j3;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                function24 = function23;
                                function25 = function2;
                            }
                            startRestartGroup.endDefaults();
                            if (function25 != null) {
                                z4 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new Function2() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i10) {
                                        TextStyle m2257copyHL5avdY;
                                        if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            m2257copyHL5avdY = r3.m2257copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), (r42 & 32768) != 0 ? r3.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton().paragraphStyle.getTextIndent() : null);
                                            TextKt.ProvideTextStyle(m2257copyHL5avdY, Function2.this, composer3, (i3 >> 9) & 112);
                                        }
                                    }
                                });
                            } else {
                                z4 = true;
                            }
                            final ComposableLambda composableLambda2 = composableLambda;
                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3() { // from class: androidx.compose.material.TabKt$Tab$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer3, int i10) {
                                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                                    if ((i10 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TabKt.TabBaselineLayout(Function2.this, function24, composer3, (i3 >> 12) & 112);
                                    }
                                }
                            });
                            int i10 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i11 = i3 >> 6;
                            composer2 = startRestartGroup;
                            m1009TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda3, startRestartGroup, i10 | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
                            function26 = function25;
                            modifier3 = modifier2;
                            function27 = function24;
                            z5 = z3;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            j7 = j6;
                            j8 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z5 = z2;
                            function26 = function2;
                            composer2 = startRestartGroup;
                            long j9 = j3;
                            mutableInteractionSource5 = mutableInteractionSource2;
                            j7 = j;
                            function27 = function23;
                            j8 = j9;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$Tab$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i12) {
                                TabKt.m1008Tab0nDMI0(z, onClick, modifier3, z5, function26, function27, mutableInteractionSource5, j7, j8, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    function23 = function22;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    ComposableLambda composableLambda4 = null;
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    modifier2 = modifier4;
                    z3 = z6;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    j5 = j3;
                    j6 = j4;
                    function24 = function23;
                    function25 = function28;
                    startRestartGroup.endDefaults();
                    if (function25 != null) {
                    }
                    final Function2 composableLambda22 = composableLambda4;
                    ComposableLambda composableLambda32 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer3, int i102) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            if ((i102 & 81) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                TabKt.TabBaselineLayout(Function2.this, function24, composer3, (i3 >> 12) & 112);
                            }
                        }
                    });
                    int i102 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i112 = i3 >> 6;
                    composer2 = startRestartGroup;
                    m1009TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda32, startRestartGroup, i102 | (57344 & i112) | (458752 & i112) | (i112 & 3670016), 0);
                    function26 = function25;
                    modifier3 = modifier2;
                    function27 = function24;
                    z5 = z3;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    j7 = j6;
                    j8 = j5;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function23 = function22;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                ComposableLambda composableLambda42 = null;
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                modifier2 = modifier4;
                z3 = z6;
                mutableInteractionSource4 = mutableInteractionSource3;
                j5 = j3;
                j6 = j4;
                function24 = function23;
                function25 = function28;
                startRestartGroup.endDefaults();
                if (function25 != null) {
                }
                final Function2 composableLambda222 = composableLambda42;
                ComposableLambda composableLambda322 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer3, int i1022) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        if ((i1022 & 81) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            TabKt.TabBaselineLayout(Function2.this, function24, composer3, (i3 >> 12) & 112);
                        }
                    }
                });
                int i1022 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1122 = i3 >> 6;
                composer2 = startRestartGroup;
                m1009TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda322, startRestartGroup, i1022 | (57344 & i1122) | (458752 & i1122) | (i1122 & 3670016), 0);
                function26 = function25;
                modifier3 = modifier2;
                function27 = function24;
                z5 = z3;
                mutableInteractionSource5 = mutableInteractionSource4;
                j7 = j6;
                j8 = j5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function23 = function22;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            ComposableLambda composableLambda422 = null;
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            modifier2 = modifier4;
            z3 = z6;
            mutableInteractionSource4 = mutableInteractionSource3;
            j5 = j3;
            j6 = j4;
            function24 = function23;
            function25 = function28;
            startRestartGroup.endDefaults();
            if (function25 != null) {
            }
            final Function2 composableLambda2222 = composableLambda422;
            ComposableLambda composableLambda3222 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3() { // from class: androidx.compose.material.TabKt$Tab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer3, int i10222) {
                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                    if ((i10222 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        TabKt.TabBaselineLayout(Function2.this, function24, composer3, (i3 >> 12) & 112);
                    }
                }
            });
            int i10222 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i11222 = i3 >> 6;
            composer2 = startRestartGroup;
            m1009TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda3222, startRestartGroup, i10222 | (57344 & i11222) | (458752 & i11222) | (i11222 & 3670016), 0);
            function26 = function25;
            modifier3 = modifier2;
            function27 = function24;
            z5 = z3;
            mutableInteractionSource5 = mutableInteractionSource4;
            j7 = j6;
            j8 = j5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function23 = function22;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        ComposableLambda composableLambda4222 = null;
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        modifier2 = modifier4;
        z3 = z6;
        mutableInteractionSource4 = mutableInteractionSource3;
        j5 = j3;
        j6 = j4;
        function24 = function23;
        function25 = function28;
        startRestartGroup.endDefaults();
        if (function25 != null) {
        }
        final Function2 composableLambda22222 = composableLambda4222;
        ComposableLambda composableLambda32222 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, z4, new Function3() { // from class: androidx.compose.material.TabKt$Tab$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@NotNull ColumnScope Tab, @Nullable Composer composer3, int i102222) {
                Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                if ((i102222 & 81) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    TabKt.TabBaselineLayout(Function2.this, function24, composer3, (i3 >> 12) & 112);
                }
            }
        });
        int i102222 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168);
        int i112222 = i3 >> 6;
        composer2 = startRestartGroup;
        m1009TabEVJuX4I(z, onClick, modifier2, z3, mutableInteractionSource4, j6, j5, composableLambda32222, startRestartGroup, i102222 | (57344 & i112222) | (458752 & i112222) | (i112222 & 3670016), 0);
        function26 = function25;
        modifier3 = modifier2;
        function27 = function24;
        z5 = z3;
        mutableInteractionSource5 = mutableInteractionSource4;
        j7 = j6;
        j8 = j5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ab  */
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1007LeadingIconTab0nDMI0(final boolean z, final Function0 onClick, final Function2 text, final Function2 icon, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        long j3;
        MutableInteractionSource mutableInteractionSource2;
        long j4;
        int i6;
        Modifier modifier2;
        long j5;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        final Modifier modifier3;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource4;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1499861761);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((458752 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    if ((29360128 & i) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(j)) {
                            i7 = 8388608;
                            i3 |= i7;
                        }
                        i7 = 4194304;
                        i3 |= i7;
                    }
                    if ((i & 234881024) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? 67108864 : 33554432;
                    } else {
                        j3 = j2;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i2 & 128) == 0) {
                                j4 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue();
                                i3 &= -29360129;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 256) == 0) {
                                j6 = j4;
                                i6 = i3 & (-234881025);
                                modifier2 = modifier4;
                                j5 = Color.m1445copywmQWz5c$default(j6, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                i6 = i3;
                                modifier2 = modifier4;
                                j5 = j3;
                                j6 = j4;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource3 = mutableInteractionSource;
                            j6 = j;
                            i6 = i3;
                            z4 = z3;
                            j5 = j3;
                        }
                        startRestartGroup.endDefaults();
                        final Indication m1075rememberRipple9IZ8Weo = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
                        final Modifier modifier5 = modifier2;
                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        final boolean z6 = z4;
                        final int i9 = i6;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i10) {
                                float f;
                                float f2;
                                float f3;
                                TextStyle m2257copyHL5avdY;
                                if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier modifier6 = Modifier.this;
                                    f = TabKt.SmallTabHeight;
                                    Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(SizeKt.m347height3ABfNKs(modifier6, f), z, mutableInteractionSource5, m1075rememberRipple9IZ8Weo, z6, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                                    f2 = TabKt.HorizontalTextPadding;
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m336paddingVpY3zN4$default(m498selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2 function2 = icon;
                                    int i11 = i9;
                                    Function2 function22 = text;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                    if (composer2.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1002887383);
                                    function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    f3 = TabKt.TextDistanceFromLeadingIcon;
                                    SpacerKt.Spacer(SizeKt.m356requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                                    m2257copyHL5avdY = r8.m2257copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                                    TextKt.ProvideTextStyle(m2257copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                        int i10 = i6 >> 21;
                        m1010TabTransitionKlgxPg(j6, j5, z, composableLambda, startRestartGroup, (i10 & 112) | (i10 & 14) | 3072 | ((i6 << 6) & 896));
                        modifier3 = modifier2;
                        z5 = z4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        j7 = j6;
                        j8 = j5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j7 = j;
                        j8 = j3;
                        mutableInteractionSource4 = mutableInteractionSource;
                        z5 = z3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11) {
                            TabKt.m1007LeadingIconTab0nDMI0(z, onClick, text, icon, modifier3, z5, mutableInteractionSource4, j7, j8, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                if ((29360128 & i) == 0) {
                }
                if ((i & 234881024) != 0) {
                }
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                startRestartGroup.endDefaults();
                final Indication m1075rememberRipple9IZ8Weo2 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
                final Modifier modifier52 = modifier2;
                final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                final boolean z62 = z4;
                final int i92 = i6;
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i102) {
                        float f;
                        float f2;
                        float f3;
                        TextStyle m2257copyHL5avdY;
                        if ((i102 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier modifier6 = Modifier.this;
                            f = TabKt.SmallTabHeight;
                            Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(SizeKt.m347height3ABfNKs(modifier6, f), z, mutableInteractionSource52, m1075rememberRipple9IZ8Weo2, z62, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                            f2 = TabKt.HorizontalTextPadding;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m336paddingVpY3zN4$default(m498selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2 function2 = icon;
                            int i11 = i92;
                            Function2 function22 = text;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1002887383);
                            function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            f3 = TabKt.TextDistanceFromLeadingIcon;
                            SpacerKt.Spacer(SizeKt.m356requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                            m2257copyHL5avdY = r8.m2257copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                            TextKt.ProvideTextStyle(m2257copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                int i102 = i6 >> 21;
                m1010TabTransitionKlgxPg(j6, j5, z, composableLambda2, startRestartGroup, (i102 & 112) | (i102 & 14) | 3072 | ((i6 << 6) & 896));
                modifier3 = modifier2;
                z5 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                j7 = j6;
                j8 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((29360128 & i) == 0) {
            }
            if ((i & 234881024) != 0) {
            }
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z3;
            startRestartGroup.endDefaults();
            final Indication m1075rememberRipple9IZ8Weo22 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
            final Modifier modifier522 = modifier2;
            final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
            final boolean z622 = z4;
            final int i922 = i6;
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@Nullable Composer composer2, int i1022) {
                    float f;
                    float f2;
                    float f3;
                    TextStyle m2257copyHL5avdY;
                    if ((i1022 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier modifier6 = Modifier.this;
                        f = TabKt.SmallTabHeight;
                        Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(SizeKt.m347height3ABfNKs(modifier6, f), z, mutableInteractionSource522, m1075rememberRipple9IZ8Weo22, z622, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                        f2 = TabKt.HorizontalTextPadding;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m336paddingVpY3zN4$default(m498selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2 function2 = icon;
                        int i11 = i922;
                        Function2 function22 = text;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1002887383);
                        function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        f3 = TabKt.TextDistanceFromLeadingIcon;
                        SpacerKt.Spacer(SizeKt.m356requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                        m2257copyHL5avdY = r8.m2257copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                        TextKt.ProvideTextStyle(m2257copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            int i1022 = i6 >> 21;
            m1010TabTransitionKlgxPg(j6, j5, z, composableLambda22, startRestartGroup, (i1022 & 112) | (i1022 & 14) | 3072 | ((i6 << 6) & 896));
            modifier3 = modifier2;
            z5 = z4;
            mutableInteractionSource4 = mutableInteractionSource3;
            j7 = j6;
            j8 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((29360128 & i) == 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource2;
        z4 = z3;
        startRestartGroup.endDefaults();
        final Indication m1075rememberRipple9IZ8Weo222 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
        final Modifier modifier5222 = modifier2;
        final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
        final boolean z6222 = z4;
        final int i9222 = i6;
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@Nullable Composer composer2, int i10222) {
                float f;
                float f2;
                float f3;
                TextStyle m2257copyHL5avdY;
                if ((i10222 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier modifier6 = Modifier.this;
                    f = TabKt.SmallTabHeight;
                    Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(SizeKt.m347height3ABfNKs(modifier6, f), z, mutableInteractionSource5222, m1075rememberRipple9IZ8Weo222, z6222, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                    f2 = TabKt.HorizontalTextPadding;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m336paddingVpY3zN4$default(m498selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2 function2 = icon;
                    int i11 = i9222;
                    Function2 function22 = text;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1002887383);
                    function2.invoke(composer2, Integer.valueOf((i11 >> 9) & 14));
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    f3 = TabKt.TextDistanceFromLeadingIcon;
                    SpacerKt.Spacer(SizeKt.m356requiredWidth3ABfNKs(companion2, f3), composer2, 6);
                    m2257copyHL5avdY = r8.m2257copyHL5avdY((r42 & 1) != 0 ? r8.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r8.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r8.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r8.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r8.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r8.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r8.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r8.paragraphStyle.getTextAlign() : TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), (r42 & 32768) != 0 ? r8.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r8.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton().paragraphStyle.getTextIndent() : null);
                    TextKt.ProvideTextStyle(m2257copyHL5avdY, function22, composer2, (i11 >> 3) & 112);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        int i10222 = i6 >> 21;
        m1010TabTransitionKlgxPg(j6, j5, z, composableLambda222, startRestartGroup, (i10222 & 112) | (i10222 & 14) | 3072 | ((i6 << 6) & 896));
        modifier3 = modifier2;
        z5 = z4;
        mutableInteractionSource4 = mutableInteractionSource3;
        j7 = j6;
        j8 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008d  */
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1009TabEVJuX4I(final boolean z, final Function0 onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        long j3;
        MutableInteractionSource mutableInteractionSource2;
        long j4;
        int i6;
        Modifier modifier3;
        long j5;
        long j6;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource4;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(713679175);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(j)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    }
                    if ((3670016 & i) != 0) {
                        j3 = j2;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j2;
                    }
                    if ((i2 & 128) != 0) {
                        i7 = (29360128 & i) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if (i5 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i2 & 32) != 0) {
                                    j4 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue();
                                    i3 &= -458753;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 64) != 0) {
                                    j6 = j4;
                                    i6 = i3 & (-3670017);
                                    modifier3 = modifier5;
                                    j5 = Color.m1445copywmQWz5c$default(j6, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                } else {
                                    i6 = i3;
                                    modifier3 = modifier5;
                                    j5 = j3;
                                    j6 = j4;
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z4 = z3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                j6 = j;
                                i6 = i3;
                                modifier3 = modifier2;
                                z4 = z3;
                                j5 = j3;
                            }
                            startRestartGroup.endDefaults();
                            final Indication m1075rememberRipple9IZ8Weo = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
                            final Modifier modifier6 = modifier3;
                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            final boolean z5 = z4;
                            final int i10 = i6;
                            int i11 = i6 >> 15;
                            m1010TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2() { // from class: androidx.compose.material.TabKt$Tab$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i12) {
                                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m498selectableO2vRcR0(Modifier.this, z, mutableInteractionSource5, m1075rememberRipple9IZ8Weo, z5, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                        Function3 function3 = content;
                                        int i13 = ((i10 >> 12) & 7168) | 432;
                                        composer2.startReplaceableGroup(-483455358);
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        composer2.disableReusing();
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                        Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                        composer2.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composer2.startReplaceableGroup(-1163856341);
                                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i11 & 112) | (i11 & 14) | 3072 | ((i6 << 6) & 896));
                            modifier4 = modifier3;
                            z3 = z4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            j7 = j6;
                            j8 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            mutableInteractionSource4 = mutableInteractionSource;
                            modifier4 = modifier2;
                            j8 = j3;
                            j7 = j;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$Tab$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i12) {
                                TabKt.m1009TabEVJuX4I(z, onClick, modifier4, z3, mutableInteractionSource4, j7, j8, content, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((23967451 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    startRestartGroup.endDefaults();
                    final Indication m1075rememberRipple9IZ8Weo2 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
                    final Modifier modifier62 = modifier3;
                    final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                    final boolean z52 = z4;
                    final int i102 = i6;
                    int i112 = i6 >> 15;
                    m1010TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2() { // from class: androidx.compose.material.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i12) {
                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m498selectableO2vRcR0(Modifier.this, z, mutableInteractionSource52, m1075rememberRipple9IZ8Weo2, z52, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3 function3 = content;
                                int i13 = ((i102 >> 12) & 7168) | 432;
                                composer2.startReplaceableGroup(-483455358);
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-1163856341);
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i112 & 112) | (i112 & 14) | 3072 | ((i6 << 6) & 896));
                    modifier4 = modifier3;
                    z3 = z4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    j7 = j6;
                    j8 = j5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((458752 & i) == 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i3 |= i7;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                startRestartGroup.endDefaults();
                final Indication m1075rememberRipple9IZ8Weo22 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
                final Modifier modifier622 = modifier3;
                final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                final boolean z522 = z4;
                final int i1022 = i6;
                int i1122 = i6 >> 15;
                m1010TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2() { // from class: androidx.compose.material.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i12) {
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m498selectableO2vRcR0(Modifier.this, z, mutableInteractionSource522, m1075rememberRipple9IZ8Weo22, z522, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3 function3 = content;
                            int i13 = ((i1022 >> 12) & 7168) | 432;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1163856341);
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i1122 & 112) | (i1122 & 14) | 3072 | ((i6 << 6) & 896));
                modifier4 = modifier3;
                z3 = z4;
                mutableInteractionSource4 = mutableInteractionSource3;
                j7 = j6;
                j8 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i7;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z3;
            startRestartGroup.endDefaults();
            final Indication m1075rememberRipple9IZ8Weo222 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
            final Modifier modifier6222 = modifier3;
            final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
            final boolean z5222 = z4;
            final int i10222 = i6;
            int i11222 = i6 >> 15;
            m1010TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2() { // from class: androidx.compose.material.TabKt$Tab$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@Nullable Composer composer2, int i12) {
                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m498selectableO2vRcR0(Modifier.this, z, mutableInteractionSource5222, m1075rememberRipple9IZ8Weo222, z5222, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3 function3 = content;
                        int i13 = ((i10222 >> 12) & 7168) | 432;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1163856341);
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i11222 & 112) | (i11222 & 14) | 3072 | ((i6 << 6) & 896));
            modifier4 = modifier3;
            z3 = z4;
            mutableInteractionSource4 = mutableInteractionSource3;
            j7 = j6;
            j8 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i7;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource2;
        z4 = z3;
        startRestartGroup.endDefaults();
        final Indication m1075rememberRipple9IZ8Weo2222 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, j6, startRestartGroup, ((i6 >> 9) & 896) | 6, 2);
        final Modifier modifier62222 = modifier3;
        final MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
        final boolean z52222 = z4;
        final int i102222 = i6;
        int i112222 = i6 >> 15;
        m1010TabTransitionKlgxPg(j6, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1237246709, true, new Function2() { // from class: androidx.compose.material.TabKt$Tab$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@Nullable Composer composer2, int i12) {
                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m498selectableO2vRcR0(Modifier.this, z, mutableInteractionSource52222, m1075rememberRipple9IZ8Weo2222, z52222, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Function3 function3 = content;
                    int i13 = ((i102222 >> 12) & 7168) | 432;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                    Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i13 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i112222 & 112) | (i112222 & 14) | 3072 | ((i6 << 6) & 896));
        modifier4 = modifier3;
        z3 = z4;
        mutableInteractionSource4 = mutableInteractionSource3;
        j7 = j6;
        j8 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1010TabTransitionKlgxPg(final long j, final long j2, final boolean z, final Function2 function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-405571117);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            int i3 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z), (String) null, startRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                @NotNull
                public final FiniteAnimationSpec<Color> invoke(@NotNull Transition.Segment<Boolean> animateColor, @Nullable Composer composer2, int i4) {
                    TweenSpec tween$default;
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-2120892502);
                    if (animateColor.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
                        tween$default = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
                    } else {
                        tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    }
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1462136984);
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            long j3 = booleanValue ? j : j2;
            startRestartGroup.endReplaceableGroup();
            ColorSpace m1450getColorSpaceimpl = Color.m1450getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(-3686930);
            boolean changed = startRestartGroup.changed(m1450getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m1450getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(1847725064);
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            long j4 = booleanValue2 ? j : j2;
            startRestartGroup.endReplaceableGroup();
            Color m1441boximpl = Color.m1441boximpl(j4);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            long j5 = booleanValue3 ? j : j2;
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m1441boximpl, Color.m1441boximpl(j5), (FiniteAnimationSpec) tabKt$TabTransition$color$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 32768);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(Color.m1445copywmQWz5c$default(m1011TabTransition_Klgx_Pg$lambda5(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m1011TabTransition_Klgx_Pg$lambda5(createTransitionAnimation))))}, function2, startRestartGroup, (i3 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$TabTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                TabKt.m1010TabTransitionKlgxPg(j, j2, z, function2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(final Function2 function2, final Function2 function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(final MeasureScope Layout, List measurables, long j) {
                    final Placeable placeable;
                    final Placeable placeable2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (Function2.this != null) {
                        Iterator it = measurables.iterator();
                        while (it.hasNext()) {
                            Measurable measurable = (Measurable) it.next();
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "text")) {
                                placeable = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable = null;
                    if (function22 != null) {
                        Iterator it2 = measurables.iterator();
                        while (it2.hasNext()) {
                            Measurable measurable2 = (Measurable) it2.next();
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                placeable2 = measurable2.mo1944measureBRTryo0(j);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable2 = null;
                    final int max = Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
                    final int mo265roundToPx0680j_4 = Layout.mo265roundToPx0680j_4((placeable == null || placeable2 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                    final Integer valueOf = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline())) : null;
                    final Integer valueOf2 = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline())) : null;
                    return MeasureScope.layout$default(Layout, max, mo265roundToPx0680j_4, null, new Function1() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Placeable placeable3;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable placeable4 = Placeable.this;
                            if (placeable4 == null || (placeable3 = placeable2) == null) {
                                if (placeable4 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable4, mo265roundToPx0680j_4);
                                    return;
                                }
                                Placeable placeable5 = placeable2;
                                if (placeable5 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable5, mo265roundToPx0680j_4);
                                    return;
                                }
                                return;
                            }
                            MeasureScope measureScope = Layout;
                            int i3 = max;
                            int i4 = mo265roundToPx0680j_4;
                            Integer num = valueOf;
                            Intrinsics.checkNotNull(num);
                            int intValue = num.intValue();
                            Integer num2 = valueOf2;
                            Intrinsics.checkNotNull(num2);
                            TabKt.placeTextAndIcon(layout, measureScope, placeable4, placeable3, i3, i4, intValue, num2.intValue());
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion2.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(companion);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1142473408);
            startRestartGroup.startReplaceableGroup(-2141028452);
            if (function2 != null) {
                Modifier m336paddingVpY3zN4$default = PaddingKt.m336paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor2 = companion2.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(m336paddingVpY3zN4$default);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-459869377);
                function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion2.getConstructor();
                Function3 materializerOf3 = LayoutKt.materializerOf(layoutId);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl3, density3, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(892169960);
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                TabKt.TabBaselineLayout(Function2.this, function22, composer2, i | 1);
            }
        });
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
        int mo265roundToPx0680j_4 = density.mo265roundToPx0680j_4(f) + density.mo265roundToPx0680j_4(TabRowDefaults.INSTANCE.m1018getIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo264roundToPxR2X_6o(IconDistanceFromBaseline)) - i3;
        int i5 = (i2 - i4) - mo265roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - height, 0.0f, 4, null);
    }

    /* renamed from: TabTransition_Klgx_Pg$lambda-5, reason: not valid java name */
    private static final long m1011TabTransition_Klgx_Pg$lambda5(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
