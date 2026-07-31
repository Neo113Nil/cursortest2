package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u009d\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\u0013\b\u0002\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001b\b\u0002\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001d2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a£\u0001\u0010/\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00122\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f¢\u0006\u0002\b*H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\"\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0017\u00106\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/ScaffoldState;", "rememberScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Landroidx/compose/foundation/layout/ColumnScope;", "drawerContent", "drawerGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScaffoldLayout", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: invoke */
        public final FabPlacement mo4828invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m2507constructorimpl(16);

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1569641925);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        return scaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        if (r0.changed(r54) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m956Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i, boolean z, Function3 function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3 content, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Function2 function24;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier modifier2;
        ScaffoldState scaffoldState2;
        Function2 m822getLambda1$material_release;
        Function2 m823getLambda2$material_release;
        Function3 m824getLambda3$material_release;
        Function2 m825getLambda4$material_release;
        boolean z3;
        Shape shape2;
        Shape shape3;
        boolean z4;
        int i16;
        long j6;
        long j7;
        long j8;
        int i17;
        long j9;
        long j10;
        boolean z5;
        long j11;
        long j12;
        int i18;
        long j13;
        final Modifier modifier3;
        ScaffoldState scaffoldState3;
        Shape shape4;
        long j14;
        float f2;
        int i19;
        Function3 function33;
        ScaffoldState scaffoldState4;
        final ScaffoldState scaffoldState5;
        final Function2 function25;
        final int i20;
        final float f3;
        final Function3 function34;
        final boolean z6;
        final Function2 function26;
        final Function2 function27;
        final Shape shape5;
        final Function3 function35;
        final boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i21;
        int i22;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1037492569);
        int i25 = i4 & 1;
        if (i25 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i4 & 2) == 0 && startRestartGroup.changed(scaffoldState)) {
                i24 = 32;
                i5 |= i24;
            }
            i24 = 16;
            i5 |= i24;
        }
        int i26 = i4 & 4;
        if (i26 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(function2) ? 256 : 128;
            i6 = i4 & 8;
            int i27 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(function22) ? 2048 : 1024;
                i7 = i4 & 16;
                int i28 = 8192;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(function3) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                    function24 = function23;
                } else {
                    function24 = function23;
                    if ((i2 & 458752) == 0) {
                        i5 |= startRestartGroup.changed(function24) ? 131072 : 65536;
                    }
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    i10 = i;
                } else {
                    i10 = i;
                    if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(i10) ? 1048576 : 524288;
                    }
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(function32) ? 67108864 : 33554432;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    if ((i4 & 1024) == 0 && startRestartGroup.changed(shape)) {
                        i23 = 4;
                        i14 = i3 | i23;
                    }
                    i23 = 2;
                    i14 = i3 | i23;
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= startRestartGroup.changed(f) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && startRestartGroup.changed(j)) {
                        i22 = 256;
                        i14 |= i22;
                    }
                    i22 = 128;
                    i14 |= i22;
                }
                if ((i3 & 7168) == 0) {
                    if ((i4 & 8192) != 0) {
                    }
                    i27 = 1024;
                    i14 |= i27;
                }
                if ((i3 & 57344) == 0) {
                    if ((i4 & 16384) == 0 && startRestartGroup.changed(j3)) {
                        i28 = 16384;
                    }
                    i14 |= i28;
                }
                if ((i3 & 458752) == 0) {
                    i14 |= ((i4 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                }
                if ((i3 & 3670016) == 0) {
                    i14 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                }
                if ((i4 & 131072) == 0) {
                    i21 = (i3 & 29360128) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                    if ((i5 & 1533916891) == 306783378 || (i14 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i25 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i4 & 2) == 0) {
                                modifier2 = modifier4;
                                scaffoldState2 = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                i5 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            } else {
                                modifier2 = modifier4;
                                scaffoldState2 = scaffoldState;
                            }
                            m822getLambda1$material_release = i26 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m822getLambda1$material_release() : function2;
                            m823getLambda2$material_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m823getLambda2$material_release() : function22;
                            m824getLambda3$material_release = i7 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m824getLambda3$material_release() : function3;
                            m825getLambda4$material_release = i8 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m825getLambda4$material_release() : function23;
                            if (i9 != 0) {
                                i10 = FabPosition.INSTANCE.m882getEnd5ygKITE();
                            }
                            z3 = i11 == 0 ? false : z;
                            Function3 function36 = i12 == 0 ? null : function32;
                            boolean z8 = i13 == 0 ? true : z2;
                            ScaffoldState scaffoldState6 = scaffoldState2;
                            Function3 function37 = function36;
                            if ((i4 & 1024) == 0) {
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                i14 &= -15;
                            } else {
                                shape2 = shape;
                            }
                            int i29 = i14;
                            float m840getElevationD9Ej5fM = i15 == 0 ? DrawerDefaults.INSTANCE.m840getElevationD9Ej5fM() : f;
                            if ((i4 & 4096) == 0) {
                                shape3 = shape2;
                                boolean z9 = z8;
                                i16 = i29 & (-897);
                                j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                z4 = z9;
                            } else {
                                shape3 = shape2;
                                z4 = z8;
                                i16 = i29;
                                j6 = j;
                            }
                            float f4 = m840getElevationD9Ej5fM;
                            if ((i4 & 8192) == 0) {
                                j7 = ColorsKt.m814contentColorForek8zF_U(j6, startRestartGroup, (i16 >> 6) & 14);
                                i16 &= -7169;
                            } else {
                                j7 = j2;
                            }
                            if ((i4 & 16384) == 0) {
                                j8 = j6;
                                i17 = 6;
                                j9 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                i16 &= -57345;
                            } else {
                                j8 = j6;
                                i17 = 6;
                                j9 = j3;
                            }
                            if ((32768 & i4) == 0) {
                                j10 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i17).m789getBackground0d7_KjU();
                                i16 &= -458753;
                            } else {
                                j10 = j4;
                            }
                            if ((i4 & 65536) == 0) {
                                long m814contentColorForek8zF_U = ColorsKt.m814contentColorForek8zF_U(j10, startRestartGroup, (i16 >> 15) & 14);
                                i16 &= -3670017;
                                z5 = z4;
                                j12 = j10;
                                i18 = i5;
                                j11 = m814contentColorForek8zF_U;
                                modifier3 = modifier2;
                                scaffoldState3 = scaffoldState6;
                                shape4 = shape3;
                                j13 = j9;
                            } else {
                                z5 = z4;
                                j11 = j5;
                                j12 = j10;
                                i18 = i5;
                                j13 = j9;
                                modifier3 = modifier2;
                                scaffoldState3 = scaffoldState6;
                                shape4 = shape3;
                            }
                            j14 = j7;
                            f2 = f4;
                            i19 = i16;
                            function33 = function37;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 2) != 0) {
                                i5 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            }
                            if ((i4 & 1024) != 0) {
                                i14 &= -15;
                            }
                            int i30 = i14;
                            if ((i4 & 4096) != 0) {
                                i30 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i30 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i30 &= -57345;
                            }
                            if ((32768 & i4) != 0) {
                                i30 &= -458753;
                            }
                            if ((i4 & 65536) != 0) {
                                i30 &= -3670017;
                            }
                            scaffoldState3 = scaffoldState;
                            m822getLambda1$material_release = function2;
                            m823getLambda2$material_release = function22;
                            z3 = z;
                            function33 = function32;
                            z5 = z2;
                            f2 = f;
                            j8 = j;
                            j14 = j2;
                            j13 = j3;
                            j12 = j4;
                            j11 = j5;
                            i19 = i30;
                            i18 = i5;
                            m825getLambda4$material_release = function24;
                            modifier3 = modifier;
                            m824getLambda3$material_release = function3;
                            shape4 = shape;
                        }
                        startRestartGroup.endDefaults();
                        final long j15 = j12;
                        final long j16 = j11;
                        final int i31 = i19;
                        final boolean z10 = z3;
                        final int i32 = i10;
                        final Function2 function28 = m822getLambda1$material_release;
                        final Function2 function29 = m825getLambda4$material_release;
                        final Function2 function210 = m823getLambda2$material_release;
                        final int i33 = i18;
                        final Function3 function38 = m824getLambda3$material_release;
                        final ScaffoldState scaffoldState7 = scaffoldState3;
                        Function2 function211 = m822getLambda1$material_release;
                        Function2 function212 = m823getLambda2$material_release;
                        final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i34) {
                                int i35;
                                Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                                if ((i34 & 14) == 0) {
                                    i35 = i34 | (composer2.changed(childModifier) ? 4 : 2);
                                } else {
                                    i35 = i34;
                                }
                                if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                                    long j17 = j15;
                                    long j18 = j16;
                                    final boolean z11 = z10;
                                    final int i36 = i32;
                                    final Function2 function213 = function28;
                                    final Function3 function39 = content;
                                    final Function2 function214 = function29;
                                    final Function2 function215 = function210;
                                    final int i37 = i33;
                                    final int i38 = i31;
                                    final Function3 function310 = function38;
                                    final ScaffoldState scaffoldState8 = scaffoldState7;
                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                        public final void invoke(@Nullable Composer composer3, int i39) {
                                            if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                                boolean z12 = z11;
                                                int i40 = i36;
                                                Function2 function216 = function213;
                                                Function3 function311 = function39;
                                                final Function3 function312 = function310;
                                                final ScaffoldState scaffoldState9 = scaffoldState8;
                                                final int i41 = i37;
                                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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
                                                    public final void invoke(@Nullable Composer composer4, int i42) {
                                                        if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                        } else {
                                                            Function3.this.invoke(scaffoldState9.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 9) & 112));
                                                        }
                                                    }
                                                });
                                                Function2 function217 = function214;
                                                Function2 function218 = function215;
                                                int i42 = i37;
                                                ScaffoldKt.m957ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    });
                                    int i39 = 1572864 | (i35 & 14);
                                    int i40 = i31;
                                    SurfaceKt.m988SurfaceFjzlyU(childModifier, null, j17, j18, null, 0.0f, composableLambda2, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                        if (function33 == null) {
                            startRestartGroup.startReplaceableGroup(-1013848234);
                            scaffoldState4 = scaffoldState3;
                            int i34 = i19 << 12;
                            DrawerKt.m844ModalDrawerGs3lGvM(function33, modifier3, scaffoldState3.getDrawerState(), z5, shape4, f2, j8, j14, j13, ComposableLambdaKt.composableLambda(startRestartGroup, 100842932, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                                public final void invoke(@Nullable Composer composer2, int i35) {
                                    if ((i35 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        Function3.this.invoke(Modifier.INSTANCE, composer2, 54);
                                    }
                                }
                            }), startRestartGroup, ((i18 >> 24) & 14) | C.ENCODING_PCM_32BIT | ((i18 << 3) & 112) | ((i18 >> 18) & 7168) | (i34 & 57344) | (i34 & 458752) | (i34 & 3670016) | (i34 & 29360128) | (i34 & 234881024), 0);
                            startRestartGroup.endReplaceableGroup();
                        } else {
                            scaffoldState4 = scaffoldState3;
                            startRestartGroup.startReplaceableGroup(-1013847725);
                            composableLambda.invoke(modifier3, startRestartGroup, Integer.valueOf((i18 & 14) | 48));
                            startRestartGroup.endReplaceableGroup();
                        }
                        scaffoldState5 = scaffoldState4;
                        function25 = m825getLambda4$material_release;
                        i20 = i10;
                        f3 = f2;
                        function34 = function33;
                        z6 = z5;
                        function26 = function211;
                        function27 = function212;
                        boolean z11 = z3;
                        shape5 = shape4;
                        function35 = m824getLambda3$material_release;
                        z7 = z11;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scaffoldState5 = scaffoldState;
                        function26 = function2;
                        function27 = function22;
                        function35 = function3;
                        function34 = function32;
                        shape5 = shape;
                        f3 = f;
                        j8 = j;
                        j14 = j2;
                        j13 = j3;
                        j12 = j4;
                        j11 = j5;
                        function25 = function24;
                        i20 = i10;
                        z7 = z;
                        z6 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    final long j17 = j8;
                    final long j18 = j14;
                    final long j19 = j13;
                    final long j20 = j12;
                    final long j21 = j11;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i35) {
                            ScaffoldKt.m956Scaffold27mzLpw(Modifier.this, scaffoldState5, function26, function27, function35, function25, i20, z7, function34, z6, shape5, f3, j17, j18, j19, j20, j21, content, composer2, i2 | 1, i3, i4);
                        }
                    });
                    return;
                }
                i14 |= i21;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i25 == 0) {
                }
                if ((i4 & 2) == 0) {
                }
                if (i26 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                ScaffoldState scaffoldState62 = scaffoldState2;
                Function3 function372 = function36;
                if ((i4 & 1024) == 0) {
                }
                int i292 = i14;
                if (i15 == 0) {
                }
                if ((i4 & 4096) == 0) {
                }
                float f42 = m840getElevationD9Ej5fM;
                if ((i4 & 8192) == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((32768 & i4) == 0) {
                }
                if ((i4 & 65536) == 0) {
                }
                j14 = j7;
                f2 = f42;
                i19 = i16;
                function33 = function372;
                startRestartGroup.endDefaults();
                final long j152 = j12;
                final long j162 = j11;
                final int i312 = i19;
                final boolean z102 = z3;
                final int i322 = i10;
                final Function2 function282 = m822getLambda1$material_release;
                final Function2 function292 = m825getLambda4$material_release;
                final Function2 function2102 = m823getLambda2$material_release;
                final int i332 = i18;
                final Function3 function382 = m824getLambda3$material_release;
                final ScaffoldState scaffoldState72 = scaffoldState3;
                Function2 function2112 = m822getLambda1$material_release;
                Function2 function2122 = m823getLambda2$material_release;
                final Function3 composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i342) {
                        int i35;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        if ((i342 & 14) == 0) {
                            i35 = i342 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i35 = i342;
                        }
                        if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                            long j172 = j152;
                            long j182 = j162;
                            final boolean z112 = z102;
                            final int i36 = i322;
                            final Function2 function213 = function282;
                            final Function3 function39 = content;
                            final Function2 function214 = function292;
                            final Function2 function215 = function2102;
                            final int i37 = i332;
                            final int i38 = i312;
                            final Function3 function310 = function382;
                            final ScaffoldState scaffoldState8 = scaffoldState72;
                            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i39) {
                                    if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                        boolean z12 = z112;
                                        int i40 = i36;
                                        Function2 function216 = function213;
                                        Function3 function311 = function39;
                                        final Function3 function312 = function310;
                                        final ScaffoldState scaffoldState9 = scaffoldState8;
                                        final int i41 = i37;
                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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
                                            public final void invoke(@Nullable Composer composer4, int i42) {
                                                if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    Function3.this.invoke(scaffoldState9.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 9) & 112));
                                                }
                                            }
                                        });
                                        Function2 function217 = function214;
                                        Function2 function218 = function215;
                                        int i42 = i37;
                                        ScaffoldKt.m957ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            int i39 = 1572864 | (i35 & 14);
                            int i40 = i312;
                            SurfaceKt.m988SurfaceFjzlyU(childModifier, null, j172, j182, null, 0.0f, composableLambda22, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                if (function33 == null) {
                }
                scaffoldState5 = scaffoldState4;
                function25 = m825getLambda4$material_release;
                i20 = i10;
                f3 = f2;
                function34 = function33;
                z6 = z5;
                function26 = function2112;
                function27 = function2122;
                boolean z112 = z3;
                shape5 = shape4;
                function35 = m824getLambda3$material_release;
                z7 = z112;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            int i282 = 8192;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            i14 |= i21;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i25 == 0) {
            }
            if ((i4 & 2) == 0) {
            }
            if (i26 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            ScaffoldState scaffoldState622 = scaffoldState2;
            Function3 function3722 = function36;
            if ((i4 & 1024) == 0) {
            }
            int i2922 = i14;
            if (i15 == 0) {
            }
            if ((i4 & 4096) == 0) {
            }
            float f422 = m840getElevationD9Ej5fM;
            if ((i4 & 8192) == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((32768 & i4) == 0) {
            }
            if ((i4 & 65536) == 0) {
            }
            j14 = j7;
            f2 = f422;
            i19 = i16;
            function33 = function3722;
            startRestartGroup.endDefaults();
            final long j1522 = j12;
            final long j1622 = j11;
            final int i3122 = i19;
            final boolean z1022 = z3;
            final int i3222 = i10;
            final Function2 function2822 = m822getLambda1$material_release;
            final Function2 function2922 = m825getLambda4$material_release;
            final Function2 function21022 = m823getLambda2$material_release;
            final int i3322 = i18;
            final Function3 function3822 = m824getLambda3$material_release;
            final ScaffoldState scaffoldState722 = scaffoldState3;
            Function2 function21122 = m822getLambda1$material_release;
            Function2 function21222 = m823getLambda2$material_release;
            final Function3 composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i342) {
                    int i35;
                    Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                    if ((i342 & 14) == 0) {
                        i35 = i342 | (composer2.changed(childModifier) ? 4 : 2);
                    } else {
                        i35 = i342;
                    }
                    if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                        long j172 = j1522;
                        long j182 = j1622;
                        final boolean z1122 = z1022;
                        final int i36 = i3222;
                        final Function2 function213 = function2822;
                        final Function3 function39 = content;
                        final Function2 function214 = function2922;
                        final Function2 function215 = function21022;
                        final int i37 = i3322;
                        final int i38 = i3122;
                        final Function3 function310 = function3822;
                        final ScaffoldState scaffoldState8 = scaffoldState722;
                        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i39) {
                                if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                    boolean z12 = z1122;
                                    int i40 = i36;
                                    Function2 function216 = function213;
                                    Function3 function311 = function39;
                                    final Function3 function312 = function310;
                                    final ScaffoldState scaffoldState9 = scaffoldState8;
                                    final int i41 = i37;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i42) {
                                            if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                Function3.this.invoke(scaffoldState9.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 9) & 112));
                                            }
                                        }
                                    });
                                    Function2 function217 = function214;
                                    Function2 function218 = function215;
                                    int i42 = i37;
                                    ScaffoldKt.m957ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        int i39 = 1572864 | (i35 & 14);
                        int i40 = i3122;
                        SurfaceKt.m988SurfaceFjzlyU(childModifier, null, j172, j182, null, 0.0f, composableLambda222, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (function33 == null) {
            }
            scaffoldState5 = scaffoldState4;
            function25 = m825getLambda4$material_release;
            i20 = i10;
            f3 = f2;
            function34 = function33;
            z6 = z5;
            function26 = function21122;
            function27 = function21222;
            boolean z1122 = z3;
            shape5 = shape4;
            function35 = m824getLambda3$material_release;
            z7 = z1122;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        int i272 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2822 = 8192;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        i14 |= i21;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i25 == 0) {
        }
        if ((i4 & 2) == 0) {
        }
        if (i26 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        ScaffoldState scaffoldState6222 = scaffoldState2;
        Function3 function37222 = function36;
        if ((i4 & 1024) == 0) {
        }
        int i29222 = i14;
        if (i15 == 0) {
        }
        if ((i4 & 4096) == 0) {
        }
        float f4222 = m840getElevationD9Ej5fM;
        if ((i4 & 8192) == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((32768 & i4) == 0) {
        }
        if ((i4 & 65536) == 0) {
        }
        j14 = j7;
        f2 = f4222;
        i19 = i16;
        function33 = function37222;
        startRestartGroup.endDefaults();
        final long j15222 = j12;
        final long j16222 = j11;
        final int i31222 = i19;
        final boolean z10222 = z3;
        final int i32222 = i10;
        final Function2 function28222 = m822getLambda1$material_release;
        final Function2 function29222 = m825getLambda4$material_release;
        final Function2 function210222 = m823getLambda2$material_release;
        final int i33222 = i18;
        final Function3 function38222 = m824getLambda3$material_release;
        final ScaffoldState scaffoldState7222 = scaffoldState3;
        Function2 function211222 = m822getLambda1$material_release;
        Function2 function212222 = m823getLambda2$material_release;
        final Function3 composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i342) {
                int i35;
                Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                if ((i342 & 14) == 0) {
                    i35 = i342 | (composer2.changed(childModifier) ? 4 : 2);
                } else {
                    i35 = i342;
                }
                if ((i35 & 91) != 18 || !composer2.getSkipping()) {
                    long j172 = j15222;
                    long j182 = j16222;
                    final boolean z11222 = z10222;
                    final int i36 = i32222;
                    final Function2 function213 = function28222;
                    final Function3 function39 = content;
                    final Function2 function214 = function29222;
                    final Function2 function215 = function210222;
                    final int i37 = i33222;
                    final int i38 = i31222;
                    final Function3 function310 = function38222;
                    final ScaffoldState scaffoldState8 = scaffoldState7222;
                    ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i39) {
                            if ((i39 & 11) != 2 || !composer3.getSkipping()) {
                                boolean z12 = z11222;
                                int i40 = i36;
                                Function2 function216 = function213;
                                Function3 function311 = function39;
                                final Function3 function312 = function310;
                                final ScaffoldState scaffoldState9 = scaffoldState8;
                                final int i41 = i37;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i42) {
                                        if ((i42 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            Function3.this.invoke(scaffoldState9.getSnackbarHostState(), composer4, Integer.valueOf((i41 >> 9) & 112));
                                        }
                                    }
                                });
                                Function2 function217 = function214;
                                Function2 function218 = function215;
                                int i42 = i37;
                                ScaffoldKt.m957ScaffoldLayoutMDYNRJg(z12, i40, function216, function311, composableLambda3, function217, function218, composer3, ((i42 >> 21) & 14) | 24576 | ((i42 >> 15) & 112) | (i42 & 896) | ((i38 >> 12) & 7168) | (458752 & i42) | ((i42 << 9) & 3670016));
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    int i39 = 1572864 | (i35 & 14);
                    int i40 = i31222;
                    SurfaceKt.m988SurfaceFjzlyU(childModifier, null, j172, j182, null, 0.0f, composableLambda2222, composer2, i39 | ((i40 >> 9) & 896) | ((i40 >> 9) & 7168), 50);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        if (function33 == null) {
        }
        scaffoldState5 = scaffoldState4;
        function25 = m825getLambda4$material_release;
        i20 = i10;
        f3 = f2;
        function34 = function33;
        z6 = z5;
        function26 = function211222;
        function27 = function212222;
        boolean z11222 = z3;
        shape5 = shape4;
        function35 = m824getLambda3$material_release;
        z7 = z11222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m957ScaffoldLayoutMDYNRJg(final boolean z, final int i, final Function2 function2, final Function3 function3, final Function2 function22, final Function2 function23, final Function2 function24, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1401632215);
        int i4 = (i2 & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= startRestartGroup.changed(function24) ? 1048576 : 524288;
        }
        final int i5 = i4;
        if ((i5 & 2995931) != 599186 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {function2, function22, function23, FabPosition.m874boximpl(i), Boolean.valueOf(z), function24, function3};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z2 = false;
            for (int i6 = 0; i6 < 7; i6++) {
                z2 |= startRestartGroup.changed(objArr[i6]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                rememberedValue = new Function2() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m959invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m959invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, long j) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j);
                        final int m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(j);
                        final long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final Function2 function25 = Function2.this;
                        final Function2 function26 = function22;
                        final Function2 function27 = function23;
                        final int i7 = i;
                        final boolean z3 = z;
                        final Function2 function28 = function24;
                        final int i8 = i5;
                        final Function3 function32 = function3;
                        return MeasureScope.layout$default(SubcomposeLayout, m2487getMaxWidthimpl, m2486getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
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
                                Object obj;
                                Object obj2;
                                final FabPlacement fabPlacement;
                                Object obj3;
                                Integer num;
                                int height;
                                float f;
                                int mo265roundToPx0680j_4;
                                int height2;
                                float f2;
                                Object obj4;
                                Object obj5;
                                int i9;
                                float f3;
                                float f4;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List subcompose = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.TopBar, function25);
                                long j2 = m2478copyZbe2FdA$default;
                                ArrayList arrayList = new ArrayList(subcompose.size());
                                int size = subcompose.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    arrayList.add(((Measurable) subcompose.get(i10)).mo1944measureBRTryo0(j2));
                                }
                                if (arrayList.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList.get(0);
                                    int height3 = ((Placeable) obj).getHeight();
                                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                    if (1 <= lastIndex) {
                                        int i11 = 1;
                                        while (true) {
                                            Object obj6 = arrayList.get(i11);
                                            int height4 = ((Placeable) obj6).getHeight();
                                            if (height3 < height4) {
                                                obj = obj6;
                                                height3 = height4;
                                            }
                                            if (i11 == lastIndex) {
                                                break;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                int height5 = placeable != null ? placeable.getHeight() : 0;
                                List subcompose2 = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.Snackbar, function26);
                                long j3 = m2478copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(subcompose2.size());
                                int size2 = subcompose2.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    arrayList2.add(((Measurable) subcompose2.get(i12)).mo1944measureBRTryo0(j3));
                                }
                                if (arrayList2.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList2.get(0);
                                    int height6 = ((Placeable) obj2).getHeight();
                                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex2) {
                                        int i13 = 1;
                                        while (true) {
                                            Object obj7 = arrayList2.get(i13);
                                            int height7 = ((Placeable) obj7).getHeight();
                                            if (height6 < height7) {
                                                obj2 = obj7;
                                                height6 = height7;
                                            }
                                            if (i13 == lastIndex2) {
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable2 = (Placeable) obj2;
                                int height8 = placeable2 != null ? placeable2.getHeight() : 0;
                                List subcompose3 = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.Fab, function27);
                                long j4 = m2478copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = subcompose3.iterator();
                                while (it.hasNext()) {
                                    Placeable mo1944measureBRTryo0 = ((Measurable) it.next()).mo1944measureBRTryo0(j4);
                                    if (mo1944measureBRTryo0.getHeight() == 0 || mo1944measureBRTryo0.getWidth() == 0) {
                                        mo1944measureBRTryo0 = null;
                                    }
                                    if (mo1944measureBRTryo0 != null) {
                                        arrayList3.add(mo1944measureBRTryo0);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    fabPlacement = null;
                                } else {
                                    if (arrayList3.isEmpty()) {
                                        obj4 = null;
                                    } else {
                                        obj4 = arrayList3.get(0);
                                        int width = ((Placeable) obj4).getWidth();
                                        int lastIndex3 = CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex3) {
                                            int i14 = 1;
                                            while (true) {
                                                Object obj8 = arrayList3.get(i14);
                                                int width2 = ((Placeable) obj8).getWidth();
                                                if (width < width2) {
                                                    obj4 = obj8;
                                                    width = width2;
                                                }
                                                if (i14 == lastIndex3) {
                                                    break;
                                                } else {
                                                    i14++;
                                                }
                                            }
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj4);
                                    int width3 = ((Placeable) obj4).getWidth();
                                    if (arrayList3.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = arrayList3.get(0);
                                        int height9 = ((Placeable) obj5).getHeight();
                                        int lastIndex4 = CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex4) {
                                            int i15 = 1;
                                            while (true) {
                                                Object obj9 = arrayList3.get(i15);
                                                int height10 = ((Placeable) obj9).getHeight();
                                                if (height9 < height10) {
                                                    height9 = height10;
                                                    obj5 = obj9;
                                                }
                                                if (i15 == lastIndex4) {
                                                    break;
                                                } else {
                                                    i15++;
                                                }
                                            }
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj5);
                                    int height11 = ((Placeable) obj5).getHeight();
                                    if (!FabPosition.m877equalsimpl0(i7, FabPosition.INSTANCE.m882getEnd5ygKITE())) {
                                        i9 = (m2487getMaxWidthimpl - width3) / 2;
                                    } else if (SubcomposeMeasureScope.this.getLayoutDirection() == LayoutDirection.Ltr) {
                                        int i16 = m2487getMaxWidthimpl;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeMeasureScope.this;
                                        f4 = ScaffoldKt.FabSpacing;
                                        i9 = (i16 - subcomposeMeasureScope.mo265roundToPx0680j_4(f4)) - width3;
                                    } else {
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeMeasureScope.this;
                                        f3 = ScaffoldKt.FabSpacing;
                                        i9 = subcomposeMeasureScope2.mo265roundToPx0680j_4(f3);
                                    }
                                    fabPlacement = new FabPlacement(z3, i9, width3, height11);
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope3 = SubcomposeMeasureScope.this;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2 function29 = function28;
                                final int i17 = i8;
                                List subcompose4 = subcomposeMeasureScope3.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(1529070963, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj10, Object obj11) {
                                        invoke((Composer) obj10, ((Number) obj11).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i18) {
                                        if ((i18 & 11) != 2 || !composer2.getSkipping()) {
                                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(FabPlacement.this)}, function29, composer2, ((i17 >> 15) & 112) | 8);
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                    }
                                }));
                                long j5 = m2478copyZbe2FdA$default;
                                ArrayList arrayList4 = new ArrayList(subcompose4.size());
                                int size3 = subcompose4.size();
                                for (int i18 = 0; i18 < size3; i18++) {
                                    arrayList4.add(((Measurable) subcompose4.get(i18)).mo1944measureBRTryo0(j5));
                                }
                                if (arrayList4.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    obj3 = arrayList4.get(0);
                                    int height12 = ((Placeable) obj3).getHeight();
                                    int lastIndex5 = CollectionsKt.getLastIndex(arrayList4);
                                    if (1 <= lastIndex5) {
                                        int i19 = 1;
                                        while (true) {
                                            Object obj10 = arrayList4.get(i19);
                                            int height13 = ((Placeable) obj10).getHeight();
                                            if (height12 < height13) {
                                                obj3 = obj10;
                                                height12 = height13;
                                            }
                                            if (i19 == lastIndex5) {
                                                break;
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable3 = (Placeable) obj3;
                                final int height14 = placeable3 != null ? placeable3.getHeight() : 0;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope4 = SubcomposeMeasureScope.this;
                                    boolean z4 = z3;
                                    if (height14 == 0) {
                                        height = fabPlacement.getHeight();
                                        f2 = ScaffoldKt.FabSpacing;
                                        mo265roundToPx0680j_4 = subcomposeMeasureScope4.mo265roundToPx0680j_4(f2);
                                    } else if (z4) {
                                        height2 = height14 + (fabPlacement.getHeight() / 2);
                                        num = Integer.valueOf(height2);
                                    } else {
                                        height = fabPlacement.getHeight() + height14;
                                        f = ScaffoldKt.FabSpacing;
                                        mo265roundToPx0680j_4 = subcomposeMeasureScope4.mo265roundToPx0680j_4(f);
                                    }
                                    height2 = height + mo265roundToPx0680j_4;
                                    num = Integer.valueOf(height2);
                                } else {
                                    num = null;
                                }
                                int intValue = height8 != 0 ? height8 + (num != null ? num.intValue() : height14) : 0;
                                int i20 = m2486getMaxHeightimpl - height5;
                                final SubcomposeMeasureScope subcomposeMeasureScope5 = SubcomposeMeasureScope.this;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final Function3 function33 = function32;
                                final int i21 = i8;
                                List subcompose5 = subcomposeMeasureScope5.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new Function2() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj11, Object obj12) {
                                        invoke((Composer) obj11, ((Number) obj12).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i22) {
                                        if ((i22 & 11) != 2 || !composer2.getSkipping()) {
                                            function33.invoke(PaddingKt.m333PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, SubcomposeMeasureScope.this.mo268toDpu2uoSUM(height14), 7, null), composer2, Integer.valueOf((i21 >> 6) & 112));
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                    }
                                }));
                                long j6 = m2478copyZbe2FdA$default;
                                ArrayList arrayList5 = new ArrayList(subcompose5.size());
                                int size4 = subcompose5.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    arrayList5.add(((Measurable) subcompose5.get(i22)).mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j6, 0, 0, 0, i20, 7, null)));
                                    i22++;
                                    subcompose5 = subcompose5;
                                    j6 = j6;
                                }
                                int size5 = arrayList5.size();
                                int i23 = 0;
                                while (i23 < size5) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList5.get(i23), 0, height5, 0.0f, 4, null);
                                    i23++;
                                    arrayList4 = arrayList4;
                                    arrayList5 = arrayList5;
                                }
                                ArrayList arrayList6 = arrayList4;
                                int size6 = arrayList.size();
                                for (int i24 = 0; i24 < size6; i24++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList.get(i24), 0, 0, 0.0f, 4, null);
                                }
                                int i25 = m2486getMaxHeightimpl;
                                int size7 = arrayList2.size();
                                for (int i26 = 0; i26 < size7; i26++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList2.get(i26), 0, i25 - intValue, 0.0f, 4, null);
                                }
                                int i27 = m2486getMaxHeightimpl;
                                int size8 = arrayList6.size();
                                for (int i28 = 0; i28 < size8; i28++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList6.get(i28), 0, i27 - height14, 0.0f, 4, null);
                                }
                                if (fabPlacement != null) {
                                    int i29 = m2486getMaxHeightimpl;
                                    int size9 = arrayList3.size();
                                    for (int i30 = 0; i30 < size9; i30++) {
                                        Placeable placeable4 = (Placeable) arrayList3.get(i30);
                                        int left = fabPlacement.getLeft();
                                        Intrinsics.checkNotNull(num);
                                        Placeable.PlacementScope.place$default(layout, placeable4, left, i29 - num.intValue(), 0.0f, 4, null);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i3 = 0;
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, startRestartGroup, i3, 1);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                ScaffoldKt.m957ScaffoldLayoutMDYNRJg(z, i, function2, function3, function22, function23, function24, composer2, i2 | 1);
            }
        });
    }

    public static final ProvidableCompositionLocal getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
