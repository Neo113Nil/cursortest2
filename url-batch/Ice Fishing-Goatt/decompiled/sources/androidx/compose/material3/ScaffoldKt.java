package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a±\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0087\u0001\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000e2\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0002\b\t2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final float FabSpacing = Dp.m6265constructorimpl(16.0f);

    /* JADX WARN: Removed duplicated region for block: B:109:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ec  */
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2072ScaffoldTvnljyQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, int i, long j, long j2, WindowInsets windowInsets, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        int i9;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> m1637getLambda1$material3_release;
        Function2<? super Composer, ? super Integer, Unit> m1638getLambda2$material3_release;
        Function2<? super Composer, ? super Integer, Unit> m1639getLambda3$material3_release;
        Function2<? super Composer, ? super Integer, Unit> m1640getLambda4$material3_release;
        int m1769getEndERTFSPs;
        int i10;
        int i11;
        long j3;
        long j4;
        final WindowInsets windowInsets2;
        int i12;
        long j5;
        int i13;
        boolean z;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Composer composer2;
        final Modifier modifier2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final int i14;
        final long j6;
        final long j7;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1219521777);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)P(7,9!1,8,5,6:c#material3.FabPosition,1:c#ui.graphics.Color,3:c#ui.graphics.Color,4)90@4654L11,91@4704L31,92@4794L19,95@4889L74,98@5047L224,104@5347L314,96@4968L693:Scaffold.kt#uh7d8r");
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            function25 = function2;
            i4 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                function26 = function22;
                i4 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    function27 = function23;
                    i4 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        function28 = function24;
                        i4 |= startRestartGroup.changedInstance(function28) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(i) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i9 = i16;
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
                        } else {
                            i9 = i16;
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i4 |= i15;
                            }
                            i15 = 33554432;
                            i4 |= i15;
                        }
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            if ((i4 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                                    m1637getLambda1$material3_release = i17 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1637getLambda1$material3_release() : function25;
                                    m1638getLambda2$material3_release = i5 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1638getLambda2$material3_release() : function26;
                                    m1639getLambda3$material3_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1639getLambda3$material3_release() : function27;
                                    m1640getLambda4$material3_release = i7 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1640getLambda4$material3_release() : function28;
                                    m1769getEndERTFSPs = i8 == 0 ? FabPosition.INSTANCE.m1769getEndERTFSPs() : i;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        i10 = -234881025;
                                        i11 = -29360129;
                                        j3 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getBackground();
                                    } else {
                                        i10 = -234881025;
                                        i11 = -29360129;
                                        j3 = j;
                                    }
                                    if ((i3 & 128) == 0) {
                                        j4 = ColorSchemeKt.m1593contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 18) & 14);
                                        i4 &= i11;
                                    } else {
                                        j4 = j2;
                                    }
                                    if ((i3 & 256) == 0) {
                                        windowInsets2 = ScaffoldDefaults.INSTANCE.getContentWindowInsets(startRestartGroup, 6);
                                        i4 &= i10;
                                    } else {
                                        windowInsets2 = windowInsets;
                                    }
                                    i12 = 100663296;
                                    j5 = j4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    companion = modifier;
                                    m1769getEndERTFSPs = i;
                                    j3 = j;
                                    windowInsets2 = windowInsets;
                                    m1637getLambda1$material3_release = function25;
                                    m1638getLambda2$material3_release = function26;
                                    m1639getLambda3$material3_release = function27;
                                    m1640getLambda4$material3_release = function28;
                                    i12 = 100663296;
                                    j5 = j2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i13 = i12;
                                } else {
                                    i13 = i12;
                                    ComposerKt.traceEventStart(-1219521777, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
                                int i18 = (234881024 & i4) ^ i13;
                                z = (i18 <= 67108864 && startRestartGroup.changed(windowInsets2)) || (i4 & i13) == 67108864;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new MutableWindowInsets(windowInsets2);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long j8 = j3;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
                                changed = startRestartGroup.changed(mutableWindowInsets) | ((i18 <= 67108864 && startRestartGroup.changed(windowInsets2)) || (i4 & i13) == 67108864);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                            invoke2(windowInsets3);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(WindowInsets windowInsets3) {
                                            MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Function2<? super Composer, ? super Integer, Unit> function213 = m1637getLambda1$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = m1638getLambda2$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = m1639getLambda3$material3_release;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = m1640getLambda4$material3_release;
                                final int i19 = m1769getEndERTFSPs;
                                int i20 = i4 >> 12;
                                composer2 = startRestartGroup;
                                SurfaceKt.m2207SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) rememberedValue2), null, j8, j5, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i21) {
                                        ComposerKt.sourceInformation(composer3, "C105@5357L298:Scaffold.kt#uh7d8r");
                                        if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                                            }
                                            ScaffoldKt.m2073ScaffoldLayoutFMILGgc(i19, function213, function3, function215, function216, mutableWindowInsets, function214, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), composer2, (i20 & 896) | 12582912 | (i20 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                function29 = m1637getLambda1$material3_release;
                                function210 = m1638getLambda2$material3_release;
                                function211 = m1639getLambda3$material3_release;
                                function212 = m1640getLambda4$material3_release;
                                i14 = m1769getEndERTFSPs;
                                j6 = j8;
                                j7 = j5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                windowInsets2 = windowInsets;
                                composer2 = startRestartGroup;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                function212 = function28;
                                modifier2 = modifier;
                                i14 = i;
                                j6 = j;
                                j7 = j2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i21) {
                                        ScaffoldKt.m2072ScaffoldTvnljyQ(Modifier.this, function29, function210, function211, function212, i14, j6, j7, windowInsets2, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        i12 = 100663296;
                        j5 = j4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
                        int i182 = (234881024 & i4) ^ i13;
                        if (i182 <= 67108864) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        rememberedValue = new MutableWindowInsets(windowInsets2);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        final MutableWindowInsets mutableWindowInsets2 = (MutableWindowInsets) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        long j82 = j3;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
                        changed = startRestartGroup.changed(mutableWindowInsets2) | ((i182 <= 67108864 && startRestartGroup.changed(windowInsets2)) || (i4 & i13) == 67108864);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                invoke2(windowInsets3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(WindowInsets windowInsets3) {
                                MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Function2<? super Composer, ? super Integer, Unit> function2132 = m1637getLambda1$material3_release;
                        final Function2<? super Composer, ? super Integer, Unit> function2142 = m1638getLambda2$material3_release;
                        final Function2<? super Composer, ? super Integer, Unit> function2152 = m1639getLambda3$material3_release;
                        final Function2<? super Composer, ? super Integer, Unit> function2162 = m1640getLambda4$material3_release;
                        final int i192 = m1769getEndERTFSPs;
                        int i202 = i4 >> 12;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2207SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) rememberedValue2), null, j82, j5, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i21) {
                                ComposerKt.sourceInformation(composer3, "C105@5357L298:Scaffold.kt#uh7d8r");
                                if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                                    }
                                    ScaffoldKt.m2073ScaffoldLayoutFMILGgc(i192, function2132, function3, function2152, function2162, mutableWindowInsets2, function2142, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), composer2, (i202 & 896) | 12582912 | (i202 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        function29 = m1637getLambda1$material3_release;
                        function210 = m1638getLambda2$material3_release;
                        function211 = m1639getLambda3$material3_release;
                        function212 = m1640getLambda4$material3_release;
                        i14 = m1769getEndERTFSPs;
                        j6 = j82;
                        j7 = j5;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function28 = function24;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    i12 = 100663296;
                    j5 = j4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
                    int i1822 = (234881024 & i4) ^ i13;
                    if (i1822 <= 67108864) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new MutableWindowInsets(windowInsets2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final MutableWindowInsets mutableWindowInsets22 = (MutableWindowInsets) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long j822 = j3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
                    changed = startRestartGroup.changed(mutableWindowInsets22) | ((i1822 <= 67108864 && startRestartGroup.changed(windowInsets2)) || (i4 & i13) == 67108864);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                            invoke2(windowInsets3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(WindowInsets windowInsets3) {
                            MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Function2<? super Composer, ? super Integer, Unit> function21322 = m1637getLambda1$material3_release;
                    final Function2<? super Composer, ? super Integer, Unit> function21422 = m1638getLambda2$material3_release;
                    final Function2<? super Composer, ? super Integer, Unit> function21522 = m1639getLambda3$material3_release;
                    final Function2<? super Composer, ? super Integer, Unit> function21622 = m1640getLambda4$material3_release;
                    final int i1922 = m1769getEndERTFSPs;
                    int i2022 = i4 >> 12;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2207SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) rememberedValue2), null, j822, j5, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i21) {
                            ComposerKt.sourceInformation(composer3, "C105@5357L298:Scaffold.kt#uh7d8r");
                            if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                                }
                                ScaffoldKt.m2073ScaffoldLayoutFMILGgc(i1922, function21322, function3, function21522, function21622, mutableWindowInsets22, function21422, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), composer2, (i2022 & 896) | 12582912 | (i2022 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    function29 = m1637getLambda1$material3_release;
                    function210 = m1638getLambda2$material3_release;
                    function211 = m1639getLambda3$material3_release;
                    function212 = m1640getLambda4$material3_release;
                    i14 = m1769getEndERTFSPs;
                    j6 = j822;
                    j7 = j5;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function27 = function23;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function28 = function24;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i17 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                i12 = 100663296;
                j5 = j4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
                int i18222 = (234881024 & i4) ^ i13;
                if (i18222 <= 67108864) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new MutableWindowInsets(windowInsets2);
                startRestartGroup.updateRememberedValue(rememberedValue);
                final MutableWindowInsets mutableWindowInsets222 = (MutableWindowInsets) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long j8222 = j3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
                changed = startRestartGroup.changed(mutableWindowInsets222) | ((i18222 <= 67108864 && startRestartGroup.changed(windowInsets2)) || (i4 & i13) == 67108864);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                        invoke2(windowInsets3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(WindowInsets windowInsets3) {
                        MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Function2<? super Composer, ? super Integer, Unit> function213222 = m1637getLambda1$material3_release;
                final Function2<? super Composer, ? super Integer, Unit> function214222 = m1638getLambda2$material3_release;
                final Function2<? super Composer, ? super Integer, Unit> function215222 = m1639getLambda3$material3_release;
                final Function2<? super Composer, ? super Integer, Unit> function216222 = m1640getLambda4$material3_release;
                final int i19222 = m1769getEndERTFSPs;
                int i20222 = i4 >> 12;
                composer2 = startRestartGroup;
                SurfaceKt.m2207SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) rememberedValue2), null, j8222, j5, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i21) {
                        ComposerKt.sourceInformation(composer3, "C105@5357L298:Scaffold.kt#uh7d8r");
                        if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                            }
                            ScaffoldKt.m2073ScaffoldLayoutFMILGgc(i19222, function213222, function3, function215222, function216222, mutableWindowInsets222, function214222, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), composer2, (i20222 & 896) | 12582912 | (i20222 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                function29 = m1637getLambda1$material3_release;
                function210 = m1638getLambda2$material3_release;
                function211 = m1639getLambda3$material3_release;
                function212 = m1640getLambda4$material3_release;
                i14 = m1769getEndERTFSPs;
                j6 = j8222;
                j7 = j5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function26 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function27 = function23;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function28 = function24;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i17 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i12 = 100663296;
            j5 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
            int i182222 = (234881024 & i4) ^ i13;
            if (i182222 <= 67108864) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new MutableWindowInsets(windowInsets2);
            startRestartGroup.updateRememberedValue(rememberedValue);
            final MutableWindowInsets mutableWindowInsets2222 = (MutableWindowInsets) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long j82222 = j3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
            changed = startRestartGroup.changed(mutableWindowInsets2222) | ((i182222 <= 67108864 && startRestartGroup.changed(windowInsets2)) || (i4 & i13) == 67108864);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                    invoke2(windowInsets3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(WindowInsets windowInsets3) {
                    MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Function2<? super Composer, ? super Integer, Unit> function2132222 = m1637getLambda1$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function2142222 = m1638getLambda2$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function2152222 = m1639getLambda3$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function2162222 = m1640getLambda4$material3_release;
            final int i192222 = m1769getEndERTFSPs;
            int i202222 = i4 >> 12;
            composer2 = startRestartGroup;
            SurfaceKt.m2207SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) rememberedValue2), null, j82222, j5, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i21) {
                    ComposerKt.sourceInformation(composer3, "C105@5357L298:Scaffold.kt#uh7d8r");
                    if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                        }
                        ScaffoldKt.m2073ScaffoldLayoutFMILGgc(i192222, function2132222, function3, function2152222, function2162222, mutableWindowInsets2222, function2142222, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), composer2, (i202222 & 896) | 12582912 | (i202222 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            function29 = m1637getLambda1$material3_release;
            function210 = m1638getLambda2$material3_release;
            function211 = m1639getLambda3$material3_release;
            function212 = m1640getLambda4$material3_release;
            i14 = m1769getEndERTFSPs;
            j6 = j82222;
            j7 = j5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function25 = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function27 = function23;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function28 = function24;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i17 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i12 = 100663296;
        j5 = j4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
        int i1822222 = (234881024 & i4) ^ i13;
        if (i1822222 <= 67108864) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new MutableWindowInsets(windowInsets2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final MutableWindowInsets mutableWindowInsets22222 = (MutableWindowInsets) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long j822222 = j3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
        changed = startRestartGroup.changed(mutableWindowInsets22222) | ((i1822222 <= 67108864 && startRestartGroup.changed(windowInsets2)) || (i4 & i13) == 67108864);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                invoke2(windowInsets3);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(WindowInsets windowInsets3) {
                MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Function2<? super Composer, ? super Integer, Unit> function21322222 = m1637getLambda1$material3_release;
        final Function2<? super Composer, ? super Integer, Unit> function21422222 = m1638getLambda2$material3_release;
        final Function2<? super Composer, ? super Integer, Unit> function21522222 = m1639getLambda3$material3_release;
        final Function2<? super Composer, ? super Integer, Unit> function21622222 = m1640getLambda4$material3_release;
        final int i1922222 = m1769getEndERTFSPs;
        int i2022222 = i4 >> 12;
        composer2 = startRestartGroup;
        SurfaceKt.m2207SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) rememberedValue2), null, j822222, j5, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i21) {
                ComposerKt.sourceInformation(composer3, "C105@5357L298:Scaffold.kt#uh7d8r");
                if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1979205334, i21, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                    }
                    ScaffoldKt.m2073ScaffoldLayoutFMILGgc(i1922222, function21322222, function3, function21522222, function21622222, mutableWindowInsets22222, function21422222, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), composer2, (i2022222 & 896) | 12582912 | (i2022222 & 7168), 114);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        function29 = m1637getLambda1$material3_release;
        function210 = m1638getLambda2$material3_release;
        function211 = m1639getLambda3$material3_release;
        function212 = m1640getLambda4$material3_release;
        i14 = m1769getEndERTFSPs;
        j6 = j822222;
        j7 = j5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m2073ScaffoldLayoutFMILGgc(final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        final WindowInsets windowInsets2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-975511942);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)P(4:c#material3.FabPosition,6,1,5,3,2)139@6582L6951,139@6565L6968:Scaffold.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changedInstance(function32) ? 256 : 128;
        } else {
            function32 = function3;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function25 = function23;
            i3 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
        } else {
            function25 = function23;
        }
        if ((196608 & i2) == 0) {
            windowInsets2 = windowInsets;
            i3 |= startRestartGroup.changed(windowInsets2) ? 131072 : 65536;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i3 & 599187) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1690368138, "CC(remember):Scaffold.kt#9igjgp");
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function32;
                i4 = 0;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m2075invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m2075invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        FabPlacement fabPlacement;
                        Object obj4;
                        Integer num;
                        int i5;
                        int intValue;
                        float f;
                        int i6;
                        int bottom;
                        float f2;
                        Object obj5;
                        Object obj6;
                        int i7;
                        float f3;
                        float f4;
                        int i8;
                        float f5;
                        float f6;
                        final int m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j);
                        final int m6217getMaxHeightimpl = Constraints.m6217getMaxHeightimpl(j);
                        long m6209copyZbe2FdA$default = Constraints.m6209copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        ArrayList arrayList = new ArrayList(subcompose.size());
                        int size = subcompose.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            arrayList.add(subcompose.get(i9).mo5152measureBRTryo0(m6209copyZbe2FdA$default));
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList2.get(0);
                            int height = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex) {
                                int i10 = 1;
                                while (true) {
                                    Object obj7 = arrayList2.get(i10);
                                    int height2 = ((Placeable) obj7).getHeight();
                                    if (height < height2) {
                                        obj = obj7;
                                        height = height2;
                                    }
                                    if (i10 == lastIndex) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        int height3 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets3 = windowInsets2;
                        ArrayList arrayList3 = new ArrayList(subcompose2.size());
                        int size2 = subcompose2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                            arrayList3.add(subcompose2.get(i11).mo5152measureBRTryo0(ConstraintsKt.m6237offsetNN6EwU(m6209copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope2))));
                            i11++;
                            subcompose2 = subcompose2;
                            arrayList2 = arrayList2;
                        }
                        final ArrayList arrayList4 = arrayList2;
                        final ArrayList arrayList5 = arrayList3;
                        if (arrayList5.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList5.get(0);
                            int height4 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList5);
                            if (1 <= lastIndex2) {
                                Object obj8 = obj2;
                                int i12 = height4;
                                int i13 = 1;
                                while (true) {
                                    Object obj9 = arrayList5.get(i13);
                                    int height5 = ((Placeable) obj9).getHeight();
                                    if (i12 < height5) {
                                        obj8 = obj9;
                                        i12 = height5;
                                    }
                                    if (i13 == lastIndex2) {
                                        break;
                                    }
                                    i13++;
                                }
                                obj2 = obj8;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList5.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList5.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int lastIndex3 = CollectionsKt.getLastIndex(arrayList5);
                            if (1 <= lastIndex3) {
                                Object obj10 = obj3;
                                int i14 = width;
                                int i15 = 1;
                                while (true) {
                                    Object obj11 = arrayList5.get(i15);
                                    int width2 = ((Placeable) obj11).getWidth();
                                    if (i14 < width2) {
                                        obj10 = obj11;
                                        i14 = width2;
                                    }
                                    if (i15 == lastIndex3) {
                                        break;
                                    }
                                    i15++;
                                }
                                obj3 = obj10;
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function26);
                        WindowInsets windowInsets4 = windowInsets2;
                        ArrayList arrayList6 = new ArrayList(subcompose3.size());
                        int size3 = subcompose3.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            int i17 = height6;
                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                            List<Measurable> list = subcompose3;
                            int i18 = height3;
                            Placeable mo5152measureBRTryo0 = subcompose3.get(i16).mo5152measureBRTryo0(ConstraintsKt.m6237offsetNN6EwU(m6209copyZbe2FdA$default, (-windowInsets4.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope3)));
                            if (mo5152measureBRTryo0.getHeight() == 0 || mo5152measureBRTryo0.getWidth() == 0) {
                                mo5152measureBRTryo0 = null;
                            }
                            if (mo5152measureBRTryo0 != null) {
                                arrayList6.add(mo5152measureBRTryo0);
                            }
                            i16++;
                            height6 = i17;
                            subcompose3 = list;
                            height3 = i18;
                        }
                        int i19 = height6;
                        final int i20 = height3;
                        final ArrayList arrayList7 = arrayList6;
                        if (arrayList7.isEmpty()) {
                            fabPlacement = null;
                        } else {
                            if (arrayList7.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList7.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList7);
                                if (1 <= lastIndex4) {
                                    Object obj12 = obj5;
                                    int i21 = width4;
                                    int i22 = 1;
                                    while (true) {
                                        Object obj13 = arrayList7.get(i22);
                                        int width5 = ((Placeable) obj13).getWidth();
                                        if (i21 < width5) {
                                            obj12 = obj13;
                                            i21 = width5;
                                        }
                                        if (i22 == lastIndex4) {
                                            break;
                                        }
                                        i22++;
                                    }
                                    obj5 = obj12;
                                }
                            }
                            Intrinsics.checkNotNull(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList7.isEmpty()) {
                                obj6 = null;
                            } else {
                                obj6 = arrayList7.get(0);
                                int height7 = ((Placeable) obj6).getHeight();
                                int lastIndex5 = CollectionsKt.getLastIndex(arrayList7);
                                if (1 <= lastIndex5) {
                                    Object obj14 = obj6;
                                    int i23 = height7;
                                    int i24 = 1;
                                    while (true) {
                                        Object obj15 = arrayList7.get(i24);
                                        int height8 = ((Placeable) obj15).getHeight();
                                        if (i23 < height8) {
                                            obj14 = obj15;
                                            i23 = height8;
                                        }
                                        if (i24 == lastIndex5) {
                                            break;
                                        }
                                        i24++;
                                    }
                                    obj6 = obj14;
                                }
                            }
                            Intrinsics.checkNotNull(obj6);
                            int height9 = ((Placeable) obj6).getHeight();
                            int i25 = i;
                            if (FabPosition.m1764equalsimpl0(i25, FabPosition.INSTANCE.m1771getStartERTFSPs())) {
                                if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    f6 = ScaffoldKt.FabSpacing;
                                    i7 = subcomposeMeasureScope.mo359roundToPx0680j_4(f6);
                                    fabPlacement = new FabPlacement(i7, width6, height9);
                                } else {
                                    f5 = ScaffoldKt.FabSpacing;
                                    i8 = subcomposeMeasureScope.mo359roundToPx0680j_4(f5);
                                    i7 = (m6218getMaxWidthimpl - i8) - width6;
                                    fabPlacement = new FabPlacement(i7, width6, height9);
                                }
                            } else {
                                if (FabPosition.m1764equalsimpl0(i25, FabPosition.INSTANCE.m1769getEndERTFSPs()) ? true : FabPosition.m1764equalsimpl0(i25, FabPosition.INSTANCE.m1770getEndOverlayERTFSPs())) {
                                    if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                        f4 = ScaffoldKt.FabSpacing;
                                        i8 = subcomposeMeasureScope.mo359roundToPx0680j_4(f4);
                                        i7 = (m6218getMaxWidthimpl - i8) - width6;
                                    } else {
                                        f3 = ScaffoldKt.FabSpacing;
                                        i7 = subcomposeMeasureScope.mo359roundToPx0680j_4(f3);
                                    }
                                } else {
                                    i7 = (m6218getMaxWidthimpl - width6) / 2;
                                }
                                fabPlacement = new FabPlacement(i7, width6, height9);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function27 = function24;
                        List<Measurable> subcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-2146438447, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                invoke(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i26) {
                                ComposerKt.sourceInformation(composer2, "C209@10015L11:Scaffold.kt#uh7d8r");
                                if ((i26 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2146438447, i26, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                                }
                                function27.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        ArrayList arrayList8 = new ArrayList(subcompose4.size());
                        int size4 = subcompose4.size();
                        for (int i26 = 0; i26 < size4; i26++) {
                            arrayList8.add(subcompose4.get(i26).mo5152measureBRTryo0(m6209copyZbe2FdA$default));
                        }
                        final ArrayList arrayList9 = arrayList8;
                        if (arrayList9.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList9.get(0);
                            int height10 = ((Placeable) obj4).getHeight();
                            int lastIndex6 = CollectionsKt.getLastIndex(arrayList9);
                            if (1 <= lastIndex6) {
                                int i27 = 1;
                                while (true) {
                                    Object obj16 = arrayList9.get(i27);
                                    int height11 = ((Placeable) obj16).getHeight();
                                    if (height10 < height11) {
                                        height10 = height11;
                                        obj4 = obj16;
                                    }
                                    if (i27 == lastIndex6) {
                                        break;
                                    }
                                    i27++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        if (fabPlacement != null) {
                            int i28 = i;
                            WindowInsets windowInsets5 = windowInsets2;
                            if (valueOf == null || FabPosition.m1764equalsimpl0(i28, FabPosition.INSTANCE.m1770getEndOverlayERTFSPs())) {
                                int height12 = fabPlacement.getHeight();
                                f = ScaffoldKt.FabSpacing;
                                i6 = height12 + subcomposeMeasureScope.mo359roundToPx0680j_4(f);
                                bottom = windowInsets5.getBottom(subcomposeMeasureScope);
                            } else {
                                i6 = valueOf.intValue() + fabPlacement.getHeight();
                                f2 = ScaffoldKt.FabSpacing;
                                bottom = subcomposeMeasureScope.mo359roundToPx0680j_4(f2);
                            }
                            num = Integer.valueOf(i6 + bottom);
                        } else {
                            num = null;
                        }
                        if (i19 != 0) {
                            if (num != null) {
                                intValue = num.intValue();
                            } else {
                                intValue = valueOf != null ? valueOf.intValue() : windowInsets2.getBottom(subcomposeMeasureScope);
                            }
                            i5 = i19 + intValue;
                        } else {
                            i5 = 0;
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets6 = windowInsets2;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function33;
                        List<Measurable> subcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1213360416, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                invoke(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i29) {
                                float f7;
                                float bottom2;
                                Integer num2;
                                ComposerKt.sourceInformation(composer2, "C260@12377L21:Scaffold.kt#uh7d8r");
                                if ((i29 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1213360416, i29, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                                    }
                                    PaddingValues asPaddingValues = WindowInsetsKt.asPaddingValues(WindowInsets.this, subcomposeMeasureScope);
                                    if (arrayList4.isEmpty()) {
                                        f7 = asPaddingValues.getTop();
                                    } else {
                                        f7 = subcomposeMeasureScope.mo362toDpu2uoSUM(i20);
                                    }
                                    if (arrayList9.isEmpty() || (num2 = valueOf) == null) {
                                        bottom2 = asPaddingValues.getBottom();
                                    } else {
                                        bottom2 = subcomposeMeasureScope.mo362toDpu2uoSUM(num2.intValue());
                                    }
                                    function34.invoke(PaddingKt.m669PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), f7, PaddingKt.calculateEndPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom2), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        ArrayList arrayList10 = new ArrayList(subcompose5.size());
                        int size5 = subcompose5.size();
                        int i29 = 0;
                        while (i29 < size5) {
                            arrayList10.add(subcompose5.get(i29).mo5152measureBRTryo0(m6209copyZbe2FdA$default));
                            i29++;
                            subcompose5 = subcompose5;
                        }
                        final ArrayList arrayList11 = arrayList10;
                        final WindowInsets windowInsets7 = windowInsets2;
                        final Integer num2 = valueOf;
                        final int i30 = width3;
                        final Integer num3 = num;
                        final int i31 = i5;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.layout$default(subcomposeMeasureScope, m6218getMaxWidthimpl, m6217getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                List<Placeable> list2 = arrayList11;
                                int size6 = list2.size();
                                for (int i32 = 0; i32 < size6; i32++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i32), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList4;
                                int size7 = list3.size();
                                for (int i33 = 0; i33 < size7; i33++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i33), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList5;
                                int i34 = m6218getMaxWidthimpl;
                                int i35 = i30;
                                WindowInsets windowInsets8 = windowInsets7;
                                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                int i36 = m6217getMaxHeightimpl;
                                int i37 = i31;
                                int size8 = list4.size();
                                for (int i38 = 0; i38 < size8; i38++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i38), ((i34 - i35) / 2) + windowInsets8.getLeft(subcomposeMeasureScope4, subcomposeMeasureScope4.getLayoutDirection()), i36 - i37, 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList9;
                                int i39 = m6217getMaxHeightimpl;
                                Integer num4 = num2;
                                int size9 = list5.size();
                                for (int i40 = 0; i40 < size9; i40++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i40), 0, i39 - (num4 != null ? num4.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List<Placeable> list6 = arrayList7;
                                    int i41 = m6217getMaxHeightimpl;
                                    Integer num5 = num3;
                                    int size10 = list6.size();
                                    for (int i42 = 0; i42 < size10; i42++) {
                                        Placeable placeable5 = list6.get(i42);
                                        int left = fabPlacement3.getLeft();
                                        Intrinsics.checkNotNull(num5);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i41 - num5.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i4 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, startRestartGroup, i4, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
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

                public final void invoke(Composer composer2, int i5) {
                    ScaffoldKt.m2073ScaffoldLayoutFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
