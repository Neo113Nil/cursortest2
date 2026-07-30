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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class je1 implements InputConnection {
    public final y PxuCJdSBwIXG;
    public lt1 lS5Rgt96tfkO;

    public je1(lt1 lt1Var, y yVar) {
        this.PxuCJdSBwIXG = yVar;
        this.lS5Rgt96tfkO = lt1Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            if (lt1Var != null) {
                lt1Var.closeConnection();
                this.lS5Rgt96tfkO = null;
            }
            this.PxuCJdSBwIXG.OPXfSBeufaJ8(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.lS5Rgt96tfkO();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.setSelection(i, i2);
        }
        return false;
    }
}
