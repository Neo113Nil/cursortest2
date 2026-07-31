package androidx.compose.ui.text.input;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.TextRange;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001HB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\t0\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u000bJ\u0013\u0010%\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R(\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\t0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R%\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u001b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b \u00101R$\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroid/view/View;", "view", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;)V", "(Landroid/view/View;)V", "", "restartInputImmediately", "()V", "", VastAttributes.VISIBLE, "setKeyboardVisibleImmediately", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "isEditorFocused", "()Z", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "stopInput", "showSoftwareKeyboard", "textInputCommandEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oldValue", "newValue", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/text/input/InputMethodManager;", "editorHasFocus", "Z", "Lkotlin/jvm/functions/Function1;", "<set-?>", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/ImeOptions;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "ic", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "textInputCommandChannel", "Lkotlinx/coroutines/channels/Channel;", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {

    /* renamed from: baseInputConnection$delegate, reason: from kotlin metadata */
    private final Lazy baseInputConnection;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private RecordingInputConnection ic;
    private ImeOptions imeOptions;
    private final InputMethodManager inputMethodManager;
    private Function1 onEditCommand;
    private Function1 onImeActionPerformed;
    private TextFieldValue state;
    private final Channel textInputCommandChannel;
    private final View view;

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            iArr[TextInputCommand.StartInput.ordinal()] = 1;
            iArr[TextInputCommand.StopInput.ordinal()] = 2;
            iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(View view, InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.onEditCommand = new Function1() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void invoke(@NotNull List<? extends EditCommand> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return Unit.INSTANCE;
            }
        };
        this.onImeActionPerformed = new Function1() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m2386invokeKlQnJC8(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2386invokeKlQnJC8(((ImeAction) obj).getValue());
                return Unit.INSTANCE;
            }
        };
        this.state = new TextFieldValue("", TextRange.INSTANCE.m2254getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.INSTANCE.getDefault();
        this.baseInputConnection = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final BaseInputConnection mo4828invoke() {
                return new BaseInputConnection(TextInputServiceAndroid.this.getView(), false);
            }
        });
        this.textInputCommandChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    public final View getView() {
        return this.view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputServiceAndroid(View view) {
        this(view, new InputMethodManagerImpl(r1));
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
    }

    public final InputConnection createInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(outAttrs, this.imeOptions, this.state);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List editCommands) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(editCommands, "editCommands");
                function1 = TextInputServiceAndroid.this.onEditCommand;
                function1.invoke(editCommands);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo2354onImeActionKlQnJC8(int imeAction) {
                Function1 function1;
                function1 = TextInputServiceAndroid.this.onImeActionPerformed;
                function1.invoke(ImeAction.m2336boximpl(imeAction));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent event) {
                BaseInputConnection baseInputConnection;
                Intrinsics.checkNotNullParameter(event, "event");
                baseInputConnection = TextInputServiceAndroid.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(event);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ic = recordingInputConnection;
        return recordingInputConnection;
    }

    /* renamed from: isEditorFocused, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue value, ImeOptions imeOptions, Function1 onEditCommand, Function1 onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        this.textInputCommandChannel.mo8216trySendJP2dKIU(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new Function1() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            public final void invoke(@NotNull List<? extends EditCommand> it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return Unit.INSTANCE;
            }
        };
        this.onImeActionPerformed = new Function1() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m2387invokeKlQnJC8(int i) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2387invokeKlQnJC8(((ImeAction) obj).getValue());
                return Unit.INSTANCE;
            }
        };
        this.focusedRect = null;
        this.textInputCommandChannel.mo8216trySendJP2dKIU(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        this.textInputCommandChannel.mo8216trySendJP2dKIU(TextInputCommand.ShowKeyboard);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:10:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object textInputCommandEventLoop(Continuation continuation) {
        TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$1;
        int i;
        TextInputServiceAndroid textInputServiceAndroid;
        ChannelIterator it;
        if (continuation instanceof TextInputServiceAndroid$textInputCommandEventLoop$1) {
            textInputServiceAndroid$textInputCommandEventLoop$1 = (TextInputServiceAndroid$textInputCommandEventLoop$1) continuation;
            int i2 = textInputServiceAndroid$textInputCommandEventLoop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textInputServiceAndroid$textInputCommandEventLoop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = textInputServiceAndroid$textInputCommandEventLoop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = textInputServiceAndroid$textInputCommandEventLoop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    textInputServiceAndroid = this;
                    it = this.textInputCommandChannel.iterator();
                    textInputServiceAndroid$textInputCommandEventLoop$1.L$0 = textInputServiceAndroid;
                    textInputServiceAndroid$textInputCommandEventLoop$1.L$1 = it;
                    textInputServiceAndroid$textInputCommandEventLoop$1.label = 1;
                    obj = it.hasNext(textInputServiceAndroid$textInputCommandEventLoop$1);
                    if (obj == coroutine_suspended) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ChannelIterator) textInputServiceAndroid$textInputCommandEventLoop$1.L$1;
                    textInputServiceAndroid = (TextInputServiceAndroid) textInputServiceAndroid$textInputCommandEventLoop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        if (!textInputServiceAndroid.view.isFocused()) {
                            while (ChannelResult.m8226isSuccessimpl(textInputServiceAndroid.textInputCommandChannel.mo8215tryReceivePtdJZtk())) {
                            }
                        } else {
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                            for (TextInputCommand textInputCommand = (TextInputCommand) it.next(); textInputCommand != null; textInputCommand = (TextInputCommand) ChannelResult.m8223getOrNullimpl(textInputServiceAndroid.textInputCommandChannel.mo8215tryReceivePtdJZtk())) {
                                textInputCommandEventLoop$applyToState(textInputCommand, ref$ObjectRef, ref$ObjectRef2);
                            }
                            if (Intrinsics.areEqual(ref$ObjectRef.element, Boxing.boxBoolean(true))) {
                                textInputServiceAndroid.restartInputImmediately();
                            }
                            Boolean bool = (Boolean) ref$ObjectRef2.element;
                            if (bool != null) {
                                textInputServiceAndroid.setKeyboardVisibleImmediately(bool.booleanValue());
                            }
                            if (Intrinsics.areEqual(ref$ObjectRef.element, Boxing.boxBoolean(false))) {
                                textInputServiceAndroid.restartInputImmediately();
                            }
                        }
                        textInputServiceAndroid$textInputCommandEventLoop$1.L$0 = textInputServiceAndroid;
                        textInputServiceAndroid$textInputCommandEventLoop$1.L$1 = it;
                        textInputServiceAndroid$textInputCommandEventLoop$1.label = 1;
                        obj = it.hasNext(textInputServiceAndroid$textInputCommandEventLoop$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        textInputServiceAndroid$textInputCommandEventLoop$1 = new TextInputServiceAndroid$textInputCommandEventLoop$1(this, continuation);
        Object obj2 = textInputServiceAndroid$textInputCommandEventLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = textInputServiceAndroid$textInputCommandEventLoop$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void textInputCommandEventLoop$applyToState(TextInputCommand textInputCommand, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        int i = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i == 1) {
            ?? r3 = Boolean.TRUE;
            ref$ObjectRef.element = r3;
            ref$ObjectRef2.element = r3;
        } else if (i == 2) {
            ?? r32 = Boolean.FALSE;
            ref$ObjectRef.element = r32;
            ref$ObjectRef2.element = r32;
        } else if ((i == 3 || i == 4) && !Intrinsics.areEqual(ref$ObjectRef.element, Boolean.FALSE)) {
            ref$ObjectRef2.element = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue oldValue, TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean z = (TextRange.m2242equalsimpl0(this.state.getSelection(), newValue.getSelection()) && Intrinsics.areEqual(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        RecordingInputConnection recordingInputConnection = this.ic;
        if (recordingInputConnection != null) {
            recordingInputConnection.setMTextFieldValue$ui_release(newValue);
        }
        if (Intrinsics.areEqual(oldValue, newValue)) {
            if (z) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                View view = this.view;
                int m2247getMinimpl = TextRange.m2247getMinimpl(newValue.getSelection());
                int m2246getMaximpl = TextRange.m2246getMaximpl(newValue.getSelection());
                TextRange composition = this.state.getComposition();
                int m2247getMinimpl2 = composition != null ? TextRange.m2247getMinimpl(composition.getPackedValue()) : -1;
                TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(view, m2247getMinimpl, m2246getMaximpl, m2247getMinimpl2, composition2 != null ? TextRange.m2246getMaximpl(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!Intrinsics.areEqual(oldValue.getText(), newValue.getText()) || (TextRange.m2242equalsimpl0(oldValue.getSelection(), newValue.getSelection()) && !Intrinsics.areEqual(oldValue.getComposition(), newValue.getComposition())))) {
            restartInputImmediately();
            return;
        }
        RecordingInputConnection recordingInputConnection2 = this.ic;
        if (recordingInputConnection2 != null) {
            recordingInputConnection2.updateInputState(this.state, this.inputMethodManager, this.view);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput(this.view);
    }

    private final void setKeyboardVisibleImmediately(boolean visible) {
        if (visible) {
            this.inputMethodManager.showSoftInput(this.view);
        } else {
            this.inputMethodManager.hideSoftInputFromWindow(this.view.getWindowToken());
        }
    }
}
