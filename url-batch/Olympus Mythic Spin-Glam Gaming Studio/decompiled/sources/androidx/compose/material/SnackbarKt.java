package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a3\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001ac\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a{\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00012\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a \u0010&\u001a\u00020\f2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010'\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"HeightToFirstLine", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "Snackbar", "snackbarData", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "actionColor", "elevation", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float HeightToFirstLine = Dp.m2507constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m2507constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m2507constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m2507constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m2507constructorimpl(12);
    private static final float SnackbarMinHeightOneLine = Dp.m2507constructorimpl(48);
    private static final float SnackbarMinHeightTwoLines = Dp.m2507constructorimpl(68);

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c4  */
    /* renamed from: Snackbar-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m970Snackbar7zSek6w(Modifier modifier, Function2 function2, boolean z, Shape shape, long j, long j2, float f, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        final Function2 function22;
        int i4;
        final boolean z2;
        Shape shape2;
        long j3;
        int i5;
        final Function2 function23;
        final Modifier modifier2;
        long j4;
        float m2507constructorimpl;
        final int i6;
        long j5;
        long j6;
        final float f2;
        final Shape shape3;
        final Function2 function24;
        final long j7;
        final boolean z3;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-558258760);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changed(function22) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    j3 = j;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j2)) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                    function23 = content;
                } else {
                    function23 = content;
                    if ((29360128 & i) == 0) {
                        i3 |= startRestartGroup.changed(function23) ? 8388608 : 4194304;
                    }
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier2 = i8 != 0 ? Modifier.INSTANCE : modifier;
                        if (i9 != 0) {
                            function22 = null;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                        }
                        if ((i2 & 16) != 0) {
                            j3 = SnackbarDefaults.INSTANCE.getBackgroundColor(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                            i3 &= -458753;
                        } else {
                            j4 = j2;
                        }
                        m2507constructorimpl = i5 != 0 ? Dp.m2507constructorimpl(6) : f;
                        i6 = i3;
                        j5 = j3;
                        j6 = j4;
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
                        modifier2 = modifier;
                        j6 = j2;
                        m2507constructorimpl = f;
                        i6 = i3;
                        j5 = j3;
                    }
                    startRestartGroup.endDefaults();
                    int i10 = i6 >> 6;
                    SurfaceKt.m988SurfaceFjzlyU(modifier2, shape2, j5, j6, null, m2507constructorimpl, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                        public final void invoke(@Nullable Composer composer2, int i11) {
                            if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                                final Function2 function25 = Function2.this;
                                final Function2 function26 = function23;
                                final int i12 = i6;
                                final boolean z4 = z2;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                                    public final void invoke(@Nullable Composer composer3, int i13) {
                                        if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                            final Function2 function27 = Function2.this;
                                            final Function2 function28 = function26;
                                            final int i14 = i12;
                                            final boolean z5 = z4;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                                public final void invoke(@Nullable Composer composer4, int i15) {
                                                    if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (Function2.this == null) {
                                                            composer4.startReplaceableGroup(59708346);
                                                            SnackbarKt.TextOnlySnackbar(function28, composer4, (i14 >> 21) & 14);
                                                            composer4.endReplaceableGroup();
                                                            return;
                                                        }
                                                        if (z5) {
                                                            composer4.startReplaceableGroup(59708411);
                                                            Function2 function29 = function28;
                                                            Function2 function210 = Function2.this;
                                                            int i16 = i14;
                                                            SnackbarKt.NewLineButtonSnackbar(function29, function210, composer4, (i16 & 112) | ((i16 >> 21) & 14));
                                                            composer4.endReplaceableGroup();
                                                            return;
                                                        }
                                                        composer4.startReplaceableGroup(59708478);
                                                        Function2 function211 = function28;
                                                        Function2 function212 = Function2.this;
                                                        int i17 = i14;
                                                        SnackbarKt.OneRowSnackbar(function211, function212, composer4, (i17 & 112) | ((i17 >> 21) & 14));
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 48);
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 56);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i6 & 14) | 1572864 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | ((i6 >> 3) & 458752), 16);
                    f2 = m2507constructorimpl;
                    shape3 = shape2;
                    long j9 = j5;
                    function24 = function22;
                    j7 = j9;
                    z3 = z2;
                    j8 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    f2 = f;
                    function24 = function22;
                    z3 = z2;
                    shape3 = shape2;
                    j7 = j3;
                    j8 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        SnackbarKt.m970Snackbar7zSek6w(Modifier.this, function24, z3, shape3, j7, j8, f2, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            i6 = i3;
            j5 = j3;
            j6 = j4;
            startRestartGroup.endDefaults();
            int i102 = i6 >> 6;
            SurfaceKt.m988SurfaceFjzlyU(modifier2, shape2, j5, j6, null, m2507constructorimpl, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
                public final void invoke(@Nullable Composer composer2, int i11) {
                    if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                        final Function2 function25 = Function2.this;
                        final Function2 function26 = function23;
                        final int i12 = i6;
                        final boolean z4 = z2;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i13) {
                                if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                    final Function2 function27 = Function2.this;
                                    final Function2 function28 = function26;
                                    final int i14 = i12;
                                    final boolean z5 = z4;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                        public final void invoke(@Nullable Composer composer4, int i15) {
                                            if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                                if (Function2.this == null) {
                                                    composer4.startReplaceableGroup(59708346);
                                                    SnackbarKt.TextOnlySnackbar(function28, composer4, (i14 >> 21) & 14);
                                                    composer4.endReplaceableGroup();
                                                    return;
                                                }
                                                if (z5) {
                                                    composer4.startReplaceableGroup(59708411);
                                                    Function2 function29 = function28;
                                                    Function2 function210 = Function2.this;
                                                    int i16 = i14;
                                                    SnackbarKt.NewLineButtonSnackbar(function29, function210, composer4, (i16 & 112) | ((i16 >> 21) & 14));
                                                    composer4.endReplaceableGroup();
                                                    return;
                                                }
                                                composer4.startReplaceableGroup(59708478);
                                                Function2 function211 = function28;
                                                Function2 function212 = Function2.this;
                                                int i17 = i14;
                                                SnackbarKt.OneRowSnackbar(function211, function212, composer4, (i17 & 112) | ((i17 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 48);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i6 & 14) | 1572864 | (i102 & 112) | (i102 & 896) | (i102 & 7168) | ((i6 >> 3) & 458752), 16);
            f2 = m2507constructorimpl;
            shape3 = shape2;
            long j92 = j5;
            function24 = function22;
            j7 = j92;
            z3 = z2;
            j8 = j6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function22 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        i6 = i3;
        j5 = j3;
        j6 = j4;
        startRestartGroup.endDefaults();
        int i1022 = i6 >> 6;
        SurfaceKt.m988SurfaceFjzlyU(modifier2, shape2, j5, j6, null, m2507constructorimpl, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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
            public final void invoke(@Nullable Composer composer2, int i11) {
                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))};
                    final Function2 function25 = Function2.this;
                    final Function2 function26 = function23;
                    final int i12 = i6;
                    final boolean z4 = z2;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1939362236, true, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i13) {
                            if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                final Function2 function27 = Function2.this;
                                final Function2 function28 = function26;
                                final int i14 = i12;
                                final boolean z5 = z4;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, 225114541, true, new Function2() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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
                                    public final void invoke(@Nullable Composer composer4, int i15) {
                                        if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                            if (Function2.this == null) {
                                                composer4.startReplaceableGroup(59708346);
                                                SnackbarKt.TextOnlySnackbar(function28, composer4, (i14 >> 21) & 14);
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            if (z5) {
                                                composer4.startReplaceableGroup(59708411);
                                                Function2 function29 = function28;
                                                Function2 function210 = Function2.this;
                                                int i16 = i14;
                                                SnackbarKt.NewLineButtonSnackbar(function29, function210, composer4, (i16 & 112) | ((i16 >> 21) & 14));
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.startReplaceableGroup(59708478);
                                            Function2 function211 = function28;
                                            Function2 function212 = Function2.this;
                                            int i17 = i14;
                                            SnackbarKt.OneRowSnackbar(function211, function212, composer4, (i17 & 112) | ((i17 >> 21) & 14));
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 48);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i6 & 14) | 1572864 | (i1022 & 112) | (i1022 & 896) | (i1022 & 7168) | ((i6 >> 3) & 458752), 16);
        f2 = m2507constructorimpl;
        shape3 = shape2;
        long j922 = j5;
        function24 = function22;
        j7 = j922;
        z3 = z2;
        j8 = j6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static {
        float f = 8;
        HorizontalSpacingButtonSide = Dp.m2507constructorimpl(f);
        TextEndExtraSpacing = Dp.m2507constructorimpl(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /* renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m971SnackbarsPrSdHI(final SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j, long j2, long j3, float f, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Shape shape2;
        long j4;
        long j5;
        int i5;
        final float f2;
        Modifier modifier2;
        boolean z2;
        Shape shape3;
        long j6;
        long j7;
        int i6;
        float f3;
        long j8;
        long j9;
        long j10;
        final String actionLabel;
        long j11;
        boolean z3;
        ComposableLambda composableLambda;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape4;
        final long j12;
        final long j13;
        final long j14;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
        Composer startRestartGroup = composer.startRestartGroup(258660814);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                    i8 = 8192;
                    i3 |= i8;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        j4 = j2;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    j4 = j2;
                }
                if ((i & 3670016) == 0) {
                    j5 = j3;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                } else {
                    j5 = j3;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier2 = i10 != 0 ? Modifier.INSTANCE : modifier;
                        z2 = i4 != 0 ? false : z;
                        if ((i2 & 8) != 0) {
                            shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                            i3 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            j6 = SnackbarDefaults.INSTANCE.getBackgroundColor(startRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            j6 = j;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j7 = SnackbarDefaults.INSTANCE.getPrimaryActionColor(startRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            j7 = j5;
                        }
                        if (i5 != 0) {
                            j8 = j7;
                            j9 = j4;
                            i6 = i3;
                            f3 = Dp.m2507constructorimpl(6);
                        } else {
                            long j15 = j4;
                            i6 = i3;
                            f3 = f2;
                            j8 = j7;
                            j9 = j15;
                        }
                        j10 = j6;
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
                        z2 = z;
                        shape3 = shape2;
                        j10 = j;
                        long j16 = j4;
                        i6 = i3;
                        f3 = f2;
                        j8 = j5;
                        j9 = j16;
                    }
                    startRestartGroup.endDefaults();
                    actionLabel = snackbarData.getActionLabel();
                    if (actionLabel != null) {
                        final long j17 = j8;
                        final int i11 = i6;
                        j11 = j8;
                        z3 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1843479216, true, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
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
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    ButtonColors m761textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m761textButtonColorsRGew2ao(0L, j17, 0L, composer2, ((i11 >> 15) & 112) | 3072, 5);
                                    final SnackbarData snackbarData2 = snackbarData;
                                    Function0 function0 = new Function0() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                            m972invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m972invoke() {
                                            SnackbarData.this.performAction();
                                        }
                                    };
                                    final String str = actionLabel;
                                    ButtonKt.TextButton(function0, null, false, null, null, null, null, m761textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer2, -929149933, true, new Function3() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget
                                        @Composable
                                        public final void invoke(@NotNull RowScope TextButton, @Nullable Composer composer3, int i13) {
                                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                            if ((i13 & 81) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                TextKt.m1056TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 0, 65534);
                                            }
                                        }
                                    }), composer2, C.ENCODING_PCM_32BIT, 382);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                    } else {
                        j11 = j8;
                        z3 = true;
                        composableLambda = null;
                    }
                    m970Snackbar7zSek6w(PaddingKt.m334padding3ABfNKs(modifier2, Dp.m2507constructorimpl(12)), composableLambda, z2, shape3, j10, j9, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -261845785, z3, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                            if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                            } else {
                                TextKt.m1056TextfLXpl1I(SnackbarData.this.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 0, 65534);
                            }
                        }
                    }), startRestartGroup, (i6 & 896) | 12582912 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i6 >> 3) & 3670016), 0);
                    f2 = f3;
                    modifier3 = modifier2;
                    z4 = z2;
                    shape4 = shape3;
                    j12 = j10;
                    j13 = j9;
                    j14 = j11;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    z4 = z;
                    j12 = j;
                    shape4 = shape2;
                    j14 = j5;
                    j13 = j4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
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
                        SnackbarKt.m971SnackbarsPrSdHI(SnackbarData.this, modifier3, z4, shape4, j12, j13, j14, f2, composer2, i | 1, i2);
                    }
                });
                return;
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i5 != 0) {
            }
            j10 = j6;
            startRestartGroup.endDefaults();
            actionLabel = snackbarData.getActionLabel();
            if (actionLabel != null) {
            }
            m970Snackbar7zSek6w(PaddingKt.m334padding3ABfNKs(modifier2, Dp.m2507constructorimpl(12)), composableLambda, z2, shape3, j10, j9, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -261845785, z3, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                    if ((i12 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        TextKt.m1056TextfLXpl1I(SnackbarData.this.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 0, 65534);
                    }
                }
            }), startRestartGroup, (i6 & 896) | 12582912 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i6 >> 3) & 3670016), 0);
            f2 = f3;
            modifier3 = modifier2;
            z4 = z2;
            shape4 = shape3;
            j12 = j10;
            j13 = j9;
            j14 = j11;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
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
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i5 != 0) {
        }
        j10 = j6;
        startRestartGroup.endDefaults();
        actionLabel = snackbarData.getActionLabel();
        if (actionLabel != null) {
        }
        m970Snackbar7zSek6w(PaddingKt.m334padding3ABfNKs(modifier2, Dp.m2507constructorimpl(12)), composableLambda, z2, shape3, j10, j9, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -261845785, z3, new Function2() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
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
                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    TextKt.m1056TextfLXpl1I(SnackbarData.this.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 0, 65534);
                }
            }
        }), startRestartGroup, (i6 & 896) | 12582912 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | ((i6 >> 3) & 3670016), 0);
        f2 = f3;
        modifier3 = modifier2;
        z4 = z2;
        shape4 = shape3;
        j12 = j10;
        j13 = j9;
        j14 = j11;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextOnlySnackbar(final Function2 function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(917397959);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (measurables.size() != 1) {
                        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child");
                    }
                    final Placeable mo1944measureBRTryo0 = ((Measurable) CollectionsKt.first(measurables)).mo1944measureBRTryo0(j);
                    int i3 = mo1944measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    int i4 = mo1944measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
                    if (i3 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    if (i4 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    final int max = Math.max(Layout.mo265roundToPx0680j_4(i3 == i4 ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), mo1944measureBRTryo0.getHeight());
                    return MeasureScope.layout$default(Layout, Constraints.m2487getMaxWidthimpl(j), max, null, new Function1() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$measure$4
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
                            Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, (max - mo1944measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
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
            Updater.m1153setimpl(m1149constructorimpl, snackbarKt$TextOnlySnackbar$2, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-266728784);
            Modifier m335paddingVpY3zN4 = PaddingKt.m335paddingVpY3zN4(companion, HorizontalSpacing, SnackbarVerticalPadding);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion2.getConstructor();
            Function3 materializerOf2 = LayoutKt.materializerOf(m335paddingVpY3zN4);
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
            Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1392363114);
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
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
                SnackbarKt.TextOnlySnackbar(Function2.this, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewLineButtonSnackbar(final Function2 function2, final Function2 function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f = HorizontalSpacing;
            float f2 = HorizontalSpacingButtonSide;
            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(fillMaxWidth$default, f, 0.0f, f2, SeparateButtonExtraY, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion3.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1163856341);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1214415430);
            Modifier m338paddingqDBjuR0$default2 = PaddingKt.m338paddingqDBjuR0$default(androidx.compose.foundation.layout.AlignmentLineKt.m297paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f2, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion3.getConstructor();
            Function3 materializerOf2 = LayoutKt.materializerOf(m338paddingqDBjuR0$default2);
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
            Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1193033152);
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor3 = companion3.getConstructor();
            Function3 materializerOf3 = LayoutKt.materializerOf(align);
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
            Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            startRestartGroup.startReplaceableGroup(-2100387721);
            function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
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
                SnackbarKt.NewLineButtonSnackbar(Function2.this, function22, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OneRowSnackbar(final Function2 function2, final Function2 function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-534813202);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            final String str = "action";
            final String str2 = "text";
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    float f;
                    float f2;
                    float f3;
                    int i3;
                    final int i4;
                    final int height;
                    float f4;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<Measurable> list = measurables;
                    String str3 = str;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str3)) {
                            final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
                            int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j) - mo1944measureBRTryo0.getWidth();
                            f = SnackbarKt.TextEndExtraSpacing;
                            int coerceAtLeast = RangesKt.coerceAtLeast(m2487getMaxWidthimpl - Layout.mo265roundToPx0680j_4(f), Constraints.m2489getMinWidthimpl(j));
                            String str4 = str2;
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str4)) {
                                    final Placeable mo1944measureBRTryo02 = measurable2.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, coerceAtLeast, 0, 0, 9, null));
                                    int i5 = mo1944measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                                    if (i5 == Integer.MIN_VALUE) {
                                        throw new IllegalArgumentException("No baselines for text");
                                    }
                                    int i6 = mo1944measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                                    if (i6 == Integer.MIN_VALUE) {
                                        throw new IllegalArgumentException("No baselines for text");
                                    }
                                    boolean z = i5 == i6;
                                    final int m2487getMaxWidthimpl2 = Constraints.m2487getMaxWidthimpl(j) - mo1944measureBRTryo0.getWidth();
                                    if (z) {
                                        f4 = SnackbarKt.SnackbarMinHeightOneLine;
                                        i3 = Math.max(Layout.mo265roundToPx0680j_4(f4), mo1944measureBRTryo0.getHeight());
                                        int height2 = (i3 - mo1944measureBRTryo02.getHeight()) / 2;
                                        int i7 = mo1944measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                                        height = i7 != Integer.MIN_VALUE ? (i5 + height2) - i7 : 0;
                                        i4 = height2;
                                    } else {
                                        f2 = SnackbarKt.HeightToFirstLine;
                                        int mo265roundToPx0680j_4 = Layout.mo265roundToPx0680j_4(f2) - i5;
                                        f3 = SnackbarKt.SnackbarMinHeightTwoLines;
                                        int max = Math.max(Layout.mo265roundToPx0680j_4(f3), mo1944measureBRTryo02.getHeight() + mo265roundToPx0680j_4);
                                        i3 = max;
                                        i4 = mo265roundToPx0680j_4;
                                        height = (max - mo1944measureBRTryo0.getHeight()) / 2;
                                    }
                                    return MeasureScope.layout$default(Layout, Constraints.m2487getMaxWidthimpl(j), i3, null, new Function1() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$measure$4
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
                                            Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, i4, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, m2487getMaxWidthimpl2, height, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion2.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
            startRestartGroup.startReplaceableGroup(-643033641);
            Modifier m336paddingVpY3zN4$default = PaddingKt.m336paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion2.getConstructor();
            Function3 materializerOf2 = LayoutKt.materializerOf(m336paddingVpY3zN4$default);
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
            Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1616738193);
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(companion, "action");
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor3 = companion2.getConstructor();
            Function3 materializerOf3 = LayoutKt.materializerOf(layoutId);
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
            Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl3, density3, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            startRestartGroup.startReplaceableGroup(-1690150342);
            function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
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
                SnackbarKt.OneRowSnackbar(Function2.this, function22, composer2, i | 1);
            }
        });
    }
}
