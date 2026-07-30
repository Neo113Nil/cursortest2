package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicTextField.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÛ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*\u001añ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020\fH\u0001¢\u0006\u0002\u0010.\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010=\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010?\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010A\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010B\u001a\u0015\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010M\u001a\u000200X\u008a\u008e\u0002²\u0006\n\u0010N\u001a\u00020@X\u008a\u008e\u0002"}, d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "MinTouchTargetSizeForHandles", "Landroidx/compose/ui/unit/DpSize;", "J", "BasicTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "isPassword", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "decorationBox", "Landroidx/compose/runtime/Composable;", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "cursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
    private static final long MinTouchTargetSizeForHandles;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
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
        int i18;
        boolean z3;
        Modifier modifier2;
        ScrollState scrollState2;
        KeyboardActionHandler keyboardActionHandler2;
        Brush brush2;
        int i19;
        OutputTransformation outputTransformation2;
        boolean z4;
        TextFieldDecorator textFieldDecorator2;
        TextFieldLineLimits textFieldLineLimits2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        MutableInteractionSource mutableInteractionSource2;
        InputTransformation inputTransformation2;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        final TextStyle textStyle3;
        Brush brush3;
        final TextFieldDecorator textFieldDecorator3;
        final ScrollState scrollState3;
        final boolean z5;
        MutableInteractionSource mutableInteractionSource3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        final TextFieldLineLimits textFieldLineLimits3;
        final KeyboardActionHandler keyboardActionHandler3;
        final KeyboardOptions keyboardOptions3;
        final InputTransformation inputTransformation3;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(469439921);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,7,2,11,3,14,5,8,6,9,4!1,10)184@10988L21,188@11134L610:BasicTextField.kt#423gt5");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    int i21 = 8192;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(inputTransformation) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(textFieldLineLimits) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i14 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i14 |= startRestartGroup.changed(brush) ? 32 : 16;
                        }
                        int i22 = i14;
                        i16 = i3 & 4096;
                        if (i16 != 0) {
                            i22 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i22 |= startRestartGroup.changed(outputTransformation) ? 256 : 128;
                            i17 = i3 & 8192;
                            if (i17 == 0) {
                                i22 |= 3072;
                                i18 = i17;
                            } else {
                                i18 = i17;
                                if ((i2 & 3072) == 0) {
                                    i22 |= (i2 & 4096) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 2048 : 1024;
                                }
                            }
                            if ((i2 & 24576) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(scrollState)) {
                                    i21 = 16384;
                                }
                                i22 |= i21;
                            }
                            if ((i4 & 306783379) == 306783378 || (i22 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i20 == 0 ? Modifier.INSTANCE : modifier;
                                    z3 = i5 == 0 ? true : z;
                                    boolean z6 = i6 == 0 ? false : z2;
                                    InputTransformation inputTransformation4 = i7 == 0 ? null : inputTransformation;
                                    TextStyle textStyle4 = i8 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                    KeyboardOptions keyboardOptions4 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                    KeyboardActionHandler keyboardActionHandler4 = i10 == 0 ? null : keyboardActionHandler;
                                    TextFieldLineLimits textFieldLineLimits4 = i11 == 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                    Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = i12 == 0 ? null : function2;
                                    MutableInteractionSource mutableInteractionSource4 = i13 == 0 ? null : mutableInteractionSource;
                                    SolidColor cursorBrush = i15 == 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                    OutputTransformation outputTransformation3 = i16 == 0 ? null : outputTransformation;
                                    TextFieldDecorator textFieldDecorator4 = i18 == 0 ? textFieldDecorator : null;
                                    Modifier modifier4 = companion;
                                    if ((i3 & 16384) == 0) {
                                        scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        keyboardActionHandler2 = keyboardActionHandler4;
                                        brush2 = cursorBrush;
                                        i19 = i22 & (-57345);
                                        outputTransformation2 = outputTransformation3;
                                        z4 = z6;
                                        textFieldDecorator2 = textFieldDecorator4;
                                        modifier2 = modifier4;
                                    } else {
                                        modifier2 = modifier4;
                                        scrollState2 = scrollState;
                                        keyboardActionHandler2 = keyboardActionHandler4;
                                        brush2 = cursorBrush;
                                        i19 = i22;
                                        outputTransformation2 = outputTransformation3;
                                        z4 = z6;
                                        textFieldDecorator2 = textFieldDecorator4;
                                    }
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    function22 = function24;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    inputTransformation2 = inputTransformation4;
                                    textStyle2 = textStyle4;
                                    keyboardOptions2 = keyboardOptions4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i22 &= -57345;
                                    }
                                    modifier2 = modifier;
                                    z3 = z;
                                    z4 = z2;
                                    inputTransformation2 = inputTransformation;
                                    textStyle2 = textStyle;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    textFieldLineLimits2 = textFieldLineLimits;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    outputTransformation2 = outputTransformation;
                                    textFieldDecorator2 = textFieldDecorator;
                                    scrollState2 = scrollState;
                                    i19 = i22;
                                    function22 = function2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(469439921, i4, i19, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:187)");
                                }
                                int i23 = i4 & 2147483646;
                                int i24 = (i19 & 14) | 384 | (i19 & 112);
                                int i25 = i19 << 3;
                                BasicTextField(textFieldState, modifier2, z3, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, brush2, null, outputTransformation2, textFieldDecorator2, scrollState2, false, startRestartGroup, i23, i24 | (i25 & 7168) | (57344 & i25) | (i25 & 458752), 65536);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textStyle3 = textStyle2;
                                brush3 = brush2;
                                textFieldDecorator3 = textFieldDecorator2;
                                scrollState3 = scrollState2;
                                z5 = z4;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function23 = function22;
                                textFieldLineLimits3 = textFieldLineLimits2;
                                keyboardActionHandler3 = keyboardActionHandler2;
                                keyboardOptions3 = keyboardOptions2;
                                inputTransformation3 = inputTransformation2;
                                modifier3 = modifier2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z3 = z;
                                z5 = z2;
                                inputTransformation3 = inputTransformation;
                                textStyle3 = textStyle;
                                keyboardOptions3 = keyboardOptions;
                                keyboardActionHandler3 = keyboardActionHandler;
                                textFieldLineLimits3 = textFieldLineLimits;
                                function23 = function2;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush3 = brush;
                                outputTransformation2 = outputTransformation;
                                textFieldDecorator3 = textFieldDecorator;
                                scrollState3 = scrollState;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier5 = modifier3;
                                final boolean z7 = z3;
                                final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                final Brush brush4 = brush3;
                                final OutputTransformation outputTransformation4 = outputTransformation2;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
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

                                    public final void invoke(Composer composer2, int i26) {
                                        BasicTextFieldKt.BasicTextField(TextFieldState.this, modifier5, z7, z5, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler3, textFieldLineLimits3, function23, mutableInteractionSource5, brush4, outputTransformation4, textFieldDecorator3, scrollState3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i17 = i3 & 8192;
                        if (i17 == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i20 == 0) {
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
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        Modifier modifier42 = companion;
                        if ((i3 & 16384) == 0) {
                        }
                        textFieldLineLimits2 = textFieldLineLimits4;
                        function22 = function24;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        inputTransformation2 = inputTransformation4;
                        textStyle2 = textStyle4;
                        keyboardOptions2 = keyboardOptions4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i232 = i4 & 2147483646;
                        int i242 = (i19 & 14) | 384 | (i19 & 112);
                        int i252 = i19 << 3;
                        BasicTextField(textFieldState, modifier2, z3, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, brush2, null, outputTransformation2, textFieldDecorator2, scrollState2, false, startRestartGroup, i232, i242 | (i252 & 7168) | (57344 & i252) | (i252 & 458752), 65536);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textStyle3 = textStyle2;
                        brush3 = brush2;
                        textFieldDecorator3 = textFieldDecorator2;
                        scrollState3 = scrollState2;
                        z5 = z4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        function23 = function22;
                        textFieldLineLimits3 = textFieldLineLimits2;
                        keyboardActionHandler3 = keyboardActionHandler2;
                        keyboardOptions3 = keyboardOptions2;
                        inputTransformation3 = inputTransformation2;
                        modifier3 = modifier2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    int i222 = i14;
                    i16 = i3 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i3 & 8192;
                    if (i17 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i20 == 0) {
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
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    Modifier modifier422 = companion;
                    if ((i3 & 16384) == 0) {
                    }
                    textFieldLineLimits2 = textFieldLineLimits4;
                    function22 = function24;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    inputTransformation2 = inputTransformation4;
                    textStyle2 = textStyle4;
                    keyboardOptions2 = keyboardOptions4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i2322 = i4 & 2147483646;
                    int i2422 = (i19 & 14) | 384 | (i19 & 112);
                    int i2522 = i19 << 3;
                    BasicTextField(textFieldState, modifier2, z3, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, brush2, null, outputTransformation2, textFieldDecorator2, scrollState2, false, startRestartGroup, i2322, i2422 | (i2522 & 7168) | (57344 & i2522) | (i2522 & 458752), 65536);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    brush3 = brush2;
                    textFieldDecorator3 = textFieldDecorator2;
                    scrollState3 = scrollState2;
                    z5 = z4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    function23 = function22;
                    textFieldLineLimits3 = textFieldLineLimits2;
                    keyboardActionHandler3 = keyboardActionHandler2;
                    keyboardOptions3 = keyboardOptions2;
                    inputTransformation3 = inputTransformation2;
                    modifier3 = modifier2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                int i212 = 8192;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                int i2222 = i14;
                i16 = i3 & 4096;
                if (i16 != 0) {
                }
                i17 = i3 & 8192;
                if (i17 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i20 == 0) {
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
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i18 == 0) {
                }
                Modifier modifier4222 = companion;
                if ((i3 & 16384) == 0) {
                }
                textFieldLineLimits2 = textFieldLineLimits4;
                function22 = function24;
                mutableInteractionSource2 = mutableInteractionSource4;
                inputTransformation2 = inputTransformation4;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i23222 = i4 & 2147483646;
                int i24222 = (i19 & 14) | 384 | (i19 & 112);
                int i25222 = i19 << 3;
                BasicTextField(textFieldState, modifier2, z3, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, brush2, null, outputTransformation2, textFieldDecorator2, scrollState2, false, startRestartGroup, i23222, i24222 | (i25222 & 7168) | (57344 & i25222) | (i25222 & 458752), 65536);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                brush3 = brush2;
                textFieldDecorator3 = textFieldDecorator2;
                scrollState3 = scrollState2;
                z5 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                function23 = function22;
                textFieldLineLimits3 = textFieldLineLimits2;
                keyboardActionHandler3 = keyboardActionHandler2;
                keyboardOptions3 = keyboardOptions2;
                inputTransformation3 = inputTransformation2;
                modifier3 = modifier2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            int i2122 = 8192;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            int i22222 = i14;
            i16 = i3 & 4096;
            if (i16 != 0) {
            }
            i17 = i3 & 8192;
            if (i17 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i20 == 0) {
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
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            Modifier modifier42222 = companion;
            if ((i3 & 16384) == 0) {
            }
            textFieldLineLimits2 = textFieldLineLimits4;
            function22 = function24;
            mutableInteractionSource2 = mutableInteractionSource4;
            inputTransformation2 = inputTransformation4;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i232222 = i4 & 2147483646;
            int i242222 = (i19 & 14) | 384 | (i19 & 112);
            int i252222 = i19 << 3;
            BasicTextField(textFieldState, modifier2, z3, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, brush2, null, outputTransformation2, textFieldDecorator2, scrollState2, false, startRestartGroup, i232222, i242222 | (i252222 & 7168) | (57344 & i252222) | (i252222 & 458752), 65536);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            brush3 = brush2;
            textFieldDecorator3 = textFieldDecorator2;
            scrollState3 = scrollState2;
            z5 = z4;
            mutableInteractionSource3 = mutableInteractionSource2;
            function23 = function22;
            textFieldLineLimits3 = textFieldLineLimits2;
            keyboardActionHandler3 = keyboardActionHandler2;
            keyboardOptions3 = keyboardOptions2;
            inputTransformation3 = inputTransformation2;
            modifier3 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        int i21222 = 8192;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        int i222222 = i14;
        i16 = i3 & 4096;
        if (i16 != 0) {
        }
        i17 = i3 & 8192;
        if (i17 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i20 == 0) {
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
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        Modifier modifier422222 = companion;
        if ((i3 & 16384) == 0) {
        }
        textFieldLineLimits2 = textFieldLineLimits4;
        function22 = function24;
        mutableInteractionSource2 = mutableInteractionSource4;
        inputTransformation2 = inputTransformation4;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i2322222 = i4 & 2147483646;
        int i2422222 = (i19 & 14) | 384 | (i19 & 112);
        int i2522222 = i19 << 3;
        BasicTextField(textFieldState, modifier2, z3, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, brush2, null, outputTransformation2, textFieldDecorator2, scrollState2, false, startRestartGroup, i2322222, i2422222 | (i2522222 & 7168) | (57344 & i2522222) | (i2522222 & 458752), 65536);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        brush3 = brush2;
        textFieldDecorator3 = textFieldDecorator2;
        scrollState3 = scrollState2;
        z5 = z4;
        mutableInteractionSource3 = mutableInteractionSource2;
        function23 = function22;
        textFieldLineLimits3 = textFieldLineLimits2;
        keyboardActionHandler3 = keyboardActionHandler2;
        keyboardOptions3 = keyboardOptions2;
        inputTransformation3 = inputTransformation2;
        modifier3 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z3, Composer composer, final int i, final int i2, final int i3) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        boolean z5;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        CodepointTransformation codepointTransformation2;
        TextFieldDecorator textFieldDecorator2;
        ScrollState scrollState2;
        Modifier modifier2;
        int i22;
        OutputTransformation outputTransformation2;
        boolean z6;
        Brush brush2;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        TextFieldLineLimits textFieldLineLimits2;
        KeyboardActionHandler keyboardActionHandler2;
        InputTransformation inputTransformation2;
        TextFieldLineLimits textFieldLineLimits3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z7;
        Object rememberedValue;
        SingleLineCodepointTransformation singleLineCodepointTransformation;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        boolean changed3;
        Object rememberedValue4;
        boolean changedInstance;
        Object rememberedValue5;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        final Brush brush3;
        final MutableInteractionSource mutableInteractionSource4;
        final TextFieldLineLimits textFieldLineLimits4;
        final boolean z8;
        final ScrollState scrollState3;
        final boolean z9;
        final TextFieldDecorator textFieldDecorator3;
        final KeyboardOptions keyboardOptions3;
        final OutputTransformation outputTransformation3;
        final CodepointTransformation codepointTransformation3;
        final KeyboardActionHandler keyboardActionHandler3;
        InputTransformation inputTransformation3;
        final boolean z10;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        int i23;
        Composer startRestartGroup = composer.startRestartGroup(965149429);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(15,9,3,13,4,16,7,10,8,11,5,1!1,12!1,14)234@12943L21,239@13149L7,240@13204L7,241@13249L7,247@13619L25,248@13693L25,251@13806L797,271@14801L48,273@14885L357,284@15295L7,285@15359L7,286@15413L7,287@15436L520,287@15425L531,303@16004L83,303@15962L125,342@17504L3096:BasicTextField.kt#423gt5");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i24 = i3 & 2;
        if (i24 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(inputTransformation) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(textFieldLineLimits) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i14 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i14 |= startRestartGroup.changed(brush) ? 32 : 16;
                        }
                        int i25 = i14;
                        i16 = i3 & 4096;
                        if (i16 != 0) {
                            i25 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i25 |= startRestartGroup.changed(codepointTransformation) ? 256 : 128;
                            i17 = i3 & 8192;
                            if (i17 == 0) {
                                i25 |= 3072;
                                i18 = i17;
                            } else {
                                i18 = i17;
                                if ((i2 & 3072) == 0) {
                                    i25 |= startRestartGroup.changed(outputTransformation) ? 2048 : 1024;
                                    i19 = i3 & 16384;
                                    if (i19 != 0) {
                                        i25 |= 24576;
                                        i20 = i19;
                                    } else {
                                        i20 = i19;
                                        if ((i2 & 24576) == 0) {
                                            i25 |= (i2 & 32768) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 16384 : 8192;
                                        }
                                    }
                                    if ((196608 & i2) == 0) {
                                        if ((i3 & 32768) == 0 && startRestartGroup.changed(scrollState)) {
                                            i23 = 131072;
                                            i25 |= i23;
                                        }
                                        i23 = 65536;
                                        i25 |= i23;
                                    }
                                    i21 = i3 & 65536;
                                    if (i21 != 0) {
                                        i25 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i25 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                                    }
                                    if ((i4 & 306783379) == 306783378 || (599187 & i25) != 599186 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            Modifier.Companion companion = i24 != 0 ? Modifier.INSTANCE : modifier;
                                            z4 = i5 != 0 ? true : z;
                                            z5 = i6 != 0 ? false : z2;
                                            InputTransformation inputTransformation4 = i7 != 0 ? null : inputTransformation;
                                            textStyle2 = i8 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                            keyboardOptions2 = i9 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActionHandler keyboardActionHandler4 = i10 != 0 ? null : keyboardActionHandler;
                                            TextFieldLineLimits textFieldLineLimits5 = i11 != 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                            Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = i12 != 0 ? null : function2;
                                            MutableInteractionSource mutableInteractionSource5 = i13 != 0 ? null : mutableInteractionSource;
                                            SolidColor cursorBrush = i15 != 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                            codepointTransformation2 = i16 != 0 ? null : codepointTransformation;
                                            OutputTransformation outputTransformation4 = i18 != 0 ? null : outputTransformation;
                                            textFieldDecorator2 = i20 != 0 ? null : textFieldDecorator;
                                            Modifier modifier4 = companion;
                                            if ((i3 & 32768) != 0) {
                                                scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                                i25 &= -458753;
                                            } else {
                                                scrollState2 = scrollState;
                                            }
                                            modifier2 = modifier4;
                                            i22 = i25;
                                            outputTransformation2 = outputTransformation4;
                                            z6 = i21 != 0 ? false : z3;
                                            brush2 = cursorBrush;
                                            mutableInteractionSource2 = mutableInteractionSource5;
                                            function22 = function24;
                                            textFieldLineLimits2 = textFieldLineLimits5;
                                            keyboardActionHandler2 = keyboardActionHandler4;
                                            inputTransformation2 = inputTransformation4;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & 32768) != 0) {
                                                i25 &= -458753;
                                            }
                                            modifier2 = modifier;
                                            z4 = z;
                                            z5 = z2;
                                            inputTransformation2 = inputTransformation;
                                            textStyle2 = textStyle;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActionHandler2 = keyboardActionHandler;
                                            textFieldLineLimits2 = textFieldLineLimits;
                                            function22 = function2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            codepointTransformation2 = codepointTransformation;
                                            outputTransformation2 = outputTransformation;
                                            textFieldDecorator2 = textFieldDecorator;
                                            scrollState2 = scrollState;
                                            z6 = z3;
                                            i22 = i25;
                                            brush2 = brush;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(965149429, i4, i22, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:238)");
                                        }
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function22;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Density density = (Density) consume;
                                        final Brush brush4 = brush2;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                        ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume3 = startRestartGroup.consume(localWindowInfo);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        WindowInfo windowInfo = (WindowInfo) consume3;
                                        final boolean areEqual = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                                        if (mutableInteractionSource2 == null) {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            startRestartGroup.startReplaceGroup(96938805);
                                            ComposerKt.sourceInformation(startRestartGroup, "245@13454L39");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243798931, "CC(remember):BasicTextField.kt#9igjgp");
                                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                                            textFieldLineLimits3 = textFieldLineLimits2;
                                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue6 = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue6);
                                            }
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue6;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            textFieldLineLimits3 = textFieldLineLimits2;
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            startRestartGroup.startReplaceGroup(-1243799582);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final Orientation orientation = areEqual ? Orientation.Horizontal : Orientation.Vertical;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                                        Modifier modifier5 = modifier2;
                                        final boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource6, startRestartGroup, 0).getValue().booleanValue();
                                        final boolean booleanValue2 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource6, startRestartGroup, 0).getValue().booleanValue();
                                        final boolean isWindowFocused = windowInfo.isWindowFocused();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                                        z7 = ((i4 & 14) == 4) | ((i22 & 896) == 256) | ((i22 & 7168) == 2048);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!z7 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            if (codepointTransformation2 == null) {
                                                SingleLineCodepointTransformation singleLineCodepointTransformation2 = SingleLineCodepointTransformation.INSTANCE;
                                                if (!areEqual) {
                                                    singleLineCodepointTransformation2 = null;
                                                }
                                                singleLineCodepointTransformation = singleLineCodepointTransformation2;
                                            } else {
                                                singleLineCodepointTransformation = codepointTransformation2;
                                            }
                                            rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        final TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                                        changed = startRestartGroup.changed(transformedTextFieldState);
                                        OutputTransformation outputTransformation5 = outputTransformation2;
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new TextLayoutState();
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        final TextLayoutState textLayoutState = (TextLayoutState) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                                        changed2 = startRestartGroup.changed(transformedTextFieldState);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState, textLayoutState, density, z4, z5, !booleanValue && isWindowFocused, z6);
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        final TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                                        CodepointTransformation codepointTransformation4 = codepointTransformation2;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume4 = startRestartGroup.consume(localHapticFeedback);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final HapticFeedback hapticFeedback = (HapticFeedback) consume4;
                                        ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume5 = startRestartGroup.consume(localClipboardManager);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final ClipboardManager clipboardManager = (ClipboardManager) consume5;
                                        KeyboardActionHandler keyboardActionHandler5 = keyboardActionHandler2;
                                        ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object consume6 = startRestartGroup.consume(localTextToolbar);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final TextToolbar textToolbar = (TextToolbar) consume6;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                                        changed3 = ((57344 & i4) == 16384) | startRestartGroup.changed(transformedTextFieldState) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback) | startRestartGroup.changedInstance(clipboardManager) | startRestartGroup.changedInstance(textToolbar) | startRestartGroup.changed(density) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i22) == 1048576);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (!changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            final InputTransformation inputTransformation5 = inputTransformation2;
                                            final boolean z11 = z4;
                                            final boolean z12 = z5;
                                            final boolean z13 = z6;
                                            rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    TransformedTextFieldState.this.update(inputTransformation5);
                                                    textFieldSelectionState.update(hapticFeedback, clipboardManager, textToolbar, density, z11, z12, z13);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                                        changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                                        rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (!changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                    final TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            TextFieldSelectionState.this.dispose();
                                                        }
                                                    };
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.DisposableEffect(textFieldSelectionState, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                                        modifier3 = modifier5;
                                        Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier3.then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation2, z4, z5, keyboardOptions2, keyboardActionHandler5, areEqual, mutableInteractionSource7)), z4, mutableInteractionSource7), scrollState2, orientation, !z4 && textFieldSelectionState.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation, false), null, mutableInteractionSource7, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pointerHoverIcon$default);
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
                                        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                                        final TextFieldDecorator textFieldDecorator4 = textFieldDecorator2;
                                        final TextFieldLineLimits textFieldLineLimits6 = textFieldLineLimits3;
                                        final TextStyle textStyle3 = textStyle2;
                                        final boolean z14 = z4;
                                        final boolean z15 = z5;
                                        final ScrollState scrollState4 = scrollState2;
                                        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState, z4, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                                            public final void invoke(Composer composer2, int i26) {
                                                ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                                if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-673241599, i26, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                                    }
                                                    TextFieldDecorator textFieldDecorator5 = TextFieldDecorator.this;
                                                    if (textFieldDecorator5 == null) {
                                                        textFieldDecorator5 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                                    }
                                                    final TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits6;
                                                    final TextLayoutState textLayoutState2 = textLayoutState;
                                                    final TextStyle textStyle4 = textStyle3;
                                                    final boolean z16 = booleanValue;
                                                    final boolean z17 = isWindowFocused;
                                                    final boolean z18 = booleanValue2;
                                                    final TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                                                    final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                                    final Brush brush5 = brush4;
                                                    final boolean z19 = z14;
                                                    final boolean z20 = z15;
                                                    final ScrollState scrollState5 = scrollState4;
                                                    TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                                                    final Orientation orientation2 = orientation;
                                                    final boolean z21 = areEqual;
                                                    final Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                    textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                            invoke(composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer3, int i27) {
                                                            int i28;
                                                            int i29;
                                                            ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                                                            if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1969169726, i27, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                                }
                                                                TextFieldLineLimits textFieldLineLimits8 = TextFieldLineLimits.this;
                                                                if (textFieldLineLimits8 instanceof TextFieldLineLimits.MultiLine) {
                                                                    i28 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits8).getMinHeightInLines();
                                                                    i29 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                                                } else {
                                                                    i28 = 1;
                                                                    i29 = 1;
                                                                }
                                                                Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState2.m1215getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle4, i28, i29), textStyle4)).then(new TextFieldCoreModifier(z16 && z17, z18, textLayoutState2, transformedTextFieldState2, textFieldSelectionState2, brush5, z19 && !z20, scrollState5, orientation2));
                                                                TextLayoutState textLayoutState3 = textLayoutState2;
                                                                TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2;
                                                                TextStyle textStyle5 = textStyle4;
                                                                boolean z22 = z21;
                                                                Function2<Density, Function0<TextLayoutResult>, Unit> function27 = function26;
                                                                boolean z23 = z19;
                                                                boolean z24 = z16;
                                                                boolean z25 = z17;
                                                                TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2;
                                                                boolean z26 = z20;
                                                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, then);
                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer3.startReusableNode();
                                                                if (composer3.getInserting()) {
                                                                    composer3.createNode(constructor2);
                                                                } else {
                                                                    composer3.useNode();
                                                                }
                                                                Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                                                Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                    m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                    m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                }
                                                                Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                                BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState3.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState3, textStyle5, z22, function27)), composer3, 0);
                                                                if (z23 && z24 && z25 && textFieldSelectionState3.isInTouchMode()) {
                                                                    composer3.startReplaceGroup(-1325530694);
                                                                    ComposerKt.sourceInformation(composer3, "398@20188L121");
                                                                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState3, composer3, 0);
                                                                    if (!z26) {
                                                                        composer3.startReplaceGroup(-1325351669);
                                                                        ComposerKt.sourceInformation(composer3, "402@20379L125");
                                                                        BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState3, composer3, 0);
                                                                        composer3.endReplaceGroup();
                                                                    } else {
                                                                        composer3.startReplaceGroup(-1325177728);
                                                                        composer3.endReplaceGroup();
                                                                    }
                                                                    composer3.endReplaceGroup();
                                                                } else {
                                                                    composer3.startReplaceGroup(-1325155904);
                                                                    composer3.endReplaceGroup();
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                composer3.endNode();
                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }, composer2, 54), composer2, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        brush3 = brush4;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        textFieldLineLimits4 = textFieldLineLimits3;
                                        z8 = z4;
                                        scrollState3 = scrollState2;
                                        z9 = z6;
                                        textFieldDecorator3 = textFieldDecorator2;
                                        keyboardOptions3 = keyboardOptions2;
                                        outputTransformation3 = outputTransformation5;
                                        codepointTransformation3 = codepointTransformation4;
                                        keyboardActionHandler3 = keyboardActionHandler5;
                                        inputTransformation3 = inputTransformation2;
                                        z10 = z5;
                                        function23 = function25;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier3 = modifier;
                                        z8 = z;
                                        z10 = z2;
                                        inputTransformation3 = inputTransformation;
                                        textStyle2 = textStyle;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        textFieldLineLimits4 = textFieldLineLimits;
                                        function23 = function2;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        brush3 = brush;
                                        codepointTransformation3 = codepointTransformation;
                                        outputTransformation3 = outputTransformation;
                                        textFieldDecorator3 = textFieldDecorator;
                                        scrollState3 = scrollState;
                                        z9 = z3;
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final Modifier modifier6 = modifier3;
                                        final InputTransformation inputTransformation6 = inputTransformation3;
                                        final TextStyle textStyle4 = textStyle2;
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
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

                                            public final void invoke(Composer composer2, int i26) {
                                                BasicTextFieldKt.BasicTextField(TextFieldState.this, modifier6, z8, z10, inputTransformation6, textStyle4, keyboardOptions3, keyboardActionHandler3, textFieldLineLimits4, function23, mutableInteractionSource4, brush3, codepointTransformation3, outputTransformation3, textFieldDecorator3, scrollState3, z9, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i19 = i3 & 16384;
                            if (i19 != 0) {
                            }
                            if ((196608 & i2) == 0) {
                            }
                            i21 = i3 & 65536;
                            if (i21 != 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            Modifier modifier42 = companion;
                            if ((i3 & 32768) != 0) {
                            }
                            modifier2 = modifier42;
                            i22 = i25;
                            outputTransformation2 = outputTransformation4;
                            if (i21 != 0) {
                            }
                            brush2 = cursorBrush;
                            mutableInteractionSource2 = mutableInteractionSource5;
                            function22 = function24;
                            textFieldLineLimits2 = textFieldLineLimits5;
                            keyboardActionHandler2 = keyboardActionHandler4;
                            inputTransformation2 = inputTransformation4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function252 = function22;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume7 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density2 = (Density) consume7;
                            final Brush brush42 = brush2;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                            ProvidableCompositionLocal<WindowInfo> localWindowInfo2 = CompositionLocalsKt.getLocalWindowInfo();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume32 = startRestartGroup.consume(localWindowInfo2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            WindowInfo windowInfo2 = (WindowInfo) consume32;
                            final boolean areEqual2 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                            if (mutableInteractionSource2 == null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            final Orientation orientation2 = areEqual2 ? Orientation.Horizontal : Orientation.Vertical;
                            MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource2;
                            Modifier modifier52 = modifier2;
                            final boolean booleanValue3 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource62, startRestartGroup, 0).getValue().booleanValue();
                            final boolean booleanValue22 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource62, startRestartGroup, 0).getValue().booleanValue();
                            final boolean isWindowFocused2 = windowInfo2.isWindowFocused();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                            MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource2;
                            z7 = ((i4 & 14) == 4) | ((i22 & 896) == 256) | ((i22 & 7168) == 2048);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z7) {
                            }
                            if (codepointTransformation2 == null) {
                            }
                            rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            final TransformedTextFieldState transformedTextFieldState2 = (TransformedTextFieldState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                            changed = startRestartGroup.changed(transformedTextFieldState2);
                            OutputTransformation outputTransformation52 = outputTransformation2;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue2 = new TextLayoutState();
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            final TextLayoutState textLayoutState2 = (TextLayoutState) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                            changed2 = startRestartGroup.changed(transformedTextFieldState2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState2, textLayoutState2, density2, z4, z5, !booleanValue3 && isWindowFocused2, z6);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            final TextFieldSelectionState textFieldSelectionState2 = (TextFieldSelectionState) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                            CodepointTransformation codepointTransformation42 = codepointTransformation2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume42 = startRestartGroup.consume(localHapticFeedback2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final HapticFeedback hapticFeedback2 = (HapticFeedback) consume42;
                            ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume52 = startRestartGroup.consume(localClipboardManager2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final ClipboardManager clipboardManager2 = (ClipboardManager) consume52;
                            KeyboardActionHandler keyboardActionHandler52 = keyboardActionHandler2;
                            ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume62 = startRestartGroup.consume(localTextToolbar2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final TextToolbar textToolbar2 = (TextToolbar) consume62;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                            changed3 = ((57344 & i4) == 16384) | startRestartGroup.changed(transformedTextFieldState2) | startRestartGroup.changedInstance(textFieldSelectionState2) | startRestartGroup.changedInstance(hapticFeedback2) | startRestartGroup.changedInstance(clipboardManager2) | startRestartGroup.changedInstance(textToolbar2) | startRestartGroup.changed(density2) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i22) == 1048576);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            final InputTransformation inputTransformation52 = inputTransformation2;
                            final boolean z112 = z4;
                            final boolean z122 = z5;
                            final boolean z132 = z6;
                            rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    TransformedTextFieldState.this.update(inputTransformation52);
                                    textFieldSelectionState2.update(hapticFeedback2, clipboardManager2, textToolbar2, density2, z112, z122, z132);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                            changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    final TextFieldSelectionState textFieldSelectionState22 = TextFieldSelectionState.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            TextFieldSelectionState.this.dispose();
                                        }
                                    };
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                            modifier3 = modifier52;
                            Modifier pointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier3.then(new TextFieldDecoratorModifier(transformedTextFieldState2, textLayoutState2, textFieldSelectionState2, inputTransformation2, z4, z5, keyboardOptions2, keyboardActionHandler52, areEqual2, mutableInteractionSource72)), z4, mutableInteractionSource72), scrollState2, orientation2, !z4 && textFieldSelectionState2.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection2, orientation2, false), null, mutableInteractionSource72, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, pointerHoverIcon$default2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3333constructorimpl.getInserting()) {
                            }
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                            final TextFieldDecorator textFieldDecorator42 = textFieldDecorator2;
                            final TextFieldLineLimits textFieldLineLimits62 = textFieldLineLimits3;
                            final TextStyle textStyle32 = textStyle2;
                            final boolean z142 = z4;
                            final boolean z152 = z5;
                            final ScrollState scrollState42 = scrollState2;
                            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState2, z4, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                                public final void invoke(Composer composer2, int i26) {
                                    ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                    if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-673241599, i26, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                        }
                                        TextFieldDecorator textFieldDecorator5 = TextFieldDecorator.this;
                                        if (textFieldDecorator5 == null) {
                                            textFieldDecorator5 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                        }
                                        final TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits62;
                                        final TextLayoutState textLayoutState22 = textLayoutState2;
                                        final TextStyle textStyle42 = textStyle32;
                                        final boolean z16 = booleanValue3;
                                        final boolean z17 = isWindowFocused2;
                                        final boolean z18 = booleanValue22;
                                        final TransformedTextFieldState transformedTextFieldState22 = transformedTextFieldState2;
                                        final TextFieldSelectionState textFieldSelectionState22 = textFieldSelectionState2;
                                        final Brush brush5 = brush42;
                                        final boolean z19 = z142;
                                        final boolean z20 = z152;
                                        final ScrollState scrollState5 = scrollState42;
                                        TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                                        final Orientation orientation22 = orientation2;
                                        final boolean z21 = areEqual2;
                                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function252;
                                        textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i27) {
                                                int i28;
                                                int i29;
                                                ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                                                if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1969169726, i27, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                    }
                                                    TextFieldLineLimits textFieldLineLimits8 = TextFieldLineLimits.this;
                                                    if (textFieldLineLimits8 instanceof TextFieldLineLimits.MultiLine) {
                                                        i28 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits8).getMinHeightInLines();
                                                        i29 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                                    } else {
                                                        i28 = 1;
                                                        i29 = 1;
                                                    }
                                                    Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState22.m1215getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i28, i29), textStyle42)).then(new TextFieldCoreModifier(z16 && z17, z18, textLayoutState22, transformedTextFieldState22, textFieldSelectionState22, brush5, z19 && !z20, scrollState5, orientation22));
                                                    TextLayoutState textLayoutState3 = textLayoutState22;
                                                    TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState22;
                                                    TextStyle textStyle5 = textStyle42;
                                                    boolean z22 = z21;
                                                    Function2<Density, Function0<TextLayoutResult>, Unit> function27 = function26;
                                                    boolean z23 = z19;
                                                    boolean z24 = z16;
                                                    boolean z25 = z17;
                                                    TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState22;
                                                    boolean z26 = z20;
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, then);
                                                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor22);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                                    Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                                    }
                                                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                    BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState3.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState3, textStyle5, z22, function27)), composer3, 0);
                                                    if (z23 && z24 && z25 && textFieldSelectionState3.isInTouchMode()) {
                                                        composer3.startReplaceGroup(-1325530694);
                                                        ComposerKt.sourceInformation(composer3, "398@20188L121");
                                                        BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState3, composer3, 0);
                                                        if (!z26) {
                                                            composer3.startReplaceGroup(-1325351669);
                                                            ComposerKt.sourceInformation(composer3, "402@20379L125");
                                                            BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState3, composer3, 0);
                                                            composer3.endReplaceGroup();
                                                        } else {
                                                            composer3.startReplaceGroup(-1325177728);
                                                            composer3.endReplaceGroup();
                                                        }
                                                        composer3.endReplaceGroup();
                                                    } else {
                                                        composer3.startReplaceGroup(-1325155904);
                                                        composer3.endReplaceGroup();
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    composer3.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composer2, 54), composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            brush3 = brush42;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            textFieldLineLimits4 = textFieldLineLimits3;
                            z8 = z4;
                            scrollState3 = scrollState2;
                            z9 = z6;
                            textFieldDecorator3 = textFieldDecorator2;
                            keyboardOptions3 = keyboardOptions2;
                            outputTransformation3 = outputTransformation52;
                            codepointTransformation3 = codepointTransformation42;
                            keyboardActionHandler3 = keyboardActionHandler52;
                            inputTransformation3 = inputTransformation2;
                            z10 = z5;
                            function23 = function252;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i17 = i3 & 8192;
                        if (i17 == 0) {
                        }
                        i19 = i3 & 16384;
                        if (i19 != 0) {
                        }
                        if ((196608 & i2) == 0) {
                        }
                        i21 = i3 & 65536;
                        if (i21 != 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        Modifier modifier422 = companion;
                        if ((i3 & 32768) != 0) {
                        }
                        modifier2 = modifier422;
                        i22 = i25;
                        outputTransformation2 = outputTransformation4;
                        if (i21 != 0) {
                        }
                        brush2 = cursorBrush;
                        mutableInteractionSource2 = mutableInteractionSource5;
                        function22 = function24;
                        textFieldLineLimits2 = textFieldLineLimits5;
                        keyboardActionHandler2 = keyboardActionHandler4;
                        inputTransformation2 = inputTransformation4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2522 = function22;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume72 = startRestartGroup.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density22 = (Density) consume72;
                        final Brush brush422 = brush2;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
                        ProvidableCompositionLocal<WindowInfo> localWindowInfo22 = CompositionLocalsKt.getLocalWindowInfo();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume322 = startRestartGroup.consume(localWindowInfo22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        WindowInfo windowInfo22 = (WindowInfo) consume322;
                        final boolean areEqual22 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                        if (mutableInteractionSource2 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        final Orientation orientation22 = areEqual22 ? Orientation.Horizontal : Orientation.Vertical;
                        MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource2;
                        Modifier modifier522 = modifier2;
                        final boolean booleanValue32 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource622, startRestartGroup, 0).getValue().booleanValue();
                        final boolean booleanValue222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource622, startRestartGroup, 0).getValue().booleanValue();
                        final boolean isWindowFocused22 = windowInfo22.isWindowFocused();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                        MutableInteractionSource mutableInteractionSource722 = mutableInteractionSource2;
                        z7 = ((i4 & 14) == 4) | ((i22 & 896) == 256) | ((i22 & 7168) == 2048);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z7) {
                        }
                        if (codepointTransformation2 == null) {
                        }
                        rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        final TransformedTextFieldState transformedTextFieldState22 = (TransformedTextFieldState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                        changed = startRestartGroup.changed(transformedTextFieldState22);
                        OutputTransformation outputTransformation522 = outputTransformation2;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = new TextLayoutState();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        final TextLayoutState textLayoutState22 = (TextLayoutState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transformedTextFieldState22);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState22, textLayoutState22, density22, z4, z5, !booleanValue32 && isWindowFocused22, z6);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        final TextFieldSelectionState textFieldSelectionState22 = (TextFieldSelectionState) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22 = CompositionLocalsKt.getLocalHapticFeedback();
                        CodepointTransformation codepointTransformation422 = codepointTransformation2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume422 = startRestartGroup.consume(localHapticFeedback22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final HapticFeedback hapticFeedback22 = (HapticFeedback) consume422;
                        ProvidableCompositionLocal<ClipboardManager> localClipboardManager22 = CompositionLocalsKt.getLocalClipboardManager();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume522 = startRestartGroup.consume(localClipboardManager22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final ClipboardManager clipboardManager22 = (ClipboardManager) consume522;
                        KeyboardActionHandler keyboardActionHandler522 = keyboardActionHandler2;
                        ProvidableCompositionLocal<TextToolbar> localTextToolbar22 = CompositionLocalsKt.getLocalTextToolbar();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume622 = startRestartGroup.consume(localTextToolbar22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final TextToolbar textToolbar22 = (TextToolbar) consume622;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                        changed3 = ((57344 & i4) == 16384) | startRestartGroup.changed(transformedTextFieldState22) | startRestartGroup.changedInstance(textFieldSelectionState22) | startRestartGroup.changedInstance(hapticFeedback22) | startRestartGroup.changedInstance(clipboardManager22) | startRestartGroup.changedInstance(textToolbar22) | startRestartGroup.changed(density22) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i22) == 1048576);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        final InputTransformation inputTransformation522 = inputTransformation2;
                        final boolean z1122 = z4;
                        final boolean z1222 = z5;
                        final boolean z1322 = z6;
                        rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                TransformedTextFieldState.this.update(inputTransformation522);
                                textFieldSelectionState22.update(hapticFeedback22, clipboardManager22, textToolbar22, density22, z1122, z1222, z1322);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(textFieldSelectionState22);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final TextFieldSelectionState textFieldSelectionState222 = TextFieldSelectionState.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        TextFieldSelectionState.this.dispose();
                                    }
                                };
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.DisposableEffect(textFieldSelectionState22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                        modifier3 = modifier522;
                        Modifier pointerHoverIcon$default22 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier3.then(new TextFieldDecoratorModifier(transformedTextFieldState22, textLayoutState22, textFieldSelectionState22, inputTransformation2, z4, z5, keyboardOptions2, keyboardActionHandler522, areEqual22, mutableInteractionSource722)), z4, mutableInteractionSource722), scrollState2, orientation22, !z4 && textFieldSelectionState22.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection22, orientation22, false), null, mutableInteractionSource722, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, pointerHoverIcon$default22);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3333constructorimpl.getInserting()) {
                        }
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                        final TextFieldDecorator textFieldDecorator422 = textFieldDecorator2;
                        final TextFieldLineLimits textFieldLineLimits622 = textFieldLineLimits3;
                        final TextStyle textStyle322 = textStyle2;
                        final boolean z1422 = z4;
                        final boolean z1522 = z5;
                        final ScrollState scrollState422 = scrollState2;
                        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState22, z4, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                            public final void invoke(Composer composer2, int i26) {
                                ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-673241599, i26, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                    }
                                    TextFieldDecorator textFieldDecorator5 = TextFieldDecorator.this;
                                    if (textFieldDecorator5 == null) {
                                        textFieldDecorator5 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                    }
                                    final TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits622;
                                    final TextLayoutState textLayoutState222 = textLayoutState22;
                                    final TextStyle textStyle42 = textStyle322;
                                    final boolean z16 = booleanValue32;
                                    final boolean z17 = isWindowFocused22;
                                    final boolean z18 = booleanValue222;
                                    final TransformedTextFieldState transformedTextFieldState222 = transformedTextFieldState22;
                                    final TextFieldSelectionState textFieldSelectionState222 = textFieldSelectionState22;
                                    final Brush brush5 = brush422;
                                    final boolean z19 = z1422;
                                    final boolean z20 = z1522;
                                    final ScrollState scrollState5 = scrollState422;
                                    TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                                    final Orientation orientation222 = orientation22;
                                    final boolean z21 = areEqual22;
                                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function2522;
                                    textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i27) {
                                            int i28;
                                            int i29;
                                            ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                                            if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1969169726, i27, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                }
                                                TextFieldLineLimits textFieldLineLimits8 = TextFieldLineLimits.this;
                                                if (textFieldLineLimits8 instanceof TextFieldLineLimits.MultiLine) {
                                                    i28 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits8).getMinHeightInLines();
                                                    i29 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                                } else {
                                                    i28 = 1;
                                                    i29 = 1;
                                                }
                                                Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState222.m1215getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i28, i29), textStyle42)).then(new TextFieldCoreModifier(z16 && z17, z18, textLayoutState222, transformedTextFieldState222, textFieldSelectionState222, brush5, z19 && !z20, scrollState5, orientation222));
                                                TextLayoutState textLayoutState3 = textLayoutState222;
                                                TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState222;
                                                TextStyle textStyle5 = textStyle42;
                                                boolean z22 = z21;
                                                Function2<Density, Function0<TextLayoutResult>, Unit> function27 = function26;
                                                boolean z23 = z19;
                                                boolean z24 = z16;
                                                boolean z25 = z17;
                                                TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState222;
                                                boolean z26 = z20;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap222 = composer3.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer3, then);
                                                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor222);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                                Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                                }
                                                Updater.m3340setimpl(m3333constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState3.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState3, textStyle5, z22, function27)), composer3, 0);
                                                if (z23 && z24 && z25 && textFieldSelectionState3.isInTouchMode()) {
                                                    composer3.startReplaceGroup(-1325530694);
                                                    ComposerKt.sourceInformation(composer3, "398@20188L121");
                                                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState3, composer3, 0);
                                                    if (!z26) {
                                                        composer3.startReplaceGroup(-1325351669);
                                                        ComposerKt.sourceInformation(composer3, "402@20379L125");
                                                        BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState3, composer3, 0);
                                                        composer3.endReplaceGroup();
                                                    } else {
                                                        composer3.startReplaceGroup(-1325177728);
                                                        composer3.endReplaceGroup();
                                                    }
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    composer3.startReplaceGroup(-1325155904);
                                                    composer3.endReplaceGroup();
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                composer3.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composer2, 54), composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        brush3 = brush422;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        textFieldLineLimits4 = textFieldLineLimits3;
                        z8 = z4;
                        scrollState3 = scrollState2;
                        z9 = z6;
                        textFieldDecorator3 = textFieldDecorator2;
                        keyboardOptions3 = keyboardOptions2;
                        outputTransformation3 = outputTransformation522;
                        codepointTransformation3 = codepointTransformation422;
                        keyboardActionHandler3 = keyboardActionHandler522;
                        inputTransformation3 = inputTransformation2;
                        z10 = z5;
                        function23 = function2522;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    int i252 = i14;
                    i16 = i3 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i3 & 8192;
                    if (i17 == 0) {
                    }
                    i19 = i3 & 16384;
                    if (i19 != 0) {
                    }
                    if ((196608 & i2) == 0) {
                    }
                    i21 = i3 & 65536;
                    if (i21 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    Modifier modifier4222 = companion;
                    if ((i3 & 32768) != 0) {
                    }
                    modifier2 = modifier4222;
                    i22 = i252;
                    outputTransformation2 = outputTransformation4;
                    if (i21 != 0) {
                    }
                    brush2 = cursorBrush;
                    mutableInteractionSource2 = mutableInteractionSource5;
                    function22 = function24;
                    textFieldLineLimits2 = textFieldLineLimits5;
                    keyboardActionHandler2 = keyboardActionHandler4;
                    inputTransformation2 = inputTransformation4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25222 = function22;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume722 = startRestartGroup.consume(localDensity222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density222 = (Density) consume722;
                    final Brush brush4222 = brush2;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
                    ProvidableCompositionLocal<WindowInfo> localWindowInfo222 = CompositionLocalsKt.getLocalWindowInfo();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume3222 = startRestartGroup.consume(localWindowInfo222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    WindowInfo windowInfo222 = (WindowInfo) consume3222;
                    final boolean areEqual222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                    if (mutableInteractionSource2 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final Orientation orientation222 = areEqual222 ? Orientation.Horizontal : Orientation.Vertical;
                    MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource2;
                    Modifier modifier5222 = modifier2;
                    final boolean booleanValue322 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource6222, startRestartGroup, 0).getValue().booleanValue();
                    final boolean booleanValue2222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource6222, startRestartGroup, 0).getValue().booleanValue();
                    final boolean isWindowFocused222 = windowInfo222.isWindowFocused();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                    MutableInteractionSource mutableInteractionSource7222 = mutableInteractionSource2;
                    z7 = ((i4 & 14) == 4) | ((i22 & 896) == 256) | ((i22 & 7168) == 2048);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z7) {
                    }
                    if (codepointTransformation2 == null) {
                    }
                    rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final TransformedTextFieldState transformedTextFieldState222 = (TransformedTextFieldState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                    changed = startRestartGroup.changed(transformedTextFieldState222);
                    OutputTransformation outputTransformation5222 = outputTransformation2;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new TextLayoutState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    final TextLayoutState textLayoutState222 = (TextLayoutState) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transformedTextFieldState222);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState222, textLayoutState222, density222, z4, z5, !booleanValue322 && isWindowFocused222, z6);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    final TextFieldSelectionState textFieldSelectionState222 = (TextFieldSelectionState) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222 = CompositionLocalsKt.getLocalHapticFeedback();
                    CodepointTransformation codepointTransformation4222 = codepointTransformation2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume4222 = startRestartGroup.consume(localHapticFeedback222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final HapticFeedback hapticFeedback222 = (HapticFeedback) consume4222;
                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager222 = CompositionLocalsKt.getLocalClipboardManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5222 = startRestartGroup.consume(localClipboardManager222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final ClipboardManager clipboardManager222 = (ClipboardManager) consume5222;
                    KeyboardActionHandler keyboardActionHandler5222 = keyboardActionHandler2;
                    ProvidableCompositionLocal<TextToolbar> localTextToolbar222 = CompositionLocalsKt.getLocalTextToolbar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume6222 = startRestartGroup.consume(localTextToolbar222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TextToolbar textToolbar222 = (TextToolbar) consume6222;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                    changed3 = ((57344 & i4) == 16384) | startRestartGroup.changed(transformedTextFieldState222) | startRestartGroup.changedInstance(textFieldSelectionState222) | startRestartGroup.changedInstance(hapticFeedback222) | startRestartGroup.changedInstance(clipboardManager222) | startRestartGroup.changedInstance(textToolbar222) | startRestartGroup.changed(density222) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i22) == 1048576);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    final InputTransformation inputTransformation5222 = inputTransformation2;
                    final boolean z11222 = z4;
                    final boolean z12222 = z5;
                    final boolean z13222 = z6;
                    rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            TransformedTextFieldState.this.update(inputTransformation5222);
                            textFieldSelectionState222.update(hapticFeedback222, clipboardManager222, textToolbar222, density222, z11222, z12222, z13222);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(textFieldSelectionState222);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final TextFieldSelectionState textFieldSelectionState2222 = TextFieldSelectionState.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    TextFieldSelectionState.this.dispose();
                                }
                            };
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.DisposableEffect(textFieldSelectionState222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                    modifier3 = modifier5222;
                    Modifier pointerHoverIcon$default222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier3.then(new TextFieldDecoratorModifier(transformedTextFieldState222, textLayoutState222, textFieldSelectionState222, inputTransformation2, z4, z5, keyboardOptions2, keyboardActionHandler5222, areEqual222, mutableInteractionSource7222)), z4, mutableInteractionSource7222), scrollState2, orientation222, !z4 && textFieldSelectionState222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection222, orientation222, false), null, mutableInteractionSource7222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, pointerHoverIcon$default222);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl.getInserting()) {
                    }
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                    final TextFieldDecorator textFieldDecorator4222 = textFieldDecorator2;
                    final TextFieldLineLimits textFieldLineLimits6222 = textFieldLineLimits3;
                    final TextStyle textStyle3222 = textStyle2;
                    final boolean z14222 = z4;
                    final boolean z15222 = z5;
                    final ScrollState scrollState4222 = scrollState2;
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState222, z4, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                        public final void invoke(Composer composer2, int i26) {
                            ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                            if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-673241599, i26, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                }
                                TextFieldDecorator textFieldDecorator5 = TextFieldDecorator.this;
                                if (textFieldDecorator5 == null) {
                                    textFieldDecorator5 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                }
                                final TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits6222;
                                final TextLayoutState textLayoutState2222 = textLayoutState222;
                                final TextStyle textStyle42 = textStyle3222;
                                final boolean z16 = booleanValue322;
                                final boolean z17 = isWindowFocused222;
                                final boolean z18 = booleanValue2222;
                                final TransformedTextFieldState transformedTextFieldState2222 = transformedTextFieldState222;
                                final TextFieldSelectionState textFieldSelectionState2222 = textFieldSelectionState222;
                                final Brush brush5 = brush4222;
                                final boolean z19 = z14222;
                                final boolean z20 = z15222;
                                final ScrollState scrollState5 = scrollState4222;
                                TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                                final Orientation orientation2222 = orientation222;
                                final boolean z21 = areEqual222;
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function25222;
                                textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i27) {
                                        int i28;
                                        int i29;
                                        ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                                        if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1969169726, i27, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                            }
                                            TextFieldLineLimits textFieldLineLimits8 = TextFieldLineLimits.this;
                                            if (textFieldLineLimits8 instanceof TextFieldLineLimits.MultiLine) {
                                                i28 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits8).getMinHeightInLines();
                                                i29 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                            } else {
                                                i28 = 1;
                                                i29 = 1;
                                            }
                                            Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState2222.m1215getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i28, i29), textStyle42)).then(new TextFieldCoreModifier(z16 && z17, z18, textLayoutState2222, transformedTextFieldState2222, textFieldSelectionState2222, brush5, z19 && !z20, scrollState5, orientation2222));
                                            TextLayoutState textLayoutState3 = textLayoutState2222;
                                            TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2222;
                                            TextStyle textStyle5 = textStyle42;
                                            boolean z22 = z21;
                                            Function2<Density, Function0<TextLayoutResult>, Unit> function27 = function26;
                                            boolean z23 = z19;
                                            boolean z24 = z16;
                                            boolean z25 = z17;
                                            TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2222;
                                            boolean z26 = z20;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2222 = composer3.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer3, then);
                                            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor2222);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                            Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                                            }
                                            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                            BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState3.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState3, textStyle5, z22, function27)), composer3, 0);
                                            if (z23 && z24 && z25 && textFieldSelectionState3.isInTouchMode()) {
                                                composer3.startReplaceGroup(-1325530694);
                                                ComposerKt.sourceInformation(composer3, "398@20188L121");
                                                BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState3, composer3, 0);
                                                if (!z26) {
                                                    composer3.startReplaceGroup(-1325351669);
                                                    ComposerKt.sourceInformation(composer3, "402@20379L125");
                                                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState3, composer3, 0);
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    composer3.startReplaceGroup(-1325177728);
                                                    composer3.endReplaceGroup();
                                                }
                                                composer3.endReplaceGroup();
                                            } else {
                                                composer3.startReplaceGroup(-1325155904);
                                                composer3.endReplaceGroup();
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    brush3 = brush4222;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    textFieldLineLimits4 = textFieldLineLimits3;
                    z8 = z4;
                    scrollState3 = scrollState2;
                    z9 = z6;
                    textFieldDecorator3 = textFieldDecorator2;
                    keyboardOptions3 = keyboardOptions2;
                    outputTransformation3 = outputTransformation5222;
                    codepointTransformation3 = codepointTransformation4222;
                    keyboardActionHandler3 = keyboardActionHandler5222;
                    inputTransformation3 = inputTransformation2;
                    z10 = z5;
                    function23 = function25222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                int i2522 = i14;
                i16 = i3 & 4096;
                if (i16 != 0) {
                }
                i17 = i3 & 8192;
                if (i17 == 0) {
                }
                i19 = i3 & 16384;
                if (i19 != 0) {
                }
                if ((196608 & i2) == 0) {
                }
                i21 = i3 & 65536;
                if (i21 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i24 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i20 != 0) {
                }
                Modifier modifier42222 = companion;
                if ((i3 & 32768) != 0) {
                }
                modifier2 = modifier42222;
                i22 = i2522;
                outputTransformation2 = outputTransformation4;
                if (i21 != 0) {
                }
                brush2 = cursorBrush;
                mutableInteractionSource2 = mutableInteractionSource5;
                function22 = function24;
                textFieldLineLimits2 = textFieldLineLimits5;
                keyboardActionHandler2 = keyboardActionHandler4;
                inputTransformation2 = inputTransformation4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function252222 = function22;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume7222 = startRestartGroup.consume(localDensity2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density2222 = (Density) consume7222;
                final Brush brush42222 = brush2;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2222 = (LayoutDirection) consume22222;
                ProvidableCompositionLocal<WindowInfo> localWindowInfo2222 = CompositionLocalsKt.getLocalWindowInfo();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume32222 = startRestartGroup.consume(localWindowInfo2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                WindowInfo windowInfo2222 = (WindowInfo) consume32222;
                final boolean areEqual2222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                if (mutableInteractionSource2 == null) {
                }
                startRestartGroup.endReplaceGroup();
                final Orientation orientation2222 = areEqual2222 ? Orientation.Horizontal : Orientation.Vertical;
                MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource2;
                Modifier modifier52222 = modifier2;
                final boolean booleanValue3222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource62222, startRestartGroup, 0).getValue().booleanValue();
                final boolean booleanValue22222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource62222, startRestartGroup, 0).getValue().booleanValue();
                final boolean isWindowFocused2222 = windowInfo2222.isWindowFocused();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                MutableInteractionSource mutableInteractionSource72222 = mutableInteractionSource2;
                z7 = ((i4 & 14) == 4) | ((i22 & 896) == 256) | ((i22 & 7168) == 2048);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z7) {
                }
                if (codepointTransformation2 == null) {
                }
                rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                startRestartGroup.updateRememberedValue(rememberedValue);
                final TransformedTextFieldState transformedTextFieldState2222 = (TransformedTextFieldState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                changed = startRestartGroup.changed(transformedTextFieldState2222);
                OutputTransformation outputTransformation52222 = outputTransformation2;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new TextLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue2);
                final TextLayoutState textLayoutState2222 = (TextLayoutState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                changed2 = startRestartGroup.changed(transformedTextFieldState2222);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState2222, textLayoutState2222, density2222, z4, z5, !booleanValue3222 && isWindowFocused2222, z6);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                final TextFieldSelectionState textFieldSelectionState2222 = (TextFieldSelectionState) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2222 = CompositionLocalsKt.getLocalHapticFeedback();
                CodepointTransformation codepointTransformation42222 = codepointTransformation2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume42222 = startRestartGroup.consume(localHapticFeedback2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final HapticFeedback hapticFeedback2222 = (HapticFeedback) consume42222;
                ProvidableCompositionLocal<ClipboardManager> localClipboardManager2222 = CompositionLocalsKt.getLocalClipboardManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52222 = startRestartGroup.consume(localClipboardManager2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final ClipboardManager clipboardManager2222 = (ClipboardManager) consume52222;
                KeyboardActionHandler keyboardActionHandler52222 = keyboardActionHandler2;
                ProvidableCompositionLocal<TextToolbar> localTextToolbar2222 = CompositionLocalsKt.getLocalTextToolbar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume62222 = startRestartGroup.consume(localTextToolbar2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TextToolbar textToolbar2222 = (TextToolbar) consume62222;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                changed3 = ((57344 & i4) == 16384) | startRestartGroup.changed(transformedTextFieldState2222) | startRestartGroup.changedInstance(textFieldSelectionState2222) | startRestartGroup.changedInstance(hapticFeedback2222) | startRestartGroup.changedInstance(clipboardManager2222) | startRestartGroup.changedInstance(textToolbar2222) | startRestartGroup.changed(density2222) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i22) == 1048576);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                final InputTransformation inputTransformation52222 = inputTransformation2;
                final boolean z112222 = z4;
                final boolean z122222 = z5;
                final boolean z132222 = z6;
                rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TransformedTextFieldState.this.update(inputTransformation52222);
                        textFieldSelectionState2222.update(hapticFeedback2222, clipboardManager2222, textToolbar2222, density2222, z112222, z122222, z132222);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2222);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final TextFieldSelectionState textFieldSelectionState22222 = TextFieldSelectionState.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                TextFieldSelectionState.this.dispose();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(textFieldSelectionState2222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
                modifier3 = modifier52222;
                Modifier pointerHoverIcon$default2222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier3.then(new TextFieldDecoratorModifier(transformedTextFieldState2222, textLayoutState2222, textFieldSelectionState2222, inputTransformation2, z4, z5, keyboardOptions2, keyboardActionHandler52222, areEqual2222, mutableInteractionSource72222)), z4, mutableInteractionSource72222), scrollState2, orientation2222, !z4 && textFieldSelectionState2222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection2222, orientation2222, false), null, mutableInteractionSource72222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, pointerHoverIcon$default2222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl.getInserting()) {
                }
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                final TextFieldDecorator textFieldDecorator42222 = textFieldDecorator2;
                final TextFieldLineLimits textFieldLineLimits62222 = textFieldLineLimits3;
                final TextStyle textStyle32222 = textStyle2;
                final boolean z142222 = z4;
                final boolean z152222 = z5;
                final ScrollState scrollState42222 = scrollState2;
                ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState2222, z4, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                    public final void invoke(Composer composer2, int i26) {
                        ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                        if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-673241599, i26, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                            }
                            TextFieldDecorator textFieldDecorator5 = TextFieldDecorator.this;
                            if (textFieldDecorator5 == null) {
                                textFieldDecorator5 = BasicTextFieldKt.DefaultTextFieldDecorator;
                            }
                            final TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits62222;
                            final TextLayoutState textLayoutState22222 = textLayoutState2222;
                            final TextStyle textStyle42 = textStyle32222;
                            final boolean z16 = booleanValue3222;
                            final boolean z17 = isWindowFocused2222;
                            final boolean z18 = booleanValue22222;
                            final TransformedTextFieldState transformedTextFieldState22222 = transformedTextFieldState2222;
                            final TextFieldSelectionState textFieldSelectionState22222 = textFieldSelectionState2222;
                            final Brush brush5 = brush42222;
                            final boolean z19 = z142222;
                            final boolean z20 = z152222;
                            final ScrollState scrollState5 = scrollState42222;
                            TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                            final Orientation orientation22222 = orientation2222;
                            final boolean z21 = areEqual2222;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function252222;
                            textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i27) {
                                    int i28;
                                    int i29;
                                    ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                                    if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1969169726, i27, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                        }
                                        TextFieldLineLimits textFieldLineLimits8 = TextFieldLineLimits.this;
                                        if (textFieldLineLimits8 instanceof TextFieldLineLimits.MultiLine) {
                                            i28 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits8).getMinHeightInLines();
                                            i29 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                        } else {
                                            i28 = 1;
                                            i29 = 1;
                                        }
                                        Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState22222.m1215getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i28, i29), textStyle42)).then(new TextFieldCoreModifier(z16 && z17, z18, textLayoutState22222, transformedTextFieldState22222, textFieldSelectionState22222, brush5, z19 && !z20, scrollState5, orientation22222));
                                        TextLayoutState textLayoutState3 = textLayoutState22222;
                                        TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState22222;
                                        TextStyle textStyle5 = textStyle42;
                                        boolean z22 = z21;
                                        Function2<Density, Function0<TextLayoutResult>, Unit> function27 = function26;
                                        boolean z23 = z19;
                                        boolean z24 = z16;
                                        boolean z25 = z17;
                                        TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState22222;
                                        boolean z26 = z20;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap22222 = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(composer3, then);
                                        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor22222);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                        Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                        BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState3.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState3, textStyle5, z22, function27)), composer3, 0);
                                        if (z23 && z24 && z25 && textFieldSelectionState3.isInTouchMode()) {
                                            composer3.startReplaceGroup(-1325530694);
                                            ComposerKt.sourceInformation(composer3, "398@20188L121");
                                            BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState3, composer3, 0);
                                            if (!z26) {
                                                composer3.startReplaceGroup(-1325351669);
                                                ComposerKt.sourceInformation(composer3, "402@20379L125");
                                                BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState3, composer3, 0);
                                                composer3.endReplaceGroup();
                                            } else {
                                                composer3.startReplaceGroup(-1325177728);
                                                composer3.endReplaceGroup();
                                            }
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(-1325155904);
                                            composer3.endReplaceGroup();
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                brush3 = brush42222;
                mutableInteractionSource4 = mutableInteractionSource3;
                textFieldLineLimits4 = textFieldLineLimits3;
                z8 = z4;
                scrollState3 = scrollState2;
                z9 = z6;
                textFieldDecorator3 = textFieldDecorator2;
                keyboardOptions3 = keyboardOptions2;
                outputTransformation3 = outputTransformation52222;
                codepointTransformation3 = codepointTransformation42222;
                keyboardActionHandler3 = keyboardActionHandler52222;
                inputTransformation3 = inputTransformation2;
                z10 = z5;
                function23 = function252222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            int i25222 = i14;
            i16 = i3 & 4096;
            if (i16 != 0) {
            }
            i17 = i3 & 8192;
            if (i17 == 0) {
            }
            i19 = i3 & 16384;
            if (i19 != 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i21 = i3 & 65536;
            if (i21 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i24 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i20 != 0) {
            }
            Modifier modifier422222 = companion;
            if ((i3 & 32768) != 0) {
            }
            modifier2 = modifier422222;
            i22 = i25222;
            outputTransformation2 = outputTransformation4;
            if (i21 != 0) {
            }
            brush2 = cursorBrush;
            mutableInteractionSource2 = mutableInteractionSource5;
            function22 = function24;
            textFieldLineLimits2 = textFieldLineLimits5;
            keyboardActionHandler2 = keyboardActionHandler4;
            inputTransformation2 = inputTransformation4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2522222 = function22;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume72222 = startRestartGroup.consume(localDensity22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density22222 = (Density) consume72222;
            final Brush brush422222 = brush2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22222 = (LayoutDirection) consume222222;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo22222 = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume322222 = startRestartGroup.consume(localWindowInfo22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            WindowInfo windowInfo22222 = (WindowInfo) consume322222;
            final boolean areEqual22222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
            if (mutableInteractionSource2 == null) {
            }
            startRestartGroup.endReplaceGroup();
            final Orientation orientation22222 = areEqual22222 ? Orientation.Horizontal : Orientation.Vertical;
            MutableInteractionSource mutableInteractionSource622222 = mutableInteractionSource2;
            Modifier modifier522222 = modifier2;
            final boolean booleanValue32222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource622222, startRestartGroup, 0).getValue().booleanValue();
            final boolean booleanValue222222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource622222, startRestartGroup, 0).getValue().booleanValue();
            final boolean isWindowFocused22222 = windowInfo22222.isWindowFocused();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
            MutableInteractionSource mutableInteractionSource722222 = mutableInteractionSource2;
            z7 = ((i4 & 14) == 4) | ((i22 & 896) == 256) | ((i22 & 7168) == 2048);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z7) {
            }
            if (codepointTransformation2 == null) {
            }
            rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
            startRestartGroup.updateRememberedValue(rememberedValue);
            final TransformedTextFieldState transformedTextFieldState22222 = (TransformedTextFieldState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
            changed = startRestartGroup.changed(transformedTextFieldState22222);
            OutputTransformation outputTransformation522222 = outputTransformation2;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new TextLayoutState();
            startRestartGroup.updateRememberedValue(rememberedValue2);
            final TextLayoutState textLayoutState22222 = (TextLayoutState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
            changed2 = startRestartGroup.changed(transformedTextFieldState22222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState22222, textLayoutState22222, density22222, z4, z5, !booleanValue32222 && isWindowFocused22222, z6);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            final TextFieldSelectionState textFieldSelectionState22222 = (TextFieldSelectionState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22222 = CompositionLocalsKt.getLocalHapticFeedback();
            CodepointTransformation codepointTransformation422222 = codepointTransformation2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume422222 = startRestartGroup.consume(localHapticFeedback22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final HapticFeedback hapticFeedback22222 = (HapticFeedback) consume422222;
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager22222 = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522222 = startRestartGroup.consume(localClipboardManager22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final ClipboardManager clipboardManager22222 = (ClipboardManager) consume522222;
            KeyboardActionHandler keyboardActionHandler522222 = keyboardActionHandler2;
            ProvidableCompositionLocal<TextToolbar> localTextToolbar22222 = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume622222 = startRestartGroup.consume(localTextToolbar22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextToolbar textToolbar22222 = (TextToolbar) consume622222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
            changed3 = ((57344 & i4) == 16384) | startRestartGroup.changed(transformedTextFieldState22222) | startRestartGroup.changedInstance(textFieldSelectionState22222) | startRestartGroup.changedInstance(hapticFeedback22222) | startRestartGroup.changedInstance(clipboardManager22222) | startRestartGroup.changedInstance(textToolbar22222) | startRestartGroup.changed(density22222) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i22) == 1048576);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            final InputTransformation inputTransformation522222 = inputTransformation2;
            final boolean z1122222 = z4;
            final boolean z1222222 = z5;
            final boolean z1322222 = z6;
            rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TransformedTextFieldState.this.update(inputTransformation522222);
                    textFieldSelectionState22222.update(hapticFeedback22222, clipboardManager22222, textToolbar22222, density22222, z1122222, z1222222, z1322222);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(textFieldSelectionState22222);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final TextFieldSelectionState textFieldSelectionState222222 = TextFieldSelectionState.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            TextFieldSelectionState.this.dispose();
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(textFieldSelectionState22222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
            modifier3 = modifier522222;
            Modifier pointerHoverIcon$default22222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier3.then(new TextFieldDecoratorModifier(transformedTextFieldState22222, textLayoutState22222, textFieldSelectionState22222, inputTransformation2, z4, z5, keyboardOptions2, keyboardActionHandler522222, areEqual22222, mutableInteractionSource722222)), z4, mutableInteractionSource722222), scrollState2, orientation22222, !z4 && textFieldSelectionState22222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection22222, orientation22222, false), null, mutableInteractionSource722222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, pointerHoverIcon$default22222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl.getInserting()) {
            }
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
            final TextFieldDecorator textFieldDecorator422222 = textFieldDecorator2;
            final TextFieldLineLimits textFieldLineLimits622222 = textFieldLineLimits3;
            final TextStyle textStyle322222 = textStyle2;
            final boolean z1422222 = z4;
            final boolean z1522222 = z5;
            final ScrollState scrollState422222 = scrollState2;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState22222, z4, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                public final void invoke(Composer composer2, int i26) {
                    ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                    if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-673241599, i26, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                        }
                        TextFieldDecorator textFieldDecorator5 = TextFieldDecorator.this;
                        if (textFieldDecorator5 == null) {
                            textFieldDecorator5 = BasicTextFieldKt.DefaultTextFieldDecorator;
                        }
                        final TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits622222;
                        final TextLayoutState textLayoutState222222 = textLayoutState22222;
                        final TextStyle textStyle42 = textStyle322222;
                        final boolean z16 = booleanValue32222;
                        final boolean z17 = isWindowFocused22222;
                        final boolean z18 = booleanValue222222;
                        final TransformedTextFieldState transformedTextFieldState222222 = transformedTextFieldState22222;
                        final TextFieldSelectionState textFieldSelectionState222222 = textFieldSelectionState22222;
                        final Brush brush5 = brush422222;
                        final boolean z19 = z1422222;
                        final boolean z20 = z1522222;
                        final ScrollState scrollState5 = scrollState422222;
                        TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                        final Orientation orientation222222 = orientation22222;
                        final boolean z21 = areEqual22222;
                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function2522222;
                        textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i27) {
                                int i28;
                                int i29;
                                ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                                if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1969169726, i27, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                    }
                                    TextFieldLineLimits textFieldLineLimits8 = TextFieldLineLimits.this;
                                    if (textFieldLineLimits8 instanceof TextFieldLineLimits.MultiLine) {
                                        i28 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits8).getMinHeightInLines();
                                        i29 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                    } else {
                                        i28 = 1;
                                        i29 = 1;
                                    }
                                    Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState222222.m1215getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i28, i29), textStyle42)).then(new TextFieldCoreModifier(z16 && z17, z18, textLayoutState222222, transformedTextFieldState222222, textFieldSelectionState222222, brush5, z19 && !z20, scrollState5, orientation222222));
                                    TextLayoutState textLayoutState3 = textLayoutState222222;
                                    TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState222222;
                                    TextStyle textStyle5 = textStyle42;
                                    boolean z22 = z21;
                                    Function2<Density, Function0<TextLayoutResult>, Unit> function27 = function26;
                                    boolean z23 = z19;
                                    boolean z24 = z16;
                                    boolean z25 = z17;
                                    TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState222222;
                                    boolean z26 = z20;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap222222 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(composer3, then);
                                    Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor222222);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                    Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                    BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState3.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState3, textStyle5, z22, function27)), composer3, 0);
                                    if (z23 && z24 && z25 && textFieldSelectionState3.isInTouchMode()) {
                                        composer3.startReplaceGroup(-1325530694);
                                        ComposerKt.sourceInformation(composer3, "398@20188L121");
                                        BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState3, composer3, 0);
                                        if (!z26) {
                                            composer3.startReplaceGroup(-1325351669);
                                            ComposerKt.sourceInformation(composer3, "402@20379L125");
                                            BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState3, composer3, 0);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(-1325177728);
                                            composer3.endReplaceGroup();
                                        }
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-1325155904);
                                        composer3.endReplaceGroup();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            brush3 = brush422222;
            mutableInteractionSource4 = mutableInteractionSource3;
            textFieldLineLimits4 = textFieldLineLimits3;
            z8 = z4;
            scrollState3 = scrollState2;
            z9 = z6;
            textFieldDecorator3 = textFieldDecorator2;
            keyboardOptions3 = keyboardOptions2;
            outputTransformation3 = outputTransformation522222;
            codepointTransformation3 = codepointTransformation422222;
            keyboardActionHandler3 = keyboardActionHandler522222;
            inputTransformation3 = inputTransformation2;
            z10 = z5;
            function23 = function2522222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        int i252222 = i14;
        i16 = i3 & 4096;
        if (i16 != 0) {
        }
        i17 = i3 & 8192;
        if (i17 == 0) {
        }
        i19 = i3 & 16384;
        if (i19 != 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i21 = i3 & 65536;
        if (i21 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i24 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i20 != 0) {
        }
        Modifier modifier4222222 = companion;
        if ((i3 & 32768) != 0) {
        }
        modifier2 = modifier4222222;
        i22 = i252222;
        outputTransformation2 = outputTransformation4;
        if (i21 != 0) {
        }
        brush2 = cursorBrush;
        mutableInteractionSource2 = mutableInteractionSource5;
        function22 = function24;
        textFieldLineLimits2 = textFieldLineLimits5;
        keyboardActionHandler2 = keyboardActionHandler4;
        inputTransformation2 = inputTransformation4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25222222 = function22;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume722222 = startRestartGroup.consume(localDensity222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density222222 = (Density) consume722222;
        final Brush brush4222222 = brush2;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222222 = startRestartGroup.consume(localLayoutDirection222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222222 = (LayoutDirection) consume2222222;
        ProvidableCompositionLocal<WindowInfo> localWindowInfo222222 = CompositionLocalsKt.getLocalWindowInfo();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3222222 = startRestartGroup.consume(localWindowInfo222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        WindowInfo windowInfo222222 = (WindowInfo) consume3222222;
        final boolean areEqual222222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
        if (mutableInteractionSource2 == null) {
        }
        startRestartGroup.endReplaceGroup();
        final Orientation orientation222222 = areEqual222222 ? Orientation.Horizontal : Orientation.Vertical;
        MutableInteractionSource mutableInteractionSource6222222 = mutableInteractionSource2;
        Modifier modifier5222222 = modifier2;
        final boolean booleanValue322222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource6222222, startRestartGroup, 0).getValue().booleanValue();
        final boolean booleanValue2222222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource6222222, startRestartGroup, 0).getValue().booleanValue();
        final boolean isWindowFocused222222 = windowInfo222222.isWindowFocused();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
        MutableInteractionSource mutableInteractionSource7222222 = mutableInteractionSource2;
        z7 = ((i4 & 14) == 4) | ((i22 & 896) == 256) | ((i22 & 7168) == 2048);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z7) {
        }
        if (codepointTransformation2 == null) {
        }
        rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final TransformedTextFieldState transformedTextFieldState222222 = (TransformedTextFieldState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
        changed = startRestartGroup.changed(transformedTextFieldState222222);
        OutputTransformation outputTransformation5222222 = outputTransformation2;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new TextLayoutState();
        startRestartGroup.updateRememberedValue(rememberedValue2);
        final TextLayoutState textLayoutState222222 = (TextLayoutState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
        changed2 = startRestartGroup.changed(transformedTextFieldState222222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState222222, textLayoutState222222, density222222, z4, z5, !booleanValue322222 && isWindowFocused222222, z6);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        final TextFieldSelectionState textFieldSelectionState222222 = (TextFieldSelectionState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222222 = CompositionLocalsKt.getLocalHapticFeedback();
        CodepointTransformation codepointTransformation4222222 = codepointTransformation2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume4222222 = startRestartGroup.consume(localHapticFeedback222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final HapticFeedback hapticFeedback222222 = (HapticFeedback) consume4222222;
        ProvidableCompositionLocal<ClipboardManager> localClipboardManager222222 = CompositionLocalsKt.getLocalClipboardManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222222 = startRestartGroup.consume(localClipboardManager222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final ClipboardManager clipboardManager222222 = (ClipboardManager) consume5222222;
        KeyboardActionHandler keyboardActionHandler5222222 = keyboardActionHandler2;
        ProvidableCompositionLocal<TextToolbar> localTextToolbar222222 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume6222222 = startRestartGroup.consume(localTextToolbar222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TextToolbar textToolbar222222 = (TextToolbar) consume6222222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
        changed3 = ((57344 & i4) == 16384) | startRestartGroup.changed(transformedTextFieldState222222) | startRestartGroup.changedInstance(textFieldSelectionState222222) | startRestartGroup.changedInstance(hapticFeedback222222) | startRestartGroup.changedInstance(clipboardManager222222) | startRestartGroup.changedInstance(textToolbar222222) | startRestartGroup.changed(density222222) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((3670016 & i22) == 1048576);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        final InputTransformation inputTransformation5222222 = inputTransformation2;
        final boolean z11222222 = z4;
        final boolean z12222222 = z5;
        final boolean z13222222 = z6;
        rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TransformedTextFieldState.this.update(inputTransformation5222222);
                textFieldSelectionState222222.update(hapticFeedback222222, clipboardManager222222, textToolbar222222, density222222, z11222222, z12222222, z13222222);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
        changedInstance = startRestartGroup.changedInstance(textFieldSelectionState222222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                final TextFieldSelectionState textFieldSelectionState2222222 = TextFieldSelectionState.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        TextFieldSelectionState.this.dispose();
                    }
                };
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.DisposableEffect(textFieldSelectionState222222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
        modifier3 = modifier5222222;
        Modifier pointerHoverIcon$default222222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier3.then(new TextFieldDecoratorModifier(transformedTextFieldState222222, textLayoutState222222, textFieldSelectionState222222, inputTransformation2, z4, z5, keyboardOptions2, keyboardActionHandler5222222, areEqual222222, mutableInteractionSource7222222)), z4, mutableInteractionSource7222222), scrollState2, orientation222222, !z4 && textFieldSelectionState222222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection222222, orientation222222, false), null, mutableInteractionSource7222222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, pointerHoverIcon$default222222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
        final TextFieldDecorator textFieldDecorator4222222 = textFieldDecorator2;
        final TextFieldLineLimits textFieldLineLimits6222222 = textFieldLineLimits3;
        final TextStyle textStyle3222222 = textStyle2;
        final boolean z14222222 = z4;
        final boolean z15222222 = z5;
        final ScrollState scrollState4222222 = scrollState2;
        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState222222, z4, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

            public final void invoke(Composer composer2, int i26) {
                ComposerKt.sourceInformation(composer2, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                if ((i26 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-673241599, i26, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                    }
                    TextFieldDecorator textFieldDecorator5 = TextFieldDecorator.this;
                    if (textFieldDecorator5 == null) {
                        textFieldDecorator5 = BasicTextFieldKt.DefaultTextFieldDecorator;
                    }
                    final TextFieldLineLimits textFieldLineLimits7 = textFieldLineLimits6222222;
                    final TextLayoutState textLayoutState2222222 = textLayoutState222222;
                    final TextStyle textStyle42 = textStyle3222222;
                    final boolean z16 = booleanValue322222;
                    final boolean z17 = isWindowFocused222222;
                    final boolean z18 = booleanValue2222222;
                    final TransformedTextFieldState transformedTextFieldState2222222 = transformedTextFieldState222222;
                    final TextFieldSelectionState textFieldSelectionState2222222 = textFieldSelectionState222222;
                    final Brush brush5 = brush4222222;
                    final boolean z19 = z14222222;
                    final boolean z20 = z15222222;
                    final ScrollState scrollState5 = scrollState4222222;
                    TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                    final Orientation orientation2222222 = orientation222222;
                    final boolean z21 = areEqual222222;
                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function26 = function25222222;
                    textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i27) {
                            int i28;
                            int i29;
                            ComposerKt.sourceInformation(composer3, "C356@18098L2472:BasicTextField.kt#423gt5");
                            if ((i27 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1969169726, i27, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                }
                                TextFieldLineLimits textFieldLineLimits8 = TextFieldLineLimits.this;
                                if (textFieldLineLimits8 instanceof TextFieldLineLimits.MultiLine) {
                                    i28 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits8).getMinHeightInLines();
                                    i29 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                } else {
                                    i28 = 1;
                                    i29 = 1;
                                }
                                Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState2222222.m1215getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle42, i28, i29), textStyle42)).then(new TextFieldCoreModifier(z16 && z17, z18, textLayoutState2222222, transformedTextFieldState2222222, textFieldSelectionState2222222, brush5, z19 && !z20, scrollState5, orientation2222222));
                                TextLayoutState textLayoutState3 = textLayoutState2222222;
                                TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState2222222;
                                TextStyle textStyle5 = textStyle42;
                                boolean z22 = z21;
                                Function2<Density, Function0<TextLayoutResult>, Unit> function27 = function26;
                                boolean z23 = z19;
                                boolean z24 = z16;
                                boolean z25 = z17;
                                TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2222222;
                                boolean z26 = z20;
                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2222222 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(composer3, then);
                                Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2222222);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
                                }
                                Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState3.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState3, textStyle5, z22, function27)), composer3, 0);
                                if (z23 && z24 && z25 && textFieldSelectionState3.isInTouchMode()) {
                                    composer3.startReplaceGroup(-1325530694);
                                    ComposerKt.sourceInformation(composer3, "398@20188L121");
                                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState3, composer3, 0);
                                    if (!z26) {
                                        composer3.startReplaceGroup(-1325351669);
                                        ComposerKt.sourceInformation(composer3, "402@20379L125");
                                        BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState3, composer3, 0);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-1325177728);
                                        composer3.endReplaceGroup();
                                    }
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1325155904);
                                    composer3.endReplaceGroup();
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 112) | 384);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        brush3 = brush4222222;
        mutableInteractionSource4 = mutableInteractionSource3;
        textFieldLineLimits4 = textFieldLineLimits3;
        z8 = z4;
        scrollState3 = scrollState2;
        z9 = z6;
        textFieldDecorator3 = textFieldDecorator2;
        keyboardOptions3 = keyboardOptions2;
        outputTransformation3 = outputTransformation5222222;
        codepointTransformation3 = codepointTransformation4222222;
        keyboardActionHandler3 = keyboardActionHandler5222222;
        inputTransformation3 = inputTransformation2;
        z10 = z5;
        function23 = function25222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1991581797);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)416@20789L124:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425876736, "CC(remember):BasicTextField.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getCursorHandleState$foundation_release(false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (TextFieldCursorHandle$lambda$9((State) rememberedValue).getVisible()) {
                startRestartGroup.startReplaceGroup(-317108348);
                ComposerKt.sourceInformation(startRestartGroup, "423@21002L142,429@21224L87,422@20959L426");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425869902, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo971provideF1C5BW0() {
                            return TextFieldSelectionState.this.getCursorHandleState$foundation_release(true).m1244getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425862853, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldCursorHandle$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidCursorHandle_androidKt.m967CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3), MinTouchTargetSizeForHandles, startRestartGroup, 384, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-316683586);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    BasicTextFieldKt.TextFieldCursorHandle(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2025287684);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldSelectionHandles)442@21589L149,465@22467L150:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i2, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:440)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983345958, "CC(remember):BasicTextField.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(true, false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (TextFieldSelectionHandles$lambda$13(state).getVisible()) {
                startRestartGroup.startReplaceGroup(-1353986043);
                ComposerKt.sourceInformation(startRestartGroup, "449@21829L167,457@22207L86,448@21783L584");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983338260, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo971provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(true, true).m1244getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$13(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$13(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983326245, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidSelectionHandles_androidKt.m1323SelectionHandlepzduO1o(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1353409443);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983317861, "CC(remember):BasicTextField.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(false, false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            State state2 = (State) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (TextFieldSelectionHandles$lambda$17(state2).getVisible()) {
                startRestartGroup.startReplaceGroup(-1353116090);
                ComposerKt.sourceInformation(startRestartGroup, "472@22706L168,480@23082L87,471@22660L583");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983310195, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo971provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(false, true).m1244getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$17(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$17(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983298244, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance4 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$4$1 rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new BasicTextFieldKt$TextFieldSelectionHandles$4$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidSelectionHandles_androidKt.m1323SelectionHandlepzduO1o(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1352540451);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    BasicTextFieldKt.TextFieldSelectionHandles(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float f = 40;
        MinTouchTargetSizeForHandles = DpKt.m6321DpSizeYgX7TsA(Dp.m6299constructorimpl(f), Dp.m6299constructorimpl(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
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
        int i18;
        int i19;
        Modifier.Companion companion;
        boolean z4;
        int i20;
        boolean z5;
        int i21;
        KeyboardActions keyboardActions2;
        SolidColor solidColor;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        Brush brush2;
        int i22;
        Function1<? super TextLayoutResult, Unit> function13;
        MutableInteractionSource mutableInteractionSource2;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions3;
        int i23;
        VisualTransformation visualTransformation2;
        boolean z7;
        int i24;
        Object rememberedValue;
        boolean z8;
        boolean changed;
        Object rememberedValue2;
        boolean z9;
        Object rememberedValue3;
        boolean changed2;
        Object obj;
        KeyboardOptions keyboardOptions3;
        int i25;
        boolean z10;
        KeyboardActions keyboardActions4;
        VisualTransformation visualTransformation3;
        Function1<? super TextLayoutResult, Unit> function14;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        boolean z11;
        int i26;
        boolean z12;
        TextStyle textStyle3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i27;
        Composer startRestartGroup = composer.startRestartGroup(945255183);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)614@31167L57,620@31520L216,620@31509L227,629@32057L41,633@32175L373,631@32104L1032:BasicTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i28 = i5 & 4;
        if (i28 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i6 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                            i27 = 536870912;
                            i6 |= i27;
                        }
                        i27 = 268435456;
                        i6 |= i27;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i14 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i14 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i4;
                    }
                    i15 = i5 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i4 & 48) == 0) {
                        i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                    }
                    int i29 = i14;
                    i16 = i5 & 4096;
                    if (i16 == 0) {
                        i29 |= 384;
                    } else if ((i4 & 384) == 0) {
                        i29 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                        i17 = i5 & 8192;
                        if (i17 != 0) {
                            i29 |= 3072;
                        } else if ((i4 & 3072) == 0) {
                            i29 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                            i18 = i5 & 16384;
                            if (i18 == 0) {
                                i29 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i29 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                                i19 = i5 & 32768;
                                if (i19 != 0) {
                                    i29 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i29 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                                }
                                if ((i6 & 306783379) == 306783378 || (74899 & i29) != 74898 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        companion = i28 != 0 ? Modifier.INSTANCE : modifier;
                                        z4 = i7 != 0 ? true : z;
                                        boolean z13 = i8 != 0 ? false : z2;
                                        TextStyle textStyle4 = i9 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                        KeyboardOptions keyboardOptions4 = i10 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        KeyboardActions keyboardActions5 = i11 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        boolean z14 = i12 != 0 ? false : z3;
                                        if ((i5 & 512) != 0) {
                                            i20 = z14 ? 1 : Integer.MAX_VALUE;
                                            i6 &= -1879048193;
                                        } else {
                                            i20 = i;
                                        }
                                        int i30 = i13 != 0 ? 1 : i2;
                                        VisualTransformation none = i15 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        BasicTextFieldKt$BasicTextField$6 basicTextFieldKt$BasicTextField$6 = i16 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function12;
                                        MutableInteractionSource mutableInteractionSource3 = i17 != 0 ? null : mutableInteractionSource;
                                        if (i18 != 0) {
                                            i21 = i6;
                                            keyboardActions2 = keyboardActions5;
                                            z5 = z14;
                                            solidColor = new SolidColor(Color.INSTANCE.m3866getBlack0d7_KjU(), null);
                                        } else {
                                            z5 = z14;
                                            i21 = i6;
                                            keyboardActions2 = keyboardActions5;
                                            solidColor = brush;
                                        }
                                        if (i19 != 0) {
                                            brush2 = solidColor;
                                            function32 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m987getLambda1$foundation_release();
                                        } else {
                                            function32 = function3;
                                            brush2 = solidColor;
                                        }
                                        i22 = i30;
                                        function13 = basicTextFieldKt$BasicTextField$6;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        z6 = z13;
                                        textStyle2 = textStyle4;
                                        keyboardOptions2 = keyboardOptions4;
                                        keyboardActions3 = keyboardActions2;
                                        i23 = i21;
                                        visualTransformation2 = none;
                                        z7 = z5;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 512) != 0) {
                                            i6 &= -1879048193;
                                        }
                                        companion = modifier;
                                        z4 = z;
                                        z6 = z2;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions3 = keyboardActions;
                                        z7 = z3;
                                        i20 = i;
                                        i22 = i2;
                                        visualTransformation2 = visualTransformation;
                                        function13 = function12;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush2 = brush;
                                        function32 = function3;
                                        i23 = i6;
                                        textStyle2 = textStyle;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        i24 = i20;
                                        ComposerKt.traceEventStart(945255183, i23, i29, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:611)");
                                    } else {
                                        i24 = i20;
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243232097, "CC(remember):BasicTextField.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        z8 = z6;
                                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        z8 = z6;
                                    }
                                    final MutableState mutableState = (MutableState) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final TextFieldValue m6027copy3r_uNRQ$default = TextFieldValue.m6027copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220642, "CC(remember):BasicTextField.kt#9igjgp");
                                    changed = startRestartGroup.changed(m6027copy3r_uNRQ$default);
                                    boolean z15 = z4;
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                TextFieldValue BasicTextField$lambda$21;
                                                TextFieldValue BasicTextField$lambda$212;
                                                long selection = TextFieldValue.this.getSelection();
                                                BasicTextField$lambda$21 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState);
                                                if (TextRange.m5777equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                                                    TextRange composition = TextFieldValue.this.getComposition();
                                                    BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState);
                                                    if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                                        return;
                                                    }
                                                }
                                                mutableState.setValue(TextFieldValue.this);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203633, "CC(remember):BasicTextField.kt#9igjgp");
                                    z9 = (i23 & 14) == 4;
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!z9 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    final MutableState mutableState2 = (MutableState) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                                    boolean z16 = !z7;
                                    int i31 = z7 ? 1 : i22;
                                    int i32 = z7 ? 1 : i24;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199525, "CC(remember):BasicTextField.kt#9igjgp");
                                    KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                    changed2 = startRestartGroup.changed(mutableState2) | ((i23 & 112) == 32);
                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        obj = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                                invoke2(textFieldValue);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextFieldValue textFieldValue) {
                                                String BasicTextField$lambda$25;
                                                mutableState.setValue(textFieldValue);
                                                BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25(mutableState2);
                                                boolean z17 = !Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                                                mutableState2.setValue(textFieldValue.getText());
                                                if (z17) {
                                                    function1.invoke(textFieldValue.getText());
                                                }
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(obj);
                                    } else {
                                        obj = rememberedValue4;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i33 = i29 << 9;
                                    CoreTextFieldKt.CoreTextField(m6027copy3r_uNRQ$default, (Function1) obj, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z16, i32, i31, imeOptions$foundation_release, keyboardActions3, z15, z8, function32, startRestartGroup, (i23 & 896) | ((i23 >> 6) & 7168) | (57344 & i33) | (458752 & i33) | (3670016 & i33) | (i33 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | (i29 & 458752), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    keyboardOptions3 = keyboardOptions5;
                                    i25 = i22;
                                    z10 = z8;
                                    keyboardActions4 = keyboardActions3;
                                    visualTransformation3 = visualTransformation2;
                                    function14 = function13;
                                    function33 = function32;
                                    z11 = z15;
                                    i26 = i24;
                                    z12 = z7;
                                    textStyle3 = textStyle2;
                                    modifier2 = companion;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    z11 = z;
                                    z10 = z2;
                                    textStyle3 = textStyle;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions4 = keyboardActions;
                                    z12 = z3;
                                    i26 = i;
                                    i25 = i2;
                                    visualTransformation3 = visualTransformation;
                                    function14 = function12;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    function33 = function3;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Modifier modifier3 = modifier2;
                                    final boolean z17 = z11;
                                    final boolean z18 = z10;
                                    final TextStyle textStyle5 = textStyle3;
                                    final KeyboardOptions keyboardOptions6 = keyboardOptions3;
                                    final KeyboardActions keyboardActions6 = keyboardActions4;
                                    final boolean z19 = z12;
                                    final int i34 = i26;
                                    final int i35 = i25;
                                    final VisualTransformation visualTransformation4 = visualTransformation3;
                                    final Function1<? super TextLayoutResult, Unit> function15 = function14;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final Brush brush3 = brush2;
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
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

                                        public final void invoke(Composer composer2, int i36) {
                                            BasicTextFieldKt.BasicTextField(str, function1, modifier3, z17, z18, textStyle5, keyboardOptions6, keyboardActions6, z19, i34, i35, visualTransformation4, function15, mutableInteractionSource4, brush3, function33, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i19 = i5 & 32768;
                            if (i19 != 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i28 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if ((i5 & 512) != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            i22 = i30;
                            function13 = basicTextFieldKt$BasicTextField$6;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z6 = z13;
                            textStyle2 = textStyle4;
                            keyboardOptions2 = keyboardOptions4;
                            keyboardActions3 = keyboardActions2;
                            i23 = i21;
                            visualTransformation2 = none;
                            z7 = z5;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243232097, "CC(remember):BasicTextField.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final MutableState<TextFieldValue> mutableState3 = (MutableState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final TextFieldValue m6027copy3r_uNRQ$default2 = TextFieldValue.m6027copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState3), str, 0L, (TextRange) null, 6, (Object) null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220642, "CC(remember):BasicTextField.kt#9igjgp");
                            changed = startRestartGroup.changed(m6027copy3r_uNRQ$default2);
                            boolean z152 = z4;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    TextFieldValue BasicTextField$lambda$21;
                                    TextFieldValue BasicTextField$lambda$212;
                                    long selection = TextFieldValue.this.getSelection();
                                    BasicTextField$lambda$21 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState3);
                                    if (TextRange.m5777equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                                        TextRange composition = TextFieldValue.this.getComposition();
                                        BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState3);
                                        if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                            return;
                                        }
                                    }
                                    mutableState3.setValue(TextFieldValue.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203633, "CC(remember):BasicTextField.kt#9igjgp");
                            if ((i23 & 14) == 4) {
                            }
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z9) {
                            }
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            final MutableState<String> mutableState22 = (MutableState) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z162 = !z7;
                            if (z7) {
                            }
                            if (z7) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199525, "CC(remember):BasicTextField.kt#9igjgp");
                            KeyboardOptions keyboardOptions52 = keyboardOptions2;
                            changed2 = startRestartGroup.changed(mutableState22) | ((i23 & 112) == 32);
                            Object rememberedValue42 = startRestartGroup.rememberedValue();
                            if (changed2) {
                            }
                            obj = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                    invoke2(textFieldValue);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldValue textFieldValue) {
                                    String BasicTextField$lambda$25;
                                    mutableState3.setValue(textFieldValue);
                                    BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25(mutableState22);
                                    boolean z172 = !Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                                    mutableState22.setValue(textFieldValue.getText());
                                    if (z172) {
                                        function1.invoke(textFieldValue.getText());
                                    }
                                }
                            };
                            startRestartGroup.updateRememberedValue(obj);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i332 = i29 << 9;
                            CoreTextFieldKt.CoreTextField(m6027copy3r_uNRQ$default2, (Function1) obj, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z162, i32, i31, imeOptions$foundation_release2, keyboardActions3, z152, z8, function32, startRestartGroup, (i23 & 896) | ((i23 >> 6) & 7168) | (57344 & i332) | (458752 & i332) | (3670016 & i332) | (i332 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | (i29 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            keyboardOptions3 = keyboardOptions52;
                            i25 = i22;
                            z10 = z8;
                            keyboardActions4 = keyboardActions3;
                            visualTransformation3 = visualTransformation2;
                            function14 = function13;
                            function33 = function32;
                            z11 = z152;
                            i26 = i24;
                            z12 = z7;
                            textStyle3 = textStyle2;
                            modifier2 = companion;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i18 = i5 & 16384;
                        if (i18 == 0) {
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i28 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if ((i5 & 512) != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        i22 = i30;
                        function13 = basicTextFieldKt$BasicTextField$6;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        z6 = z13;
                        textStyle2 = textStyle4;
                        keyboardOptions2 = keyboardOptions4;
                        keyboardActions3 = keyboardActions2;
                        i23 = i21;
                        visualTransformation2 = none;
                        z7 = z5;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243232097, "CC(remember):BasicTextField.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState<TextFieldValue> mutableState32 = (MutableState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final TextFieldValue m6027copy3r_uNRQ$default22 = TextFieldValue.m6027copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState32), str, 0L, (TextRange) null, 6, (Object) null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220642, "CC(remember):BasicTextField.kt#9igjgp");
                        changed = startRestartGroup.changed(m6027copy3r_uNRQ$default22);
                        boolean z1522 = z4;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                TextFieldValue BasicTextField$lambda$21;
                                TextFieldValue BasicTextField$lambda$212;
                                long selection = TextFieldValue.this.getSelection();
                                BasicTextField$lambda$21 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState32);
                                if (TextRange.m5777equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                                    TextRange composition = TextFieldValue.this.getComposition();
                                    BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState32);
                                    if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                        return;
                                    }
                                }
                                mutableState32.setValue(TextFieldValue.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203633, "CC(remember):BasicTextField.kt#9igjgp");
                        if ((i23 & 14) == 4) {
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z9) {
                        }
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        final MutableState<String> mutableState222 = (MutableState) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
                        boolean z1622 = !z7;
                        if (z7) {
                        }
                        if (z7) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199525, "CC(remember):BasicTextField.kt#9igjgp");
                        KeyboardOptions keyboardOptions522 = keyboardOptions2;
                        changed2 = startRestartGroup.changed(mutableState222) | ((i23 & 112) == 32);
                        Object rememberedValue422 = startRestartGroup.rememberedValue();
                        if (changed2) {
                        }
                        obj = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                invoke2(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldValue textFieldValue) {
                                String BasicTextField$lambda$25;
                                mutableState32.setValue(textFieldValue);
                                BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25(mutableState222);
                                boolean z172 = !Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                                mutableState222.setValue(textFieldValue.getText());
                                if (z172) {
                                    function1.invoke(textFieldValue.getText());
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(obj);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i3322 = i29 << 9;
                        CoreTextFieldKt.CoreTextField(m6027copy3r_uNRQ$default22, (Function1) obj, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z1622, i32, i31, imeOptions$foundation_release22, keyboardActions3, z1522, z8, function32, startRestartGroup, (i23 & 896) | ((i23 >> 6) & 7168) | (57344 & i3322) | (458752 & i3322) | (3670016 & i3322) | (i3322 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | (i29 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        keyboardOptions3 = keyboardOptions522;
                        i25 = i22;
                        z10 = z8;
                        keyboardActions4 = keyboardActions3;
                        visualTransformation3 = visualTransformation2;
                        function14 = function13;
                        function33 = function32;
                        z11 = z1522;
                        i26 = i24;
                        z12 = z7;
                        textStyle3 = textStyle2;
                        modifier2 = companion;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i5 & 8192;
                    if (i17 != 0) {
                    }
                    i18 = i5 & 16384;
                    if (i18 == 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i5 & 512) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    i22 = i30;
                    function13 = basicTextFieldKt$BasicTextField$6;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    z6 = z13;
                    textStyle2 = textStyle4;
                    keyboardOptions2 = keyboardOptions4;
                    keyboardActions3 = keyboardActions2;
                    i23 = i21;
                    visualTransformation2 = none;
                    z7 = z5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243232097, "CC(remember):BasicTextField.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState<TextFieldValue> mutableState322 = (MutableState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TextFieldValue m6027copy3r_uNRQ$default222 = TextFieldValue.m6027copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState322), str, 0L, (TextRange) null, 6, (Object) null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220642, "CC(remember):BasicTextField.kt#9igjgp");
                    changed = startRestartGroup.changed(m6027copy3r_uNRQ$default222);
                    boolean z15222 = z4;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            TextFieldValue BasicTextField$lambda$21;
                            TextFieldValue BasicTextField$lambda$212;
                            long selection = TextFieldValue.this.getSelection();
                            BasicTextField$lambda$21 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState322);
                            if (TextRange.m5777equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                                TextRange composition = TextFieldValue.this.getComposition();
                                BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState322);
                                if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                    return;
                                }
                            }
                            mutableState322.setValue(TextFieldValue.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203633, "CC(remember):BasicTextField.kt#9igjgp");
                    if ((i23 & 14) == 4) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z9) {
                    }
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    final MutableState<String> mutableState2222 = (MutableState) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
                    boolean z16222 = !z7;
                    if (z7) {
                    }
                    if (z7) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199525, "CC(remember):BasicTextField.kt#9igjgp");
                    KeyboardOptions keyboardOptions5222 = keyboardOptions2;
                    changed2 = startRestartGroup.changed(mutableState2222) | ((i23 & 112) == 32);
                    Object rememberedValue4222 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    obj = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                            invoke2(textFieldValue);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextFieldValue textFieldValue) {
                            String BasicTextField$lambda$25;
                            mutableState322.setValue(textFieldValue);
                            BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25(mutableState2222);
                            boolean z172 = !Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                            mutableState2222.setValue(textFieldValue.getText());
                            if (z172) {
                                function1.invoke(textFieldValue.getText());
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(obj);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i33222 = i29 << 9;
                    CoreTextFieldKt.CoreTextField(m6027copy3r_uNRQ$default222, (Function1) obj, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z16222, i32, i31, imeOptions$foundation_release222, keyboardActions3, z15222, z8, function32, startRestartGroup, (i23 & 896) | ((i23 >> 6) & 7168) | (57344 & i33222) | (458752 & i33222) | (3670016 & i33222) | (i33222 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | (i29 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    keyboardOptions3 = keyboardOptions5222;
                    i25 = i22;
                    z10 = z8;
                    keyboardActions4 = keyboardActions3;
                    visualTransformation3 = visualTransformation2;
                    function14 = function13;
                    function33 = function32;
                    z11 = z15222;
                    i26 = i24;
                    z12 = z7;
                    textStyle3 = textStyle2;
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                i15 = i5 & 2048;
                if (i15 == 0) {
                }
                int i292 = i14;
                i16 = i5 & 4096;
                if (i16 == 0) {
                }
                i17 = i5 & 8192;
                if (i17 != 0) {
                }
                i18 = i5 & 16384;
                if (i18 == 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i28 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 512) != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                i22 = i30;
                function13 = basicTextFieldKt$BasicTextField$6;
                mutableInteractionSource2 = mutableInteractionSource3;
                z6 = z13;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                keyboardActions3 = keyboardActions2;
                i23 = i21;
                visualTransformation2 = none;
                z7 = z5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243232097, "CC(remember):BasicTextField.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState<TextFieldValue> mutableState3222 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TextFieldValue m6027copy3r_uNRQ$default2222 = TextFieldValue.m6027copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState3222), str, 0L, (TextRange) null, 6, (Object) null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220642, "CC(remember):BasicTextField.kt#9igjgp");
                changed = startRestartGroup.changed(m6027copy3r_uNRQ$default2222);
                boolean z152222 = z4;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextFieldValue BasicTextField$lambda$21;
                        TextFieldValue BasicTextField$lambda$212;
                        long selection = TextFieldValue.this.getSelection();
                        BasicTextField$lambda$21 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState3222);
                        if (TextRange.m5777equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                            TextRange composition = TextFieldValue.this.getComposition();
                            BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState3222);
                            if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                return;
                            }
                        }
                        mutableState3222.setValue(TextFieldValue.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203633, "CC(remember):BasicTextField.kt#9igjgp");
                if ((i23 & 14) == 4) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z9) {
                }
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                final MutableState<String> mutableState22222 = (MutableState) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ImeOptions imeOptions$foundation_release2222 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z162222 = !z7;
                if (z7) {
                }
                if (z7) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199525, "CC(remember):BasicTextField.kt#9igjgp");
                KeyboardOptions keyboardOptions52222 = keyboardOptions2;
                changed2 = startRestartGroup.changed(mutableState22222) | ((i23 & 112) == 32);
                Object rememberedValue42222 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                obj = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue) {
                        String BasicTextField$lambda$25;
                        mutableState3222.setValue(textFieldValue);
                        BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25(mutableState22222);
                        boolean z172 = !Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                        mutableState22222.setValue(textFieldValue.getText());
                        if (z172) {
                            function1.invoke(textFieldValue.getText());
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i332222 = i292 << 9;
                CoreTextFieldKt.CoreTextField(m6027copy3r_uNRQ$default2222, (Function1) obj, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z162222, i32, i31, imeOptions$foundation_release2222, keyboardActions3, z152222, z8, function32, startRestartGroup, (i23 & 896) | ((i23 >> 6) & 7168) | (57344 & i332222) | (458752 & i332222) | (3670016 & i332222) | (i332222 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | (i292 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                keyboardOptions3 = keyboardOptions52222;
                i25 = i22;
                z10 = z8;
                keyboardActions4 = keyboardActions3;
                visualTransformation3 = visualTransformation2;
                function14 = function13;
                function33 = function32;
                z11 = z152222;
                i26 = i24;
                z12 = z7;
                textStyle3 = textStyle2;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            i15 = i5 & 2048;
            if (i15 == 0) {
            }
            int i2922 = i14;
            i16 = i5 & 4096;
            if (i16 == 0) {
            }
            i17 = i5 & 8192;
            if (i17 != 0) {
            }
            i18 = i5 & 16384;
            if (i18 == 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i28 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 512) != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            i22 = i30;
            function13 = basicTextFieldKt$BasicTextField$6;
            mutableInteractionSource2 = mutableInteractionSource3;
            z6 = z13;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            keyboardActions3 = keyboardActions2;
            i23 = i21;
            visualTransformation2 = none;
            z7 = z5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243232097, "CC(remember):BasicTextField.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<TextFieldValue> mutableState32222 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextFieldValue m6027copy3r_uNRQ$default22222 = TextFieldValue.m6027copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState32222), str, 0L, (TextRange) null, 6, (Object) null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220642, "CC(remember):BasicTextField.kt#9igjgp");
            changed = startRestartGroup.changed(m6027copy3r_uNRQ$default22222);
            boolean z1522222 = z4;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldValue BasicTextField$lambda$21;
                    TextFieldValue BasicTextField$lambda$212;
                    long selection = TextFieldValue.this.getSelection();
                    BasicTextField$lambda$21 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState32222);
                    if (TextRange.m5777equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                        TextRange composition = TextFieldValue.this.getComposition();
                        BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState32222);
                        if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                            return;
                        }
                    }
                    mutableState32222.setValue(TextFieldValue.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203633, "CC(remember):BasicTextField.kt#9igjgp");
            if ((i23 & 14) == 4) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z9) {
            }
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            final MutableState<String> mutableState222222 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImeOptions imeOptions$foundation_release22222 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z1622222 = !z7;
            if (z7) {
            }
            if (z7) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199525, "CC(remember):BasicTextField.kt#9igjgp");
            KeyboardOptions keyboardOptions522222 = keyboardOptions2;
            changed2 = startRestartGroup.changed(mutableState222222) | ((i23 & 112) == 32);
            Object rememberedValue422222 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            obj = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                    invoke2(textFieldValue);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextFieldValue textFieldValue) {
                    String BasicTextField$lambda$25;
                    mutableState32222.setValue(textFieldValue);
                    BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25(mutableState222222);
                    boolean z172 = !Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                    mutableState222222.setValue(textFieldValue.getText());
                    if (z172) {
                        function1.invoke(textFieldValue.getText());
                    }
                }
            };
            startRestartGroup.updateRememberedValue(obj);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3322222 = i2922 << 9;
            CoreTextFieldKt.CoreTextField(m6027copy3r_uNRQ$default22222, (Function1) obj, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z1622222, i32, i31, imeOptions$foundation_release22222, keyboardActions3, z1522222, z8, function32, startRestartGroup, (i23 & 896) | ((i23 >> 6) & 7168) | (57344 & i3322222) | (458752 & i3322222) | (3670016 & i3322222) | (i3322222 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | (i2922 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            keyboardOptions3 = keyboardOptions522222;
            i25 = i22;
            z10 = z8;
            keyboardActions4 = keyboardActions3;
            visualTransformation3 = visualTransformation2;
            function14 = function13;
            function33 = function32;
            z11 = z1522222;
            i26 = i24;
            z12 = z7;
            textStyle3 = textStyle2;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        i15 = i5 & 2048;
        if (i15 == 0) {
        }
        int i29222 = i14;
        i16 = i5 & 4096;
        if (i16 == 0) {
        }
        i17 = i5 & 8192;
        if (i17 != 0) {
        }
        i18 = i5 & 16384;
        if (i18 == 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i28 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 512) != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        i22 = i30;
        function13 = basicTextFieldKt$BasicTextField$6;
        mutableInteractionSource2 = mutableInteractionSource3;
        z6 = z13;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        keyboardActions3 = keyboardActions2;
        i23 = i21;
        visualTransformation2 = none;
        z7 = z5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243232097, "CC(remember):BasicTextField.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<TextFieldValue> mutableState322222 = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TextFieldValue m6027copy3r_uNRQ$default222222 = TextFieldValue.m6027copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState322222), str, 0L, (TextRange) null, 6, (Object) null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220642, "CC(remember):BasicTextField.kt#9igjgp");
        changed = startRestartGroup.changed(m6027copy3r_uNRQ$default222222);
        boolean z15222222 = z4;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldValue BasicTextField$lambda$21;
                TextFieldValue BasicTextField$lambda$212;
                long selection = TextFieldValue.this.getSelection();
                BasicTextField$lambda$21 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState322222);
                if (TextRange.m5777equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                    TextRange composition = TextFieldValue.this.getComposition();
                    BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState322222);
                    if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                        return;
                    }
                }
                mutableState322222.setValue(TextFieldValue.this);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203633, "CC(remember):BasicTextField.kt#9igjgp");
        if ((i23 & 14) == 4) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z9) {
        }
        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        final MutableState<String> mutableState2222222 = (MutableState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ImeOptions imeOptions$foundation_release222222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z16222222 = !z7;
        if (z7) {
        }
        if (z7) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199525, "CC(remember):BasicTextField.kt#9igjgp");
        KeyboardOptions keyboardOptions5222222 = keyboardOptions2;
        changed2 = startRestartGroup.changed(mutableState2222222) | ((i23 & 112) == 32);
        Object rememberedValue4222222 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        obj = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
                String BasicTextField$lambda$25;
                mutableState322222.setValue(textFieldValue);
                BasicTextField$lambda$25 = BasicTextFieldKt.BasicTextField$lambda$25(mutableState2222222);
                boolean z172 = !Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                mutableState2222222.setValue(textFieldValue.getText());
                if (z172) {
                    function1.invoke(textFieldValue.getText());
                }
            }
        };
        startRestartGroup.updateRememberedValue(obj);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i33222222 = i29222 << 9;
        CoreTextFieldKt.CoreTextField(m6027copy3r_uNRQ$default222222, (Function1) obj, companion, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z16222222, i32, i31, imeOptions$foundation_release222222, keyboardActions3, z15222222, z8, function32, startRestartGroup, (i23 & 896) | ((i23 >> 6) & 7168) | (57344 & i33222222) | (458752 & i33222222) | (3670016 & i33222222) | (i33222222 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | (i29222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        keyboardOptions3 = keyboardOptions5222222;
        i25 = i22;
        z10 = z8;
        keyboardActions4 = keyboardActions3;
        visualTransformation3 = visualTransformation2;
        function14 = function13;
        function33 = function32;
        z11 = z15222222;
        i26 = i24;
        z12 = z7;
        textStyle3 = textStyle2;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$21(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
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
        int i18;
        int i19;
        int i20;
        boolean z4;
        int i21;
        int i22;
        SolidColor solidColor;
        int i23;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        Brush brush2;
        VisualTransformation visualTransformation2;
        KeyboardActions keyboardActions2;
        Function1<? super TextLayoutResult, Unit> function13;
        MutableInteractionSource mutableInteractionSource2;
        boolean z5;
        int i24;
        boolean z6;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        boolean z7;
        int i25;
        Modifier modifier2;
        boolean z8;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier3;
        final boolean z9;
        final boolean z10;
        final TextStyle textStyle3;
        final KeyboardActions keyboardActions3;
        final int i26;
        final int i27;
        final VisualTransformation visualTransformation3;
        final Function1<? super TextLayoutResult, Unit> function14;
        final boolean z11;
        final KeyboardOptions keyboardOptions3;
        final MutableInteractionSource mutableInteractionSource3;
        final Brush brush3;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope endRestartGroup;
        int i28;
        Composer startRestartGroup = composer.startRestartGroup(1804514146);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)766@39969L90,764@39907L740:BasicTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i29 = i5 & 4;
        if (i29 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i6 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i6 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                            i28 = 536870912;
                            i6 |= i28;
                        }
                        i28 = 268435456;
                        i6 |= i28;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i14 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i14 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i4;
                    }
                    i15 = i5 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i4 & 48) == 0) {
                        i14 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                    }
                    int i30 = i14;
                    i16 = i5 & 4096;
                    if (i16 == 0) {
                        i30 |= 384;
                    } else if ((i4 & 384) == 0) {
                        i30 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                        i17 = i5 & 8192;
                        if (i17 != 0) {
                            i30 |= 3072;
                        } else if ((i4 & 3072) == 0) {
                            i30 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                            i18 = i5 & 16384;
                            if (i18 == 0) {
                                i30 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i30 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                                i19 = i5 & 32768;
                                if (i19 != 0) {
                                    i30 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i30 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                                }
                                if ((i6 & 306783379) == 306783378 || (74899 & i30) != 74898 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i29 != 0 ? Modifier.INSTANCE : modifier;
                                        boolean z12 = i7 != 0 ? true : z;
                                        boolean z13 = i8 != 0 ? false : z2;
                                        TextStyle textStyle4 = i9 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                        KeyboardOptions keyboardOptions4 = i10 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        KeyboardActions keyboardActions4 = i11 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        boolean z14 = i12 != 0 ? false : z3;
                                        if ((i5 & 512) != 0) {
                                            i20 = z14 ? 1 : Integer.MAX_VALUE;
                                            i6 &= -1879048193;
                                        } else {
                                            i20 = i;
                                        }
                                        int i31 = i13 != 0 ? 1 : i2;
                                        VisualTransformation none = i15 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        BasicTextFieldKt$BasicTextField$10 basicTextFieldKt$BasicTextField$10 = i16 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function12;
                                        MutableInteractionSource mutableInteractionSource4 = i17 != 0 ? null : mutableInteractionSource;
                                        if (i18 != 0) {
                                            z4 = z14;
                                            i21 = i6;
                                            i22 = i31;
                                            solidColor = new SolidColor(Color.INSTANCE.m3866getBlack0d7_KjU(), null);
                                        } else {
                                            z4 = z14;
                                            i21 = i6;
                                            i22 = i31;
                                            solidColor = brush;
                                        }
                                        if (i19 != 0) {
                                            i23 = i22;
                                            brush2 = solidColor;
                                            function32 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m988getLambda2$foundation_release();
                                        } else {
                                            i23 = i22;
                                            function32 = function3;
                                            brush2 = solidColor;
                                        }
                                        visualTransformation2 = none;
                                        keyboardActions2 = keyboardActions4;
                                        function13 = basicTextFieldKt$BasicTextField$10;
                                        mutableInteractionSource2 = mutableInteractionSource4;
                                        z5 = z12;
                                        i24 = i20;
                                        z6 = z13;
                                        textStyle2 = textStyle4;
                                        keyboardOptions2 = keyboardOptions4;
                                        z7 = z4;
                                        i25 = i21;
                                        modifier2 = companion;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 512) != 0) {
                                            i6 &= -1879048193;
                                        }
                                        modifier2 = modifier;
                                        z5 = z;
                                        z6 = z2;
                                        textStyle2 = textStyle;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z3;
                                        i24 = i;
                                        i23 = i2;
                                        visualTransformation2 = visualTransformation;
                                        function13 = function12;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush2 = brush;
                                        function32 = function3;
                                        i25 = i6;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1804514146, i25, i30, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:763)");
                                    }
                                    ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                                    boolean z15 = !z7;
                                    int i32 = z7 ? 1 : i23;
                                    int i33 = z7 ? 1 : i24;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950400, "CC(remember):BasicTextField.kt#9igjgp");
                                    z8 = ((i25 & 14) == 4) | ((i25 & 112) == 32);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                                invoke2(textFieldValue2);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextFieldValue textFieldValue2) {
                                                if (Intrinsics.areEqual(TextFieldValue.this, textFieldValue2)) {
                                                    return;
                                                }
                                                function1.invoke(textFieldValue2);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i34 = i30 << 9;
                                    composer2 = startRestartGroup;
                                    boolean z16 = z7;
                                    KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                    CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z15, i33, i32, imeOptions$foundation_release, keyboardActions2, z5, z6, function32, composer2, (i25 & 910) | ((i25 >> 6) & 7168) | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (i34 & 29360128), (i25 & 57344) | ((i25 >> 15) & 896) | (i25 & 7168) | (458752 & i30), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier2;
                                    z9 = z5;
                                    z10 = z6;
                                    textStyle3 = textStyle2;
                                    keyboardActions3 = keyboardActions2;
                                    i26 = i24;
                                    i27 = i23;
                                    visualTransformation3 = visualTransformation2;
                                    function14 = function13;
                                    z11 = z16;
                                    keyboardOptions3 = keyboardOptions5;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush3 = brush2;
                                    function33 = function32;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    z9 = z;
                                    z10 = z2;
                                    textStyle3 = textStyle;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z11 = z3;
                                    i27 = i2;
                                    visualTransformation3 = visualTransformation;
                                    function14 = function12;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    brush3 = brush;
                                    function33 = function3;
                                    composer2 = startRestartGroup;
                                    i26 = i;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i35) {
                                            BasicTextFieldKt.BasicTextField(TextFieldValue.this, function1, modifier3, z9, z10, textStyle3, keyboardOptions3, keyboardActions3, z11, i26, i27, visualTransformation3, function14, mutableInteractionSource3, brush3, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i19 = i5 & 32768;
                            if (i19 != 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i29 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if ((i5 & 512) != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            visualTransformation2 = none;
                            keyboardActions2 = keyboardActions4;
                            function13 = basicTextFieldKt$BasicTextField$10;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            z5 = z12;
                            i24 = i20;
                            z6 = z13;
                            textStyle2 = textStyle4;
                            keyboardOptions2 = keyboardOptions4;
                            z7 = z4;
                            i25 = i21;
                            modifier2 = companion;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                            boolean z152 = !z7;
                            if (z7) {
                            }
                            if (z7) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950400, "CC(remember):BasicTextField.kt#9igjgp");
                            z8 = ((i25 & 14) == 4) | ((i25 & 112) == 32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z8) {
                            }
                            rememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                    invoke2(textFieldValue2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextFieldValue textFieldValue2) {
                                    if (Intrinsics.areEqual(TextFieldValue.this, textFieldValue2)) {
                                        return;
                                    }
                                    function1.invoke(textFieldValue2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i342 = i30 << 9;
                            composer2 = startRestartGroup;
                            boolean z162 = z7;
                            KeyboardOptions keyboardOptions52 = keyboardOptions2;
                            CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z152, i33, i32, imeOptions$foundation_release2, keyboardActions2, z5, z6, function32, composer2, (i25 & 910) | ((i25 >> 6) & 7168) | (57344 & i342) | (458752 & i342) | (3670016 & i342) | (i342 & 29360128), (i25 & 57344) | ((i25 >> 15) & 896) | (i25 & 7168) | (458752 & i30), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            z9 = z5;
                            z10 = z6;
                            textStyle3 = textStyle2;
                            keyboardActions3 = keyboardActions2;
                            i26 = i24;
                            i27 = i23;
                            visualTransformation3 = visualTransformation2;
                            function14 = function13;
                            z11 = z162;
                            keyboardOptions3 = keyboardOptions52;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            brush3 = brush2;
                            function33 = function32;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i18 = i5 & 16384;
                        if (i18 == 0) {
                        }
                        i19 = i5 & 32768;
                        if (i19 != 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i29 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if ((i5 & 512) != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        visualTransformation2 = none;
                        keyboardActions2 = keyboardActions4;
                        function13 = basicTextFieldKt$BasicTextField$10;
                        mutableInteractionSource2 = mutableInteractionSource4;
                        z5 = z12;
                        i24 = i20;
                        z6 = z13;
                        textStyle2 = textStyle4;
                        keyboardOptions2 = keyboardOptions4;
                        z7 = z4;
                        i25 = i21;
                        modifier2 = companion;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
                        boolean z1522 = !z7;
                        if (z7) {
                        }
                        if (z7) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950400, "CC(remember):BasicTextField.kt#9igjgp");
                        z8 = ((i25 & 14) == 4) | ((i25 & 112) == 32);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z8) {
                        }
                        rememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                invoke2(textFieldValue2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldValue textFieldValue2) {
                                if (Intrinsics.areEqual(TextFieldValue.this, textFieldValue2)) {
                                    return;
                                }
                                function1.invoke(textFieldValue2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i3422 = i30 << 9;
                        composer2 = startRestartGroup;
                        boolean z1622 = z7;
                        KeyboardOptions keyboardOptions522 = keyboardOptions2;
                        CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z1522, i33, i32, imeOptions$foundation_release22, keyboardActions2, z5, z6, function32, composer2, (i25 & 910) | ((i25 >> 6) & 7168) | (57344 & i3422) | (458752 & i3422) | (3670016 & i3422) | (i3422 & 29360128), (i25 & 57344) | ((i25 >> 15) & 896) | (i25 & 7168) | (458752 & i30), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        z9 = z5;
                        z10 = z6;
                        textStyle3 = textStyle2;
                        keyboardActions3 = keyboardActions2;
                        i26 = i24;
                        i27 = i23;
                        visualTransformation3 = visualTransformation2;
                        function14 = function13;
                        z11 = z1622;
                        keyboardOptions3 = keyboardOptions522;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        brush3 = brush2;
                        function33 = function32;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i5 & 8192;
                    if (i17 != 0) {
                    }
                    i18 = i5 & 16384;
                    if (i18 == 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 != 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i5 & 512) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    visualTransformation2 = none;
                    keyboardActions2 = keyboardActions4;
                    function13 = basicTextFieldKt$BasicTextField$10;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    z5 = z12;
                    i24 = i20;
                    z6 = z13;
                    textStyle2 = textStyle4;
                    keyboardOptions2 = keyboardOptions4;
                    z7 = z4;
                    i25 = i21;
                    modifier2 = companion;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
                    boolean z15222 = !z7;
                    if (z7) {
                    }
                    if (z7) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950400, "CC(remember):BasicTextField.kt#9igjgp");
                    z8 = ((i25 & 14) == 4) | ((i25 & 112) == 32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z8) {
                    }
                    rememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                            invoke2(textFieldValue2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextFieldValue textFieldValue2) {
                            if (Intrinsics.areEqual(TextFieldValue.this, textFieldValue2)) {
                                return;
                            }
                            function1.invoke(textFieldValue2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i34222 = i30 << 9;
                    composer2 = startRestartGroup;
                    boolean z16222 = z7;
                    KeyboardOptions keyboardOptions5222 = keyboardOptions2;
                    CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z15222, i33, i32, imeOptions$foundation_release222, keyboardActions2, z5, z6, function32, composer2, (i25 & 910) | ((i25 >> 6) & 7168) | (57344 & i34222) | (458752 & i34222) | (3670016 & i34222) | (i34222 & 29360128), (i25 & 57344) | ((i25 >> 15) & 896) | (i25 & 7168) | (458752 & i30), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z9 = z5;
                    z10 = z6;
                    textStyle3 = textStyle2;
                    keyboardActions3 = keyboardActions2;
                    i26 = i24;
                    i27 = i23;
                    visualTransformation3 = visualTransformation2;
                    function14 = function13;
                    z11 = z16222;
                    keyboardOptions3 = keyboardOptions5222;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    brush3 = brush2;
                    function33 = function32;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                i15 = i5 & 2048;
                if (i15 == 0) {
                }
                int i302 = i14;
                i16 = i5 & 4096;
                if (i16 == 0) {
                }
                i17 = i5 & 8192;
                if (i17 != 0) {
                }
                i18 = i5 & 16384;
                if (i18 == 0) {
                }
                i19 = i5 & 32768;
                if (i19 != 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i29 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if ((i5 & 512) != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                visualTransformation2 = none;
                keyboardActions2 = keyboardActions4;
                function13 = basicTextFieldKt$BasicTextField$10;
                mutableInteractionSource2 = mutableInteractionSource4;
                z5 = z12;
                i24 = i20;
                z6 = z13;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                z7 = z4;
                i25 = i21;
                modifier2 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ImeOptions imeOptions$foundation_release2222 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z152222 = !z7;
                if (z7) {
                }
                if (z7) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950400, "CC(remember):BasicTextField.kt#9igjgp");
                z8 = ((i25 & 14) == 4) | ((i25 & 112) == 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z8) {
                }
                rememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                        invoke2(textFieldValue2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue2) {
                        if (Intrinsics.areEqual(TextFieldValue.this, textFieldValue2)) {
                            return;
                        }
                        function1.invoke(textFieldValue2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i342222 = i302 << 9;
                composer2 = startRestartGroup;
                boolean z162222 = z7;
                KeyboardOptions keyboardOptions52222 = keyboardOptions2;
                CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z152222, i33, i32, imeOptions$foundation_release2222, keyboardActions2, z5, z6, function32, composer2, (i25 & 910) | ((i25 >> 6) & 7168) | (57344 & i342222) | (458752 & i342222) | (3670016 & i342222) | (i342222 & 29360128), (i25 & 57344) | ((i25 >> 15) & 896) | (i25 & 7168) | (458752 & i302), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z9 = z5;
                z10 = z6;
                textStyle3 = textStyle2;
                keyboardActions3 = keyboardActions2;
                i26 = i24;
                i27 = i23;
                visualTransformation3 = visualTransformation2;
                function14 = function13;
                z11 = z162222;
                keyboardOptions3 = keyboardOptions52222;
                mutableInteractionSource3 = mutableInteractionSource2;
                brush3 = brush2;
                function33 = function32;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            i15 = i5 & 2048;
            if (i15 == 0) {
            }
            int i3022 = i14;
            i16 = i5 & 4096;
            if (i16 == 0) {
            }
            i17 = i5 & 8192;
            if (i17 != 0) {
            }
            i18 = i5 & 16384;
            if (i18 == 0) {
            }
            i19 = i5 & 32768;
            if (i19 != 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i29 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i5 & 512) != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            visualTransformation2 = none;
            keyboardActions2 = keyboardActions4;
            function13 = basicTextFieldKt$BasicTextField$10;
            mutableInteractionSource2 = mutableInteractionSource4;
            z5 = z12;
            i24 = i20;
            z6 = z13;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            z7 = z4;
            i25 = i21;
            modifier2 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ImeOptions imeOptions$foundation_release22222 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z1522222 = !z7;
            if (z7) {
            }
            if (z7) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950400, "CC(remember):BasicTextField.kt#9igjgp");
            z8 = ((i25 & 14) == 4) | ((i25 & 112) == 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z8) {
            }
            rememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                    invoke2(textFieldValue2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextFieldValue textFieldValue2) {
                    if (Intrinsics.areEqual(TextFieldValue.this, textFieldValue2)) {
                        return;
                    }
                    function1.invoke(textFieldValue2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3422222 = i3022 << 9;
            composer2 = startRestartGroup;
            boolean z1622222 = z7;
            KeyboardOptions keyboardOptions522222 = keyboardOptions2;
            CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z1522222, i33, i32, imeOptions$foundation_release22222, keyboardActions2, z5, z6, function32, composer2, (i25 & 910) | ((i25 >> 6) & 7168) | (57344 & i3422222) | (458752 & i3422222) | (3670016 & i3422222) | (i3422222 & 29360128), (i25 & 57344) | ((i25 >> 15) & 896) | (i25 & 7168) | (458752 & i3022), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z9 = z5;
            z10 = z6;
            textStyle3 = textStyle2;
            keyboardActions3 = keyboardActions2;
            i26 = i24;
            i27 = i23;
            visualTransformation3 = visualTransformation2;
            function14 = function13;
            z11 = z1622222;
            keyboardOptions3 = keyboardOptions522222;
            mutableInteractionSource3 = mutableInteractionSource2;
            brush3 = brush2;
            function33 = function32;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        i15 = i5 & 2048;
        if (i15 == 0) {
        }
        int i30222 = i14;
        i16 = i5 & 4096;
        if (i16 == 0) {
        }
        i17 = i5 & 8192;
        if (i17 != 0) {
        }
        i18 = i5 & 16384;
        if (i18 == 0) {
        }
        i19 = i5 & 32768;
        if (i19 != 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i29 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i5 & 512) != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        visualTransformation2 = none;
        keyboardActions2 = keyboardActions4;
        function13 = basicTextFieldKt$BasicTextField$10;
        mutableInteractionSource2 = mutableInteractionSource4;
        z5 = z12;
        i24 = i20;
        z6 = z13;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        z7 = z4;
        i25 = i21;
        modifier2 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ImeOptions imeOptions$foundation_release222222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z15222222 = !z7;
        if (z7) {
        }
        if (z7) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950400, "CC(remember):BasicTextField.kt#9igjgp");
        z8 = ((i25 & 14) == 4) | ((i25 & 112) == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z8) {
        }
        rememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                invoke2(textFieldValue2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue2) {
                if (Intrinsics.areEqual(TextFieldValue.this, textFieldValue2)) {
                    return;
                }
                function1.invoke(textFieldValue2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i34222222 = i30222 << 9;
        composer2 = startRestartGroup;
        boolean z16222222 = z7;
        KeyboardOptions keyboardOptions5222222 = keyboardOptions2;
        CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, z15222222, i33, i32, imeOptions$foundation_release222222, keyboardActions2, z5, z6, function32, composer2, (i25 & 910) | ((i25 >> 6) & 7168) | (57344 & i34222222) | (458752 & i34222222) | (3670016 & i34222222) | (i34222222 & 29360128), (i25 & 57344) | ((i25 >> 15) & 896) | (i25 & 7168) | (458752 & i30222), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z9 = z5;
        z10 = z6;
        textStyle3 = textStyle2;
        keyboardActions3 = keyboardActions2;
        i26 = i24;
        i27 = i23;
        visualTransformation3 = visualTransformation2;
        function14 = function13;
        z11 = z16222222;
        keyboardOptions3 = keyboardOptions5222222;
        mutableInteractionSource3 = mutableInteractionSource2;
        brush3 = brush2;
        function33 = function32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
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
        int i18;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        SolidColor solidColor;
        final Brush brush2;
        final VisualTransformation visualTransformation2;
        final Function3 function32;
        final Modifier modifier2;
        final KeyboardActions keyboardActions2;
        final boolean z4;
        final TextStyle textStyle2;
        final boolean z5;
        final int i20;
        final MutableInteractionSource mutableInteractionSource3;
        final KeyboardOptions keyboardOptions2;
        final Function1 function13;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-454732590);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)803@41337L39,808@41577L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                        }
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                            i15 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i15 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                        } else {
                            i15 = i3;
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i15 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                        }
                        int i21 = i15;
                        i17 = i4 & 4096;
                        if (i17 != 0) {
                            i21 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i21 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                            i18 = i4 & 8192;
                            if (i18 == 0) {
                                i21 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i21 |= startRestartGroup.changed(brush) ? 2048 : 1024;
                                i19 = i4 & 16384;
                                if (i19 != 0) {
                                    i21 |= 24576;
                                } else if ((i3 & 24576) == 0) {
                                    i21 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                                    if ((i5 & 306783379) == 306783378 || (i21 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier;
                                        boolean z7 = i7 == 0 ? true : z;
                                        boolean z8 = i8 == 0 ? false : z2;
                                        TextStyle textStyle3 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                        KeyboardOptions keyboardOptions3 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        KeyboardActions keyboardActions3 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        boolean z9 = i12 == 0 ? false : z3;
                                        int i22 = i13 == 0 ? Integer.MAX_VALUE : i;
                                        VisualTransformation none = i14 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        BasicTextFieldKt$BasicTextField$13 basicTextFieldKt$BasicTextField$13 = i16 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function12;
                                        if (i17 == 0) {
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242906675, "CC(remember):BasicTextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if (i18 == 0) {
                                            composer2 = startRestartGroup;
                                            solidColor = new SolidColor(Color.INSTANCE.m3866getBlack0d7_KjU(), null);
                                        } else {
                                            composer2 = startRestartGroup;
                                            solidColor = brush;
                                        }
                                        Function3 m989getLambda3$foundation_release = i19 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m989getLambda3$foundation_release() : function3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-454732590, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:807)");
                                        }
                                        int i23 = i5 & 2147483646;
                                        int i24 = i21 << 3;
                                        BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i23, (i24 & 112) | 6 | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        brush2 = solidColor;
                                        visualTransformation2 = none;
                                        function32 = m989getLambda3$foundation_release;
                                        modifier2 = companion;
                                        keyboardActions2 = keyboardActions3;
                                        z4 = z8;
                                        textStyle2 = textStyle3;
                                        z5 = z9;
                                        i20 = i22;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        keyboardOptions2 = keyboardOptions3;
                                        boolean z10 = z7;
                                        function13 = basicTextFieldKt$BasicTextField$13;
                                        z6 = z10;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        z6 = z;
                                        z4 = z2;
                                        textStyle2 = textStyle;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z5 = z3;
                                        i20 = i;
                                        visualTransformation2 = visualTransformation;
                                        function13 = function12;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        brush2 = brush;
                                        function32 = function3;
                                        composer2 = startRestartGroup;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i25) {
                                                BasicTextFieldKt.BasicTextField(str, function1, modifier2, z6, z4, textStyle2, keyboardOptions2, keyboardActions2, z5, i20, visualTransformation2, function13, mutableInteractionSource3, brush2, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if ((i5 & 306783379) == 306783378) {
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
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i232 = i5 & 2147483646;
                                int i242 = i21 << 3;
                                BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i232, (i242 & 112) | 6 | (i242 & 896) | (i242 & 7168) | (57344 & i242) | (i242 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                brush2 = solidColor;
                                visualTransformation2 = none;
                                function32 = m989getLambda3$foundation_release;
                                modifier2 = companion;
                                keyboardActions2 = keyboardActions3;
                                z4 = z8;
                                textStyle2 = textStyle3;
                                z5 = z9;
                                i20 = i22;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                keyboardOptions2 = keyboardOptions3;
                                boolean z102 = z7;
                                function13 = basicTextFieldKt$BasicTextField$13;
                                z6 = z102;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i19 = i4 & 16384;
                            if (i19 != 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
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
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i2322 = i5 & 2147483646;
                            int i2422 = i21 << 3;
                            BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i2322, (i2422 & 112) | 6 | (i2422 & 896) | (i2422 & 7168) | (57344 & i2422) | (i2422 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            brush2 = solidColor;
                            visualTransformation2 = none;
                            function32 = m989getLambda3$foundation_release;
                            modifier2 = companion;
                            keyboardActions2 = keyboardActions3;
                            z4 = z8;
                            textStyle2 = textStyle3;
                            z5 = z9;
                            i20 = i22;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            keyboardOptions2 = keyboardOptions3;
                            boolean z1022 = z7;
                            function13 = basicTextFieldKt$BasicTextField$13;
                            z6 = z1022;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i18 = i4 & 8192;
                        if (i18 == 0) {
                        }
                        i19 = i4 & 16384;
                        if (i19 != 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
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
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i23222 = i5 & 2147483646;
                        int i24222 = i21 << 3;
                        BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i23222, (i24222 & 112) | 6 | (i24222 & 896) | (i24222 & 7168) | (57344 & i24222) | (i24222 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        brush2 = solidColor;
                        visualTransformation2 = none;
                        function32 = m989getLambda3$foundation_release;
                        modifier2 = companion;
                        keyboardActions2 = keyboardActions3;
                        z4 = z8;
                        textStyle2 = textStyle3;
                        z5 = z9;
                        i20 = i22;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardOptions2 = keyboardOptions3;
                        boolean z10222 = z7;
                        function13 = basicTextFieldKt$BasicTextField$13;
                        z6 = z10222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    int i212 = i15;
                    i17 = i4 & 4096;
                    if (i17 != 0) {
                    }
                    i18 = i4 & 8192;
                    if (i18 == 0) {
                    }
                    i19 = i4 & 16384;
                    if (i19 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
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
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i232222 = i5 & 2147483646;
                    int i242222 = i212 << 3;
                    BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i232222, (i242222 & 112) | 6 | (i242222 & 896) | (i242222 & 7168) | (57344 & i242222) | (i242222 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    brush2 = solidColor;
                    visualTransformation2 = none;
                    function32 = m989getLambda3$foundation_release;
                    modifier2 = companion;
                    keyboardActions2 = keyboardActions3;
                    z4 = z8;
                    textStyle2 = textStyle3;
                    z5 = z9;
                    i20 = i22;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardOptions2 = keyboardOptions3;
                    boolean z102222 = z7;
                    function13 = basicTextFieldKt$BasicTextField$13;
                    z6 = z102222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                int i2122 = i15;
                i17 = i4 & 4096;
                if (i17 != 0) {
                }
                i18 = i4 & 8192;
                if (i18 == 0) {
                }
                i19 = i4 & 16384;
                if (i19 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
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
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i2322222 = i5 & 2147483646;
                int i2422222 = i2122 << 3;
                BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i2322222, (i2422222 & 112) | 6 | (i2422222 & 896) | (i2422222 & 7168) | (57344 & i2422222) | (i2422222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                brush2 = solidColor;
                visualTransformation2 = none;
                function32 = m989getLambda3$foundation_release;
                modifier2 = companion;
                keyboardActions2 = keyboardActions3;
                z4 = z8;
                textStyle2 = textStyle3;
                z5 = z9;
                i20 = i22;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardOptions2 = keyboardOptions3;
                boolean z1022222 = z7;
                function13 = basicTextFieldKt$BasicTextField$13;
                z6 = z1022222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            int i21222 = i15;
            i17 = i4 & 4096;
            if (i17 != 0) {
            }
            i18 = i4 & 8192;
            if (i18 == 0) {
            }
            i19 = i4 & 16384;
            if (i19 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
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
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i23222222 = i5 & 2147483646;
            int i24222222 = i21222 << 3;
            BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i23222222, (i24222222 & 112) | 6 | (i24222222 & 896) | (i24222222 & 7168) | (57344 & i24222222) | (i24222222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            brush2 = solidColor;
            visualTransformation2 = none;
            function32 = m989getLambda3$foundation_release;
            modifier2 = companion;
            keyboardActions2 = keyboardActions3;
            z4 = z8;
            textStyle2 = textStyle3;
            z5 = z9;
            i20 = i22;
            mutableInteractionSource3 = mutableInteractionSource2;
            keyboardOptions2 = keyboardOptions3;
            boolean z10222222 = z7;
            function13 = basicTextFieldKt$BasicTextField$13;
            z6 = z10222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        int i212222 = i15;
        i17 = i4 & 4096;
        if (i17 != 0) {
        }
        i18 = i4 & 8192;
        if (i18 == 0) {
        }
        i19 = i4 & 16384;
        if (i19 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
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
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i232222222 = i5 & 2147483646;
        int i242222222 = i212222 << 3;
        BasicTextField(str, (Function1<? super String, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$13, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m989getLambda3$foundation_release, composer2, i232222222, (i242222222 & 112) | 6 | (i242222222 & 896) | (i242222222 & 7168) | (57344 & i242222222) | (i242222222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        brush2 = solidColor;
        visualTransformation2 = none;
        function32 = m989getLambda3$foundation_release;
        modifier2 = companion;
        keyboardActions2 = keyboardActions3;
        z4 = z8;
        textStyle2 = textStyle3;
        z5 = z9;
        i20 = i22;
        mutableInteractionSource3 = mutableInteractionSource2;
        keyboardOptions2 = keyboardOptions3;
        boolean z102222222 = z7;
        function13 = basicTextFieldKt$BasicTextField$13;
        z6 = z102222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
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
        int i18;
        int i19;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        SolidColor solidColor;
        final Brush brush2;
        final VisualTransformation visualTransformation2;
        final Function3 function32;
        final Modifier modifier2;
        final KeyboardActions keyboardActions2;
        final boolean z4;
        final TextStyle textStyle2;
        final boolean z5;
        final int i20;
        final MutableInteractionSource mutableInteractionSource3;
        final KeyboardOptions keyboardOptions2;
        final Function1 function13;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-560482651);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)843@42862L39,848@43102L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                        }
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                            i15 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i15 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                        } else {
                            i15 = i3;
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i15 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                        }
                        int i21 = i15;
                        i17 = i4 & 4096;
                        if (i17 != 0) {
                            i21 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i21 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                            i18 = i4 & 8192;
                            if (i18 == 0) {
                                i21 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i21 |= startRestartGroup.changed(brush) ? 2048 : 1024;
                                i19 = i4 & 16384;
                                if (i19 != 0) {
                                    i21 |= 24576;
                                } else if ((i3 & 24576) == 0) {
                                    i21 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                                    if ((i5 & 306783379) == 306783378 || (i21 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier;
                                        boolean z7 = i7 == 0 ? true : z;
                                        boolean z8 = i8 == 0 ? false : z2;
                                        TextStyle textStyle3 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                        KeyboardOptions keyboardOptions3 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        KeyboardActions keyboardActions3 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        boolean z9 = i12 == 0 ? false : z3;
                                        int i22 = i13 == 0 ? Integer.MAX_VALUE : i;
                                        VisualTransformation none = i14 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        BasicTextFieldKt$BasicTextField$16 basicTextFieldKt$BasicTextField$16 = i16 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$16
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function12;
                                        if (i17 == 0) {
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242857875, "CC(remember):BasicTextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if (i18 == 0) {
                                            composer2 = startRestartGroup;
                                            solidColor = new SolidColor(Color.INSTANCE.m3866getBlack0d7_KjU(), null);
                                        } else {
                                            composer2 = startRestartGroup;
                                            solidColor = brush;
                                        }
                                        Function3 m990getLambda4$foundation_release = i19 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m990getLambda4$foundation_release() : function3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-560482651, i5, i21, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:847)");
                                        }
                                        int i23 = i5 & 2147483646;
                                        int i24 = i21 << 3;
                                        BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i23, (i24 & 112) | 6 | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        brush2 = solidColor;
                                        visualTransformation2 = none;
                                        function32 = m990getLambda4$foundation_release;
                                        modifier2 = companion;
                                        keyboardActions2 = keyboardActions3;
                                        z4 = z8;
                                        textStyle2 = textStyle3;
                                        z5 = z9;
                                        i20 = i22;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        keyboardOptions2 = keyboardOptions3;
                                        boolean z10 = z7;
                                        function13 = basicTextFieldKt$BasicTextField$16;
                                        z6 = z10;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        z6 = z;
                                        z4 = z2;
                                        textStyle2 = textStyle;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z5 = z3;
                                        i20 = i;
                                        visualTransformation2 = visualTransformation;
                                        function13 = function12;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        brush2 = brush;
                                        function32 = function3;
                                        composer2 = startRestartGroup;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$18
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i25) {
                                                BasicTextFieldKt.BasicTextField(TextFieldValue.this, function1, modifier2, z6, z4, textStyle2, keyboardOptions2, keyboardActions2, z5, i20, visualTransformation2, function13, mutableInteractionSource3, brush2, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if ((i5 & 306783379) == 306783378) {
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
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i232 = i5 & 2147483646;
                                int i242 = i21 << 3;
                                BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i232, (i242 & 112) | 6 | (i242 & 896) | (i242 & 7168) | (57344 & i242) | (i242 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                brush2 = solidColor;
                                visualTransformation2 = none;
                                function32 = m990getLambda4$foundation_release;
                                modifier2 = companion;
                                keyboardActions2 = keyboardActions3;
                                z4 = z8;
                                textStyle2 = textStyle3;
                                z5 = z9;
                                i20 = i22;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                keyboardOptions2 = keyboardOptions3;
                                boolean z102 = z7;
                                function13 = basicTextFieldKt$BasicTextField$16;
                                z6 = z102;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i19 = i4 & 16384;
                            if (i19 != 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
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
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i2322 = i5 & 2147483646;
                            int i2422 = i21 << 3;
                            BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i2322, (i2422 & 112) | 6 | (i2422 & 896) | (i2422 & 7168) | (57344 & i2422) | (i2422 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            brush2 = solidColor;
                            visualTransformation2 = none;
                            function32 = m990getLambda4$foundation_release;
                            modifier2 = companion;
                            keyboardActions2 = keyboardActions3;
                            z4 = z8;
                            textStyle2 = textStyle3;
                            z5 = z9;
                            i20 = i22;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            keyboardOptions2 = keyboardOptions3;
                            boolean z1022 = z7;
                            function13 = basicTextFieldKt$BasicTextField$16;
                            z6 = z1022;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i18 = i4 & 8192;
                        if (i18 == 0) {
                        }
                        i19 = i4 & 16384;
                        if (i19 != 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
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
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i23222 = i5 & 2147483646;
                        int i24222 = i21 << 3;
                        BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i23222, (i24222 & 112) | 6 | (i24222 & 896) | (i24222 & 7168) | (57344 & i24222) | (i24222 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        brush2 = solidColor;
                        visualTransformation2 = none;
                        function32 = m990getLambda4$foundation_release;
                        modifier2 = companion;
                        keyboardActions2 = keyboardActions3;
                        z4 = z8;
                        textStyle2 = textStyle3;
                        z5 = z9;
                        i20 = i22;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        keyboardOptions2 = keyboardOptions3;
                        boolean z10222 = z7;
                        function13 = basicTextFieldKt$BasicTextField$16;
                        z6 = z10222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    int i212 = i15;
                    i17 = i4 & 4096;
                    if (i17 != 0) {
                    }
                    i18 = i4 & 8192;
                    if (i18 == 0) {
                    }
                    i19 = i4 & 16384;
                    if (i19 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
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
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i232222 = i5 & 2147483646;
                    int i242222 = i212 << 3;
                    BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i232222, (i242222 & 112) | 6 | (i242222 & 896) | (i242222 & 7168) | (57344 & i242222) | (i242222 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    brush2 = solidColor;
                    visualTransformation2 = none;
                    function32 = m990getLambda4$foundation_release;
                    modifier2 = companion;
                    keyboardActions2 = keyboardActions3;
                    z4 = z8;
                    textStyle2 = textStyle3;
                    z5 = z9;
                    i20 = i22;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    keyboardOptions2 = keyboardOptions3;
                    boolean z102222 = z7;
                    function13 = basicTextFieldKt$BasicTextField$16;
                    z6 = z102222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                int i2122 = i15;
                i17 = i4 & 4096;
                if (i17 != 0) {
                }
                i18 = i4 & 8192;
                if (i18 == 0) {
                }
                i19 = i4 & 16384;
                if (i19 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
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
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i2322222 = i5 & 2147483646;
                int i2422222 = i2122 << 3;
                BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i2322222, (i2422222 & 112) | 6 | (i2422222 & 896) | (i2422222 & 7168) | (57344 & i2422222) | (i2422222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                brush2 = solidColor;
                visualTransformation2 = none;
                function32 = m990getLambda4$foundation_release;
                modifier2 = companion;
                keyboardActions2 = keyboardActions3;
                z4 = z8;
                textStyle2 = textStyle3;
                z5 = z9;
                i20 = i22;
                mutableInteractionSource3 = mutableInteractionSource2;
                keyboardOptions2 = keyboardOptions3;
                boolean z1022222 = z7;
                function13 = basicTextFieldKt$BasicTextField$16;
                z6 = z1022222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            int i21222 = i15;
            i17 = i4 & 4096;
            if (i17 != 0) {
            }
            i18 = i4 & 8192;
            if (i18 == 0) {
            }
            i19 = i4 & 16384;
            if (i19 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
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
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i23222222 = i5 & 2147483646;
            int i24222222 = i21222 << 3;
            BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i23222222, (i24222222 & 112) | 6 | (i24222222 & 896) | (i24222222 & 7168) | (57344 & i24222222) | (i24222222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            brush2 = solidColor;
            visualTransformation2 = none;
            function32 = m990getLambda4$foundation_release;
            modifier2 = companion;
            keyboardActions2 = keyboardActions3;
            z4 = z8;
            textStyle2 = textStyle3;
            z5 = z9;
            i20 = i22;
            mutableInteractionSource3 = mutableInteractionSource2;
            keyboardOptions2 = keyboardOptions3;
            boolean z10222222 = z7;
            function13 = basicTextFieldKt$BasicTextField$16;
            z6 = z10222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        int i212222 = i15;
        i17 = i4 & 4096;
        if (i17 != 0) {
        }
        i18 = i4 & 8192;
        if (i18 == 0) {
        }
        i19 = i4 & 16384;
        if (i19 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
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
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i232222222 = i5 & 2147483646;
        int i242222222 = i212222 << 3;
        BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, companion, z7, z8, textStyle3, keyboardOptions3, keyboardActions3, z9, i22, 1, none, (Function1<? super TextLayoutResult, Unit>) basicTextFieldKt$BasicTextField$16, mutableInteractionSource2, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m990getLambda4$foundation_release, composer2, i232222222, (i242222222 & 112) | 6 | (i242222222 & 896) | (i242222222 & 7168) | (57344 & i242222222) | (i242222222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        brush2 = solidColor;
        visualTransformation2 = none;
        function32 = m990getLambda4$foundation_release;
        modifier2 = companion;
        keyboardActions2 = keyboardActions3;
        z4 = z8;
        textStyle2 = textStyle3;
        z5 = z9;
        i20 = i22;
        mutableInteractionSource3 = mutableInteractionSource2;
        keyboardOptions2 = keyboardOptions3;
        boolean z102222222 = z7;
        function13 = basicTextFieldKt$BasicTextField$16;
        z6 = z102222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$9(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$13(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$17(State<TextFieldHandleState> state) {
        return state.getValue();
    }
}
