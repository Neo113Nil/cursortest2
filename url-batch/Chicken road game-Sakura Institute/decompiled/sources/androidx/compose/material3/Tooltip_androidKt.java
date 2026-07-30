package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tooltip.android.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0093\u0001\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"PlainTooltip", "", "Landroidx/compose/material3/TooltipScope;", "modifier", "Landroidx/compose/ui/Modifier;", "caretSize", "Landroidx/compose/ui/unit/DpSize;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PlainTooltip-7QI4Sbk", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RichTooltip", "title", "action", "colors", "Landroidx/compose/material3/RichTooltipColors;", "text", "RichTooltip-yDvdmqw", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "drawCaretWithPath", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "caretType", "Landroidx/compose/material3/CaretType;", "density", "Landroidx/compose/ui/unit/Density;", "configuration", "Landroid/content/res/Configuration;", "anchorLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "drawCaretWithPath-JKu-mZY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/material3/CaretType;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JJLandroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f9  */
    /* renamed from: PlainTooltip-7QI4Sbk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2524PlainTooltip7QI4Sbk(final TooltipScope tooltipScope, Modifier modifier, long j, Shape shape, long j2, long j3, float f, float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        final long j4;
        long j5;
        int i4;
        float f3;
        int i5;
        float f4;
        Modifier.Companion companion;
        long j6;
        Shape shape3;
        long j7;
        float f5;
        int i6;
        float f6;
        long j8;
        final long j9;
        float f7;
        Shape shape4;
        long j10;
        Modifier modifier2;
        float f8;
        long j11;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1407069716);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltip)P(4,0:c#ui.unit.DpSize,6,3:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)208@8412L26,209@8482L24,211@8552L26,96@3876L606,90@3685L797:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j)) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j4 = j2;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                j5 = j3;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j5)) ? 131072 : 65536;
            } else {
                j5 = j3;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 12582912;
                f4 = f2;
            } else {
                f4 = f2;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                }
            }
            if ((i2 & 128) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 2) == 0) {
                        j6 = DpSize.INSTANCE.m6406getUnspecifiedMYxV2XQ();
                        i3 &= -897;
                    } else {
                        j6 = j;
                    }
                    if ((i2 & 4) == 0) {
                        shape3 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        j4 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) == 0) {
                        j7 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        j7 = j5;
                    }
                    float m6299constructorimpl = i4 == 0 ? Dp.m6299constructorimpl(0) : f3;
                    if (i5 == 0) {
                        i6 = i3;
                        f5 = Dp.m6299constructorimpl(0);
                    } else {
                        f5 = f4;
                        i6 = i3;
                    }
                    long j12 = j7;
                    shape2 = shape3;
                    f6 = m6299constructorimpl;
                    j8 = j6;
                    j9 = j12;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                    }
                    companion = modifier;
                    f6 = f3;
                    f5 = f4;
                    i6 = i3;
                    j9 = j5;
                    j8 = j;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1407069716, i6, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:73)");
                }
                startRestartGroup.startReplaceGroup(-333850415);
                ComposerKt.sourceInformation(startRestartGroup, "76@3183L7,77@3242L7,78@3281L343");
                if (j8 == InlineClassHelperKt.UnspecifiedPackedFloats) {
                    f7 = f6;
                    shape4 = shape2;
                    j10 = j4;
                    modifier2 = companion;
                } else {
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density = (Density) consume;
                    ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    f7 = f6;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Configuration configuration = (Configuration) consume2;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    shape4 = shape2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -333845325, "CC(remember):Tooltip.android.kt#9igjgp");
                    j10 = j4;
                    boolean changed = startRestartGroup.changed(density) | startRestartGroup.changedInstance(configuration) | ((((458752 & i6) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && startRestartGroup.changed(j9)) || (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((i6 & 896) ^ 384) > 256 && startRestartGroup.changed(j8)) || (i6 & 384) == 256);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final long j13 = j9;
                        final long j14 = j8;
                        rememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$drawCaretModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                DrawResult m2527drawCaretWithPathJKumZY;
                                m2527drawCaretWithPathJKumZY = Tooltip_androidKt.m2527drawCaretWithPathJKumZY(cacheDrawScope, CaretType.Plain, Density.this, configuration, j13, j14, layoutCoordinates);
                                return m2527drawCaretWithPathJKumZY;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    modifier2 = tooltipScope.drawCaret(companion2, (Function2) rememberedValue).then(companion);
                }
                startRestartGroup.endReplaceGroup();
                j4 = j10;
                int i10 = i6 >> 6;
                SurfaceKt.m2223SurfaceT9BRK9s(modifier2, shape4, j9, 0L, f7, f5, null, ComposableLambdaKt.rememberComposableLambda(1430116975, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
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
                        ComposerKt.sourceInformation(composer2, "C97@3886L590:Tooltip.android.kt#uh7d8r");
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1430116975, i11, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:97)");
                            }
                            Modifier padding = PaddingKt.padding(SizeKt.m730sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                            long j15 = j4;
                            Function2<Composer, Integer, Unit> function22 = function2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
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
                            ComposerKt.sourceInformationMarkerStart(composer2, 1903647947, "C106@4266L5,108@4285L181:Tooltip.android.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(j15)), TextKt.getLocalTextStyle().provides(TypographyKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextFont(), composer2, 6))}, function22, composer2, ProvidedValue.$stable);
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
                }, startRestartGroup, 54), startRestartGroup, (i10 & 112) | 12582912 | ((i6 >> 9) & 896) | (57344 & i10) | (i10 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f8 = f7;
                shape2 = shape4;
                j11 = j8;
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                j11 = j;
                f8 = f3;
                f5 = f4;
                j9 = j5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final long j15 = j11;
                final Shape shape5 = shape2;
                final long j16 = j4;
                final float f9 = f8;
                final float f10 = f5;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
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
                        Tooltip_androidKt.m2524PlainTooltip7QI4Sbk(TooltipScope.this, modifier4, j15, shape5, j16, j9, f9, f10, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        long j122 = j7;
        shape2 = shape3;
        f6 = m6299constructorimpl;
        j8 = j6;
        j9 = j122;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-333850415);
        ComposerKt.sourceInformation(startRestartGroup, "76@3183L7,77@3242L7,78@3281L343");
        if (j8 == InlineClassHelperKt.UnspecifiedPackedFloats) {
        }
        startRestartGroup.endReplaceGroup();
        j4 = j10;
        int i102 = i6 >> 6;
        SurfaceKt.m2223SurfaceT9BRK9s(modifier2, shape4, j9, 0L, f7, f5, null, ComposableLambdaKt.rememberComposableLambda(1430116975, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
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
                ComposerKt.sourceInformation(composer2, "C97@3886L590:Tooltip.android.kt#uh7d8r");
                if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1430116975, i11, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:97)");
                    }
                    Modifier padding = PaddingKt.padding(SizeKt.m730sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                    long j152 = j4;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, 1903647947, "C106@4266L5,108@4285L181:Tooltip.android.kt#uh7d8r");
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(j152)), TextKt.getLocalTextStyle().provides(TypographyKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextFont(), composer2, 6))}, function22, composer2, ProvidedValue.$stable);
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
        }, startRestartGroup, 54), startRestartGroup, (i102 & 112) | 12582912 | ((i6 >> 9) & 896) | (57344 & i102) | (i102 & 458752), 72);
        if (ComposerKt.isTraceInProgress()) {
        }
        f8 = f7;
        shape2 = shape4;
        j11 = j8;
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e4  */
    /* renamed from: RichTooltip-yDvdmqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2525RichTooltipyDvdmqw(final TooltipScope tooltipScope, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, long j, Shape shape, RichTooltipColors richTooltipColors, float f, float f2, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        long j2;
        Shape shape2;
        int i6;
        int i7;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        long j3;
        RichTooltipColors richTooltipColors2;
        float m3151getContainerElevationD9Ej5fM;
        final RichTooltipColors richTooltipColors3;
        int i8;
        float f3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape3;
        Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final long j4;
        final float f4;
        final RichTooltipColors richTooltipColors4;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1867454921);
        ComposerKt.sourceInformation(startRestartGroup, "C(RichTooltip)P(3,7!1,1:c#ui.unit.DpSize,5!1,8:c#ui.unit.Dp,4:c#ui.unit.Dp)255@9959L25,257@10034L19,*148@5873L7,150@5944L11,150@5956L61,178@6991L1595,167@6622L1964:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        j2 = j;
                        i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                    } else {
                        j2 = j;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i9 = 131072;
                                i3 |= i9;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(richTooltipColors)) ? 1048576 : 524288;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                    }
                    if ((306783379 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i10 == 0 ? Modifier.INSTANCE : modifier;
                            function25 = i4 == 0 ? null : function2;
                            function26 = i5 == 0 ? function24 : null;
                            if ((i2 & 8) == 0) {
                                j3 = DpSize.INSTANCE.m6406getUnspecifiedMYxV2XQ();
                                i3 &= -57345;
                            } else {
                                j3 = j2;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 32) == 0) {
                                richTooltipColors2 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                richTooltipColors2 = richTooltipColors;
                            }
                            float m2853getLevel0D9Ej5fM = i6 == 0 ? ElevationTokens.INSTANCE.m2853getLevel0D9Ej5fM() : f;
                            m3151getContainerElevationD9Ej5fM = i7 == 0 ? RichTooltipTokens.INSTANCE.m3151getContainerElevationD9Ej5fM() : f2;
                            richTooltipColors3 = richTooltipColors2;
                            i8 = i3;
                            f3 = m2853getLevel0D9Ej5fM;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            function25 = function2;
                            richTooltipColors3 = richTooltipColors;
                            m3151getContainerElevationD9Ej5fM = f2;
                            function26 = function24;
                            j3 = j2;
                            i8 = i3;
                            f3 = f;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1867454921, i8, -1, "androidx.compose.material3.RichTooltip (Tooltip.android.kt:147)");
                        }
                        ProvidableCompositionLocal<Dp> localAbsoluteTonalElevation = SurfaceKt.getLocalAbsoluteTonalElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localAbsoluteTonalElevation);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final long m1607applyTonalElevationRFCenO8 = ColorSchemeKt.m1607applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), richTooltipColors3.getContainerColor(), Dp.m6299constructorimpl(((Dp) consume).m6313unboximpl() + f3), startRestartGroup, 0);
                        startRestartGroup.startReplaceGroup(1472746423);
                        ComposerKt.sourceInformation(startRestartGroup, "153@6122L7,154@6181L7,155@6220L341");
                        float f5 = f3;
                        if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats) {
                            function27 = function26;
                            function28 = function25;
                            shape3 = shape2;
                            modifier2 = companion;
                        } else {
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density = (Density) consume2;
                            shape3 = shape2;
                            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume3 = startRestartGroup.consume(localConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Configuration configuration = (Configuration) consume3;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            function27 = function26;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1472751513, "CC(remember):Tooltip.android.kt#9igjgp");
                            function28 = function25;
                            boolean changed = startRestartGroup.changed(density) | startRestartGroup.changedInstance(configuration) | startRestartGroup.changed(m1607applyTonalElevationRFCenO8) | ((((57344 & i8) ^ 24576) > 16384 && startRestartGroup.changed(j3)) || (i8 & 24576) == 16384);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                final long j5 = j3;
                                rememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                        DrawResult m2527drawCaretWithPathJKumZY;
                                        m2527drawCaretWithPathJKumZY = Tooltip_androidKt.m2527drawCaretWithPathJKumZY(cacheDrawScope, CaretType.Rich, Density.this, configuration, m1607applyTonalElevationRFCenO8, j5, layoutCoordinates);
                                        return m2527drawCaretWithPathJKumZY;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            modifier2 = tooltipScope.drawCaret(companion2, (Function2) rememberedValue).then(companion);
                        }
                        startRestartGroup.endReplaceGroup();
                        function29 = function27;
                        final Function2<? super Composer, ? super Integer, Unit> function211 = function28;
                        int i11 = i8 >> 9;
                        SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m730sizeInqDBjuR0$default(modifier2, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getRichTooltipMaxWidth(), 0.0f, 8, null), shape3, richTooltipColors3.getContainerColor(), 0L, f5, m3151getContainerElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(317290958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$1
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
                                TextStyle textStyle;
                                Function2<Composer, Integer, Unit> function212;
                                ComposerKt.sourceInformation(composer2, "C179@7066L5,180@7133L5,181@7210L5,183@7225L1355:Tooltip.android.kt#uh7d8r");
                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(317290958, i12, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
                                    }
                                    TextStyle value = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer2, 6);
                                    TextStyle value2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer2, 6);
                                    TextStyle value3 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer2, 6);
                                    Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
                                    Function2<Composer, Integer, Unit> function213 = function211;
                                    Function2<Composer, Integer, Unit> function214 = function29;
                                    RichTooltipColors richTooltipColors5 = richTooltipColors3;
                                    Function2<Composer, Integer, Unit> function215 = function23;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m683paddingVpY3zN4$default);
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
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -459254051, "C193@7718L319:Tooltip.android.kt#uh7d8r");
                                    composer2.startReplaceGroup(955016030);
                                    ComposerKt.sourceInformation(composer2, "*185@7347L344");
                                    if (function213 == null) {
                                        textStyle = value;
                                        function212 = function215;
                                    } else {
                                        textStyle = value;
                                        function212 = function215;
                                        Modifier m536paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m536paddingFromBaselineVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getHeightToSubheadFirstLine(), 0.0f, 2, null);
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m536paddingFromBaselineVpY3zN4$default);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor2);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                                        Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1468424960, "C186@7446L227:Tooltip.android.kt#uh7d8r");
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getTitleContentColor())), TextKt.getLocalTextStyle().provides(value2)}, function213, composer2, ProvidedValue.$stable);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Unit unit = Unit.INSTANCE;
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    Modifier textVerticalPadding = TooltipKt.textVerticalPadding(Modifier.INSTANCE, function213 != null, function214 != null);
                                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, textVerticalPadding);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor3);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer2);
                                    Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1959181329, "C194@7812L211:Tooltip.android.kt#uh7d8r");
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getContentColor())), TextKt.getLocalTextStyle().provides(value3)}, function212, composer2, ProvidedValue.$stable);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.startReplaceGroup(955039618);
                                    ComposerKt.sourceInformation(composer2, "*201@8080L476");
                                    if (function214 != null) {
                                        Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(SizeKt.m717requiredHeightInVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getActionLabelMinHeight(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.getActionLabelBottomPadding(), 7, null);
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
                                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor4);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer2);
                                        Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1469278235, "C206@8306L232:Tooltip.android.kt#uh7d8r");
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getActionContentColor())), TextKt.getLocalTextStyle().provides(textStyle)}, function214, composer2, ProvidedValue.$stable);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Unit unit3 = Unit.INSTANCE;
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
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
                        }, startRestartGroup, 54), startRestartGroup, ((i8 >> 12) & 112) | 12582912 | (57344 & i11) | (i11 & 458752), 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function210 = function211;
                        j4 = j3;
                        shape2 = shape3;
                        f4 = f5;
                        richTooltipColors4 = richTooltipColors3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        function210 = function2;
                        richTooltipColors4 = richTooltipColors;
                        m3151getContainerElevationD9Ej5fM = f2;
                        function29 = function24;
                        j4 = j2;
                        f4 = f;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = companion;
                        final Function2<? super Composer, ? super Integer, Unit> function212 = function29;
                        final Shape shape4 = shape2;
                        final float f6 = m3151getContainerElevationD9Ej5fM;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$2
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
                                Tooltip_androidKt.m2525RichTooltipyDvdmqw(TooltipScope.this, modifier3, function210, function212, j4, shape4, richTooltipColors4, f4, f6, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                function24 = function22;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((306783379 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                richTooltipColors3 = richTooltipColors2;
                i8 = i3;
                f3 = m2853getLevel0D9Ej5fM;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Dp> localAbsoluteTonalElevation2 = SurfaceKt.getLocalAbsoluteTonalElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localAbsoluteTonalElevation2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final long m1607applyTonalElevationRFCenO82 = ColorSchemeKt.m1607applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), richTooltipColors3.getContainerColor(), Dp.m6299constructorimpl(((Dp) consume4).m6313unboximpl() + f3), startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(1472746423);
                ComposerKt.sourceInformation(startRestartGroup, "153@6122L7,154@6181L7,155@6220L341");
                float f52 = f3;
                if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats) {
                }
                startRestartGroup.endReplaceGroup();
                function29 = function27;
                final Function2<? super Composer, ? super Integer, Unit> function2112 = function28;
                int i112 = i8 >> 9;
                SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m730sizeInqDBjuR0$default(modifier2, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getRichTooltipMaxWidth(), 0.0f, 8, null), shape3, richTooltipColors3.getContainerColor(), 0L, f52, m3151getContainerElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(317290958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$1
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
                        TextStyle textStyle;
                        Function2<Composer, Integer, Unit> function2122;
                        ComposerKt.sourceInformation(composer2, "C179@7066L5,180@7133L5,181@7210L5,183@7225L1355:Tooltip.android.kt#uh7d8r");
                        if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(317290958, i12, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
                            }
                            TextStyle value = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer2, 6);
                            TextStyle value2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer2, 6);
                            TextStyle value3 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer2, 6);
                            Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
                            Function2<Composer, Integer, Unit> function213 = function2112;
                            Function2<Composer, Integer, Unit> function214 = function29;
                            RichTooltipColors richTooltipColors5 = richTooltipColors3;
                            Function2<Composer, Integer, Unit> function215 = function23;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m683paddingVpY3zN4$default);
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
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -459254051, "C193@7718L319:Tooltip.android.kt#uh7d8r");
                            composer2.startReplaceGroup(955016030);
                            ComposerKt.sourceInformation(composer2, "*185@7347L344");
                            if (function213 == null) {
                                textStyle = value;
                                function2122 = function215;
                            } else {
                                textStyle = value;
                                function2122 = function215;
                                Modifier m536paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m536paddingFromBaselineVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getHeightToSubheadFirstLine(), 0.0f, 2, null);
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m536paddingFromBaselineVpY3zN4$default);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                                Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1468424960, "C186@7446L227:Tooltip.android.kt#uh7d8r");
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getTitleContentColor())), TextKt.getLocalTextStyle().provides(value2)}, function213, composer2, ProvidedValue.$stable);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Unit unit = Unit.INSTANCE;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            Modifier textVerticalPadding = TooltipKt.textVerticalPadding(Modifier.INSTANCE, function213 != null, function214 != null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, textVerticalPadding);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -1959181329, "C194@7812L211:Tooltip.android.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getContentColor())), TextKt.getLocalTextStyle().provides(value3)}, function2122, composer2, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.startReplaceGroup(955039618);
                            ComposerKt.sourceInformation(composer2, "*201@8080L476");
                            if (function214 != null) {
                                Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(SizeKt.m717requiredHeightInVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getActionLabelMinHeight(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.getActionLabelBottomPadding(), 7, null);
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer2);
                                Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1469278235, "C206@8306L232:Tooltip.android.kt#uh7d8r");
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getActionContentColor())), TextKt.getLocalTextStyle().provides(textStyle)}, function214, composer2, ProvidedValue.$stable);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Unit unit3 = Unit.INSTANCE;
                                Unit unit4 = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
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
                }, startRestartGroup, 54), startRestartGroup, ((i8 >> 12) & 112) | 12582912 | (57344 & i112) | (i112 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                }
                function210 = function2112;
                j4 = j3;
                shape2 = shape3;
                f4 = f52;
                richTooltipColors4 = richTooltipColors3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((306783379 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            richTooltipColors3 = richTooltipColors2;
            i8 = i3;
            f3 = m2853getLevel0D9Ej5fM;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Dp> localAbsoluteTonalElevation22 = SurfaceKt.getLocalAbsoluteTonalElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localAbsoluteTonalElevation22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final long m1607applyTonalElevationRFCenO822 = ColorSchemeKt.m1607applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), richTooltipColors3.getContainerColor(), Dp.m6299constructorimpl(((Dp) consume42).m6313unboximpl() + f3), startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(1472746423);
            ComposerKt.sourceInformation(startRestartGroup, "153@6122L7,154@6181L7,155@6220L341");
            float f522 = f3;
            if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            }
            startRestartGroup.endReplaceGroup();
            function29 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function21122 = function28;
            int i1122 = i8 >> 9;
            SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m730sizeInqDBjuR0$default(modifier2, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getRichTooltipMaxWidth(), 0.0f, 8, null), shape3, richTooltipColors3.getContainerColor(), 0L, f522, m3151getContainerElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(317290958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$1
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
                    TextStyle textStyle;
                    Function2<Composer, Integer, Unit> function2122;
                    ComposerKt.sourceInformation(composer2, "C179@7066L5,180@7133L5,181@7210L5,183@7225L1355:Tooltip.android.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(317290958, i12, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
                        }
                        TextStyle value = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer2, 6);
                        TextStyle value2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer2, 6);
                        TextStyle value3 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer2, 6);
                        Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
                        Function2<Composer, Integer, Unit> function213 = function21122;
                        Function2<Composer, Integer, Unit> function214 = function29;
                        RichTooltipColors richTooltipColors5 = richTooltipColors3;
                        Function2<Composer, Integer, Unit> function215 = function23;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m683paddingVpY3zN4$default);
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
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -459254051, "C193@7718L319:Tooltip.android.kt#uh7d8r");
                        composer2.startReplaceGroup(955016030);
                        ComposerKt.sourceInformation(composer2, "*185@7347L344");
                        if (function213 == null) {
                            textStyle = value;
                            function2122 = function215;
                        } else {
                            textStyle = value;
                            function2122 = function215;
                            Modifier m536paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m536paddingFromBaselineVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getHeightToSubheadFirstLine(), 0.0f, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m536paddingFromBaselineVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1468424960, "C186@7446L227:Tooltip.android.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getTitleContentColor())), TextKt.getLocalTextStyle().provides(value2)}, function213, composer2, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Unit unit = Unit.INSTANCE;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        Modifier textVerticalPadding = TooltipKt.textVerticalPadding(Modifier.INSTANCE, function213 != null, function214 != null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, textVerticalPadding);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer2);
                        Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1959181329, "C194@7812L211:Tooltip.android.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getContentColor())), TextKt.getLocalTextStyle().provides(value3)}, function2122, composer2, ProvidedValue.$stable);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.startReplaceGroup(955039618);
                        ComposerKt.sourceInformation(composer2, "*201@8080L476");
                        if (function214 != null) {
                            Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(SizeKt.m717requiredHeightInVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getActionLabelMinHeight(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.getActionLabelBottomPadding(), 7, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor4);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1469278235, "C206@8306L232:Tooltip.android.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getActionContentColor())), TextKt.getLocalTextStyle().provides(textStyle)}, function214, composer2, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Unit unit3 = Unit.INSTANCE;
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
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
            }, startRestartGroup, 54), startRestartGroup, ((i8 >> 12) & 112) | 12582912 | (57344 & i1122) | (i1122 & 458752), 72);
            if (ComposerKt.isTraceInProgress()) {
            }
            function210 = function21122;
            j4 = j3;
            shape2 = shape3;
            f4 = f522;
            richTooltipColors4 = richTooltipColors3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        richTooltipColors3 = richTooltipColors2;
        i8 = i3;
        f3 = m2853getLevel0D9Ej5fM;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Dp> localAbsoluteTonalElevation222 = SurfaceKt.getLocalAbsoluteTonalElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localAbsoluteTonalElevation222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final long m1607applyTonalElevationRFCenO8222 = ColorSchemeKt.m1607applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), richTooltipColors3.getContainerColor(), Dp.m6299constructorimpl(((Dp) consume422).m6313unboximpl() + f3), startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(1472746423);
        ComposerKt.sourceInformation(startRestartGroup, "153@6122L7,154@6181L7,155@6220L341");
        float f5222 = f3;
        if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats) {
        }
        startRestartGroup.endReplaceGroup();
        function29 = function27;
        final Function2<? super Composer, ? super Integer, Unit> function211222 = function28;
        int i11222 = i8 >> 9;
        SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m730sizeInqDBjuR0$default(modifier2, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getRichTooltipMaxWidth(), 0.0f, 8, null), shape3, richTooltipColors3.getContainerColor(), 0L, f5222, m3151getContainerElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(317290958, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$RichTooltip$1
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
                TextStyle textStyle;
                Function2<Composer, Integer, Unit> function2122;
                ComposerKt.sourceInformation(composer2, "C179@7066L5,180@7133L5,181@7210L5,183@7225L1355:Tooltip.android.kt#uh7d8r");
                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(317290958, i12, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
                    }
                    TextStyle value = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer2, 6);
                    TextStyle value2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer2, 6);
                    TextStyle value3 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer2, 6);
                    Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
                    Function2<Composer, Integer, Unit> function213 = function211222;
                    Function2<Composer, Integer, Unit> function214 = function29;
                    RichTooltipColors richTooltipColors5 = richTooltipColors3;
                    Function2<Composer, Integer, Unit> function215 = function23;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m683paddingVpY3zN4$default);
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
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -459254051, "C193@7718L319:Tooltip.android.kt#uh7d8r");
                    composer2.startReplaceGroup(955016030);
                    ComposerKt.sourceInformation(composer2, "*185@7347L344");
                    if (function213 == null) {
                        textStyle = value;
                        function2122 = function215;
                    } else {
                        textStyle = value;
                        function2122 = function215;
                        Modifier m536paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m536paddingFromBaselineVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getHeightToSubheadFirstLine(), 0.0f, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m536paddingFromBaselineVpY3zN4$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                        Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1468424960, "C186@7446L227:Tooltip.android.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getTitleContentColor())), TextKt.getLocalTextStyle().provides(value2)}, function213, composer2, ProvidedValue.$stable);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Unit unit = Unit.INSTANCE;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    Modifier textVerticalPadding = TooltipKt.textVerticalPadding(Modifier.INSTANCE, function213 != null, function214 != null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, textVerticalPadding);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer2);
                    Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1959181329, "C194@7812L211:Tooltip.android.kt#uh7d8r");
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getContentColor())), TextKt.getLocalTextStyle().provides(value3)}, function2122, composer2, ProvidedValue.$stable);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.startReplaceGroup(955039618);
                    ComposerKt.sourceInformation(composer2, "*201@8080L476");
                    if (function214 != null) {
                        Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(SizeKt.m717requiredHeightInVpY3zN4$default(Modifier.INSTANCE, TooltipKt.getActionLabelMinHeight(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.getActionLabelBottomPadding(), 7, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer2);
                        Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1469278235, "C206@8306L232:Tooltip.android.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(richTooltipColors5.getActionContentColor())), TextKt.getLocalTextStyle().provides(textStyle)}, function214, composer2, ProvidedValue.$stable);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Unit unit3 = Unit.INSTANCE;
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
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
        }, startRestartGroup, 54), startRestartGroup, ((i8 >> 12) & 112) | 12582912 | (57344 & i11222) | (i11222 & 458752), 72);
        if (ComposerKt.isTraceInProgress()) {
        }
        function210 = function211222;
        j4 = j3;
        shape2 = shape3;
        f4 = f5222;
        richTooltipColors4 = richTooltipColors3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCaretWithPath-JKu-mZY, reason: not valid java name */
    public static final DrawResult m2527drawCaretWithPathJKumZY(CacheDrawScope cacheDrawScope, CaretType caretType, Density density, Configuration configuration, final long j, long j2, final LayoutCoordinates layoutCoordinates) {
        long j3;
        final Path Path = AndroidPath_androidKt.Path();
        if (layoutCoordinates != null) {
            int mo367roundToPx0680j_4 = density.mo367roundToPx0680j_4(DpSize.m6395getHeightD9Ej5fM(j2));
            int mo367roundToPx0680j_42 = density.mo367roundToPx0680j_4(DpSize.m6397getWidthD9Ej5fM(j2));
            int mo367roundToPx0680j_43 = density.mo367roundToPx0680j_4(Dp.m6299constructorimpl(configuration.screenWidthDp));
            int mo367roundToPx0680j_44 = density.mo367roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
            Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
            float left = boundsInWindow.getLeft();
            float right = boundsInWindow.getRight();
            float top = boundsInWindow.getTop();
            float f = 2;
            float f2 = (right + left) / f;
            float f3 = right - left;
            float m3668getWidthimpl = Size.m3668getWidthimpl(cacheDrawScope.m3489getSizeNHjbRc());
            float m3665getHeightimpl = Size.m3665getHeightimpl(cacheDrawScope.m3489getSizeNHjbRc());
            boolean z = (top - m3665getHeightimpl) - ((float) mo367roundToPx0680j_44) < 0.0f;
            if (z) {
                m3665getHeightimpl = 0.0f;
            }
            if (caretType == CaretType.Plain) {
                float f4 = mo367roundToPx0680j_43;
                if ((m3668getWidthimpl / f) + f2 > f4) {
                    j3 = OffsetKt.Offset(m3668getWidthimpl - (f4 - f2), m3665getHeightimpl);
                } else {
                    j3 = OffsetKt.Offset(f2 - Math.max(left - ((Size.m3668getWidthimpl(cacheDrawScope.m3489getSizeNHjbRc()) / f) - (f3 / f)), 0.0f), m3665getHeightimpl);
                }
            } else {
                long Offset = OffsetKt.Offset(f2 - left, m3665getHeightimpl);
                float f5 = mo367roundToPx0680j_43;
                if (left + m3668getWidthimpl > f5) {
                    float f6 = right - m3668getWidthimpl;
                    Offset = OffsetKt.Offset(f2 - f6, m3665getHeightimpl);
                    if (f6 < 0.0f) {
                        float f7 = m3668getWidthimpl / f;
                        float f8 = f3 / f;
                        if ((left - f7) + f8 <= 0.0f) {
                            j3 = OffsetKt.Offset(f2, m3665getHeightimpl);
                        } else if ((right + f7) - f8 >= f5) {
                            j3 = OffsetKt.Offset(m3668getWidthimpl - (f5 - f2), m3665getHeightimpl);
                        } else {
                            j3 = OffsetKt.Offset(f7, m3665getHeightimpl);
                        }
                    }
                }
                j3 = Offset;
            }
            if (z) {
                Path.moveTo(Offset.m3599getXimpl(j3), Offset.m3600getYimpl(j3));
                float f9 = mo367roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3599getXimpl(j3) + f9, Offset.m3600getYimpl(j3));
                Path.lineTo(Offset.m3599getXimpl(j3), Offset.m3600getYimpl(j3) - mo367roundToPx0680j_4);
                Path.lineTo(Offset.m3599getXimpl(j3) - f9, Offset.m3600getYimpl(j3));
                Path.close();
            } else {
                Path.moveTo(Offset.m3599getXimpl(j3), Offset.m3600getYimpl(j3));
                float f10 = mo367roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3599getXimpl(j3) + f10, Offset.m3600getYimpl(j3));
                Path.lineTo(Offset.m3599getXimpl(j3), Offset.m3600getYimpl(j3) + mo367roundToPx0680j_4);
                Path.lineTo(Offset.m3599getXimpl(j3) - f10, Offset.m3600getYimpl(j3));
                Path.close();
            }
        }
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$drawCaretWithPath$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                if (LayoutCoordinates.this != null) {
                    contentDrawScope.drawContent();
                    DrawScope.m4386drawPathLG529CI$default(contentDrawScope, Path, j, 0.0f, null, null, 0, 60, null);
                }
            }
        });
    }
}
