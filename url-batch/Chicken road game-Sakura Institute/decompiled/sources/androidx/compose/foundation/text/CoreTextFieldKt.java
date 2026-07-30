package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
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
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aî\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010#\u001a0\u0010$\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\u0010-\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u000200H\u0002\u001a \u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u000203H\u0002\u001a0\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0002\u001a \u00107\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0013H\u0002\u001a2\u0010;\u001a\u00020\u0001*\u00020<2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\r2\u0006\u00102\u001a\u000203H\u0080@¢\u0006\u0002\u0010@\u001a\u001c\u0010A\u001a\u00020\u0007*\u00020\u00072\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&H\u0002¨\u0006B²\u0006\n\u0010C\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "endInputSession", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "notifyFocusedRect", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release", "writeable"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04ad, code lost:
    
        if (r7 == null) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0702 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x095b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0b75  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0409 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
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
        VisualTransformation visualTransformation2;
        SolidColor solidColor;
        ImeOptions imeOptions2;
        boolean z4;
        VisualTransformation visualTransformation3;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        boolean z5;
        Modifier modifier2;
        int i21;
        KeyboardActions keyboardActions2;
        Brush brush2;
        TextStyle textStyle2;
        boolean z6;
        ImeOptions imeOptions3;
        Function1<? super TextLayoutResult, Unit> function13;
        MutableInteractionSource mutableInteractionSource2;
        int i22;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        final WindowInfo windowInfo;
        final Orientation orientation;
        boolean changed;
        Object rememberedValue4;
        int i23;
        boolean z7;
        Object rememberedValue5;
        TextRange composition;
        int i24;
        boolean changed2;
        Object rememberedValue6;
        final LegacyTextFieldState legacyTextFieldState;
        Object rememberedValue7;
        Object rememberedValue8;
        Object rememberedValue9;
        Object rememberedValue10;
        int i25;
        final ImeOptions imeOptions4;
        int i26;
        int i27;
        boolean z8;
        boolean changedInstance;
        Object rememberedValue11;
        Modifier textFieldFocusModifier;
        Modifier modifier3;
        boolean z9;
        boolean z10;
        Object rememberedValue12;
        boolean changedInstance2;
        Object rememberedValue13;
        boolean changedInstance3;
        Object rememberedValue14;
        boolean changedInstance4;
        Object obj;
        boolean changedInstance5;
        Object rememberedValue15;
        boolean changedInstance6;
        Object rememberedValue16;
        boolean changedInstance7;
        Object rememberedValue17;
        boolean changedInstance8;
        Object rememberedValue18;
        boolean changedInstance9;
        Object rememberedValue19;
        boolean z11;
        Modifier.Companion companion;
        Composer composer2;
        final VisualTransformation visualTransformation4;
        final boolean z12;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function14;
        final ImeOptions imeOptions5;
        final Brush brush3;
        final int i28;
        final Modifier modifier4;
        final boolean z13;
        final int i29;
        final KeyboardActions keyboardActions3;
        final boolean z14;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i30;
        Composer startRestartGroup = composer.startRestartGroup(-958708118);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextField)P(14,10,8,13,15,9,4!1,12,6,7,3,5,2,11)221@12329L29,222@12399L58,223@12503L72,228@12633L7,229@12694L7,230@12762L7,231@12827L7,232@12872L7,233@12941L7,241@13250L42,238@13157L135,244@13333L269,257@13907L21,258@13945L403,287@14747L26,290@14833L51,296@15136L7,297@15187L7,298@15244L7,303@15385L24,304@15443L37,311@15672L1487,352@17266L42,353@17334L970,353@17313L991,379@18375L28,380@18467L907,408@19636L516,425@20215L1473,462@21825L6646,616@28696L60,616@28670L86,620@28791L458,620@28762L487,647@29739L1132,694@31923L4765,694@31870L4818:CoreTextField.kt#423gt5");
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
        int i31 = i5 & 4;
        if (i31 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i6 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i6 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i6 |= startRestartGroup.changed(brush) ? 8388608 : 4194304;
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i13 = i5 & 512;
                    if (i13 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i6 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                    }
                    i14 = i5 & 1024;
                    if (i14 == 0) {
                        i15 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i15 = i4 | (startRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i15 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        if ((i5 & 2048) == 0 && startRestartGroup.changed(imeOptions)) {
                            i30 = 32;
                            i15 |= i30;
                        }
                        i30 = 16;
                        i15 |= i30;
                    }
                    i16 = i15;
                    i17 = i5 & 4096;
                    if (i17 == 0) {
                        i16 |= 384;
                    } else if ((i4 & 384) == 0) {
                        i16 |= startRestartGroup.changed(keyboardActions) ? 256 : 128;
                        i18 = i5 & 8192;
                        if (i18 != 0) {
                            i16 |= 3072;
                        } else if ((i4 & 3072) == 0) {
                            i16 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                            i19 = i5 & 16384;
                            if (i19 == 0) {
                                i16 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i16 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                                i20 = i5 & 32768;
                                if (i20 != 0) {
                                    i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i16 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                                }
                                if ((i6 & 306783379) == 306783378 || (74899 & i16) != 74898 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion2 = i31 != 0 ? Modifier.INSTANCE : modifier;
                                        TextStyle textStyle4 = i7 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                        VisualTransformation none = i8 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        CoreTextFieldKt$CoreTextField$1 coreTextFieldKt$CoreTextField$1 = i9 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function12;
                                        MutableInteractionSource mutableInteractionSource4 = i10 != 0 ? null : mutableInteractionSource;
                                        if (i11 != 0) {
                                            visualTransformation2 = none;
                                            solidColor = new SolidColor(Color.INSTANCE.m3876getUnspecified0d7_KjU(), null);
                                        } else {
                                            visualTransformation2 = none;
                                            solidColor = brush;
                                        }
                                        boolean z15 = i12 != 0 ? true : z;
                                        int i32 = i13 != 0 ? Integer.MAX_VALUE : i;
                                        int i33 = i14 != 0 ? 1 : i2;
                                        if ((i5 & 2048) != 0) {
                                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                            i16 &= -113;
                                        } else {
                                            imeOptions2 = imeOptions;
                                        }
                                        KeyboardActions keyboardActions4 = i17 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        z4 = i18 != 0 ? true : z2;
                                        boolean z16 = i19 != 0 ? false : z3;
                                        if (i20 != 0) {
                                            z5 = z15;
                                            modifier2 = companion2;
                                            i21 = i33;
                                            keyboardActions2 = keyboardActions4;
                                            brush2 = solidColor;
                                            textStyle2 = textStyle4;
                                            z6 = z16;
                                            imeOptions3 = imeOptions2;
                                            function32 = ComposableSingletons$CoreTextFieldKt.INSTANCE.m991getLambda1$foundation_release();
                                            function13 = coreTextFieldKt$CoreTextField$1;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                            visualTransformation3 = visualTransformation2;
                                        } else {
                                            visualTransformation3 = visualTransformation2;
                                            function32 = function3;
                                            z5 = z15;
                                            modifier2 = companion2;
                                            i21 = i33;
                                            keyboardActions2 = keyboardActions4;
                                            brush2 = solidColor;
                                            textStyle2 = textStyle4;
                                            z6 = z16;
                                            imeOptions3 = imeOptions2;
                                            function13 = coreTextFieldKt$CoreTextField$1;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                        }
                                        i22 = i32;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 2048) != 0) {
                                            i16 &= -113;
                                        }
                                        modifier2 = modifier;
                                        textStyle2 = textStyle;
                                        visualTransformation3 = visualTransformation;
                                        function13 = function12;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush2 = brush;
                                        z5 = z;
                                        i22 = i;
                                        i21 = i2;
                                        imeOptions3 = imeOptions;
                                        keyboardActions2 = keyboardActions;
                                        z4 = z2;
                                        z6 = z3;
                                        function32 = function3;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-958708118, i6, i16, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new FocusRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    final FocusRequester focusRequester = (FocusRequester) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = LegacyPlatformTextInputServiceAdapter_androidKt.createLegacyPlatformTextInputServiceAdapter();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new TextInputService(legacyPlatformTextInputServiceAdapter);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    final TextInputService textInputService = (TextInputService) rememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume;
                                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localFontFamilyResolver);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    FontFamily.Resolver resolver = (FontFamily.Resolver) consume2;
                                    Modifier modifier5 = modifier2;
                                    ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localTextSelectionColors);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long backgroundColor = ((TextSelectionColors) consume3).getBackgroundColor();
                                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume4 = startRestartGroup.consume(localFocusManager);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    FocusManager focusManager = (FocusManager) consume4;
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                                    ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume5 = startRestartGroup.consume(localWindowInfo);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    windowInfo = (WindowInfo) consume5;
                                    ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume6 = startRestartGroup.consume(localSoftwareKeyboardController);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume6;
                                    orientation = (i22 == 1 || z5 || !imeOptions3.getSingleLine()) ? Orientation.Vertical : Orientation.Horizontal;
                                    Object[] objArr = {orientation};
                                    Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                                    final int i34 = i22;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                                    changed = startRestartGroup.changed(orientation);
                                    ImeOptions imeOptions6 = imeOptions3;
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final TextFieldScrollerPosition invoke() {
                                                return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m3426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue4, startRestartGroup, 0, 4);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                                    i23 = i6 & 14;
                                    z7 = ((i6 & 57344) == 16384) | (i23 == 4);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!z7 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation3, textFieldValue.getAnnotatedString());
                                        composition = textFieldValue.getComposition();
                                        i24 = i23;
                                        if (composition != null) {
                                            rememberedValue5 = TextFieldDelegate.INSTANCE.m1066applyCompositionDecoration72CqOWE(composition.getPackedValue(), filterWithValidation);
                                        }
                                        rememberedValue5 = filterWithValidation;
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    } else {
                                        i24 = i23;
                                    }
                                    final TransformedText transformedText = (TransformedText) rememberedValue5;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    AnnotatedString text = transformedText.getText();
                                    final OffsetMapping offsetMapping = transformedText.getOffsetMapping();
                                    RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(softwareKeyboardController);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue6 = new LegacyTextFieldState(new TextDelegate(text, textStyle2, 0, 0, z5, 0, density, resolver, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope, softwareKeyboardController);
                                        startRestartGroup.updateRememberedValue(rememberedValue6);
                                    }
                                    legacyTextFieldState = (LegacyTextFieldState) rememberedValue6;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    legacyTextFieldState.m1022updatefnh65Uc(textFieldValue.getAnnotatedString(), text, textStyle2, z5, density, resolver, function1, keyboardActions2, focusManager, backgroundColor);
                                    legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = new UndoManager(0, 1, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    UndoManager undoManager = (UndoManager) rememberedValue7;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    UndoManager.snapshotIfNeeded$default(undoManager, textFieldValue, 0L, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new TextFieldSelectionManager(undoManager);
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    final TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) rememberedValue8;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldSelectionManager.setOffsetMapping$foundation_release(offsetMapping);
                                    textFieldSelectionManager.setVisualTransformation$foundation_release(visualTransformation3);
                                    textFieldSelectionManager.setOnValueChange$foundation_release(legacyTextFieldState.getOnValueChange());
                                    textFieldSelectionManager.setState$foundation_release(legacyTextFieldState);
                                    textFieldSelectionManager.setValue$foundation_release(textFieldValue);
                                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume7 = startRestartGroup.consume(localClipboardManager);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldSelectionManager.setClipboardManager$foundation_release((ClipboardManager) consume7);
                                    ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume8 = startRestartGroup.consume(localTextToolbar);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldSelectionManager.setTextToolbar((TextToolbar) consume8);
                                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume9 = startRestartGroup.consume(localHapticFeedback);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldSelectionManager.setHapticFeedBack((HapticFeedback) consume9);
                                    textFieldSelectionManager.setFocusRequester(focusRequester);
                                    textFieldSelectionManager.setEditable(!z6);
                                    textFieldSelectionManager.setEnabled(z4);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                    rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        rememberedValue9 = compositionScopedCoroutineScopeCanceller;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                                    rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue10 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                    }
                                    final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue10;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                                    int i35 = i16 & 7168;
                                    int i36 = 57344 & i16;
                                    final VisualTransformation visualTransformation5 = visualTransformation3;
                                    int i37 = i24;
                                    boolean changedInstance10 = (i35 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i36 == 16384) | startRestartGroup.changedInstance(textInputService) | (i37 == 4);
                                    i25 = (i16 & 112) ^ 48;
                                    if (i25 > 32) {
                                        imeOptions4 = imeOptions6;
                                        if (startRestartGroup.changed(imeOptions4)) {
                                            i27 = i16;
                                            i26 = i36;
                                            z8 = true;
                                            changedInstance = changedInstance10 | z8 | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(bringIntoViewRequester) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                            rememberedValue11 = startRestartGroup.rememberedValue();
                                            if (!changedInstance || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                final boolean z17 = z4;
                                                final boolean z18 = z6;
                                                final ImeOptions imeOptions7 = imeOptions4;
                                                rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                                        invoke2(focusState);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(FocusState focusState) {
                                                        TextLayoutResultProxy layoutResult;
                                                        if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                                            return;
                                                        }
                                                        LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                                                        if (!LegacyTextFieldState.this.getHasFocus() || !z17 || z18) {
                                                            CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                                                        } else {
                                                            CoreTextFieldKt.startInputSession(textInputService, LegacyTextFieldState.this, textFieldValue, imeOptions7, offsetMapping);
                                                        }
                                                        if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping, null), 3, null);
                                                        }
                                                        if (focusState.isFocused()) {
                                                            return;
                                                        }
                                                        TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue11);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion3, z4, focusRequester, mutableInteractionSource5, (Function1) rememberedValue11);
                                            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
                                            Unit unit = Unit.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                                            boolean changed3 = startRestartGroup.changed(rememberUpdatedState) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                            if (i25 > 32 || !startRestartGroup.changed(imeOptions4)) {
                                                modifier3 = textFieldFocusModifier;
                                                if ((i27 & 48) != 32) {
                                                    z9 = false;
                                                    z10 = z9 | changed3;
                                                    rememberedValue12 = startRestartGroup.rememberedValue();
                                                    if (!z10 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState, textInputService, textFieldSelectionManager, imeOptions4, null);
                                                        startRestartGroup.updateRememberedValue(rememberedValue12);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                                                    changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                                                    rememberedValue13 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                                invoke(bool.booleanValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(boolean z19) {
                                                                LegacyTextFieldState.this.setInTouchMode(z19);
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue13);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    Modifier updateSelectionTouchMode = SelectionGesturesKt.updateSelectionTouchMode(companion4, (Function1) rememberedValue13);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                                                    int i38 = i26;
                                                    changedInstance3 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i38 != 16384) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                                    rememberedValue14 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                        final boolean z19 = z6;
                                                        final boolean z20 = z4;
                                                        rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                                m992invokek4lQ0M(offset.getPackedValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                                            public final void m992invokek4lQ0M(long j) {
                                                                CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester, !z19);
                                                                if (LegacyTextFieldState.this.getHasFocus() && z20) {
                                                                    if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                                                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                                        if (layoutResult != null) {
                                                                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                                            TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping, legacyTextFieldState2.getOnValueChange());
                                                                            if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                                                                legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    textFieldSelectionManager.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                                                                }
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue14);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode, mutableInteractionSource5, z4, (Function1) rememberedValue14), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                                                    changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                                    Object rememberedValue20 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance4 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                                        obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                                if (layoutResult != null) {
                                                                    TextFieldValue textFieldValue2 = textFieldValue;
                                                                    LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                                    OffsetMapping offsetMapping2 = offsetMapping;
                                                                    TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping2, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                                                                }
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(obj);
                                                    } else {
                                                        obj = rememberedValue20;
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    final Modifier drawBehind = DrawModifierKt.drawBehind(companion5, (Function1) obj);
                                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                                                    changedInstance5 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                                    rememberedValue15 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance5 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                        final boolean z21 = z4;
                                                        rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                invoke2(layoutCoordinates);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                                if (layoutResult != null) {
                                                                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                                                }
                                                                if (z21) {
                                                                    if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                                                        if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                                                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                                                        } else {
                                                                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                                                        }
                                                                        LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                                        LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                                                        LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                                                                    } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                                                        LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                                    }
                                                                    CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping);
                                                                    TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                                                                    if (layoutResult2 != null) {
                                                                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                                        TextFieldValue textFieldValue2 = textFieldValue;
                                                                        OffsetMapping offsetMapping2 = offsetMapping;
                                                                        TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                                                        if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                                                            return;
                                                                        }
                                                                        TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2, layoutResult2);
                                                                    }
                                                                }
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue15);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    final Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion6, (Function1) rememberedValue15);
                                                    final boolean z22 = visualTransformation5 instanceof PasswordVisualTransformation;
                                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                                                    changedInstance6 = startRestartGroup.changedInstance(transformedText) | (i37 != 4) | (i35 != 2048) | startRestartGroup.changed(z22) | (i38 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                                    rememberedValue16 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance6 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                        final boolean z23 = z4;
                                                        final boolean z24 = z6;
                                                        final ImeOptions imeOptions8 = imeOptions4;
                                                        rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                                                            public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                                                                SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                                                if (!z23) {
                                                                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                                                }
                                                                if (z22) {
                                                                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                                }
                                                                boolean z25 = z23 && !z24;
                                                                SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z25);
                                                                final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                                                SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Boolean invoke(List<TextLayoutResult> list) {
                                                                        boolean z26;
                                                                        if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                                            Intrinsics.checkNotNull(layoutResult);
                                                                            list.add(layoutResult.getValue());
                                                                            z26 = true;
                                                                        } else {
                                                                            z26 = false;
                                                                        }
                                                                        return Boolean.valueOf(z26);
                                                                    }
                                                                }, 1, null);
                                                                if (z25) {
                                                                    final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                                                    SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                                                            Unit unit2;
                                                                            TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                                                            if (inputSession != null) {
                                                                                LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                                                                unit2 = Unit.INSTANCE;
                                                                            } else {
                                                                                unit2 = null;
                                                                            }
                                                                            if (unit2 == null) {
                                                                                LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                            }
                                                                            return true;
                                                                        }
                                                                    }, 1, null);
                                                                    final boolean z26 = z24;
                                                                    final boolean z27 = z23;
                                                                    final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                                                    SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                                                            Unit unit2;
                                                                            if (z26 || !z27) {
                                                                                return false;
                                                                            }
                                                                            TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                                                            if (inputSession != null) {
                                                                                LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                                                                unit2 = Unit.INSTANCE;
                                                                            } else {
                                                                                unit2 = null;
                                                                            }
                                                                            if (unit2 == null) {
                                                                                TextFieldValue textFieldValue3 = textFieldValue2;
                                                                                legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                            }
                                                                            return true;
                                                                        }
                                                                    }, 1, null);
                                                                }
                                                                final OffsetMapping offsetMapping2 = offsetMapping;
                                                                final boolean z28 = z23;
                                                                final TextFieldValue textFieldValue3 = textFieldValue;
                                                                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                                                final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                                                                SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(3);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                                                        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                                                    }

                                                                    public final Boolean invoke(int i39, int i40, boolean z29) {
                                                                        if (!z29) {
                                                                            i39 = OffsetMapping.this.transformedToOriginal(i39);
                                                                        }
                                                                        if (!z29) {
                                                                            i40 = OffsetMapping.this.transformedToOriginal(i40);
                                                                        }
                                                                        boolean z30 = false;
                                                                        if (z28 && (i39 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                                                            if (Math.min(i39, i40) >= 0 && Math.max(i39, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                                                                if (z29 || i39 == i40) {
                                                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                                                } else {
                                                                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2, false, 1, null);
                                                                                }
                                                                                legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i39, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                                z30 = true;
                                                                            } else {
                                                                                textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                                            }
                                                                        }
                                                                        return Boolean.valueOf(z30);
                                                                    }
                                                                }, 1, null);
                                                                int imeAction = imeOptions8.getImeAction();
                                                                final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                                                                final ImeOptions imeOptions9 = imeOptions8;
                                                                SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Boolean invoke() {
                                                                        LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions9.getImeAction()));
                                                                        return true;
                                                                    }
                                                                }, 2, null);
                                                                final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                                                                final FocusRequester focusRequester2 = focusRequester;
                                                                final boolean z29 = z24;
                                                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Boolean invoke() {
                                                                        CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2, !z29);
                                                                        return true;
                                                                    }
                                                                }, 1, null);
                                                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                                SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Boolean invoke() {
                                                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                                        return true;
                                                                    }
                                                                }, 1, null);
                                                                if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z22) {
                                                                    final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                                            return true;
                                                                        }
                                                                    }, 1, null);
                                                                    if (z23 && !z24) {
                                                                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Boolean invoke() {
                                                                                TextFieldSelectionManager.this.cut$foundation_release();
                                                                                return true;
                                                                            }
                                                                        }, 1, null);
                                                                    }
                                                                }
                                                                if (!z23 || z24) {
                                                                    return;
                                                                }
                                                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                                SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Boolean invoke() {
                                                                        TextFieldSelectionManager.this.paste$foundation_release();
                                                                        return true;
                                                                    }
                                                                }, 1, null);
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue16);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    Modifier semantics = SemanticsModifierKt.semantics(companion7, true, (Function1) rememberedValue16);
                                                    final Modifier cursor = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                                                    changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager);
                                                    rememberedValue17 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance7 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                    public void dispose() {
                                                                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                                                    }
                                                                };
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue17);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                                                    changedInstance8 = (i37 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                                    rememberedValue18 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance8 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                if (LegacyTextFieldState.this.getHasFocus()) {
                                                                    LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                                                                }
                                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                    public void dispose() {
                                                                    }
                                                                };
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue18);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                                                    Modifier m1076textFieldKeyInput2WJ9YEU = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i34 != 1, offsetMapping, undoManager, imeOptions4.getImeAction());
                                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                                    boolean CoreTextField$lambda$11 = CoreTextField$lambda$11(rememberUpdatedState);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                                                    changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter);
                                                    rememberedValue19 = startRestartGroup.rememberedValue();
                                                    if (!changedInstance9 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                if (!LegacyTextFieldState.this.getHasFocus()) {
                                                                    focusRequester.requestFocus();
                                                                }
                                                                if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                                                                    legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
                                                                }
                                                                return true;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue19);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5, legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager).then(StylusHandwritingKt.stylusHandwriting(companion8, CoreTextField$lambda$11, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager).then(m1076textFieldKeyInput2WJ9YEU), textFieldScrollerPosition, mutableInteractionSource5, z4).then(pointerHoverIcon$default).then(semantics), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                            invoke2(layoutCoordinates);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                            if (layoutResult == null) {
                                                                return;
                                                            }
                                                            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                                        }
                                                    });
                                                    z11 = !z4 && legacyTextFieldState.getHasFocus() && legacyTextFieldState.isInTouchMode() && windowInfo.isWindowFocused();
                                                    if (!z11) {
                                                        companion = TextFieldSelectionManager_androidKt.textFieldMagnifier(Modifier.INSTANCE, textFieldSelectionManager);
                                                    } else {
                                                        companion = Modifier.INSTANCE;
                                                    }
                                                    final Modifier modifier6 = companion;
                                                    final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34 = function32;
                                                    final TextStyle textStyle5 = textStyle2;
                                                    final int i39 = i21;
                                                    boolean z25 = z4;
                                                    ImeOptions imeOptions9 = imeOptions4;
                                                    final boolean z26 = z11;
                                                    final boolean z27 = z6;
                                                    final Function1<? super TextLayoutResult, Unit> function15 = function13;
                                                    composer2 = startRestartGroup;
                                                    CoreTextFieldRootBox(onGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                                                        public final void invoke(Composer composer3, int i40) {
                                                            ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                                            if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                                                }
                                                                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34;
                                                                final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                                                final TextStyle textStyle6 = textStyle5;
                                                                final int i41 = i39;
                                                                final int i42 = i34;
                                                                final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                                                final TextFieldValue textFieldValue2 = textFieldValue;
                                                                final VisualTransformation visualTransformation6 = visualTransformation5;
                                                                final Modifier modifier7 = cursor;
                                                                final Modifier modifier8 = drawBehind;
                                                                final Modifier modifier9 = onGloballyPositioned;
                                                                final Modifier modifier10 = modifier6;
                                                                final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                                                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                                                final boolean z28 = z26;
                                                                final boolean z29 = z27;
                                                                final Function1<TextLayoutResult, Unit> function16 = function15;
                                                                final OffsetMapping offsetMapping2 = offsetMapping;
                                                                final Density density2 = density;
                                                                function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                                                    public final void invoke(Composer composer4, int i43) {
                                                                        ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                                                        if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                                            }
                                                                            Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                                                            TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                                            TextFieldValue textFieldValue3 = textFieldValue2;
                                                                            VisualTransformation visualTransformation7 = visualTransformation6;
                                                                            ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                                            boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                                                            final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                                                            Object rememberedValue21 = composer4.rememberedValue();
                                                                            if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                                rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                                    {
                                                                                        super(0);
                                                                                    }

                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                    public final TextLayoutResultProxy invoke() {
                                                                                        return LegacyTextFieldState.this.getLayoutResult();
                                                                                    }
                                                                                };
                                                                                composer4.updateRememberedValue(rememberedValue21);
                                                                            }
                                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                            Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2);
                                                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                                            final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                                            final boolean z30 = z28;
                                                                            final boolean z31 = z29;
                                                                            final Function1<TextLayoutResult, Unit> function17 = function16;
                                                                            final TextFieldValue textFieldValue4 = textFieldValue2;
                                                                            final OffsetMapping offsetMapping3 = offsetMapping2;
                                                                            final Density density3 = density2;
                                                                            final int i44 = i42;
                                                                            SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                                {
                                                                                    super(2);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                                    invoke(composer5, num.intValue());
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                                                                /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                                                                /*
                                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                                */
                                                                                public final void invoke(Composer composer5, int i45) {
                                                                                    boolean z32;
                                                                                    ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                                                    if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                                                        }
                                                                                        final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                                        final Function1<TextLayoutResult, Unit> function18 = function17;
                                                                                        final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                                        final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                                        final Density density4 = density3;
                                                                                        final int i46 = i44;
                                                                                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                            /* renamed from: measure-3p2s80s */
                                                                                            public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                                Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                                                                LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                                                                Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                                                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                                Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                                try {
                                                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                                                    TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                                    Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                                    int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                                                    int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                                                    TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                                                    if (!Intrinsics.areEqual(value, component3)) {
                                                                                                        LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                        function18.invoke(component3);
                                                                                                        CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                                                    }
                                                                                                    LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                                                    return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                                        }

                                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                            invoke2(placementScope);
                                                                                                            return Unit.INSTANCE;
                                                                                                        }
                                                                                                    });
                                                                                                } finally {
                                                                                                    companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                                                                }
                                                                                            }

                                                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                                                                LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                                return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                                            }
                                                                                        };
                                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                                        Modifier.Companion companion9 = Modifier.INSTANCE;
                                                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                                                            ComposablesKt.invalidApplier();
                                                                                        }
                                                                                        composer5.startReusableNode();
                                                                                        if (composer5.getInserting()) {
                                                                                            composer5.createNode(constructor);
                                                                                        } else {
                                                                                            composer5.useNode();
                                                                                        }
                                                                                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                                                        Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                        }
                                                                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                        composer5.endNode();
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                        TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                                        if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                                                            LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                                                            Intrinsics.checkNotNull(layoutCoordinates);
                                                                                            if (layoutCoordinates.isAttached() && z30) {
                                                                                                z32 = true;
                                                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                                                if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                                                    composer5.startReplaceGroup(-2032274);
                                                                                                    ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                                                    composer5.endReplaceGroup();
                                                                                                } else {
                                                                                                    composer5.startReplaceGroup(-1955394);
                                                                                                    composer5.endReplaceGroup();
                                                                                                }
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    return;
                                                                                                }
                                                                                                ComposerKt.traceEventEnd();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                        z32 = false;
                                                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                                        if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                                                        }
                                                                                        composer5.startReplaceGroup(-1955394);
                                                                                        composer5.endReplaceGroup();
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                        }
                                                                                    } else {
                                                                                        composer5.skipToGroupEnd();
                                                                                    }
                                                                                }
                                                                            }, composer4, 54), composer4, 48, 0);
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
                                                    }, composer2, 54), composer2, 384);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    visualTransformation4 = visualTransformation5;
                                                    z12 = z25;
                                                    textStyle3 = textStyle2;
                                                    function14 = function13;
                                                    imeOptions5 = imeOptions9;
                                                    brush3 = brush2;
                                                    i28 = i34;
                                                    modifier4 = modifier5;
                                                    z13 = z5;
                                                    i29 = i21;
                                                    keyboardActions3 = keyboardActions2;
                                                    z14 = z6;
                                                    function33 = function32;
                                                    mutableInteractionSource3 = mutableInteractionSource5;
                                                }
                                            } else {
                                                modifier3 = textFieldFocusModifier;
                                            }
                                            z9 = true;
                                            z10 = z9 | changed3;
                                            rememberedValue12 = startRestartGroup.rememberedValue();
                                            if (!z10) {
                                            }
                                            rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState, textInputService, textFieldSelectionManager, imeOptions4, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue12);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                                            Modifier.Companion companion42 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                                            changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                                            rememberedValue13 = startRestartGroup.rememberedValue();
                                            if (!changedInstance2) {
                                            }
                                            rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                    invoke(bool.booleanValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(boolean z192) {
                                                    LegacyTextFieldState.this.setInTouchMode(z192);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue13);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Modifier updateSelectionTouchMode2 = SelectionGesturesKt.updateSelectionTouchMode(companion42, (Function1) rememberedValue13);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                                            int i382 = i26;
                                            changedInstance3 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i382 != 16384) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                            rememberedValue14 = startRestartGroup.rememberedValue();
                                            if (!changedInstance3) {
                                            }
                                            final boolean z192 = z6;
                                            final boolean z202 = z4;
                                            rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                    m992invokek4lQ0M(offset.getPackedValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                                public final void m992invokek4lQ0M(long j) {
                                                    CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester, !z192);
                                                    if (LegacyTextFieldState.this.getHasFocus() && z202) {
                                                        if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                            if (layoutResult != null) {
                                                                LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                                TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping, legacyTextFieldState2.getOnValueChange());
                                                                if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                                                    legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        textFieldSelectionManager.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                                                    }
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue14);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Modifier pointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode2, mutableInteractionSource5, z4, (Function1) rememberedValue14), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                            Modifier.Companion companion52 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                                            changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                            Object rememberedValue202 = startRestartGroup.rememberedValue();
                                            if (changedInstance4) {
                                            }
                                            obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                    if (layoutResult != null) {
                                                        TextFieldValue textFieldValue2 = textFieldValue;
                                                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                        OffsetMapping offsetMapping2 = offsetMapping;
                                                        TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping2, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                                                    }
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(obj);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            final Modifier drawBehind2 = DrawModifierKt.drawBehind(companion52, (Function1) obj);
                                            Modifier.Companion companion62 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                                            changedInstance5 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                            rememberedValue15 = startRestartGroup.rememberedValue();
                                            if (!changedInstance5) {
                                            }
                                            final boolean z212 = z4;
                                            rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                    invoke2(layoutCoordinates);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                    LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                    if (layoutResult != null) {
                                                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                                    }
                                                    if (z212) {
                                                        if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                                            if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                                            } else {
                                                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                                            }
                                                            LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                            LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                                            LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                                                        } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                                            LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                        }
                                                        CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping);
                                                        TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                                                        if (layoutResult2 != null) {
                                                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                            TextFieldValue textFieldValue2 = textFieldValue;
                                                            OffsetMapping offsetMapping2 = offsetMapping;
                                                            TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                                            if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                                                return;
                                                            }
                                                            TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2, layoutResult2);
                                                        }
                                                    }
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue15);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            final Modifier onGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion62, (Function1) rememberedValue15);
                                            final boolean z222 = visualTransformation5 instanceof PasswordVisualTransformation;
                                            Modifier.Companion companion72 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                                            changedInstance6 = startRestartGroup.changedInstance(transformedText) | (i37 != 4) | (i35 != 2048) | startRestartGroup.changed(z222) | (i382 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                            rememberedValue16 = startRestartGroup.rememberedValue();
                                            if (!changedInstance6) {
                                            }
                                            final boolean z232 = z4;
                                            final boolean z242 = z6;
                                            final ImeOptions imeOptions82 = imeOptions4;
                                            rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                                                public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                                                    SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                                    if (!z232) {
                                                        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                                    }
                                                    if (z222) {
                                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                    }
                                                    boolean z252 = z232 && !z242;
                                                    SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z252);
                                                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                                    SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Boolean invoke(List<TextLayoutResult> list) {
                                                            boolean z262;
                                                            if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                                Intrinsics.checkNotNull(layoutResult);
                                                                list.add(layoutResult.getValue());
                                                                z262 = true;
                                                            } else {
                                                                z262 = false;
                                                            }
                                                            return Boolean.valueOf(z262);
                                                        }
                                                    }, 1, null);
                                                    if (z252) {
                                                        final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                                        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Boolean invoke(AnnotatedString annotatedString) {
                                                                Unit unit2;
                                                                TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                                                if (inputSession != null) {
                                                                    LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                                                    unit2 = Unit.INSTANCE;
                                                                } else {
                                                                    unit2 = null;
                                                                }
                                                                if (unit2 == null) {
                                                                    LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                }
                                                                return true;
                                                            }
                                                        }, 1, null);
                                                        final boolean z262 = z242;
                                                        final boolean z272 = z232;
                                                        final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                                        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Boolean invoke(AnnotatedString annotatedString) {
                                                                Unit unit2;
                                                                if (z262 || !z272) {
                                                                    return false;
                                                                }
                                                                TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                                                if (inputSession != null) {
                                                                    LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                                                    unit2 = Unit.INSTANCE;
                                                                } else {
                                                                    unit2 = null;
                                                                }
                                                                if (unit2 == null) {
                                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                                    legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                }
                                                                return true;
                                                            }
                                                        }, 1, null);
                                                    }
                                                    final OffsetMapping offsetMapping2 = offsetMapping;
                                                    final boolean z28 = z232;
                                                    final TextFieldValue textFieldValue3 = textFieldValue;
                                                    final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                                    final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                                                    SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                                        }

                                                        public final Boolean invoke(int i392, int i40, boolean z29) {
                                                            if (!z29) {
                                                                i392 = OffsetMapping.this.transformedToOriginal(i392);
                                                            }
                                                            if (!z29) {
                                                                i40 = OffsetMapping.this.transformedToOriginal(i40);
                                                            }
                                                            boolean z30 = false;
                                                            if (z28 && (i392 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                                                if (Math.min(i392, i40) >= 0 && Math.max(i392, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                                                    if (z29 || i392 == i40) {
                                                                        textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                                    } else {
                                                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2, false, 1, null);
                                                                    }
                                                                    legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i392, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                    z30 = true;
                                                                } else {
                                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                                }
                                                            }
                                                            return Boolean.valueOf(z30);
                                                        }
                                                    }, 1, null);
                                                    int imeAction = imeOptions82.getImeAction();
                                                    final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                                                    final ImeOptions imeOptions92 = imeOptions82;
                                                    SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions92.getImeAction()));
                                                            return true;
                                                        }
                                                    }, 2, null);
                                                    final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                                                    final FocusRequester focusRequester2 = focusRequester;
                                                    final boolean z29 = z242;
                                                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2, !z29);
                                                            return true;
                                                        }
                                                    }, 1, null);
                                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                    SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                            return true;
                                                        }
                                                    }, 1, null);
                                                    if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z222) {
                                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                                return true;
                                                            }
                                                        }, 1, null);
                                                        if (z232 && !z242) {
                                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                                                {
                                                                    super(0);
                                                                }

                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Boolean invoke() {
                                                                    TextFieldSelectionManager.this.cut$foundation_release();
                                                                    return true;
                                                                }
                                                            }, 1, null);
                                                        }
                                                    }
                                                    if (!z232 || z242) {
                                                        return;
                                                    }
                                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                    SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            TextFieldSelectionManager.this.paste$foundation_release();
                                                            return true;
                                                        }
                                                    }, 1, null);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue16);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Modifier semantics2 = SemanticsModifierKt.semantics(companion72, true, (Function1) rememberedValue16);
                                            final Modifier cursor2 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                                            changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager);
                                            rememberedValue17 = startRestartGroup.rememberedValue();
                                            if (!changedInstance7) {
                                            }
                                            rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                    final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                                        }
                                                    };
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue17);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                                            changedInstance8 = (i37 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                            rememberedValue18 = startRestartGroup.rememberedValue();
                                            if (!changedInstance8) {
                                            }
                                            rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                    if (LegacyTextFieldState.this.getHasFocus()) {
                                                        LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                                                    }
                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                        }
                                                    };
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue18);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                                            Modifier m1076textFieldKeyInput2WJ9YEU2 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i34 != 1, offsetMapping, undoManager, imeOptions4.getImeAction());
                                            Modifier.Companion companion82 = Modifier.INSTANCE;
                                            boolean CoreTextField$lambda$112 = CoreTextField$lambda$11(rememberUpdatedState);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                                            changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter);
                                            rememberedValue19 = startRestartGroup.rememberedValue();
                                            if (!changedInstance9) {
                                            }
                                            rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (!LegacyTextFieldState.this.getHasFocus()) {
                                                        focusRequester.requestFocus();
                                                    }
                                                    if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                                                        legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
                                                    }
                                                    return true;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue19);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            Modifier onGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5, legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager).then(StylusHandwritingKt.stylusHandwriting(companion82, CoreTextField$lambda$112, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager).then(m1076textFieldKeyInput2WJ9YEU2), textFieldScrollerPosition, mutableInteractionSource5, z4).then(pointerHoverIcon$default2).then(semantics2), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                    invoke2(layoutCoordinates);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                    if (layoutResult == null) {
                                                        return;
                                                    }
                                                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                                }
                                            });
                                            if (z4) {
                                            }
                                            if (!z11) {
                                            }
                                            final Modifier modifier62 = companion;
                                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function342 = function32;
                                            final TextStyle textStyle52 = textStyle2;
                                            final int i392 = i21;
                                            boolean z252 = z4;
                                            ImeOptions imeOptions92 = imeOptions4;
                                            final boolean z262 = z11;
                                            final boolean z272 = z6;
                                            final Function1<? super TextLayoutResult, Unit> function152 = function13;
                                            composer2 = startRestartGroup;
                                            CoreTextFieldRootBox(onGloballyPositioned22, textFieldSelectionManager, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                                                public final void invoke(Composer composer3, int i40) {
                                                    ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                                    if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                                        }
                                                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function342;
                                                        final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                                        final TextStyle textStyle6 = textStyle52;
                                                        final int i41 = i392;
                                                        final int i42 = i34;
                                                        final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                                        final VisualTransformation visualTransformation6 = visualTransformation5;
                                                        final Modifier modifier7 = cursor2;
                                                        final Modifier modifier8 = drawBehind2;
                                                        final Modifier modifier9 = onGloballyPositioned3;
                                                        final Modifier modifier10 = modifier62;
                                                        final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                                        final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                                        final boolean z28 = z262;
                                                        final boolean z29 = z272;
                                                        final Function1<? super TextLayoutResult, Unit> function16 = function152;
                                                        final OffsetMapping offsetMapping2 = offsetMapping;
                                                        final Density density2 = density;
                                                        function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                                            public final void invoke(Composer composer4, int i43) {
                                                                ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                                                if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                                    }
                                                                    Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                                    boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                                                    final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                                                    Object rememberedValue21 = composer4.rememberedValue();
                                                                    if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                        rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final TextLayoutResultProxy invoke() {
                                                                                return LegacyTextFieldState.this.getLayoutResult();
                                                                            }
                                                                        };
                                                                        composer4.updateRememberedValue(rememberedValue21);
                                                                    }
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2);
                                                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                                    final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                                    final boolean z30 = z28;
                                                                    final boolean z31 = z29;
                                                                    final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                                                    final OffsetMapping offsetMapping3 = offsetMapping2;
                                                                    final Density density3 = density2;
                                                                    final int i44 = i42;
                                                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                            invoke(composer5, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                                                        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                        */
                                                                        public final void invoke(Composer composer5, int i45) {
                                                                            boolean z32;
                                                                            ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                                            if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                                                }
                                                                                final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                                final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                                final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                                final Density density4 = density3;
                                                                                final int i46 = i44;
                                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                    /* renamed from: measure-3p2s80s */
                                                                                    public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                        Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                                                        LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                                                        Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                        Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                        try {
                                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                                            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                            Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                            int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                                            int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                                            TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                                            if (!Intrinsics.areEqual(value, component3)) {
                                                                                                LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                function18.invoke(component3);
                                                                                                CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                                            }
                                                                                            LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                                            return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                    invoke2(placementScope);
                                                                                                    return Unit.INSTANCE;
                                                                                                }
                                                                                            });
                                                                                        } finally {
                                                                                            companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                                                        }
                                                                                    }

                                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                                                        LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                        return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                                    }
                                                                                };
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                                    ComposablesKt.invalidApplier();
                                                                                }
                                                                                composer5.startReusableNode();
                                                                                if (composer5.getInserting()) {
                                                                                    composer5.createNode(constructor);
                                                                                } else {
                                                                                    composer5.useNode();
                                                                                }
                                                                                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                                                Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                }
                                                                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                composer5.endNode();
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                                if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                                                    LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                                    if (layoutCoordinates.isAttached() && z30) {
                                                                                        z32 = true;
                                                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                                        if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                                            composer5.startReplaceGroup(-2032274);
                                                                                            ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                                            CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                                            composer5.endReplaceGroup();
                                                                                        } else {
                                                                                            composer5.startReplaceGroup(-1955394);
                                                                                            composer5.endReplaceGroup();
                                                                                        }
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            return;
                                                                                        }
                                                                                        ComposerKt.traceEventEnd();
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                z32 = false;
                                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                                if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                                                }
                                                                                composer5.startReplaceGroup(-1955394);
                                                                                composer5.endReplaceGroup();
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                }
                                                                            } else {
                                                                                composer5.skipToGroupEnd();
                                                                            }
                                                                        }
                                                                    }, composer4, 54), composer4, 48, 0);
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
                                            }, composer2, 54), composer2, 384);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            visualTransformation4 = visualTransformation5;
                                            z12 = z252;
                                            textStyle3 = textStyle2;
                                            function14 = function13;
                                            imeOptions5 = imeOptions92;
                                            brush3 = brush2;
                                            i28 = i34;
                                            modifier4 = modifier5;
                                            z13 = z5;
                                            i29 = i21;
                                            keyboardActions3 = keyboardActions2;
                                            z14 = z6;
                                            function33 = function32;
                                            mutableInteractionSource3 = mutableInteractionSource5;
                                        }
                                    } else {
                                        imeOptions4 = imeOptions6;
                                    }
                                    i26 = i36;
                                    i27 = i16;
                                    if ((i16 & 48) != 32) {
                                        z8 = false;
                                        changedInstance = changedInstance10 | z8 | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(bringIntoViewRequester) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                        rememberedValue11 = startRestartGroup.rememberedValue();
                                        if (!changedInstance) {
                                        }
                                        final boolean z172 = z4;
                                        final boolean z182 = z6;
                                        final ImeOptions imeOptions72 = imeOptions4;
                                        rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                                invoke2(focusState);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(FocusState focusState) {
                                                TextLayoutResultProxy layoutResult;
                                                if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                                    return;
                                                }
                                                LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                                                if (!LegacyTextFieldState.this.getHasFocus() || !z172 || z182) {
                                                    CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                                                } else {
                                                    CoreTextFieldKt.startInputSession(textInputService, LegacyTextFieldState.this, textFieldValue, imeOptions72, offsetMapping);
                                                }
                                                if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping, null), 3, null);
                                                }
                                                if (focusState.isFocused()) {
                                                    return;
                                                }
                                                TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion3, z4, focusRequester, mutableInteractionSource5, (Function1) rememberedValue11);
                                        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
                                        Unit unit2 = Unit.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                                        boolean changed32 = startRestartGroup.changed(rememberUpdatedState2) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                        if (i25 > 32) {
                                        }
                                        modifier3 = textFieldFocusModifier;
                                        if ((i27 & 48) != 32) {
                                        }
                                        z9 = true;
                                        z10 = z9 | changed32;
                                        rememberedValue12 = startRestartGroup.rememberedValue();
                                        if (!z10) {
                                        }
                                        rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState2, textInputService, textFieldSelectionManager, imeOptions4, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue12);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                                        Modifier.Companion companion422 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                                        rememberedValue13 = startRestartGroup.rememberedValue();
                                        if (!changedInstance2) {
                                        }
                                        rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                invoke(bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(boolean z1922) {
                                                LegacyTextFieldState.this.setInTouchMode(z1922);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue13);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier updateSelectionTouchMode22 = SelectionGesturesKt.updateSelectionTouchMode(companion422, (Function1) rememberedValue13);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                                        int i3822 = i26;
                                        changedInstance3 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i3822 != 16384) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                        rememberedValue14 = startRestartGroup.rememberedValue();
                                        if (!changedInstance3) {
                                        }
                                        final boolean z1922 = z6;
                                        final boolean z2022 = z4;
                                        rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                m992invokek4lQ0M(offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                            public final void m992invokek4lQ0M(long j) {
                                                CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester, !z1922);
                                                if (LegacyTextFieldState.this.getHasFocus() && z2022) {
                                                    if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                        if (layoutResult != null) {
                                                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                            TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping, legacyTextFieldState2.getOnValueChange());
                                                            if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                                                legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    textFieldSelectionManager.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                                                }
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue14);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier pointerHoverIcon$default22 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode22, mutableInteractionSource5, z4, (Function1) rememberedValue14), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                        Modifier.Companion companion522 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                        Object rememberedValue2022 = startRestartGroup.rememberedValue();
                                        if (changedInstance4) {
                                        }
                                        obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                if (layoutResult != null) {
                                                    TextFieldValue textFieldValue2 = textFieldValue;
                                                    LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                    OffsetMapping offsetMapping2 = offsetMapping;
                                                    TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping2, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                                                }
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(obj);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Modifier drawBehind22 = DrawModifierKt.drawBehind(companion522, (Function1) obj);
                                        Modifier.Companion companion622 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance5 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                        rememberedValue15 = startRestartGroup.rememberedValue();
                                        if (!changedInstance5) {
                                        }
                                        final boolean z2122 = z4;
                                        rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                invoke2(layoutCoordinates);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                if (layoutResult != null) {
                                                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                                }
                                                if (z2122) {
                                                    if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                                        if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                                        } else {
                                                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                                        }
                                                        LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                        LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                                        LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                                                    } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                                        LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                    }
                                                    CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping);
                                                    TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                                                    if (layoutResult2 != null) {
                                                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                        TextFieldValue textFieldValue2 = textFieldValue;
                                                        OffsetMapping offsetMapping2 = offsetMapping;
                                                        TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                                        if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                                            return;
                                                        }
                                                        TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2, layoutResult2);
                                                    }
                                                }
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue15);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Modifier onGloballyPositioned32 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion622, (Function1) rememberedValue15);
                                        final boolean z2222 = visualTransformation5 instanceof PasswordVisualTransformation;
                                        Modifier.Companion companion722 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance6 = startRestartGroup.changedInstance(transformedText) | (i37 != 4) | (i35 != 2048) | startRestartGroup.changed(z2222) | (i3822 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                        rememberedValue16 = startRestartGroup.rememberedValue();
                                        if (!changedInstance6) {
                                        }
                                        final boolean z2322 = z4;
                                        final boolean z2422 = z6;
                                        final ImeOptions imeOptions822 = imeOptions4;
                                        rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                                            public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                                                SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                                if (!z2322) {
                                                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                                }
                                                if (z2222) {
                                                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                }
                                                boolean z2522 = z2322 && !z2422;
                                                SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z2522);
                                                final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                                SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Boolean invoke(List<TextLayoutResult> list) {
                                                        boolean z2622;
                                                        if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                            Intrinsics.checkNotNull(layoutResult);
                                                            list.add(layoutResult.getValue());
                                                            z2622 = true;
                                                        } else {
                                                            z2622 = false;
                                                        }
                                                        return Boolean.valueOf(z2622);
                                                    }
                                                }, 1, null);
                                                if (z2522) {
                                                    final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                                    SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                                            Unit unit22;
                                                            TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                                            if (inputSession != null) {
                                                                LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                                                unit22 = Unit.INSTANCE;
                                                            } else {
                                                                unit22 = null;
                                                            }
                                                            if (unit22 == null) {
                                                                LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                            }
                                                            return true;
                                                        }
                                                    }, 1, null);
                                                    final boolean z2622 = z2422;
                                                    final boolean z2722 = z2322;
                                                    final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                                    SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                                            Unit unit22;
                                                            if (z2622 || !z2722) {
                                                                return false;
                                                            }
                                                            TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                                            if (inputSession != null) {
                                                                LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                                                unit22 = Unit.INSTANCE;
                                                            } else {
                                                                unit22 = null;
                                                            }
                                                            if (unit22 == null) {
                                                                TextFieldValue textFieldValue3 = textFieldValue2;
                                                                legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                            }
                                                            return true;
                                                        }
                                                    }, 1, null);
                                                }
                                                final OffsetMapping offsetMapping2 = offsetMapping;
                                                final boolean z28 = z2322;
                                                final TextFieldValue textFieldValue3 = textFieldValue;
                                                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                                final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                                                SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                                        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                                    }

                                                    public final Boolean invoke(int i3922, int i40, boolean z29) {
                                                        if (!z29) {
                                                            i3922 = OffsetMapping.this.transformedToOriginal(i3922);
                                                        }
                                                        if (!z29) {
                                                            i40 = OffsetMapping.this.transformedToOriginal(i40);
                                                        }
                                                        boolean z30 = false;
                                                        if (z28 && (i3922 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                                            if (Math.min(i3922, i40) >= 0 && Math.max(i3922, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                                                if (z29 || i3922 == i40) {
                                                                    textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                                } else {
                                                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2, false, 1, null);
                                                                }
                                                                legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i3922, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                z30 = true;
                                                            } else {
                                                                textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                            }
                                                        }
                                                        return Boolean.valueOf(z30);
                                                    }
                                                }, 1, null);
                                                int imeAction = imeOptions822.getImeAction();
                                                final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                                                final ImeOptions imeOptions922 = imeOptions822;
                                                SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions922.getImeAction()));
                                                        return true;
                                                    }
                                                }, 2, null);
                                                final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                                                final FocusRequester focusRequester2 = focusRequester;
                                                final boolean z29 = z2422;
                                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2, !z29);
                                                        return true;
                                                    }
                                                }, 1, null);
                                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                        return true;
                                                    }
                                                }, 1, null);
                                                if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z2222) {
                                                    final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                            return true;
                                                        }
                                                    }, 1, null);
                                                    if (z2322 && !z2422) {
                                                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                TextFieldSelectionManager.this.cut$foundation_release();
                                                                return true;
                                                            }
                                                        }, 1, null);
                                                    }
                                                }
                                                if (!z2322 || z2422) {
                                                    return;
                                                }
                                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        TextFieldSelectionManager.this.paste$foundation_release();
                                                        return true;
                                                    }
                                                }, 1, null);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue16);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier semantics22 = SemanticsModifierKt.semantics(companion722, true, (Function1) rememberedValue16);
                                        final Modifier cursor22 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager);
                                        rememberedValue17 = startRestartGroup.rememberedValue();
                                        if (!changedInstance7) {
                                        }
                                        rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                                    }
                                                };
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue17);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance8 = (i37 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                        rememberedValue18 = startRestartGroup.rememberedValue();
                                        if (!changedInstance8) {
                                        }
                                        rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                if (LegacyTextFieldState.this.getHasFocus()) {
                                                    LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                                                }
                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                    }
                                                };
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue18);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                                        Modifier m1076textFieldKeyInput2WJ9YEU22 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i34 != 1, offsetMapping, undoManager, imeOptions4.getImeAction());
                                        Modifier.Companion companion822 = Modifier.INSTANCE;
                                        boolean CoreTextField$lambda$1122 = CoreTextField$lambda$11(rememberUpdatedState2);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                                        changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter);
                                        rememberedValue19 = startRestartGroup.rememberedValue();
                                        if (!changedInstance9) {
                                        }
                                        rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                if (!LegacyTextFieldState.this.getHasFocus()) {
                                                    focusRequester.requestFocus();
                                                }
                                                if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                                                    legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
                                                }
                                                return true;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue19);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Modifier onGloballyPositioned222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5, legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager).then(StylusHandwritingKt.stylusHandwriting(companion822, CoreTextField$lambda$1122, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager).then(m1076textFieldKeyInput2WJ9YEU22), textFieldScrollerPosition, mutableInteractionSource5, z4).then(pointerHoverIcon$default22).then(semantics22), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                invoke2(layoutCoordinates);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                if (layoutResult == null) {
                                                    return;
                                                }
                                                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                            }
                                        });
                                        if (z4) {
                                        }
                                        if (!z11) {
                                        }
                                        final Modifier modifier622 = companion;
                                        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3422 = function32;
                                        final TextStyle textStyle522 = textStyle2;
                                        final int i3922 = i21;
                                        boolean z2522 = z4;
                                        ImeOptions imeOptions922 = imeOptions4;
                                        final boolean z2622 = z11;
                                        final boolean z2722 = z6;
                                        final Function1<? super TextLayoutResult, Unit> function1522 = function13;
                                        composer2 = startRestartGroup;
                                        CoreTextFieldRootBox(onGloballyPositioned222, textFieldSelectionManager, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                                            public final void invoke(Composer composer3, int i40) {
                                                ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                                if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                                    }
                                                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function3422;
                                                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                                    final TextStyle textStyle6 = textStyle522;
                                                    final int i41 = i3922;
                                                    final int i42 = i34;
                                                    final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                                    final VisualTransformation visualTransformation6 = visualTransformation5;
                                                    final Modifier modifier7 = cursor22;
                                                    final Modifier modifier8 = drawBehind22;
                                                    final Modifier modifier9 = onGloballyPositioned32;
                                                    final Modifier modifier10 = modifier622;
                                                    final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                                    final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                                    final boolean z28 = z2622;
                                                    final boolean z29 = z2722;
                                                    final Function1<? super TextLayoutResult, Unit> function16 = function1522;
                                                    final OffsetMapping offsetMapping2 = offsetMapping;
                                                    final Density density2 = density;
                                                    function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                                        public final void invoke(Composer composer4, int i43) {
                                                            ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                                            if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                                }
                                                                Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                                                TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                                TextFieldValue textFieldValue3 = textFieldValue2;
                                                                VisualTransformation visualTransformation7 = visualTransformation6;
                                                                ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                                boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                                                final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                                                Object rememberedValue21 = composer4.rememberedValue();
                                                                if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                    rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final TextLayoutResultProxy invoke() {
                                                                            return LegacyTextFieldState.this.getLayoutResult();
                                                                        }
                                                                    };
                                                                    composer4.updateRememberedValue(rememberedValue21);
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2);
                                                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                                final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                                final boolean z30 = z28;
                                                                final boolean z31 = z29;
                                                                final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                                final TextFieldValue textFieldValue4 = textFieldValue2;
                                                                final OffsetMapping offsetMapping3 = offsetMapping2;
                                                                final Density density3 = density2;
                                                                final int i44 = i42;
                                                                SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                        invoke(composer5, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                                                    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                                                    /*
                                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                                    */
                                                                    public final void invoke(Composer composer5, int i45) {
                                                                        boolean z32;
                                                                        ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                                        if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                                            }
                                                                            final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                            final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                                            final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                            final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                            final Density density4 = density3;
                                                                            final int i46 = i44;
                                                                            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                /* renamed from: measure-3p2s80s */
                                                                                public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                    Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                                                    LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                                                    Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                                                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                    Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                    try {
                                                                                        TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                                        TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                        Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                        int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                                        int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                                        TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                                        if (!Intrinsics.areEqual(value, component3)) {
                                                                                            LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                            function18.invoke(component3);
                                                                                            CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                                        }
                                                                                        LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                                        return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                            }

                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                invoke2(placementScope);
                                                                                                return Unit.INSTANCE;
                                                                                            }
                                                                                        });
                                                                                    } finally {
                                                                                        companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                                                    }
                                                                                }

                                                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                                                    LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                    return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                                }
                                                                            };
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                            Modifier.Companion companion9 = Modifier.INSTANCE;
                                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                                ComposablesKt.invalidApplier();
                                                                            }
                                                                            composer5.startReusableNode();
                                                                            if (composer5.getInserting()) {
                                                                                composer5.createNode(constructor);
                                                                            } else {
                                                                                composer5.useNode();
                                                                            }
                                                                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                                            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                            }
                                                                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            composer5.endNode();
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                            if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                                                LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                                                Intrinsics.checkNotNull(layoutCoordinates);
                                                                                if (layoutCoordinates.isAttached() && z30) {
                                                                                    z32 = true;
                                                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                                    if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                                        composer5.startReplaceGroup(-2032274);
                                                                                        ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                                        CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                                        composer5.endReplaceGroup();
                                                                                    } else {
                                                                                        composer5.startReplaceGroup(-1955394);
                                                                                        composer5.endReplaceGroup();
                                                                                    }
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        return;
                                                                                    }
                                                                                    ComposerKt.traceEventEnd();
                                                                                    return;
                                                                                }
                                                                            }
                                                                            z32 = false;
                                                                            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                            if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                                            }
                                                                            composer5.startReplaceGroup(-1955394);
                                                                            composer5.endReplaceGroup();
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                        } else {
                                                                            composer5.skipToGroupEnd();
                                                                        }
                                                                    }
                                                                }, composer4, 54), composer4, 48, 0);
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
                                        }, composer2, 54), composer2, 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        visualTransformation4 = visualTransformation5;
                                        z12 = z2522;
                                        textStyle3 = textStyle2;
                                        function14 = function13;
                                        imeOptions5 = imeOptions922;
                                        brush3 = brush2;
                                        i28 = i34;
                                        modifier4 = modifier5;
                                        z13 = z5;
                                        i29 = i21;
                                        keyboardActions3 = keyboardActions2;
                                        z14 = z6;
                                        function33 = function32;
                                        mutableInteractionSource3 = mutableInteractionSource5;
                                    }
                                    z8 = true;
                                    changedInstance = changedInstance10 | z8 | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(bringIntoViewRequester) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                    rememberedValue11 = startRestartGroup.rememberedValue();
                                    if (!changedInstance) {
                                    }
                                    final boolean z1722 = z4;
                                    final boolean z1822 = z6;
                                    final ImeOptions imeOptions722 = imeOptions4;
                                    rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                            invoke2(focusState);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(FocusState focusState) {
                                            TextLayoutResultProxy layoutResult;
                                            if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                                return;
                                            }
                                            LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                                            if (!LegacyTextFieldState.this.getHasFocus() || !z1722 || z1822) {
                                                CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                                            } else {
                                                CoreTextFieldKt.startInputSession(textInputService, LegacyTextFieldState.this, textFieldValue, imeOptions722, offsetMapping);
                                            }
                                            if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping, null), 3, null);
                                            }
                                            if (focusState.isFocused()) {
                                                return;
                                            }
                                            TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion3, z4, focusRequester, mutableInteractionSource5, (Function1) rememberedValue11);
                                    State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
                                    Unit unit22 = Unit.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                                    boolean changed322 = startRestartGroup.changed(rememberUpdatedState22) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                    if (i25 > 32) {
                                    }
                                    modifier3 = textFieldFocusModifier;
                                    if ((i27 & 48) != 32) {
                                    }
                                    z9 = true;
                                    z10 = z9 | changed322;
                                    rememberedValue12 = startRestartGroup.rememberedValue();
                                    if (!z10) {
                                    }
                                    rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState22, textInputService, textFieldSelectionManager, imeOptions4, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                                    Modifier.Companion companion4222 = Modifier.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                                    changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                                    rememberedValue13 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2) {
                                    }
                                    rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                            invoke(bool.booleanValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(boolean z19222) {
                                            LegacyTextFieldState.this.setInTouchMode(z19222);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier updateSelectionTouchMode222 = SelectionGesturesKt.updateSelectionTouchMode(companion4222, (Function1) rememberedValue13);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                                    int i38222 = i26;
                                    changedInstance3 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i38222 != 16384) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager);
                                    rememberedValue14 = startRestartGroup.rememberedValue();
                                    if (!changedInstance3) {
                                    }
                                    final boolean z19222 = z6;
                                    final boolean z20222 = z4;
                                    rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                            m992invokek4lQ0M(offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                        public final void m992invokek4lQ0M(long j) {
                                            CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester, !z19222);
                                            if (LegacyTextFieldState.this.getHasFocus() && z20222) {
                                                if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                    if (layoutResult != null) {
                                                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                        TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping, legacyTextFieldState2.getOnValueChange());
                                                        if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                                            legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                textFieldSelectionManager.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                                            }
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier pointerHoverIcon$default222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode222, mutableInteractionSource5, z4, (Function1) rememberedValue14), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                    Modifier.Companion companion5222 = Modifier.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                                    changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                    Object rememberedValue20222 = startRestartGroup.rememberedValue();
                                    if (changedInstance4) {
                                    }
                                    obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                            if (layoutResult != null) {
                                                TextFieldValue textFieldValue2 = textFieldValue;
                                                LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                OffsetMapping offsetMapping2 = offsetMapping;
                                                TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping2, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                                            }
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(obj);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Modifier drawBehind222 = DrawModifierKt.drawBehind(companion5222, (Function1) obj);
                                    Modifier.Companion companion6222 = Modifier.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                                    changedInstance5 = (i35 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager) | (i37 != 4) | startRestartGroup.changedInstance(offsetMapping);
                                    rememberedValue15 = startRestartGroup.rememberedValue();
                                    if (!changedInstance5) {
                                    }
                                    final boolean z21222 = z4;
                                    rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                            invoke2(layoutCoordinates);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                            LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                            if (layoutResult != null) {
                                                layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                            }
                                            if (z21222) {
                                                if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                                    if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                                        textFieldSelectionManager.showSelectionToolbar$foundation_release();
                                                    } else {
                                                        textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                                                    }
                                                    LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                    LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                                                    LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                                                } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                                    LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                                                }
                                                CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping);
                                                TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                                                if (layoutResult2 != null) {
                                                    LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                    TextFieldValue textFieldValue2 = textFieldValue;
                                                    OffsetMapping offsetMapping2 = offsetMapping;
                                                    TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                                    if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                                        return;
                                                    }
                                                    TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2, layoutResult2);
                                                }
                                            }
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue15);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Modifier onGloballyPositioned322 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion6222, (Function1) rememberedValue15);
                                    final boolean z22222 = visualTransformation5 instanceof PasswordVisualTransformation;
                                    Modifier.Companion companion7222 = Modifier.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                                    changedInstance6 = startRestartGroup.changedInstance(transformedText) | (i37 != 4) | (i35 != 2048) | startRestartGroup.changed(z22222) | (i38222 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping) | startRestartGroup.changedInstance(textFieldSelectionManager) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                    rememberedValue16 = startRestartGroup.rememberedValue();
                                    if (!changedInstance6) {
                                    }
                                    final boolean z23222 = z4;
                                    final boolean z24222 = z6;
                                    final ImeOptions imeOptions8222 = imeOptions4;
                                    rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                                        public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                                            SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                            if (!z23222) {
                                                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                            }
                                            if (z22222) {
                                                SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                            }
                                            boolean z25222 = z23222 && !z24222;
                                            SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z25222);
                                            final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                            SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Boolean invoke(List<TextLayoutResult> list) {
                                                    boolean z26222;
                                                    if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                        Intrinsics.checkNotNull(layoutResult);
                                                        list.add(layoutResult.getValue());
                                                        z26222 = true;
                                                    } else {
                                                        z26222 = false;
                                                    }
                                                    return Boolean.valueOf(z26222);
                                                }
                                            }, 1, null);
                                            if (z25222) {
                                                final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                                SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Boolean invoke(AnnotatedString annotatedString) {
                                                        Unit unit222;
                                                        TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                                        if (inputSession != null) {
                                                            LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                                            unit222 = Unit.INSTANCE;
                                                        } else {
                                                            unit222 = null;
                                                        }
                                                        if (unit222 == null) {
                                                            LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                        }
                                                        return true;
                                                    }
                                                }, 1, null);
                                                final boolean z26222 = z24222;
                                                final boolean z27222 = z23222;
                                                final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                final TextFieldValue textFieldValue2 = textFieldValue;
                                                SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Boolean invoke(AnnotatedString annotatedString) {
                                                        Unit unit222;
                                                        if (z26222 || !z27222) {
                                                            return false;
                                                        }
                                                        TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                                        if (inputSession != null) {
                                                            LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                                            unit222 = Unit.INSTANCE;
                                                        } else {
                                                            unit222 = null;
                                                        }
                                                        if (unit222 == null) {
                                                            TextFieldValue textFieldValue3 = textFieldValue2;
                                                            legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                        }
                                                        return true;
                                                    }
                                                }, 1, null);
                                            }
                                            final OffsetMapping offsetMapping2 = offsetMapping;
                                            final boolean z28 = z23222;
                                            final TextFieldValue textFieldValue3 = textFieldValue;
                                            final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                            final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                                            SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                                    return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                                }

                                                public final Boolean invoke(int i39222, int i40, boolean z29) {
                                                    if (!z29) {
                                                        i39222 = OffsetMapping.this.transformedToOriginal(i39222);
                                                    }
                                                    if (!z29) {
                                                        i40 = OffsetMapping.this.transformedToOriginal(i40);
                                                    }
                                                    boolean z30 = false;
                                                    if (z28 && (i39222 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                                        if (Math.min(i39222, i40) >= 0 && Math.max(i39222, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                                            if (z29 || i39222 == i40) {
                                                                textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                            } else {
                                                                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2, false, 1, null);
                                                            }
                                                            legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i39222, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                            z30 = true;
                                                        } else {
                                                            textFieldSelectionManager2.exitSelectionMode$foundation_release();
                                                        }
                                                    }
                                                    return Boolean.valueOf(z30);
                                                }
                                            }, 1, null);
                                            int imeAction = imeOptions8222.getImeAction();
                                            final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                                            final ImeOptions imeOptions9222 = imeOptions8222;
                                            SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions9222.getImeAction()));
                                                    return true;
                                                }
                                            }, 2, null);
                                            final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                                            final FocusRequester focusRequester2 = focusRequester;
                                            final boolean z29 = z24222;
                                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2, !z29);
                                                    return true;
                                                }
                                            }, 1, null);
                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                            SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                    return true;
                                                }
                                            }, 1, null);
                                            if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z22222) {
                                                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                        return true;
                                                    }
                                                }, 1, null);
                                                if (z23222 && !z24222) {
                                                    final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Boolean invoke() {
                                                            TextFieldSelectionManager.this.cut$foundation_release();
                                                            return true;
                                                        }
                                                    }, 1, null);
                                                }
                                            }
                                            if (!z23222 || z24222) {
                                                return;
                                            }
                                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextFieldSelectionManager.this.paste$foundation_release();
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue16);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier semantics222 = SemanticsModifierKt.semantics(companion7222, true, (Function1) rememberedValue16);
                                    final Modifier cursor222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                                    changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager);
                                    rememberedValue17 = startRestartGroup.rememberedValue();
                                    if (!changedInstance7) {
                                    }
                                    rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                            final TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                                }
                                            };
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue17);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                                    changedInstance8 = (i37 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                                    rememberedValue18 = startRestartGroup.rememberedValue();
                                    if (!changedInstance8) {
                                    }
                                    rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                            if (LegacyTextFieldState.this.getHasFocus()) {
                                                LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                                            }
                                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                }
                                            };
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue18);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                                    Modifier m1076textFieldKeyInput2WJ9YEU222 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i34 != 1, offsetMapping, undoManager, imeOptions4.getImeAction());
                                    Modifier.Companion companion8222 = Modifier.INSTANCE;
                                    boolean CoreTextField$lambda$11222 = CoreTextField$lambda$11(rememberUpdatedState22);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                                    changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter);
                                    rememberedValue19 = startRestartGroup.rememberedValue();
                                    if (!changedInstance9) {
                                    }
                                    rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            if (!LegacyTextFieldState.this.getHasFocus()) {
                                                focusRequester.requestFocus();
                                            }
                                            if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                                                legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
                                            }
                                            return true;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue19);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Modifier onGloballyPositioned2222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5, legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager).then(StylusHandwritingKt.stylusHandwriting(companion8222, CoreTextField$lambda$11222, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager), legacyTextFieldState, textFieldSelectionManager).then(m1076textFieldKeyInput2WJ9YEU222), textFieldScrollerPosition, mutableInteractionSource5, z4).then(pointerHoverIcon$default222).then(semantics222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                            invoke2(layoutCoordinates);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                            if (layoutResult == null) {
                                                return;
                                            }
                                            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                        }
                                    });
                                    if (z4) {
                                    }
                                    if (!z11) {
                                    }
                                    final Modifier modifier6222 = companion;
                                    final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34222 = function32;
                                    final TextStyle textStyle5222 = textStyle2;
                                    final int i39222 = i21;
                                    boolean z25222 = z4;
                                    ImeOptions imeOptions9222 = imeOptions4;
                                    final boolean z26222 = z11;
                                    final boolean z27222 = z6;
                                    final Function1<? super TextLayoutResult, Unit> function15222 = function13;
                                    composer2 = startRestartGroup;
                                    CoreTextFieldRootBox(onGloballyPositioned2222, textFieldSelectionManager, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                                        public final void invoke(Composer composer3, int i40) {
                                            ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                            if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                                }
                                                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34222;
                                                final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                                final TextStyle textStyle6 = textStyle5222;
                                                final int i41 = i39222;
                                                final int i42 = i34;
                                                final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                                final TextFieldValue textFieldValue2 = textFieldValue;
                                                final VisualTransformation visualTransformation6 = visualTransformation5;
                                                final Modifier modifier7 = cursor222;
                                                final Modifier modifier8 = drawBehind222;
                                                final Modifier modifier9 = onGloballyPositioned322;
                                                final Modifier modifier10 = modifier6222;
                                                final BringIntoViewRequester bringIntoViewRequester2 = bringIntoViewRequester;
                                                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                                                final boolean z28 = z26222;
                                                final boolean z29 = z27222;
                                                final Function1<? super TextLayoutResult, Unit> function16 = function15222;
                                                final OffsetMapping offsetMapping2 = offsetMapping;
                                                final Density density2 = density;
                                                function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                                    public final void invoke(Composer composer4, int i43) {
                                                        ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                                        if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                            }
                                                            Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                                            TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                            TextFieldValue textFieldValue3 = textFieldValue2;
                                                            VisualTransformation visualTransformation7 = visualTransformation6;
                                                            ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                            boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                                            final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                                            Object rememberedValue21 = composer4.rememberedValue();
                                                            if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final TextLayoutResultProxy invoke() {
                                                                        return LegacyTextFieldState.this.getLayoutResult();
                                                                    }
                                                                };
                                                                composer4.updateRememberedValue(rememberedValue21);
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2);
                                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                                            final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                            final boolean z30 = z28;
                                                            final boolean z31 = z29;
                                                            final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                            final TextFieldValue textFieldValue4 = textFieldValue2;
                                                            final OffsetMapping offsetMapping3 = offsetMapping2;
                                                            final Density density3 = density2;
                                                            final int i44 = i42;
                                                            SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                    invoke(composer5, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                                                /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                */
                                                                public final void invoke(Composer composer5, int i45) {
                                                                    boolean z32;
                                                                    ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                                    if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                                        }
                                                                        final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                        final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                                        final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                        final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                        final Density density4 = density3;
                                                                        final int i46 = i44;
                                                                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                            /* renamed from: measure-3p2s80s */
                                                                            public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                                                LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                                                Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                try {
                                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                                    TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                    Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                    int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                                    int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                                    TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                                    if (!Intrinsics.areEqual(value, component3)) {
                                                                                        LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                        function18.invoke(component3);
                                                                                        CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                                    }
                                                                                    LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                                    return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                            invoke2(placementScope);
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    });
                                                                                } finally {
                                                                                    companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                                                }
                                                                            }

                                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                                                LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                            }
                                                                        };
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                        Modifier.Companion companion9 = Modifier.INSTANCE;
                                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer5.startReusableNode();
                                                                        if (composer5.getInserting()) {
                                                                            composer5.createNode(constructor);
                                                                        } else {
                                                                            composer5.useNode();
                                                                        }
                                                                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                                        Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                        }
                                                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        composer5.endNode();
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                        if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                                            LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                                            Intrinsics.checkNotNull(layoutCoordinates);
                                                                            if (layoutCoordinates.isAttached() && z30) {
                                                                                z32 = true;
                                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                                if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                                    composer5.startReplaceGroup(-2032274);
                                                                                    ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                                    composer5.endReplaceGroup();
                                                                                } else {
                                                                                    composer5.startReplaceGroup(-1955394);
                                                                                    composer5.endReplaceGroup();
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    return;
                                                                                }
                                                                                ComposerKt.traceEventEnd();
                                                                                return;
                                                                            }
                                                                        }
                                                                        z32 = false;
                                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                        if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                                        }
                                                                        composer5.startReplaceGroup(-1955394);
                                                                        composer5.endReplaceGroup();
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                    } else {
                                                                        composer5.skipToGroupEnd();
                                                                    }
                                                                }
                                                            }, composer4, 54), composer4, 48, 0);
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
                                    }, composer2, 54), composer2, 384);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    visualTransformation4 = visualTransformation5;
                                    z12 = z25222;
                                    textStyle3 = textStyle2;
                                    function14 = function13;
                                    imeOptions5 = imeOptions9222;
                                    brush3 = brush2;
                                    i28 = i34;
                                    modifier4 = modifier5;
                                    z13 = z5;
                                    i29 = i21;
                                    keyboardActions3 = keyboardActions2;
                                    z14 = z6;
                                    function33 = function32;
                                    mutableInteractionSource3 = mutableInteractionSource5;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier4 = modifier;
                                    textStyle3 = textStyle;
                                    visualTransformation4 = visualTransformation;
                                    function14 = function12;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    brush3 = brush;
                                    z13 = z;
                                    i28 = i;
                                    imeOptions5 = imeOptions;
                                    keyboardActions3 = keyboardActions;
                                    z12 = z2;
                                    z14 = z3;
                                    function33 = function3;
                                    composer2 = startRestartGroup;
                                    i29 = i2;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
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

                                        public final void invoke(Composer composer3, int i40) {
                                            CoreTextFieldKt.CoreTextField(TextFieldValue.this, function1, modifier4, textStyle3, visualTransformation4, function14, mutableInteractionSource3, brush3, z13, i28, i29, imeOptions5, keyboardActions3, z12, z14, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i20 = i5 & 32768;
                            if (i20 != 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i31 != 0) {
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
                            if (i14 != 0) {
                            }
                            if ((i5 & 2048) != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            i22 = i32;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final FocusRequester focusRequester2 = (FocusRequester) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter2 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            final TextInputService textInputService2 = (TextInputService) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume10 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density2 = (Density) consume10;
                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(localFontFamilyResolver2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FontFamily.Resolver resolver2 = (FontFamily.Resolver) consume22;
                            Modifier modifier52 = modifier2;
                            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2 = TextSelectionColorsKt.getLocalTextSelectionColors();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume32 = startRestartGroup.consume(localTextSelectionColors2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            long backgroundColor2 = ((TextSelectionColors) consume32).getBackgroundColor();
                            ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume42 = startRestartGroup.consume(localFocusManager2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FocusManager focusManager2 = (FocusManager) consume42;
                            MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                            ProvidableCompositionLocal<WindowInfo> localWindowInfo2 = CompositionLocalsKt.getLocalWindowInfo();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume52 = startRestartGroup.consume(localWindowInfo2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            windowInfo = (WindowInfo) consume52;
                            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume62 = startRestartGroup.consume(localSoftwareKeyboardController2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) consume62;
                            if (i22 == 1) {
                            }
                            Object[] objArr2 = {orientation};
                            Saver<TextFieldScrollerPosition, Object> saver2 = TextFieldScrollerPosition.INSTANCE.getSaver();
                            final int i342 = i22;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                            changed = startRestartGroup.changed(orientation);
                            ImeOptions imeOptions62 = imeOptions3;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue4 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final TextFieldScrollerPosition invoke() {
                                    return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final TextFieldScrollerPosition textFieldScrollerPosition2 = (TextFieldScrollerPosition) RememberSaveableKt.m3426rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) rememberedValue4, startRestartGroup, 0, 4);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                            i23 = i6 & 14;
                            if (i23 == 4) {
                            }
                            z7 = ((i6 & 57344) == 16384) | (i23 == 4);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (z7) {
                            }
                            TransformedText filterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation3, textFieldValue.getAnnotatedString());
                            composition = textFieldValue.getComposition();
                            i24 = i23;
                            if (composition != null) {
                            }
                            rememberedValue5 = filterWithValidation2;
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            final TransformedText transformedText2 = (TransformedText) rememberedValue5;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            AnnotatedString text2 = transformedText2.getText();
                            final OffsetMapping offsetMapping2 = transformedText2.getOffsetMapping();
                            RecomposeScope currentRecomposeScope2 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
                            changed2 = startRestartGroup.changed(softwareKeyboardController2);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue6 = new LegacyTextFieldState(new TextDelegate(text2, textStyle2, 0, 0, z5, 0, density2, resolver2, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope2, softwareKeyboardController2);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            legacyTextFieldState = (LegacyTextFieldState) rememberedValue6;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            legacyTextFieldState.m1022updatefnh65Uc(textFieldValue.getAnnotatedString(), text2, textStyle2, z5, density2, resolver2, function1, keyboardActions2, focusManager2, backgroundColor2);
                            legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            }
                            UndoManager undoManager2 = (UndoManager) rememberedValue7;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            UndoManager.snapshotIfNeeded$default(undoManager2, textFieldValue, 0L, 2, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            }
                            final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) rememberedValue8;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                            textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation3);
                            textFieldSelectionManager2.setOnValueChange$foundation_release(legacyTextFieldState.getOnValueChange());
                            textFieldSelectionManager2.setState$foundation_release(legacyTextFieldState);
                            textFieldSelectionManager2.setValue$foundation_release(textFieldValue);
                            ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume72 = startRestartGroup.consume(localClipboardManager2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager2.setClipboardManager$foundation_release((ClipboardManager) consume72);
                            ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume82 = startRestartGroup.consume(localTextToolbar2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager2.setTextToolbar((TextToolbar) consume82);
                            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume92 = startRestartGroup.consume(localHapticFeedback2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) consume92);
                            textFieldSelectionManager2.setFocusRequester(focusRequester2);
                            textFieldSelectionManager2.setEditable(!z6);
                            textFieldSelectionManager2.setEnabled(z4);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue9 = startRestartGroup.rememberedValue();
                            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                            rememberedValue10 = startRestartGroup.rememberedValue();
                            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            }
                            final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue10;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                            int i352 = i16 & 7168;
                            int i362 = 57344 & i16;
                            final VisualTransformation visualTransformation52 = visualTransformation3;
                            int i372 = i24;
                            boolean changedInstance102 = (i352 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i362 == 16384) | startRestartGroup.changedInstance(textInputService2) | (i372 == 4);
                            i25 = (i16 & 112) ^ 48;
                            if (i25 > 32) {
                            }
                            i26 = i362;
                            i27 = i16;
                            if ((i16 & 48) != 32) {
                            }
                            z8 = true;
                            changedInstance = changedInstance102 | z8 | startRestartGroup.changedInstance(offsetMapping2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(bringIntoViewRequester2) | startRestartGroup.changedInstance(textFieldSelectionManager2);
                            rememberedValue11 = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            final boolean z17222 = z4;
                            final boolean z18222 = z6;
                            final ImeOptions imeOptions7222 = imeOptions4;
                            rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                    invoke2(focusState);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(FocusState focusState) {
                                    TextLayoutResultProxy layoutResult;
                                    if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                        return;
                                    }
                                    LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                                    if (!LegacyTextFieldState.this.getHasFocus() || !z17222 || z18222) {
                                        CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                                    } else {
                                        CoreTextFieldKt.startInputSession(textInputService2, LegacyTextFieldState.this, textFieldValue, imeOptions7222, offsetMapping2);
                                    }
                                    if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping2, null), 3, null);
                                    }
                                    if (focusState.isFocused()) {
                                        return;
                                    }
                                    TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion32, z4, focusRequester2, mutableInteractionSource52, (Function1) rememberedValue11);
                            State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
                            Unit unit222 = Unit.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                            boolean changed3222 = startRestartGroup.changed(rememberUpdatedState222) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService2) | startRestartGroup.changedInstance(textFieldSelectionManager2);
                            if (i25 > 32) {
                            }
                            modifier3 = textFieldFocusModifier;
                            if ((i27 & 48) != 32) {
                            }
                            z9 = true;
                            z10 = z9 | changed3222;
                            rememberedValue12 = startRestartGroup.rememberedValue();
                            if (!z10) {
                            }
                            rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState222, textInputService2, textFieldSelectionManager2, imeOptions4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.LaunchedEffect(unit222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                            Modifier.Companion companion42222 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                            changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                            rememberedValue13 = startRestartGroup.rememberedValue();
                            if (!changedInstance2) {
                            }
                            rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z192222) {
                                    LegacyTextFieldState.this.setInTouchMode(z192222);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue13);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier updateSelectionTouchMode2222 = SelectionGesturesKt.updateSelectionTouchMode(companion42222, (Function1) rememberedValue13);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                            int i382222 = i26;
                            changedInstance3 = (i352 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i382222 != 16384) | startRestartGroup.changedInstance(offsetMapping2) | startRestartGroup.changedInstance(textFieldSelectionManager2);
                            rememberedValue14 = startRestartGroup.rememberedValue();
                            if (!changedInstance3) {
                            }
                            final boolean z192222 = z6;
                            final boolean z202222 = z4;
                            rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                    m992invokek4lQ0M(offset.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                public final void m992invokek4lQ0M(long j) {
                                    CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2, !z192222);
                                    if (LegacyTextFieldState.this.getHasFocus() && z202222) {
                                        if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                            if (layoutResult != null) {
                                                LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                                TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping2, legacyTextFieldState2.getOnValueChange());
                                                if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                                    legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        textFieldSelectionManager2.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                                    }
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue14);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier pointerHoverIcon$default2222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode2222, mutableInteractionSource52, z4, (Function1) rememberedValue14), textFieldSelectionManager2.getMouseSelectionObserver(), textFieldSelectionManager2.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                            Modifier.Companion companion52222 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                            changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i372 != 4) | startRestartGroup.changedInstance(offsetMapping2);
                            Object rememberedValue202222 = startRestartGroup.rememberedValue();
                            if (changedInstance4) {
                            }
                            obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                        OffsetMapping offsetMapping22 = offsetMapping2;
                                        TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping22, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                                    }
                                }
                            };
                            startRestartGroup.updateRememberedValue(obj);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Modifier drawBehind2222 = DrawModifierKt.drawBehind(companion52222, (Function1) obj);
                            Modifier.Companion companion62222 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                            changedInstance5 = (i352 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager2) | (i372 != 4) | startRestartGroup.changedInstance(offsetMapping2);
                            rememberedValue15 = startRestartGroup.rememberedValue();
                            if (!changedInstance5) {
                            }
                            final boolean z212222 = z4;
                            rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                    LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                    }
                                    if (z212222) {
                                        if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                            if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                                textFieldSelectionManager2.showSelectionToolbar$foundation_release();
                                            } else {
                                                textFieldSelectionManager2.hideSelectionToolbar$foundation_release();
                                            }
                                            LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                            LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, false));
                                            LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                                        } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                            LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2, true));
                                        }
                                        CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping2);
                                        TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                                        if (layoutResult2 != null) {
                                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                            TextFieldValue textFieldValue2 = textFieldValue;
                                            OffsetMapping offsetMapping22 = offsetMapping2;
                                            TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                            if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                                return;
                                            }
                                            TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping22, layoutResult2);
                                        }
                                    }
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue15);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Modifier onGloballyPositioned3222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion62222, (Function1) rememberedValue15);
                            final boolean z222222 = visualTransformation52 instanceof PasswordVisualTransformation;
                            Modifier.Companion companion72222 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                            changedInstance6 = startRestartGroup.changedInstance(transformedText2) | (i372 != 4) | (i352 != 2048) | startRestartGroup.changed(z222222) | (i382222 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping2) | startRestartGroup.changedInstance(textFieldSelectionManager2) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                            rememberedValue16 = startRestartGroup.rememberedValue();
                            if (!changedInstance6) {
                            }
                            final boolean z232222 = z4;
                            final boolean z242222 = z6;
                            final ImeOptions imeOptions82222 = imeOptions4;
                            rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                                public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                                    SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                    if (!z232222) {
                                        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                    }
                                    if (z222222) {
                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                    }
                                    boolean z252222 = z232222 && !z242222;
                                    SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z252222);
                                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                    SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(List<TextLayoutResult> list) {
                                            boolean z262222;
                                            if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                                Intrinsics.checkNotNull(layoutResult);
                                                list.add(layoutResult.getValue());
                                                z262222 = true;
                                            } else {
                                                z262222 = false;
                                            }
                                            return Boolean.valueOf(z262222);
                                        }
                                    }, 1, null);
                                    if (z252222) {
                                        final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Boolean invoke(AnnotatedString annotatedString) {
                                                Unit unit2222;
                                                TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                                if (inputSession != null) {
                                                    LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                                    unit2222 = Unit.INSTANCE;
                                                } else {
                                                    unit2222 = null;
                                                }
                                                if (unit2222 == null) {
                                                    LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                }
                                                return true;
                                            }
                                        }, 1, null);
                                        final boolean z262222 = z242222;
                                        final boolean z272222 = z232222;
                                        final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Boolean invoke(AnnotatedString annotatedString) {
                                                Unit unit2222;
                                                if (z262222 || !z272222) {
                                                    return false;
                                                }
                                                TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                                if (inputSession != null) {
                                                    LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                                    unit2222 = Unit.INSTANCE;
                                                } else {
                                                    unit2222 = null;
                                                }
                                                if (unit2222 == null) {
                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                    legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                }
                                                return true;
                                            }
                                        }, 1, null);
                                    }
                                    final OffsetMapping offsetMapping22 = offsetMapping2;
                                    final boolean z28 = z232222;
                                    final TextFieldValue textFieldValue3 = textFieldValue;
                                    final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                                    final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                                    SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                        }

                                        public final Boolean invoke(int i392222, int i40, boolean z29) {
                                            if (!z29) {
                                                i392222 = OffsetMapping.this.transformedToOriginal(i392222);
                                            }
                                            if (!z29) {
                                                i40 = OffsetMapping.this.transformedToOriginal(i40);
                                            }
                                            boolean z30 = false;
                                            if (z28 && (i392222 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                                if (Math.min(i392222, i40) >= 0 && Math.max(i392222, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                                    if (z29 || i392222 == i40) {
                                                        textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                                    } else {
                                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager22, false, 1, null);
                                                    }
                                                    legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i392222, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                    z30 = true;
                                                } else {
                                                    textFieldSelectionManager22.exitSelectionMode$foundation_release();
                                                }
                                            }
                                            return Boolean.valueOf(z30);
                                        }
                                    }, 1, null);
                                    int imeAction = imeOptions82222.getImeAction();
                                    final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                                    final ImeOptions imeOptions92222 = imeOptions82222;
                                    SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions92222.getImeAction()));
                                            return true;
                                        }
                                    }, 2, null);
                                    final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                                    final FocusRequester focusRequester22 = focusRequester2;
                                    final boolean z29 = z242222;
                                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester22, !z29);
                                            return true;
                                        }
                                    }, 1, null);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                                    SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                            return true;
                                        }
                                    }, 1, null);
                                    if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z222222) {
                                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2;
                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                                return true;
                                            }
                                        }, 1, null);
                                        if (z232222 && !z242222) {
                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2;
                                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextFieldSelectionManager.this.cut$foundation_release();
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                    if (!z232222 || z242222) {
                                        return;
                                    }
                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2;
                                    SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.this.paste$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue16);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier semantics2222 = SemanticsModifierKt.semantics(companion72222, true, (Function1) rememberedValue16);
                            final Modifier cursor2222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping2, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                            changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager2);
                            rememberedValue17 = startRestartGroup.rememberedValue();
                            if (!changedInstance7) {
                            }
                            rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    final TextFieldSelectionManager textFieldSelectionManager22 = TextFieldSelectionManager.this;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                        }
                                    };
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue17);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.DisposableEffect(textFieldSelectionManager2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                            changedInstance8 = (i372 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService2) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                            rememberedValue18 = startRestartGroup.rememberedValue();
                            if (!changedInstance8) {
                            }
                            rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    if (LegacyTextFieldState.this.getHasFocus()) {
                                        LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService2, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                                    }
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                        }
                                    };
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue18);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                            Modifier m1076textFieldKeyInput2WJ9YEU2222 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager2, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i342 != 1, offsetMapping2, undoManager2, imeOptions4.getImeAction());
                            Modifier.Companion companion82222 = Modifier.INSTANCE;
                            boolean CoreTextField$lambda$112222 = CoreTextField$lambda$11(rememberUpdatedState222);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                            changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter2);
                            rememberedValue19 = startRestartGroup.rememberedValue();
                            if (!changedInstance9) {
                            }
                            rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    if (!LegacyTextFieldState.this.getHasFocus()) {
                                        focusRequester2.requestFocus();
                                    }
                                    if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                                        legacyPlatformTextInputServiceAdapter2.startStylusHandwriting();
                                    }
                                    return true;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue19);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier onGloballyPositioned22222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier52, legacyPlatformTextInputServiceAdapter2, legacyTextFieldState, textFieldSelectionManager2).then(StylusHandwritingKt.stylusHandwriting(companion82222, CoreTextField$lambda$112222, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager2), legacyTextFieldState, textFieldSelectionManager2).then(m1076textFieldKeyInput2WJ9YEU2222), textFieldScrollerPosition2, mutableInteractionSource52, z4).then(pointerHoverIcon$default2222).then(semantics2222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                    if (layoutResult == null) {
                                        return;
                                    }
                                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                }
                            });
                            if (z4) {
                            }
                            if (!z11) {
                            }
                            final Modifier modifier62222 = companion;
                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function342222 = function32;
                            final TextStyle textStyle52222 = textStyle2;
                            final int i392222 = i21;
                            boolean z252222 = z4;
                            ImeOptions imeOptions92222 = imeOptions4;
                            final boolean z262222 = z11;
                            final boolean z272222 = z6;
                            final Function1<? super TextLayoutResult, Unit> function152222 = function13;
                            composer2 = startRestartGroup;
                            CoreTextFieldRootBox(onGloballyPositioned22222, textFieldSelectionManager2, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                                public final void invoke(Composer composer3, int i40) {
                                    ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                    if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                        }
                                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function342222;
                                        final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                        final TextStyle textStyle6 = textStyle52222;
                                        final int i41 = i392222;
                                        final int i42 = i342;
                                        final TextFieldScrollerPosition textFieldScrollerPosition22 = textFieldScrollerPosition2;
                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                        final VisualTransformation visualTransformation6 = visualTransformation52;
                                        final Modifier modifier7 = cursor2222;
                                        final Modifier modifier8 = drawBehind2222;
                                        final Modifier modifier9 = onGloballyPositioned3222;
                                        final Modifier modifier10 = modifier62222;
                                        final BringIntoViewRequester bringIntoViewRequester22 = bringIntoViewRequester2;
                                        final TextFieldSelectionManager textFieldSelectionManager22 = textFieldSelectionManager2;
                                        final boolean z28 = z262222;
                                        final boolean z29 = z272222;
                                        final Function1<? super TextLayoutResult, Unit> function16 = function152222;
                                        final OffsetMapping offsetMapping22 = offsetMapping2;
                                        final Density density22 = density2;
                                        function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                            public final void invoke(Composer composer4, int i43) {
                                                ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                                if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                    }
                                                    Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22;
                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                    boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                                    final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                                    Object rememberedValue21 = composer4.rememberedValue();
                                                    if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                            {
                                                                super(0);
                                                            }

                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final TextLayoutResultProxy invoke() {
                                                                return LegacyTextFieldState.this.getLayoutResult();
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(rememberedValue21);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester22);
                                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                                                    final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                    final boolean z30 = z28;
                                                    final boolean z31 = z29;
                                                    final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                                    final OffsetMapping offsetMapping3 = offsetMapping22;
                                                    final Density density3 = density22;
                                                    final int i44 = i42;
                                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                                        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                        */
                                                        public final void invoke(Composer composer5, int i45) {
                                                            boolean z32;
                                                            ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                            if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                                }
                                                                final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                final Density density4 = density3;
                                                                final int i46 = i44;
                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    /* renamed from: measure-3p2s80s */
                                                                    public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                        Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                                        LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                                        Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                        Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                                        try {
                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                            Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                            int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                            int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                            TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                            if (!Intrinsics.areEqual(value, component3)) {
                                                                                LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                function18.invoke(component3);
                                                                                CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                            }
                                                                            LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                            return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                    invoke2(placementScope);
                                                                                    return Unit.INSTANCE;
                                                                                }
                                                                            });
                                                                        } finally {
                                                                            companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                                        }
                                                                    }

                                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                                        LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                        return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                    }
                                                                };
                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                                Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                composer5.endNode();
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                                if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                                    LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                    if (layoutCoordinates.isAttached() && z30) {
                                                                        z32 = true;
                                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                        if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                            composer5.startReplaceGroup(-2032274);
                                                                            ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                            CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                            composer5.endReplaceGroup();
                                                                        } else {
                                                                            composer5.startReplaceGroup(-1955394);
                                                                            composer5.endReplaceGroup();
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            return;
                                                                        }
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                }
                                                                z32 = false;
                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                                }
                                                                composer5.startReplaceGroup(-1955394);
                                                                composer5.endReplaceGroup();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                            } else {
                                                                composer5.skipToGroupEnd();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, 48, 0);
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
                            }, composer2, 54), composer2, 384);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            visualTransformation4 = visualTransformation52;
                            z12 = z252222;
                            textStyle3 = textStyle2;
                            function14 = function13;
                            imeOptions5 = imeOptions92222;
                            brush3 = brush2;
                            i28 = i342;
                            modifier4 = modifier52;
                            z13 = z5;
                            i29 = i21;
                            keyboardActions3 = keyboardActions2;
                            z14 = z6;
                            function33 = function32;
                            mutableInteractionSource3 = mutableInteractionSource52;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i19 = i5 & 16384;
                        if (i19 == 0) {
                        }
                        i20 = i5 & 32768;
                        if (i20 != 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i31 != 0) {
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
                        if (i14 != 0) {
                        }
                        if ((i5 & 2048) != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        i22 = i32;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final FocusRequester focusRequester22 = (FocusRequester) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter22 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        final TextInputService textInputService22 = (TextInputService) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume102 = startRestartGroup.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density22 = (Density) consume102;
                        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22 = CompositionLocalsKt.getLocalFontFamilyResolver();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume222 = startRestartGroup.consume(localFontFamilyResolver22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        FontFamily.Resolver resolver22 = (FontFamily.Resolver) consume222;
                        Modifier modifier522 = modifier2;
                        ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors22 = TextSelectionColorsKt.getLocalTextSelectionColors();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume322 = startRestartGroup.consume(localTextSelectionColors22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        long backgroundColor22 = ((TextSelectionColors) consume322).getBackgroundColor();
                        ProvidableCompositionLocal<FocusManager> localFocusManager22 = CompositionLocalsKt.getLocalFocusManager();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume422 = startRestartGroup.consume(localFocusManager22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        FocusManager focusManager22 = (FocusManager) consume422;
                        MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource2;
                        ProvidableCompositionLocal<WindowInfo> localWindowInfo22 = CompositionLocalsKt.getLocalWindowInfo();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume522 = startRestartGroup.consume(localWindowInfo22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        windowInfo = (WindowInfo) consume522;
                        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController22 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume622 = startRestartGroup.consume(localSoftwareKeyboardController22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        SoftwareKeyboardController softwareKeyboardController22 = (SoftwareKeyboardController) consume622;
                        if (i22 == 1) {
                        }
                        Object[] objArr22 = {orientation};
                        Saver<TextFieldScrollerPosition, Object> saver22 = TextFieldScrollerPosition.INSTANCE.getSaver();
                        final int i3422 = i22;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                        changed = startRestartGroup.changed(orientation);
                        ImeOptions imeOptions622 = imeOptions3;
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue4 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final TextFieldScrollerPosition invoke() {
                                return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final TextFieldScrollerPosition textFieldScrollerPosition22 = (TextFieldScrollerPosition) RememberSaveableKt.m3426rememberSaveable(objArr22, (Saver) saver22, (String) null, (Function0) rememberedValue4, startRestartGroup, 0, 4);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                        i23 = i6 & 14;
                        if (i23 == 4) {
                        }
                        z7 = ((i6 & 57344) == 16384) | (i23 == 4);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (z7) {
                        }
                        TransformedText filterWithValidation22 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation3, textFieldValue.getAnnotatedString());
                        composition = textFieldValue.getComposition();
                        i24 = i23;
                        if (composition != null) {
                        }
                        rememberedValue5 = filterWithValidation22;
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        final TransformedText transformedText22 = (TransformedText) rememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        AnnotatedString text22 = transformedText22.getText();
                        final OffsetMapping offsetMapping22 = transformedText22.getOffsetMapping();
                        RecomposeScope currentRecomposeScope22 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
                        changed2 = startRestartGroup.changed(softwareKeyboardController22);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue6 = new LegacyTextFieldState(new TextDelegate(text22, textStyle2, 0, 0, z5, 0, density22, resolver22, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope22, softwareKeyboardController22);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        legacyTextFieldState = (LegacyTextFieldState) rememberedValue6;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        legacyTextFieldState.m1022updatefnh65Uc(textFieldValue.getAnnotatedString(), text22, textStyle2, z5, density22, resolver22, function1, keyboardActions2, focusManager22, backgroundColor22);
                        legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        }
                        UndoManager undoManager22 = (UndoManager) rememberedValue7;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        UndoManager.snapshotIfNeeded$default(undoManager22, textFieldValue, 0L, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        }
                        final TextFieldSelectionManager textFieldSelectionManager22 = (TextFieldSelectionManager) rememberedValue8;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        textFieldSelectionManager22.setOffsetMapping$foundation_release(offsetMapping22);
                        textFieldSelectionManager22.setVisualTransformation$foundation_release(visualTransformation3);
                        textFieldSelectionManager22.setOnValueChange$foundation_release(legacyTextFieldState.getOnValueChange());
                        textFieldSelectionManager22.setState$foundation_release(legacyTextFieldState);
                        textFieldSelectionManager22.setValue$foundation_release(textFieldValue);
                        ProvidableCompositionLocal<ClipboardManager> localClipboardManager22 = CompositionLocalsKt.getLocalClipboardManager();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume722 = startRestartGroup.consume(localClipboardManager22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        textFieldSelectionManager22.setClipboardManager$foundation_release((ClipboardManager) consume722);
                        ProvidableCompositionLocal<TextToolbar> localTextToolbar22 = CompositionLocalsKt.getLocalTextToolbar();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume822 = startRestartGroup.consume(localTextToolbar22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        textFieldSelectionManager22.setTextToolbar((TextToolbar) consume822);
                        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22 = CompositionLocalsKt.getLocalHapticFeedback();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume922 = startRestartGroup.consume(localHapticFeedback22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        textFieldSelectionManager22.setHapticFeedBack((HapticFeedback) consume922);
                        textFieldSelectionManager22.setFocusRequester(focusRequester22);
                        textFieldSelectionManager22.setEditable(!z6);
                        textFieldSelectionManager22.setEnabled(z4);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                        rememberedValue10 = startRestartGroup.rememberedValue();
                        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        }
                        final BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) rememberedValue10;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier.Companion companion322 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                        int i3522 = i16 & 7168;
                        int i3622 = 57344 & i16;
                        final VisualTransformation visualTransformation522 = visualTransformation3;
                        int i3722 = i24;
                        boolean changedInstance1022 = (i3522 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i3622 == 16384) | startRestartGroup.changedInstance(textInputService22) | (i3722 == 4);
                        i25 = (i16 & 112) ^ 48;
                        if (i25 > 32) {
                        }
                        i26 = i3622;
                        i27 = i16;
                        if ((i16 & 48) != 32) {
                        }
                        z8 = true;
                        changedInstance = changedInstance1022 | z8 | startRestartGroup.changedInstance(offsetMapping22) | startRestartGroup.changedInstance(coroutineScope22) | startRestartGroup.changedInstance(bringIntoViewRequester22) | startRestartGroup.changedInstance(textFieldSelectionManager22);
                        rememberedValue11 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        final boolean z172222 = z4;
                        final boolean z182222 = z6;
                        final ImeOptions imeOptions72222 = imeOptions4;
                        rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                invoke2(focusState);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(FocusState focusState) {
                                TextLayoutResultProxy layoutResult;
                                if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                    return;
                                }
                                LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                                if (!LegacyTextFieldState.this.getHasFocus() || !z172222 || z182222) {
                                    CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                                } else {
                                    CoreTextFieldKt.startInputSession(textInputService22, LegacyTextFieldState.this, textFieldValue, imeOptions72222, offsetMapping22);
                                }
                                if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester22, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping22, null), 3, null);
                                }
                                if (focusState.isFocused()) {
                                    return;
                                }
                                TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager22, null, 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion322, z4, focusRequester22, mutableInteractionSource522, (Function1) rememberedValue11);
                        State rememberUpdatedState2222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
                        Unit unit2222 = Unit.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                        boolean changed32222 = startRestartGroup.changed(rememberUpdatedState2222) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService22) | startRestartGroup.changedInstance(textFieldSelectionManager22);
                        if (i25 > 32) {
                        }
                        modifier3 = textFieldFocusModifier;
                        if ((i27 & 48) != 32) {
                        }
                        z9 = true;
                        z10 = z9 | changed32222;
                        rememberedValue12 = startRestartGroup.rememberedValue();
                        if (!z10) {
                        }
                        rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState2222, textInputService22, textFieldSelectionManager22, imeOptions4, null);
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(unit2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                        Modifier.Companion companion422222 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                        changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                        rememberedValue13 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z1922222) {
                                LegacyTextFieldState.this.setInTouchMode(z1922222);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier updateSelectionTouchMode22222 = SelectionGesturesKt.updateSelectionTouchMode(companion422222, (Function1) rememberedValue13);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                        int i3822222 = i26;
                        changedInstance3 = (i3522 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i3822222 != 16384) | startRestartGroup.changedInstance(offsetMapping22) | startRestartGroup.changedInstance(textFieldSelectionManager22);
                        rememberedValue14 = startRestartGroup.rememberedValue();
                        if (!changedInstance3) {
                        }
                        final boolean z1922222 = z6;
                        final boolean z2022222 = z4;
                        rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m992invokek4lQ0M(offset.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m992invokek4lQ0M(long j) {
                                CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester22, !z1922222);
                                if (LegacyTextFieldState.this.getHasFocus() && z2022222) {
                                    if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                        if (layoutResult != null) {
                                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                            TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping22, legacyTextFieldState2.getOnValueChange());
                                            if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                                legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    textFieldSelectionManager22.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier pointerHoverIcon$default22222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode22222, mutableInteractionSource522, z4, (Function1) rememberedValue14), textFieldSelectionManager22.getMouseSelectionObserver(), textFieldSelectionManager22.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                        Modifier.Companion companion522222 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                        changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i3722 != 4) | startRestartGroup.changedInstance(offsetMapping22);
                        Object rememberedValue2022222 = startRestartGroup.rememberedValue();
                        if (changedInstance4) {
                        }
                        obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                if (layoutResult != null) {
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                    OffsetMapping offsetMapping222 = offsetMapping22;
                                    TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping222, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(obj);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Modifier drawBehind22222 = DrawModifierKt.drawBehind(companion522222, (Function1) obj);
                        Modifier.Companion companion622222 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                        changedInstance5 = (i3522 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager22) | (i3722 != 4) | startRestartGroup.changedInstance(offsetMapping22);
                        rememberedValue15 = startRestartGroup.rememberedValue();
                        if (!changedInstance5) {
                        }
                        final boolean z2122222 = z4;
                        rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                if (layoutResult != null) {
                                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                }
                                if (z2122222) {
                                    if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                        if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                            textFieldSelectionManager22.showSelectionToolbar$foundation_release();
                                        } else {
                                            textFieldSelectionManager22.hideSelectionToolbar$foundation_release();
                                        }
                                        LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                                        LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, false));
                                        LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                                    } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                        LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22, true));
                                    }
                                    CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping22);
                                    TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                                    if (layoutResult2 != null) {
                                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        OffsetMapping offsetMapping222 = offsetMapping22;
                                        TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                        if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                            return;
                                        }
                                        TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping222, layoutResult2);
                                    }
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue15);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Modifier onGloballyPositioned32222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion622222, (Function1) rememberedValue15);
                        final boolean z2222222 = visualTransformation522 instanceof PasswordVisualTransformation;
                        Modifier.Companion companion722222 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                        changedInstance6 = startRestartGroup.changedInstance(transformedText22) | (i3722 != 4) | (i3522 != 2048) | startRestartGroup.changed(z2222222) | (i3822222 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping22) | startRestartGroup.changedInstance(textFieldSelectionManager22) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                        rememberedValue16 = startRestartGroup.rememberedValue();
                        if (!changedInstance6) {
                        }
                        final boolean z2322222 = z4;
                        final boolean z2422222 = z6;
                        final ImeOptions imeOptions822222 = imeOptions4;
                        rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                            public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                                SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                if (!z2322222) {
                                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                }
                                if (z2222222) {
                                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                }
                                boolean z2522222 = z2322222 && !z2422222;
                                SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z2522222);
                                final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Boolean invoke(List<TextLayoutResult> list) {
                                        boolean z2622222;
                                        if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                            Intrinsics.checkNotNull(layoutResult);
                                            list.add(layoutResult.getValue());
                                            z2622222 = true;
                                        } else {
                                            z2622222 = false;
                                        }
                                        return Boolean.valueOf(z2622222);
                                    }
                                }, 1, null);
                                if (z2522222) {
                                    final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                    SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                            Unit unit22222;
                                            TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                            if (inputSession != null) {
                                                LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                                unit22222 = Unit.INSTANCE;
                                            } else {
                                                unit22222 = null;
                                            }
                                            if (unit22222 == null) {
                                                LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            }
                                            return true;
                                        }
                                    }, 1, null);
                                    final boolean z2622222 = z2422222;
                                    final boolean z2722222 = z2322222;
                                    final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                    SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(AnnotatedString annotatedString) {
                                            Unit unit22222;
                                            if (z2622222 || !z2722222) {
                                                return false;
                                            }
                                            TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                            if (inputSession != null) {
                                                LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                                unit22222 = Unit.INSTANCE;
                                            } else {
                                                unit22222 = null;
                                            }
                                            if (unit22222 == null) {
                                                TextFieldValue textFieldValue3 = textFieldValue2;
                                                legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            }
                                            return true;
                                        }
                                    }, 1, null);
                                }
                                final OffsetMapping offsetMapping222 = offsetMapping22;
                                final boolean z28 = z2322222;
                                final TextFieldValue textFieldValue3 = textFieldValue;
                                final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                                final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                                SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                    }

                                    public final Boolean invoke(int i3922222, int i40, boolean z29) {
                                        if (!z29) {
                                            i3922222 = OffsetMapping.this.transformedToOriginal(i3922222);
                                        }
                                        if (!z29) {
                                            i40 = OffsetMapping.this.transformedToOriginal(i40);
                                        }
                                        boolean z30 = false;
                                        if (z28 && (i3922222 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                            if (Math.min(i3922222, i40) >= 0 && Math.max(i3922222, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                                if (z29 || i3922222 == i40) {
                                                    textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                                } else {
                                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager222, false, 1, null);
                                                }
                                                legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i3922222, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                z30 = true;
                                            } else {
                                                textFieldSelectionManager222.exitSelectionMode$foundation_release();
                                            }
                                        }
                                        return Boolean.valueOf(z30);
                                    }
                                }, 1, null);
                                int imeAction = imeOptions822222.getImeAction();
                                final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                                final ImeOptions imeOptions922222 = imeOptions822222;
                                SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions922222.getImeAction()));
                                        return true;
                                    }
                                }, 2, null);
                                final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                                final FocusRequester focusRequester222 = focusRequester22;
                                final boolean z29 = z2422222;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester222, !z29);
                                        return true;
                                    }
                                }, 1, null);
                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22;
                                SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                        return true;
                                    }
                                }, 1, null);
                                if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z2222222) {
                                    final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager22;
                                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                            return true;
                                        }
                                    }, 1, null);
                                    if (z2322222 && !z2422222) {
                                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager22;
                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                TextFieldSelectionManager.this.cut$foundation_release();
                                                return true;
                                            }
                                        }, 1, null);
                                    }
                                }
                                if (!z2322222 || z2422222) {
                                    return;
                                }
                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager22;
                                SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.this.paste$foundation_release();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue16);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier semantics22222 = SemanticsModifierKt.semantics(companion722222, true, (Function1) rememberedValue16);
                        final Modifier cursor22222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping22, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                        changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager22);
                        rememberedValue17 = startRestartGroup.rememberedValue();
                        if (!changedInstance7) {
                        }
                        rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final TextFieldSelectionManager textFieldSelectionManager222 = TextFieldSelectionManager.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                    }
                                };
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue17);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.DisposableEffect(textFieldSelectionManager22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                        changedInstance8 = (i3722 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService22) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                        rememberedValue18 = startRestartGroup.rememberedValue();
                        if (!changedInstance8) {
                        }
                        rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                if (LegacyTextFieldState.this.getHasFocus()) {
                                    LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService22, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                                }
                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                    }
                                };
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue18);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                        Modifier m1076textFieldKeyInput2WJ9YEU22222 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager22, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i3422 != 1, offsetMapping22, undoManager22, imeOptions4.getImeAction());
                        Modifier.Companion companion822222 = Modifier.INSTANCE;
                        boolean CoreTextField$lambda$1122222 = CoreTextField$lambda$11(rememberUpdatedState2222);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                        changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter22);
                        rememberedValue19 = startRestartGroup.rememberedValue();
                        if (!changedInstance9) {
                        }
                        rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                if (!LegacyTextFieldState.this.getHasFocus()) {
                                    focusRequester22.requestFocus();
                                }
                                if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                                    legacyPlatformTextInputServiceAdapter22.startStylusHandwriting();
                                }
                                return true;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue19);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier onGloballyPositioned222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier522, legacyPlatformTextInputServiceAdapter22, legacyTextFieldState, textFieldSelectionManager22).then(StylusHandwritingKt.stylusHandwriting(companion822222, CoreTextField$lambda$1122222, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager22), legacyTextFieldState, textFieldSelectionManager22).then(m1076textFieldKeyInput2WJ9YEU22222), textFieldScrollerPosition22, mutableInteractionSource522, z4).then(pointerHoverIcon$default22222).then(semantics22222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                invoke2(layoutCoordinates);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                if (layoutResult == null) {
                                    return;
                                }
                                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                            }
                        });
                        if (z4) {
                        }
                        if (!z11) {
                        }
                        final Modifier modifier622222 = companion;
                        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3422222 = function32;
                        final TextStyle textStyle522222 = textStyle2;
                        final int i3922222 = i21;
                        boolean z2522222 = z4;
                        ImeOptions imeOptions922222 = imeOptions4;
                        final boolean z2622222 = z11;
                        final boolean z2722222 = z6;
                        final Function1<? super TextLayoutResult, Unit> function1522222 = function13;
                        composer2 = startRestartGroup;
                        CoreTextFieldRootBox(onGloballyPositioned222222, textFieldSelectionManager22, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                            public final void invoke(Composer composer3, int i40) {
                                ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                    }
                                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function3422222;
                                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                    final TextStyle textStyle6 = textStyle522222;
                                    final int i41 = i3922222;
                                    final int i42 = i3422;
                                    final TextFieldScrollerPosition textFieldScrollerPosition222 = textFieldScrollerPosition22;
                                    final TextFieldValue textFieldValue2 = textFieldValue;
                                    final VisualTransformation visualTransformation6 = visualTransformation522;
                                    final Modifier modifier7 = cursor22222;
                                    final Modifier modifier8 = drawBehind22222;
                                    final Modifier modifier9 = onGloballyPositioned32222;
                                    final Modifier modifier10 = modifier622222;
                                    final BringIntoViewRequester bringIntoViewRequester222 = bringIntoViewRequester22;
                                    final TextFieldSelectionManager textFieldSelectionManager222 = textFieldSelectionManager22;
                                    final boolean z28 = z2622222;
                                    final boolean z29 = z2722222;
                                    final Function1<? super TextLayoutResult, Unit> function16 = function1522222;
                                    final OffsetMapping offsetMapping222 = offsetMapping22;
                                    final Density density222 = density22;
                                    function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                        public final void invoke(Composer composer4, int i43) {
                                            ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                            if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                }
                                                Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                                TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition222;
                                                TextFieldValue textFieldValue3 = textFieldValue2;
                                                VisualTransformation visualTransformation7 = visualTransformation6;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                                final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                                Object rememberedValue21 = composer4.rememberedValue();
                                                if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final TextLayoutResultProxy invoke() {
                                                            return LegacyTextFieldState.this.getLayoutResult();
                                                        }
                                                    };
                                                    composer4.updateRememberedValue(rememberedValue21);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester222);
                                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                                                final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                                final boolean z30 = z28;
                                                final boolean z31 = z29;
                                                final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                final TextFieldValue textFieldValue4 = textFieldValue2;
                                                final OffsetMapping offsetMapping3 = offsetMapping222;
                                                final Density density3 = density222;
                                                final int i44 = i42;
                                                SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                                    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final void invoke(Composer composer5, int i45) {
                                                        boolean z32;
                                                        ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                        if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                            }
                                                            final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                            final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                            final TextFieldValue textFieldValue5 = textFieldValue4;
                                                            final OffsetMapping offsetMapping4 = offsetMapping3;
                                                            final Density density4 = density3;
                                                            final int i46 = i44;
                                                            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                /* renamed from: measure-3p2s80s */
                                                                public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                    Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                                    LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                                    Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                    Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                                    try {
                                                                        TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                        TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                        Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                        int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                        int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                        TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                        if (!Intrinsics.areEqual(value, component3)) {
                                                                            LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                            function18.invoke(component3);
                                                                            CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                        }
                                                                        LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                        return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                invoke2(placementScope);
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        });
                                                                    } finally {
                                                                        companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                                    }
                                                                }

                                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                                    LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                    return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                                }
                                                            };
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                            Modifier.Companion companion9 = Modifier.INSTANCE;
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            composer5.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                            if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                                LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                                Intrinsics.checkNotNull(layoutCoordinates);
                                                                if (layoutCoordinates.isAttached() && z30) {
                                                                    z32 = true;
                                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                    if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                        composer5.startReplaceGroup(-2032274);
                                                                        ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                        CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                        composer5.endReplaceGroup();
                                                                    } else {
                                                                        composer5.startReplaceGroup(-1955394);
                                                                        composer5.endReplaceGroup();
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        return;
                                                                    }
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                            }
                                                            z32 = false;
                                                            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                            if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                            }
                                                            composer5.startReplaceGroup(-1955394);
                                                            composer5.endReplaceGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                        } else {
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, 48, 0);
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
                        }, composer2, 54), composer2, 384);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        visualTransformation4 = visualTransformation522;
                        z12 = z2522222;
                        textStyle3 = textStyle2;
                        function14 = function13;
                        imeOptions5 = imeOptions922222;
                        brush3 = brush2;
                        i28 = i3422;
                        modifier4 = modifier522;
                        z13 = z5;
                        i29 = i21;
                        keyboardActions3 = keyboardActions2;
                        z14 = z6;
                        function33 = function32;
                        mutableInteractionSource3 = mutableInteractionSource522;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i18 = i5 & 8192;
                    if (i18 != 0) {
                    }
                    i19 = i5 & 16384;
                    if (i19 == 0) {
                    }
                    i20 = i5 & 32768;
                    if (i20 != 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i31 != 0) {
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
                    if (i14 != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    i22 = i32;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final FocusRequester focusRequester222 = (FocusRequester) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter222 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    final TextInputService textInputService222 = (TextInputService) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume1022 = startRestartGroup.consume(localDensity222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density222 = (Density) consume1022;
                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2222 = startRestartGroup.consume(localFontFamilyResolver222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FontFamily.Resolver resolver222 = (FontFamily.Resolver) consume2222;
                    Modifier modifier5222 = modifier2;
                    ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors222 = TextSelectionColorsKt.getLocalTextSelectionColors();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume3222 = startRestartGroup.consume(localTextSelectionColors222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    long backgroundColor222 = ((TextSelectionColors) consume3222).getBackgroundColor();
                    ProvidableCompositionLocal<FocusManager> localFocusManager222 = CompositionLocalsKt.getLocalFocusManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume4222 = startRestartGroup.consume(localFocusManager222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FocusManager focusManager222 = (FocusManager) consume4222;
                    MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource2;
                    ProvidableCompositionLocal<WindowInfo> localWindowInfo222 = CompositionLocalsKt.getLocalWindowInfo();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5222 = startRestartGroup.consume(localWindowInfo222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    windowInfo = (WindowInfo) consume5222;
                    ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController222 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume6222 = startRestartGroup.consume(localSoftwareKeyboardController222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SoftwareKeyboardController softwareKeyboardController222 = (SoftwareKeyboardController) consume6222;
                    if (i22 == 1) {
                    }
                    Object[] objArr222 = {orientation};
                    Saver<TextFieldScrollerPosition, Object> saver222 = TextFieldScrollerPosition.INSTANCE.getSaver();
                    final int i34222 = i22;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                    changed = startRestartGroup.changed(orientation);
                    ImeOptions imeOptions6222 = imeOptions3;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue4 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final TextFieldScrollerPosition invoke() {
                            return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final TextFieldScrollerPosition textFieldScrollerPosition222 = (TextFieldScrollerPosition) RememberSaveableKt.m3426rememberSaveable(objArr222, (Saver) saver222, (String) null, (Function0) rememberedValue4, startRestartGroup, 0, 4);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                    i23 = i6 & 14;
                    if (i23 == 4) {
                    }
                    z7 = ((i6 & 57344) == 16384) | (i23 == 4);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (z7) {
                    }
                    TransformedText filterWithValidation222 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation3, textFieldValue.getAnnotatedString());
                    composition = textFieldValue.getComposition();
                    i24 = i23;
                    if (composition != null) {
                    }
                    rememberedValue5 = filterWithValidation222;
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    final TransformedText transformedText222 = (TransformedText) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    AnnotatedString text222 = transformedText222.getText();
                    final OffsetMapping offsetMapping222 = transformedText222.getOffsetMapping();
                    RecomposeScope currentRecomposeScope222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
                    changed2 = startRestartGroup.changed(softwareKeyboardController222);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue6 = new LegacyTextFieldState(new TextDelegate(text222, textStyle2, 0, 0, z5, 0, density222, resolver222, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope222, softwareKeyboardController222);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    legacyTextFieldState = (LegacyTextFieldState) rememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    legacyTextFieldState.m1022updatefnh65Uc(textFieldValue.getAnnotatedString(), text222, textStyle2, z5, density222, resolver222, function1, keyboardActions2, focusManager222, backgroundColor222);
                    legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    }
                    UndoManager undoManager222 = (UndoManager) rememberedValue7;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    UndoManager.snapshotIfNeeded$default(undoManager222, textFieldValue, 0L, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    }
                    final TextFieldSelectionManager textFieldSelectionManager222 = (TextFieldSelectionManager) rememberedValue8;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager222.setOffsetMapping$foundation_release(offsetMapping222);
                    textFieldSelectionManager222.setVisualTransformation$foundation_release(visualTransformation3);
                    textFieldSelectionManager222.setOnValueChange$foundation_release(legacyTextFieldState.getOnValueChange());
                    textFieldSelectionManager222.setState$foundation_release(legacyTextFieldState);
                    textFieldSelectionManager222.setValue$foundation_release(textFieldValue);
                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager222 = CompositionLocalsKt.getLocalClipboardManager();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume7222 = startRestartGroup.consume(localClipboardManager222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager222.setClipboardManager$foundation_release((ClipboardManager) consume7222);
                    ProvidableCompositionLocal<TextToolbar> localTextToolbar222 = CompositionLocalsKt.getLocalTextToolbar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume8222 = startRestartGroup.consume(localTextToolbar222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager222.setTextToolbar((TextToolbar) consume8222);
                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222 = CompositionLocalsKt.getLocalHapticFeedback();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume9222 = startRestartGroup.consume(localHapticFeedback222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldSelectionManager222.setHapticFeedBack((HapticFeedback) consume9222);
                    textFieldSelectionManager222.setFocusRequester(focusRequester222);
                    textFieldSelectionManager222.setEditable(!z6);
                    textFieldSelectionManager222.setEnabled(z4);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    }
                    final BringIntoViewRequester bringIntoViewRequester222 = (BringIntoViewRequester) rememberedValue10;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier.Companion companion3222 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                    int i35222 = i16 & 7168;
                    int i36222 = 57344 & i16;
                    final VisualTransformation visualTransformation5222 = visualTransformation3;
                    int i37222 = i24;
                    boolean changedInstance10222 = (i35222 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i36222 == 16384) | startRestartGroup.changedInstance(textInputService222) | (i37222 == 4);
                    i25 = (i16 & 112) ^ 48;
                    if (i25 > 32) {
                    }
                    i26 = i36222;
                    i27 = i16;
                    if ((i16 & 48) != 32) {
                    }
                    z8 = true;
                    changedInstance = changedInstance10222 | z8 | startRestartGroup.changedInstance(offsetMapping222) | startRestartGroup.changedInstance(coroutineScope222) | startRestartGroup.changedInstance(bringIntoViewRequester222) | startRestartGroup.changedInstance(textFieldSelectionManager222);
                    rememberedValue11 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    final boolean z1722222 = z4;
                    final boolean z1822222 = z6;
                    final ImeOptions imeOptions722222 = imeOptions4;
                    rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                            invoke2(focusState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(FocusState focusState) {
                            TextLayoutResultProxy layoutResult;
                            if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                                return;
                            }
                            LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                            if (!LegacyTextFieldState.this.getHasFocus() || !z1722222 || z1822222) {
                                CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                            } else {
                                CoreTextFieldKt.startInputSession(textInputService222, LegacyTextFieldState.this, textFieldValue, imeOptions722222, offsetMapping222);
                            }
                            if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester222, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping222, null), 3, null);
                            }
                            if (focusState.isFocused()) {
                                return;
                            }
                            TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager222, null, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion3222, z4, focusRequester222, mutableInteractionSource5222, (Function1) rememberedValue11);
                    State rememberUpdatedState22222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
                    Unit unit22222 = Unit.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                    boolean changed322222 = startRestartGroup.changed(rememberUpdatedState22222) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService222) | startRestartGroup.changedInstance(textFieldSelectionManager222);
                    if (i25 > 32) {
                    }
                    modifier3 = textFieldFocusModifier;
                    if ((i27 & 48) != 32) {
                    }
                    z9 = true;
                    z10 = z9 | changed322222;
                    rememberedValue12 = startRestartGroup.rememberedValue();
                    if (!z10) {
                    }
                    rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState22222, textInputService222, textFieldSelectionManager222, imeOptions4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(unit22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                    Modifier.Companion companion4222222 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                    changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                    rememberedValue13 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z19222222) {
                            LegacyTextFieldState.this.setInTouchMode(z19222222);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier updateSelectionTouchMode222222 = SelectionGesturesKt.updateSelectionTouchMode(companion4222222, (Function1) rememberedValue13);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                    int i38222222 = i26;
                    changedInstance3 = (i35222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i38222222 != 16384) | startRestartGroup.changedInstance(offsetMapping222) | startRestartGroup.changedInstance(textFieldSelectionManager222);
                    rememberedValue14 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    final boolean z19222222 = z6;
                    final boolean z20222222 = z4;
                    rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                            m992invokek4lQ0M(offset.getPackedValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m992invokek4lQ0M(long j) {
                            CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester222, !z19222222);
                            if (LegacyTextFieldState.this.getHasFocus() && z20222222) {
                                if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                    if (layoutResult != null) {
                                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                        TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping222, legacyTextFieldState2.getOnValueChange());
                                        if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                            legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                textFieldSelectionManager222.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier pointerHoverIcon$default222222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode222222, mutableInteractionSource5222, z4, (Function1) rememberedValue14), textFieldSelectionManager222.getMouseSelectionObserver(), textFieldSelectionManager222.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                    Modifier.Companion companion5222222 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                    changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i37222 != 4) | startRestartGroup.changedInstance(offsetMapping222);
                    Object rememberedValue20222222 = startRestartGroup.rememberedValue();
                    if (changedInstance4) {
                    }
                    obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                TextFieldValue textFieldValue2 = textFieldValue;
                                LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                OffsetMapping offsetMapping2222 = offsetMapping222;
                                TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping2222, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(obj);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Modifier drawBehind222222 = DrawModifierKt.drawBehind(companion5222222, (Function1) obj);
                    Modifier.Companion companion6222222 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                    changedInstance5 = (i35222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager222) | (i37222 != 4) | startRestartGroup.changedInstance(offsetMapping222);
                    rememberedValue15 = startRestartGroup.rememberedValue();
                    if (!changedInstance5) {
                    }
                    final boolean z21222222 = z4;
                    rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                            }
                            if (z21222222) {
                                if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                    if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                        textFieldSelectionManager222.showSelectionToolbar$foundation_release();
                                    } else {
                                        textFieldSelectionManager222.hideSelectionToolbar$foundation_release();
                                    }
                                    LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                                    LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, false));
                                    LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                                } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                    LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222, true));
                                }
                                CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping222);
                                TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                                if (layoutResult2 != null) {
                                    LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    OffsetMapping offsetMapping2222 = offsetMapping222;
                                    TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                    if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                        return;
                                    }
                                    TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2222, layoutResult2);
                                }
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Modifier onGloballyPositioned322222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion6222222, (Function1) rememberedValue15);
                    final boolean z22222222 = visualTransformation5222 instanceof PasswordVisualTransformation;
                    Modifier.Companion companion7222222 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                    changedInstance6 = startRestartGroup.changedInstance(transformedText222) | (i37222 != 4) | (i35222 != 2048) | startRestartGroup.changed(z22222222) | (i38222222 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping222) | startRestartGroup.changedInstance(textFieldSelectionManager222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                    rememberedValue16 = startRestartGroup.rememberedValue();
                    if (!changedInstance6) {
                    }
                    final boolean z23222222 = z4;
                    final boolean z24222222 = z6;
                    final ImeOptions imeOptions8222222 = imeOptions4;
                    rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                        public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                            SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                            if (!z23222222) {
                                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                            }
                            if (z22222222) {
                                SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                            }
                            boolean z25222222 = z23222222 && !z24222222;
                            SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z25222222);
                            final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                            SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(List<TextLayoutResult> list) {
                                    boolean z26222222;
                                    if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                        Intrinsics.checkNotNull(layoutResult);
                                        list.add(layoutResult.getValue());
                                        z26222222 = true;
                                    } else {
                                        z26222222 = false;
                                    }
                                    return Boolean.valueOf(z26222222);
                                }
                            }, 1, null);
                            if (z25222222) {
                                final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Boolean invoke(AnnotatedString annotatedString) {
                                        Unit unit222222;
                                        TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                        if (inputSession != null) {
                                            LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                            unit222222 = Unit.INSTANCE;
                                        } else {
                                            unit222222 = null;
                                        }
                                        if (unit222222 == null) {
                                            LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                        }
                                        return true;
                                    }
                                }, 1, null);
                                final boolean z26222222 = z24222222;
                                final boolean z27222222 = z23222222;
                                final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                final TextFieldValue textFieldValue2 = textFieldValue;
                                SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Boolean invoke(AnnotatedString annotatedString) {
                                        Unit unit222222;
                                        if (z26222222 || !z27222222) {
                                            return false;
                                        }
                                        TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                        if (inputSession != null) {
                                            LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                            unit222222 = Unit.INSTANCE;
                                        } else {
                                            unit222222 = null;
                                        }
                                        if (unit222222 == null) {
                                            TextFieldValue textFieldValue3 = textFieldValue2;
                                            legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                        }
                                        return true;
                                    }
                                }, 1, null);
                            }
                            final OffsetMapping offsetMapping2222 = offsetMapping222;
                            final boolean z28 = z23222222;
                            final TextFieldValue textFieldValue3 = textFieldValue;
                            final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                            final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                            SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                    return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                }

                                public final Boolean invoke(int i39222222, int i40, boolean z29) {
                                    if (!z29) {
                                        i39222222 = OffsetMapping.this.transformedToOriginal(i39222222);
                                    }
                                    if (!z29) {
                                        i40 = OffsetMapping.this.transformedToOriginal(i40);
                                    }
                                    boolean z30 = false;
                                    if (z28 && (i39222222 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                        if (Math.min(i39222222, i40) >= 0 && Math.max(i39222222, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                            if (z29 || i39222222 == i40) {
                                                textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                            } else {
                                                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2222, false, 1, null);
                                            }
                                            legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i39222222, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            z30 = true;
                                        } else {
                                            textFieldSelectionManager2222.exitSelectionMode$foundation_release();
                                        }
                                    }
                                    return Boolean.valueOf(z30);
                                }
                            }, 1, null);
                            int imeAction = imeOptions8222222.getImeAction();
                            final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                            final ImeOptions imeOptions9222222 = imeOptions8222222;
                            SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions9222222.getImeAction()));
                                    return true;
                                }
                            }, 2, null);
                            final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                            final FocusRequester focusRequester2222 = focusRequester222;
                            final boolean z29 = z24222222;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2222, !z29);
                                    return true;
                                }
                            }, 1, null);
                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222;
                            SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                    return true;
                                }
                            }, 1, null);
                            if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z22222222) {
                                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager222;
                                SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                        return true;
                                    }
                                }, 1, null);
                                if (z23222222 && !z24222222) {
                                    final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager222;
                                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            TextFieldSelectionManager.this.cut$foundation_release();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            }
                            if (!z23222222 || z24222222) {
                                return;
                            }
                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager222;
                            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.this.paste$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue16);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier semantics222222 = SemanticsModifierKt.semantics(companion7222222, true, (Function1) rememberedValue16);
                    final Modifier cursor222222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping222, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                    changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager222);
                    rememberedValue17 = startRestartGroup.rememberedValue();
                    if (!changedInstance7) {
                    }
                    rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            final TextFieldSelectionManager textFieldSelectionManager2222 = TextFieldSelectionManager.this;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                                }
                            };
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue17);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.DisposableEffect(textFieldSelectionManager222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                    changedInstance8 = (i37222 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                    rememberedValue18 = startRestartGroup.rememberedValue();
                    if (!changedInstance8) {
                    }
                    rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            if (LegacyTextFieldState.this.getHasFocus()) {
                                LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService222, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                            }
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                }
                            };
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue18);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                    Modifier m1076textFieldKeyInput2WJ9YEU222222 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager222, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i34222 != 1, offsetMapping222, undoManager222, imeOptions4.getImeAction());
                    Modifier.Companion companion8222222 = Modifier.INSTANCE;
                    boolean CoreTextField$lambda$11222222 = CoreTextField$lambda$11(rememberUpdatedState22222);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                    changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter222);
                    rememberedValue19 = startRestartGroup.rememberedValue();
                    if (!changedInstance9) {
                    }
                    rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            if (!LegacyTextFieldState.this.getHasFocus()) {
                                focusRequester222.requestFocus();
                            }
                            if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                                legacyPlatformTextInputServiceAdapter222.startStylusHandwriting();
                            }
                            return true;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue19);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier onGloballyPositioned2222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5222, legacyPlatformTextInputServiceAdapter222, legacyTextFieldState, textFieldSelectionManager222).then(StylusHandwritingKt.stylusHandwriting(companion8222222, CoreTextField$lambda$11222222, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager222), legacyTextFieldState, textFieldSelectionManager222).then(m1076textFieldKeyInput2WJ9YEU222222), textFieldScrollerPosition222, mutableInteractionSource5222, z4).then(pointerHoverIcon$default222222).then(semantics222222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                            if (layoutResult == null) {
                                return;
                            }
                            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                        }
                    });
                    if (z4) {
                    }
                    if (!z11) {
                    }
                    final Modifier modifier6222222 = companion;
                    final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34222222 = function32;
                    final TextStyle textStyle5222222 = textStyle2;
                    final int i39222222 = i21;
                    boolean z25222222 = z4;
                    ImeOptions imeOptions9222222 = imeOptions4;
                    final boolean z26222222 = z11;
                    final boolean z27222222 = z6;
                    final Function1<? super TextLayoutResult, Unit> function15222222 = function13;
                    composer2 = startRestartGroup;
                    CoreTextFieldRootBox(onGloballyPositioned2222222, textFieldSelectionManager222, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                        public final void invoke(Composer composer3, int i40) {
                            ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                            if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                }
                                Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34222222;
                                final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                                final TextStyle textStyle6 = textStyle5222222;
                                final int i41 = i39222222;
                                final int i42 = i34222;
                                final TextFieldScrollerPosition textFieldScrollerPosition2222 = textFieldScrollerPosition222;
                                final TextFieldValue textFieldValue2 = textFieldValue;
                                final VisualTransformation visualTransformation6 = visualTransformation5222;
                                final Modifier modifier7 = cursor222222;
                                final Modifier modifier8 = drawBehind222222;
                                final Modifier modifier9 = onGloballyPositioned322222;
                                final Modifier modifier10 = modifier6222222;
                                final BringIntoViewRequester bringIntoViewRequester2222 = bringIntoViewRequester222;
                                final TextFieldSelectionManager textFieldSelectionManager2222 = textFieldSelectionManager222;
                                final boolean z28 = z26222222;
                                final boolean z29 = z27222222;
                                final Function1<? super TextLayoutResult, Unit> function16 = function15222222;
                                final OffsetMapping offsetMapping2222 = offsetMapping222;
                                final Density density2222 = density222;
                                function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                    public final void invoke(Composer composer4, int i43) {
                                        ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                        if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                            }
                                            Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                            TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2222;
                                            TextFieldValue textFieldValue3 = textFieldValue2;
                                            VisualTransformation visualTransformation7 = visualTransformation6;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                            boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                            final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                            Object rememberedValue21 = composer4.rememberedValue();
                                            if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final TextLayoutResultProxy invoke() {
                                                        return LegacyTextFieldState.this.getLayoutResult();
                                                    }
                                                };
                                                composer4.updateRememberedValue(rememberedValue21);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2222);
                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                                            final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                            final boolean z30 = z28;
                                            final boolean z31 = z29;
                                            final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                            final TextFieldValue textFieldValue4 = textFieldValue2;
                                            final OffsetMapping offsetMapping3 = offsetMapping2222;
                                            final Density density3 = density2222;
                                            final int i44 = i42;
                                            SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                                /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void invoke(Composer composer5, int i45) {
                                                    boolean z32;
                                                    ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                    if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                        }
                                                        final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                        final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                        final TextFieldValue textFieldValue5 = textFieldValue4;
                                                        final OffsetMapping offsetMapping4 = offsetMapping3;
                                                        final Density density4 = density3;
                                                        final int i46 = i44;
                                                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            /* renamed from: measure-3p2s80s */
                                                            public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                                LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                                Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                                try {
                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                    TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                    Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                    int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                    int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                    TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                    if (!Intrinsics.areEqual(value, component3)) {
                                                                        LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                        function18.invoke(component3);
                                                                        CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                    }
                                                                    LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                    return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                            invoke2(placementScope);
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    });
                                                                } finally {
                                                                    companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                                }
                                                            }

                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                                LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                            }
                                                        };
                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                        Modifier.Companion companion9 = Modifier.INSTANCE;
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer5.startReusableNode();
                                                        if (composer5.getInserting()) {
                                                            composer5.createNode(constructor);
                                                        } else {
                                                            composer5.useNode();
                                                        }
                                                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                        Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        composer5.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                        if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                            LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                            Intrinsics.checkNotNull(layoutCoordinates);
                                                            if (layoutCoordinates.isAttached() && z30) {
                                                                z32 = true;
                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                                if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                    composer5.startReplaceGroup(-2032274);
                                                                    ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                    composer5.endReplaceGroup();
                                                                } else {
                                                                    composer5.startReplaceGroup(-1955394);
                                                                    composer5.endReplaceGroup();
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    return;
                                                                }
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                        }
                                                        z32 = false;
                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                        if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                        }
                                                        composer5.startReplaceGroup(-1955394);
                                                        composer5.endReplaceGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                    } else {
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }
                                            }, composer4, 54), composer4, 48, 0);
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
                    }, composer2, 54), composer2, 384);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    visualTransformation4 = visualTransformation5222;
                    z12 = z25222222;
                    textStyle3 = textStyle2;
                    function14 = function13;
                    imeOptions5 = imeOptions9222222;
                    brush3 = brush2;
                    i28 = i34222;
                    modifier4 = modifier5222;
                    z13 = z5;
                    i29 = i21;
                    keyboardActions3 = keyboardActions2;
                    z14 = z6;
                    function33 = function32;
                    mutableInteractionSource3 = mutableInteractionSource5222;
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
                i13 = i5 & 512;
                if (i13 == 0) {
                }
                i14 = i5 & 1024;
                if (i14 == 0) {
                }
                if ((i4 & 48) == 0) {
                }
                i16 = i15;
                i17 = i5 & 4096;
                if (i17 == 0) {
                }
                i18 = i5 & 8192;
                if (i18 != 0) {
                }
                i19 = i5 & 16384;
                if (i19 == 0) {
                }
                i20 = i5 & 32768;
                if (i20 != 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i31 != 0) {
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
                if (i14 != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                i22 = i32;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final FocusRequester focusRequester2222 = (FocusRequester) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter2222 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                final TextInputService textInputService2222 = (TextInputService) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume10222 = startRestartGroup.consume(localDensity2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density2222 = (Density) consume10222;
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2222 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume22222 = startRestartGroup.consume(localFontFamilyResolver2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FontFamily.Resolver resolver2222 = (FontFamily.Resolver) consume22222;
                Modifier modifier52222 = modifier2;
                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2222 = TextSelectionColorsKt.getLocalTextSelectionColors();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume32222 = startRestartGroup.consume(localTextSelectionColors2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                long backgroundColor2222 = ((TextSelectionColors) consume32222).getBackgroundColor();
                ProvidableCompositionLocal<FocusManager> localFocusManager2222 = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume42222 = startRestartGroup.consume(localFocusManager2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                FocusManager focusManager2222 = (FocusManager) consume42222;
                MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource2;
                ProvidableCompositionLocal<WindowInfo> localWindowInfo2222 = CompositionLocalsKt.getLocalWindowInfo();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52222 = startRestartGroup.consume(localWindowInfo2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                windowInfo = (WindowInfo) consume52222;
                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2222 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume62222 = startRestartGroup.consume(localSoftwareKeyboardController2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SoftwareKeyboardController softwareKeyboardController2222 = (SoftwareKeyboardController) consume62222;
                if (i22 == 1) {
                }
                Object[] objArr2222 = {orientation};
                Saver<TextFieldScrollerPosition, Object> saver2222 = TextFieldScrollerPosition.INSTANCE.getSaver();
                final int i342222 = i22;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                changed = startRestartGroup.changed(orientation);
                ImeOptions imeOptions62222 = imeOptions3;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue4 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldScrollerPosition invoke() {
                        return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final TextFieldScrollerPosition textFieldScrollerPosition2222 = (TextFieldScrollerPosition) RememberSaveableKt.m3426rememberSaveable(objArr2222, (Saver) saver2222, (String) null, (Function0) rememberedValue4, startRestartGroup, 0, 4);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                i23 = i6 & 14;
                if (i23 == 4) {
                }
                z7 = ((i6 & 57344) == 16384) | (i23 == 4);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (z7) {
                }
                TransformedText filterWithValidation2222 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation3, textFieldValue.getAnnotatedString());
                composition = textFieldValue.getComposition();
                i24 = i23;
                if (composition != null) {
                }
                rememberedValue5 = filterWithValidation2222;
                startRestartGroup.updateRememberedValue(rememberedValue5);
                final TransformedText transformedText2222 = (TransformedText) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AnnotatedString text2222 = transformedText2222.getText();
                final OffsetMapping offsetMapping2222 = transformedText2222.getOffsetMapping();
                RecomposeScope currentRecomposeScope2222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
                changed2 = startRestartGroup.changed(softwareKeyboardController2222);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue6 = new LegacyTextFieldState(new TextDelegate(text2222, textStyle2, 0, 0, z5, 0, density2222, resolver2222, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope2222, softwareKeyboardController2222);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                legacyTextFieldState = (LegacyTextFieldState) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                legacyTextFieldState.m1022updatefnh65Uc(textFieldValue.getAnnotatedString(), text2222, textStyle2, z5, density2222, resolver2222, function1, keyboardActions2, focusManager2222, backgroundColor2222);
                legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                }
                UndoManager undoManager2222 = (UndoManager) rememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                UndoManager.snapshotIfNeeded$default(undoManager2222, textFieldValue, 0L, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                }
                final TextFieldSelectionManager textFieldSelectionManager2222 = (TextFieldSelectionManager) rememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager2222.setOffsetMapping$foundation_release(offsetMapping2222);
                textFieldSelectionManager2222.setVisualTransformation$foundation_release(visualTransformation3);
                textFieldSelectionManager2222.setOnValueChange$foundation_release(legacyTextFieldState.getOnValueChange());
                textFieldSelectionManager2222.setState$foundation_release(legacyTextFieldState);
                textFieldSelectionManager2222.setValue$foundation_release(textFieldValue);
                ProvidableCompositionLocal<ClipboardManager> localClipboardManager2222 = CompositionLocalsKt.getLocalClipboardManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume72222 = startRestartGroup.consume(localClipboardManager2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager2222.setClipboardManager$foundation_release((ClipboardManager) consume72222);
                ProvidableCompositionLocal<TextToolbar> localTextToolbar2222 = CompositionLocalsKt.getLocalTextToolbar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume82222 = startRestartGroup.consume(localTextToolbar2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager2222.setTextToolbar((TextToolbar) consume82222);
                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2222 = CompositionLocalsKt.getLocalHapticFeedback();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume92222 = startRestartGroup.consume(localHapticFeedback2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldSelectionManager2222.setHapticFeedBack((HapticFeedback) consume92222);
                textFieldSelectionManager2222.setFocusRequester(focusRequester2222);
                textFieldSelectionManager2222.setEditable(!z6);
                textFieldSelectionManager2222.setEnabled(z4);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                }
                final BringIntoViewRequester bringIntoViewRequester2222 = (BringIntoViewRequester) rememberedValue10;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion32222 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                int i352222 = i16 & 7168;
                int i362222 = 57344 & i16;
                final VisualTransformation visualTransformation52222 = visualTransformation3;
                int i372222 = i24;
                boolean changedInstance102222 = (i352222 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i362222 == 16384) | startRestartGroup.changedInstance(textInputService2222) | (i372222 == 4);
                i25 = (i16 & 112) ^ 48;
                if (i25 > 32) {
                }
                i26 = i362222;
                i27 = i16;
                if ((i16 & 48) != 32) {
                }
                z8 = true;
                changedInstance = changedInstance102222 | z8 | startRestartGroup.changedInstance(offsetMapping2222) | startRestartGroup.changedInstance(coroutineScope2222) | startRestartGroup.changedInstance(bringIntoViewRequester2222) | startRestartGroup.changedInstance(textFieldSelectionManager2222);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                final boolean z17222222 = z4;
                final boolean z18222222 = z6;
                final ImeOptions imeOptions7222222 = imeOptions4;
                rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                        invoke2(focusState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(FocusState focusState) {
                        TextLayoutResultProxy layoutResult;
                        if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                            return;
                        }
                        LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                        if (!LegacyTextFieldState.this.getHasFocus() || !z17222222 || z18222222) {
                            CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                        } else {
                            CoreTextFieldKt.startInputSession(textInputService2222, LegacyTextFieldState.this, textFieldValue, imeOptions7222222, offsetMapping2222);
                        }
                        if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2222, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping2222, null), 3, null);
                        }
                        if (focusState.isFocused()) {
                            return;
                        }
                        TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2222, null, 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion32222, z4, focusRequester2222, mutableInteractionSource52222, (Function1) rememberedValue11);
                State rememberUpdatedState222222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
                Unit unit222222 = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed3222222 = startRestartGroup.changed(rememberUpdatedState222222) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService2222) | startRestartGroup.changedInstance(textFieldSelectionManager2222);
                if (i25 > 32) {
                }
                modifier3 = textFieldFocusModifier;
                if ((i27 & 48) != 32) {
                }
                z9 = true;
                z10 = z9 | changed3222222;
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (!z10) {
                }
                rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState222222, textInputService2222, textFieldSelectionManager2222, imeOptions4, null);
                startRestartGroup.updateRememberedValue(rememberedValue12);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(unit222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
                Modifier.Companion companion42222222 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
                rememberedValue13 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z192222222) {
                        LegacyTextFieldState.this.setInTouchMode(z192222222);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier updateSelectionTouchMode2222222 = SelectionGesturesKt.updateSelectionTouchMode(companion42222222, (Function1) rememberedValue13);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                int i382222222 = i26;
                changedInstance3 = (i352222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i382222222 != 16384) | startRestartGroup.changedInstance(offsetMapping2222) | startRestartGroup.changedInstance(textFieldSelectionManager2222);
                rememberedValue14 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                final boolean z192222222 = z6;
                final boolean z202222222 = z4;
                rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                        m992invokek4lQ0M(offset.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m992invokek4lQ0M(long j) {
                        CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2222, !z192222222);
                        if (LegacyTextFieldState.this.getHasFocus() && z202222222) {
                            if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                if (layoutResult != null) {
                                    LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                    TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping2222, legacyTextFieldState2.getOnValueChange());
                                    if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                        legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            textFieldSelectionManager2222.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier pointerHoverIcon$default2222222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode2222222, mutableInteractionSource52222, z4, (Function1) rememberedValue14), textFieldSelectionManager2222.getMouseSelectionObserver(), textFieldSelectionManager2222.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                Modifier.Companion companion52222222 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i372222 != 4) | startRestartGroup.changedInstance(offsetMapping2222);
                Object rememberedValue202222222 = startRestartGroup.rememberedValue();
                if (changedInstance4) {
                }
                obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            TextFieldValue textFieldValue2 = textFieldValue;
                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                            OffsetMapping offsetMapping22222 = offsetMapping2222;
                            TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping22222, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Modifier drawBehind2222222 = DrawModifierKt.drawBehind(companion52222222, (Function1) obj);
                Modifier.Companion companion62222222 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                changedInstance5 = (i352222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager2222) | (i372222 != 4) | startRestartGroup.changedInstance(offsetMapping2222);
                rememberedValue15 = startRestartGroup.rememberedValue();
                if (!changedInstance5) {
                }
                final boolean z212222222 = z4;
                rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                        }
                        if (z212222222) {
                            if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                                if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                    textFieldSelectionManager2222.showSelectionToolbar$foundation_release();
                                } else {
                                    textFieldSelectionManager2222.hideSelectionToolbar$foundation_release();
                                }
                                LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                                LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, false));
                                LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                            } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                                LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager2222, true));
                            }
                            CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping2222);
                            TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                            if (layoutResult2 != null) {
                                LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                TextFieldValue textFieldValue2 = textFieldValue;
                                OffsetMapping offsetMapping22222 = offsetMapping2222;
                                TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                                if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                    return;
                                }
                                TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping22222, layoutResult2);
                            }
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue15);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Modifier onGloballyPositioned3222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion62222222, (Function1) rememberedValue15);
                final boolean z222222222 = visualTransformation52222 instanceof PasswordVisualTransformation;
                Modifier.Companion companion72222222 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                changedInstance6 = startRestartGroup.changedInstance(transformedText2222) | (i372222 != 4) | (i352222 != 2048) | startRestartGroup.changed(z222222222) | (i382222222 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping2222) | startRestartGroup.changedInstance(textFieldSelectionManager2222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                rememberedValue16 = startRestartGroup.rememberedValue();
                if (!changedInstance6) {
                }
                final boolean z232222222 = z4;
                final boolean z242222222 = z6;
                final ImeOptions imeOptions82222222 = imeOptions4;
                rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                    public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                        SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                        if (!z232222222) {
                            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                        }
                        if (z222222222) {
                            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                        }
                        boolean z252222222 = z232222222 && !z242222222;
                        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z252222222);
                        final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(List<TextLayoutResult> list) {
                                boolean z262222222;
                                if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                    Intrinsics.checkNotNull(layoutResult);
                                    list.add(layoutResult.getValue());
                                    z262222222 = true;
                                } else {
                                    z262222222 = false;
                                }
                                return Boolean.valueOf(z262222222);
                            }
                        }, 1, null);
                        if (z252222222) {
                            final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(AnnotatedString annotatedString) {
                                    Unit unit2222222;
                                    TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                    if (inputSession != null) {
                                        LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                        unit2222222 = Unit.INSTANCE;
                                    } else {
                                        unit2222222 = null;
                                    }
                                    if (unit2222222 == null) {
                                        LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    }
                                    return true;
                                }
                            }, 1, null);
                            final boolean z262222222 = z242222222;
                            final boolean z272222222 = z232222222;
                            final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                            final TextFieldValue textFieldValue2 = textFieldValue;
                            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(AnnotatedString annotatedString) {
                                    Unit unit2222222;
                                    if (z262222222 || !z272222222) {
                                        return false;
                                    }
                                    TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                    if (inputSession != null) {
                                        LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                        unit2222222 = Unit.INSTANCE;
                                    } else {
                                        unit2222222 = null;
                                    }
                                    if (unit2222222 == null) {
                                        TextFieldValue textFieldValue3 = textFieldValue2;
                                        legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    }
                                    return true;
                                }
                            }, 1, null);
                        }
                        final OffsetMapping offsetMapping22222 = offsetMapping2222;
                        final boolean z28 = z232222222;
                        final TextFieldValue textFieldValue3 = textFieldValue;
                        final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                        final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                            }

                            public final Boolean invoke(int i392222222, int i40, boolean z29) {
                                if (!z29) {
                                    i392222222 = OffsetMapping.this.transformedToOriginal(i392222222);
                                }
                                if (!z29) {
                                    i40 = OffsetMapping.this.transformedToOriginal(i40);
                                }
                                boolean z30 = false;
                                if (z28 && (i392222222 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                    if (Math.min(i392222222, i40) >= 0 && Math.max(i392222222, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                        if (z29 || i392222222 == i40) {
                                            textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                                        } else {
                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager22222, false, 1, null);
                                        }
                                        legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i392222222, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                        z30 = true;
                                    } else {
                                        textFieldSelectionManager22222.exitSelectionMode$foundation_release();
                                    }
                                }
                                return Boolean.valueOf(z30);
                            }
                        }, 1, null);
                        int imeAction = imeOptions82222222.getImeAction();
                        final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                        final ImeOptions imeOptions92222222 = imeOptions82222222;
                        SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions92222222.getImeAction()));
                                return true;
                            }
                        }, 2, null);
                        final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                        final FocusRequester focusRequester22222 = focusRequester2222;
                        final boolean z29 = z242222222;
                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester22222, !z29);
                                return true;
                            }
                        }, 1, null);
                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222;
                        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                return true;
                            }
                        }, 1, null);
                        if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z222222222) {
                            final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2222;
                            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                    return true;
                                }
                            }, 1, null);
                            if (z232222222 && !z242222222) {
                                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager2222;
                                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        TextFieldSelectionManager.this.cut$foundation_release();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        }
                        if (!z232222222 || z242222222) {
                            return;
                        }
                        final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager2222;
                        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.this.paste$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue16);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier semantics2222222 = SemanticsModifierKt.semantics(companion72222222, true, (Function1) rememberedValue16);
                final Modifier cursor2222222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping2222, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager2222);
                rememberedValue17 = startRestartGroup.rememberedValue();
                if (!changedInstance7) {
                }
                rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final TextFieldSelectionManager textFieldSelectionManager22222 = TextFieldSelectionManager.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue17);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(textFieldSelectionManager2222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                changedInstance8 = (i372222 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService2222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
                rememberedValue18 = startRestartGroup.rememberedValue();
                if (!changedInstance8) {
                }
                rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        if (LegacyTextFieldState.this.getHasFocus()) {
                            LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService2222, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                        }
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue18);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
                Modifier m1076textFieldKeyInput2WJ9YEU2222222 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager2222, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i342222 != 1, offsetMapping2222, undoManager2222, imeOptions4.getImeAction());
                Modifier.Companion companion82222222 = Modifier.INSTANCE;
                boolean CoreTextField$lambda$112222222 = CoreTextField$lambda$11(rememberUpdatedState222222);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter2222);
                rememberedValue19 = startRestartGroup.rememberedValue();
                if (!changedInstance9) {
                }
                rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        if (!LegacyTextFieldState.this.getHasFocus()) {
                            focusRequester2222.requestFocus();
                        }
                        if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                            legacyPlatformTextInputServiceAdapter2222.startStylusHandwriting();
                        }
                        return true;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue19);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier onGloballyPositioned22222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier52222, legacyPlatformTextInputServiceAdapter2222, legacyTextFieldState, textFieldSelectionManager2222).then(StylusHandwritingKt.stylusHandwriting(companion82222222, CoreTextField$lambda$112222222, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager2222), legacyTextFieldState, textFieldSelectionManager2222).then(m1076textFieldKeyInput2WJ9YEU2222222), textFieldScrollerPosition2222, mutableInteractionSource52222, z4).then(pointerHoverIcon$default2222222).then(semantics2222222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LayoutCoordinates layoutCoordinates) {
                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                        if (layoutResult == null) {
                            return;
                        }
                        layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                    }
                });
                if (z4) {
                }
                if (!z11) {
                }
                final Modifier modifier62222222 = companion;
                final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function342222222 = function32;
                final TextStyle textStyle52222222 = textStyle2;
                final int i392222222 = i21;
                boolean z252222222 = z4;
                ImeOptions imeOptions92222222 = imeOptions4;
                final boolean z262222222 = z11;
                final boolean z272222222 = z6;
                final Function1<? super TextLayoutResult, Unit> function152222222 = function13;
                composer2 = startRestartGroup;
                CoreTextFieldRootBox(onGloballyPositioned22222222, textFieldSelectionManager2222, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                    public final void invoke(Composer composer3, int i40) {
                        ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                        if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                            }
                            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function342222222;
                            final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                            final TextStyle textStyle6 = textStyle52222222;
                            final int i41 = i392222222;
                            final int i42 = i342222;
                            final TextFieldScrollerPosition textFieldScrollerPosition22222 = textFieldScrollerPosition2222;
                            final TextFieldValue textFieldValue2 = textFieldValue;
                            final VisualTransformation visualTransformation6 = visualTransformation52222;
                            final Modifier modifier7 = cursor2222222;
                            final Modifier modifier8 = drawBehind2222222;
                            final Modifier modifier9 = onGloballyPositioned3222222;
                            final Modifier modifier10 = modifier62222222;
                            final BringIntoViewRequester bringIntoViewRequester22222 = bringIntoViewRequester2222;
                            final TextFieldSelectionManager textFieldSelectionManager22222 = textFieldSelectionManager2222;
                            final boolean z28 = z262222222;
                            final boolean z29 = z272222222;
                            final Function1<? super TextLayoutResult, Unit> function16 = function152222222;
                            final OffsetMapping offsetMapping22222 = offsetMapping2222;
                            final Density density22222 = density2222;
                            function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                                public final void invoke(Composer composer4, int i43) {
                                    ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                    if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                        }
                                        Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                        TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition22222;
                                        TextFieldValue textFieldValue3 = textFieldValue2;
                                        VisualTransformation visualTransformation7 = visualTransformation6;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                        boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                        final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                        Object rememberedValue21 = composer4.rememberedValue();
                                        if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final TextLayoutResultProxy invoke() {
                                                    return LegacyTextFieldState.this.getLayoutResult();
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue21);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester22222);
                                        final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22222;
                                        final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                        final boolean z30 = z28;
                                        final boolean z31 = z29;
                                        final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                        final TextFieldValue textFieldValue4 = textFieldValue2;
                                        final OffsetMapping offsetMapping3 = offsetMapping22222;
                                        final Density density3 = density22222;
                                        final int i44 = i42;
                                        SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                            /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void invoke(Composer composer5, int i45) {
                                                boolean z32;
                                                ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                    }
                                                    final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                    final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                    final TextFieldValue textFieldValue5 = textFieldValue4;
                                                    final OffsetMapping offsetMapping4 = offsetMapping3;
                                                    final Density density4 = density3;
                                                    final int i46 = i44;
                                                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        /* renamed from: measure-3p2s80s */
                                                        public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                            Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                            LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                            Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                            Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                            try {
                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                                int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                                TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                                if (!Intrinsics.areEqual(value, component3)) {
                                                                    LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                    function18.invoke(component3);
                                                                    CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                                }
                                                                LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                                return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                        invoke2(placementScope);
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                });
                                                            } finally {
                                                                companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                            }
                                                        }

                                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                            LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                            return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                        }
                                                    };
                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                    Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    composer5.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                    if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                        LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                        Intrinsics.checkNotNull(layoutCoordinates);
                                                        if (layoutCoordinates.isAttached() && z30) {
                                                            z32 = true;
                                                            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                            if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                                composer5.startReplaceGroup(-2032274);
                                                                ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                                composer5.endReplaceGroup();
                                                            } else {
                                                                composer5.startReplaceGroup(-1955394);
                                                                composer5.endReplaceGroup();
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                return;
                                                            }
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                    }
                                                    z32 = false;
                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                    if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                    }
                                                    composer5.startReplaceGroup(-1955394);
                                                    composer5.endReplaceGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 48, 0);
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
                }, composer2, 54), composer2, 384);
                if (ComposerKt.isTraceInProgress()) {
                }
                visualTransformation4 = visualTransformation52222;
                z12 = z252222222;
                textStyle3 = textStyle2;
                function14 = function13;
                imeOptions5 = imeOptions92222222;
                brush3 = brush2;
                i28 = i342222;
                modifier4 = modifier52222;
                z13 = z5;
                i29 = i21;
                keyboardActions3 = keyboardActions2;
                z14 = z6;
                function33 = function32;
                mutableInteractionSource3 = mutableInteractionSource52222;
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
            i13 = i5 & 512;
            if (i13 == 0) {
            }
            i14 = i5 & 1024;
            if (i14 == 0) {
            }
            if ((i4 & 48) == 0) {
            }
            i16 = i15;
            i17 = i5 & 4096;
            if (i17 == 0) {
            }
            i18 = i5 & 8192;
            if (i18 != 0) {
            }
            i19 = i5 & 16384;
            if (i19 == 0) {
            }
            i20 = i5 & 32768;
            if (i20 != 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i31 != 0) {
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
            if (i14 != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            i22 = i32;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final FocusRequester focusRequester22222 = (FocusRequester) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter22222 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            final TextInputService textInputService22222 = (TextInputService) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume102222 = startRestartGroup.consume(localDensity22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density22222 = (Density) consume102222;
            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22222 = CompositionLocalsKt.getLocalFontFamilyResolver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume222222 = startRestartGroup.consume(localFontFamilyResolver22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FontFamily.Resolver resolver22222 = (FontFamily.Resolver) consume222222;
            Modifier modifier522222 = modifier2;
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors22222 = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume322222 = startRestartGroup.consume(localTextSelectionColors22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long backgroundColor22222 = ((TextSelectionColors) consume322222).getBackgroundColor();
            ProvidableCompositionLocal<FocusManager> localFocusManager22222 = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume422222 = startRestartGroup.consume(localFocusManager22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FocusManager focusManager22222 = (FocusManager) consume422222;
            MutableInteractionSource mutableInteractionSource522222 = mutableInteractionSource2;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo22222 = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522222 = startRestartGroup.consume(localWindowInfo22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            windowInfo = (WindowInfo) consume522222;
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController22222 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume622222 = startRestartGroup.consume(localSoftwareKeyboardController22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SoftwareKeyboardController softwareKeyboardController22222 = (SoftwareKeyboardController) consume622222;
            if (i22 == 1) {
            }
            Object[] objArr22222 = {orientation};
            Saver<TextFieldScrollerPosition, Object> saver22222 = TextFieldScrollerPosition.INSTANCE.getSaver();
            final int i3422222 = i22;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
            changed = startRestartGroup.changed(orientation);
            ImeOptions imeOptions622222 = imeOptions3;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TextFieldScrollerPosition invoke() {
                    return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextFieldScrollerPosition textFieldScrollerPosition22222 = (TextFieldScrollerPosition) RememberSaveableKt.m3426rememberSaveable(objArr22222, (Saver) saver22222, (String) null, (Function0) rememberedValue4, startRestartGroup, 0, 4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
            i23 = i6 & 14;
            if (i23 == 4) {
            }
            z7 = ((i6 & 57344) == 16384) | (i23 == 4);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (z7) {
            }
            TransformedText filterWithValidation22222 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation3, textFieldValue.getAnnotatedString());
            composition = textFieldValue.getComposition();
            i24 = i23;
            if (composition != null) {
            }
            rememberedValue5 = filterWithValidation22222;
            startRestartGroup.updateRememberedValue(rememberedValue5);
            final TransformedText transformedText22222 = (TransformedText) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AnnotatedString text22222 = transformedText22222.getText();
            final OffsetMapping offsetMapping22222 = transformedText22222.getOffsetMapping();
            RecomposeScope currentRecomposeScope22222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
            changed2 = startRestartGroup.changed(softwareKeyboardController22222);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue6 = new LegacyTextFieldState(new TextDelegate(text22222, textStyle2, 0, 0, z5, 0, density22222, resolver22222, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope22222, softwareKeyboardController22222);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            legacyTextFieldState = (LegacyTextFieldState) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            legacyTextFieldState.m1022updatefnh65Uc(textFieldValue.getAnnotatedString(), text22222, textStyle2, z5, density22222, resolver22222, function1, keyboardActions2, focusManager22222, backgroundColor22222);
            legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            }
            UndoManager undoManager22222 = (UndoManager) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            UndoManager.snapshotIfNeeded$default(undoManager22222, textFieldValue, 0L, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            }
            final TextFieldSelectionManager textFieldSelectionManager22222 = (TextFieldSelectionManager) rememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager22222.setOffsetMapping$foundation_release(offsetMapping22222);
            textFieldSelectionManager22222.setVisualTransformation$foundation_release(visualTransformation3);
            textFieldSelectionManager22222.setOnValueChange$foundation_release(legacyTextFieldState.getOnValueChange());
            textFieldSelectionManager22222.setState$foundation_release(legacyTextFieldState);
            textFieldSelectionManager22222.setValue$foundation_release(textFieldValue);
            ProvidableCompositionLocal<ClipboardManager> localClipboardManager22222 = CompositionLocalsKt.getLocalClipboardManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume722222 = startRestartGroup.consume(localClipboardManager22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager22222.setClipboardManager$foundation_release((ClipboardManager) consume722222);
            ProvidableCompositionLocal<TextToolbar> localTextToolbar22222 = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume822222 = startRestartGroup.consume(localTextToolbar22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager22222.setTextToolbar((TextToolbar) consume822222);
            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22222 = CompositionLocalsKt.getLocalHapticFeedback();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume922222 = startRestartGroup.consume(localHapticFeedback22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldSelectionManager22222.setHapticFeedBack((HapticFeedback) consume922222);
            textFieldSelectionManager22222.setFocusRequester(focusRequester22222);
            textFieldSelectionManager22222.setEditable(!z6);
            textFieldSelectionManager22222.setEnabled(z4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            }
            final BringIntoViewRequester bringIntoViewRequester22222 = (BringIntoViewRequester) rememberedValue10;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier.Companion companion322222 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
            int i3522222 = i16 & 7168;
            int i3622222 = 57344 & i16;
            final VisualTransformation visualTransformation522222 = visualTransformation3;
            int i3722222 = i24;
            boolean changedInstance1022222 = (i3522222 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i3622222 == 16384) | startRestartGroup.changedInstance(textInputService22222) | (i3722222 == 4);
            i25 = (i16 & 112) ^ 48;
            if (i25 > 32) {
            }
            i26 = i3622222;
            i27 = i16;
            if ((i16 & 48) != 32) {
            }
            z8 = true;
            changedInstance = changedInstance1022222 | z8 | startRestartGroup.changedInstance(offsetMapping22222) | startRestartGroup.changedInstance(coroutineScope22222) | startRestartGroup.changedInstance(bringIntoViewRequester22222) | startRestartGroup.changedInstance(textFieldSelectionManager22222);
            rememberedValue11 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            final boolean z172222222 = z4;
            final boolean z182222222 = z6;
            final ImeOptions imeOptions72222222 = imeOptions4;
            rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                    invoke2(focusState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(FocusState focusState) {
                    TextLayoutResultProxy layoutResult;
                    if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                        return;
                    }
                    LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                    if (!LegacyTextFieldState.this.getHasFocus() || !z172222222 || z182222222) {
                        CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                    } else {
                        CoreTextFieldKt.startInputSession(textInputService22222, LegacyTextFieldState.this, textFieldValue, imeOptions72222222, offsetMapping22222);
                    }
                    if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope22222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester22222, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping22222, null), 3, null);
                    }
                    if (focusState.isFocused()) {
                        return;
                    }
                    TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager22222, null, 1, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue11);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion322222, z4, focusRequester22222, mutableInteractionSource522222, (Function1) rememberedValue11);
            State rememberUpdatedState2222222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
            Unit unit2222222 = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
            boolean changed32222222 = startRestartGroup.changed(rememberUpdatedState2222222) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService22222) | startRestartGroup.changedInstance(textFieldSelectionManager22222);
            if (i25 > 32) {
            }
            modifier3 = textFieldFocusModifier;
            if ((i27 & 48) != 32) {
            }
            z9 = true;
            z10 = z9 | changed32222222;
            rememberedValue12 = startRestartGroup.rememberedValue();
            if (!z10) {
            }
            rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState2222222, textInputService22222, textFieldSelectionManager22222, imeOptions4, null);
            startRestartGroup.updateRememberedValue(rememberedValue12);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(unit2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
            Modifier.Companion companion422222222 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
            changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
            rememberedValue13 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z1922222222) {
                    LegacyTextFieldState.this.setInTouchMode(z1922222222);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue13);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier updateSelectionTouchMode22222222 = SelectionGesturesKt.updateSelectionTouchMode(companion422222222, (Function1) rememberedValue13);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
            int i3822222222 = i26;
            changedInstance3 = (i3522222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i3822222222 != 16384) | startRestartGroup.changedInstance(offsetMapping22222) | startRestartGroup.changedInstance(textFieldSelectionManager22222);
            rememberedValue14 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            final boolean z1922222222 = z6;
            final boolean z2022222222 = z4;
            rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m992invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m992invokek4lQ0M(long j) {
                    CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester22222, !z1922222222);
                    if (LegacyTextFieldState.this.getHasFocus() && z2022222222) {
                        if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                            if (layoutResult != null) {
                                LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                                TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping22222, legacyTextFieldState2.getOnValueChange());
                                if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                    legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        textFieldSelectionManager22222.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue14);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier pointerHoverIcon$default22222222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode22222222, mutableInteractionSource522222, z4, (Function1) rememberedValue14), textFieldSelectionManager22222.getMouseSelectionObserver(), textFieldSelectionManager22222.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            Modifier.Companion companion522222222 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
            changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i3722222 != 4) | startRestartGroup.changedInstance(offsetMapping22222);
            Object rememberedValue2022222222 = startRestartGroup.rememberedValue();
            if (changedInstance4) {
            }
            obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        TextFieldValue textFieldValue2 = textFieldValue;
                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                        OffsetMapping offsetMapping222222 = offsetMapping22222;
                        TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping222222, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                    }
                }
            };
            startRestartGroup.updateRememberedValue(obj);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Modifier drawBehind22222222 = DrawModifierKt.drawBehind(companion522222222, (Function1) obj);
            Modifier.Companion companion622222222 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
            changedInstance5 = (i3522222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager22222) | (i3722222 != 4) | startRestartGroup.changedInstance(offsetMapping22222);
            rememberedValue15 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            final boolean z2122222222 = z4;
            rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                    LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                    if (layoutResult != null) {
                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                    }
                    if (z2122222222) {
                        if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                            if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                                textFieldSelectionManager22222.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager22222.hideSelectionToolbar$foundation_release();
                            }
                            LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22222, true));
                            LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22222, false));
                            LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                        } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                            LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager22222, true));
                        }
                        CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping22222);
                        TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                        if (layoutResult2 != null) {
                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                            TextFieldValue textFieldValue2 = textFieldValue;
                            OffsetMapping offsetMapping222222 = offsetMapping22222;
                            TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                            if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                                return;
                            }
                            TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping222222, layoutResult2);
                        }
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue15);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Modifier onGloballyPositioned32222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion622222222, (Function1) rememberedValue15);
            final boolean z2222222222 = visualTransformation522222 instanceof PasswordVisualTransformation;
            Modifier.Companion companion722222222 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
            changedInstance6 = startRestartGroup.changedInstance(transformedText22222) | (i3722222 != 4) | (i3522222 != 2048) | startRestartGroup.changed(z2222222222) | (i3822222222 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping22222) | startRestartGroup.changedInstance(textFieldSelectionManager22222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
            rememberedValue16 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
            }
            final boolean z2322222222 = z4;
            final boolean z2422222222 = z6;
            final ImeOptions imeOptions822222222 = imeOptions4;
            rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                    SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                    if (!z2322222222) {
                        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                    }
                    if (z2222222222) {
                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                    }
                    boolean z2522222222 = z2322222222 && !z2422222222;
                    SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z2522222222);
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(List<TextLayoutResult> list) {
                            boolean z2622222222;
                            if (LegacyTextFieldState.this.getLayoutResult() != null) {
                                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                                Intrinsics.checkNotNull(layoutResult);
                                list.add(layoutResult.getValue());
                                z2622222222 = true;
                            } else {
                                z2622222222 = false;
                            }
                            return Boolean.valueOf(z2622222222);
                        }
                    }, 1, null);
                    if (z2522222222) {
                        final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(AnnotatedString annotatedString) {
                                Unit unit22222222;
                                TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                                if (inputSession != null) {
                                    LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                    unit22222222 = Unit.INSTANCE;
                                } else {
                                    unit22222222 = null;
                                }
                                if (unit22222222 == null) {
                                    LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                }
                                return true;
                            }
                        }, 1, null);
                        final boolean z2622222222 = z2422222222;
                        final boolean z2722222222 = z2322222222;
                        final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                        final TextFieldValue textFieldValue2 = textFieldValue;
                        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Boolean invoke(AnnotatedString annotatedString) {
                                Unit unit22222222;
                                if (z2622222222 || !z2722222222) {
                                    return false;
                                }
                                TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                                if (inputSession != null) {
                                    LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                    unit22222222 = Unit.INSTANCE;
                                } else {
                                    unit22222222 = null;
                                }
                                if (unit22222222 == null) {
                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                    legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                }
                                return true;
                            }
                        }, 1, null);
                    }
                    final OffsetMapping offsetMapping222222 = offsetMapping22222;
                    final boolean z28 = z2322222222;
                    final TextFieldValue textFieldValue3 = textFieldValue;
                    final TextFieldSelectionManager textFieldSelectionManager222222 = textFieldSelectionManager22222;
                    final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                    SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                        }

                        public final Boolean invoke(int i3922222222, int i40, boolean z29) {
                            if (!z29) {
                                i3922222222 = OffsetMapping.this.transformedToOriginal(i3922222222);
                            }
                            if (!z29) {
                                i40 = OffsetMapping.this.transformedToOriginal(i40);
                            }
                            boolean z30 = false;
                            if (z28 && (i3922222222 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                                if (Math.min(i3922222222, i40) >= 0 && Math.max(i3922222222, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                    if (z29 || i3922222222 == i40) {
                                        textFieldSelectionManager222222.exitSelectionMode$foundation_release();
                                    } else {
                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager222222, false, 1, null);
                                    }
                                    legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i3922222222, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                    z30 = true;
                                } else {
                                    textFieldSelectionManager222222.exitSelectionMode$foundation_release();
                                }
                            }
                            return Boolean.valueOf(z30);
                        }
                    }, 1, null);
                    int imeAction = imeOptions822222222.getImeAction();
                    final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                    final ImeOptions imeOptions922222222 = imeOptions822222222;
                    SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions922222222.getImeAction()));
                            return true;
                        }
                    }, 2, null);
                    final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                    final FocusRequester focusRequester222222 = focusRequester22222;
                    final boolean z29 = z2422222222;
                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester222222, !z29);
                            return true;
                        }
                    }, 1, null);
                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager22222;
                    SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                            return true;
                        }
                    }, 1, null);
                    if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z2222222222) {
                        final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager22222;
                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                                return true;
                            }
                        }, 1, null);
                        if (z2322222222 && !z2422222222) {
                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager22222;
                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    TextFieldSelectionManager.this.cut$foundation_release();
                                    return true;
                                }
                            }, 1, null);
                        }
                    }
                    if (!z2322222222 || z2422222222) {
                        return;
                    }
                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager22222;
                    SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.this.paste$foundation_release();
                            return true;
                        }
                    }, 1, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue16);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics22222222 = SemanticsModifierKt.semantics(companion722222222, true, (Function1) rememberedValue16);
            final Modifier cursor22222222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping22222, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
            changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager22222);
            rememberedValue17 = startRestartGroup.rememberedValue();
            if (!changedInstance7) {
            }
            rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final TextFieldSelectionManager textFieldSelectionManager222222 = TextFieldSelectionManager.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue17);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(textFieldSelectionManager22222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
            changedInstance8 = (i3722222 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService22222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
            rememberedValue18 = startRestartGroup.rememberedValue();
            if (!changedInstance8) {
            }
            rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    if (LegacyTextFieldState.this.getHasFocus()) {
                        LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService22222, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                    }
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue18);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
            Modifier m1076textFieldKeyInput2WJ9YEU22222222 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager22222, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i3422222 != 1, offsetMapping22222, undoManager22222, imeOptions4.getImeAction());
            Modifier.Companion companion822222222 = Modifier.INSTANCE;
            boolean CoreTextField$lambda$1122222222 = CoreTextField$lambda$11(rememberUpdatedState2222222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
            changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter22222);
            rememberedValue19 = startRestartGroup.rememberedValue();
            if (!changedInstance9) {
            }
            rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    if (!LegacyTextFieldState.this.getHasFocus()) {
                        focusRequester22222.requestFocus();
                    }
                    if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                        legacyPlatformTextInputServiceAdapter22222.startStylusHandwriting();
                    }
                    return true;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue19);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier onGloballyPositioned222222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier522222, legacyPlatformTextInputServiceAdapter22222, legacyTextFieldState, textFieldSelectionManager22222).then(StylusHandwritingKt.stylusHandwriting(companion822222222, CoreTextField$lambda$1122222222, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager22222), legacyTextFieldState, textFieldSelectionManager22222).then(m1076textFieldKeyInput2WJ9YEU22222222), textFieldScrollerPosition22222, mutableInteractionSource522222, z4).then(pointerHoverIcon$default22222222).then(semantics22222222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                    TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                    if (layoutResult == null) {
                        return;
                    }
                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                }
            });
            if (z4) {
            }
            if (!z11) {
            }
            final Modifier modifier622222222 = companion;
            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3422222222 = function32;
            final TextStyle textStyle522222222 = textStyle2;
            final int i3922222222 = i21;
            boolean z2522222222 = z4;
            ImeOptions imeOptions922222222 = imeOptions4;
            final boolean z2622222222 = z11;
            final boolean z2722222222 = z6;
            final Function1<? super TextLayoutResult, Unit> function1522222222 = function13;
            composer2 = startRestartGroup;
            CoreTextFieldRootBox(onGloballyPositioned222222222, textFieldSelectionManager22222, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

                public final void invoke(Composer composer3, int i40) {
                    ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                    if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                        }
                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function3422222222;
                        final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                        final TextStyle textStyle6 = textStyle522222222;
                        final int i41 = i3922222222;
                        final int i42 = i3422222;
                        final TextFieldScrollerPosition textFieldScrollerPosition222222 = textFieldScrollerPosition22222;
                        final TextFieldValue textFieldValue2 = textFieldValue;
                        final VisualTransformation visualTransformation6 = visualTransformation522222;
                        final Modifier modifier7 = cursor22222222;
                        final Modifier modifier8 = drawBehind22222222;
                        final Modifier modifier9 = onGloballyPositioned32222222;
                        final Modifier modifier10 = modifier622222222;
                        final BringIntoViewRequester bringIntoViewRequester222222 = bringIntoViewRequester22222;
                        final TextFieldSelectionManager textFieldSelectionManager222222 = textFieldSelectionManager22222;
                        final boolean z28 = z2622222222;
                        final boolean z29 = z2722222222;
                        final Function1<? super TextLayoutResult, Unit> function16 = function1522222222;
                        final OffsetMapping offsetMapping222222 = offsetMapping22222;
                        final Density density222222 = density22222;
                        function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                            public final void invoke(Composer composer4, int i43) {
                                ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                    }
                                    Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition222222;
                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                    boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                    final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                    Object rememberedValue21 = composer4.rememberedValue();
                                    if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final TextLayoutResultProxy invoke() {
                                                return LegacyTextFieldState.this.getLayoutResult();
                                            }
                                        };
                                        composer4.updateRememberedValue(rememberedValue21);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester222222);
                                    final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222222;
                                    final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                    final boolean z30 = z28;
                                    final boolean z31 = z29;
                                    final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                    final OffsetMapping offsetMapping3 = offsetMapping222222;
                                    final Density density3 = density222222;
                                    final int i44 = i42;
                                    SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void invoke(Composer composer5, int i45) {
                                            boolean z32;
                                            ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                            if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                }
                                                final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                final OffsetMapping offsetMapping4 = offsetMapping3;
                                                final Density density4 = density3;
                                                final int i46 = i44;
                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    /* renamed from: measure-3p2s80s */
                                                    public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                        Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                        LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                        Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                        Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                        try {
                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                            Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                            int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                            int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                            TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                            if (!Intrinsics.areEqual(value, component3)) {
                                                                LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                function18.invoke(component3);
                                                                CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                            }
                                                            LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                            return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            });
                                                        } finally {
                                                            companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                        }
                                                    }

                                                    @Override // androidx.compose.ui.layout.MeasurePolicy
                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                        LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                        return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                    }
                                                };
                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                                Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                composer5.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                                if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                    LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                    if (layoutCoordinates.isAttached() && z30) {
                                                        z32 = true;
                                                        CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                        if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                            composer5.startReplaceGroup(-2032274);
                                                            ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                            CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                            composer5.endReplaceGroup();
                                                        } else {
                                                            composer5.startReplaceGroup(-1955394);
                                                            composer5.endReplaceGroup();
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            return;
                                                        }
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                }
                                                z32 = false;
                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                                }
                                                composer5.startReplaceGroup(-1955394);
                                                composer5.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                            } else {
                                                composer5.skipToGroupEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 48, 0);
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
            }, composer2, 54), composer2, 384);
            if (ComposerKt.isTraceInProgress()) {
            }
            visualTransformation4 = visualTransformation522222;
            z12 = z2522222222;
            textStyle3 = textStyle2;
            function14 = function13;
            imeOptions5 = imeOptions922222222;
            brush3 = brush2;
            i28 = i3422222;
            modifier4 = modifier522222;
            z13 = z5;
            i29 = i21;
            keyboardActions3 = keyboardActions2;
            z14 = z6;
            function33 = function32;
            mutableInteractionSource3 = mutableInteractionSource522222;
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
        i13 = i5 & 512;
        if (i13 == 0) {
        }
        i14 = i5 & 1024;
        if (i14 == 0) {
        }
        if ((i4 & 48) == 0) {
        }
        i16 = i15;
        i17 = i5 & 4096;
        if (i17 == 0) {
        }
        i18 = i5 & 8192;
        if (i18 != 0) {
        }
        i19 = i5 & 16384;
        if (i19 == 0) {
        }
        i20 = i5 & 32768;
        if (i20 != 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i31 != 0) {
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
        if (i14 != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        i22 = i32;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final FocusRequester focusRequester222222 = (FocusRequester) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter222222 = (LegacyPlatformTextInputServiceAdapter) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        final TextInputService textInputService222222 = (TextInputService) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume1022222 = startRestartGroup.consume(localDensity222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density222222 = (Density) consume1022222;
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver222222 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2222222 = startRestartGroup.consume(localFontFamilyResolver222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FontFamily.Resolver resolver222222 = (FontFamily.Resolver) consume2222222;
        Modifier modifier5222222 = modifier2;
        ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors222222 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3222222 = startRestartGroup.consume(localTextSelectionColors222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        long backgroundColor222222 = ((TextSelectionColors) consume3222222).getBackgroundColor();
        ProvidableCompositionLocal<FocusManager> localFocusManager222222 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume4222222 = startRestartGroup.consume(localFocusManager222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        FocusManager focusManager222222 = (FocusManager) consume4222222;
        MutableInteractionSource mutableInteractionSource5222222 = mutableInteractionSource2;
        ProvidableCompositionLocal<WindowInfo> localWindowInfo222222 = CompositionLocalsKt.getLocalWindowInfo();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222222 = startRestartGroup.consume(localWindowInfo222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        windowInfo = (WindowInfo) consume5222222;
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController222222 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume6222222 = startRestartGroup.consume(localSoftwareKeyboardController222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SoftwareKeyboardController softwareKeyboardController222222 = (SoftwareKeyboardController) consume6222222;
        if (i22 == 1) {
        }
        Object[] objArr222222 = {orientation};
        Saver<TextFieldScrollerPosition, Object> saver222222 = TextFieldScrollerPosition.INSTANCE.getSaver();
        final int i34222222 = i22;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
        changed = startRestartGroup.changed(orientation);
        ImeOptions imeOptions6222222 = imeOptions3;
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextFieldScrollerPosition invoke() {
                return new TextFieldScrollerPosition(Orientation.this, 0.0f, 2, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final TextFieldScrollerPosition textFieldScrollerPosition222222 = (TextFieldScrollerPosition) RememberSaveableKt.m3426rememberSaveable(objArr222222, (Saver) saver222222, (String) null, (Function0) rememberedValue4, startRestartGroup, 0, 4);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
        i23 = i6 & 14;
        if (i23 == 4) {
        }
        z7 = ((i6 & 57344) == 16384) | (i23 == 4);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (z7) {
        }
        TransformedText filterWithValidation222222 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation3, textFieldValue.getAnnotatedString());
        composition = textFieldValue.getComposition();
        i24 = i23;
        if (composition != null) {
        }
        rememberedValue5 = filterWithValidation222222;
        startRestartGroup.updateRememberedValue(rememberedValue5);
        final TransformedText transformedText222222 = (TransformedText) rememberedValue5;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        AnnotatedString text222222 = transformedText222222.getText();
        final OffsetMapping offsetMapping222222 = transformedText222222.getOffsetMapping();
        RecomposeScope currentRecomposeScope222222 = ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
        changed2 = startRestartGroup.changed(softwareKeyboardController222222);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue6 = new LegacyTextFieldState(new TextDelegate(text222222, textStyle2, 0, 0, z5, 0, density222222, resolver222222, null, AnimationConstants.DefaultDurationMillis, null), currentRecomposeScope222222, softwareKeyboardController222222);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        legacyTextFieldState = (LegacyTextFieldState) rememberedValue6;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        legacyTextFieldState.m1022updatefnh65Uc(textFieldValue.getAnnotatedString(), text222222, textStyle2, z5, density222222, resolver222222, function1, keyboardActions2, focusManager222222, backgroundColor222222);
        legacyTextFieldState.getProcessor().reset(textFieldValue, legacyTextFieldState.getInputSession());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        UndoManager undoManager222222 = (UndoManager) rememberedValue7;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        UndoManager.snapshotIfNeeded$default(undoManager222222, textFieldValue, 0L, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        final TextFieldSelectionManager textFieldSelectionManager222222 = (TextFieldSelectionManager) rememberedValue8;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager222222.setOffsetMapping$foundation_release(offsetMapping222222);
        textFieldSelectionManager222222.setVisualTransformation$foundation_release(visualTransformation3);
        textFieldSelectionManager222222.setOnValueChange$foundation_release(legacyTextFieldState.getOnValueChange());
        textFieldSelectionManager222222.setState$foundation_release(legacyTextFieldState);
        textFieldSelectionManager222222.setValue$foundation_release(textFieldValue);
        ProvidableCompositionLocal<ClipboardManager> localClipboardManager222222 = CompositionLocalsKt.getLocalClipboardManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume7222222 = startRestartGroup.consume(localClipboardManager222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager222222.setClipboardManager$foundation_release((ClipboardManager) consume7222222);
        ProvidableCompositionLocal<TextToolbar> localTextToolbar222222 = CompositionLocalsKt.getLocalTextToolbar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume8222222 = startRestartGroup.consume(localTextToolbar222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager222222.setTextToolbar((TextToolbar) consume8222222);
        ProvidableCompositionLocal<HapticFeedback> localHapticFeedback222222 = CompositionLocalsKt.getLocalHapticFeedback();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume9222222 = startRestartGroup.consume(localHapticFeedback222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldSelectionManager222222.setHapticFeedBack((HapticFeedback) consume9222222);
        textFieldSelectionManager222222.setFocusRequester(focusRequester222222);
        textFieldSelectionManager222222.setEditable(!z6);
        textFieldSelectionManager222222.setEnabled(z4);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CoroutineScope coroutineScope222222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue9).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
        }
        final BringIntoViewRequester bringIntoViewRequester222222 = (BringIntoViewRequester) rememberedValue10;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier.Companion companion3222222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
        int i35222222 = i16 & 7168;
        int i36222222 = 57344 & i16;
        final VisualTransformation visualTransformation5222222 = visualTransformation3;
        int i37222222 = i24;
        boolean changedInstance10222222 = (i35222222 == 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i36222222 == 16384) | startRestartGroup.changedInstance(textInputService222222) | (i37222222 == 4);
        i25 = (i16 & 112) ^ 48;
        if (i25 > 32) {
        }
        i26 = i36222222;
        i27 = i16;
        if ((i16 & 48) != 32) {
        }
        z8 = true;
        changedInstance = changedInstance10222222 | z8 | startRestartGroup.changedInstance(offsetMapping222222) | startRestartGroup.changedInstance(coroutineScope222222) | startRestartGroup.changedInstance(bringIntoViewRequester222222) | startRestartGroup.changedInstance(textFieldSelectionManager222222);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        final boolean z1722222222 = z4;
        final boolean z1822222222 = z6;
        final ImeOptions imeOptions722222222 = imeOptions4;
        rememberedValue11 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusState focusState) {
                TextLayoutResultProxy layoutResult;
                if (LegacyTextFieldState.this.getHasFocus() == focusState.isFocused()) {
                    return;
                }
                LegacyTextFieldState.this.setHasFocus(focusState.isFocused());
                if (!LegacyTextFieldState.this.getHasFocus() || !z1722222222 || z1822222222) {
                    CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                } else {
                    CoreTextFieldKt.startInputSession(textInputService222222, LegacyTextFieldState.this, textFieldValue, imeOptions722222222, offsetMapping222222);
                }
                if (focusState.isFocused() && (layoutResult = LegacyTextFieldState.this.getLayoutResult()) != null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope222222, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester222222, textFieldValue, LegacyTextFieldState.this, layoutResult, offsetMapping222222, null), 3, null);
                }
                if (focusState.isFocused()) {
                    return;
                }
                TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager222222, null, 1, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue11);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        textFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion3222222, z4, focusRequester222222, mutableInteractionSource5222222, (Function1) rememberedValue11);
        State rememberUpdatedState22222222 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z4 || z6) ? false : true), startRestartGroup, 0);
        Unit unit22222222 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
        boolean changed322222222 = startRestartGroup.changed(rememberUpdatedState22222222) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService222222) | startRestartGroup.changedInstance(textFieldSelectionManager222222);
        if (i25 > 32) {
        }
        modifier3 = textFieldFocusModifier;
        if ((i27 & 48) != 32) {
        }
        z9 = true;
        z10 = z9 | changed322222222;
        rememberedValue12 = startRestartGroup.rememberedValue();
        if (!z10) {
        }
        rememberedValue12 = (Function2) new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, rememberUpdatedState22222222, textInputService222222, textFieldSelectionManager222222, imeOptions4, null);
        startRestartGroup.updateRememberedValue(rememberedValue12);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(unit22222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 6);
        Modifier.Companion companion4222222222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
        changedInstance2 = startRestartGroup.changedInstance(legacyTextFieldState);
        rememberedValue13 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue13 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z19222222222) {
                LegacyTextFieldState.this.setInTouchMode(z19222222222);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue13);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier updateSelectionTouchMode222222222 = SelectionGesturesKt.updateSelectionTouchMode(companion4222222222, (Function1) rememberedValue13);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
        int i38222222222 = i26;
        changedInstance3 = (i35222222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | (i38222222222 != 16384) | startRestartGroup.changedInstance(offsetMapping222222) | startRestartGroup.changedInstance(textFieldSelectionManager222222);
        rememberedValue14 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        final boolean z19222222222 = z6;
        final boolean z20222222222 = z4;
        rememberedValue14 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m992invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m992invokek4lQ0M(long j) {
                CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester222222, !z19222222222);
                if (LegacyTextFieldState.this.getHasFocus() && z20222222222) {
                    if (LegacyTextFieldState.this.getHandleState() != HandleState.Selection) {
                        TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                        if (layoutResult != null) {
                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                            TextFieldDelegate.INSTANCE.m1069setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState2.getProcessor(), offsetMapping222222, legacyTextFieldState2.getOnValueChange());
                            if (legacyTextFieldState2.getTextDelegate().getText().length() > 0) {
                                legacyTextFieldState2.setHandleState(HandleState.Cursor);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    textFieldSelectionManager222222.m1399deselect_kEHs6E$foundation_release(Offset.m3588boximpl(j));
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue14);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier pointerHoverIcon$default222222222 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(updateSelectionTouchMode222222222, mutableInteractionSource5222222, z4, (Function1) rememberedValue14), textFieldSelectionManager222222.getMouseSelectionObserver(), textFieldSelectionManager222222.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        Modifier.Companion companion5222222222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
        changedInstance4 = startRestartGroup.changedInstance(legacyTextFieldState) | (i37222222 != 4) | startRestartGroup.changedInstance(offsetMapping222222);
        Object rememberedValue20222222222 = startRestartGroup.rememberedValue();
        if (changedInstance4) {
        }
        obj = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    TextFieldValue textFieldValue2 = textFieldValue;
                    LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                    OffsetMapping offsetMapping2222222 = offsetMapping222222;
                    TextFieldDelegate.INSTANCE.m1067drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState2.m1017getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState2.m1014getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping2222222, layoutResult.getValue(), legacyTextFieldState2.getHighlightPaint(), legacyTextFieldState2.getSelectionBackgroundColor());
                }
            }
        };
        startRestartGroup.updateRememberedValue(obj);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Modifier drawBehind222222222 = DrawModifierKt.drawBehind(companion5222222222, (Function1) obj);
        Modifier.Companion companion6222222222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
        changedInstance5 = (i35222222 != 2048) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changed(windowInfo) | startRestartGroup.changedInstance(textFieldSelectionManager222222) | (i37222222 != 4) | startRestartGroup.changedInstance(offsetMapping222222);
        rememberedValue15 = startRestartGroup.rememberedValue();
        if (!changedInstance5) {
        }
        final boolean z21222222222 = z4;
        rememberedValue15 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                LegacyTextFieldState.this.setLayoutCoordinates(layoutCoordinates);
                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                if (layoutResult != null) {
                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                }
                if (z21222222222) {
                    if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection) {
                        if (LegacyTextFieldState.this.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                            textFieldSelectionManager222222.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager222222.hideSelectionToolbar$foundation_release();
                        }
                        LegacyTextFieldState.this.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222222, true));
                        LegacyTextFieldState.this.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222222, false));
                        LegacyTextFieldState.this.setShowCursorHandle(TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()));
                    } else if (LegacyTextFieldState.this.getHandleState() == HandleState.Cursor) {
                        LegacyTextFieldState.this.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager222222, true));
                    }
                    CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue, offsetMapping222222);
                    TextLayoutResultProxy layoutResult2 = LegacyTextFieldState.this.getLayoutResult();
                    if (layoutResult2 != null) {
                        LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                        TextFieldValue textFieldValue2 = textFieldValue;
                        OffsetMapping offsetMapping2222222 = offsetMapping222222;
                        TextInputSession inputSession = legacyTextFieldState2.getInputSession();
                        if (inputSession == null || !legacyTextFieldState2.getHasFocus()) {
                            return;
                        }
                        TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping2222222, layoutResult2);
                    }
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue15);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Modifier onGloballyPositioned322222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion6222222222, (Function1) rememberedValue15);
        final boolean z22222222222 = visualTransformation5222222 instanceof PasswordVisualTransformation;
        Modifier.Companion companion7222222222 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
        changedInstance6 = startRestartGroup.changedInstance(transformedText222222) | (i37222222 != 4) | (i35222222 != 2048) | startRestartGroup.changed(z22222222222) | (i38222222222 != 16384) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(offsetMapping222222) | startRestartGroup.changedInstance(textFieldSelectionManager222222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
        rememberedValue16 = startRestartGroup.rememberedValue();
        if (!changedInstance6) {
        }
        final boolean z23222222222 = z4;
        final boolean z24222222222 = z6;
        final ImeOptions imeOptions8222222222 = imeOptions4;
        rememberedValue16 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
            public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, TransformedText.this.getText());
                SemanticsPropertiesKt.m5614setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                if (!z23222222222) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                if (z22222222222) {
                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                }
                boolean z25222222222 = z23222222222 && !z24222222222;
                SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z25222222222);
                final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(List<TextLayoutResult> list) {
                        boolean z26222222222;
                        if (LegacyTextFieldState.this.getLayoutResult() != null) {
                            TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                            Intrinsics.checkNotNull(layoutResult);
                            list.add(layoutResult.getValue());
                            z26222222222 = true;
                        } else {
                            z26222222222 = false;
                        }
                        return Boolean.valueOf(z26222222222);
                    }
                }, 1, null);
                if (z25222222222) {
                    final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                    SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AnnotatedString annotatedString) {
                            Unit unit222222222;
                            TextInputSession inputSession = LegacyTextFieldState.this.getInputSession();
                            if (inputSession != null) {
                                LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState4.getProcessor(), legacyTextFieldState4.getOnValueChange(), inputSession);
                                unit222222222 = Unit.INSTANCE;
                            } else {
                                unit222222222 = null;
                            }
                            if (unit222222222 == null) {
                                LegacyTextFieldState.this.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                            }
                            return true;
                        }
                    }, 1, null);
                    final boolean z26222222222 = z24222222222;
                    final boolean z27222222222 = z23222222222;
                    final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AnnotatedString annotatedString) {
                            Unit unit222222222;
                            if (z26222222222 || !z27222222222) {
                                return false;
                            }
                            TextInputSession inputSession = legacyTextFieldState4.getInputSession();
                            if (inputSession != null) {
                                LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), legacyTextFieldState5.getProcessor(), legacyTextFieldState5.getOnValueChange(), inputSession);
                                unit222222222 = Unit.INSTANCE;
                            } else {
                                unit222222222 = null;
                            }
                            if (unit222222222 == null) {
                                TextFieldValue textFieldValue3 = textFieldValue2;
                                legacyTextFieldState4.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m5784getStartimpl(textFieldValue3.getSelection()), TextRange.m5779getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m5784getStartimpl(textFieldValue3.getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                            }
                            return true;
                        }
                    }, 1, null);
                }
                final OffsetMapping offsetMapping2222222 = offsetMapping222222;
                final boolean z28 = z23222222222;
                final TextFieldValue textFieldValue3 = textFieldValue;
                final TextFieldSelectionManager textFieldSelectionManager2222222 = textFieldSelectionManager222222;
                final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                    }

                    public final Boolean invoke(int i39222222222, int i40, boolean z29) {
                        if (!z29) {
                            i39222222222 = OffsetMapping.this.transformedToOriginal(i39222222222);
                        }
                        if (!z29) {
                            i40 = OffsetMapping.this.transformedToOriginal(i40);
                        }
                        boolean z30 = false;
                        if (z28 && (i39222222222 != TextRange.m5784getStartimpl(textFieldValue3.getSelection()) || i40 != TextRange.m5779getEndimpl(textFieldValue3.getSelection()))) {
                            if (Math.min(i39222222222, i40) >= 0 && Math.max(i39222222222, i40) <= textFieldValue3.getAnnotatedString().length()) {
                                if (z29 || i39222222222 == i40) {
                                    textFieldSelectionManager2222222.exitSelectionMode$foundation_release();
                                } else {
                                    TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager2222222, false, 1, null);
                                }
                                legacyTextFieldState5.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i39222222222, i40), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                z30 = true;
                            } else {
                                textFieldSelectionManager2222222.exitSelectionMode$foundation_release();
                            }
                        }
                        return Boolean.valueOf(z30);
                    }
                }, 1, null);
                int imeAction = imeOptions8222222222.getImeAction();
                final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                final ImeOptions imeOptions9222222222 = imeOptions8222222222;
                SemanticsPropertiesKt.m5609onImeAction9UiTYpY$default(semanticsPropertyReceiver, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        LegacyTextFieldState.this.getOnImeActionPerformed().invoke(ImeAction.m5946boximpl(imeOptions9222222222.getImeAction()));
                        return true;
                    }
                }, 2, null);
                final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState;
                final FocusRequester focusRequester2222222 = focusRequester222222;
                final boolean z29 = z24222222222;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        CoreTextFieldKt.tapToFocus(LegacyTextFieldState.this, focusRequester2222222, !z29);
                        return true;
                    }
                }, 1, null);
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager222222;
                SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                        return true;
                    }
                }, 1, null);
                if (!TextRange.m5778getCollapsedimpl(textFieldValue.getSelection()) && !z22222222222) {
                    final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager222222;
                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                            return true;
                        }
                    }, 1, null);
                    if (z23222222222 && !z24222222222) {
                        final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager222222;
                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                TextFieldSelectionManager.this.cut$foundation_release();
                                return true;
                            }
                        }, 1, null);
                    }
                }
                if (!z23222222222 || z24222222222) {
                    return;
                }
                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager222222;
                SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldSelectionManager.this.paste$foundation_release();
                        return true;
                    }
                }, 1, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue16);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier semantics222222222 = SemanticsModifierKt.semantics(companion7222222222, true, (Function1) rememberedValue16);
        final Modifier cursor222222222 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState, textFieldValue, offsetMapping222222, brush2, (z4 || z6 || !windowInfo.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
        changedInstance7 = startRestartGroup.changedInstance(textFieldSelectionManager222222);
        rememberedValue17 = startRestartGroup.rememberedValue();
        if (!changedInstance7) {
        }
        rememberedValue17 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                final TextFieldSelectionManager textFieldSelectionManager2222222 = TextFieldSelectionManager.this;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue17);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.DisposableEffect(textFieldSelectionManager222222, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue17, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
        changedInstance8 = (i37222222 != 4) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(textInputService222222) | ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32);
        rememberedValue18 = startRestartGroup.rememberedValue();
        if (!changedInstance8) {
        }
        rememberedValue18 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                if (LegacyTextFieldState.this.getHasFocus()) {
                    LegacyTextFieldState.this.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService222222, textFieldValue, LegacyTextFieldState.this.getProcessor(), imeOptions4, LegacyTextFieldState.this.getOnValueChange(), LegacyTextFieldState.this.getOnImeActionPerformed()));
                }
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue18);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.DisposableEffect(imeOptions4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue18, startRestartGroup, (i27 >> 3) & 14);
        Modifier m1076textFieldKeyInput2WJ9YEU222222222 = TextFieldKeyInputKt.m1076textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState, textFieldSelectionManager222222, textFieldValue, legacyTextFieldState.getOnValueChange(), !z6, i34222222 != 1, offsetMapping222222, undoManager222222, imeOptions4.getImeAction());
        Modifier.Companion companion8222222222 = Modifier.INSTANCE;
        boolean CoreTextField$lambda$11222222222 = CoreTextField$lambda$11(rememberUpdatedState22222222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
        changedInstance9 = ((i25 <= 32 && startRestartGroup.changed(imeOptions4)) || (i27 & 48) == 32) | startRestartGroup.changedInstance(legacyTextFieldState) | startRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter222222);
        rememberedValue19 = startRestartGroup.rememberedValue();
        if (!changedInstance9) {
        }
        rememberedValue19 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (!LegacyTextFieldState.this.getHasFocus()) {
                    focusRequester222222.requestFocus();
                }
                if (!KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6021getPasswordPjHm6EE()) && !KeyboardType.m6002equalsimpl0(imeOptions4.getKeyboardType(), KeyboardType.INSTANCE.m6020getNumberPasswordPjHm6EE())) {
                    legacyPlatformTextInputServiceAdapter222222.startStylusHandwriting();
                }
                return true;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue19);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier onGloballyPositioned2222222222 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5222222, legacyPlatformTextInputServiceAdapter222222, legacyTextFieldState, textFieldSelectionManager222222).then(StylusHandwritingKt.stylusHandwriting(companion8222222222, CoreTextField$lambda$11222222222, (Function0) rememberedValue19)).then(modifier3), legacyTextFieldState, focusManager222222), legacyTextFieldState, textFieldSelectionManager222222).then(m1076textFieldKeyInput2WJ9YEU222222222), textFieldScrollerPosition222222, mutableInteractionSource5222222, z4).then(pointerHoverIcon$default222222222).then(semantics222222222), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                TextLayoutResultProxy layoutResult = LegacyTextFieldState.this.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
            }
        });
        if (z4) {
        }
        if (!z11) {
        }
        final Modifier modifier6222222222 = companion;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function34222222222 = function32;
        final TextStyle textStyle5222222222 = textStyle2;
        final int i39222222222 = i21;
        boolean z25222222222 = z4;
        ImeOptions imeOptions9222222222 = imeOptions4;
        final boolean z26222222222 = z11;
        final boolean z27222222222 = z6;
        final Function1<? super TextLayoutResult, Unit> function15222222222 = function13;
        composer2 = startRestartGroup;
        CoreTextFieldRootBox(onGloballyPositioned2222222222, textFieldSelectionManager222222, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
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

            public final void invoke(Composer composer3, int i40) {
                ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                if ((i40 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-374338080, i40, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                    }
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function35 = function34222222222;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final TextStyle textStyle6 = textStyle5222222222;
                    final int i41 = i39222222222;
                    final int i42 = i34222222;
                    final TextFieldScrollerPosition textFieldScrollerPosition2222222 = textFieldScrollerPosition222222;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final VisualTransformation visualTransformation6 = visualTransformation5222222;
                    final Modifier modifier7 = cursor222222222;
                    final Modifier modifier8 = drawBehind222222222;
                    final Modifier modifier9 = onGloballyPositioned322222222;
                    final Modifier modifier10 = modifier6222222222;
                    final BringIntoViewRequester bringIntoViewRequester2222222 = bringIntoViewRequester222222;
                    final TextFieldSelectionManager textFieldSelectionManager2222222 = textFieldSelectionManager222222;
                    final boolean z28 = z26222222222;
                    final boolean z29 = z27222222222;
                    final Function1<? super TextLayoutResult, Unit> function16 = function15222222222;
                    final OffsetMapping offsetMapping2222222 = offsetMapping222222;
                    final Density density2222222 = density222222;
                    function35.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.1
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

                        public final void invoke(Composer composer4, int i43) {
                            ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                            if ((i43 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2032502107, i43, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                }
                                Modifier heightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m714heightInVpY3zN4$default(Modifier.INSTANCE, LegacyTextFieldState.this.m1015getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle6, i41, i42);
                                TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2222222;
                                TextFieldValue textFieldValue3 = textFieldValue2;
                                VisualTransformation visualTransformation7 = visualTransformation6;
                                ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                boolean changedInstance11 = composer4.changedInstance(LegacyTextFieldState.this);
                                final LegacyTextFieldState legacyTextFieldState3 = LegacyTextFieldState.this;
                                Object rememberedValue21 = composer4.rememberedValue();
                                if (changedInstance11 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final TextLayoutResultProxy invoke() {
                                            return LegacyTextFieldState.this.getLayoutResult();
                                        }
                                    };
                                    composer4.updateRememberedValue(rememberedValue21);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                Modifier bringIntoViewRequester3 = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(heightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) rememberedValue21).then(modifier7).then(modifier8), textStyle6).then(modifier9).then(modifier10), bringIntoViewRequester2222222);
                                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2222222;
                                final LegacyTextFieldState legacyTextFieldState4 = LegacyTextFieldState.this;
                                final boolean z30 = z28;
                                final boolean z31 = z29;
                                final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                final TextFieldValue textFieldValue4 = textFieldValue2;
                                final OffsetMapping offsetMapping3 = offsetMapping2222222;
                                final Density density3 = density2222222;
                                final int i44 = i42;
                                SimpleLayoutKt.SimpleLayout(bringIntoViewRequester3, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
                                    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer5, int i45) {
                                        boolean z32;
                                        ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                        if ((i45 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-363167407, i45, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                            }
                                            final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                            final Function1<? super TextLayoutResult, Unit> function18 = function17;
                                            final TextFieldValue textFieldValue5 = textFieldValue4;
                                            final OffsetMapping offsetMapping4 = offsetMapping3;
                                            final Density density4 = density3;
                                            final int i46 = i44;
                                            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                /* renamed from: measure-3p2s80s */
                                                public MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                    Snapshot.Companion companion9 = Snapshot.INSTANCE;
                                                    LegacyTextFieldState legacyTextFieldState6 = LegacyTextFieldState.this;
                                                    Snapshot currentThreadSnapshot = companion9.getCurrentThreadSnapshot();
                                                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                    Snapshot makeCurrentNonObservable = companion9.makeCurrentNonObservable(currentThreadSnapshot);
                                                    try {
                                                        TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                        TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                        Triple<Integer, Integer, TextLayoutResult> m1068layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1068layout_EkL_Y$foundation_release(LegacyTextFieldState.this.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                        int intValue = m1068layout_EkL_Y$foundation_release.component1().intValue();
                                                        int intValue2 = m1068layout_EkL_Y$foundation_release.component2().intValue();
                                                        TextLayoutResult component3 = m1068layout_EkL_Y$foundation_release.component3();
                                                        if (!Intrinsics.areEqual(value, component3)) {
                                                            LegacyTextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                            function18.invoke(component3);
                                                            CoreTextFieldKt.notifyFocusedRect(LegacyTextFieldState.this, textFieldValue5, offsetMapping4);
                                                        }
                                                        LegacyTextFieldState.this.m1019setMinHeightForSingleLineField0680j_4(density4.mo370toDpu2uoSUM(i46 == 1 ? TextDelegateKt.ceilToIntPx(component3.getLineBottom(0)) : 0));
                                                        return measureScope.layout(intValue, intValue2, MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(component3.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(component3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }
                                                        });
                                                    } finally {
                                                        companion9.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                                    }
                                                }

                                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i47) {
                                                    LegacyTextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                    return LegacyTextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                                                }
                                            };
                                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            Modifier.Companion companion9 = Modifier.INSTANCE;
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion9);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer5);
                                            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            composer5.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            TextFieldSelectionManager textFieldSelectionManager4 = TextFieldSelectionManager.this;
                                            if (legacyTextFieldState4.getHandleState() != HandleState.None && legacyTextFieldState4.getLayoutCoordinates() != null) {
                                                LayoutCoordinates layoutCoordinates = legacyTextFieldState4.getLayoutCoordinates();
                                                Intrinsics.checkNotNull(layoutCoordinates);
                                                if (layoutCoordinates.isAttached() && z30) {
                                                    z32 = true;
                                                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                                    if (legacyTextFieldState4.getHandleState() != HandleState.Cursor && !z31 && z30) {
                                                        composer5.startReplaceGroup(-2032274);
                                                        ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                        CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer5, 0);
                                                        composer5.endReplaceGroup();
                                                    } else {
                                                        composer5.startReplaceGroup(-1955394);
                                                        composer5.endReplaceGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        return;
                                                    }
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                            }
                                            z32 = false;
                                            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager4, z32, composer5, 0);
                                            if (legacyTextFieldState4.getHandleState() != HandleState.Cursor) {
                                            }
                                            composer5.startReplaceGroup(-1955394);
                                            composer5.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                        } else {
                                            composer5.skipToGroupEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 48, 0);
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
        }, composer2, 54), composer2, 384);
        if (ComposerKt.isTraceInProgress()) {
        }
        visualTransformation4 = visualTransformation5222222;
        z12 = z25222222222;
        textStyle3 = textStyle2;
        function14 = function13;
        imeOptions5 = imeOptions9222222222;
        brush3 = brush2;
        i28 = i34222222;
        modifier4 = modifier5222222;
        z13 = z5;
        i29 = i21;
        keyboardActions3 = keyboardActions2;
        z14 = z6;
        function33 = function32;
        mutableInteractionSource3 = mutableInteractionSource5222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)P(2,1)802@36846L95:CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20551815, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
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
            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1183915871, "C803@36902L33:CoreTextField.kt#423gt5");
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, startRestartGroup, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
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
                    CoreTextFieldKt.CoreTextFieldRootBox(Modifier.this, textFieldSelectionManager, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m994invokeZmokQxo(keyEvent.m4893unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m994invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m996cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m1395deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m5781getMaximpl(textFieldValue.getSelection()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m6468getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        int i2;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-1286242594);
                ComposerKt.sourceInformation(startRestartGroup, "");
                LegacyTextFieldState state = textFieldSelectionManager.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    if (!(textFieldSelectionManager.getState() != null ? r5.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    startRestartGroup.startReplaceGroup(-1285984396);
                } else {
                    startRestartGroup.startReplaceGroup(-1285984395);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    if (!TextRange.m5778getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                        startRestartGroup.startReplaceGroup(-1680616096);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        int originalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m5784getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m5779getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                        LegacyTextFieldState state2 = textFieldSelectionManager.getState();
                        if (state2 != null && state2.getShowSelectionHandleStart()) {
                            startRestartGroup.startReplaceGroup(-1680216289);
                            ComposerKt.sourceInformation(startRestartGroup, "1158@51449L203");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1679975078);
                            startRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state3 = textFieldSelectionManager.getState();
                        if (state3 != null && state3.getShowSelectionHandleEnd()) {
                            startRestartGroup.startReplaceGroup(-1679895904);
                            ComposerKt.sourceInformation(startRestartGroup, "1165@51772L202");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1679655654);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1679637798);
                        startRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state4 = textFieldSelectionManager.getState();
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
                        Unit unit = Unit.INSTANCE;
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(651305535);
                startRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
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
                    CoreTextFieldKt.SelectionToolbarAndHandles(TextFieldSelectionManager.this, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        int i2;
        AnnotatedString transformedText$foundation_release;
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            LegacyTextFieldState state = textFieldSelectionManager.getState();
            if (state != null && state.getShowCursorHandle() && (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) != null && transformedText$foundation_release.length() > 0) {
                startRestartGroup.startReplaceGroup(-285446808);
                ComposerKt.sourceInformation(startRestartGroup, "1191@52866L50,1192@52979L7,1194@53039L12,1196@53125L601,1208@53754L309,1193@52996L1077");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424850346, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed = startRestartGroup.changed(textFieldSelectionManager);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final long m1401getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m1401getCursorPositiontuRUvjQ$foundation_release((Density) consume);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424844848, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m1401getCursorPositiontuRUvjQ$foundation_release);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (OffsetProvider) new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo971provideF1C5BW0() {
                            return m1401getCursorPositiontuRUvjQ$foundation_release;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424841507, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textDragObserver) | startRestartGroup.changedInstance(textFieldSelectionManager);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function2) new CoreTextFieldKt$TextFieldCursorHandle$2$1(textDragObserver, textFieldSelectionManager, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424821671, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed(m1401getCursorPositiontuRUvjQ$foundation_release);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
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
                            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, m1401getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidCursorHandle_androidKt.m967CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue4, 1, null), 0L, startRestartGroup, 0, 4);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-284257090);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$4
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
                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
