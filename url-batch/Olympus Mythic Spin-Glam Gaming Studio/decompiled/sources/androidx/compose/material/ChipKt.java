package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import io.bidmachine.protobuf.EventTypeExtended;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008b\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aÁ\u0001\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00172\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0017\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0017\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0017\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b!\u0010\u001e\"\u0017\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/material/ChipColors;", "colors", "Landroidx/compose/runtime/Composable;", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "content", "Chip", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "FilterChip", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "HorizontalPadding", "F", "LeadingIconStartSpacing", "LeadingIconEndSpacing", "TrailingIconSpacing", "SelectedIconContainerSize", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m2507constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m2507constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m2507constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:107:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(final Function0 onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2 function2, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Shape shape2;
        int i6;
        BorderStroke borderStroke2;
        ChipColors chipColors2;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        ChipColors chipColors3;
        Function2 function22;
        Modifier modifier2;
        boolean z2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape4;
        BorderStroke borderStroke3;
        ChipColors chipColors4;
        Composer composer2;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape5;
        final BorderStroke borderStroke4;
        final Function2 function23;
        final boolean z3;
        final ChipColors chipColors5;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-368396408);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
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
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((458752 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            chipColors2 = chipColors;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(chipColors2)) ? 1048576 : 524288;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= startRestartGroup.changed(function2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) == 0) {
                            i8 = (i & 234881024) == 0 ? startRestartGroup.changed(content) ? 67108864 : 33554432 : 100663296;
                            if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier;
                                    boolean z4 = i4 == 0 ? true : z;
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
                                    if ((i2 & 16) == 0) {
                                        shape3 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                        i3 &= -57345;
                                    } else {
                                        shape3 = shape2;
                                    }
                                    if (i6 != 0) {
                                        borderStroke2 = null;
                                    }
                                    if ((i2 & 64) == 0) {
                                        chipColors3 = ChipDefaults.INSTANCE.m781chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                        i3 &= -3670017;
                                    } else {
                                        chipColors3 = chipColors2;
                                    }
                                    if (i7 == 0) {
                                        modifier2 = modifier4;
                                        z2 = z4;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape4 = shape3;
                                        function22 = null;
                                    } else {
                                        function22 = function2;
                                        modifier2 = modifier4;
                                        z2 = z4;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        shape4 = shape3;
                                    }
                                    borderStroke3 = borderStroke2;
                                    chipColors4 = chipColors3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    modifier2 = modifier;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    function22 = function2;
                                    shape4 = shape2;
                                    borderStroke3 = borderStroke2;
                                    chipColors4 = chipColors2;
                                    z2 = z;
                                }
                                startRestartGroup.endDefaults();
                                int i11 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                                final State contentColor = chipColors4.contentColor(z2, startRestartGroup, i11);
                                final Function2 function24 = function22;
                                final ChipColors chipColors6 = chipColors4;
                                final boolean z5 = z2;
                                final int i12 = i3;
                                composer2 = startRestartGroup;
                                SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape4, ((Color) chipColors4.backgroundColor(z2, startRestartGroup, i11).getValue()).getValue(), Color.m1445copywmQWz5c$default(m784Chip$lambda1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2
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
                                        long m784Chip$lambda1;
                                        if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                            ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                            m784Chip$lambda1 = ChipKt.m784Chip$lambda1(contentColor);
                                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m784Chip$lambda1)))};
                                            final Function2 function25 = function24;
                                            final ChipColors chipColors7 = chipColors6;
                                            final boolean z6 = z5;
                                            final int i14 = i12;
                                            final Function3 function3 = content;
                                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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
                                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                        final Function2 function26 = Function2.this;
                                                        final ChipColors chipColors8 = chipColors7;
                                                        final boolean z7 = z6;
                                                        final int i16 = i14;
                                                        final Function3 function32 = function3;
                                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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
                                                            public final void invoke(@Nullable Composer composer5, int i17) {
                                                                float m2507constructorimpl;
                                                                float f;
                                                                float f2;
                                                                float f3;
                                                                if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                                    Modifier m346defaultMinSizeVpY3zN4$default = SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null);
                                                                    if (Function2.this == null) {
                                                                        m2507constructorimpl = ChipKt.HorizontalPadding;
                                                                    } else {
                                                                        m2507constructorimpl = Dp.m2507constructorimpl(0);
                                                                    }
                                                                    float f4 = m2507constructorimpl;
                                                                    f = ChipKt.HorizontalPadding;
                                                                    Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(m346defaultMinSizeVpY3zN4$default, f4, 0.0f, f, 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2 function27 = Function2.this;
                                                                    ChipColors chipColors9 = chipColors8;
                                                                    boolean z8 = z7;
                                                                    int i18 = i16;
                                                                    Function3 function33 = function32;
                                                                    composer5.startReplaceableGroup(693286680);
                                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                                    composer5.startReplaceableGroup(-1323940314);
                                                                    Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                    Function0 constructor = companion2.getConstructor();
                                                                    Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                                    composer5.enableReusing();
                                                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                                    composer5.startReplaceableGroup(2058660585);
                                                                    composer5.startReplaceableGroup(-678309503);
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    composer5.startReplaceableGroup(951468004);
                                                                    composer5.startReplaceableGroup(2084788874);
                                                                    if (function27 != null) {
                                                                        f2 = ChipKt.LeadingIconStartSpacing;
                                                                        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                                        State leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(m786invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m786invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                                        f3 = ChipKt.LeadingIconEndSpacing;
                                                                        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer5, 6);
                                                                    }
                                                                    composer5.endReplaceableGroup();
                                                                    function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
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

                                                            /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                                            private static final long m786invoke$lambda1$lambda0(State state) {
                                                                return ((Color) state.getValue()).getValue();
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
                                }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                                modifier3 = modifier2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                shape5 = shape4;
                                borderStroke4 = borderStroke3;
                                function23 = function22;
                                z3 = z2;
                                chipColors5 = chipColors4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z3 = z;
                                mutableInteractionSource4 = mutableInteractionSource;
                                function23 = function2;
                                shape5 = shape2;
                                borderStroke4 = borderStroke2;
                                chipColors5 = chipColors2;
                                composer2 = startRestartGroup;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ChipKt$Chip$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i13) {
                                    ChipKt.Chip(Function0.this, modifier3, z3, mutableInteractionSource4, shape5, borderStroke4, chipColors5, function23, content, composer3, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i8;
                        if ((191739611 & i3) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        borderStroke3 = borderStroke2;
                        chipColors4 = chipColors3;
                        startRestartGroup.endDefaults();
                        int i112 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                        final State<Color> contentColor2 = chipColors4.contentColor(z2, startRestartGroup, i112);
                        final Function2 function242 = function22;
                        final ChipColors chipColors62 = chipColors4;
                        final boolean z52 = z2;
                        final int i122 = i3;
                        composer2 = startRestartGroup;
                        SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape4, ((Color) chipColors4.backgroundColor(z2, startRestartGroup, i112).getValue()).getValue(), Color.m1445copywmQWz5c$default(m784Chip$lambda1(contentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2
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
                                long m784Chip$lambda1;
                                if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                    ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    m784Chip$lambda1 = ChipKt.m784Chip$lambda1(contentColor2);
                                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m784Chip$lambda1)))};
                                    final Function2 function25 = function242;
                                    final ChipColors chipColors7 = chipColors62;
                                    final boolean z6 = z52;
                                    final int i14 = i122;
                                    final Function3 function3 = content;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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
                                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                final Function2 function26 = Function2.this;
                                                final ChipColors chipColors8 = chipColors7;
                                                final boolean z7 = z6;
                                                final int i16 = i14;
                                                final Function3 function32 = function3;
                                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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
                                                    public final void invoke(@Nullable Composer composer5, int i17) {
                                                        float m2507constructorimpl;
                                                        float f;
                                                        float f2;
                                                        float f3;
                                                        if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            Modifier m346defaultMinSizeVpY3zN4$default = SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null);
                                                            if (Function2.this == null) {
                                                                m2507constructorimpl = ChipKt.HorizontalPadding;
                                                            } else {
                                                                m2507constructorimpl = Dp.m2507constructorimpl(0);
                                                            }
                                                            float f4 = m2507constructorimpl;
                                                            f = ChipKt.HorizontalPadding;
                                                            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(m346defaultMinSizeVpY3zN4$default, f4, 0.0f, f, 0.0f, 10, null);
                                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                            Function2 function27 = Function2.this;
                                                            ChipColors chipColors9 = chipColors8;
                                                            boolean z8 = z7;
                                                            int i18 = i16;
                                                            Function3 function33 = function32;
                                                            composer5.startReplaceableGroup(693286680);
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                            Function0 constructor = companion2.getConstructor();
                                                            Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-678309503);
                                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(951468004);
                                                            composer5.startReplaceableGroup(2084788874);
                                                            if (function27 != null) {
                                                                f2 = ChipKt.LeadingIconStartSpacing;
                                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                                State leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(m786invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m786invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                                f3 = ChipKt.LeadingIconEndSpacing;
                                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer5, 6);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
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

                                                    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                                    private static final long m786invoke$lambda1$lambda0(State state) {
                                                        return ((Color) state.getValue()).getValue();
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
                        }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                        modifier3 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape5 = shape4;
                        borderStroke4 = borderStroke3;
                        function23 = function22;
                        z3 = z2;
                        chipColors5 = chipColors4;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((i & 3670016) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    i3 |= i8;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    borderStroke3 = borderStroke2;
                    chipColors4 = chipColors3;
                    startRestartGroup.endDefaults();
                    int i1122 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                    final State<Color> contentColor22 = chipColors4.contentColor(z2, startRestartGroup, i1122);
                    final Function2 function2422 = function22;
                    final ChipColors chipColors622 = chipColors4;
                    final boolean z522 = z2;
                    final int i1222 = i3;
                    composer2 = startRestartGroup;
                    SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape4, ((Color) chipColors4.backgroundColor(z2, startRestartGroup, i1122).getValue()).getValue(), Color.m1445copywmQWz5c$default(m784Chip$lambda1(contentColor22), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2
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
                            long m784Chip$lambda1;
                            if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                m784Chip$lambda1 = ChipKt.m784Chip$lambda1(contentColor22);
                                ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m784Chip$lambda1)))};
                                final Function2 function25 = function2422;
                                final ChipColors chipColors7 = chipColors622;
                                final boolean z6 = z522;
                                final int i14 = i1222;
                                final Function3 function3 = content;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                            final Function2 function26 = Function2.this;
                                            final ChipColors chipColors8 = chipColors7;
                                            final boolean z7 = z6;
                                            final int i16 = i14;
                                            final Function3 function32 = function3;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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
                                                public final void invoke(@Nullable Composer composer5, int i17) {
                                                    float m2507constructorimpl;
                                                    float f;
                                                    float f2;
                                                    float f3;
                                                    if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        Modifier m346defaultMinSizeVpY3zN4$default = SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null);
                                                        if (Function2.this == null) {
                                                            m2507constructorimpl = ChipKt.HorizontalPadding;
                                                        } else {
                                                            m2507constructorimpl = Dp.m2507constructorimpl(0);
                                                        }
                                                        float f4 = m2507constructorimpl;
                                                        f = ChipKt.HorizontalPadding;
                                                        Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(m346defaultMinSizeVpY3zN4$default, f4, 0.0f, f, 0.0f, 10, null);
                                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function2 function27 = Function2.this;
                                                        ChipColors chipColors9 = chipColors8;
                                                        boolean z8 = z7;
                                                        int i18 = i16;
                                                        Function3 function33 = function32;
                                                        composer5.startReplaceableGroup(693286680);
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                        Function0 constructor = companion2.getConstructor();
                                                        Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                        Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-678309503);
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        composer5.startReplaceableGroup(951468004);
                                                        composer5.startReplaceableGroup(2084788874);
                                                        if (function27 != null) {
                                                            f2 = ChipKt.LeadingIconStartSpacing;
                                                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                            State leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(m786invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m786invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                            f3 = ChipKt.LeadingIconEndSpacing;
                                                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer5, 6);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
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

                                                /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                                private static final long m786invoke$lambda1$lambda0(State state) {
                                                    return ((Color) state.getValue()).getValue();
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
                    }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                    modifier3 = modifier2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape5 = shape4;
                    borderStroke4 = borderStroke3;
                    function23 = function22;
                    z3 = z2;
                    chipColors5 = chipColors4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((57344 & i) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((i & 3670016) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i3 |= i8;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i7 == 0) {
                }
                borderStroke3 = borderStroke2;
                chipColors4 = chipColors3;
                startRestartGroup.endDefaults();
                int i11222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                final State<Color> contentColor222 = chipColors4.contentColor(z2, startRestartGroup, i11222);
                final Function2 function24222 = function22;
                final ChipColors chipColors6222 = chipColors4;
                final boolean z5222 = z2;
                final int i12222 = i3;
                composer2 = startRestartGroup;
                SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape4, ((Color) chipColors4.backgroundColor(z2, startRestartGroup, i11222).getValue()).getValue(), Color.m1445copywmQWz5c$default(m784Chip$lambda1(contentColor222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2
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
                        long m784Chip$lambda1;
                        if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                            m784Chip$lambda1 = ChipKt.m784Chip$lambda1(contentColor222);
                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m784Chip$lambda1)))};
                            final Function2 function25 = function24222;
                            final ChipColors chipColors7 = chipColors6222;
                            final boolean z6 = z5222;
                            final int i14 = i12222;
                            final Function3 function3 = content;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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
                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                        final Function2 function26 = Function2.this;
                                        final ChipColors chipColors8 = chipColors7;
                                        final boolean z7 = z6;
                                        final int i16 = i14;
                                        final Function3 function32 = function3;
                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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
                                            public final void invoke(@Nullable Composer composer5, int i17) {
                                                float m2507constructorimpl;
                                                float f;
                                                float f2;
                                                float f3;
                                                if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    Modifier m346defaultMinSizeVpY3zN4$default = SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null);
                                                    if (Function2.this == null) {
                                                        m2507constructorimpl = ChipKt.HorizontalPadding;
                                                    } else {
                                                        m2507constructorimpl = Dp.m2507constructorimpl(0);
                                                    }
                                                    float f4 = m2507constructorimpl;
                                                    f = ChipKt.HorizontalPadding;
                                                    Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(m346defaultMinSizeVpY3zN4$default, f4, 0.0f, f, 0.0f, 10, null);
                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function2 function27 = Function2.this;
                                                    ChipColors chipColors9 = chipColors8;
                                                    boolean z8 = z7;
                                                    int i18 = i16;
                                                    Function3 function33 = function32;
                                                    composer5.startReplaceableGroup(693286680);
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0 constructor = companion2.getConstructor();
                                                    Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-678309503);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(951468004);
                                                    composer5.startReplaceableGroup(2084788874);
                                                    if (function27 != null) {
                                                        f2 = ChipKt.LeadingIconStartSpacing;
                                                        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                        State leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(m786invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m786invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                        f3 = ChipKt.LeadingIconEndSpacing;
                                                        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer5, 6);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
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

                                            /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                            private static final long m786invoke$lambda1$lambda0(State state) {
                                                return ((Color) state.getValue()).getValue();
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
                }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                modifier3 = modifier2;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape5 = shape4;
                borderStroke4 = borderStroke3;
                function23 = function22;
                z3 = z2;
                chipColors5 = chipColors4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((57344 & i) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((i & 3670016) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i7 == 0) {
            }
            borderStroke3 = borderStroke2;
            chipColors4 = chipColors3;
            startRestartGroup.endDefaults();
            int i112222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
            final State<Color> contentColor2222 = chipColors4.contentColor(z2, startRestartGroup, i112222);
            final Function2 function242222 = function22;
            final ChipColors chipColors62222 = chipColors4;
            final boolean z52222 = z2;
            final int i122222 = i3;
            composer2 = startRestartGroup;
            SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape4, ((Color) chipColors4.backgroundColor(z2, startRestartGroup, i112222).getValue()).getValue(), Color.m1445copywmQWz5c$default(m784Chip$lambda1(contentColor2222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2
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
                    long m784Chip$lambda1;
                    if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                        m784Chip$lambda1 = ChipKt.m784Chip$lambda1(contentColor2222);
                        ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m784Chip$lambda1)))};
                        final Function2 function25 = function242222;
                        final ChipColors chipColors7 = chipColors62222;
                        final boolean z6 = z52222;
                        final int i14 = i122222;
                        final Function3 function3 = content;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                    final Function2 function26 = Function2.this;
                                    final ChipColors chipColors8 = chipColors7;
                                    final boolean z7 = z6;
                                    final int i16 = i14;
                                    final Function3 function32 = function3;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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
                                        public final void invoke(@Nullable Composer composer5, int i17) {
                                            float m2507constructorimpl;
                                            float f;
                                            float f2;
                                            float f3;
                                            if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Modifier m346defaultMinSizeVpY3zN4$default = SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null);
                                                if (Function2.this == null) {
                                                    m2507constructorimpl = ChipKt.HorizontalPadding;
                                                } else {
                                                    m2507constructorimpl = Dp.m2507constructorimpl(0);
                                                }
                                                float f4 = m2507constructorimpl;
                                                f = ChipKt.HorizontalPadding;
                                                Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(m346defaultMinSizeVpY3zN4$default, f4, 0.0f, f, 0.0f, 10, null);
                                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function2 function27 = Function2.this;
                                                ChipColors chipColors9 = chipColors8;
                                                boolean z8 = z7;
                                                int i18 = i16;
                                                Function3 function33 = function32;
                                                composer5.startReplaceableGroup(693286680);
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                composer5.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion2.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                                Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-678309503);
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(951468004);
                                                composer5.startReplaceableGroup(2084788874);
                                                if (function27 != null) {
                                                    f2 = ChipKt.LeadingIconStartSpacing;
                                                    SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                    State leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(m786invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m786invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                    f3 = ChipKt.LeadingIconEndSpacing;
                                                    SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer5, 6);
                                                }
                                                composer5.endReplaceableGroup();
                                                function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
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

                                        /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                        private static final long m786invoke$lambda1$lambda0(State state) {
                                            return ((Color) state.getValue()).getValue();
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
            }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
            modifier3 = modifier2;
            mutableInteractionSource4 = mutableInteractionSource3;
            shape5 = shape4;
            borderStroke4 = borderStroke3;
            function23 = function22;
            z3 = z2;
            chipColors5 = chipColors4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((57344 & i) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((i & 3670016) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i7 == 0) {
        }
        borderStroke3 = borderStroke2;
        chipColors4 = chipColors3;
        startRestartGroup.endDefaults();
        int i1122222 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
        final State<Color> contentColor22222 = chipColors4.contentColor(z2, startRestartGroup, i1122222);
        final Function2 function2422222 = function22;
        final ChipColors chipColors622222 = chipColors4;
        final boolean z522222 = z2;
        final int i1222222 = i3;
        composer2 = startRestartGroup;
        SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape4, ((Color) chipColors4.backgroundColor(z2, startRestartGroup, i1122222).getValue()).getValue(), Color.m1445copywmQWz5c$default(m784Chip$lambda1(contentColor22222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2
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
                long m784Chip$lambda1;
                if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                    m784Chip$lambda1 = ChipKt.m784Chip$lambda1(contentColor22222);
                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m784Chip$lambda1)))};
                    final Function2 function25 = function2422222;
                    final ChipColors chipColors7 = chipColors622222;
                    final boolean z6 = z522222;
                    final int i14 = i1222222;
                    final Function3 function3 = content;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 667535631, true, new Function2() { // from class: androidx.compose.material.ChipKt$Chip$2.1
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
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                final Function2 function26 = Function2.this;
                                final ChipColors chipColors8 = chipColors7;
                                final boolean z7 = z6;
                                final int i16 = i14;
                                final Function3 function32 = function3;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1131213696, true, new Function2() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
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
                                    public final void invoke(@Nullable Composer composer5, int i17) {
                                        float m2507constructorimpl;
                                        float f;
                                        float f2;
                                        float f3;
                                        if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier m346defaultMinSizeVpY3zN4$default = SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null);
                                            if (Function2.this == null) {
                                                m2507constructorimpl = ChipKt.HorizontalPadding;
                                            } else {
                                                m2507constructorimpl = Dp.m2507constructorimpl(0);
                                            }
                                            float f4 = m2507constructorimpl;
                                            f = ChipKt.HorizontalPadding;
                                            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(m346defaultMinSizeVpY3zN4$default, f4, 0.0f, f, 0.0f, 10, null);
                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function2 function27 = Function2.this;
                                            ChipColors chipColors9 = chipColors8;
                                            boolean z8 = z7;
                                            int i18 = i16;
                                            Function3 function33 = function32;
                                            composer5.startReplaceableGroup(693286680);
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                            composer5.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion2.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-678309503);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(951468004);
                                            composer5.startReplaceableGroup(2084788874);
                                            if (function27 != null) {
                                                f2 = ChipKt.LeadingIconStartSpacing;
                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                State leadingIconContentColor = chipColors9.leadingIconContentColor(z8, composer5, ((i18 >> 6) & 14) | ((i18 >> 15) & 112));
                                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(m786invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m786invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer5, ((i18 >> 18) & 112) | 8);
                                                f3 = ChipKt.LeadingIconEndSpacing;
                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f3), composer5, 6);
                                            }
                                            composer5.endReplaceableGroup();
                                            function33.invoke(rowScopeInstance, composer5, Integer.valueOf(((i18 >> 21) & 112) | 6));
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

                                    /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                    private static final long m786invoke$lambda1$lambda0(State state) {
                                        return ((Color) state.getValue()).getValue();
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
        }), composer2, (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
        modifier3 = modifier2;
        mutableInteractionSource4 = mutableInteractionSource3;
        shape5 = shape4;
        borderStroke4 = borderStroke3;
        function23 = function22;
        z3 = z2;
        chipColors5 = chipColors4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = Dp.m2507constructorimpl(f);
        TrailingIconSpacing = Dp.m2507constructorimpl(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0 onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2 function2, Function2 function22, Function2 function23, final Function3 content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        Function2 function24;
        int i14;
        Function2 function25;
        Function2 function26;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        boolean z4;
        BorderStroke borderStroke2;
        Modifier modifier2;
        final SelectableChipColors selectableChipColors3;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape4;
        final BorderStroke borderStroke3;
        final Function2 function27;
        final Function2 function28;
        final Function2 function29;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1259208246);
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
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                }
                if ((i & 458752) == 0) {
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0 && startRestartGroup.changed(selectableChipColors)) {
                        i15 = 8388608;
                        i4 |= i15;
                    }
                    i15 = 4194304;
                    i4 |= i15;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changed(function2) ? 67108864 : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(function22) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (startRestartGroup.changed(function23) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i13 = i11 | 48;
                } else {
                    if ((i2 & 112) != 0) {
                        i12 = i11;
                        if ((1533916891 & i4) == 306783378 || (i12 & 91) != 18 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i16 == 0 ? Modifier.INSTANCE : modifier;
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                if (i6 == 0) {
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
                                if ((i3 & 32) == 0) {
                                    shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i4 &= -458753;
                                } else {
                                    shape2 = shape;
                                }
                                BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                if ((i3 & 128) == 0) {
                                    selectableChipColors2 = ChipDefaults.INSTANCE.m782filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, C.ENCODING_PCM_32BIT, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE);
                                    i4 &= -29360129;
                                } else {
                                    selectableChipColors2 = selectableChipColors;
                                }
                                Function2 function210 = i8 == 0 ? null : function2;
                                Function2 function211 = i9 == 0 ? null : function22;
                                if (i10 == 0) {
                                    i14 = i4;
                                    function25 = function210;
                                    function26 = function211;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape3 = shape2;
                                    z4 = z3;
                                    borderStroke2 = borderStroke4;
                                    function24 = null;
                                } else {
                                    function24 = function23;
                                    i14 = i4;
                                    function25 = function210;
                                    function26 = function211;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape3 = shape2;
                                    z4 = z3;
                                    borderStroke2 = borderStroke4;
                                }
                                modifier2 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                shape3 = shape;
                                borderStroke2 = borderStroke;
                                selectableChipColors2 = selectableChipColors;
                                function25 = function2;
                                function26 = function22;
                                function24 = function23;
                                i14 = i4;
                                z4 = z3;
                                modifier2 = modifier;
                            }
                            startRestartGroup.endDefaults();
                            int i17 = i14 << 3;
                            int i18 = ((i14 >> 9) & 14) | (i17 & 112) | ((i14 >> 15) & 896);
                            final State contentColor = selectableChipColors2.contentColor(z4, z, startRestartGroup, i18);
                            final Function2 function212 = function25;
                            final Function2 function213 = function26;
                            final Function2 function214 = function24;
                            final boolean z6 = z4;
                            final int i19 = i12;
                            Modifier modifier5 = modifier2;
                            selectableChipColors3 = selectableChipColors2;
                            final int i20 = i14;
                            composer2 = startRestartGroup;
                            SurfaceKt.m990SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((SemanticsPropertyReceiver) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.m2176setRolekuIjeqM(semantics, Role.INSTANCE.m2165getCheckboxo7Vup1c());
                                }
                            }, 1, null), false, shape3, ((Color) selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i18).getValue()).getValue(), Color.m1445copywmQWz5c$default(((Color) contentColor.getValue()).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) contentColor.getValue()).getValue())))};
                                        final Function2 function215 = function212;
                                        final boolean z7 = z;
                                        final Function2 function216 = function213;
                                        final Function2 function217 = function214;
                                        final Function3 function3 = content;
                                        final int i22 = i19;
                                        final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                        final boolean z8 = z6;
                                        final int i23 = i20;
                                        final State<Color> state = contentColor;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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
                                            public final void invoke(@Nullable Composer composer4, int i24) {
                                                if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                    final Function2 function218 = Function2.this;
                                                    final boolean z9 = z7;
                                                    final Function2 function219 = function216;
                                                    final Function2 function220 = function217;
                                                    final Function3 function32 = function3;
                                                    final int i25 = i22;
                                                    final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                    final boolean z10 = z8;
                                                    final int i26 = i23;
                                                    final State<Color> state2 = state;
                                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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
                                                        public final void invoke(@Nullable Composer composer5, int i27) {
                                                            float f;
                                                            RowScopeInstance rowScopeInstance;
                                                            float f2;
                                                            int i28;
                                                            Modifier modifier6;
                                                            float f3;
                                                            float f4;
                                                            float f5;
                                                            if ((i27 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null), (Function2.this != null || (z9 && function219 != null)) ? Dp.m2507constructorimpl(0) : ChipKt.HorizontalPadding, 0.0f, function220 == null ? ChipKt.HorizontalPadding : Dp.m2507constructorimpl(0), 0.0f, 10, null);
                                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                            Function2 function221 = Function2.this;
                                                            boolean z11 = z9;
                                                            Function2 function222 = function219;
                                                            Function3 function33 = function32;
                                                            int i29 = i25;
                                                            Function2 function223 = function220;
                                                            SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                            boolean z12 = z10;
                                                            int i30 = i26;
                                                            State<Color> state3 = state2;
                                                            composer5.startReplaceableGroup(693286680);
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                            composer5.startReplaceableGroup(-1323940314);
                                                            Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                            Function0 constructor = companion3.getConstructor();
                                                            Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                            Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                                                            composer5.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                            composer5.startReplaceableGroup(2058660585);
                                                            composer5.startReplaceableGroup(-678309503);
                                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                            composer5.startReplaceableGroup(1218705642);
                                                            composer5.startReplaceableGroup(-1943412137);
                                                            if (function221 != null || (z11 && function222 != null)) {
                                                                f = ChipKt.LeadingIconStartSpacing;
                                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f), composer5, 6);
                                                                composer5.startReplaceableGroup(733328855);
                                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer5, 0);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                Density density2 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                                LayoutDirection layoutDirection2 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                Function0 constructor2 = companion3.getConstructor();
                                                                Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                                                                if (composer5.getApplier() == null) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor2);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                composer5.disableReusing();
                                                                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer5);
                                                                rowScopeInstance = rowScopeInstance2;
                                                                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                                Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                                                                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                                                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(-2137368960);
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                composer5.startReplaceableGroup(-626917591);
                                                                composer5.startReplaceableGroup(649985595);
                                                                if (function221 != null) {
                                                                    State leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) leadingIconColor.getValue()).getValue())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                composer5.startReplaceableGroup(-1943411323);
                                                                if (z11 && function222 != null) {
                                                                    long value = ((Color) state3.getValue()).getValue();
                                                                    composer5.startReplaceableGroup(649986426);
                                                                    if (function221 != null) {
                                                                        f3 = ChipKt.SelectedIconContainerSize;
                                                                        modifier6 = ClipKt.clip(BackgroundKt.m157backgroundbw27NRU(SizeKt.m352requiredSize3ABfNKs(companion, f3), ((Color) state3.getValue()).getValue(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                        value = ((Color) selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue()).getValue();
                                                                    } else {
                                                                        modifier6 = companion;
                                                                    }
                                                                    composer5.endReplaceableGroup();
                                                                    Alignment center = companion2.getCenter();
                                                                    composer5.startReplaceableGroup(733328855);
                                                                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                                    composer5.startReplaceableGroup(-1323940314);
                                                                    Density density3 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                    Function0 constructor3 = companion3.getConstructor();
                                                                    Function3 materializerOf3 = LayoutKt.materializerOf(modifier6);
                                                                    if (composer5.getApplier() == null) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor3);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    composer5.disableReusing();
                                                                    Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer5);
                                                                    Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                                    Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                                                    Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                                                    Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                                                    composer5.enableReusing();
                                                                    materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                                    composer5.startReplaceableGroup(2058660585);
                                                                    composer5.startReplaceableGroup(-2137368960);
                                                                    composer5.startReplaceableGroup(-370889391);
                                                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(value))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endNode();
                                                                    composer5.endReplaceableGroup();
                                                                    composer5.endReplaceableGroup();
                                                                }
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                f2 = ChipKt.LeadingIconEndSpacing;
                                                                i28 = 6;
                                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                            } else {
                                                                rowScopeInstance = rowScopeInstance2;
                                                                i28 = 6;
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                                            if (function223 != null) {
                                                                f4 = ChipKt.TrailingIconSpacing;
                                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f4), composer5, i28);
                                                                function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                                                f5 = ChipKt.TrailingIconSpacing;
                                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f5), composer5, i28);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endNode();
                                                            composer5.endReplaceableGroup();
                                                            composer5.endReplaceableGroup();
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
                            }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i17 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke3 = borderStroke2;
                            function27 = function25;
                            function28 = function26;
                            function29 = function24;
                            z5 = z6;
                            modifier3 = modifier5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape4 = shape;
                            borderStroke3 = borderStroke;
                            function28 = function22;
                            function29 = function23;
                            z5 = z3;
                            composer2 = startRestartGroup;
                            selectableChipColors3 = selectableChipColors;
                            function27 = function2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i21) {
                                ChipKt.FilterChip(z, onClick, modifier3, z5, mutableInteractionSource4, shape4, borderStroke3, selectableChipColors3, function27, function28, function29, content, composer3, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    i13 = i11 | (startRestartGroup.changed(content) ? 32 : 16);
                }
                i12 = i13;
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                modifier2 = modifier4;
                startRestartGroup.endDefaults();
                int i172 = i14 << 3;
                int i182 = ((i14 >> 9) & 14) | (i172 & 112) | ((i14 >> 15) & 896);
                final State<Color> contentColor2 = selectableChipColors2.contentColor(z4, z, startRestartGroup, i182);
                final Function2 function2122 = function25;
                final Function2 function2132 = function26;
                final Function2 function2142 = function24;
                final boolean z62 = z4;
                final int i192 = i12;
                Modifier modifier52 = modifier2;
                selectableChipColors3 = selectableChipColors2;
                final int i202 = i14;
                composer2 = startRestartGroup;
                SurfaceKt.m990SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m2176setRolekuIjeqM(semantics, Role.INSTANCE.m2165getCheckboxo7Vup1c());
                    }
                }, 1, null), false, shape3, ((Color) selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i182).getValue()).getValue(), Color.m1445copywmQWz5c$default(((Color) contentColor2.getValue()).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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
                    public final void invoke(@Nullable Composer composer3, int i21) {
                        if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) contentColor2.getValue()).getValue())))};
                            final Function2 function215 = function2122;
                            final boolean z7 = z;
                            final Function2 function216 = function2132;
                            final Function2 function217 = function2142;
                            final Function3 function3 = content;
                            final int i22 = i192;
                            final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                            final boolean z8 = z62;
                            final int i23 = i202;
                            final State<Color> state = contentColor2;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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
                                public final void invoke(@Nullable Composer composer4, int i24) {
                                    if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                        final Function2 function218 = Function2.this;
                                        final boolean z9 = z7;
                                        final Function2 function219 = function216;
                                        final Function2 function220 = function217;
                                        final Function3 function32 = function3;
                                        final int i25 = i22;
                                        final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                        final boolean z10 = z8;
                                        final int i26 = i23;
                                        final State<Color> state2 = state;
                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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
                                            public final void invoke(@Nullable Composer composer5, int i27) {
                                                float f;
                                                RowScopeInstance rowScopeInstance;
                                                float f2;
                                                int i28;
                                                Modifier modifier6;
                                                float f3;
                                                float f4;
                                                float f5;
                                                if ((i27 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null), (Function2.this != null || (z9 && function219 != null)) ? Dp.m2507constructorimpl(0) : ChipKt.HorizontalPadding, 0.0f, function220 == null ? ChipKt.HorizontalPadding : Dp.m2507constructorimpl(0), 0.0f, 10, null);
                                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                Function2 function221 = Function2.this;
                                                boolean z11 = z9;
                                                Function2 function222 = function219;
                                                Function3 function33 = function32;
                                                int i29 = i25;
                                                Function2 function223 = function220;
                                                SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                boolean z12 = z10;
                                                int i30 = i26;
                                                State<Color> state3 = state2;
                                                composer5.startReplaceableGroup(693286680);
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                composer5.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion3.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                                Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-678309503);
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(1218705642);
                                                composer5.startReplaceableGroup(-1943412137);
                                                if (function221 != null || (z11 && function222 != null)) {
                                                    f = ChipKt.LeadingIconStartSpacing;
                                                    SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f), composer5, 6);
                                                    composer5.startReplaceableGroup(733328855);
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer5, 0);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    Density density2 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection2 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    Function0 constructor2 = companion3.getConstructor();
                                                    Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                                                    if (composer5.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor2);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer5);
                                                    rowScopeInstance = rowScopeInstance2;
                                                    Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                                                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-2137368960);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer5.startReplaceableGroup(-626917591);
                                                    composer5.startReplaceableGroup(649985595);
                                                    if (function221 != null) {
                                                        State leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) leadingIconColor.getValue()).getValue())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    composer5.startReplaceableGroup(-1943411323);
                                                    if (z11 && function222 != null) {
                                                        long value = ((Color) state3.getValue()).getValue();
                                                        composer5.startReplaceableGroup(649986426);
                                                        if (function221 != null) {
                                                            f3 = ChipKt.SelectedIconContainerSize;
                                                            modifier6 = ClipKt.clip(BackgroundKt.m157backgroundbw27NRU(SizeKt.m352requiredSize3ABfNKs(companion, f3), ((Color) state3.getValue()).getValue(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                            value = ((Color) selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue()).getValue();
                                                        } else {
                                                            modifier6 = companion;
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        Alignment center = companion2.getCenter();
                                                        composer5.startReplaceableGroup(733328855);
                                                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        Density density3 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                        LayoutDirection layoutDirection3 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                        Function0 constructor3 = companion3.getConstructor();
                                                        Function3 materializerOf3 = LayoutKt.materializerOf(modifier6);
                                                        if (composer5.getApplier() == null) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor3);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        composer5.disableReusing();
                                                        Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer5);
                                                        Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                        Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                                        Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                                        Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(-2137368960);
                                                        composer5.startReplaceableGroup(-370889391);
                                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(value))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    f2 = ChipKt.LeadingIconEndSpacing;
                                                    i28 = 6;
                                                    SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                                } else {
                                                    rowScopeInstance = rowScopeInstance2;
                                                    i28 = 6;
                                                }
                                                composer5.endReplaceableGroup();
                                                function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                                if (function223 != null) {
                                                    f4 = ChipKt.TrailingIconSpacing;
                                                    SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f4), composer5, i28);
                                                    function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                                    f5 = ChipKt.TrailingIconSpacing;
                                                    SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f5), composer5, i28);
                                                }
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
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
                }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i172 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke3 = borderStroke2;
                function27 = function25;
                function28 = function26;
                function29 = function24;
                z5 = z62;
                modifier3 = modifier52;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 458752) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            i12 = i13;
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            modifier2 = modifier4;
            startRestartGroup.endDefaults();
            int i1722 = i14 << 3;
            int i1822 = ((i14 >> 9) & 14) | (i1722 & 112) | ((i14 >> 15) & 896);
            final State<Color> contentColor22 = selectableChipColors2.contentColor(z4, z, startRestartGroup, i1822);
            final Function2 function21222 = function25;
            final Function2 function21322 = function26;
            final Function2 function21422 = function24;
            final boolean z622 = z4;
            final int i1922 = i12;
            Modifier modifier522 = modifier2;
            selectableChipColors3 = selectableChipColors2;
            final int i2022 = i14;
            composer2 = startRestartGroup;
            SurfaceKt.m990SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.m2176setRolekuIjeqM(semantics, Role.INSTANCE.m2165getCheckboxo7Vup1c());
                }
            }, 1, null), false, shape3, ((Color) selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i1822).getValue()).getValue(), Color.m1445copywmQWz5c$default(((Color) contentColor22.getValue()).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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
                public final void invoke(@Nullable Composer composer3, int i21) {
                    if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) contentColor22.getValue()).getValue())))};
                        final Function2 function215 = function21222;
                        final boolean z7 = z;
                        final Function2 function216 = function21322;
                        final Function2 function217 = function21422;
                        final Function3 function3 = content;
                        final int i22 = i1922;
                        final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                        final boolean z8 = z622;
                        final int i23 = i2022;
                        final State<Color> state = contentColor22;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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
                            public final void invoke(@Nullable Composer composer4, int i24) {
                                if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                    final Function2 function218 = Function2.this;
                                    final boolean z9 = z7;
                                    final Function2 function219 = function216;
                                    final Function2 function220 = function217;
                                    final Function3 function32 = function3;
                                    final int i25 = i22;
                                    final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                    final boolean z10 = z8;
                                    final int i26 = i23;
                                    final State<Color> state2 = state;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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
                                        public final void invoke(@Nullable Composer composer5, int i27) {
                                            float f;
                                            RowScopeInstance rowScopeInstance;
                                            float f2;
                                            int i28;
                                            Modifier modifier6;
                                            float f3;
                                            float f4;
                                            float f5;
                                            if ((i27 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null), (Function2.this != null || (z9 && function219 != null)) ? Dp.m2507constructorimpl(0) : ChipKt.HorizontalPadding, 0.0f, function220 == null ? ChipKt.HorizontalPadding : Dp.m2507constructorimpl(0), 0.0f, 10, null);
                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                            Function2 function221 = Function2.this;
                                            boolean z11 = z9;
                                            Function2 function222 = function219;
                                            Function3 function33 = function32;
                                            int i29 = i25;
                                            Function2 function223 = function220;
                                            SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                            boolean z12 = z10;
                                            int i30 = i26;
                                            State<Color> state3 = state2;
                                            composer5.startReplaceableGroup(693286680);
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                            composer5.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion3.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-678309503);
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(1218705642);
                                            composer5.startReplaceableGroup(-1943412137);
                                            if (function221 != null || (z11 && function222 != null)) {
                                                f = ChipKt.LeadingIconStartSpacing;
                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f), composer5, 6);
                                                composer5.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer5, 0);
                                                composer5.startReplaceableGroup(-1323940314);
                                                Density density2 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection2 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                Function0 constructor2 = companion3.getConstructor();
                                                Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                                                if (composer5.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor2);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer5);
                                                rowScopeInstance = rowScopeInstance2;
                                                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-2137368960);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer5.startReplaceableGroup(-626917591);
                                                composer5.startReplaceableGroup(649985595);
                                                if (function221 != null) {
                                                    State leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) leadingIconColor.getValue()).getValue())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                                }
                                                composer5.endReplaceableGroup();
                                                composer5.startReplaceableGroup(-1943411323);
                                                if (z11 && function222 != null) {
                                                    long value = ((Color) state3.getValue()).getValue();
                                                    composer5.startReplaceableGroup(649986426);
                                                    if (function221 != null) {
                                                        f3 = ChipKt.SelectedIconContainerSize;
                                                        modifier6 = ClipKt.clip(BackgroundKt.m157backgroundbw27NRU(SizeKt.m352requiredSize3ABfNKs(companion, f3), ((Color) state3.getValue()).getValue(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                        value = ((Color) selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue()).getValue();
                                                    } else {
                                                        modifier6 = companion;
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    Alignment center = companion2.getCenter();
                                                    composer5.startReplaceableGroup(733328855);
                                                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    Density density3 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection3 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    Function0 constructor3 = companion3.getConstructor();
                                                    Function3 materializerOf3 = LayoutKt.materializerOf(modifier6);
                                                    if (composer5.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor3);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    composer5.disableReusing();
                                                    Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer5);
                                                    Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                    Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                                    Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                                    Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(-2137368960);
                                                    composer5.startReplaceableGroup(-370889391);
                                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(value))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                }
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                f2 = ChipKt.LeadingIconEndSpacing;
                                                i28 = 6;
                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                            } else {
                                                rowScopeInstance = rowScopeInstance2;
                                                i28 = 6;
                                            }
                                            composer5.endReplaceableGroup();
                                            function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                            if (function223 != null) {
                                                f4 = ChipKt.TrailingIconSpacing;
                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f4), composer5, i28);
                                                function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                                f5 = ChipKt.TrailingIconSpacing;
                                                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f5), composer5, i28);
                                            }
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
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
            }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i1722 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
            mutableInteractionSource4 = mutableInteractionSource3;
            shape4 = shape3;
            borderStroke3 = borderStroke2;
            function27 = function25;
            function28 = function26;
            function29 = function24;
            z5 = z622;
            modifier3 = modifier522;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 458752) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        i12 = i13;
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        modifier2 = modifier4;
        startRestartGroup.endDefaults();
        int i17222 = i14 << 3;
        int i18222 = ((i14 >> 9) & 14) | (i17222 & 112) | ((i14 >> 15) & 896);
        final State<Color> contentColor222 = selectableChipColors2.contentColor(z4, z, startRestartGroup, i18222);
        final Function2 function212222 = function25;
        final Function2 function213222 = function26;
        final Function2 function214222 = function24;
        final boolean z6222 = z4;
        final int i19222 = i12;
        Modifier modifier5222 = modifier2;
        selectableChipColors3 = selectableChipColors2;
        final int i20222 = i14;
        composer2 = startRestartGroup;
        SurfaceKt.m990SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier2, false, new Function1() { // from class: androidx.compose.material.ChipKt$FilterChip$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.m2176setRolekuIjeqM(semantics, Role.INSTANCE.m2165getCheckboxo7Vup1c());
            }
        }, 1, null), false, shape3, ((Color) selectableChipColors2.backgroundColor(z4, z, startRestartGroup, i18222).getValue()).getValue(), Color.m1445copywmQWz5c$default(((Color) contentColor222.getValue()).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, (Function2) ComposableLambdaKt.composableLambda(startRestartGroup, 722126431, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3
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
            public final void invoke(@Nullable Composer composer3, int i21) {
                if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) contentColor222.getValue()).getValue())))};
                    final Function2 function215 = function212222;
                    final boolean z7 = z;
                    final Function2 function216 = function213222;
                    final Function2 function217 = function214222;
                    final Function3 function3 = content;
                    final int i22 = i19222;
                    final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                    final boolean z8 = z6222;
                    final int i23 = i20222;
                    final State<Color> state = contentColor222;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1582291359, true, new Function2() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
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
                        public final void invoke(@Nullable Composer composer4, int i24) {
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                final Function2 function218 = Function2.this;
                                final boolean z9 = z7;
                                final Function2 function219 = function216;
                                final Function2 function220 = function217;
                                final Function3 function32 = function3;
                                final int i25 = i22;
                                final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                final boolean z10 = z8;
                                final int i26 = i23;
                                final State<Color> state2 = state;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, -1543702066, true, new Function2() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
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
                                    public final void invoke(@Nullable Composer composer5, int i27) {
                                        float f;
                                        RowScopeInstance rowScopeInstance;
                                        float f2;
                                        int i28;
                                        Modifier modifier6;
                                        float f3;
                                        float f4;
                                        float f5;
                                        if ((i27 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(SizeKt.m346defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m783getMinHeightD9Ej5fM(), 1, null), (Function2.this != null || (z9 && function219 != null)) ? Dp.m2507constructorimpl(0) : ChipKt.HorizontalPadding, 0.0f, function220 == null ? ChipKt.HorizontalPadding : Dp.m2507constructorimpl(0), 0.0f, 10, null);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                        Function2 function221 = Function2.this;
                                        boolean z11 = z9;
                                        Function2 function222 = function219;
                                        Function3 function33 = function32;
                                        int i29 = i25;
                                        Function2 function223 = function220;
                                        SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                        boolean z12 = z10;
                                        int i30 = i26;
                                        State<Color> state3 = state2;
                                        composer5.startReplaceableGroup(693286680);
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                        composer5.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion3.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(m338paddingqDBjuR0$default);
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
                                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                                        composer5.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        composer5.startReplaceableGroup(-678309503);
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                        composer5.startReplaceableGroup(1218705642);
                                        composer5.startReplaceableGroup(-1943412137);
                                        if (function221 != null || (z11 && function222 != null)) {
                                            f = ChipKt.LeadingIconStartSpacing;
                                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f), composer5, 6);
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer5, 0);
                                            composer5.startReplaceableGroup(-1323940314);
                                            Density density2 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection2 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            Function0 constructor2 = companion3.getConstructor();
                                            Function3 materializerOf2 = LayoutKt.materializerOf(companion);
                                            if (composer5.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor2);
                                            } else {
                                                composer5.useNode();
                                            }
                                            composer5.disableReusing();
                                            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer5);
                                            rowScopeInstance = rowScopeInstance2;
                                            Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(-2137368960);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer5.startReplaceableGroup(-626917591);
                                            composer5.startReplaceableGroup(649985595);
                                            if (function221 != null) {
                                                State leadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896));
                                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(((Color) leadingIconColor.getValue()).getValue())))}, function221, composer5, ((i30 >> 21) & 112) | 8);
                                            }
                                            composer5.endReplaceableGroup();
                                            composer5.startReplaceableGroup(-1943411323);
                                            if (z11 && function222 != null) {
                                                long value = ((Color) state3.getValue()).getValue();
                                                composer5.startReplaceableGroup(649986426);
                                                if (function221 != null) {
                                                    f3 = ChipKt.SelectedIconContainerSize;
                                                    modifier6 = ClipKt.clip(BackgroundKt.m157backgroundbw27NRU(SizeKt.m352requiredSize3ABfNKs(companion, f3), ((Color) state3.getValue()).getValue(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                    value = ((Color) selectableChipColors6.backgroundColor(z12, z11, composer5, ((i30 >> 9) & 14) | ((i30 << 3) & 112) | ((i30 >> 15) & 896)).getValue()).getValue();
                                                } else {
                                                    modifier6 = companion;
                                                }
                                                composer5.endReplaceableGroup();
                                                Alignment center = companion2.getCenter();
                                                composer5.startReplaceableGroup(733328855);
                                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                composer5.startReplaceableGroup(-1323940314);
                                                Density density3 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection3 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                Function0 constructor3 = companion3.getConstructor();
                                                Function3 materializerOf3 = LayoutKt.materializerOf(modifier6);
                                                if (composer5.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor3);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                composer5.disableReusing();
                                                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer5);
                                                Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(-2137368960);
                                                composer5.startReplaceableGroup(-370889391);
                                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(value))}, function222, composer5, ((i30 >> 24) & 112) | 8);
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                            }
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            f2 = ChipKt.LeadingIconEndSpacing;
                                            i28 = 6;
                                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f2), composer5, 6);
                                        } else {
                                            rowScopeInstance = rowScopeInstance2;
                                            i28 = 6;
                                        }
                                        composer5.endReplaceableGroup();
                                        function33.invoke(rowScopeInstance, composer5, Integer.valueOf((i29 & 112) | i28));
                                        if (function223 != null) {
                                            f4 = ChipKt.TrailingIconSpacing;
                                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f4), composer5, i28);
                                            function223.invoke(composer5, Integer.valueOf(i29 & 14));
                                            f5 = ChipKt.TrailingIconSpacing;
                                            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(companion, f5), composer5, i28);
                                        }
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
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
        }), composer2, (i14 & 126) | ((i14 >> 3) & 57344) | (i17222 & 29360128) | ((i14 << 15) & 1879048192), 6, 264);
        mutableInteractionSource4 = mutableInteractionSource3;
        shape4 = shape3;
        borderStroke3 = borderStroke2;
        function27 = function25;
        function28 = function26;
        function29 = function24;
        z5 = z6222;
        modifier3 = modifier5222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Chip$lambda-1, reason: not valid java name */
    public static final long m784Chip$lambda1(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
