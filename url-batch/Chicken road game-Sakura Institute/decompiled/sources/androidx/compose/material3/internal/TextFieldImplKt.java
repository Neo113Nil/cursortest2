package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00012\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a-\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a5\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0006\u0010P\u001a\u00020Q2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a×\u0001\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020L2\u0006\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020L2\u0006\u0010Z\u001a\u00020?2\u0099\u0001\u0010M\u001a\u0094\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(`\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(c\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020.0[¢\u0006\u0002\b4H\u0083\bø\u0001\u0000¢\u0006\u0004\be\u0010f\u001aH\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\\2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010i\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0012\u0010n\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u0012\u0010q\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u001c\u0010r\u001a\u00020\b*\u00020\b2\u0006\u0010A\u001a\u00020?2\u0006\u0010s\u001a\u00020\u0001H\u0000\u001a\u001c\u0010t\u001a\u00020\b*\u00020\b2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020xH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0012\u0010\u0005\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0019\u0010\u0005\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u001d\u0010\u0005\"\u000e\u0010\u001e\u001a\u00020\u0014X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010 \u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b!\u0010\u0005\"\u000e\u0010\"\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006y²\u0006\n\u0010z\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010{\u001a\u00020?X\u008a\u0084\u0002"}, d2 = {"ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldAnimationDuration", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/internal/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "content", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextFieldTransitionScope", "inputState", "Landroidx/compose/material3/internal/InputPhase;", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "labelColor", "showLabel", "Lkotlin/Function5;", "Landroidx/compose/runtime/State;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "TextFieldTransitionScope-Jy8F4Js", "(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "animateBorderStrokeAsState", "Landroidx/compose/foundation/BorderStroke;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "defaultErrorMessage", "textFieldBackground", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "shape", "Landroidx/compose/ui/graphics/Shape;", "material3_release", "showPlaceholder", "showPrefixSuffix"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final int TextFieldAnimationDuration = 150;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = Dp.m6299constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m6299constructorimpl(4);
    private static final float PrefixSuffixTextPadding = Dp.m6299constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m6299constructorimpl(24);

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x054b, code lost:
    
        if (r6 != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x04f9, code lost:
    
        if (r6 != false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(final TextFieldType textFieldType, final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, boolean z, boolean z2, boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final TextFieldColors textFieldColors, final Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        Object filter;
        long m2336labelColorXeAY9LY$material3_release;
        final TextStyle bodyLarge;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        boolean z5;
        long m5814getColor0d7_KjU;
        long m5814getColor0d7_KjU2;
        long j;
        Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        boolean z6;
        String str2;
        int i18;
        float f;
        boolean z7;
        int i19;
        float f2;
        int i20;
        float f3;
        boolean z8;
        int i21;
        float f4;
        int i22;
        float f5;
        State state;
        int i23;
        boolean changed;
        Object rememberedValue;
        InputPhase inputPhase;
        boolean changed2;
        Object rememberedValue2;
        int i24;
        ComposableLambda rememberComposableLambda;
        Object rememberedValue3;
        final State state2;
        ComposableLambda composableLambda;
        Object rememberedValue4;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        ComposableLambda rememberComposableLambda2;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        ComposableLambda rememberComposableLambda3;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        int i25;
        ComposableLambda rememberComposableLambda4;
        int i26;
        Function2<? super Composer, ? super Integer, Unit> function219;
        boolean z9;
        boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        final boolean z12;
        ScopeUpdateScope endRestartGroup;
        int i27;
        int i28;
        Composer startRestartGroup = composer.startRestartGroup(1514469103);
        ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)P(15,16,4,17,7,9,8,14,10,12,13,11,3,6,5,2)98@4054L121,104@4251L25,114@4594L10,121@4911L7503:TextFieldImpl.kt#mqatfk");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldType) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function26) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changedInstance(function27) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i11 = i2 | (startRestartGroup.changedInstance(function28) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) == 0) {
                    i11 |= startRestartGroup.changed(z) ? 32 : 16;
                }
                int i29 = i11;
                i13 = i3 & 4096;
                if (i13 != 0) {
                    i29 |= 384;
                    i14 = i13;
                } else {
                    i14 = i13;
                    if ((i2 & 384) == 0) {
                        i29 |= startRestartGroup.changed(z2) ? 256 : 128;
                        i15 = i3 & 8192;
                        if (i15 == 0) {
                            i29 |= 3072;
                            i16 = i15;
                        } else {
                            i16 = i15;
                            if ((i2 & 3072) == 0) {
                                i29 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                if ((i3 & 16384) != 0) {
                                    i29 |= 24576;
                                } else if ((i2 & 24576) == 0) {
                                    i29 |= startRestartGroup.changed(interactionSource) ? 16384 : 8192;
                                }
                                if ((32768 & i3) != 0) {
                                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else {
                                    if ((196608 & i2) == 0) {
                                        i17 = startRestartGroup.changed(paddingValues) ? 131072 : 65536;
                                    }
                                    if ((65536 & i3) != 0) {
                                        i28 = (1572864 & i2) == 0 ? startRestartGroup.changed(textFieldColors) ? 1048576 : 524288 : 1572864;
                                        if ((131072 & i3) == 0) {
                                            i27 = (12582912 & i2) == 0 ? startRestartGroup.changedInstance(function29) ? 8388608 : 4194304 : 12582912;
                                            if ((306783379 & i4) != 306783378 && (4793491 & i29) == 4793490 && startRestartGroup.getSkipping()) {
                                                startRestartGroup.skipToGroupEnd();
                                                function215 = function23;
                                                function220 = function24;
                                                function221 = function25;
                                                function222 = function26;
                                                function224 = function27;
                                                function223 = function28;
                                                z9 = z2;
                                                z11 = z;
                                                z12 = z3;
                                            } else {
                                                Function2<? super Composer, ? super Integer, Unit> function225 = i5 == 0 ? null : function23;
                                                Function2<? super Composer, ? super Integer, Unit> function226 = i6 == 0 ? null : function24;
                                                Function2<? super Composer, ? super Integer, Unit> function227 = i7 == 0 ? null : function25;
                                                Function2<? super Composer, ? super Integer, Unit> function228 = i8 == 0 ? null : function26;
                                                Function2<? super Composer, ? super Integer, Unit> function229 = i9 == 0 ? null : function27;
                                                Function2<? super Composer, ? super Integer, Unit> function230 = i10 == 0 ? null : function28;
                                                boolean z13 = i12 == 0 ? false : z;
                                                boolean z14 = i14 == 0 ? true : z2;
                                                boolean z15 = i16 == 0 ? false : z3;
                                                boolean z16 = z13;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1514469103, i4, i29, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                                                }
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                int i30 = i4;
                                                z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                                if (!z4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                                    startRestartGroup.updateRememberedValue(filter);
                                                } else {
                                                    filter = rememberedValue5;
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                String text = ((TransformedText) filter).getText().getText();
                                                boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i29 >> 12) & 14).getValue().booleanValue();
                                                InputPhase inputPhase2 = !booleanValue ? InputPhase.Focused : text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                                                m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue);
                                                int i31 = i29;
                                                Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                                bodyLarge = typography.getBodyLarge();
                                                final TextStyle bodySmall = typography.getBodySmall();
                                                function210 = function228;
                                                function211 = function230;
                                                function212 = function226;
                                                z5 = !(Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU()) || Color.m3841equalsimpl0(bodySmall.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) || (!Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU()) && Color.m3841equalsimpl0(bodySmall.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU()));
                                                m5814getColor0d7_KjU = bodySmall.m5814getColor0d7_KjU();
                                                if (z5 && m5814getColor0d7_KjU == 16) {
                                                    m5814getColor0d7_KjU = m2336labelColorXeAY9LY$material3_release;
                                                }
                                                m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
                                                if (z5 && m5814getColor0d7_KjU2 == 16) {
                                                    m5814getColor0d7_KjU2 = m2336labelColorXeAY9LY$material3_release;
                                                }
                                                j = m5814getColor0d7_KjU;
                                                boolean z17 = function22 == null;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                                                function213 = function227;
                                                Transition updateTransition = TransitionKt.updateTransition(inputPhase2, "TextFieldInputState", startRestartGroup, 48, 0);
                                                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                function214 = function229;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                InputPhase inputPhase3 = (InputPhase) updateTransition.getCurrentState();
                                                startRestartGroup.startReplaceGroup(-2036730335);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                function215 = function225;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    z6 = z14;
                                                    str2 = "CC(remember):TextFieldImpl.kt#9igjgp";
                                                } else {
                                                    str2 = "CC(remember):TextFieldImpl.kt#9igjgp";
                                                    z6 = z14;
                                                    ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                                                }
                                                i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase3.ordinal()];
                                                float f6 = 1.0f;
                                                if (i18 != 1) {
                                                    if (i18 == 2) {
                                                        f = 0.0f;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        Float valueOf = Float.valueOf(f);
                                                        InputPhase inputPhase4 = (InputPhase) updateTransition.getTargetState();
                                                        startRestartGroup.startReplaceGroup(-2036730335);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            z7 = z15;
                                                            ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                                                        } else {
                                                            z7 = z15;
                                                        }
                                                        i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase4.ordinal()];
                                                        if (i19 != 1) {
                                                            if (i19 == 2) {
                                                                f2 = 0.0f;
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                InputPhase inputPhase5 = (InputPhase) updateTransition.getCurrentState();
                                                                startRestartGroup.startReplaceGroup(1435837472);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                                                                }
                                                                i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase5.ordinal()];
                                                                if (i20 != 1) {
                                                                    if (i20 != 2) {
                                                                        if (i20 != 3) {
                                                                            throw new NoWhenBranchMatchedException();
                                                                        }
                                                                    }
                                                                    f3 = 0.0f;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    Float valueOf2 = Float.valueOf(f3);
                                                                    InputPhase inputPhase6 = (InputPhase) updateTransition.getTargetState();
                                                                    startRestartGroup.startReplaceGroup(1435837472);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        z8 = booleanValue;
                                                                        ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                                                                    } else {
                                                                        z8 = booleanValue;
                                                                    }
                                                                    i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase6.ordinal()];
                                                                    if (i21 != 1) {
                                                                        if (i21 != 2) {
                                                                            if (i21 != 3) {
                                                                                throw new NoWhenBranchMatchedException();
                                                                            }
                                                                        }
                                                                        f4 = 0.0f;
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                                        TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                        InputPhase inputPhase7 = (InputPhase) updateTransition.getCurrentState();
                                                                        startRestartGroup.startReplaceGroup(1128033978);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                                                        }
                                                                        i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase7.ordinal()];
                                                                        if (i22 != 1) {
                                                                            if (i22 != 2) {
                                                                                if (i22 != 3) {
                                                                                    throw new NoWhenBranchMatchedException();
                                                                                }
                                                                            } else if (z17) {
                                                                                f5 = 0.0f;
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                Float valueOf3 = Float.valueOf(f5);
                                                                                InputPhase inputPhase8 = (InputPhase) updateTransition.getTargetState();
                                                                                startRestartGroup.startReplaceGroup(1128033978);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    state = createTransitionAnimation2;
                                                                                    ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                                                                } else {
                                                                                    state = createTransitionAnimation2;
                                                                                }
                                                                                i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase8.ordinal()];
                                                                                if (i23 != 1) {
                                                                                    if (i23 != 2) {
                                                                                        if (i23 != 3) {
                                                                                            throw new NoWhenBranchMatchedException();
                                                                                        }
                                                                                    } else if (z17) {
                                                                                        f6 = 0.0f;
                                                                                    }
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                                InputPhase inputPhase9 = (InputPhase) updateTransition.getTargetState();
                                                                                startRestartGroup.startReplaceGroup(-107432127);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                                                }
                                                                                long j2 = WhenMappings.$EnumSwitchMapping$1[inputPhase9.ordinal()] == 1 ? j : m5814getColor0d7_KjU2;
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                ColorSpace m3844getColorSpaceimpl = Color.m3844getColorSpaceimpl(j2);
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                                changed = startRestartGroup.changed(m3844getColorSpaceimpl);
                                                                                rememberedValue = startRestartGroup.rememberedValue();
                                                                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl);
                                                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                                                }
                                                                                TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                                InputPhase inputPhase10 = (InputPhase) updateTransition.getCurrentState();
                                                                                startRestartGroup.startReplaceGroup(-107432127);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                                                }
                                                                                long j3 = WhenMappings.$EnumSwitchMapping$1[inputPhase10.ordinal()] == 1 ? j : m5814getColor0d7_KjU2;
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                Color m3830boximpl = Color.m3830boximpl(j3);
                                                                                inputPhase = (InputPhase) updateTransition.getTargetState();
                                                                                startRestartGroup.startReplaceGroup(-107432127);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                                                }
                                                                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                                                                    j = m5814getColor0d7_KjU2;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                                startRestartGroup.startReplaceGroup(1023351670);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                ColorSpace m3844getColorSpaceimpl2 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                                changed2 = startRestartGroup.changed(m3844getColorSpaceimpl2);
                                                                                rememberedValue2 = startRestartGroup.rememberedValue();
                                                                                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl2);
                                                                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                                                                }
                                                                                TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue2;
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                                startRestartGroup.startReplaceGroup(1023351670);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                Color m3830boximpl2 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                                                                startRestartGroup.startReplaceGroup(1023351670);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    i24 = 0;
                                                                                    ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                                                } else {
                                                                                    i24 = 0;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl2, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter2, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                                                final float floatValue = ((Number) createTransitionAnimation.getValue()).floatValue();
                                                                                startRestartGroup.startReplaceGroup(-156998101);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                                                                if (function22 == null) {
                                                                                    rememberComposableLambda = null;
                                                                                } else {
                                                                                    final boolean z18 = z5;
                                                                                    rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1236585568, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                            invoke(composer2, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer2, int i32) {
                                                                                            TextStyle textStyle;
                                                                                            TextStyle m5810copyp1EtxEg;
                                                                                            ComposerKt.sourceInformation(composer2, "C147@6101L55:TextFieldImpl.kt#mqatfk");
                                                                                            if ((i32 & 3) != 2 || !composer2.getSkipping()) {
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventStart(-1236585568, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
                                                                                                }
                                                                                                TextStyle lerp = TextStyleKt.lerp(TextStyle.this, bodySmall, floatValue);
                                                                                                boolean z19 = z18;
                                                                                                State<Color> state3 = createTransitionAnimation4;
                                                                                                if (z19) {
                                                                                                    m5810copyp1EtxEg = lerp.m5810copyp1EtxEg((r48 & 1) != 0 ? lerp.spanStyle.m5734getColor0d7_KjU() : state3.getValue().m3850unboximpl(), (r48 & 2) != 0 ? lerp.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? lerp.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? lerp.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? lerp.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? lerp.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? lerp.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? lerp.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? lerp.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? lerp.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? lerp.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? lerp.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? lerp.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? lerp.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? lerp.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? lerp.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? lerp.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? lerp.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? lerp.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? lerp.platformStyle : null, (r48 & 1048576) != 0 ? lerp.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? lerp.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? lerp.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? lerp.paragraphStyle.getTextMotion() : null);
                                                                                                    textStyle = m5810copyp1EtxEg;
                                                                                                } else {
                                                                                                    textStyle = lerp;
                                                                                                }
                                                                                                TextFieldImplKt.m2657Decoration3JVO9M(createTransitionAnimation5.getValue().m3850unboximpl(), textStyle, function22, composer2, 0);
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventEnd();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            composer2.skipToGroupEnd();
                                                                                        }
                                                                                    }, startRestartGroup, 54);
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                boolean z19 = z6;
                                                                                boolean z20 = z7;
                                                                                boolean z21 = z8;
                                                                                final long m2338placeholderColorXeAY9LY$material3_release = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z19, z20, z21);
                                                                                String str3 = str2;
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str3);
                                                                                rememberedValue3 = startRestartGroup.rememberedValue();
                                                                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                                    state2 = state;
                                                                                    rememberedValue3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(0);
                                                                                        }

                                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                        public final Boolean invoke() {
                                                                                            return Boolean.valueOf(state2.getValue().floatValue() > 0.0f);
                                                                                        }
                                                                                    });
                                                                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                                                                } else {
                                                                                    state2 = state;
                                                                                }
                                                                                State state3 = (State) rememberedValue3;
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                startRestartGroup.startReplaceGroup(-156965270);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                                                                if (function215 == null && text.length() == 0 && CommonDecorationBox$lambda$15$lambda$7(state3)) {
                                                                                    final State state4 = state2;
                                                                                    composableLambda = ComposableLambdaKt.rememberComposableLambda(-660524084, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(3);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function3
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer2, Integer num) {
                                                                                            invoke(modifier, composer2, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Modifier modifier, Composer composer2, int i32) {
                                                                                            ComposerKt.sourceInformation(composer2, "C161@6826L34,161@6799L310:TextFieldImpl.kt#mqatfk");
                                                                                            if ((i32 & 6) == 0) {
                                                                                                i32 |= composer2.changed(modifier) ? 4 : 2;
                                                                                            }
                                                                                            if ((i32 & 19) == 18 && composer2.getSkipping()) {
                                                                                                composer2.skipToGroupEnd();
                                                                                                return;
                                                                                            }
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-660524084, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
                                                                                            }
                                                                                            ComposerKt.sourceInformationMarkerStart(composer2, -1325817438, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                            boolean changed3 = composer2.changed(state4);
                                                                                            final State<Float> state5 = state4;
                                                                                            Object rememberedValue6 = composer2.rememberedValue();
                                                                                            if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                                rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1$1$1
                                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                    {
                                                                                                        super(1);
                                                                                                    }

                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                                                        invoke2(graphicsLayerScope);
                                                                                                        return Unit.INSTANCE;
                                                                                                    }

                                                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                                                        graphicsLayerScope.setAlpha(state5.getValue().floatValue());
                                                                                                    }
                                                                                                };
                                                                                                composer2.updateRememberedValue(rememberedValue6);
                                                                                            }
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) rememberedValue6);
                                                                                            long j4 = m2338placeholderColorXeAY9LY$material3_release;
                                                                                            TextStyle textStyle = bodyLarge;
                                                                                            Function2<Composer, Integer, Unit> function231 = function215;
                                                                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
                                                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                                                                ComposablesKt.invalidApplier();
                                                                                            }
                                                                                            composer2.startReusableNode();
                                                                                            if (composer2.getInserting()) {
                                                                                                composer2.createNode(constructor);
                                                                                            } else {
                                                                                                composer2.useNode();
                                                                                            }
                                                                                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                                                                            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                            }
                                                                                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                            ComposerKt.sourceInformationMarkerStart(composer2, -1245776707, "C162@6888L199:TextFieldImpl.kt#mqatfk");
                                                                                            TextFieldImplKt.m2657Decoration3JVO9M(j4, textStyle, function231, composer2, 0);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            composer2.endNode();
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                            }
                                                                                        }
                                                                                    }, startRestartGroup, 54);
                                                                                } else {
                                                                                    composableLambda = null;
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final long m2339prefixColorXeAY9LY$material3_release = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z19, z20, z21);
                                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str3);
                                                                                rememberedValue4 = startRestartGroup.rememberedValue();
                                                                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                                    rememberedValue4 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(0);
                                                                                        }

                                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                        public final Boolean invoke() {
                                                                                            return Boolean.valueOf(createTransitionAnimation3.getValue().floatValue() > 0.0f);
                                                                                        }
                                                                                    });
                                                                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                                                                }
                                                                                State state5 = (State) rememberedValue4;
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                startRestartGroup.startReplaceGroup(-156940524);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                                                                ComposableLambda rememberComposableLambda5 = (function210 == null && CommonDecorationBox$lambda$15$lambda$9(state5)) ? ComposableLambdaKt.rememberComposableLambda(274398694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                    {
                                                                                        super(2);
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                        invoke(composer2, num.intValue());
                                                                                        return Unit.INSTANCE;
                                                                                    }

                                                                                    public final void invoke(Composer composer2, int i32) {
                                                                                        ComposerKt.sourceInformation(composer2, "C178@7556L35,178@7529L301:TextFieldImpl.kt#mqatfk");
                                                                                        if ((i32 & 3) == 2 && composer2.getSkipping()) {
                                                                                            composer2.skipToGroupEnd();
                                                                                            return;
                                                                                        }
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventStart(274398694, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
                                                                                        }
                                                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1325794077, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                        boolean changed3 = composer2.changed(createTransitionAnimation3);
                                                                                        final State<Float> state6 = createTransitionAnimation3;
                                                                                        Object rememberedValue6 = composer2.rememberedValue();
                                                                                        if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                            rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1$1$1
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(1);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                                                    invoke2(graphicsLayerScope);
                                                                                                    return Unit.INSTANCE;
                                                                                                }

                                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                                                    graphicsLayerScope.setAlpha(state6.getValue().floatValue());
                                                                                                }
                                                                                            };
                                                                                            composer2.updateRememberedValue(rememberedValue6);
                                                                                        }
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue6);
                                                                                        long j4 = m2339prefixColorXeAY9LY$material3_release;
                                                                                        TextStyle textStyle = bodyLarge;
                                                                                        Function2<Composer, Integer, Unit> function231 = function210;
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
                                                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                        if (!(composer2.getApplier() instanceof Applier)) {
                                                                                            ComposablesKt.invalidApplier();
                                                                                        }
                                                                                        composer2.startReusableNode();
                                                                                        if (composer2.getInserting()) {
                                                                                            composer2.createNode(constructor);
                                                                                        } else {
                                                                                            composer2.useNode();
                                                                                        }
                                                                                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                                                                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                        }
                                                                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1245051865, "C179@7619L189:TextFieldImpl.kt#mqatfk");
                                                                                        TextFieldImplKt.m2657Decoration3JVO9M(j4, textStyle, function231, composer2, 0);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        composer2.endNode();
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventEnd();
                                                                                        }
                                                                                    }
                                                                                }, startRestartGroup, 54) : null;
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final long m2340suffixColorXeAY9LY$material3_release = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z19, z20, z21);
                                                                                startRestartGroup.startReplaceGroup(-156921964);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                                                                ComposableLambda rememberComposableLambda6 = (function214 == null && CommonDecorationBox$lambda$15$lambda$9(state5)) ? ComposableLambdaKt.rememberComposableLambda(-1526229403, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                    {
                                                                                        super(2);
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                        invoke(composer2, num.intValue());
                                                                                        return Unit.INSTANCE;
                                                                                    }

                                                                                    public final void invoke(Composer composer2, int i32) {
                                                                                        ComposerKt.sourceInformation(composer2, "C192@8136L35,192@8109L301:TextFieldImpl.kt#mqatfk");
                                                                                        if ((i32 & 3) == 2 && composer2.getSkipping()) {
                                                                                            composer2.skipToGroupEnd();
                                                                                            return;
                                                                                        }
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventStart(-1526229403, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
                                                                                        }
                                                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1325775517, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                        boolean changed3 = composer2.changed(createTransitionAnimation3);
                                                                                        final State<Float> state6 = createTransitionAnimation3;
                                                                                        Object rememberedValue6 = composer2.rememberedValue();
                                                                                        if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                            rememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1$1$1
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(1);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                                                    invoke2(graphicsLayerScope);
                                                                                                    return Unit.INSTANCE;
                                                                                                }

                                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                                                    graphicsLayerScope.setAlpha(state6.getValue().floatValue());
                                                                                                }
                                                                                            };
                                                                                            composer2.updateRememberedValue(rememberedValue6);
                                                                                        }
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue6);
                                                                                        long j4 = m2340suffixColorXeAY9LY$material3_release;
                                                                                        TextStyle textStyle = bodyLarge;
                                                                                        Function2<Composer, Integer, Unit> function231 = function214;
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
                                                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                        if (!(composer2.getApplier() instanceof Applier)) {
                                                                                            ComposablesKt.invalidApplier();
                                                                                        }
                                                                                        composer2.startReusableNode();
                                                                                        if (composer2.getInserting()) {
                                                                                            composer2.createNode(constructor);
                                                                                        } else {
                                                                                            composer2.useNode();
                                                                                        }
                                                                                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                                                                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                        }
                                                                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1244476505, "C193@8199L189:TextFieldImpl.kt#mqatfk");
                                                                                        TextFieldImplKt.m2657Decoration3JVO9M(j4, textStyle, function231, composer2, 0);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        composer2.endNode();
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventEnd();
                                                                                        }
                                                                                    }
                                                                                }, startRestartGroup, 54) : null;
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final long m2337leadingIconColorXeAY9LY$material3_release = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z19, z20, z21);
                                                                                startRestartGroup.startReplaceGroup(-156902962);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                                                                if (function212 == null) {
                                                                                    function216 = function212;
                                                                                    rememberComposableLambda2 = null;
                                                                                } else {
                                                                                    function216 = function212;
                                                                                    rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-130107406, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                            invoke(composer2, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer2, int i32) {
                                                                                            ComposerKt.sourceInformation(composer2, "C205@8657L57:TextFieldImpl.kt#mqatfk");
                                                                                            if ((i32 & 3) == 2 && composer2.getSkipping()) {
                                                                                                composer2.skipToGroupEnd();
                                                                                                return;
                                                                                            }
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-130107406, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
                                                                                            }
                                                                                            TextFieldImplKt.m2658DecorationIv8Zu3U(m2337leadingIconColorXeAY9LY$material3_release, function216, composer2, 0);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                            }
                                                                                        }
                                                                                    }, startRestartGroup, 54);
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final long m2343trailingIconColorXeAY9LY$material3_release = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z19, z20, z21);
                                                                                startRestartGroup.startReplaceGroup(-156893937);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                                                                if (function213 == null) {
                                                                                    function217 = function213;
                                                                                    rememberComposableLambda3 = null;
                                                                                } else {
                                                                                    function217 = function213;
                                                                                    rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(2079816678, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                            invoke(composer2, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer2, int i32) {
                                                                                            ComposerKt.sourceInformation(composer2, "C211@8939L58:TextFieldImpl.kt#mqatfk");
                                                                                            if ((i32 & 3) == 2 && composer2.getSkipping()) {
                                                                                                composer2.skipToGroupEnd();
                                                                                                return;
                                                                                            }
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(2079816678, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
                                                                                            }
                                                                                            TextFieldImplKt.m2658DecorationIv8Zu3U(m2343trailingIconColorXeAY9LY$material3_release, function217, composer2, 0);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                            }
                                                                                        }
                                                                                    }, startRestartGroup, 54);
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                final long m2341supportingTextColorXeAY9LY$material3_release = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z19, z20, z21);
                                                                                startRestartGroup.startReplaceGroup(-156884470);
                                                                                ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                                                                if (function211 == null) {
                                                                                    function218 = function211;
                                                                                    rememberComposableLambda4 = null;
                                                                                    i25 = 1;
                                                                                } else {
                                                                                    function218 = function211;
                                                                                    i25 = 1;
                                                                                    rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1263707005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                            invoke(composer2, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer2, int i32) {
                                                                                            ComposerKt.sourceInformation(composer2, "C218@9250L177:TextFieldImpl.kt#mqatfk");
                                                                                            if ((i32 & 3) != 2 || !composer2.getSkipping()) {
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventStart(1263707005, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
                                                                                                }
                                                                                                TextFieldImplKt.m2657Decoration3JVO9M(m2341supportingTextColorXeAY9LY$material3_release, bodySmall, function218, composer2, 0);
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventEnd();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            composer2.skipToGroupEnd();
                                                                                        }
                                                                                    }, startRestartGroup, 54);
                                                                                }
                                                                                startRestartGroup.endReplaceGroup();
                                                                                i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                                                if (i26 == i25) {
                                                                                    function219 = function218;
                                                                                    z9 = z19;
                                                                                    z10 = z20;
                                                                                    startRestartGroup.startReplaceGroup(-568105095);
                                                                                    ComposerKt.sourceInformation(startRestartGroup, "228@9583L167,234@9768L769");
                                                                                    TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, rememberComposableLambda, composableLambda, rememberComposableLambda2, rememberComposableLambda3, rememberComposableLambda5, rememberComposableLambda6, z16, floatValue, ComposableLambdaKt.rememberComposableLambda(1750327932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                            invoke(composer2, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer2, int i32) {
                                                                                            ComposerKt.sourceInformation(composer2, "C229@9605L127:TextFieldImpl.kt#mqatfk");
                                                                                            if ((i32 & 3) != 2 || !composer2.getSkipping()) {
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventStart(1750327932, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
                                                                                                }
                                                                                                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId);
                                                                                                Function2<Composer, Integer, Unit> function231 = function29;
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, layoutId);
                                                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                                                                    ComposablesKt.invalidApplier();
                                                                                                }
                                                                                                composer2.startReusableNode();
                                                                                                if (composer2.getInserting()) {
                                                                                                    composer2.createNode(constructor);
                                                                                                } else {
                                                                                                    composer2.useNode();
                                                                                                }
                                                                                                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                                                                                Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                                }
                                                                                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -1242994023, "C230@9699L11:TextFieldImpl.kt#mqatfk");
                                                                                                function231.invoke(composer2, 0);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                composer2.endNode();
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventEnd();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            composer2.skipToGroupEnd();
                                                                                        }
                                                                                    }, startRestartGroup, 54), rememberComposableLambda4, paddingValues, startRestartGroup, ((i30 >> 3) & 112) | 6 | ((i31 << 21) & 234881024), ((i31 >> 9) & 896) | 6);
                                                                                    startRestartGroup.endReplaceGroup();
                                                                                    Unit unit = Unit.INSTANCE;
                                                                                } else if (i26 != 2) {
                                                                                    startRestartGroup.startReplaceGroup(-565271199);
                                                                                    startRestartGroup.endReplaceGroup();
                                                                                    Unit unit2 = Unit.INSTANCE;
                                                                                    function219 = function218;
                                                                                    z9 = z19;
                                                                                    z10 = z20;
                                                                                } else {
                                                                                    startRestartGroup.startReplaceGroup(-567018607);
                                                                                    ComposerKt.sourceInformation(startRestartGroup, "253@10659L38,254@10766L314,275@11639L463,264@11098L1286");
                                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156837817, str3);
                                                                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                                                                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                        rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3656boximpl(Size.INSTANCE.m3677getZeroNHjbRc()), null, 2, null);
                                                                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                                                                    }
                                                                                    final MutableState mutableState = (MutableState) rememberedValue6;
                                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                    function219 = function218;
                                                                                    z9 = z19;
                                                                                    z10 = z20;
                                                                                    ComposableLambda rememberComposableLambda7 = ComposableLambdaKt.rememberComposableLambda(157291737, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                        {
                                                                                            super(2);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                                                            invoke(composer2, num.intValue());
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        public final void invoke(Composer composer2, int i32) {
                                                                                            ComposerKt.sourceInformation(composer2, "C255@10788L274:TextFieldImpl.kt#mqatfk");
                                                                                            if ((i32 & 3) != 2 || !composer2.getSkipping()) {
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventStart(157291737, i32, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                                                                                                }
                                                                                                Modifier outlineCutout = OutlinedTextFieldKt.outlineCutout(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId), new MutablePropertyReference0Impl(mutableState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1.1
                                                                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                                                                    public Object get() {
                                                                                                        return ((MutableState) this.receiver).getValue();
                                                                                                    }

                                                                                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                                                                    public void set(Object obj) {
                                                                                                        ((MutableState) this.receiver).setValue(obj);
                                                                                                    }
                                                                                                }, paddingValues);
                                                                                                Function2<Composer, Integer, Unit> function231 = function29;
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, outlineCutout);
                                                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                                                                    ComposablesKt.invalidApplier();
                                                                                                }
                                                                                                composer2.startReusableNode();
                                                                                                if (composer2.getInserting()) {
                                                                                                    composer2.createNode(constructor);
                                                                                                } else {
                                                                                                    composer2.useNode();
                                                                                                }
                                                                                                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                                                                                Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                                }
                                                                                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -1241674663, "C260@11029L11:TextFieldImpl.kt#mqatfk");
                                                                                                function231.invoke(composer2, 0);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                composer2.endNode();
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventEnd();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            composer2.skipToGroupEnd();
                                                                                        }
                                                                                    }, startRestartGroup, 54);
                                                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156806032, str3);
                                                                                    boolean changed3 = startRestartGroup.changed(floatValue);
                                                                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                                                                    if (changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                                        rememberedValue7 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                            {
                                                                                                super(1);
                                                                                            }

                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                                                                m2663invokeuvyYCjk(size.getPackedValue());
                                                                                                return Unit.INSTANCE;
                                                                                            }

                                                                                            /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                                                            public final void m2663invokeuvyYCjk(long j4) {
                                                                                                float m3668getWidthimpl = Size.m3668getWidthimpl(j4) * floatValue;
                                                                                                float m3665getHeightimpl = Size.m3665getHeightimpl(j4) * floatValue;
                                                                                                if (Size.m3668getWidthimpl(mutableState.getValue().getPackedValue()) == m3668getWidthimpl && Size.m3665getHeightimpl(mutableState.getValue().getPackedValue()) == m3665getHeightimpl) {
                                                                                                    return;
                                                                                                }
                                                                                                mutableState.setValue(Size.m3656boximpl(SizeKt.Size(m3668getWidthimpl, m3665getHeightimpl)));
                                                                                            }
                                                                                        };
                                                                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                                                                    }
                                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                    OutlinedTextFieldKt.OutlinedTextFieldLayout(companion, function2, composableLambda, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, rememberComposableLambda5, rememberComposableLambda6, z16, floatValue, (Function1) rememberedValue7, rememberComposableLambda7, rememberComposableLambda4, paddingValues, startRestartGroup, ((i30 >> 3) & 112) | 6 | ((i31 << 21) & 234881024), ((i31 >> 6) & 7168) | 48);
                                                                                    startRestartGroup.endReplaceGroup();
                                                                                    Unit unit3 = Unit.INSTANCE;
                                                                                }
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                                function220 = function216;
                                                                                function221 = function217;
                                                                                z11 = z16;
                                                                                function222 = function210;
                                                                                function223 = function219;
                                                                                function224 = function214;
                                                                                z12 = z10;
                                                                            }
                                                                        }
                                                                        f5 = 1.0f;
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        Float valueOf32 = Float.valueOf(f5);
                                                                        InputPhase inputPhase82 = (InputPhase) updateTransition.getTargetState();
                                                                        startRestartGroup.startReplaceGroup(1128033978);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase82.ordinal()];
                                                                        if (i23 != 1) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final State<Float> createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                        InputPhase inputPhase92 = (InputPhase) updateTransition.getTargetState();
                                                                        startRestartGroup.startReplaceGroup(-107432127);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase92.ordinal()] == 1) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        ColorSpace m3844getColorSpaceimpl3 = Color.m3844getColorSpaceimpl(j2);
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                        changed = startRestartGroup.changed(m3844getColorSpaceimpl3);
                                                                        rememberedValue = startRestartGroup.rememberedValue();
                                                                        if (!changed) {
                                                                        }
                                                                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl3);
                                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                                        TwoWayConverter twoWayConverter3 = (TwoWayConverter) rememberedValue;
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                        InputPhase inputPhase102 = (InputPhase) updateTransition.getCurrentState();
                                                                        startRestartGroup.startReplaceGroup(-107432127);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase102.ordinal()] == 1) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        Color m3830boximpl3 = Color.m3830boximpl(j3);
                                                                        inputPhase = (InputPhase) updateTransition.getTargetState();
                                                                        startRestartGroup.startReplaceGroup(-107432127);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final State<Color> createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl3, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter3, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                        startRestartGroup.startReplaceGroup(1023351670);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        ColorSpace m3844getColorSpaceimpl22 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                        changed2 = startRestartGroup.changed(m3844getColorSpaceimpl22);
                                                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                                                        if (!changed2) {
                                                                        }
                                                                        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl22);
                                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                                        TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue2;
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                        startRestartGroup.startReplaceGroup(1023351670);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        Color m3830boximpl22 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                                                        startRestartGroup.startReplaceGroup(1023351670);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final State<Color> createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl22, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter22, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                                        final float floatValue2 = ((Number) createTransitionAnimation.getValue()).floatValue();
                                                                        startRestartGroup.startReplaceGroup(-156998101);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                                                        if (function22 == null) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        boolean z192 = z6;
                                                                        boolean z202 = z7;
                                                                        boolean z212 = z8;
                                                                        final long m2338placeholderColorXeAY9LY$material3_release2 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z192, z202, z212);
                                                                        String str32 = str2;
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str32);
                                                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                                                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                        }
                                                                        State state32 = (State) rememberedValue3;
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        startRestartGroup.startReplaceGroup(-156965270);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                                                        if (function215 == null) {
                                                                        }
                                                                        composableLambda = null;
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final long m2339prefixColorXeAY9LY$material3_release2 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z192, z202, z212);
                                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str32);
                                                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                        }
                                                                        State state52 = (State) rememberedValue4;
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        startRestartGroup.startReplaceGroup(-156940524);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                                                        if (function210 == null) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final long m2340suffixColorXeAY9LY$material3_release2 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z192, z202, z212);
                                                                        startRestartGroup.startReplaceGroup(-156921964);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                                                        if (function214 == null) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final long m2337leadingIconColorXeAY9LY$material3_release2 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z192, z202, z212);
                                                                        startRestartGroup.startReplaceGroup(-156902962);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                                                        if (function212 == null) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final long m2343trailingIconColorXeAY9LY$material3_release2 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z192, z202, z212);
                                                                        startRestartGroup.startReplaceGroup(-156893937);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                                                        if (function213 == null) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        final long m2341supportingTextColorXeAY9LY$material3_release2 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z192, z202, z212);
                                                                        startRestartGroup.startReplaceGroup(-156884470);
                                                                        ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                                                        if (function211 == null) {
                                                                        }
                                                                        startRestartGroup.endReplaceGroup();
                                                                        i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                                        if (i26 == i25) {
                                                                        }
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        function220 = function216;
                                                                        function221 = function217;
                                                                        z11 = z16;
                                                                        function222 = function210;
                                                                        function223 = function219;
                                                                        function224 = function214;
                                                                        z12 = z10;
                                                                    }
                                                                    f4 = 1.0f;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                    InputPhase inputPhase72 = (InputPhase) updateTransition.getCurrentState();
                                                                    startRestartGroup.startReplaceGroup(1128033978);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase72.ordinal()];
                                                                    if (i22 != 1) {
                                                                    }
                                                                    f5 = 1.0f;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    Float valueOf322 = Float.valueOf(f5);
                                                                    InputPhase inputPhase822 = (InputPhase) updateTransition.getTargetState();
                                                                    startRestartGroup.startReplaceGroup(1128033978);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase822.ordinal()];
                                                                    if (i23 != 1) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final State<Float> createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter32, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                    InputPhase inputPhase922 = (InputPhase) updateTransition.getTargetState();
                                                                    startRestartGroup.startReplaceGroup(-107432127);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    if (WhenMappings.$EnumSwitchMapping$1[inputPhase922.ordinal()] == 1) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    ColorSpace m3844getColorSpaceimpl32 = Color.m3844getColorSpaceimpl(j2);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                    changed = startRestartGroup.changed(m3844getColorSpaceimpl32);
                                                                    rememberedValue = startRestartGroup.rememberedValue();
                                                                    if (!changed) {
                                                                    }
                                                                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl32);
                                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                                    TwoWayConverter twoWayConverter32 = (TwoWayConverter) rememberedValue;
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                    InputPhase inputPhase1022 = (InputPhase) updateTransition.getCurrentState();
                                                                    startRestartGroup.startReplaceGroup(-107432127);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    if (WhenMappings.$EnumSwitchMapping$1[inputPhase1022.ordinal()] == 1) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    Color m3830boximpl32 = Color.m3830boximpl(j3);
                                                                    inputPhase = (InputPhase) updateTransition.getTargetState();
                                                                    startRestartGroup.startReplaceGroup(-107432127);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final State<Color> createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl32, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter32, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                    startRestartGroup.startReplaceGroup(1023351670);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    ColorSpace m3844getColorSpaceimpl222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                    changed2 = startRestartGroup.changed(m3844getColorSpaceimpl222);
                                                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                                                    if (!changed2) {
                                                                    }
                                                                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl222);
                                                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                                                    TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue2;
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                    startRestartGroup.startReplaceGroup(1023351670);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    Color m3830boximpl222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                                                    startRestartGroup.startReplaceGroup(1023351670);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final State<Color> createTransitionAnimation522 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$122.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                                    final float floatValue22 = ((Number) createTransitionAnimation.getValue()).floatValue();
                                                                    startRestartGroup.startReplaceGroup(-156998101);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                                                    if (function22 == null) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    boolean z1922 = z6;
                                                                    boolean z2022 = z7;
                                                                    boolean z2122 = z8;
                                                                    final long m2338placeholderColorXeAY9LY$material3_release22 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z1922, z2022, z2122);
                                                                    String str322 = str2;
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str322);
                                                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                    }
                                                                    State state322 = (State) rememberedValue3;
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    startRestartGroup.startReplaceGroup(-156965270);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                                                    if (function215 == null) {
                                                                    }
                                                                    composableLambda = null;
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final long m2339prefixColorXeAY9LY$material3_release22 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z1922, z2022, z2122);
                                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str322);
                                                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                    }
                                                                    State state522 = (State) rememberedValue4;
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    startRestartGroup.startReplaceGroup(-156940524);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                                                    if (function210 == null) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final long m2340suffixColorXeAY9LY$material3_release22 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z1922, z2022, z2122);
                                                                    startRestartGroup.startReplaceGroup(-156921964);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                                                    if (function214 == null) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final long m2337leadingIconColorXeAY9LY$material3_release22 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z1922, z2022, z2122);
                                                                    startRestartGroup.startReplaceGroup(-156902962);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                                                    if (function212 == null) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final long m2343trailingIconColorXeAY9LY$material3_release22 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z1922, z2022, z2122);
                                                                    startRestartGroup.startReplaceGroup(-156893937);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                                                    if (function213 == null) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    final long m2341supportingTextColorXeAY9LY$material3_release22 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z1922, z2022, z2122);
                                                                    startRestartGroup.startReplaceGroup(-156884470);
                                                                    ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                                                    if (function211 == null) {
                                                                    }
                                                                    startRestartGroup.endReplaceGroup();
                                                                    i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                                    if (i26 == i25) {
                                                                    }
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    function220 = function216;
                                                                    function221 = function217;
                                                                    z11 = z16;
                                                                    function222 = function210;
                                                                    function223 = function219;
                                                                    function224 = function214;
                                                                    z12 = z10;
                                                                }
                                                                f3 = 1.0f;
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                Float valueOf22 = Float.valueOf(f3);
                                                                InputPhase inputPhase62 = (InputPhase) updateTransition.getTargetState();
                                                                startRestartGroup.startReplaceGroup(1435837472);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase62.ordinal()];
                                                                if (i21 != 1) {
                                                                }
                                                                f4 = 1.0f;
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                InputPhase inputPhase722 = (InputPhase) updateTransition.getCurrentState();
                                                                startRestartGroup.startReplaceGroup(1128033978);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase722.ordinal()];
                                                                if (i22 != 1) {
                                                                }
                                                                f5 = 1.0f;
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                Float valueOf3222 = Float.valueOf(f5);
                                                                InputPhase inputPhase8222 = (InputPhase) updateTransition.getTargetState();
                                                                startRestartGroup.startReplaceGroup(1128033978);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase8222.ordinal()];
                                                                if (i23 != 1) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                final State<Float> createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3222, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter322, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                InputPhase inputPhase9222 = (InputPhase) updateTransition.getTargetState();
                                                                startRestartGroup.startReplaceGroup(-107432127);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase9222.ordinal()] == 1) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                ColorSpace m3844getColorSpaceimpl322 = Color.m3844getColorSpaceimpl(j2);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                changed = startRestartGroup.changed(m3844getColorSpaceimpl322);
                                                                rememberedValue = startRestartGroup.rememberedValue();
                                                                if (!changed) {
                                                                }
                                                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl322);
                                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                                TwoWayConverter twoWayConverter322 = (TwoWayConverter) rememberedValue;
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                InputPhase inputPhase10222 = (InputPhase) updateTransition.getCurrentState();
                                                                startRestartGroup.startReplaceGroup(-107432127);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase10222.ordinal()] == 1) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                Color m3830boximpl322 = Color.m3830boximpl(j3);
                                                                inputPhase = (InputPhase) updateTransition.getTargetState();
                                                                startRestartGroup.startReplaceGroup(-107432127);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                final State<Color> createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl322, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter322, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                startRestartGroup.startReplaceGroup(1023351670);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                ColorSpace m3844getColorSpaceimpl2222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                changed2 = startRestartGroup.changed(m3844getColorSpaceimpl2222);
                                                                rememberedValue2 = startRestartGroup.rememberedValue();
                                                                if (!changed2) {
                                                                }
                                                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl2222);
                                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                                                TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue2;
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                startRestartGroup.startReplaceGroup(1023351670);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                Color m3830boximpl2222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                                                startRestartGroup.startReplaceGroup(1023351670);
                                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                final State<Color> createTransitionAnimation5222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl2222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter2222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                                final float floatValue222 = ((Number) createTransitionAnimation.getValue()).floatValue();
                                                                startRestartGroup.startReplaceGroup(-156998101);
                                                                ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                                                if (function22 == null) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                boolean z19222 = z6;
                                                                boolean z20222 = z7;
                                                                boolean z21222 = z8;
                                                                final long m2338placeholderColorXeAY9LY$material3_release222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z19222, z20222, z21222);
                                                                String str3222 = str2;
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str3222);
                                                                rememberedValue3 = startRestartGroup.rememberedValue();
                                                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                }
                                                                State state3222 = (State) rememberedValue3;
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                startRestartGroup.startReplaceGroup(-156965270);
                                                                ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                                                if (function215 == null) {
                                                                }
                                                                composableLambda = null;
                                                                startRestartGroup.endReplaceGroup();
                                                                final long m2339prefixColorXeAY9LY$material3_release222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z19222, z20222, z21222);
                                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str3222);
                                                                rememberedValue4 = startRestartGroup.rememberedValue();
                                                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                }
                                                                State state5222 = (State) rememberedValue4;
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                startRestartGroup.startReplaceGroup(-156940524);
                                                                ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                                                if (function210 == null) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                final long m2340suffixColorXeAY9LY$material3_release222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z19222, z20222, z21222);
                                                                startRestartGroup.startReplaceGroup(-156921964);
                                                                ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                                                if (function214 == null) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                final long m2337leadingIconColorXeAY9LY$material3_release222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z19222, z20222, z21222);
                                                                startRestartGroup.startReplaceGroup(-156902962);
                                                                ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                                                if (function212 == null) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                final long m2343trailingIconColorXeAY9LY$material3_release222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z19222, z20222, z21222);
                                                                startRestartGroup.startReplaceGroup(-156893937);
                                                                ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                                                if (function213 == null) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                final long m2341supportingTextColorXeAY9LY$material3_release222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z19222, z20222, z21222);
                                                                startRestartGroup.startReplaceGroup(-156884470);
                                                                ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                                                if (function211 == null) {
                                                                }
                                                                startRestartGroup.endReplaceGroup();
                                                                i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                                if (i26 == i25) {
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                function220 = function216;
                                                                function221 = function217;
                                                                z11 = z16;
                                                                function222 = function210;
                                                                function223 = function219;
                                                                function224 = function214;
                                                                z12 = z10;
                                                            } else if (i19 != 3) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                        }
                                                        f2 = 1.0f;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        State createTransitionAnimation6 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                        TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                        InputPhase inputPhase52 = (InputPhase) updateTransition.getCurrentState();
                                                        startRestartGroup.startReplaceGroup(1435837472);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase52.ordinal()];
                                                        if (i20 != 1) {
                                                        }
                                                        f3 = 1.0f;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        Float valueOf222 = Float.valueOf(f3);
                                                        InputPhase inputPhase622 = (InputPhase) updateTransition.getTargetState();
                                                        startRestartGroup.startReplaceGroup(1435837472);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase622.ordinal()];
                                                        if (i21 != 1) {
                                                        }
                                                        f4 = 1.0f;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                        TwoWayConverter<Float, AnimationVector1D> vectorConverter3222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                        InputPhase inputPhase7222 = (InputPhase) updateTransition.getCurrentState();
                                                        startRestartGroup.startReplaceGroup(1128033978);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase7222.ordinal()];
                                                        if (i22 != 1) {
                                                        }
                                                        f5 = 1.0f;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        Float valueOf32222 = Float.valueOf(f5);
                                                        InputPhase inputPhase82222 = (InputPhase) updateTransition.getTargetState();
                                                        startRestartGroup.startReplaceGroup(1128033978);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase82222.ordinal()];
                                                        if (i23 != 1) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        final State<Float> createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32222, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                        InputPhase inputPhase92222 = (InputPhase) updateTransition.getTargetState();
                                                        startRestartGroup.startReplaceGroup(-107432127);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase92222.ordinal()] == 1) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        ColorSpace m3844getColorSpaceimpl3222 = Color.m3844getColorSpaceimpl(j2);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                        changed = startRestartGroup.changed(m3844getColorSpaceimpl3222);
                                                        rememberedValue = startRestartGroup.rememberedValue();
                                                        if (!changed) {
                                                        }
                                                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl3222);
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                        TwoWayConverter twoWayConverter3222 = (TwoWayConverter) rememberedValue;
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                        InputPhase inputPhase102222 = (InputPhase) updateTransition.getCurrentState();
                                                        startRestartGroup.startReplaceGroup(-107432127);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase102222.ordinal()] == 1) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        Color m3830boximpl3222 = Color.m3830boximpl(j3);
                                                        inputPhase = (InputPhase) updateTransition.getTargetState();
                                                        startRestartGroup.startReplaceGroup(-107432127);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        final State<Color> createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl3222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter3222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                        startRestartGroup.startReplaceGroup(1023351670);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        ColorSpace m3844getColorSpaceimpl22222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                        changed2 = startRestartGroup.changed(m3844getColorSpaceimpl22222);
                                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                                        if (!changed2) {
                                                        }
                                                        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl22222);
                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                        TwoWayConverter twoWayConverter22222 = (TwoWayConverter) rememberedValue2;
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                        startRestartGroup.startReplaceGroup(1023351670);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        Color m3830boximpl22222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                                        startRestartGroup.startReplaceGroup(1023351670);
                                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        final State<Color> createTransitionAnimation52222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl22222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter22222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                        final float floatValue2222 = ((Number) createTransitionAnimation6.getValue()).floatValue();
                                                        startRestartGroup.startReplaceGroup(-156998101);
                                                        ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                                        if (function22 == null) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        boolean z192222 = z6;
                                                        boolean z202222 = z7;
                                                        boolean z212222 = z8;
                                                        final long m2338placeholderColorXeAY9LY$material3_release2222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z192222, z202222, z212222);
                                                        String str32222 = str2;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str32222);
                                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        }
                                                        State state32222 = (State) rememberedValue3;
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.startReplaceGroup(-156965270);
                                                        ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                                        if (function215 == null) {
                                                        }
                                                        composableLambda = null;
                                                        startRestartGroup.endReplaceGroup();
                                                        final long m2339prefixColorXeAY9LY$material3_release2222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z192222, z202222, z212222);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str32222);
                                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        }
                                                        State state52222 = (State) rememberedValue4;
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.startReplaceGroup(-156940524);
                                                        ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                                        if (function210 == null) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        final long m2340suffixColorXeAY9LY$material3_release2222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z192222, z202222, z212222);
                                                        startRestartGroup.startReplaceGroup(-156921964);
                                                        ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                                        if (function214 == null) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        final long m2337leadingIconColorXeAY9LY$material3_release2222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z192222, z202222, z212222);
                                                        startRestartGroup.startReplaceGroup(-156902962);
                                                        ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                                        if (function212 == null) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        final long m2343trailingIconColorXeAY9LY$material3_release2222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z192222, z202222, z212222);
                                                        startRestartGroup.startReplaceGroup(-156893937);
                                                        ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                                        if (function213 == null) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        final long m2341supportingTextColorXeAY9LY$material3_release2222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z192222, z202222, z212222);
                                                        startRestartGroup.startReplaceGroup(-156884470);
                                                        ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                                        if (function211 == null) {
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                        if (i26 == i25) {
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        function220 = function216;
                                                        function221 = function217;
                                                        z11 = z16;
                                                        function222 = function210;
                                                        function223 = function219;
                                                        function224 = function214;
                                                        z12 = z10;
                                                    } else if (i18 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                }
                                                f = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Float valueOf4 = Float.valueOf(f);
                                                InputPhase inputPhase42 = (InputPhase) updateTransition.getTargetState();
                                                startRestartGroup.startReplaceGroup(-2036730335);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase42.ordinal()];
                                                if (i19 != 1) {
                                                }
                                                f2 = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                State createTransitionAnimation62 = TransitionKt.createTransitionAnimation(updateTransition, valueOf4, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                InputPhase inputPhase522 = (InputPhase) updateTransition.getCurrentState();
                                                startRestartGroup.startReplaceGroup(1435837472);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase522.ordinal()];
                                                if (i20 != 1) {
                                                }
                                                f3 = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Float valueOf2222 = Float.valueOf(f3);
                                                InputPhase inputPhase6222 = (InputPhase) updateTransition.getTargetState();
                                                startRestartGroup.startReplaceGroup(1435837472);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase6222.ordinal()];
                                                if (i21 != 1) {
                                                }
                                                f4 = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter32222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                InputPhase inputPhase72222 = (InputPhase) updateTransition.getCurrentState();
                                                startRestartGroup.startReplaceGroup(1128033978);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase72222.ordinal()];
                                                if (i22 != 1) {
                                                }
                                                f5 = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Float valueOf322222 = Float.valueOf(f5);
                                                InputPhase inputPhase822222 = (InputPhase) updateTransition.getTargetState();
                                                startRestartGroup.startReplaceGroup(1128033978);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase822222.ordinal()];
                                                if (i23 != 1) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                final State<Float> createTransitionAnimation322222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322222, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter32222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                InputPhase inputPhase922222 = (InputPhase) updateTransition.getTargetState();
                                                startRestartGroup.startReplaceGroup(-107432127);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase922222.ordinal()] == 1) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                ColorSpace m3844getColorSpaceimpl32222 = Color.m3844getColorSpaceimpl(j2);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                changed = startRestartGroup.changed(m3844getColorSpaceimpl32222);
                                                rememberedValue = startRestartGroup.rememberedValue();
                                                if (!changed) {
                                                }
                                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl32222);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                TwoWayConverter twoWayConverter32222 = (TwoWayConverter) rememberedValue;
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                InputPhase inputPhase1022222 = (InputPhase) updateTransition.getCurrentState();
                                                startRestartGroup.startReplaceGroup(-107432127);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase1022222.ordinal()] == 1) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Color m3830boximpl32222 = Color.m3830boximpl(j3);
                                                inputPhase = (InputPhase) updateTransition.getTargetState();
                                                startRestartGroup.startReplaceGroup(-107432127);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                final State<Color> createTransitionAnimation422222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl32222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter32222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                startRestartGroup.startReplaceGroup(1023351670);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                ColorSpace m3844getColorSpaceimpl222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                changed2 = startRestartGroup.changed(m3844getColorSpaceimpl222222);
                                                rememberedValue2 = startRestartGroup.rememberedValue();
                                                if (!changed2) {
                                                }
                                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl222222);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                                TwoWayConverter twoWayConverter222222 = (TwoWayConverter) rememberedValue2;
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                startRestartGroup.startReplaceGroup(1023351670);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Color m3830boximpl222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                                startRestartGroup.startReplaceGroup(1023351670);
                                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                final State<Color> createTransitionAnimation522222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                final float floatValue22222 = ((Number) createTransitionAnimation62.getValue()).floatValue();
                                                startRestartGroup.startReplaceGroup(-156998101);
                                                ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                                if (function22 == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                boolean z1922222 = z6;
                                                boolean z2022222 = z7;
                                                boolean z2122222 = z8;
                                                final long m2338placeholderColorXeAY9LY$material3_release22222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z1922222, z2022222, z2122222);
                                                String str322222 = str2;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str322222);
                                                rememberedValue3 = startRestartGroup.rememberedValue();
                                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                State state322222 = (State) rememberedValue3;
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.startReplaceGroup(-156965270);
                                                ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                                if (function215 == null) {
                                                }
                                                composableLambda = null;
                                                startRestartGroup.endReplaceGroup();
                                                final long m2339prefixColorXeAY9LY$material3_release22222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z1922222, z2022222, z2122222);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str322222);
                                                rememberedValue4 = startRestartGroup.rememberedValue();
                                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                State state522222 = (State) rememberedValue4;
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.startReplaceGroup(-156940524);
                                                ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                                if (function210 == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                final long m2340suffixColorXeAY9LY$material3_release22222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z1922222, z2022222, z2122222);
                                                startRestartGroup.startReplaceGroup(-156921964);
                                                ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                                if (function214 == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                final long m2337leadingIconColorXeAY9LY$material3_release22222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z1922222, z2022222, z2122222);
                                                startRestartGroup.startReplaceGroup(-156902962);
                                                ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                                if (function212 == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                final long m2343trailingIconColorXeAY9LY$material3_release22222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z1922222, z2022222, z2122222);
                                                startRestartGroup.startReplaceGroup(-156893937);
                                                ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                                if (function213 == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                final long m2341supportingTextColorXeAY9LY$material3_release22222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z1922222, z2022222, z2122222);
                                                startRestartGroup.startReplaceGroup(-156884470);
                                                ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                                if (function211 == null) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                if (i26 == i25) {
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                function220 = function216;
                                                function221 = function217;
                                                z11 = z16;
                                                function222 = function210;
                                                function223 = function219;
                                                function224 = function214;
                                                z12 = z10;
                                            }
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup == null) {
                                                final Function2<? super Composer, ? super Integer, Unit> function231 = function215;
                                                final boolean z22 = z9;
                                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$4
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                        invoke(composer2, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer2, int i32) {
                                                        TextFieldImplKt.CommonDecorationBox(TextFieldType.this, str, function2, visualTransformation, function22, function231, function220, function221, function222, function224, function223, z11, z22, z12, interactionSource, paddingValues, textFieldColors, function29, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i29 |= i27;
                                        if ((306783379 & i4) != 306783378) {
                                        }
                                        if (i5 == 0) {
                                        }
                                        if (i6 == 0) {
                                        }
                                        if (i7 == 0) {
                                        }
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i16 == 0) {
                                        }
                                        boolean z162 = z13;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                                        int i302 = i4;
                                        z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                                        Object rememberedValue52 = startRestartGroup.rememberedValue();
                                        if (z4) {
                                        }
                                        filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                        startRestartGroup.updateRememberedValue(filter);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        String text2 = ((TransformedText) filter).getText().getText();
                                        boolean booleanValue2 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i29 >> 12) & 14).getValue().booleanValue();
                                        InputPhase inputPhase22 = !booleanValue2 ? InputPhase.Focused : text2.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                                        m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue2);
                                        int i312 = i29;
                                        Typography typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                        bodyLarge = typography2.getBodyLarge();
                                        final TextStyle bodySmall2 = typography2.getBodySmall();
                                        function210 = function228;
                                        function211 = function230;
                                        function212 = function226;
                                        if (Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) {
                                        }
                                        m5814getColor0d7_KjU = bodySmall2.m5814getColor0d7_KjU();
                                        if (z5) {
                                            m5814getColor0d7_KjU = m2336labelColorXeAY9LY$material3_release;
                                        }
                                        m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
                                        if (z5) {
                                            m5814getColor0d7_KjU2 = m2336labelColorXeAY9LY$material3_release;
                                        }
                                        j = m5814getColor0d7_KjU;
                                        if (function22 == null) {
                                        }
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                                        function213 = function227;
                                        Transition updateTransition2 = TransitionKt.updateTransition(inputPhase22, "TextFieldInputState", startRestartGroup, 48, 0);
                                        TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$12 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                        TwoWayConverter<Float, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                        function214 = function229;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                        InputPhase inputPhase32 = (InputPhase) updateTransition2.getCurrentState();
                                        startRestartGroup.startReplaceGroup(-2036730335);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        function215 = function225;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase32.ordinal()];
                                        float f62 = 1.0f;
                                        if (i18 != 1) {
                                        }
                                        f = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Float valueOf42 = Float.valueOf(f);
                                        InputPhase inputPhase422 = (InputPhase) updateTransition2.getTargetState();
                                        startRestartGroup.startReplaceGroup(-2036730335);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase422.ordinal()];
                                        if (i19 != 1) {
                                        }
                                        f2 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        State createTransitionAnimation622 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf42, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter4, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1222 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                        TwoWayConverter<Float, AnimationVector1D> vectorConverter2222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                        InputPhase inputPhase5222 = (InputPhase) updateTransition2.getCurrentState();
                                        startRestartGroup.startReplaceGroup(1435837472);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase5222.ordinal()];
                                        if (i20 != 1) {
                                        }
                                        f3 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Float valueOf22222 = Float.valueOf(f3);
                                        InputPhase inputPhase62222 = (InputPhase) updateTransition2.getTargetState();
                                        startRestartGroup.startReplaceGroup(1435837472);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase62222.ordinal()];
                                        if (i21 != 1) {
                                        }
                                        f4 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        State createTransitionAnimation222222 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf22222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                        TwoWayConverter<Float, AnimationVector1D> vectorConverter322222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                        InputPhase inputPhase722222 = (InputPhase) updateTransition2.getCurrentState();
                                        startRestartGroup.startReplaceGroup(1128033978);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase722222.ordinal()];
                                        if (i22 != 1) {
                                        }
                                        f5 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Float valueOf3222222 = Float.valueOf(f5);
                                        InputPhase inputPhase8222222 = (InputPhase) updateTransition2.getTargetState();
                                        startRestartGroup.startReplaceGroup(1128033978);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase8222222.ordinal()];
                                        if (i23 != 1) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final State<Float> createTransitionAnimation3222222 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf3222222, Float.valueOf(f62), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter322222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                        InputPhase inputPhase9222222 = (InputPhase) updateTransition2.getTargetState();
                                        startRestartGroup.startReplaceGroup(-107432127);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase9222222.ordinal()] == 1) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        ColorSpace m3844getColorSpaceimpl322222 = Color.m3844getColorSpaceimpl(j2);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                        changed = startRestartGroup.changed(m3844getColorSpaceimpl322222);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed) {
                                        }
                                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl322222);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                        TwoWayConverter twoWayConverter322222 = (TwoWayConverter) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                        InputPhase inputPhase10222222 = (InputPhase) updateTransition2.getCurrentState();
                                        startRestartGroup.startReplaceGroup(-107432127);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase10222222.ordinal()] == 1) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Color m3830boximpl322222 = Color.m3830boximpl(j3);
                                        inputPhase = (InputPhase) updateTransition2.getTargetState();
                                        startRestartGroup.startReplaceGroup(-107432127);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final State<Color> createTransitionAnimation4222222 = TransitionKt.createTransitionAnimation(updateTransition2, m3830boximpl322222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter322222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                        startRestartGroup.startReplaceGroup(1023351670);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        ColorSpace m3844getColorSpaceimpl2222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                        changed2 = startRestartGroup.changed(m3844getColorSpaceimpl2222222);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!changed2) {
                                        }
                                        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl2222222);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                        TwoWayConverter twoWayConverter2222222 = (TwoWayConverter) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                        startRestartGroup.startReplaceGroup(1023351670);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Color m3830boximpl2222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                        startRestartGroup.startReplaceGroup(1023351670);
                                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final State<Color> createTransitionAnimation5222222 = TransitionKt.createTransitionAnimation(updateTransition2, m3830boximpl2222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter2222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                        final float floatValue222222 = ((Number) createTransitionAnimation622.getValue()).floatValue();
                                        startRestartGroup.startReplaceGroup(-156998101);
                                        ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                        if (function22 == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        boolean z19222222 = z6;
                                        boolean z20222222 = z7;
                                        boolean z21222222 = z8;
                                        final long m2338placeholderColorXeAY9LY$material3_release222222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z19222222, z20222222, z21222222);
                                        String str3222222 = str2;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str3222222);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        State state3222222 = (State) rememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.startReplaceGroup(-156965270);
                                        ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                        if (function215 == null) {
                                        }
                                        composableLambda = null;
                                        startRestartGroup.endReplaceGroup();
                                        final long m2339prefixColorXeAY9LY$material3_release222222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z19222222, z20222222, z21222222);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str3222222);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        State state5222222 = (State) rememberedValue4;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.startReplaceGroup(-156940524);
                                        ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                        if (function210 == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final long m2340suffixColorXeAY9LY$material3_release222222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z19222222, z20222222, z21222222);
                                        startRestartGroup.startReplaceGroup(-156921964);
                                        ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                        if (function214 == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final long m2337leadingIconColorXeAY9LY$material3_release222222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z19222222, z20222222, z21222222);
                                        startRestartGroup.startReplaceGroup(-156902962);
                                        ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                        if (function212 == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final long m2343trailingIconColorXeAY9LY$material3_release222222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z19222222, z20222222, z21222222);
                                        startRestartGroup.startReplaceGroup(-156893937);
                                        ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                        if (function213 == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final long m2341supportingTextColorXeAY9LY$material3_release222222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z19222222, z20222222, z21222222);
                                        startRestartGroup.startReplaceGroup(-156884470);
                                        ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                        if (function211 == null) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                        if (i26 == i25) {
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function220 = function216;
                                        function221 = function217;
                                        z11 = z162;
                                        function222 = function210;
                                        function223 = function219;
                                        function224 = function214;
                                        z12 = z10;
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup == null) {
                                        }
                                    }
                                    i29 |= i28;
                                    if ((131072 & i3) == 0) {
                                    }
                                    i29 |= i27;
                                    if ((306783379 & i4) != 306783378) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    boolean z1622 = z13;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                                    int i3022 = i4;
                                    z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                                    Object rememberedValue522 = startRestartGroup.rememberedValue();
                                    if (z4) {
                                    }
                                    filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                    startRestartGroup.updateRememberedValue(filter);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    String text22 = ((TransformedText) filter).getText().getText();
                                    boolean booleanValue22 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i29 >> 12) & 14).getValue().booleanValue();
                                    InputPhase inputPhase222 = !booleanValue22 ? InputPhase.Focused : text22.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                                    m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue22);
                                    int i3122 = i29;
                                    Typography typography22 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                    bodyLarge = typography22.getBodyLarge();
                                    final TextStyle bodySmall22 = typography22.getBodySmall();
                                    function210 = function228;
                                    function211 = function230;
                                    function212 = function226;
                                    if (Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) {
                                    }
                                    m5814getColor0d7_KjU = bodySmall22.m5814getColor0d7_KjU();
                                    if (z5) {
                                    }
                                    m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
                                    if (z5) {
                                    }
                                    j = m5814getColor0d7_KjU;
                                    if (function22 == null) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                                    function213 = function227;
                                    Transition updateTransition22 = TransitionKt.updateTransition(inputPhase222, "TextFieldInputState", startRestartGroup, 48, 0);
                                    TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$122 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter42 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                    function214 = function229;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase322 = (InputPhase) updateTransition22.getCurrentState();
                                    startRestartGroup.startReplaceGroup(-2036730335);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    function215 = function225;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase322.ordinal()];
                                    float f622 = 1.0f;
                                    if (i18 != 1) {
                                    }
                                    f = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Float valueOf422 = Float.valueOf(f);
                                    InputPhase inputPhase4222 = (InputPhase) updateTransition22.getTargetState();
                                    startRestartGroup.startReplaceGroup(-2036730335);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase4222.ordinal()];
                                    if (i19 != 1) {
                                    }
                                    f2 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    State createTransitionAnimation6222 = TransitionKt.createTransitionAnimation(updateTransition22, valueOf422, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$122.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition22.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter42, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12222 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase52222 = (InputPhase) updateTransition22.getCurrentState();
                                    startRestartGroup.startReplaceGroup(1435837472);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase52222.ordinal()];
                                    if (i20 != 1) {
                                    }
                                    f3 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Float valueOf222222 = Float.valueOf(f3);
                                    InputPhase inputPhase622222 = (InputPhase) updateTransition22.getTargetState();
                                    startRestartGroup.startReplaceGroup(1435837472);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase622222.ordinal()];
                                    if (i21 != 1) {
                                    }
                                    f4 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    State createTransitionAnimation2222222 = TransitionKt.createTransitionAnimation(updateTransition22, valueOf222222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition22.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase7222222 = (InputPhase) updateTransition22.getCurrentState();
                                    startRestartGroup.startReplaceGroup(1128033978);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase7222222.ordinal()];
                                    if (i22 != 1) {
                                    }
                                    f5 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Float valueOf32222222 = Float.valueOf(f5);
                                    InputPhase inputPhase82222222 = (InputPhase) updateTransition22.getTargetState();
                                    startRestartGroup.startReplaceGroup(1128033978);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase82222222.ordinal()];
                                    if (i23 != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final State<Float> createTransitionAnimation32222222 = TransitionKt.createTransitionAnimation(updateTransition22, valueOf32222222, Float.valueOf(f622), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition22.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3222222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    InputPhase inputPhase92222222 = (InputPhase) updateTransition22.getTargetState();
                                    startRestartGroup.startReplaceGroup(-107432127);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$1[inputPhase92222222.ordinal()] == 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    ColorSpace m3844getColorSpaceimpl3222222 = Color.m3844getColorSpaceimpl(j2);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                    changed = startRestartGroup.changed(m3844getColorSpaceimpl3222222);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl3222222);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    TwoWayConverter twoWayConverter3222222 = (TwoWayConverter) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase102222222 = (InputPhase) updateTransition22.getCurrentState();
                                    startRestartGroup.startReplaceGroup(-107432127);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$1[inputPhase102222222.ordinal()] == 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Color m3830boximpl3222222 = Color.m3830boximpl(j3);
                                    inputPhase = (InputPhase) updateTransition22.getTargetState();
                                    startRestartGroup.startReplaceGroup(-107432127);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final State<Color> createTransitionAnimation42222222 = TransitionKt.createTransitionAnimation(updateTransition22, m3830boximpl3222222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition22.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter3222222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    startRestartGroup.startReplaceGroup(1023351670);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    ColorSpace m3844getColorSpaceimpl22222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(m3844getColorSpaceimpl22222222);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl22222222);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    TwoWayConverter twoWayConverter22222222 = (TwoWayConverter) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                    startRestartGroup.startReplaceGroup(1023351670);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Color m3830boximpl22222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                    startRestartGroup.startReplaceGroup(1023351670);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final State<Color> createTransitionAnimation52222222 = TransitionKt.createTransitionAnimation(updateTransition22, m3830boximpl22222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition22.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter22222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                    final float floatValue2222222 = ((Number) createTransitionAnimation6222.getValue()).floatValue();
                                    startRestartGroup.startReplaceGroup(-156998101);
                                    ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                    if (function22 == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    boolean z192222222 = z6;
                                    boolean z202222222 = z7;
                                    boolean z212222222 = z8;
                                    final long m2338placeholderColorXeAY9LY$material3_release2222222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z192222222, z202222222, z212222222);
                                    String str32222222 = str2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str32222222);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    State state32222222 = (State) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.startReplaceGroup(-156965270);
                                    ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                    if (function215 == null) {
                                    }
                                    composableLambda = null;
                                    startRestartGroup.endReplaceGroup();
                                    final long m2339prefixColorXeAY9LY$material3_release2222222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z192222222, z202222222, z212222222);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str32222222);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    State state52222222 = (State) rememberedValue4;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.startReplaceGroup(-156940524);
                                    ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                    if (function210 == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final long m2340suffixColorXeAY9LY$material3_release2222222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z192222222, z202222222, z212222222);
                                    startRestartGroup.startReplaceGroup(-156921964);
                                    ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                    if (function214 == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final long m2337leadingIconColorXeAY9LY$material3_release2222222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z192222222, z202222222, z212222222);
                                    startRestartGroup.startReplaceGroup(-156902962);
                                    ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                    if (function212 == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final long m2343trailingIconColorXeAY9LY$material3_release2222222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z192222222, z202222222, z212222222);
                                    startRestartGroup.startReplaceGroup(-156893937);
                                    ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                    if (function213 == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final long m2341supportingTextColorXeAY9LY$material3_release2222222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z192222222, z202222222, z212222222);
                                    startRestartGroup.startReplaceGroup(-156884470);
                                    ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                    if (function211 == null) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                    if (i26 == i25) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function220 = function216;
                                    function221 = function217;
                                    z11 = z1622;
                                    function222 = function210;
                                    function223 = function219;
                                    function224 = function214;
                                    z12 = z10;
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                                i29 |= i17;
                                if ((65536 & i3) != 0) {
                                }
                                i29 |= i28;
                                if ((131072 & i3) == 0) {
                                }
                                i29 |= i27;
                                if ((306783379 & i4) != 306783378) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                boolean z16222 = z13;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                                int i30222 = i4;
                                z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                                Object rememberedValue5222 = startRestartGroup.rememberedValue();
                                if (z4) {
                                }
                                filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                startRestartGroup.updateRememberedValue(filter);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                String text222 = ((TransformedText) filter).getText().getText();
                                boolean booleanValue222 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i29 >> 12) & 14).getValue().booleanValue();
                                InputPhase inputPhase2222 = !booleanValue222 ? InputPhase.Focused : text222.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                                m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue222);
                                int i31222 = i29;
                                Typography typography222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                bodyLarge = typography222.getBodyLarge();
                                final TextStyle bodySmall222 = typography222.getBodySmall();
                                function210 = function228;
                                function211 = function230;
                                function212 = function226;
                                if (Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) {
                                }
                                m5814getColor0d7_KjU = bodySmall222.m5814getColor0d7_KjU();
                                if (z5) {
                                }
                                m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
                                if (z5) {
                                }
                                j = m5814getColor0d7_KjU;
                                if (function22 == null) {
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                                function213 = function227;
                                Transition updateTransition222 = TransitionKt.updateTransition(inputPhase2222, "TextFieldInputState", startRestartGroup, 48, 0);
                                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1222 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter422 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                function214 = function229;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                InputPhase inputPhase3222 = (InputPhase) updateTransition222.getCurrentState();
                                startRestartGroup.startReplaceGroup(-2036730335);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                function215 = function225;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase3222.ordinal()];
                                float f6222 = 1.0f;
                                if (i18 != 1) {
                                }
                                f = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Float valueOf4222 = Float.valueOf(f);
                                InputPhase inputPhase42222 = (InputPhase) updateTransition222.getTargetState();
                                startRestartGroup.startReplaceGroup(-2036730335);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase42222.ordinal()];
                                if (i19 != 1) {
                                }
                                f2 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                State createTransitionAnimation62222 = TransitionKt.createTransitionAnimation(updateTransition222, valueOf4222, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter422, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122222 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                InputPhase inputPhase522222 = (InputPhase) updateTransition222.getCurrentState();
                                startRestartGroup.startReplaceGroup(1435837472);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase522222.ordinal()];
                                if (i20 != 1) {
                                }
                                f3 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Float valueOf2222222 = Float.valueOf(f3);
                                InputPhase inputPhase6222222 = (InputPhase) updateTransition222.getTargetState();
                                startRestartGroup.startReplaceGroup(1435837472);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase6222222.ordinal()];
                                if (i21 != 1) {
                                }
                                f4 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                State createTransitionAnimation22222222 = TransitionKt.createTransitionAnimation(updateTransition222, valueOf2222222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122222.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter32222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                InputPhase inputPhase72222222 = (InputPhase) updateTransition222.getCurrentState();
                                startRestartGroup.startReplaceGroup(1128033978);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase72222222.ordinal()];
                                if (i22 != 1) {
                                }
                                f5 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Float valueOf322222222 = Float.valueOf(f5);
                                InputPhase inputPhase822222222 = (InputPhase) updateTransition222.getTargetState();
                                startRestartGroup.startReplaceGroup(1128033978);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase822222222.ordinal()];
                                if (i23 != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final State<Float> createTransitionAnimation322222222 = TransitionKt.createTransitionAnimation(updateTransition222, valueOf322222222, Float.valueOf(f6222), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter32222222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                InputPhase inputPhase922222222 = (InputPhase) updateTransition222.getTargetState();
                                startRestartGroup.startReplaceGroup(-107432127);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase922222222.ordinal()] == 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                ColorSpace m3844getColorSpaceimpl32222222 = Color.m3844getColorSpaceimpl(j2);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                changed = startRestartGroup.changed(m3844getColorSpaceimpl32222222);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl32222222);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                TwoWayConverter twoWayConverter32222222 = (TwoWayConverter) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                InputPhase inputPhase1022222222 = (InputPhase) updateTransition222.getCurrentState();
                                startRestartGroup.startReplaceGroup(-107432127);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase1022222222.ordinal()] == 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Color m3830boximpl32222222 = Color.m3830boximpl(j3);
                                inputPhase = (InputPhase) updateTransition222.getTargetState();
                                startRestartGroup.startReplaceGroup(-107432127);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final State<Color> createTransitionAnimation422222222 = TransitionKt.createTransitionAnimation(updateTransition222, m3830boximpl32222222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter32222222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                startRestartGroup.startReplaceGroup(1023351670);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                ColorSpace m3844getColorSpaceimpl222222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                changed2 = startRestartGroup.changed(m3844getColorSpaceimpl222222222);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl222222222);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                TwoWayConverter twoWayConverter222222222 = (TwoWayConverter) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                startRestartGroup.startReplaceGroup(1023351670);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Color m3830boximpl222222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                                startRestartGroup.startReplaceGroup(1023351670);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final State<Color> createTransitionAnimation522222222 = TransitionKt.createTransitionAnimation(updateTransition222, m3830boximpl222222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter222222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                final float floatValue22222222 = ((Number) createTransitionAnimation62222.getValue()).floatValue();
                                startRestartGroup.startReplaceGroup(-156998101);
                                ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                                if (function22 == null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                boolean z1922222222 = z6;
                                boolean z2022222222 = z7;
                                boolean z2122222222 = z8;
                                final long m2338placeholderColorXeAY9LY$material3_release22222222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z1922222222, z2022222222, z2122222222);
                                String str322222222 = str2;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str322222222);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                State state322222222 = (State) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.startReplaceGroup(-156965270);
                                ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                                if (function215 == null) {
                                }
                                composableLambda = null;
                                startRestartGroup.endReplaceGroup();
                                final long m2339prefixColorXeAY9LY$material3_release22222222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z1922222222, z2022222222, z2122222222);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str322222222);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                }
                                State state522222222 = (State) rememberedValue4;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.startReplaceGroup(-156940524);
                                ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                                if (function210 == null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final long m2340suffixColorXeAY9LY$material3_release22222222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z1922222222, z2022222222, z2122222222);
                                startRestartGroup.startReplaceGroup(-156921964);
                                ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                                if (function214 == null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final long m2337leadingIconColorXeAY9LY$material3_release22222222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z1922222222, z2022222222, z2122222222);
                                startRestartGroup.startReplaceGroup(-156902962);
                                ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                                if (function212 == null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final long m2343trailingIconColorXeAY9LY$material3_release22222222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z1922222222, z2022222222, z2122222222);
                                startRestartGroup.startReplaceGroup(-156893937);
                                ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                                if (function213 == null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final long m2341supportingTextColorXeAY9LY$material3_release22222222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z1922222222, z2022222222, z2122222222);
                                startRestartGroup.startReplaceGroup(-156884470);
                                ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                                if (function211 == null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                if (i26 == i25) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function220 = function216;
                                function221 = function217;
                                z11 = z16222;
                                function222 = function210;
                                function223 = function219;
                                function224 = function214;
                                z12 = z10;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                        }
                        if ((i3 & 16384) != 0) {
                        }
                        if ((32768 & i3) != 0) {
                        }
                        i29 |= i17;
                        if ((65536 & i3) != 0) {
                        }
                        i29 |= i28;
                        if ((131072 & i3) == 0) {
                        }
                        i29 |= i27;
                        if ((306783379 & i4) != 306783378) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        boolean z162222 = z13;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                        int i302222 = i4;
                        z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                        Object rememberedValue52222 = startRestartGroup.rememberedValue();
                        if (z4) {
                        }
                        filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                        startRestartGroup.updateRememberedValue(filter);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        String text2222 = ((TransformedText) filter).getText().getText();
                        boolean booleanValue2222 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i29 >> 12) & 14).getValue().booleanValue();
                        InputPhase inputPhase22222 = !booleanValue2222 ? InputPhase.Focused : text2222.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                        m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue2222);
                        int i312222 = i29;
                        Typography typography2222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                        bodyLarge = typography2222.getBodyLarge();
                        final TextStyle bodySmall2222 = typography2222.getBodySmall();
                        function210 = function228;
                        function211 = function230;
                        function212 = function226;
                        if (Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) {
                        }
                        m5814getColor0d7_KjU = bodySmall2222.m5814getColor0d7_KjU();
                        if (z5) {
                        }
                        m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
                        if (z5) {
                        }
                        j = m5814getColor0d7_KjU;
                        if (function22 == null) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                        function213 = function227;
                        Transition updateTransition2222 = TransitionKt.updateTransition(inputPhase22222, "TextFieldInputState", startRestartGroup, 48, 0);
                        TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$12222 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter4222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                        function214 = function229;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase32222 = (InputPhase) updateTransition2222.getCurrentState();
                        startRestartGroup.startReplaceGroup(-2036730335);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        function215 = function225;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase32222.ordinal()];
                        float f62222 = 1.0f;
                        if (i18 != 1) {
                        }
                        f = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Float valueOf42222 = Float.valueOf(f);
                        InputPhase inputPhase422222 = (InputPhase) updateTransition2222.getTargetState();
                        startRestartGroup.startReplaceGroup(-2036730335);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase422222.ordinal()];
                        if (i19 != 1) {
                        }
                        f2 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        State createTransitionAnimation622222 = TransitionKt.createTransitionAnimation(updateTransition2222, valueOf42222, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition2222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter4222, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1222222 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter2222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase5222222 = (InputPhase) updateTransition2222.getCurrentState();
                        startRestartGroup.startReplaceGroup(1435837472);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase5222222.ordinal()];
                        if (i20 != 1) {
                        }
                        f3 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Float valueOf22222222 = Float.valueOf(f3);
                        InputPhase inputPhase62222222 = (InputPhase) updateTransition2222.getTargetState();
                        startRestartGroup.startReplaceGroup(1435837472);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase62222222.ordinal()];
                        if (i21 != 1) {
                        }
                        f4 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        State createTransitionAnimation222222222 = TransitionKt.createTransitionAnimation(updateTransition2222, valueOf22222222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1222222.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition2222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2222222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122222222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter322222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase722222222 = (InputPhase) updateTransition2222.getCurrentState();
                        startRestartGroup.startReplaceGroup(1128033978);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase722222222.ordinal()];
                        if (i22 != 1) {
                        }
                        f5 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Float valueOf3222222222 = Float.valueOf(f5);
                        InputPhase inputPhase8222222222 = (InputPhase) updateTransition2222.getTargetState();
                        startRestartGroup.startReplaceGroup(1128033978);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase8222222222.ordinal()];
                        if (i23 != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final State<Float> createTransitionAnimation3222222222 = TransitionKt.createTransitionAnimation(updateTransition2222, valueOf3222222222, Float.valueOf(f62222), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122222222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition2222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter322222222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222222222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        InputPhase inputPhase9222222222 = (InputPhase) updateTransition2222.getTargetState();
                        startRestartGroup.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase9222222222.ordinal()] == 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        ColorSpace m3844getColorSpaceimpl322222222 = Color.m3844getColorSpaceimpl(j2);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        changed = startRestartGroup.changed(m3844getColorSpaceimpl322222222);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl322222222);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        TwoWayConverter twoWayConverter322222222 = (TwoWayConverter) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase10222222222 = (InputPhase) updateTransition2222.getCurrentState();
                        startRestartGroup.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase10222222222.ordinal()] == 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Color m3830boximpl322222222 = Color.m3830boximpl(j3);
                        inputPhase = (InputPhase) updateTransition2222.getTargetState();
                        startRestartGroup.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final State<Color> createTransitionAnimation4222222222 = TransitionKt.createTransitionAnimation(updateTransition2222, m3830boximpl322222222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition2222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter322222222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222222222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        startRestartGroup.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        ColorSpace m3844getColorSpaceimpl2222222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        changed2 = startRestartGroup.changed(m3844getColorSpaceimpl2222222222);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl2222222222);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        TwoWayConverter twoWayConverter2222222222 = (TwoWayConverter) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        startRestartGroup.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Color m3830boximpl2222222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                        startRestartGroup.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final State<Color> createTransitionAnimation5222222222 = TransitionKt.createTransitionAnimation(updateTransition2222, m3830boximpl2222222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition2222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter2222222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                        final float floatValue222222222 = ((Number) createTransitionAnimation622222.getValue()).floatValue();
                        startRestartGroup.startReplaceGroup(-156998101);
                        ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                        if (function22 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        boolean z19222222222 = z6;
                        boolean z20222222222 = z7;
                        boolean z21222222222 = z8;
                        final long m2338placeholderColorXeAY9LY$material3_release222222222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z19222222222, z20222222222, z21222222222);
                        String str3222222222 = str2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str3222222222);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        State state3222222222 = (State) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(-156965270);
                        ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                        if (function215 == null) {
                        }
                        composableLambda = null;
                        startRestartGroup.endReplaceGroup();
                        final long m2339prefixColorXeAY9LY$material3_release222222222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z19222222222, z20222222222, z21222222222);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str3222222222);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        }
                        State state5222222222 = (State) rememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(-156940524);
                        ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                        if (function210 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final long m2340suffixColorXeAY9LY$material3_release222222222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z19222222222, z20222222222, z21222222222);
                        startRestartGroup.startReplaceGroup(-156921964);
                        ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                        if (function214 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final long m2337leadingIconColorXeAY9LY$material3_release222222222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z19222222222, z20222222222, z21222222222);
                        startRestartGroup.startReplaceGroup(-156902962);
                        ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                        if (function212 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final long m2343trailingIconColorXeAY9LY$material3_release222222222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z19222222222, z20222222222, z21222222222);
                        startRestartGroup.startReplaceGroup(-156893937);
                        ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                        if (function213 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final long m2341supportingTextColorXeAY9LY$material3_release222222222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z19222222222, z20222222222, z21222222222);
                        startRestartGroup.startReplaceGroup(-156884470);
                        ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                        if (function211 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                        if (i26 == i25) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function220 = function216;
                        function221 = function217;
                        z11 = z162222;
                        function222 = function210;
                        function223 = function219;
                        function224 = function214;
                        z12 = z10;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                }
                i15 = i3 & 8192;
                if (i15 == 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((32768 & i3) != 0) {
                }
                i29 |= i17;
                if ((65536 & i3) != 0) {
                }
                i29 |= i28;
                if ((131072 & i3) == 0) {
                }
                i29 |= i27;
                if ((306783379 & i4) != 306783378) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                boolean z1622222 = z13;
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                int i3022222 = i4;
                z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
                Object rememberedValue522222 = startRestartGroup.rememberedValue();
                if (z4) {
                }
                filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                startRestartGroup.updateRememberedValue(filter);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                String text22222 = ((TransformedText) filter).getText().getText();
                boolean booleanValue22222 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i29 >> 12) & 14).getValue().booleanValue();
                InputPhase inputPhase222222 = !booleanValue22222 ? InputPhase.Focused : text22222.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue22222);
                int i3122222 = i29;
                Typography typography22222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                bodyLarge = typography22222.getBodyLarge();
                final TextStyle bodySmall22222 = typography22222.getBodySmall();
                function210 = function228;
                function211 = function230;
                function212 = function226;
                if (Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) {
                }
                m5814getColor0d7_KjU = bodySmall22222.m5814getColor0d7_KjU();
                if (z5) {
                }
                m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
                if (z5) {
                }
                j = m5814getColor0d7_KjU;
                if (function22 == null) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                function213 = function227;
                Transition updateTransition22222 = TransitionKt.updateTransition(inputPhase222222, "TextFieldInputState", startRestartGroup, 48, 0);
                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$122222 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter42222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                function214 = function229;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase322222 = (InputPhase) updateTransition22222.getCurrentState();
                startRestartGroup.startReplaceGroup(-2036730335);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                function215 = function225;
                if (ComposerKt.isTraceInProgress()) {
                }
                i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase322222.ordinal()];
                float f622222 = 1.0f;
                if (i18 != 1) {
                }
                f = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                Float valueOf422222 = Float.valueOf(f);
                InputPhase inputPhase4222222 = (InputPhase) updateTransition22222.getTargetState();
                startRestartGroup.startReplaceGroup(-2036730335);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase4222222.ordinal()];
                if (i19 != 1) {
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                State createTransitionAnimation6222222 = TransitionKt.createTransitionAnimation(updateTransition22222, valueOf422222, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$122222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition22222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter42222, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12222222 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter22222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase52222222 = (InputPhase) updateTransition22222.getCurrentState();
                startRestartGroup.startReplaceGroup(1435837472);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase52222222.ordinal()];
                if (i20 != 1) {
                }
                f3 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                Float valueOf222222222 = Float.valueOf(f3);
                InputPhase inputPhase622222222 = (InputPhase) updateTransition22222.getTargetState();
                startRestartGroup.startReplaceGroup(1435837472);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase622222222.ordinal()];
                if (i21 != 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                State createTransitionAnimation2222222222 = TransitionKt.createTransitionAnimation(updateTransition22222, valueOf222222222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12222222.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition22222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22222222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222222222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter3222222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase7222222222 = (InputPhase) updateTransition22222.getCurrentState();
                startRestartGroup.startReplaceGroup(1128033978);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase7222222222.ordinal()];
                if (i22 != 1) {
                }
                f5 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                Float valueOf32222222222 = Float.valueOf(f5);
                InputPhase inputPhase82222222222 = (InputPhase) updateTransition22222.getTargetState();
                startRestartGroup.startReplaceGroup(1128033978);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase82222222222.ordinal()];
                if (i23 != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                final State<Float> createTransitionAnimation32222222222 = TransitionKt.createTransitionAnimation(updateTransition22222, valueOf32222222222, Float.valueOf(f622222), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition22222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3222222222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222222222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                InputPhase inputPhase92222222222 = (InputPhase) updateTransition22222.getTargetState();
                startRestartGroup.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase92222222222.ordinal()] == 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                ColorSpace m3844getColorSpaceimpl3222222222 = Color.m3844getColorSpaceimpl(j2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                changed = startRestartGroup.changed(m3844getColorSpaceimpl3222222222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl3222222222);
                startRestartGroup.updateRememberedValue(rememberedValue);
                TwoWayConverter twoWayConverter3222222222 = (TwoWayConverter) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase102222222222 = (InputPhase) updateTransition22222.getCurrentState();
                startRestartGroup.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase102222222222.ordinal()] == 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                Color m3830boximpl3222222222 = Color.m3830boximpl(j3);
                inputPhase = (InputPhase) updateTransition22222.getTargetState();
                startRestartGroup.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                final State<Color> createTransitionAnimation42222222222 = TransitionKt.createTransitionAnimation(updateTransition22222, m3830boximpl3222222222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition22222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter3222222222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222222222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                startRestartGroup.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                ColorSpace m3844getColorSpaceimpl22222222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                changed2 = startRestartGroup.changed(m3844getColorSpaceimpl22222222222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl22222222222);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                TwoWayConverter twoWayConverter22222222222 = (TwoWayConverter) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                startRestartGroup.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                Color m3830boximpl22222222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
                startRestartGroup.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceGroup();
                final State<Color> createTransitionAnimation52222222222 = TransitionKt.createTransitionAnimation(updateTransition22222, m3830boximpl22222222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition22222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter22222222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                final float floatValue2222222222 = ((Number) createTransitionAnimation6222222.getValue()).floatValue();
                startRestartGroup.startReplaceGroup(-156998101);
                ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
                if (function22 == null) {
                }
                startRestartGroup.endReplaceGroup();
                boolean z192222222222 = z6;
                boolean z202222222222 = z7;
                boolean z212222222222 = z8;
                final long m2338placeholderColorXeAY9LY$material3_release2222222222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z192222222222, z202222222222, z212222222222);
                String str32222222222 = str2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str32222222222);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                State state32222222222 = (State) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-156965270);
                ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
                if (function215 == null) {
                }
                composableLambda = null;
                startRestartGroup.endReplaceGroup();
                final long m2339prefixColorXeAY9LY$material3_release2222222222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z192222222222, z202222222222, z212222222222);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str32222222222);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                State state52222222222 = (State) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-156940524);
                ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
                if (function210 == null) {
                }
                startRestartGroup.endReplaceGroup();
                final long m2340suffixColorXeAY9LY$material3_release2222222222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z192222222222, z202222222222, z212222222222);
                startRestartGroup.startReplaceGroup(-156921964);
                ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
                if (function214 == null) {
                }
                startRestartGroup.endReplaceGroup();
                final long m2337leadingIconColorXeAY9LY$material3_release2222222222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z192222222222, z202222222222, z212222222222);
                startRestartGroup.startReplaceGroup(-156902962);
                ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
                if (function212 == null) {
                }
                startRestartGroup.endReplaceGroup();
                final long m2343trailingIconColorXeAY9LY$material3_release2222222222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z192222222222, z202222222222, z212222222222);
                startRestartGroup.startReplaceGroup(-156893937);
                ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
                if (function213 == null) {
                }
                startRestartGroup.endReplaceGroup();
                final long m2341supportingTextColorXeAY9LY$material3_release2222222222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z192222222222, z202222222222, z212222222222);
                startRestartGroup.startReplaceGroup(-156884470);
                ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
                if (function211 == null) {
                }
                startRestartGroup.endReplaceGroup();
                i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                if (i26 == i25) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function220 = function216;
                function221 = function217;
                z11 = z1622222;
                function222 = function210;
                function223 = function219;
                function224 = function214;
                z12 = z10;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
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
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            int i292 = i11;
            i13 = i3 & 4096;
            if (i13 != 0) {
            }
            i15 = i3 & 8192;
            if (i15 == 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((32768 & i3) != 0) {
            }
            i292 |= i17;
            if ((65536 & i3) != 0) {
            }
            i292 |= i28;
            if ((131072 & i3) == 0) {
            }
            i292 |= i27;
            if ((306783379 & i4) != 306783378) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            boolean z16222222 = z13;
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
            int i30222222 = i4;
            z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
            Object rememberedValue5222222 = startRestartGroup.rememberedValue();
            if (z4) {
            }
            filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
            startRestartGroup.updateRememberedValue(filter);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String text222222 = ((TransformedText) filter).getText().getText();
            boolean booleanValue222222 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i292 >> 12) & 14).getValue().booleanValue();
            InputPhase inputPhase2222222 = !booleanValue222222 ? InputPhase.Focused : text222222.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue222222);
            int i31222222 = i292;
            Typography typography222222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            bodyLarge = typography222222.getBodyLarge();
            final TextStyle bodySmall222222 = typography222222.getBodySmall();
            function210 = function228;
            function211 = function230;
            function212 = function226;
            if (Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) {
            }
            m5814getColor0d7_KjU = bodySmall222222.m5814getColor0d7_KjU();
            if (z5) {
            }
            m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
            if (z5) {
            }
            j = m5814getColor0d7_KjU;
            if (function22 == null) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
            function213 = function227;
            Transition updateTransition222222 = TransitionKt.updateTransition(inputPhase2222222, "TextFieldInputState", startRestartGroup, 48, 0);
            TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1222222 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter422222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            function214 = function229;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            InputPhase inputPhase3222222 = (InputPhase) updateTransition222222.getCurrentState();
            startRestartGroup.startReplaceGroup(-2036730335);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            function215 = function225;
            if (ComposerKt.isTraceInProgress()) {
            }
            i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase3222222.ordinal()];
            float f6222222 = 1.0f;
            if (i18 != 1) {
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf4222222 = Float.valueOf(f);
            InputPhase inputPhase42222222 = (InputPhase) updateTransition222222.getTargetState();
            startRestartGroup.startReplaceGroup(-2036730335);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase42222222.ordinal()];
            if (i19 != 1) {
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation62222222 = TransitionKt.createTransitionAnimation(updateTransition222222, valueOf4222222, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter422222, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122222222 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            InputPhase inputPhase522222222 = (InputPhase) updateTransition222222.getCurrentState();
            startRestartGroup.startReplaceGroup(1435837472);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase522222222.ordinal()];
            if (i20 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2222222222 = Float.valueOf(f3);
            InputPhase inputPhase6222222222 = (InputPhase) updateTransition222222.getTargetState();
            startRestartGroup.startReplaceGroup(1435837472);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase6222222222.ordinal()];
            if (i21 != 1) {
            }
            f4 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation22222222222 = TransitionKt.createTransitionAnimation(updateTransition222222, valueOf2222222222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122222222.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222222222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222222222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter32222222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            InputPhase inputPhase72222222222 = (InputPhase) updateTransition222222.getCurrentState();
            startRestartGroup.startReplaceGroup(1128033978);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase72222222222.ordinal()];
            if (i22 != 1) {
            }
            f5 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf322222222222 = Float.valueOf(f5);
            InputPhase inputPhase822222222222 = (InputPhase) updateTransition222222.getTargetState();
            startRestartGroup.startReplaceGroup(1128033978);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase822222222222.ordinal()];
            if (i23 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State<Float> createTransitionAnimation322222222222 = TransitionKt.createTransitionAnimation(updateTransition222222, valueOf322222222222, Float.valueOf(f6222222), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter32222222222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222222222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            InputPhase inputPhase922222222222 = (InputPhase) updateTransition222222.getTargetState();
            startRestartGroup.startReplaceGroup(-107432127);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$1[inputPhase922222222222.ordinal()] == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m3844getColorSpaceimpl32222222222 = Color.m3844getColorSpaceimpl(j2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
            changed = startRestartGroup.changed(m3844getColorSpaceimpl32222222222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl32222222222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            TwoWayConverter twoWayConverter32222222222 = (TwoWayConverter) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            InputPhase inputPhase1022222222222 = (InputPhase) updateTransition222222.getCurrentState();
            startRestartGroup.startReplaceGroup(-107432127);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$1[inputPhase1022222222222.ordinal()] == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Color m3830boximpl32222222222 = Color.m3830boximpl(j3);
            inputPhase = (InputPhase) updateTransition222222.getTargetState();
            startRestartGroup.startReplaceGroup(-107432127);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State<Color> createTransitionAnimation422222222222 = TransitionKt.createTransitionAnimation(updateTransition222222, m3830boximpl32222222222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter32222222222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222222222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            startRestartGroup.startReplaceGroup(1023351670);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m3844getColorSpaceimpl222222222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
            changed2 = startRestartGroup.changed(m3844getColorSpaceimpl222222222222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl222222222222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            TwoWayConverter twoWayConverter222222222222 = (TwoWayConverter) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            startRestartGroup.startReplaceGroup(1023351670);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Color m3830boximpl222222222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
            startRestartGroup.startReplaceGroup(1023351670);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State<Color> createTransitionAnimation522222222222 = TransitionKt.createTransitionAnimation(updateTransition222222, m3830boximpl222222222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter222222222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
            final float floatValue22222222222 = ((Number) createTransitionAnimation62222222.getValue()).floatValue();
            startRestartGroup.startReplaceGroup(-156998101);
            ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
            if (function22 == null) {
            }
            startRestartGroup.endReplaceGroup();
            boolean z1922222222222 = z6;
            boolean z2022222222222 = z7;
            boolean z2122222222222 = z8;
            final long m2338placeholderColorXeAY9LY$material3_release22222222222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z1922222222222, z2022222222222, z2122222222222);
            String str322222222222 = str2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str322222222222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            State state322222222222 = (State) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-156965270);
            ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
            if (function215 == null) {
            }
            composableLambda = null;
            startRestartGroup.endReplaceGroup();
            final long m2339prefixColorXeAY9LY$material3_release22222222222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z1922222222222, z2022222222222, z2122222222222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str322222222222);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            State state522222222222 = (State) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-156940524);
            ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
            if (function210 == null) {
            }
            startRestartGroup.endReplaceGroup();
            final long m2340suffixColorXeAY9LY$material3_release22222222222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z1922222222222, z2022222222222, z2122222222222);
            startRestartGroup.startReplaceGroup(-156921964);
            ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
            if (function214 == null) {
            }
            startRestartGroup.endReplaceGroup();
            final long m2337leadingIconColorXeAY9LY$material3_release22222222222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z1922222222222, z2022222222222, z2122222222222);
            startRestartGroup.startReplaceGroup(-156902962);
            ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
            if (function212 == null) {
            }
            startRestartGroup.endReplaceGroup();
            final long m2343trailingIconColorXeAY9LY$material3_release22222222222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z1922222222222, z2022222222222, z2122222222222);
            startRestartGroup.startReplaceGroup(-156893937);
            ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
            if (function213 == null) {
            }
            startRestartGroup.endReplaceGroup();
            final long m2341supportingTextColorXeAY9LY$material3_release22222222222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z1922222222222, z2022222222222, z2122222222222);
            startRestartGroup.startReplaceGroup(-156884470);
            ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
            if (function211 == null) {
            }
            startRestartGroup.endReplaceGroup();
            i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
            if (i26 == i25) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function220 = function216;
            function221 = function217;
            z11 = z16222222;
            function222 = function210;
            function223 = function219;
            function224 = function214;
            z12 = z10;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
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
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        int i2922 = i11;
        i13 = i3 & 4096;
        if (i13 != 0) {
        }
        i15 = i3 & 8192;
        if (i15 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((32768 & i3) != 0) {
        }
        i2922 |= i17;
        if ((65536 & i3) != 0) {
        }
        i2922 |= i28;
        if ((131072 & i3) == 0) {
        }
        i2922 |= i27;
        if ((306783379 & i4) != 306783378) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        boolean z162222222 = z13;
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
        int i302222222 = i4;
        z4 = ((i4 & 7168) != 2048) | ((i4 & 112) != 32);
        Object rememberedValue52222222 = startRestartGroup.rememberedValue();
        if (z4) {
        }
        filter = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
        startRestartGroup.updateRememberedValue(filter);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        String text2222222 = ((TransformedText) filter).getText().getText();
        boolean booleanValue2222222 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i2922 >> 12) & 14).getValue().booleanValue();
        InputPhase inputPhase22222222 = !booleanValue2222222 ? InputPhase.Focused : text2222222.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
        m2336labelColorXeAY9LY$material3_release = textFieldColors.m2336labelColorXeAY9LY$material3_release(z14, z15, booleanValue2222222);
        int i312222222 = i2922;
        Typography typography2222222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
        bodyLarge = typography2222222.getBodyLarge();
        final TextStyle bodySmall2222222 = typography2222222.getBodySmall();
        function210 = function228;
        function211 = function230;
        function212 = function226;
        if (Color.m3841equalsimpl0(bodyLarge.m5814getColor0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU())) {
        }
        m5814getColor0d7_KjU = bodySmall2222222.m5814getColor0d7_KjU();
        if (z5) {
        }
        m5814getColor0d7_KjU2 = bodyLarge.m5814getColor0d7_KjU();
        if (z5) {
        }
        j = m5814getColor0d7_KjU;
        if (function22 == null) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
        function213 = function227;
        Transition updateTransition2222222 = TransitionKt.updateTransition(inputPhase22222222, "TextFieldInputState", startRestartGroup, 48, 0);
        TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$12222222 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter4222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        function214 = function229;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase32222222 = (InputPhase) updateTransition2222222.getCurrentState();
        startRestartGroup.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        function215 = function225;
        if (ComposerKt.isTraceInProgress()) {
        }
        i18 = WhenMappings.$EnumSwitchMapping$1[inputPhase32222222.ordinal()];
        float f62222222 = 1.0f;
        if (i18 != 1) {
        }
        f = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        Float valueOf42222222 = Float.valueOf(f);
        InputPhase inputPhase422222222 = (InputPhase) updateTransition2222222.getTargetState();
        startRestartGroup.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i19 = WhenMappings.$EnumSwitchMapping$1[inputPhase422222222.ordinal()];
        if (i19 != 1) {
        }
        f2 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        State createTransitionAnimation622222222 = TransitionKt.createTransitionAnimation(updateTransition2222222, valueOf42222222, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$12222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition2222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter4222222, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1222222222 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter2222222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase5222222222 = (InputPhase) updateTransition2222222.getCurrentState();
        startRestartGroup.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i20 = WhenMappings.$EnumSwitchMapping$1[inputPhase5222222222.ordinal()];
        if (i20 != 1) {
        }
        f3 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        Float valueOf22222222222 = Float.valueOf(f3);
        InputPhase inputPhase62222222222 = (InputPhase) updateTransition2222222.getTargetState();
        startRestartGroup.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i21 = WhenMappings.$EnumSwitchMapping$1[inputPhase62222222222.ordinal()];
        if (i21 != 1) {
        }
        f4 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        State createTransitionAnimation222222222222 = TransitionKt.createTransitionAnimation(updateTransition2222222, valueOf22222222222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition2222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2222222222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122222222222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter322222222222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase722222222222 = (InputPhase) updateTransition2222222.getCurrentState();
        startRestartGroup.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i22 = WhenMappings.$EnumSwitchMapping$1[inputPhase722222222222.ordinal()];
        if (i22 != 1) {
        }
        f5 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        Float valueOf3222222222222 = Float.valueOf(f5);
        InputPhase inputPhase8222222222222 = (InputPhase) updateTransition2222222.getTargetState();
        startRestartGroup.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase8222222222222.ordinal()];
        if (i23 != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        final State<Float> createTransitionAnimation3222222222222 = TransitionKt.createTransitionAnimation(updateTransition2222222, valueOf3222222222222, Float.valueOf(f62222222), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition2222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter322222222222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222222222222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        InputPhase inputPhase9222222222222 = (InputPhase) updateTransition2222222.getTargetState();
        startRestartGroup.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase9222222222222.ordinal()] == 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        ColorSpace m3844getColorSpaceimpl322222222222 = Color.m3844getColorSpaceimpl(j2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
        changed = startRestartGroup.changed(m3844getColorSpaceimpl322222222222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl322222222222);
        startRestartGroup.updateRememberedValue(rememberedValue);
        TwoWayConverter twoWayConverter322222222222 = (TwoWayConverter) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase10222222222222 = (InputPhase) updateTransition2222222.getCurrentState();
        startRestartGroup.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase10222222222222.ordinal()] == 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        Color m3830boximpl322222222222 = Color.m3830boximpl(j3);
        inputPhase = (InputPhase) updateTransition2222222.getTargetState();
        startRestartGroup.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        final State<Color> createTransitionAnimation4222222222222 = TransitionKt.createTransitionAnimation(updateTransition2222222, m3830boximpl322222222222, Color.m3830boximpl(j), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition2222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter322222222222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222222222222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        startRestartGroup.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        ColorSpace m3844getColorSpaceimpl2222222222222 = Color.m3844getColorSpaceimpl(m2336labelColorXeAY9LY$material3_release);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
        changed2 = startRestartGroup.changed(m3844getColorSpaceimpl2222222222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl2222222222222);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        TwoWayConverter twoWayConverter2222222222222 = (TwoWayConverter) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        startRestartGroup.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        Color m3830boximpl2222222222222 = Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release);
        startRestartGroup.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        final State<Color> createTransitionAnimation5222222222222 = TransitionKt.createTransitionAnimation(updateTransition2222222, m3830boximpl2222222222222, Color.m3830boximpl(m2336labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222222222222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition2222222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i24)), twoWayConverter2222222222222, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
        final float floatValue222222222222 = ((Number) createTransitionAnimation622222222.getValue()).floatValue();
        startRestartGroup.startReplaceGroup(-156998101);
        ComposerKt.sourceInformation(startRestartGroup, "*138@5668L506");
        if (function22 == null) {
        }
        startRestartGroup.endReplaceGroup();
        boolean z19222222222222 = z6;
        boolean z20222222222222 = z7;
        boolean z21222222222222 = z8;
        final long m2338placeholderColorXeAY9LY$material3_release222222222222 = textFieldColors.m2338placeholderColorXeAY9LY$material3_release(z19222222222222, z20222222222222, z21222222222222);
        String str3222222222222 = str2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156971732, str3222222222222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        State state3222222222222 = (State) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-156965270);
        ComposerKt.sourceInformation(startRestartGroup, "160@6765L362");
        if (function215 == null) {
        }
        composableLambda = null;
        startRestartGroup.endReplaceGroup();
        final long m2339prefixColorXeAY9LY$material3_release222222222222 = textFieldColors.m2339prefixColorXeAY9LY$material3_release(z19222222222222, z20222222222222, z21222222222222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -156946547, str3222222222222);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        State state5222222222222 = (State) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-156940524);
        ComposerKt.sourceInformation(startRestartGroup, "177@7507L341");
        if (function210 == null) {
        }
        startRestartGroup.endReplaceGroup();
        final long m2340suffixColorXeAY9LY$material3_release222222222222 = textFieldColors.m2340suffixColorXeAY9LY$material3_release(z19222222222222, z20222222222222, z21222222222222);
        startRestartGroup.startReplaceGroup(-156921964);
        ComposerKt.sourceInformation(startRestartGroup, "191@8087L341");
        if (function214 == null) {
        }
        startRestartGroup.endReplaceGroup();
        final long m2337leadingIconColorXeAY9LY$material3_release222222222222 = textFieldColors.m2337leadingIconColorXeAY9LY$material3_release(z19222222222222, z20222222222222, z21222222222222);
        startRestartGroup.startReplaceGroup(-156902962);
        ComposerKt.sourceInformation(startRestartGroup, "*205@8655L61");
        if (function212 == null) {
        }
        startRestartGroup.endReplaceGroup();
        final long m2343trailingIconColorXeAY9LY$material3_release222222222222 = textFieldColors.m2343trailingIconColorXeAY9LY$material3_release(z19222222222222, z20222222222222, z21222222222222);
        startRestartGroup.startReplaceGroup(-156893937);
        ComposerKt.sourceInformation(startRestartGroup, "*211@8937L62");
        if (function213 == null) {
        }
        startRestartGroup.endReplaceGroup();
        final long m2341supportingTextColorXeAY9LY$material3_release222222222222 = textFieldColors.m2341supportingTextColorXeAY9LY$material3_release(z19222222222222, z20222222222222, z21222222222222);
        startRestartGroup.startReplaceGroup(-156884470);
        ComposerKt.sourceInformation(startRestartGroup, "*217@9228L217");
        if (function211 == null) {
        }
        startRestartGroup.endReplaceGroup();
        i26 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
        if (i26 == i25) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function220 = function216;
        function221 = function217;
        z11 = z162222222;
        function222 = function210;
        function223 = function219;
        function224 = function214;
        z12 = z10;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m2657Decoration3JVO9M(final long j, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1208685580);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color,2)298@12599L62:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208685580, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyleKt.m2583ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, startRestartGroup, i2 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TextFieldImplKt.m2657Decoration3JVO9M(j, textStyle, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m2658DecorationIv8Zu3U(final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(660142980);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color)303@12806L84:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660142980, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(j)), function2, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TextFieldImplKt.m2658DecorationIv8Zu3U(j, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$defaultErrorSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                final Outline mo284createOutlinePq9zytI = Shape.this.mo284createOutlinePq9zytI(cacheDrawScope.m3489getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                final ColorProducer colorProducer2 = colorProducer;
                return cacheDrawScope.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        OutlineKt.m4098drawOutlinewDX37Ww(drawScope, Outline.this, colorProducer2.mo1740invoke0d7_KjU(), (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? Fill.INSTANCE : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? DrawScope.INSTANCE.m4398getDefaultBlendMode0nO6VwU() : 0);
                    }
                });
            }
        });
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

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0176, code lost:
    
        if (r29 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0132, code lost:
    
        if (r29 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        if (r29 != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f4  */
    /* renamed from: TextFieldTransitionScope-Jy8F4Js, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2659TextFieldTransitionScopeJy8F4Js(InputPhase inputPhase, long j, long j2, long j3, boolean z, Function7<? super State<Float>, ? super State<Color>, ? super State<Color>, ? super State<Float>, ? super State<Float>, ? super Composer, ? super Integer, Unit> function7, Composer composer, int i) {
        float f;
        int i2;
        float f2;
        int i3;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        int i7;
        float f5;
        int i8;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        ComposerKt.sourceInformationMarkerStart(composer, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
        Transition updateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", composer, (i & 14) | 48, 0);
        TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase2 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
        }
        int i9 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
        float f6 = 0.0f;
        if (i9 != 1) {
            if (i9 == 2) {
                f = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf = Float.valueOf(f);
                InputPhase inputPhase3 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-2036730335);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                }
                i2 = WhenMappings.$EnumSwitchMapping$1[inputPhase3.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        f2 = 0.0f;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter, "LabelProgress", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase4 = (InputPhase) updateTransition.getCurrentState();
                        composer.startReplaceGroup(1435837472);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                        }
                        i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase4.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                i4 = 3;
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i4 = 3;
                            }
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceGroup();
                            Float valueOf2 = Float.valueOf(f3);
                            InputPhase inputPhase5 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(1435837472);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$1[inputPhase5.ordinal()];
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != i4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f4 = 0.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer.endReplaceGroup();
                                State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                InputPhase inputPhase6 = (InputPhase) updateTransition.getCurrentState();
                                composer.startReplaceGroup(1128033978);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                }
                                i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase6.ordinal()];
                                if (i6 == 1) {
                                    i7 = 3;
                                } else if (i6 != 2) {
                                    i7 = 3;
                                    if (i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    i7 = 3;
                                    if (z) {
                                        f5 = 0.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        Float valueOf3 = Float.valueOf(f5);
                                        InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                        composer.startReplaceGroup(1128033978);
                                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                        }
                                        i8 = WhenMappings.$EnumSwitchMapping$1[inputPhase7.ordinal()];
                                        if (i8 != 1) {
                                            if (i8 != 2) {
                                                if (i8 != i7) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                        }
                                        f6 = 1.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                        InputPhase inputPhase8 = (InputPhase) updateTransition.getTargetState();
                                        composer.startReplaceGroup(-107432127);
                                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                        }
                                        long j4 = WhenMappings.$EnumSwitchMapping$1[inputPhase8.ordinal()] != 1 ? j : j2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        ColorSpace m3844getColorSpaceimpl = Color.m3844getColorSpaceimpl(j4);
                                        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                        changed = composer.changed(m3844getColorSpaceimpl);
                                        rememberedValue = composer.rememberedValue();
                                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl);
                                            composer.updateRememberedValue(rememberedValue);
                                        }
                                        TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                        InputPhase inputPhase9 = (InputPhase) updateTransition.getCurrentState();
                                        composer.startReplaceGroup(-107432127);
                                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                        }
                                        long j5 = WhenMappings.$EnumSwitchMapping$1[inputPhase9.ordinal()] != 1 ? j : j2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        Color m3830boximpl = Color.m3830boximpl(j5);
                                        InputPhase inputPhase10 = (InputPhase) updateTransition.getTargetState();
                                        composer.startReplaceGroup(-107432127);
                                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                        }
                                        long j6 = WhenMappings.$EnumSwitchMapping$1[inputPhase10.ordinal()] != 1 ? j : j2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl, Color.m3830boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                        composer.startReplaceGroup(1023351670);
                                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        ColorSpace m3844getColorSpaceimpl2 = Color.m3844getColorSpaceimpl(j3);
                                        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                        changed2 = composer.changed(m3844getColorSpaceimpl2);
                                        rememberedValue2 = composer.rememberedValue();
                                        if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl2);
                                            composer.updateRememberedValue(rememberedValue2);
                                        }
                                        TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                        composer.startReplaceGroup(1023351670);
                                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        Color m3830boximpl2 = Color.m3830boximpl(j3);
                                        composer.startReplaceGroup(1023351670);
                                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer.endReplaceGroup();
                                        State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl2, Color.m3830boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter2, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        function7.invoke(createTransitionAnimation, createTransitionAnimation4, createTransitionAnimation5, createTransitionAnimation2, createTransitionAnimation3, composer, Integer.valueOf(i & 458752));
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                    }
                                }
                                f5 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                Float valueOf32 = Float.valueOf(f5);
                                InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                                composer.startReplaceGroup(1128033978);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i8 = WhenMappings.$EnumSwitchMapping$1[inputPhase72.ordinal()];
                                if (i8 != 1) {
                                }
                                f6 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                InputPhase inputPhase82 = (InputPhase) updateTransition.getTargetState();
                                composer.startReplaceGroup(-107432127);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase82.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                ColorSpace m3844getColorSpaceimpl3 = Color.m3844getColorSpaceimpl(j4);
                                ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                changed = composer.changed(m3844getColorSpaceimpl3);
                                rememberedValue = composer.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl3);
                                composer.updateRememberedValue(rememberedValue);
                                TwoWayConverter twoWayConverter3 = (TwoWayConverter) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                InputPhase inputPhase92 = (InputPhase) updateTransition.getCurrentState();
                                composer.startReplaceGroup(-107432127);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase92.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                Color m3830boximpl3 = Color.m3830boximpl(j5);
                                InputPhase inputPhase102 = (InputPhase) updateTransition.getTargetState();
                                composer.startReplaceGroup(-107432127);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$1[inputPhase102.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl3, Color.m3830boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter3, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                composer.startReplaceGroup(1023351670);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                ColorSpace m3844getColorSpaceimpl22 = Color.m3844getColorSpaceimpl(j3);
                                ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                changed2 = composer.changed(m3844getColorSpaceimpl22);
                                rememberedValue2 = composer.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl22);
                                composer.updateRememberedValue(rememberedValue2);
                                TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                composer.startReplaceGroup(1023351670);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                Color m3830boximpl22 = Color.m3830boximpl(j3);
                                composer.startReplaceGroup(1023351670);
                                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer.endReplaceGroup();
                                State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl22, Color.m3830boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter22, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                function7.invoke(createTransitionAnimation, createTransitionAnimation42, createTransitionAnimation52, createTransitionAnimation2, createTransitionAnimation32, composer, Integer.valueOf(i & 458752));
                                ComposerKt.sourceInformationMarkerEnd(composer);
                            }
                            f4 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                            InputPhase inputPhase62 = (InputPhase) updateTransition.getCurrentState();
                            composer.startReplaceGroup(1128033978);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase62.ordinal()];
                            if (i6 == 1) {
                            }
                            f5 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            Float valueOf322 = Float.valueOf(f5);
                            InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(1128033978);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i8 = WhenMappings.$EnumSwitchMapping$1[inputPhase722.ordinal()];
                            if (i8 != 1) {
                            }
                            f6 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter32, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase822 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(-107432127);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$1[inputPhase822.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            ColorSpace m3844getColorSpaceimpl32 = Color.m3844getColorSpaceimpl(j4);
                            ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                            changed = composer.changed(m3844getColorSpaceimpl32);
                            rememberedValue = composer.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl32);
                            composer.updateRememberedValue(rememberedValue);
                            TwoWayConverter twoWayConverter32 = (TwoWayConverter) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                            InputPhase inputPhase922 = (InputPhase) updateTransition.getCurrentState();
                            composer.startReplaceGroup(-107432127);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$1[inputPhase922.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            Color m3830boximpl32 = Color.m3830boximpl(j5);
                            InputPhase inputPhase1022 = (InputPhase) updateTransition.getTargetState();
                            composer.startReplaceGroup(-107432127);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$1[inputPhase1022.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl32, Color.m3830boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter32, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            composer.startReplaceGroup(1023351670);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            ColorSpace m3844getColorSpaceimpl222 = Color.m3844getColorSpaceimpl(j3);
                            ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                            changed2 = composer.changed(m3844getColorSpaceimpl222);
                            rememberedValue2 = composer.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl222);
                            composer.updateRememberedValue(rememberedValue2);
                            TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                            composer.startReplaceGroup(1023351670);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            Color m3830boximpl222 = Color.m3830boximpl(j3);
                            composer.startReplaceGroup(1023351670);
                            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer.endReplaceGroup();
                            State createTransitionAnimation522 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl222, Color.m3830boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$122.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter222, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            function7.invoke(createTransitionAnimation, createTransitionAnimation422, createTransitionAnimation522, createTransitionAnimation22, createTransitionAnimation322, composer, Integer.valueOf(i & 458752));
                            ComposerKt.sourceInformationMarkerEnd(composer);
                        }
                        i4 = 3;
                        f3 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Float valueOf22 = Float.valueOf(f3);
                        InputPhase inputPhase52 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(1435837472);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i5 = WhenMappings.$EnumSwitchMapping$1[inputPhase52.ordinal()];
                        if (i5 != 1) {
                        }
                        f4 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                        TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase622 = (InputPhase) updateTransition.getCurrentState();
                        composer.startReplaceGroup(1128033978);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase622.ordinal()];
                        if (i6 == 1) {
                        }
                        f5 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Float valueOf3222 = Float.valueOf(f5);
                        InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(1128033978);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i8 = WhenMappings.$EnumSwitchMapping$1[inputPhase7222.ordinal()];
                        if (i8 != 1) {
                        }
                        f6 = 1.0f;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3222, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter322, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        InputPhase inputPhase8222 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase8222.ordinal()] != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        ColorSpace m3844getColorSpaceimpl322 = Color.m3844getColorSpaceimpl(j4);
                        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        changed = composer.changed(m3844getColorSpaceimpl322);
                        rememberedValue = composer.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl322);
                        composer.updateRememberedValue(rememberedValue);
                        TwoWayConverter twoWayConverter322 = (TwoWayConverter) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase9222 = (InputPhase) updateTransition.getCurrentState();
                        composer.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase9222.ordinal()] != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Color m3830boximpl322 = Color.m3830boximpl(j5);
                        InputPhase inputPhase10222 = (InputPhase) updateTransition.getTargetState();
                        composer.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase10222.ordinal()] != 1) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl322, Color.m3830boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter322, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        composer.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        ColorSpace m3844getColorSpaceimpl2222 = Color.m3844getColorSpaceimpl(j3);
                        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        changed2 = composer.changed(m3844getColorSpaceimpl2222);
                        rememberedValue2 = composer.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl2222);
                        composer.updateRememberedValue(rememberedValue2);
                        TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        composer.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        Color m3830boximpl2222 = Color.m3830boximpl(j3);
                        composer.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer.endReplaceGroup();
                        State createTransitionAnimation5222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl2222, Color.m3830boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter2222, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        function7.invoke(createTransitionAnimation, createTransitionAnimation4222, createTransitionAnimation5222, createTransitionAnimation222, createTransitionAnimation3222, composer, Integer.valueOf(i & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composer);
                    }
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                f2 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation6 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter, "LabelProgress", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase42 = (InputPhase) updateTransition.getCurrentState();
                composer.startReplaceGroup(1435837472);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase42.ordinal()];
                if (i3 != 1) {
                }
                f3 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Float valueOf222 = Float.valueOf(f3);
                InputPhase inputPhase522 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(1435837472);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i5 = WhenMappings.$EnumSwitchMapping$1[inputPhase522.ordinal()];
                if (i5 != 1) {
                }
                f4 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter22, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter3222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase6222 = (InputPhase) updateTransition.getCurrentState();
                composer.startReplaceGroup(1128033978);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase6222.ordinal()];
                if (i6 == 1) {
                }
                f5 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Float valueOf32222 = Float.valueOf(f5);
                InputPhase inputPhase72222 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(1128033978);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i8 = WhenMappings.$EnumSwitchMapping$1[inputPhase72222.ordinal()];
                if (i8 != 1) {
                }
                f6 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32222, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter3222, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                InputPhase inputPhase82222 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase82222.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                ColorSpace m3844getColorSpaceimpl3222 = Color.m3844getColorSpaceimpl(j4);
                ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                changed = composer.changed(m3844getColorSpaceimpl3222);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl3222);
                composer.updateRememberedValue(rememberedValue);
                TwoWayConverter twoWayConverter3222 = (TwoWayConverter) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase92222 = (InputPhase) updateTransition.getCurrentState();
                composer.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase92222.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Color m3830boximpl3222 = Color.m3830boximpl(j5);
                InputPhase inputPhase102222 = (InputPhase) updateTransition.getTargetState();
                composer.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase102222.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl3222, Color.m3830boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter3222, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                composer.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                ColorSpace m3844getColorSpaceimpl22222 = Color.m3844getColorSpaceimpl(j3);
                ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                changed2 = composer.changed(m3844getColorSpaceimpl22222);
                rememberedValue2 = composer.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl22222);
                composer.updateRememberedValue(rememberedValue2);
                TwoWayConverter twoWayConverter22222 = (TwoWayConverter) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                composer.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Color m3830boximpl22222 = Color.m3830boximpl(j3);
                composer.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State createTransitionAnimation52222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl22222, Color.m3830boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter22222, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                function7.invoke(createTransitionAnimation6, createTransitionAnimation42222, createTransitionAnimation52222, createTransitionAnimation2222, createTransitionAnimation32222, composer, Integer.valueOf(i & 458752));
                ComposerKt.sourceInformationMarkerEnd(composer);
            }
            if (i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        f = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf4 = Float.valueOf(f);
        InputPhase inputPhase32 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i2 = WhenMappings.$EnumSwitchMapping$1[inputPhase32.ordinal()];
        if (i2 != 1) {
        }
        f2 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation62 = TransitionKt.createTransitionAnimation(updateTransition, valueOf4, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter, "LabelProgress", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase422 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase422.ordinal()];
        if (i3 != 1) {
        }
        f3 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf2222 = Float.valueOf(f3);
        InputPhase inputPhase5222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i5 = WhenMappings.$EnumSwitchMapping$1[inputPhase5222.ordinal()];
        if (i5 != 1) {
        }
        f4 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter222, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter32222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase62222 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase62222.ordinal()];
        if (i6 == 1) {
        }
        f5 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf322222 = Float.valueOf(f5);
        InputPhase inputPhase722222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i8 = WhenMappings.$EnumSwitchMapping$1[inputPhase722222.ordinal()];
        if (i8 != 1) {
        }
        f6 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation322222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322222, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12222.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter32222, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        InputPhase inputPhase822222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase822222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        ColorSpace m3844getColorSpaceimpl32222 = Color.m3844getColorSpaceimpl(j4);
        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
        changed = composer.changed(m3844getColorSpaceimpl32222);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl32222);
        composer.updateRememberedValue(rememberedValue);
        TwoWayConverter twoWayConverter32222 = (TwoWayConverter) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase922222 = (InputPhase) updateTransition.getCurrentState();
        composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase922222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Color m3830boximpl32222 = Color.m3830boximpl(j5);
        InputPhase inputPhase1022222 = (InputPhase) updateTransition.getTargetState();
        composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase1022222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation422222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl32222, Color.m3830boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter32222, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        ColorSpace m3844getColorSpaceimpl222222 = Color.m3844getColorSpaceimpl(j3);
        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
        changed2 = composer.changed(m3844getColorSpaceimpl222222);
        rememberedValue2 = composer.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3844getColorSpaceimpl222222);
        composer.updateRememberedValue(rememberedValue2);
        TwoWayConverter twoWayConverter222222 = (TwoWayConverter) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Color m3830boximpl222222 = Color.m3830boximpl(j3);
        composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State createTransitionAnimation522222 = TransitionKt.createTransitionAnimation(updateTransition, m3830boximpl222222, Color.m3830boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$122222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) updateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter222222, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        function7.invoke(createTransitionAnimation62, createTransitionAnimation422222, createTransitionAnimation522222, createTransitionAnimation22222, createTransitionAnimation322222, composer, Integer.valueOf(i & 458752));
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m2662animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, boolean z3, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        State<Color> rememberUpdatedState;
        State<Dp> rememberUpdatedState2;
        ComposerKt.sourceInformationMarkerStart(composer, 2047013045, "C(animateBorderStrokeAsState)P(1,4,2!1,3:c#ui.unit.Dp,5:c#ui.unit.Dp)458@18252L73:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long m2335indicatorColorXeAY9LY$material3_release = textFieldColors.m2335indicatorColorXeAY9LY$material3_release(z, z2, z3);
        if (z) {
            composer.startReplaceGroup(1023053998);
            ComposerKt.sourceInformation(composer, "445@17754L84");
            rememberUpdatedState = SingleValueAnimationKt.m114animateColorAsStateeuL9pac(m2335indicatorColorXeAY9LY$material3_release, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1023165505);
            ComposerKt.sourceInformation(composer, "447@17868L33");
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3830boximpl(m2335indicatorColorXeAY9LY$material3_release), composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> state = rememberUpdatedState;
        if (z) {
            composer.startReplaceGroup(1023269417);
            ComposerKt.sourceInformation(composer, "453@18068L85");
            rememberUpdatedState2 = AnimateAsStateKt.m128animateDpAsStateAjpBEmI(z3 ? f : f2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1023478388);
            ComposerKt.sourceInformation(composer, "455@18183L46");
            rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Dp.m6297boximpl(f2), composer, (i >> 15) & 14);
            composer.endReplaceGroup();
        }
        State<BorderStroke> rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m263BorderStrokecXLIe8U(rememberUpdatedState2.getValue().m6313unboximpl(), state.getValue().m3850unboximpl()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rememberUpdatedState3;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 16;
        TextFieldPadding = Dp.m6299constructorimpl(f);
        MinFocusedLabelLineHeight = Dp.m6299constructorimpl(f);
        MinSupportingTextLineHeight = Dp.m6299constructorimpl(f);
        float f2 = 48;
        IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m710defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m6299constructorimpl(f2), Dp.m6299constructorimpl(f2));
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

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
