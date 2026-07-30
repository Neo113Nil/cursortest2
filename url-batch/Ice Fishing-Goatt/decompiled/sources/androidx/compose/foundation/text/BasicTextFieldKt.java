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
    private static final long MinTouchTargetSizeForHandles = DpKt.m6287DpSizeYgX7TsA(Dp.m6265constructorimpl(40.0f), Dp.m6265constructorimpl(40.0f));

    /* JADX WARN: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
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
        KeyboardOptions keyboardOptions3;
        TextFieldLineLimits textFieldLineLimits2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        TextFieldDecorator textFieldDecorator2;
        TextStyle textStyle3;
        KeyboardActionHandler keyboardActionHandler2;
        MutableInteractionSource mutableInteractionSource2;
        OutputTransformation outputTransformation2;
        Brush brush2;
        ScrollState scrollState2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final boolean z6;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle4;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActionHandler keyboardActionHandler3;
        final TextFieldLineLimits textFieldLineLimits3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        final MutableInteractionSource mutableInteractionSource3;
        final Brush brush3;
        final OutputTransformation outputTransformation3;
        final TextFieldDecorator textFieldDecorator3;
        final ScrollState scrollState3;
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
        int i24 = i3 & 2;
        if (i24 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i4 |= startRestartGroup.changed(z3) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i7 = i3 & 16;
                    int i25 = 8192;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        inputTransformation2 = inputTransformation;
                        i4 |= startRestartGroup.changed(inputTransformation2) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
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
                            i12 = i11;
                            i4 |= startRestartGroup.changed(textFieldLineLimits) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i13 = i3 & 512;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i14 = i13;
                                i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                                i15 = i3 & 1024;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= startRestartGroup.changed(brush) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i26 = i17;
                                i20 = i3 & 4096;
                                if (i20 != 0) {
                                    i21 = i26 | 384;
                                } else if ((i2 & 384) == 0) {
                                    i21 = i26 | (startRestartGroup.changed(outputTransformation) ? 256 : 128);
                                } else {
                                    i21 = i26;
                                }
                                i22 = i3 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i27 = i21;
                                    if ((i2 & 3072) == 0) {
                                        i23 = i27 | ((i2 & 4096) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 2048 : 1024);
                                    } else {
                                        i23 = i27;
                                    }
                                }
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & 16384) == 0 && startRestartGroup.changed(scrollState)) {
                                        i25 = 16384;
                                    }
                                    i23 |= i25;
                                }
                                if ((i4 & 306783379) == 306783378 || (i23 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i24 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z3 = true;
                                        }
                                        if (i6 != 0) {
                                            z4 = false;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        if (i8 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        keyboardOptions3 = i9 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                                        KeyboardActionHandler keyboardActionHandler4 = i10 != 0 ? null : keyboardActionHandler;
                                        textFieldLineLimits2 = i12 != 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                        function22 = i14 != 0 ? null : function2;
                                        MutableInteractionSource mutableInteractionSource4 = i16 != 0 ? null : mutableInteractionSource;
                                        SolidColor cursorBrush = i19 != 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                        OutputTransformation outputTransformation4 = i20 != 0 ? null : outputTransformation;
                                        TextFieldDecorator textFieldDecorator4 = i22 == 0 ? textFieldDecorator : null;
                                        if ((i3 & 16384) != 0) {
                                            i23 &= -57345;
                                            Brush brush4 = cursorBrush;
                                            scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                            outputTransformation2 = outputTransformation4;
                                            brush2 = brush4;
                                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            textFieldDecorator2 = textFieldDecorator4;
                                            textStyle3 = textStyle2;
                                            keyboardActionHandler2 = keyboardActionHandler4;
                                            mutableInteractionSource2 = mutableInteractionSource5;
                                        } else {
                                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                            textFieldDecorator2 = textFieldDecorator4;
                                            textStyle3 = textStyle2;
                                            keyboardActionHandler2 = keyboardActionHandler4;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            outputTransformation2 = outputTransformation4;
                                            brush2 = cursorBrush;
                                            scrollState2 = scrollState;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 16384) != 0) {
                                            i23 &= -57345;
                                        }
                                        textFieldLineLimits2 = textFieldLineLimits;
                                        function22 = function2;
                                        brush2 = brush;
                                        outputTransformation2 = outputTransformation;
                                        textFieldDecorator2 = textFieldDecorator;
                                        scrollState2 = scrollState;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        keyboardActionHandler2 = keyboardActionHandler;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(469439921, i4, i23, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:187)");
                                    }
                                    int i28 = (i23 & 14) | 384 | (i23 & 112);
                                    int i29 = i23 << 3;
                                    Modifier modifier4 = modifier2;
                                    TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits2;
                                    composer2 = startRestartGroup;
                                    InputTransformation inputTransformation4 = inputTransformation2;
                                    KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                    Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = function22;
                                    OutputTransformation outputTransformation5 = outputTransformation2;
                                    BasicTextField(textFieldState, modifier4, z3, z4, inputTransformation4, textStyle3, keyboardOptions5, keyboardActionHandler2, textFieldLineLimits4, function24, mutableInteractionSource2, brush2, null, outputTransformation5, textFieldDecorator2, scrollState2, false, composer2, i4 & 2147483646, i28 | (i29 & 7168) | (57344 & i29) | (i29 & 458752), 65536);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation4;
                                    textStyle4 = textStyle3;
                                    keyboardOptions4 = keyboardOptions5;
                                    keyboardActionHandler3 = keyboardActionHandler2;
                                    textFieldLineLimits3 = textFieldLineLimits4;
                                    function23 = function24;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush3 = brush2;
                                    outputTransformation3 = outputTransformation5;
                                    textFieldDecorator3 = textFieldDecorator2;
                                    scrollState3 = scrollState2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    textFieldLineLimits3 = textFieldLineLimits;
                                    function23 = function2;
                                    textFieldDecorator3 = textFieldDecorator;
                                    composer2 = startRestartGroup;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle4 = textStyle2;
                                    modifier3 = modifier2;
                                    keyboardOptions4 = keyboardOptions2;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    brush3 = brush;
                                    outputTransformation3 = outputTransformation;
                                    scrollState3 = scrollState;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
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

                                        public final void invoke(Composer composer3, int i30) {
                                            BasicTextFieldKt.BasicTextField(TextFieldState.this, modifier3, z5, z6, inputTransformation3, textStyle4, keyboardOptions4, keyboardActionHandler3, textFieldLineLimits3, function23, mutableInteractionSource3, brush3, outputTransformation3, textFieldDecorator3, scrollState3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i3 & 2048;
                            if (i18 != 0) {
                            }
                            int i262 = i17;
                            i20 = i3 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 8192;
                            if (i22 != 0) {
                            }
                            if ((i2 & 24576) == 0) {
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
                            if (i12 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i22 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i282 = (i23 & 14) | 384 | (i23 & 112);
                            int i292 = i23 << 3;
                            Modifier modifier42 = modifier2;
                            TextFieldLineLimits textFieldLineLimits42 = textFieldLineLimits2;
                            composer2 = startRestartGroup;
                            InputTransformation inputTransformation42 = inputTransformation2;
                            KeyboardOptions keyboardOptions52 = keyboardOptions3;
                            Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242 = function22;
                            OutputTransformation outputTransformation52 = outputTransformation2;
                            BasicTextField(textFieldState, modifier42, z3, z4, inputTransformation42, textStyle3, keyboardOptions52, keyboardActionHandler2, textFieldLineLimits42, function242, mutableInteractionSource2, brush2, null, outputTransformation52, textFieldDecorator2, scrollState2, false, composer2, i4 & 2147483646, i282 | (i292 & 7168) | (57344 & i292) | (i292 & 458752), 65536);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z5 = z3;
                            z6 = z4;
                            inputTransformation3 = inputTransformation42;
                            textStyle4 = textStyle3;
                            keyboardOptions4 = keyboardOptions52;
                            keyboardActionHandler3 = keyboardActionHandler2;
                            textFieldLineLimits3 = textFieldLineLimits42;
                            function23 = function242;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            brush3 = brush2;
                            outputTransformation3 = outputTransformation52;
                            textFieldDecorator3 = textFieldDecorator2;
                            scrollState3 = scrollState2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                        }
                        int i2622 = i17;
                        i20 = i3 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                        }
                        if ((i2 & 24576) == 0) {
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
                        if (i12 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i22 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i2822 = (i23 & 14) | 384 | (i23 & 112);
                        int i2922 = i23 << 3;
                        Modifier modifier422 = modifier2;
                        TextFieldLineLimits textFieldLineLimits422 = textFieldLineLimits2;
                        composer2 = startRestartGroup;
                        InputTransformation inputTransformation422 = inputTransformation2;
                        KeyboardOptions keyboardOptions522 = keyboardOptions3;
                        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2422 = function22;
                        OutputTransformation outputTransformation522 = outputTransformation2;
                        BasicTextField(textFieldState, modifier422, z3, z4, inputTransformation422, textStyle3, keyboardOptions522, keyboardActionHandler2, textFieldLineLimits422, function2422, mutableInteractionSource2, brush2, null, outputTransformation522, textFieldDecorator2, scrollState2, false, composer2, i4 & 2147483646, i2822 | (i2922 & 7168) | (57344 & i2922) | (i2922 & 458752), 65536);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier422;
                        z5 = z3;
                        z6 = z4;
                        inputTransformation3 = inputTransformation422;
                        textStyle4 = textStyle3;
                        keyboardOptions4 = keyboardOptions522;
                        keyboardActionHandler3 = keyboardActionHandler2;
                        textFieldLineLimits3 = textFieldLineLimits422;
                        function23 = function2422;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        brush3 = brush2;
                        outputTransformation3 = outputTransformation522;
                        textFieldDecorator3 = textFieldDecorator2;
                        scrollState3 = scrollState2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
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
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    int i26222 = i17;
                    i20 = i3 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
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
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i28222 = (i23 & 14) | 384 | (i23 & 112);
                    int i29222 = i23 << 3;
                    Modifier modifier4222 = modifier2;
                    TextFieldLineLimits textFieldLineLimits4222 = textFieldLineLimits2;
                    composer2 = startRestartGroup;
                    InputTransformation inputTransformation4222 = inputTransformation2;
                    KeyboardOptions keyboardOptions5222 = keyboardOptions3;
                    Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24222 = function22;
                    OutputTransformation outputTransformation5222 = outputTransformation2;
                    BasicTextField(textFieldState, modifier4222, z3, z4, inputTransformation4222, textStyle3, keyboardOptions5222, keyboardActionHandler2, textFieldLineLimits4222, function24222, mutableInteractionSource2, brush2, null, outputTransformation5222, textFieldDecorator2, scrollState2, false, composer2, i4 & 2147483646, i28222 | (i29222 & 7168) | (57344 & i29222) | (i29222 & 458752), 65536);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4222;
                    z5 = z3;
                    z6 = z4;
                    inputTransformation3 = inputTransformation4222;
                    textStyle4 = textStyle3;
                    keyboardOptions4 = keyboardOptions5222;
                    keyboardActionHandler3 = keyboardActionHandler2;
                    textFieldLineLimits3 = textFieldLineLimits4222;
                    function23 = function24222;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    brush3 = brush2;
                    outputTransformation3 = outputTransformation5222;
                    textFieldDecorator3 = textFieldDecorator2;
                    scrollState3 = scrollState2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i7 = i3 & 16;
                int i252 = 8192;
                if (i7 == 0) {
                }
                inputTransformation2 = inputTransformation;
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
                i12 = i11;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                int i262222 = i17;
                i20 = i3 & 4096;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                if ((i2 & 24576) == 0) {
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
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i16 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 == 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i282222 = (i23 & 14) | 384 | (i23 & 112);
                int i292222 = i23 << 3;
                Modifier modifier42222 = modifier2;
                TextFieldLineLimits textFieldLineLimits42222 = textFieldLineLimits2;
                composer2 = startRestartGroup;
                InputTransformation inputTransformation42222 = inputTransformation2;
                KeyboardOptions keyboardOptions52222 = keyboardOptions3;
                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242222 = function22;
                OutputTransformation outputTransformation52222 = outputTransformation2;
                BasicTextField(textFieldState, modifier42222, z3, z4, inputTransformation42222, textStyle3, keyboardOptions52222, keyboardActionHandler2, textFieldLineLimits42222, function242222, mutableInteractionSource2, brush2, null, outputTransformation52222, textFieldDecorator2, scrollState2, false, composer2, i4 & 2147483646, i282222 | (i292222 & 7168) | (57344 & i292222) | (i292222 & 458752), 65536);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42222;
                z5 = z3;
                z6 = z4;
                inputTransformation3 = inputTransformation42222;
                textStyle4 = textStyle3;
                keyboardOptions4 = keyboardOptions52222;
                keyboardActionHandler3 = keyboardActionHandler2;
                textFieldLineLimits3 = textFieldLineLimits42222;
                function23 = function242222;
                mutableInteractionSource3 = mutableInteractionSource2;
                brush3 = brush2;
                outputTransformation3 = outputTransformation52222;
                textFieldDecorator3 = textFieldDecorator2;
                scrollState3 = scrollState2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z4 = z2;
            i7 = i3 & 16;
            int i2522 = 8192;
            if (i7 == 0) {
            }
            inputTransformation2 = inputTransformation;
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
            i12 = i11;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i2622222 = i17;
            i20 = i3 & 4096;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            if ((i2 & 24576) == 0) {
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
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i16 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 == 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i2822222 = (i23 & 14) | 384 | (i23 & 112);
            int i2922222 = i23 << 3;
            Modifier modifier422222 = modifier2;
            TextFieldLineLimits textFieldLineLimits422222 = textFieldLineLimits2;
            composer2 = startRestartGroup;
            InputTransformation inputTransformation422222 = inputTransformation2;
            KeyboardOptions keyboardOptions522222 = keyboardOptions3;
            Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2422222 = function22;
            OutputTransformation outputTransformation522222 = outputTransformation2;
            BasicTextField(textFieldState, modifier422222, z3, z4, inputTransformation422222, textStyle3, keyboardOptions522222, keyboardActionHandler2, textFieldLineLimits422222, function2422222, mutableInteractionSource2, brush2, null, outputTransformation522222, textFieldDecorator2, scrollState2, false, composer2, i4 & 2147483646, i2822222 | (i2922222 & 7168) | (57344 & i2922222) | (i2922222 & 458752), 65536);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422222;
            z5 = z3;
            z6 = z4;
            inputTransformation3 = inputTransformation422222;
            textStyle4 = textStyle3;
            keyboardOptions4 = keyboardOptions522222;
            keyboardActionHandler3 = keyboardActionHandler2;
            textFieldLineLimits3 = textFieldLineLimits422222;
            function23 = function2422222;
            mutableInteractionSource3 = mutableInteractionSource2;
            brush3 = brush2;
            outputTransformation3 = outputTransformation522222;
            textFieldDecorator3 = textFieldDecorator2;
            scrollState3 = scrollState2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z4 = z2;
        i7 = i3 & 16;
        int i25222 = 8192;
        if (i7 == 0) {
        }
        inputTransformation2 = inputTransformation;
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
        i12 = i11;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i26222222 = i17;
        i20 = i3 & 4096;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        if ((i2 & 24576) == 0) {
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
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i16 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i28222222 = (i23 & 14) | 384 | (i23 & 112);
        int i29222222 = i23 << 3;
        Modifier modifier4222222 = modifier2;
        TextFieldLineLimits textFieldLineLimits4222222 = textFieldLineLimits2;
        composer2 = startRestartGroup;
        InputTransformation inputTransformation4222222 = inputTransformation2;
        KeyboardOptions keyboardOptions5222222 = keyboardOptions3;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24222222 = function22;
        OutputTransformation outputTransformation5222222 = outputTransformation2;
        BasicTextField(textFieldState, modifier4222222, z3, z4, inputTransformation4222222, textStyle3, keyboardOptions5222222, keyboardActionHandler2, textFieldLineLimits4222222, function24222222, mutableInteractionSource2, brush2, null, outputTransformation5222222, textFieldDecorator2, scrollState2, false, composer2, i4 & 2147483646, i28222222 | (i29222222 & 7168) | (57344 & i29222222) | (i29222222 & 458752), 65536);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222222;
        z5 = z3;
        z6 = z4;
        inputTransformation3 = inputTransformation4222222;
        textStyle4 = textStyle3;
        keyboardOptions4 = keyboardOptions5222222;
        keyboardActionHandler3 = keyboardActionHandler2;
        textFieldLineLimits3 = textFieldLineLimits4222222;
        function23 = function24222222;
        mutableInteractionSource3 = mutableInteractionSource2;
        brush3 = brush2;
        outputTransformation3 = outputTransformation5222222;
        textFieldDecorator3 = textFieldDecorator2;
        scrollState3 = scrollState2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
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
        TextFieldLineLimits textFieldLineLimits2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        MutableInteractionSource mutableInteractionSource2;
        SolidColor cursorBrush;
        CodepointTransformation codepointTransformation2;
        ScrollState scrollState2;
        int i27;
        TextFieldDecorator textFieldDecorator2;
        OutputTransformation outputTransformation2;
        boolean z6;
        int i28;
        KeyboardActionHandler keyboardActionHandler2;
        Density density;
        boolean z7;
        WindowInfo windowInfo;
        MutableInteractionSource mutableInteractionSource3;
        boolean z8;
        Object rememberedValue;
        SingleLineCodepointTransformation singleLineCodepointTransformation;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        Density density2;
        boolean z9;
        boolean z10;
        boolean z11;
        final TextFieldSelectionState textFieldSelectionState;
        final InputTransformation inputTransformation3;
        boolean changed3;
        InputTransformation inputTransformation4;
        final TextFieldSelectionState textFieldSelectionState2;
        Object obj;
        boolean changedInstance;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m3316constructorimpl;
        Composer composer2;
        final InputTransformation inputTransformation5;
        final TextStyle textStyle3;
        final boolean z12;
        final MutableInteractionSource mutableInteractionSource4;
        final CodepointTransformation codepointTransformation3;
        final ScrollState scrollState3;
        final boolean z13;
        final TextFieldLineLimits textFieldLineLimits3;
        final boolean z14;
        final OutputTransformation outputTransformation3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        final KeyboardActionHandler keyboardActionHandler3;
        final KeyboardOptions keyboardOptions3;
        final TextFieldDecorator textFieldDecorator3;
        final Modifier modifier3;
        final Brush brush2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(965149429);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(15,9,3,13,4,16,7,10,8,11,5,1!1,12!1,14)234@12943L21,239@13149L7,240@13204L7,241@13249L7,247@13619L25,248@13693L25,251@13806L797,271@14801L48,273@14885L357,284@15295L7,285@15359L7,286@15413L7,287@15436L520,287@15425L531,303@16004L83,303@15962L125,342@17504L3096:BasicTextField.kt#423gt5");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i29 = i3 & 2;
        if (i29 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z;
                i4 |= startRestartGroup.changed(z4) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    z5 = z2;
                    i4 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        inputTransformation2 = inputTransformation;
                        i4 |= startRestartGroup.changed(inputTransformation2) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
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
                            i12 = i11;
                            i4 |= startRestartGroup.changed(textFieldLineLimits) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i13 = i3 & 512;
                            if (i13 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i14 = i13;
                                i4 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                                i15 = i3 & 1024;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= startRestartGroup.changed(brush) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i30 = i17;
                                i20 = i3 & 4096;
                                if (i20 != 0) {
                                    i21 = i30 | 384;
                                } else if ((i2 & 384) == 0) {
                                    i21 = i30 | (startRestartGroup.changed(codepointTransformation) ? 256 : 128);
                                } else {
                                    i21 = i30;
                                }
                                i22 = i3 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i31 = i21;
                                    if ((i2 & 3072) == 0) {
                                        i23 = i31 | (startRestartGroup.changed(outputTransformation) ? 2048 : 1024);
                                    } else {
                                        i23 = i31;
                                    }
                                }
                                i24 = i3 & 16384;
                                if (i24 != 0) {
                                    i25 = i23 | 24576;
                                } else {
                                    int i32 = i23;
                                    if ((i2 & 24576) == 0) {
                                        i25 = i32 | ((i2 & 32768) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 16384 : 8192);
                                    } else {
                                        i25 = i32;
                                    }
                                }
                                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i25 |= ((i3 & 32768) == 0 && startRestartGroup.changed(scrollState)) ? 131072 : 65536;
                                }
                                i26 = i3 & 65536;
                                if (i26 != 0) {
                                    i25 |= 1572864;
                                } else if ((i2 & 1572864) == 0) {
                                    i25 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                                }
                                int i33 = i25;
                                if ((i4 & 306783379) == 306783378 || (i33 & 599187) != 599186 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i29 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z4 = true;
                                        }
                                        if (i6 != 0) {
                                            z5 = false;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        if (i8 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        if (i9 != 0) {
                                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                        }
                                        KeyboardActionHandler keyboardActionHandler4 = i10 != 0 ? null : keyboardActionHandler;
                                        textFieldLineLimits2 = i12 != 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                        function22 = i14 != 0 ? null : function2;
                                        mutableInteractionSource2 = i16 != 0 ? null : mutableInteractionSource;
                                        cursorBrush = i19 != 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                        codepointTransformation2 = i20 != 0 ? null : codepointTransformation;
                                        OutputTransformation outputTransformation4 = i22 != 0 ? null : outputTransformation;
                                        TextFieldDecorator textFieldDecorator4 = i24 != 0 ? null : textFieldDecorator;
                                        KeyboardActionHandler keyboardActionHandler5 = keyboardActionHandler4;
                                        if ((i3 & 32768) != 0) {
                                            scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                            i27 = i33 & (-458753);
                                        } else {
                                            scrollState2 = scrollState;
                                            i27 = i33;
                                        }
                                        OutputTransformation outputTransformation5 = outputTransformation4;
                                        textFieldDecorator2 = textFieldDecorator4;
                                        outputTransformation2 = outputTransformation5;
                                        if (i26 != 0) {
                                            i28 = i27;
                                            z6 = false;
                                        } else {
                                            z6 = z3;
                                            i28 = i27;
                                        }
                                        keyboardActionHandler2 = keyboardActionHandler5;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32768) != 0) {
                                            textFieldLineLimits2 = textFieldLineLimits;
                                            function22 = function2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            cursorBrush = brush;
                                            codepointTransformation2 = codepointTransformation;
                                            outputTransformation2 = outputTransformation;
                                            textFieldDecorator2 = textFieldDecorator;
                                            scrollState2 = scrollState;
                                            z6 = z3;
                                            i28 = i33 & (-458753);
                                            keyboardActionHandler2 = keyboardActionHandler;
                                        } else {
                                            keyboardActionHandler2 = keyboardActionHandler;
                                            textFieldLineLimits2 = textFieldLineLimits;
                                            function22 = function2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            cursorBrush = brush;
                                            codepointTransformation2 = codepointTransformation;
                                            outputTransformation2 = outputTransformation;
                                            textFieldDecorator2 = textFieldDecorator;
                                            scrollState2 = scrollState;
                                            z6 = z3;
                                            i28 = i33;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    KeyboardActionHandler keyboardActionHandler6 = keyboardActionHandler2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(965149429, i4, i28, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:238)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    density = (Density) consume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                    z7 = z4;
                                    ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localWindowInfo);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    WindowInfo windowInfo2 = (WindowInfo) consume3;
                                    final boolean areEqual = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                                    final TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits2;
                                    if (mutableInteractionSource2 == null) {
                                        startRestartGroup.startReplaceGroup(96938805);
                                        ComposerKt.sourceInformation(startRestartGroup, "245@13454L39");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243798931, "CC(remember):BasicTextField.kt#9igjgp");
                                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                                        windowInfo = windowInfo2;
                                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource3 = (MutableInteractionSource) rememberedValue5;
                                    } else {
                                        windowInfo = windowInfo2;
                                        startRestartGroup.startReplaceGroup(-1243799582);
                                        startRestartGroup.endReplaceGroup();
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                    Orientation orientation = areEqual ? Orientation.Horizontal : Orientation.Vertical;
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                    final TextStyle textStyle4 = textStyle2;
                                    final boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, startRestartGroup, 0).getValue().booleanValue();
                                    final boolean booleanValue2 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource5, startRestartGroup, 0).getValue().booleanValue();
                                    final boolean isWindowFocused = windowInfo.isWindowFocused();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                                    int i34 = i28;
                                    z8 = ((i28 & 7168) == 2048) | ((i4 & 14) == 4) | ((i28 & 896) == 256);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
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
                                    TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                                    changed = startRestartGroup.changed(transformedTextFieldState);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new TextLayoutState();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    TextLayoutState textLayoutState = (TextLayoutState) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(transformedTextFieldState);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        boolean z15 = z5;
                                        boolean z16 = z6;
                                        rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState, textLayoutState, density, z7, z15, !booleanValue && isWindowFocused, z16);
                                        transformedTextFieldState = transformedTextFieldState;
                                        textLayoutState = textLayoutState;
                                        density2 = density;
                                        z9 = z7;
                                        z10 = z15;
                                        z11 = z16;
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    } else {
                                        density2 = density;
                                        z11 = z6;
                                        z10 = z5;
                                        z9 = z7;
                                    }
                                    textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    OutputTransformation outputTransformation6 = outputTransformation2;
                                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                                    inputTransformation3 = inputTransformation2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume4 = startRestartGroup.consume(localHapticFeedback);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final HapticFeedback hapticFeedback = (HapticFeedback) consume4;
                                    final TextLayoutState textLayoutState2 = textLayoutState;
                                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume5 = startRestartGroup.consume(localClipboardManager);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final ClipboardManager clipboardManager = (ClipboardManager) consume5;
                                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = function22;
                                    ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume6 = startRestartGroup.consume(localTextToolbar);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final TextToolbar textToolbar = (TextToolbar) consume6;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                                    changed3 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback) | startRestartGroup.changedInstance(clipboardManager) | startRestartGroup.changedInstance(textToolbar) | startRestartGroup.changed(density2) | ((i4 & 7168) == 2048) | ((i34 & 3670016) == 1048576);
                                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        final Density density3 = density2;
                                        final TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                                        final boolean z17 = z9;
                                        final boolean z18 = z10;
                                        final boolean z19 = z11;
                                        Object obj2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                                                TransformedTextFieldState.this.update(inputTransformation3);
                                                textFieldSelectionState.update(hapticFeedback, clipboardManager, textToolbar, density3, z17, z18, z19);
                                            }
                                        };
                                        inputTransformation4 = inputTransformation3;
                                        textFieldSelectionState2 = textFieldSelectionState;
                                        obj = (Function0) obj2;
                                        startRestartGroup.updateRememberedValue(obj);
                                    } else {
                                        textFieldSelectionState2 = textFieldSelectionState;
                                        obj = rememberedValue6;
                                        inputTransformation4 = inputTransformation3;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.SideEffect((Function0) obj, startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                                    changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final TextFieldSelectionState textFieldSelectionState3 = TextFieldSelectionState.this;
                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        TextFieldSelectionState.this.dispose();
                                                    }
                                                };
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
                                    final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2;
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                    final Orientation orientation2 = orientation;
                                    Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState2, textFieldSelectionState3, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler6, areEqual, mutableInteractionSource6)), z9, mutableInteractionSource6), scrollState2, orientation2, !z9 && textFieldSelectionState3.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation, false), null, mutableInteractionSource6, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
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
                                    m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                                    Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                                    final TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState;
                                    final boolean z20 = z9;
                                    final TextFieldDecorator textFieldDecorator5 = textFieldDecorator2;
                                    final Brush brush3 = cursorBrush;
                                    final ScrollState scrollState4 = scrollState2;
                                    final boolean z21 = z10;
                                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState3, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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
                                            ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                            if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                                }
                                                TextFieldDecorator textFieldDecorator6 = TextFieldDecorator.this;
                                                if (textFieldDecorator6 == null) {
                                                    textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                                }
                                                final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits4;
                                                final TextLayoutState textLayoutState3 = textLayoutState2;
                                                final TextStyle textStyle5 = textStyle4;
                                                final boolean z22 = booleanValue;
                                                final boolean z23 = isWindowFocused;
                                                final boolean z24 = booleanValue2;
                                                final TransformedTextFieldState transformedTextFieldState4 = transformedTextFieldState3;
                                                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState3;
                                                final Brush brush4 = brush3;
                                                final boolean z25 = z20;
                                                final boolean z26 = z21;
                                                final ScrollState scrollState5 = scrollState4;
                                                final Orientation orientation3 = orientation2;
                                                final boolean z27 = areEqual;
                                                final Function2<Density, Function0<TextLayoutResult>, Unit> function25 = function24;
                                                textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i36) {
                                                        int i37;
                                                        int i38;
                                                        ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                                        if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                            }
                                                            TextFieldLineLimits textFieldLineLimits6 = TextFieldLineLimits.this;
                                                            if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                                                i37 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                                                i38 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                                            } else {
                                                                i37 = 1;
                                                                i38 = 1;
                                                            }
                                                            Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m706heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState3.m1202getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, i37, i38), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState3, transformedTextFieldState4, textFieldSelectionState4, brush4, z25 && !z26, scrollState5, orientation3));
                                                            TextLayoutState textLayoutState4 = textLayoutState3;
                                                            TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState4;
                                                            TextStyle textStyle6 = textStyle5;
                                                            boolean z28 = z27;
                                                            Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                            boolean z29 = z25;
                                                            boolean z30 = z22;
                                                            boolean z31 = z23;
                                                            TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                                            boolean z32 = z26;
                                                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, then);
                                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor2);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer4);
                                                            Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            Updater.m3323setimpl(m3316constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                            BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                                            if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                                                composer4.startReplaceGroup(-1325530694);
                                                                ComposerKt.sourceInformation(composer4, "398@20188L121");
                                                                BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                                                if (!z32) {
                                                                    composer4.startReplaceGroup(-1325351669);
                                                                    ComposerKt.sourceInformation(composer4, "402@20379L125");
                                                                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                                                    composer4.endReplaceGroup();
                                                                } else {
                                                                    composer4.startReplaceGroup(-1325177728);
                                                                    composer4.endReplaceGroup();
                                                                }
                                                                composer4.endReplaceGroup();
                                                            } else {
                                                                composer4.startReplaceGroup(-1325155904);
                                                                composer4.endReplaceGroup();
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            composer4.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
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
                                    composer2 = startRestartGroup;
                                    inputTransformation5 = inputTransformation4;
                                    textStyle3 = textStyle4;
                                    z12 = z9;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    codepointTransformation3 = codepointTransformation2;
                                    scrollState3 = scrollState2;
                                    z13 = z10;
                                    textFieldLineLimits3 = textFieldLineLimits4;
                                    z14 = z11;
                                    outputTransformation3 = outputTransformation6;
                                    function23 = function24;
                                    keyboardActionHandler3 = keyboardActionHandler6;
                                    keyboardOptions3 = keyboardOptions2;
                                    textFieldDecorator3 = textFieldDecorator5;
                                    modifier3 = modifier2;
                                    brush2 = cursorBrush;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    textFieldLineLimits3 = textFieldLineLimits;
                                    codepointTransformation3 = codepointTransformation;
                                    scrollState3 = scrollState;
                                    z14 = z3;
                                    composer2 = startRestartGroup;
                                    inputTransformation5 = inputTransformation2;
                                    z12 = z4;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier2;
                                    z13 = z5;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                    function23 = function2;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    brush2 = brush;
                                    outputTransformation3 = outputTransformation;
                                    textFieldDecorator3 = textFieldDecorator;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
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
                                            BasicTextFieldKt.BasicTextField(TextFieldState.this, modifier3, z12, z13, inputTransformation5, textStyle3, keyboardOptions3, keyboardActionHandler3, textFieldLineLimits3, function23, mutableInteractionSource4, brush2, codepointTransformation3, outputTransformation3, textFieldDecorator3, scrollState3, z14, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i3 & 2048;
                            if (i18 != 0) {
                            }
                            int i302 = i17;
                            i20 = i3 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 8192;
                            if (i22 != 0) {
                            }
                            i24 = i3 & 16384;
                            if (i24 != 0) {
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            i26 = i3 & 65536;
                            if (i26 != 0) {
                            }
                            int i332 = i25;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i29 != 0) {
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
                            if (i12 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            KeyboardActionHandler keyboardActionHandler52 = keyboardActionHandler4;
                            if ((i3 & 32768) != 0) {
                            }
                            OutputTransformation outputTransformation52 = outputTransformation4;
                            textFieldDecorator2 = textFieldDecorator4;
                            outputTransformation2 = outputTransformation52;
                            if (i26 != 0) {
                            }
                            keyboardActionHandler2 = keyboardActionHandler52;
                            startRestartGroup.endDefaults();
                            KeyboardActionHandler keyboardActionHandler62 = keyboardActionHandler2;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume7 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            density = (Density) consume7;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                            z7 = z4;
                            ProvidableCompositionLocal<WindowInfo> localWindowInfo2 = CompositionLocalsKt.getLocalWindowInfo();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume32 = startRestartGroup.consume(localWindowInfo2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            WindowInfo windowInfo22 = (WindowInfo) consume32;
                            final boolean areEqual2 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                            final TextFieldLineLimits textFieldLineLimits42 = textFieldLineLimits2;
                            if (mutableInteractionSource2 == null) {
                            }
                            if (areEqual2) {
                            }
                            MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                            final TextStyle textStyle42 = textStyle2;
                            final boolean booleanValue3 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource52, startRestartGroup, 0).getValue().booleanValue();
                            final boolean booleanValue22 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource52, startRestartGroup, 0).getValue().booleanValue();
                            final boolean isWindowFocused2 = windowInfo.isWindowFocused();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                            int i342 = i28;
                            z8 = ((i28 & 7168) == 2048) | ((i4 & 14) == 4) | ((i28 & 896) == 256);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z8) {
                            }
                            if (codepointTransformation2 == null) {
                            }
                            rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            TransformedTextFieldState transformedTextFieldState4 = (TransformedTextFieldState) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                            changed = startRestartGroup.changed(transformedTextFieldState4);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue2 = new TextLayoutState();
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            TextLayoutState textLayoutState3 = (TextLayoutState) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                            changed2 = startRestartGroup.changed(transformedTextFieldState4);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed2) {
                            }
                            boolean z152 = z5;
                            boolean z162 = z6;
                            rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState4, textLayoutState3, density, z7, z152, !booleanValue3 && isWindowFocused2, z162);
                            transformedTextFieldState4 = transformedTextFieldState4;
                            textLayoutState3 = textLayoutState3;
                            density2 = density;
                            z9 = z7;
                            z10 = z152;
                            z11 = z162;
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            OutputTransformation outputTransformation62 = outputTransformation2;
                            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                            inputTransformation3 = inputTransformation2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume42 = startRestartGroup.consume(localHapticFeedback2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final HapticFeedback hapticFeedback2 = (HapticFeedback) consume42;
                            final TextLayoutState textLayoutState22 = textLayoutState3;
                            ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume52 = startRestartGroup.consume(localClipboardManager2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final ClipboardManager clipboardManager2 = (ClipboardManager) consume52;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242 = function22;
                            ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume62 = startRestartGroup.consume(localTextToolbar2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final TextToolbar textToolbar2 = (TextToolbar) consume62;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                            changed3 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState4) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback2) | startRestartGroup.changedInstance(clipboardManager2) | startRestartGroup.changedInstance(textToolbar2) | startRestartGroup.changed(density2) | ((i4 & 7168) == 2048) | ((i342 & 3670016) == 1048576);
                            Object rememberedValue62 = startRestartGroup.rememberedValue();
                            if (changed3) {
                            }
                            final Density density32 = density2;
                            final TransformedTextFieldState transformedTextFieldState22 = transformedTextFieldState4;
                            final boolean z172 = z9;
                            final boolean z182 = z10;
                            final boolean z192 = z11;
                            Object obj22 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                                    TransformedTextFieldState.this.update(inputTransformation3);
                                    textFieldSelectionState.update(hapticFeedback2, clipboardManager2, textToolbar2, density32, z172, z182, z192);
                                }
                            };
                            inputTransformation4 = inputTransformation3;
                            textFieldSelectionState2 = textFieldSelectionState;
                            obj = (Function0) obj22;
                            startRestartGroup.updateRememberedValue(obj);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.SideEffect((Function0) obj, startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                            changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    final TextFieldSelectionState textFieldSelectionState32 = TextFieldSelectionState.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            TextFieldSelectionState.this.dispose();
                                        }
                                    };
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
                            final TextFieldSelectionState textFieldSelectionState32 = textFieldSelectionState2;
                            MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource3;
                            final Orientation orientation22 = orientation;
                            Modifier pointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState4, textLayoutState22, textFieldSelectionState32, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler62, areEqual2, mutableInteractionSource62)), z9, mutableInteractionSource62), scrollState2, orientation22, !z9 && textFieldSelectionState32.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection2, orientation, false), null, mutableInteractionSource62, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
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
                            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                            Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3316constructorimpl.getInserting()) {
                            }
                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                            final TransformedTextFieldState transformedTextFieldState32 = transformedTextFieldState4;
                            final boolean z202 = z9;
                            final TextFieldDecorator textFieldDecorator52 = textFieldDecorator2;
                            final Brush brush32 = cursorBrush;
                            final ScrollState scrollState42 = scrollState2;
                            final boolean z212 = z10;
                            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState32, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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
                                    ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                    if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                        }
                                        TextFieldDecorator textFieldDecorator6 = TextFieldDecorator.this;
                                        if (textFieldDecorator6 == null) {
                                            textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                        }
                                        final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits42;
                                        final TextLayoutState textLayoutState32 = textLayoutState22;
                                        final TextStyle textStyle5 = textStyle42;
                                        final boolean z22 = booleanValue3;
                                        final boolean z23 = isWindowFocused2;
                                        final boolean z24 = booleanValue22;
                                        final TransformedTextFieldState transformedTextFieldState42 = transformedTextFieldState32;
                                        final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState32;
                                        final Brush brush4 = brush32;
                                        final boolean z25 = z202;
                                        final boolean z26 = z212;
                                        final ScrollState scrollState5 = scrollState42;
                                        final Orientation orientation3 = orientation22;
                                        final boolean z27 = areEqual2;
                                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function242;
                                        textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i36) {
                                                int i37;
                                                int i38;
                                                ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                                if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                    }
                                                    TextFieldLineLimits textFieldLineLimits6 = TextFieldLineLimits.this;
                                                    if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                                        i37 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                                        i38 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                                    } else {
                                                        i37 = 1;
                                                        i38 = 1;
                                                    }
                                                    Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m706heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState32.m1202getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, i37, i38), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState32, transformedTextFieldState42, textFieldSelectionState4, brush4, z25 && !z26, scrollState5, orientation3));
                                                    TextLayoutState textLayoutState4 = textLayoutState32;
                                                    TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState42;
                                                    TextStyle textStyle6 = textStyle5;
                                                    boolean z28 = z27;
                                                    Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                    boolean z29 = z25;
                                                    boolean z30 = z22;
                                                    boolean z31 = z23;
                                                    TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                                    boolean z32 = z26;
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer4, then);
                                                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor22);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer4);
                                                    Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                                    }
                                                    Updater.m3323setimpl(m3316constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                    BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                                    if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                                        composer4.startReplaceGroup(-1325530694);
                                                        ComposerKt.sourceInformation(composer4, "398@20188L121");
                                                        BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                                        if (!z32) {
                                                            composer4.startReplaceGroup(-1325351669);
                                                            ComposerKt.sourceInformation(composer4, "402@20379L125");
                                                            BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                                            composer4.endReplaceGroup();
                                                        } else {
                                                            composer4.startReplaceGroup(-1325177728);
                                                            composer4.endReplaceGroup();
                                                        }
                                                        composer4.endReplaceGroup();
                                                    } else {
                                                        composer4.startReplaceGroup(-1325155904);
                                                        composer4.endReplaceGroup();
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    composer4.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }, composer3, 54), composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
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
                            composer2 = startRestartGroup;
                            inputTransformation5 = inputTransformation4;
                            textStyle3 = textStyle42;
                            z12 = z9;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            codepointTransformation3 = codepointTransformation2;
                            scrollState3 = scrollState2;
                            z13 = z10;
                            textFieldLineLimits3 = textFieldLineLimits42;
                            z14 = z11;
                            outputTransformation3 = outputTransformation62;
                            function23 = function242;
                            keyboardActionHandler3 = keyboardActionHandler62;
                            keyboardOptions3 = keyboardOptions2;
                            textFieldDecorator3 = textFieldDecorator52;
                            modifier3 = modifier2;
                            brush2 = cursorBrush;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                        }
                        int i3022 = i17;
                        i20 = i3 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                        }
                        i24 = i3 & 16384;
                        if (i24 != 0) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i26 = i3 & 65536;
                        if (i26 != 0) {
                        }
                        int i3322 = i25;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i29 != 0) {
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
                        if (i12 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        KeyboardActionHandler keyboardActionHandler522 = keyboardActionHandler4;
                        if ((i3 & 32768) != 0) {
                        }
                        OutputTransformation outputTransformation522 = outputTransformation4;
                        textFieldDecorator2 = textFieldDecorator4;
                        outputTransformation2 = outputTransformation522;
                        if (i26 != 0) {
                        }
                        keyboardActionHandler2 = keyboardActionHandler522;
                        startRestartGroup.endDefaults();
                        KeyboardActionHandler keyboardActionHandler622 = keyboardActionHandler2;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume72 = startRestartGroup.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        density = (Density) consume72;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
                        z7 = z4;
                        ProvidableCompositionLocal<WindowInfo> localWindowInfo22 = CompositionLocalsKt.getLocalWindowInfo();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume322 = startRestartGroup.consume(localWindowInfo22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        WindowInfo windowInfo222 = (WindowInfo) consume322;
                        final boolean areEqual22 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                        final TextFieldLineLimits textFieldLineLimits422 = textFieldLineLimits2;
                        if (mutableInteractionSource2 == null) {
                        }
                        if (areEqual22) {
                        }
                        MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                        final TextStyle textStyle422 = textStyle2;
                        final boolean booleanValue32 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource522, startRestartGroup, 0).getValue().booleanValue();
                        final boolean booleanValue222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource522, startRestartGroup, 0).getValue().booleanValue();
                        final boolean isWindowFocused22 = windowInfo.isWindowFocused();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                        int i3422 = i28;
                        z8 = ((i28 & 7168) == 2048) | ((i4 & 14) == 4) | ((i28 & 896) == 256);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z8) {
                        }
                        if (codepointTransformation2 == null) {
                        }
                        rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        TransformedTextFieldState transformedTextFieldState42 = (TransformedTextFieldState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                        changed = startRestartGroup.changed(transformedTextFieldState42);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = new TextLayoutState();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        TextLayoutState textLayoutState32 = (TextLayoutState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transformedTextFieldState42);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed2) {
                        }
                        boolean z1522 = z5;
                        boolean z1622 = z6;
                        rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState42, textLayoutState32, density, z7, z1522, !booleanValue32 && isWindowFocused22, z1622);
                        transformedTextFieldState42 = transformedTextFieldState42;
                        textLayoutState32 = textLayoutState32;
                        density2 = density;
                        z9 = z7;
                        z10 = z1522;
                        z11 = z1622;
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        OutputTransformation outputTransformation622 = outputTransformation2;
                        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22 = CompositionLocalsKt.getLocalHapticFeedback();
                        inputTransformation3 = inputTransformation2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume422 = startRestartGroup.consume(localHapticFeedback22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final HapticFeedback hapticFeedback22 = (HapticFeedback) consume422;
                        final TextLayoutState textLayoutState222 = textLayoutState32;
                        ProvidableCompositionLocal<ClipboardManager> localClipboardManager22 = CompositionLocalsKt.getLocalClipboardManager();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume522 = startRestartGroup.consume(localClipboardManager22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final ClipboardManager clipboardManager22 = (ClipboardManager) consume522;
                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2422 = function22;
                        ProvidableCompositionLocal<TextToolbar> localTextToolbar22 = CompositionLocalsKt.getLocalTextToolbar();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume622 = startRestartGroup.consume(localTextToolbar22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final TextToolbar textToolbar22 = (TextToolbar) consume622;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                        changed3 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState42) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback22) | startRestartGroup.changedInstance(clipboardManager22) | startRestartGroup.changedInstance(textToolbar22) | startRestartGroup.changed(density2) | ((i4 & 7168) == 2048) | ((i3422 & 3670016) == 1048576);
                        Object rememberedValue622 = startRestartGroup.rememberedValue();
                        if (changed3) {
                        }
                        final Density density322 = density2;
                        final TransformedTextFieldState transformedTextFieldState222 = transformedTextFieldState42;
                        final boolean z1722 = z9;
                        final boolean z1822 = z10;
                        final boolean z1922 = z11;
                        Object obj222 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                                TransformedTextFieldState.this.update(inputTransformation3);
                                textFieldSelectionState.update(hapticFeedback22, clipboardManager22, textToolbar22, density322, z1722, z1822, z1922);
                            }
                        };
                        inputTransformation4 = inputTransformation3;
                        textFieldSelectionState2 = textFieldSelectionState;
                        obj = (Function0) obj222;
                        startRestartGroup.updateRememberedValue(obj);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.SideEffect((Function0) obj, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final TextFieldSelectionState textFieldSelectionState322 = TextFieldSelectionState.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        TextFieldSelectionState.this.dispose();
                                    }
                                };
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
                        final TextFieldSelectionState textFieldSelectionState322 = textFieldSelectionState2;
                        MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource3;
                        final Orientation orientation222 = orientation;
                        Modifier pointerHoverIcon$default22 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState42, textLayoutState222, textFieldSelectionState322, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler622, areEqual22, mutableInteractionSource622)), z9, mutableInteractionSource622), scrollState2, orientation222, !z9 && textFieldSelectionState322.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection22, orientation, false), null, mutableInteractionSource622, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
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
                        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                        Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3316constructorimpl.getInserting()) {
                        }
                        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                        final TransformedTextFieldState transformedTextFieldState322 = transformedTextFieldState42;
                        final boolean z2022 = z9;
                        final TextFieldDecorator textFieldDecorator522 = textFieldDecorator2;
                        final Brush brush322 = cursorBrush;
                        final ScrollState scrollState422 = scrollState2;
                        final boolean z2122 = z10;
                        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState322, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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
                                ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                    }
                                    TextFieldDecorator textFieldDecorator6 = TextFieldDecorator.this;
                                    if (textFieldDecorator6 == null) {
                                        textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                    }
                                    final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits422;
                                    final TextLayoutState textLayoutState322 = textLayoutState222;
                                    final TextStyle textStyle5 = textStyle422;
                                    final boolean z22 = booleanValue32;
                                    final boolean z23 = isWindowFocused22;
                                    final boolean z24 = booleanValue222;
                                    final TransformedTextFieldState transformedTextFieldState422 = transformedTextFieldState322;
                                    final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState322;
                                    final Brush brush4 = brush322;
                                    final boolean z25 = z2022;
                                    final boolean z26 = z2122;
                                    final ScrollState scrollState5 = scrollState422;
                                    final Orientation orientation3 = orientation222;
                                    final boolean z27 = areEqual22;
                                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function2422;
                                    textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i36) {
                                            int i37;
                                            int i38;
                                            ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                            if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                }
                                                TextFieldLineLimits textFieldLineLimits6 = TextFieldLineLimits.this;
                                                if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                                    i37 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                                    i38 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                                } else {
                                                    i37 = 1;
                                                    i38 = 1;
                                                }
                                                Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m706heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState322.m1202getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, i37, i38), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState322, transformedTextFieldState422, textFieldSelectionState4, brush4, z25 && !z26, scrollState5, orientation3));
                                                TextLayoutState textLayoutState4 = textLayoutState322;
                                                TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState422;
                                                TextStyle textStyle6 = textStyle5;
                                                boolean z28 = z27;
                                                Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                boolean z29 = z25;
                                                boolean z30 = z22;
                                                boolean z31 = z23;
                                                TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                                boolean z32 = z26;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap222 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer4, then);
                                                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor222);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer4);
                                                Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                                }
                                                Updater.m3323setimpl(m3316constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                                if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                                    composer4.startReplaceGroup(-1325530694);
                                                    ComposerKt.sourceInformation(composer4, "398@20188L121");
                                                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                                    if (!z32) {
                                                        composer4.startReplaceGroup(-1325351669);
                                                        ComposerKt.sourceInformation(composer4, "402@20379L125");
                                                        BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                                        composer4.endReplaceGroup();
                                                    } else {
                                                        composer4.startReplaceGroup(-1325177728);
                                                        composer4.endReplaceGroup();
                                                    }
                                                    composer4.endReplaceGroup();
                                                } else {
                                                    composer4.startReplaceGroup(-1325155904);
                                                    composer4.endReplaceGroup();
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
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
                        composer2 = startRestartGroup;
                        inputTransformation5 = inputTransformation4;
                        textStyle3 = textStyle422;
                        z12 = z9;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        codepointTransformation3 = codepointTransformation2;
                        scrollState3 = scrollState2;
                        z13 = z10;
                        textFieldLineLimits3 = textFieldLineLimits422;
                        z14 = z11;
                        outputTransformation3 = outputTransformation622;
                        function23 = function2422;
                        keyboardActionHandler3 = keyboardActionHandler622;
                        keyboardOptions3 = keyboardOptions2;
                        textFieldDecorator3 = textFieldDecorator522;
                        modifier3 = modifier2;
                        brush2 = cursorBrush;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
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
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    int i30222 = i17;
                    i20 = i3 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i3 & 16384;
                    if (i24 != 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i26 = i3 & 65536;
                    if (i26 != 0) {
                    }
                    int i33222 = i25;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i29 != 0) {
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
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    KeyboardActionHandler keyboardActionHandler5222 = keyboardActionHandler4;
                    if ((i3 & 32768) != 0) {
                    }
                    OutputTransformation outputTransformation5222 = outputTransformation4;
                    textFieldDecorator2 = textFieldDecorator4;
                    outputTransformation2 = outputTransformation5222;
                    if (i26 != 0) {
                    }
                    keyboardActionHandler2 = keyboardActionHandler5222;
                    startRestartGroup.endDefaults();
                    KeyboardActionHandler keyboardActionHandler6222 = keyboardActionHandler2;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume722 = startRestartGroup.consume(localDensity222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    density = (Density) consume722;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
                    z7 = z4;
                    ProvidableCompositionLocal<WindowInfo> localWindowInfo222 = CompositionLocalsKt.getLocalWindowInfo();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume3222 = startRestartGroup.consume(localWindowInfo222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    WindowInfo windowInfo2222 = (WindowInfo) consume3222;
                    final boolean areEqual222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                    final TextFieldLineLimits textFieldLineLimits4222 = textFieldLineLimits2;
                    if (mutableInteractionSource2 == null) {
                    }
                    if (areEqual222) {
                    }
                    MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
                    final TextStyle textStyle4222 = textStyle2;
                    final boolean booleanValue322 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5222, startRestartGroup, 0).getValue().booleanValue();
                    final boolean booleanValue2222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource5222, startRestartGroup, 0).getValue().booleanValue();
                    final boolean isWindowFocused222 = windowInfo.isWindowFocused();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                    int i34222 = i28;
                    z8 = ((i28 & 7168) == 2048) | ((i4 & 14) == 4) | ((i28 & 896) == 256);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z8) {
                    }
                    if (codepointTransformation2 == null) {
                    }
                    rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    TransformedTextFieldState transformedTextFieldState422 = (TransformedTextFieldState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                    changed = startRestartGroup.changed(transformedTextFieldState422);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new TextLayoutState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    TextLayoutState textLayoutState322 = (TextLayoutState) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transformedTextFieldState422);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    boolean z15222 = z5;
                    boolean z16222 = z6;
                    rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState422, textLayoutState322, density, z7, z15222, !booleanValue322 && isWindowFocused222, z16222);
                    transformedTextFieldState422 = transformedTextFieldState422;
                    textLayoutState322 = textLayoutState322;
                    density2 = density;
                    z9 = z7;
                    z10 = z15222;
                    z11 = z16222;
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    OutputTransformation outputTransformation6222 = outputTransformation2;
                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222 = CompositionLocalsKt.getLocalHapticFeedback();
                    inputTransformation3 = inputTransformation2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume4222 = startRestartGroup.consume(localHapticFeedback222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final HapticFeedback hapticFeedback222 = (HapticFeedback) consume4222;
                    final TextLayoutState textLayoutState2222 = textLayoutState322;
                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager222 = CompositionLocalsKt.getLocalClipboardManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5222 = startRestartGroup.consume(localClipboardManager222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final ClipboardManager clipboardManager222 = (ClipboardManager) consume5222;
                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24222 = function22;
                    ProvidableCompositionLocal<TextToolbar> localTextToolbar222 = CompositionLocalsKt.getLocalTextToolbar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume6222 = startRestartGroup.consume(localTextToolbar222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TextToolbar textToolbar222 = (TextToolbar) consume6222;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                    changed3 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState422) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback222) | startRestartGroup.changedInstance(clipboardManager222) | startRestartGroup.changedInstance(textToolbar222) | startRestartGroup.changed(density2) | ((i4 & 7168) == 2048) | ((i34222 & 3670016) == 1048576);
                    Object rememberedValue6222 = startRestartGroup.rememberedValue();
                    if (changed3) {
                    }
                    final Density density3222 = density2;
                    final TransformedTextFieldState transformedTextFieldState2222 = transformedTextFieldState422;
                    final boolean z17222 = z9;
                    final boolean z18222 = z10;
                    final boolean z19222 = z11;
                    Object obj2222 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                            TransformedTextFieldState.this.update(inputTransformation3);
                            textFieldSelectionState.update(hapticFeedback222, clipboardManager222, textToolbar222, density3222, z17222, z18222, z19222);
                        }
                    };
                    inputTransformation4 = inputTransformation3;
                    textFieldSelectionState2 = textFieldSelectionState;
                    obj = (Function0) obj2222;
                    startRestartGroup.updateRememberedValue(obj);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) obj, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final TextFieldSelectionState textFieldSelectionState3222 = TextFieldSelectionState.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    TextFieldSelectionState.this.dispose();
                                }
                            };
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
                    final TextFieldSelectionState textFieldSelectionState3222 = textFieldSelectionState2;
                    MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource3;
                    final Orientation orientation2222 = orientation;
                    Modifier pointerHoverIcon$default222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState422, textLayoutState2222, textFieldSelectionState3222, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler6222, areEqual222, mutableInteractionSource6222)), z9, mutableInteractionSource6222), scrollState2, orientation2222, !z9 && textFieldSelectionState3222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection222, orientation, false), null, mutableInteractionSource6222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
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
                    m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                    Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3316constructorimpl.getInserting()) {
                    }
                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                    Updater.m3323setimpl(m3316constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                    final TransformedTextFieldState transformedTextFieldState3222 = transformedTextFieldState422;
                    final boolean z20222 = z9;
                    final TextFieldDecorator textFieldDecorator5222 = textFieldDecorator2;
                    final Brush brush3222 = cursorBrush;
                    final ScrollState scrollState4222 = scrollState2;
                    final boolean z21222 = z10;
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState3222, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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
                            ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                            if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                }
                                TextFieldDecorator textFieldDecorator6 = TextFieldDecorator.this;
                                if (textFieldDecorator6 == null) {
                                    textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                }
                                final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits4222;
                                final TextLayoutState textLayoutState3222 = textLayoutState2222;
                                final TextStyle textStyle5 = textStyle4222;
                                final boolean z22 = booleanValue322;
                                final boolean z23 = isWindowFocused222;
                                final boolean z24 = booleanValue2222;
                                final TransformedTextFieldState transformedTextFieldState4222 = transformedTextFieldState3222;
                                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState3222;
                                final Brush brush4 = brush3222;
                                final boolean z25 = z20222;
                                final boolean z26 = z21222;
                                final ScrollState scrollState5 = scrollState4222;
                                final Orientation orientation3 = orientation2222;
                                final boolean z27 = areEqual222;
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function24222;
                                textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i36) {
                                        int i37;
                                        int i38;
                                        ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                        if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                            }
                                            TextFieldLineLimits textFieldLineLimits6 = TextFieldLineLimits.this;
                                            if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                                i37 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                                i38 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                            } else {
                                                i37 = 1;
                                                i38 = 1;
                                            }
                                            Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m706heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState3222.m1202getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, i37, i38), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState3222, transformedTextFieldState4222, textFieldSelectionState4, brush4, z25 && !z26, scrollState5, orientation3));
                                            TextLayoutState textLayoutState4 = textLayoutState3222;
                                            TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState4222;
                                            TextStyle textStyle6 = textStyle5;
                                            boolean z28 = z27;
                                            Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                            boolean z29 = z25;
                                            boolean z30 = z22;
                                            boolean z31 = z23;
                                            TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                            boolean z32 = z26;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2222 = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer4, then);
                                            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2222);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer4);
                                            Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                                            }
                                            Updater.m3323setimpl(m3316constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                            BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                            if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                                composer4.startReplaceGroup(-1325530694);
                                                ComposerKt.sourceInformation(composer4, "398@20188L121");
                                                BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                                if (!z32) {
                                                    composer4.startReplaceGroup(-1325351669);
                                                    ComposerKt.sourceInformation(composer4, "402@20379L125");
                                                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                                    composer4.endReplaceGroup();
                                                } else {
                                                    composer4.startReplaceGroup(-1325177728);
                                                    composer4.endReplaceGroup();
                                                }
                                                composer4.endReplaceGroup();
                                            } else {
                                                composer4.startReplaceGroup(-1325155904);
                                                composer4.endReplaceGroup();
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
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
                    composer2 = startRestartGroup;
                    inputTransformation5 = inputTransformation4;
                    textStyle3 = textStyle4222;
                    z12 = z9;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    codepointTransformation3 = codepointTransformation2;
                    scrollState3 = scrollState2;
                    z13 = z10;
                    textFieldLineLimits3 = textFieldLineLimits4222;
                    z14 = z11;
                    outputTransformation3 = outputTransformation6222;
                    function23 = function24222;
                    keyboardActionHandler3 = keyboardActionHandler6222;
                    keyboardOptions3 = keyboardOptions2;
                    textFieldDecorator3 = textFieldDecorator5222;
                    modifier3 = modifier2;
                    brush2 = cursorBrush;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                inputTransformation2 = inputTransformation;
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
                i12 = i11;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                int i302222 = i17;
                i20 = i3 & 4096;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                i24 = i3 & 16384;
                if (i24 != 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i26 = i3 & 65536;
                if (i26 != 0) {
                }
                int i332222 = i25;
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i29 != 0) {
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
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i16 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 != 0) {
                }
                if (i24 != 0) {
                }
                KeyboardActionHandler keyboardActionHandler52222 = keyboardActionHandler4;
                if ((i3 & 32768) != 0) {
                }
                OutputTransformation outputTransformation52222 = outputTransformation4;
                textFieldDecorator2 = textFieldDecorator4;
                outputTransformation2 = outputTransformation52222;
                if (i26 != 0) {
                }
                keyboardActionHandler2 = keyboardActionHandler52222;
                startRestartGroup.endDefaults();
                KeyboardActionHandler keyboardActionHandler62222 = keyboardActionHandler2;
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume7222 = startRestartGroup.consume(localDensity2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                density = (Density) consume7222;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2222 = (LayoutDirection) consume22222;
                z7 = z4;
                ProvidableCompositionLocal<WindowInfo> localWindowInfo2222 = CompositionLocalsKt.getLocalWindowInfo();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume32222 = startRestartGroup.consume(localWindowInfo2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                WindowInfo windowInfo22222 = (WindowInfo) consume32222;
                final boolean areEqual2222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                final TextFieldLineLimits textFieldLineLimits42222 = textFieldLineLimits2;
                if (mutableInteractionSource2 == null) {
                }
                if (areEqual2222) {
                }
                MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
                final TextStyle textStyle42222 = textStyle2;
                final boolean booleanValue3222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource52222, startRestartGroup, 0).getValue().booleanValue();
                final boolean booleanValue22222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource52222, startRestartGroup, 0).getValue().booleanValue();
                final boolean isWindowFocused2222 = windowInfo.isWindowFocused();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                int i342222 = i28;
                z8 = ((i28 & 7168) == 2048) | ((i4 & 14) == 4) | ((i28 & 896) == 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z8) {
                }
                if (codepointTransformation2 == null) {
                }
                rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                startRestartGroup.updateRememberedValue(rememberedValue);
                TransformedTextFieldState transformedTextFieldState4222 = (TransformedTextFieldState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                changed = startRestartGroup.changed(transformedTextFieldState4222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new TextLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue2);
                TextLayoutState textLayoutState3222 = (TextLayoutState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                changed2 = startRestartGroup.changed(transformedTextFieldState4222);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                boolean z152222 = z5;
                boolean z162222 = z6;
                rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState4222, textLayoutState3222, density, z7, z152222, !booleanValue3222 && isWindowFocused2222, z162222);
                transformedTextFieldState4222 = transformedTextFieldState4222;
                textLayoutState3222 = textLayoutState3222;
                density2 = density;
                z9 = z7;
                z10 = z152222;
                z11 = z162222;
                startRestartGroup.updateRememberedValue(rememberedValue3);
                textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                OutputTransformation outputTransformation62222 = outputTransformation2;
                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2222 = CompositionLocalsKt.getLocalHapticFeedback();
                inputTransformation3 = inputTransformation2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume42222 = startRestartGroup.consume(localHapticFeedback2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final HapticFeedback hapticFeedback2222 = (HapticFeedback) consume42222;
                final TextLayoutState textLayoutState22222 = textLayoutState3222;
                ProvidableCompositionLocal<ClipboardManager> localClipboardManager2222 = CompositionLocalsKt.getLocalClipboardManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52222 = startRestartGroup.consume(localClipboardManager2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final ClipboardManager clipboardManager2222 = (ClipboardManager) consume52222;
                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242222 = function22;
                ProvidableCompositionLocal<TextToolbar> localTextToolbar2222 = CompositionLocalsKt.getLocalTextToolbar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume62222 = startRestartGroup.consume(localTextToolbar2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TextToolbar textToolbar2222 = (TextToolbar) consume62222;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                changed3 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState4222) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback2222) | startRestartGroup.changedInstance(clipboardManager2222) | startRestartGroup.changedInstance(textToolbar2222) | startRestartGroup.changed(density2) | ((i4 & 7168) == 2048) | ((i342222 & 3670016) == 1048576);
                Object rememberedValue62222 = startRestartGroup.rememberedValue();
                if (changed3) {
                }
                final Density density32222 = density2;
                final TransformedTextFieldState transformedTextFieldState22222 = transformedTextFieldState4222;
                final boolean z172222 = z9;
                final boolean z182222 = z10;
                final boolean z192222 = z11;
                Object obj22222 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                        TransformedTextFieldState.this.update(inputTransformation3);
                        textFieldSelectionState.update(hapticFeedback2222, clipboardManager2222, textToolbar2222, density32222, z172222, z182222, z192222);
                    }
                };
                inputTransformation4 = inputTransformation3;
                textFieldSelectionState2 = textFieldSelectionState;
                obj = (Function0) obj22222;
                startRestartGroup.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) obj, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final TextFieldSelectionState textFieldSelectionState32222 = TextFieldSelectionState.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                TextFieldSelectionState.this.dispose();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
                final TextFieldSelectionState textFieldSelectionState32222 = textFieldSelectionState2;
                MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource3;
                final Orientation orientation22222 = orientation;
                Modifier pointerHoverIcon$default2222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState4222, textLayoutState22222, textFieldSelectionState32222, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler62222, areEqual2222, mutableInteractionSource62222)), z9, mutableInteractionSource62222), scrollState2, orientation22222, !z9 && textFieldSelectionState32222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection2222, orientation, false), null, mutableInteractionSource62222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
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
                m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3316constructorimpl.getInserting()) {
                }
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                final TransformedTextFieldState transformedTextFieldState32222 = transformedTextFieldState4222;
                final boolean z202222 = z9;
                final TextFieldDecorator textFieldDecorator52222 = textFieldDecorator2;
                final Brush brush32222 = cursorBrush;
                final ScrollState scrollState42222 = scrollState2;
                final boolean z212222 = z10;
                ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState32222, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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
                        ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                        if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                            }
                            TextFieldDecorator textFieldDecorator6 = TextFieldDecorator.this;
                            if (textFieldDecorator6 == null) {
                                textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                            }
                            final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits42222;
                            final TextLayoutState textLayoutState32222 = textLayoutState22222;
                            final TextStyle textStyle5 = textStyle42222;
                            final boolean z22 = booleanValue3222;
                            final boolean z23 = isWindowFocused2222;
                            final boolean z24 = booleanValue22222;
                            final TransformedTextFieldState transformedTextFieldState42222 = transformedTextFieldState32222;
                            final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState32222;
                            final Brush brush4 = brush32222;
                            final boolean z25 = z202222;
                            final boolean z26 = z212222;
                            final ScrollState scrollState5 = scrollState42222;
                            final Orientation orientation3 = orientation22222;
                            final boolean z27 = areEqual2222;
                            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function242222;
                            textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i36) {
                                    int i37;
                                    int i38;
                                    ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                    if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                        }
                                        TextFieldLineLimits textFieldLineLimits6 = TextFieldLineLimits.this;
                                        if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                            i37 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                            i38 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                        } else {
                                            i37 = 1;
                                            i38 = 1;
                                        }
                                        Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m706heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState32222.m1202getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, i37, i38), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState32222, transformedTextFieldState42222, textFieldSelectionState4, brush4, z25 && !z26, scrollState5, orientation3));
                                        TextLayoutState textLayoutState4 = textLayoutState32222;
                                        TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState42222;
                                        TextStyle textStyle6 = textStyle5;
                                        boolean z28 = z27;
                                        Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                        boolean z29 = z25;
                                        boolean z30 = z22;
                                        boolean z31 = z23;
                                        TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                        boolean z32 = z26;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap22222 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(composer4, then);
                                        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor22222);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer4);
                                        Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                                        }
                                        Updater.m3323setimpl(m3316constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                        BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                        if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                            composer4.startReplaceGroup(-1325530694);
                                            ComposerKt.sourceInformation(composer4, "398@20188L121");
                                            BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                            if (!z32) {
                                                composer4.startReplaceGroup(-1325351669);
                                                ComposerKt.sourceInformation(composer4, "402@20379L125");
                                                BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                                composer4.endReplaceGroup();
                                            } else {
                                                composer4.startReplaceGroup(-1325177728);
                                                composer4.endReplaceGroup();
                                            }
                                            composer4.endReplaceGroup();
                                        } else {
                                            composer4.startReplaceGroup(-1325155904);
                                            composer4.endReplaceGroup();
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
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
                composer2 = startRestartGroup;
                inputTransformation5 = inputTransformation4;
                textStyle3 = textStyle42222;
                z12 = z9;
                mutableInteractionSource4 = mutableInteractionSource2;
                codepointTransformation3 = codepointTransformation2;
                scrollState3 = scrollState2;
                z13 = z10;
                textFieldLineLimits3 = textFieldLineLimits42222;
                z14 = z11;
                outputTransformation3 = outputTransformation62222;
                function23 = function242222;
                keyboardActionHandler3 = keyboardActionHandler62222;
                keyboardOptions3 = keyboardOptions2;
                textFieldDecorator3 = textFieldDecorator52222;
                modifier3 = modifier2;
                brush2 = cursorBrush;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            inputTransformation2 = inputTransformation;
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
            i12 = i11;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i3022222 = i17;
            i20 = i3 & 4096;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            i24 = i3 & 16384;
            if (i24 != 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i26 = i3 & 65536;
            if (i26 != 0) {
            }
            int i3322222 = i25;
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i29 != 0) {
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
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i16 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 != 0) {
            }
            if (i24 != 0) {
            }
            KeyboardActionHandler keyboardActionHandler522222 = keyboardActionHandler4;
            if ((i3 & 32768) != 0) {
            }
            OutputTransformation outputTransformation522222 = outputTransformation4;
            textFieldDecorator2 = textFieldDecorator4;
            outputTransformation2 = outputTransformation522222;
            if (i26 != 0) {
            }
            keyboardActionHandler2 = keyboardActionHandler522222;
            startRestartGroup.endDefaults();
            KeyboardActionHandler keyboardActionHandler622222 = keyboardActionHandler2;
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume72222 = startRestartGroup.consume(localDensity22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            density = (Density) consume72222;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22222 = (LayoutDirection) consume222222;
            z7 = z4;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo22222 = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume322222 = startRestartGroup.consume(localWindowInfo22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            WindowInfo windowInfo222222 = (WindowInfo) consume322222;
            final boolean areEqual22222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
            final TextFieldLineLimits textFieldLineLimits422222 = textFieldLineLimits2;
            if (mutableInteractionSource2 == null) {
            }
            if (areEqual22222) {
            }
            MutableInteractionSource mutableInteractionSource522222 = mutableInteractionSource3;
            final TextStyle textStyle422222 = textStyle2;
            final boolean booleanValue32222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource522222, startRestartGroup, 0).getValue().booleanValue();
            final boolean booleanValue222222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource522222, startRestartGroup, 0).getValue().booleanValue();
            final boolean isWindowFocused22222 = windowInfo.isWindowFocused();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
            int i3422222 = i28;
            z8 = ((i28 & 7168) == 2048) | ((i4 & 14) == 4) | ((i28 & 896) == 256);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z8) {
            }
            if (codepointTransformation2 == null) {
            }
            rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
            startRestartGroup.updateRememberedValue(rememberedValue);
            TransformedTextFieldState transformedTextFieldState42222 = (TransformedTextFieldState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
            changed = startRestartGroup.changed(transformedTextFieldState42222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new TextLayoutState();
            startRestartGroup.updateRememberedValue(rememberedValue2);
            TextLayoutState textLayoutState32222 = (TextLayoutState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
            changed2 = startRestartGroup.changed(transformedTextFieldState42222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            boolean z1522222 = z5;
            boolean z1622222 = z6;
            rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState42222, textLayoutState32222, density, z7, z1522222, !booleanValue32222 && isWindowFocused22222, z1622222);
            transformedTextFieldState42222 = transformedTextFieldState42222;
            textLayoutState32222 = textLayoutState32222;
            density2 = density;
            z9 = z7;
            z10 = z1522222;
            z11 = z1622222;
            startRestartGroup.updateRememberedValue(rememberedValue3);
            textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            OutputTransformation outputTransformation622222 = outputTransformation2;
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22222 = CompositionLocalsKt.getLocalHapticFeedback();
            inputTransformation3 = inputTransformation2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume422222 = startRestartGroup.consume(localHapticFeedback22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final HapticFeedback hapticFeedback22222 = (HapticFeedback) consume422222;
            final TextLayoutState textLayoutState222222 = textLayoutState32222;
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager22222 = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522222 = startRestartGroup.consume(localClipboardManager22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final ClipboardManager clipboardManager22222 = (ClipboardManager) consume522222;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2422222 = function22;
            ProvidableCompositionLocal<TextToolbar> localTextToolbar22222 = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume622222 = startRestartGroup.consume(localTextToolbar22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextToolbar textToolbar22222 = (TextToolbar) consume622222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
            changed3 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState42222) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback22222) | startRestartGroup.changedInstance(clipboardManager22222) | startRestartGroup.changedInstance(textToolbar22222) | startRestartGroup.changed(density2) | ((i4 & 7168) == 2048) | ((i3422222 & 3670016) == 1048576);
            Object rememberedValue622222 = startRestartGroup.rememberedValue();
            if (changed3) {
            }
            final Density density322222 = density2;
            final TransformedTextFieldState transformedTextFieldState222222 = transformedTextFieldState42222;
            final boolean z1722222 = z9;
            final boolean z1822222 = z10;
            final boolean z1922222 = z11;
            Object obj222222 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                    TransformedTextFieldState.this.update(inputTransformation3);
                    textFieldSelectionState.update(hapticFeedback22222, clipboardManager22222, textToolbar22222, density322222, z1722222, z1822222, z1922222);
                }
            };
            inputTransformation4 = inputTransformation3;
            textFieldSelectionState2 = textFieldSelectionState;
            obj = (Function0) obj222222;
            startRestartGroup.updateRememberedValue(obj);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) obj, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final TextFieldSelectionState textFieldSelectionState322222 = TextFieldSelectionState.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            TextFieldSelectionState.this.dispose();
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
            final TextFieldSelectionState textFieldSelectionState322222 = textFieldSelectionState2;
            MutableInteractionSource mutableInteractionSource622222 = mutableInteractionSource3;
            final Orientation orientation222222 = orientation;
            Modifier pointerHoverIcon$default22222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState42222, textLayoutState222222, textFieldSelectionState322222, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler622222, areEqual22222, mutableInteractionSource622222)), z9, mutableInteractionSource622222), scrollState2, orientation222222, !z9 && textFieldSelectionState322222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection22222, orientation, false), null, mutableInteractionSource622222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
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
            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3316constructorimpl.getInserting()) {
            }
            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
            final TransformedTextFieldState transformedTextFieldState322222 = transformedTextFieldState42222;
            final boolean z2022222 = z9;
            final TextFieldDecorator textFieldDecorator522222 = textFieldDecorator2;
            final Brush brush322222 = cursorBrush;
            final ScrollState scrollState422222 = scrollState2;
            final boolean z2122222 = z10;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState322222, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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
                    ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                    if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                        }
                        TextFieldDecorator textFieldDecorator6 = TextFieldDecorator.this;
                        if (textFieldDecorator6 == null) {
                            textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                        }
                        final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits422222;
                        final TextLayoutState textLayoutState322222 = textLayoutState222222;
                        final TextStyle textStyle5 = textStyle422222;
                        final boolean z22 = booleanValue32222;
                        final boolean z23 = isWindowFocused22222;
                        final boolean z24 = booleanValue222222;
                        final TransformedTextFieldState transformedTextFieldState422222 = transformedTextFieldState322222;
                        final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState322222;
                        final Brush brush4 = brush322222;
                        final boolean z25 = z2022222;
                        final boolean z26 = z2122222;
                        final ScrollState scrollState5 = scrollState422222;
                        final Orientation orientation3 = orientation222222;
                        final boolean z27 = areEqual22222;
                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function2422222;
                        textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i36) {
                                int i37;
                                int i38;
                                ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                    }
                                    TextFieldLineLimits textFieldLineLimits6 = TextFieldLineLimits.this;
                                    if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                        i37 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                        i38 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                    } else {
                                        i37 = 1;
                                        i38 = 1;
                                    }
                                    Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m706heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState322222.m1202getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, i37, i38), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState322222, transformedTextFieldState422222, textFieldSelectionState4, brush4, z25 && !z26, scrollState5, orientation3));
                                    TextLayoutState textLayoutState4 = textLayoutState322222;
                                    TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState422222;
                                    TextStyle textStyle6 = textStyle5;
                                    boolean z28 = z27;
                                    Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                    boolean z29 = z25;
                                    boolean z30 = z22;
                                    boolean z31 = z23;
                                    TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                    boolean z32 = z26;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap222222 = composer4.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(composer4, then);
                                    Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor222222);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer4);
                                    Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                                    }
                                    Updater.m3323setimpl(m3316constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                    BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                    if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                        composer4.startReplaceGroup(-1325530694);
                                        ComposerKt.sourceInformation(composer4, "398@20188L121");
                                        BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                        if (!z32) {
                                            composer4.startReplaceGroup(-1325351669);
                                            ComposerKt.sourceInformation(composer4, "402@20379L125");
                                            BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                            composer4.endReplaceGroup();
                                        } else {
                                            composer4.startReplaceGroup(-1325177728);
                                            composer4.endReplaceGroup();
                                        }
                                        composer4.endReplaceGroup();
                                    } else {
                                        composer4.startReplaceGroup(-1325155904);
                                        composer4.endReplaceGroup();
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
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
            composer2 = startRestartGroup;
            inputTransformation5 = inputTransformation4;
            textStyle3 = textStyle422222;
            z12 = z9;
            mutableInteractionSource4 = mutableInteractionSource2;
            codepointTransformation3 = codepointTransformation2;
            scrollState3 = scrollState2;
            z13 = z10;
            textFieldLineLimits3 = textFieldLineLimits422222;
            z14 = z11;
            outputTransformation3 = outputTransformation622222;
            function23 = function2422222;
            keyboardActionHandler3 = keyboardActionHandler622222;
            keyboardOptions3 = keyboardOptions2;
            textFieldDecorator3 = textFieldDecorator522222;
            modifier3 = modifier2;
            brush2 = cursorBrush;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        inputTransformation2 = inputTransformation;
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
        i12 = i11;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i30222222 = i17;
        i20 = i3 & 4096;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        i24 = i3 & 16384;
        if (i24 != 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i26 = i3 & 65536;
        if (i26 != 0) {
        }
        int i33222222 = i25;
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i29 != 0) {
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
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i16 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 != 0) {
        }
        if (i24 != 0) {
        }
        KeyboardActionHandler keyboardActionHandler5222222 = keyboardActionHandler4;
        if ((i3 & 32768) != 0) {
        }
        OutputTransformation outputTransformation5222222 = outputTransformation4;
        textFieldDecorator2 = textFieldDecorator4;
        outputTransformation2 = outputTransformation5222222;
        if (i26 != 0) {
        }
        keyboardActionHandler2 = keyboardActionHandler5222222;
        startRestartGroup.endDefaults();
        KeyboardActionHandler keyboardActionHandler6222222 = keyboardActionHandler2;
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume722222 = startRestartGroup.consume(localDensity222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        density = (Density) consume722222;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222222 = startRestartGroup.consume(localLayoutDirection222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222222 = (LayoutDirection) consume2222222;
        z7 = z4;
        ProvidableCompositionLocal<WindowInfo> localWindowInfo222222 = CompositionLocalsKt.getLocalWindowInfo();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3222222 = startRestartGroup.consume(localWindowInfo222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        WindowInfo windowInfo2222222 = (WindowInfo) consume3222222;
        final boolean areEqual222222 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
        final TextFieldLineLimits textFieldLineLimits4222222 = textFieldLineLimits2;
        if (mutableInteractionSource2 == null) {
        }
        if (areEqual222222) {
        }
        MutableInteractionSource mutableInteractionSource5222222 = mutableInteractionSource3;
        final TextStyle textStyle4222222 = textStyle2;
        final boolean booleanValue322222 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5222222, startRestartGroup, 0).getValue().booleanValue();
        final boolean booleanValue2222222 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource5222222, startRestartGroup, 0).getValue().booleanValue();
        final boolean isWindowFocused222222 = windowInfo.isWindowFocused();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
        int i34222222 = i28;
        z8 = ((i28 & 7168) == 2048) | ((i4 & 14) == 4) | ((i28 & 896) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z8) {
        }
        if (codepointTransformation2 == null) {
        }
        rememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        TransformedTextFieldState transformedTextFieldState422222 = (TransformedTextFieldState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
        changed = startRestartGroup.changed(transformedTextFieldState422222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new TextLayoutState();
        startRestartGroup.updateRememberedValue(rememberedValue2);
        TextLayoutState textLayoutState322222 = (TextLayoutState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
        changed2 = startRestartGroup.changed(transformedTextFieldState422222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        boolean z15222222 = z5;
        boolean z16222222 = z6;
        rememberedValue3 = new TextFieldSelectionState(transformedTextFieldState422222, textLayoutState322222, density, z7, z15222222, !booleanValue322222 && isWindowFocused222222, z16222222);
        transformedTextFieldState422222 = transformedTextFieldState422222;
        textLayoutState322222 = textLayoutState322222;
        density2 = density;
        z9 = z7;
        z10 = z15222222;
        z11 = z16222222;
        startRestartGroup.updateRememberedValue(rememberedValue3);
        textFieldSelectionState = (TextFieldSelectionState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        OutputTransformation outputTransformation6222222 = outputTransformation2;
        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222222 = CompositionLocalsKt.getLocalHapticFeedback();
        inputTransformation3 = inputTransformation2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume4222222 = startRestartGroup.consume(localHapticFeedback222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final HapticFeedback hapticFeedback222222 = (HapticFeedback) consume4222222;
        final TextLayoutState textLayoutState2222222 = textLayoutState322222;
        ProvidableCompositionLocal<ClipboardManager> localClipboardManager222222 = CompositionLocalsKt.getLocalClipboardManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222222 = startRestartGroup.consume(localClipboardManager222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final ClipboardManager clipboardManager222222 = (ClipboardManager) consume5222222;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24222222 = function22;
        ProvidableCompositionLocal<TextToolbar> localTextToolbar222222 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume6222222 = startRestartGroup.consume(localTextToolbar222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TextToolbar textToolbar222222 = (TextToolbar) consume6222222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
        changed3 = ((i4 & 896) == 256) | startRestartGroup.changed(transformedTextFieldState422222) | ((57344 & i4) == 16384) | startRestartGroup.changedInstance(textFieldSelectionState) | startRestartGroup.changedInstance(hapticFeedback222222) | startRestartGroup.changedInstance(clipboardManager222222) | startRestartGroup.changedInstance(textToolbar222222) | startRestartGroup.changed(density2) | ((i4 & 7168) == 2048) | ((i34222222 & 3670016) == 1048576);
        Object rememberedValue6222222 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        final Density density3222222 = density2;
        final TransformedTextFieldState transformedTextFieldState2222222 = transformedTextFieldState422222;
        final boolean z17222222 = z9;
        final boolean z18222222 = z10;
        final boolean z19222222 = z11;
        Object obj2222222 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                TransformedTextFieldState.this.update(inputTransformation3);
                textFieldSelectionState.update(hapticFeedback222222, clipboardManager222222, textToolbar222222, density3222222, z17222222, z18222222, z19222222);
            }
        };
        inputTransformation4 = inputTransformation3;
        textFieldSelectionState2 = textFieldSelectionState;
        obj = (Function0) obj2222222;
        startRestartGroup.updateRememberedValue(obj);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) obj, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
        changedInstance = startRestartGroup.changedInstance(textFieldSelectionState2);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                final TextFieldSelectionState textFieldSelectionState3222222 = TextFieldSelectionState.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        TextFieldSelectionState.this.dispose();
                    }
                };
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
        final TextFieldSelectionState textFieldSelectionState3222222 = textFieldSelectionState2;
        MutableInteractionSource mutableInteractionSource6222222 = mutableInteractionSource3;
        final Orientation orientation2222222 = orientation;
        Modifier pointerHoverIcon$default222222 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState422222, textLayoutState2222222, textFieldSelectionState3222222, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler6222222, areEqual222222, mutableInteractionSource6222222)), z9, mutableInteractionSource6222222), scrollState2, orientation2222222, !z9 && textFieldSelectionState3222222.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection222222, orientation, false), null, mutableInteractionSource6222222, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
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
        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
        Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
        final TransformedTextFieldState transformedTextFieldState3222222 = transformedTextFieldState422222;
        final boolean z20222222 = z9;
        final TextFieldDecorator textFieldDecorator5222222 = textFieldDecorator2;
        final Brush brush3222222 = cursorBrush;
        final ScrollState scrollState4222222 = scrollState2;
        final boolean z21222222 = z10;
        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState3222222, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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
                ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                    }
                    TextFieldDecorator textFieldDecorator6 = TextFieldDecorator.this;
                    if (textFieldDecorator6 == null) {
                        textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                    }
                    final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits4222222;
                    final TextLayoutState textLayoutState3222222 = textLayoutState2222222;
                    final TextStyle textStyle5 = textStyle4222222;
                    final boolean z22 = booleanValue322222;
                    final boolean z23 = isWindowFocused222222;
                    final boolean z24 = booleanValue2222222;
                    final TransformedTextFieldState transformedTextFieldState4222222 = transformedTextFieldState3222222;
                    final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState3222222;
                    final Brush brush4 = brush3222222;
                    final boolean z25 = z20222222;
                    final boolean z26 = z21222222;
                    final ScrollState scrollState5 = scrollState4222222;
                    final Orientation orientation3 = orientation2222222;
                    final boolean z27 = areEqual222222;
                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function24222222;
                    textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i36) {
                            int i37;
                            int i38;
                            ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                            if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                }
                                TextFieldLineLimits textFieldLineLimits6 = TextFieldLineLimits.this;
                                if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                    i37 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                    i38 = ((TextFieldLineLimits.MultiLine) TextFieldLineLimits.this).getMaxHeightInLines();
                                } else {
                                    i37 = 1;
                                    i38 = 1;
                                }
                                Modifier then = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m706heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState3222222.m1202getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, i37, i38), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState3222222, transformedTextFieldState4222222, textFieldSelectionState4, brush4, z25 && !z26, scrollState5, orientation3));
                                TextLayoutState textLayoutState4 = textLayoutState3222222;
                                TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState4222222;
                                TextStyle textStyle6 = textStyle5;
                                boolean z28 = z27;
                                Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                boolean z29 = z25;
                                boolean z30 = z22;
                                boolean z31 = z23;
                                TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                boolean z32 = z26;
                                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2222222 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(composer4, then);
                                Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2222222);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer4);
                                Updater.m3323setimpl(m3316constructorimpl2, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
                                }
                                Updater.m3323setimpl(m3316constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                    composer4.startReplaceGroup(-1325530694);
                                    ComposerKt.sourceInformation(composer4, "398@20188L121");
                                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                    if (!z32) {
                                        composer4.startReplaceGroup(-1325351669);
                                        ComposerKt.sourceInformation(composer4, "402@20379L125");
                                        BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                        composer4.endReplaceGroup();
                                    } else {
                                        composer4.startReplaceGroup(-1325177728);
                                        composer4.endReplaceGroup();
                                    }
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(-1325155904);
                                    composer4.endReplaceGroup();
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
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
        composer2 = startRestartGroup;
        inputTransformation5 = inputTransformation4;
        textStyle3 = textStyle4222222;
        z12 = z9;
        mutableInteractionSource4 = mutableInteractionSource2;
        codepointTransformation3 = codepointTransformation2;
        scrollState3 = scrollState2;
        z13 = z10;
        textFieldLineLimits3 = textFieldLineLimits4222222;
        z14 = z11;
        outputTransformation3 = outputTransformation6222222;
        function23 = function24222222;
        keyboardActionHandler3 = keyboardActionHandler6222222;
        keyboardOptions3 = keyboardOptions2;
        textFieldDecorator3 = textFieldDecorator5222222;
        modifier3 = modifier2;
        brush2 = cursorBrush;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1991581797);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)417@20797L128:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425876476, "CC(remember):BasicTextField.kt#9igjgp");
            boolean changed = startRestartGroup.changed(textFieldSelectionState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
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
                startRestartGroup.startReplaceGroup(-317096444);
                ComposerKt.sourceInformation(startRestartGroup, "422@21014L142,428@21236L87,421@20971L426");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425869518, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo962provideF1C5BW0() {
                            return TextFieldSelectionState.this.getCursorHandleState$foundation_release(true).m1231getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425862469, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldCursorHandle$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidCursorHandle_androidKt.m959CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3), MinTouchTargetSizeForHandles, startRestartGroup, 384, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-316671682);
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
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldSelectionHandles)441@21601L149,464@22479L150:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i2, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:439)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983345574, "CC(remember):BasicTextField.kt#9igjgp");
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
                startRestartGroup.startReplaceGroup(-1353974139);
                ComposerKt.sourceInformation(startRestartGroup, "448@21841L167,456@22219L86,447@21795L584");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983337876, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo962provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(true, true).m1231getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$13(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$13(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983325861, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidSelectionHandles_androidKt.m1310SelectionHandlepzduO1o(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1353397539);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983317477, "CC(remember):BasicTextField.kt#9igjgp");
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
                startRestartGroup.startReplaceGroup(-1353104186);
                ComposerKt.sourceInformation(startRestartGroup, "471@22718L168,479@23094L87,470@22672L583");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983309811, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo962provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(false, true).m1231getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$17(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$17(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983297860, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance4 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$4$1 rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new BasicTextFieldKt$TextFieldSelectionHandles$4$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidSelectionHandles_androidKt.m1310SelectionHandlepzduO1o(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1352528547);
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

    /* JADX WARN: Code restructure failed: missing block: B:88:0x03b3, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L244;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0401  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        VisualTransformation none;
        BasicTextFieldKt$BasicTextField$6 basicTextFieldKt$BasicTextField$6;
        KeyboardActions keyboardActions3;
        boolean z6;
        SolidColor solidColor;
        boolean z7;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        int i27;
        int i28;
        boolean z8;
        TextStyle textStyle3;
        Modifier modifier3;
        KeyboardActions keyboardActions4;
        Brush brush2;
        KeyboardOptions keyboardOptions3;
        MutableInteractionSource mutableInteractionSource2;
        Object rememberedValue;
        int i29;
        boolean changed;
        Modifier modifier4;
        boolean z9;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        Composer composer2;
        final KeyboardOptions keyboardOptions4;
        final TextStyle textStyle4;
        final MutableInteractionSource mutableInteractionSource3;
        final Brush brush3;
        final boolean z10;
        final boolean z11;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        final boolean z12;
        final Modifier modifier5;
        final VisualTransformation visualTransformation2;
        final Function1<? super TextLayoutResult, Unit> function13;
        final KeyboardActions keyboardActions5;
        final int i30;
        final int i31;
        ScopeUpdateScope endRestartGroup;
        int i32;
        Composer startRestartGroup = composer.startRestartGroup(945255183);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)613@31179L57,619@31532L216,619@31521L227,628@32069L41,632@32187L373,630@32116L1032:BasicTextField.kt#423gt5");
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
        int i33 = i5 & 4;
        if (i33 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z4 = z;
                i6 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z5 = z2;
                    i6 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                            i32 = 536870912;
                            i6 |= i32;
                        }
                        i32 = 268435456;
                        i6 |= i32;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i34 = i15;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i19 = i34 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i34 | (startRestartGroup.changedInstance(function12) ? 256 : 128);
                    } else {
                        i19 = i34;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i35 = i19;
                        if ((i4 & 3072) == 0) {
                            i21 = i35 | (startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024);
                        } else {
                            i21 = i35;
                        }
                    }
                    i22 = i5 & 16384;
                    if (i22 == 0) {
                        i23 = i21 | 24576;
                    } else {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                            i24 = i5 & 32768;
                            if (i24 != 0) {
                                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i23 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            }
                            i25 = i23;
                            if ((i6 & 306783379) == 306783378 || (74899 & i25) != 74898 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i33 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        z4 = true;
                                    }
                                    if (i8 != 0) {
                                        z5 = false;
                                    }
                                    if (i9 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    if (i10 != 0) {
                                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                    }
                                    KeyboardActions keyboardActions6 = i11 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                    boolean z13 = i12 != 0 ? false : z3;
                                    if ((i5 & 512) != 0) {
                                        i26 = z13 ? 1 : Integer.MAX_VALUE;
                                        i6 &= -1879048193;
                                    } else {
                                        i26 = i;
                                    }
                                    int i36 = i14 != 0 ? 1 : i2;
                                    none = i17 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                    basicTextFieldKt$BasicTextField$6 = i18 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function12;
                                    MutableInteractionSource mutableInteractionSource4 = i20 != 0 ? null : mutableInteractionSource;
                                    if (i22 != 0) {
                                        z6 = z13;
                                        keyboardActions3 = keyboardActions6;
                                        solidColor = new SolidColor(Color.INSTANCE.m3849getBlack0d7_KjU(), null);
                                    } else {
                                        keyboardActions3 = keyboardActions6;
                                        z6 = z13;
                                        solidColor = brush;
                                    }
                                    if (i24 != 0) {
                                        function32 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m978getLambda1$foundation_release();
                                        i27 = i26;
                                        i28 = i36;
                                        z8 = z5;
                                        textStyle3 = textStyle2;
                                        modifier3 = modifier2;
                                        z7 = z6;
                                    } else {
                                        z7 = z6;
                                        function32 = function3;
                                        i27 = i26;
                                        i28 = i36;
                                        z8 = z5;
                                        textStyle3 = textStyle2;
                                        modifier3 = modifier2;
                                    }
                                    keyboardActions4 = keyboardActions3;
                                    brush2 = solidColor;
                                    keyboardOptions3 = keyboardOptions2;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & 512) != 0) {
                                        i6 &= -1879048193;
                                    }
                                    keyboardActions4 = keyboardActions2;
                                    textStyle3 = textStyle2;
                                    z7 = z3;
                                    i27 = i;
                                    i28 = i2;
                                    none = visualTransformation;
                                    basicTextFieldKt$BasicTextField$6 = function12;
                                    function32 = function3;
                                    keyboardOptions3 = keyboardOptions2;
                                    z8 = z5;
                                    modifier3 = modifier2;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(945255183, i6, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    i29 = i27;
                                    MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                    rememberedValue = mutableStateOf$default;
                                } else {
                                    i29 = i27;
                                }
                                final MutableState mutableState = (MutableState) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final TextFieldValue m5995copy3r_uNRQ$default = TextFieldValue.m5995copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState), str, 0L, (TextRange) null, 6, (Object) null);
                                int i37 = i28;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
                                changed = startRestartGroup.changed(m5995copy3r_uNRQ$default);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (changed) {
                                    modifier4 = modifier3;
                                } else {
                                    modifier4 = modifier3;
                                }
                                rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                                        if (TextRange.m5746equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                                            TextRange composition = TextFieldValue.this.getComposition();
                                            BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState);
                                            if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                                return;
                                            }
                                        }
                                        mutableState.setValue(TextFieldValue.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
                                z9 = (i6 & 14) == 4;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z9 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final MutableState mutableState2 = (MutableState) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ImeOptions imeOptions$foundation_release = keyboardOptions3.toImeOptions$foundation_release(z7);
                                boolean z14 = !z7;
                                boolean z15 = z4;
                                Function1<? super TextLayoutResult, Unit> function14 = basicTextFieldKt$BasicTextField$6;
                                int i38 = z7 ? 1 : i37;
                                int i39 = z7 ? 1 : i29;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
                                changed2 = startRestartGroup.changed(mutableState2) | ((i6 & 112) == 32);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
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
                                            boolean areEqual = Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                                            mutableState2.setValue(textFieldValue.getText());
                                            if (areEqual) {
                                                return;
                                            }
                                            function1.invoke(textFieldValue.getText());
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i40 = i25 << 9;
                                Modifier modifier6 = modifier4;
                                composer2 = startRestartGroup;
                                CoreTextFieldKt.CoreTextField(m5995copy3r_uNRQ$default, (Function1) rememberedValue3, modifier6, textStyle3, none, function14, mutableInteractionSource2, brush2, z14, i39, i38, imeOptions$foundation_release, keyboardActions4, z15, z8, function32, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i40) | (458752 & i40) | (3670016 & i40) | (i40 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | (i25 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                keyboardOptions4 = keyboardOptions3;
                                textStyle4 = textStyle3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                brush3 = brush2;
                                z10 = z15;
                                z11 = z8;
                                function33 = function32;
                                z12 = z7;
                                modifier5 = modifier6;
                                visualTransformation2 = none;
                                function13 = function14;
                                keyboardActions5 = keyboardActions4;
                                i30 = i37;
                                i31 = i29;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i31 = i;
                                function33 = function3;
                                composer2 = startRestartGroup;
                                keyboardActions5 = keyboardActions2;
                                z10 = z4;
                                keyboardOptions4 = keyboardOptions2;
                                z11 = z5;
                                textStyle4 = textStyle2;
                                modifier5 = modifier2;
                                z12 = z3;
                                i30 = i2;
                                visualTransformation2 = visualTransformation;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush3 = brush;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
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

                                    public final void invoke(Composer composer3, int i41) {
                                        BasicTextFieldKt.BasicTextField(str, function1, modifier5, z10, z11, textStyle4, keyboardOptions4, keyboardActions5, z12, i31, i30, visualTransformation2, function13, mutableInteractionSource3, brush3, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    i24 = i5 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i23;
                    if ((i6 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i33 != 0) {
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
                    if (i14 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    keyboardActions4 = keyboardActions3;
                    brush2 = solidColor;
                    keyboardOptions3 = keyboardOptions2;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState<TextFieldValue> mutableState3 = (MutableState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TextFieldValue m5995copy3r_uNRQ$default2 = TextFieldValue.m5995copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState3), str, 0L, (TextRange) null, 6, (Object) null);
                    int i372 = i28;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
                    changed = startRestartGroup.changed(m5995copy3r_uNRQ$default2);
                    Object rememberedValue42 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    rememberedValue42 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                            if (TextRange.m5746equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                                TextRange composition = TextFieldValue.this.getComposition();
                                BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState3);
                                if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                    return;
                                }
                            }
                            mutableState3.setValue(TextFieldValue.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue42);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue42, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
                    if ((i6 & 14) == 4) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z9) {
                    }
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    final MutableState<String> mutableState22 = (MutableState) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ImeOptions imeOptions$foundation_release2 = keyboardOptions3.toImeOptions$foundation_release(z7);
                    boolean z142 = !z7;
                    boolean z152 = z4;
                    Function1<? super TextLayoutResult, Unit> function142 = basicTextFieldKt$BasicTextField$6;
                    if (z7) {
                    }
                    if (z7) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
                    changed2 = startRestartGroup.changed(mutableState22) | ((i6 & 112) == 32);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
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
                            boolean areEqual = Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                            mutableState22.setValue(textFieldValue.getText());
                            if (areEqual) {
                                return;
                            }
                            function1.invoke(textFieldValue.getText());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i402 = i25 << 9;
                    Modifier modifier62 = modifier4;
                    composer2 = startRestartGroup;
                    CoreTextFieldKt.CoreTextField(m5995copy3r_uNRQ$default2, (Function1) rememberedValue3, modifier62, textStyle3, none, function142, mutableInteractionSource2, brush2, z142, i39, i38, imeOptions$foundation_release2, keyboardActions4, z152, z8, function32, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i402) | (458752 & i402) | (3670016 & i402) | (i402 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | (i25 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    keyboardOptions4 = keyboardOptions3;
                    textStyle4 = textStyle3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    brush3 = brush2;
                    z10 = z152;
                    z11 = z8;
                    function33 = function32;
                    z12 = z7;
                    modifier5 = modifier62;
                    visualTransformation2 = none;
                    function13 = function142;
                    keyboardActions5 = keyboardActions4;
                    i30 = i372;
                    i31 = i29;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
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
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i342 = i15;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & 16384;
                if (i22 == 0) {
                }
                i24 = i5 & 32768;
                if (i24 != 0) {
                }
                i25 = i23;
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i33 != 0) {
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
                if (i14 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 != 0) {
                }
                if (i24 != 0) {
                }
                keyboardActions4 = keyboardActions3;
                brush2 = solidColor;
                keyboardOptions3 = keyboardOptions2;
                mutableInteractionSource2 = mutableInteractionSource4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState<TextFieldValue> mutableState32 = (MutableState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TextFieldValue m5995copy3r_uNRQ$default22 = TextFieldValue.m5995copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState32), str, 0L, (TextRange) null, 6, (Object) null);
                int i3722 = i28;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
                changed = startRestartGroup.changed(m5995copy3r_uNRQ$default22);
                Object rememberedValue422 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                rememberedValue422 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                        if (TextRange.m5746equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                            TextRange composition = TextFieldValue.this.getComposition();
                            BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState32);
                            if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                                return;
                            }
                        }
                        mutableState32.setValue(TextFieldValue.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue422);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.SideEffect((Function0) rememberedValue422, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
                if ((i6 & 14) == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z9) {
                }
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                final MutableState<String> mutableState222 = (MutableState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ImeOptions imeOptions$foundation_release22 = keyboardOptions3.toImeOptions$foundation_release(z7);
                boolean z1422 = !z7;
                boolean z1522 = z4;
                Function1<? super TextLayoutResult, Unit> function1422 = basicTextFieldKt$BasicTextField$6;
                if (z7) {
                }
                if (z7) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
                changed2 = startRestartGroup.changed(mutableState222) | ((i6 & 112) == 32);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
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
                        boolean areEqual = Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                        mutableState222.setValue(textFieldValue.getText());
                        if (areEqual) {
                            return;
                        }
                        function1.invoke(textFieldValue.getText());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i4022 = i25 << 9;
                Modifier modifier622 = modifier4;
                composer2 = startRestartGroup;
                CoreTextFieldKt.CoreTextField(m5995copy3r_uNRQ$default22, (Function1) rememberedValue3, modifier622, textStyle3, none, function1422, mutableInteractionSource2, brush2, z1422, i39, i38, imeOptions$foundation_release22, keyboardActions4, z1522, z8, function32, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i4022) | (458752 & i4022) | (3670016 & i4022) | (i4022 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | (i25 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                keyboardOptions4 = keyboardOptions3;
                textStyle4 = textStyle3;
                mutableInteractionSource3 = mutableInteractionSource2;
                brush3 = brush2;
                z10 = z1522;
                z11 = z8;
                function33 = function32;
                z12 = z7;
                modifier5 = modifier622;
                visualTransformation2 = none;
                function13 = function1422;
                keyboardActions5 = keyboardActions4;
                i30 = i3722;
                i31 = i29;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
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
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3422 = i15;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & 16384;
            if (i22 == 0) {
            }
            i24 = i5 & 32768;
            if (i24 != 0) {
            }
            i25 = i23;
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i33 != 0) {
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
            if (i14 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 != 0) {
            }
            if (i24 != 0) {
            }
            keyboardActions4 = keyboardActions3;
            brush2 = solidColor;
            keyboardOptions3 = keyboardOptions2;
            mutableInteractionSource2 = mutableInteractionSource4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<TextFieldValue> mutableState322 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextFieldValue m5995copy3r_uNRQ$default222 = TextFieldValue.m5995copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState322), str, 0L, (TextRange) null, 6, (Object) null);
            int i37222 = i28;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
            changed = startRestartGroup.changed(m5995copy3r_uNRQ$default222);
            Object rememberedValue4222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            rememberedValue4222 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                    if (TextRange.m5746equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                        TextRange composition = TextFieldValue.this.getComposition();
                        BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState322);
                        if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                            return;
                        }
                    }
                    mutableState322.setValue(TextFieldValue.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue4222, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
            if ((i6 & 14) == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z9) {
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            final MutableState<String> mutableState2222 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImeOptions imeOptions$foundation_release222 = keyboardOptions3.toImeOptions$foundation_release(z7);
            boolean z14222 = !z7;
            boolean z15222 = z4;
            Function1<? super TextLayoutResult, Unit> function14222 = basicTextFieldKt$BasicTextField$6;
            if (z7) {
            }
            if (z7) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
            changed2 = startRestartGroup.changed(mutableState2222) | ((i6 & 112) == 32);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
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
                    boolean areEqual = Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                    mutableState2222.setValue(textFieldValue.getText());
                    if (areEqual) {
                        return;
                    }
                    function1.invoke(textFieldValue.getText());
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i40222 = i25 << 9;
            Modifier modifier6222 = modifier4;
            composer2 = startRestartGroup;
            CoreTextFieldKt.CoreTextField(m5995copy3r_uNRQ$default222, (Function1) rememberedValue3, modifier6222, textStyle3, none, function14222, mutableInteractionSource2, brush2, z14222, i39, i38, imeOptions$foundation_release222, keyboardActions4, z15222, z8, function32, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i40222) | (458752 & i40222) | (3670016 & i40222) | (i40222 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | (i25 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            keyboardOptions4 = keyboardOptions3;
            textStyle4 = textStyle3;
            mutableInteractionSource3 = mutableInteractionSource2;
            brush3 = brush2;
            z10 = z15222;
            z11 = z8;
            function33 = function32;
            z12 = z7;
            modifier5 = modifier6222;
            visualTransformation2 = none;
            function13 = function14222;
            keyboardActions5 = keyboardActions4;
            i30 = i37222;
            i31 = i29;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
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
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i34222 = i15;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & 16384;
        if (i22 == 0) {
        }
        i24 = i5 & 32768;
        if (i24 != 0) {
        }
        i25 = i23;
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i33 != 0) {
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
        if (i14 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 != 0) {
        }
        if (i24 != 0) {
        }
        keyboardActions4 = keyboardActions3;
        brush2 = solidColor;
        keyboardOptions3 = keyboardOptions2;
        mutableInteractionSource2 = mutableInteractionSource4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<TextFieldValue> mutableState3222 = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TextFieldValue m5995copy3r_uNRQ$default2222 = TextFieldValue.m5995copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState3222), str, 0L, (TextRange) null, 6, (Object) null);
        int i372222 = i28;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
        changed = startRestartGroup.changed(m5995copy3r_uNRQ$default2222);
        Object rememberedValue42222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        rememberedValue42222 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                if (TextRange.m5746equalsimpl0(selection, BasicTextField$lambda$21.getSelection())) {
                    TextRange composition = TextFieldValue.this.getComposition();
                    BasicTextField$lambda$212 = BasicTextFieldKt.BasicTextField$lambda$21(mutableState3222);
                    if (Intrinsics.areEqual(composition, BasicTextField$lambda$212.getComposition())) {
                        return;
                    }
                }
                mutableState3222.setValue(TextFieldValue.this);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue42222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue42222, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
        if ((i6 & 14) == 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z9) {
        }
        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        final MutableState<String> mutableState22222 = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ImeOptions imeOptions$foundation_release2222 = keyboardOptions3.toImeOptions$foundation_release(z7);
        boolean z142222 = !z7;
        boolean z152222 = z4;
        Function1<? super TextLayoutResult, Unit> function142222 = basicTextFieldKt$BasicTextField$6;
        if (z7) {
        }
        if (z7) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
        changed2 = startRestartGroup.changed(mutableState22222) | ((i6 & 112) == 32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
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
                boolean areEqual = Intrinsics.areEqual(BasicTextField$lambda$25, textFieldValue.getText());
                mutableState22222.setValue(textFieldValue.getText());
                if (areEqual) {
                    return;
                }
                function1.invoke(textFieldValue.getText());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i402222 = i25 << 9;
        Modifier modifier62222 = modifier4;
        composer2 = startRestartGroup;
        CoreTextFieldKt.CoreTextField(m5995copy3r_uNRQ$default2222, (Function1) rememberedValue3, modifier62222, textStyle3, none, function142222, mutableInteractionSource2, brush2, z142222, i39, i38, imeOptions$foundation_release2222, keyboardActions4, z152222, z8, function32, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i402222) | (458752 & i402222) | (3670016 & i402222) | (i402222 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | (i25 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        keyboardOptions4 = keyboardOptions3;
        textStyle4 = textStyle3;
        mutableInteractionSource3 = mutableInteractionSource2;
        brush3 = brush2;
        z10 = z152222;
        z11 = z8;
        function33 = function32;
        z12 = z7;
        modifier5 = modifier62222;
        visualTransformation2 = none;
        function13 = function142222;
        keyboardActions5 = keyboardActions4;
        i30 = i372222;
        i31 = i29;
        endRestartGroup = composer2.endRestartGroup();
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x036b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        VisualTransformation none;
        BasicTextFieldKt$BasicTextField$10 basicTextFieldKt$BasicTextField$10;
        MutableInteractionSource mutableInteractionSource2;
        KeyboardActions keyboardActions3;
        int i26;
        SolidColor solidColor;
        Brush brush2;
        boolean z6;
        int i27;
        int i28;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        int i29;
        boolean z7;
        boolean z8;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> m979getLambda2$foundation_release;
        boolean z9;
        Object rememberedValue;
        final KeyboardActions keyboardActions5;
        Composer composer2;
        final int i30;
        final int i31;
        final boolean z10;
        final VisualTransformation visualTransformation2;
        final boolean z11;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final Function1<? super TextLayoutResult, Unit> function13;
        final Brush brush3;
        final boolean z12;
        final KeyboardOptions keyboardOptions4;
        final MutableInteractionSource mutableInteractionSource3;
        final TextStyle textStyle4;
        final Modifier modifier3;
        int i32;
        Composer startRestartGroup = composer.startRestartGroup(1804514146);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)765@39981L90,763@39919L740:BasicTextField.kt#423gt5");
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
        int i33 = i5 & 4;
        if (i33 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z4 = z;
                i6 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z5 = z2;
                    i6 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        if ((i5 & 512) == 0 && startRestartGroup.changed(i)) {
                            i32 = 536870912;
                            i6 |= i32;
                        }
                        i32 = 268435456;
                        i6 |= i32;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i34 = i15;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i19 = i34 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i34 | (startRestartGroup.changedInstance(function12) ? 256 : 128);
                    } else {
                        i19 = i34;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i35 = i19;
                        if ((i4 & 3072) == 0) {
                            i21 = i35 | (startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024);
                        } else {
                            i21 = i35;
                        }
                    }
                    i22 = i5 & 16384;
                    if (i22 == 0) {
                        i23 = i21 | 24576;
                    } else {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= startRestartGroup.changed(brush) ? 16384 : 8192;
                            i24 = i5 & 32768;
                            if (i24 != 0) {
                                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i23 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            }
                            int i36 = i23;
                            if ((i6 & 306783379) == 306783378 || (74899 & i36) != 74898 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i33 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        z4 = true;
                                    }
                                    if (i8 != 0) {
                                        z5 = false;
                                    }
                                    if (i9 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    if (i10 != 0) {
                                        keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                    }
                                    KeyboardActions keyboardActions6 = i11 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                    boolean z13 = i12 != 0 ? false : z3;
                                    if ((i5 & 512) != 0) {
                                        i25 = z13 ? 1 : Integer.MAX_VALUE;
                                        i6 &= -1879048193;
                                    } else {
                                        i25 = i;
                                    }
                                    int i37 = i14 != 0 ? 1 : i2;
                                    none = i17 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                    basicTextFieldKt$BasicTextField$10 = i18 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function12;
                                    mutableInteractionSource2 = i20 != 0 ? null : mutableInteractionSource;
                                    if (i22 != 0) {
                                        keyboardActions3 = keyboardActions6;
                                        i26 = i6;
                                        solidColor = new SolidColor(Color.INSTANCE.m3849getBlack0d7_KjU(), null);
                                    } else {
                                        keyboardActions3 = keyboardActions6;
                                        i26 = i6;
                                        solidColor = brush;
                                    }
                                    if (i24 != 0) {
                                        brush2 = solidColor;
                                        z6 = z13;
                                        i27 = i25;
                                        i28 = i37;
                                        textStyle3 = textStyle2;
                                        keyboardActions4 = keyboardActions3;
                                        i29 = i26;
                                        z7 = z4;
                                        m979getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m979getLambda2$foundation_release();
                                        keyboardOptions3 = keyboardOptions2;
                                        z8 = z5;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1804514146, i29, i36, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                                        }
                                        ImeOptions imeOptions$foundation_release = keyboardOptions3.toImeOptions$foundation_release(z6);
                                        Modifier modifier4 = modifier2;
                                        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33 = m979getLambda2$foundation_release;
                                        boolean z14 = !z6;
                                        int i38 = !z6 ? 1 : i28;
                                        int i39 = !z6 ? 1 : i27;
                                        TextStyle textStyle5 = textStyle3;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950016, "CC(remember):BasicTextField.kt#9igjgp");
                                        z9 = ((i29 & 14) != 4) | ((i29 & 112) == 32);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!z9 || rememberedValue == Composer.INSTANCE.getEmpty()) {
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
                                        int i40 = i36 << 9;
                                        int i41 = ((i29 >> 6) & 7168) | (i29 & 910) | (i40 & 57344) | (i40 & 458752) | (i40 & 3670016) | (i40 & 29360128);
                                        int i42 = (i29 & 7168) | ((i29 >> 15) & 896) | (57344 & i29) | (i36 & 458752);
                                        boolean z15 = z6;
                                        Function1<? super TextLayoutResult, Unit> function14 = basicTextFieldKt$BasicTextField$10;
                                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                        VisualTransformation visualTransformation3 = none;
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                        CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier4, textStyle5, visualTransformation3, function14, mutableInteractionSource4, brush2, z14, i39, i38, imeOptions$foundation_release, keyboardActions4, z7, z8, function33, startRestartGroup, i41, i42, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        keyboardActions5 = keyboardActions4;
                                        composer2 = startRestartGroup;
                                        i30 = i27;
                                        i31 = i28;
                                        z10 = z15;
                                        visualTransformation2 = visualTransformation3;
                                        z11 = z7;
                                        function32 = function33;
                                        function13 = function14;
                                        brush3 = brush2;
                                        z12 = z8;
                                        keyboardOptions4 = keyboardOptions5;
                                        mutableInteractionSource3 = mutableInteractionSource4;
                                        textStyle4 = textStyle5;
                                        modifier3 = modifier4;
                                    } else {
                                        brush2 = solidColor;
                                        z6 = z13;
                                        i27 = i25;
                                        i28 = i37;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        keyboardActions4 = keyboardActions3;
                                        i29 = i26;
                                        z7 = z4;
                                        z8 = z5;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i5 & 512) != 0) {
                                        i6 &= -1879048193;
                                    }
                                    z6 = z3;
                                    i27 = i;
                                    i28 = i2;
                                    none = visualTransformation;
                                    basicTextFieldKt$BasicTextField$10 = function12;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    keyboardActions4 = keyboardActions2;
                                    textStyle3 = textStyle2;
                                    keyboardOptions3 = keyboardOptions2;
                                    i29 = i6;
                                    z7 = z4;
                                    z8 = z5;
                                    brush2 = brush;
                                }
                                m979getLambda2$foundation_release = function3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ImeOptions imeOptions$foundation_release2 = keyboardOptions3.toImeOptions$foundation_release(z6);
                                Modifier modifier42 = modifier2;
                                Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function332 = m979getLambda2$foundation_release;
                                boolean z142 = !z6;
                                if (!z6) {
                                }
                                if (!z6) {
                                }
                                TextStyle textStyle52 = textStyle3;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242950016, "CC(remember):BasicTextField.kt#9igjgp");
                                z9 = ((i29 & 14) != 4) | ((i29 & 112) == 32);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z9) {
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
                                int i402 = i36 << 9;
                                int i412 = ((i29 >> 6) & 7168) | (i29 & 910) | (i402 & 57344) | (i402 & 458752) | (i402 & 3670016) | (i402 & 29360128);
                                int i422 = (i29 & 7168) | ((i29 >> 15) & 896) | (57344 & i29) | (i36 & 458752);
                                boolean z152 = z6;
                                Function1<? super TextLayoutResult, Unit> function142 = basicTextFieldKt$BasicTextField$10;
                                KeyboardOptions keyboardOptions52 = keyboardOptions3;
                                VisualTransformation visualTransformation32 = none;
                                MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) rememberedValue, modifier42, textStyle52, visualTransformation32, function142, mutableInteractionSource42, brush2, z142, i39, i38, imeOptions$foundation_release2, keyboardActions4, z7, z8, function332, startRestartGroup, i412, i422, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                keyboardActions5 = keyboardActions4;
                                composer2 = startRestartGroup;
                                i30 = i27;
                                i31 = i28;
                                z10 = z152;
                                visualTransformation2 = visualTransformation32;
                                z11 = z7;
                                function32 = function332;
                                function13 = function142;
                                brush3 = brush2;
                                z12 = z8;
                                keyboardOptions4 = keyboardOptions52;
                                mutableInteractionSource3 = mutableInteractionSource42;
                                textStyle4 = textStyle52;
                                modifier3 = modifier42;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i30 = i;
                                visualTransformation2 = visualTransformation;
                                function32 = function3;
                                composer2 = startRestartGroup;
                                z11 = z4;
                                keyboardActions5 = keyboardActions2;
                                z12 = z5;
                                textStyle4 = textStyle2;
                                keyboardOptions4 = keyboardOptions2;
                                modifier3 = modifier2;
                                z10 = z3;
                                i31 = i2;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush3 = brush;
                            }
                            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
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

                                    public final void invoke(Composer composer3, int i43) {
                                        BasicTextFieldKt.BasicTextField(TextFieldValue.this, function1, modifier3, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i30, i31, visualTransformation2, function13, mutableInteractionSource3, brush3, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    i24 = i5 & 32768;
                    if (i24 != 0) {
                    }
                    int i362 = i23;
                    if ((i6 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i33 != 0) {
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
                    if (i14 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i24 != 0) {
                    }
                }
                z5 = z2;
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
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i342 = i15;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & 16384;
                if (i22 == 0) {
                }
                i24 = i5 & 32768;
                if (i24 != 0) {
                }
                int i3622 = i23;
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i33 != 0) {
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
                if (i14 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 != 0) {
                }
                if (i24 != 0) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
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
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3422 = i15;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & 16384;
            if (i22 == 0) {
            }
            i24 = i5 & 32768;
            if (i24 != 0) {
            }
            int i36222 = i23;
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i33 != 0) {
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
            if (i14 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 != 0) {
            }
            if (i24 != 0) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
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
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i34222 = i15;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & 16384;
        if (i22 == 0) {
        }
        i24 = i5 & 32768;
        if (i24 != 0) {
        }
        int i362222 = i23;
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i33 != 0) {
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
        if (i14 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 != 0) {
        }
        if (i24 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
        String str2;
        int i5;
        Function1 function13;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        boolean z6;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z7;
        int i26;
        Brush brush2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z8;
        final boolean z9;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i27;
        final VisualTransformation visualTransformation2;
        final Function1 function14;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush3;
        final Function3 function32;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-454732590);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)802@41349L39,807@41589L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
            str2 = str;
        } else if ((i2 & 6) == 0) {
            str2 = str;
            i5 = (startRestartGroup.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            function13 = function1;
            i5 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z4 = z;
                    i5 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        z5 = z2;
                        i5 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                            keyboardActions2 = keyboardActions;
                        } else {
                            keyboardActions2 = keyboardActions;
                            if ((i2 & 12582912) == 0) {
                                i5 |= startRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                            }
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
                            i14 = i13;
                            i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            i18 = i4 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                                i19 = i18;
                            } else if ((i3 & 48) == 0) {
                                i19 = i18;
                                i17 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                            } else {
                                i19 = i18;
                            }
                            int i28 = i17;
                            i20 = i4 & 4096;
                            if (i20 == 0) {
                                i21 = i28 | 384;
                            } else {
                                int i29 = i28;
                                if ((i3 & 384) == 0) {
                                    i29 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                                }
                                i21 = i29;
                            }
                            i22 = i4 & 8192;
                            if (i22 == 0) {
                                i23 = i21 | 3072;
                            } else {
                                int i30 = i21;
                                if ((i3 & 3072) == 0) {
                                    i23 = i30 | (startRestartGroup.changed(brush) ? 2048 : 1024);
                                } else {
                                    i23 = i30;
                                }
                            }
                            i24 = i4 & 16384;
                            if (i24 == 0) {
                                i25 = i23 | 24576;
                            } else {
                                int i31 = i23;
                                if ((i3 & 24576) == 0) {
                                    i31 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                                }
                                i25 = i31;
                            }
                            if ((i5 & 306783379) == 306783378 || (i25 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                if (i6 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                boolean z11 = i7 == 0 ? true : z4;
                                boolean z12 = i8 == 0 ? false : z5;
                                TextStyle textStyle4 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                KeyboardOptions keyboardOptions4 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                                KeyboardActions keyboardActions4 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 == 0 ? false : z3;
                                int i32 = i14 == 0 ? Integer.MAX_VALUE : i;
                                VisualTransformation none = i16 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1 function15 = i19 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i20 == 0) {
                                    z6 = z11;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242906291, "CC(remember):BasicTextField.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                } else {
                                    z6 = z11;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i22 == 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    brush2 = new SolidColor(Color.INSTANCE.m3849getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    brush2 = brush;
                                }
                                Function3 m980getLambda3$foundation_release = i26 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m980getLambda3$foundation_release() : function3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-454732590, i5, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:806)");
                                }
                                int i33 = i25 << 3;
                                boolean z14 = z7;
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                composer2 = startRestartGroup;
                                String str3 = str2;
                                Function1 function16 = function13;
                                TextStyle textStyle5 = textStyle4;
                                Modifier modifier4 = modifier2;
                                VisualTransformation visualTransformation3 = none;
                                boolean z15 = z6;
                                BasicTextField(str3, (Function1<? super String, Unit>) function16, modifier4, z15, z14, textStyle5, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource5, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m980getLambda3$foundation_release, composer2, i5 & 2147483646, (i33 & 112) | 6 | (i33 & 896) | (i33 & 7168) | (57344 & i33) | (i33 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z8 = z15;
                                z9 = z14;
                                textStyle3 = textStyle5;
                                keyboardOptions3 = keyboardOptions4;
                                keyboardActions3 = keyboardActions4;
                                z10 = z13;
                                i27 = i32;
                                visualTransformation2 = visualTransformation3;
                                function14 = function15;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                brush3 = brush2;
                                function32 = m980getLambda3$foundation_release;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z10 = z3;
                                function14 = function12;
                                mutableInteractionSource4 = mutableInteractionSource;
                                composer2 = startRestartGroup;
                                z8 = z4;
                                z9 = z5;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                modifier3 = modifier2;
                                i27 = i;
                                visualTransformation2 = visualTransformation;
                                brush3 = brush;
                                function32 = function3;
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

                                    public final void invoke(Composer composer3, int i34) {
                                        BasicTextFieldKt.BasicTextField(str, function1, modifier3, z8, z9, textStyle3, keyboardOptions3, keyboardActions3, z10, i27, visualTransformation2, function14, mutableInteractionSource4, brush3, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 == 0) {
                        }
                        int i282 = i17;
                        i20 = i4 & 4096;
                        if (i20 == 0) {
                        }
                        i22 = i4 & 8192;
                        if (i22 == 0) {
                        }
                        i24 = i4 & 16384;
                        if (i24 == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i6 != 0) {
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
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i332 = i25 << 3;
                        boolean z142 = z7;
                        MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                        composer2 = startRestartGroup;
                        String str32 = str2;
                        Function1 function162 = function13;
                        TextStyle textStyle52 = textStyle4;
                        Modifier modifier42 = modifier2;
                        VisualTransformation visualTransformation32 = none;
                        boolean z152 = z6;
                        BasicTextField(str32, (Function1<? super String, Unit>) function162, modifier42, z152, z142, textStyle52, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation32, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource52, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m980getLambda3$foundation_release, composer2, i5 & 2147483646, (i332 & 112) | 6 | (i332 & 896) | (i332 & 7168) | (57344 & i332) | (i332 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        z8 = z152;
                        z9 = z142;
                        textStyle3 = textStyle52;
                        keyboardOptions3 = keyboardOptions4;
                        keyboardActions3 = keyboardActions4;
                        z10 = z13;
                        i27 = i32;
                        visualTransformation2 = visualTransformation32;
                        function14 = function15;
                        mutableInteractionSource4 = mutableInteractionSource52;
                        brush3 = brush2;
                        function32 = m980getLambda3$foundation_release;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z5 = z2;
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
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 == 0) {
                    }
                    int i2822 = i17;
                    i20 = i4 & 4096;
                    if (i20 == 0) {
                    }
                    i22 = i4 & 8192;
                    if (i22 == 0) {
                    }
                    i24 = i4 & 16384;
                    if (i24 == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i6 != 0) {
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
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i3322 = i25 << 3;
                    boolean z1422 = z7;
                    MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                    composer2 = startRestartGroup;
                    String str322 = str2;
                    Function1 function1622 = function13;
                    TextStyle textStyle522 = textStyle4;
                    Modifier modifier422 = modifier2;
                    VisualTransformation visualTransformation322 = none;
                    boolean z1522 = z6;
                    BasicTextField(str322, (Function1<? super String, Unit>) function1622, modifier422, z1522, z1422, textStyle522, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation322, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource522, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m980getLambda3$foundation_release, composer2, i5 & 2147483646, (i3322 & 112) | 6 | (i3322 & 896) | (i3322 & 7168) | (57344 & i3322) | (i3322 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier422;
                    z8 = z1522;
                    z9 = z1422;
                    textStyle3 = textStyle522;
                    keyboardOptions3 = keyboardOptions4;
                    keyboardActions3 = keyboardActions4;
                    z10 = z13;
                    i27 = i32;
                    visualTransformation2 = visualTransformation322;
                    function14 = function15;
                    mutableInteractionSource4 = mutableInteractionSource522;
                    brush3 = brush2;
                    function32 = m980getLambda3$foundation_release;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z5 = z2;
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
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                i18 = i4 & 2048;
                if (i18 == 0) {
                }
                int i28222 = i17;
                i20 = i4 & 4096;
                if (i20 == 0) {
                }
                i22 = i4 & 8192;
                if (i22 == 0) {
                }
                i24 = i4 & 16384;
                if (i24 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i6 != 0) {
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
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
                }
                if (i26 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i33222 = i25 << 3;
                boolean z14222 = z7;
                MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
                composer2 = startRestartGroup;
                String str3222 = str2;
                Function1 function16222 = function13;
                TextStyle textStyle5222 = textStyle4;
                Modifier modifier4222 = modifier2;
                VisualTransformation visualTransformation3222 = none;
                boolean z15222 = z6;
                BasicTextField(str3222, (Function1<? super String, Unit>) function16222, modifier4222, z15222, z14222, textStyle5222, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation3222, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource5222, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m980getLambda3$foundation_release, composer2, i5 & 2147483646, (i33222 & 112) | 6 | (i33222 & 896) | (i33222 & 7168) | (57344 & i33222) | (i33222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4222;
                z8 = z15222;
                z9 = z14222;
                textStyle3 = textStyle5222;
                keyboardOptions3 = keyboardOptions4;
                keyboardActions3 = keyboardActions4;
                z10 = z13;
                i27 = i32;
                visualTransformation2 = visualTransformation3222;
                function14 = function15;
                mutableInteractionSource4 = mutableInteractionSource5222;
                brush3 = brush2;
                function32 = m980getLambda3$foundation_release;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z4 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z5 = z2;
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
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            i18 = i4 & 2048;
            if (i18 == 0) {
            }
            int i282222 = i17;
            i20 = i4 & 4096;
            if (i20 == 0) {
            }
            i22 = i4 & 8192;
            if (i22 == 0) {
            }
            i24 = i4 & 16384;
            if (i24 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i6 != 0) {
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
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
            if (i22 == 0) {
            }
            if (i26 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i332222 = i25 << 3;
            boolean z142222 = z7;
            MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
            composer2 = startRestartGroup;
            String str32222 = str2;
            Function1 function162222 = function13;
            TextStyle textStyle52222 = textStyle4;
            Modifier modifier42222 = modifier2;
            VisualTransformation visualTransformation32222 = none;
            boolean z152222 = z6;
            BasicTextField(str32222, (Function1<? super String, Unit>) function162222, modifier42222, z152222, z142222, textStyle52222, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation32222, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource52222, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m980getLambda3$foundation_release, composer2, i5 & 2147483646, (i332222 & 112) | 6 | (i332222 & 896) | (i332222 & 7168) | (57344 & i332222) | (i332222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42222;
            z8 = z152222;
            z9 = z142222;
            textStyle3 = textStyle52222;
            keyboardOptions3 = keyboardOptions4;
            keyboardActions3 = keyboardActions4;
            z10 = z13;
            i27 = i32;
            visualTransformation2 = visualTransformation32222;
            function14 = function15;
            mutableInteractionSource4 = mutableInteractionSource52222;
            brush3 = brush2;
            function32 = m980getLambda3$foundation_release;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function13 = function1;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z4 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z5 = z2;
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
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        i18 = i4 & 2048;
        if (i18 == 0) {
        }
        int i2822222 = i17;
        i20 = i4 & 4096;
        if (i20 == 0) {
        }
        i22 = i4 & 8192;
        if (i22 == 0) {
        }
        i24 = i4 & 16384;
        if (i24 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i6 != 0) {
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
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
        if (i22 == 0) {
        }
        if (i26 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3322222 = i25 << 3;
        boolean z1422222 = z7;
        MutableInteractionSource mutableInteractionSource522222 = mutableInteractionSource3;
        composer2 = startRestartGroup;
        String str322222 = str2;
        Function1 function1622222 = function13;
        TextStyle textStyle522222 = textStyle4;
        Modifier modifier422222 = modifier2;
        VisualTransformation visualTransformation322222 = none;
        boolean z1522222 = z6;
        BasicTextField(str322222, (Function1<? super String, Unit>) function1622222, modifier422222, z1522222, z1422222, textStyle522222, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation322222, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource522222, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m980getLambda3$foundation_release, composer2, i5 & 2147483646, (i3322222 & 112) | 6 | (i3322222 & 896) | (i3322222 & 7168) | (57344 & i3322222) | (i3322222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier422222;
        z8 = z1522222;
        z9 = z1422222;
        textStyle3 = textStyle522222;
        keyboardOptions3 = keyboardOptions4;
        keyboardActions3 = keyboardActions4;
        z10 = z13;
        i27 = i32;
        visualTransformation2 = visualTransformation322222;
        function14 = function15;
        mutableInteractionSource4 = mutableInteractionSource522222;
        brush3 = brush2;
        function32 = m980getLambda3$foundation_release;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
        TextFieldValue textFieldValue2;
        int i5;
        Function1 function13;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        boolean z6;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z7;
        int i26;
        Brush brush2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z8;
        final boolean z9;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i27;
        final VisualTransformation visualTransformation2;
        final Function1 function14;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush3;
        final Function3 function32;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-560482651);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)842@42874L39,847@43114L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
            textFieldValue2 = textFieldValue;
        } else if ((i2 & 6) == 0) {
            textFieldValue2 = textFieldValue;
            i5 = (startRestartGroup.changed(textFieldValue2) ? 4 : 2) | i2;
        } else {
            textFieldValue2 = textFieldValue;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            function13 = function1;
            i5 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z4 = z;
                    i5 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        z5 = z2;
                        i5 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                            keyboardActions2 = keyboardActions;
                        } else {
                            keyboardActions2 = keyboardActions;
                            if ((i2 & 12582912) == 0) {
                                i5 |= startRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                            }
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
                            i14 = i13;
                            i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            i18 = i4 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                                i19 = i18;
                            } else if ((i3 & 48) == 0) {
                                i19 = i18;
                                i17 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                            } else {
                                i19 = i18;
                            }
                            int i28 = i17;
                            i20 = i4 & 4096;
                            if (i20 == 0) {
                                i21 = i28 | 384;
                            } else {
                                int i29 = i28;
                                if ((i3 & 384) == 0) {
                                    i29 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                                }
                                i21 = i29;
                            }
                            i22 = i4 & 8192;
                            if (i22 == 0) {
                                i23 = i21 | 3072;
                            } else {
                                int i30 = i21;
                                if ((i3 & 3072) == 0) {
                                    i23 = i30 | (startRestartGroup.changed(brush) ? 2048 : 1024);
                                } else {
                                    i23 = i30;
                                }
                            }
                            i24 = i4 & 16384;
                            if (i24 == 0) {
                                i25 = i23 | 24576;
                            } else {
                                int i31 = i23;
                                if ((i3 & 24576) == 0) {
                                    i31 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                                }
                                i25 = i31;
                            }
                            if ((i5 & 306783379) == 306783378 || (i25 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                                if (i6 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                boolean z11 = i7 == 0 ? true : z4;
                                boolean z12 = i8 == 0 ? false : z5;
                                TextStyle textStyle4 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                KeyboardOptions keyboardOptions4 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                                KeyboardActions keyboardActions4 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 == 0 ? false : z3;
                                int i32 = i14 == 0 ? Integer.MAX_VALUE : i;
                                VisualTransformation none = i16 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1 function15 = i19 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$16
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i20 == 0) {
                                    z6 = z11;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242857491, "CC(remember):BasicTextField.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                } else {
                                    z6 = z11;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i22 == 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    brush2 = new SolidColor(Color.INSTANCE.m3849getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    brush2 = brush;
                                }
                                Function3 m981getLambda4$foundation_release = i26 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m981getLambda4$foundation_release() : function3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-560482651, i5, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:846)");
                                }
                                int i33 = i25 << 3;
                                boolean z14 = z7;
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                composer2 = startRestartGroup;
                                TextFieldValue textFieldValue3 = textFieldValue2;
                                Function1 function16 = function13;
                                TextStyle textStyle5 = textStyle4;
                                Modifier modifier4 = modifier2;
                                VisualTransformation visualTransformation3 = none;
                                boolean z15 = z6;
                                BasicTextField(textFieldValue3, (Function1<? super TextFieldValue, Unit>) function16, modifier4, z15, z14, textStyle5, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource5, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m981getLambda4$foundation_release, composer2, i5 & 2147483646, (i33 & 112) | 6 | (i33 & 896) | (i33 & 7168) | (57344 & i33) | (i33 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z8 = z15;
                                z9 = z14;
                                textStyle3 = textStyle5;
                                keyboardOptions3 = keyboardOptions4;
                                keyboardActions3 = keyboardActions4;
                                z10 = z13;
                                i27 = i32;
                                visualTransformation2 = visualTransformation3;
                                function14 = function15;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                brush3 = brush2;
                                function32 = m981getLambda4$foundation_release;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z10 = z3;
                                function14 = function12;
                                mutableInteractionSource4 = mutableInteractionSource;
                                composer2 = startRestartGroup;
                                z8 = z4;
                                z9 = z5;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                modifier3 = modifier2;
                                i27 = i;
                                visualTransformation2 = visualTransformation;
                                brush3 = brush;
                                function32 = function3;
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

                                    public final void invoke(Composer composer3, int i34) {
                                        BasicTextFieldKt.BasicTextField(TextFieldValue.this, function1, modifier3, z8, z9, textStyle3, keyboardOptions3, keyboardActions3, z10, i27, visualTransformation2, function14, mutableInteractionSource4, brush3, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 == 0) {
                        }
                        int i282 = i17;
                        i20 = i4 & 4096;
                        if (i20 == 0) {
                        }
                        i22 = i4 & 8192;
                        if (i22 == 0) {
                        }
                        i24 = i4 & 16384;
                        if (i24 == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i6 != 0) {
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
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i332 = i25 << 3;
                        boolean z142 = z7;
                        MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                        composer2 = startRestartGroup;
                        TextFieldValue textFieldValue32 = textFieldValue2;
                        Function1 function162 = function13;
                        TextStyle textStyle52 = textStyle4;
                        Modifier modifier42 = modifier2;
                        VisualTransformation visualTransformation32 = none;
                        boolean z152 = z6;
                        BasicTextField(textFieldValue32, (Function1<? super TextFieldValue, Unit>) function162, modifier42, z152, z142, textStyle52, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation32, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource52, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m981getLambda4$foundation_release, composer2, i5 & 2147483646, (i332 & 112) | 6 | (i332 & 896) | (i332 & 7168) | (57344 & i332) | (i332 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        z8 = z152;
                        z9 = z142;
                        textStyle3 = textStyle52;
                        keyboardOptions3 = keyboardOptions4;
                        keyboardActions3 = keyboardActions4;
                        z10 = z13;
                        i27 = i32;
                        visualTransformation2 = visualTransformation32;
                        function14 = function15;
                        mutableInteractionSource4 = mutableInteractionSource52;
                        brush3 = brush2;
                        function32 = m981getLambda4$foundation_release;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z5 = z2;
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
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 == 0) {
                    }
                    int i2822 = i17;
                    i20 = i4 & 4096;
                    if (i20 == 0) {
                    }
                    i22 = i4 & 8192;
                    if (i22 == 0) {
                    }
                    i24 = i4 & 16384;
                    if (i24 == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i6 != 0) {
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
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i3322 = i25 << 3;
                    boolean z1422 = z7;
                    MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                    composer2 = startRestartGroup;
                    TextFieldValue textFieldValue322 = textFieldValue2;
                    Function1 function1622 = function13;
                    TextStyle textStyle522 = textStyle4;
                    Modifier modifier422 = modifier2;
                    VisualTransformation visualTransformation322 = none;
                    boolean z1522 = z6;
                    BasicTextField(textFieldValue322, (Function1<? super TextFieldValue, Unit>) function1622, modifier422, z1522, z1422, textStyle522, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation322, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource522, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m981getLambda4$foundation_release, composer2, i5 & 2147483646, (i3322 & 112) | 6 | (i3322 & 896) | (i3322 & 7168) | (57344 & i3322) | (i3322 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier422;
                    z8 = z1522;
                    z9 = z1422;
                    textStyle3 = textStyle522;
                    keyboardOptions3 = keyboardOptions4;
                    keyboardActions3 = keyboardActions4;
                    z10 = z13;
                    i27 = i32;
                    visualTransformation2 = visualTransformation322;
                    function14 = function15;
                    mutableInteractionSource4 = mutableInteractionSource522;
                    brush3 = brush2;
                    function32 = m981getLambda4$foundation_release;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z5 = z2;
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
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                i18 = i4 & 2048;
                if (i18 == 0) {
                }
                int i28222 = i17;
                i20 = i4 & 4096;
                if (i20 == 0) {
                }
                i22 = i4 & 8192;
                if (i22 == 0) {
                }
                i24 = i4 & 16384;
                if (i24 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i6 != 0) {
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
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
                }
                if (i26 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i33222 = i25 << 3;
                boolean z14222 = z7;
                MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
                composer2 = startRestartGroup;
                TextFieldValue textFieldValue3222 = textFieldValue2;
                Function1 function16222 = function13;
                TextStyle textStyle5222 = textStyle4;
                Modifier modifier4222 = modifier2;
                VisualTransformation visualTransformation3222 = none;
                boolean z15222 = z6;
                BasicTextField(textFieldValue3222, (Function1<? super TextFieldValue, Unit>) function16222, modifier4222, z15222, z14222, textStyle5222, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation3222, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource5222, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m981getLambda4$foundation_release, composer2, i5 & 2147483646, (i33222 & 112) | 6 | (i33222 & 896) | (i33222 & 7168) | (57344 & i33222) | (i33222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4222;
                z8 = z15222;
                z9 = z14222;
                textStyle3 = textStyle5222;
                keyboardOptions3 = keyboardOptions4;
                keyboardActions3 = keyboardActions4;
                z10 = z13;
                i27 = i32;
                visualTransformation2 = visualTransformation3222;
                function14 = function15;
                mutableInteractionSource4 = mutableInteractionSource5222;
                brush3 = brush2;
                function32 = m981getLambda4$foundation_release;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z4 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z5 = z2;
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
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            i18 = i4 & 2048;
            if (i18 == 0) {
            }
            int i282222 = i17;
            i20 = i4 & 4096;
            if (i20 == 0) {
            }
            i22 = i4 & 8192;
            if (i22 == 0) {
            }
            i24 = i4 & 16384;
            if (i24 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i6 != 0) {
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
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
            if (i22 == 0) {
            }
            if (i26 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i332222 = i25 << 3;
            boolean z142222 = z7;
            MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
            composer2 = startRestartGroup;
            TextFieldValue textFieldValue32222 = textFieldValue2;
            Function1 function162222 = function13;
            TextStyle textStyle52222 = textStyle4;
            Modifier modifier42222 = modifier2;
            VisualTransformation visualTransformation32222 = none;
            boolean z152222 = z6;
            BasicTextField(textFieldValue32222, (Function1<? super TextFieldValue, Unit>) function162222, modifier42222, z152222, z142222, textStyle52222, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation32222, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource52222, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m981getLambda4$foundation_release, composer2, i5 & 2147483646, (i332222 & 112) | 6 | (i332222 & 896) | (i332222 & 7168) | (57344 & i332222) | (i332222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42222;
            z8 = z152222;
            z9 = z142222;
            textStyle3 = textStyle52222;
            keyboardOptions3 = keyboardOptions4;
            keyboardActions3 = keyboardActions4;
            z10 = z13;
            i27 = i32;
            visualTransformation2 = visualTransformation32222;
            function14 = function15;
            mutableInteractionSource4 = mutableInteractionSource52222;
            brush3 = brush2;
            function32 = m981getLambda4$foundation_release;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function13 = function1;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z4 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z5 = z2;
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
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        i18 = i4 & 2048;
        if (i18 == 0) {
        }
        int i2822222 = i17;
        i20 = i4 & 4096;
        if (i20 == 0) {
        }
        i22 = i4 & 8192;
        if (i22 == 0) {
        }
        i24 = i4 & 16384;
        if (i24 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i6 != 0) {
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
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
        if (i22 == 0) {
        }
        if (i26 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3322222 = i25 << 3;
        boolean z1422222 = z7;
        MutableInteractionSource mutableInteractionSource522222 = mutableInteractionSource3;
        composer2 = startRestartGroup;
        TextFieldValue textFieldValue322222 = textFieldValue2;
        Function1 function1622222 = function13;
        TextStyle textStyle522222 = textStyle4;
        Modifier modifier422222 = modifier2;
        VisualTransformation visualTransformation322222 = none;
        boolean z1522222 = z6;
        BasicTextField(textFieldValue322222, (Function1<? super TextFieldValue, Unit>) function1622222, modifier422222, z1522222, z1422222, textStyle522222, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation322222, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource522222, brush2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) m981getLambda4$foundation_release, composer2, i5 & 2147483646, (i3322222 & 112) | 6 | (i3322222 & 896) | (i3322222 & 7168) | (57344 & i3322222) | (i3322222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier422222;
        z8 = z1522222;
        z9 = z1422222;
        textStyle3 = textStyle522222;
        keyboardOptions3 = keyboardOptions4;
        keyboardActions3 = keyboardActions4;
        z10 = z13;
        i27 = i32;
        visualTransformation2 = visualTransformation322222;
        function14 = function15;
        mutableInteractionSource4 = mutableInteractionSource522222;
        brush3 = brush2;
        function32 = m981getLambda4$foundation_release;
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
