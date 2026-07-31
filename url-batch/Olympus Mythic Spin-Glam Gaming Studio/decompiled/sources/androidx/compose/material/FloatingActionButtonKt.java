package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ar\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m2507constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m2507constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m2507constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m2507constructorimpl(20);

    /* JADX WARN: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0199  */
    /* renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m885FloatingActionButtonbogVsAg(final Function0 onClick, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, final Function2 content, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        long j5;
        long j6;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape4;
        long j7;
        final long j8;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape5;
        final long j9;
        final MutableInteractionSource mutableInteractionSource4;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1028985328);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
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
                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
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
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        j3 = j;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        j4 = j2;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    j4 = j2;
                }
                if ((i & 3670016) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(floatingActionButtonElevation2)) ? 1048576 : 524288;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if ((i2 & 128) == 0) {
                    i5 = (29360128 & i) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 == 0) {
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
                            if ((i2 & 8) == 0) {
                                shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -7169;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 16) == 0) {
                                j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m798getSecondary0d7_KjU();
                                i3 &= -57345;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 32) == 0) {
                                j6 = ColorsKt.m814contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 12) & 14);
                                i3 &= -458753;
                            } else {
                                j6 = j4;
                            }
                            if ((i2 & 64) != 0) {
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m883elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i3 &= -3670017;
                            }
                            modifier2 = modifier4;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape4 = shape3;
                            j7 = j5;
                            j8 = j6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
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
                            shape4 = shape2;
                            j7 = j3;
                            j8 = j4;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        startRestartGroup.endDefaults();
                        composer2 = startRestartGroup;
                        SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, false, shape4, j7, j8, null, ((Dp) floatingActionButtonElevation2.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue()).getValue(), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                                if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(j8)))};
                                    final Function2 function2 = content;
                                    final int i11 = i3;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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
                                        public final void invoke(@Nullable Composer composer4, int i12) {
                                            if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                                final Function2 function22 = Function2.this;
                                                final int i13 = i11;
                                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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
                                                    public final void invoke(@Nullable Composer composer5, int i14) {
                                                        float f;
                                                        float f2;
                                                        if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            f = FloatingActionButtonKt.FabSize;
                                                            f2 = FloatingActionButtonKt.FabSize;
                                                            Modifier m345defaultMinSizeVpY3zN4 = SizeKt.m345defaultMinSizeVpY3zN4(companion, f, f2);
                                                            Alignment center = Alignment.INSTANCE.getCenter();
                                                            Function2 function23 = Function2.this;
                                                            int i15 = i13;
                                                            composer5.startReplaceableGroup(733328855);
                                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                            Function0 constructor = companion2.getConstructor();
                                                            Function3 materializerOf = LayoutKt.materializerOf(m345defaultMinSizeVpY3zN4);
                                                            if (composer5.getApplier() == null) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            composer5.disableReusing();
                                                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer5);
                                                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-2137368960);
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(-1049034642);
                                                            function23.invoke(composer5, Integer.valueOf((i15 >> 21) & 14));
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }), composer4, 48);
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 56);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                        modifier3 = modifier2;
                        shape5 = shape4;
                        j9 = j7;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j10 = j8;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape5 = shape2;
                        composer2 = startRestartGroup;
                        long j11 = j4;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        j9 = j3;
                        j10 = j11;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i10) {
                            FloatingActionButtonKt.m885FloatingActionButtonbogVsAg(Function0.this, modifier3, mutableInteractionSource4, shape5, j9, j10, floatingActionButtonElevation3, content, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i5;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                modifier2 = modifier4;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape4 = shape3;
                j7 = j5;
                j8 = j6;
                startRestartGroup.endDefaults();
                composer2 = startRestartGroup;
                SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, false, shape4, j7, j8, null, ((Dp) floatingActionButtonElevation2.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue()).getValue(), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                        if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(j8)))};
                            final Function2 function2 = content;
                            final int i11 = i3;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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
                                public final void invoke(@Nullable Composer composer4, int i12) {
                                    if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                        final Function2 function22 = Function2.this;
                                        final int i13 = i11;
                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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
                                            public final void invoke(@Nullable Composer composer5, int i14) {
                                                float f;
                                                float f2;
                                                if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    f = FloatingActionButtonKt.FabSize;
                                                    f2 = FloatingActionButtonKt.FabSize;
                                                    Modifier m345defaultMinSizeVpY3zN4 = SizeKt.m345defaultMinSizeVpY3zN4(companion, f, f2);
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    Function2 function23 = Function2.this;
                                                    int i15 = i13;
                                                    composer5.startReplaceableGroup(733328855);
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0 constructor = companion2.getConstructor();
                                                    Function3 materializerOf = LayoutKt.materializerOf(m345defaultMinSizeVpY3zN4);
                                                    if (composer5.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer5);
                                                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-2137368960);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(-1049034642);
                                                    function23.invoke(composer5, Integer.valueOf((i15 >> 21) & 14));
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 48);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 56);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
                modifier3 = modifier2;
                shape5 = shape4;
                j9 = j7;
                mutableInteractionSource4 = mutableInteractionSource3;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                j10 = j8;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i5;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            modifier2 = modifier4;
            mutableInteractionSource3 = mutableInteractionSource2;
            shape4 = shape3;
            j7 = j5;
            j8 = j6;
            startRestartGroup.endDefaults();
            composer2 = startRestartGroup;
            SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, false, shape4, j7, j8, null, ((Dp) floatingActionButtonElevation2.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue()).getValue(), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                    if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(j8)))};
                        final Function2 function2 = content;
                        final int i11 = i3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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
                            public final void invoke(@Nullable Composer composer4, int i12) {
                                if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final Function2 function22 = Function2.this;
                                    final int i13 = i11;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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
                                        public final void invoke(@Nullable Composer composer5, int i14) {
                                            float f;
                                            float f2;
                                            if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                f = FloatingActionButtonKt.FabSize;
                                                f2 = FloatingActionButtonKt.FabSize;
                                                Modifier m345defaultMinSizeVpY3zN4 = SizeKt.m345defaultMinSizeVpY3zN4(companion, f, f2);
                                                Alignment center = Alignment.INSTANCE.getCenter();
                                                Function2 function23 = Function2.this;
                                                int i15 = i13;
                                                composer5.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                composer5.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion2.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(m345defaultMinSizeVpY3zN4);
                                                if (composer5.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer5);
                                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-2137368960);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(-1049034642);
                                                function23.invoke(composer5, Integer.valueOf((i15 >> 21) & 14));
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 48);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 56);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
            modifier3 = modifier2;
            shape5 = shape4;
            j9 = j7;
            mutableInteractionSource4 = mutableInteractionSource3;
            floatingActionButtonElevation3 = floatingActionButtonElevation2;
            j10 = j8;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i5;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        modifier2 = modifier4;
        mutableInteractionSource3 = mutableInteractionSource2;
        shape4 = shape3;
        j7 = j5;
        j8 = j6;
        startRestartGroup.endDefaults();
        composer2 = startRestartGroup;
        SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, false, shape4, j7, j8, null, ((Dp) floatingActionButtonElevation2.elevation(mutableInteractionSource3, startRestartGroup, ((i3 >> 6) & 14) | ((i3 >> 15) & 112)).getValue()).getValue(), mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(j8)))};
                    final Function2 function2 = content;
                    final int i11 = i3;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1867794295, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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
                        public final void invoke(@Nullable Composer composer4, int i12) {
                            if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final Function2 function22 = Function2.this;
                                final int i13 = i11;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -1567914264, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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
                                    public final void invoke(@Nullable Composer composer5, int i14) {
                                        float f;
                                        float f2;
                                        if ((i14 & 11) != 2 || !composer5.getSkipping()) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            f = FloatingActionButtonKt.FabSize;
                                            f2 = FloatingActionButtonKt.FabSize;
                                            Modifier m345defaultMinSizeVpY3zN4 = SizeKt.m345defaultMinSizeVpY3zN4(companion, f, f2);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2 function23 = Function2.this;
                                            int i15 = i13;
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                            composer5.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion2.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(m345defaultMinSizeVpY3zN4);
                                            if (composer5.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer5);
                                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-2137368960);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(-1049034642);
                                            function23.invoke(composer5, Integer.valueOf((i15 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 56);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 234881024), 68);
        modifier3 = modifier2;
        shape5 = shape4;
        j9 = j7;
        mutableInteractionSource4 = mutableInteractionSource3;
        floatingActionButtonElevation3 = floatingActionButtonElevation2;
        j10 = j8;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01df  */
    /* renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m884ExtendedFloatingActionButtonwqdebIU(final Function2 text, final Function0 onClick, Modifier modifier, Function2 function2, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        long j5;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        long j6;
        long j7;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        final Function2 function22;
        Composer composer2;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape4;
        final long j8;
        final Function2 function23;
        final long j9;
        final FloatingActionButtonElevation floatingActionButtonElevation4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1555720195);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(function2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                    if ((i & 458752) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(shape)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    }
                    if ((i & 3670016) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        j4 = j2;
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j4)) ? 8388608 : 4194304;
                    } else {
                        j4 = j2;
                    }
                    if ((i & 234881024) != 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                                i6 = 67108864;
                                i3 |= i6;
                            }
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i6 = 33554432;
                        i3 |= i6;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            Function2 function24 = i4 == 0 ? null : function2;
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
                            if ((i2 & 32) == 0) {
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 64) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m798getSecondary0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) == 0) {
                                j5 = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                j5 = j4;
                            }
                            if ((i2 & 256) == 0) {
                                i3 &= -234881025;
                                modifier2 = modifier4;
                                function22 = function24;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                j6 = j5;
                                floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m883elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                j7 = j3;
                            } else {
                                modifier2 = modifier4;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                j6 = j5;
                                j7 = j3;
                                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                                function22 = function24;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
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
                            modifier2 = modifier;
                            mutableInteractionSource3 = mutableInteractionSource;
                            shape3 = shape;
                            j6 = j4;
                            j7 = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            function22 = function2;
                        }
                        startRestartGroup.endDefaults();
                        float f = ExtendedFabSize;
                        Modifier m361sizeInqDBjuR0$default = SizeKt.m361sizeInqDBjuR0$default(modifier2, f, f, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                            public final void invoke(@Nullable Composer composer3, int i9) {
                                float f2;
                                float f3;
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    float f4 = Function2.this == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    f2 = FloatingActionButtonKt.ExtendedFabTextPadding;
                                    Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(companion, f4, 0.0f, f2, 0.0f, 10, null);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2 function25 = Function2.this;
                                    int i10 = i3;
                                    Function2 function26 = text;
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion2.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-388203689);
                                    composer3.startReplaceableGroup(-1435223762);
                                    if (function25 != null) {
                                        function25.invoke(composer3, Integer.valueOf((i10 >> 9) & 14));
                                        f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                                        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer3, 6);
                                    }
                                    composer3.endReplaceableGroup();
                                    function26.invoke(composer3, Integer.valueOf(i10 & 14));
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
                        });
                        int i9 = ((i3 >> 3) & 14) | 12582912;
                        int i10 = i3 >> 6;
                        composer2 = startRestartGroup;
                        m885FloatingActionButtonbogVsAg(onClick, m361sizeInqDBjuR0$default, mutableInteractionSource3, shape3, j7, j6, floatingActionButtonElevation3, composableLambda, startRestartGroup, i9 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                        modifier3 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        j8 = j7;
                        function23 = function22;
                        j9 = j6;
                        floatingActionButtonElevation4 = floatingActionButtonElevation3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function23 = function2;
                        mutableInteractionSource4 = mutableInteractionSource;
                        shape4 = shape;
                        composer2 = startRestartGroup;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j9 = j4;
                        j8 = j3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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
                            FloatingActionButtonKt.m884ExtendedFloatingActionButtonwqdebIU(Function2.this, onClick, modifier3, function23, mutableInteractionSource4, shape4, j8, j9, floatingActionButtonElevation4, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                if ((i & 458752) == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) != 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                startRestartGroup.endDefaults();
                float f2 = ExtendedFabSize;
                Modifier m361sizeInqDBjuR0$default2 = SizeKt.m361sizeInqDBjuR0$default(modifier2, f2, f2, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                    public final void invoke(@Nullable Composer composer3, int i92) {
                        float f22;
                        float f3;
                        if ((i92 & 11) != 2 || !composer3.getSkipping()) {
                            float f4 = Function2.this == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            f22 = FloatingActionButtonKt.ExtendedFabTextPadding;
                            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(companion, f4, 0.0f, f22, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2 function25 = Function2.this;
                            int i102 = i3;
                            Function2 function26 = text;
                            composer3.startReplaceableGroup(693286680);
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion2.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-678309503);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-388203689);
                            composer3.startReplaceableGroup(-1435223762);
                            if (function25 != null) {
                                function25.invoke(composer3, Integer.valueOf((i102 >> 9) & 14));
                                f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer3, 6);
                            }
                            composer3.endReplaceableGroup();
                            function26.invoke(composer3, Integer.valueOf(i102 & 14));
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
                });
                int i92 = ((i3 >> 3) & 14) | 12582912;
                int i102 = i3 >> 6;
                composer2 = startRestartGroup;
                m885FloatingActionButtonbogVsAg(onClick, m361sizeInqDBjuR0$default2, mutableInteractionSource3, shape3, j7, j6, floatingActionButtonElevation3, composableLambda2, startRestartGroup, i92 | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016), 0);
                modifier3 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                j8 = j7;
                function23 = function22;
                j9 = j6;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) != 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            startRestartGroup.endDefaults();
            float f22 = ExtendedFabSize;
            Modifier m361sizeInqDBjuR0$default22 = SizeKt.m361sizeInqDBjuR0$default(modifier2, f22, f22, 0.0f, 0.0f, 12, null);
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
                public final void invoke(@Nullable Composer composer3, int i922) {
                    float f222;
                    float f3;
                    if ((i922 & 11) != 2 || !composer3.getSkipping()) {
                        float f4 = Function2.this == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        f222 = FloatingActionButtonKt.ExtendedFabTextPadding;
                        Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(companion, f4, 0.0f, f222, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2 function25 = Function2.this;
                        int i1022 = i3;
                        Function2 function26 = text;
                        composer3.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion2.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-388203689);
                        composer3.startReplaceableGroup(-1435223762);
                        if (function25 != null) {
                            function25.invoke(composer3, Integer.valueOf((i1022 >> 9) & 14));
                            f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer3, 6);
                        }
                        composer3.endReplaceableGroup();
                        function26.invoke(composer3, Integer.valueOf(i1022 & 14));
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
            });
            int i922 = ((i3 >> 3) & 14) | 12582912;
            int i1022 = i3 >> 6;
            composer2 = startRestartGroup;
            m885FloatingActionButtonbogVsAg(onClick, m361sizeInqDBjuR0$default22, mutableInteractionSource3, shape3, j7, j6, floatingActionButtonElevation3, composableLambda22, startRestartGroup, i922 | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016), 0);
            modifier3 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            shape4 = shape3;
            j8 = j7;
            function23 = function22;
            j9 = j6;
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        startRestartGroup.endDefaults();
        float f222 = ExtendedFabSize;
        Modifier m361sizeInqDBjuR0$default222 = SizeKt.m361sizeInqDBjuR0$default(modifier2, f222, f222, 0.0f, 0.0f, 12, null);
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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
            public final void invoke(@Nullable Composer composer3, int i9222) {
                float f2222;
                float f3;
                if ((i9222 & 11) != 2 || !composer3.getSkipping()) {
                    float f4 = Function2.this == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    f2222 = FloatingActionButtonKt.ExtendedFabTextPadding;
                    Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(companion, f4, 0.0f, f2222, 0.0f, 10, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2 function25 = Function2.this;
                    int i10222 = i3;
                    Function2 function26 = text;
                    composer3.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion2.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-678309503);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-388203689);
                    composer3.startReplaceableGroup(-1435223762);
                    if (function25 != null) {
                        function25.invoke(composer3, Integer.valueOf((i10222 >> 9) & 14));
                        f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer3, 6);
                    }
                    composer3.endReplaceableGroup();
                    function26.invoke(composer3, Integer.valueOf(i10222 & 14));
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
        });
        int i9222 = ((i3 >> 3) & 14) | 12582912;
        int i10222 = i3 >> 6;
        composer2 = startRestartGroup;
        m885FloatingActionButtonbogVsAg(onClick, m361sizeInqDBjuR0$default222, mutableInteractionSource3, shape3, j7, j6, floatingActionButtonElevation3, composableLambda222, startRestartGroup, i9222 | (i10222 & 896) | (i10222 & 7168) | (57344 & i10222) | (458752 & i10222) | (i10222 & 3670016), 0);
        modifier3 = modifier2;
        mutableInteractionSource4 = mutableInteractionSource3;
        shape4 = shape3;
        j8 = j7;
        function23 = function22;
        j9 = j6;
        floatingActionButtonElevation4 = floatingActionButtonElevation3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
