package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class jt1 implements InputConnection {
    public final j6 a;
    public u72 b;

    public jt1(u72 u72Var, j6 j6Var) {
        this.a = j6Var;
        this.b = u72Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        u72 u72Var = this.b;
        if (u72Var != null) {
            if (u72Var != null) {
                u72Var.closeConnection();
                this.b = null;
            }
            this.a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        u72 u72Var = this.b;
        if (u72Var != null) {
            return u72Var.setSelection(i, i2);
        }
        return false;
    }
}
