package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aá\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010&\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010,\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b,\u0010+\"\u001d\u0010.\u001a\u00020-8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u001d\u00103\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u001d\u00107\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106\"\u001a\u0010:\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u001a\u0010B\u001a\u0004\u0018\u00010?*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/material/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material/TextFieldColors;", "colors", "border", "CommonDecorationBox", "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "", "contentAlpha", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "content", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "(Landroidx/compose/ui/layout/Placeable;)I", "heightOrZero", "Landroidx/compose/ui/unit/Constraints;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "Landroidx/compose/ui/unit/Dp;", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "HorizontalIconPadding", "getHorizontalIconPadding", "Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TextFieldImplKt {
    private static final Modifier IconDefaultSizeModifier;
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m2507constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m2507constructorimpl(12);

    public static final void CommonDecorationBox(final TextFieldType type, final String value, final Function2 innerTextField, final VisualTransformation visualTransformation, final Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z, boolean z2, boolean z3, final InteractionSource interactionSource, final PaddingValues contentPadding, final TextFieldColors colors, Function2 function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        InputPhase inputPhase;
        Composer composer2;
        final Function2 function26;
        final Function2 function27;
        final Function2 function28;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        final Function2 function29;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-712568069);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(type) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(innerTextField) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changed(function2) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
        } else if ((i & 458752) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changed(function24) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        int i10 = i3 & 512;
        if (i10 != 0) {
            i4 |= C.ENCODING_PCM_32BIT;
        } else if ((i & 1879048192) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
        }
        final int i11 = i4;
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        int i13 = i5;
        if ((i3 & 4096) != 0) {
            i13 |= 384;
        } else if ((i2 & 896) == 0) {
            i13 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i3 & 8192) != 0) {
            i13 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i13 |= startRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i14 = i3 & 16384;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i13 |= startRestartGroup.changed(function25) ? 16384 : 8192;
        }
        if ((i11 & 1533916891) != 306783378 || (46811 & i13) != 9362 || !startRestartGroup.getSkipping()) {
            Function2 function210 = i6 != 0 ? null : function22;
            Function2 function211 = i7 != 0 ? null : function23;
            Function2 function212 = i8 != 0 ? null : function24;
            boolean z7 = i9 != 0 ? false : z;
            boolean z8 = i10 != 0 ? true : z2;
            boolean z9 = i12 != 0 ? false : z3;
            Function2 function213 = i14 != 0 ? null : function25;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final String text = ((TransformedText) rememberedValue).getText().getText();
            if (((Boolean) FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i13 >> 3) & 14).getValue()).booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            InputPhase inputPhase2 = inputPhase;
            final boolean z10 = z8;
            final boolean z11 = z9;
            final int i15 = i13;
            Function3 function3 = new Function3() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return Color.m1441boximpl(m1045invokeXeAY9LY((InputPhase) obj, (Composer) obj2, ((Number) obj3).intValue()));
                }

                @Composable
                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1045invokeXeAY9LY(@NotNull InputPhase it, @Nullable Composer composer3, int i16) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    composer3.startReplaceableGroup(697243846);
                    TextFieldColors textFieldColors = TextFieldColors.this;
                    boolean z12 = z10;
                    boolean z13 = it == InputPhase.UnfocusedEmpty ? false : z11;
                    InteractionSource interactionSource2 = interactionSource;
                    int i17 = (i11 >> 27) & 14;
                    int i18 = i15;
                    long value2 = ((Color) textFieldColors.labelColor(z12, z13, interactionSource2, composer3, i17 | ((i18 << 3) & 896) | (i18 & 7168)).getValue()).getValue();
                    composer3.endReplaceableGroup();
                    return value2;
                }
            };
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(startRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long m2260getColor0d7_KjU = subtitle1.m2260getColor0d7_KjU();
            Color.Companion companion = Color.INSTANCE;
            boolean z12 = (Color.m1447equalsimpl0(m2260getColor0d7_KjU, companion.m1461getUnspecified0d7_KjU()) && !Color.m1447equalsimpl0(caption.m2260getColor0d7_KjU(), companion.m1461getUnspecified0d7_KjU())) || (!Color.m1447equalsimpl0(subtitle1.m2260getColor0d7_KjU(), companion.m1461getUnspecified0d7_KjU()) && Color.m1447equalsimpl0(caption.m2260getColor0d7_KjU(), companion.m1461getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceableGroup(2129141006);
            long m2260getColor0d7_KjU2 = materialTheme.getTypography(startRestartGroup, 6).getCaption().m2260getColor0d7_KjU();
            if (z12 && m2260getColor0d7_KjU2 == companion.m1461getUnspecified0d7_KjU()) {
                m2260getColor0d7_KjU2 = ((Color) function3.invoke(inputPhase2, startRestartGroup, 0)).getValue();
            }
            long j = m2260getColor0d7_KjU2;
            startRestartGroup.endReplaceableGroup();
            long m2260getColor0d7_KjU3 = materialTheme.getTypography(startRestartGroup, 6).getSubtitle1().m2260getColor0d7_KjU();
            if (z12 && m2260getColor0d7_KjU3 == companion.m1461getUnspecified0d7_KjU()) {
                m2260getColor0d7_KjU3 = ((Color) function3.invoke(inputPhase2, startRestartGroup, 0)).getValue();
            }
            final Function2 function214 = function210;
            final boolean z13 = z9;
            final int i16 = i13;
            final boolean z14 = z8;
            final Function2 function215 = function211;
            final Function2 function216 = function212;
            final boolean z15 = z7;
            final boolean z16 = z12;
            final Function2 function217 = function213;
            composer2 = startRestartGroup;
            textFieldTransitionScope.m1054TransitionDTcfvLk(inputPhase2, j, m2260getColor0d7_KjU3, function3, function2 != null, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new Function6() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                /* compiled from: TextFieldImpl.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        iArr[TextFieldType.Filled.ordinal()] = 1;
                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(6);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    m1043invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).getValue(), ((Color) obj3).getValue(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r14v0 */
                /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r14v4 */
                @ComposableTarget
                @Composable
                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                public final void m1043invokeRIQooxk(final float f, final long j2, final long j3, final float f2, @Nullable Composer composer3, int i17) {
                    int i18;
                    ?? r14;
                    ComposableLambda composableLambda;
                    ComposableLambda composableLambda2;
                    final long value2;
                    final long value3;
                    if ((i17 & 14) == 0) {
                        i18 = (composer3.changed(f) ? 4 : 2) | i17;
                    } else {
                        i18 = i17;
                    }
                    if ((i17 & 112) == 0) {
                        i18 |= composer3.changed(j2) ? 32 : 16;
                    }
                    if ((i17 & 896) == 0) {
                        i18 |= composer3.changed(j3) ? 256 : 128;
                    }
                    if ((i17 & 7168) == 0) {
                        i18 |= composer3.changed(f2) ? 2048 : 1024;
                    }
                    final int i19 = i18;
                    if ((46811 & i19) != 9362 || !composer3.getSkipping()) {
                        final Function2 function218 = Function2.this;
                        if (function218 != null) {
                            final boolean z17 = z16;
                            r14 = 1;
                            composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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
                                public final void invoke(@Nullable Composer composer4, int i20) {
                                    TextStyle textStyle;
                                    TextStyle m2257copyHL5avdY;
                                    if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                        TextStyle lerp = TextStyleKt.lerp(materialTheme2.getTypography(composer4, 6).getSubtitle1(), materialTheme2.getTypography(composer4, 6).getCaption(), f);
                                        boolean z18 = z17;
                                        long j4 = j2;
                                        if (z18) {
                                            m2257copyHL5avdY = lerp.m2257copyHL5avdY((r42 & 1) != 0 ? lerp.spanStyle.m2225getColor0d7_KjU() : j4, (r42 & 2) != 0 ? lerp.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? lerp.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? lerp.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? lerp.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? lerp.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? lerp.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? lerp.paragraphStyle.getTextAlign() : null, (r42 & 32768) != 0 ? lerp.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? lerp.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? lerp.paragraphStyle.getTextIndent() : null);
                                            textStyle = m2257copyHL5avdY;
                                        } else {
                                            textStyle = lerp;
                                        }
                                        TextFieldImplKt.m1042DecorationeuL9pac(j3, textStyle, null, function218, composer4, ((i19 >> 6) & 14) | 384, 0);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                        } else {
                            r14 = 1;
                            composableLambda = null;
                        }
                        if (function214 == null || text.length() != 0) {
                            composableLambda2 = null;
                        } else {
                            final TextFieldColors textFieldColors = colors;
                            final boolean z18 = z14;
                            final int i20 = i11;
                            final int i21 = i16;
                            final Function2 function219 = function214;
                            composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, r14, new Function3() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@NotNull Modifier modifier, @Nullable Composer composer4, int i22) {
                                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                                    if ((i22 & 14) == 0) {
                                        i22 |= composer4.changed(modifier) ? 4 : 2;
                                    }
                                    if ((i22 & 91) != 18 || !composer4.getSkipping()) {
                                        Modifier alpha = AlphaKt.alpha(modifier, f2);
                                        TextFieldColors textFieldColors2 = textFieldColors;
                                        boolean z19 = z18;
                                        int i23 = i20;
                                        int i24 = i21;
                                        Function2 function220 = function219;
                                        composer4.startReplaceableGroup(733328855);
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                        composer4.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion2.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(alpha);
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer4);
                                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1188063364);
                                        TextFieldImplKt.m1042DecorationeuL9pac(((Color) textFieldColors2.placeholderColor(z19, composer4, ((i23 >> 27) & 14) | ((i24 >> 6) & 112)).getValue()).getValue(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function220, composer4, (i23 >> 6) & 7168, 4);
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                        }
                        final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m981getDefaultErrorMessageUdPEhr4(), composer3, 6);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Object valueOf = Boolean.valueOf(z13);
                        final boolean z19 = z13;
                        composer3.startReplaceableGroup(511388516);
                        boolean changed2 = composer3.changed(valueOf) | composer3.changed(m986getString4foXLRw);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
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
                                    if (z19) {
                                        SemanticsPropertiesKt.error(semantics, m986getString4foXLRw);
                                    }
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue2, r14, null);
                        if (colors instanceof TextFieldColorsWithIcons) {
                            composer3.startReplaceableGroup(-1083197894);
                            TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                            boolean z20 = z14;
                            boolean z21 = z13;
                            InteractionSource interactionSource2 = interactionSource;
                            int i22 = (i11 >> 27) & 14;
                            int i23 = i16;
                            value2 = ((Color) textFieldColorsWithIcons.leadingIconColor(z20, z21, interactionSource2, composer3, ((i23 << 3) & 896) | i22 | ((i23 << 3) & 112)).getValue()).getValue();
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-1083197798);
                            TextFieldColors textFieldColors2 = colors;
                            boolean z22 = z14;
                            boolean z23 = z13;
                            int i24 = (i11 >> 27) & 14;
                            int i25 = i16;
                            value2 = ((Color) textFieldColors2.leadingIconColor(z22, z23, composer3, i24 | ((i25 << 3) & 112) | ((i25 >> 3) & 896)).getValue()).getValue();
                            composer3.endReplaceableGroup();
                        }
                        final Function2 function220 = function215;
                        ComposableLambda composableLambda3 = function220 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, r14, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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
                            public final void invoke(@Nullable Composer composer4, int i26) {
                                if ((i26 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                } else {
                                    TextFieldImplKt.m1042DecorationeuL9pac(value2, null, null, function220, composer4, 0, 6);
                                }
                            }
                        }) : null;
                        if (colors instanceof TextFieldColorsWithIcons) {
                            composer3.startReplaceableGroup(-1083197452);
                            TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) colors;
                            boolean z24 = z14;
                            boolean z25 = z13;
                            InteractionSource interactionSource3 = interactionSource;
                            int i26 = (i11 >> 27) & 14;
                            int i27 = i16;
                            value3 = ((Color) textFieldColorsWithIcons2.trailingIconColor(z24, z25, interactionSource3, composer3, ((i27 << 3) & 896) | i26 | ((i27 << 3) & 112)).getValue()).getValue();
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-1083197355);
                            TextFieldColors textFieldColors3 = colors;
                            boolean z26 = z14;
                            boolean z27 = z13;
                            int i28 = (i11 >> 27) & 14;
                            int i29 = i16;
                            value3 = ((Color) textFieldColors3.trailingIconColor(z26, z27, composer3, i28 | ((i29 << 3) & 112) | ((i29 >> 3) & 896)).getValue()).getValue();
                            composer3.endReplaceableGroup();
                        }
                        final Function2 function221 = function216;
                        ComposableLambda composableLambda4 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, r14, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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
                            public final void invoke(@Nullable Composer composer4, int i30) {
                                if ((i30 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                } else {
                                    TextFieldImplKt.m1042DecorationeuL9pac(value3, null, null, function221, composer4, 0, 6);
                                }
                            }
                        }) : null;
                        int i30 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                        if (i30 == r14) {
                            composer3.startReplaceableGroup(-1083197019);
                            Function2 function222 = innerTextField;
                            boolean z28 = z15;
                            PaddingValues paddingValues = contentPadding;
                            int i31 = i11;
                            TextFieldKt.TextFieldLayout(semantics$default, function222, composableLambda, composableLambda2, composableLambda3, composableLambda4, z28, f, paddingValues, composer3, ((i31 >> 6) & 3670016) | ((i31 >> 3) & 112) | ((i19 << 21) & 29360128) | ((i16 << 18) & 234881024));
                            composer3.endReplaceableGroup();
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        if (i30 == 2) {
                            composer3.startReplaceableGroup(-1083196463);
                            composer3.startReplaceableGroup(-492369756);
                            Object rememberedValue3 = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (rememberedValue3 == companion3.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1329boximpl(Size.INSTANCE.m1341getZeroNHjbRc()), null, 2, null);
                                composer3.updateRememberedValue(rememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            final MutableState mutableState = (MutableState) rememberedValue3;
                            final PaddingValues paddingValues2 = contentPadding;
                            final Function2 function223 = function217;
                            final int i32 = i16;
                            ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, r14, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
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
                                public final void invoke(@Nullable Composer composer4, int i33) {
                                    if ((i33 & 11) != 2 || !composer4.getSkipping()) {
                                        Modifier m924outlineCutout12SF9DM = OutlinedTextFieldKt.m924outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, "border"), ((Size) mutableState.getValue()).getPackedValue(), paddingValues2);
                                        Function2 function224 = function223;
                                        int i34 = i32;
                                        composer4.startReplaceableGroup(733328855);
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
                                        composer4.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion4.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(m924outlineCutout12SF9DM);
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer4);
                                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion4.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1029492925);
                                        if (function224 != null) {
                                            function224.invoke(composer4, Integer.valueOf((i34 >> 12) & 14));
                                        }
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                            Function2 function224 = innerTextField;
                            boolean z29 = z15;
                            Object valueOf2 = Float.valueOf(f);
                            composer3.startReplaceableGroup(511388516);
                            boolean changed3 = composer3.changed(valueOf2) | composer3.changed(mutableState);
                            Object rememberedValue4 = composer3.rememberedValue();
                            if (changed3 || rememberedValue4 == companion3.getEmpty()) {
                                rememberedValue4 = new Function1() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m1044invokeuvyYCjk(((Size) obj).getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                    public final void m1044invokeuvyYCjk(long j4) {
                                        float m1335getWidthimpl = Size.m1335getWidthimpl(j4) * f;
                                        float m1333getHeightimpl = Size.m1333getHeightimpl(j4) * f;
                                        if (Size.m1335getWidthimpl(((Size) mutableState.getValue()).getPackedValue()) == m1335getWidthimpl && Size.m1333getHeightimpl(((Size) mutableState.getValue()).getPackedValue()) == m1333getHeightimpl) {
                                            return;
                                        }
                                        mutableState.setValue(Size.m1329boximpl(SizeKt.Size(m1335getWidthimpl, m1333getHeightimpl)));
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            Function1 function1 = (Function1) rememberedValue4;
                            PaddingValues paddingValues3 = contentPadding;
                            int i33 = i11;
                            OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function224, composableLambda2, composableLambda, composableLambda3, composableLambda4, z29, f, function1, composableLambda5, paddingValues3, composer3, ((i33 >> 6) & 3670016) | ((i33 >> 3) & 112) | C.ENCODING_PCM_32BIT | ((i19 << 21) & 29360128), (i16 >> 6) & 14);
                            composer3.endReplaceableGroup();
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        }
                        composer3.startReplaceableGroup(-1083194976);
                        composer3.endReplaceableGroup();
                        Unit unit3 = Unit.INSTANCE;
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 1769472);
            function26 = function210;
            function27 = function211;
            function28 = function212;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            function29 = function213;
        } else {
            startRestartGroup.skipToGroupEnd();
            function26 = function22;
            function27 = function23;
            function28 = function24;
            z4 = z;
            z5 = z2;
            z6 = z3;
            function29 = function25;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i17) {
                TextFieldImplKt.CommonDecorationBox(TextFieldType.this, value, innerTextField, visualTransformation, function2, function26, function27, function28, z4, z5, z6, interactionSource, contentPadding, colors, function29, composer3, i | 1, i2, i3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1042DecorationeuL9pac(final long j, TextStyle textStyle, Float f, final Function2 content, Composer composer, final int i, final int i2) {
        int i3;
        TextStyle textStyle2;
        int i4;
        final Float f2;
        final int i5;
        TextStyle textStyle3;
        final TextStyle textStyle4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-399493340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            textStyle2 = textStyle;
            i3 |= startRestartGroup.changed(textStyle2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
                }
                i5 = i3;
                if ((i5 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    textStyle3 = i6 != 0 ? null : textStyle2;
                    Float f3 = i4 != 0 ? null : f2;
                    final Float f4 = f3;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i7) {
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j))};
                                final Float f5 = f4;
                                final Function2 function2 = content;
                                final int i8 = i5;
                                final long j2 = j;
                                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i9) {
                                        if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                            if (f5 != null) {
                                                composer3.startReplaceableGroup(-452622131);
                                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                                composer3.endReplaceableGroup();
                                                return;
                                            } else {
                                                composer3.startReplaceableGroup(-452621951);
                                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                                composer3.endReplaceableGroup();
                                                return;
                                            }
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 56);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    });
                    if (textStyle3 != null) {
                        startRestartGroup.startReplaceableGroup(-2009952864);
                        TextKt.ProvideTextStyle(textStyle3, composableLambda, startRestartGroup, ((i5 >> 3) & 14) | 48);
                    } else {
                        startRestartGroup.startReplaceableGroup(-2009952812);
                        composableLambda.invoke(startRestartGroup, 6);
                    }
                    startRestartGroup.endReplaceableGroup();
                    textStyle4 = textStyle3;
                    f2 = f3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    textStyle4 = textStyle2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i7) {
                        TextFieldImplKt.m1042DecorationeuL9pac(j, textStyle4, f2, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            f2 = f;
            if ((i2 & 8) != 0) {
            }
            i5 = i3;
            if ((i5 & 5851) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            final Float f42 = f3;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j))};
                        final Float f5 = f42;
                        final Function2 function2 = content;
                        final int i8 = i5;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i9) {
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (f5 != null) {
                                        composer3.startReplaceableGroup(-452622131);
                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                        return;
                                    } else {
                                        composer3.startReplaceableGroup(-452621951);
                                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (textStyle3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            textStyle4 = textStyle3;
            f2 = f3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        textStyle2 = textStyle;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i2 & 8) != 0) {
        }
        i5 = i3;
        if ((i5 & 5851) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        final Float f422 = f3;
        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i7) {
                if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j))};
                    final Float f5 = f422;
                    final Function2 function2 = content;
                    final int i8 = i5;
                    final long j2 = j;
                    CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i9) {
                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                if (f5 != null) {
                                    composer3.startReplaceableGroup(-452622131);
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f5)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                    return;
                                } else {
                                    composer3.startReplaceableGroup(-452621951);
                                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        if (textStyle3 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        textStyle4 = textStyle3;
        f2 = f3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 48;
        IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m345defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(f));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
