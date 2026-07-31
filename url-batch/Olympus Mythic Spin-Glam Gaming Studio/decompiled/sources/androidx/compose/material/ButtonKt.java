package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008a\u0001\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008a\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u008a\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/material/ButtonColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "content", "Button", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0 onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, final Function3 content, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        Shape shape2;
        int i6;
        final ButtonColors buttonColors2;
        int i7;
        int i8;
        final PaddingValues paddingValues2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        ButtonColors buttonColors3;
        BorderStroke borderStroke2;
        ButtonColors buttonColors4;
        ButtonElevation buttonElevation3;
        Shape shape3;
        boolean z2;
        MutableInteractionSource mutableInteractionSource4;
        final PaddingValues paddingValues3;
        Composer composer2;
        final Shape shape4;
        final BorderStroke borderStroke3;
        final ButtonElevation buttonElevation4;
        final Modifier modifier3;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2116133464);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
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
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            buttonElevation2 = buttonElevation;
                            if (startRestartGroup.changed(buttonElevation2)) {
                                i11 = 16384;
                                i3 |= i11;
                            }
                        } else {
                            buttonElevation2 = buttonElevation;
                        }
                        i11 = 8192;
                        i3 |= i11;
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    if ((458752 & i) != 0) {
                        shape2 = shape;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    if ((29360128 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            buttonColors2 = buttonColors;
                            if (startRestartGroup.changed(buttonColors2)) {
                                i10 = 8388608;
                                i3 |= i10;
                            }
                        } else {
                            buttonColors2 = buttonColors;
                        }
                        i10 = 4194304;
                        i3 |= i10;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i8 = i7;
                        paddingValues2 = paddingValues;
                        i3 |= startRestartGroup.changed(paddingValues2) ? 67108864 : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= C.ENCODING_PCM_32BIT;
                        } else if ((1879048192 & i) == 0) {
                            i3 |= startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 != 0 ? true : z;
                                if (i5 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i2 & 16) != 0) {
                                    i9 = i8;
                                    i3 &= -57345;
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m757elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 196608, 31);
                                } else {
                                    i9 = i8;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                }
                                BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                                if ((i2 & 128) != 0) {
                                    buttonColors3 = ButtonDefaults.INSTANCE.m756buttonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                    i3 &= -29360129;
                                } else {
                                    buttonColors3 = buttonColors;
                                }
                                if (i9 != 0) {
                                    borderStroke2 = borderStroke4;
                                    buttonColors4 = buttonColors3;
                                    buttonElevation3 = buttonElevation2;
                                    shape3 = shape2;
                                    z2 = z4;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    paddingValues3 = ButtonDefaults.INSTANCE.getContentPadding();
                                } else {
                                    borderStroke2 = borderStroke4;
                                    buttonColors4 = buttonColors3;
                                    buttonElevation3 = buttonElevation2;
                                    shape3 = shape2;
                                    z2 = z4;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    paddingValues3 = paddingValues;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                borderStroke2 = borderStroke;
                                shape3 = shape2;
                                z2 = z;
                                PaddingValues paddingValues4 = paddingValues2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                buttonColors4 = buttonColors2;
                                buttonElevation3 = buttonElevation2;
                                paddingValues3 = paddingValues4;
                            }
                            startRestartGroup.endDefaults();
                            int i13 = i3 >> 6;
                            int i14 = (i13 & 14) | ((i3 >> 18) & 112);
                            final State contentColor = buttonColors4.contentColor(z2, startRestartGroup, i14);
                            long value = ((Color) buttonColors4.backgroundColor(z2, startRestartGroup, i14).getValue()).getValue();
                            long m1445copywmQWz5c$default = Color.m1445copywmQWz5c$default(m762Button$lambda1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            State elevation = buttonElevation3 != null ? buttonElevation3.elevation(z2, mutableInteractionSource4, startRestartGroup, i13 & 1022) : null;
                            ButtonColors buttonColors5 = buttonColors4;
                            PaddingValues paddingValues5 = paddingValues3;
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                            composer2 = startRestartGroup;
                            SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape3, value, m1445copywmQWz5c$default, borderStroke2, elevation != null ? ((Dp) elevation.getValue()).getValue() : Dp.m2507constructorimpl(0), mutableInteractionSource6, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2
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
                                    long m762Button$lambda1;
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                        m762Button$lambda1 = ButtonKt.m762Button$lambda1(contentColor);
                                        ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m762Button$lambda1)))};
                                        final PaddingValues paddingValues6 = paddingValues3;
                                        final Function3 function3 = content;
                                        final int i16 = i3;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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
                                            public final void invoke(@Nullable Composer composer4, int i17) {
                                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                                    final PaddingValues paddingValues7 = PaddingValues.this;
                                                    final Function3 function32 = function3;
                                                    final int i18 = i16;
                                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
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
                                                        public final void invoke(@Nullable Composer composer5, int i19) {
                                                            if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                                Modifier padding = PaddingKt.padding(SizeKt.m345defaultMinSizeVpY3zN4(companion, buttonDefaults.m759getMinWidthD9Ej5fM(), buttonDefaults.m758getMinHeightD9Ej5fM()), PaddingValues.this);
                                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                Function3 function33 = function32;
                                                                int i20 = ((i18 >> 18) & 7168) | 432;
                                                                composer5.startReplaceableGroup(693286680);
                                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                Function0 constructor = companion2.getConstructor();
                                                                Function3 materializerOf = LayoutKt.materializerOf(padding);
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
                                                                function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
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
                            }), composer2, (i13 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
                            shape4 = shape3;
                            borderStroke3 = borderStroke2;
                            buttonElevation4 = buttonElevation3;
                            buttonColors2 = buttonColors5;
                            paddingValues2 = paddingValues5;
                            modifier3 = modifier2;
                            z3 = z2;
                            mutableInteractionSource5 = mutableInteractionSource6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            mutableInteractionSource5 = mutableInteractionSource2;
                            buttonElevation4 = buttonElevation2;
                            shape4 = shape2;
                            composer2 = startRestartGroup;
                            borderStroke3 = borderStroke;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ButtonKt$Button$3
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
                                ButtonKt.Button(Function0.this, modifier3, z3, mutableInteractionSource5, buttonElevation4, shape4, borderStroke3, buttonColors2, paddingValues2, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = i7;
                    paddingValues2 = paddingValues;
                    if ((i2 & 512) != 0) {
                    }
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
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
                    if ((i2 & 128) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    int i132 = i3 >> 6;
                    int i142 = (i132 & 14) | ((i3 >> 18) & 112);
                    final State<Color> contentColor2 = buttonColors4.contentColor(z2, startRestartGroup, i142);
                    long value2 = ((Color) buttonColors4.backgroundColor(z2, startRestartGroup, i142).getValue()).getValue();
                    long m1445copywmQWz5c$default2 = Color.m1445copywmQWz5c$default(m762Button$lambda1(contentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (buttonElevation3 != null) {
                    }
                    ButtonColors buttonColors52 = buttonColors4;
                    PaddingValues paddingValues52 = paddingValues3;
                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                    composer2 = startRestartGroup;
                    SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape3, value2, m1445copywmQWz5c$default2, borderStroke2, elevation != null ? ((Dp) elevation.getValue()).getValue() : Dp.m2507constructorimpl(0), mutableInteractionSource62, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2
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
                            long m762Button$lambda1;
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                m762Button$lambda1 = ButtonKt.m762Button$lambda1(contentColor2);
                                ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m762Button$lambda1)))};
                                final PaddingValues paddingValues6 = paddingValues3;
                                final Function3 function3 = content;
                                final int i16 = i3;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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
                                    public final void invoke(@Nullable Composer composer4, int i17) {
                                        if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                            final PaddingValues paddingValues7 = PaddingValues.this;
                                            final Function3 function32 = function3;
                                            final int i18 = i16;
                                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
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
                                                public final void invoke(@Nullable Composer composer5, int i19) {
                                                    if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                        Modifier padding = PaddingKt.padding(SizeKt.m345defaultMinSizeVpY3zN4(companion, buttonDefaults.m759getMinWidthD9Ej5fM(), buttonDefaults.m758getMinHeightD9Ej5fM()), PaddingValues.this);
                                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function3 function33 = function32;
                                                        int i20 = ((i18 >> 18) & 7168) | 432;
                                                        composer5.startReplaceableGroup(693286680);
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                        Function0 constructor = companion2.getConstructor();
                                                        Function3 materializerOf = LayoutKt.materializerOf(padding);
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
                                                        function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
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
                    }), composer2, (i132 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
                    shape4 = shape3;
                    borderStroke3 = borderStroke2;
                    buttonElevation4 = buttonElevation3;
                    buttonColors2 = buttonColors52;
                    paddingValues2 = paddingValues52;
                    modifier3 = modifier2;
                    z3 = z2;
                    mutableInteractionSource5 = mutableInteractionSource62;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((29360128 & i) != 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                paddingValues2 = paddingValues;
                if ((i2 & 512) != 0) {
                }
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
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
                if ((i2 & 128) != 0) {
                }
                if (i9 != 0) {
                }
                startRestartGroup.endDefaults();
                int i1322 = i3 >> 6;
                int i1422 = (i1322 & 14) | ((i3 >> 18) & 112);
                final State<Color> contentColor22 = buttonColors4.contentColor(z2, startRestartGroup, i1422);
                long value22 = ((Color) buttonColors4.backgroundColor(z2, startRestartGroup, i1422).getValue()).getValue();
                long m1445copywmQWz5c$default22 = Color.m1445copywmQWz5c$default(m762Button$lambda1(contentColor22), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (buttonElevation3 != null) {
                }
                ButtonColors buttonColors522 = buttonColors4;
                PaddingValues paddingValues522 = paddingValues3;
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
                composer2 = startRestartGroup;
                SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape3, value22, m1445copywmQWz5c$default22, borderStroke2, elevation != null ? ((Dp) elevation.getValue()).getValue() : Dp.m2507constructorimpl(0), mutableInteractionSource622, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2
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
                        long m762Button$lambda1;
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                            m762Button$lambda1 = ButtonKt.m762Button$lambda1(contentColor22);
                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m762Button$lambda1)))};
                            final PaddingValues paddingValues6 = paddingValues3;
                            final Function3 function3 = content;
                            final int i16 = i3;
                            CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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
                                public final void invoke(@Nullable Composer composer4, int i17) {
                                    if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                        final PaddingValues paddingValues7 = PaddingValues.this;
                                        final Function3 function32 = function3;
                                        final int i18 = i16;
                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
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
                                            public final void invoke(@Nullable Composer composer5, int i19) {
                                                if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                    Modifier padding = PaddingKt.padding(SizeKt.m345defaultMinSizeVpY3zN4(companion, buttonDefaults.m759getMinWidthD9Ej5fM(), buttonDefaults.m758getMinHeightD9Ej5fM()), PaddingValues.this);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3 function33 = function32;
                                                    int i20 = ((i18 >> 18) & 7168) | 432;
                                                    composer5.startReplaceableGroup(693286680);
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0 constructor = companion2.getConstructor();
                                                    Function3 materializerOf = LayoutKt.materializerOf(padding);
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
                                                    function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
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
                }), composer2, (i1322 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
                shape4 = shape3;
                borderStroke3 = borderStroke2;
                buttonElevation4 = buttonElevation3;
                buttonColors2 = buttonColors522;
                paddingValues2 = paddingValues522;
                modifier3 = modifier2;
                z3 = z2;
                mutableInteractionSource5 = mutableInteractionSource622;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((29360128 & i) != 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            paddingValues2 = paddingValues;
            if ((i2 & 512) != 0) {
            }
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
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
            if ((i2 & 128) != 0) {
            }
            if (i9 != 0) {
            }
            startRestartGroup.endDefaults();
            int i13222 = i3 >> 6;
            int i14222 = (i13222 & 14) | ((i3 >> 18) & 112);
            final State<Color> contentColor222 = buttonColors4.contentColor(z2, startRestartGroup, i14222);
            long value222 = ((Color) buttonColors4.backgroundColor(z2, startRestartGroup, i14222).getValue()).getValue();
            long m1445copywmQWz5c$default222 = Color.m1445copywmQWz5c$default(m762Button$lambda1(contentColor222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            if (buttonElevation3 != null) {
            }
            ButtonColors buttonColors5222 = buttonColors4;
            PaddingValues paddingValues5222 = paddingValues3;
            MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource4;
            composer2 = startRestartGroup;
            SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape3, value222, m1445copywmQWz5c$default222, borderStroke2, elevation != null ? ((Dp) elevation.getValue()).getValue() : Dp.m2507constructorimpl(0), mutableInteractionSource6222, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2
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
                    long m762Button$lambda1;
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                        m762Button$lambda1 = ButtonKt.m762Button$lambda1(contentColor222);
                        ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m762Button$lambda1)))};
                        final PaddingValues paddingValues6 = paddingValues3;
                        final Function3 function3 = content;
                        final int i16 = i3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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
                            public final void invoke(@Nullable Composer composer4, int i17) {
                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                    final PaddingValues paddingValues7 = PaddingValues.this;
                                    final Function3 function32 = function3;
                                    final int i18 = i16;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
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
                                        public final void invoke(@Nullable Composer composer5, int i19) {
                                            if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                Modifier padding = PaddingKt.padding(SizeKt.m345defaultMinSizeVpY3zN4(companion, buttonDefaults.m759getMinWidthD9Ej5fM(), buttonDefaults.m758getMinHeightD9Ej5fM()), PaddingValues.this);
                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function3 function33 = function32;
                                                int i20 = ((i18 >> 18) & 7168) | 432;
                                                composer5.startReplaceableGroup(693286680);
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                                composer5.startReplaceableGroup(-1323940314);
                                                Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion2.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(padding);
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
                                                function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
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
            }), composer2, (i13222 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
            shape4 = shape3;
            borderStroke3 = borderStroke2;
            buttonElevation4 = buttonElevation3;
            buttonColors2 = buttonColors5222;
            paddingValues2 = paddingValues5222;
            modifier3 = modifier2;
            z3 = z2;
            mutableInteractionSource5 = mutableInteractionSource6222;
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
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((29360128 & i) != 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        paddingValues2 = paddingValues;
        if ((i2 & 512) != 0) {
        }
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
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
        if ((i2 & 128) != 0) {
        }
        if (i9 != 0) {
        }
        startRestartGroup.endDefaults();
        int i132222 = i3 >> 6;
        int i142222 = (i132222 & 14) | ((i3 >> 18) & 112);
        final State<Color> contentColor2222 = buttonColors4.contentColor(z2, startRestartGroup, i142222);
        long value2222 = ((Color) buttonColors4.backgroundColor(z2, startRestartGroup, i142222).getValue()).getValue();
        long m1445copywmQWz5c$default2222 = Color.m1445copywmQWz5c$default(m762Button$lambda1(contentColor2222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (buttonElevation3 != null) {
        }
        ButtonColors buttonColors52222 = buttonColors4;
        PaddingValues paddingValues52222 = paddingValues3;
        MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource4;
        composer2 = startRestartGroup;
        SurfaceKt.m989SurfaceLPr_se0(onClick, modifier2, z2, shape3, value2222, m1445copywmQWz5c$default2222, borderStroke2, elevation != null ? ((Dp) elevation.getValue()).getValue() : Dp.m2507constructorimpl(0), mutableInteractionSource62222, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2
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
                long m762Button$lambda1;
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidableCompositionLocal localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                    m762Button$lambda1 = ButtonKt.m762Button$lambda1(contentColor2222);
                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m1448getAlphaimpl(m762Button$lambda1)))};
                    final PaddingValues paddingValues6 = paddingValues3;
                    final Function3 function3 = content;
                    final int i16 = i3;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer3, -1699085201, true, new Function2() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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
                        public final void invoke(@Nullable Composer composer4, int i17) {
                            if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer4, 6).getButton();
                                final PaddingValues paddingValues7 = PaddingValues.this;
                                final Function3 function32 = function3;
                                final int i18 = i16;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer4, -630330208, true, new Function2() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
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
                                    public final void invoke(@Nullable Composer composer5, int i19) {
                                        if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                            Modifier padding = PaddingKt.padding(SizeKt.m345defaultMinSizeVpY3zN4(companion, buttonDefaults.m759getMinWidthD9Ej5fM(), buttonDefaults.m758getMinHeightD9Ej5fM()), PaddingValues.this);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3 function33 = function32;
                                            int i20 = ((i18 >> 18) & 7168) | 432;
                                            composer5.startReplaceableGroup(693286680);
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer5, 54);
                                            composer5.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion2.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(padding);
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
                                            function33.invoke(RowScopeInstance.INSTANCE, composer5, Integer.valueOf(((i20 >> 6) & 112) | 6));
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
        }), composer2, (i132222 & 7168) | (i3 & 14) | C.ENCODING_PCM_32BIT | (i3 & 112) | (i3 & 896) | (i3 & 3670016) | ((i3 << 15) & 234881024), 0);
        shape4 = shape3;
        borderStroke3 = borderStroke2;
        buttonElevation4 = buttonElevation3;
        buttonColors2 = buttonColors52222;
        paddingValues2 = paddingValues52222;
        modifier3 = modifier2;
        z3 = z2;
        mutableInteractionSource5 = mutableInteractionSource62222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OutlinedButton(Function0 onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3 content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1776134358);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Button(onClick, modifier2, z2, mutableInteractionSource2, (i2 & 16) != 0 ? null : buttonElevation, (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape, (i2 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke, (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m760outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues, content, composer, i & 2147483646, 0);
        composer.endReplaceableGroup();
    }

    public static final void TextButton(Function0 onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3 content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(288797557);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Button(onClick, modifier2, z2, mutableInteractionSource2, (i2 & 16) != 0 ? null : buttonElevation, (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape, (i2 & 64) != 0 ? null : borderStroke, (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m761textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues, content, composer, i & 2147483646, 0);
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Button$lambda-1, reason: not valid java name */
    public static final long m762Button$lambda1(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
