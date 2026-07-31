package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
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
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
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
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0091\u0001\u0010 \u001a\u00020\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0091\u0001\u0010#\u001a\u00020\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a'\u0010(\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\u0006\u0010,\u001a\u00020\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001aA\u00105\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\u001c2\f\u00102\u001a\b\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010*\u001a\u00020\u0018H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u0017\u00106\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u00107\"\u0017\u00108\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u00107\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020$098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "Landroidx/compose/material/BottomDrawerState;", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "Landroidx/compose/ui/unit/Dp;", "drawerElevation", "Landroidx/compose/ui/graphics/Color;", "drawerBackgroundColor", "drawerContentColor", "scrimColor", "Lkotlin/Function0;", "content", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalDrawer", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "", "a", "b", "pos", "calculateFraction", "(FFF)F", "color", "onDismiss", VastAttributes.VISIBLE, "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "BottomDrawerScrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "Scrim", "EndDrawerPadding", "F", "DrawerVelocityThreshold", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float EndDrawerPadding = Dp.m2507constructorimpl(56);
    private static final float DrawerVelocityThreshold = Dp.m2507constructorimpl(400);
    private static final TweenSpec AnimationSpec = new TweenSpec(256, 0, null, 6, null);

    public static final DrawerState rememberDrawerState(final DrawerValue initialValue, final Function1 function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-1435874229);
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.rememberSaveable(new Object[0], DrawerState.INSTANCE.Saver(function1), null, new Function0() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final DrawerState mo4828invoke() {
                return new DrawerState(DrawerValue.this, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return drawerState;
    }

    public static final BottomDrawerState rememberBottomDrawerState(final BottomDrawerValue initialValue, final Function1 function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(-598115156);
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BottomDrawerValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.rememberSaveable(new Object[0], BottomDrawerState.Companion.Saver(function1), null, new Function0() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final BottomDrawerState mo4828invoke() {
                return new BottomDrawerState(BottomDrawerValue.this, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    /* renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m844ModalDrawerGs3lGvM(final Function3 drawerContent, Modifier modifier, DrawerState drawerState, boolean z, Shape shape, float f, long j, long j2, long j3, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        int i7;
        DrawerState drawerState3;
        Shape shape3;
        long j4;
        long j5;
        long j6;
        Modifier modifier3;
        DrawerState drawerState4;
        boolean z3;
        long j7;
        long j8;
        final int i8;
        Shape shape4;
        float f3;
        Object rememberedValue;
        final long j9;
        final long j10;
        Composer composer2;
        final DrawerState drawerState5;
        final boolean z4;
        final Shape shape5;
        final float f4;
        final long j11;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1305806945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(drawerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i13 = 256;
                        i3 |= i13;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i13 = 128;
                i3 |= i13;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 16384;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 8192;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            i6 = i14;
                            if (startRestartGroup.changed(j)) {
                                i11 = 1048576;
                                i3 |= i11;
                            }
                        } else {
                            i6 = i14;
                        }
                        i11 = 524288;
                        i3 |= i11;
                    } else {
                        i6 = i14;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(j2)) {
                            i10 = 8388608;
                            i3 |= i10;
                        }
                        i10 = 4194304;
                        i3 |= i10;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(j3)) {
                            i9 = 67108864;
                            i3 |= i9;
                        }
                        i9 = 33554432;
                        i3 |= i9;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i7 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    drawerState3 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                                    i3 &= -897;
                                } else {
                                    drawerState3 = drawerState2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                    i3 &= -57345;
                                } else {
                                    shape3 = shape2;
                                }
                                float m840getElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m840getElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                    i3 &= -3670017;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 128) != 0) {
                                    j5 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    j5 = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    drawerState4 = drawerState3;
                                    z3 = z2;
                                    j7 = j4;
                                    j6 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    j8 = j5;
                                    i8 = i3 & (-234881025);
                                    modifier3 = modifier5;
                                } else {
                                    j6 = j3;
                                    modifier3 = modifier5;
                                    drawerState4 = drawerState3;
                                    z3 = z2;
                                    j7 = j4;
                                    j8 = j5;
                                    i8 = i3;
                                }
                                shape4 = shape3;
                                f3 = m840getElevationD9Ej5fM;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                j7 = j;
                                j8 = j2;
                                j6 = j3;
                                drawerState4 = drawerState2;
                                z3 = z2;
                                shape4 = shape2;
                                f3 = f2;
                                modifier3 = modifier2;
                                i8 = i3;
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
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            final DrawerState drawerState6 = drawerState4;
                            final boolean z5 = z3;
                            final long j12 = j6;
                            final Shape shape6 = shape4;
                            j9 = j7;
                            Modifier modifier6 = modifier3;
                            j10 = j8;
                            final float f5 = f3;
                            Function3 function3 = new Function3() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
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
                                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i15) {
                                    int i16;
                                    float f6;
                                    Modifier m998swipeablepPrIpRY;
                                    float f7;
                                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                    if ((i15 & 14) == 0) {
                                        i16 = i15 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                    } else {
                                        i16 = i15;
                                    }
                                    if ((i16 & 91) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    long constraints = BoxWithConstraints.getConstraints();
                                    if (!Constraints.m2483getHasBoundedWidthimpl(constraints)) {
                                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                                    }
                                    final float f8 = -Constraints.m2487getMaxWidthimpl(constraints);
                                    Map mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f8), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                                    boolean z6 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    SwipeableState swipeableState = DrawerState.this.getSwipeableState();
                                    Orientation orientation = Orientation.Horizontal;
                                    f6 = DrawerKt.DrawerVelocityThreshold;
                                    m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion, swipeableState, mapOf, orientation, (r26 & 8) != 0 ? true : z5, (r26 & 16) != 0 ? false : z6, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        @Override // kotlin.jvm.functions.Function2
                                        @NotNull
                                        public final FixedThreshold invoke(Object obj, Object obj2) {
                                            return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                        }
                                    } : new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        @NotNull
                                        public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                            Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
                                            Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
                                            return new FractionalThreshold(0.5f);
                                        }
                                    }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : f6);
                                    final DrawerState drawerState7 = DrawerState.this;
                                    final int i17 = i8;
                                    long j13 = j12;
                                    Shape shape7 = shape6;
                                    long j14 = j9;
                                    long j15 = j10;
                                    float f9 = f5;
                                    Function2 function2 = content;
                                    final boolean z7 = z5;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    final Function3 function32 = drawerContent;
                                    composer3.startReplaceableGroup(733328855);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion3.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
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
                                    composer3.startReplaceableGroup(-1263168067);
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    Function0 constructor2 = companion3.getConstructor();
                                    Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer3);
                                    Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    composer3.startReplaceableGroup(32495683);
                                    function2.invoke(composer3, Integer.valueOf((i17 >> 27) & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    boolean isOpen = drawerState7.isOpen();
                                    Function0 function0 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                            m855invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m855invoke() {
                                            if (z7 && ((Boolean) drawerState7.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                                            }
                                        }

                                        /* compiled from: Drawer.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                            final /* synthetic */ DrawerState $drawerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                return new AnonymousClass1(this.$drawerState, continuation);
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
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                    Object valueOf = Float.valueOf(f8);
                                    Object valueOf2 = Float.valueOf(0.0f);
                                    composer3.startReplaceableGroup(1618982084);
                                    boolean changed = composer3.changed(valueOf) | composer3.changed(valueOf2) | composer3.changed(drawerState7);
                                    Object rememberedValue2 = composer3.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        final float f10 = 0.0f;
                                        rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* renamed from: invoke */
                                            public final Float mo4828invoke() {
                                                float calculateFraction;
                                                calculateFraction = DrawerKt.calculateFraction(f8, f10, ((Number) drawerState7.getOffset().getValue()).floatValue());
                                                return Float.valueOf(calculateFraction);
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    DrawerKt.m845ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue2, j13, composer3, (i17 >> 15) & 7168);
                                    final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m983getNavigationMenuUdPEhr4(), composer3, 6);
                                    Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    Modifier m360sizeInqDBjuR0 = SizeKt.m360sizeInqDBjuR0(companion, density3.mo268toDpu2uoSUM(Constraints.m2489getMinWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2488getMinHeightimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2487getMaxWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2486getMaxHeightimpl(constraints)));
                                    composer3.startReplaceableGroup(1157296644);
                                    boolean changed2 = composer3.changed(drawerState7);
                                    Object rememberedValue3 = composer3.rememberedValue();
                                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return IntOffset.m2545boximpl(m856invokeBjo55l4((Density) obj));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m856invokeBjo55l4(@NotNull Density offset) {
                                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) DrawerState.this.getOffset().getValue()).floatValue()), 0);
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue3);
                                    }
                                    composer3.endReplaceableGroup();
                                    Modifier offset = OffsetKt.offset(m360sizeInqDBjuR0, (Function1) rememberedValue3);
                                    f7 = DrawerKt.EndDrawerPadding;
                                    int i18 = i17 >> 12;
                                    SurfaceKt.m988SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m338paddingqDBjuR0$default(offset, 0.0f, 0.0f, f7, 0.0f, 11, null), false, new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                                            SemanticsPropertiesKt.setPaneTitle(semantics, m986getString4foXLRw);
                                            if (drawerState7.isOpen()) {
                                                final DrawerState drawerState8 = drawerState7;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    /* renamed from: invoke */
                                                    public final Boolean mo4828invoke() {
                                                        if (((Boolean) DrawerState.this.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00351(DrawerState.this, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }

                                                    /* compiled from: Drawer.kt */
                                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
                                                    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                                    static final class C00351 extends SuspendLambda implements Function2 {
                                                        final /* synthetic */ DrawerState $drawerState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C00351(DrawerState drawerState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                            return new C00351(this.$drawerState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        @Nullable
                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                                            return ((C00351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @Nullable
                                                        public final Object invokeSuspend(@NotNull Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                DrawerState drawerState = this.$drawerState;
                                                                this.label = 1;
                                                                if (drawerState.close(this) == coroutine_suspended) {
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
                                    }, 1, null), shape7, j14, j15, null, f9, ComposableLambdaKt.composableLambda(composer3, -1941234439, true, new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                        public final void invoke(@Nullable Composer composer4, int i19) {
                                            if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Function3 function33 = Function3.this;
                                            int i20 = ((i17 << 9) & 7168) | 6;
                                            composer4.startReplaceableGroup(-483455358);
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                            composer4.startReplaceableGroup(-1323940314);
                                            Density density4 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection3 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0 constructor3 = companion4.getConstructor();
                                            Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxSize$default2);
                                            if (composer4.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor3);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer4);
                                            Updater.m1153setimpl(m1149constructorimpl3, columnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl3, density4, companion4.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                                            composer4.enableReusing();
                                            materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-1163856341);
                                            function33.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                        }
                                    }), composer3, ((i17 >> 9) & 112) | 1572864 | (i18 & 896) | (i18 & 7168) | (458752 & i17), 16);
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                            };
                            composer2 = startRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default, null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, function3), composer2, 3072, 6);
                            drawerState5 = drawerState4;
                            z4 = z3;
                            shape5 = shape4;
                            f4 = f3;
                            j11 = j6;
                            modifier4 = modifier6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            drawerState5 = drawerState2;
                            z4 = z2;
                            shape5 = shape2;
                            f4 = f2;
                            composer2 = startRestartGroup;
                            j9 = j;
                            j10 = j2;
                            j11 = j3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i15) {
                                DrawerKt.m844ModalDrawerGs3lGvM(Function3.this, modifier4, drawerState5, z4, shape5, f4, j9, j10, j11, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i7 = C.ENCODING_PCM_32BIT;
                    i3 |= i7;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    shape4 = shape3;
                    f3 = m840getElevationD9Ej5fM;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    final DrawerState drawerState62 = drawerState4;
                    final boolean z52 = z3;
                    final long j122 = j6;
                    final Shape shape62 = shape4;
                    j9 = j7;
                    Modifier modifier62 = modifier3;
                    j10 = j8;
                    final float f52 = f3;
                    Function3 function32 = new Function3() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
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
                        public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i15) {
                            int i16;
                            float f6;
                            Modifier m998swipeablepPrIpRY;
                            float f7;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i15 & 14) == 0) {
                                i16 = i15 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i16 = i15;
                            }
                            if ((i16 & 91) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            long constraints = BoxWithConstraints.getConstraints();
                            if (!Constraints.m2483getHasBoundedWidthimpl(constraints)) {
                                throw new IllegalStateException("Drawer shouldn't have infinite width");
                            }
                            final float f8 = -Constraints.m2487getMaxWidthimpl(constraints);
                            Map mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f8), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                            boolean z6 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            SwipeableState swipeableState = DrawerState.this.getSwipeableState();
                            Orientation orientation = Orientation.Horizontal;
                            f6 = DrawerKt.DrawerVelocityThreshold;
                            m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion, swipeableState, mapOf, orientation, (r26 & 8) != 0 ? true : z52, (r26 & 16) != 0 ? false : z6, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final FixedThreshold invoke(Object obj, Object obj2) {
                                    return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                }
                            } : new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                                @Override // kotlin.jvm.functions.Function2
                                @NotNull
                                public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                    Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
                                    Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
                                    return new FractionalThreshold(0.5f);
                                }
                            }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : f6);
                            final DrawerState drawerState7 = DrawerState.this;
                            final int i17 = i8;
                            long j13 = j122;
                            Shape shape7 = shape62;
                            long j14 = j9;
                            long j15 = j10;
                            float f9 = f52;
                            Function2 function2 = content;
                            final boolean z7 = z52;
                            final CoroutineScope coroutineScope22 = coroutineScope2;
                            final Function3 function322 = drawerContent;
                            composer3.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion3.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
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
                            composer3.startReplaceableGroup(-1263168067);
                            composer3.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            Function0 constructor2 = companion3.getConstructor();
                            Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer3);
                            Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            composer3.startReplaceableGroup(32495683);
                            function2.invoke(composer3, Integer.valueOf((i17 >> 27) & 14));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            boolean isOpen = drawerState7.isOpen();
                            Function0 function0 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                    m855invoke();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m855invoke() {
                                    if (z7 && ((Boolean) drawerState7.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                                    }
                                }

                                /* compiled from: Drawer.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                                static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                    final /* synthetic */ DrawerState $drawerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
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
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                            Object valueOf = Float.valueOf(f8);
                            Object valueOf2 = Float.valueOf(0.0f);
                            composer3.startReplaceableGroup(1618982084);
                            boolean changed = composer3.changed(valueOf) | composer3.changed(valueOf2) | composer3.changed(drawerState7);
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final float f10 = 0.0f;
                                rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final Float mo4828invoke() {
                                        float calculateFraction;
                                        calculateFraction = DrawerKt.calculateFraction(f8, f10, ((Number) drawerState7.getOffset().getValue()).floatValue());
                                        return Float.valueOf(calculateFraction);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            DrawerKt.m845ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue2, j13, composer3, (i17 >> 15) & 7168);
                            final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m983getNavigationMenuUdPEhr4(), composer3, 6);
                            Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            Modifier m360sizeInqDBjuR0 = SizeKt.m360sizeInqDBjuR0(companion, density3.mo268toDpu2uoSUM(Constraints.m2489getMinWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2488getMinHeightimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2487getMaxWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2486getMaxHeightimpl(constraints)));
                            composer3.startReplaceableGroup(1157296644);
                            boolean changed2 = composer3.changed(drawerState7);
                            Object rememberedValue3 = composer3.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return IntOffset.m2545boximpl(m856invokeBjo55l4((Density) obj));
                                    }

                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m856invokeBjo55l4(@NotNull Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) DrawerState.this.getOffset().getValue()).floatValue()), 0);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            Modifier offset = OffsetKt.offset(m360sizeInqDBjuR0, (Function1) rememberedValue3);
                            f7 = DrawerKt.EndDrawerPadding;
                            int i18 = i17 >> 12;
                            SurfaceKt.m988SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m338paddingqDBjuR0$default(offset, 0.0f, 0.0f, f7, 0.0f, 11, null), false, new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                                    SemanticsPropertiesKt.setPaneTitle(semantics, m986getString4foXLRw);
                                    if (drawerState7.isOpen()) {
                                        final DrawerState drawerState8 = drawerState7;
                                        final CoroutineScope coroutineScope3 = coroutineScope22;
                                        SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* renamed from: invoke */
                                            public final Boolean mo4828invoke() {
                                                if (((Boolean) DrawerState.this.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00351(DrawerState.this, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }

                                            /* compiled from: Drawer.kt */
                                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
                                            /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                            static final class C00351 extends SuspendLambda implements Function2 {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                C00351(DrawerState drawerState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                    return new C00351(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                                    return ((C00351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
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
                            }, 1, null), shape7, j14, j15, null, f9, ComposableLambdaKt.composableLambda(composer3, -1941234439, true, new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                                public final void invoke(@Nullable Composer composer4, int i19) {
                                    if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Function3 function33 = Function3.this;
                                    int i20 = ((i17 << 9) & 7168) | 6;
                                    composer4.startReplaceableGroup(-483455358);
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    Density density4 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0 constructor3 = companion4.getConstructor();
                                    Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxSize$default22);
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer4);
                                    Updater.m1153setimpl(m1149constructorimpl3, columnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl3, density4, companion4.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                                    composer4.enableReusing();
                                    materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-1163856341);
                                    function33.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                }
                            }), composer3, ((i17 >> 9) & 112) | 1572864 | (i18 & 896) | (i18 & 7168) | (458752 & i17), 16);
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                    };
                    composer2 = startRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default2, null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, function32), composer2, 3072, 6);
                    drawerState5 = drawerState4;
                    z4 = z3;
                    shape5 = shape4;
                    f4 = f3;
                    j11 = j6;
                    modifier4 = modifier62;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f2 = f;
                if ((3670016 & i) != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i7;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                shape4 = shape3;
                f3 = m840getElevationD9Ej5fM;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                final DrawerState drawerState622 = drawerState4;
                final boolean z522 = z3;
                final long j1222 = j6;
                final Shape shape622 = shape4;
                j9 = j7;
                Modifier modifier622 = modifier3;
                j10 = j8;
                final float f522 = f3;
                Function3 function322 = new Function3() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
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
                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i15) {
                        int i16;
                        float f6;
                        Modifier m998swipeablepPrIpRY;
                        float f7;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i15 & 14) == 0) {
                            i16 = i15 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i16 = i15;
                        }
                        if ((i16 & 91) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        long constraints = BoxWithConstraints.getConstraints();
                        if (!Constraints.m2483getHasBoundedWidthimpl(constraints)) {
                            throw new IllegalStateException("Drawer shouldn't have infinite width");
                        }
                        final float f8 = -Constraints.m2487getMaxWidthimpl(constraints);
                        Map mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f8), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        boolean z6 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        SwipeableState swipeableState = DrawerState.this.getSwipeableState();
                        Orientation orientation = Orientation.Horizontal;
                        f6 = DrawerKt.DrawerVelocityThreshold;
                        m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion, swipeableState, mapOf, orientation, (r26 & 8) != 0 ? true : z522, (r26 & 16) != 0 ? false : z6, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                            }
                        } : new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                                Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
                                Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
                                return new FractionalThreshold(0.5f);
                            }
                        }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : f6);
                        final DrawerState drawerState7 = DrawerState.this;
                        final int i17 = i8;
                        long j13 = j1222;
                        Shape shape7 = shape622;
                        long j14 = j9;
                        long j15 = j10;
                        float f9 = f522;
                        Function2 function2 = content;
                        final boolean z7 = z522;
                        final CoroutineScope coroutineScope222 = coroutineScope22;
                        final Function3 function3222 = drawerContent;
                        composer3.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion3.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
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
                        composer3.startReplaceableGroup(-1263168067);
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0 constructor2 = companion3.getConstructor();
                        Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer3);
                        Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        composer3.startReplaceableGroup(32495683);
                        function2.invoke(composer3, Integer.valueOf((i17 >> 27) & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        boolean isOpen = drawerState7.isOpen();
                        Function0 function0 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                m855invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m855invoke() {
                                if (z7 && ((Boolean) drawerState7.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                                }
                            }

                            /* compiled from: Drawer.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
                            /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                                final /* synthetic */ DrawerState $drawerState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                    return new AnonymousClass1(this.$drawerState, continuation);
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
                                        DrawerState drawerState = this.$drawerState;
                                        this.label = 1;
                                        if (drawerState.close(this) == coroutine_suspended) {
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
                        Object valueOf = Float.valueOf(f8);
                        Object valueOf2 = Float.valueOf(0.0f);
                        composer3.startReplaceableGroup(1618982084);
                        boolean changed = composer3.changed(valueOf) | composer3.changed(valueOf2) | composer3.changed(drawerState7);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f10 = 0.0f;
                            rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Float mo4828invoke() {
                                    float calculateFraction;
                                    calculateFraction = DrawerKt.calculateFraction(f8, f10, ((Number) drawerState7.getOffset().getValue()).floatValue());
                                    return Float.valueOf(calculateFraction);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        DrawerKt.m845ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue2, j13, composer3, (i17 >> 15) & 7168);
                        final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m983getNavigationMenuUdPEhr4(), composer3, 6);
                        Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier m360sizeInqDBjuR0 = SizeKt.m360sizeInqDBjuR0(companion, density3.mo268toDpu2uoSUM(Constraints.m2489getMinWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2488getMinHeightimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2487getMaxWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2486getMaxHeightimpl(constraints)));
                        composer3.startReplaceableGroup(1157296644);
                        boolean changed2 = composer3.changed(drawerState7);
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return IntOffset.m2545boximpl(m856invokeBjo55l4((Density) obj));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m856invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) DrawerState.this.getOffset().getValue()).floatValue()), 0);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        Modifier offset = OffsetKt.offset(m360sizeInqDBjuR0, (Function1) rememberedValue3);
                        f7 = DrawerKt.EndDrawerPadding;
                        int i18 = i17 >> 12;
                        SurfaceKt.m988SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m338paddingqDBjuR0$default(offset, 0.0f, 0.0f, f7, 0.0f, 11, null), false, new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                                SemanticsPropertiesKt.setPaneTitle(semantics, m986getString4foXLRw);
                                if (drawerState7.isOpen()) {
                                    final DrawerState drawerState8 = drawerState7;
                                    final CoroutineScope coroutineScope3 = coroutineScope222;
                                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            if (((Boolean) DrawerState.this.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00351(DrawerState.this, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }

                                        /* compiled from: Drawer.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C00351 extends SuspendLambda implements Function2 {
                                            final /* synthetic */ DrawerState $drawerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C00351(DrawerState drawerState, Continuation continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                return new C00351(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                                return ((C00351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                        }, 1, null), shape7, j14, j15, null, f9, ComposableLambdaKt.composableLambda(composer3, -1941234439, true, new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                            public final void invoke(@Nullable Composer composer4, int i19) {
                                if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Function3 function33 = Function3.this;
                                int i20 = ((i17 << 9) & 7168) | 6;
                                composer4.startReplaceableGroup(-483455358);
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                Density density4 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0 constructor3 = companion4.getConstructor();
                                Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxSize$default222);
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer4);
                                Updater.m1153setimpl(m1149constructorimpl3, columnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl3, density4, companion4.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(-1163856341);
                                function33.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                            }
                        }), composer3, ((i17 >> 9) & 112) | 1572864 | (i18 & 896) | (i18 & 7168) | (458752 & i17), 16);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    }
                };
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default22, null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, function322), composer2, 3072, 6);
                drawerState5 = drawerState4;
                z4 = z3;
                shape5 = shape4;
                f4 = f3;
                j11 = j6;
                modifier4 = modifier622;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((3670016 & i) != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i7;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            shape4 = shape3;
            f3 = m840getElevationD9Ej5fM;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            final DrawerState drawerState6222 = drawerState4;
            final boolean z5222 = z3;
            final long j12222 = j6;
            final Shape shape6222 = shape4;
            j9 = j7;
            Modifier modifier6222 = modifier3;
            j10 = j8;
            final float f5222 = f3;
            Function3 function3222 = new Function3() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
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
                public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i15) {
                    int i16;
                    float f6;
                    Modifier m998swipeablepPrIpRY;
                    float f7;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i15 & 14) == 0) {
                        i16 = i15 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i16 = i15;
                    }
                    if ((i16 & 91) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    long constraints = BoxWithConstraints.getConstraints();
                    if (!Constraints.m2483getHasBoundedWidthimpl(constraints)) {
                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                    }
                    final float f8 = -Constraints.m2487getMaxWidthimpl(constraints);
                    Map mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f8), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    boolean z6 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    SwipeableState swipeableState = DrawerState.this.getSwipeableState();
                    Orientation orientation = Orientation.Horizontal;
                    f6 = DrawerKt.DrawerVelocityThreshold;
                    m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion, swipeableState, mapOf, orientation, (r26 & 8) != 0 ? true : z5222, (r26 & 16) != 0 ? false : z6, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final FixedThreshold invoke(Object obj, Object obj2) {
                            return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                        }
                    } : new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                            Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
                            return new FractionalThreshold(0.5f);
                        }
                    }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : f6);
                    final DrawerState drawerState7 = DrawerState.this;
                    final int i17 = i8;
                    long j13 = j12222;
                    Shape shape7 = shape6222;
                    long j14 = j9;
                    long j15 = j10;
                    float f9 = f5222;
                    Function2 function2 = content;
                    final boolean z7 = z5222;
                    final CoroutineScope coroutineScope2222 = coroutineScope222;
                    final Function3 function32222 = drawerContent;
                    composer3.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion3.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
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
                    composer3.startReplaceableGroup(-1263168067);
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0 constructor2 = companion3.getConstructor();
                    Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer3);
                    Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    composer3.startReplaceableGroup(32495683);
                    function2.invoke(composer3, Integer.valueOf((i17 >> 27) & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    boolean isOpen = drawerState7.isOpen();
                    Function0 function0 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            m855invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m855invoke() {
                            if (z7 && ((Boolean) drawerState7.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                            }
                        }

                        /* compiled from: Drawer.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
                        /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                            final /* synthetic */ DrawerState $drawerState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                super(2, continuation);
                                this.$drawerState = drawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                return new AnonymousClass1(this.$drawerState, continuation);
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
                                    DrawerState drawerState = this.$drawerState;
                                    this.label = 1;
                                    if (drawerState.close(this) == coroutine_suspended) {
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
                    Object valueOf = Float.valueOf(f8);
                    Object valueOf2 = Float.valueOf(0.0f);
                    composer3.startReplaceableGroup(1618982084);
                    boolean changed = composer3.changed(valueOf) | composer3.changed(valueOf2) | composer3.changed(drawerState7);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final float f10 = 0.0f;
                        rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Float mo4828invoke() {
                                float calculateFraction;
                                calculateFraction = DrawerKt.calculateFraction(f8, f10, ((Number) drawerState7.getOffset().getValue()).floatValue());
                                return Float.valueOf(calculateFraction);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    DrawerKt.m845ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue2, j13, composer3, (i17 >> 15) & 7168);
                    final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m983getNavigationMenuUdPEhr4(), composer3, 6);
                    Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    Modifier m360sizeInqDBjuR0 = SizeKt.m360sizeInqDBjuR0(companion, density3.mo268toDpu2uoSUM(Constraints.m2489getMinWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2488getMinHeightimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2487getMaxWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2486getMaxHeightimpl(constraints)));
                    composer3.startReplaceableGroup(1157296644);
                    boolean changed2 = composer3.changed(drawerState7);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return IntOffset.m2545boximpl(m856invokeBjo55l4((Density) obj));
                            }

                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                            public final long m856invokeBjo55l4(@NotNull Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) DrawerState.this.getOffset().getValue()).floatValue()), 0);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    composer3.endReplaceableGroup();
                    Modifier offset = OffsetKt.offset(m360sizeInqDBjuR0, (Function1) rememberedValue3);
                    f7 = DrawerKt.EndDrawerPadding;
                    int i18 = i17 >> 12;
                    SurfaceKt.m988SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m338paddingqDBjuR0$default(offset, 0.0f, 0.0f, f7, 0.0f, 11, null), false, new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                            SemanticsPropertiesKt.setPaneTitle(semantics, m986getString4foXLRw);
                            if (drawerState7.isOpen()) {
                                final DrawerState drawerState8 = drawerState7;
                                final CoroutineScope coroutineScope3 = coroutineScope2222;
                                SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final Boolean mo4828invoke() {
                                        if (((Boolean) DrawerState.this.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00351(DrawerState.this, null), 3, null);
                                        }
                                        return Boolean.TRUE;
                                    }

                                    /* compiled from: Drawer.kt */
                                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
                                    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C00351 extends SuspendLambda implements Function2 {
                                        final /* synthetic */ DrawerState $drawerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C00351(DrawerState drawerState, Continuation continuation) {
                                            super(2, continuation);
                                            this.$drawerState = drawerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                            return new C00351(this.$drawerState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                            return ((C00351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                DrawerState drawerState = this.$drawerState;
                                                this.label = 1;
                                                if (drawerState.close(this) == coroutine_suspended) {
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
                    }, 1, null), shape7, j14, j15, null, f9, ComposableLambdaKt.composableLambda(composer3, -1941234439, true, new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                        public final void invoke(@Nullable Composer composer4, int i19) {
                            if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function3 function33 = Function3.this;
                            int i20 = ((i17 << 9) & 7168) | 6;
                            composer4.startReplaceableGroup(-483455358);
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            composer4.startReplaceableGroup(-1323940314);
                            Density density4 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0 constructor3 = companion4.getConstructor();
                            Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxSize$default2222);
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor3);
                            } else {
                                composer4.useNode();
                            }
                            composer4.disableReusing();
                            Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer4);
                            Updater.m1153setimpl(m1149constructorimpl3, columnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl3, density4, companion4.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                            composer4.enableReusing();
                            materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            composer4.startReplaceableGroup(-1163856341);
                            function33.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                        }
                    }), composer3, ((i17 >> 9) & 112) | 1572864 | (i18 & 896) | (i18 & 7168) | (458752 & i17), 16);
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                }
            };
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default222, null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, function3222), composer2, 3072, 6);
            drawerState5 = drawerState4;
            z4 = z3;
            shape5 = shape4;
            f4 = f3;
            j11 = j6;
            modifier4 = modifier6222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i7;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        shape4 = shape3;
        f3 = m840getElevationD9Ej5fM;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        final DrawerState drawerState62222 = drawerState4;
        final boolean z52222 = z3;
        final long j122222 = j6;
        final Shape shape62222 = shape4;
        j9 = j7;
        Modifier modifier62222 = modifier3;
        j10 = j8;
        final float f52222 = f3;
        Function3 function32222 = new Function3() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
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
            public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i15) {
                int i16;
                float f6;
                Modifier m998swipeablepPrIpRY;
                float f7;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i15 & 14) == 0) {
                    i16 = i15 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i16 = i15;
                }
                if ((i16 & 91) == 18 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                long constraints = BoxWithConstraints.getConstraints();
                if (!Constraints.m2483getHasBoundedWidthimpl(constraints)) {
                    throw new IllegalStateException("Drawer shouldn't have infinite width");
                }
                final float f8 = -Constraints.m2487getMaxWidthimpl(constraints);
                Map mapOf = MapsKt.mapOf(TuplesKt.to(Float.valueOf(f8), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                boolean z6 = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                Modifier.Companion companion = Modifier.INSTANCE;
                SwipeableState swipeableState = DrawerState.this.getSwipeableState();
                Orientation orientation = Orientation.Horizontal;
                f6 = DrawerKt.DrawerVelocityThreshold;
                m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion, swipeableState, mapOf, orientation, (r26 & 8) != 0 ? true : z52222, (r26 & 16) != 0 ? false : z6, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final FixedThreshold invoke(Object obj, Object obj2) {
                        return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                    }
                } : new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1.1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final ThresholdConfig invoke(@NotNull DrawerValue drawerValue, @NotNull DrawerValue drawerValue2) {
                        Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
                        return new FractionalThreshold(0.5f);
                    }
                }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : f6);
                final DrawerState drawerState7 = DrawerState.this;
                final int i17 = i8;
                long j13 = j122222;
                Shape shape7 = shape62222;
                long j14 = j9;
                long j15 = j10;
                float f9 = f52222;
                Function2 function2 = content;
                final boolean z7 = z52222;
                final CoroutineScope coroutineScope22222 = coroutineScope2222;
                final Function3 function322222 = drawerContent;
                composer3.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(-1323940314);
                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 constructor = companion3.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
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
                composer3.startReplaceableGroup(-1263168067);
                composer3.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor2 = companion3.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer3);
                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composer3.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-2137368960);
                composer3.startReplaceableGroup(32495683);
                function2.invoke(composer3, Integer.valueOf((i17 >> 27) & 14));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                boolean isOpen = drawerState7.isOpen();
                Function0 function0 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m855invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m855invoke() {
                        if (z7 && ((Boolean) drawerState7.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope22222, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                        }
                    }

                    /* compiled from: Drawer.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                        final /* synthetic */ DrawerState $drawerState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                            super(2, continuation);
                            this.$drawerState = drawerState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            return new AnonymousClass1(this.$drawerState, continuation);
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
                                DrawerState drawerState = this.$drawerState;
                                this.label = 1;
                                if (drawerState.close(this) == coroutine_suspended) {
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
                Object valueOf = Float.valueOf(f8);
                Object valueOf2 = Float.valueOf(0.0f);
                composer3.startReplaceableGroup(1618982084);
                boolean changed = composer3.changed(valueOf) | composer3.changed(valueOf2) | composer3.changed(drawerState7);
                Object rememberedValue2 = composer3.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final float f10 = 0.0f;
                    rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Float mo4828invoke() {
                            float calculateFraction;
                            calculateFraction = DrawerKt.calculateFraction(f8, f10, ((Number) drawerState7.getOffset().getValue()).floatValue());
                            return Float.valueOf(calculateFraction);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue2);
                }
                composer3.endReplaceableGroup();
                DrawerKt.m845ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue2, j13, composer3, (i17 >> 15) & 7168);
                final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m983getNavigationMenuUdPEhr4(), composer3, 6);
                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                Modifier m360sizeInqDBjuR0 = SizeKt.m360sizeInqDBjuR0(companion, density3.mo268toDpu2uoSUM(Constraints.m2489getMinWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2488getMinHeightimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2487getMaxWidthimpl(constraints)), density3.mo268toDpu2uoSUM(Constraints.m2486getMaxHeightimpl(constraints)));
                composer3.startReplaceableGroup(1157296644);
                boolean changed2 = composer3.changed(drawerState7);
                Object rememberedValue3 = composer3.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return IntOffset.m2545boximpl(m856invokeBjo55l4((Density) obj));
                        }

                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m856invokeBjo55l4(@NotNull Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) DrawerState.this.getOffset().getValue()).floatValue()), 0);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue3);
                }
                composer3.endReplaceableGroup();
                Modifier offset = OffsetKt.offset(m360sizeInqDBjuR0, (Function1) rememberedValue3);
                f7 = DrawerKt.EndDrawerPadding;
                int i18 = i17 >> 12;
                SurfaceKt.m988SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m338paddingqDBjuR0$default(offset, 0.0f, 0.0f, f7, 0.0f, 11, null), false, new Function1() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                        SemanticsPropertiesKt.setPaneTitle(semantics, m986getString4foXLRw);
                        if (drawerState7.isOpen()) {
                            final DrawerState drawerState8 = drawerState7;
                            final CoroutineScope coroutineScope3 = coroutineScope22222;
                            SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Boolean mo4828invoke() {
                                    if (((Boolean) DrawerState.this.getSwipeableState().getConfirmStateChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00351(DrawerState.this, null), 3, null);
                                    }
                                    return Boolean.TRUE;
                                }

                                /* compiled from: Drawer.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00351 extends SuspendLambda implements Function2 {
                                    final /* synthetic */ DrawerState $drawerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00351(DrawerState drawerState, Continuation continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                        return new C00351(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                        return ((C00351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
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
                }, 1, null), shape7, j14, j15, null, f9, ComposableLambdaKt.composableLambda(composer3, -1941234439, true, new Function2() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
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
                    public final void invoke(@Nullable Composer composer4, int i19) {
                        if ((i19 & 11) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function3 function33 = Function3.this;
                        int i20 = ((i17 << 9) & 7168) | 6;
                        composer4.startReplaceableGroup(-483455358);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                        composer4.startReplaceableGroup(-1323940314);
                        Density density4 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection3 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0 constructor3 = companion4.getConstructor();
                        Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxSize$default22222);
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        composer4.disableReusing();
                        Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer4);
                        Updater.m1153setimpl(m1149constructorimpl3, columnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl3, density4, companion4.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                        composer4.enableReusing();
                        materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                        composer4.startReplaceableGroup(2058660585);
                        composer4.startReplaceableGroup(-1163856341);
                        function33.invoke(ColumnScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                        composer4.endReplaceableGroup();
                        composer4.endReplaceableGroup();
                        composer4.endNode();
                        composer4.endReplaceableGroup();
                        composer4.endReplaceableGroup();
                    }
                }), composer3, ((i17 >> 9) & 112) | 1572864 | (i18 & 896) | (i18 & 7168) | (458752 & i17), 16);
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
            }
        };
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(fillMaxSize$default2222, null, false, ComposableLambdaKt.composableLambda(composer2, 816674999, true, function32222), composer2, 3072, 6);
        drawerState5 = drawerState4;
        z4 = z3;
        shape5 = shape4;
        f4 = f3;
        j11 = j6;
        modifier4 = modifier62222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /* renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m841BottomDrawerGs3lGvM(final Function3 drawerContent, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z, Shape shape, float f, long j, long j2, long j3, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BottomDrawerState bottomDrawerState2;
        int i4;
        boolean z2;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        int i7;
        BottomDrawerState bottomDrawerState3;
        Shape shape3;
        long j4;
        long j5;
        long j6;
        Modifier modifier3;
        BottomDrawerState bottomDrawerState4;
        boolean z3;
        long j7;
        long j8;
        Shape shape4;
        float f3;
        Object rememberedValue;
        Composer composer2;
        final BottomDrawerState bottomDrawerState5;
        final boolean z4;
        final Shape shape5;
        final float f4;
        final long j9;
        final long j10;
        final long j11;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(625649286);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(drawerContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    bottomDrawerState2 = bottomDrawerState;
                    if (startRestartGroup.changed(bottomDrawerState2)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                } else {
                    bottomDrawerState2 = bottomDrawerState;
                }
                i12 = 128;
                i3 |= i12;
            } else {
                bottomDrawerState2 = bottomDrawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            i6 = i13;
                            if (startRestartGroup.changed(j)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            i6 = i13;
                        }
                        i10 = 524288;
                        i3 |= i10;
                    } else {
                        i6 = i13;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(j2)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(j3)) {
                            i8 = 67108864;
                            i3 |= i8;
                        }
                        i8 = 33554432;
                        i3 |= i8;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i7 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    bottomDrawerState3 = rememberBottomDrawerState(BottomDrawerValue.Closed, null, startRestartGroup, 6, 2);
                                    i3 &= -897;
                                } else {
                                    bottomDrawerState3 = bottomDrawerState2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                    i3 &= -57345;
                                } else {
                                    shape3 = shape2;
                                }
                                float m840getElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m840getElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                    i3 &= -3670017;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 128) != 0) {
                                    j5 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    j5 = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                    modifier3 = modifier5;
                                    bottomDrawerState4 = bottomDrawerState3;
                                    z3 = z2;
                                    j8 = j5;
                                    j6 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    shape4 = shape3;
                                    f3 = m840getElevationD9Ej5fM;
                                    j7 = j4;
                                } else {
                                    j6 = j3;
                                    modifier3 = modifier5;
                                    bottomDrawerState4 = bottomDrawerState3;
                                    z3 = z2;
                                    j7 = j4;
                                    j8 = j5;
                                    shape4 = shape3;
                                    f3 = m840getElevationD9Ej5fM;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                j7 = j;
                                j8 = j2;
                                j6 = j3;
                                modifier3 = modifier2;
                                bottomDrawerState4 = bottomDrawerState2;
                                z3 = z2;
                                shape4 = shape2;
                                f3 = f2;
                            }
                            int i14 = i3;
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
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            Modifier modifier6 = modifier3;
                            composer2 = startRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z3, bottomDrawerState4, content, i14, j6, shape4, j7, j8, f3, coroutineScope, drawerContent)), composer2, 3072, 6);
                            bottomDrawerState5 = bottomDrawerState4;
                            z4 = z3;
                            shape5 = shape4;
                            f4 = f3;
                            j9 = j7;
                            j10 = j8;
                            j11 = j6;
                            modifier4 = modifier6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            j11 = j3;
                            modifier4 = modifier2;
                            bottomDrawerState5 = bottomDrawerState2;
                            z4 = z2;
                            shape5 = shape2;
                            f4 = f2;
                            composer2 = startRestartGroup;
                            j9 = j;
                            j10 = j2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i15) {
                                DrawerKt.m841BottomDrawerGs3lGvM(Function3.this, modifier4, bottomDrawerState5, z4, shape5, f4, j9, j10, j11, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i7 = C.ENCODING_PCM_32BIT;
                    i3 |= i7;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    int i142 = i3;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Modifier modifier62 = modifier3;
                    composer2 = startRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z3, bottomDrawerState4, content, i142, j6, shape4, j7, j8, f3, coroutineScope2, drawerContent)), composer2, 3072, 6);
                    bottomDrawerState5 = bottomDrawerState4;
                    z4 = z3;
                    shape5 = shape4;
                    f4 = f3;
                    j9 = j7;
                    j10 = j8;
                    j11 = j6;
                    modifier4 = modifier62;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f2 = f;
                if ((3670016 & i) != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i7;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                int i1422 = i3;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                Modifier modifier622 = modifier3;
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z3, bottomDrawerState4, content, i1422, j6, shape4, j7, j8, f3, coroutineScope22, drawerContent)), composer2, 3072, 6);
                bottomDrawerState5 = bottomDrawerState4;
                z4 = z3;
                shape5 = shape4;
                f4 = f3;
                j9 = j7;
                j10 = j8;
                j11 = j6;
                modifier4 = modifier622;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((3670016 & i) != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i7;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            int i14222 = i3;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Modifier modifier6222 = modifier3;
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z3, bottomDrawerState4, content, i14222, j6, shape4, j7, j8, f3, coroutineScope222, drawerContent)), composer2, 3072, 6);
            bottomDrawerState5 = bottomDrawerState4;
            z4 = z3;
            shape5 = shape4;
            f4 = f3;
            j9 = j7;
            j10 = j8;
            j11 = j6;
            modifier4 = modifier6222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i7;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        int i142222 = i3;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Modifier modifier62222 = modifier3;
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composer2, 1220102512, true, new DrawerKt$BottomDrawer$1(z3, bottomDrawerState4, content, i142222, j6, shape4, j7, j8, f3, coroutineScope2222, drawerContent)), composer2, 3072, 6);
        bottomDrawerState5 = bottomDrawerState4;
        z4 = z3;
        shape5 = shape4;
        f4 = f3;
        j9 = j7;
        j10 = j8;
        j11 = j6;
        modifier4 = modifier62222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m842BottomDrawerScrim3JVO9M(final long j, final Function0 function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
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
            final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m979getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1298949409);
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(function0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed(m986getString4foXLRw) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
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
                            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
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
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
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
                        float m843BottomDrawerScrim_3J_VO9M$lambda0;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        long j2 = j;
                        m843BottomDrawerScrim_3J_VO9M$lambda0 = DrawerKt.m843BottomDrawerScrim_3J_VO9M$lambda0(animateFloatAsState);
                        DrawScope.m1703drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m843BottomDrawerScrim_3J_VO9M$lambda0, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
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
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$2
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
                DrawerKt.m842BottomDrawerScrim3JVO9M(j, function0, z, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m845ScrimBx497Mc(final boolean z, final Function0 function0, final Function0 function02, final long j, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function02) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m979getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010554047);
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(function0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed(m986getString4foXLRw) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
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
                            final Function0 function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
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
            boolean changed3 = startRestartGroup.changed(m1441boximpl) | startRestartGroup.changed(function02);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
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
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        DrawScope.m1703drawRectnJ9OG0$default(Canvas, j, 0L, 0L, ((Number) function02.mo4828invoke()).floatValue(), null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$Scrim$2
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
                DrawerKt.m845ScrimBx497Mc(z, function0, function02, j, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomDrawerScrim_3J_VO9M$lambda-0, reason: not valid java name */
    public static final float m843BottomDrawerScrim_3J_VO9M$lambda0(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
