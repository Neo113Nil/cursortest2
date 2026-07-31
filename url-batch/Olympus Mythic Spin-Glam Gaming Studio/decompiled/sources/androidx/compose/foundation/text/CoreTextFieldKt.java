package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a×\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112$\b\u0002\u0010\u001d\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a2\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001cH\u0003¢\u0006\u0004\b#\u0010$\u001a#\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010(\u001a'\u0010,\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010-\u001a/\u00100\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00102\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b2\u00103\u001a7\u0010:\u001a\u00020\u0003*\u0002042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u000b2\u0006\u00109\u001a\u000208H\u0080@ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010=\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010<\u001a\u00020\u0011H\u0003¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010?\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "decorationBox", "CoreTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "content", "CoreTextFieldRootBox", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/TextFieldState;", "state", "previewKeyEventToDeselectOnBack", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "allowKeyboard", "tapToFocus", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/focus/FocusRequester;Z)V", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "notifyTextInputServiceOnFocusChange", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;)V", "onBlur", "(Landroidx/compose/foundation/text/TextFieldState;)V", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "bringSelectionEndIntoView", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "SelectionToolbarAndHandles", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0602 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cf  */
    /* JADX WARN: Type inference failed for: r0v53, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1 function1, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
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
        Modifier modifier2;
        Brush brush2;
        ImeOptions imeOptions2;
        Modifier modifier3;
        Function3 function32;
        boolean z4;
        ImeOptions imeOptions3;
        KeyboardActions keyboardActions2;
        int i17;
        boolean z5;
        VisualTransformation visualTransformation2;
        Brush brush3;
        Function1 function12;
        MutableInteractionSource mutableInteractionSource2;
        int i18;
        TextStyle textStyle2;
        boolean z6;
        final Orientation orientation;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        TextRange composition;
        boolean z7;
        ImeOptions imeOptions4;
        Object rememberedValue3;
        Composer.Companion companion;
        Object rememberedValue4;
        Object rememberedValue5;
        Object rememberedValue6;
        Object rememberedValue7;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier pointerHoverIcon$default;
        Composer composer2;
        final TextStyle textStyle3;
        final MutableInteractionSource mutableInteractionSource4;
        final Function1 function13;
        final Brush brush4;
        final boolean z8;
        final KeyboardActions keyboardActions3;
        final boolean z9;
        final Function3 function33;
        final VisualTransformation visualTransformation3;
        final boolean z10;
        final ImeOptions imeOptions5;
        final Modifier modifier5;
        final int i19;
        ScopeUpdateScope endRestartGroup;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(109313709);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changed(function1) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                }
                if ((i2 & 29360128) == 0) {
                    if ((i4 & 128) == 0 && startRestartGroup.changed(brush)) {
                        i21 = 8388608;
                        i5 |= i21;
                    }
                    i21 = 4194304;
                    i5 |= i21;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    if ((i4 & 1024) == 0 && startRestartGroup.changed(imeOptions)) {
                        i20 = 4;
                        i12 = i3 | i20;
                    }
                    i20 = 2;
                    i12 = i3 | i20;
                } else {
                    i12 = i3;
                }
                i13 = i4 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i3 & 112) == 0) {
                    i12 |= startRestartGroup.changed(keyboardActions) ? 32 : 16;
                }
                int i23 = i12;
                i14 = i4 & 4096;
                if (i14 != 0) {
                    i23 |= 384;
                } else if ((i3 & 896) == 0) {
                    i23 |= startRestartGroup.changed(z2) ? 256 : 128;
                    i15 = i4 & 8192;
                    if (i15 == 0) {
                        i23 |= 3072;
                    } else if ((i3 & 7168) == 0) {
                        i23 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                        i16 = i4 & 16384;
                        if (i16 != 0) {
                            i23 |= 24576;
                        } else if ((i3 & 57344) == 0) {
                            i23 |= startRestartGroup.changed(function3) ? 16384 : 8192;
                        }
                        if ((i5 & 1533916891) != 306783378 && (46811 & i23) == 9362 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            modifier5 = modifier;
                            textStyle3 = textStyle;
                            visualTransformation3 = visualTransformation;
                            function13 = function1;
                            mutableInteractionSource4 = mutableInteractionSource;
                            brush4 = brush;
                            z8 = z;
                            imeOptions5 = imeOptions;
                            keyboardActions3 = keyboardActions;
                            z10 = z2;
                            z9 = z3;
                            function33 = function3;
                            composer2 = startRestartGroup;
                            i19 = i;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i22 != 0 ? Modifier.INSTANCE : modifier;
                                TextStyle textStyle4 = i6 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                VisualTransformation none = i7 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1 function14 = i8 != 0 ? new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1
                                    public final void invoke(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextLayoutResult) obj);
                                        return Unit.INSTANCE;
                                    }
                                } : function1;
                                MutableInteractionSource mutableInteractionSource5 = i9 != 0 ? null : mutableInteractionSource;
                                if ((i4 & 128) != 0) {
                                    modifier2 = modifier6;
                                    brush2 = new SolidColor(Color.INSTANCE.m1461getUnspecified0d7_KjU(), null);
                                } else {
                                    modifier2 = modifier6;
                                    brush2 = brush;
                                }
                                boolean z11 = i10 != 0 ? true : z;
                                int i24 = i11 != 0 ? Integer.MAX_VALUE : i;
                                if ((i4 & 1024) != 0) {
                                    imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                    i23 &= -15;
                                } else {
                                    imeOptions2 = imeOptions;
                                }
                                KeyboardActions keyboardActions4 = i13 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                boolean z12 = i14 != 0 ? true : z2;
                                boolean z13 = i15 != 0 ? false : z3;
                                if (i16 != 0) {
                                    modifier3 = modifier2;
                                    z4 = z11;
                                    keyboardActions2 = keyboardActions4;
                                    z5 = z13;
                                    function32 = ComposableSingletons$CoreTextFieldKt.INSTANCE.m526getLambda1$foundation_release();
                                    visualTransformation2 = none;
                                    brush3 = brush2;
                                    function12 = function14;
                                    mutableInteractionSource2 = mutableInteractionSource5;
                                    i18 = i24;
                                    imeOptions3 = imeOptions2;
                                    textStyle2 = textStyle4;
                                    i17 = i23;
                                } else {
                                    modifier3 = modifier2;
                                    function32 = function3;
                                    z4 = z11;
                                    imeOptions3 = imeOptions2;
                                    keyboardActions2 = keyboardActions4;
                                    i17 = i23;
                                    z5 = z13;
                                    visualTransformation2 = none;
                                    brush3 = brush2;
                                    function12 = function14;
                                    mutableInteractionSource2 = mutableInteractionSource5;
                                    i18 = i24;
                                    textStyle2 = textStyle4;
                                }
                                z6 = z12;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 1024) != 0) {
                                    modifier3 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function12 = function1;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush3 = brush;
                                    z4 = z;
                                    i18 = i;
                                    imeOptions3 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z6 = z2;
                                    z5 = z3;
                                    function32 = function3;
                                    i17 = i23 & (-15);
                                } else {
                                    modifier3 = modifier;
                                    textStyle2 = textStyle;
                                    visualTransformation2 = visualTransformation;
                                    function12 = function1;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush3 = brush;
                                    z4 = z;
                                    i18 = i;
                                    imeOptions3 = imeOptions;
                                    keyboardActions2 = keyboardActions;
                                    z6 = z2;
                                    z5 = z3;
                                    function32 = function3;
                                    i17 = i23;
                                }
                            }
                            startRestartGroup.endDefaults();
                            final FocusRequester focusRequester = new FocusRequester();
                            startRestartGroup.startReplaceableGroup(-55013392);
                            final TextInputService textInputService = (z6 || z5) ? null : (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
                            startRestartGroup.endReplaceableGroup();
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            FontFamily.Resolver resolver = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                            long selectionBackgroundColor = ((SelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                            FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            Modifier modifier7 = modifier3;
                            orientation = (i18 == 1 || z4 || !imeOptions3.getSingleLine()) ? Orientation.Vertical : Orientation.Horizontal;
                            Object[] objArr = {orientation};
                            Saver saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                            final int i25 = i18;
                            startRestartGroup.startReplaceableGroup(1157296644);
                            changed = startRestartGroup.changed(orientation);
                            final int i26 = i17;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final TextFieldScrollerPosition mo4828invoke() {
                                        return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.rememberSaveable(objArr, saver, null, (Function0) rememberedValue, startRestartGroup, 72, 4);
                            startRestartGroup.startReplaceableGroup(511388516);
                            changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                TransformedText filter = visualTransformation2.filter(value.getText());
                                composition = value.getComposition();
                                z7 = z6;
                                imeOptions4 = imeOptions3;
                                if (composition != null) {
                                    TransformedText m580applyCompositionDecoration72CqOWE = TextFieldDelegate.INSTANCE.m580applyCompositionDecoration72CqOWE(composition.getPackedValue(), filter);
                                    if (m580applyCompositionDecoration72CqOWE != null) {
                                        rememberedValue2 = m580applyCompositionDecoration72CqOWE;
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                }
                                rememberedValue2 = filter;
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            } else {
                                z7 = z6;
                                imeOptions4 = imeOptions3;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TransformedText transformedText = (TransformedText) rememberedValue2;
                            AnnotatedString text = transformedText.getText();
                            final OffsetMapping offsetMapping = transformedText.getOffsetMapping();
                            RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new TextFieldState(new TextDelegate(text, textStyle2, 0, z4, 0, density, resolver, null, 148, null), currentRecomposeScope);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldState textFieldState = (TextFieldState) rememberedValue3;
                            textFieldState.m595updateaKPrnQ(text, textStyle2, z4, density, resolver, onValueChange, keyboardActions2, focusManager, selectionBackgroundColor);
                            textFieldState.getProcessor().reset(value, textFieldState.getInputSession());
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == companion.getEmpty()) {
                                rememberedValue4 = new UndoManager(0, 1, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceableGroup();
                            UndoManager undoManager = (UndoManager) rememberedValue4;
                            UndoManager.snapshotIfNeeded$default(undoManager, value, 0L, 2, null);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == companion.getEmpty()) {
                                rememberedValue5 = new TextFieldSelectionManager(undoManager);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) rememberedValue5;
                            textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                            textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation2);
                            textFieldSelectionManager.setOnValueChange$foundation_release(textFieldState.getOnValueChange());
                            textFieldSelectionManager.setState$foundation_release(textFieldState);
                            textFieldSelectionManager.setValue$foundation_release(value);
                            textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                            textFieldSelectionManager.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                            textFieldSelectionManager.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                            textFieldSelectionManager.setFocusRequester(focusRequester);
                            textFieldSelectionManager.setEditable(!z5);
                            startRestartGroup.startReplaceableGroup(773894976);
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue6 = compositionScopedCoroutineScopeCanceller;
                            }
                            startRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == companion.getEmpty()) {
                                rememberedValue7 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue7;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            final TextInputService textInputService2 = textInputService;
                            final ImeOptions imeOptions6 = imeOptions4;
                            final boolean z14 = z7;
                            Modifier textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2, z14, focusRequester, mutableInteractionSource2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((FocusState) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull FocusState it) {
                                    TextLayoutResultProxy layoutResult;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                                        return;
                                    }
                                    TextFieldState.this.setHasFocus(it.isFocused());
                                    TextInputService textInputService3 = textInputService2;
                                    if (textInputService3 != null) {
                                        CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions6);
                                        if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester, value, TextFieldState.this, layoutResult, offsetMapping, null), 3, null);
                                        }
                                    }
                                    if (it.isFocused()) {
                                        return;
                                    }
                                    TextFieldSelectionManager.m686deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                }
                            });
                            EffectsKt.DisposableEffect(textFieldState, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final TextFieldState textFieldState2 = TextFieldState.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            if (TextFieldState.this.getHasFocus()) {
                                                CoreTextFieldKt.onBlur(TextFieldState.this);
                                            }
                                        }
                                    };
                                }
                            }, startRestartGroup, 8);
                            if (TouchMode_androidKt.isInTouchMode()) {
                                final boolean z15 = z5;
                                pointerHoverIcon$default = TextFieldPressGestureFilterKt.tapPressTextFieldModifier(companion2, mutableInteractionSource2, z14, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m527invokek4lQ0M(((Offset) obj).getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                    public final void m527invokek4lQ0M(long j) {
                                        CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester, !z15);
                                        if (TextFieldState.this.getHasFocus()) {
                                            if (TextFieldState.this.getHandleState() != HandleState.Selection) {
                                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                                if (layoutResult != null) {
                                                    TextFieldState textFieldState2 = TextFieldState.this;
                                                    TextFieldDelegate.INSTANCE.m582setCursorOffsetULxng0E$foundation_release(j, layoutResult, textFieldState2.getProcessor(), offsetMapping, textFieldState2.getOnValueChange());
                                                    if (textFieldState2.getTextDelegate().getText().length() > 0) {
                                                        textFieldState2.setHandleState(HandleState.Cursor);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            textFieldSelectionManager.m688deselect_kEHs6E$foundation_release(Offset.m1288boximpl(j));
                                        }
                                    }
                                }).then(TextFieldGestureModifiersKt.longPressDragGestureFilter(companion2, textFieldSelectionManager.getTouchSelectionObserver(), z14));
                                modifier4 = textFieldFocusModifier;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                modifier4 = textFieldFocusModifier;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(TextFieldGestureModifiersKt.mouseDragGestureDetector(companion2, textFieldSelectionManager.getMouseSelectionObserver(), z14), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            }
                            final Modifier drawBehind = DrawModifierKt.drawBehind(companion2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((DrawScope) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull DrawScope drawBehind2) {
                                    Intrinsics.checkNotNullParameter(drawBehind2, "$this$drawBehind");
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        TextFieldValue textFieldValue = value;
                                        OffsetMapping offsetMapping2 = offsetMapping;
                                        TextFieldState textFieldState2 = TextFieldState.this;
                                        TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind2.getDrawContext().getCanvas(), textFieldValue, offsetMapping2, layoutResult.getValue(), textFieldState2.getSelectionPaint());
                                    }
                                }
                            });
                            final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((LayoutCoordinates) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutCoordinates it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TextFieldState.this.setLayoutCoordinates(it);
                                    if (z14) {
                                        if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                            if (TextFieldState.this.getShowFloatingToolbar()) {
                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                            } else {
                                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                            }
                                            TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                            TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                        } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                            TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                        }
                                    }
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setInnerTextFieldCoordinates(it);
                                }
                            });
                            final boolean z16 = visualTransformation2 instanceof PasswordVisualTransformation;
                            final ImeOptions imeOptions7 = imeOptions4;
                            final boolean z17 = z5;
                            Modifier semantics = SemanticsModifierKt.semantics(companion2, true, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((SemanticsPropertyReceiver) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull SemanticsPropertyReceiver semantics2) {
                                    Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                                    SemanticsPropertiesKt.m2174setImeAction4L7nppU(semantics2, ImeOptions.this.getImeAction());
                                    SemanticsPropertiesKt.setEditableText(semantics2, transformedText.getText());
                                    SemanticsPropertiesKt.m2177setTextSelectionRangeFDrldGo(semantics2, value.getSelection());
                                    if (!z14) {
                                        SemanticsPropertiesKt.disabled(semantics2);
                                    }
                                    if (z16) {
                                        SemanticsPropertiesKt.password(semantics2);
                                    }
                                    final TextFieldState textFieldState2 = textFieldState;
                                    SemanticsPropertiesKt.getTextLayoutResult$default(semantics2, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
                                            boolean z18;
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if (TextFieldState.this.getLayoutResult() != null) {
                                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                                Intrinsics.checkNotNull(layoutResult);
                                                it.add(layoutResult.getValue());
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            return Boolean.valueOf(z18);
                                        }
                                    }, 1, null);
                                    final TextFieldState textFieldState3 = textFieldState;
                                    SemanticsPropertiesKt.setText$default(semantics2, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final Boolean invoke(@NotNull AnnotatedString it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    final OffsetMapping offsetMapping2 = offsetMapping;
                                    final boolean z18 = z14;
                                    final TextFieldValue textFieldValue = value;
                                    final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                    final TextFieldState textFieldState4 = textFieldState;
                                    SemanticsPropertiesKt.setSelection$default(semantics2, null, new Function3() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
                                        }

                                        @NotNull
                                        public final Boolean invoke(int i27, int i28, boolean z19) {
                                            if (!z19) {
                                                i27 = OffsetMapping.this.transformedToOriginal(i27);
                                            }
                                            if (!z19) {
                                                i28 = OffsetMapping.this.transformedToOriginal(i28);
                                            }
                                            boolean z20 = false;
                                            if (z18 && (i27 != TextRange.m2249getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m2244getEndimpl(textFieldValue.getSelection()))) {
                                                if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getText().length()) {
                                                    if (z19 || i27 == i28) {
                                                        textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                    } else {
                                                        textFieldSelectionManager2.enterSelectionMode$foundation_release();
                                                    }
                                                    textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getText(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                    z20 = true;
                                                } else {
                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                }
                                            }
                                            return Boolean.valueOf(z20);
                                        }
                                    }, 1, null);
                                    final TextFieldState textFieldState5 = textFieldState;
                                    final FocusRequester focusRequester2 = focusRequester;
                                    final boolean z19 = z17;
                                    SemanticsPropertiesKt.onClick$default(semantics2, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2, !z19);
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.onLongClick$default(semantics2, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                    if (!TextRange.m2243getCollapsedimpl(value.getSelection()) && !z16) {
                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                        SemanticsPropertiesKt.copyText$default(semantics2, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            /* renamed from: invoke */
                                            public final Boolean mo4828invoke() {
                                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                        if (z14 && !z17) {
                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                            SemanticsPropertiesKt.cutText$default(semantics2, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* renamed from: invoke */
                                                public final Boolean mo4828invoke() {
                                                    TextFieldSelectionManager.this.cut$foundation_release();
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                    if (!z14 || z17) {
                                        return;
                                    }
                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                    SemanticsPropertiesKt.pasteText$default(semantics2, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            TextFieldSelectionManager.this.paste$foundation_release();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            });
                            final Modifier cursor = TextFieldCursorKt.cursor(companion2, textFieldState, value, offsetMapping, brush3, (z14 || z5) ? false : true);
                            EffectsKt.DisposableEffect(textFieldSelectionManager, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                        }
                                    };
                                }
                            }, startRestartGroup, 8);
                            final ImeOptions imeOptions8 = imeOptions4;
                            EffectsKt.DisposableEffect(imeOptions8, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    if (TextInputService.this != null && textFieldState.getHasFocus()) {
                                        TextFieldState textFieldState2 = textFieldState;
                                        textFieldState2.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState2.getProcessor(), imeOptions8, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
                                    }
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                        }
                                    };
                                }
                            }, startRestartGroup, i26 & 14);
                            Modifier textFieldKeyInput = TextFieldKeyInputKt.textFieldKeyInput(companion2, textFieldState, textFieldSelectionManager, value, textFieldState.getOnValueChange(), !z5, i25 == 1, offsetMapping, undoManager);
                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                            Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier7.then(modifier4), textFieldState, textFieldSelectionManager).then(textFieldKeyInput), textFieldScrollerPosition, mutableInteractionSource6, z14).then(pointerHoverIcon$default).then(semantics), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((LayoutCoordinates) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull LayoutCoordinates it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setDecorationBoxCoordinates(it);
                                }
                            });
                            boolean z18 = !z14 && textFieldState.getHasFocus() && TouchMode_androidKt.isInTouchMode();
                            Modifier.Companion textFieldMagnifier = z18 ? TextFieldSelectionManager_androidKt.textFieldMagnifier(companion2, textFieldSelectionManager) : companion2;
                            final Function3 function34 = function32;
                            final TextStyle textStyle5 = textStyle2;
                            final VisualTransformation visualTransformation4 = visualTransformation2;
                            final Modifier.Companion companion3 = textFieldMagnifier;
                            final boolean z19 = z18;
                            final boolean z20 = z5;
                            final Function1 function15 = function12;
                            Function2 function2 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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
                                public final void invoke(@Nullable Composer composer3, int i27) {
                                    if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                                        Function3 function35 = Function3.this;
                                        final int i28 = i25;
                                        final TextStyle textStyle6 = textStyle5;
                                        final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                        final TextFieldValue textFieldValue = value;
                                        final VisualTransformation visualTransformation5 = visualTransformation4;
                                        final Modifier modifier8 = cursor;
                                        final Modifier modifier9 = drawBehind;
                                        final Modifier modifier10 = onGloballyPositioned;
                                        final Modifier modifier11 = companion3;
                                        final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                        final TextFieldState textFieldState2 = textFieldState;
                                        final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                        final boolean z21 = z19;
                                        final boolean z22 = z20;
                                        final Function1 function16 = function15;
                                        function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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
                                            public final void invoke(@Nullable Composer composer4, int i29) {
                                                if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                                    Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                    TextFieldValue textFieldValue2 = textFieldValue;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    final TextFieldState textFieldState3 = textFieldState2;
                                                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation6, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        @Nullable
                                                        /* renamed from: invoke */
                                                        public final TextLayoutResultProxy mo4828invoke() {
                                                            return TextFieldState.this.getLayoutResult();
                                                        }
                                                    }).then(modifier8).then(modifier9), textStyle6).then(modifier10).then(modifier11), bringIntoViewRequester2);
                                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                    final TextFieldState textFieldState4 = textFieldState2;
                                                    final boolean z23 = z21;
                                                    final boolean z24 = z22;
                                                    final Function1 function17 = function16;
                                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
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
                                                        public final void invoke(@Nullable Composer composer5, int i30) {
                                                            if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                                final TextFieldState textFieldState5 = textFieldState4;
                                                                final Function1 function18 = function17;
                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    /* renamed from: measure-3p2s80s */
                                                                    public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                                                                        Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                        Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                                        TextFieldState textFieldState6 = TextFieldState.this;
                                                                        Snapshot createNonObservableSnapshot = companion4.createNonObservableSnapshot();
                                                                        try {
                                                                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                            try {
                                                                                TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                                TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                                createNonObservableSnapshot.dispose();
                                                                                Triple m581layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m581layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                                int intValue = ((Number) m581layout_EkL_Y$foundation_release.component1()).intValue();
                                                                                int intValue2 = ((Number) m581layout_EkL_Y$foundation_release.component2()).intValue();
                                                                                TextLayoutResult textLayoutResult = (TextLayoutResult) m581layout_EkL_Y$foundation_release.component3();
                                                                                if (!Intrinsics.areEqual(value2, textLayoutResult)) {
                                                                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(textLayoutResult));
                                                                                    function18.invoke(textLayoutResult);
                                                                                }
                                                                                return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getLastBaseline())))), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                                        invoke((Placeable.PlacementScope) obj);
                                                                                        return Unit.INSTANCE;
                                                                                    }
                                                                                });
                                                                            } finally {
                                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            createNonObservableSnapshot.dispose();
                                                                            throw th;
                                                                        }
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i31) {
                                                                        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                    }
                                                                };
                                                                composer5.startReplaceableGroup(-1323940314);
                                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                Density density2 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                                Function0 constructor = companion5.getConstructor();
                                                                Function3 materializerOf = LayoutKt.materializerOf(companion4);
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
                                                                Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion5.getSetMeasurePolicy());
                                                                Updater.m1153setimpl(m1149constructorimpl, density2, companion5.getSetDensity());
                                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                                composer5.enableReusing();
                                                                boolean z25 = false;
                                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                                composer5.startReplaceableGroup(2058660585);
                                                                composer5.startReplaceableGroup(1714611517);
                                                                composer5.endReplaceableGroup();
                                                                composer5.endReplaceableGroup();
                                                                composer5.endNode();
                                                                composer5.endReplaceableGroup();
                                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                                    LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                    if (layoutCoordinates.isAttached() && z23) {
                                                                        z25 = true;
                                                                    }
                                                                }
                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z25, composer5, 8);
                                                                if (textFieldState4.getHandleState() == HandleState.Cursor && !z24 && z23) {
                                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }), composer4, 48, 0);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, Integer.valueOf(((i26 >> 9) & 112) | 6));
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = startRestartGroup;
                            CoreTextFieldRootBox(onGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function2), composer2, 448);
                            textStyle3 = textStyle2;
                            mutableInteractionSource4 = mutableInteractionSource6;
                            function13 = function12;
                            brush4 = brush3;
                            z8 = z4;
                            keyboardActions3 = keyboardActions2;
                            z9 = z5;
                            function33 = function32;
                            visualTransformation3 = visualTransformation2;
                            z10 = z14;
                            imeOptions5 = imeOptions8;
                            modifier5 = modifier7;
                            i19 = i25;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i27) {
                                CoreTextFieldKt.CoreTextField(TextFieldValue.this, onValueChange, modifier5, textStyle3, visualTransformation3, function13, mutableInteractionSource4, brush4, z8, i19, imeOptions5, keyboardActions3, z10, z9, function33, composer3, i2 | 1, i3, i4);
                            }
                        });
                        return;
                    }
                    i16 = i4 & 16384;
                    if (i16 != 0) {
                    }
                    if ((i5 & 1533916891) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i4 & 1024) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    z6 = z12;
                    startRestartGroup.endDefaults();
                    final FocusRequester focusRequester2 = new FocusRequester();
                    startRestartGroup.startReplaceableGroup(-55013392);
                    if (z6) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    FontFamily.Resolver resolver2 = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    long selectionBackgroundColor2 = ((SelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                    FocusManager focusManager2 = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    Modifier modifier72 = modifier3;
                    if (i18 == 1) {
                    }
                    Object[] objArr2 = {orientation};
                    Saver saver2 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    final int i252 = i18;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    changed = startRestartGroup.changed(orientation);
                    final int i262 = i17;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final TextFieldScrollerPosition mo4828invoke() {
                            return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldScrollerPosition textFieldScrollerPosition2 = (TextFieldScrollerPosition) RememberSaveableKt.rememberSaveable(objArr2, saver2, null, (Function0) rememberedValue, startRestartGroup, 72, 4);
                    startRestartGroup.startReplaceableGroup(511388516);
                    changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    TransformedText filter2 = visualTransformation2.filter(value.getText());
                    composition = value.getComposition();
                    z7 = z6;
                    imeOptions4 = imeOptions3;
                    if (composition != null) {
                    }
                    rememberedValue2 = filter2;
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    final TransformedText transformedText2 = (TransformedText) rememberedValue2;
                    AnnotatedString text2 = transformedText2.getText();
                    final OffsetMapping offsetMapping2 = transformedText2.getOffsetMapping();
                    RecomposeScope currentRecomposeScope2 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue3 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldState textFieldState2 = (TextFieldState) rememberedValue3;
                    textFieldState2.m595updateaKPrnQ(text2, textStyle2, z4, density2, resolver2, onValueChange, keyboardActions2, focusManager2, selectionBackgroundColor2);
                    textFieldState2.getProcessor().reset(value, textFieldState2.getInputSession());
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    UndoManager undoManager2 = (UndoManager) rememberedValue4;
                    UndoManager.snapshotIfNeeded$default(undoManager2, value, 0L, 2, null);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) rememberedValue5;
                    textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                    textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation2);
                    textFieldSelectionManager2.setOnValueChange$foundation_release(textFieldState2.getOnValueChange());
                    textFieldSelectionManager2.setState$foundation_release(textFieldState2);
                    textFieldSelectionManager2.setValue$foundation_release(value);
                    textFieldSelectionManager2.setClipboardManager$foundation_release((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                    textFieldSelectionManager2.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                    textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                    textFieldSelectionManager2.setFocusRequester(focusRequester2);
                    textFieldSelectionManager2.setEditable(!z5);
                    startRestartGroup.startReplaceableGroup(773894976);
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue7;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    final TextInputService textInputService22 = textInputService;
                    final ImeOptions imeOptions62 = imeOptions4;
                    final boolean z142 = z7;
                    Modifier textFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion22, z142, focusRequester2, mutableInteractionSource2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((FocusState) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull FocusState it) {
                            TextLayoutResultProxy layoutResult;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                                return;
                            }
                            TextFieldState.this.setHasFocus(it.isFocused());
                            TextInputService textInputService3 = textInputService22;
                            if (textInputService3 != null) {
                                CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions62);
                                if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2, value, TextFieldState.this, layoutResult, offsetMapping2, null), 3, null);
                                }
                            }
                            if (it.isFocused()) {
                                return;
                            }
                            TextFieldSelectionManager.m686deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                        }
                    });
                    EffectsKt.DisposableEffect(textFieldState2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final TextFieldState textFieldState22 = TextFieldState.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    if (TextFieldState.this.getHasFocus()) {
                                        CoreTextFieldKt.onBlur(TextFieldState.this);
                                    }
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    if (TouchMode_androidKt.isInTouchMode()) {
                    }
                    final Modifier drawBehind2 = DrawModifierKt.drawBehind(companion22, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DrawScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull DrawScope drawBehind22) {
                            Intrinsics.checkNotNullParameter(drawBehind22, "$this$drawBehind");
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                TextFieldValue textFieldValue = value;
                                OffsetMapping offsetMapping22 = offsetMapping2;
                                TextFieldState textFieldState22 = TextFieldState.this;
                                TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind22.getDrawContext().getCanvas(), textFieldValue, offsetMapping22, layoutResult.getValue(), textFieldState22.getSelectionPaint());
                            }
                        }
                    });
                    final Modifier onGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion22, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LayoutCoordinates) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutCoordinates it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TextFieldState.this.setLayoutCoordinates(it);
                            if (z142) {
                                if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                    if (TextFieldState.this.getShowFloatingToolbar()) {
                                        textFieldSelectionManager2.showSelectionToolbar$foundation_release();
                                    } else {
                                        textFieldSelectionManager2.hideSelectionToolbar$foundation_release();
                                    }
                                    TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                    TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, false));
                                } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                    TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                }
                            }
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult == null) {
                                return;
                            }
                            layoutResult.setInnerTextFieldCoordinates(it);
                        }
                    });
                    final boolean z162 = visualTransformation2 instanceof PasswordVisualTransformation;
                    final ImeOptions imeOptions72 = imeOptions4;
                    final boolean z172 = z5;
                    Modifier semantics2 = SemanticsModifierKt.semantics(companion22, true, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semantics22) {
                            Intrinsics.checkNotNullParameter(semantics22, "$this$semantics");
                            SemanticsPropertiesKt.m2174setImeAction4L7nppU(semantics22, ImeOptions.this.getImeAction());
                            SemanticsPropertiesKt.setEditableText(semantics22, transformedText2.getText());
                            SemanticsPropertiesKt.m2177setTextSelectionRangeFDrldGo(semantics22, value.getSelection());
                            if (!z142) {
                                SemanticsPropertiesKt.disabled(semantics22);
                            }
                            if (z162) {
                                SemanticsPropertiesKt.password(semantics22);
                            }
                            final TextFieldState textFieldState22 = textFieldState2;
                            SemanticsPropertiesKt.getTextLayoutResult$default(semantics22, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
                                    boolean z182;
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (TextFieldState.this.getLayoutResult() != null) {
                                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                        Intrinsics.checkNotNull(layoutResult);
                                        it.add(layoutResult.getValue());
                                        z182 = true;
                                    } else {
                                        z182 = false;
                                    }
                                    return Boolean.valueOf(z182);
                                }
                            }, 1, null);
                            final TextFieldState textFieldState3 = textFieldState2;
                            SemanticsPropertiesKt.setText$default(semantics22, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final Boolean invoke(@NotNull AnnotatedString it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                            final OffsetMapping offsetMapping22 = offsetMapping2;
                            final boolean z182 = z142;
                            final TextFieldValue textFieldValue = value;
                            final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                            final TextFieldState textFieldState4 = textFieldState2;
                            SemanticsPropertiesKt.setSelection$default(semantics22, null, new Function3() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
                                }

                                @NotNull
                                public final Boolean invoke(int i27, int i28, boolean z192) {
                                    if (!z192) {
                                        i27 = OffsetMapping.this.transformedToOriginal(i27);
                                    }
                                    if (!z192) {
                                        i28 = OffsetMapping.this.transformedToOriginal(i28);
                                    }
                                    boolean z202 = false;
                                    if (z182 && (i27 != TextRange.m2249getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m2244getEndimpl(textFieldValue.getSelection()))) {
                                        if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getText().length()) {
                                            if (z192 || i27 == i28) {
                                                textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                            } else {
                                                textFieldSelectionManager22.enterSelectionMode$foundation_release();
                                            }
                                            textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getText(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            z202 = true;
                                        } else {
                                            textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                        }
                                    }
                                    return Boolean.valueOf(z202);
                                }
                            }, 1, null);
                            final TextFieldState textFieldState5 = textFieldState2;
                            final FocusRequester focusRequester22 = focusRequester2;
                            final boolean z192 = z172;
                            SemanticsPropertiesKt.onClick$default(semantics22, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Boolean mo4828invoke() {
                                    CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester22, !z192);
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                            SemanticsPropertiesKt.onLongClick$default(semantics22, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Boolean mo4828invoke() {
                                    TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                            if (!TextRange.m2243getCollapsedimpl(value.getSelection()) && !z162) {
                                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2;
                                SemanticsPropertiesKt.copyText$default(semantics22, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final Boolean mo4828invoke() {
                                        TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                                if (z142 && !z172) {
                                    final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2;
                                    SemanticsPropertiesKt.cutText$default(semantics22, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final Boolean mo4828invoke() {
                                            TextFieldSelectionManager.this.cut$foundation_release();
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                            if (!z142 || z172) {
                                return;
                            }
                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2;
                            SemanticsPropertiesKt.pasteText$default(semantics22, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Boolean mo4828invoke() {
                                    TextFieldSelectionManager.this.paste$foundation_release();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    });
                    final Modifier cursor2 = TextFieldCursorKt.cursor(companion22, textFieldState2, value, offsetMapping2, brush3, (z142 || z5) ? false : true);
                    EffectsKt.DisposableEffect(textFieldSelectionManager2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final TextFieldSelectionManager textFieldSelectionManager22 = TextFieldSelectionManager.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                }
                            };
                        }
                    }, startRestartGroup, 8);
                    final ImeOptions imeOptions82 = imeOptions4;
                    EffectsKt.DisposableEffect(imeOptions82, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            if (TextInputService.this != null && textFieldState2.getHasFocus()) {
                                TextFieldState textFieldState22 = textFieldState2;
                                textFieldState22.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState22.getProcessor(), imeOptions82, textFieldState2.getOnValueChange(), textFieldState2.getOnImeActionPerformed()));
                            }
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                    }, startRestartGroup, i262 & 14);
                    Modifier textFieldKeyInput2 = TextFieldKeyInputKt.textFieldKeyInput(companion22, textFieldState2, textFieldSelectionManager2, value, textFieldState2.getOnValueChange(), !z5, i252 == 1, offsetMapping2, undoManager2);
                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource3;
                    Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier72.then(modifier4), textFieldState2, textFieldSelectionManager2).then(textFieldKeyInput2), textFieldScrollerPosition2, mutableInteractionSource62, z142).then(pointerHoverIcon$default).then(semantics2), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LayoutCoordinates) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull LayoutCoordinates it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            if (layoutResult == null) {
                                return;
                            }
                            layoutResult.setDecorationBoxCoordinates(it);
                        }
                    });
                    if (z142) {
                    }
                    if (z18) {
                    }
                    final Function3 function342 = function32;
                    final TextStyle textStyle52 = textStyle2;
                    final VisualTransformation visualTransformation42 = visualTransformation2;
                    final Modifier companion32 = textFieldMagnifier;
                    final boolean z192 = z18;
                    final boolean z202 = z5;
                    final Function1 function152 = function12;
                    Function2 function22 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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
                        public final void invoke(@Nullable Composer composer3, int i27) {
                            if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                                Function3 function35 = Function3.this;
                                final int i28 = i252;
                                final TextStyle textStyle6 = textStyle52;
                                final TextFieldScrollerPosition textFieldScrollerPosition22 = textFieldScrollerPosition2;
                                final TextFieldValue textFieldValue = value;
                                final VisualTransformation visualTransformation5 = visualTransformation42;
                                final Modifier modifier8 = cursor2;
                                final Modifier modifier9 = drawBehind2;
                                final Modifier modifier10 = onGloballyPositioned3;
                                final Modifier modifier11 = companion32;
                                final BringIntoViewRequester bringIntoViewRequester22 = bringIntoViewRequester2;
                                final TextFieldState textFieldState22 = textFieldState2;
                                final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                                final boolean z21 = z192;
                                final boolean z22 = z202;
                                final Function1 function16 = function152;
                                function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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
                                    public final void invoke(@Nullable Composer composer4, int i29) {
                                        if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                            Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                            TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22;
                                            TextFieldValue textFieldValue2 = textFieldValue;
                                            VisualTransformation visualTransformation6 = visualTransformation5;
                                            final TextFieldState textFieldState3 = textFieldState22;
                                            Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation6, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                @Nullable
                                                /* renamed from: invoke */
                                                public final TextLayoutResultProxy mo4828invoke() {
                                                    return TextFieldState.this.getLayoutResult();
                                                }
                                            }).then(modifier8).then(modifier9), textStyle6).then(modifier10).then(modifier11), bringIntoViewRequester22);
                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                                            final TextFieldState textFieldState4 = textFieldState22;
                                            final boolean z23 = z21;
                                            final boolean z24 = z22;
                                            final Function1 function17 = function16;
                                            SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
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
                                                public final void invoke(@Nullable Composer composer5, int i30) {
                                                    if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                        final TextFieldState textFieldState5 = textFieldState4;
                                                        final Function1 function18 = function17;
                                                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            /* renamed from: measure-3p2s80s */
                                                            public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                                                                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                                TextFieldState textFieldState6 = TextFieldState.this;
                                                                Snapshot createNonObservableSnapshot = companion4.createNonObservableSnapshot();
                                                                try {
                                                                    Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                    try {
                                                                        TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                        TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                        createNonObservableSnapshot.dispose();
                                                                        Triple m581layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m581layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                        int intValue = ((Number) m581layout_EkL_Y$foundation_release.component1()).intValue();
                                                                        int intValue2 = ((Number) m581layout_EkL_Y$foundation_release.component2()).intValue();
                                                                        TextLayoutResult textLayoutResult = (TextLayoutResult) m581layout_EkL_Y$foundation_release.component3();
                                                                        if (!Intrinsics.areEqual(value2, textLayoutResult)) {
                                                                            TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(textLayoutResult));
                                                                            function18.invoke(textLayoutResult);
                                                                        }
                                                                        return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getLastBaseline())))), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                                invoke((Placeable.PlacementScope) obj);
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        });
                                                                    } finally {
                                                                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                    }
                                                                } catch (Throwable th) {
                                                                    createNonObservableSnapshot.dispose();
                                                                    throw th;
                                                                }
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i31) {
                                                                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                                TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                            }
                                                        };
                                                        composer5.startReplaceableGroup(-1323940314);
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        Density density22 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                        LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                        Function0 constructor = companion5.getConstructor();
                                                        Function3 materializerOf = LayoutKt.materializerOf(companion4);
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
                                                        Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion5.getSetMeasurePolicy());
                                                        Updater.m1153setimpl(m1149constructorimpl, density22, companion5.getSetDensity());
                                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                        composer5.enableReusing();
                                                        boolean z25 = false;
                                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                        composer5.startReplaceableGroup(2058660585);
                                                        composer5.startReplaceableGroup(1714611517);
                                                        composer5.endReplaceableGroup();
                                                        composer5.endReplaceableGroup();
                                                        composer5.endNode();
                                                        composer5.endReplaceableGroup();
                                                        TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                        if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                            LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                            Intrinsics.checkNotNull(layoutCoordinates);
                                                            if (layoutCoordinates.isAttached() && z23) {
                                                                z25 = true;
                                                            }
                                                        }
                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z25, composer5, 8);
                                                        if (textFieldState4.getHandleState() == HandleState.Cursor && !z24 && z23) {
                                                            CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48, 0);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, Integer.valueOf(((i262 >> 9) & 112) | 6));
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    };
                    composer2 = startRestartGroup;
                    CoreTextFieldRootBox(onGloballyPositioned22, textFieldSelectionManager2, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function22), composer2, 448);
                    textStyle3 = textStyle2;
                    mutableInteractionSource4 = mutableInteractionSource62;
                    function13 = function12;
                    brush4 = brush3;
                    z8 = z4;
                    keyboardActions3 = keyboardActions2;
                    z9 = z5;
                    function33 = function32;
                    visualTransformation3 = visualTransformation2;
                    z10 = z142;
                    imeOptions5 = imeOptions82;
                    modifier5 = modifier72;
                    i19 = i252;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i15 = i4 & 8192;
                if (i15 == 0) {
                }
                i16 = i4 & 16384;
                if (i16 != 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i22 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                z6 = z12;
                startRestartGroup.endDefaults();
                final FocusRequester focusRequester22 = new FocusRequester();
                startRestartGroup.startReplaceableGroup(-55013392);
                if (z6) {
                }
                startRestartGroup.endReplaceableGroup();
                Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver22 = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                long selectionBackgroundColor22 = ((SelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
                FocusManager focusManager22 = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                Modifier modifier722 = modifier3;
                if (i18 == 1) {
                }
                Object[] objArr22 = {orientation};
                Saver saver22 = TextFieldScrollerPosition.INSTANCE.getSaver();
                final int i2522 = i18;
                startRestartGroup.startReplaceableGroup(1157296644);
                changed = startRestartGroup.changed(orientation);
                final int i2622 = i17;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final TextFieldScrollerPosition mo4828invoke() {
                        return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                final TextFieldScrollerPosition textFieldScrollerPosition22 = (TextFieldScrollerPosition) RememberSaveableKt.rememberSaveable(objArr22, saver22, null, (Function0) rememberedValue, startRestartGroup, 72, 4);
                startRestartGroup.startReplaceableGroup(511388516);
                changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                TransformedText filter22 = visualTransformation2.filter(value.getText());
                composition = value.getComposition();
                z7 = z6;
                imeOptions4 = imeOptions3;
                if (composition != null) {
                }
                rememberedValue2 = filter22;
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                final TransformedText transformedText22 = (TransformedText) rememberedValue2;
                AnnotatedString text22 = transformedText22.getText();
                final OffsetMapping offsetMapping22 = transformedText22.getOffsetMapping();
                RecomposeScope currentRecomposeScope22 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue3 = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue3 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final TextFieldState textFieldState22 = (TextFieldState) rememberedValue3;
                textFieldState22.m595updateaKPrnQ(text22, textStyle2, z4, density22, resolver22, onValueChange, keyboardActions2, focusManager22, selectionBackgroundColor22);
                textFieldState22.getProcessor().reset(value, textFieldState22.getInputSession());
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                UndoManager undoManager22 = (UndoManager) rememberedValue4;
                UndoManager.snapshotIfNeeded$default(undoManager22, value, 0L, 2, null);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final TextFieldSelectionManager textFieldSelectionManager22 = (TextFieldSelectionManager) rememberedValue5;
                textFieldSelectionManager22.setOffsetMapping$foundation_release(offsetMapping22);
                textFieldSelectionManager22.setVisualTransformation$foundation_release(visualTransformation2);
                textFieldSelectionManager22.setOnValueChange$foundation_release(textFieldState22.getOnValueChange());
                textFieldSelectionManager22.setState$foundation_release(textFieldState22);
                textFieldSelectionManager22.setValue$foundation_release(value);
                textFieldSelectionManager22.setClipboardManager$foundation_release((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
                textFieldSelectionManager22.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
                textFieldSelectionManager22.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
                textFieldSelectionManager22.setFocusRequester(focusRequester22);
                textFieldSelectionManager22.setEditable(!z5);
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) rememberedValue7;
                Modifier.Companion companion222 = Modifier.INSTANCE;
                final TextInputService textInputService222 = textInputService;
                final ImeOptions imeOptions622 = imeOptions4;
                final boolean z1422 = z7;
                Modifier textFieldFocusModifier22 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion222, z1422, focusRequester22, mutableInteractionSource2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((FocusState) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull FocusState it) {
                        TextLayoutResultProxy layoutResult;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                            return;
                        }
                        TextFieldState.this.setHasFocus(it.isFocused());
                        TextInputService textInputService3 = textInputService222;
                        if (textInputService3 != null) {
                            CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions622);
                            if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester22, value, TextFieldState.this, layoutResult, offsetMapping22, null), 3, null);
                            }
                        }
                        if (it.isFocused()) {
                            return;
                        }
                        TextFieldSelectionManager.m686deselect_kEHs6E$foundation_release$default(textFieldSelectionManager22, null, 1, null);
                    }
                });
                EffectsKt.DisposableEffect(textFieldState22, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final TextFieldState textFieldState222 = TextFieldState.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                if (TextFieldState.this.getHasFocus()) {
                                    CoreTextFieldKt.onBlur(TextFieldState.this);
                                }
                            }
                        };
                    }
                }, startRestartGroup, 8);
                if (TouchMode_androidKt.isInTouchMode()) {
                }
                final Modifier drawBehind22 = DrawModifierKt.drawBehind(companion222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DrawScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DrawScope drawBehind222) {
                        Intrinsics.checkNotNullParameter(drawBehind222, "$this$drawBehind");
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            TextFieldValue textFieldValue = value;
                            OffsetMapping offsetMapping222 = offsetMapping22;
                            TextFieldState textFieldState222 = TextFieldState.this;
                            TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind222.getDrawContext().getCanvas(), textFieldValue, offsetMapping222, layoutResult.getValue(), textFieldState222.getSelectionPaint());
                        }
                    }
                });
                final Modifier onGloballyPositioned32 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextFieldState.this.setLayoutCoordinates(it);
                        if (z1422) {
                            if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                                if (TextFieldState.this.getShowFloatingToolbar()) {
                                    textFieldSelectionManager22.showSelectionToolbar$foundation_release();
                                } else {
                                    textFieldSelectionManager22.hideSelectionToolbar$foundation_release();
                                }
                                TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                                TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, false));
                            } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                                TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                            }
                        }
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult == null) {
                            return;
                        }
                        layoutResult.setInnerTextFieldCoordinates(it);
                    }
                });
                final boolean z1622 = visualTransformation2 instanceof PasswordVisualTransformation;
                final ImeOptions imeOptions722 = imeOptions4;
                final boolean z1722 = z5;
                Modifier semantics22 = SemanticsModifierKt.semantics(companion222, true, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SemanticsPropertyReceiver) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull SemanticsPropertyReceiver semantics222) {
                        Intrinsics.checkNotNullParameter(semantics222, "$this$semantics");
                        SemanticsPropertiesKt.m2174setImeAction4L7nppU(semantics222, ImeOptions.this.getImeAction());
                        SemanticsPropertiesKt.setEditableText(semantics222, transformedText22.getText());
                        SemanticsPropertiesKt.m2177setTextSelectionRangeFDrldGo(semantics222, value.getSelection());
                        if (!z1422) {
                            SemanticsPropertiesKt.disabled(semantics222);
                        }
                        if (z1622) {
                            SemanticsPropertiesKt.password(semantics222);
                        }
                        final TextFieldState textFieldState222 = textFieldState22;
                        SemanticsPropertiesKt.getTextLayoutResult$default(semantics222, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
                                boolean z182;
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (TextFieldState.this.getLayoutResult() != null) {
                                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                    Intrinsics.checkNotNull(layoutResult);
                                    it.add(layoutResult.getValue());
                                    z182 = true;
                                } else {
                                    z182 = false;
                                }
                                return Boolean.valueOf(z182);
                            }
                        }, 1, null);
                        final TextFieldState textFieldState3 = textFieldState22;
                        SemanticsPropertiesKt.setText$default(semantics222, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(@NotNull AnnotatedString it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        final OffsetMapping offsetMapping222 = offsetMapping22;
                        final boolean z182 = z1422;
                        final TextFieldValue textFieldValue = value;
                        final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                        final TextFieldState textFieldState4 = textFieldState22;
                        SemanticsPropertiesKt.setSelection$default(semantics222, null, new Function3() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
                            }

                            @NotNull
                            public final Boolean invoke(int i27, int i28, boolean z1922) {
                                if (!z1922) {
                                    i27 = OffsetMapping.this.transformedToOriginal(i27);
                                }
                                if (!z1922) {
                                    i28 = OffsetMapping.this.transformedToOriginal(i28);
                                }
                                boolean z2022 = false;
                                if (z182 && (i27 != TextRange.m2249getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m2244getEndimpl(textFieldValue.getSelection()))) {
                                    if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getText().length()) {
                                        if (z1922 || i27 == i28) {
                                            textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                        } else {
                                            textFieldSelectionManager222.enterSelectionMode$foundation_release();
                                        }
                                        textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getText(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                        z2022 = true;
                                    } else {
                                        textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                    }
                                }
                                return Boolean.valueOf(z2022);
                            }
                        }, 1, null);
                        final TextFieldState textFieldState5 = textFieldState22;
                        final FocusRequester focusRequester222 = focusRequester22;
                        final boolean z1922 = z1722;
                        SemanticsPropertiesKt.onClick$default(semantics222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Boolean mo4828invoke() {
                                CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester222, !z1922);
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                        SemanticsPropertiesKt.onLongClick$default(semantics222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Boolean mo4828invoke() {
                                TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        if (!TextRange.m2243getCollapsedimpl(value.getSelection()) && !z1622) {
                            final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager22;
                            SemanticsPropertiesKt.copyText$default(semantics222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Boolean mo4828invoke() {
                                    TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                            if (z1422 && !z1722) {
                                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager22;
                                SemanticsPropertiesKt.cutText$default(semantics222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    /* renamed from: invoke */
                                    public final Boolean mo4828invoke() {
                                        TextFieldSelectionManager.this.cut$foundation_release();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        }
                        if (!z1422 || z1722) {
                            return;
                        }
                        final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager22;
                        SemanticsPropertiesKt.pasteText$default(semantics222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Boolean mo4828invoke() {
                                TextFieldSelectionManager.this.paste$foundation_release();
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                    }
                });
                final Modifier cursor22 = TextFieldCursorKt.cursor(companion222, textFieldState22, value, offsetMapping22, brush3, (z1422 || z5) ? false : true);
                EffectsKt.DisposableEffect(textFieldSelectionManager22, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final TextFieldSelectionManager textFieldSelectionManager222 = TextFieldSelectionManager.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                final ImeOptions imeOptions822 = imeOptions4;
                EffectsKt.DisposableEffect(imeOptions822, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        if (TextInputService.this != null && textFieldState22.getHasFocus()) {
                            TextFieldState textFieldState222 = textFieldState22;
                            textFieldState222.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState222.getProcessor(), imeOptions822, textFieldState22.getOnValueChange(), textFieldState22.getOnImeActionPerformed()));
                        }
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                }, startRestartGroup, i2622 & 14);
                Modifier textFieldKeyInput22 = TextFieldKeyInputKt.textFieldKeyInput(companion222, textFieldState22, textFieldSelectionManager22, value, textFieldState22.getOnValueChange(), !z5, i2522 == 1, offsetMapping22, undoManager22);
                MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource3;
                Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier722.then(modifier4), textFieldState22, textFieldSelectionManager22).then(textFieldKeyInput22), textFieldScrollerPosition22, mutableInteractionSource622, z1422).then(pointerHoverIcon$default).then(semantics22), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                        if (layoutResult == null) {
                            return;
                        }
                        layoutResult.setDecorationBoxCoordinates(it);
                    }
                });
                if (z1422) {
                }
                if (z18) {
                }
                final Function3 function3422 = function32;
                final TextStyle textStyle522 = textStyle2;
                final VisualTransformation visualTransformation422 = visualTransformation2;
                final Modifier companion322 = textFieldMagnifier;
                final boolean z1922 = z18;
                final boolean z2022 = z5;
                final Function1 function1522 = function12;
                Function2 function222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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
                    public final void invoke(@Nullable Composer composer3, int i27) {
                        if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                            Function3 function35 = Function3.this;
                            final int i28 = i2522;
                            final TextStyle textStyle6 = textStyle522;
                            final TextFieldScrollerPosition textFieldScrollerPosition222 = textFieldScrollerPosition22;
                            final TextFieldValue textFieldValue = value;
                            final VisualTransformation visualTransformation5 = visualTransformation422;
                            final Modifier modifier8 = cursor22;
                            final Modifier modifier9 = drawBehind22;
                            final Modifier modifier10 = onGloballyPositioned32;
                            final Modifier modifier11 = companion322;
                            final BringIntoViewRequester bringIntoViewRequester222 = bringIntoViewRequester22;
                            final TextFieldState textFieldState222 = textFieldState22;
                            final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                            final boolean z21 = z1922;
                            final boolean z22 = z2022;
                            final Function1 function16 = function1522;
                            function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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
                                public final void invoke(@Nullable Composer composer4, int i29) {
                                    if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                        Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                        TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition222;
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        VisualTransformation visualTransformation6 = visualTransformation5;
                                        final TextFieldState textFieldState3 = textFieldState222;
                                        Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation6, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            @Nullable
                                            /* renamed from: invoke */
                                            public final TextLayoutResultProxy mo4828invoke() {
                                                return TextFieldState.this.getLayoutResult();
                                            }
                                        }).then(modifier8).then(modifier9), textStyle6).then(modifier10).then(modifier11), bringIntoViewRequester222);
                                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                                        final TextFieldState textFieldState4 = textFieldState222;
                                        final boolean z23 = z21;
                                        final boolean z24 = z22;
                                        final Function1 function17 = function16;
                                        SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
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
                                            public final void invoke(@Nullable Composer composer5, int i30) {
                                                if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                    final TextFieldState textFieldState5 = textFieldState4;
                                                    final Function1 function18 = function17;
                                                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        /* renamed from: measure-3p2s80s */
                                                        public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                                                            Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                            Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                            TextFieldState textFieldState6 = TextFieldState.this;
                                                            Snapshot createNonObservableSnapshot = companion4.createNonObservableSnapshot();
                                                            try {
                                                                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                                try {
                                                                    TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                    TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                    createNonObservableSnapshot.dispose();
                                                                    Triple m581layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m581layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                    int intValue = ((Number) m581layout_EkL_Y$foundation_release.component1()).intValue();
                                                                    int intValue2 = ((Number) m581layout_EkL_Y$foundation_release.component2()).intValue();
                                                                    TextLayoutResult textLayoutResult = (TextLayoutResult) m581layout_EkL_Y$foundation_release.component3();
                                                                    if (!Intrinsics.areEqual(value2, textLayoutResult)) {
                                                                        TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(textLayoutResult));
                                                                        function18.invoke(textLayoutResult);
                                                                    }
                                                                    return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getLastBaseline())))), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                            invoke((Placeable.PlacementScope) obj);
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    });
                                                                } finally {
                                                                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                                }
                                                            } catch (Throwable th) {
                                                                createNonObservableSnapshot.dispose();
                                                                throw th;
                                                            }
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i31) {
                                                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                            TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                            return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                        }
                                                    };
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    Density density222 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                    LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                    Function0 constructor = companion5.getConstructor();
                                                    Function3 materializerOf = LayoutKt.materializerOf(companion4);
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
                                                    Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion5.getSetMeasurePolicy());
                                                    Updater.m1153setimpl(m1149constructorimpl, density222, companion5.getSetDensity());
                                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                    composer5.enableReusing();
                                                    boolean z25 = false;
                                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    composer5.startReplaceableGroup(1714611517);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                    if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                        LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                        Intrinsics.checkNotNull(layoutCoordinates);
                                                        if (layoutCoordinates.isAttached() && z23) {
                                                            z25 = true;
                                                        }
                                                    }
                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z25, composer5, 8);
                                                    if (textFieldState4.getHandleState() == HandleState.Cursor && !z24 && z23) {
                                                        CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 48, 0);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, Integer.valueOf(((i2622 >> 9) & 112) | 6));
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                };
                composer2 = startRestartGroup;
                CoreTextFieldRootBox(onGloballyPositioned222, textFieldSelectionManager22, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function222), composer2, 448);
                textStyle3 = textStyle2;
                mutableInteractionSource4 = mutableInteractionSource622;
                function13 = function12;
                brush4 = brush3;
                z8 = z4;
                keyboardActions3 = keyboardActions2;
                z9 = z5;
                function33 = function32;
                visualTransformation3 = visualTransformation2;
                z10 = z1422;
                imeOptions5 = imeOptions822;
                modifier5 = modifier722;
                i19 = i2522;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            i13 = i4 & 2048;
            if (i13 != 0) {
            }
            int i232 = i12;
            i14 = i4 & 4096;
            if (i14 != 0) {
            }
            i15 = i4 & 8192;
            if (i15 == 0) {
            }
            i16 = i4 & 16384;
            if (i16 != 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            z6 = z12;
            startRestartGroup.endDefaults();
            final FocusRequester focusRequester222 = new FocusRequester();
            startRestartGroup.startReplaceableGroup(-55013392);
            if (z6) {
            }
            startRestartGroup.endReplaceableGroup();
            Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            FontFamily.Resolver resolver222 = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            long selectionBackgroundColor222 = ((SelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
            FocusManager focusManager222 = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier modifier7222 = modifier3;
            if (i18 == 1) {
            }
            Object[] objArr222 = {orientation};
            Saver saver222 = TextFieldScrollerPosition.INSTANCE.getSaver();
            final int i25222 = i18;
            startRestartGroup.startReplaceableGroup(1157296644);
            changed = startRestartGroup.changed(orientation);
            final int i26222 = i17;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final TextFieldScrollerPosition mo4828invoke() {
                    return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            final TextFieldScrollerPosition textFieldScrollerPosition222 = (TextFieldScrollerPosition) RememberSaveableKt.rememberSaveable(objArr222, saver222, null, (Function0) rememberedValue, startRestartGroup, 72, 4);
            startRestartGroup.startReplaceableGroup(511388516);
            changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            TransformedText filter222 = visualTransformation2.filter(value.getText());
            composition = value.getComposition();
            z7 = z6;
            imeOptions4 = imeOptions3;
            if (composition != null) {
            }
            rememberedValue2 = filter222;
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            final TransformedText transformedText222 = (TransformedText) rememberedValue2;
            AnnotatedString text222 = transformedText222.getText();
            final OffsetMapping offsetMapping222 = transformedText222.getOffsetMapping();
            RecomposeScope currentRecomposeScope222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue3 = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue3 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final TextFieldState textFieldState222 = (TextFieldState) rememberedValue3;
            textFieldState222.m595updateaKPrnQ(text222, textStyle2, z4, density222, resolver222, onValueChange, keyboardActions2, focusManager222, selectionBackgroundColor222);
            textFieldState222.getProcessor().reset(value, textFieldState222.getInputSession());
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            UndoManager undoManager222 = (UndoManager) rememberedValue4;
            UndoManager.snapshotIfNeeded$default(undoManager222, value, 0L, 2, null);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final TextFieldSelectionManager textFieldSelectionManager222 = (TextFieldSelectionManager) rememberedValue5;
            textFieldSelectionManager222.setOffsetMapping$foundation_release(offsetMapping222);
            textFieldSelectionManager222.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager222.setOnValueChange$foundation_release(textFieldState222.getOnValueChange());
            textFieldSelectionManager222.setState$foundation_release(textFieldState222);
            textFieldSelectionManager222.setValue$foundation_release(value);
            textFieldSelectionManager222.setClipboardManager$foundation_release((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
            textFieldSelectionManager222.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            textFieldSelectionManager222.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            textFieldSelectionManager222.setFocusRequester(focusRequester222);
            textFieldSelectionManager222.setEditable(!z5);
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final BringIntoViewRequester bringIntoViewRequester222 = (BringIntoViewRequester) rememberedValue7;
            Modifier.Companion companion2222 = Modifier.INSTANCE;
            final TextInputService textInputService2222 = textInputService;
            final ImeOptions imeOptions6222 = imeOptions4;
            final boolean z14222 = z7;
            Modifier textFieldFocusModifier222 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion2222, z14222, focusRequester222, mutableInteractionSource2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FocusState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FocusState it) {
                    TextLayoutResultProxy layoutResult;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                        return;
                    }
                    TextFieldState.this.setHasFocus(it.isFocused());
                    TextInputService textInputService3 = textInputService2222;
                    if (textInputService3 != null) {
                        CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions6222);
                        if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester222, value, TextFieldState.this, layoutResult, offsetMapping222, null), 3, null);
                        }
                    }
                    if (it.isFocused()) {
                        return;
                    }
                    TextFieldSelectionManager.m686deselect_kEHs6E$foundation_release$default(textFieldSelectionManager222, null, 1, null);
                }
            });
            EffectsKt.DisposableEffect(textFieldState222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final TextFieldState textFieldState2222 = TextFieldState.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            if (TextFieldState.this.getHasFocus()) {
                                CoreTextFieldKt.onBlur(TextFieldState.this);
                            }
                        }
                    };
                }
            }, startRestartGroup, 8);
            if (TouchMode_androidKt.isInTouchMode()) {
            }
            final Modifier drawBehind222 = DrawModifierKt.drawBehind(companion2222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DrawScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull DrawScope drawBehind2222) {
                    Intrinsics.checkNotNullParameter(drawBehind2222, "$this$drawBehind");
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        TextFieldValue textFieldValue = value;
                        OffsetMapping offsetMapping2222 = offsetMapping222;
                        TextFieldState textFieldState2222 = TextFieldState.this;
                        TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind2222.getDrawContext().getCanvas(), textFieldValue, offsetMapping2222, layoutResult.getValue(), textFieldState2222.getSelectionPaint());
                    }
                }
            });
            final Modifier onGloballyPositioned322 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutCoordinates) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutCoordinates it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TextFieldState.this.setLayoutCoordinates(it);
                    if (z14222) {
                        if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                            if (TextFieldState.this.getShowFloatingToolbar()) {
                                textFieldSelectionManager222.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager222.hideSelectionToolbar$foundation_release();
                            }
                            TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                            TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, false));
                        } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                            TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                        }
                    }
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    layoutResult.setInnerTextFieldCoordinates(it);
                }
            });
            final boolean z16222 = visualTransformation2 instanceof PasswordVisualTransformation;
            final ImeOptions imeOptions7222 = imeOptions4;
            final boolean z17222 = z5;
            Modifier semantics222 = SemanticsModifierKt.semantics(companion2222, true, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semantics2222) {
                    Intrinsics.checkNotNullParameter(semantics2222, "$this$semantics");
                    SemanticsPropertiesKt.m2174setImeAction4L7nppU(semantics2222, ImeOptions.this.getImeAction());
                    SemanticsPropertiesKt.setEditableText(semantics2222, transformedText222.getText());
                    SemanticsPropertiesKt.m2177setTextSelectionRangeFDrldGo(semantics2222, value.getSelection());
                    if (!z14222) {
                        SemanticsPropertiesKt.disabled(semantics2222);
                    }
                    if (z16222) {
                        SemanticsPropertiesKt.password(semantics2222);
                    }
                    final TextFieldState textFieldState2222 = textFieldState222;
                    SemanticsPropertiesKt.getTextLayoutResult$default(semantics2222, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
                            boolean z182;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (TextFieldState.this.getLayoutResult() != null) {
                                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                                Intrinsics.checkNotNull(layoutResult);
                                it.add(layoutResult.getValue());
                                z182 = true;
                            } else {
                                z182 = false;
                            }
                            return Boolean.valueOf(z182);
                        }
                    }, 1, null);
                    final TextFieldState textFieldState3 = textFieldState222;
                    SemanticsPropertiesKt.setText$default(semantics2222, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull AnnotatedString it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                    final OffsetMapping offsetMapping2222 = offsetMapping222;
                    final boolean z182 = z14222;
                    final TextFieldValue textFieldValue = value;
                    final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                    final TextFieldState textFieldState4 = textFieldState222;
                    SemanticsPropertiesKt.setSelection$default(semantics2222, null, new Function3() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
                        }

                        @NotNull
                        public final Boolean invoke(int i27, int i28, boolean z19222) {
                            if (!z19222) {
                                i27 = OffsetMapping.this.transformedToOriginal(i27);
                            }
                            if (!z19222) {
                                i28 = OffsetMapping.this.transformedToOriginal(i28);
                            }
                            boolean z20222 = false;
                            if (z182 && (i27 != TextRange.m2249getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m2244getEndimpl(textFieldValue.getSelection()))) {
                                if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getText().length()) {
                                    if (z19222 || i27 == i28) {
                                        textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                    } else {
                                        textFieldSelectionManager2222.enterSelectionMode$foundation_release();
                                    }
                                    textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getText(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    z20222 = true;
                                } else {
                                    textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                }
                            }
                            return Boolean.valueOf(z20222);
                        }
                    }, 1, null);
                    final TextFieldState textFieldState5 = textFieldState222;
                    final FocusRequester focusRequester2222 = focusRequester222;
                    final boolean z19222 = z17222;
                    SemanticsPropertiesKt.onClick$default(semantics2222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester2222, !z19222);
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                    SemanticsPropertiesKt.onLongClick$default(semantics2222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                    if (!TextRange.m2243getCollapsedimpl(value.getSelection()) && !z16222) {
                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager222;
                        SemanticsPropertiesKt.copyText$default(semantics2222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Boolean mo4828invoke() {
                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        if (z14222 && !z17222) {
                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager222;
                            SemanticsPropertiesKt.cutText$default(semantics2222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                /* renamed from: invoke */
                                public final Boolean mo4828invoke() {
                                    TextFieldSelectionManager.this.cut$foundation_release();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    }
                    if (!z14222 || z17222) {
                        return;
                    }
                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager222;
                    SemanticsPropertiesKt.pasteText$default(semantics2222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            TextFieldSelectionManager.this.paste$foundation_release();
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                }
            });
            final Modifier cursor222 = TextFieldCursorKt.cursor(companion2222, textFieldState222, value, offsetMapping222, brush3, (z14222 || z5) ? false : true);
            EffectsKt.DisposableEffect(textFieldSelectionManager222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final TextFieldSelectionManager textFieldSelectionManager2222 = TextFieldSelectionManager.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
            }, startRestartGroup, 8);
            final ImeOptions imeOptions8222 = imeOptions4;
            EffectsKt.DisposableEffect(imeOptions8222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    if (TextInputService.this != null && textFieldState222.getHasFocus()) {
                        TextFieldState textFieldState2222 = textFieldState222;
                        textFieldState2222.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState2222.getProcessor(), imeOptions8222, textFieldState222.getOnValueChange(), textFieldState222.getOnImeActionPerformed()));
                    }
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, startRestartGroup, i26222 & 14);
            Modifier textFieldKeyInput222 = TextFieldKeyInputKt.textFieldKeyInput(companion2222, textFieldState222, textFieldSelectionManager222, value, textFieldState222.getOnValueChange(), !z5, i25222 == 1, offsetMapping222, undoManager222);
            MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource3;
            Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier7222.then(modifier4), textFieldState222, textFieldSelectionManager222).then(textFieldKeyInput222), textFieldScrollerPosition222, mutableInteractionSource6222, z14222).then(pointerHoverIcon$default).then(semantics222), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutCoordinates) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutCoordinates it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    layoutResult.setDecorationBoxCoordinates(it);
                }
            });
            if (z14222) {
            }
            if (z18) {
            }
            final Function3 function34222 = function32;
            final TextStyle textStyle5222 = textStyle2;
            final VisualTransformation visualTransformation4222 = visualTransformation2;
            final Modifier companion3222 = textFieldMagnifier;
            final boolean z19222 = z18;
            final boolean z20222 = z5;
            final Function1 function15222 = function12;
            Function2 function2222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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
                public final void invoke(@Nullable Composer composer3, int i27) {
                    if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                        Function3 function35 = Function3.this;
                        final int i28 = i25222;
                        final TextStyle textStyle6 = textStyle5222;
                        final TextFieldScrollerPosition textFieldScrollerPosition2222 = textFieldScrollerPosition222;
                        final TextFieldValue textFieldValue = value;
                        final VisualTransformation visualTransformation5 = visualTransformation4222;
                        final Modifier modifier8 = cursor222;
                        final Modifier modifier9 = drawBehind222;
                        final Modifier modifier10 = onGloballyPositioned322;
                        final Modifier modifier11 = companion3222;
                        final BringIntoViewRequester bringIntoViewRequester2222 = bringIntoViewRequester222;
                        final TextFieldState textFieldState2222 = textFieldState222;
                        final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                        final boolean z21 = z19222;
                        final boolean z22 = z20222;
                        final Function1 function16 = function15222;
                        function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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
                            public final void invoke(@Nullable Composer composer4, int i29) {
                                if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                    Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2222;
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                    final TextFieldState textFieldState3 = textFieldState2222;
                                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation6, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @Nullable
                                        /* renamed from: invoke */
                                        public final TextLayoutResultProxy mo4828invoke() {
                                            return TextFieldState.this.getLayoutResult();
                                        }
                                    }).then(modifier8).then(modifier9), textStyle6).then(modifier10).then(modifier11), bringIntoViewRequester2222);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                                    final TextFieldState textFieldState4 = textFieldState2222;
                                    final boolean z23 = z21;
                                    final boolean z24 = z22;
                                    final Function1 function17 = function16;
                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
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
                                        public final void invoke(@Nullable Composer composer5, int i30) {
                                            if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                final TextFieldState textFieldState5 = textFieldState4;
                                                final Function1 function18 = function17;
                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    /* renamed from: measure-3p2s80s */
                                                    public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                                                        Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                        Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                        TextFieldState textFieldState6 = TextFieldState.this;
                                                        Snapshot createNonObservableSnapshot = companion4.createNonObservableSnapshot();
                                                        try {
                                                            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                            try {
                                                                TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                                TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                                createNonObservableSnapshot.dispose();
                                                                Triple m581layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m581layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                                int intValue = ((Number) m581layout_EkL_Y$foundation_release.component1()).intValue();
                                                                int intValue2 = ((Number) m581layout_EkL_Y$foundation_release.component2()).intValue();
                                                                TextLayoutResult textLayoutResult = (TextLayoutResult) m581layout_EkL_Y$foundation_release.component3();
                                                                if (!Intrinsics.areEqual(value2, textLayoutResult)) {
                                                                    TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(textLayoutResult));
                                                                    function18.invoke(textLayoutResult);
                                                                }
                                                                return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getLastBaseline())))), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                        invoke((Placeable.PlacementScope) obj);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                });
                                                            } finally {
                                                                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                            }
                                                        } catch (Throwable th) {
                                                            createNonObservableSnapshot.dispose();
                                                            throw th;
                                                        }
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i31) {
                                                        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                        TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                        return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                    }
                                                };
                                                composer5.startReplaceableGroup(-1323940314);
                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                Density density2222 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                                LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                Function0 constructor = companion5.getConstructor();
                                                Function3 materializerOf = LayoutKt.materializerOf(companion4);
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
                                                Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion5.getSetMeasurePolicy());
                                                Updater.m1153setimpl(m1149constructorimpl, density2222, companion5.getSetDensity());
                                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                                composer5.enableReusing();
                                                boolean z25 = false;
                                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                                composer5.startReplaceableGroup(2058660585);
                                                composer5.startReplaceableGroup(1714611517);
                                                composer5.endReplaceableGroup();
                                                composer5.endReplaceableGroup();
                                                composer5.endNode();
                                                composer5.endReplaceableGroup();
                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                    LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                    if (layoutCoordinates.isAttached() && z23) {
                                                        z25 = true;
                                                    }
                                                }
                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z25, composer5, 8);
                                                if (textFieldState4.getHandleState() == HandleState.Cursor && !z24 && z23) {
                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 48, 0);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, Integer.valueOf(((i26222 >> 9) & 112) | 6));
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            };
            composer2 = startRestartGroup;
            CoreTextFieldRootBox(onGloballyPositioned2222, textFieldSelectionManager222, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function2222), composer2, 448);
            textStyle3 = textStyle2;
            mutableInteractionSource4 = mutableInteractionSource6222;
            function13 = function12;
            brush4 = brush3;
            z8 = z4;
            keyboardActions3 = keyboardActions2;
            z9 = z5;
            function33 = function32;
            visualTransformation3 = visualTransformation2;
            z10 = z14222;
            imeOptions5 = imeOptions8222;
            modifier5 = modifier7222;
            i19 = i25222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        i13 = i4 & 2048;
        if (i13 != 0) {
        }
        int i2322 = i12;
        i14 = i4 & 4096;
        if (i14 != 0) {
        }
        i15 = i4 & 8192;
        if (i15 == 0) {
        }
        i16 = i4 & 16384;
        if (i16 != 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        z6 = z12;
        startRestartGroup.endDefaults();
        final FocusRequester focusRequester2222 = new FocusRequester();
        startRestartGroup.startReplaceableGroup(-55013392);
        if (z6) {
        }
        startRestartGroup.endReplaceableGroup();
        Density density2222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        FontFamily.Resolver resolver2222 = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        long selectionBackgroundColor2222 = ((SelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getSelectionBackgroundColor();
        FocusManager focusManager2222 = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        Modifier modifier72222 = modifier3;
        if (i18 == 1) {
        }
        Object[] objArr2222 = {orientation};
        Saver saver2222 = TextFieldScrollerPosition.INSTANCE.getSaver();
        final int i252222 = i18;
        startRestartGroup.startReplaceableGroup(1157296644);
        changed = startRestartGroup.changed(orientation);
        final int i262222 = i17;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final TextFieldScrollerPosition mo4828invoke() {
                return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        final TextFieldScrollerPosition textFieldScrollerPosition2222 = (TextFieldScrollerPosition) RememberSaveableKt.rememberSaveable(objArr2222, saver2222, null, (Function0) rememberedValue, startRestartGroup, 72, 4);
        startRestartGroup.startReplaceableGroup(511388516);
        changed2 = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        TransformedText filter2222 = visualTransformation2.filter(value.getText());
        composition = value.getComposition();
        z7 = z6;
        imeOptions4 = imeOptions3;
        if (composition != null) {
        }
        rememberedValue2 = filter2222;
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        final TransformedText transformedText2222 = (TransformedText) rememberedValue2;
        AnnotatedString text2222 = transformedText2222.getText();
        final OffsetMapping offsetMapping2222 = transformedText2222.getOffsetMapping();
        RecomposeScope currentRecomposeScope2222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue3 = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue3 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final TextFieldState textFieldState2222 = (TextFieldState) rememberedValue3;
        textFieldState2222.m595updateaKPrnQ(text2222, textStyle2, z4, density2222, resolver2222, onValueChange, keyboardActions2, focusManager2222, selectionBackgroundColor2222);
        textFieldState2222.getProcessor().reset(value, textFieldState2222.getInputSession());
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        UndoManager undoManager2222 = (UndoManager) rememberedValue4;
        UndoManager.snapshotIfNeeded$default(undoManager2222, value, 0L, 2, null);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final TextFieldSelectionManager textFieldSelectionManager2222 = (TextFieldSelectionManager) rememberedValue5;
        textFieldSelectionManager2222.setOffsetMapping$foundation_release(offsetMapping2222);
        textFieldSelectionManager2222.setVisualTransformation$foundation_release(visualTransformation2);
        textFieldSelectionManager2222.setOnValueChange$foundation_release(textFieldState2222.getOnValueChange());
        textFieldSelectionManager2222.setState$foundation_release(textFieldState2222);
        textFieldSelectionManager2222.setValue$foundation_release(value);
        textFieldSelectionManager2222.setClipboardManager$foundation_release((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
        textFieldSelectionManager2222.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
        textFieldSelectionManager2222.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
        textFieldSelectionManager2222.setFocusRequester(focusRequester2222);
        textFieldSelectionManager2222.setEditable(!z5);
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final BringIntoViewRequester bringIntoViewRequester2222 = (BringIntoViewRequester) rememberedValue7;
        Modifier.Companion companion22222 = Modifier.INSTANCE;
        final TextInputService textInputService22222 = textInputService;
        final ImeOptions imeOptions62222 = imeOptions4;
        final boolean z142222 = z7;
        Modifier textFieldFocusModifier2222 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion22222, z142222, focusRequester2222, mutableInteractionSource2, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FocusState it) {
                TextLayoutResultProxy layoutResult;
                Intrinsics.checkNotNullParameter(it, "it");
                if (TextFieldState.this.getHasFocus() == it.isFocused()) {
                    return;
                }
                TextFieldState.this.setHasFocus(it.isFocused());
                TextInputService textInputService3 = textInputService22222;
                if (textInputService3 != null) {
                    CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService3, TextFieldState.this, value, imeOptions62222);
                    if (it.isFocused() && (layoutResult = TextFieldState.this.getLayoutResult()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(bringIntoViewRequester2222, value, TextFieldState.this, layoutResult, offsetMapping2222, null), 3, null);
                    }
                }
                if (it.isFocused()) {
                    return;
                }
                TextFieldSelectionManager.m686deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2222, null, 1, null);
            }
        });
        EffectsKt.DisposableEffect(textFieldState2222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final TextFieldState textFieldState22222 = TextFieldState.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        if (TextFieldState.this.getHasFocus()) {
                            CoreTextFieldKt.onBlur(TextFieldState.this);
                        }
                    }
                };
            }
        }, startRestartGroup, 8);
        if (TouchMode_androidKt.isInTouchMode()) {
        }
        final Modifier drawBehind2222 = DrawModifierKt.drawBehind(companion22222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DrawScope drawBehind22222) {
                Intrinsics.checkNotNullParameter(drawBehind22222, "$this$drawBehind");
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldValue textFieldValue = value;
                    OffsetMapping offsetMapping22222 = offsetMapping2222;
                    TextFieldState textFieldState22222 = TextFieldState.this;
                    TextFieldDelegate.INSTANCE.draw$foundation_release(drawBehind22222.getDrawContext().getCanvas(), textFieldValue, offsetMapping22222, layoutResult.getValue(), textFieldState22222.getSelectionPaint());
                }
            }
        });
        final Modifier onGloballyPositioned3222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion22222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TextFieldState.this.setLayoutCoordinates(it);
                if (z142222) {
                    if (TextFieldState.this.getHandleState() == HandleState.Selection) {
                        if (TextFieldState.this.getShowFloatingToolbar()) {
                            textFieldSelectionManager2222.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager2222.hideSelectionToolbar$foundation_release();
                        }
                        TextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                        TextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, false));
                    } else if (TextFieldState.this.getHandleState() == HandleState.Cursor) {
                        TextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                    }
                }
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                layoutResult.setInnerTextFieldCoordinates(it);
            }
        });
        final boolean z162222 = visualTransformation2 instanceof PasswordVisualTransformation;
        final ImeOptions imeOptions72222 = imeOptions4;
        final boolean z172222 = z5;
        Modifier semantics2222 = SemanticsModifierKt.semantics(companion22222, true, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semantics22222) {
                Intrinsics.checkNotNullParameter(semantics22222, "$this$semantics");
                SemanticsPropertiesKt.m2174setImeAction4L7nppU(semantics22222, ImeOptions.this.getImeAction());
                SemanticsPropertiesKt.setEditableText(semantics22222, transformedText2222.getText());
                SemanticsPropertiesKt.m2177setTextSelectionRangeFDrldGo(semantics22222, value.getSelection());
                if (!z142222) {
                    SemanticsPropertiesKt.disabled(semantics22222);
                }
                if (z162222) {
                    SemanticsPropertiesKt.password(semantics22222);
                }
                final TextFieldState textFieldState22222 = textFieldState2222;
                SemanticsPropertiesKt.getTextLayoutResult$default(semantics22222, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
                        boolean z182;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (TextFieldState.this.getLayoutResult() != null) {
                            TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                            Intrinsics.checkNotNull(layoutResult);
                            it.add(layoutResult.getValue());
                            z182 = true;
                        } else {
                            z182 = false;
                        }
                        return Boolean.valueOf(z182);
                    }
                }, 1, null);
                final TextFieldState textFieldState3 = textFieldState2222;
                SemanticsPropertiesKt.setText$default(semantics22222, null, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull AnnotatedString it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextFieldState.this.getOnValueChange().invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        return Boolean.TRUE;
                    }
                }, 1, null);
                final OffsetMapping offsetMapping22222 = offsetMapping2222;
                final boolean z182 = z142222;
                final TextFieldValue textFieldValue = value;
                final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                final TextFieldState textFieldState4 = textFieldState2222;
                SemanticsPropertiesKt.setSelection$default(semantics22222, null, new Function3() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
                    }

                    @NotNull
                    public final Boolean invoke(int i27, int i28, boolean z192222) {
                        if (!z192222) {
                            i27 = OffsetMapping.this.transformedToOriginal(i27);
                        }
                        if (!z192222) {
                            i28 = OffsetMapping.this.transformedToOriginal(i28);
                        }
                        boolean z202222 = false;
                        if (z182 && (i27 != TextRange.m2249getStartimpl(textFieldValue.getSelection()) || i28 != TextRange.m2244getEndimpl(textFieldValue.getSelection()))) {
                            if (RangesKt.coerceAtMost(i27, i28) >= 0 && RangesKt.coerceAtLeast(i27, i28) <= textFieldValue.getText().length()) {
                                if (z192222 || i27 == i28) {
                                    textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                                } else {
                                    textFieldSelectionManager22222.enterSelectionMode$foundation_release();
                                }
                                textFieldState4.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getText(), TextRangeKt.TextRange(i27, i28), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                z202222 = true;
                            } else {
                                textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                            }
                        }
                        return Boolean.valueOf(z202222);
                    }
                }, 1, null);
                final TextFieldState textFieldState5 = textFieldState2222;
                final FocusRequester focusRequester22222 = focusRequester2222;
                final boolean z192222 = z172222;
                SemanticsPropertiesKt.onClick$default(semantics22222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final Boolean mo4828invoke() {
                        CoreTextFieldKt.tapToFocus(TextFieldState.this, focusRequester22222, !z192222);
                        return Boolean.TRUE;
                    }
                }, 1, null);
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                SemanticsPropertiesKt.onLongClick$default(semantics22222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.5
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final Boolean mo4828invoke() {
                        TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                        return Boolean.TRUE;
                    }
                }, 1, null);
                if (!TextRange.m2243getCollapsedimpl(value.getSelection()) && !z162222) {
                    final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2222;
                    SemanticsPropertiesKt.copyText$default(semantics22222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.6
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                            return Boolean.TRUE;
                        }
                    }, 1, null);
                    if (z142222 && !z172222) {
                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2222;
                        SemanticsPropertiesKt.cutText$default(semantics22222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.7
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Boolean mo4828invoke() {
                                TextFieldSelectionManager.this.cut$foundation_release();
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                    }
                }
                if (!z142222 || z172222) {
                    return;
                }
                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2222;
                SemanticsPropertiesKt.pasteText$default(semantics22222, null, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1.8
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final Boolean mo4828invoke() {
                        TextFieldSelectionManager.this.paste$foundation_release();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        });
        final Modifier cursor2222 = TextFieldCursorKt.cursor(companion22222, textFieldState2222, value, offsetMapping2222, brush3, (z142222 || z5) ? false : true);
        EffectsKt.DisposableEffect(textFieldSelectionManager2222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final TextFieldSelectionManager textFieldSelectionManager22222 = TextFieldSelectionManager.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
            }
        }, startRestartGroup, 8);
        final ImeOptions imeOptions82222 = imeOptions4;
        EffectsKt.DisposableEffect(imeOptions82222, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (TextInputService.this != null && textFieldState2222.getHasFocus()) {
                    TextFieldState textFieldState22222 = textFieldState2222;
                    textFieldState22222.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(TextInputService.this, value, textFieldState22222.getProcessor(), imeOptions82222, textFieldState2222.getOnValueChange(), textFieldState2222.getOnImeActionPerformed()));
                }
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, startRestartGroup, i262222 & 14);
        Modifier textFieldKeyInput2222 = TextFieldKeyInputKt.textFieldKeyInput(companion22222, textFieldState2222, textFieldSelectionManager2222, value, textFieldState2222.getOnValueChange(), !z5, i252222 == 1, offsetMapping2222, undoManager2222);
        MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource3;
        Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(modifier72222.then(modifier4), textFieldState2222, textFieldSelectionManager2222).then(textFieldKeyInput2222), textFieldScrollerPosition2222, mutableInteractionSource62222, z142222).then(pointerHoverIcon$default).then(semantics2222), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                layoutResult.setDecorationBoxCoordinates(it);
            }
        });
        if (z142222) {
        }
        if (z18) {
        }
        final Function3 function342222 = function32;
        final TextStyle textStyle52222 = textStyle2;
        final VisualTransformation visualTransformation42222 = visualTransformation2;
        final Modifier companion32222 = textFieldMagnifier;
        final boolean z192222 = z18;
        final boolean z202222 = z5;
        final Function1 function152222 = function12;
        Function2 function22222 = new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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
            public final void invoke(@Nullable Composer composer3, int i27) {
                if ((i27 & 11) != 2 || !composer3.getSkipping()) {
                    Function3 function35 = Function3.this;
                    final int i28 = i252222;
                    final TextStyle textStyle6 = textStyle52222;
                    final TextFieldScrollerPosition textFieldScrollerPosition22222 = textFieldScrollerPosition2222;
                    final TextFieldValue textFieldValue = value;
                    final VisualTransformation visualTransformation5 = visualTransformation42222;
                    final Modifier modifier8 = cursor2222;
                    final Modifier modifier9 = drawBehind2222;
                    final Modifier modifier10 = onGloballyPositioned3222;
                    final Modifier modifier11 = companion32222;
                    final BringIntoViewRequester bringIntoViewRequester22222 = bringIntoViewRequester2222;
                    final TextFieldState textFieldState22222 = textFieldState2222;
                    final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                    final boolean z21 = z192222;
                    final boolean z22 = z202222;
                    final Function1 function16 = function152222;
                    function35.invoke(ComposableLambdaKt.composableLambda(composer3, 207445534, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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
                        public final void invoke(@Nullable Composer composer4, int i29) {
                            if ((i29 & 11) != 2 || !composer4.getSkipping()) {
                                Modifier maxLinesHeight = MaxLinesHeightModifierKt.maxLinesHeight(Modifier.INSTANCE, i28, textStyle6);
                                TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22222;
                                TextFieldValue textFieldValue2 = textFieldValue;
                                VisualTransformation visualTransformation6 = visualTransformation5;
                                final TextFieldState textFieldState3 = textFieldState22222;
                                Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(maxLinesHeight, textFieldScrollerPosition3, textFieldValue2, visualTransformation6, new Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    @Nullable
                                    /* renamed from: invoke */
                                    public final TextLayoutResultProxy mo4828invoke() {
                                        return TextFieldState.this.getLayoutResult();
                                    }
                                }).then(modifier8).then(modifier9), textStyle6).then(modifier10).then(modifier11), bringIntoViewRequester22222);
                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22222;
                                final TextFieldState textFieldState4 = textFieldState22222;
                                final boolean z23 = z21;
                                final boolean z24 = z22;
                                final Function1 function17 = function16;
                                SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.composableLambda(composer4, 19580180, true, new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
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
                                    public final void invoke(@Nullable Composer composer5, int i30) {
                                        if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                            final TextFieldState textFieldState5 = textFieldState4;
                                            final Function1 function18 = function17;
                                            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                /* renamed from: measure-3p2s80s */
                                                public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                                                    Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                    Snapshot.Companion companion4 = Snapshot.INSTANCE;
                                                    TextFieldState textFieldState6 = TextFieldState.this;
                                                    Snapshot createNonObservableSnapshot = companion4.createNonObservableSnapshot();
                                                    try {
                                                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                                                        try {
                                                            TextLayoutResultProxy layoutResult = textFieldState6.getLayoutResult();
                                                            TextLayoutResult value2 = layoutResult != null ? layoutResult.getValue() : null;
                                                            createNonObservableSnapshot.dispose();
                                                            Triple m581layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m581layout_EkL_Y$foundation_release(TextFieldState.this.getTextDelegate(), j, measure.getLayoutDirection(), value2);
                                                            int intValue = ((Number) m581layout_EkL_Y$foundation_release.component1()).intValue();
                                                            int intValue2 = ((Number) m581layout_EkL_Y$foundation_release.component2()).intValue();
                                                            TextLayoutResult textLayoutResult = (TextLayoutResult) m581layout_EkL_Y$foundation_release.component3();
                                                            if (!Intrinsics.areEqual(value2, textLayoutResult)) {
                                                                TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(textLayoutResult));
                                                                function18.invoke(textLayoutResult);
                                                            }
                                                            return measure.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(MathKt.roundToInt(textLayoutResult.getLastBaseline())))), new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$1
                                                                public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                    invoke((Placeable.PlacementScope) obj);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            });
                                                        } finally {
                                                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                                                        }
                                                    } catch (Throwable th) {
                                                        createNonObservableSnapshot.dispose();
                                                        throw th;
                                                    }
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i31) {
                                                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                                    TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                    return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                }
                                            };
                                            composer5.startReplaceableGroup(-1323940314);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Density density22222 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion5.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(companion4);
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
                                            Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion5.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density22222, companion5.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                                            composer5.enableReusing();
                                            boolean z25 = false;
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            composer5.startReplaceableGroup(1714611517);
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                            if (textFieldState4.getHandleState() == HandleState.Selection && textFieldState4.getLayoutCoordinates() != null) {
                                                LayoutCoordinates layoutCoordinates = textFieldState4.getLayoutCoordinates();
                                                Intrinsics.checkNotNull(layoutCoordinates);
                                                if (layoutCoordinates.isAttached() && z23) {
                                                    z25 = true;
                                                }
                                            }
                                            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z25, composer5, 8);
                                            if (textFieldState4.getHandleState() == HandleState.Cursor && !z24 && z23) {
                                                CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 8);
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48, 0);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, Integer.valueOf(((i262222 >> 9) & 112) | 6));
                    return;
                }
                composer3.skipToGroupEnd();
            }
        };
        composer2 = startRestartGroup;
        CoreTextFieldRootBox(onGloballyPositioned22222, textFieldSelectionManager2222, ComposableLambdaKt.composableLambda(composer2, -1885146845, true, function22222), composer2, 448);
        textStyle3 = textStyle2;
        mutableInteractionSource4 = mutableInteractionSource62222;
        function13 = function12;
        brush4 = brush3;
        z8 = z4;
        keyboardActions3 = keyboardActions2;
        z9 = z5;
        function33 = function32;
        visualTransformation3 = visualTransformation2;
        z10 = z142222;
        imeOptions5 = imeOptions82222;
        modifier5 = modifier72222;
        i19 = i252222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2 function2, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0 constructor = companion.getConstructor();
        Function3 materializerOf = LayoutKt.materializerOf(modifier);
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
        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1524757375);
        ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, startRestartGroup, ((i >> 3) & 112) | 8);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                CoreTextFieldKt.CoreTextFieldRootBox(Modifier.this, textFieldSelectionManager, function2, composer2, i | 1);
            }
        });
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final TextFieldState textFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m528invokeZmokQxo(((KeyEvent) obj).getNativeKeyEvent());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m528invokeZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
                boolean z;
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                if (TextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m532cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m686deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (inputSession = textFieldState.getInputSession()) == null) {
                return;
            }
            inputSession.showSoftwareKeyboard();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyTextInputServiceOnFocusChange(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions) {
        if (textFieldState.getHasFocus()) {
            textFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        } else {
            onBlur(textFieldState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBlur(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m2246getMaximpl(textFieldValue.getSelection()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m2566getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        TextLayoutResultProxy layoutResult;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        if (z) {
            TextFieldState state = textFieldSelectionManager.getState();
            TextLayoutResult value = (state == null || (layoutResult = state.getLayoutResult()) == null) ? null : layoutResult.getValue();
            if (value != null) {
                if (!TextRange.m2243getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m2249getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m2244getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                    ResolvedTextDirection bidiRunDirection = value.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = value.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498396421);
                    TextFieldState state2 = textFieldSelectionManager.getState();
                    if (state2 != null && state2.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state3 = textFieldSelectionManager.getState();
                    if (state3 != null && state3.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state4 = textFieldSelectionManager.getState();
                if (state4 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state4.setShowFloatingToolbar(false);
                    }
                    if (state4.getHasFocus()) {
                        if (state4.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                CoreTextFieldKt.SelectionToolbarAndHandles(TextFieldSelectionManager.this, z, composer2, i | 1);
            }
        });
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager manager, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        TextFieldState state = manager.getState();
        if (state != null && state.getShowCursorHandle()) {
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(manager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = manager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            final long m690getCursorPositiontuRUvjQ$foundation_release = manager.m690getCursorPositiontuRUvjQ$foundation_release((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, null));
            Offset m1288boximpl = Offset.m1288boximpl(m690getCursorPositiontuRUvjQ$foundation_release);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(m1288boximpl);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1
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
                        semantics.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, m690getCursorPositiontuRUvjQ$foundation_release, null));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m511CursorHandleULxng0E(m690getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer2, i | 1);
            }
        });
    }
}
