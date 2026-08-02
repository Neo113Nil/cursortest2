package io.flutter.plugin.editing;

import E.B;
import E.H;
import E.e0;
import G.a;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.Log;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.android.b;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.ListenableEditingState;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";
    private final AutofillManager afm;
    private SparseArray<TextInputChannel.Configuration> autofillConfiguration;
    private TextInputChannel.Configuration configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private Rect lastClientRect;
    private InputConnection lastInputConnection;
    private ListenableEditingState mEditable;
    private final InputMethodManager mImm;
    private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    private final View mView;
    private PlatformViewsController platformViewsController;
    private PlatformViewsController2 platformViewsController2;
    private final ScribeChannel scribeChannel;
    private final TextInputChannel textInputChannel;

    public static class InputTarget {
        int id;
        Type type;

        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(Type type, int i4) {
            this.type = type;
            this.id = i4;
        }
    }

    public interface MinMax {
        void inspect(double d4, double d5);
    }

    public TextInputPlugin(View view, TextInputChannel textInputChannel, ScribeChannel scribeChannel, PlatformViewsController platformViewsController, PlatformViewsController2 platformViewsController2) {
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            this.afm = b.c(view.getContext().getSystemService(b.i()));
        } else {
            this.afm = null;
        }
        if (i4 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.imeSyncCallback.setImeVisibilityListener(new ImeSyncDeferringInsetsCallback.ImeVisibilityListener() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
                @Override // io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.ImeVisibilityListener
                public void onImeVisibilityChanged(boolean z) {
                    if (z) {
                        return;
                    }
                    TextInputPlugin.this.mImm.restartInput(TextInputPlugin.this.mView);
                }
            });
        }
        this.textInputChannel = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void finishAutofillContext(boolean z) {
                if (Build.VERSION.SDK_INT < 26 || TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z) {
                    TextInputPlugin.this.afm.commit();
                } else {
                    TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setClient(int i5, TextInputChannel.Configuration configuration) {
                TextInputPlugin.this.setTextInputClient(i5, configuration);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditableSizeAndTransform(double d4, double d5, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d4, d5, dArr);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void setPlatformViewClient(int i5, boolean z) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i5, z);
            }

            @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        });
        textInputChannel.requestExistingInputState();
        this.scribeChannel = scribeChannel;
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
        this.platformViewsController2 = platformViewsController2;
        platformViewsController2.attachTextInputPlugin(this);
    }

    private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
        int i4 = textEditState.composingEnd - textEditState.composingStart;
        if (i4 != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (textEditState.text.charAt(textEditState.composingStart + i5) != textEditState2.text.charAt(textEditState2.composingStart + i5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean z, boolean z4, boolean z5, boolean z6, TextInputChannel.TextCapitalization textCapitalization) {
        int i4;
        TextInputChannel.TextInputType textInputType = inputType.type;
        if (textInputType == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputChannel.TextInputType.NUMBER) {
            int i5 = inputType.isSigned ? 4098 : 2;
            return inputType.isDecimal ? i5 | 8192 : i5;
        }
        if (textInputType == TextInputChannel.TextInputType.PHONE) {
            return 3;
        }
        if (textInputType == TextInputChannel.TextInputType.NONE) {
            return 0;
        }
        int i6 = textInputType == TextInputChannel.TextInputType.MULTILINE ? 131073 : (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS || textInputType == TextInputChannel.TextInputType.TWITTER) ? 33 : (textInputType == TextInputChannel.TextInputType.URL || textInputType == TextInputChannel.TextInputType.WEB_SEARCH) ? 17 : textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD ? 145 : textInputType == TextInputChannel.TextInputType.NAME ? 97 : textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS ? 113 : 1;
        if (!z) {
            if (z4) {
                i6 |= 32768;
            }
            i4 = z5 ? 524416 : 524432;
            return textCapitalization != TextInputChannel.TextCapitalization.CHARACTERS ? i6 | 4096 : textCapitalization == TextInputChannel.TextCapitalization.WORDS ? i6 | 8192 : textCapitalization == TextInputChannel.TextCapitalization.SENTENCES ? i6 | 16384 : i6;
        }
        i6 |= i4;
        if (textCapitalization != TextInputChannel.TextCapitalization.CHARACTERS) {
        }
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str2 = this.configuration.autofill.uniqueIdentifier;
        AutofillManager autofillManager = this.afm;
        View view = this.mView;
        int hashCode = str2.hashCode();
        forText = AutofillValue.forText(str);
        autofillManager.notifyValueChanged(view, hashCode, forText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        TextInputChannel.Configuration configuration;
        if (Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.configuration) == null || configuration.autofill == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d4, double d5, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d6 = dArr[12];
        double d7 = dArr[15];
        double d8 = d6 / d7;
        dArr2[1] = d8;
        dArr2[0] = d8;
        double d9 = dArr[13] / d7;
        dArr2[3] = d9;
        dArr2[2] = d9;
        MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.3
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d10, double d11) {
                double d12 = 1.0d;
                if (!z) {
                    double[] dArr3 = dArr;
                    d12 = 1.0d / (((dArr3[7] * d11) + (dArr3[3] * d10)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d13 = ((dArr4[4] * d11) + (dArr4[0] * d10) + dArr4[12]) * d12;
                double d14 = ((dArr4[5] * d11) + (dArr4[1] * d10) + dArr4[13]) * d12;
                double[] dArr5 = dArr2;
                if (d13 < dArr5[0]) {
                    dArr5[0] = d13;
                } else if (d13 > dArr5[1]) {
                    dArr5[1] = d13;
                }
                if (d14 < dArr5[2]) {
                    dArr5[2] = d14;
                } else if (d14 > dArr5[3]) {
                    dArr5[3] = d14;
                }
            }
        };
        minMax.inspect(d4, 0.0d);
        minMax.inspect(d4, d5);
        minMax.inspect(0.0d, d5);
        double d10 = this.mView.getContext().getResources().getDisplayMetrics().density;
        this.lastClientRect = new Rect((int) (dArr2[0] * d10), (int) (dArr2[2] * d10), (int) Math.ceil(dArr2[1] * d10), (int) Math.ceil(dArr2[3] * d10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i4, boolean z) {
        if (!z) {
            this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i4);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i4);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.autofillConfiguration = null;
            return;
        }
        TextInputChannel.Configuration[] configurationArr = configuration.fields;
        SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (TextInputChannel.Configuration configuration2 : configurationArr) {
            TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.autofillConfiguration.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                AutofillManager autofillManager = this.afm;
                View view = this.mView;
                int hashCode = autofill.uniqueIdentifier.hashCode();
                forText = AutofillValue.forText(autofill.editState.text);
                autofillManager.notifyValueChanged(view, hashCode, forText);
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration configuration;
        TextInputChannel.Configuration.Autofill autofill;
        TextInputChannel.Configuration.Autofill autofill2;
        CharSequence textValue;
        if (Build.VERSION.SDK_INT < 26 || (configuration = this.configuration) == null || this.autofillConfiguration == null || (autofill = configuration.autofill) == null) {
            return;
        }
        HashMap<String, TextInputChannel.TextEditState> hashMap = new HashMap<>();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextInputChannel.Configuration configuration2 = this.autofillConfiguration.get(sparseArray.keyAt(i4));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                textValue = b.e(sparseArray.valueAt(i4)).getTextValue();
                String charSequence = textValue.toString();
                TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    this.mEditable.setEditingState(textEditState);
                } else {
                    hashMap.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        this.textInputChannel.updateEditingStateWithTag(this.inputTarget.id, hashMap);
    }

    public void clearPlatformViewClient(int i4) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.id == i4) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        View view = this.mView;
        Field field = H.f375a;
        e0 a3 = B.a(view);
        if (a3 == null || a3.f416a.m(8)) {
            return;
        }
        this.mImm.restartInput(this.mView);
    }

    public InputConnection createInputConnection(View view, KeyboardManager keyboardManager, EditorInfo editorInfo) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection onCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = onCreateInputConnection;
            return onCreateInputConnection;
        }
        TextInputChannel.Configuration configuration = this.configuration;
        int inputTypeFromTextInputType = inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.enableIMEPersonalizedLearning, configuration.textCapitalization);
        editorInfo.inputType = inputTypeFromTextInputType;
        editorInfo.imeOptions = 33554432;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
            editorInfo.imeOptions = 50331648;
        }
        Integer num = this.configuration.inputAction;
        int intValue = num == null ? (inputTypeFromTextInputType & 131072) != 0 ? 1 : 6 : num.intValue();
        TextInputChannel.Configuration configuration2 = this.configuration;
        String str = configuration2.actionLabel;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (configuration2.hintLocales != null) {
            editorInfo.hintLocales = new LocaleList(this.configuration.hintLocales);
        }
        String[] strArr = this.configuration.contentCommitMimeTypes;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i4 >= 34) {
            if (i4 >= 35) {
                a.b(editorInfo);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.id, this.textInputChannel, this.scribeChannel, keyboardManager, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.platformViewsController2.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler(null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r5 == r9.composingEnd) goto L23;
     */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void didChangeEditingState(boolean z, boolean z4, boolean z5) {
        if (z) {
            notifyValueChanged(this.mEditable.toString());
        }
        int selectionStart = this.mEditable.getSelectionStart();
        int selectionEnd = this.mEditable.getSelectionEnd();
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        ArrayList<TextEditingDelta> extractBatchTextEditingDeltas = this.mEditable.extractBatchTextEditingDeltas();
        if (this.mLastKnownFrameworkTextEditingState != null) {
            if (this.mEditable.toString().equals(this.mLastKnownFrameworkTextEditingState.text)) {
                TextInputChannel.TextEditState textEditState = this.mLastKnownFrameworkTextEditingState;
                if (selectionStart == textEditState.selectionStart) {
                    if (selectionEnd == textEditState.selectionEnd) {
                        if (composingStart == textEditState.composingStart) {
                        }
                    }
                }
            }
            Log.v(TAG, "send EditingState to flutter: " + this.mEditable.toString());
            if (this.configuration.enableDeltaModel) {
                this.textInputChannel.updateEditingStateWithDeltas(this.inputTarget.id, extractBatchTextEditingDeltas);
                this.mEditable.clearBatchDeltas();
            } else {
                this.textInputChannel.updateEditingState(this.inputTarget.id, this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
                selectionStart = selectionStart;
                selectionEnd = selectionEnd;
                composingStart = composingStart;
                composingEnd = composingEnd;
            }
            this.mLastKnownFrameworkTextEditingState = new TextInputChannel.TextEditState(this.mEditable.toString(), selectionStart, selectionEnd, composingStart, composingEnd);
            return;
        }
        this.mEditable.clearBatchDeltas();
    }

    public Editable getEditable() {
        return this.mEditable;
    }

    public ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i4) {
        AutofillId autofillId;
        AutofillValue forText;
        Rect rect;
        AutofillValue forText2;
        if (Build.VERSION.SDK_INT < 26 || !needsAutofill()) {
            return;
        }
        String str = this.configuration.autofill.uniqueIdentifier;
        autofillId = viewStructure.getAutofillId();
        for (int i5 = 0; i5 < this.autofillConfiguration.size(); i5++) {
            int keyAt = this.autofillConfiguration.keyAt(i5);
            TextInputChannel.Configuration.Autofill autofill = this.autofillConfiguration.valueAt(i5).autofill;
            if (autofill != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i5);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = autofill.hints;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = autofill.hintText;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.lastClientRect) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    forText = AutofillValue.forText(autofill.editState.text);
                    newChild.setAutofillValue(forText);
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                    forText2 = AutofillValue.forText(this.mEditable);
                    newChild.setAutofillValue(forText2);
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    public void setTextInputClient(int i4, TextInputChannel.Configuration configuration) {
        notifyViewExited();
        this.configuration = configuration;
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i4);
        this.mEditable.removeEditingStateListener(this);
        TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        this.mEditable = new ListenableEditingState(autofill != null ? autofill.editState : null, this.mView);
        updateAutofillConfigurationIfNeeded(configuration);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    public void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean composingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = composingChanged;
            if (composingChanged) {
                Log.i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    public void showTextInput(View view) {
        TextInputChannel.InputType inputType;
        TextInputChannel.Configuration configuration = this.configuration;
        if (configuration != null && (inputType = configuration.inputType) != null && inputType.type == TextInputChannel.TextInputType.NONE) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }
}
