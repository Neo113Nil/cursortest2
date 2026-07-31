package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a×\u0002\u00106\u001a\u00020\u00142\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00102\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020#2\u001b\b\u0002\u0010)\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005¢\u0006\u0002\b\u00152\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020#2\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020%2\b\b\u0002\u0010/\u001a\u00020%2\b\b\u0002\u00100\u001a\u00020%2\b\b\u0002\u00101\u001a\u00020%2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aª\u0001\u0010?\u001a\u00020\u00142\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\u0002\b\u00152\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0002\b\u00152\u0006\u0010(\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:2\u0006\u0010<\u001a\u00020\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>\"\u0017\u0010@\u001a\u00020#8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomSheetState;", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/material/DrawerState;", "drawerState", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffold", "body", "", "bottomSheet", "Landroidx/compose/runtime/State;", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-KCBPh4w", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILandroidx/compose/runtime/State;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldLayout", "FabSpacing", "F", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m2507constructorimpl(16);

    public static final BottomSheetState rememberBottomSheetState(final BottomSheetValue initialValue, final AnimationSpec animationSpec, final Function1 function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.rememberSaveable(new Object[]{animationSpec}, BottomSheetState.INSTANCE.Saver(animationSpec, function1), null, new Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final BottomSheetState mo4828invoke() {
                return new BottomSheetState(BottomSheetValue.this, animationSpec, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomSheetState;
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(DrawerState drawerState, BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1353009744);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0249  */
    /* JADX WARN: Type inference failed for: r11v15, types: [androidx.compose.ui.Modifier] */
    /* renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m747BottomSheetScaffoldbGncdBI(final Function3 sheetContent, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2 function2, Function3 function3, Function2 function22, int i, boolean z, Shape shape, float f, long j, long j2, float f2, Function3 function32, boolean z2, Shape shape2, float f3, long j3, long j4, long j5, long j6, long j7, final Function3 content, Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        final BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i7;
        int i8;
        Function3 function33;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long j8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        final Function3 m821getLambda1$material_release;
        final Function2 function23;
        final int m882getEnd5ygKITE;
        final boolean z3;
        Shape shape3;
        float m745getSheetElevationD9Ej5fM;
        int i30;
        long j9;
        long j10;
        boolean z4;
        long j11;
        Shape shape4;
        Shape shape5;
        float f4;
        long j12;
        long j13;
        long j14;
        int i31;
        long j15;
        long j16;
        int i32;
        Shape shape6;
        long j17;
        long j18;
        final Function3 function34;
        Modifier modifier2;
        int i33;
        Function2 function24;
        float f5;
        float f6;
        long j19;
        Object rememberedValue;
        Composer.Companion companion;
        final float mo271toPx0680j_4;
        Object rememberedValue2;
        Object obj;
        final MutableState mutableState;
        Composer composer2;
        Modifier modifier3;
        Modifier.Companion companion2;
        Composer composer3;
        final float f7;
        final Shape shape7;
        final long j20;
        final long j21;
        final long j22;
        final Function2 function25;
        final Modifier modifier4;
        final long j23;
        final float f8;
        final long j24;
        final long j25;
        ScopeUpdateScope endRestartGroup;
        int i34;
        int i35;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(46422755);
        if ((i5 & 1) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i6 = (startRestartGroup.changed(sheetContent) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        int i36 = i5 & 2;
        if (i36 != 0) {
            i6 |= 48;
        } else if ((i2 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i5 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i35 = 256;
                        i6 |= i35;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i35 = 128;
                i6 |= i35;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i6 |= startRestartGroup.changed(function2) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                    function33 = function3;
                } else {
                    function33 = function3;
                    if ((i2 & 57344) == 0) {
                        i6 |= startRestartGroup.changed(function33) ? 16384 : 8192;
                    }
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    i6 |= startRestartGroup.changed(function22) ? 131072 : 65536;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i6 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i12 = i11;
                    i6 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                    if ((i2 & 234881024) == 0) {
                        if ((i5 & 256) == 0 && startRestartGroup.changed(shape)) {
                            i34 = 67108864;
                            i6 |= i34;
                        }
                        i34 = 33554432;
                        i6 |= i34;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= C.ENCODING_PCM_32BIT;
                    } else if ((i2 & 1879048192) == 0) {
                        i14 = i13;
                        i6 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
                        if ((i3 & 14) == 0) {
                            i15 = (((i5 & 1024) == 0 && startRestartGroup.changed(j)) ? 4 : 2) | i3;
                        } else {
                            i15 = i3;
                        }
                        if ((i3 & 112) == 0) {
                            i15 |= ((i5 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                        }
                        i16 = i5 & 4096;
                        if (i16 != 0) {
                            i15 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i15 |= startRestartGroup.changed(f2) ? 256 : 128;
                            i17 = i5 & 8192;
                            if (i17 == 0) {
                                i15 |= 3072;
                            } else if ((i3 & 7168) == 0) {
                                i15 |= startRestartGroup.changed(function32) ? 2048 : 1024;
                                i18 = i5 & 16384;
                                if (i18 != 0) {
                                    i15 |= 24576;
                                } else if ((i3 & 57344) == 0) {
                                    i19 = i18;
                                    i15 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                                    if ((i3 & 458752) == 0) {
                                        i15 |= ((i5 & 32768) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                                    }
                                    i20 = i5 & 65536;
                                    if (i20 == 0) {
                                        i15 |= 1572864;
                                    } else if ((i3 & 3670016) == 0) {
                                        i15 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                                    }
                                    if ((i3 & 29360128) == 0) {
                                        i15 |= ((i5 & 131072) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                                    }
                                    if ((i3 & 234881024) == 0) {
                                        i15 |= ((i5 & 262144) == 0 && startRestartGroup.changed(j4)) ? 67108864 : 33554432;
                                    }
                                    if ((i3 & 1879048192) == 0) {
                                        i15 |= ((i5 & 524288) == 0 && startRestartGroup.changed(j5)) ? 536870912 : 268435456;
                                    }
                                    i21 = i15;
                                    if ((i4 & 14) != 0) {
                                        i22 = (((i5 & 1048576) == 0 && startRestartGroup.changed(j6)) ? 4 : 2) | i4;
                                    } else {
                                        i22 = i4;
                                    }
                                    if ((i4 & 112) != 0) {
                                        j8 = j7;
                                        i22 |= ((i5 & 2097152) == 0 && startRestartGroup.changed(j8)) ? 32 : 16;
                                    } else {
                                        j8 = j7;
                                    }
                                    if ((i5 & 4194304) == 0) {
                                        i22 |= 384;
                                    } else if ((i4 & 896) == 0) {
                                        i22 |= startRestartGroup.changed(content) ? 256 : 128;
                                    }
                                    if ((1533916891 & i6) == 306783378 || (i21 & 1533916891) != 306783378 || (i22 & 731) != 146 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier5 = i36 == 0 ? Modifier.INSTANCE : modifier;
                                            if ((i5 & 4) == 0) {
                                                i23 = i22;
                                                int i37 = i12;
                                                i25 = i17;
                                                i26 = i37;
                                                int i38 = i14;
                                                i27 = i19;
                                                i28 = i38;
                                                i29 = i6 & (-897);
                                                bottomSheetScaffoldState2 = rememberBottomSheetScaffoldState(null, null, null, startRestartGroup, 0, 7);
                                                i24 = 6;
                                            } else {
                                                int i39 = i6;
                                                i23 = i22;
                                                i24 = 6;
                                                int i40 = i12;
                                                i25 = i17;
                                                i26 = i40;
                                                int i41 = i14;
                                                i27 = i19;
                                                i28 = i41;
                                                i29 = i39;
                                            }
                                            Function2 function26 = i7 == 0 ? null : function2;
                                            m821getLambda1$material_release = i8 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m821getLambda1$material_release() : function33;
                                            function23 = i9 == 0 ? null : function22;
                                            m882getEnd5ygKITE = i10 == 0 ? FabPosition.INSTANCE.m882getEnd5ygKITE() : i;
                                            z3 = i26 == 0 ? true : z;
                                            if ((i5 & 256) == 0) {
                                                shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, i24).getLarge();
                                                i29 &= -234881025;
                                            } else {
                                                shape3 = shape;
                                            }
                                            m745getSheetElevationD9Ej5fM = i28 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m745getSheetElevationD9Ej5fM() : f;
                                            if ((i5 & 1024) == 0) {
                                                i30 = i29;
                                                j9 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                                i21 &= -15;
                                            } else {
                                                i30 = i29;
                                                j9 = j;
                                            }
                                            Function2 function27 = function26;
                                            if ((i5 & 2048) == 0) {
                                                j10 = ColorsKt.m814contentColorForek8zF_U(j9, startRestartGroup, i21 & 14);
                                                i21 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                            } else {
                                                j10 = j2;
                                            }
                                            float m746getSheetPeekHeightD9Ej5fM = i16 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m746getSheetPeekHeightD9Ej5fM() : f2;
                                            Function3 function35 = i25 == 0 ? null : function32;
                                            z4 = i27 == 0 ? true : z2;
                                            float f9 = m746getSheetPeekHeightD9Ej5fM;
                                            if ((i5 & 32768) == 0) {
                                                j11 = j9;
                                                shape4 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                                i21 &= -458753;
                                            } else {
                                                j11 = j9;
                                                shape4 = shape2;
                                            }
                                            float m840getElevationD9Ej5fM = i20 == 0 ? DrawerDefaults.INSTANCE.m840getElevationD9Ej5fM() : f3;
                                            if ((i5 & 131072) == 0) {
                                                shape5 = shape4;
                                                i21 &= -29360129;
                                                f4 = m840getElevationD9Ej5fM;
                                                j12 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                            } else {
                                                shape5 = shape4;
                                                f4 = m840getElevationD9Ej5fM;
                                                j12 = j3;
                                            }
                                            if ((262144 & i5) == 0) {
                                                j13 = ColorsKt.m814contentColorForek8zF_U(j12, startRestartGroup, (i21 >> 21) & 14);
                                                i21 &= -234881025;
                                            } else {
                                                j13 = j4;
                                            }
                                            if ((i5 & 524288) == 0) {
                                                j14 = j12;
                                                i31 = 6;
                                                j15 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                                i21 &= -1879048193;
                                            } else {
                                                j14 = j12;
                                                i31 = 6;
                                                j15 = j5;
                                            }
                                            long j26 = j15;
                                            if ((i5 & 1048576) == 0) {
                                                j16 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i31).m789getBackground0d7_KjU();
                                                i23 &= -15;
                                            } else {
                                                j16 = j6;
                                            }
                                            if ((2097152 & i5) == 0) {
                                                long m814contentColorForek8zF_U = ColorsKt.m814contentColorForek8zF_U(j16, startRestartGroup, i23 & 14);
                                                shape6 = shape5;
                                                j19 = j26;
                                                i33 = i23 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                                function34 = function35;
                                                j17 = m814contentColorForek8zF_U;
                                                i32 = i30;
                                                f5 = f9;
                                                j18 = j16;
                                                modifier2 = modifier5;
                                                function24 = function27;
                                                f6 = f4;
                                            } else {
                                                i32 = i30;
                                                shape6 = shape5;
                                                j17 = j7;
                                                j18 = j16;
                                                function34 = function35;
                                                modifier2 = modifier5;
                                                i33 = i23;
                                                function24 = function27;
                                                f5 = f9;
                                                f6 = f4;
                                                j19 = j26;
                                            }
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i5 & 4) != 0) {
                                                i6 &= -897;
                                            }
                                            if ((i5 & 256) != 0) {
                                                i6 &= -234881025;
                                            }
                                            if ((i5 & 1024) != 0) {
                                                i21 &= -15;
                                            }
                                            if ((i5 & 2048) != 0) {
                                                i21 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                            }
                                            if ((32768 & i5) != 0) {
                                                i21 &= -458753;
                                            }
                                            if ((i5 & 131072) != 0) {
                                                i21 &= -29360129;
                                            }
                                            if ((262144 & i5) != 0) {
                                                i21 &= -234881025;
                                            }
                                            if ((i5 & 524288) != 0) {
                                                i21 &= -1879048193;
                                            }
                                            if ((i5 & 1048576) != 0) {
                                                i22 &= -15;
                                            }
                                            if ((2097152 & i5) != 0) {
                                                i22 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                            }
                                            modifier2 = modifier;
                                            m882getEnd5ygKITE = i;
                                            z3 = z;
                                            m745getSheetElevationD9Ej5fM = f;
                                            j11 = j;
                                            j10 = j2;
                                            f5 = f2;
                                            function34 = function32;
                                            z4 = z2;
                                            shape6 = shape2;
                                            f6 = f3;
                                            j14 = j3;
                                            j13 = j4;
                                            j19 = j5;
                                            j18 = j6;
                                            j17 = j7;
                                            i32 = i6;
                                            i33 = i22;
                                            m821getLambda1$material_release = function33;
                                            function24 = function2;
                                            function23 = function22;
                                            shape3 = shape;
                                        }
                                        startRestartGroup.endDefaults();
                                        startRestartGroup.startReplaceableGroup(773894976);
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (rememberedValue == companion.getEmpty()) {
                                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                        startRestartGroup.endReplaceableGroup();
                                        mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 != companion.getEmpty()) {
                                            obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                            startRestartGroup.updateRememberedValue(obj);
                                        } else {
                                            obj = rememberedValue2;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableState = (MutableState) obj;
                                        if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            companion2 = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    invoke((SemanticsPropertyReceiver) obj2);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                    if (BottomSheetScaffoldState.this.getBottomSheetState().isCollapsed()) {
                                                        final BottomSheetScaffoldState bottomSheetScaffoldState3 = BottomSheetScaffoldState.this;
                                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            @NotNull
                                                            /* renamed from: invoke */
                                                            public final Boolean mo4828invoke() {
                                                                if (((Boolean) BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange().invoke(BottomSheetValue.Expanded)).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00301(BottomSheetScaffoldState.this, null), 3, null);
                                                                }
                                                                return Boolean.TRUE;
                                                            }

                                                            /* compiled from: BottomSheetScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1", f = "BottomSheetScaffold.kt", l = {301}, m = "invokeSuspend")
                                                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            static final class C00301 extends SuspendLambda implements Function2 {
                                                                final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                C00301(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = bottomSheetScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                @NotNull
                                                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                                    return new C00301(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                @Nullable
                                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                                                    return ((C00301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                @Nullable
                                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
                                                                        this.label = 1;
                                                                        if (bottomSheetState.expand(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, 1, null);
                                                    } else {
                                                        final BottomSheetScaffoldState bottomSheetScaffoldState4 = BottomSheetScaffoldState.this;
                                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function0
                                                            @NotNull
                                                            /* renamed from: invoke */
                                                            public final Boolean mo4828invoke() {
                                                                if (((Boolean) BottomSheetScaffoldState.this.getBottomSheetState().getConfirmStateChange().invoke(BottomSheetValue.Collapsed)).booleanValue()) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(BottomSheetScaffoldState.this, null), 3, null);
                                                                }
                                                                return Boolean.TRUE;
                                                            }

                                                            /* compiled from: BottomSheetScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                            @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1", f = "BottomSheetScaffold.kt", l = {308}, m = "invokeSuspend")
                                                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1$2$1, reason: invalid class name */
                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                                                final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass1(BottomSheetScaffoldState bottomSheetScaffoldState, Continuation continuation) {
                                                                    super(2, continuation);
                                                                    this.$scaffoldState = bottomSheetScaffoldState;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                @NotNull
                                                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                @Nullable
                                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                @Nullable
                                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
                                                                        this.label = 1;
                                                                        if (bottomSheetState.collapse(this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }, 1, null);
                                                    }
                                                }
                                            }, 1, null);
                                        } else {
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            companion2 = Modifier.INSTANCE;
                                        }
                                        final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                        final Function2 function28 = function24;
                                        final Function2 function29 = function23;
                                        final float f10 = f5;
                                        final int i42 = m882getEnd5ygKITE;
                                        final int i43 = i32;
                                        final int i44 = i33;
                                        final int i45 = i21;
                                        final boolean z5 = z3;
                                        final Modifier.Companion companion3 = companion2;
                                        final Shape shape8 = shape3;
                                        final long j27 = j11;
                                        final long j28 = j10;
                                        final float f11 = m745getSheetElevationD9Ej5fM;
                                        final Function3 function36 = m821getLambda1$material_release;
                                        composer3 = composer2;
                                        final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i46) {
                                                if ((i46 & 11) != 2 || !composer4.getSkipping()) {
                                                    State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                                    Function2 function210 = function28;
                                                    Function3 function37 = content;
                                                    final float f12 = mo271toPx0680j_4;
                                                    final BottomSheetScaffoldState bottomSheetScaffoldState4 = BottomSheetScaffoldState.this;
                                                    final boolean z6 = z5;
                                                    final Modifier modifier6 = companion3;
                                                    final float f13 = f10;
                                                    final MutableState<Float> mutableState2 = mutableState;
                                                    final Shape shape9 = shape8;
                                                    final long j29 = j27;
                                                    final long j30 = j28;
                                                    final float f14 = f11;
                                                    final int i47 = i43;
                                                    final int i48 = i45;
                                                    final Function3 function38 = sheetContent;
                                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                                            invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget
                                                        @Composable
                                                        public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                                                            int i51;
                                                            Float m749BottomSheetScaffold_bGncdBI$lambda4;
                                                            Float m749BottomSheetScaffold_bGncdBI$lambda42;
                                                            Map mapOf;
                                                            Modifier m998swipeablepPrIpRY;
                                                            if ((i50 & 14) == 0) {
                                                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                            } else {
                                                                i51 = i50;
                                                            }
                                                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                                m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                                    m998swipeablepPrIpRY = Modifier.INSTANCE;
                                                                } else {
                                                                    if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f12)) {
                                                                        float f15 = i49;
                                                                        m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                        Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f12), BottomSheetValue.Collapsed));
                                                                    } else {
                                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                                    }
                                                                    m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState4.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z6, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        @NotNull
                                                                        public final FixedThreshold invoke(Object obj2, Object obj22) {
                                                                            return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                                                        }
                                                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                                                }
                                                                Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState4.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier6), 0.0f, 1, null), f13, 0.0f, 2, null);
                                                                final MutableState<Float> mutableState3 = mutableState2;
                                                                composer5.startReplaceableGroup(1157296644);
                                                                boolean changed = composer5.changed(mutableState3);
                                                                Object rememberedValue3 = composer5.rememberedValue();
                                                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                            m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                        public final void m754invokeozmzZPI(long j31) {
                                                                            mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j31)));
                                                                        }
                                                                    };
                                                                    composer5.updateRememberedValue(rememberedValue3);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                                Shape shape10 = shape9;
                                                                long j31 = j29;
                                                                long j32 = j30;
                                                                float f16 = f14;
                                                                final Function3 function39 = function38;
                                                                final int i52 = i47;
                                                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                                        invoke((Composer) obj2, ((Number) obj3).intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    @ComposableTarget
                                                                    @Composable
                                                                    public final void invoke(@Nullable Composer composer6, int i53) {
                                                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                            composer6.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        Function3 function310 = Function3.this;
                                                                        int i54 = (i52 << 9) & 7168;
                                                                        composer6.startReplaceableGroup(-483455358);
                                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                                        composer6.startReplaceableGroup(-1323940314);
                                                                        Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                                        LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                        Function0 constructor = companion5.getConstructor();
                                                                        Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                                                        if (composer6.getApplier() == null) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer6.startReusableNode();
                                                                        if (composer6.getInserting()) {
                                                                            composer6.createNode(constructor);
                                                                        } else {
                                                                            composer6.useNode();
                                                                        }
                                                                        composer6.disableReusing();
                                                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                                                        Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                        Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                                        composer6.enableReusing();
                                                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                                                        composer6.startReplaceableGroup(2058660585);
                                                                        composer6.startReplaceableGroup(-1163856341);
                                                                        function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endNode();
                                                                        composer6.endReplaceableGroup();
                                                                        composer6.endReplaceableGroup();
                                                                    }
                                                                });
                                                                int i53 = i47;
                                                                int i54 = i48;
                                                                SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape10, j31, j32, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    });
                                                    Function2 function211 = function29;
                                                    final Function3 function39 = function36;
                                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = BottomSheetScaffoldState.this;
                                                    final int i49 = i43;
                                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer5, int i50) {
                                                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                            } else {
                                                                Function3.this.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                                            }
                                                        }
                                                    });
                                                    float f15 = f10;
                                                    int i50 = i42;
                                                    int i51 = i43;
                                                    BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function37, composableLambda2, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45 << 9) & 458752) | (i51 & 3670016));
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        });
                                        Modifier modifier6 = modifier3;
                                        final Function3 function37 = function34;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                        final boolean z6 = z4;
                                        final Shape shape9 = shape6;
                                        final float f12 = f6;
                                        final long j29 = j14;
                                        final long j30 = j13;
                                        final long j31 = j19;
                                        final int i46 = i21;
                                        int i47 = i33 << 6;
                                        SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i48) {
                                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                                    if (Function3.this == null) {
                                                        composer4.startReplaceableGroup(-249544858);
                                                        composableLambda.invoke(composer4, 6);
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.startReplaceableGroup(-249544821);
                                                    Function3 function38 = Function3.this;
                                                    DrawerState drawerState = bottomSheetScaffoldState4.getDrawerState();
                                                    boolean z7 = z6;
                                                    Shape shape10 = shape9;
                                                    float f13 = f12;
                                                    long j32 = j29;
                                                    long j33 = j30;
                                                    long j34 = j31;
                                                    Function2 function210 = composableLambda;
                                                    int i49 = i46;
                                                    DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z7, shape10, f13, j32, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                                    composer4.endReplaceableGroup();
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, (i47 & 7168) | (i47 & 896) | 1572864, 50);
                                        f7 = f5;
                                        shape7 = shape6;
                                        j20 = j11;
                                        j21 = j19;
                                        j22 = j17;
                                        function25 = function24;
                                        modifier4 = modifier6;
                                        j23 = j10;
                                        f8 = f6;
                                        j24 = j14;
                                        j25 = j18;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier4 = modifier;
                                        function25 = function2;
                                        function23 = function22;
                                        m745getSheetElevationD9Ej5fM = f;
                                        j20 = j;
                                        j23 = j2;
                                        f7 = f2;
                                        function34 = function32;
                                        z4 = z2;
                                        shape7 = shape2;
                                        f8 = f3;
                                        j24 = j3;
                                        j13 = j4;
                                        j21 = j5;
                                        j25 = j6;
                                        composer3 = startRestartGroup;
                                        j22 = j8;
                                        m821getLambda1$material_release = function33;
                                        m882getEnd5ygKITE = i;
                                        z3 = z;
                                        shape3 = shape;
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        return;
                                    }
                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState2;
                                    final Shape shape10 = shape3;
                                    final float f13 = m745getSheetElevationD9Ej5fM;
                                    final boolean z7 = z4;
                                    final long j32 = j13;
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable Composer composer4, int i48) {
                                            BottomSheetScaffoldKt.m747BottomSheetScaffoldbGncdBI(Function3.this, modifier4, bottomSheetScaffoldState5, function25, m821getLambda1$material_release, function23, m882getEnd5ygKITE, z3, shape10, f13, j20, j23, f7, function34, z7, shape7, f8, j24, j32, j21, j25, j22, content, composer4, i2 | 1, i3, i4, i5);
                                        }
                                    });
                                    return;
                                }
                                i19 = i18;
                                if ((i3 & 458752) == 0) {
                                }
                                i20 = i5 & 65536;
                                if (i20 == 0) {
                                }
                                if ((i3 & 29360128) == 0) {
                                }
                                if ((i3 & 234881024) == 0) {
                                }
                                if ((i3 & 1879048192) == 0) {
                                }
                                i21 = i15;
                                if ((i4 & 14) != 0) {
                                }
                                if ((i4 & 112) != 0) {
                                }
                                if ((i5 & 4194304) == 0) {
                                }
                                if ((1533916891 & i6) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0) {
                                }
                                if (i36 == 0) {
                                }
                                if ((i5 & 4) == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if ((i5 & 256) == 0) {
                                }
                                if (i28 == 0) {
                                }
                                if ((i5 & 1024) == 0) {
                                }
                                Function2 function272 = function26;
                                if ((i5 & 2048) == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                float f92 = m746getSheetPeekHeightD9Ej5fM;
                                if ((i5 & 32768) == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if ((i5 & 131072) == 0) {
                                }
                                if ((262144 & i5) == 0) {
                                }
                                if ((i5 & 524288) == 0) {
                                }
                                long j262 = j15;
                                if ((i5 & 1048576) == 0) {
                                }
                                if ((2097152 & i5) == 0) {
                                }
                                startRestartGroup.endDefaults();
                                startRestartGroup.startReplaceableGroup(773894976);
                                startRestartGroup.startReplaceableGroup(-492369756);
                                rememberedValue = startRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (rememberedValue == companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                startRestartGroup.endReplaceableGroup();
                                mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
                                startRestartGroup.startReplaceableGroup(-492369756);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 != companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableState = (MutableState) obj;
                                if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                                }
                                final BottomSheetScaffoldState bottomSheetScaffoldState32 = bottomSheetScaffoldState2;
                                final Function2 function282 = function24;
                                final Function2 function292 = function23;
                                final float f102 = f5;
                                final int i422 = m882getEnd5ygKITE;
                                final int i432 = i32;
                                final int i442 = i33;
                                final int i452 = i21;
                                final boolean z52 = z3;
                                final Modifier companion32 = companion2;
                                final Shape shape82 = shape3;
                                final long j272 = j11;
                                final long j282 = j10;
                                final float f112 = m745getSheetElevationD9Ej5fM;
                                final Function3 function362 = m821getLambda1$material_release;
                                composer3 = composer2;
                                final Function2 composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                        invoke((Composer) obj2, ((Number) obj3).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i462) {
                                        if ((i462 & 11) != 2 || !composer4.getSkipping()) {
                                            State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                            BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                            Function2 function210 = function282;
                                            Function3 function372 = content;
                                            final float f122 = mo271toPx0680j_4;
                                            final BottomSheetScaffoldState bottomSheetScaffoldState42 = BottomSheetScaffoldState.this;
                                            final boolean z62 = z52;
                                            final Modifier modifier62 = companion32;
                                            final float f132 = f102;
                                            final MutableState<Float> mutableState2 = mutableState;
                                            final Shape shape92 = shape82;
                                            final long j292 = j272;
                                            final long j302 = j282;
                                            final float f14 = f112;
                                            final int i472 = i432;
                                            final int i48 = i452;
                                            final Function3 function38 = sheetContent;
                                            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget
                                                @Composable
                                                public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                                                    int i51;
                                                    Float m749BottomSheetScaffold_bGncdBI$lambda4;
                                                    Float m749BottomSheetScaffold_bGncdBI$lambda42;
                                                    Map mapOf;
                                                    Modifier m998swipeablepPrIpRY;
                                                    if ((i50 & 14) == 0) {
                                                        i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                    } else {
                                                        i51 = i50;
                                                    }
                                                    if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                        m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                        if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                            m998swipeablepPrIpRY = Modifier.INSTANCE;
                                                        } else {
                                                            if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f122)) {
                                                                float f15 = i49;
                                                                m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                                Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f122), BottomSheetValue.Collapsed));
                                                            } else {
                                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                            }
                                                            m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState42.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z62, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                                @Override // kotlin.jvm.functions.Function2
                                                                @NotNull
                                                                public final FixedThreshold invoke(Object obj2, Object obj22) {
                                                                    return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                                                }
                                                            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                                        }
                                                        Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState42.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier62), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                        final MutableState<Float> mutableState3 = mutableState2;
                                                        composer5.startReplaceableGroup(1157296644);
                                                        boolean changed = composer5.changed(mutableState3);
                                                        Object rememberedValue3 = composer5.rememberedValue();
                                                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                    m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                public final void m754invokeozmzZPI(long j312) {
                                                                    mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j312)));
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(rememberedValue3);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                        Shape shape102 = shape92;
                                                        long j312 = j292;
                                                        long j322 = j302;
                                                        float f16 = f14;
                                                        final Function3 function39 = function38;
                                                        final int i52 = i472;
                                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            @ComposableTarget
                                                            @Composable
                                                            public final void invoke(@Nullable Composer composer6, int i53) {
                                                                if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                    composer6.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                Function3 function310 = Function3.this;
                                                                int i54 = (i52 << 9) & 7168;
                                                                composer6.startReplaceableGroup(-483455358);
                                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                                composer6.startReplaceableGroup(-1323940314);
                                                                Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                                LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                Function0 constructor = companion5.getConstructor();
                                                                Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                                                if (composer6.getApplier() == null) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer6.startReusableNode();
                                                                if (composer6.getInserting()) {
                                                                    composer6.createNode(constructor);
                                                                } else {
                                                                    composer6.useNode();
                                                                }
                                                                composer6.disableReusing();
                                                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                                                Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                                Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                                composer6.enableReusing();
                                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                                                composer6.startReplaceableGroup(2058660585);
                                                                composer6.startReplaceableGroup(-1163856341);
                                                                function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endNode();
                                                                composer6.endReplaceableGroup();
                                                                composer6.endReplaceableGroup();
                                                            }
                                                        });
                                                        int i53 = i472;
                                                        int i54 = i48;
                                                        SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape102, j312, j322, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            });
                                            Function2 function211 = function292;
                                            final Function3 function39 = function362;
                                            final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                            final int i49 = i432;
                                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i50) {
                                                    if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                    } else {
                                                        Function3.this.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                                    }
                                                }
                                            });
                                            float f15 = f102;
                                            int i50 = i422;
                                            int i51 = i432;
                                            BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function372, composableLambda22, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452 << 9) & 458752) | (i51 & 3670016));
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                Modifier modifier62 = modifier3;
                                final Function3 function372 = function34;
                                final BottomSheetScaffoldState bottomSheetScaffoldState42 = bottomSheetScaffoldState2;
                                final boolean z62 = z4;
                                final Shape shape92 = shape6;
                                final float f122 = f6;
                                final long j292 = j14;
                                final long j302 = j13;
                                final long j312 = j19;
                                final int i462 = i21;
                                int i472 = i33 << 6;
                                SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier62, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                        invoke((Composer) obj2, ((Number) obj3).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i48) {
                                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                            if (Function3.this == null) {
                                                composer4.startReplaceableGroup(-249544858);
                                                composableLambda2.invoke(composer4, 6);
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.startReplaceableGroup(-249544821);
                                            Function3 function38 = Function3.this;
                                            DrawerState drawerState = bottomSheetScaffoldState42.getDrawerState();
                                            boolean z72 = z62;
                                            Shape shape102 = shape92;
                                            float f132 = f122;
                                            long j322 = j292;
                                            long j33 = j302;
                                            long j34 = j312;
                                            Function2 function210 = composableLambda2;
                                            int i49 = i462;
                                            DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape102, f132, j322, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, (i472 & 7168) | (i472 & 896) | 1572864, 50);
                                f7 = f5;
                                shape7 = shape6;
                                j20 = j11;
                                j21 = j19;
                                j22 = j17;
                                function25 = function24;
                                modifier4 = modifier62;
                                j23 = j10;
                                f8 = f6;
                                j24 = j14;
                                j25 = j18;
                                endRestartGroup = composer3.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i18 = i5 & 16384;
                            if (i18 != 0) {
                            }
                            i19 = i18;
                            if ((i3 & 458752) == 0) {
                            }
                            i20 = i5 & 65536;
                            if (i20 == 0) {
                            }
                            if ((i3 & 29360128) == 0) {
                            }
                            if ((i3 & 234881024) == 0) {
                            }
                            if ((i3 & 1879048192) == 0) {
                            }
                            i21 = i15;
                            if ((i4 & 14) != 0) {
                            }
                            if ((i4 & 112) != 0) {
                            }
                            if ((i5 & 4194304) == 0) {
                            }
                            if ((1533916891 & i6) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i36 == 0) {
                            }
                            if ((i5 & 4) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if ((i5 & 256) == 0) {
                            }
                            if (i28 == 0) {
                            }
                            if ((i5 & 1024) == 0) {
                            }
                            Function2 function2722 = function26;
                            if ((i5 & 2048) == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i27 == 0) {
                            }
                            float f922 = m746getSheetPeekHeightD9Ej5fM;
                            if ((i5 & 32768) == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if ((i5 & 131072) == 0) {
                            }
                            if ((262144 & i5) == 0) {
                            }
                            if ((i5 & 524288) == 0) {
                            }
                            long j2622 = j15;
                            if ((i5 & 1048576) == 0) {
                            }
                            if ((2097152 & i5) == 0) {
                            }
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(773894976);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue = startRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (rememberedValue == companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 != companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) obj;
                            if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                            }
                            final BottomSheetScaffoldState bottomSheetScaffoldState322 = bottomSheetScaffoldState2;
                            final Function2 function2822 = function24;
                            final Function2 function2922 = function23;
                            final float f1022 = f5;
                            final int i4222 = m882getEnd5ygKITE;
                            final int i4322 = i32;
                            final int i4422 = i33;
                            final int i4522 = i21;
                            final boolean z522 = z3;
                            final Modifier companion322 = companion2;
                            final Shape shape822 = shape3;
                            final long j2722 = j11;
                            final long j2822 = j10;
                            final float f1122 = m745getSheetElevationD9Ej5fM;
                            final Function3 function3622 = m821getLambda1$material_release;
                            composer3 = composer2;
                            final Function2 composableLambda22 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i4622) {
                                    if ((i4622 & 11) != 2 || !composer4.getSkipping()) {
                                        State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                        BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                        Function2 function210 = function2822;
                                        Function3 function3722 = content;
                                        final float f1222 = mo271toPx0680j_4;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState422 = BottomSheetScaffoldState.this;
                                        final boolean z622 = z522;
                                        final Modifier modifier622 = companion322;
                                        final float f132 = f1022;
                                        final MutableState<Float> mutableState2 = mutableState;
                                        final Shape shape922 = shape822;
                                        final long j2922 = j2722;
                                        final long j3022 = j2822;
                                        final float f14 = f1122;
                                        final int i4722 = i4322;
                                        final int i48 = i4522;
                                        final Function3 function38 = sheetContent;
                                        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                                invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget
                                            @Composable
                                            public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                                                int i51;
                                                Float m749BottomSheetScaffold_bGncdBI$lambda4;
                                                Float m749BottomSheetScaffold_bGncdBI$lambda42;
                                                Map mapOf;
                                                Modifier m998swipeablepPrIpRY;
                                                if ((i50 & 14) == 0) {
                                                    i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                                } else {
                                                    i51 = i50;
                                                }
                                                if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                    m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                    if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                        m998swipeablepPrIpRY = Modifier.INSTANCE;
                                                    } else {
                                                        if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f1222)) {
                                                            float f15 = i49;
                                                            m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                            Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f1222), BottomSheetValue.Collapsed));
                                                        } else {
                                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                        }
                                                        m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState422.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z622, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            @NotNull
                                                            public final FixedThreshold invoke(Object obj2, Object obj22) {
                                                                return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                                            }
                                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                                    }
                                                    Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState422.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier622), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                    final MutableState<Float> mutableState3 = mutableState2;
                                                    composer5.startReplaceableGroup(1157296644);
                                                    boolean changed = composer5.changed(mutableState3);
                                                    Object rememberedValue3 = composer5.rememberedValue();
                                                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                            public final void m754invokeozmzZPI(long j3122) {
                                                                mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j3122)));
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(rememberedValue3);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                    Shape shape102 = shape922;
                                                    long j3122 = j2922;
                                                    long j322 = j3022;
                                                    float f16 = f14;
                                                    final Function3 function39 = function38;
                                                    final int i52 = i4722;
                                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer6, int i53) {
                                                            if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                                composer6.skipToGroupEnd();
                                                                return;
                                                            }
                                                            Function3 function310 = Function3.this;
                                                            int i54 = (i52 << 9) & 7168;
                                                            composer6.startReplaceableGroup(-483455358);
                                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                            composer6.startReplaceableGroup(-1323940314);
                                                            Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                            LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                            Function0 constructor = companion5.getConstructor();
                                                            Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                                            if (composer6.getApplier() == null) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer6.startReusableNode();
                                                            if (composer6.getInserting()) {
                                                                composer6.createNode(constructor);
                                                            } else {
                                                                composer6.useNode();
                                                            }
                                                            composer6.disableReusing();
                                                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                            Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                            composer6.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                                            composer6.startReplaceableGroup(2058660585);
                                                            composer6.startReplaceableGroup(-1163856341);
                                                            function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endNode();
                                                            composer6.endReplaceableGroup();
                                                            composer6.endReplaceableGroup();
                                                        }
                                                    });
                                                    int i53 = i4722;
                                                    int i54 = i48;
                                                    SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape102, j3122, j322, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        });
                                        Function2 function211 = function2922;
                                        final Function3 function39 = function3622;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                        final int i49 = i4322;
                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i50) {
                                                if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                } else {
                                                    Function3.this.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                                }
                                            }
                                        });
                                        float f15 = f1022;
                                        int i50 = i4222;
                                        int i51 = i4322;
                                        BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function3722, composableLambda222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i4422 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i4522 << 9) & 458752) | (i51 & 3670016));
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                            Modifier modifier622 = modifier3;
                            final Function3 function3722 = function34;
                            final BottomSheetScaffoldState bottomSheetScaffoldState422 = bottomSheetScaffoldState2;
                            final boolean z622 = z4;
                            final Shape shape922 = shape6;
                            final float f1222 = f6;
                            final long j2922 = j14;
                            final long j3022 = j13;
                            final long j3122 = j19;
                            final int i4622 = i21;
                            int i4722 = i33 << 6;
                            SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier622, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i48) {
                                    if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                        if (Function3.this == null) {
                                            composer4.startReplaceableGroup(-249544858);
                                            composableLambda22.invoke(composer4, 6);
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.startReplaceableGroup(-249544821);
                                        Function3 function38 = Function3.this;
                                        DrawerState drawerState = bottomSheetScaffoldState422.getDrawerState();
                                        boolean z72 = z622;
                                        Shape shape102 = shape922;
                                        float f132 = f1222;
                                        long j322 = j2922;
                                        long j33 = j3022;
                                        long j34 = j3122;
                                        Function2 function210 = composableLambda22;
                                        int i49 = i4622;
                                        DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape102, f132, j322, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, (i4722 & 7168) | (i4722 & 896) | 1572864, 50);
                            f7 = f5;
                            shape7 = shape6;
                            j20 = j11;
                            j21 = j19;
                            j22 = j17;
                            function25 = function24;
                            modifier4 = modifier622;
                            j23 = j10;
                            f8 = f6;
                            j24 = j14;
                            j25 = j18;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i17 = i5 & 8192;
                        if (i17 == 0) {
                        }
                        i18 = i5 & 16384;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        if ((i3 & 458752) == 0) {
                        }
                        i20 = i5 & 65536;
                        if (i20 == 0) {
                        }
                        if ((i3 & 29360128) == 0) {
                        }
                        if ((i3 & 234881024) == 0) {
                        }
                        if ((i3 & 1879048192) == 0) {
                        }
                        i21 = i15;
                        if ((i4 & 14) != 0) {
                        }
                        if ((i4 & 112) != 0) {
                        }
                        if ((i5 & 4194304) == 0) {
                        }
                        if ((1533916891 & i6) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i36 == 0) {
                        }
                        if ((i5 & 4) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if ((i5 & 1024) == 0) {
                        }
                        Function2 function27222 = function26;
                        if ((i5 & 2048) == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        float f9222 = m746getSheetPeekHeightD9Ej5fM;
                        if ((i5 & 32768) == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if ((i5 & 131072) == 0) {
                        }
                        if ((262144 & i5) == 0) {
                        }
                        if ((i5 & 524288) == 0) {
                        }
                        long j26222 = j15;
                        if ((i5 & 1048576) == 0) {
                        }
                        if ((2097152 & i5) == 0) {
                        }
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(773894976);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 != companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) obj;
                        if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                        }
                        final BottomSheetScaffoldState bottomSheetScaffoldState3222 = bottomSheetScaffoldState2;
                        final Function2 function28222 = function24;
                        final Function2 function29222 = function23;
                        final float f10222 = f5;
                        final int i42222 = m882getEnd5ygKITE;
                        final int i43222 = i32;
                        final int i44222 = i33;
                        final int i45222 = i21;
                        final boolean z5222 = z3;
                        final Modifier companion3222 = companion2;
                        final Shape shape8222 = shape3;
                        final long j27222 = j11;
                        final long j28222 = j10;
                        final float f11222 = m745getSheetElevationD9Ej5fM;
                        final Function3 function36222 = m821getLambda1$material_release;
                        composer3 = composer2;
                        final Function2 composableLambda222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i46222) {
                                if ((i46222 & 11) != 2 || !composer4.getSkipping()) {
                                    State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                    Function2 function210 = function28222;
                                    Function3 function37222 = content;
                                    final float f12222 = mo271toPx0680j_4;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState4222 = BottomSheetScaffoldState.this;
                                    final boolean z6222 = z5222;
                                    final Modifier modifier6222 = companion3222;
                                    final float f132 = f10222;
                                    final MutableState<Float> mutableState2 = mutableState;
                                    final Shape shape9222 = shape8222;
                                    final long j29222 = j27222;
                                    final long j30222 = j28222;
                                    final float f14 = f11222;
                                    final int i47222 = i43222;
                                    final int i48 = i45222;
                                    final Function3 function38 = sheetContent;
                                    ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                            invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget
                                        @Composable
                                        public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                                            int i51;
                                            Float m749BottomSheetScaffold_bGncdBI$lambda4;
                                            Float m749BottomSheetScaffold_bGncdBI$lambda42;
                                            Map mapOf;
                                            Modifier m998swipeablepPrIpRY;
                                            if ((i50 & 14) == 0) {
                                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                            } else {
                                                i51 = i50;
                                            }
                                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                                m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                    m998swipeablepPrIpRY = Modifier.INSTANCE;
                                                } else {
                                                    if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f12222)) {
                                                        float f15 = i49;
                                                        m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                        Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f12222), BottomSheetValue.Collapsed));
                                                    } else {
                                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                    }
                                                    m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState4222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z6222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        @NotNull
                                                        public final FixedThreshold invoke(Object obj2, Object obj22) {
                                                            return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                                        }
                                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                                }
                                                Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState4222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier6222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                                final MutableState<Float> mutableState3 = mutableState2;
                                                composer5.startReplaceableGroup(1157296644);
                                                boolean changed = composer5.changed(mutableState3);
                                                Object rememberedValue3 = composer5.rememberedValue();
                                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                            m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                        public final void m754invokeozmzZPI(long j31222) {
                                                            mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j31222)));
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(rememberedValue3);
                                                }
                                                composer5.endReplaceableGroup();
                                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                                Shape shape102 = shape9222;
                                                long j31222 = j29222;
                                                long j322 = j30222;
                                                float f16 = f14;
                                                final Function3 function39 = function38;
                                                final int i52 = i47222;
                                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                        invoke((Composer) obj2, ((Number) obj3).intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer6, int i53) {
                                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                            composer6.skipToGroupEnd();
                                                            return;
                                                        }
                                                        Function3 function310 = Function3.this;
                                                        int i54 = (i52 << 9) & 7168;
                                                        composer6.startReplaceableGroup(-483455358);
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                        composer6.startReplaceableGroup(-1323940314);
                                                        Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                        LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                        Function0 constructor = companion5.getConstructor();
                                                        Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                                        if (composer6.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        composer6.disableReusing();
                                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                                        Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                        Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                        composer6.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                                        composer6.startReplaceableGroup(2058660585);
                                                        composer6.startReplaceableGroup(-1163856341);
                                                        function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endNode();
                                                        composer6.endReplaceableGroup();
                                                        composer6.endReplaceableGroup();
                                                    }
                                                });
                                                int i53 = i47222;
                                                int i54 = i48;
                                                SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape102, j31222, j322, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    });
                                    Function2 function211 = function29222;
                                    final Function3 function39 = function36222;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                    final int i49 = i43222;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget
                                        @Composable
                                        public final void invoke(@Nullable Composer composer5, int i50) {
                                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                            } else {
                                                Function3.this.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                            }
                                        }
                                    });
                                    float f15 = f10222;
                                    int i50 = i42222;
                                    int i51 = i43222;
                                    BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function37222, composableLambda2222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45222 << 9) & 458752) | (i51 & 3670016));
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        Modifier modifier6222 = modifier3;
                        final Function3 function37222 = function34;
                        final BottomSheetScaffoldState bottomSheetScaffoldState4222 = bottomSheetScaffoldState2;
                        final boolean z6222 = z4;
                        final Shape shape9222 = shape6;
                        final float f12222 = f6;
                        final long j29222 = j14;
                        final long j30222 = j13;
                        final long j31222 = j19;
                        final int i46222 = i21;
                        int i47222 = i33 << 6;
                        SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier6222, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer4, int i48) {
                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                    if (Function3.this == null) {
                                        composer4.startReplaceableGroup(-249544858);
                                        composableLambda222.invoke(composer4, 6);
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.startReplaceableGroup(-249544821);
                                    Function3 function38 = Function3.this;
                                    DrawerState drawerState = bottomSheetScaffoldState4222.getDrawerState();
                                    boolean z72 = z6222;
                                    Shape shape102 = shape9222;
                                    float f132 = f12222;
                                    long j322 = j29222;
                                    long j33 = j30222;
                                    long j34 = j31222;
                                    Function2 function210 = composableLambda222;
                                    int i49 = i46222;
                                    DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape102, f132, j322, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, (i47222 & 7168) | (i47222 & 896) | 1572864, 50);
                        f7 = f5;
                        shape7 = shape6;
                        j20 = j11;
                        j21 = j19;
                        j22 = j17;
                        function25 = function24;
                        modifier4 = modifier6222;
                        j23 = j10;
                        f8 = f6;
                        j24 = j14;
                        j25 = j18;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i14 = i13;
                    if ((i3 & 14) == 0) {
                    }
                    if ((i3 & 112) == 0) {
                    }
                    i16 = i5 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                    }
                    i18 = i5 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    if ((i3 & 458752) == 0) {
                    }
                    i20 = i5 & 65536;
                    if (i20 == 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i3 & 1879048192) == 0) {
                    }
                    i21 = i15;
                    if ((i4 & 14) != 0) {
                    }
                    if ((i4 & 112) != 0) {
                    }
                    if ((i5 & 4194304) == 0) {
                    }
                    if ((1533916891 & i6) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i36 == 0) {
                    }
                    if ((i5 & 4) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if ((i5 & 256) == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if ((i5 & 1024) == 0) {
                    }
                    Function2 function272222 = function26;
                    if ((i5 & 2048) == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    float f92222 = m746getSheetPeekHeightD9Ej5fM;
                    if ((i5 & 32768) == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if ((i5 & 131072) == 0) {
                    }
                    if ((262144 & i5) == 0) {
                    }
                    if ((i5 & 524288) == 0) {
                    }
                    long j262222 = j15;
                    if ((i5 & 1048576) == 0) {
                    }
                    if ((2097152 & i5) == 0) {
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 != companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) obj;
                    if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                    }
                    final BottomSheetScaffoldState bottomSheetScaffoldState32222 = bottomSheetScaffoldState2;
                    final Function2 function282222 = function24;
                    final Function2 function292222 = function23;
                    final float f102222 = f5;
                    final int i422222 = m882getEnd5ygKITE;
                    final int i432222 = i32;
                    final int i442222 = i33;
                    final int i452222 = i21;
                    final boolean z52222 = z3;
                    final Modifier companion32222 = companion2;
                    final Shape shape82222 = shape3;
                    final long j272222 = j11;
                    final long j282222 = j10;
                    final float f112222 = m745getSheetElevationD9Ej5fM;
                    final Function3 function362222 = m821getLambda1$material_release;
                    composer3 = composer2;
                    final Function2 composableLambda2222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i462222) {
                            if ((i462222 & 11) != 2 || !composer4.getSkipping()) {
                                State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                                BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                                Function2 function210 = function282222;
                                Function3 function372222 = content;
                                final float f122222 = mo271toPx0680j_4;
                                final BottomSheetScaffoldState bottomSheetScaffoldState42222 = BottomSheetScaffoldState.this;
                                final boolean z62222 = z52222;
                                final Modifier modifier62222 = companion32222;
                                final float f132 = f102222;
                                final MutableState<Float> mutableState2 = mutableState;
                                final Shape shape92222 = shape82222;
                                final long j292222 = j272222;
                                final long j302222 = j282222;
                                final float f14 = f112222;
                                final int i472222 = i432222;
                                final int i48 = i452222;
                                final Function3 function38 = sheetContent;
                                ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                        invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                                        int i51;
                                        Float m749BottomSheetScaffold_bGncdBI$lambda4;
                                        Float m749BottomSheetScaffold_bGncdBI$lambda42;
                                        Map mapOf;
                                        Modifier m998swipeablepPrIpRY;
                                        if ((i50 & 14) == 0) {
                                            i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                        } else {
                                            i51 = i50;
                                        }
                                        if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                            m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                            if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                                m998swipeablepPrIpRY = Modifier.INSTANCE;
                                            } else {
                                                if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f122222)) {
                                                    float f15 = i49;
                                                    m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                    Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f122222), BottomSheetValue.Collapsed));
                                                } else {
                                                    mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                                }
                                                m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState42222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z62222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    @NotNull
                                                    public final FixedThreshold invoke(Object obj2, Object obj22) {
                                                        return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                                    }
                                                } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                            }
                                            Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState42222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier62222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                            final MutableState<Float> mutableState3 = mutableState2;
                                            composer5.startReplaceableGroup(1157296644);
                                            boolean changed = composer5.changed(mutableState3);
                                            Object rememberedValue3 = composer5.rememberedValue();
                                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                    public final void m754invokeozmzZPI(long j312222) {
                                                        mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j312222)));
                                                    }
                                                };
                                                composer5.updateRememberedValue(rememberedValue3);
                                            }
                                            composer5.endReplaceableGroup();
                                            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                            Shape shape102 = shape92222;
                                            long j312222 = j292222;
                                            long j322 = j302222;
                                            float f16 = f14;
                                            final Function3 function39 = function38;
                                            final int i52 = i472222;
                                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget
                                                @Composable
                                                public final void invoke(@Nullable Composer composer6, int i53) {
                                                    if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                        composer6.skipToGroupEnd();
                                                        return;
                                                    }
                                                    Function3 function310 = Function3.this;
                                                    int i54 = (i52 << 9) & 7168;
                                                    composer6.startReplaceableGroup(-483455358);
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                    composer6.startReplaceableGroup(-1323940314);
                                                    Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                    Function0 constructor = companion5.getConstructor();
                                                    Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                                    if (composer6.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer6.startReusableNode();
                                                    if (composer6.getInserting()) {
                                                        composer6.createNode(constructor);
                                                    } else {
                                                        composer6.useNode();
                                                    }
                                                    composer6.disableReusing();
                                                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                                    Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                    Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                    composer6.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                                    composer6.startReplaceableGroup(2058660585);
                                                    composer6.startReplaceableGroup(-1163856341);
                                                    function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                    composer6.endReplaceableGroup();
                                                    composer6.endReplaceableGroup();
                                                    composer6.endNode();
                                                    composer6.endReplaceableGroup();
                                                    composer6.endReplaceableGroup();
                                                }
                                            });
                                            int i53 = i472222;
                                            int i54 = i48;
                                            SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape102, j312222, j322, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                });
                                Function2 function211 = function292222;
                                final Function3 function39 = function362222;
                                final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                                final int i49 = i432222;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                        invoke((Composer) obj2, ((Number) obj3).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i50) {
                                        if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                        } else {
                                            Function3.this.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                        }
                                    }
                                });
                                float f15 = f102222;
                                int i50 = i422222;
                                int i51 = i432222;
                                BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function372222, composableLambda22222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452222 << 9) & 458752) | (i51 & 3670016));
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    });
                    Modifier modifier62222 = modifier3;
                    final Function3 function372222 = function34;
                    final BottomSheetScaffoldState bottomSheetScaffoldState42222 = bottomSheetScaffoldState2;
                    final boolean z62222 = z4;
                    final Shape shape92222 = shape6;
                    final float f122222 = f6;
                    final long j292222 = j14;
                    final long j302222 = j13;
                    final long j312222 = j19;
                    final int i462222 = i21;
                    int i472222 = i33 << 6;
                    SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier62222, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer4, int i48) {
                            if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                if (Function3.this == null) {
                                    composer4.startReplaceableGroup(-249544858);
                                    composableLambda2222.invoke(composer4, 6);
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.startReplaceableGroup(-249544821);
                                Function3 function38 = Function3.this;
                                DrawerState drawerState = bottomSheetScaffoldState42222.getDrawerState();
                                boolean z72 = z62222;
                                Shape shape102 = shape92222;
                                float f132 = f122222;
                                long j322 = j292222;
                                long j33 = j302222;
                                long j34 = j312222;
                                Function2 function210 = composableLambda2222;
                                int i49 = i462222;
                                DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape102, f132, j322, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, (i472222 & 7168) | (i472222 & 896) | 1572864, 50);
                    f7 = f5;
                    shape7 = shape6;
                    j20 = j11;
                    j21 = j19;
                    j22 = j17;
                    function25 = function24;
                    modifier4 = modifier62222;
                    j23 = j10;
                    f8 = f6;
                    j24 = j14;
                    j25 = j18;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i11;
                if ((i2 & 234881024) == 0) {
                }
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i3 & 14) == 0) {
                }
                if ((i3 & 112) == 0) {
                }
                i16 = i5 & 4096;
                if (i16 != 0) {
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                }
                i19 = i18;
                if ((i3 & 458752) == 0) {
                }
                i20 = i5 & 65536;
                if (i20 == 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i3 & 1879048192) == 0) {
                }
                i21 = i15;
                if ((i4 & 14) != 0) {
                }
                if ((i4 & 112) != 0) {
                }
                if ((i5 & 4194304) == 0) {
                }
                if ((1533916891 & i6) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i36 == 0) {
                }
                if ((i5 & 4) == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i26 == 0) {
                }
                if ((i5 & 256) == 0) {
                }
                if (i28 == 0) {
                }
                if ((i5 & 1024) == 0) {
                }
                Function2 function2722222 = function26;
                if ((i5 & 2048) == 0) {
                }
                if (i16 == 0) {
                }
                if (i25 == 0) {
                }
                if (i27 == 0) {
                }
                float f922222 = m746getSheetPeekHeightD9Ej5fM;
                if ((i5 & 32768) == 0) {
                }
                if (i20 == 0) {
                }
                if ((i5 & 131072) == 0) {
                }
                if ((262144 & i5) == 0) {
                }
                if ((i5 & 524288) == 0) {
                }
                long j2622222 = j15;
                if ((i5 & 1048576) == 0) {
                }
                if ((2097152 & i5) == 0) {
                }
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 != companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) obj;
                if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
                }
                final BottomSheetScaffoldState bottomSheetScaffoldState322222 = bottomSheetScaffoldState2;
                final Function2 function2822222 = function24;
                final Function2 function2922222 = function23;
                final float f1022222 = f5;
                final int i4222222 = m882getEnd5ygKITE;
                final int i4322222 = i32;
                final int i4422222 = i33;
                final int i4522222 = i21;
                final boolean z522222 = z3;
                final Modifier companion322222 = companion2;
                final Shape shape822222 = shape3;
                final long j2722222 = j11;
                final long j2822222 = j10;
                final float f1122222 = m745getSheetElevationD9Ej5fM;
                final Function3 function3622222 = m821getLambda1$material_release;
                composer3 = composer2;
                final Function2 composableLambda22222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer4, int i4622222) {
                        if ((i4622222 & 11) != 2 || !composer4.getSkipping()) {
                            State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                            BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                            Function2 function210 = function2822222;
                            Function3 function3722222 = content;
                            final float f1222222 = mo271toPx0680j_4;
                            final BottomSheetScaffoldState bottomSheetScaffoldState422222 = BottomSheetScaffoldState.this;
                            final boolean z622222 = z522222;
                            final Modifier modifier622222 = companion322222;
                            final float f132 = f1022222;
                            final MutableState<Float> mutableState2 = mutableState;
                            final Shape shape922222 = shape822222;
                            final long j2922222 = j2722222;
                            final long j3022222 = j2822222;
                            final float f14 = f1122222;
                            final int i4722222 = i4322222;
                            final int i48 = i4522222;
                            final Function3 function38 = sheetContent;
                            ComposableLambda composableLambda222222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                    invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                                    int i51;
                                    Float m749BottomSheetScaffold_bGncdBI$lambda4;
                                    Float m749BottomSheetScaffold_bGncdBI$lambda42;
                                    Map mapOf;
                                    Modifier m998swipeablepPrIpRY;
                                    if ((i50 & 14) == 0) {
                                        i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                    } else {
                                        i51 = i50;
                                    }
                                    if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                        m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                        if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                            m998swipeablepPrIpRY = Modifier.INSTANCE;
                                        } else {
                                            if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f1222222)) {
                                                float f15 = i49;
                                                m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                                Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f1222222), BottomSheetValue.Collapsed));
                                            } else {
                                                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                            }
                                            m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState422222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z622222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                @Override // kotlin.jvm.functions.Function2
                                                @NotNull
                                                public final FixedThreshold invoke(Object obj2, Object obj22) {
                                                    return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                                }
                                            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                        }
                                        Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState422222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier622222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                        final MutableState<Float> mutableState3 = mutableState2;
                                        composer5.startReplaceableGroup(1157296644);
                                        boolean changed = composer5.changed(mutableState3);
                                        Object rememberedValue3 = composer5.rememberedValue();
                                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                public final void m754invokeozmzZPI(long j3122222) {
                                                    mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j3122222)));
                                                }
                                            };
                                            composer5.updateRememberedValue(rememberedValue3);
                                        }
                                        composer5.endReplaceableGroup();
                                        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                        Shape shape102 = shape922222;
                                        long j3122222 = j2922222;
                                        long j322 = j3022222;
                                        float f16 = f14;
                                        final Function3 function39 = function38;
                                        final int i52 = i4722222;
                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget
                                            @Composable
                                            public final void invoke(@Nullable Composer composer6, int i53) {
                                                if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                Function3 function310 = Function3.this;
                                                int i54 = (i52 << 9) & 7168;
                                                composer6.startReplaceableGroup(-483455358);
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                                composer6.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion5.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                                if (composer6.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                composer6.disableReusing();
                                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                                Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                composer6.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                                composer6.startReplaceableGroup(2058660585);
                                                composer6.startReplaceableGroup(-1163856341);
                                                function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                                composer6.endNode();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                            }
                                        });
                                        int i53 = i4722222;
                                        int i54 = i48;
                                        SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape102, j3122222, j322, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            });
                            Function2 function211 = function2922222;
                            final Function3 function39 = function3622222;
                            final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                            final int i49 = i4322222;
                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@Nullable Composer composer5, int i50) {
                                    if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                    } else {
                                        Function3.this.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                    }
                                }
                            });
                            float f15 = f1022222;
                            int i50 = i4222222;
                            int i51 = i4322222;
                            BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function3722222, composableLambda222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i4422222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i4522222 << 9) & 458752) | (i51 & 3670016));
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }
                });
                Modifier modifier622222 = modifier3;
                final Function3 function3722222 = function34;
                final BottomSheetScaffoldState bottomSheetScaffoldState422222 = bottomSheetScaffoldState2;
                final boolean z622222 = z4;
                final Shape shape922222 = shape6;
                final float f1222222 = f6;
                final long j2922222 = j14;
                final long j3022222 = j13;
                final long j3122222 = j19;
                final int i4622222 = i21;
                int i4722222 = i33 << 6;
                SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier622222, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer4, int i48) {
                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                            if (Function3.this == null) {
                                composer4.startReplaceableGroup(-249544858);
                                composableLambda22222.invoke(composer4, 6);
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.startReplaceableGroup(-249544821);
                            Function3 function38 = Function3.this;
                            DrawerState drawerState = bottomSheetScaffoldState422222.getDrawerState();
                            boolean z72 = z622222;
                            Shape shape102 = shape922222;
                            float f132 = f1222222;
                            long j322 = j2922222;
                            long j33 = j3022222;
                            long j34 = j3122222;
                            Function2 function210 = composableLambda22222;
                            int i49 = i4622222;
                            DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape102, f132, j322, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                            composer4.endReplaceableGroup();
                            return;
                        }
                        composer4.skipToGroupEnd();
                    }
                }), composer3, (i4722222 & 7168) | (i4722222 & 896) | 1572864, 50);
                f7 = f5;
                shape7 = shape6;
                j20 = j11;
                j21 = j19;
                j22 = j17;
                function25 = function24;
                modifier4 = modifier622222;
                j23 = j10;
                f8 = f6;
                j24 = j14;
                j25 = j18;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i2 & 234881024) == 0) {
            }
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i3 & 14) == 0) {
            }
            if ((i3 & 112) == 0) {
            }
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i19 = i18;
            if ((i3 & 458752) == 0) {
            }
            i20 = i5 & 65536;
            if (i20 == 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            i21 = i15;
            if ((i4 & 14) != 0) {
            }
            if ((i4 & 112) != 0) {
            }
            if ((i5 & 4194304) == 0) {
            }
            if ((1533916891 & i6) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i36 == 0) {
            }
            if ((i5 & 4) == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i26 == 0) {
            }
            if ((i5 & 256) == 0) {
            }
            if (i28 == 0) {
            }
            if ((i5 & 1024) == 0) {
            }
            Function2 function27222222 = function26;
            if ((i5 & 2048) == 0) {
            }
            if (i16 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            float f9222222 = m746getSheetPeekHeightD9Ej5fM;
            if ((i5 & 32768) == 0) {
            }
            if (i20 == 0) {
            }
            if ((i5 & 131072) == 0) {
            }
            if ((262144 & i5) == 0) {
            }
            if ((i5 & 524288) == 0) {
            }
            long j26222222 = j15;
            if ((i5 & 1048576) == 0) {
            }
            if ((2097152 & i5) == 0) {
            }
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope222222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 != companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) obj;
            if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
            }
            final BottomSheetScaffoldState bottomSheetScaffoldState3222222 = bottomSheetScaffoldState2;
            final Function2 function28222222 = function24;
            final Function2 function29222222 = function23;
            final float f10222222 = f5;
            final int i42222222 = m882getEnd5ygKITE;
            final int i43222222 = i32;
            final int i44222222 = i33;
            final int i45222222 = i21;
            final boolean z5222222 = z3;
            final Modifier companion3222222 = companion2;
            final Shape shape8222222 = shape3;
            final long j27222222 = j11;
            final long j28222222 = j10;
            final float f11222222 = m745getSheetElevationD9Ej5fM;
            final Function3 function36222222 = m821getLambda1$material_release;
            composer3 = composer2;
            final Function2 composableLambda222222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@Nullable Composer composer4, int i46222222) {
                    if ((i46222222 & 11) != 2 || !composer4.getSkipping()) {
                        State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                        BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                        Function2 function210 = function28222222;
                        Function3 function37222222 = content;
                        final float f12222222 = mo271toPx0680j_4;
                        final BottomSheetScaffoldState bottomSheetScaffoldState4222222 = BottomSheetScaffoldState.this;
                        final boolean z6222222 = z5222222;
                        final Modifier modifier6222222 = companion3222222;
                        final float f132 = f10222222;
                        final MutableState<Float> mutableState2 = mutableState;
                        final Shape shape9222222 = shape8222222;
                        final long j29222222 = j27222222;
                        final long j30222222 = j28222222;
                        final float f14 = f11222222;
                        final int i47222222 = i43222222;
                        final int i48 = i45222222;
                        final Function3 function38 = sheetContent;
                        ComposableLambda composableLambda2222222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                                int i51;
                                Float m749BottomSheetScaffold_bGncdBI$lambda4;
                                Float m749BottomSheetScaffold_bGncdBI$lambda42;
                                Map mapOf;
                                Modifier m998swipeablepPrIpRY;
                                if ((i50 & 14) == 0) {
                                    i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                                } else {
                                    i51 = i50;
                                }
                                if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                    m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                    if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                        m998swipeablepPrIpRY = Modifier.INSTANCE;
                                    } else {
                                        if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f12222222)) {
                                            float f15 = i49;
                                            m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                            Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f12222222), BottomSheetValue.Collapsed));
                                        } else {
                                            mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                        }
                                        m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState4222222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z6222222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            @Override // kotlin.jvm.functions.Function2
                                            @NotNull
                                            public final FixedThreshold invoke(Object obj2, Object obj22) {
                                                return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                            }
                                        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                    }
                                    Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState4222222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier6222222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                    final MutableState<Float> mutableState3 = mutableState2;
                                    composer5.startReplaceableGroup(1157296644);
                                    boolean changed = composer5.changed(mutableState3);
                                    Object rememberedValue3 = composer5.rememberedValue();
                                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                            public final void m754invokeozmzZPI(long j31222222) {
                                                mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j31222222)));
                                            }
                                        };
                                        composer5.updateRememberedValue(rememberedValue3);
                                    }
                                    composer5.endReplaceableGroup();
                                    Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                    Shape shape102 = shape9222222;
                                    long j31222222 = j29222222;
                                    long j322 = j30222222;
                                    float f16 = f14;
                                    final Function3 function39 = function38;
                                    final int i52 = i47222222;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget
                                        @Composable
                                        public final void invoke(@Nullable Composer composer6, int i53) {
                                            if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            Function3 function310 = Function3.this;
                                            int i54 = (i52 << 9) & 7168;
                                            composer6.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                            composer6.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion5.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                            if (composer6.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            composer6.disableReusing();
                                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                            composer6.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            composer6.startReplaceableGroup(-1163856341);
                                            function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                        }
                                    });
                                    int i53 = i47222222;
                                    int i54 = i48;
                                    SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape102, j31222222, j322, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        });
                        Function2 function211 = function29222222;
                        final Function3 function39 = function36222222;
                        final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                        final int i49 = i43222222;
                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((Composer) obj2, ((Number) obj3).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@Nullable Composer composer5, int i50) {
                                if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                } else {
                                    Function3.this.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                                }
                            }
                        });
                        float f15 = f10222222;
                        int i50 = i42222222;
                        int i51 = i43222222;
                        BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function37222222, composableLambda2222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i44222222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i45222222 << 9) & 458752) | (i51 & 3670016));
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            });
            Modifier modifier6222222 = modifier3;
            final Function3 function37222222 = function34;
            final BottomSheetScaffoldState bottomSheetScaffoldState4222222 = bottomSheetScaffoldState2;
            final boolean z6222222 = z4;
            final Shape shape9222222 = shape6;
            final float f12222222 = f6;
            final long j29222222 = j14;
            final long j30222222 = j13;
            final long j31222222 = j19;
            final int i46222222 = i21;
            int i47222222 = i33 << 6;
            SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier6222222, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@Nullable Composer composer4, int i48) {
                    if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                        if (Function3.this == null) {
                            composer4.startReplaceableGroup(-249544858);
                            composableLambda222222.invoke(composer4, 6);
                            composer4.endReplaceableGroup();
                            return;
                        }
                        composer4.startReplaceableGroup(-249544821);
                        Function3 function38 = Function3.this;
                        DrawerState drawerState = bottomSheetScaffoldState4222222.getDrawerState();
                        boolean z72 = z6222222;
                        Shape shape102 = shape9222222;
                        float f132 = f12222222;
                        long j322 = j29222222;
                        long j33 = j30222222;
                        long j34 = j31222222;
                        Function2 function210 = composableLambda222222;
                        int i49 = i46222222;
                        DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape102, f132, j322, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                        composer4.endReplaceableGroup();
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }), composer3, (i47222222 & 7168) | (i47222222 & 896) | 1572864, 50);
            f7 = f5;
            shape7 = shape6;
            j20 = j11;
            j21 = j19;
            j22 = j17;
            function25 = function24;
            modifier4 = modifier6222222;
            j23 = j10;
            f8 = f6;
            j24 = j14;
            j25 = j18;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i2 & 234881024) == 0) {
        }
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i3 & 14) == 0) {
        }
        if ((i3 & 112) == 0) {
        }
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i19 = i18;
        if ((i3 & 458752) == 0) {
        }
        i20 = i5 & 65536;
        if (i20 == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        i21 = i15;
        if ((i4 & 14) != 0) {
        }
        if ((i4 & 112) != 0) {
        }
        if ((i5 & 4194304) == 0) {
        }
        if ((1533916891 & i6) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i36 == 0) {
        }
        if ((i5 & 4) == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i26 == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if (i28 == 0) {
        }
        if ((i5 & 1024) == 0) {
        }
        Function2 function272222222 = function26;
        if ((i5 & 2048) == 0) {
        }
        if (i16 == 0) {
        }
        if (i25 == 0) {
        }
        if (i27 == 0) {
        }
        float f92222222 = m746getSheetPeekHeightD9Ej5fM;
        if ((i5 & 32768) == 0) {
        }
        if (i20 == 0) {
        }
        if ((i5 & 131072) == 0) {
        }
        if ((262144 & i5) == 0) {
        }
        if ((i5 & 524288) == 0) {
        }
        long j262222222 = j15;
        if ((i5 & 1048576) == 0) {
        }
        if ((2097152 & i5) == 0) {
        }
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope2222222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f5);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 != companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableState = (MutableState) obj;
        if (Intrinsics.areEqual(mo271toPx0680j_4, m749BottomSheetScaffold_bGncdBI$lambda4(mutableState))) {
        }
        final BottomSheetScaffoldState bottomSheetScaffoldState32222222 = bottomSheetScaffoldState2;
        final Function2 function282222222 = function24;
        final Function2 function292222222 = function23;
        final float f102222222 = f5;
        final int i422222222 = m882getEnd5ygKITE;
        final int i432222222 = i32;
        final int i442222222 = i33;
        final int i452222222 = i21;
        final boolean z52222222 = z3;
        final Modifier companion32222222 = companion2;
        final Shape shape82222222 = shape3;
        final long j272222222 = j11;
        final long j282222222 = j10;
        final float f112222222 = m745getSheetElevationD9Ej5fM;
        final Function3 function362222222 = m821getLambda1$material_release;
        composer3 = composer2;
        final Function2 composableLambda2222222 = ComposableLambdaKt.composableLambda(composer3, 893101063, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@Nullable Composer composer4, int i462222222) {
                if ((i462222222 & 11) != 2 || !composer4.getSkipping()) {
                    State offset = BottomSheetScaffoldState.this.getBottomSheetState().getOffset();
                    BottomSheetState bottomSheetState = BottomSheetScaffoldState.this.getBottomSheetState();
                    Function2 function210 = function282222222;
                    Function3 function372222222 = content;
                    final float f122222222 = mo271toPx0680j_4;
                    final BottomSheetScaffoldState bottomSheetScaffoldState42222222 = BottomSheetScaffoldState.this;
                    final boolean z62222222 = z52222222;
                    final Modifier modifier62222222 = companion32222222;
                    final float f132 = f102222222;
                    final MutableState<Float> mutableState2 = mutableState;
                    final Shape shape92222222 = shape82222222;
                    final long j292222222 = j272222222;
                    final long j302222222 = j282222222;
                    final float f14 = f112222222;
                    final int i472222222 = i432222222;
                    final int i48 = i452222222;
                    final Function3 function38 = sheetContent;
                    ComposableLambda composableLambda22222222 = ComposableLambdaKt.composableLambda(composer4, -1378534681, true, new Function3() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                            invoke(((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(int i49, @Nullable Composer composer5, int i50) {
                            int i51;
                            Float m749BottomSheetScaffold_bGncdBI$lambda4;
                            Float m749BottomSheetScaffold_bGncdBI$lambda42;
                            Map mapOf;
                            Modifier m998swipeablepPrIpRY;
                            if ((i50 & 14) == 0) {
                                i51 = i50 | (composer5.changed(i49) ? 4 : 2);
                            } else {
                                i51 = i50;
                            }
                            if ((i51 & 91) != 18 || !composer5.getSkipping()) {
                                m749BottomSheetScaffold_bGncdBI$lambda4 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                if (m749BottomSheetScaffold_bGncdBI$lambda4 == null) {
                                    m998swipeablepPrIpRY = Modifier.INSTANCE;
                                } else {
                                    if (MathKt.roundToInt(m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()) != MathKt.roundToInt(f122222222)) {
                                        float f15 = i49;
                                        m749BottomSheetScaffold_bGncdBI$lambda42 = BottomSheetScaffoldKt.m749BottomSheetScaffold_bGncdBI$lambda4(mutableState2);
                                        Intrinsics.checkNotNull(m749BottomSheetScaffold_bGncdBI$lambda42);
                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f15 - m749BottomSheetScaffold_bGncdBI$lambda42.floatValue()), BottomSheetValue.Expanded), TuplesKt.to(Float.valueOf(f15 - f122222222), BottomSheetValue.Collapsed));
                                    } else {
                                        mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(i49 - m749BottomSheetScaffold_bGncdBI$lambda4.floatValue()), BottomSheetValue.Collapsed));
                                    }
                                    m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, bottomSheetScaffoldState42222222.getBottomSheetState(), r13, Orientation.Vertical, (r26 & 8) != 0 ? true : z62222222, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        @Override // kotlin.jvm.functions.Function2
                                        @NotNull
                                        public final FixedThreshold invoke(Object obj2, Object obj22) {
                                            return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                        }
                                    } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                }
                                Modifier m351requiredHeightInVpY3zN4$default = SizeKt.m351requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, bottomSheetScaffoldState42222222.getBottomSheetState().getNestedScrollConnection(), null, 2, null).then(m998swipeablepPrIpRY).then(modifier62222222), 0.0f, 1, null), f132, 0.0f, 2, null);
                                final MutableState<Float> mutableState3 = mutableState2;
                                composer5.startReplaceableGroup(1157296644);
                                boolean changed = composer5.changed(mutableState3);
                                Object rememberedValue3 = composer5.rememberedValue();
                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            m754invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                        public final void m754invokeozmzZPI(long j312222222) {
                                            mutableState3.setValue(Float.valueOf(IntSize.m2566getHeightimpl(j312222222)));
                                        }
                                    };
                                    composer5.updateRememberedValue(rememberedValue3);
                                }
                                composer5.endReplaceableGroup();
                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m351requiredHeightInVpY3zN4$default, (Function1) rememberedValue3);
                                Shape shape102 = shape92222222;
                                long j312222222 = j292222222;
                                long j322 = j302222222;
                                float f16 = f14;
                                final Function3 function39 = function38;
                                final int i52 = i472222222;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer5, -698903261, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt.BottomSheetScaffold.child.1.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                        invoke((Composer) obj2, ((Number) obj3).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i53) {
                                        if ((i53 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        Function3 function310 = Function3.this;
                                        int i54 = (i52 << 9) & 7168;
                                        composer6.startReplaceableGroup(-483455358);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                        composer6.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer6.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer6.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer6.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion5.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(companion4);
                                        if (composer6.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor);
                                        } else {
                                            composer6.useNode();
                                        }
                                        composer6.disableReusing();
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer6);
                                        Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion5.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                        composer6.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer6)), composer6, 0);
                                        composer6.startReplaceableGroup(2058660585);
                                        composer6.startReplaceableGroup(-1163856341);
                                        function310.invoke(ColumnScopeInstance.INSTANCE, composer6, Integer.valueOf(((i54 >> 6) & 112) | 6));
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                        composer6.endNode();
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                    }
                                });
                                int i53 = i472222222;
                                int i54 = i48;
                                SurfaceKt.m988SurfaceFjzlyU(onSizeChanged, shape102, j312222222, j322, null, f16, composableLambda3, composer5, ((i53 >> 21) & 112) | 1572864 | ((i54 << 6) & 896) | ((i54 << 6) & 7168) | ((i53 >> 12) & 458752), 16);
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    });
                    Function2 function211 = function292222222;
                    final Function3 function39 = function362222222;
                    final BottomSheetScaffoldState bottomSheetScaffoldState52 = BottomSheetScaffoldState.this;
                    final int i49 = i432222222;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -486138068, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer5, int i50) {
                            if ((i50 & 11) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                            } else {
                                Function3.this.invoke(bottomSheetScaffoldState52.getSnackbarHostState(), composer5, Integer.valueOf((i49 >> 9) & 112));
                            }
                        }
                    });
                    float f15 = f102222222;
                    int i50 = i422222222;
                    int i51 = i432222222;
                    BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(function210, function372222222, composableLambda22222222, function211, composableLambda3, f15, i50, offset, bottomSheetState, composer4, ((i51 >> 9) & 14) | 24960 | ((i442222222 >> 3) & 112) | ((i51 >> 6) & 7168) | ((i452222222 << 9) & 458752) | (i51 & 3670016));
                    return;
                }
                composer4.skipToGroupEnd();
            }
        });
        Modifier modifier62222222 = modifier3;
        final Function3 function372222222 = function34;
        final BottomSheetScaffoldState bottomSheetScaffoldState42222222 = bottomSheetScaffoldState2;
        final boolean z62222222 = z4;
        final Shape shape92222222 = shape6;
        final float f122222222 = f6;
        final long j292222222 = j14;
        final long j302222222 = j13;
        final long j312222222 = j19;
        final int i462222222 = i21;
        int i472222222 = i33 << 6;
        SurfaceKt.m988SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier62222222, 0.0f, 1, null), null, j18, j17, null, 0.0f, ComposableLambdaKt.composableLambda(composer3, 1273816607, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@Nullable Composer composer4, int i48) {
                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                    if (Function3.this == null) {
                        composer4.startReplaceableGroup(-249544858);
                        composableLambda2222222.invoke(composer4, 6);
                        composer4.endReplaceableGroup();
                        return;
                    }
                    composer4.startReplaceableGroup(-249544821);
                    Function3 function38 = Function3.this;
                    DrawerState drawerState = bottomSheetScaffoldState42222222.getDrawerState();
                    boolean z72 = z62222222;
                    Shape shape102 = shape92222222;
                    float f132 = f122222222;
                    long j322 = j292222222;
                    long j33 = j302222222;
                    long j34 = j312222222;
                    Function2 function210 = composableLambda2222222;
                    int i49 = i462222222;
                    DrawerKt.m844ModalDrawerGs3lGvM(function38, null, drawerState, z72, shape102, f132, j322, j33, j34, function210, composer4, ((i49 >> 3) & 7168) | ((i49 >> 9) & 14) | C.ENCODING_PCM_32BIT | ((i49 >> 3) & 57344) | ((i49 >> 3) & 458752) | ((i49 >> 3) & 3670016) | ((i49 >> 3) & 29360128) | ((i49 >> 3) & 234881024), 2);
                    composer4.endReplaceableGroup();
                    return;
                }
                composer4.skipToGroupEnd();
            }
        }), composer3, (i472222222 & 7168) | (i472222222 & 896) | 1572864, 50);
        f7 = f5;
        shape7 = shape6;
        j20 = j11;
        j21 = j19;
        j22 = j17;
        function25 = function24;
        modifier4 = modifier62222222;
        j23 = j10;
        f8 = f6;
        j24 = j14;
        j25 = j18;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m748BottomSheetScaffoldLayoutKCBPh4w(final Function2 function2, final Function3 function3, final Function3 function32, final Function2 function22, final Function2 function23, final float f, final int i, final State state, final BottomSheetState bottomSheetState, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(499725572);
        int i4 = (i2 & 14) == 0 ? (startRestartGroup.changed(function2) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(function32) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i4 |= startRestartGroup.changed(state) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i4 |= startRestartGroup.changed(bottomSheetState) ? 67108864 : 33554432;
        }
        final int i5 = i4;
        if ((i5 & 191739611) != 38347922 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {function32, state, function2, function3, Dp.m2505boximpl(f), function22, FabPosition.m874boximpl(i), function23, bottomSheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z = false;
            for (int i6 = 0; i6 < 9; i6++) {
                z |= startRestartGroup.changed(objArr[i6]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = 0;
                rememberedValue = new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1

                    /* compiled from: BottomSheetScaffold.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BottomSheetValue.values().length];
                            iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                            iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m755invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m755invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j) {
                        Placeable placeable;
                        float f2;
                        int mo265roundToPx0680j_4;
                        int i7;
                        int height;
                        float f3;
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j);
                        final int m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(j);
                        long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final Function3 function33 = function32;
                        final int i8 = i5;
                        final Placeable mo1944measureBRTryo0 = ((Measurable) SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(520491296, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i9) {
                                if ((i9 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    Function3.this.invoke(Integer.valueOf(m2486getMaxHeightimpl), composer2, Integer.valueOf((i8 >> 3) & 112));
                                }
                            }
                        })).get(0)).mo1944measureBRTryo0(m2478copyZbe2FdA$default);
                        final int roundToInt = MathKt.roundToInt(((Number) state.getValue()).floatValue());
                        final Function2 function24 = function2;
                        if (function24 != null) {
                            final int i9 = i5;
                            placeable = ((Measurable) SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(1988456983, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$topBarPlaceable$1$1
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
                                    if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        Function2.this.invoke(composer2, Integer.valueOf(i9 & 14));
                                    }
                                }
                            })).get(0)).mo1944measureBRTryo0(m2478copyZbe2FdA$default);
                        } else {
                            placeable = null;
                        }
                        int height2 = placeable != null ? placeable.getHeight() : 0;
                        long m2478copyZbe2FdA$default2 = Constraints.m2478copyZbe2FdA$default(m2478copyZbe2FdA$default, 0, 0, 0, m2486getMaxHeightimpl - height2, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final Function3 function34 = function3;
                        final float f4 = f;
                        final int i10 = i5;
                        final Placeable mo1944measureBRTryo02 = ((Measurable) SubcomposeLayout.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(1466287989, true, new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i11) {
                                if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    Function3.this.invoke(PaddingKt.m333PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f4, 7, null), composer2, Integer.valueOf(i10 & 112));
                                }
                            }
                        })).get(0)).mo1944measureBRTryo0(m2478copyZbe2FdA$default2);
                        Function2 function25 = function22;
                        final Placeable mo1944measureBRTryo03 = function25 != null ? ((Measurable) SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Fab, function25).get(0)).mo1944measureBRTryo0(m2478copyZbe2FdA$default) : null;
                        int width = mo1944measureBRTryo03 != null ? mo1944measureBRTryo03.getWidth() : 0;
                        int height3 = mo1944measureBRTryo03 != null ? mo1944measureBRTryo03.getHeight() : 0;
                        if (FabPosition.m877equalsimpl0(i, FabPosition.INSTANCE.m881getCenter5ygKITE())) {
                            mo265roundToPx0680j_4 = (m2487getMaxWidthimpl - width) / 2;
                        } else {
                            f2 = BottomSheetScaffoldKt.FabSpacing;
                            mo265roundToPx0680j_4 = (m2487getMaxWidthimpl - width) - SubcomposeLayout.mo265roundToPx0680j_4(f2);
                        }
                        final int i11 = mo265roundToPx0680j_4;
                        int i12 = height3 / 2;
                        if (SubcomposeLayout.mo271toPx0680j_4(f) < i12) {
                            f3 = BottomSheetScaffoldKt.FabSpacing;
                            i7 = (roundToInt - height3) - SubcomposeLayout.mo265roundToPx0680j_4(f3);
                        } else {
                            i7 = roundToInt - i12;
                        }
                        final int i13 = i7;
                        final Placeable mo1944measureBRTryo04 = ((Measurable) SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, function23).get(0)).mo1944measureBRTryo0(m2478copyZbe2FdA$default);
                        final int width2 = (m2487getMaxWidthimpl - mo1944measureBRTryo04.getWidth()) / 2;
                        int i14 = WhenMappings.$EnumSwitchMapping$0[((BottomSheetValue) bottomSheetState.getCurrentValue()).ordinal()];
                        if (i14 == 1) {
                            height = i13 - mo1944measureBRTryo04.getHeight();
                        } else {
                            if (i14 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            height = m2486getMaxHeightimpl - mo1944measureBRTryo04.getHeight();
                        }
                        final int i15 = height2;
                        final Placeable placeable2 = placeable;
                        final int i16 = height;
                        return MeasureScope.layout$default(SubcomposeLayout, m2487getMaxWidthimpl, m2486getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1
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
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, i15, 0.0f, 4, null);
                                Placeable placeable3 = placeable2;
                                if (placeable3 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable3, 0, 0, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, roundToInt, 0.0f, 4, null);
                                Placeable placeable4 = mo1944measureBRTryo03;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.placeRelative$default(layout, placeable4, i11, i13, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo04, width2, i16, 0.0f, 4, null);
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
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
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
                BottomSheetScaffoldKt.m748BottomSheetScaffoldLayoutKCBPh4w(Function2.this, function3, function32, function22, function23, f, i, state, bottomSheetState, composer2, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffold_bGncdBI$lambda-4, reason: not valid java name */
    public static final Float m749BottomSheetScaffold_bGncdBI$lambda4(MutableState mutableState) {
        return (Float) mutableState.getValue();
    }
}
