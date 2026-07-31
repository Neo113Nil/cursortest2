package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jg\u0010\u001e\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u0010:\u001a\u00020\f2\u0006\u00103\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR/\u0010H\u001a\u0004\u0018\u00010B2\b\u00103\u001a\u0004\u0018\u00010B8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00105\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010O\u001a\u00020I2\u0006\u00103\u001a\u00020I8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u00105\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u00107\"\u0004\bS\u00109R+\u0010W\u001a\u00020\f2\u0006\u00103\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bT\u00105\u001a\u0004\bU\u00107\"\u0004\bV\u00109R+\u0010[\u001a\u00020\f2\u0006\u00103\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u00105\u001a\u0004\bY\u00107\"\u0004\bZ\u00109R+\u0010_\u001a\u00020\f2\u0006\u00103\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u00105\u001a\u0004\b]\u00107\"\u0004\b^\u00109R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010d\u001a\u0004\be\u0010fR&\u0010h\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00140\u00128\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bi\u0010fR\u0017\u0010k\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;)V", "Landroidx/compose/ui/text/AnnotatedString;", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "update-aKPr-nQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "update", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "Landroidx/compose/ui/text/input/TextInputSession;", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "<set-?>", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResult$delegate", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "Landroidx/compose/foundation/text/HandleState;", "handleState$delegate", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "showFloatingToolbar", "Z", "getShowFloatingToolbar", "setShowFloatingToolbar", "showSelectionHandleStart$delegate", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart", "showSelectionHandleEnd$delegate", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd", "showCursorHandle$delegate", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "keyboardActionRunner", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "onValueChangeOriginal", "Lkotlin/jvm/functions/Function1;", "getOnValueChange", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "getOnImeActionPerformed", "Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextFieldState {

    /* renamed from: handleState$delegate, reason: from kotlin metadata */
    private final MutableState handleState;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private TextInputSession inputSession;
    private final KeyboardActionRunner keyboardActionRunner;
    private LayoutCoordinates layoutCoordinates;

    /* renamed from: layoutResult$delegate, reason: from kotlin metadata */
    private final MutableState layoutResult;
    private final Function1 onImeActionPerformed;
    private final Function1 onValueChange;
    private Function1 onValueChangeOriginal;
    private final EditProcessor processor;
    private final RecomposeScope recomposeScope;
    private final Paint selectionPaint;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final MutableState showCursorHandle;
    private boolean showFloatingToolbar;

    /* renamed from: showSelectionHandleEnd$delegate, reason: from kotlin metadata */
    private final MutableState showSelectionHandleEnd;

    /* renamed from: showSelectionHandleStart$delegate, reason: from kotlin metadata */
    private final MutableState showSelectionHandleStart;
    private TextDelegate textDelegate;

    public TextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.processor = new EditProcessor();
        Boolean bool = Boolean.FALSE;
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.layoutResult = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showSelectionHandleStart = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.keyboardActionRunner = new KeyboardActionRunner();
        this.onValueChangeOriginal = new Function1() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChangeOriginal$1
            public final void invoke(@NotNull TextFieldValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return Unit.INSTANCE;
            }
        };
        this.onValueChange = new Function1() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChange$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull TextFieldValue it) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!Intrinsics.areEqual(it.getText(), TextFieldState.this.getTextDelegate().getText().getText())) {
                    TextFieldState.this.setHandleState(HandleState.None);
                }
                function1 = TextFieldState.this.onValueChangeOriginal;
                function1.invoke(it);
                TextFieldState.this.getRecomposeScope().invalidate();
            }
        };
        this.onImeActionPerformed = new Function1() { // from class: androidx.compose.foundation.text.TextFieldState$onImeActionPerformed$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m596invokeKlQnJC8(((ImeAction) obj).getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m596invokeKlQnJC8(int i) {
                KeyboardActionRunner keyboardActionRunner;
                keyboardActionRunner = TextFieldState.this.keyboardActionRunner;
                keyboardActionRunner.m535runActionKlQnJC8(i);
            }
        };
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return (TextLayoutResultProxy) this.layoutResult.getValue();
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResult.setValue(textLayoutResultProxy);
    }

    public final HandleState getHandleState() {
        return (HandleState) this.handleState.getValue();
    }

    public final void setHandleState(HandleState handleState) {
        Intrinsics.checkNotNullParameter(handleState, "<set-?>");
        this.handleState.setValue(handleState);
    }

    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar = z;
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z));
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z));
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(Boolean.valueOf(z));
    }

    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    public final Function1 getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* renamed from: update-aKPr-nQ, reason: not valid java name */
    public final void m595updateaKPrnQ(AnnotatedString visualText, TextStyle textStyle, boolean softWrap, Density density, FontFamily.Resolver fontFamilyResolver, Function1 onValueChange, KeyboardActions keyboardActions, FocusManager focusManager, long selectionBackgroundColor) {
        TextDelegate m529updateTextDelegatex_uQXYA;
        Intrinsics.checkNotNullParameter(visualText, "visualText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.mo1367setColor8_81llA(selectionBackgroundColor);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        m529updateTextDelegatex_uQXYA = CoreTextKt.m529updateTextDelegatex_uQXYA(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, (r20 & 32) != 0 ? true : softWrap, (r20 & 64) != 0 ? TextOverflow.INSTANCE.m2473getClipgIe3tQ8() : 0, (r20 & 128) != 0 ? Integer.MAX_VALUE : 0, CollectionsKt.emptyList());
        this.textDelegate = m529updateTextDelegatex_uQXYA;
    }
}
