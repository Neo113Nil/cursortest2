package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
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
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a8\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\t*\u00020\u001f2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"TextBaselineDistanceFromTitle", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextBaselineDistanceFromTop", "TextPadding", "Landroidx/compose/ui/Modifier;", "TitleBaselineDistanceFromTop", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogFlowRow", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogBaselineLayout", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final long TextBaselineDistanceFromTitle;
    private static final long TextBaselineDistanceFromTop;
    private static final Modifier TextPadding;
    private static final long TitleBaselineDistanceFromTop;
    private static final Modifier TitlePadding;

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    /* renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m706AlertDialogContentWMdw5o4(final Function2 buttons, Modifier modifier, Function2 function2, Function2 function22, Shape shape, long j, long j2, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        final Function2 function23;
        int i5;
        Function2 function24;
        Shape shape2;
        long j3;
        long j4;
        Modifier modifier2;
        final Function2 function25;
        final Shape shape3;
        long j5;
        long j6;
        final Modifier modifier3;
        final Function2 function26;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer startRestartGroup = composer.startRestartGroup(-453679601);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(buttons) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changed(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changed(function24) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            j3 = j;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        j3 = j;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i6 = 1048576;
                                i3 |= i6;
                            }
                        } else {
                            j4 = j2;
                        }
                        i6 = 524288;
                        i3 |= i6;
                    } else {
                        j4 = j2;
                    }
                    if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                function23 = null;
                            }
                            function25 = i5 == 0 ? function24 : null;
                            if ((i2 & 16) == 0) {
                                shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                i3 &= -57345;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 32) == 0) {
                                j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                i3 &= -458753;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 64) != 0) {
                                long m814contentColorForek8zF_U = ColorsKt.m814contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 15) & 14);
                                i3 &= -3670017;
                                j6 = m814contentColorForek8zF_U;
                                startRestartGroup.endDefaults();
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                                        if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                            final Function2 function27 = Function2.this;
                                            final Function2 function28 = function25;
                                            Function2 function29 = buttons;
                                            final int i11 = i3;
                                            composer2.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            composer2.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion2.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(companion);
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
                                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-1163856341);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(523699273);
                                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer2, 620104160, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                public final void invoke(@Nullable Composer composer3, int i12) {
                                                    if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                                                        final Function2 function210 = Function2.this;
                                                        final int i13 = i11;
                                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 770166432, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                                            public final void invoke(@Nullable Composer composer4, int i14) {
                                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), Function2.this, composer4, (i13 >> 3) & 112);
                                                                } else {
                                                                    composer4.skipToGroupEnd();
                                                                }
                                                            }
                                                        }), composer3, 56);
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer2, 1965858367, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                public final void invoke(@Nullable Composer composer3, int i12) {
                                                    if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)))};
                                                        final Function2 function210 = Function2.this;
                                                        final int i13 = i11;
                                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 2115920639, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                                            public final void invoke(@Nullable Composer composer4, int i14) {
                                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2(), Function2.this, composer4, (i13 >> 6) & 112);
                                                                } else {
                                                                    composer4.skipToGroupEnd();
                                                                }
                                                            }
                                                        }), composer3, 56);
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }) : null, composer2, 6);
                                            function29.invoke(composer2, Integer.valueOf(i11 & 14));
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
                                int i10 = ((i3 >> 3) & 14) | 1572864;
                                int i11 = i3 >> 9;
                                SurfaceKt.m988SurfaceFjzlyU(modifier2, shape3, j5, j6, null, 0.0f, composableLambda, startRestartGroup, i10 | (i11 & 112) | (i11 & 896) | (i11 & 7168), 48);
                                modifier3 = modifier2;
                                function26 = function23;
                                j7 = j5;
                                j8 = j6;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier2 = modifier;
                            function25 = function24;
                            shape3 = shape2;
                            j5 = j3;
                        }
                        j6 = j4;
                        startRestartGroup.endDefaults();
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                                if ((i102 & 11) != 2 || !composer2.getSkipping()) {
                                    final Function2 function27 = Function2.this;
                                    final Function2 function28 = function25;
                                    Function2 function29 = buttons;
                                    final int i112 = i3;
                                    composer2.startReplaceableGroup(-483455358);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion2.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(companion);
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
                                    Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-1163856341);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(523699273);
                                    AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer2, 620104160, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                        public final void invoke(@Nullable Composer composer3, int i12) {
                                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                                                final Function2 function210 = Function2.this;
                                                final int i13 = i112;
                                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 770166432, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), Function2.this, composer4, (i13 >> 3) & 112);
                                                        } else {
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }
                                                }), composer3, 56);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer2, 1965858367, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                        public final void invoke(@Nullable Composer composer3, int i12) {
                                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)))};
                                                final Function2 function210 = Function2.this;
                                                final int i13 = i112;
                                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 2115920639, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2(), Function2.this, composer4, (i13 >> 6) & 112);
                                                        } else {
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }
                                                }), composer3, 56);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }) : null, composer2, 6);
                                    function29.invoke(composer2, Integer.valueOf(i112 & 14));
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
                        int i102 = ((i3 >> 3) & 14) | 1572864;
                        int i112 = i3 >> 9;
                        SurfaceKt.m988SurfaceFjzlyU(modifier2, shape3, j5, j6, null, 0.0f, composableLambda2, startRestartGroup, i102 | (i112 & 112) | (i112 & 896) | (i112 & 7168), 48);
                        modifier3 = modifier2;
                        function26 = function23;
                        j7 = j5;
                        j8 = j6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function26 = function23;
                        function25 = function24;
                        shape3 = shape2;
                        j7 = j3;
                        j8 = j4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
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
                            AlertDialogKt.m706AlertDialogContentWMdw5o4(Function2.this, modifier3, function26, function25, shape3, j7, j8, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                function24 = function22;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                j6 = j4;
                startRestartGroup.endDefaults();
                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                        if ((i1022 & 11) != 2 || !composer2.getSkipping()) {
                            final Function2 function27 = Function2.this;
                            final Function2 function28 = function25;
                            Function2 function29 = buttons;
                            final int i1122 = i3;
                            composer2.startReplaceableGroup(-483455358);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion2.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(companion);
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
                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1163856341);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(523699273);
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer2, 620104160, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                                        final Function2 function210 = Function2.this;
                                        final int i13 = i1122;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 770166432, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                            public final void invoke(@Nullable Composer composer4, int i14) {
                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), Function2.this, composer4, (i13 >> 3) & 112);
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                            }
                                        }), composer3, 56);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer2, 1965858367, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)))};
                                        final Function2 function210 = Function2.this;
                                        final int i13 = i1122;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 2115920639, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                            public final void invoke(@Nullable Composer composer4, int i14) {
                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2(), Function2.this, composer4, (i13 >> 6) & 112);
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                            }
                                        }), composer3, 56);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }) : null, composer2, 6);
                            function29.invoke(composer2, Integer.valueOf(i1122 & 14));
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
                int i1022 = ((i3 >> 3) & 14) | 1572864;
                int i1122 = i3 >> 9;
                SurfaceKt.m988SurfaceFjzlyU(modifier2, shape3, j5, j6, null, 0.0f, composableLambda22, startRestartGroup, i1022 | (i1122 & 112) | (i1122 & 896) | (i1122 & 7168), 48);
                modifier3 = modifier2;
                function26 = function23;
                j7 = j5;
                j8 = j6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            j6 = j4;
            startRestartGroup.endDefaults();
            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
                    if ((i10222 & 11) != 2 || !composer2.getSkipping()) {
                        final Function2 function27 = Function2.this;
                        final Function2 function28 = function25;
                        Function2 function29 = buttons;
                        final int i11222 = i3;
                        composer2.startReplaceableGroup(-483455358);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion2.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(companion);
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
                        Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1163856341);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(523699273);
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer2, 620104160, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                                    final Function2 function210 = Function2.this;
                                    final int i13 = i11222;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 770166432, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i14) {
                                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), Function2.this, composer4, (i13 >> 3) & 112);
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                        }
                                    }), composer3, 56);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer2, 1965858367, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)))};
                                    final Function2 function210 = Function2.this;
                                    final int i13 = i11222;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 2115920639, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i14) {
                                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2(), Function2.this, composer4, (i13 >> 6) & 112);
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                        }
                                    }), composer3, 56);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }) : null, composer2, 6);
                        function29.invoke(composer2, Integer.valueOf(i11222 & 14));
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
            int i10222 = ((i3 >> 3) & 14) | 1572864;
            int i11222 = i3 >> 9;
            SurfaceKt.m988SurfaceFjzlyU(modifier2, shape3, j5, j6, null, 0.0f, composableLambda222, startRestartGroup, i10222 | (i11222 & 112) | (i11222 & 896) | (i11222 & 7168), 48);
            modifier3 = modifier2;
            function26 = function23;
            j7 = j5;
            j8 = j6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        j6 = j4;
        startRestartGroup.endDefaults();
        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
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
            public final void invoke(@Nullable Composer composer2, int i102222) {
                if ((i102222 & 11) != 2 || !composer2.getSkipping()) {
                    final Function2 function27 = Function2.this;
                    final Function2 function28 = function25;
                    Function2 function29 = buttons;
                    final int i112222 = i3;
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion2.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(companion);
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
                    Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(523699273);
                    AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer2, 620104160, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                                final Function2 function210 = Function2.this;
                                final int i13 = i112222;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 770166432, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), Function2.this, composer4, (i13 >> 3) & 112);
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                    }
                                }), composer3, 56);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer2, 1965858367, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)))};
                                final Function2 function210 = Function2.this;
                                final int i13 = i112222;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 2115920639, true, new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2(), Function2.this, composer4, (i13 >> 6) & 112);
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                    }
                                }), composer3, 56);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }) : null, composer2, 6);
                    function29.invoke(composer2, Integer.valueOf(i112222 & 14));
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
        int i102222 = ((i3 >> 3) & 14) | 1572864;
        int i112222 = i3 >> 9;
        SurfaceKt.m988SurfaceFjzlyU(modifier2, shape3, j5, j6, null, 0.0f, composableLambda2222, startRestartGroup, i102222 | (i112222 & 112) | (i112222 & 896) | (i112222 & 7168), 48);
        modifier3 = modifier2;
        function26 = function23;
        j7 = j5;
        j8 = j6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void AlertDialogBaselineLayout(final ColumnScope columnScope, final Function2 function2, final Function2 function22, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(-555573207);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            Modifier weight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2
                /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    Object obj;
                    Object obj2;
                    int i3;
                    int i4;
                    long j2;
                    final int mo264roundToPxR2X_6o;
                    int i5;
                    long j3;
                    int mo264roundToPxR2X_6o2;
                    final int i6;
                    long j4;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List list = measurables;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "title")) {
                            break;
                        }
                    }
                    Measurable measurable = (Measurable) obj;
                    final Placeable mo1944measureBRTryo0 = measurable != null ? measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), "text")) {
                            break;
                        }
                    }
                    Measurable measurable2 = (Measurable) obj2;
                    final Placeable mo1944measureBRTryo02 = measurable2 != null ? measurable2.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
                    int max = Math.max(mo1944measureBRTryo0 != null ? mo1944measureBRTryo0.getWidth() : 0, mo1944measureBRTryo02 != null ? mo1944measureBRTryo02.getWidth() : 0);
                    if (mo1944measureBRTryo0 != null) {
                        int i7 = mo1944measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                        Integer valueOf = i7 == Integer.MIN_VALUE ? null : Integer.valueOf(i7);
                        if (valueOf != null) {
                            i3 = valueOf.intValue();
                            if (mo1944measureBRTryo0 != null) {
                                int i8 = mo1944measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
                                Integer valueOf2 = i8 == Integer.MIN_VALUE ? null : Integer.valueOf(i8);
                                if (valueOf2 != null) {
                                    i4 = valueOf2.intValue();
                                    j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
                                    mo264roundToPxR2X_6o = Layout.mo264roundToPxR2X_6o(j2) - i3;
                                    if (mo1944measureBRTryo02 != null) {
                                        int i9 = mo1944measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                                        Integer valueOf3 = i9 != Integer.MIN_VALUE ? Integer.valueOf(i9) : null;
                                        if (valueOf3 != null) {
                                            i5 = valueOf3.intValue();
                                            if (mo1944measureBRTryo0 != null) {
                                                j4 = AlertDialogKt.TextBaselineDistanceFromTop;
                                                mo264roundToPxR2X_6o2 = Layout.mo264roundToPxR2X_6o(j4);
                                            } else {
                                                j3 = AlertDialogKt.TextBaselineDistanceFromTitle;
                                                mo264roundToPxR2X_6o2 = Layout.mo264roundToPxR2X_6o(j3);
                                            }
                                            int height = mo1944measureBRTryo0 == null ? mo1944measureBRTryo0.getHeight() + mo264roundToPxR2X_6o : 0;
                                            if (mo1944measureBRTryo0 != null) {
                                                i6 = mo264roundToPxR2X_6o2 - i5;
                                            } else {
                                                i6 = (i4 == 0 ? height - i5 : (mo264roundToPxR2X_6o + i4) - i5) + mo264roundToPxR2X_6o2;
                                            }
                                            if (mo1944measureBRTryo02 != null) {
                                                if (i4 == 0) {
                                                    r14 = (mo1944measureBRTryo02.getHeight() + mo264roundToPxR2X_6o2) - i5;
                                                } else {
                                                    r14 = ((mo1944measureBRTryo02.getHeight() + mo264roundToPxR2X_6o2) - i5) - ((mo1944measureBRTryo0 != null ? mo1944measureBRTryo0.getHeight() : 0) - i4);
                                                }
                                            }
                                            return MeasureScope.layout$default(Layout, max, r14 + height, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((Placeable.PlacementScope) obj3);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                    Placeable placeable = Placeable.this;
                                                    if (placeable != null) {
                                                        Placeable.PlacementScope.place$default(layout, placeable, 0, mo264roundToPxR2X_6o, 0.0f, 4, null);
                                                    }
                                                    Placeable placeable2 = mo1944measureBRTryo02;
                                                    if (placeable2 != null) {
                                                        Placeable.PlacementScope.place$default(layout, placeable2, 0, i6, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    }
                                    i5 = 0;
                                    if (mo1944measureBRTryo0 != null) {
                                    }
                                    if (mo1944measureBRTryo0 == null) {
                                    }
                                    if (mo1944measureBRTryo0 != null) {
                                    }
                                    if (mo1944measureBRTryo02 != null) {
                                    }
                                    return MeasureScope.layout$default(Layout, max, r14 + height, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                            invoke((Placeable.PlacementScope) obj3);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            Placeable placeable = Placeable.this;
                                            if (placeable != null) {
                                                Placeable.PlacementScope.place$default(layout, placeable, 0, mo264roundToPxR2X_6o, 0.0f, 4, null);
                                            }
                                            Placeable placeable2 = mo1944measureBRTryo02;
                                            if (placeable2 != null) {
                                                Placeable.PlacementScope.place$default(layout, placeable2, 0, i6, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            }
                            i4 = 0;
                            j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
                            mo264roundToPxR2X_6o = Layout.mo264roundToPxR2X_6o(j2) - i3;
                            if (mo1944measureBRTryo02 != null) {
                            }
                            i5 = 0;
                            if (mo1944measureBRTryo0 != null) {
                            }
                            if (mo1944measureBRTryo0 == null) {
                            }
                            if (mo1944measureBRTryo0 != null) {
                            }
                            if (mo1944measureBRTryo02 != null) {
                            }
                            return MeasureScope.layout$default(Layout, max, r14 + height, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                    invoke((Placeable.PlacementScope) obj3);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    Placeable placeable = Placeable.this;
                                    if (placeable != null) {
                                        Placeable.PlacementScope.place$default(layout, placeable, 0, mo264roundToPxR2X_6o, 0.0f, 4, null);
                                    }
                                    Placeable placeable2 = mo1944measureBRTryo02;
                                    if (placeable2 != null) {
                                        Placeable.PlacementScope.place$default(layout, placeable2, 0, i6, 0.0f, 4, null);
                                    }
                                }
                            }, 4, null);
                        }
                    }
                    i3 = 0;
                    if (mo1944measureBRTryo0 != null) {
                    }
                    i4 = 0;
                    j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
                    mo264roundToPxR2X_6o = Layout.mo264roundToPxR2X_6o(j2) - i3;
                    if (mo1944measureBRTryo02 != null) {
                    }
                    i5 = 0;
                    if (mo1944measureBRTryo0 != null) {
                    }
                    if (mo1944measureBRTryo0 == null) {
                    }
                    if (mo1944measureBRTryo0 != null) {
                    }
                    if (mo1944measureBRTryo02 != null) {
                    }
                    return MeasureScope.layout$default(Layout, max, r14 + height, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                            invoke((Placeable.PlacementScope) obj3);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable placeable = Placeable.this;
                            if (placeable != null) {
                                Placeable.PlacementScope.place$default(layout, placeable, 0, mo264roundToPxR2X_6o, 0.0f, 4, null);
                            }
                            Placeable placeable2 = mo1944measureBRTryo02;
                            if (placeable2 != null) {
                                Placeable.PlacementScope.place$default(layout, placeable2, 0, i6, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(weight);
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
            Updater.m1153setimpl(m1149constructorimpl, alertDialogKt$AlertDialogBaselineLayout$2, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1454034642);
            startRestartGroup.startReplaceableGroup(-1160646206);
            if (function2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(TitlePadding, "title");
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier align = columnScope.align(layoutId, companion2.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor2 = companion.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(align);
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
                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(472489145);
                function2.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(TextPadding, "text");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Modifier align2 = columnScope.align(layoutId2, companion3.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion.getConstructor();
                Function3 materializerOf3 = LayoutKt.materializerOf(align2);
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
                Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl3, density3, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-272722206);
                function22.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
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
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
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
                AlertDialogKt.AlertDialogBaselineLayout(ColumnScope.this, function2, function22, composer2, i | 1);
            }
        });
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m707AlertDialogFlowRowixp7dh8(final float f, final float f2, final Function2 content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(73434452);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(final MeasureScope Layout, List measurables, long j) {
                    int max;
                    Ref$IntRef ref$IntRef;
                    ArrayList arrayList;
                    Ref$IntRef ref$IntRef2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    final ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    final ArrayList arrayList4 = new ArrayList();
                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                    Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                    ArrayList arrayList5 = new ArrayList();
                    Ref$IntRef ref$IntRef5 = new Ref$IntRef();
                    Ref$IntRef ref$IntRef6 = new Ref$IntRef();
                    long Constraints$default = ConstraintsKt.Constraints$default(0, Constraints.m2487getMaxWidthimpl(j), 0, 0, 13, null);
                    Iterator it = measurables.iterator();
                    while (it.hasNext()) {
                        Placeable mo1944measureBRTryo0 = ((Measurable) it.next()).mo1944measureBRTryo0(Constraints$default);
                        long j2 = Constraints$default;
                        Ref$IntRef ref$IntRef7 = ref$IntRef6;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList5, ref$IntRef5, Layout, f, j, mo1944measureBRTryo0)) {
                            ref$IntRef = ref$IntRef5;
                            arrayList = arrayList5;
                            ref$IntRef2 = ref$IntRef4;
                        } else {
                            ref$IntRef = ref$IntRef5;
                            arrayList = arrayList5;
                            ref$IntRef2 = ref$IntRef4;
                            measure_3p2s80s$startNewSequence(arrayList2, ref$IntRef4, Layout, f2, arrayList5, arrayList3, ref$IntRef7, arrayList4, ref$IntRef3, ref$IntRef);
                        }
                        Ref$IntRef ref$IntRef8 = ref$IntRef;
                        if (!arrayList.isEmpty()) {
                            ref$IntRef8.element += Layout.mo265roundToPx0680j_4(f);
                        }
                        ArrayList arrayList6 = arrayList;
                        arrayList6.add(mo1944measureBRTryo0);
                        ref$IntRef8.element += mo1944measureBRTryo0.getWidth();
                        ref$IntRef6 = ref$IntRef7;
                        ref$IntRef6.element = Math.max(ref$IntRef6.element, mo1944measureBRTryo0.getHeight());
                        arrayList5 = arrayList6;
                        ref$IntRef5 = ref$IntRef8;
                        Constraints$default = j2;
                        ref$IntRef4 = ref$IntRef2;
                    }
                    ArrayList arrayList7 = arrayList5;
                    Ref$IntRef ref$IntRef9 = ref$IntRef4;
                    Ref$IntRef ref$IntRef10 = ref$IntRef5;
                    if (!arrayList7.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList2, ref$IntRef9, Layout, f2, arrayList7, arrayList3, ref$IntRef6, arrayList4, ref$IntRef3, ref$IntRef10);
                    }
                    if (Constraints.m2487getMaxWidthimpl(j) != Integer.MAX_VALUE) {
                        max = Constraints.m2487getMaxWidthimpl(j);
                    } else {
                        max = Math.max(ref$IntRef3.element, Constraints.m2489getMinWidthimpl(j));
                    }
                    final int i3 = max;
                    int max2 = Math.max(ref$IntRef9.element, Constraints.m2488getMinHeightimpl(j));
                    final float f3 = f;
                    return MeasureScope.layout$default(Layout, i3, max2, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$measure$1
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
                            List<List<Placeable>> list = arrayList2;
                            MeasureScope measureScope = Layout;
                            float f4 = f3;
                            int i4 = i3;
                            List<Integer> list2 = arrayList4;
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List<Placeable> list3 = list.get(i5);
                                int size2 = list3.size();
                                int[] iArr = new int[size2];
                                int i6 = 0;
                                while (i6 < size2) {
                                    iArr[i6] = list3.get(i6).getWidth() + (i6 < CollectionsKt.getLastIndex(list3) ? measureScope.mo265roundToPx0680j_4(f4) : 0);
                                    i6++;
                                }
                                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                                int[] iArr2 = new int[size2];
                                for (int i7 = 0; i7 < size2; i7++) {
                                    iArr2[i7] = 0;
                                }
                                bottom.arrange(measureScope, i4, iArr, iArr2);
                                int size3 = list3.size();
                                int i8 = 0;
                                while (i8 < size3) {
                                    Placeable.PlacementScope.place$default(layout, list3.get(i8), iArr2[i8], list2.get(i5).intValue(), 0.0f, 4, null);
                                    i8++;
                                    size3 = size3;
                                    iArr2 = iArr2;
                                    i5 = i5;
                                    list3 = list3;
                                }
                                i5++;
                            }
                        }
                    }, 4, null);
                }

                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f3, long j, Placeable placeable) {
                    return list.isEmpty() || (ref$IntRef.element + measureScope.mo265roundToPx0680j_4(f3)) + placeable.getWidth() <= Constraints.m2487getMaxWidthimpl(j);
                }

                private static final void measure_3p2s80s$startNewSequence(List list, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f3, List list2, List list3, Ref$IntRef ref$IntRef2, List list4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
                    List list5 = list;
                    if (!list5.isEmpty()) {
                        ref$IntRef.element += measureScope.mo265roundToPx0680j_4(f3);
                    }
                    list5.add(CollectionsKt.toList(list2));
                    list3.add(Integer.valueOf(ref$IntRef2.element));
                    list4.add(Integer.valueOf(ref$IntRef.element));
                    ref$IntRef.element += ref$IntRef2.element;
                    ref$IntRef3.element = Math.max(ref$IntRef3.element, ref$IntRef4.element);
                    list2.clear();
                    ref$IntRef4.element = 0;
                    ref$IntRef2.element = 0;
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
            int i3 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
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
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
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
                AlertDialogKt.m707AlertDialogFlowRowixp7dh8(f, f2, content, composer2, i | 1);
            }
        });
    }

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 24;
        TitlePadding = PaddingKt.m338paddingqDBjuR0$default(companion, Dp.m2507constructorimpl(f), 0.0f, Dp.m2507constructorimpl(f), 0.0f, 10, null);
        TextPadding = PaddingKt.m338paddingqDBjuR0$default(companion, Dp.m2507constructorimpl(f), 0.0f, Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(28), 2, null);
        TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
        TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
        TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    }
}
