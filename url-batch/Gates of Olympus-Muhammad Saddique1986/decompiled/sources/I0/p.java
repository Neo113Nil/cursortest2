package I0;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import r0.C0929z;
import z.InputConnectionC1234B;

/* loaded from: classes.dex */
public class p implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final C0929z f3080a;

    /* renamed from: b, reason: collision with root package name */
    public InputConnectionC1234B f3081b;

    public p(InputConnectionC1234B inputConnectionC1234B, C0929z c0929z) {
        this.f3080a = c0929z;
        this.f3081b = inputConnectionC1234B;
    }

    public final void a(InputConnectionC1234B inputConnectionC1234B) {
        inputConnectionC1234B.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.clearMetaKeyStates(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            if (inputConnectionC1234B != null) {
                a(inputConnectionC1234B);
                this.f3081b = null;
            }
            this.f3080a.n(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.commitText(charSequence, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.deleteSurroundingText(i3, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.deleteSurroundingTextInCodePoints(i3, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.getCursorCapsMode(i3);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        return inputConnectionC1234B != null ? inputConnectionC1234B.getExtractedText(extractedTextRequest, i3) : new ExtractedText();
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i3) {
        CharSequence selectedText;
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        return (inputConnectionC1234B == null || (selectedText = inputConnectionC1234B.getSelectedText(i3)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i3, int i4) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.getTextAfterCursor(i3, i4);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i3, int i4) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.getTextBeforeCursor(i3, i4);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.performContextMenuAction(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.performEditorAction(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.requestCursorUpdates(i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i3, int i4) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.setComposingRegion(i3, i4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i3) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.setComposingText(charSequence, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i3, int i4) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.setSelection(i3, i4);
        }
        return false;
    }
}
