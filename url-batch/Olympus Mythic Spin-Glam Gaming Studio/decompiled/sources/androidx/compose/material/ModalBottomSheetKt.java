package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Map;
import kotlin.Metadata;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001aE\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\n\u0010\f\u001a\u0087\u0001\u0010 \u001a\u00020\u000e2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u000e0\u001c¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010$\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00032\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\"H\u0002¢\u0006\u0004\b$\u0010%\u001a3\u0010+\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c2\u0006\u0010(\u001a\u00020\u0005H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "", "skipHalfExpanded", "Lkotlin/Function1;", "confirmStateChange", "Landroidx/compose/material/ModalBottomSheetState;", "rememberModalBottomSheetState", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "sheetState", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalBottomSheetLayout-BzaUkTc", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalBottomSheetLayout", "fullHeight", "Landroidx/compose/runtime/State;", "sheetHeightState", "bottomSheetSwipeable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;FLandroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "color", "onDismiss", VastAttributes.VISIBLE, "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModalBottomSheetKt {
    public static final ModalBottomSheetState rememberModalBottomSheetState(final ModalBottomSheetValue initialValue, final AnimationSpec animationSpec, final boolean z, final Function1 function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-409288536);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.rememberSaveable(new Object[]{initialValue, animationSpec, Boolean.valueOf(z), function1}, ModalBottomSheetState.INSTANCE.Saver(animationSpec, z, function1), null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final ModalBottomSheetState mo4828invoke() {
                return new ModalBottomSheetState(ModalBottomSheetValue.this, animationSpec, z, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec animationSpec, Function1 function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1928569212);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$3
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, false, function1, composer, (i & 14) | 448 | ((i << 3) & 7168), 0);
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /* renamed from: ModalBottomSheetLayout-BzaUkTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m901ModalBottomSheetLayoutBzaUkTc(final Function3 sheetContent, Modifier modifier, ModalBottomSheetState modalBottomSheetState, Shape shape, float f, long j, long j2, long j3, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        final ModalBottomSheetState modalBottomSheetState2;
        int i4;
        float f2;
        long j4;
        long j5;
        Modifier modifier2;
        ModalBottomSheetState modalBottomSheetState3;
        Shape shape2;
        long j6;
        long j7;
        long j8;
        int i5;
        ModalBottomSheetState modalBottomSheetState4;
        Shape shape3;
        float f3;
        long j9;
        long j10;
        Object rememberedValue;
        Composer composer2;
        final long j11;
        final Shape shape4;
        final Modifier modifier3;
        final float f4;
        final long j12;
        final long j13;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1633763156);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(sheetContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    modalBottomSheetState2 = modalBottomSheetState;
                    if (startRestartGroup.changed(modalBottomSheetState2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    modalBottomSheetState2 = modalBottomSheetState;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                modalBottomSheetState2 = modalBottomSheetState;
            }
            if ((i & 7168) == 0) {
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(shape)) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                f2 = f;
            } else {
                f2 = f;
                if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                }
            }
            if ((458752 & i) == 0) {
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
            }
            if ((3670016 & i) != 0) {
                j4 = j2;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
            } else {
                j4 = j2;
            }
            if ((29360128 & i) != 0) {
                if ((i2 & 128) == 0) {
                    j5 = j3;
                    if (startRestartGroup.changed(j5)) {
                        i7 = 8388608;
                        i3 |= i7;
                    }
                } else {
                    j5 = j3;
                }
                i7 = 4194304;
                i3 |= i7;
            } else {
                j5 = j3;
            }
            if ((i2 & 256) != 0) {
                i6 = (234881024 & i) == 0 ? startRestartGroup.changed(content) ? 67108864 : 33554432 : 100663296;
                if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier2 = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            modalBottomSheetState3 = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, startRestartGroup, 6, 6);
                            i3 &= -897;
                        } else {
                            modalBottomSheetState3 = modalBottomSheetState2;
                        }
                        if ((i2 & 8) != 0) {
                            shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                            i3 &= -7169;
                        } else {
                            shape2 = shape;
                        }
                        float m900getElevationD9Ej5fM = i4 != 0 ? ModalBottomSheetDefaults.INSTANCE.m900getElevationD9Ej5fM() : f2;
                        if ((i2 & 32) != 0) {
                            j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                            i3 &= -458753;
                        } else {
                            j6 = j;
                        }
                        if ((i2 & 64) != 0) {
                            j7 = ColorsKt.m814contentColorForek8zF_U(j6, startRestartGroup, (i3 >> 15) & 14);
                            i3 &= -3670017;
                        } else {
                            j7 = j2;
                        }
                        if ((i2 & 128) != 0) {
                            i5 = i3 & (-29360129);
                            f3 = m900getElevationD9Ej5fM;
                            j9 = j6;
                            j10 = j7;
                            j8 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                            modalBottomSheetState4 = modalBottomSheetState3;
                            shape3 = shape2;
                        } else {
                            j8 = j3;
                            i5 = i3;
                            modalBottomSheetState4 = modalBottomSheetState3;
                            shape3 = shape2;
                            f3 = m900getElevationD9Ej5fM;
                            j9 = j6;
                            j10 = j7;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        modifier2 = modifier;
                        shape3 = shape;
                        j9 = j;
                        i5 = i3;
                        modalBottomSheetState4 = modalBottomSheetState2;
                        j8 = j5;
                        j10 = j4;
                        f3 = f2;
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    final ModalBottomSheetState modalBottomSheetState5 = modalBottomSheetState4;
                    final int i10 = i5;
                    final Shape shape5 = shape3;
                    final long j14 = j9;
                    final long j15 = j10;
                    final float f5 = f3;
                    composer2 = startRestartGroup;
                    j11 = j8;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, new Function3() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i11) {
                            int i12;
                            final float f6;
                            Modifier bottomSheetSwipeable;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                i12 = i11 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) != 18 || !composer3.getSkipping()) {
                                float m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(BoxWithConstraints.getConstraints());
                                composer3.startReplaceableGroup(-492369756);
                                Object rememberedValue2 = composer3.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (rememberedValue2 == companion.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                final MutableState mutableState = (MutableState) rememberedValue2;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                Function2 function2 = content;
                                int i13 = i10;
                                long j16 = j11;
                                final ModalBottomSheetState modalBottomSheetState6 = ModalBottomSheetState.this;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion3.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-402723888);
                                function2.invoke(composer3, Integer.valueOf((i13 >> 24) & 14));
                                ModalBottomSheetKt.m902Scrim3JVO9M(j16, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                        m906invoke();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m906invoke() {
                                        if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                        }
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", l = {335}, m = "invokeSuspend")
                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                            super(2, continuation);
                                            this.$sheetState = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                            return new AnonymousClass1(this.$sheetState, continuation);
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
                                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                this.label = 1;
                                                if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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
                                }, modalBottomSheetState6.getTargetValue() != ModalBottomSheetValue.Hidden, composer3, (i13 >> 21) & 14);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                                Object obj = ModalBottomSheetState.this;
                                Object valueOf = Float.valueOf(m2486getMaxHeightimpl);
                                final ModalBottomSheetState modalBottomSheetState7 = ModalBottomSheetState.this;
                                composer3.startReplaceableGroup(511388516);
                                boolean changed = composer3.changed(obj) | composer3.changed(valueOf);
                                Object rememberedValue3 = composer3.rememberedValue();
                                if (changed || rememberedValue3 == companion.getEmpty()) {
                                    f6 = m2486getMaxHeightimpl;
                                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            return IntOffset.m2545boximpl(m907invokeBjo55l4((Density) obj2));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m907invokeBjo55l4(@NotNull Density offset) {
                                            int roundToInt;
                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            if (ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                                roundToInt = MathKt.roundToInt(f6);
                                            } else {
                                                roundToInt = MathKt.roundToInt(((Number) ModalBottomSheetState.this.getOffset().getValue()).floatValue());
                                            }
                                            return IntOffsetKt.IntOffset(0, roundToInt);
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue3);
                                } else {
                                    f6 = m2486getMaxHeightimpl;
                                }
                                composer3.endReplaceableGroup();
                                bottomSheetSwipeable = ModalBottomSheetKt.bottomSheetSwipeable(OffsetKt.offset(nestedScroll$default, (Function1) rememberedValue3), ModalBottomSheetState.this, f6, mutableState);
                                composer3.startReplaceableGroup(1157296644);
                                boolean changed2 = composer3.changed(mutableState);
                                Object rememberedValue4 = composer3.rememberedValue();
                                if (changed2 || rememberedValue4 == companion.getEmpty()) {
                                    rememberedValue4 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((LayoutCoordinates) obj2);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@NotNull LayoutCoordinates it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            mutableState.setValue(Float.valueOf(IntSize.m2566getHeightimpl(it.mo1946getSizeYbymL2g())));
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue4);
                                }
                                composer3.endReplaceableGroup();
                                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (Function1) rememberedValue4);
                                final ModalBottomSheetState modalBottomSheetState8 = ModalBottomSheetState.this;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                                        if (ModalBottomSheetState.this.isVisible()) {
                                            final ModalBottomSheetState modalBottomSheetState9 = ModalBottomSheetState.this;
                                            final CoroutineScope coroutineScope4 = coroutineScope3;
                                            SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* renamed from: invoke */
                                                public final Boolean mo4828invoke() {
                                                    if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00391(ModalBottomSheetState.this, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }

                                                /* compiled from: ModalBottomSheet.kt */
                                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", l = {363}, m = "invokeSuspend")
                                                /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00391 extends SuspendLambda implements Function2 {
                                                    final /* synthetic */ ModalBottomSheetState $sheetState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00391(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.$sheetState = modalBottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                        return new C00391(this.$sheetState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                                        return ((C00391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                            this.label = 1;
                                                            if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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
                                            if (ModalBottomSheetState.this.getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                                final ModalBottomSheetState modalBottomSheetState10 = ModalBottomSheetState.this;
                                                final CoroutineScope coroutineScope5 = coroutineScope3;
                                                SemanticsPropertiesKt.expand$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    /* renamed from: invoke */
                                                    public final Boolean mo4828invoke() {
                                                        if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Expanded)).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", l = {370}, m = "invokeSuspend")
                                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = modalBottomSheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                            return new AnonymousClass1(this.$sheetState, continuation);
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
                                                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                                this.label = 1;
                                                                if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
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
                                            } else if (ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                                final ModalBottomSheetState modalBottomSheetState11 = ModalBottomSheetState.this;
                                                final CoroutineScope coroutineScope6 = coroutineScope3;
                                                SemanticsPropertiesKt.collapse$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    /* renamed from: invoke */
                                                    public final Boolean mo4828invoke() {
                                                        if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.HalfExpanded)).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", l = {377}, m = "invokeSuspend")
                                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = modalBottomSheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                            return new AnonymousClass1(this.$sheetState, continuation);
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
                                                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                                this.label = 1;
                                                                if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                                    }
                                }, 1, null);
                                Shape shape6 = shape5;
                                long j17 = j14;
                                long j18 = j15;
                                float f7 = f5;
                                final Function3 function3 = sheetContent;
                                final int i14 = i10;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
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
                                    public final void invoke(@Nullable Composer composer4, int i15) {
                                        if ((i15 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        Function3 function32 = Function3.this;
                                        int i16 = (i14 << 9) & 7168;
                                        composer4.startReplaceableGroup(-483455358);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                        composer4.startReplaceableGroup(-1323940314);
                                        Density density2 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0 constructor2 = companion5.getConstructor();
                                        Function3 materializerOf2 = LayoutKt.materializerOf(companion4);
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer4);
                                        Updater.m1153setimpl(m1149constructorimpl2, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion5.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion5.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion5.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-1163856341);
                                        function32.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i16 >> 6) & 112) | 6));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                    }
                                });
                                int i15 = i10;
                                SurfaceKt.m988SurfaceFjzlyU(semantics$default, shape6, j17, j18, null, f7, composableLambda, composer3, ((i15 >> 6) & 112) | 1572864 | ((i15 >> 9) & 896) | ((i15 >> 9) & 7168) | ((i15 << 3) & 458752), 16);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ((i5 >> 3) & 14) | 3072, 6);
                    modalBottomSheetState2 = modalBottomSheetState4;
                    shape4 = shape3;
                    modifier3 = modifier2;
                    f4 = f3;
                    j12 = j9;
                    j13 = j10;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    composer2 = startRestartGroup;
                    j11 = j5;
                    f4 = f2;
                    shape4 = shape;
                    j13 = j4;
                    j12 = j;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i11) {
                        ModalBottomSheetKt.m901ModalBottomSheetLayoutBzaUkTc(Function3.this, modifier3, modalBottomSheetState2, shape4, f4, j12, j13, j11, content, composer3, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= i6;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            final ModalBottomSheetState modalBottomSheetState52 = modalBottomSheetState4;
            final int i102 = i5;
            final Shape shape52 = shape3;
            final long j142 = j9;
            final long j152 = j10;
            final float f52 = f3;
            composer2 = startRestartGroup;
            j11 = j8;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, new Function3() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i11) {
                    int i12;
                    final float f6;
                    Modifier bottomSheetSwipeable;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i11 & 14) == 0) {
                        i12 = i11 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 91) != 18 || !composer3.getSkipping()) {
                        float m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(BoxWithConstraints.getConstraints());
                        composer3.startReplaceableGroup(-492369756);
                        Object rememberedValue2 = composer3.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        final MutableState<Float> mutableState = (MutableState) rememberedValue2;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Function2 function2 = content;
                        int i13 = i102;
                        long j16 = j11;
                        final ModalBottomSheetState modalBottomSheetState6 = ModalBottomSheetState.this;
                        final CoroutineScope coroutineScope22 = coroutineScope2;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion3.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-402723888);
                        function2.invoke(composer3, Integer.valueOf((i13 >> 24) & 14));
                        ModalBottomSheetKt.m902Scrim3JVO9M(j16, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                m906invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m906invoke() {
                                if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                }
                            }

                            /* compiled from: ModalBottomSheet.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", l = {335}, m = "invokeSuspend")
                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                    super(2, continuation);
                                    this.$sheetState = modalBottomSheetState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                    return new AnonymousClass1(this.$sheetState, continuation);
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
                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                        this.label = 1;
                                        if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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
                        }, modalBottomSheetState6.getTargetValue() != ModalBottomSheetValue.Hidden, composer3, (i13 >> 21) & 14);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                        Object obj = ModalBottomSheetState.this;
                        Object valueOf = Float.valueOf(m2486getMaxHeightimpl);
                        final ModalBottomSheetState modalBottomSheetState7 = ModalBottomSheetState.this;
                        composer3.startReplaceableGroup(511388516);
                        boolean changed = composer3.changed(obj) | composer3.changed(valueOf);
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed || rememberedValue3 == companion.getEmpty()) {
                            f6 = m2486getMaxHeightimpl;
                            rememberedValue3 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    return IntOffset.m2545boximpl(m907invokeBjo55l4((Density) obj2));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m907invokeBjo55l4(@NotNull Density offset) {
                                    int roundToInt;
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    if (ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                        roundToInt = MathKt.roundToInt(f6);
                                    } else {
                                        roundToInt = MathKt.roundToInt(((Number) ModalBottomSheetState.this.getOffset().getValue()).floatValue());
                                    }
                                    return IntOffsetKt.IntOffset(0, roundToInt);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        } else {
                            f6 = m2486getMaxHeightimpl;
                        }
                        composer3.endReplaceableGroup();
                        bottomSheetSwipeable = ModalBottomSheetKt.bottomSheetSwipeable(OffsetKt.offset(nestedScroll$default, (Function1) rememberedValue3), ModalBottomSheetState.this, f6, mutableState);
                        composer3.startReplaceableGroup(1157296644);
                        boolean changed2 = composer3.changed(mutableState);
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changed2 || rememberedValue4 == companion.getEmpty()) {
                            rememberedValue4 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((LayoutCoordinates) obj2);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutCoordinates it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mutableState.setValue(Float.valueOf(IntSize.m2566getHeightimpl(it.mo1946getSizeYbymL2g())));
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (Function1) rememberedValue4);
                        final ModalBottomSheetState modalBottomSheetState8 = ModalBottomSheetState.this;
                        final CoroutineScope coroutineScope3 = coroutineScope2;
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                                if (ModalBottomSheetState.this.isVisible()) {
                                    final ModalBottomSheetState modalBottomSheetState9 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00391(ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", l = {363}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C00391 extends SuspendLambda implements Function2 {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C00391(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                return new C00391(this.$sheetState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                                return ((C00391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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
                                    if (ModalBottomSheetState.this.getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                        final ModalBottomSheetState modalBottomSheetState10 = ModalBottomSheetState.this;
                                        final CoroutineScope coroutineScope5 = coroutineScope3;
                                        SemanticsPropertiesKt.expand$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* renamed from: invoke */
                                            public final Boolean mo4828invoke() {
                                                if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Expanded)).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", l = {370}, m = "invokeSuspend")
                                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
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
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
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
                                    } else if (ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                        final ModalBottomSheetState modalBottomSheetState11 = ModalBottomSheetState.this;
                                        final CoroutineScope coroutineScope6 = coroutineScope3;
                                        SemanticsPropertiesKt.collapse$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* renamed from: invoke */
                                            public final Boolean mo4828invoke() {
                                                if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.HalfExpanded)).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", l = {377}, m = "invokeSuspend")
                                            /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                                final /* synthetic */ ModalBottomSheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = modalBottomSheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                    return new AnonymousClass1(this.$sheetState, continuation);
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
                                                        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                        this.label = 1;
                                                        if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                            }
                        }, 1, null);
                        Shape shape6 = shape52;
                        long j17 = j142;
                        long j18 = j152;
                        float f7 = f52;
                        final Function3 function3 = sheetContent;
                        final int i14 = i102;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
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
                            public final void invoke(@Nullable Composer composer4, int i15) {
                                if ((i15 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                Function3 function32 = Function3.this;
                                int i16 = (i14 << 9) & 7168;
                                composer4.startReplaceableGroup(-483455358);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                Density density2 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0 constructor2 = companion5.getConstructor();
                                Function3 materializerOf2 = LayoutKt.materializerOf(companion4);
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer4);
                                Updater.m1153setimpl(m1149constructorimpl2, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl2, density2, companion5.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion5.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion5.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(-1163856341);
                                function32.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i16 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                            }
                        });
                        int i15 = i102;
                        SurfaceKt.m988SurfaceFjzlyU(semantics$default, shape6, j17, j18, null, f7, composableLambda, composer3, ((i15 >> 6) & 112) | 1572864 | ((i15 >> 9) & 896) | ((i15 >> 9) & 7168) | ((i15 << 3) & 458752), 16);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i5 >> 3) & 14) | 3072, 6);
            modalBottomSheetState2 = modalBottomSheetState4;
            shape4 = shape3;
            modifier3 = modifier2;
            f4 = f3;
            j12 = j9;
            j13 = j10;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i6;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        final ModalBottomSheetState modalBottomSheetState522 = modalBottomSheetState4;
        final int i1022 = i5;
        final Shape shape522 = shape3;
        final long j1422 = j9;
        final long j1522 = j10;
        final float f522 = f3;
        composer2 = startRestartGroup;
        j11 = j8;
        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composer2, 1607356310, true, new Function3() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i11) {
                int i12;
                final float f6;
                Modifier bottomSheetSwipeable;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i11 & 14) == 0) {
                    i12 = i11 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 91) != 18 || !composer3.getSkipping()) {
                    float m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(BoxWithConstraints.getConstraints());
                    composer3.startReplaceableGroup(-492369756);
                    Object rememberedValue2 = composer3.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    final MutableState<Float> mutableState = (MutableState) rememberedValue2;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Function2 function2 = content;
                    int i13 = i1022;
                    long j16 = j11;
                    final ModalBottomSheetState modalBottomSheetState6 = ModalBottomSheetState.this;
                    final CoroutineScope coroutineScope222 = coroutineScope22;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion3.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-402723888);
                    function2.invoke(composer3, Integer.valueOf((i13 >> 24) & 14));
                    ModalBottomSheetKt.m902Scrim3JVO9M(j16, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            m906invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m906invoke() {
                            if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                            }
                        }

                        /* compiled from: ModalBottomSheet.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", f = "ModalBottomSheet.kt", l = {335}, m = "invokeSuspend")
                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                            final /* synthetic */ ModalBottomSheetState $sheetState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                super(2, continuation);
                                this.$sheetState = modalBottomSheetState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                    this.label = 1;
                                    if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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
                    }, modalBottomSheetState6.getTargetValue() != ModalBottomSheetValue.Hidden, composer3, (i13 >> 21) & 14);
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ModalBottomSheetState.this.getNestedScrollConnection(), null, 2, null);
                    Object obj = ModalBottomSheetState.this;
                    Object valueOf = Float.valueOf(m2486getMaxHeightimpl);
                    final ModalBottomSheetState modalBottomSheetState7 = ModalBottomSheetState.this;
                    composer3.startReplaceableGroup(511388516);
                    boolean changed = composer3.changed(obj) | composer3.changed(valueOf);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed || rememberedValue3 == companion.getEmpty()) {
                        f6 = m2486getMaxHeightimpl;
                        rememberedValue3 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                return IntOffset.m2545boximpl(m907invokeBjo55l4((Density) obj2));
                            }

                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m907invokeBjo55l4(@NotNull Density offset) {
                                int roundToInt;
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                if (ModalBottomSheetState.this.getAnchors$material_release().isEmpty()) {
                                    roundToInt = MathKt.roundToInt(f6);
                                } else {
                                    roundToInt = MathKt.roundToInt(((Number) ModalBottomSheetState.this.getOffset().getValue()).floatValue());
                                }
                                return IntOffsetKt.IntOffset(0, roundToInt);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    } else {
                        f6 = m2486getMaxHeightimpl;
                    }
                    composer3.endReplaceableGroup();
                    bottomSheetSwipeable = ModalBottomSheetKt.bottomSheetSwipeable(OffsetKt.offset(nestedScroll$default, (Function1) rememberedValue3), ModalBottomSheetState.this, f6, mutableState);
                    composer3.startReplaceableGroup(1157296644);
                    boolean changed2 = composer3.changed(mutableState);
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (changed2 || rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((LayoutCoordinates) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull LayoutCoordinates it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                mutableState.setValue(Float.valueOf(IntSize.m2566getHeightimpl(it.mo1946getSizeYbymL2g())));
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    composer3.endReplaceableGroup();
                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(bottomSheetSwipeable, (Function1) rememberedValue4);
                    final ModalBottomSheetState modalBottomSheetState8 = ModalBottomSheetState.this;
                    final CoroutineScope coroutineScope3 = coroutineScope22;
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(onGloballyPositioned, false, new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.4
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
                            if (ModalBottomSheetState.this.isVisible()) {
                                final ModalBottomSheetState modalBottomSheetState9 = ModalBottomSheetState.this;
                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final Boolean mo4828invoke() {
                                        if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C00391(ModalBottomSheetState.this, null), 3, null);
                                        }
                                        return Boolean.TRUE;
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1", f = "ModalBottomSheet.kt", l = {363}, m = "invokeSuspend")
                                    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C00391 extends SuspendLambda implements Function2 {
                                        final /* synthetic */ ModalBottomSheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C00391(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                            super(2, continuation);
                                            this.$sheetState = modalBottomSheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                            return new C00391(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                            return ((C00391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                this.label = 1;
                                                if (modalBottomSheetState.hide(this) == coroutine_suspended) {
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
                                if (ModalBottomSheetState.this.getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                                    final ModalBottomSheetState modalBottomSheetState10 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope5 = coroutineScope3;
                                    SemanticsPropertiesKt.expand$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.Expanded)).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1", f = "ModalBottomSheet.kt", l = {370}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$2$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.expand$material_release(this) == coroutine_suspended) {
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
                                } else if (ModalBottomSheetState.this.getHasHalfExpandedState$material_release()) {
                                    final ModalBottomSheetState modalBottomSheetState11 = ModalBottomSheetState.this;
                                    final CoroutineScope coroutineScope6 = coroutineScope3;
                                    SemanticsPropertiesKt.collapse$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt.ModalBottomSheetLayout.1.4.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            if (((Boolean) ModalBottomSheetState.this.getConfirmStateChange().invoke(ModalBottomSheetValue.HalfExpanded)).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new AnonymousClass1(ModalBottomSheetState.this, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }

                                        /* compiled from: ModalBottomSheet.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1", f = "ModalBottomSheet.kt", l = {377}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4$3$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                            final /* synthetic */ ModalBottomSheetState $sheetState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                                                super(2, continuation);
                                                this.$sheetState = modalBottomSheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                return new AnonymousClass1(this.$sheetState, continuation);
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
                                                    ModalBottomSheetState modalBottomSheetState = this.$sheetState;
                                                    this.label = 1;
                                                    if (modalBottomSheetState.halfExpand$material_release(this) == coroutine_suspended) {
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
                        }
                    }, 1, null);
                    Shape shape6 = shape522;
                    long j17 = j1422;
                    long j18 = j1522;
                    float f7 = f522;
                    final Function3 function3 = sheetContent;
                    final int i14 = i1022;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, -1793508390, true, new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1.5
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
                        public final void invoke(@Nullable Composer composer4, int i15) {
                            if ((i15 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            Function3 function32 = Function3.this;
                            int i16 = (i14 << 9) & 7168;
                            composer4.startReplaceableGroup(-483455358);
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            composer4.startReplaceableGroup(-1323940314);
                            Density density2 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0 constructor2 = companion5.getConstructor();
                            Function3 materializerOf2 = LayoutKt.materializerOf(companion4);
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer4);
                            Updater.m1153setimpl(m1149constructorimpl2, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl2, density2, companion5.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion5.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion5.getSetViewConfiguration());
                            composer4.enableReusing();
                            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            composer4.startReplaceableGroup(-1163856341);
                            function32.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i16 >> 6) & 112) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                        }
                    });
                    int i15 = i1022;
                    SurfaceKt.m988SurfaceFjzlyU(semantics$default, shape6, j17, j18, null, f7, composableLambda, composer3, ((i15 >> 6) & 112) | 1572864 | ((i15 >> 9) & 896) | ((i15 >> 9) & 7168) | ((i15 << 3) & 458752), 16);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, ((i5 >> 3) & 14) | 3072, 6);
        modalBottomSheetState2 = modalBottomSheetState4;
        shape4 = shape3;
        modifier3 = modifier2;
        f4 = f3;
        j12 = j9;
        j13 = j10;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier bottomSheetSwipeable(Modifier modifier, ModalBottomSheetState modalBottomSheetState, float f, State state) {
        Modifier modifier2;
        Map mapOf;
        Float f2 = (Float) state.getValue();
        if (f2 == null) {
            modifier2 = Modifier.INSTANCE;
        } else {
            float f3 = f / 2;
            if (f2.floatValue() < f3 || modalBottomSheetState.getIsSkipHalfExpanded()) {
                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f), ModalBottomSheetValue.Hidden), TuplesKt.to(Float.valueOf(f - f2.floatValue()), ModalBottomSheetValue.Expanded));
            } else {
                mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f), ModalBottomSheetValue.Hidden), TuplesKt.to(Float.valueOf(f3), ModalBottomSheetValue.HalfExpanded), TuplesKt.to(Float.valueOf(Math.max(0.0f, f - f2.floatValue())), ModalBottomSheetValue.Expanded));
            }
            modifier2 = SwipeableKt.m998swipeablepPrIpRY(Modifier.INSTANCE, modalBottomSheetState, r2, Orientation.Vertical, (r26 & 8) != 0 ? true : modalBottomSheetState.getCurrentValue() != ModalBottomSheetValue.Hidden, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final FixedThreshold invoke(Object obj, Object obj2) {
                    return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                }
            } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
        }
        return modifier.then(modifier2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m902Scrim3JVO9M(final long j, final Function0 function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (j != Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, startRestartGroup, 0, 12);
            final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m980getCloseSheetUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010547488);
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(function0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed(m986getString4foXLRw) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.setContentDescription(semantics, m986getString4foXLRw);
                            final Function0 function02 = function0;
                            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Boolean mo4828invoke() {
                                    Function0.this.mo4828invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                modifier = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier);
            Color m1441boximpl = Color.m1441boximpl(j);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed3 = startRestartGroup.changed(m1441boximpl) | startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DrawScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DrawScope Canvas) {
                        float m903Scrim_3J_VO9M$lambda0;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m903Scrim_3J_VO9M$lambda0 = ModalBottomSheetKt.m903Scrim_3J_VO9M$lambda0(animateFloatAsState);
                        DrawScope.m1703drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m903Scrim_3J_VO9M$lambda0, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$2
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
                ModalBottomSheetKt.m902Scrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim_3J_VO9M$lambda-0, reason: not valid java name */
    public static final float m903Scrim_3J_VO9M$lambda0(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
