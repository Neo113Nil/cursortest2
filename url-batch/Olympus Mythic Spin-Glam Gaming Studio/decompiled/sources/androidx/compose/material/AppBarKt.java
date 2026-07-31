package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0082\u0001\u0010\u0011\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001al\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b!\u0010\"\u001a`\u0010&\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\"\u0017\u0010'\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010(\"\u0017\u0010)\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010(\"\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+\"\u0017\u0010-\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b-\u0010(\"\u0017\u0010.\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010(\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "actions", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "content", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "", "controlPointX", "verticalOffset", "radius", "Lkotlin/Pair;", "calculateRoundedEdgeIntercept", "(FFF)Lkotlin/Pair;", "shape", "AppBar-celAv9A", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AppBar", "AppBarHeight", "F", "AppBarHorizontalPadding", "TitleInsetWithoutIcon", "Landroidx/compose/ui/Modifier;", "TitleIconModifier", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m2507constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;
    private static final Modifier TitleIconModifier;
    private static final Modifier TitleInsetWithoutIcon;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e  */
    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m716TopAppBarxWeB9s(final Function2 title, Modifier modifier, Function2 function2, Function3 function3, long j, long j2, float f, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        Function3 function32;
        long j3;
        long j4;
        int i6;
        final float f2;
        Modifier modifier2;
        final Function2 function22;
        final Function3 m819getLambda1$material_release;
        long j5;
        long j6;
        long j7;
        final Modifier modifier3;
        final Function2 function23;
        final Function3 function33;
        final long j8;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-2087748139);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(function2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changed(function32) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                    } else {
                        j3 = j;
                    }
                    if ((i & 458752) != 0) {
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
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            function22 = i4 == 0 ? null : function2;
                            m819getLambda1$material_release = i5 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m819getLambda1$material_release() : function32;
                            if ((i2 & 16) == 0) {
                                j5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
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
                            if (i6 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m712getTopAppBarElevationD9Ej5fM();
                            }
                            j7 = j6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            function22 = function2;
                            m819getLambda1$material_release = function32;
                            j5 = j3;
                            j7 = j4;
                        }
                        startRestartGroup.endDefaults();
                        int i9 = i3 >> 12;
                        m713AppBarcelAv9A(j5, j7, f2, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
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
                            public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i10) {
                                int i11;
                                Modifier modifier4;
                                Modifier modifier5;
                                Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (Function2.this == null) {
                                    composer2.startReplaceableGroup(-512812651);
                                    modifier5 = AppBarKt.TitleInsetWithoutIcon;
                                    SpacerKt.Spacer(modifier5, composer2, 6);
                                    composer2.endReplaceableGroup();
                                } else {
                                    composer2.startReplaceableGroup(-512812592);
                                    modifier4 = AppBarKt.TitleIconModifier;
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2 function24 = Function2.this;
                                    int i12 = i3;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(modifier4);
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
                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1485618042);
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i12 >> 3) & 112) | 8);
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                                Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                final Function2 function25 = title;
                                final int i13 = i3;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 constructor2 = companion2.getConstructor();
                                Function3 materializerOf2 = LayoutKt.materializerOf(weight$default);
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                                Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-678309503);
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(159489950);
                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                                    public final void invoke(@Nullable Composer composer3, int i14) {
                                        if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, Function2.this, composer3, ((i13 << 3) & 112) | 8);
                                        } else {
                                            composer3.skipToGroupEnd();
                                        }
                                    }
                                }), composer2, 48);
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                                final Function3 function34 = m819getLambda1$material_release;
                                final int i14 = i3;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                            Function3 function35 = Function3.this;
                                            int i16 = (i14 & 7168) | 438;
                                            composer3.startReplaceableGroup(693286680);
                                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                                            composer3.startReplaceableGroup(-1323940314);
                                            Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0 constructor3 = companion3.getConstructor();
                                            Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer3);
                                            Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-678309503);
                                            function35.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
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
                            }
                        }), startRestartGroup, (i9 & 896) | (i9 & 14) | 1600512 | (i9 & 112) | ((i3 << 12) & 458752), 0);
                        modifier3 = modifier2;
                        function23 = function22;
                        function33 = m819getLambda1$material_release;
                        j8 = j5;
                        j9 = j7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function23 = function2;
                        function33 = function32;
                        j8 = j3;
                        j9 = j4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i10) {
                            AppBarKt.m716TopAppBarxWeB9s(Function2.this, modifier3, function23, function33, j8, j9, f2, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                function32 = function3;
                if ((57344 & i) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i3 & 2995931) == 599186) {
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
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i6 != 0) {
                }
                j7 = j6;
                startRestartGroup.endDefaults();
                int i92 = i3 >> 12;
                m713AppBarcelAv9A(j5, j7, f2, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
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
                    public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i10) {
                        int i11;
                        Modifier modifier4;
                        Modifier modifier5;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        if ((i10 & 14) == 0) {
                            i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (Function2.this == null) {
                            composer2.startReplaceableGroup(-512812651);
                            modifier5 = AppBarKt.TitleInsetWithoutIcon;
                            SpacerKt.Spacer(modifier5, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-512812592);
                            modifier4 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2 function24 = Function2.this;
                            int i12 = i3;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(modifier4);
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
                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1485618042);
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i12 >> 3) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2 function25 = title;
                        final int i13 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 constructor2 = companion2.getConstructor();
                        Function3 materializerOf2 = LayoutKt.materializerOf(weight$default);
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(159489950);
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, Function2.this, composer3, ((i13 << 3) & 112) | 8);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }), composer2, 48);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final Function3 function34 = m819getLambda1$material_release;
                        final int i14 = i3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3 function35 = Function3.this;
                                    int i16 = (i14 & 7168) | 438;
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 constructor3 = companion3.getConstructor();
                                    Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer3);
                                    Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    function35.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
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
                    }
                }), startRestartGroup, (i92 & 896) | (i92 & 14) | 1600512 | (i92 & 112) | ((i3 << 12) & 458752), 0);
                modifier3 = modifier2;
                function23 = function22;
                function33 = m819getLambda1$material_release;
                j8 = j5;
                j9 = j7;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((57344 & i) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i3 & 2995931) == 599186) {
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
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i6 != 0) {
            }
            j7 = j6;
            startRestartGroup.endDefaults();
            int i922 = i3 >> 12;
            m713AppBarcelAv9A(j5, j7, f2, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
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
                public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i10) {
                    int i11;
                    Modifier modifier4;
                    Modifier modifier5;
                    Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                    if ((i10 & 14) == 0) {
                        i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (Function2.this == null) {
                        composer2.startReplaceableGroup(-512812651);
                        modifier5 = AppBarKt.TitleInsetWithoutIcon;
                        SpacerKt.Spacer(modifier5, composer2, 6);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-512812592);
                        modifier4 = AppBarKt.TitleIconModifier;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2 function24 = Function2.this;
                        int i12 = i3;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(modifier4);
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
                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1485618042);
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i12 >> 3) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    final Function2 function25 = title;
                    final int i13 = i3;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 constructor2 = companion2.getConstructor();
                    Function3 materializerOf2 = LayoutKt.materializerOf(weight$default);
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                    Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(159489950);
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, Function2.this, composer3, ((i13 << 3) & 112) | 8);
                            } else {
                                composer3.skipToGroupEnd();
                            }
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                    final Function3 function34 = m819getLambda1$material_release;
                    final int i14 = i3;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3 function35 = Function3.this;
                                int i16 = (i14 & 7168) | 438;
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 constructor3 = companion3.getConstructor();
                                Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer3);
                                Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy3, companion3.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                function35.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
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
                }
            }), startRestartGroup, (i922 & 896) | (i922 & 14) | 1600512 | (i922 & 112) | ((i3 << 12) & 458752), 0);
            modifier3 = modifier2;
            function23 = function22;
            function33 = m819getLambda1$material_release;
            j8 = j5;
            j9 = j7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((57344 & i) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i3 & 2995931) == 599186) {
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
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i6 != 0) {
        }
        j7 = j6;
        startRestartGroup.endDefaults();
        int i9222 = i3 >> 12;
        m713AppBarcelAv9A(j5, j7, f2, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
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
            public final void invoke(@NotNull RowScope AppBar, @Nullable Composer composer2, int i10) {
                int i11;
                Modifier modifier4;
                Modifier modifier5;
                Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                if ((i10 & 14) == 0) {
                    i11 = i10 | (composer2.changed(AppBar) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (Function2.this == null) {
                    composer2.startReplaceableGroup(-512812651);
                    modifier5 = AppBarKt.TitleInsetWithoutIcon;
                    SpacerKt.Spacer(modifier5, composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-512812592);
                    modifier4 = AppBarKt.TitleIconModifier;
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2 function24 = Function2.this;
                    int i12 = i3;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(modifier4);
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
                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1485618042);
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function24, composer2, ((i12 >> 3) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                final Function2 function25 = title;
                final int i13 = i3;
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor2 = companion2.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(weight$default);
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(159489950);
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, Function2.this, composer3, ((i13 << 3) & 112) | 8);
                        } else {
                            composer3.skipToGroupEnd();
                        }
                    }
                }), composer2, 48);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                final Function3 function34 = m819getLambda1$material_release;
                final int i14 = i3;
                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                            Function3 function35 = Function3.this;
                            int i16 = (i14 & 7168) | 438;
                            composer3.startReplaceableGroup(693286680);
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0 constructor3 = companion3.getConstructor();
                            Function3 materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer3);
                            Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-678309503);
                            function35.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
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
            }
        }), startRestartGroup, (i9222 & 896) | (i9222 & 14) | 1600512 | (i9222 & 112) | ((i3 << 12) & 458752), 0);
        modifier3 = modifier2;
        function23 = function22;
        function33 = m819getLambda1$material_release;
        j8 = j5;
        j9 = j7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 4;
        float m2507constructorimpl = Dp.m2507constructorimpl(f);
        AppBarHorizontalPadding = m2507constructorimpl;
        Modifier.Companion companion = Modifier.INSTANCE;
        TitleInsetWithoutIcon = SizeKt.m362width3ABfNKs(companion, Dp.m2507constructorimpl(Dp.m2507constructorimpl(16) - m2507constructorimpl));
        TitleIconModifier = SizeKt.m362width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m2507constructorimpl(Dp.m2507constructorimpl(72) - m2507constructorimpl));
        BottomAppBarCutoutOffset = Dp.m2507constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m2507constructorimpl(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008a  */
    /* renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m715TopAppBarHsRjFd4(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, final Function3 content, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        Modifier modifier3;
        PaddingValues contentPadding;
        long j5;
        long j6;
        float f3;
        final long j7;
        final long j8;
        final float f4;
        final PaddingValues paddingValues3;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1897058582);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                j3 = j;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                j4 = j2;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            j4 = j2;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    i5 = (i & 458752) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i9 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m712getTopAppBarElevationD9Ej5fM();
                            }
                            if (i4 == 0) {
                                modifier3 = modifier4;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                j5 = j3;
                                j6 = j4;
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                int i10 = i3 >> 3;
                                m713AppBarcelAv9A(j5, j6, f3, contentPadding, RectangleShapeKt.getRectangleShape(), modifier3, content, startRestartGroup, (i10 & 7168) | (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                                modifier2 = modifier3;
                                j7 = j5;
                                j8 = j6;
                                f4 = f3;
                                paddingValues3 = contentPadding;
                            } else {
                                modifier3 = modifier4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier3 = modifier2;
                        }
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        contentPadding = paddingValues2;
                        startRestartGroup.endDefaults();
                        int i102 = i3 >> 3;
                        m713AppBarcelAv9A(j5, j6, f3, contentPadding, RectangleShapeKt.getRectangleShape(), modifier3, content, startRestartGroup, (i102 & 7168) | (i102 & 14) | 24576 | (i102 & 112) | (i102 & 896) | ((i3 << 15) & 458752) | (3670016 & (i3 << 3)), 0);
                        modifier2 = modifier3;
                        j7 = j5;
                        j8 = j6;
                        f4 = f3;
                        paddingValues3 = contentPadding;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j7 = j3;
                        j8 = j4;
                        f4 = f2;
                        paddingValues3 = paddingValues2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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
                            AppBarKt.m715TopAppBarHsRjFd4(Modifier.this, j7, j8, f4, paddingValues3, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 == 0) {
                }
            }
            paddingValues2 = paddingValues;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 == 0) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008a  */
    /* renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m714BottomAppBarY1yfwus(Modifier modifier, long j, long j2, Shape shape, float f, PaddingValues paddingValues, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        Shape shape2;
        int i4;
        float f2;
        int i5;
        PaddingValues paddingValues2;
        long j4;
        long j5;
        long j6;
        Shape shape3;
        float f3;
        PaddingValues paddingValues3;
        Modifier modifier2;
        Shape rectangleShape;
        final Modifier modifier3;
        final float f4;
        final long j7;
        final long j8;
        final PaddingValues paddingValues4;
        final Shape shape4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1651948973);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(j)) {
                i8 = 32;
                i3 |= i8;
            }
            i8 = 16;
            i3 |= i8;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j2;
                if (startRestartGroup.changed(j3)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j3 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j3 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) == 0) {
                    i6 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 2) == 0) {
                                j4 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 4) != 0) {
                                j3 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                shape2 = null;
                            }
                            if (i4 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m711getBottomAppBarElevationD9Ej5fM();
                            }
                            if (i5 == 0) {
                                modifier2 = modifier4;
                                paddingValues3 = AppBarDefaults.INSTANCE.getContentPadding();
                                j5 = j4;
                                j6 = j3;
                                shape3 = shape2;
                                f3 = f2;
                            } else {
                                j5 = j4;
                                j6 = j3;
                                shape3 = shape2;
                                f3 = f2;
                                paddingValues3 = paddingValues2;
                                modifier2 = modifier4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            j5 = j;
                            j6 = j3;
                            shape3 = shape2;
                            f3 = f2;
                            paddingValues3 = paddingValues2;
                            modifier2 = modifier;
                        }
                        startRestartGroup.endDefaults();
                        FabPlacement fabPlacement = (FabPlacement) startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                        if (shape3 == null && fabPlacement != null && fabPlacement.getIsDocked()) {
                            rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        int i11 = i3 >> 6;
                        m713AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, ((i3 >> 3) & 126) | (i11 & 896) | (i11 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                        modifier3 = modifier2;
                        f4 = f3;
                        j7 = j5;
                        j8 = j6;
                        paddingValues4 = paddingValues3;
                        shape4 = shape3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j7 = j;
                        j8 = j3;
                        shape4 = shape2;
                        f4 = f2;
                        paddingValues4 = paddingValues2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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
                            AppBarKt.m714BottomAppBarY1yfwus(Modifier.this, j7, j8, shape4, f4, paddingValues4, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i6;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                startRestartGroup.endDefaults();
                FabPlacement fabPlacement2 = (FabPlacement) startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 == null) {
                }
                rectangleShape = RectangleShapeKt.getRectangleShape();
                int i112 = i3 >> 6;
                m713AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, ((i3 >> 3) & 126) | (i112 & 896) | (i112 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
                modifier3 = modifier2;
                f4 = f3;
                j7 = j5;
                j8 = j6;
                paddingValues4 = paddingValues3;
                shape4 = shape3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i6;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            startRestartGroup.endDefaults();
            FabPlacement fabPlacement22 = (FabPlacement) startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            if (shape3 == null) {
            }
            rectangleShape = RectangleShapeKt.getRectangleShape();
            int i1122 = i3 >> 6;
            m713AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, ((i3 >> 3) & 126) | (i1122 & 896) | (i1122 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
            modifier3 = modifier2;
            f4 = f3;
            j7 = j5;
            j8 = j6;
            paddingValues4 = paddingValues3;
            shape4 = shape3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i6;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        startRestartGroup.endDefaults();
        FabPlacement fabPlacement222 = (FabPlacement) startRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
        if (shape3 == null) {
        }
        rectangleShape = RectangleShapeKt.getRectangleShape();
        int i11222 = i3 >> 6;
        m713AppBarcelAv9A(j5, j6, f3, paddingValues3, rectangleShape, modifier2, content, startRestartGroup, ((i3 >> 3) & 126) | (i11222 & 896) | (i11222 & 7168) | ((i3 << 15) & 458752) | (i3 & 3670016), 0);
        modifier3 = modifier2;
        f4 = f3;
        j7 = j5;
        j8 = j6;
        paddingValues4 = paddingValues3;
        shape4 = shape3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final Pair calculateRoundedEdgeIntercept(float f, float f2, float f3) {
        Float valueOf;
        Float valueOf2;
        Pair pair;
        Float valueOf3;
        Float valueOf4;
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float f6 = (f * f) + f4;
        float f7 = f4 * f5 * (f6 - f5);
        float f8 = f * f5;
        double d = f7;
        float sqrt = (f8 - ((float) Math.sqrt(d))) / f6;
        float sqrt2 = (f8 + ((float) Math.sqrt(d))) / f6;
        float sqrt3 = (float) Math.sqrt(f5 - (sqrt * sqrt));
        float sqrt4 = (float) Math.sqrt(f5 - (sqrt2 * sqrt2));
        if (f2 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf, valueOf2);
        }
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        if (floatValue < f) {
            floatValue2 = -floatValue2;
        }
        return TuplesKt.to(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0051  */
    /* renamed from: AppBar-celAv9A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m713AppBarcelAv9A(final long j, final long j2, final float f, final PaddingValues paddingValues, final Shape shape, Modifier modifier, final Function3 function3, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1249680788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(f) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(shape) ? 16384 : 8192;
                    i4 = i2 & 32;
                    if (i4 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        modifier2 = modifier;
                        i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            i3 |= startRestartGroup.changed(function3) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                            int i5 = i3 << 6;
                            SurfaceKt.m988SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                                public final void invoke(@Nullable Composer composer2, int i6) {
                                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                                        final PaddingValues paddingValues2 = PaddingValues.this;
                                        final Function3 function32 = function3;
                                        final int i7 = i3;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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
                                            public final void invoke(@Nullable Composer composer3, int i8) {
                                                float f2;
                                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                                    Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingValues.this);
                                                    f2 = AppBarKt.AppBarHeight;
                                                    Modifier m347height3ABfNKs = SizeKt.m347height3ABfNKs(padding, f2);
                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3 function33 = function32;
                                                    int i9 = ((i7 >> 9) & 7168) | 432;
                                                    composer3.startReplaceableGroup(693286680);
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                    Function0 constructor = companion.getConstructor();
                                                    Function3 materializerOf = LayoutKt.materializerOf(m347height3ABfNKs);
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
                                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                                    composer3.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    composer3.startReplaceableGroup(-678309503);
                                                    function33.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i9 >> 6) & 112) | 6));
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
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i5 & 896) | (i5 & 7168) | ((i3 << 9) & 458752), 16);
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i6) {
                                AppBarKt.m713AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier4, function3, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                    }
                    if ((2995931 & i3) == 599186) {
                    }
                    if (i4 != 0) {
                    }
                    int i52 = i3 << 6;
                    SurfaceKt.m988SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                        public final void invoke(@Nullable Composer composer2, int i6) {
                            if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                                final PaddingValues paddingValues2 = PaddingValues.this;
                                final Function3 function32 = function3;
                                final int i7 = i3;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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
                                    public final void invoke(@Nullable Composer composer3, int i8) {
                                        float f2;
                                        if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                            Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingValues.this);
                                            f2 = AppBarKt.AppBarHeight;
                                            Modifier m347height3ABfNKs = SizeKt.m347height3ABfNKs(padding, f2);
                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3 function33 = function32;
                                            int i9 = ((i7 >> 9) & 7168) | 432;
                                            composer3.startReplaceableGroup(693286680);
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                            composer3.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(m347height3ABfNKs);
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
                                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-678309503);
                                            function33.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i9 >> 6) & 112) | 6));
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
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i52 & 896) | (i52 & 7168) | ((i3 << 9) & 458752), 16);
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                }
                if ((2995931 & i3) == 599186) {
                }
                if (i4 != 0) {
                }
                int i522 = i3 << 6;
                SurfaceKt.m988SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                    public final void invoke(@Nullable Composer composer2, int i6) {
                        if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                            final PaddingValues paddingValues2 = PaddingValues.this;
                            final Function3 function32 = function3;
                            final int i7 = i3;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i8) {
                                    float f2;
                                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                        Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingValues.this);
                                        f2 = AppBarKt.AppBarHeight;
                                        Modifier m347height3ABfNKs = SizeKt.m347height3ABfNKs(padding, f2);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function3 function33 = function32;
                                        int i9 = ((i7 >> 9) & 7168) | 432;
                                        composer3.startReplaceableGroup(693286680);
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                        composer3.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(m347height3ABfNKs);
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
                                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-678309503);
                                        function33.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i9 >> 6) & 112) | 6));
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
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i522 & 896) | (i522 & 7168) | ((i3 << 9) & 458752), 16);
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
            }
            if ((2995931 & i3) == 599186) {
            }
            if (i4 != 0) {
            }
            int i5222 = i3 << 6;
            SurfaceKt.m988SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
                public final void invoke(@Nullable Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                        final PaddingValues paddingValues2 = PaddingValues.this;
                        final Function3 function32 = function3;
                        final int i7 = i3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i8) {
                                float f2;
                                if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingValues.this);
                                    f2 = AppBarKt.AppBarHeight;
                                    Modifier m347height3ABfNKs = SizeKt.m347height3ABfNKs(padding, f2);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3 function33 = function32;
                                    int i9 = ((i7 >> 9) & 7168) | 432;
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(m347height3ABfNKs);
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
                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    function33.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i9 >> 6) & 112) | 6));
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
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i5222 & 896) | (i5222 & 7168) | ((i3 << 9) & 458752), 16);
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        if (i4 != 0) {
        }
        int i52222 = i3 << 6;
        SurfaceKt.m988SurfaceFjzlyU(modifier3, shape, j, j2, null, f, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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
            public final void invoke(@Nullable Composer composer2, int i6) {
                if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))};
                    final PaddingValues paddingValues2 = PaddingValues.this;
                    final Function3 function32 = function3;
                    final int i7 = i3;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new Function2() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i8) {
                            float f2;
                            if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingValues.this);
                                f2 = AppBarKt.AppBarHeight;
                                Modifier m347height3ABfNKs = SizeKt.m347height3ABfNKs(padding, f2);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3 function33 = function32;
                                int i9 = ((i7 >> 9) & 7168) | 432;
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(m347height3ABfNKs);
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
                                Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                function33.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i9 >> 6) & 112) | 6));
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
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i52222 & 896) | (i52222 & 7168) | ((i3 << 9) & 458752), 16);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
