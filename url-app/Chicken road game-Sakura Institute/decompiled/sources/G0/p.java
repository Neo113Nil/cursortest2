package G0;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import s0.C1160o0;
import y.InputConnectionC1308B;

/* loaded from: classes.dex */
public class p implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final C1160o0 f3076a;

    /* renamed from: b, reason: collision with root package name */
    public InputConnectionC1308B f3077b;

    public p(InputConnectionC1308B inputConnectionC1308B, C1160o0 c1160o0) {
        this.f3076a = c1160o0;
        this.f3077b = inputConnectionC1308B;
    }

    public final void a(InputConnectionC1308B inputConnectionC1308B) {
        inputConnectionC1308B.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.clearMetaKeyStates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            if (inputConnectionC1308B != null) {
                a(inputConnectionC1308B);
                this.f3077b = null;
            }
            this.f3076a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.commitContent(inputContentInfo, i2, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.commitText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i4) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.deleteSurroundingText(i2, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i4) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.deleteSurroundingTextInCodePoints(i2, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.getCursorCapsMode(i2);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        return inputConnectionC1308B != null ? inputConnectionC1308B.getExtractedText(extractedTextRequest, i2) : new ExtractedText();
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        CharSequence selectedText;
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        return (inputConnectionC1308B == null || (selectedText = inputConnectionC1308B.getSelectedText(i2)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i4) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.getTextAfterCursor(i2, i4);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i4) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.getTextBeforeCursor(i2, i4);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.performContextMenuAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.performEditorAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z4) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.requestCursorUpdates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i4) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.setComposingRegion(i2, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.setComposingText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i4) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.setSelection(i2, i4);
        }
        return false;
    }
}
