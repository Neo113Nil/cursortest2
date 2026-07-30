package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aØ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001aØ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020-2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001aì\u0001\u0010/\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\b\u00142\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u0010\"\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\u00109\u001ar\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\u0006\u00103\u001a\u0002042\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001aR\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u001a\u0010R\u001a\u00020\f*\u00020\f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TH\u0000\u001a\u009a\u0001\u0010V\u001a\u00020\u0006*\u00020W2\u0006\u0010X\u001a\u00020$2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\b\u0010a\u001a\u0004\u0018\u00010[2\u0006\u0010b\u001a\u00020[2\b\u0010c\u001a\u0004\u0018\u00010[2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020$2\u0006\u0010e\u001a\u00020$2\u0006\u00103\u001a\u0002042\u0006\u0010E\u001a\u000204H\u0002\u001a\u0080\u0001\u0010f\u001a\u00020\u0006*\u00020W2\u0006\u0010X\u001a\u00020$2\u0006\u0010Y\u001a\u00020$2\u0006\u0010g\u001a\u00020[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\b\u0010a\u001a\u0004\u0018\u00010[2\u0006\u0010b\u001a\u00020[2\b\u0010c\u001a\u0004\u0018\u00010[2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000208H\u0002\u001a\u0014\u0010h\u001a\u00020$*\u00020$2\u0006\u0010i\u001a\u00020$H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", TextFieldImplKt.TextFieldId, "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", "from", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m6299constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z5;
        Modifier modifier2;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z6;
        int i28;
        Modifier modifier3;
        Shape shape2;
        TextFieldColors textFieldColors2;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        MutableInteractionSource mutableInteractionSource2;
        boolean z7;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i30;
        int i31;
        Function2<? super Composer, ? super Integer, Unit> function211;
        int i32;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        final MutableInteractionSource mutableInteractionSource3;
        long m5814getColor0d7_KjU;
        final boolean z9;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final TextFieldColors textFieldColors3;
        final VisualTransformation visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i33;
        final int i34;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final boolean z11;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final boolean z12;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        ScopeUpdateScope endRestartGroup;
        int i35;
        Composer startRestartGroup = composer.startRestartGroup(-676242365);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)201@10573L7,217@11369L5,218@11424L8,230@12004L1956,230@11917L2043:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i36 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i36 |= 384;
                        } else if ((i4 & 384) == 0) {
                            i36 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i36 |= 3072;
                            } else if ((i4 & 3072) == 0) {
                                i36 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                i20 = i6 & 16384;
                                if (i20 != 0) {
                                    i36 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i4 & 24576) == 0) {
                                        i36 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                        i22 = i6 & 32768;
                                        if (i22 == 0) {
                                            i36 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i36 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                        }
                                        i23 = i6 & 65536;
                                        if (i23 == 0) {
                                            i36 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i36 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                        }
                                        i24 = i6 & 131072;
                                        if (i24 == 0) {
                                            i36 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i36 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                                        }
                                        if ((i4 & 100663296) == 0) {
                                            i36 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        i25 = i6 & 524288;
                                        if (i25 == 0) {
                                            i36 |= 805306368;
                                        } else if ((i4 & 805306368) == 0) {
                                            i36 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                                        }
                                        i26 = i6 & 1048576;
                                        if (i26 == 0) {
                                            i27 = i5 | 6;
                                        } else if ((i5 & 6) == 0) {
                                            i27 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                        } else {
                                            i27 = i5;
                                        }
                                        if ((i5 & 48) == 0) {
                                            i27 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                        }
                                        if ((i5 & 384) == 0) {
                                            if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                                i35 = 256;
                                                i27 |= i35;
                                            }
                                            i35 = 128;
                                            i27 |= i35;
                                        }
                                        int i37 = i27;
                                        if ((i7 & 306783379) == 306783378 || (306783379 & i36) != 306783378 || (i37 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                                                z5 = i9 == 0 ? true : z;
                                                boolean z13 = i10 == 0 ? false : z2;
                                                if ((i6 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    modifier2 = companion;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    textStyle2 = (TextStyle) consume;
                                                    i7 &= -458753;
                                                } else {
                                                    modifier2 = companion;
                                                    textStyle2 = textStyle;
                                                }
                                                function28 = i11 == 0 ? null : function2;
                                                function29 = i12 == 0 ? null : function22;
                                                Function2<? super Composer, ? super Integer, Unit> function224 = i13 == 0 ? null : function23;
                                                Function2<? super Composer, ? super Integer, Unit> function225 = i14 == 0 ? null : function24;
                                                Function2<? super Composer, ? super Integer, Unit> function226 = i15 == 0 ? null : function25;
                                                Function2<? super Composer, ? super Integer, Unit> function227 = i17 == 0 ? null : function26;
                                                Function2<? super Composer, ? super Integer, Unit> function228 = i18 == 0 ? null : function27;
                                                z6 = i19 == 0 ? false : z3;
                                                VisualTransformation none = i21 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i22 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                KeyboardActions keyboardActions4 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z14 = i24 == 0 ? false : z4;
                                                if ((i6 & 262144) == 0) {
                                                    i28 = z14 ? 1 : Integer.MAX_VALUE;
                                                    i36 &= -234881025;
                                                } else {
                                                    i28 = i;
                                                }
                                                int i38 = i25 == 0 ? 1 : i2;
                                                MutableInteractionSource mutableInteractionSource5 = i26 == 0 ? mutableInteractionSource : null;
                                                Function2<? super Composer, ? super Integer, Unit> function229 = function224;
                                                Function2<? super Composer, ? super Integer, Unit> function230 = function225;
                                                Shape shape4 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                                if ((i6 & 4194304) == 0) {
                                                    shape2 = shape4;
                                                    textFieldColors2 = TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                    i29 = i7;
                                                    mutableInteractionSource2 = mutableInteractionSource5;
                                                    z7 = z13;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z8 = z14;
                                                    i30 = i28;
                                                    i31 = i38;
                                                    modifier3 = modifier2;
                                                    function211 = function230;
                                                    function210 = function228;
                                                } else {
                                                    modifier3 = modifier2;
                                                    shape2 = shape4;
                                                    textFieldColors2 = textFieldColors;
                                                    i29 = i7;
                                                    function210 = function228;
                                                    mutableInteractionSource2 = mutableInteractionSource5;
                                                    z7 = z13;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z8 = z14;
                                                    i30 = i28;
                                                    i31 = i38;
                                                    function211 = function230;
                                                }
                                                i32 = i36;
                                                function212 = function227;
                                                function213 = function226;
                                                function214 = function229;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i6 & 32) != 0) {
                                                    i7 &= -458753;
                                                }
                                                if ((262144 & i6) != 0) {
                                                    i36 &= -234881025;
                                                }
                                                modifier3 = modifier;
                                                z5 = z;
                                                z7 = z2;
                                                textStyle2 = textStyle;
                                                function28 = function2;
                                                function29 = function22;
                                                function214 = function23;
                                                function213 = function25;
                                                function210 = function27;
                                                z6 = z3;
                                                visualTransformation2 = visualTransformation;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions2 = keyboardActions;
                                                z8 = z4;
                                                i30 = i;
                                                i31 = i2;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                shape2 = shape;
                                                textFieldColors2 = textFieldColors;
                                                i29 = i7;
                                                i32 = i36;
                                                function211 = function24;
                                                function212 = function26;
                                            }
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                function215 = function213;
                                                function216 = function212;
                                            } else {
                                                function216 = function212;
                                                function215 = function213;
                                                ComposerKt.traceEventStart(-676242365, i29, i32, "androidx.compose.material3.TextField (TextField.kt:219)");
                                            }
                                            startRestartGroup.startReplaceGroup(-508515290);
                                            ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
                                            if (mutableInteractionSource2 != null) {
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -508514639, "CC(remember):TextField.kt#9igjgp");
                                                Object rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(-508509180);
                                            ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
                                            m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                                            if (m5814getColor0d7_KjU == 16) {
                                                m5814getColor0d7_KjU = textFieldColors2.m2342textColorXeAY9LY$material3_release(z5, z6, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource3, startRestartGroup, 0).getValue().booleanValue());
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            final TextStyle merge = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final Modifier modifier5 = modifier3;
                                            final boolean z15 = z6;
                                            final TextFieldColors textFieldColors4 = textFieldColors2;
                                            final boolean z16 = z5;
                                            final boolean z17 = z7;
                                            final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                            final KeyboardActions keyboardActions5 = keyboardActions2;
                                            final boolean z18 = z8;
                                            final int i39 = i30;
                                            final int i40 = i31;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final Function2<? super Composer, ? super Integer, Unit> function231 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function232 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function233 = function214;
                                            final Function2<? super Composer, ? super Integer, Unit> function234 = function211;
                                            final Function2<? super Composer, ? super Integer, Unit> function235 = function215;
                                            final Function2<? super Composer, ? super Integer, Unit> function236 = function216;
                                            final Function2<? super Composer, ? super Integer, Unit> function237 = function210;
                                            final Shape shape5 = shape2;
                                            Modifier modifier6 = modifier3;
                                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

                                                public final void invoke(Composer composer2, int i41) {
                                                    ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                                                    if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                                                        }
                                                        Modifier modifier7 = Modifier.this;
                                                        boolean z19 = z15;
                                                        Strings.Companion companion2 = Strings.INSTANCE;
                                                        Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                                        SolidColor solidColor = new SolidColor(textFieldColors4.m2292cursorColorvNxB06k$material3_release(z15), null);
                                                        String str2 = str;
                                                        Function1<String, Unit> function12 = function1;
                                                        boolean z20 = z16;
                                                        boolean z21 = z17;
                                                        TextStyle textStyle4 = merge;
                                                        KeyboardOptions keyboardOptions6 = keyboardOptions5;
                                                        KeyboardActions keyboardActions6 = keyboardActions5;
                                                        boolean z22 = z18;
                                                        int i42 = i39;
                                                        int i43 = i40;
                                                        VisualTransformation visualTransformation5 = visualTransformation4;
                                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                                        SolidColor solidColor2 = solidColor;
                                                        final String str3 = str;
                                                        final boolean z23 = z16;
                                                        final boolean z24 = z18;
                                                        final VisualTransformation visualTransformation6 = visualTransformation4;
                                                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                                        final boolean z25 = z15;
                                                        final Function2<Composer, Integer, Unit> function238 = function231;
                                                        final Function2<Composer, Integer, Unit> function239 = function232;
                                                        final Function2<Composer, Integer, Unit> function240 = function233;
                                                        final Function2<Composer, Integer, Unit> function241 = function234;
                                                        final Function2<Composer, Integer, Unit> function242 = function235;
                                                        final Function2<Composer, Integer, Unit> function243 = function236;
                                                        final Function2<Composer, Integer, Unit> function244 = function237;
                                                        final Shape shape6 = shape5;
                                                        final TextFieldColors textFieldColors5 = textFieldColors4;
                                                        BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(3);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                                                int i45;
                                                                ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                                                if ((i44 & 6) == 0) {
                                                                    i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                                                } else {
                                                                    i45 = i44;
                                                                }
                                                                if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                                                    }
                                                                    TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer3.skipToGroupEnd();
                                                            }
                                                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            z9 = z7;
                                            textStyle3 = textStyle2;
                                            function217 = function29;
                                            textFieldColors3 = textFieldColors2;
                                            visualTransformation3 = visualTransformation2;
                                            function218 = function28;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions3 = keyboardActions2;
                                            z10 = z8;
                                            i33 = i30;
                                            i34 = i31;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape3 = shape2;
                                            function219 = function210;
                                            function220 = function216;
                                            function221 = function214;
                                            z11 = z6;
                                            modifier4 = modifier6;
                                            function222 = function211;
                                            z12 = z5;
                                            function223 = function215;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            z12 = z;
                                            z9 = z2;
                                            textStyle3 = textStyle;
                                            function218 = function2;
                                            function217 = function22;
                                            function221 = function23;
                                            function222 = function24;
                                            function223 = function25;
                                            function220 = function26;
                                            function219 = function27;
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions3 = keyboardActions;
                                            z10 = z4;
                                            i33 = i;
                                            i34 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors3 = textFieldColors;
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
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

                                                public final void invoke(Composer composer2, int i41) {
                                                    TextFieldKt.TextField(str, function1, modifier4, z12, z9, textStyle3, function218, function217, function221, function222, function223, function220, function219, z11, visualTransformation3, keyboardOptions3, keyboardActions3, z10, i33, i34, mutableInteractionSource4, shape3, textFieldColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i6 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                i25 = i6 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i6 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i5 & 48) == 0) {
                                }
                                if ((i5 & 384) == 0) {
                                }
                                int i372 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i6 & 32) == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 262144) == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function2292 = function224;
                                Function2<? super Composer, ? super Integer, Unit> function2302 = function225;
                                Shape shape42 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                if ((i6 & 4194304) == 0) {
                                }
                                i32 = i36;
                                function212 = function227;
                                function213 = function226;
                                function214 = function2292;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceGroup(-508515290);
                                ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
                                if (mutableInteractionSource2 != null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-508509180);
                                ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
                                m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                                if (m5814getColor0d7_KjU == 16) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final TextStyle merge2 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                final Modifier modifier52 = modifier3;
                                final boolean z152 = z6;
                                final TextFieldColors textFieldColors42 = textFieldColors2;
                                final boolean z162 = z5;
                                final boolean z172 = z7;
                                final KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                final KeyboardActions keyboardActions52 = keyboardActions2;
                                final boolean z182 = z8;
                                final int i392 = i30;
                                final int i402 = i31;
                                final VisualTransformation visualTransformation42 = visualTransformation2;
                                final Function2<? super Composer, ? super Integer, Unit> function2312 = function28;
                                final Function2<? super Composer, ? super Integer, Unit> function2322 = function29;
                                final Function2<? super Composer, ? super Integer, Unit> function2332 = function214;
                                final Function2<? super Composer, ? super Integer, Unit> function2342 = function211;
                                final Function2<? super Composer, ? super Integer, Unit> function2352 = function215;
                                final Function2<? super Composer, ? super Integer, Unit> function2362 = function216;
                                final Function2<? super Composer, ? super Integer, Unit> function2372 = function210;
                                final Shape shape52 = shape2;
                                Modifier modifier62 = modifier3;
                                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

                                    public final void invoke(Composer composer2, int i41) {
                                        ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                                        if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                                            }
                                            Modifier modifier7 = Modifier.this;
                                            boolean z19 = z152;
                                            Strings.Companion companion2 = Strings.INSTANCE;
                                            Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                            SolidColor solidColor = new SolidColor(textFieldColors42.m2292cursorColorvNxB06k$material3_release(z152), null);
                                            String str2 = str;
                                            Function1<String, Unit> function12 = function1;
                                            boolean z20 = z162;
                                            boolean z21 = z172;
                                            TextStyle textStyle4 = merge2;
                                            KeyboardOptions keyboardOptions6 = keyboardOptions52;
                                            KeyboardActions keyboardActions6 = keyboardActions52;
                                            boolean z22 = z182;
                                            int i42 = i392;
                                            int i43 = i402;
                                            VisualTransformation visualTransformation5 = visualTransformation42;
                                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                            SolidColor solidColor2 = solidColor;
                                            final String str3 = str;
                                            final boolean z23 = z162;
                                            final boolean z24 = z182;
                                            final VisualTransformation visualTransformation6 = visualTransformation42;
                                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                            final boolean z25 = z152;
                                            final Function2<? super Composer, ? super Integer, Unit> function238 = function2312;
                                            final Function2<? super Composer, ? super Integer, Unit> function239 = function2322;
                                            final Function2<? super Composer, ? super Integer, Unit> function240 = function2332;
                                            final Function2<? super Composer, ? super Integer, Unit> function241 = function2342;
                                            final Function2<? super Composer, ? super Integer, Unit> function242 = function2352;
                                            final Function2<? super Composer, ? super Integer, Unit> function243 = function2362;
                                            final Function2<? super Composer, ? super Integer, Unit> function244 = function2372;
                                            final Shape shape6 = shape52;
                                            final TextFieldColors textFieldColors5 = textFieldColors42;
                                            BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                                    int i45;
                                                    ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                                    if ((i44 & 6) == 0) {
                                                        i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                                    } else {
                                                        i45 = i44;
                                                    }
                                                    if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z9 = z7;
                                textStyle3 = textStyle2;
                                function217 = function29;
                                textFieldColors3 = textFieldColors2;
                                visualTransformation3 = visualTransformation2;
                                function218 = function28;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                z10 = z8;
                                i33 = i30;
                                i34 = i31;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape3 = shape2;
                                function219 = function210;
                                function220 = function216;
                                function221 = function214;
                                z11 = z6;
                                modifier4 = modifier62;
                                function222 = function211;
                                z12 = z5;
                                function223 = function215;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i6 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i25 = i6 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i6 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            int i3722 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i6 & 32) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 262144) == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function22922 = function224;
                            Function2<? super Composer, ? super Integer, Unit> function23022 = function225;
                            Shape shape422 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                            if ((i6 & 4194304) == 0) {
                            }
                            i32 = i36;
                            function212 = function227;
                            function213 = function226;
                            function214 = function22922;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(-508515290);
                            ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
                            if (mutableInteractionSource2 != null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-508509180);
                            ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
                            m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                            if (m5814getColor0d7_KjU == 16) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final TextStyle merge22 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            final Modifier modifier522 = modifier3;
                            final boolean z1522 = z6;
                            final TextFieldColors textFieldColors422 = textFieldColors2;
                            final boolean z1622 = z5;
                            final boolean z1722 = z7;
                            final KeyboardOptions keyboardOptions522 = keyboardOptions2;
                            final KeyboardActions keyboardActions522 = keyboardActions2;
                            final boolean z1822 = z8;
                            final int i3922 = i30;
                            final int i4022 = i31;
                            final VisualTransformation visualTransformation422 = visualTransformation2;
                            final Function2<? super Composer, ? super Integer, Unit> function23122 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function23222 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function23322 = function214;
                            final Function2<? super Composer, ? super Integer, Unit> function23422 = function211;
                            final Function2<? super Composer, ? super Integer, Unit> function23522 = function215;
                            final Function2<? super Composer, ? super Integer, Unit> function23622 = function216;
                            final Function2<? super Composer, ? super Integer, Unit> function23722 = function210;
                            final Shape shape522 = shape2;
                            Modifier modifier622 = modifier3;
                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

                                public final void invoke(Composer composer2, int i41) {
                                    ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                                    if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                                        }
                                        Modifier modifier7 = Modifier.this;
                                        boolean z19 = z1522;
                                        Strings.Companion companion2 = Strings.INSTANCE;
                                        Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                        SolidColor solidColor = new SolidColor(textFieldColors422.m2292cursorColorvNxB06k$material3_release(z1522), null);
                                        String str2 = str;
                                        Function1<String, Unit> function12 = function1;
                                        boolean z20 = z1622;
                                        boolean z21 = z1722;
                                        TextStyle textStyle4 = merge22;
                                        KeyboardOptions keyboardOptions6 = keyboardOptions522;
                                        KeyboardActions keyboardActions6 = keyboardActions522;
                                        boolean z22 = z1822;
                                        int i42 = i3922;
                                        int i43 = i4022;
                                        VisualTransformation visualTransformation5 = visualTransformation422;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final String str3 = str;
                                        final boolean z23 = z1622;
                                        final boolean z24 = z1822;
                                        final VisualTransformation visualTransformation6 = visualTransformation422;
                                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                        final boolean z25 = z1522;
                                        final Function2<? super Composer, ? super Integer, Unit> function238 = function23122;
                                        final Function2<? super Composer, ? super Integer, Unit> function239 = function23222;
                                        final Function2<? super Composer, ? super Integer, Unit> function240 = function23322;
                                        final Function2<? super Composer, ? super Integer, Unit> function241 = function23422;
                                        final Function2<? super Composer, ? super Integer, Unit> function242 = function23522;
                                        final Function2<? super Composer, ? super Integer, Unit> function243 = function23622;
                                        final Function2<? super Composer, ? super Integer, Unit> function244 = function23722;
                                        final Shape shape6 = shape522;
                                        final TextFieldColors textFieldColors5 = textFieldColors422;
                                        BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                                int i45;
                                                ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                                if ((i44 & 6) == 0) {
                                                    i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                                } else {
                                                    i45 = i44;
                                                }
                                                if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z9 = z7;
                            textStyle3 = textStyle2;
                            function217 = function29;
                            textFieldColors3 = textFieldColors2;
                            visualTransformation3 = visualTransformation2;
                            function218 = function28;
                            keyboardOptions3 = keyboardOptions2;
                            keyboardActions3 = keyboardActions2;
                            z10 = z8;
                            i33 = i30;
                            i34 = i31;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape3 = shape2;
                            function219 = function210;
                            function220 = function216;
                            function221 = function214;
                            z11 = z6;
                            modifier4 = modifier622;
                            function222 = function211;
                            z12 = z5;
                            function223 = function215;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i25 = i6 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        int i37222 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 262144) == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function229222 = function224;
                        Function2<? super Composer, ? super Integer, Unit> function230222 = function225;
                        Shape shape4222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                        if ((i6 & 4194304) == 0) {
                        }
                        i32 = i36;
                        function212 = function227;
                        function213 = function226;
                        function214 = function229222;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(-508515290);
                        ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
                        if (mutableInteractionSource2 != null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-508509180);
                        ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
                        m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                        if (m5814getColor0d7_KjU == 16) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final TextStyle merge222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        final Modifier modifier5222 = modifier3;
                        final boolean z15222 = z6;
                        final TextFieldColors textFieldColors4222 = textFieldColors2;
                        final boolean z16222 = z5;
                        final boolean z17222 = z7;
                        final KeyboardOptions keyboardOptions5222 = keyboardOptions2;
                        final KeyboardActions keyboardActions5222 = keyboardActions2;
                        final boolean z18222 = z8;
                        final int i39222 = i30;
                        final int i40222 = i31;
                        final VisualTransformation visualTransformation4222 = visualTransformation2;
                        final Function2<? super Composer, ? super Integer, Unit> function231222 = function28;
                        final Function2<? super Composer, ? super Integer, Unit> function232222 = function29;
                        final Function2<? super Composer, ? super Integer, Unit> function233222 = function214;
                        final Function2<? super Composer, ? super Integer, Unit> function234222 = function211;
                        final Function2<? super Composer, ? super Integer, Unit> function235222 = function215;
                        final Function2<? super Composer, ? super Integer, Unit> function236222 = function216;
                        final Function2<? super Composer, ? super Integer, Unit> function237222 = function210;
                        final Shape shape5222 = shape2;
                        Modifier modifier6222 = modifier3;
                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

                            public final void invoke(Composer composer2, int i41) {
                                ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                                if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                                    }
                                    Modifier modifier7 = Modifier.this;
                                    boolean z19 = z15222;
                                    Strings.Companion companion2 = Strings.INSTANCE;
                                    Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                    SolidColor solidColor = new SolidColor(textFieldColors4222.m2292cursorColorvNxB06k$material3_release(z15222), null);
                                    String str2 = str;
                                    Function1<String, Unit> function12 = function1;
                                    boolean z20 = z16222;
                                    boolean z21 = z17222;
                                    TextStyle textStyle4 = merge222;
                                    KeyboardOptions keyboardOptions6 = keyboardOptions5222;
                                    KeyboardActions keyboardActions6 = keyboardActions5222;
                                    boolean z22 = z18222;
                                    int i42 = i39222;
                                    int i43 = i40222;
                                    VisualTransformation visualTransformation5 = visualTransformation4222;
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                    SolidColor solidColor2 = solidColor;
                                    final String str3 = str;
                                    final boolean z23 = z16222;
                                    final boolean z24 = z18222;
                                    final VisualTransformation visualTransformation6 = visualTransformation4222;
                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                    final boolean z25 = z15222;
                                    final Function2<? super Composer, ? super Integer, Unit> function238 = function231222;
                                    final Function2<? super Composer, ? super Integer, Unit> function239 = function232222;
                                    final Function2<? super Composer, ? super Integer, Unit> function240 = function233222;
                                    final Function2<? super Composer, ? super Integer, Unit> function241 = function234222;
                                    final Function2<? super Composer, ? super Integer, Unit> function242 = function235222;
                                    final Function2<? super Composer, ? super Integer, Unit> function243 = function236222;
                                    final Function2<? super Composer, ? super Integer, Unit> function244 = function237222;
                                    final Shape shape6 = shape5222;
                                    final TextFieldColors textFieldColors5 = textFieldColors4222;
                                    BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                            int i45;
                                            ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                            if ((i44 & 6) == 0) {
                                                i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                            } else {
                                                i45 = i44;
                                            }
                                            if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                                }
                                                TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z9 = z7;
                        textStyle3 = textStyle2;
                        function217 = function29;
                        textFieldColors3 = textFieldColors2;
                        visualTransformation3 = visualTransformation2;
                        function218 = function28;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        z10 = z8;
                        i33 = i30;
                        i34 = i31;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        shape3 = shape2;
                        function219 = function210;
                        function220 = function216;
                        function221 = function214;
                        z11 = z6;
                        modifier4 = modifier6222;
                        function222 = function211;
                        z12 = z5;
                        function223 = function215;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i362 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i25 = i6 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    int i372222 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 262144) == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function2292222 = function224;
                    Function2<? super Composer, ? super Integer, Unit> function2302222 = function225;
                    Shape shape42222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                    if ((i6 & 4194304) == 0) {
                    }
                    i32 = i362;
                    function212 = function227;
                    function213 = function226;
                    function214 = function2292222;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(-508515290);
                    ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
                    if (mutableInteractionSource2 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-508509180);
                    ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
                    m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                    if (m5814getColor0d7_KjU == 16) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final TextStyle merge2222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    final Modifier modifier52222 = modifier3;
                    final boolean z152222 = z6;
                    final TextFieldColors textFieldColors42222 = textFieldColors2;
                    final boolean z162222 = z5;
                    final boolean z172222 = z7;
                    final KeyboardOptions keyboardOptions52222 = keyboardOptions2;
                    final KeyboardActions keyboardActions52222 = keyboardActions2;
                    final boolean z182222 = z8;
                    final int i392222 = i30;
                    final int i402222 = i31;
                    final VisualTransformation visualTransformation42222 = visualTransformation2;
                    final Function2<? super Composer, ? super Integer, Unit> function2312222 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function2322222 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function2332222 = function214;
                    final Function2<? super Composer, ? super Integer, Unit> function2342222 = function211;
                    final Function2<? super Composer, ? super Integer, Unit> function2352222 = function215;
                    final Function2<? super Composer, ? super Integer, Unit> function2362222 = function216;
                    final Function2<? super Composer, ? super Integer, Unit> function2372222 = function210;
                    final Shape shape52222 = shape2;
                    Modifier modifier62222 = modifier3;
                    CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

                        public final void invoke(Composer composer2, int i41) {
                            ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                            if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                                }
                                Modifier modifier7 = Modifier.this;
                                boolean z19 = z152222;
                                Strings.Companion companion2 = Strings.INSTANCE;
                                Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                SolidColor solidColor = new SolidColor(textFieldColors42222.m2292cursorColorvNxB06k$material3_release(z152222), null);
                                String str2 = str;
                                Function1<String, Unit> function12 = function1;
                                boolean z20 = z162222;
                                boolean z21 = z172222;
                                TextStyle textStyle4 = merge2222;
                                KeyboardOptions keyboardOptions6 = keyboardOptions52222;
                                KeyboardActions keyboardActions6 = keyboardActions52222;
                                boolean z22 = z182222;
                                int i42 = i392222;
                                int i43 = i402222;
                                VisualTransformation visualTransformation5 = visualTransformation42222;
                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                SolidColor solidColor2 = solidColor;
                                final String str3 = str;
                                final boolean z23 = z162222;
                                final boolean z24 = z182222;
                                final VisualTransformation visualTransformation6 = visualTransformation42222;
                                final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                final boolean z25 = z152222;
                                final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222;
                                final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222;
                                final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222;
                                final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222;
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222;
                                final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222;
                                final Function2<? super Composer, ? super Integer, Unit> function244 = function2372222;
                                final Shape shape6 = shape52222;
                                final TextFieldColors textFieldColors5 = textFieldColors42222;
                                BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                        int i45;
                                        ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                        if ((i44 & 6) == 0) {
                                            i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                        } else {
                                            i45 = i44;
                                        }
                                        if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                            }
                                            TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z9 = z7;
                    textStyle3 = textStyle2;
                    function217 = function29;
                    textFieldColors3 = textFieldColors2;
                    visualTransformation3 = visualTransformation2;
                    function218 = function28;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    z10 = z8;
                    i33 = i30;
                    i34 = i31;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    shape3 = shape2;
                    function219 = function210;
                    function220 = function216;
                    function221 = function214;
                    z11 = z6;
                    modifier4 = modifier62222;
                    function222 = function211;
                    z12 = z5;
                    function223 = function215;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3622 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 != 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                i23 = i6 & 65536;
                if (i23 == 0) {
                }
                i24 = i6 & 131072;
                if (i24 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i25 = i6 & 524288;
                if (i25 == 0) {
                }
                i26 = i6 & 1048576;
                if (i26 == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                int i3722222 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i6 & 262144) == 0) {
                }
                if (i25 == 0) {
                }
                if (i26 == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function22922222 = function224;
                Function2<? super Composer, ? super Integer, Unit> function23022222 = function225;
                Shape shape422222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                if ((i6 & 4194304) == 0) {
                }
                i32 = i3622;
                function212 = function227;
                function213 = function226;
                function214 = function22922222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(-508515290);
                ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
                if (mutableInteractionSource2 != null) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-508509180);
                ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
                m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                if (m5814getColor0d7_KjU == 16) {
                }
                startRestartGroup.endReplaceGroup();
                final TextStyle merge22222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                final Modifier modifier522222 = modifier3;
                final boolean z1522222 = z6;
                final TextFieldColors textFieldColors422222 = textFieldColors2;
                final boolean z1622222 = z5;
                final boolean z1722222 = z7;
                final KeyboardOptions keyboardOptions522222 = keyboardOptions2;
                final KeyboardActions keyboardActions522222 = keyboardActions2;
                final boolean z1822222 = z8;
                final int i3922222 = i30;
                final int i4022222 = i31;
                final VisualTransformation visualTransformation422222 = visualTransformation2;
                final Function2<? super Composer, ? super Integer, Unit> function23122222 = function28;
                final Function2<? super Composer, ? super Integer, Unit> function23222222 = function29;
                final Function2<? super Composer, ? super Integer, Unit> function23322222 = function214;
                final Function2<? super Composer, ? super Integer, Unit> function23422222 = function211;
                final Function2<? super Composer, ? super Integer, Unit> function23522222 = function215;
                final Function2<? super Composer, ? super Integer, Unit> function23622222 = function216;
                final Function2<? super Composer, ? super Integer, Unit> function23722222 = function210;
                final Shape shape522222 = shape2;
                Modifier modifier622222 = modifier3;
                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

                    public final void invoke(Composer composer2, int i41) {
                        ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                        if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                            }
                            Modifier modifier7 = Modifier.this;
                            boolean z19 = z1522222;
                            Strings.Companion companion2 = Strings.INSTANCE;
                            Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                            SolidColor solidColor = new SolidColor(textFieldColors422222.m2292cursorColorvNxB06k$material3_release(z1522222), null);
                            String str2 = str;
                            Function1<String, Unit> function12 = function1;
                            boolean z20 = z1622222;
                            boolean z21 = z1722222;
                            TextStyle textStyle4 = merge22222;
                            KeyboardOptions keyboardOptions6 = keyboardOptions522222;
                            KeyboardActions keyboardActions6 = keyboardActions522222;
                            boolean z22 = z1822222;
                            int i42 = i3922222;
                            int i43 = i4022222;
                            VisualTransformation visualTransformation5 = visualTransformation422222;
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                            SolidColor solidColor2 = solidColor;
                            final String str3 = str;
                            final boolean z23 = z1622222;
                            final boolean z24 = z1822222;
                            final VisualTransformation visualTransformation6 = visualTransformation422222;
                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                            final boolean z25 = z1522222;
                            final Function2<? super Composer, ? super Integer, Unit> function238 = function23122222;
                            final Function2<? super Composer, ? super Integer, Unit> function239 = function23222222;
                            final Function2<? super Composer, ? super Integer, Unit> function240 = function23322222;
                            final Function2<? super Composer, ? super Integer, Unit> function241 = function23422222;
                            final Function2<? super Composer, ? super Integer, Unit> function242 = function23522222;
                            final Function2<? super Composer, ? super Integer, Unit> function243 = function23622222;
                            final Function2<? super Composer, ? super Integer, Unit> function244 = function23722222;
                            final Shape shape6 = shape522222;
                            final TextFieldColors textFieldColors5 = textFieldColors422222;
                            BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                    int i45;
                                    ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                    if ((i44 & 6) == 0) {
                                        i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                    } else {
                                        i45 = i44;
                                    }
                                    if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                        }
                                        TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                z9 = z7;
                textStyle3 = textStyle2;
                function217 = function29;
                textFieldColors3 = textFieldColors2;
                visualTransformation3 = visualTransformation2;
                function218 = function28;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                z10 = z8;
                i33 = i30;
                i34 = i31;
                mutableInteractionSource4 = mutableInteractionSource2;
                shape3 = shape2;
                function219 = function210;
                function220 = function216;
                function221 = function214;
                z11 = z6;
                modifier4 = modifier622222;
                function222 = function211;
                z12 = z5;
                function223 = function215;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i36222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 != 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            i23 = i6 & 65536;
            if (i23 == 0) {
            }
            i24 = i6 & 131072;
            if (i24 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i25 = i6 & 524288;
            if (i25 == 0) {
            }
            i26 = i6 & 1048576;
            if (i26 == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            int i37222222 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i6 & 262144) == 0) {
            }
            if (i25 == 0) {
            }
            if (i26 == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function229222222 = function224;
            Function2<? super Composer, ? super Integer, Unit> function230222222 = function225;
            Shape shape4222222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
            if ((i6 & 4194304) == 0) {
            }
            i32 = i36222;
            function212 = function227;
            function213 = function226;
            function214 = function229222222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(-508515290);
            ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
            if (mutableInteractionSource2 != null) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-508509180);
            ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
            m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
            if (m5814getColor0d7_KjU == 16) {
            }
            startRestartGroup.endReplaceGroup();
            final TextStyle merge222222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final Modifier modifier5222222 = modifier3;
            final boolean z15222222 = z6;
            final TextFieldColors textFieldColors4222222 = textFieldColors2;
            final boolean z16222222 = z5;
            final boolean z17222222 = z7;
            final KeyboardOptions keyboardOptions5222222 = keyboardOptions2;
            final KeyboardActions keyboardActions5222222 = keyboardActions2;
            final boolean z18222222 = z8;
            final int i39222222 = i30;
            final int i40222222 = i31;
            final VisualTransformation visualTransformation4222222 = visualTransformation2;
            final Function2<? super Composer, ? super Integer, Unit> function231222222 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function232222222 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function233222222 = function214;
            final Function2<? super Composer, ? super Integer, Unit> function234222222 = function211;
            final Function2<? super Composer, ? super Integer, Unit> function235222222 = function215;
            final Function2<? super Composer, ? super Integer, Unit> function236222222 = function216;
            final Function2<? super Composer, ? super Integer, Unit> function237222222 = function210;
            final Shape shape5222222 = shape2;
            Modifier modifier6222222 = modifier3;
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

                public final void invoke(Composer composer2, int i41) {
                    ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                    if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                        }
                        Modifier modifier7 = Modifier.this;
                        boolean z19 = z15222222;
                        Strings.Companion companion2 = Strings.INSTANCE;
                        Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                        SolidColor solidColor = new SolidColor(textFieldColors4222222.m2292cursorColorvNxB06k$material3_release(z15222222), null);
                        String str2 = str;
                        Function1<String, Unit> function12 = function1;
                        boolean z20 = z16222222;
                        boolean z21 = z17222222;
                        TextStyle textStyle4 = merge222222;
                        KeyboardOptions keyboardOptions6 = keyboardOptions5222222;
                        KeyboardActions keyboardActions6 = keyboardActions5222222;
                        boolean z22 = z18222222;
                        int i42 = i39222222;
                        int i43 = i40222222;
                        VisualTransformation visualTransformation5 = visualTransformation4222222;
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                        SolidColor solidColor2 = solidColor;
                        final String str3 = str;
                        final boolean z23 = z16222222;
                        final boolean z24 = z18222222;
                        final VisualTransformation visualTransformation6 = visualTransformation4222222;
                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                        final boolean z25 = z15222222;
                        final Function2<? super Composer, ? super Integer, Unit> function238 = function231222222;
                        final Function2<? super Composer, ? super Integer, Unit> function239 = function232222222;
                        final Function2<? super Composer, ? super Integer, Unit> function240 = function233222222;
                        final Function2<? super Composer, ? super Integer, Unit> function241 = function234222222;
                        final Function2<? super Composer, ? super Integer, Unit> function242 = function235222222;
                        final Function2<? super Composer, ? super Integer, Unit> function243 = function236222222;
                        final Function2<? super Composer, ? super Integer, Unit> function244 = function237222222;
                        final Shape shape6 = shape5222222;
                        final TextFieldColors textFieldColors5 = textFieldColors4222222;
                        BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                int i45;
                                ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                if ((i44 & 6) == 0) {
                                    i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                } else {
                                    i45 = i44;
                                }
                                if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                    }
                                    TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            z9 = z7;
            textStyle3 = textStyle2;
            function217 = function29;
            textFieldColors3 = textFieldColors2;
            visualTransformation3 = visualTransformation2;
            function218 = function28;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            z10 = z8;
            i33 = i30;
            i34 = i31;
            mutableInteractionSource4 = mutableInteractionSource2;
            shape3 = shape2;
            function219 = function210;
            function220 = function216;
            function221 = function214;
            z11 = z6;
            modifier4 = modifier6222222;
            function222 = function211;
            z12 = z5;
            function223 = function215;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i362222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 != 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        i23 = i6 & 65536;
        if (i23 == 0) {
        }
        i24 = i6 & 131072;
        if (i24 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i25 = i6 & 524288;
        if (i25 == 0) {
        }
        i26 = i6 & 1048576;
        if (i26 == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        int i372222222 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i6 & 262144) == 0) {
        }
        if (i25 == 0) {
        }
        if (i26 == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function2292222222 = function224;
        Function2<? super Composer, ? super Integer, Unit> function2302222222 = function225;
        Shape shape42222222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
        if ((i6 & 4194304) == 0) {
        }
        i32 = i362222;
        function212 = function227;
        function213 = function226;
        function214 = function2292222222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-508515290);
        ComposerKt.sourceInformation(startRestartGroup, "221@11518L39");
        if (mutableInteractionSource2 != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-508509180);
        ComposerKt.sourceInformation(startRestartGroup, "*225@11742L25");
        m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
        if (m5814getColor0d7_KjU == 16) {
        }
        startRestartGroup.endReplaceGroup();
        final TextStyle merge2222222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        final Modifier modifier52222222 = modifier3;
        final boolean z152222222 = z6;
        final TextFieldColors textFieldColors42222222 = textFieldColors2;
        final boolean z162222222 = z5;
        final boolean z172222222 = z7;
        final KeyboardOptions keyboardOptions52222222 = keyboardOptions2;
        final KeyboardActions keyboardActions52222222 = keyboardActions2;
        final boolean z182222222 = z8;
        final int i392222222 = i30;
        final int i402222222 = i31;
        final VisualTransformation visualTransformation42222222 = visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function2312222222 = function28;
        final Function2<? super Composer, ? super Integer, Unit> function2322222222 = function29;
        final Function2<? super Composer, ? super Integer, Unit> function2332222222 = function214;
        final Function2<? super Composer, ? super Integer, Unit> function2342222222 = function211;
        final Function2<? super Composer, ? super Integer, Unit> function2352222222 = function215;
        final Function2<? super Composer, ? super Integer, Unit> function2362222222 = function216;
        final Function2<? super Composer, ? super Integer, Unit> function2372222222 = function210;
        final Shape shape52222222 = shape2;
        Modifier modifier62222222 = modifier3;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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

            public final void invoke(Composer composer2, int i41) {
                ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1859145987, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                    }
                    Modifier modifier7 = Modifier.this;
                    boolean z19 = z152222222;
                    Strings.Companion companion2 = Strings.INSTANCE;
                    Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                    SolidColor solidColor = new SolidColor(textFieldColors42222222.m2292cursorColorvNxB06k$material3_release(z152222222), null);
                    String str2 = str;
                    Function1<String, Unit> function12 = function1;
                    boolean z20 = z162222222;
                    boolean z21 = z172222222;
                    TextStyle textStyle4 = merge2222222;
                    KeyboardOptions keyboardOptions6 = keyboardOptions52222222;
                    KeyboardActions keyboardActions6 = keyboardActions52222222;
                    boolean z22 = z182222222;
                    int i42 = i392222222;
                    int i43 = i402222222;
                    VisualTransformation visualTransformation5 = visualTransformation42222222;
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                    SolidColor solidColor2 = solidColor;
                    final String str3 = str;
                    final boolean z23 = z162222222;
                    final boolean z24 = z182222222;
                    final VisualTransformation visualTransformation6 = visualTransformation42222222;
                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                    final boolean z25 = z152222222;
                    final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222222;
                    final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222222;
                    final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222222;
                    final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222222;
                    final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222222;
                    final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222222;
                    final Function2<? super Composer, ? super Integer, Unit> function244 = function2372222222;
                    final Shape shape6 = shape52222222;
                    final TextFieldColors textFieldColors5 = textFieldColors42222222;
                    BasicTextFieldKt.BasicTextField(str2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                            int i45;
                            ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                            if ((i44 & 6) == 0) {
                                i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                            } else {
                                i45 = i44;
                            }
                            if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-288211827, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                }
                                TextFieldDefaults.INSTANCE.DecorationBox(str3, function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
        }
        z9 = z7;
        textStyle3 = textStyle2;
        function217 = function29;
        textFieldColors3 = textFieldColors2;
        visualTransformation3 = visualTransformation2;
        function218 = function28;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        z10 = z8;
        i33 = i30;
        i34 = i31;
        mutableInteractionSource4 = mutableInteractionSource2;
        shape3 = shape2;
        function219 = function210;
        function220 = function216;
        function221 = function214;
        z11 = z6;
        modifier4 = modifier62222222;
        function222 = function211;
        z12 = z5;
        function223 = function215;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z5;
        Modifier modifier2;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        boolean z6;
        int i28;
        Modifier modifier3;
        Shape shape2;
        TextFieldColors textFieldColors2;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        MutableInteractionSource mutableInteractionSource2;
        boolean z7;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i30;
        int i31;
        Function2<? super Composer, ? super Integer, Unit> function211;
        int i32;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        final MutableInteractionSource mutableInteractionSource3;
        long m5814getColor0d7_KjU;
        final boolean z9;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final TextFieldColors textFieldColors3;
        final VisualTransformation visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i33;
        final int i34;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final boolean z11;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final boolean z12;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        ScopeUpdateScope endRestartGroup;
        int i35;
        Composer startRestartGroup = composer.startRestartGroup(-1268528240);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)357@19138L7,373@19934L5,374@19989L8,386@20569L1961,386@20482L2048:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i36 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i36 |= 384;
                        } else if ((i4 & 384) == 0) {
                            i36 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i36 |= 3072;
                            } else if ((i4 & 3072) == 0) {
                                i36 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                i20 = i6 & 16384;
                                if (i20 != 0) {
                                    i36 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i4 & 24576) == 0) {
                                        i36 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                        i22 = i6 & 32768;
                                        if (i22 == 0) {
                                            i36 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i36 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                        }
                                        i23 = i6 & 65536;
                                        if (i23 == 0) {
                                            i36 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i36 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                        }
                                        i24 = i6 & 131072;
                                        if (i24 == 0) {
                                            i36 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i36 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                                        }
                                        if ((i4 & 100663296) == 0) {
                                            i36 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        i25 = i6 & 524288;
                                        if (i25 == 0) {
                                            i36 |= 805306368;
                                        } else if ((i4 & 805306368) == 0) {
                                            i36 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                                        }
                                        i26 = i6 & 1048576;
                                        if (i26 == 0) {
                                            i27 = i5 | 6;
                                        } else if ((i5 & 6) == 0) {
                                            i27 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                        } else {
                                            i27 = i5;
                                        }
                                        if ((i5 & 48) == 0) {
                                            i27 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                        }
                                        if ((i5 & 384) == 0) {
                                            if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                                i35 = 256;
                                                i27 |= i35;
                                            }
                                            i35 = 128;
                                            i27 |= i35;
                                        }
                                        int i37 = i27;
                                        if ((i7 & 306783379) == 306783378 || (306783379 & i36) != 306783378 || (i37 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                                                z5 = i9 == 0 ? true : z;
                                                boolean z13 = i10 == 0 ? false : z2;
                                                if ((i6 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    modifier2 = companion;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    textStyle2 = (TextStyle) consume;
                                                    i7 &= -458753;
                                                } else {
                                                    modifier2 = companion;
                                                    textStyle2 = textStyle;
                                                }
                                                function28 = i11 == 0 ? null : function2;
                                                function29 = i12 == 0 ? null : function22;
                                                Function2<? super Composer, ? super Integer, Unit> function224 = i13 == 0 ? null : function23;
                                                Function2<? super Composer, ? super Integer, Unit> function225 = i14 == 0 ? null : function24;
                                                Function2<? super Composer, ? super Integer, Unit> function226 = i15 == 0 ? null : function25;
                                                Function2<? super Composer, ? super Integer, Unit> function227 = i17 == 0 ? null : function26;
                                                Function2<? super Composer, ? super Integer, Unit> function228 = i18 == 0 ? null : function27;
                                                z6 = i19 == 0 ? false : z3;
                                                VisualTransformation none = i21 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i22 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                KeyboardActions keyboardActions4 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z14 = i24 == 0 ? false : z4;
                                                if ((i6 & 262144) == 0) {
                                                    i28 = z14 ? 1 : Integer.MAX_VALUE;
                                                    i36 &= -234881025;
                                                } else {
                                                    i28 = i;
                                                }
                                                int i38 = i25 == 0 ? 1 : i2;
                                                MutableInteractionSource mutableInteractionSource5 = i26 == 0 ? mutableInteractionSource : null;
                                                Function2<? super Composer, ? super Integer, Unit> function229 = function224;
                                                Function2<? super Composer, ? super Integer, Unit> function230 = function225;
                                                Shape shape4 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                                if ((i6 & 4194304) == 0) {
                                                    shape2 = shape4;
                                                    textFieldColors2 = TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                    i29 = i7;
                                                    mutableInteractionSource2 = mutableInteractionSource5;
                                                    z7 = z13;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z8 = z14;
                                                    i30 = i28;
                                                    i31 = i38;
                                                    modifier3 = modifier2;
                                                    function211 = function230;
                                                    function210 = function228;
                                                } else {
                                                    modifier3 = modifier2;
                                                    shape2 = shape4;
                                                    textFieldColors2 = textFieldColors;
                                                    i29 = i7;
                                                    function210 = function228;
                                                    mutableInteractionSource2 = mutableInteractionSource5;
                                                    z7 = z13;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z8 = z14;
                                                    i30 = i28;
                                                    i31 = i38;
                                                    function211 = function230;
                                                }
                                                i32 = i36;
                                                function212 = function227;
                                                function213 = function226;
                                                function214 = function229;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i6 & 32) != 0) {
                                                    i7 &= -458753;
                                                }
                                                if ((262144 & i6) != 0) {
                                                    i36 &= -234881025;
                                                }
                                                modifier3 = modifier;
                                                z5 = z;
                                                z7 = z2;
                                                textStyle2 = textStyle;
                                                function28 = function2;
                                                function29 = function22;
                                                function214 = function23;
                                                function213 = function25;
                                                function210 = function27;
                                                z6 = z3;
                                                visualTransformation2 = visualTransformation;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions2 = keyboardActions;
                                                z8 = z4;
                                                i30 = i;
                                                i31 = i2;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                shape2 = shape;
                                                textFieldColors2 = textFieldColors;
                                                i29 = i7;
                                                i32 = i36;
                                                function211 = function24;
                                                function212 = function26;
                                            }
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                function215 = function213;
                                                function216 = function212;
                                            } else {
                                                function216 = function212;
                                                function215 = function213;
                                                ComposerKt.traceEventStart(-1268528240, i29, i32, "androidx.compose.material3.TextField (TextField.kt:375)");
                                            }
                                            startRestartGroup.startReplaceGroup(-508241210);
                                            ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
                                            if (mutableInteractionSource2 != null) {
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -508240559, "CC(remember):TextField.kt#9igjgp");
                                                Object rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            startRestartGroup.startReplaceGroup(-508235100);
                                            ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
                                            m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                                            if (m5814getColor0d7_KjU == 16) {
                                                m5814getColor0d7_KjU = textFieldColors2.m2342textColorXeAY9LY$material3_release(z5, z6, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource3, startRestartGroup, 0).getValue().booleanValue());
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            final TextStyle merge = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final Modifier modifier5 = modifier3;
                                            final boolean z15 = z6;
                                            final TextFieldColors textFieldColors4 = textFieldColors2;
                                            final boolean z16 = z5;
                                            final boolean z17 = z7;
                                            final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                            final KeyboardActions keyboardActions5 = keyboardActions2;
                                            final boolean z18 = z8;
                                            final int i39 = i30;
                                            final int i40 = i31;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final Function2<? super Composer, ? super Integer, Unit> function231 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function232 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function233 = function214;
                                            final Function2<? super Composer, ? super Integer, Unit> function234 = function211;
                                            final Function2<? super Composer, ? super Integer, Unit> function235 = function215;
                                            final Function2<? super Composer, ? super Integer, Unit> function236 = function216;
                                            final Function2<? super Composer, ? super Integer, Unit> function237 = function210;
                                            final Shape shape5 = shape2;
                                            Modifier modifier6 = modifier3;
                                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

                                                public final void invoke(Composer composer2, int i41) {
                                                    ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                                                    if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                                                        }
                                                        Modifier modifier7 = Modifier.this;
                                                        boolean z19 = z15;
                                                        Strings.Companion companion2 = Strings.INSTANCE;
                                                        Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                                        SolidColor solidColor = new SolidColor(textFieldColors4.m2292cursorColorvNxB06k$material3_release(z15), null);
                                                        TextFieldValue textFieldValue2 = textFieldValue;
                                                        Function1<TextFieldValue, Unit> function12 = function1;
                                                        boolean z20 = z16;
                                                        boolean z21 = z17;
                                                        TextStyle textStyle4 = merge;
                                                        KeyboardOptions keyboardOptions6 = keyboardOptions5;
                                                        KeyboardActions keyboardActions6 = keyboardActions5;
                                                        boolean z22 = z18;
                                                        int i42 = i39;
                                                        int i43 = i40;
                                                        VisualTransformation visualTransformation5 = visualTransformation4;
                                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                                        SolidColor solidColor2 = solidColor;
                                                        final TextFieldValue textFieldValue3 = textFieldValue;
                                                        final boolean z23 = z16;
                                                        final boolean z24 = z18;
                                                        final VisualTransformation visualTransformation6 = visualTransformation4;
                                                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                                        final boolean z25 = z15;
                                                        final Function2<Composer, Integer, Unit> function238 = function231;
                                                        final Function2<Composer, Integer, Unit> function239 = function232;
                                                        final Function2<Composer, Integer, Unit> function240 = function233;
                                                        final Function2<Composer, Integer, Unit> function241 = function234;
                                                        final Function2<Composer, Integer, Unit> function242 = function235;
                                                        final Function2<Composer, Integer, Unit> function243 = function236;
                                                        final Function2<Composer, Integer, Unit> function244 = function237;
                                                        final Shape shape6 = shape5;
                                                        final TextFieldColors textFieldColors5 = textFieldColors4;
                                                        BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(3);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                                                int i45;
                                                                ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                                                if ((i44 & 6) == 0) {
                                                                    i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                                                } else {
                                                                    i45 = i44;
                                                                }
                                                                if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                                                    }
                                                                    TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer3.skipToGroupEnd();
                                                            }
                                                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            z9 = z7;
                                            textStyle3 = textStyle2;
                                            function217 = function29;
                                            textFieldColors3 = textFieldColors2;
                                            visualTransformation3 = visualTransformation2;
                                            function218 = function28;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions3 = keyboardActions2;
                                            z10 = z8;
                                            i33 = i30;
                                            i34 = i31;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape3 = shape2;
                                            function219 = function210;
                                            function220 = function216;
                                            function221 = function214;
                                            z11 = z6;
                                            modifier4 = modifier6;
                                            function222 = function211;
                                            z12 = z5;
                                            function223 = function215;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            z12 = z;
                                            z9 = z2;
                                            textStyle3 = textStyle;
                                            function218 = function2;
                                            function217 = function22;
                                            function221 = function23;
                                            function222 = function24;
                                            function223 = function25;
                                            function220 = function26;
                                            function219 = function27;
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions3 = keyboardActions;
                                            z10 = z4;
                                            i33 = i;
                                            i34 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors3 = textFieldColors;
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$4
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

                                                public final void invoke(Composer composer2, int i41) {
                                                    TextFieldKt.TextField(TextFieldValue.this, function1, modifier4, z12, z9, textStyle3, function218, function217, function221, function222, function223, function220, function219, z11, visualTransformation3, keyboardOptions3, keyboardActions3, z10, i33, i34, mutableInteractionSource4, shape3, textFieldColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i6 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                i25 = i6 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i6 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i5 & 48) == 0) {
                                }
                                if ((i5 & 384) == 0) {
                                }
                                int i372 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i6 & 32) == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 262144) == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function2292 = function224;
                                Function2<? super Composer, ? super Integer, Unit> function2302 = function225;
                                Shape shape42 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                if ((i6 & 4194304) == 0) {
                                }
                                i32 = i36;
                                function212 = function227;
                                function213 = function226;
                                function214 = function2292;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceGroup(-508241210);
                                ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
                                if (mutableInteractionSource2 != null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(-508235100);
                                ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
                                m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                                if (m5814getColor0d7_KjU == 16) {
                                }
                                startRestartGroup.endReplaceGroup();
                                final TextStyle merge2 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                final Modifier modifier52 = modifier3;
                                final boolean z152 = z6;
                                final TextFieldColors textFieldColors42 = textFieldColors2;
                                final boolean z162 = z5;
                                final boolean z172 = z7;
                                final KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                final KeyboardActions keyboardActions52 = keyboardActions2;
                                final boolean z182 = z8;
                                final int i392 = i30;
                                final int i402 = i31;
                                final VisualTransformation visualTransformation42 = visualTransformation2;
                                final Function2<? super Composer, ? super Integer, Unit> function2312 = function28;
                                final Function2<? super Composer, ? super Integer, Unit> function2322 = function29;
                                final Function2<? super Composer, ? super Integer, Unit> function2332 = function214;
                                final Function2<? super Composer, ? super Integer, Unit> function2342 = function211;
                                final Function2<? super Composer, ? super Integer, Unit> function2352 = function215;
                                final Function2<? super Composer, ? super Integer, Unit> function2362 = function216;
                                final Function2<? super Composer, ? super Integer, Unit> function2372 = function210;
                                final Shape shape52 = shape2;
                                Modifier modifier62 = modifier3;
                                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

                                    public final void invoke(Composer composer2, int i41) {
                                        ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                                        if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                                            }
                                            Modifier modifier7 = Modifier.this;
                                            boolean z19 = z152;
                                            Strings.Companion companion2 = Strings.INSTANCE;
                                            Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                            SolidColor solidColor = new SolidColor(textFieldColors42.m2292cursorColorvNxB06k$material3_release(z152), null);
                                            TextFieldValue textFieldValue2 = textFieldValue;
                                            Function1<TextFieldValue, Unit> function12 = function1;
                                            boolean z20 = z162;
                                            boolean z21 = z172;
                                            TextStyle textStyle4 = merge2;
                                            KeyboardOptions keyboardOptions6 = keyboardOptions52;
                                            KeyboardActions keyboardActions6 = keyboardActions52;
                                            boolean z22 = z182;
                                            int i42 = i392;
                                            int i43 = i402;
                                            VisualTransformation visualTransformation5 = visualTransformation42;
                                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                            SolidColor solidColor2 = solidColor;
                                            final TextFieldValue textFieldValue3 = textFieldValue;
                                            final boolean z23 = z162;
                                            final boolean z24 = z182;
                                            final VisualTransformation visualTransformation6 = visualTransformation42;
                                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                            final boolean z25 = z152;
                                            final Function2<? super Composer, ? super Integer, Unit> function238 = function2312;
                                            final Function2<? super Composer, ? super Integer, Unit> function239 = function2322;
                                            final Function2<? super Composer, ? super Integer, Unit> function240 = function2332;
                                            final Function2<? super Composer, ? super Integer, Unit> function241 = function2342;
                                            final Function2<? super Composer, ? super Integer, Unit> function242 = function2352;
                                            final Function2<? super Composer, ? super Integer, Unit> function243 = function2362;
                                            final Function2<? super Composer, ? super Integer, Unit> function244 = function2372;
                                            final Shape shape6 = shape52;
                                            final TextFieldColors textFieldColors5 = textFieldColors42;
                                            BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                                    int i45;
                                                    ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                                    if ((i44 & 6) == 0) {
                                                        i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                                    } else {
                                                        i45 = i44;
                                                    }
                                                    if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z9 = z7;
                                textStyle3 = textStyle2;
                                function217 = function29;
                                textFieldColors3 = textFieldColors2;
                                visualTransformation3 = visualTransformation2;
                                function218 = function28;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                z10 = z8;
                                i33 = i30;
                                i34 = i31;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape3 = shape2;
                                function219 = function210;
                                function220 = function216;
                                function221 = function214;
                                z11 = z6;
                                modifier4 = modifier62;
                                function222 = function211;
                                z12 = z5;
                                function223 = function215;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i6 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i25 = i6 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i6 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            int i3722 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i6 & 32) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 262144) == 0) {
                            }
                            if (i25 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function22922 = function224;
                            Function2<? super Composer, ? super Integer, Unit> function23022 = function225;
                            Shape shape422 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                            if ((i6 & 4194304) == 0) {
                            }
                            i32 = i36;
                            function212 = function227;
                            function213 = function226;
                            function214 = function22922;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(-508241210);
                            ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
                            if (mutableInteractionSource2 != null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-508235100);
                            ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
                            m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                            if (m5814getColor0d7_KjU == 16) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final TextStyle merge22 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            final Modifier modifier522 = modifier3;
                            final boolean z1522 = z6;
                            final TextFieldColors textFieldColors422 = textFieldColors2;
                            final boolean z1622 = z5;
                            final boolean z1722 = z7;
                            final KeyboardOptions keyboardOptions522 = keyboardOptions2;
                            final KeyboardActions keyboardActions522 = keyboardActions2;
                            final boolean z1822 = z8;
                            final int i3922 = i30;
                            final int i4022 = i31;
                            final VisualTransformation visualTransformation422 = visualTransformation2;
                            final Function2<? super Composer, ? super Integer, Unit> function23122 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function23222 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function23322 = function214;
                            final Function2<? super Composer, ? super Integer, Unit> function23422 = function211;
                            final Function2<? super Composer, ? super Integer, Unit> function23522 = function215;
                            final Function2<? super Composer, ? super Integer, Unit> function23622 = function216;
                            final Function2<? super Composer, ? super Integer, Unit> function23722 = function210;
                            final Shape shape522 = shape2;
                            Modifier modifier622 = modifier3;
                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

                                public final void invoke(Composer composer2, int i41) {
                                    ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                                    if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                                        }
                                        Modifier modifier7 = Modifier.this;
                                        boolean z19 = z1522;
                                        Strings.Companion companion2 = Strings.INSTANCE;
                                        Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                        SolidColor solidColor = new SolidColor(textFieldColors422.m2292cursorColorvNxB06k$material3_release(z1522), null);
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        Function1<TextFieldValue, Unit> function12 = function1;
                                        boolean z20 = z1622;
                                        boolean z21 = z1722;
                                        TextStyle textStyle4 = merge22;
                                        KeyboardOptions keyboardOptions6 = keyboardOptions522;
                                        KeyboardActions keyboardActions6 = keyboardActions522;
                                        boolean z22 = z1822;
                                        int i42 = i3922;
                                        int i43 = i4022;
                                        VisualTransformation visualTransformation5 = visualTransformation422;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final TextFieldValue textFieldValue3 = textFieldValue;
                                        final boolean z23 = z1622;
                                        final boolean z24 = z1822;
                                        final VisualTransformation visualTransformation6 = visualTransformation422;
                                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                        final boolean z25 = z1522;
                                        final Function2<? super Composer, ? super Integer, Unit> function238 = function23122;
                                        final Function2<? super Composer, ? super Integer, Unit> function239 = function23222;
                                        final Function2<? super Composer, ? super Integer, Unit> function240 = function23322;
                                        final Function2<? super Composer, ? super Integer, Unit> function241 = function23422;
                                        final Function2<? super Composer, ? super Integer, Unit> function242 = function23522;
                                        final Function2<? super Composer, ? super Integer, Unit> function243 = function23622;
                                        final Function2<? super Composer, ? super Integer, Unit> function244 = function23722;
                                        final Shape shape6 = shape522;
                                        final TextFieldColors textFieldColors5 = textFieldColors422;
                                        BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                                int i45;
                                                ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                                if ((i44 & 6) == 0) {
                                                    i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                                } else {
                                                    i45 = i44;
                                                }
                                                if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z9 = z7;
                            textStyle3 = textStyle2;
                            function217 = function29;
                            textFieldColors3 = textFieldColors2;
                            visualTransformation3 = visualTransformation2;
                            function218 = function28;
                            keyboardOptions3 = keyboardOptions2;
                            keyboardActions3 = keyboardActions2;
                            z10 = z8;
                            i33 = i30;
                            i34 = i31;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape3 = shape2;
                            function219 = function210;
                            function220 = function216;
                            function221 = function214;
                            z11 = z6;
                            modifier4 = modifier622;
                            function222 = function211;
                            z12 = z5;
                            function223 = function215;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i25 = i6 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        int i37222 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 262144) == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function229222 = function224;
                        Function2<? super Composer, ? super Integer, Unit> function230222 = function225;
                        Shape shape4222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                        if ((i6 & 4194304) == 0) {
                        }
                        i32 = i36;
                        function212 = function227;
                        function213 = function226;
                        function214 = function229222;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(-508241210);
                        ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
                        if (mutableInteractionSource2 != null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-508235100);
                        ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
                        m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                        if (m5814getColor0d7_KjU == 16) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final TextStyle merge222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        final Modifier modifier5222 = modifier3;
                        final boolean z15222 = z6;
                        final TextFieldColors textFieldColors4222 = textFieldColors2;
                        final boolean z16222 = z5;
                        final boolean z17222 = z7;
                        final KeyboardOptions keyboardOptions5222 = keyboardOptions2;
                        final KeyboardActions keyboardActions5222 = keyboardActions2;
                        final boolean z18222 = z8;
                        final int i39222 = i30;
                        final int i40222 = i31;
                        final VisualTransformation visualTransformation4222 = visualTransformation2;
                        final Function2<? super Composer, ? super Integer, Unit> function231222 = function28;
                        final Function2<? super Composer, ? super Integer, Unit> function232222 = function29;
                        final Function2<? super Composer, ? super Integer, Unit> function233222 = function214;
                        final Function2<? super Composer, ? super Integer, Unit> function234222 = function211;
                        final Function2<? super Composer, ? super Integer, Unit> function235222 = function215;
                        final Function2<? super Composer, ? super Integer, Unit> function236222 = function216;
                        final Function2<? super Composer, ? super Integer, Unit> function237222 = function210;
                        final Shape shape5222 = shape2;
                        Modifier modifier6222 = modifier3;
                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

                            public final void invoke(Composer composer2, int i41) {
                                ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                                if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                                    }
                                    Modifier modifier7 = Modifier.this;
                                    boolean z19 = z15222;
                                    Strings.Companion companion2 = Strings.INSTANCE;
                                    Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                    SolidColor solidColor = new SolidColor(textFieldColors4222.m2292cursorColorvNxB06k$material3_release(z15222), null);
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    Function1<TextFieldValue, Unit> function12 = function1;
                                    boolean z20 = z16222;
                                    boolean z21 = z17222;
                                    TextStyle textStyle4 = merge222;
                                    KeyboardOptions keyboardOptions6 = keyboardOptions5222;
                                    KeyboardActions keyboardActions6 = keyboardActions5222;
                                    boolean z22 = z18222;
                                    int i42 = i39222;
                                    int i43 = i40222;
                                    VisualTransformation visualTransformation5 = visualTransformation4222;
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                    SolidColor solidColor2 = solidColor;
                                    final TextFieldValue textFieldValue3 = textFieldValue;
                                    final boolean z23 = z16222;
                                    final boolean z24 = z18222;
                                    final VisualTransformation visualTransformation6 = visualTransformation4222;
                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                    final boolean z25 = z15222;
                                    final Function2<? super Composer, ? super Integer, Unit> function238 = function231222;
                                    final Function2<? super Composer, ? super Integer, Unit> function239 = function232222;
                                    final Function2<? super Composer, ? super Integer, Unit> function240 = function233222;
                                    final Function2<? super Composer, ? super Integer, Unit> function241 = function234222;
                                    final Function2<? super Composer, ? super Integer, Unit> function242 = function235222;
                                    final Function2<? super Composer, ? super Integer, Unit> function243 = function236222;
                                    final Function2<? super Composer, ? super Integer, Unit> function244 = function237222;
                                    final Shape shape6 = shape5222;
                                    final TextFieldColors textFieldColors5 = textFieldColors4222;
                                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                            int i45;
                                            ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                            if ((i44 & 6) == 0) {
                                                i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                            } else {
                                                i45 = i44;
                                            }
                                            if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                                }
                                                TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z9 = z7;
                        textStyle3 = textStyle2;
                        function217 = function29;
                        textFieldColors3 = textFieldColors2;
                        visualTransformation3 = visualTransformation2;
                        function218 = function28;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        z10 = z8;
                        i33 = i30;
                        i34 = i31;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        shape3 = shape2;
                        function219 = function210;
                        function220 = function216;
                        function221 = function214;
                        z11 = z6;
                        modifier4 = modifier6222;
                        function222 = function211;
                        z12 = z5;
                        function223 = function215;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i362 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i25 = i6 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    int i372222 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 262144) == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function2292222 = function224;
                    Function2<? super Composer, ? super Integer, Unit> function2302222 = function225;
                    Shape shape42222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                    if ((i6 & 4194304) == 0) {
                    }
                    i32 = i362;
                    function212 = function227;
                    function213 = function226;
                    function214 = function2292222;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(-508241210);
                    ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
                    if (mutableInteractionSource2 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-508235100);
                    ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
                    m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                    if (m5814getColor0d7_KjU == 16) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final TextStyle merge2222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    final Modifier modifier52222 = modifier3;
                    final boolean z152222 = z6;
                    final TextFieldColors textFieldColors42222 = textFieldColors2;
                    final boolean z162222 = z5;
                    final boolean z172222 = z7;
                    final KeyboardOptions keyboardOptions52222 = keyboardOptions2;
                    final KeyboardActions keyboardActions52222 = keyboardActions2;
                    final boolean z182222 = z8;
                    final int i392222 = i30;
                    final int i402222 = i31;
                    final VisualTransformation visualTransformation42222 = visualTransformation2;
                    final Function2<? super Composer, ? super Integer, Unit> function2312222 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function2322222 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function2332222 = function214;
                    final Function2<? super Composer, ? super Integer, Unit> function2342222 = function211;
                    final Function2<? super Composer, ? super Integer, Unit> function2352222 = function215;
                    final Function2<? super Composer, ? super Integer, Unit> function2362222 = function216;
                    final Function2<? super Composer, ? super Integer, Unit> function2372222 = function210;
                    final Shape shape52222 = shape2;
                    Modifier modifier62222 = modifier3;
                    CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

                        public final void invoke(Composer composer2, int i41) {
                            ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                            if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                                }
                                Modifier modifier7 = Modifier.this;
                                boolean z19 = z152222;
                                Strings.Companion companion2 = Strings.INSTANCE;
                                Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                                SolidColor solidColor = new SolidColor(textFieldColors42222.m2292cursorColorvNxB06k$material3_release(z152222), null);
                                TextFieldValue textFieldValue2 = textFieldValue;
                                Function1<TextFieldValue, Unit> function12 = function1;
                                boolean z20 = z162222;
                                boolean z21 = z172222;
                                TextStyle textStyle4 = merge2222;
                                KeyboardOptions keyboardOptions6 = keyboardOptions52222;
                                KeyboardActions keyboardActions6 = keyboardActions52222;
                                boolean z22 = z182222;
                                int i42 = i392222;
                                int i43 = i402222;
                                VisualTransformation visualTransformation5 = visualTransformation42222;
                                MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                SolidColor solidColor2 = solidColor;
                                final TextFieldValue textFieldValue3 = textFieldValue;
                                final boolean z23 = z162222;
                                final boolean z24 = z182222;
                                final VisualTransformation visualTransformation6 = visualTransformation42222;
                                final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                final boolean z25 = z152222;
                                final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222;
                                final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222;
                                final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222;
                                final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222;
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222;
                                final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222;
                                final Function2<? super Composer, ? super Integer, Unit> function244 = function2372222;
                                final Shape shape6 = shape52222;
                                final TextFieldColors textFieldColors5 = textFieldColors42222;
                                BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                        int i45;
                                        ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                        if ((i44 & 6) == 0) {
                                            i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                        } else {
                                            i45 = i44;
                                        }
                                        if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                            }
                                            TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z9 = z7;
                    textStyle3 = textStyle2;
                    function217 = function29;
                    textFieldColors3 = textFieldColors2;
                    visualTransformation3 = visualTransformation2;
                    function218 = function28;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    z10 = z8;
                    i33 = i30;
                    i34 = i31;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    shape3 = shape2;
                    function219 = function210;
                    function220 = function216;
                    function221 = function214;
                    z11 = z6;
                    modifier4 = modifier62222;
                    function222 = function211;
                    z12 = z5;
                    function223 = function215;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3622 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 != 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                i23 = i6 & 65536;
                if (i23 == 0) {
                }
                i24 = i6 & 131072;
                if (i24 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i25 = i6 & 524288;
                if (i25 == 0) {
                }
                i26 = i6 & 1048576;
                if (i26 == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                int i3722222 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i6 & 262144) == 0) {
                }
                if (i25 == 0) {
                }
                if (i26 == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function22922222 = function224;
                Function2<? super Composer, ? super Integer, Unit> function23022222 = function225;
                Shape shape422222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                if ((i6 & 4194304) == 0) {
                }
                i32 = i3622;
                function212 = function227;
                function213 = function226;
                function214 = function22922222;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(-508241210);
                ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
                if (mutableInteractionSource2 != null) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-508235100);
                ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
                m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
                if (m5814getColor0d7_KjU == 16) {
                }
                startRestartGroup.endReplaceGroup();
                final TextStyle merge22222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                final Modifier modifier522222 = modifier3;
                final boolean z1522222 = z6;
                final TextFieldColors textFieldColors422222 = textFieldColors2;
                final boolean z1622222 = z5;
                final boolean z1722222 = z7;
                final KeyboardOptions keyboardOptions522222 = keyboardOptions2;
                final KeyboardActions keyboardActions522222 = keyboardActions2;
                final boolean z1822222 = z8;
                final int i3922222 = i30;
                final int i4022222 = i31;
                final VisualTransformation visualTransformation422222 = visualTransformation2;
                final Function2<? super Composer, ? super Integer, Unit> function23122222 = function28;
                final Function2<? super Composer, ? super Integer, Unit> function23222222 = function29;
                final Function2<? super Composer, ? super Integer, Unit> function23322222 = function214;
                final Function2<? super Composer, ? super Integer, Unit> function23422222 = function211;
                final Function2<? super Composer, ? super Integer, Unit> function23522222 = function215;
                final Function2<? super Composer, ? super Integer, Unit> function23622222 = function216;
                final Function2<? super Composer, ? super Integer, Unit> function23722222 = function210;
                final Shape shape522222 = shape2;
                Modifier modifier622222 = modifier3;
                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

                    public final void invoke(Composer composer2, int i41) {
                        ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                        if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                            }
                            Modifier modifier7 = Modifier.this;
                            boolean z19 = z1522222;
                            Strings.Companion companion2 = Strings.INSTANCE;
                            Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                            SolidColor solidColor = new SolidColor(textFieldColors422222.m2292cursorColorvNxB06k$material3_release(z1522222), null);
                            TextFieldValue textFieldValue2 = textFieldValue;
                            Function1<TextFieldValue, Unit> function12 = function1;
                            boolean z20 = z1622222;
                            boolean z21 = z1722222;
                            TextStyle textStyle4 = merge22222;
                            KeyboardOptions keyboardOptions6 = keyboardOptions522222;
                            KeyboardActions keyboardActions6 = keyboardActions522222;
                            boolean z22 = z1822222;
                            int i42 = i3922222;
                            int i43 = i4022222;
                            VisualTransformation visualTransformation5 = visualTransformation422222;
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                            SolidColor solidColor2 = solidColor;
                            final TextFieldValue textFieldValue3 = textFieldValue;
                            final boolean z23 = z1622222;
                            final boolean z24 = z1822222;
                            final VisualTransformation visualTransformation6 = visualTransformation422222;
                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                            final boolean z25 = z1522222;
                            final Function2<? super Composer, ? super Integer, Unit> function238 = function23122222;
                            final Function2<? super Composer, ? super Integer, Unit> function239 = function23222222;
                            final Function2<? super Composer, ? super Integer, Unit> function240 = function23322222;
                            final Function2<? super Composer, ? super Integer, Unit> function241 = function23422222;
                            final Function2<? super Composer, ? super Integer, Unit> function242 = function23522222;
                            final Function2<? super Composer, ? super Integer, Unit> function243 = function23622222;
                            final Function2<? super Composer, ? super Integer, Unit> function244 = function23722222;
                            final Shape shape6 = shape522222;
                            final TextFieldColors textFieldColors5 = textFieldColors422222;
                            BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                    int i45;
                                    ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                    if ((i44 & 6) == 0) {
                                        i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                    } else {
                                        i45 = i44;
                                    }
                                    if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                        }
                                        TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                z9 = z7;
                textStyle3 = textStyle2;
                function217 = function29;
                textFieldColors3 = textFieldColors2;
                visualTransformation3 = visualTransformation2;
                function218 = function28;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                z10 = z8;
                i33 = i30;
                i34 = i31;
                mutableInteractionSource4 = mutableInteractionSource2;
                shape3 = shape2;
                function219 = function210;
                function220 = function216;
                function221 = function214;
                z11 = z6;
                modifier4 = modifier622222;
                function222 = function211;
                z12 = z5;
                function223 = function215;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i36222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 != 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            i23 = i6 & 65536;
            if (i23 == 0) {
            }
            i24 = i6 & 131072;
            if (i24 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i25 = i6 & 524288;
            if (i25 == 0) {
            }
            i26 = i6 & 1048576;
            if (i26 == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            int i37222222 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i6 & 262144) == 0) {
            }
            if (i25 == 0) {
            }
            if (i26 == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function229222222 = function224;
            Function2<? super Composer, ? super Integer, Unit> function230222222 = function225;
            Shape shape4222222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
            if ((i6 & 4194304) == 0) {
            }
            i32 = i36222;
            function212 = function227;
            function213 = function226;
            function214 = function229222222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(-508241210);
            ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
            if (mutableInteractionSource2 != null) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-508235100);
            ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
            m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
            if (m5814getColor0d7_KjU == 16) {
            }
            startRestartGroup.endReplaceGroup();
            final TextStyle merge222222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final Modifier modifier5222222 = modifier3;
            final boolean z15222222 = z6;
            final TextFieldColors textFieldColors4222222 = textFieldColors2;
            final boolean z16222222 = z5;
            final boolean z17222222 = z7;
            final KeyboardOptions keyboardOptions5222222 = keyboardOptions2;
            final KeyboardActions keyboardActions5222222 = keyboardActions2;
            final boolean z18222222 = z8;
            final int i39222222 = i30;
            final int i40222222 = i31;
            final VisualTransformation visualTransformation4222222 = visualTransformation2;
            final Function2<? super Composer, ? super Integer, Unit> function231222222 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function232222222 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function233222222 = function214;
            final Function2<? super Composer, ? super Integer, Unit> function234222222 = function211;
            final Function2<? super Composer, ? super Integer, Unit> function235222222 = function215;
            final Function2<? super Composer, ? super Integer, Unit> function236222222 = function216;
            final Function2<? super Composer, ? super Integer, Unit> function237222222 = function210;
            final Shape shape5222222 = shape2;
            Modifier modifier6222222 = modifier3;
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

                public final void invoke(Composer composer2, int i41) {
                    ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                    if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                        }
                        Modifier modifier7 = Modifier.this;
                        boolean z19 = z15222222;
                        Strings.Companion companion2 = Strings.INSTANCE;
                        Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                        SolidColor solidColor = new SolidColor(textFieldColors4222222.m2292cursorColorvNxB06k$material3_release(z15222222), null);
                        TextFieldValue textFieldValue2 = textFieldValue;
                        Function1<TextFieldValue, Unit> function12 = function1;
                        boolean z20 = z16222222;
                        boolean z21 = z17222222;
                        TextStyle textStyle4 = merge222222;
                        KeyboardOptions keyboardOptions6 = keyboardOptions5222222;
                        KeyboardActions keyboardActions6 = keyboardActions5222222;
                        boolean z22 = z18222222;
                        int i42 = i39222222;
                        int i43 = i40222222;
                        VisualTransformation visualTransformation5 = visualTransformation4222222;
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                        SolidColor solidColor2 = solidColor;
                        final TextFieldValue textFieldValue3 = textFieldValue;
                        final boolean z23 = z16222222;
                        final boolean z24 = z18222222;
                        final VisualTransformation visualTransformation6 = visualTransformation4222222;
                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                        final boolean z25 = z15222222;
                        final Function2<? super Composer, ? super Integer, Unit> function238 = function231222222;
                        final Function2<? super Composer, ? super Integer, Unit> function239 = function232222222;
                        final Function2<? super Composer, ? super Integer, Unit> function240 = function233222222;
                        final Function2<? super Composer, ? super Integer, Unit> function241 = function234222222;
                        final Function2<? super Composer, ? super Integer, Unit> function242 = function235222222;
                        final Function2<? super Composer, ? super Integer, Unit> function243 = function236222222;
                        final Function2<? super Composer, ? super Integer, Unit> function244 = function237222222;
                        final Shape shape6 = shape5222222;
                        final TextFieldColors textFieldColors5 = textFieldColors4222222;
                        BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                                int i45;
                                ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                if ((i44 & 6) == 0) {
                                    i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                                } else {
                                    i45 = i44;
                                }
                                if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                    }
                                    TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            z9 = z7;
            textStyle3 = textStyle2;
            function217 = function29;
            textFieldColors3 = textFieldColors2;
            visualTransformation3 = visualTransformation2;
            function218 = function28;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            z10 = z8;
            i33 = i30;
            i34 = i31;
            mutableInteractionSource4 = mutableInteractionSource2;
            shape3 = shape2;
            function219 = function210;
            function220 = function216;
            function221 = function214;
            z11 = z6;
            modifier4 = modifier6222222;
            function222 = function211;
            z12 = z5;
            function223 = function215;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i362222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 != 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        i23 = i6 & 65536;
        if (i23 == 0) {
        }
        i24 = i6 & 131072;
        if (i24 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i25 = i6 & 524288;
        if (i25 == 0) {
        }
        i26 = i6 & 1048576;
        if (i26 == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        int i372222222 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i6 & 262144) == 0) {
        }
        if (i25 == 0) {
        }
        if (i26 == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function2292222222 = function224;
        Function2<? super Composer, ? super Integer, Unit> function2302222222 = function225;
        Shape shape42222222 = (i6 & 2097152) == 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
        if ((i6 & 4194304) == 0) {
        }
        i32 = i362222;
        function212 = function227;
        function213 = function226;
        function214 = function2292222222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-508241210);
        ComposerKt.sourceInformation(startRestartGroup, "377@20083L39");
        if (mutableInteractionSource2 != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-508235100);
        ComposerKt.sourceInformation(startRestartGroup, "*381@20307L25");
        m5814getColor0d7_KjU = textStyle2.m5814getColor0d7_KjU();
        if (m5814getColor0d7_KjU == 16) {
        }
        startRestartGroup.endReplaceGroup();
        final TextStyle merge2222222 = textStyle2.merge(new TextStyle(m5814getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        final Modifier modifier52222222 = modifier3;
        final boolean z152222222 = z6;
        final TextFieldColors textFieldColors42222222 = textFieldColors2;
        final boolean z162222222 = z5;
        final boolean z172222222 = z7;
        final KeyboardOptions keyboardOptions52222222 = keyboardOptions2;
        final KeyboardActions keyboardActions52222222 = keyboardActions2;
        final boolean z182222222 = z8;
        final int i392222222 = i30;
        final int i402222222 = i31;
        final VisualTransformation visualTransformation42222222 = visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function2312222222 = function28;
        final Function2<? super Composer, ? super Integer, Unit> function2322222222 = function29;
        final Function2<? super Composer, ? super Integer, Unit> function2332222222 = function214;
        final Function2<? super Composer, ? super Integer, Unit> function2342222222 = function211;
        final Function2<? super Composer, ? super Integer, Unit> function2352222222 = function215;
        final Function2<? super Composer, ? super Integer, Unit> function2362222222 = function216;
        final Function2<? super Composer, ? super Integer, Unit> function2372222222 = function210;
        final Shape shape52222222 = shape2;
        Modifier modifier62222222 = modifier3;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
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

            public final void invoke(Composer composer2, int i41) {
                ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                if ((i41 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                    }
                    Modifier modifier7 = Modifier.this;
                    boolean z19 = z152222222;
                    Strings.Companion companion2 = Strings.INSTANCE;
                    Modifier m710defaultMinSizeVpY3zN4 = SizeKt.m710defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z19, Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2360getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2359getMinHeightD9Ej5fM());
                    SolidColor solidColor = new SolidColor(textFieldColors42222222.m2292cursorColorvNxB06k$material3_release(z152222222), null);
                    TextFieldValue textFieldValue2 = textFieldValue;
                    Function1<TextFieldValue, Unit> function12 = function1;
                    boolean z20 = z162222222;
                    boolean z21 = z172222222;
                    TextStyle textStyle4 = merge2222222;
                    KeyboardOptions keyboardOptions6 = keyboardOptions52222222;
                    KeyboardActions keyboardActions6 = keyboardActions52222222;
                    boolean z22 = z182222222;
                    int i42 = i392222222;
                    int i43 = i402222222;
                    VisualTransformation visualTransformation5 = visualTransformation42222222;
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                    SolidColor solidColor2 = solidColor;
                    final TextFieldValue textFieldValue3 = textFieldValue;
                    final boolean z23 = z162222222;
                    final boolean z24 = z182222222;
                    final VisualTransformation visualTransformation6 = visualTransformation42222222;
                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                    final boolean z25 = z152222222;
                    final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222222;
                    final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222222;
                    final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222222;
                    final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222222;
                    final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222222;
                    final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222222;
                    final Function2<? super Composer, ? super Integer, Unit> function244 = function2372222222;
                    final Shape shape6 = shape52222222;
                    final TextFieldColors textFieldColors5 = textFieldColors42222222;
                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m710defaultMinSizeVpY3zN4, z20, z21, textStyle4, keyboardOptions6, keyboardActions6, z22, i42, i43, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor2, ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function245, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function245, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function245, Composer composer3, int i44) {
                            int i45;
                            ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                            if ((i44 & 6) == 0) {
                                i45 = i44 | (composer3.changedInstance(function245) ? 4 : 2);
                            } else {
                                i45 = i44;
                            }
                            if ((i45 & 19) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1751957978, i45, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                }
                                TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function245, z23, z24, visualTransformation6, mutableInteractionSource7, z25, function238, function239, function240, function241, function242, function243, function244, shape6, textFieldColors5, null, null, composer3, (i45 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
        }
        z9 = z7;
        textStyle3 = textStyle2;
        function217 = function29;
        textFieldColors3 = textFieldColors2;
        visualTransformation3 = visualTransformation2;
        function218 = function28;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        z10 = z8;
        i33 = i30;
        i34 = i31;
        mutableInteractionSource4 = mutableInteractionSource2;
        shape3 = shape2;
        function219 = function210;
        function220 = function216;
        function221 = function214;
        z11 = z6;
        modifier4 = modifier62222222;
        function222 = function211;
        z12 = z5;
        function223 = function215;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, final float f, final Function2<? super Composer, ? super Integer, Unit> function27, final Function2<? super Composer, ? super Integer, Unit> function28, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        float f2;
        Composer startRestartGroup = composer.startRestartGroup(-1830307184);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(4,11,2,6,3,12,7,9,8!2,10)455@23228L147,458@23423L7,459@23435L4118:TextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function28) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i3, i4, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1052646361, "CC(remember):TextField.kt#9igjgp");
            boolean z2 = ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((i4 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, textFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1362557328, "C465@23754L11,550@26868L187:TextField.kt#uh7d8r");
            function27.invoke(startRestartGroup, Integer.valueOf(i4 & 14));
            startRestartGroup.startReplaceGroup(1341517187);
            ComposerKt.sourceInformation(startRestartGroup, "468@23818L219");
            if (function23 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                i5 = i4;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -948431736, "C472@24010L9:TextField.kt#uh7d8r");
                function23.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            } else {
                i5 = i4;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1341526310);
            ComposerKt.sourceInformation(startRestartGroup, "476@24104L221");
            if (function24 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -948147001, "C480@24297L10:TextField.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (function23 != null) {
                i6 = 0;
                calculateStartPadding = Dp.m6299constructorimpl(RangesKt.coerceAtLeast(Dp.m6299constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6299constructorimpl(0)));
            } else {
                i6 = 0;
            }
            if (function24 != null) {
                calculateEndPadding = Dp.m6299constructorimpl(RangesKt.coerceAtLeast(Dp.m6299constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6299constructorimpl(i6)));
            }
            startRestartGroup.startReplaceGroup(1341556924);
            ComposerKt.sourceInformation(startRestartGroup, "501@25056L309");
            if (function25 != null) {
                Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m714heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m685paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl4 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -947113399, "C507@25339L8:TextField.kt#uh7d8r");
                function25.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1341568890);
            ComposerKt.sourceInformation(startRestartGroup, "511@25430L307");
            if (function26 != null) {
                Modifier m685paddingqDBjuR0$default2 = PaddingKt.m685paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m714heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, calculateEndPadding, 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m685paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl5 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl5.getInserting() || !Intrinsics.areEqual(m3333constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m3333constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m3333constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m3340setimpl(m3333constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -946744375, "C517@25711L8:TextField.kt#uh7d8r");
                function26.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1341581092);
            ComposerKt.sourceInformation(startRestartGroup, "522@25802L574");
            if (function22 != null) {
                Modifier m685paddingqDBjuR0$default3 = PaddingKt.m685paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m714heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId), DpKt.m6342lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, calculateEndPadding, 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m685paddingqDBjuR0$default3);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                f2 = calculateEndPadding;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor6);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl6 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl6, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl6.getInserting() || !Intrinsics.areEqual(m3333constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    m3333constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m3333constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m3340setimpl(m3333constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -946109526, "C535@26351L7:TextField.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            } else {
                f2 = calculateEndPadding;
            }
            startRestartGroup.endReplaceGroup();
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                calculateStartPadding = Dp.m6299constructorimpl(0);
            }
            Modifier m685paddingqDBjuR0$default4 = PaddingKt.m685paddingqDBjuR0$default(wrapContentHeight$default, calculateStartPadding, 0.0f, function26 == null ? f2 : Dp.m6299constructorimpl(0), 0.0f, 10, null);
            startRestartGroup.startReplaceGroup(1341611627);
            ComposerKt.sourceInformation(startRestartGroup, "548@26778L63");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PlaceholderId).then(m685paddingqDBjuR0$default4), startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
            }
            startRestartGroup.endReplaceGroup();
            Modifier then3 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TextFieldId).then(m685paddingqDBjuR0$default4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, then3);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor7);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl7 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl7, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl7.getInserting() || !Intrinsics.areEqual(m3333constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                m3333constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                m3333constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.m3340setimpl(m3333constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -945435834, "C554@27030L11:TextField.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1341622624);
            ComposerKt.sourceInformation(startRestartGroup, "559@27167L317");
            if (function28 != null) {
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m714heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2350supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3333constructorimpl8 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl8, maybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl8.getInserting() || !Intrinsics.areEqual(m3333constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m3333constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m3333constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m3340setimpl(m3333constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -945015195, "C565@27454L12:TextField.kt#uh7d8r");
                function28.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextFieldLayout$2
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

                public final void invoke(Composer composer2, int i7) {
                    TextFieldKt.TextFieldLayout(Modifier.this, function2, function22, function3, function23, function24, function25, function26, z, f, function27, function28, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m2371calculateWidthyeHjK3Y(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, Constraints.m6254getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m2370calculateHeightmKXJcVc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        boolean z = i2 > 0;
        float m6299constructorimpl = Dp.m6299constructorimpl(paddingValues.getTop() + paddingValues.getBottom()) * f2;
        if (z) {
            m6299constructorimpl = MathHelpersKt.lerp(Dp.m6299constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2) * f2, m6299constructorimpl, f);
        }
        return Math.max(Constraints.m6253getMinHeightimpl(j), Math.max(i3, Math.max(i4, MathKt.roundToInt(m6299constructorimpl + MathHelpersKt.lerp(0, i2, f) + ComparisonsKt.maxOf(i, i7, i5, i6, MathHelpersKt.lerp(i2, 0, f))))) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        Placeable.PlacementScope.m5239place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m6437getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), heightOrZero);
            } else {
                roundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt - MathKt.roundToInt((roundToInt - i3) * f), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, i4, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i4, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5239place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m6437getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable8);
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable5), 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable6), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final State<BorderStroke> state) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                float f = contentDrawScope.mo373toPx0680j_4(state.getValue().getWidth());
                float m3665getHeightimpl = Size.m3665getHeightimpl(contentDrawScope.mo4396getSizeNHjbRc()) - (f / 2);
                DrawScope.m4381drawLine1RTmtNc$default(contentDrawScope, state.getValue().getBrush(), OffsetKt.Offset(0.0f, m3665getHeightimpl), OffsetKt.Offset(Size.m3668getWidthimpl(contentDrawScope.mo4396getSizeNHjbRc()), m3665getHeightimpl), f, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }
}
