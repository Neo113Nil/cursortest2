package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010'\u001a/\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "border", "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008a  */
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m988SurfaceFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        float f2;
        Shape shape2;
        long j5;
        BorderStroke borderStroke3;
        float f3;
        Modifier modifier2;
        long j6;
        final int i6;
        final Shape shape3;
        final long j7;
        final BorderStroke borderStroke4;
        final float f4;
        final Modifier modifier3;
        final long j8;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1412203386);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                borderStroke2 = borderStroke;
                i3 |= startRestartGroup.changed(borderStroke2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((458752 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((i2 & 64) != 0) {
                        i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                        if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier;
                                Shape rectangleShape = i11 != 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                }
                                if ((i2 & 8) != 0) {
                                    long m814contentColorForek8zF_U = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                    i3 &= -7169;
                                    j4 = m814contentColorForek8zF_U;
                                }
                                if (i4 != 0) {
                                    borderStroke2 = null;
                                }
                                if (i5 != 0) {
                                    shape2 = rectangleShape;
                                    f3 = Dp.m2507constructorimpl(0);
                                    j6 = j3;
                                    j5 = j4;
                                    borderStroke3 = borderStroke2;
                                    modifier2 = modifier4;
                                    i6 = i3;
                                    startRestartGroup.endDefaults();
                                    final float m2507constructorimpl = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f3);
                                    final Modifier modifier5 = modifier2;
                                    shape3 = shape2;
                                    j7 = j6;
                                    borderStroke4 = borderStroke3;
                                    f4 = f3;
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                                            long m995surfaceColorAtElevationcq6XJ1M;
                                            Modifier m994surface8ww4TTg;
                                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                                Modifier modifier6 = Modifier.this;
                                                Shape shape4 = shape3;
                                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j7, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl, composer2, (i6 >> 6) & 14);
                                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(modifier6, shape4, m995surfaceColorAtElevationcq6XJ1M, borderStroke4, f4);
                                                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m994surface8ww4TTg, false, new Function1() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((SemanticsPropertyReceiver) obj);
                                                        return Unit.INSTANCE;
                                                    }
                                                }), Unit.INSTANCE, new AnonymousClass2(null));
                                                Function2 function2 = content;
                                                int i13 = i6;
                                                composer2.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                                composer2.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(pointerInput);
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
                                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                                composer2.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                                composer2.startReplaceableGroup(2058660585);
                                                composer2.startReplaceableGroup(-2137368960);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer2.startReplaceableGroup(1539610176);
                                                function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
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

                                        /* compiled from: Surface.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                                        static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                                            int label;

                                            AnonymousClass2(Continuation continuation) {
                                                super(2, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                return new AnonymousClass2(continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                                                return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                if (this.label != 0) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }), startRestartGroup, 56);
                                    modifier3 = modifier2;
                                    j8 = j5;
                                } else {
                                    shape2 = rectangleShape;
                                    j5 = j4;
                                    borderStroke3 = borderStroke2;
                                    f3 = f2;
                                    modifier2 = modifier4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    shape2 = shape;
                                    j5 = j4;
                                    borderStroke3 = borderStroke2;
                                    f3 = f2;
                                    modifier2 = modifier;
                                    j6 = j3;
                                    i6 = i3 & (-7169);
                                    startRestartGroup.endDefaults();
                                    final float m2507constructorimpl2 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f3);
                                    final Modifier modifier52 = modifier2;
                                    shape3 = shape2;
                                    j7 = j6;
                                    borderStroke4 = borderStroke3;
                                    f4 = f3;
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                                            long m995surfaceColorAtElevationcq6XJ1M;
                                            Modifier m994surface8ww4TTg;
                                            if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                                Modifier modifier6 = Modifier.this;
                                                Shape shape4 = shape3;
                                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j7, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2, composer2, (i6 >> 6) & 14);
                                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(modifier6, shape4, m995surfaceColorAtElevationcq6XJ1M, borderStroke4, f4);
                                                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m994surface8ww4TTg, false, new Function1() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((SemanticsPropertyReceiver) obj);
                                                        return Unit.INSTANCE;
                                                    }
                                                }), Unit.INSTANCE, new AnonymousClass2(null));
                                                Function2 function2 = content;
                                                int i13 = i6;
                                                composer2.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                                composer2.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(pointerInput);
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
                                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                                composer2.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                                composer2.startReplaceableGroup(2058660585);
                                                composer2.startReplaceableGroup(-2137368960);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer2.startReplaceableGroup(1539610176);
                                                function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
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

                                        /* compiled from: Surface.kt */
                                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                                        /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                                        static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                                            int label;

                                            AnonymousClass2(Continuation continuation) {
                                                super(2, continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                                return new AnonymousClass2(continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                                                return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) {
                                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                if (this.label != 0) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }), startRestartGroup, 56);
                                    modifier3 = modifier2;
                                    j8 = j5;
                                } else {
                                    shape2 = shape;
                                    j5 = j4;
                                    borderStroke3 = borderStroke2;
                                    f3 = f2;
                                    modifier2 = modifier;
                                }
                            }
                            j6 = j3;
                            i6 = i3;
                            startRestartGroup.endDefaults();
                            final float m2507constructorimpl22 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f3);
                            final Modifier modifier522 = modifier2;
                            shape3 = shape2;
                            j7 = j6;
                            borderStroke4 = borderStroke3;
                            f4 = f3;
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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
                                    long m995surfaceColorAtElevationcq6XJ1M;
                                    Modifier m994surface8ww4TTg;
                                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                        Modifier modifier6 = Modifier.this;
                                        Shape shape4 = shape3;
                                        m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j7, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22, composer2, (i6 >> 6) & 14);
                                        m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(modifier6, shape4, m995surfaceColorAtElevationcq6XJ1M, borderStroke4, f4);
                                        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m994surface8ww4TTg, false, new Function1() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((SemanticsPropertyReceiver) obj);
                                                return Unit.INSTANCE;
                                            }
                                        }), Unit.INSTANCE, new AnonymousClass2(null));
                                        Function2 function2 = content;
                                        int i13 = i6;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                        composer2.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(pointerInput);
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
                                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                        composer2.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composer2.startReplaceableGroup(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer2.startReplaceableGroup(1539610176);
                                        function2.invoke(composer2, Integer.valueOf((i13 >> 18) & 14));
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

                                /* compiled from: Surface.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                                static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                                    int label;

                                    AnonymousClass2(Continuation continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                        return new AnonymousClass2(continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                                        return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }), startRestartGroup, 56);
                            modifier3 = modifier2;
                            j8 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            shape3 = shape;
                            j7 = j3;
                            j8 = j4;
                            borderStroke4 = borderStroke2;
                            f4 = f2;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$2
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
                                SurfaceKt.m988SurfaceFjzlyU(Modifier.this, shape3, j7, j8, borderStroke4, f4, content, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((i3 & 2995931) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                }
                f2 = f;
                if ((i2 & 64) != 0) {
                }
                i3 |= i7;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
            }
            borderStroke2 = borderStroke;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i2 & 64) != 0) {
            }
            i3 |= i7;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
        }
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        borderStroke2 = borderStroke;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i2 & 64) != 0) {
        }
        i3 |= i7;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m989SurfaceLPr_se0(final Function0 onClick, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        long j4;
        long j5;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        float f2;
        boolean z2;
        Shape shape2;
        long j6;
        long j7;
        BorderStroke borderStroke2;
        final int i11;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j8;
        final long j9;
        final BorderStroke borderStroke3;
        final float f3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1560876237);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(shape) ? 2048 : 1024;
                    if ((57344 & i) == 0) {
                        if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j3 = j2;
                            if (startRestartGroup.changed(j3)) {
                                i12 = 131072;
                                i3 |= i12;
                            }
                        } else {
                            j3 = j2;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        j3 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((1879048192 & i) == 0) {
                            i9 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier2 = modifier;
                                z2 = z;
                                shape2 = shape;
                                j6 = j;
                                borderStroke2 = borderStroke;
                                f2 = f;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i11 = i3;
                                j7 = j3;
                            } else {
                                Modifier modifier4 = i14 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 != 0 ? true : z;
                                Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                if ((i2 & 16) != 0) {
                                    j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                    i3 &= -57345;
                                } else {
                                    j4 = j;
                                }
                                if ((i2 & 32) != 0) {
                                    j5 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 12) & 14);
                                    i3 &= -458753;
                                } else {
                                    j5 = j3;
                                }
                                BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                                float m2507constructorimpl = i7 != 0 ? Dp.m2507constructorimpl(0) : f;
                                if (i8 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    i10 = i3;
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    i10 = i3;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                modifier2 = modifier4;
                                f2 = m2507constructorimpl;
                                z2 = z4;
                                shape2 = rectangleShape;
                                j6 = j4;
                                j7 = j5;
                                borderStroke2 = borderStroke4;
                                i11 = i10;
                            }
                            startRestartGroup.endDefaults();
                            final float m2507constructorimpl2 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                            final Modifier modifier5 = modifier2;
                            final Shape shape4 = shape2;
                            final long j10 = j6;
                            final BorderStroke borderStroke5 = borderStroke2;
                            final float f4 = f2;
                            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            final boolean z5 = z2;
                            composer2 = startRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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
                                public final void invoke(@Nullable Composer composer3, int i15) {
                                    long m995surfaceColorAtElevationcq6XJ1M;
                                    Modifier m994surface8ww4TTg;
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                        Shape shape5 = shape4;
                                        m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2, composer3, (i11 >> 12) & 14);
                                        m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                        Modifier m170clickableO2vRcR0$default = ClickableKt.m170clickableO2vRcR0$default(m994surface8ww4TTg, mutableInteractionSource4, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
                                        Function2 function2 = content;
                                        int i16 = i11;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                        composer3.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(m170clickableO2vRcR0$default);
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
                                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-390905273);
                                        function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 56);
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            j8 = j6;
                            j9 = j7;
                            borderStroke3 = borderStroke2;
                            f3 = f2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            shape3 = shape;
                            j8 = j;
                            j9 = j3;
                            composer2 = startRestartGroup;
                            borderStroke3 = borderStroke;
                            f3 = f;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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
                                SurfaceKt.m989SurfaceLPr_se0(Function0.this, modifier3, z3, shape3, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i9 = C.ENCODING_PCM_32BIT;
                    i3 |= i9;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    modifier2 = modifier4;
                    f2 = m2507constructorimpl;
                    z2 = z4;
                    shape2 = rectangleShape;
                    j6 = j4;
                    j7 = j5;
                    borderStroke2 = borderStroke4;
                    i11 = i10;
                    startRestartGroup.endDefaults();
                    final float m2507constructorimpl22 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                    final Modifier modifier52 = modifier2;
                    final Shape shape42 = shape2;
                    final long j102 = j6;
                    final BorderStroke borderStroke52 = borderStroke2;
                    final float f42 = f2;
                    final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    final boolean z52 = z2;
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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
                        public final void invoke(@Nullable Composer composer3, int i15) {
                            long m995surfaceColorAtElevationcq6XJ1M;
                            Modifier m994surface8ww4TTg;
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape42;
                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j102, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22, composer3, (i11 >> 12) & 14);
                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                Modifier m170clickableO2vRcR0$default = ClickableKt.m170clickableO2vRcR0$default(m994surface8ww4TTg, mutableInteractionSource42, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z52, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
                                Function2 function2 = content;
                                int i16 = i11;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(m170clickableO2vRcR0$default);
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
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-390905273);
                                function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                    modifier3 = modifier2;
                    z3 = z2;
                    shape3 = shape2;
                    j8 = j6;
                    j9 = j7;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((57344 & i) == 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                i3 |= i9;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i14 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                modifier2 = modifier4;
                f2 = m2507constructorimpl;
                z2 = z4;
                shape2 = rectangleShape;
                j6 = j4;
                j7 = j5;
                borderStroke2 = borderStroke4;
                i11 = i10;
                startRestartGroup.endDefaults();
                final float m2507constructorimpl222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                final Modifier modifier522 = modifier2;
                final Shape shape422 = shape2;
                final long j1022 = j6;
                final BorderStroke borderStroke522 = borderStroke2;
                final float f422 = f2;
                final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                final boolean z522 = z2;
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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
                    public final void invoke(@Nullable Composer composer3, int i15) {
                        long m995surfaceColorAtElevationcq6XJ1M;
                        Modifier m994surface8ww4TTg;
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape422;
                            m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j1022, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl222, composer3, (i11 >> 12) & 14);
                            m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                            Modifier m170clickableO2vRcR0$default = ClickableKt.m170clickableO2vRcR0$default(m994surface8ww4TTg, mutableInteractionSource422, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z522, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
                            Function2 function2 = content;
                            int i16 = i11;
                            composer3.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m170clickableO2vRcR0$default);
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
                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-390905273);
                            function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 56);
                modifier3 = modifier2;
                z3 = z2;
                shape3 = shape2;
                j8 = j6;
                j9 = j7;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            i3 |= i9;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i14 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            modifier2 = modifier4;
            f2 = m2507constructorimpl;
            z2 = z4;
            shape2 = rectangleShape;
            j6 = j4;
            j7 = j5;
            borderStroke2 = borderStroke4;
            i11 = i10;
            startRestartGroup.endDefaults();
            final float m2507constructorimpl2222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
            final Modifier modifier5222 = modifier2;
            final Shape shape4222 = shape2;
            final long j10222 = j6;
            final BorderStroke borderStroke5222 = borderStroke2;
            final float f4222 = f2;
            final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            final boolean z5222 = z2;
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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
                public final void invoke(@Nullable Composer composer3, int i15) {
                    long m995surfaceColorAtElevationcq6XJ1M;
                    Modifier m994surface8ww4TTg;
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape4222;
                        m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j10222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2222, composer3, (i11 >> 12) & 14);
                        m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                        Modifier m170clickableO2vRcR0$default = ClickableKt.m170clickableO2vRcR0$default(m994surface8ww4TTg, mutableInteractionSource4222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5222, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
                        Function2 function2 = content;
                        int i16 = i11;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m170clickableO2vRcR0$default);
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
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-390905273);
                        function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 56);
            modifier3 = modifier2;
            z3 = z2;
            shape3 = shape2;
            j8 = j6;
            j9 = j7;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        i3 |= i9;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i14 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        modifier2 = modifier4;
        f2 = m2507constructorimpl;
        z2 = z4;
        shape2 = rectangleShape;
        j6 = j4;
        j7 = j5;
        borderStroke2 = borderStroke4;
        i11 = i10;
        startRestartGroup.endDefaults();
        final float m2507constructorimpl22222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
        final Modifier modifier52222 = modifier2;
        final Shape shape42222 = shape2;
        final long j102222 = j6;
        final BorderStroke borderStroke52222 = borderStroke2;
        final float f42222 = f2;
        final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        final boolean z52222 = z2;
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22222))}, ComposableLambdaKt.composableLambda(composer2, 2031491085, true, new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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
            public final void invoke(@Nullable Composer composer3, int i15) {
                long m995surfaceColorAtElevationcq6XJ1M;
                Modifier m994surface8ww4TTg;
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape42222;
                    m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j102222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22222, composer3, (i11 >> 12) & 14);
                    m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                    Modifier m170clickableO2vRcR0$default = ClickableKt.m170clickableO2vRcR0$default(m994surface8ww4TTg, mutableInteractionSource42222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z52222, null, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick, 8, null);
                    Function2 function2 = content;
                    int i16 = i11;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(m170clickableO2vRcR0$default);
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
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-390905273);
                    function2.invoke(composer3, Integer.valueOf((i16 >> 27) & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, 56);
        modifier3 = modifier2;
        z3 = z2;
        shape3 = shape2;
        j8 = j6;
        j9 = j7;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m990SurfaceNy5ogXk(final boolean z, final Function0 onClick, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2 content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j4;
        int i12;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        float f2;
        Modifier modifier2;
        boolean z3;
        Shape shape2;
        long j5;
        long j6;
        final int i13;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final long j7;
        final long j8;
        final BorderStroke borderStroke3;
        final float f3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(262027249);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    i4 |= startRestartGroup.changed(shape) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j2;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j2;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i8 = i3 & 256;
                        if (i8 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 67108864 : 33554432;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            i4 |= C.ENCODING_PCM_32BIT;
                        } else if ((i & 1879048192) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else {
                            if ((i2 & 14) != 0) {
                                i10 = i2;
                                if ((1533916891 & i4) == 306783378 || (i10 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        z3 = z2;
                                        shape2 = shape;
                                        j5 = j;
                                        borderStroke2 = borderStroke;
                                        f2 = f;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        i13 = i4;
                                        j6 = j3;
                                    } else {
                                        Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier;
                                        boolean z5 = i5 == 0 ? true : z2;
                                        Shape rectangleShape = i6 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                        if ((i3 & 32) == 0) {
                                            j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                            i4 &= -458753;
                                        } else {
                                            j4 = j;
                                        }
                                        if ((i3 & 64) != 0) {
                                            j3 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        }
                                        BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                        float m2507constructorimpl = i8 == 0 ? Dp.m2507constructorimpl(0) : f;
                                        if (i9 == 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            i12 = i4;
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            i12 = i4;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        borderStroke2 = borderStroke4;
                                        f2 = m2507constructorimpl;
                                        modifier2 = modifier4;
                                        z3 = z5;
                                        shape2 = rectangleShape;
                                        j5 = j4;
                                        j6 = j3;
                                        i13 = i12;
                                    }
                                    startRestartGroup.endDefaults();
                                    final float m2507constructorimpl2 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2))};
                                    final Modifier modifier5 = modifier2;
                                    final Shape shape4 = shape2;
                                    final long j9 = j5;
                                    final BorderStroke borderStroke5 = borderStroke2;
                                    final float f4 = f2;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final boolean z6 = z3;
                                    final int i15 = i10;
                                    Function2 function2 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                                        public final void invoke(@Nullable Composer composer3, int i16) {
                                            long m995surfaceColorAtElevationcq6XJ1M;
                                            Modifier m994surface8ww4TTg;
                                            if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                                Shape shape5 = shape4;
                                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2, composer3, (i13 >> 15) & 14);
                                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                                Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource4, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z6, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                                                Function2 function22 = content;
                                                int i17 = i15;
                                                composer3.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(m498selectableO2vRcR0);
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
                                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-2137368960);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(23612267);
                                                function22.invoke(composer3, Integer.valueOf(i17 & 14));
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    };
                                    composer2 = startRestartGroup;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function2), composer2, 56);
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    shape3 = shape2;
                                    j7 = j5;
                                    j8 = j6;
                                    borderStroke3 = borderStroke2;
                                    f3 = f2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    z4 = z2;
                                    shape3 = shape;
                                    j7 = j;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    j8 = j3;
                                    composer2 = startRestartGroup;
                                    borderStroke3 = borderStroke;
                                    f3 = f;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$8
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer3, int i16) {
                                        SurfaceKt.m990SurfaceNy5ogXk(z, onClick, modifier3, z4, shape3, j7, j8, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
                                    }
                                });
                                return;
                            }
                            i11 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                        }
                        i10 = i11;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        borderStroke2 = borderStroke4;
                        f2 = m2507constructorimpl;
                        modifier2 = modifier4;
                        z3 = z5;
                        shape2 = rectangleShape;
                        j5 = j4;
                        j6 = j3;
                        i13 = i12;
                        startRestartGroup.endDefaults();
                        final float m2507constructorimpl22 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                        ProvidedValue[] providedValueArr2 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22))};
                        final Modifier modifier52 = modifier2;
                        final Shape shape42 = shape2;
                        final long j92 = j5;
                        final BorderStroke borderStroke52 = borderStroke2;
                        final float f42 = f2;
                        final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        final boolean z62 = z3;
                        final int i152 = i10;
                        Function2 function22 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                            public final void invoke(@Nullable Composer composer3, int i16) {
                                long m995surfaceColorAtElevationcq6XJ1M;
                                Modifier m994surface8ww4TTg;
                                if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape5 = shape42;
                                    m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j92, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22, composer3, (i13 >> 15) & 14);
                                    m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                    Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource42, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z62, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                                    Function2 function222 = content;
                                    int i17 = i152;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(m498selectableO2vRcR0);
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
                                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(23612267);
                                    function222.invoke(composer3, Integer.valueOf(i17 & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        };
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr2, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function22), composer2, 56);
                        modifier3 = modifier2;
                        z4 = z3;
                        shape3 = shape2;
                        j7 = j5;
                        j8 = j6;
                        borderStroke3 = borderStroke2;
                        f3 = f2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    i10 = i11;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    borderStroke2 = borderStroke4;
                    f2 = m2507constructorimpl;
                    modifier2 = modifier4;
                    z3 = z5;
                    shape2 = rectangleShape;
                    j5 = j4;
                    j6 = j3;
                    i13 = i12;
                    startRestartGroup.endDefaults();
                    final float m2507constructorimpl222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                    ProvidedValue[] providedValueArr22 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl222))};
                    final Modifier modifier522 = modifier2;
                    final Shape shape422 = shape2;
                    final long j922 = j5;
                    final BorderStroke borderStroke522 = borderStroke2;
                    final float f422 = f2;
                    final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    final boolean z622 = z3;
                    final int i1522 = i10;
                    Function2 function222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                        public final void invoke(@Nullable Composer composer3, int i16) {
                            long m995surfaceColorAtElevationcq6XJ1M;
                            Modifier m994surface8ww4TTg;
                            if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape422;
                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j922, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl222, composer3, (i13 >> 15) & 14);
                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                                Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource422, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z622, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                                Function2 function2222 = content;
                                int i17 = i1522;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(m498selectableO2vRcR0);
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
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(23612267);
                                function2222.invoke(composer3, Integer.valueOf(i17 & 14));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr22, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function222), composer2, 56);
                    modifier3 = modifier2;
                    z4 = z3;
                    shape3 = shape2;
                    j7 = j5;
                    j8 = j6;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((458752 & i) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                i10 = i11;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i14 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                borderStroke2 = borderStroke4;
                f2 = m2507constructorimpl;
                modifier2 = modifier4;
                z3 = z5;
                shape2 = rectangleShape;
                j5 = j4;
                j6 = j3;
                i13 = i12;
                startRestartGroup.endDefaults();
                final float m2507constructorimpl2222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                ProvidedValue[] providedValueArr222 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2222))};
                final Modifier modifier5222 = modifier2;
                final Shape shape4222 = shape2;
                final long j9222 = j5;
                final BorderStroke borderStroke5222 = borderStroke2;
                final float f4222 = f2;
                final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                final boolean z6222 = z3;
                final int i15222 = i10;
                Function2 function2222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                    public final void invoke(@Nullable Composer composer3, int i16) {
                        long m995surfaceColorAtElevationcq6XJ1M;
                        Modifier m994surface8ww4TTg;
                        if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape4222;
                            m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j9222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2222, composer3, (i13 >> 15) & 14);
                            m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                            Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource4222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z6222, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                            Function2 function22222 = content;
                            int i17 = i15222;
                            composer3.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m498selectableO2vRcR0);
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
                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(23612267);
                            function22222.invoke(composer3, Integer.valueOf(i17 & 14));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                };
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(providedValueArr222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function2222), composer2, 56);
                modifier3 = modifier2;
                z4 = z3;
                shape3 = shape2;
                j7 = j5;
                j8 = j6;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            i10 = i11;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i14 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            borderStroke2 = borderStroke4;
            f2 = m2507constructorimpl;
            modifier2 = modifier4;
            z3 = z5;
            shape2 = rectangleShape;
            j5 = j4;
            j6 = j3;
            i13 = i12;
            startRestartGroup.endDefaults();
            final float m2507constructorimpl22222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
            ProvidedValue[] providedValueArr2222 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22222))};
            final Modifier modifier52222 = modifier2;
            final Shape shape42222 = shape2;
            final long j92222 = j5;
            final BorderStroke borderStroke52222 = borderStroke2;
            final float f42222 = f2;
            final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            final boolean z62222 = z3;
            final int i152222 = i10;
            Function2 function22222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                public final void invoke(@Nullable Composer composer3, int i16) {
                    long m995surfaceColorAtElevationcq6XJ1M;
                    Modifier m994surface8ww4TTg;
                    if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape42222;
                        m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j92222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22222, composer3, (i13 >> 15) & 14);
                        m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                        Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource42222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z62222, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                        Function2 function222222 = content;
                        int i17 = i152222;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m498selectableO2vRcR0);
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
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(23612267);
                        function222222.invoke(composer3, Integer.valueOf(i17 & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            };
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(providedValueArr2222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function22222), composer2, 56);
            modifier3 = modifier2;
            z4 = z3;
            shape3 = shape2;
            j7 = j5;
            j8 = j6;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        i10 = i11;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i14 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        borderStroke2 = borderStroke4;
        f2 = m2507constructorimpl;
        modifier2 = modifier4;
        z3 = z5;
        shape2 = rectangleShape;
        j5 = j4;
        j6 = j3;
        i13 = i12;
        startRestartGroup.endDefaults();
        final float m2507constructorimpl222222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
        ProvidedValue[] providedValueArr22222 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl222222))};
        final Modifier modifier522222 = modifier2;
        final Shape shape422222 = shape2;
        final long j922222 = j5;
        final BorderStroke borderStroke522222 = borderStroke2;
        final float f422222 = f2;
        final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        final boolean z622222 = z3;
        final int i1522222 = i10;
        Function2 function222222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
            public final void invoke(@Nullable Composer composer3, int i16) {
                long m995surfaceColorAtElevationcq6XJ1M;
                Modifier m994surface8ww4TTg;
                if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape422222;
                    m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j922222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl222222, composer3, (i13 >> 15) & 14);
                    m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke522222, f422222);
                    Modifier m498selectableO2vRcR0 = SelectableKt.m498selectableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource422222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z622222, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick);
                    Function2 function2222222 = content;
                    int i17 = i1522222;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(m498selectableO2vRcR0);
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
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(23612267);
                    function2222222.invoke(composer3, Integer.valueOf(i17 & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        };
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(providedValueArr22222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, function222222), composer2, 56);
        modifier3 = modifier2;
        z4 = z3;
        shape3 = shape2;
        j7 = j5;
        j8 = j6;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m991SurfaceNy5ogXk(final boolean z, final Function1 onCheckedChange, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2 content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        long j3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j4;
        int i12;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        float f2;
        Modifier modifier2;
        boolean z3;
        Shape shape2;
        long j5;
        long j6;
        final int i13;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final long j7;
        final long j8;
        final BorderStroke borderStroke3;
        final float f3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1341569296);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onCheckedChange) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    i4 |= startRestartGroup.changed(shape) ? 16384 : 8192;
                    if ((458752 & i) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j2;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j2;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i8 = i3 & 256;
                        if (i8 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(f) ? 67108864 : 33554432;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            i4 |= C.ENCODING_PCM_32BIT;
                        } else if ((i & 1879048192) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else {
                            if ((i2 & 14) != 0) {
                                i10 = i2;
                                if ((1533916891 & i4) == 306783378 || (i10 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        modifier2 = modifier;
                                        z3 = z2;
                                        shape2 = shape;
                                        j5 = j;
                                        borderStroke2 = borderStroke;
                                        f2 = f;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        i13 = i4;
                                        j6 = j3;
                                    } else {
                                        Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier;
                                        boolean z5 = i5 == 0 ? true : z2;
                                        Shape rectangleShape = i6 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                        if ((i3 & 32) == 0) {
                                            j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                            i4 &= -458753;
                                        } else {
                                            j4 = j;
                                        }
                                        if ((i3 & 64) != 0) {
                                            j3 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        }
                                        BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                        float m2507constructorimpl = i8 == 0 ? Dp.m2507constructorimpl(0) : f;
                                        if (i9 == 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            i12 = i4;
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            i12 = i4;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        borderStroke2 = borderStroke4;
                                        f2 = m2507constructorimpl;
                                        modifier2 = modifier4;
                                        z3 = z5;
                                        shape2 = rectangleShape;
                                        j5 = j4;
                                        j6 = j3;
                                        i13 = i12;
                                    }
                                    startRestartGroup.endDefaults();
                                    final float m2507constructorimpl2 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2))};
                                    final Modifier modifier5 = modifier2;
                                    final Shape shape4 = shape2;
                                    final long j9 = j5;
                                    final BorderStroke borderStroke5 = borderStroke2;
                                    final float f4 = f2;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final boolean z6 = z3;
                                    final int i15 = i10;
                                    Function2 function2 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                                        public final void invoke(@Nullable Composer composer3, int i16) {
                                            long m995surfaceColorAtElevationcq6XJ1M;
                                            Modifier m994surface8ww4TTg;
                                            if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                                Shape shape5 = shape4;
                                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2, composer3, (i13 >> 15) & 14);
                                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke5, f4);
                                                Modifier m500toggleableO2vRcR0 = ToggleableKt.m500toggleableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource4, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z6, Role.m2157boximpl(Role.INSTANCE.m2168getSwitcho7Vup1c()), onCheckedChange);
                                                Function2 function22 = content;
                                                int i17 = i15;
                                                composer3.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(m500toggleableO2vRcR0);
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
                                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-2137368960);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(1103154314);
                                                function22.invoke(composer3, Integer.valueOf(i17 & 14));
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    };
                                    composer2 = startRestartGroup;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function2), composer2, 56);
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    shape3 = shape2;
                                    j7 = j5;
                                    j8 = j6;
                                    borderStroke3 = borderStroke2;
                                    f3 = f2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    z4 = z2;
                                    shape3 = shape;
                                    j7 = j;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    j8 = j3;
                                    composer2 = startRestartGroup;
                                    borderStroke3 = borderStroke;
                                    f3 = f;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$11
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer3, int i16) {
                                        SurfaceKt.m991SurfaceNy5ogXk(z, onCheckedChange, modifier3, z4, shape3, j7, j8, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
                                    }
                                });
                                return;
                            }
                            i11 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                        }
                        i10 = i11;
                        if ((1533916891 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        borderStroke2 = borderStroke4;
                        f2 = m2507constructorimpl;
                        modifier2 = modifier4;
                        z3 = z5;
                        shape2 = rectangleShape;
                        j5 = j4;
                        j6 = j3;
                        i13 = i12;
                        startRestartGroup.endDefaults();
                        final float m2507constructorimpl22 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                        ProvidedValue[] providedValueArr2 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22))};
                        final Modifier modifier52 = modifier2;
                        final Shape shape42 = shape2;
                        final long j92 = j5;
                        final BorderStroke borderStroke52 = borderStroke2;
                        final float f42 = f2;
                        final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                        final boolean z62 = z3;
                        final int i152 = i10;
                        Function2 function22 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                            public final void invoke(@Nullable Composer composer3, int i16) {
                                long m995surfaceColorAtElevationcq6XJ1M;
                                Modifier m994surface8ww4TTg;
                                if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape5 = shape42;
                                    m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j92, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22, composer3, (i13 >> 15) & 14);
                                    m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke52, f42);
                                    Modifier m500toggleableO2vRcR0 = ToggleableKt.m500toggleableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource42, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z62, Role.m2157boximpl(Role.INSTANCE.m2168getSwitcho7Vup1c()), onCheckedChange);
                                    Function2 function222 = content;
                                    int i17 = i152;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(m500toggleableO2vRcR0);
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
                                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(1103154314);
                                    function222.invoke(composer3, Integer.valueOf(i17 & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        };
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr2, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function22), composer2, 56);
                        modifier3 = modifier2;
                        z4 = z3;
                        shape3 = shape2;
                        j7 = j5;
                        j8 = j6;
                        borderStroke3 = borderStroke2;
                        f3 = f2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    i10 = i11;
                    if ((1533916891 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    borderStroke2 = borderStroke4;
                    f2 = m2507constructorimpl;
                    modifier2 = modifier4;
                    z3 = z5;
                    shape2 = rectangleShape;
                    j5 = j4;
                    j6 = j3;
                    i13 = i12;
                    startRestartGroup.endDefaults();
                    final float m2507constructorimpl222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                    ProvidedValue[] providedValueArr22 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl222))};
                    final Modifier modifier522 = modifier2;
                    final Shape shape422 = shape2;
                    final long j922 = j5;
                    final BorderStroke borderStroke522 = borderStroke2;
                    final float f422 = f2;
                    final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                    final boolean z622 = z3;
                    final int i1522 = i10;
                    Function2 function222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                        public final void invoke(@Nullable Composer composer3, int i16) {
                            long m995surfaceColorAtElevationcq6XJ1M;
                            Modifier m994surface8ww4TTg;
                            if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape422;
                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j922, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl222, composer3, (i13 >> 15) & 14);
                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke522, f422);
                                Modifier m500toggleableO2vRcR0 = ToggleableKt.m500toggleableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource422, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z622, Role.m2157boximpl(Role.INSTANCE.m2168getSwitcho7Vup1c()), onCheckedChange);
                                Function2 function2222 = content;
                                int i17 = i1522;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(m500toggleableO2vRcR0);
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
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(1103154314);
                                function2222.invoke(composer3, Integer.valueOf(i17 & 14));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr22, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function222), composer2, 56);
                    modifier3 = modifier2;
                    z4 = z3;
                    shape3 = shape2;
                    j7 = j5;
                    j8 = j6;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((458752 & i) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                i10 = i11;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i14 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                borderStroke2 = borderStroke4;
                f2 = m2507constructorimpl;
                modifier2 = modifier4;
                z3 = z5;
                shape2 = rectangleShape;
                j5 = j4;
                j6 = j3;
                i13 = i12;
                startRestartGroup.endDefaults();
                final float m2507constructorimpl2222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
                ProvidedValue[] providedValueArr222 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2222))};
                final Modifier modifier5222 = modifier2;
                final Shape shape4222 = shape2;
                final long j9222 = j5;
                final BorderStroke borderStroke5222 = borderStroke2;
                final float f4222 = f2;
                final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                final boolean z6222 = z3;
                final int i15222 = i10;
                Function2 function2222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                    public final void invoke(@Nullable Composer composer3, int i16) {
                        long m995surfaceColorAtElevationcq6XJ1M;
                        Modifier m994surface8ww4TTg;
                        if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape4222;
                            m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j9222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2222, composer3, (i13 >> 15) & 14);
                            m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke5222, f4222);
                            Modifier m500toggleableO2vRcR0 = ToggleableKt.m500toggleableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource4222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z6222, Role.m2157boximpl(Role.INSTANCE.m2168getSwitcho7Vup1c()), onCheckedChange);
                            Function2 function22222 = content;
                            int i17 = i15222;
                            composer3.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m500toggleableO2vRcR0);
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
                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(1103154314);
                            function22222.invoke(composer3, Integer.valueOf(i17 & 14));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                };
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider(providedValueArr222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function2222), composer2, 56);
                modifier3 = modifier2;
                z4 = z3;
                shape3 = shape2;
                j7 = j5;
                j8 = j6;
                borderStroke3 = borderStroke2;
                f3 = f2;
                mutableInteractionSource3 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            i10 = i11;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i14 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            borderStroke2 = borderStroke4;
            f2 = m2507constructorimpl;
            modifier2 = modifier4;
            z3 = z5;
            shape2 = rectangleShape;
            j5 = j4;
            j6 = j3;
            i13 = i12;
            startRestartGroup.endDefaults();
            final float m2507constructorimpl22222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
            ProvidedValue[] providedValueArr2222 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22222))};
            final Modifier modifier52222 = modifier2;
            final Shape shape42222 = shape2;
            final long j92222 = j5;
            final BorderStroke borderStroke52222 = borderStroke2;
            final float f42222 = f2;
            final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
            final boolean z62222 = z3;
            final int i152222 = i10;
            Function2 function22222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                public final void invoke(@Nullable Composer composer3, int i16) {
                    long m995surfaceColorAtElevationcq6XJ1M;
                    Modifier m994surface8ww4TTg;
                    if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape42222;
                        m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j92222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22222, composer3, (i13 >> 15) & 14);
                        m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke52222, f42222);
                        Modifier m500toggleableO2vRcR0 = ToggleableKt.m500toggleableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource42222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z62222, Role.m2157boximpl(Role.INSTANCE.m2168getSwitcho7Vup1c()), onCheckedChange);
                        Function2 function222222 = content;
                        int i17 = i152222;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m500toggleableO2vRcR0);
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
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(1103154314);
                        function222222.invoke(composer3, Integer.valueOf(i17 & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            };
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(providedValueArr2222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function22222), composer2, 56);
            modifier3 = modifier2;
            z4 = z3;
            shape3 = shape2;
            j7 = j5;
            j8 = j6;
            borderStroke3 = borderStroke2;
            f3 = f2;
            mutableInteractionSource3 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        i10 = i11;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i14 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        borderStroke2 = borderStroke4;
        f2 = m2507constructorimpl;
        modifier2 = modifier4;
        z3 = z5;
        shape2 = rectangleShape;
        j5 = j4;
        j6 = j3;
        i13 = i12;
        startRestartGroup.endDefaults();
        final float m2507constructorimpl222222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f2);
        ProvidedValue[] providedValueArr22222 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl222222))};
        final Modifier modifier522222 = modifier2;
        final Shape shape422222 = shape2;
        final long j922222 = j5;
        final BorderStroke borderStroke522222 = borderStroke2;
        final float f422222 = f2;
        final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
        final boolean z622222 = z3;
        final int i1522222 = i10;
        Function2 function222222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
            public final void invoke(@Nullable Composer composer3, int i16) {
                long m995surfaceColorAtElevationcq6XJ1M;
                Modifier m994surface8ww4TTg;
                if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape422222;
                    m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j922222, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl222222, composer3, (i13 >> 15) & 14);
                    m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke522222, f422222);
                    Modifier m500toggleableO2vRcR0 = ToggleableKt.m500toggleableO2vRcR0(m994surface8ww4TTg, z, mutableInteractionSource422222, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z622222, Role.m2157boximpl(Role.INSTANCE.m2168getSwitcho7Vup1c()), onCheckedChange);
                    Function2 function2222222 = content;
                    int i17 = i1522222;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(m500toggleableO2vRcR0);
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
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(1103154314);
                    function2222222.invoke(composer3, Integer.valueOf(i17 & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        };
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(providedValueArr22222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, function222222), composer2, 56);
        modifier3 = modifier2;
        z4 = z3;
        shape3 = shape2;
        j7 = j5;
        j8 = j6;
        borderStroke3 = borderStroke2;
        f3 = f2;
        mutableInteractionSource3 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0243  */
    /* renamed from: Surface-9VG74zQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m987Surface9VG74zQ(final Function0 onClick, Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, final Function2 content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final int i13;
        long j3;
        Modifier modifier2;
        long j4;
        float f2;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        float f3;
        Role role2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z2;
        Indication indication3;
        String str2;
        long j5;
        BorderStroke borderStroke2;
        long j6;
        Modifier modifier3;
        Shape shape2;
        Composer composer2;
        final Modifier modifier4;
        final Shape shape3;
        final long j7;
        final long j8;
        final BorderStroke borderStroke3;
        final float f4;
        final MutableInteractionSource mutableInteractionSource4;
        final Indication indication4;
        final boolean z3;
        final String str3;
        final Role role3;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1585925488);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(shape) ? 256 : 128;
                if ((i & 7168) == 0) {
                    i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j)) ? 2048 : 1024;
                }
                if ((i & 57344) == 0) {
                    i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 458752) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(indication)) {
                        i14 = 67108864;
                        i4 |= i14;
                    }
                    i14 = 33554432;
                    i4 |= i14;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 112) == 0) {
                    i11 |= startRestartGroup.changed(role) ? 32 : 16;
                }
                int i16 = i11;
                if ((i3 & 4096) != 0) {
                    i16 |= 384;
                } else if ((i2 & 896) == 0) {
                    i16 |= startRestartGroup.changed(content) ? 256 : 128;
                }
                i13 = i16;
                if ((1533916891 & i4) == 306783378 || (i13 & 731) != 146 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier;
                        Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : shape;
                        if ((i3 & 8) != 0) {
                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                            i4 &= -7169;
                        } else {
                            j3 = j;
                        }
                        if ((i3 & 16) != 0) {
                            modifier2 = modifier5;
                            j4 = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 9) & 14);
                            i4 &= -57345;
                        } else {
                            modifier2 = modifier5;
                            j4 = j2;
                        }
                        BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                        float m2507constructorimpl = i7 != 0 ? Dp.m2507constructorimpl(0) : f;
                        if (i8 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            f2 = m2507constructorimpl;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        } else {
                            f2 = m2507constructorimpl;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i3 & 256) != 0) {
                            indication2 = (Indication) startRestartGroup.consume(IndicationKt.getLocalIndication());
                            i4 &= -234881025;
                        } else {
                            indication2 = indication;
                        }
                        boolean z4 = i9 != 0 ? true : z;
                        String str4 = i10 != 0 ? null : str;
                        f3 = f2;
                        if (i12 != 0) {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z2 = z4;
                            indication3 = indication2;
                            str2 = str4;
                            j5 = j3;
                            borderStroke2 = borderStroke4;
                            j6 = j4;
                            role2 = null;
                        } else {
                            role2 = role;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z2 = z4;
                            indication3 = indication2;
                            str2 = str4;
                            j5 = j3;
                            borderStroke2 = borderStroke4;
                            j6 = j4;
                        }
                        modifier3 = modifier2;
                        shape2 = rectangleShape;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        modifier3 = modifier;
                        shape2 = shape;
                        j5 = j;
                        j6 = j2;
                        borderStroke2 = borderStroke;
                        f3 = f;
                        mutableInteractionSource3 = mutableInteractionSource;
                        indication3 = indication;
                        z2 = z;
                        str2 = str;
                        role2 = role;
                    }
                    final int i17 = i4;
                    startRestartGroup.endDefaults();
                    final float m2507constructorimpl2 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f3);
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl2))};
                    final Modifier modifier6 = modifier3;
                    final Shape shape4 = shape2;
                    final long j9 = j5;
                    final BorderStroke borderStroke5 = borderStroke2;
                    final float f5 = f3;
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                    final Indication indication5 = indication3;
                    final boolean z5 = z2;
                    final String str5 = str2;
                    final Role role4 = role2;
                    Function2 function2 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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
                        public final void invoke(@Nullable Composer composer3, int i18) {
                            long m995surfaceColorAtElevationcq6XJ1M;
                            Modifier m994surface8ww4TTg;
                            if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape4;
                                m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl2, composer3, (i17 >> 9) & 14);
                                m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke5, f5);
                                Modifier then = m994surface8ww4TTg.then(ClickableKt.m169clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource5, indication5, z5, str5, role4, onClick));
                                Function2 function22 = content;
                                int i19 = i13;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(then);
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
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-1300719946);
                                function22.invoke(composer3, Integer.valueOf((i19 >> 6) & 14));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 149594672, true, function2), composer2, 56);
                    modifier4 = modifier3;
                    shape3 = shape2;
                    j7 = j5;
                    j8 = j6;
                    borderStroke3 = borderStroke2;
                    f4 = f3;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    indication4 = indication3;
                    z3 = z2;
                    str3 = str2;
                    role3 = role2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    shape3 = shape;
                    j7 = j;
                    j8 = j2;
                    borderStroke3 = borderStroke;
                    f4 = f;
                    indication4 = indication;
                    z3 = z;
                    str3 = str;
                    role3 = role;
                    composer2 = startRestartGroup;
                    mutableInteractionSource4 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i18) {
                        SurfaceKt.m987Surface9VG74zQ(Function0.this, modifier4, shape3, j7, j8, borderStroke3, f4, mutableInteractionSource4, indication4, z3, str3, role3, content, composer3, i | 1, i2, i3);
                    }
                });
                return;
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            int i162 = i11;
            if ((i3 & 4096) != 0) {
            }
            i13 = i162;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            f3 = f2;
            if (i12 != 0) {
            }
            modifier3 = modifier2;
            shape2 = rectangleShape;
            final int i172 = i4;
            startRestartGroup.endDefaults();
            final float m2507constructorimpl22 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f3);
            ProvidedValue[] providedValueArr2 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl22))};
            final Modifier modifier62 = modifier3;
            final Shape shape42 = shape2;
            final long j92 = j5;
            final BorderStroke borderStroke52 = borderStroke2;
            final float f52 = f3;
            final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
            final Indication indication52 = indication3;
            final boolean z52 = z2;
            final String str52 = str2;
            final Role role42 = role2;
            Function2 function22 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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
                public final void invoke(@Nullable Composer composer3, int i18) {
                    long m995surfaceColorAtElevationcq6XJ1M;
                    Modifier m994surface8ww4TTg;
                    if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape42;
                        m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j92, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl22, composer3, (i172 >> 9) & 14);
                        m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke52, f52);
                        Modifier then = m994surface8ww4TTg.then(ClickableKt.m169clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource52, indication52, z52, str52, role42, onClick));
                        Function2 function222 = content;
                        int i19 = i13;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(then);
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
                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-1300719946);
                        function222.invoke(composer3, Integer.valueOf((i19 >> 6) & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            };
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(providedValueArr2, ComposableLambdaKt.composableLambda(composer2, 149594672, true, function22), composer2, 56);
            modifier4 = modifier3;
            shape3 = shape2;
            j7 = j5;
            j8 = j6;
            borderStroke3 = borderStroke2;
            f4 = f3;
            mutableInteractionSource4 = mutableInteractionSource3;
            indication4 = indication3;
            z3 = z2;
            str3 = str2;
            role3 = role2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        int i1622 = i11;
        if ((i3 & 4096) != 0) {
        }
        i13 = i1622;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        f3 = f2;
        if (i12 != 0) {
        }
        modifier3 = modifier2;
        shape2 = rectangleShape;
        final int i1722 = i4;
        startRestartGroup.endDefaults();
        final float m2507constructorimpl222 = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f3);
        ProvidedValue[] providedValueArr22 = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m2505boximpl(m2507constructorimpl222))};
        final Modifier modifier622 = modifier3;
        final Shape shape422 = shape2;
        final long j922 = j5;
        final BorderStroke borderStroke522 = borderStroke2;
        final float f522 = f3;
        final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
        final Indication indication522 = indication3;
        final boolean z522 = z2;
        final String str522 = str2;
        final Role role422 = role2;
        Function2 function222 = new Function2() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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
            public final void invoke(@Nullable Composer composer3, int i18) {
                long m995surfaceColorAtElevationcq6XJ1M;
                Modifier m994surface8ww4TTg;
                if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape422;
                    m995surfaceColorAtElevationcq6XJ1M = SurfaceKt.m995surfaceColorAtElevationcq6XJ1M(j922, (ElevationOverlay) composer3.consume(ElevationOverlayKt.getLocalElevationOverlay()), m2507constructorimpl222, composer3, (i1722 >> 9) & 14);
                    m994surface8ww4TTg = SurfaceKt.m994surface8ww4TTg(minimumTouchTargetSize, shape5, m995surfaceColorAtElevationcq6XJ1M, borderStroke522, f522);
                    Modifier then = m994surface8ww4TTg.then(ClickableKt.m169clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource522, indication522, z522, str522, role422, onClick));
                    Function2 function2222 = content;
                    int i19 = i13;
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(then);
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
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-1300719946);
                    function2222.invoke(composer3, Integer.valueOf((i19 >> 6) & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        };
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider(providedValueArr22, ComposableLambdaKt.composableLambda(composer2, 149594672, true, function222), composer2, 56);
        modifier4 = modifier3;
        shape3 = shape2;
        j7 = j5;
        j8 = j6;
        borderStroke3 = borderStroke2;
        f4 = f3;
        mutableInteractionSource4 = mutableInteractionSource3;
        indication4 = indication3;
        z3 = z2;
        str3 = str2;
        role3 = role2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m994surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m157backgroundbw27NRU(ShadowKt.m1242shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m995surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        if (Color.m1447equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m800getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.mo830apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        composer.endReplaceableGroup();
        return j;
    }
}
