package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÄ\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a-\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001eH\u0007¢\u0006\u0002\u0010-\u001aó\u0001\u0010.\u001a\u00020\b*\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\n2!\u00107\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\b0\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0014\u0010=\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\u001a\u0014\u0010@\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"PredictiveBackChildTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "PredictiveBackMaxScaleXDistance", "Landroidx/compose/ui/unit/Dp;", "F", "PredictiveBackMaxScaleYDistance", "ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "ModalBottomSheetContent", "Landroidx/compose/foundation/layout/BoxScope;", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "animateToDismiss", "settleToDismiss", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "ModalBottomSheetContent-IQkwcL4", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", NotificationCompat.CATEGORY_PROGRESS, "calculatePredictiveBackScaleY", "material3_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = Dp.m6299constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = Dp.m6299constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1922ModalBottomSheetdYc4hso(final Function0<Unit> function0, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, ModalBottomSheetProperties modalBottomSheetProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final SheetState sheetState2;
        int i5;
        long j4;
        int i6;
        int i7;
        int i8;
        int i9;
        SheetState sheetState3;
        Modifier modifier2;
        int i10;
        Shape shape2;
        Shape shape3;
        long j5;
        float f3;
        long j6;
        ModalBottomSheetKt$ModalBottomSheet$1 modalBottomSheetKt$ModalBottomSheet$1;
        float f4;
        ModalBottomSheetProperties modalBottomSheetProperties2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i11;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24;
        int i12;
        float f5;
        long j7;
        Modifier modifier3;
        Shape shape4;
        float f6;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        boolean changedInstance2;
        Object rememberedValue3;
        Object rememberedValue4;
        Shape shape5;
        boolean changedInstance3;
        Object rememberedValue5;
        float f7;
        final long j8;
        final Shape shape6;
        final float f8;
        long j9;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        final ModalBottomSheetProperties modalBottomSheetProperties3;
        final long j10;
        Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(2132719801);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheet)P(6,5,11,10:c#ui.unit.Dp,9,0:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.unit.Dp,8:c#ui.graphics.Color,4,3,7)121@6012L31,123@6143L13,124@6206L14,125@6248L31,127@6356L10,133@6697L24,134@6761L327,145@7142L149,151@7326L42,155@7458L708,167@8231L771,153@7374L1628,193@9077L21,193@9050L48:ModalBottomSheet.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetState2 = sheetState;
                    if (startRestartGroup.changed(sheetState2)) {
                        i16 = 256;
                        i4 |= i16;
                    }
                } else {
                    sheetState2 = sheetState;
                }
                i16 = 128;
                i4 |= i16;
            } else {
                sheetState2 = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(shape)) {
                        i15 = 16384;
                        i4 |= i15;
                    }
                    i15 = 8192;
                    i4 |= i15;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    j4 = j2;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((100663296 & i) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(j3)) {
                        i14 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i4 |= i14;
                    }
                    i14 = 33554432;
                    i4 |= i14;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0 && startRestartGroup.changedInstance(function22)) {
                            i13 = 4;
                            i8 = i2 | i13;
                        }
                        i13 = 2;
                        i8 = i2 | i13;
                    } else {
                        i8 = i2;
                    }
                    i9 = i3 & 2048;
                    if (i9 == 0) {
                        i8 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i8 |= startRestartGroup.changed(modalBottomSheetProperties) ? 32 : 16;
                    }
                    int i18 = i8;
                    if ((i3 & 4096) == 0) {
                        i18 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i18 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
                        if ((i4 & 306783379) == 306783378 || (i18 & 147) != 146 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i17 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    sheetState3 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                    i4 &= -897;
                                } else {
                                    sheetState3 = sheetState2;
                                }
                                float m1472getSheetMaxWidthD9Ej5fM = i5 != 0 ? BottomSheetDefaults.INSTANCE.m1472getSheetMaxWidthD9Ej5fM() : f;
                                if ((i3 & 16) != 0) {
                                    modifier2 = companion;
                                    i10 = 6;
                                    shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                    i4 &= -57345;
                                } else {
                                    modifier2 = companion;
                                    i10 = 6;
                                    shape2 = shape;
                                }
                                SheetState sheetState4 = sheetState3;
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                    shape3 = shape2;
                                    j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, i10);
                                } else {
                                    shape3 = shape2;
                                    j5 = j;
                                }
                                if ((i3 & 64) != 0) {
                                    j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 15) & 14);
                                    i4 &= -3670017;
                                }
                                float m6299constructorimpl = i6 != 0 ? Dp.m6299constructorimpl(0) : f2;
                                if ((i3 & 256) != 0) {
                                    f3 = m6299constructorimpl;
                                    j6 = BottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    i4 = (-234881025) & i4;
                                } else {
                                    f3 = m6299constructorimpl;
                                    j6 = j3;
                                }
                                Function2<? super Composer, ? super Integer, Unit> m1649getLambda1$material3_release = i7 != 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m1649getLambda1$material3_release() : function2;
                                if ((i3 & 1024) != 0) {
                                    modalBottomSheetKt$ModalBottomSheet$1 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1
                                        public final WindowInsets invoke(Composer composer2, int i19) {
                                            composer2.startReplaceGroup(58488196);
                                            ComposerKt.sourceInformation(composer2, "C129@6530L12:ModalBottomSheet.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(58488196, i19, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
                                            }
                                            WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer2, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceGroup();
                                            return windowInsets;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer2, Integer num) {
                                            return invoke(composer2, num.intValue());
                                        }
                                    };
                                    i18 &= -15;
                                } else {
                                    modalBottomSheetKt$ModalBottomSheet$1 = function22;
                                }
                                if (i9 != 0) {
                                    function23 = m1649getLambda1$material3_release;
                                    i11 = i4;
                                    function24 = modalBottomSheetKt$ModalBottomSheet$1;
                                    modalBottomSheetProperties2 = ModalBottomSheetDefaults.INSTANCE.getProperties();
                                    i12 = i18;
                                    f5 = m1472getSheetMaxWidthD9Ej5fM;
                                    j7 = j6;
                                    modifier3 = modifier2;
                                    sheetState2 = sheetState4;
                                    shape4 = shape3;
                                    f4 = f3;
                                } else {
                                    f4 = f3;
                                    modalBottomSheetProperties2 = modalBottomSheetProperties;
                                    function23 = m1649getLambda1$material3_release;
                                    i11 = i4;
                                    function24 = modalBottomSheetKt$ModalBottomSheet$1;
                                    i12 = i18;
                                    f5 = m1472getSheetMaxWidthD9Ej5fM;
                                    j7 = j6;
                                    modifier3 = modifier2;
                                    sheetState2 = sheetState4;
                                    shape4 = shape3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & 1024) != 0) {
                                    i18 &= -15;
                                }
                                modifier3 = modifier;
                                shape4 = shape;
                                j5 = j;
                                f4 = f2;
                                function23 = function2;
                                function24 = function22;
                                modalBottomSheetProperties2 = modalBottomSheetProperties;
                                i11 = i4;
                                i12 = i18;
                                f5 = f;
                                j7 = j3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                f6 = f4;
                                ComposerKt.traceEventStart(2132719801, i11, i12, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)");
                            } else {
                                f6 = f4;
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i19 = i12;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            int i20 = (i11 & 896) ^ 384;
                            final long j11 = j4;
                            int i21 = i11 & 14;
                            final long j12 = j5;
                            changedInstance = (i21 == 4) | ((i20 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Job launch$default;
                                        if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                            final SheetState sheetState5 = SheetState.this;
                                            final Function0<Unit> function02 = function0;
                                            launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                    invoke2(th);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Throwable th) {
                                                    if (SheetState.this.isVisible()) {
                                                        return;
                                                    }
                                                    function02.invoke();
                                                }
                                            });
                                        }
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = sheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final Function0 function02 = (Function0) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | ((i20 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | (i21 == 4);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f9) {
                                        invoke(f9.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ float $it;
                                        final /* synthetic */ SheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(SheetState sheetState, float f, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = sheetState;
                                            this.$it = f;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$sheetState, this.$it, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
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

                                    public final void invoke(float f9) {
                                        Job launch$default;
                                        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(sheetState2, f9, null), 3, null);
                                        final SheetState sheetState5 = sheetState2;
                                        final Function0<Unit> function03 = function0;
                                        launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                invoke2(th);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Throwable th) {
                                                if (SheetState.this.isVisible()) {
                                                    return;
                                                }
                                                function03.invoke();
                                            }
                                        });
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            final Function1 function1 = (Function1) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                shape5 = shape4;
                                rememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            } else {
                                shape5 = shape4;
                            }
                            final Animatable animatable = (Animatable) rememberedValue4;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            changedInstance3 = ((i20 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(animatable) | (i21 == 4);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Job launch$default;
                                        if (SheetState.this.getCurrentValue() != SheetValue.Expanded || !SheetState.this.getHasPartiallyExpandedState()) {
                                            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(SheetState.this, null), 3, null);
                                            final Function0<Unit> function03 = function0;
                                            launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                    invoke2(th);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Throwable th) {
                                                    function03.invoke();
                                                }
                                            });
                                        } else {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable, null), 3, null);
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SheetState.this, null), 3, null);
                                        }
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$predictiveBackProgress = animatable;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass1(this.$predictiveBackProgress, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
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

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass2(SheetState sheetState, Continuation<? super AnonymousClass2> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = sheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass2(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
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

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
                                    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass3(SheetState sheetState, Continuation<? super AnonymousClass3> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = sheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new AnonymousClass3(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final long j13 = j7;
                            final SheetState sheetState5 = sheetState2;
                            final Modifier modifier5 = modifier3;
                            final float f9 = f5;
                            final Shape shape7 = shape5;
                            final float f10 = f6;
                            final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27 = function24;
                            ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) rememberedValue5, modalBottomSheetProperties2, animatable, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

                                public final void invoke(Composer composer2, int i22) {
                                    ComposerKt.sourceInformation(composer2, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                                    if ((i22 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-314673510, i22, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                        }
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                                            }
                                        }, 1, null);
                                        long j14 = j13;
                                        Function0<Unit> function03 = function02;
                                        SheetState sheetState6 = sheetState5;
                                        Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                        CoroutineScope coroutineScope2 = coroutineScope;
                                        Function1<Float, Unit> function12 = function1;
                                        Modifier modifier6 = modifier5;
                                        float f11 = f9;
                                        Shape shape8 = shape7;
                                        long j15 = j12;
                                        long j16 = j11;
                                        float f12 = f10;
                                        Function2<Composer, Integer, Unit> function28 = function26;
                                        Function2<Composer, Integer, WindowInsets> function29 = function27;
                                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, semantics$default);
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
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                                        ModalBottomSheetKt.m1924Scrim3JVO9M(j14, function03, sheetState6.getTargetValue() != SheetValue.Hidden, composer2, 0);
                                        ModalBottomSheetKt.m1923ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable2, coroutineScope2, function03, function12, modifier6, sheetState6, f11, shape8, j15, j16, f12, function28, function29, function32, composer2, 6 | (Animatable.$stable << 3), 0, 0);
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
                            }, startRestartGroup, 54), startRestartGroup, (i19 & 112) | 3072 | (Animatable.$stable << 6));
                            if (sheetState2.getHasExpandedState()) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011320033, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                boolean z = (i20 > 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256;
                                Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (z || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = (Function2) new ModalBottomSheetKt$ModalBottomSheet$4$1(sheetState2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                EffectsKt.LaunchedEffect(sheetState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, (i11 >> 6) & 14);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f7 = f6;
                            j8 = j11;
                            shape6 = shape5;
                            f8 = f5;
                            j9 = j7;
                            function25 = function24;
                            modalBottomSheetProperties3 = modalBottomSheetProperties2;
                            j10 = j12;
                            modifier4 = modifier3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            f8 = f;
                            shape6 = shape;
                            j10 = j;
                            function23 = function2;
                            function25 = function22;
                            modalBottomSheetProperties3 = modalBottomSheetProperties;
                            j8 = j4;
                            f7 = f2;
                            j9 = j3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier6 = modifier4;
                            final SheetState sheetState6 = sheetState2;
                            final float f11 = f7;
                            final long j14 = j9;
                            final Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5
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

                                public final void invoke(Composer composer2, int i22) {
                                    ModalBottomSheetKt.m1922ModalBottomSheetdYc4hso(function0, modifier6, sheetState6, f8, shape6, j10, j8, f11, j14, function28, function25, modalBottomSheetProperties3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    SheetState sheetState42 = sheetState3;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i192 = i12;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    int i202 = (i11 & 896) ^ 384;
                    final long j112 = j4;
                    int i212 = i11 & 14;
                    final long j122 = j5;
                    changedInstance = (i212 == 4) | ((i202 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Job launch$default;
                            if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                final SheetState sheetState52 = SheetState.this;
                                final Function0<Unit> function022 = function0;
                                launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable th) {
                                        if (SheetState.this.isVisible()) {
                                            return;
                                        }
                                        function022.invoke();
                                    }
                                });
                            }
                        }

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ SheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = sheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    final Function0<Unit> function022 = (Function0) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    changedInstance2 = startRestartGroup.changedInstance(coroutineScope2) | ((i202 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | (i212 == 4);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f92) {
                            invoke(f92.floatValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ float $it;
                            final /* synthetic */ SheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(SheetState sheetState, float f, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$sheetState = sheetState;
                                this.$it = f;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$sheetState, this.$it, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
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

                        public final void invoke(float f92) {
                            Job launch$default;
                            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(sheetState2, f92, null), 3, null);
                            final SheetState sheetState52 = sheetState2;
                            final Function0<Unit> function03 = function0;
                            launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                    invoke2(th);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th) {
                                    if (SheetState.this.isVisible()) {
                                        return;
                                    }
                                    function03.invoke();
                                }
                            });
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    final Function1<? super Float, Unit> function12 = (Function1) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    final Animatable<Float, AnimationVector1D> animatable2 = (Animatable) rememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    changedInstance3 = ((i202 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(animatable2) | (i212 == 4);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Job launch$default;
                            if (SheetState.this.getCurrentValue() != SheetValue.Expanded || !SheetState.this.getHasPartiallyExpandedState()) {
                                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass3(SheetState.this, null), 3, null);
                                final Function0<Unit> function03 = function0;
                                launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable th) {
                                        function03.invoke();
                                    }
                                });
                            } else {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(animatable2, null), 3, null);
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass2(SheetState.this, null), 3, null);
                            }
                        }

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$predictiveBackProgress = animatable;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$predictiveBackProgress, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
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

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
                        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ SheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(SheetState sheetState, Continuation<? super AnonymousClass2> continuation) {
                                super(2, continuation);
                                this.$sheetState = sheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass2(this.$sheetState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
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

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
                        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ SheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass3(SheetState sheetState, Continuation<? super AnonymousClass3> continuation) {
                                super(2, continuation);
                                this.$sheetState = sheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass3(this.$sheetState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final long j132 = j7;
                    final SheetState sheetState52 = sheetState2;
                    final Modifier modifier52 = modifier3;
                    final float f92 = f5;
                    final Shape shape72 = shape5;
                    final float f102 = f6;
                    final Function2<? super Composer, ? super Integer, Unit> function262 = function23;
                    final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function272 = function24;
                    ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) rememberedValue5, modalBottomSheetProperties2, animatable2, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

                        public final void invoke(Composer composer2, int i22) {
                            ComposerKt.sourceInformation(composer2, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                            if ((i22 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-314673510, i22, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                }
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                                    }
                                }, 1, null);
                                long j142 = j132;
                                Function0<Unit> function03 = function022;
                                SheetState sheetState62 = sheetState52;
                                Animatable<Float, AnimationVector1D> animatable22 = animatable2;
                                CoroutineScope coroutineScope22 = coroutineScope2;
                                Function1<Float, Unit> function122 = function12;
                                Modifier modifier62 = modifier52;
                                float f112 = f92;
                                Shape shape8 = shape72;
                                long j15 = j122;
                                long j16 = j112;
                                float f12 = f102;
                                Function2<Composer, Integer, Unit> function282 = function262;
                                Function2<Composer, Integer, WindowInsets> function29 = function272;
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, semantics$default);
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
                                ComposerKt.sourceInformationMarkerStart(composer2, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                                ModalBottomSheetKt.m1924Scrim3JVO9M(j142, function03, sheetState62.getTargetValue() != SheetValue.Hidden, composer2, 0);
                                ModalBottomSheetKt.m1923ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable22, coroutineScope22, function03, function122, modifier62, sheetState62, f112, shape8, j15, j16, f12, function282, function29, function32, composer2, 6 | (Animatable.$stable << 3), 0, 0);
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
                    }, startRestartGroup, 54), startRestartGroup, (i192 & 112) | 3072 | (Animatable.$stable << 6));
                    if (sheetState2.getHasExpandedState()) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f7 = f6;
                    j8 = j112;
                    shape6 = shape5;
                    f8 = f5;
                    j9 = j7;
                    function25 = function24;
                    modalBottomSheetProperties3 = modalBottomSheetProperties2;
                    j10 = j122;
                    modifier4 = modifier3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i2 & 6) != 0) {
                }
                i9 = i3 & 2048;
                if (i9 == 0) {
                }
                int i182 = i8;
                if ((i3 & 4096) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i17 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                SheetState sheetState422 = sheetState3;
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                if (i9 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i1922 = i12;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
                int i2022 = (i11 & 896) ^ 384;
                final long j1122 = j4;
                int i2122 = i11 & 14;
                final long j1222 = j5;
                changedInstance = (i2122 == 4) | ((i2022 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope22);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Job launch$default;
                        if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                            final SheetState sheetState522 = SheetState.this;
                            final Function0<Unit> function0222 = function0;
                            launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                    invoke2(th);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th) {
                                    if (SheetState.this.isVisible()) {
                                        return;
                                    }
                                    function0222.invoke();
                                }
                            });
                        }
                    }

                    /* compiled from: ModalBottomSheet.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                final Function0<Unit> function0222 = (Function0) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
                changedInstance2 = startRestartGroup.changedInstance(coroutineScope22) | ((i2022 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | (i2122 == 4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f922) {
                        invoke(f922.floatValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: ModalBottomSheet.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ float $it;
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(SheetState sheetState, float f, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                            this.$it = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$it, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
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

                    public final void invoke(float f922) {
                        Job launch$default;
                        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(sheetState2, f922, null), 3, null);
                        final SheetState sheetState522 = sheetState2;
                        final Function0<Unit> function03 = function0;
                        launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th) {
                                if (SheetState.this.isVisible()) {
                                    return;
                                }
                                function03.invoke();
                            }
                        });
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                final Function1<? super Float, Unit> function122 = (Function1) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                final Animatable<Float, AnimationVector1D> animatable22 = (Animatable) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
                changedInstance3 = ((i2022 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope22) | startRestartGroup.changedInstance(animatable22) | (i2122 == 4);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Job launch$default;
                        if (SheetState.this.getCurrentValue() != SheetValue.Expanded || !SheetState.this.getHasPartiallyExpandedState()) {
                            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass3(SheetState.this, null), 3, null);
                            final Function0<Unit> function03 = function0;
                            launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                    invoke2(th);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th) {
                                    function03.invoke();
                                }
                            });
                        } else {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(animatable22, null), 3, null);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass2(SheetState.this, null), 3, null);
                        }
                    }

                    /* compiled from: ModalBottomSheet.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$predictiveBackProgress = animatable;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$predictiveBackProgress, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
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

                    /* compiled from: ModalBottomSheet.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(SheetState sheetState, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$sheetState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
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

                    /* compiled from: ModalBottomSheet.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
                    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(SheetState sheetState, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass3(this.$sheetState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final long j1322 = j7;
                final SheetState sheetState522 = sheetState2;
                final Modifier modifier522 = modifier3;
                final float f922 = f5;
                final Shape shape722 = shape5;
                final float f1022 = f6;
                final Function2<? super Composer, ? super Integer, Unit> function2622 = function23;
                final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function2722 = function24;
                ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) rememberedValue5, modalBottomSheetProperties2, animatable22, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

                    public final void invoke(Composer composer2, int i22) {
                        ComposerKt.sourceInformation(composer2, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                        if ((i22 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-314673510, i22, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                            }
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                                }
                            }, 1, null);
                            long j142 = j1322;
                            Function0<Unit> function03 = function0222;
                            SheetState sheetState62 = sheetState522;
                            Animatable<Float, AnimationVector1D> animatable222 = animatable22;
                            CoroutineScope coroutineScope222 = coroutineScope22;
                            Function1<Float, Unit> function1222 = function122;
                            Modifier modifier62 = modifier522;
                            float f112 = f922;
                            Shape shape8 = shape722;
                            long j15 = j1222;
                            long j16 = j1122;
                            float f12 = f1022;
                            Function2<Composer, Integer, Unit> function282 = function2622;
                            Function2<Composer, Integer, WindowInsets> function29 = function2722;
                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, semantics$default);
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
                            ComposerKt.sourceInformationMarkerStart(composer2, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                            ModalBottomSheetKt.m1924Scrim3JVO9M(j142, function03, sheetState62.getTargetValue() != SheetValue.Hidden, composer2, 0);
                            ModalBottomSheetKt.m1923ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable222, coroutineScope222, function03, function1222, modifier62, sheetState62, f112, shape8, j15, j16, f12, function282, function29, function32, composer2, 6 | (Animatable.$stable << 3), 0, 0);
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
                }, startRestartGroup, 54), startRestartGroup, (i1922 & 112) | 3072 | (Animatable.$stable << 6));
                if (sheetState2.getHasExpandedState()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                f7 = f6;
                j8 = j1122;
                shape6 = shape5;
                f8 = f5;
                j9 = j7;
                function25 = function24;
                modalBottomSheetProperties3 = modalBottomSheetProperties2;
                j10 = j1222;
                modifier4 = modifier3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((100663296 & i) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            if ((i2 & 6) != 0) {
            }
            i9 = i3 & 2048;
            if (i9 == 0) {
            }
            int i1822 = i8;
            if ((i3 & 4096) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i17 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            SheetState sheetState4222 = sheetState3;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if (i9 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i19222 = i12;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
            int i20222 = (i11 & 896) ^ 384;
            final long j11222 = j4;
            int i21222 = i11 & 14;
            final long j12222 = j5;
            changedInstance = (i21222 == 4) | ((i20222 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Job launch$default;
                    if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                        final SheetState sheetState5222 = SheetState.this;
                        final Function0<Unit> function02222 = function0;
                        launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th) {
                                if (SheetState.this.isVisible()) {
                                    return;
                                }
                                function02222.invoke();
                            }
                        });
                    }
                }

                /* compiled from: ModalBottomSheet.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SheetState $sheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$sheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$sheetState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$sheetState.hide(this) == coroutine_suspended) {
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
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            final Function0<Unit> function02222 = (Function0) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
            changedInstance2 = startRestartGroup.changedInstance(coroutineScope222) | ((i20222 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | (i21222 == 4);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f9222) {
                    invoke(f9222.floatValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: ModalBottomSheet.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ float $it;
                    final /* synthetic */ SheetState $sheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SheetState sheetState, float f, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$sheetState = sheetState;
                        this.$it = f;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$sheetState, this.$it, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
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

                public final void invoke(float f9222) {
                    Job launch$default;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(sheetState2, f9222, null), 3, null);
                    final SheetState sheetState5222 = sheetState2;
                    final Function0<Unit> function03 = function0;
                    launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            if (SheetState.this.isVisible()) {
                                return;
                            }
                            function03.invoke();
                        }
                    });
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            final Function1<? super Float, Unit> function1222 = (Function1) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            final Animatable<Float, AnimationVector1D> animatable222 = (Animatable) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
            changedInstance3 = ((i20222 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope222) | startRestartGroup.changedInstance(animatable222) | (i21222 == 4);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Job launch$default;
                    if (SheetState.this.getCurrentValue() != SheetValue.Expanded || !SheetState.this.getHasPartiallyExpandedState()) {
                        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new AnonymousClass3(SheetState.this, null), 3, null);
                        final Function0<Unit> function03 = function0;
                        launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th) {
                                function03.invoke();
                            }
                        });
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new AnonymousClass1(animatable222, null), 3, null);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new AnonymousClass2(SheetState.this, null), 3, null);
                    }
                }

                /* compiled from: ModalBottomSheet.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$predictiveBackProgress = animatable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$predictiveBackProgress, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
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

                /* compiled from: ModalBottomSheet.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SheetState $sheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(SheetState sheetState, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$sheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$sheetState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
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

                /* compiled from: ModalBottomSheet.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
                static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SheetState $sheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(SheetState sheetState, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.$sheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass3(this.$sheetState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$sheetState.hide(this) == coroutine_suspended) {
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
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final long j13222 = j7;
            final SheetState sheetState5222 = sheetState2;
            final Modifier modifier5222 = modifier3;
            final float f9222 = f5;
            final Shape shape7222 = shape5;
            final float f10222 = f6;
            final Function2<? super Composer, ? super Integer, Unit> function26222 = function23;
            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27222 = function24;
            ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) rememberedValue5, modalBottomSheetProperties2, animatable222, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

                public final void invoke(Composer composer2, int i22) {
                    ComposerKt.sourceInformation(composer2, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                    if ((i22 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-314673510, i22, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                        }
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                            }
                        }, 1, null);
                        long j142 = j13222;
                        Function0<Unit> function03 = function02222;
                        SheetState sheetState62 = sheetState5222;
                        Animatable<Float, AnimationVector1D> animatable2222 = animatable222;
                        CoroutineScope coroutineScope2222 = coroutineScope222;
                        Function1<Float, Unit> function12222 = function1222;
                        Modifier modifier62 = modifier5222;
                        float f112 = f9222;
                        Shape shape8 = shape7222;
                        long j15 = j12222;
                        long j16 = j11222;
                        float f12 = f10222;
                        Function2<Composer, Integer, Unit> function282 = function26222;
                        Function2<Composer, Integer, WindowInsets> function29 = function27222;
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, semantics$default);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                        ModalBottomSheetKt.m1924Scrim3JVO9M(j142, function03, sheetState62.getTargetValue() != SheetValue.Hidden, composer2, 0);
                        ModalBottomSheetKt.m1923ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable2222, coroutineScope2222, function03, function12222, modifier62, sheetState62, f112, shape8, j15, j16, f12, function282, function29, function32, composer2, 6 | (Animatable.$stable << 3), 0, 0);
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
            }, startRestartGroup, 54), startRestartGroup, (i19222 & 112) | 3072 | (Animatable.$stable << 6));
            if (sheetState2.getHasExpandedState()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            f7 = f6;
            j8 = j11222;
            shape6 = shape5;
            f8 = f5;
            j9 = j7;
            function25 = function24;
            modalBottomSheetProperties3 = modalBottomSheetProperties2;
            j10 = j12222;
            modifier4 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((100663296 & i) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        if ((i2 & 6) != 0) {
        }
        i9 = i3 & 2048;
        if (i9 == 0) {
        }
        int i18222 = i8;
        if ((i3 & 4096) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i17 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        SheetState sheetState42222 = sheetState3;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if (i9 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i192222 = i12;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
        int i202222 = (i11 & 896) ^ 384;
        final long j112222 = j4;
        int i212222 = i11 & 14;
        final long j122222 = j5;
        changedInstance = (i212222 == 4) | ((i202222 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Job launch$default;
                if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                    launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                    final SheetState sheetState52222 = SheetState.this;
                    final Function0<Unit> function022222 = function0;
                    launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            if (SheetState.this.isVisible()) {
                                return;
                            }
                            function022222.invoke();
                        }
                    });
                }
            }

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ SheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sheetState = sheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$sheetState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$sheetState.hide(this) == coroutine_suspended) {
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
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        final Function0<Unit> function022222 = (Function0) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
        changedInstance2 = startRestartGroup.changedInstance(coroutineScope2222) | ((i202222 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | (i212222 == 4);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f92222) {
                invoke(f92222.floatValue());
                return Unit.INSTANCE;
            }

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ float $it;
                final /* synthetic */ SheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SheetState sheetState, float f, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$sheetState = sheetState;
                    this.$it = f;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$sheetState, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
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

            public final void invoke(float f92222) {
                Job launch$default;
                launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(sheetState2, f92222, null), 3, null);
                final SheetState sheetState52222 = sheetState2;
                final Function0<Unit> function03 = function0;
                launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        if (SheetState.this.isVisible()) {
                            return;
                        }
                        function03.invoke();
                    }
                });
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        final Function1<? super Float, Unit> function12222 = (Function1) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        final Animatable<Float, AnimationVector1D> animatable2222 = (Animatable) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
        changedInstance3 = ((i202222 <= 256 && startRestartGroup.changed(sheetState2)) || (i11 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2222) | startRestartGroup.changedInstance(animatable2222) | (i212222 == 4);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Job launch$default;
                if (SheetState.this.getCurrentValue() != SheetValue.Expanded || !SheetState.this.getHasPartiallyExpandedState()) {
                    launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new AnonymousClass3(SheetState.this, null), 3, null);
                    final Function0<Unit> function03 = function0;
                    launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            function03.invoke();
                        }
                    });
                } else {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new AnonymousClass1(animatable2222, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new AnonymousClass2(SheetState.this, null), 3, null);
                }
            }

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$predictiveBackProgress = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$predictiveBackProgress, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
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

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ SheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SheetState sheetState, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$sheetState = sheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$sheetState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
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

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ SheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(SheetState sheetState, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$sheetState = sheetState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.$sheetState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$sheetState.hide(this) == coroutine_suspended) {
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
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final long j132222 = j7;
        final SheetState sheetState52222 = sheetState2;
        final Modifier modifier52222 = modifier3;
        final float f92222 = f5;
        final Shape shape72222 = shape5;
        final float f102222 = f6;
        final Function2<? super Composer, ? super Integer, Unit> function262222 = function23;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function272222 = function24;
        ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) rememberedValue5, modalBottomSheetProperties2, animatable2222, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

            public final void invoke(Composer composer2, int i22) {
                ComposerKt.sourceInformation(composer2, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                if ((i22 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-314673510, i22, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        }
                    }, 1, null);
                    long j142 = j132222;
                    Function0<Unit> function03 = function022222;
                    SheetState sheetState62 = sheetState52222;
                    Animatable<Float, AnimationVector1D> animatable22222 = animatable2222;
                    CoroutineScope coroutineScope22222 = coroutineScope2222;
                    Function1<Float, Unit> function122222 = function12222;
                    Modifier modifier62 = modifier52222;
                    float f112 = f92222;
                    Shape shape8 = shape72222;
                    long j15 = j122222;
                    long j16 = j112222;
                    float f12 = f102222;
                    Function2<Composer, Integer, Unit> function282 = function262222;
                    Function2<Composer, Integer, WindowInsets> function29 = function272222;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, semantics$default);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                    ModalBottomSheetKt.m1924Scrim3JVO9M(j142, function03, sheetState62.getTargetValue() != SheetValue.Hidden, composer2, 0);
                    ModalBottomSheetKt.m1923ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable22222, coroutineScope22222, function03, function122222, modifier62, sheetState62, f112, shape8, j15, j16, f12, function282, function29, function32, composer2, 6 | (Animatable.$stable << 3), 0, 0);
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
        }, startRestartGroup, 54), startRestartGroup, (i192222 & 112) | 3072 | (Animatable.$stable << 6));
        if (sheetState2.getHasExpandedState()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        f7 = f6;
        j8 = j112222;
        shape6 = shape5;
        f8 = f5;
        j9 = j7;
        function25 = function24;
        modalBottomSheetProperties3 = modalBottomSheetProperties2;
        j10 = j122222;
        modifier4 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0198, code lost:
    
        if (r0.changedInstance(r62) == false) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f3  */
    /* renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1923ModalBottomSheetContentIQkwcL4(final BoxScope boxScope, final Animatable<Float, AnimationVector1D> animatable, final CoroutineScope coroutineScope, final Function0<Unit> function0, final Function1<? super Float, Unit> function1, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        SheetState sheetState2;
        Shape shape2;
        SheetState sheetState3;
        Shape shape3;
        long j3;
        long j4;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function23;
        int i10;
        float f3;
        float f4;
        int i11;
        final SheetState sheetState4;
        long j5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape4;
        int i12;
        float f5;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        boolean z3;
        Object rememberedValue3;
        Modifier draggable;
        boolean changed;
        Object rememberedValue4;
        boolean z4;
        Object rememberedValue5;
        final float f6;
        final SheetState sheetState5;
        final Shape shape5;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final long j6;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function26;
        final float f7;
        final long j7;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1676960531);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetContent)P(7,8!1,9,6,12,11:c#ui.unit.Dp,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.unit.Dp,5,4)205@9432L31,207@9563L13,208@9626L14,209@9668L31,215@10018L48,224@10294L324,232@10728L1476,267@12552L23,269@12621L112,273@12765L612,288@13518L2623,217@10072L6069:ModalBottomSheet.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(coroutineScope) ? 256 : 128;
            int i14 = 2048;
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
                if ((i3 & 8) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                }
                i5 = i3 & 16;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(sheetState)) ? 1048576 : 524288;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(shape)) {
                        i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i4 |= i13;
                    }
                    i13 = 33554432;
                    i4 |= i13;
                }
                if ((i & 805306368) == 0) {
                    i4 |= ((i3 & 256) == 0 && startRestartGroup.changed(j)) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i7 = (((i3 & 512) == 0 && startRestartGroup.changed(j2)) ? 4 : 2) | i2;
                } else {
                    i7 = i2;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i7 |= 48;
                } else if ((i2 & 48) == 0) {
                    i7 |= startRestartGroup.changed(f2) ? 32 : 16;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i7 |= 384;
                } else if ((i2 & 384) == 0) {
                    i7 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
                    if ((i2 & 3072) == 0) {
                        if ((i3 & 4096) != 0) {
                        }
                        i14 = 1024;
                        i7 |= i14;
                    }
                    if ((i3 & 8192) == 0) {
                        i7 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i7 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                        if ((i4 & 306783379) == 306783378 || (i7 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i3 & 32) != 0) {
                                    sheetState2 = rememberModalBottomSheetState(false, null, startRestartGroup, 0, 3);
                                    i4 &= -3670017;
                                } else {
                                    sheetState2 = sheetState;
                                }
                                float m1472getSheetMaxWidthD9Ej5fM = i6 != 0 ? BottomSheetDefaults.INSTANCE.m1472getSheetMaxWidthD9Ej5fM() : f;
                                Modifier modifier4 = companion;
                                if ((i3 & 128) != 0) {
                                    shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                    i4 &= -234881025;
                                } else {
                                    shape2 = shape;
                                }
                                if ((i3 & 256) != 0) {
                                    sheetState3 = sheetState2;
                                    i4 &= -1879048193;
                                    shape3 = shape2;
                                    j3 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                } else {
                                    sheetState3 = sheetState2;
                                    shape3 = shape2;
                                    j3 = j;
                                }
                                if ((i3 & 512) != 0) {
                                    j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 27) & 14);
                                    i7 &= -15;
                                } else {
                                    j4 = j2;
                                }
                                float m1471getElevationD9Ej5fM = i8 != 0 ? BottomSheetDefaults.INSTANCE.m1471getElevationD9Ej5fM() : f2;
                                Function2<? super Composer, ? super Integer, Unit> m1650getLambda2$material3_release = i9 != 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m1650getLambda2$material3_release() : function2;
                                if ((i3 & 4096) != 0) {
                                    i10 = i4;
                                    function23 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1
                                        public final WindowInsets invoke(Composer composer2, int i15) {
                                            composer2.startReplaceGroup(-11444670);
                                            ComposerKt.sourceInformation(composer2, "C212@9919L12:ModalBottomSheet.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-11444670, i15, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:212)");
                                            }
                                            WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer2, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceGroup();
                                            return windowInsets;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer2, Integer num) {
                                            return invoke(composer2, num.intValue());
                                        }
                                    };
                                    i11 = i7 & (-7169);
                                    sheetState4 = sheetState3;
                                    j5 = j4;
                                    f3 = m1471getElevationD9Ej5fM;
                                    function24 = m1650getLambda2$material3_release;
                                    f4 = m1472getSheetMaxWidthD9Ej5fM;
                                    modifier2 = modifier4;
                                } else {
                                    function23 = function22;
                                    i10 = i4;
                                    f3 = m1471getElevationD9Ej5fM;
                                    f4 = m1472getSheetMaxWidthD9Ej5fM;
                                    i11 = i7;
                                    sheetState4 = sheetState3;
                                    j5 = j4;
                                    modifier2 = modifier4;
                                    function24 = m1650getLambda2$material3_release;
                                }
                                shape4 = shape3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -1879048193;
                                }
                                if ((i3 & 512) != 0) {
                                    i7 &= -15;
                                }
                                if ((i3 & 4096) != 0) {
                                    i7 &= -7169;
                                }
                                f4 = f;
                                shape4 = shape;
                                j3 = j;
                                j5 = j2;
                                f3 = f2;
                                function23 = function22;
                                i10 = i4;
                                i11 = i7;
                                sheetState4 = sheetState;
                                function24 = function2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1676960531, i10, i11, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)");
                            }
                            Strings.Companion companion2 = Strings.INSTANCE;
                            final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_pane_title), startRestartGroup, 0);
                            Modifier modifier5 = modifier2;
                            float f8 = f3;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m733widthInVpY3zN4$default(boxScope.align(modifier2, Alignment.INSTANCE.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            i12 = (3670016 & i10) ^ 1572864;
                            if (i12 > 1048576 || !startRestartGroup.changed(sheetState4)) {
                                f5 = f4;
                                if ((i10 & 1572864) != 1048576) {
                                    z = false;
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState4, Orientation.Vertical, function1);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long j8 = j3;
                                    Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(fillMaxWidth$default, (NestedScrollConnection) rememberedValue, null, 2, null);
                                    AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState4.getAnchoredDraggableState$material3_release();
                                    Orientation orientation = Orientation.Vertical;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    z2 = (i12 <= 1048576 && startRestartGroup.changed(sheetState4)) || (i10 & 1572864) == 1048576;
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                            public /* synthetic */ class WhenMappings {
                                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                static {
                                                    int[] iArr = new int[SheetValue.values().length];
                                                    try {
                                                        iArr[SheetValue.Hidden.ordinal()] = 1;
                                                    } catch (NoSuchFieldError unused) {
                                                    }
                                                    try {
                                                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                                    } catch (NoSuchFieldError unused2) {
                                                    }
                                                    try {
                                                        iArr[SheetValue.Expanded.ordinal()] = 3;
                                                    } catch (NoSuchFieldError unused3) {
                                                    }
                                                    $EnumSwitchMapping$0 = iArr;
                                                }
                                            }

                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                                return m1926invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                            }

                                            /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                            public final Pair<DraggableAnchors<SheetValue>, SheetValue> m1926invokeGpV2Q24(final long j9, long j10) {
                                                SheetValue sheetValue;
                                                final float m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j10);
                                                final SheetState sheetState6 = SheetState.this;
                                                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                        invoke2(draggableAnchorsConfig);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                        draggableAnchorsConfig.at(SheetValue.Hidden, m6251getMaxHeightimpl);
                                                        if (IntSize.m6468getHeightimpl(j9) > m6251getMaxHeightimpl / 2 && !sheetState6.getSkipPartiallyExpanded()) {
                                                            draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, m6251getMaxHeightimpl / 2.0f);
                                                        }
                                                        if (IntSize.m6468getHeightimpl(j9) != 0) {
                                                            draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, m6251getMaxHeightimpl - IntSize.m6468getHeightimpl(j9)));
                                                        }
                                                    }
                                                });
                                                int i15 = WhenMappings.$EnumSwitchMapping$0[SheetState.this.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                                                if (i15 == 1) {
                                                    sheetValue = SheetValue.Hidden;
                                                } else if (i15 == 2 || i15 == 3) {
                                                    if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                                        sheetValue = SheetValue.PartiallyExpanded;
                                                    } else {
                                                        sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                                                    }
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                return TuplesKt.to(DraggableAnchors, sheetValue);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier draggableAnchors = AnchoredDraggableKt.draggableAnchors(nestedScroll$default, anchoredDraggableState$material3_release, orientation, (Function2) rememberedValue2);
                                    DraggableState draggableState = sheetState4.getAnchoredDraggableState$material3_release().getDraggableState();
                                    Orientation orientation2 = Orientation.Vertical;
                                    boolean isVisible = sheetState4.isVisible();
                                    boolean isAnimationRunning = sheetState4.getAnchoredDraggableState$material3_release().isAnimationRunning();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    z3 = (57344 & i10) != 16384;
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    draggable = DraggableKt.draggable(draggableAnchors, draggableState, orientation2, (r20 & 4) != 0 ? true : isVisible, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : isAnimationRunning, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    changed = startRestartGroup.changed(m2655getString2EP1pXo);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo);
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(draggable, false, (Function1) rememberedValue4, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    z4 = ((i12 <= 1048576 && startRestartGroup.changed(sheetState4)) || (i10 & 1572864) == 1048576) | ((i10 & 112) != 32 || ((i10 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!z4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                invoke2(graphicsLayerScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                float calculatePredictiveBackScaleX;
                                                float calculatePredictiveBackScaleY;
                                                float offset = SheetState.this.getAnchoredDraggableState$material3_release().getOffset();
                                                float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
                                                if (Float.isNaN(offset) || Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
                                                    return;
                                                }
                                                float floatValue = animatable.getValue().floatValue();
                                                calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                                graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                                                calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                                graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                                                graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + m3665getHeightimpl) / m3665getHeightimpl));
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27 = function23;
                                    final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
                                    final SheetState sheetState6 = sheetState4;
                                    int i15 = i10 >> 21;
                                    int i16 = i11 << 9;
                                    SurfaceKt.m2223SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(semantics$default, (Function1) rememberedValue5), shape4, j8, j5, f8, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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
                                            String str;
                                            ComposerKt.sourceInformation(composer2, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                                            if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-692668920, i17, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                                }
                                                Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function27.invoke(composer2, 0));
                                                ComposerKt.sourceInformationMarkerStart(composer2, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                boolean changedInstance = composer2.changedInstance(animatable);
                                                final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                                Object rememberedValue6 = composer2.rememberedValue();
                                                if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                            invoke2(graphicsLayerScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                            float calculatePredictiveBackScaleX;
                                                            float calculatePredictiveBackScaleY;
                                                            long j9;
                                                            float floatValue = animatable2.getValue().floatValue();
                                                            calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                                            calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                                            graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY == 0.0f ? 1.0f : calculatePredictiveBackScaleX / calculatePredictiveBackScaleY);
                                                            j9 = ModalBottomSheetKt.PredictiveBackChildTransformOrigin;
                                                            graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(j9);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue6);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(windowInsetsPadding, (Function1) rememberedValue6);
                                                Function2<Composer, Integer, Unit> function29 = function28;
                                                final SheetState sheetState7 = sheetState6;
                                                final Function0<Unit> function02 = function0;
                                                final CoroutineScope coroutineScope2 = coroutineScope;
                                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
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
                                                ComposerKt.sourceInformationMarkerStart(composer2, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                                                composer2.startReplaceGroup(-1636564008);
                                                ComposerKt.sourceInformation(composer2, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                                                if (function29 != null) {
                                                    Strings.Companion companion3 = Strings.INSTANCE;
                                                    final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                                                    Strings.Companion companion4 = Strings.INSTANCE;
                                                    final String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                                                    Strings.Companion companion5 = Strings.INSTANCE;
                                                    final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                                                    Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                                                    ComposerKt.sourceInformationMarkerStart(composer2, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                    boolean changed2 = composer2.changed(sheetState7) | composer2.changed(m2655getString2EP1pXo3) | composer2.changed(function02) | composer2.changed(m2655getString2EP1pXo4) | composer2.changedInstance(coroutineScope2) | composer2.changed(m2655getString2EP1pXo2);
                                                    Object rememberedValue7 = composer2.rememberedValue();
                                                    if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                                        rememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                final SheetState sheetState8 = SheetState.this;
                                                                String str2 = m2655getString2EP1pXo3;
                                                                String str3 = m2655getString2EP1pXo4;
                                                                String str4 = m2655getString2EP1pXo2;
                                                                final Function0<Unit> function03 = function02;
                                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Boolean invoke() {
                                                                        function03.invoke();
                                                                        return true;
                                                                    }
                                                                });
                                                                if (sheetState8.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                                    SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* compiled from: ModalBottomSheet.kt */
                                                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ SheetState $sheetState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$sheetState = sheetState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$sheetState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$sheetState.expand(this) == coroutine_suspended) {
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

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState8, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }
                                                                    });
                                                                } else if (sheetState8.getHasPartiallyExpandedState()) {
                                                                    SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: ModalBottomSheet.kt */
                                                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ SheetState $this_with;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$this_with = sheetState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$this_with, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$this_with.partialExpand(this) == coroutine_suspended) {
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
                                                                    });
                                                                }
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(rememberedValue7);
                                                    } else {
                                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    Modifier semantics = SemanticsModifierKt.semantics(align, true, (Function1) rememberedValue7);
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, semantics);
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
                                                    ComposerKt.sourceInformationMarkerStart(composer2, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                                                    function29.invoke(composer2, 0);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                }
                                                composer2.endReplaceGroup();
                                                function32.invoke(columnScopeInstance, composer2, 6);
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
                                    }, startRestartGroup, 54), startRestartGroup, (i15 & 896) | (i15 & 112) | 12582912 | (i16 & 7168) | (i16 & 57344), 96);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f6 = f8;
                                    sheetState5 = sheetState4;
                                    shape5 = shape4;
                                    function25 = function24;
                                    j6 = j5;
                                    function26 = function23;
                                    f7 = f5;
                                    j7 = j8;
                                    modifier3 = modifier5;
                                }
                            } else {
                                f5 = f4;
                            }
                            z = true;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z) {
                            }
                            rememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState4, Orientation.Vertical, function1);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long j82 = j3;
                            Modifier nestedScroll$default2 = NestedScrollModifierKt.nestedScroll$default(fillMaxWidth$default, (NestedScrollConnection) rememberedValue, null, 2, null);
                            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release2 = sheetState4.getAnchoredDraggableState$material3_release();
                            Orientation orientation3 = Orientation.Vertical;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            if (i12 <= 1048576) {
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                            }
                            rememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[SheetValue.values().length];
                                        try {
                                            iArr[SheetValue.Hidden.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        try {
                                            iArr[SheetValue.Expanded.ordinal()] = 3;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                    return m1926invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                }

                                /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                public final Pair<DraggableAnchors<SheetValue>, SheetValue> m1926invokeGpV2Q24(final long j9, long j10) {
                                    SheetValue sheetValue;
                                    final float m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j10);
                                    final SheetState sheetState62 = SheetState.this;
                                    DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                            invoke2(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                            draggableAnchorsConfig.at(SheetValue.Hidden, m6251getMaxHeightimpl);
                                            if (IntSize.m6468getHeightimpl(j9) > m6251getMaxHeightimpl / 2 && !sheetState62.getSkipPartiallyExpanded()) {
                                                draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, m6251getMaxHeightimpl / 2.0f);
                                            }
                                            if (IntSize.m6468getHeightimpl(j9) != 0) {
                                                draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, m6251getMaxHeightimpl - IntSize.m6468getHeightimpl(j9)));
                                            }
                                        }
                                    });
                                    int i152 = WhenMappings.$EnumSwitchMapping$0[SheetState.this.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                                    if (i152 == 1) {
                                        sheetValue = SheetValue.Hidden;
                                    } else if (i152 == 2 || i152 == 3) {
                                        if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                            sheetValue = SheetValue.PartiallyExpanded;
                                        } else {
                                            sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return TuplesKt.to(DraggableAnchors, sheetValue);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier draggableAnchors2 = AnchoredDraggableKt.draggableAnchors(nestedScroll$default2, anchoredDraggableState$material3_release2, orientation3, (Function2) rememberedValue2);
                            DraggableState draggableState2 = sheetState4.getAnchoredDraggableState$material3_release().getDraggableState();
                            Orientation orientation22 = Orientation.Vertical;
                            boolean isVisible2 = sheetState4.isVisible();
                            boolean isAnimationRunning2 = sheetState4.getAnchoredDraggableState$material3_release().isAnimationRunning();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            if ((57344 & i10) != 16384) {
                            }
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z3) {
                            }
                            rememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            draggable = DraggableKt.draggable(draggableAnchors2, draggableState2, orientation22, (r20 & 4) != 0 ? true : isVisible2, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : isAnimationRunning2, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            changed = startRestartGroup.changed(m2655getString2EP1pXo);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo);
                                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(draggable, false, (Function1) rememberedValue4, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            z4 = ((i12 <= 1048576 && startRestartGroup.changed(sheetState4)) || (i10 & 1572864) == 1048576) | ((i10 & 112) != 32 || ((i10 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!z4) {
                            }
                            rememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                    invoke2(graphicsLayerScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                    float calculatePredictiveBackScaleX;
                                    float calculatePredictiveBackScaleY;
                                    float offset = SheetState.this.getAnchoredDraggableState$material3_release().getOffset();
                                    float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
                                    if (Float.isNaN(offset) || Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
                                        return;
                                    }
                                    float floatValue = animatable.getValue().floatValue();
                                    calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                    graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                                    calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                    graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                                    graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + m3665getHeightimpl) / m3665getHeightimpl));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function272 = function23;
                            final Function2<? super Composer, ? super Integer, Unit> function282 = function24;
                            final SheetState sheetState62 = sheetState4;
                            int i152 = i10 >> 21;
                            int i162 = i11 << 9;
                            SurfaceKt.m2223SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(semantics$default2, (Function1) rememberedValue5), shape4, j82, j5, f8, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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
                                    String str;
                                    ComposerKt.sourceInformation(composer2, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                                    if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-692668920, i17, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                        }
                                        Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function272.invoke(composer2, 0));
                                        ComposerKt.sourceInformationMarkerStart(composer2, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                        boolean changedInstance = composer2.changedInstance(animatable);
                                        final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                        Object rememberedValue6 = composer2.rememberedValue();
                                        if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                    invoke2(graphicsLayerScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                    float calculatePredictiveBackScaleX;
                                                    float calculatePredictiveBackScaleY;
                                                    long j9;
                                                    float floatValue = animatable2.getValue().floatValue();
                                                    calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                                    calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                                    graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY == 0.0f ? 1.0f : calculatePredictiveBackScaleX / calculatePredictiveBackScaleY);
                                                    j9 = ModalBottomSheetKt.PredictiveBackChildTransformOrigin;
                                                    graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(j9);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue6);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(windowInsetsPadding, (Function1) rememberedValue6);
                                        Function2<Composer, Integer, Unit> function29 = function282;
                                        final SheetState sheetState7 = sheetState62;
                                        final Function0<Unit> function02 = function0;
                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
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
                                        ComposerKt.sourceInformationMarkerStart(composer2, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                                        composer2.startReplaceGroup(-1636564008);
                                        ComposerKt.sourceInformation(composer2, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                                        if (function29 != null) {
                                            Strings.Companion companion3 = Strings.INSTANCE;
                                            final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                                            Strings.Companion companion4 = Strings.INSTANCE;
                                            final String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                                            Strings.Companion companion5 = Strings.INSTANCE;
                                            final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                                            Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                            boolean changed2 = composer2.changed(sheetState7) | composer2.changed(m2655getString2EP1pXo3) | composer2.changed(function02) | composer2.changed(m2655getString2EP1pXo4) | composer2.changedInstance(coroutineScope2) | composer2.changed(m2655getString2EP1pXo2);
                                            Object rememberedValue7 = composer2.rememberedValue();
                                            if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                                rememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        final SheetState sheetState8 = SheetState.this;
                                                        String str2 = m2655getString2EP1pXo3;
                                                        String str3 = m2655getString2EP1pXo4;
                                                        String str4 = m2655getString2EP1pXo2;
                                                        final Function0<Unit> function03 = function02;
                                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                                        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                function03.invoke();
                                                                return true;
                                                            }
                                                        });
                                                        if (sheetState8.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* compiled from: ModalBottomSheet.kt */
                                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ SheetState $sheetState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$sheetState = sheetState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$sheetState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$sheetState.expand(this) == coroutine_suspended) {
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

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState8, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }
                                                            });
                                                        } else if (sheetState8.getHasPartiallyExpandedState()) {
                                                            SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }

                                                                /* compiled from: ModalBottomSheet.kt */
                                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ SheetState $this_with;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$this_with = sheetState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$this_with, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$this_with.partialExpand(this) == coroutine_suspended) {
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
                                                            });
                                                        }
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue7);
                                            } else {
                                                str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Modifier semantics = SemanticsModifierKt.semantics(align, true, (Function1) rememberedValue7);
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, semantics);
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
                                            ComposerKt.sourceInformationMarkerStart(composer2, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                                            function29.invoke(composer2, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                        }
                                        composer2.endReplaceGroup();
                                        function32.invoke(columnScopeInstance, composer2, 6);
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
                            }, startRestartGroup, 54), startRestartGroup, (i152 & 896) | (i152 & 112) | 12582912 | (i162 & 7168) | (i162 & 57344), 96);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f6 = f8;
                            sheetState5 = sheetState4;
                            shape5 = shape4;
                            function25 = function24;
                            j6 = j5;
                            function26 = function23;
                            f7 = f5;
                            j7 = j82;
                            modifier3 = modifier5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            sheetState5 = sheetState;
                            f7 = f;
                            shape5 = shape;
                            j6 = j2;
                            f6 = f2;
                            function25 = function2;
                            function26 = function22;
                            modifier3 = modifier2;
                            j7 = j;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$8
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
                                    ModalBottomSheetKt.m1923ModalBottomSheetContentIQkwcL4(BoxScope.this, animatable, coroutineScope, function0, function1, modifier3, sheetState5, f7, shape5, j7, j6, f6, function25, function26, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    Modifier modifier42 = companion;
                    if ((i3 & 128) != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 4096) != 0) {
                    }
                    shape4 = shape3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Strings.Companion companion22 = Strings.INSTANCE;
                    final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_pane_title), startRestartGroup, 0);
                    Modifier modifier52 = modifier2;
                    float f82 = f3;
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m733widthInVpY3zN4$default(boxScope.align(modifier2, Alignment.INSTANCE.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    i12 = (3670016 & i10) ^ 1572864;
                    if (i12 > 1048576) {
                    }
                    f5 = f4;
                    if ((i10 & 1572864) != 1048576) {
                    }
                    z = true;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState4, Orientation.Vertical, function1);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long j822 = j3;
                    Modifier nestedScroll$default22 = NestedScrollModifierKt.nestedScroll$default(fillMaxWidth$default2, (NestedScrollConnection) rememberedValue, null, 2, null);
                    AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release22 = sheetState4.getAnchoredDraggableState$material3_release();
                    Orientation orientation32 = Orientation.Vertical;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    if (i12 <= 1048576) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[SheetValue.values().length];
                                try {
                                    iArr[SheetValue.Hidden.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[SheetValue.Expanded.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                            return m1926invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                        }

                        /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                        public final Pair<DraggableAnchors<SheetValue>, SheetValue> m1926invokeGpV2Q24(final long j9, long j10) {
                            SheetValue sheetValue;
                            final float m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j10);
                            final SheetState sheetState622 = SheetState.this;
                            DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                    invoke2(draggableAnchorsConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                    draggableAnchorsConfig.at(SheetValue.Hidden, m6251getMaxHeightimpl);
                                    if (IntSize.m6468getHeightimpl(j9) > m6251getMaxHeightimpl / 2 && !sheetState622.getSkipPartiallyExpanded()) {
                                        draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, m6251getMaxHeightimpl / 2.0f);
                                    }
                                    if (IntSize.m6468getHeightimpl(j9) != 0) {
                                        draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, m6251getMaxHeightimpl - IntSize.m6468getHeightimpl(j9)));
                                    }
                                }
                            });
                            int i1522 = WhenMappings.$EnumSwitchMapping$0[SheetState.this.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                            if (i1522 == 1) {
                                sheetValue = SheetValue.Hidden;
                            } else if (i1522 == 2 || i1522 == 3) {
                                if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                    sheetValue = SheetValue.PartiallyExpanded;
                                } else {
                                    sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            return TuplesKt.to(DraggableAnchors, sheetValue);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier draggableAnchors22 = AnchoredDraggableKt.draggableAnchors(nestedScroll$default22, anchoredDraggableState$material3_release22, orientation32, (Function2) rememberedValue2);
                    DraggableState draggableState22 = sheetState4.getAnchoredDraggableState$material3_release().getDraggableState();
                    Orientation orientation222 = Orientation.Vertical;
                    boolean isVisible22 = sheetState4.isVisible();
                    boolean isAnimationRunning22 = sheetState4.getAnchoredDraggableState$material3_release().isAnimationRunning();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    if ((57344 & i10) != 16384) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    draggable = DraggableKt.draggable(draggableAnchors22, draggableState22, orientation222, (r20 & 4) != 0 ? true : isVisible22, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : isAnimationRunning22, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    changed = startRestartGroup.changed(m2655getString2EP1pXo2);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo2);
                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier semantics$default22 = SemanticsModifierKt.semantics$default(draggable, false, (Function1) rememberedValue4, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    z4 = ((i12 <= 1048576 && startRestartGroup.changed(sheetState4)) || (i10 & 1572864) == 1048576) | ((i10 & 112) != 32 || ((i10 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                            float calculatePredictiveBackScaleX;
                            float calculatePredictiveBackScaleY;
                            float offset = SheetState.this.getAnchoredDraggableState$material3_release().getOffset();
                            float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
                            if (Float.isNaN(offset) || Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
                                return;
                            }
                            float floatValue = animatable.getValue().floatValue();
                            calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                            graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                            calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                            graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                            graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + m3665getHeightimpl) / m3665getHeightimpl));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function2722 = function23;
                    final Function2<? super Composer, ? super Integer, Unit> function2822 = function24;
                    final SheetState sheetState622 = sheetState4;
                    int i1522 = i10 >> 21;
                    int i1622 = i11 << 9;
                    SurfaceKt.m2223SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(semantics$default22, (Function1) rememberedValue5), shape4, j822, j5, f82, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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
                            String str;
                            ComposerKt.sourceInformation(composer2, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                            if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-692668920, i17, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                }
                                Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function2722.invoke(composer2, 0));
                                ComposerKt.sourceInformationMarkerStart(composer2, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                boolean changedInstance = composer2.changedInstance(animatable);
                                final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                Object rememberedValue6 = composer2.rememberedValue();
                                if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            float calculatePredictiveBackScaleX;
                                            float calculatePredictiveBackScaleY;
                                            long j9;
                                            float floatValue = animatable2.getValue().floatValue();
                                            calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                            calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                            graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY == 0.0f ? 1.0f : calculatePredictiveBackScaleX / calculatePredictiveBackScaleY);
                                            j9 = ModalBottomSheetKt.PredictiveBackChildTransformOrigin;
                                            graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(j9);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue6);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(windowInsetsPadding, (Function1) rememberedValue6);
                                Function2<Composer, Integer, Unit> function29 = function2822;
                                final SheetState sheetState7 = sheetState622;
                                final Function0<Unit> function02 = function0;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
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
                                ComposerKt.sourceInformationMarkerStart(composer2, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                                composer2.startReplaceGroup(-1636564008);
                                ComposerKt.sourceInformation(composer2, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                                if (function29 != null) {
                                    Strings.Companion companion3 = Strings.INSTANCE;
                                    final String m2655getString2EP1pXo22 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                                    Strings.Companion companion4 = Strings.INSTANCE;
                                    final String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                                    Strings.Companion companion5 = Strings.INSTANCE;
                                    final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                                    Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    boolean changed2 = composer2.changed(sheetState7) | composer2.changed(m2655getString2EP1pXo3) | composer2.changed(function02) | composer2.changed(m2655getString2EP1pXo4) | composer2.changedInstance(coroutineScope2) | composer2.changed(m2655getString2EP1pXo22);
                                    Object rememberedValue7 = composer2.rememberedValue();
                                    if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                        rememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                final SheetState sheetState8 = SheetState.this;
                                                String str2 = m2655getString2EP1pXo3;
                                                String str3 = m2655getString2EP1pXo4;
                                                String str4 = m2655getString2EP1pXo22;
                                                final Function0<Unit> function03 = function02;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        function03.invoke();
                                                        return true;
                                                    }
                                                });
                                                if (sheetState8.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                    SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* compiled from: ModalBottomSheet.kt */
                                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ SheetState $sheetState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$sheetState = sheetState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$sheetState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$sheetState.expand(this) == coroutine_suspended) {
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

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState8, null), 3, null);
                                                            }
                                                            return true;
                                                        }
                                                    });
                                                } else if (sheetState8.getHasPartiallyExpandedState()) {
                                                    SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                                            }
                                                            return true;
                                                        }

                                                        /* compiled from: ModalBottomSheet.kt */
                                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                        @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ SheetState $this_with;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$this_with = sheetState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                return new AnonymousClass1(this.$this_with, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (this.$this_with.partialExpand(this) == coroutine_suspended) {
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
                                                    });
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue7);
                                    } else {
                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Modifier semantics = SemanticsModifierKt.semantics(align, true, (Function1) rememberedValue7);
                                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, semantics);
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
                                    ComposerKt.sourceInformationMarkerStart(composer2, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                                    function29.invoke(composer2, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                }
                                composer2.endReplaceGroup();
                                function32.invoke(columnScopeInstance, composer2, 6);
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
                    }, startRestartGroup, 54), startRestartGroup, (i1522 & 896) | (i1522 & 112) | 12582912 | (i1622 & 7168) | (i1622 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f6 = f82;
                    sheetState5 = sheetState4;
                    shape5 = shape4;
                    function25 = function24;
                    j6 = j5;
                    function26 = function23;
                    f7 = f5;
                    j7 = j822;
                    modifier3 = modifier52;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i2 & 3072) == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                Modifier modifier422 = companion;
                if ((i3 & 128) != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 4096) != 0) {
                }
                shape4 = shape3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Strings.Companion companion222 = Strings.INSTANCE;
                final String m2655getString2EP1pXo22 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_pane_title), startRestartGroup, 0);
                Modifier modifier522 = modifier2;
                float f822 = f3;
                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(SizeKt.m733widthInVpY3zN4$default(boxScope.align(modifier2, Alignment.INSTANCE.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
                i12 = (3670016 & i10) ^ 1572864;
                if (i12 > 1048576) {
                }
                f5 = f4;
                if ((i10 & 1572864) != 1048576) {
                }
                z = true;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState4, Orientation.Vertical, function1);
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long j8222 = j3;
                Modifier nestedScroll$default222 = NestedScrollModifierKt.nestedScroll$default(fillMaxWidth$default22, (NestedScrollConnection) rememberedValue, null, 2, null);
                AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release222 = sheetState4.getAnchoredDraggableState$material3_release();
                Orientation orientation322 = Orientation.Vertical;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
                if (i12 <= 1048576) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                    /* compiled from: ModalBottomSheet.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                        return m1926invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                    }

                    /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                    public final Pair<DraggableAnchors<SheetValue>, SheetValue> m1926invokeGpV2Q24(final long j9, long j10) {
                        SheetValue sheetValue;
                        final float m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j10);
                        final SheetState sheetState6222 = SheetState.this;
                        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                draggableAnchorsConfig.at(SheetValue.Hidden, m6251getMaxHeightimpl);
                                if (IntSize.m6468getHeightimpl(j9) > m6251getMaxHeightimpl / 2 && !sheetState6222.getSkipPartiallyExpanded()) {
                                    draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, m6251getMaxHeightimpl / 2.0f);
                                }
                                if (IntSize.m6468getHeightimpl(j9) != 0) {
                                    draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, m6251getMaxHeightimpl - IntSize.m6468getHeightimpl(j9)));
                                }
                            }
                        });
                        int i15222 = WhenMappings.$EnumSwitchMapping$0[SheetState.this.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                        if (i15222 == 1) {
                            sheetValue = SheetValue.Hidden;
                        } else if (i15222 == 2 || i15222 == 3) {
                            if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                sheetValue = SheetValue.PartiallyExpanded;
                            } else {
                                sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return TuplesKt.to(DraggableAnchors, sheetValue);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier draggableAnchors222 = AnchoredDraggableKt.draggableAnchors(nestedScroll$default222, anchoredDraggableState$material3_release222, orientation322, (Function2) rememberedValue2);
                DraggableState draggableState222 = sheetState4.getAnchoredDraggableState$material3_release().getDraggableState();
                Orientation orientation2222 = Orientation.Vertical;
                boolean isVisible222 = sheetState4.isVisible();
                boolean isAnimationRunning222 = sheetState4.getAnchoredDraggableState$material3_release().isAnimationRunning();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
                if ((57344 & i10) != 16384) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                draggable = DraggableKt.draggable(draggableAnchors222, draggableState222, orientation2222, (r20 & 4) != 0 ? true : isVisible222, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : isAnimationRunning222, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
                changed = startRestartGroup.changed(m2655getString2EP1pXo22);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo22);
                        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier semantics$default222 = SemanticsModifierKt.semantics$default(draggable, false, (Function1) rememberedValue4, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
                z4 = ((i12 <= 1048576 && startRestartGroup.changed(sheetState4)) || (i10 & 1572864) == 1048576) | ((i10 & 112) != 32 || ((i10 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        float calculatePredictiveBackScaleX;
                        float calculatePredictiveBackScaleY;
                        float offset = SheetState.this.getAnchoredDraggableState$material3_release().getOffset();
                        float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
                        if (Float.isNaN(offset) || Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
                            return;
                        }
                        float floatValue = animatable.getValue().floatValue();
                        calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                        calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                        graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                        graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + m3665getHeightimpl) / m3665getHeightimpl));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27222 = function23;
                final Function2<? super Composer, ? super Integer, Unit> function28222 = function24;
                final SheetState sheetState6222 = sheetState4;
                int i15222 = i10 >> 21;
                int i16222 = i11 << 9;
                SurfaceKt.m2223SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(semantics$default222, (Function1) rememberedValue5), shape4, j8222, j5, f822, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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
                        String str;
                        ComposerKt.sourceInformation(composer2, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-692668920, i17, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                            }
                            Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function27222.invoke(composer2, 0));
                            ComposerKt.sourceInformationMarkerStart(composer2, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            boolean changedInstance = composer2.changedInstance(animatable);
                            final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                            Object rememberedValue6 = composer2.rememberedValue();
                            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                        float calculatePredictiveBackScaleX;
                                        float calculatePredictiveBackScaleY;
                                        long j9;
                                        float floatValue = animatable2.getValue().floatValue();
                                        calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                        calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                        graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY == 0.0f ? 1.0f : calculatePredictiveBackScaleX / calculatePredictiveBackScaleY);
                                        j9 = ModalBottomSheetKt.PredictiveBackChildTransformOrigin;
                                        graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(j9);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(windowInsetsPadding, (Function1) rememberedValue6);
                            Function2<Composer, Integer, Unit> function29 = function28222;
                            final SheetState sheetState7 = sheetState6222;
                            final Function0<Unit> function02 = function0;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
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
                            ComposerKt.sourceInformationMarkerStart(composer2, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                            composer2.startReplaceGroup(-1636564008);
                            ComposerKt.sourceInformation(composer2, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                            if (function29 != null) {
                                Strings.Companion companion3 = Strings.INSTANCE;
                                final String m2655getString2EP1pXo222 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                                Strings.Companion companion4 = Strings.INSTANCE;
                                final String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                                Strings.Companion companion5 = Strings.INSTANCE;
                                final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                                Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                                ComposerKt.sourceInformationMarkerStart(composer2, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                boolean changed2 = composer2.changed(sheetState7) | composer2.changed(m2655getString2EP1pXo3) | composer2.changed(function02) | composer2.changed(m2655getString2EP1pXo4) | composer2.changedInstance(coroutineScope2) | composer2.changed(m2655getString2EP1pXo222);
                                Object rememberedValue7 = composer2.rememberedValue();
                                if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                    rememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            final SheetState sheetState8 = SheetState.this;
                                            String str2 = m2655getString2EP1pXo3;
                                            String str3 = m2655getString2EP1pXo4;
                                            String str4 = m2655getString2EP1pXo222;
                                            final Function0<Unit> function03 = function02;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    function03.invoke();
                                                    return true;
                                                }
                                            });
                                            if (sheetState8.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ SheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$sheetState.expand(this) == coroutine_suspended) {
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

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState8, null), 3, null);
                                                        }
                                                        return true;
                                                    }
                                                });
                                            } else if (sheetState8.getHasPartiallyExpandedState()) {
                                                SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                                        }
                                                        return true;
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ SheetState $this_with;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$this_with = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$this_with, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$this_with.partialExpand(this) == coroutine_suspended) {
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
                                                });
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue7);
                                } else {
                                    str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Modifier semantics = SemanticsModifierKt.semantics(align, true, (Function1) rememberedValue7);
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, semantics);
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
                                ComposerKt.sourceInformationMarkerStart(composer2, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                                function29.invoke(composer2, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                            }
                            composer2.endReplaceGroup();
                            function32.invoke(columnScopeInstance, composer2, 6);
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
                }, startRestartGroup, 54), startRestartGroup, (i15222 & 896) | (i15222 & 112) | 12582912 | (i16222 & 7168) | (i16222 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                }
                f6 = f822;
                sheetState5 = sheetState4;
                shape5 = shape4;
                function25 = function24;
                j6 = j5;
                function26 = function23;
                f7 = f5;
                j7 = j8222;
                modifier3 = modifier522;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            Modifier modifier4222 = companion;
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            shape4 = shape3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Strings.Companion companion2222 = Strings.INSTANCE;
            final String m2655getString2EP1pXo222 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_pane_title), startRestartGroup, 0);
            Modifier modifier5222 = modifier2;
            float f8222 = f3;
            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(SizeKt.m733widthInVpY3zN4$default(boxScope.align(modifier2, Alignment.INSTANCE.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
            i12 = (3670016 & i10) ^ 1572864;
            if (i12 > 1048576) {
            }
            f5 = f4;
            if ((i10 & 1572864) != 1048576) {
            }
            z = true;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState4, Orientation.Vertical, function1);
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long j82222 = j3;
            Modifier nestedScroll$default2222 = NestedScrollModifierKt.nestedScroll$default(fillMaxWidth$default222, (NestedScrollConnection) rememberedValue, null, 2, null);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release2222 = sheetState4.getAnchoredDraggableState$material3_release();
            Orientation orientation3222 = Orientation.Vertical;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
            if (i12 <= 1048576) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                /* compiled from: ModalBottomSheet.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[SheetValue.values().length];
                        try {
                            iArr[SheetValue.Hidden.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[SheetValue.Expanded.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                    return m1926invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                }

                /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                public final Pair<DraggableAnchors<SheetValue>, SheetValue> m1926invokeGpV2Q24(final long j9, long j10) {
                    SheetValue sheetValue;
                    final float m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j10);
                    final SheetState sheetState62222 = SheetState.this;
                    DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                            invoke2(draggableAnchorsConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                            draggableAnchorsConfig.at(SheetValue.Hidden, m6251getMaxHeightimpl);
                            if (IntSize.m6468getHeightimpl(j9) > m6251getMaxHeightimpl / 2 && !sheetState62222.getSkipPartiallyExpanded()) {
                                draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, m6251getMaxHeightimpl / 2.0f);
                            }
                            if (IntSize.m6468getHeightimpl(j9) != 0) {
                                draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, m6251getMaxHeightimpl - IntSize.m6468getHeightimpl(j9)));
                            }
                        }
                    });
                    int i152222 = WhenMappings.$EnumSwitchMapping$0[SheetState.this.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                    if (i152222 == 1) {
                        sheetValue = SheetValue.Hidden;
                    } else if (i152222 == 2 || i152222 == 3) {
                        if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                            sheetValue = SheetValue.PartiallyExpanded;
                        } else {
                            sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return TuplesKt.to(DraggableAnchors, sheetValue);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier draggableAnchors2222 = AnchoredDraggableKt.draggableAnchors(nestedScroll$default2222, anchoredDraggableState$material3_release2222, orientation3222, (Function2) rememberedValue2);
            DraggableState draggableState2222 = sheetState4.getAnchoredDraggableState$material3_release().getDraggableState();
            Orientation orientation22222 = Orientation.Vertical;
            boolean isVisible2222 = sheetState4.isVisible();
            boolean isAnimationRunning2222 = sheetState4.getAnchoredDraggableState$material3_release().isAnimationRunning();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
            if ((57344 & i10) != 16384) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            draggable = DraggableKt.draggable(draggableAnchors2222, draggableState2222, orientation22222, (r20 & 4) != 0 ? true : isVisible2222, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : isAnimationRunning2222, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
            changed = startRestartGroup.changed(m2655getString2EP1pXo222);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo222);
                    SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default2222 = SemanticsModifierKt.semantics$default(draggable, false, (Function1) rememberedValue4, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
            z4 = ((i12 <= 1048576 && startRestartGroup.changed(sheetState4)) || (i10 & 1572864) == 1048576) | ((i10 & 112) != 32 || ((i10 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                    float calculatePredictiveBackScaleX;
                    float calculatePredictiveBackScaleY;
                    float offset = SheetState.this.getAnchoredDraggableState$material3_release().getOffset();
                    float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
                    if (Float.isNaN(offset) || Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
                        return;
                    }
                    float floatValue = animatable.getValue().floatValue();
                    calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                    graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                    calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                    graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                    graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + m3665getHeightimpl) / m3665getHeightimpl));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function272222 = function23;
            final Function2<? super Composer, ? super Integer, Unit> function282222 = function24;
            final SheetState sheetState62222 = sheetState4;
            int i152222 = i10 >> 21;
            int i162222 = i11 << 9;
            SurfaceKt.m2223SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(semantics$default2222, (Function1) rememberedValue5), shape4, j82222, j5, f8222, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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
                    String str;
                    ComposerKt.sourceInformation(composer2, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                    if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-692668920, i17, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                        }
                        Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function272222.invoke(composer2, 0));
                        ComposerKt.sourceInformationMarkerStart(composer2, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        boolean changedInstance = composer2.changedInstance(animatable);
                        final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                        Object rememberedValue6 = composer2.rememberedValue();
                        if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                    invoke2(graphicsLayerScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                    float calculatePredictiveBackScaleX;
                                    float calculatePredictiveBackScaleY;
                                    long j9;
                                    float floatValue = animatable2.getValue().floatValue();
                                    calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                    calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                    graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY == 0.0f ? 1.0f : calculatePredictiveBackScaleX / calculatePredictiveBackScaleY);
                                    j9 = ModalBottomSheetKt.PredictiveBackChildTransformOrigin;
                                    graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(j9);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(windowInsetsPadding, (Function1) rememberedValue6);
                        Function2<Composer, Integer, Unit> function29 = function282222;
                        final SheetState sheetState7 = sheetState62222;
                        final Function0<Unit> function02 = function0;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                        composer2.startReplaceGroup(-1636564008);
                        ComposerKt.sourceInformation(composer2, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                        if (function29 != null) {
                            Strings.Companion companion3 = Strings.INSTANCE;
                            final String m2655getString2EP1pXo2222 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                            Strings.Companion companion4 = Strings.INSTANCE;
                            final String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                            Strings.Companion companion5 = Strings.INSTANCE;
                            final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                            Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                            ComposerKt.sourceInformationMarkerStart(composer2, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            boolean changed2 = composer2.changed(sheetState7) | composer2.changed(m2655getString2EP1pXo3) | composer2.changed(function02) | composer2.changed(m2655getString2EP1pXo4) | composer2.changedInstance(coroutineScope2) | composer2.changed(m2655getString2EP1pXo2222);
                            Object rememberedValue7 = composer2.rememberedValue();
                            if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                rememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        final SheetState sheetState8 = SheetState.this;
                                        String str2 = m2655getString2EP1pXo3;
                                        String str3 = m2655getString2EP1pXo4;
                                        String str4 = m2655getString2EP1pXo2222;
                                        final Function0<Unit> function03 = function02;
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                function03.invoke();
                                                return true;
                                            }
                                        });
                                        if (sheetState8.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: ModalBottomSheet.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ SheetState $sheetState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$sheetState = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$sheetState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$sheetState.expand(this) == coroutine_suspended) {
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

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState8, null), 3, null);
                                                    }
                                                    return true;
                                                }
                                            });
                                        } else if (sheetState8.getHasPartiallyExpandedState()) {
                                            SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                                    }
                                                    return true;
                                                }

                                                /* compiled from: ModalBottomSheet.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ SheetState $this_with;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$this_with = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$this_with, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$this_with.partialExpand(this) == coroutine_suspended) {
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
                                            });
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue7);
                            } else {
                                str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Modifier semantics = SemanticsModifierKt.semantics(align, true, (Function1) rememberedValue7);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, semantics);
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
                            ComposerKt.sourceInformationMarkerStart(composer2, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                            function29.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        composer2.endReplaceGroup();
                        function32.invoke(columnScopeInstance, composer2, 6);
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
            }, startRestartGroup, 54), startRestartGroup, (i152222 & 896) | (i152222 & 112) | 12582912 | (i162222 & 7168) | (i162222 & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
            }
            f6 = f8222;
            sheetState5 = sheetState4;
            shape5 = shape4;
            function25 = function24;
            j6 = j5;
            function26 = function23;
            f7 = f5;
            j7 = j82222;
            modifier3 = modifier5222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        int i142 = 2048;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        Modifier modifier42222 = companion;
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        shape4 = shape3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Strings.Companion companion22222 = Strings.INSTANCE;
        final String m2655getString2EP1pXo2222 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_pane_title), startRestartGroup, 0);
        Modifier modifier52222 = modifier2;
        float f82222 = f3;
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(SizeKt.m733widthInVpY3zN4$default(boxScope.align(modifier2, Alignment.INSTANCE.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
        i12 = (3670016 & i10) ^ 1572864;
        if (i12 > 1048576) {
        }
        f5 = f4;
        if ((i10 & 1572864) != 1048576) {
        }
        z = true;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState4, Orientation.Vertical, function1);
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long j822222 = j3;
        Modifier nestedScroll$default22222 = NestedScrollModifierKt.nestedScroll$default(fillMaxWidth$default2222, (NestedScrollConnection) rememberedValue, null, 2, null);
        AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release22222 = sheetState4.getAnchoredDraggableState$material3_release();
        Orientation orientation32222 = Orientation.Vertical;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if (i12 <= 1048576) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

            /* compiled from: ModalBottomSheet.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                return m1926invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
            }

            /* renamed from: invoke-GpV2Q24, reason: not valid java name */
            public final Pair<DraggableAnchors<SheetValue>, SheetValue> m1926invokeGpV2Q24(final long j9, long j10) {
                SheetValue sheetValue;
                final float m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j10);
                final SheetState sheetState622222 = SheetState.this;
                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                        invoke2(draggableAnchorsConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                        draggableAnchorsConfig.at(SheetValue.Hidden, m6251getMaxHeightimpl);
                        if (IntSize.m6468getHeightimpl(j9) > m6251getMaxHeightimpl / 2 && !sheetState622222.getSkipPartiallyExpanded()) {
                            draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, m6251getMaxHeightimpl / 2.0f);
                        }
                        if (IntSize.m6468getHeightimpl(j9) != 0) {
                            draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, m6251getMaxHeightimpl - IntSize.m6468getHeightimpl(j9)));
                        }
                    }
                });
                int i1522222 = WhenMappings.$EnumSwitchMapping$0[SheetState.this.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                if (i1522222 == 1) {
                    sheetValue = SheetValue.Hidden;
                } else if (i1522222 == 2 || i1522222 == 3) {
                    if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                        sheetValue = SheetValue.PartiallyExpanded;
                    } else {
                        sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return TuplesKt.to(DraggableAnchors, sheetValue);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier draggableAnchors22222 = AnchoredDraggableKt.draggableAnchors(nestedScroll$default22222, anchoredDraggableState$material3_release22222, orientation32222, (Function2) rememberedValue2);
        DraggableState draggableState22222 = sheetState4.getAnchoredDraggableState$material3_release().getDraggableState();
        Orientation orientation222222 = Orientation.Vertical;
        boolean isVisible22222 = sheetState4.isVisible();
        boolean isAnimationRunning22222 = sheetState4.getAnchoredDraggableState$material3_release().isAnimationRunning();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if ((57344 & i10) != 16384) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        draggable = DraggableKt.draggable(draggableAnchors22222, draggableState22222, orientation222222, (r20 & 4) != 0 ? true : isVisible22222, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : isAnimationRunning22222, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
        changed = startRestartGroup.changed(m2655getString2EP1pXo2222);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo2222);
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier semantics$default22222 = SemanticsModifierKt.semantics$default(draggable, false, (Function1) rememberedValue4, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
        z4 = ((i12 <= 1048576 && startRestartGroup.changed(sheetState4)) || (i10 & 1572864) == 1048576) | ((i10 & 112) != 32 || ((i10 & 64) != 0 && startRestartGroup.changedInstance(animatable)));
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float calculatePredictiveBackScaleX;
                float calculatePredictiveBackScaleY;
                float offset = SheetState.this.getAnchoredDraggableState$material3_release().getOffset();
                float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
                if (Float.isNaN(offset) || Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
                    return;
                }
                float floatValue = animatable.getValue().floatValue();
                calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + m3665getHeightimpl) / m3665getHeightimpl));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function2722222 = function23;
        final Function2<? super Composer, ? super Integer, Unit> function2822222 = function24;
        final SheetState sheetState622222 = sheetState4;
        int i1522222 = i10 >> 21;
        int i1622222 = i11 << 9;
        SurfaceKt.m2223SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(semantics$default22222, (Function1) rememberedValue5), shape4, j822222, j5, f82222, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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
                String str;
                ComposerKt.sourceInformation(composer2, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-692668920, i17, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                    }
                    Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function2722222.invoke(composer2, 0));
                    ComposerKt.sourceInformationMarkerStart(composer2, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    boolean changedInstance = composer2.changedInstance(animatable);
                    final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                invoke2(graphicsLayerScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                float calculatePredictiveBackScaleX;
                                float calculatePredictiveBackScaleY;
                                long j9;
                                float floatValue = animatable2.getValue().floatValue();
                                calculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, floatValue);
                                calculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, floatValue);
                                graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY == 0.0f ? 1.0f : calculatePredictiveBackScaleX / calculatePredictiveBackScaleY);
                                j9 = ModalBottomSheetKt.PredictiveBackChildTransformOrigin;
                                graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(j9);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(windowInsetsPadding, (Function1) rememberedValue6);
                    Function2<Composer, Integer, Unit> function29 = function2822222;
                    final SheetState sheetState7 = sheetState622222;
                    final Function0<Unit> function02 = function0;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                    composer2.startReplaceGroup(-1636564008);
                    ComposerKt.sourceInformation(composer2, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                    if (function29 != null) {
                        Strings.Companion companion3 = Strings.INSTANCE;
                        final String m2655getString2EP1pXo22222 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                        Strings.Companion companion4 = Strings.INSTANCE;
                        final String m2655getString2EP1pXo3 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                        Strings.Companion companion5 = Strings.INSTANCE;
                        final String m2655getString2EP1pXo4 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                        Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                        ComposerKt.sourceInformationMarkerStart(composer2, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        boolean changed2 = composer2.changed(sheetState7) | composer2.changed(m2655getString2EP1pXo3) | composer2.changed(function02) | composer2.changed(m2655getString2EP1pXo4) | composer2.changedInstance(coroutineScope2) | composer2.changed(m2655getString2EP1pXo22222);
                        Object rememberedValue7 = composer2.rememberedValue();
                        if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                            rememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    final SheetState sheetState8 = SheetState.this;
                                    String str2 = m2655getString2EP1pXo3;
                                    String str3 = m2655getString2EP1pXo4;
                                    String str4 = m2655getString2EP1pXo22222;
                                    final Function0<Unit> function03 = function02;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            function03.invoke();
                                            return true;
                                        }
                                    });
                                    if (sheetState8.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                        SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ SheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        this.label = 1;
                                                        if (this.$sheetState.expand(this) == coroutine_suspended) {
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

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState8, null), 3, null);
                                                }
                                                return true;
                                            }
                                        });
                                    } else if (sheetState8.getHasPartiallyExpandedState()) {
                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                if (SheetState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(SheetState.this, null), 3, null);
                                                }
                                                return true;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ SheetState $this_with;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$this_with = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$this_with, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        this.label = 1;
                                                        if (this.$this_with.partialExpand(this) == coroutine_suspended) {
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
                                        });
                                    }
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue7);
                        } else {
                            str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier semantics = SemanticsModifierKt.semantics(align, true, (Function1) rememberedValue7);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, semantics);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                        function29.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                    }
                    composer2.endReplaceGroup();
                    function32.invoke(columnScopeInstance, composer2, 6);
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
        }, startRestartGroup, 54), startRestartGroup, (i1522222 & 896) | (i1522222 & 112) | 12582912 | (i1622222 & 7168) | (i1622222 & 57344), 96);
        if (ComposerKt.isTraceInProgress()) {
        }
        f6 = f82222;
        sheetState5 = sheetState4;
        shape5 = shape4;
        function25 = function24;
        j6 = j5;
        function26 = function23;
        f7 = f5;
        j7 = j822222;
        modifier3 = modifier52222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f) {
        float m3668getWidthimpl = Size.m3668getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m3668getWidthimpl) || m3668getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo373toPx0680j_4(PredictiveBackMaxScaleXDistance), m3668getWidthimpl), f) / m3668getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo373toPx0680j_4(PredictiveBackMaxScaleYDistance), m3665getHeightimpl), f) / m3665getHeightimpl);
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -778250030, "C(rememberModalBottomSheetState)P(1)400@18058L160:ModalBottomSheet.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$rememberModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue) {
                    return true;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1924Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(951870469);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)410@18376L87,411@18489L29,426@19112L79,426@19062L129:ModalBottomSheet.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951870469, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j != 16) {
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                Strings.Companion companion2 = Strings.INSTANCE;
                final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.close_sheet), startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1785653838);
                ComposerKt.sourceInformation(startRestartGroup, "414@18629L44,415@18730L263");
                if (z) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1785652017, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    int i4 = i3 & 112;
                    boolean z2 = i4 == 32;
                    ModalBottomSheetKt$Scrim$dismissSheet$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion3, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1785648566, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(m2655getString2EP1pXo) | (i4 == 32);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m2655getString2EP1pXo);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                } else {
                    companion = Modifier.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1785636526, "CC(remember):ModalBottomSheet.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(animateFloatAsState) | ((i3 & 14) == 4);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float Scrim_3J_VO9M$lambda$10;
                            long j2 = j;
                            Scrim_3J_VO9M$lambda$10 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$10(animateFloatAsState);
                            DrawScope.m4390drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, RangesKt.coerceIn(Scrim_3J_VO9M$lambda$10, 0.0f, 1.0f), null, null, 0, 118, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ModalBottomSheetKt.m1924Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }
}
