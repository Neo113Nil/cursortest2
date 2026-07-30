package g2;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import s1.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class n implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f4048a;

    /* renamed from: b, reason: collision with root package name */
    public y.w f4049b;

    public n(y.w wVar, l0 l0Var) {
        this.f4048a = l0Var;
        this.f4049b = wVar;
    }

    public final void a(y.w wVar) {
        wVar.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.clearMetaKeyStates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            if (wVar != null) {
                a(wVar);
                this.f4049b = null;
            }
            this.f4048a.f(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.commitContent(inputContentInfo, i7, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.commitText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.deleteSurroundingText(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.deleteSurroundingTextInCodePoints(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.getCursorCapsMode(i7);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        y.w wVar = this.f4049b;
        return wVar != null ? wVar.getExtractedText(extractedTextRequest, i7) : new ExtractedText();
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        CharSequence selectedText;
        y.w wVar = this.f4049b;
        return (wVar == null || (selectedText = wVar.getSelectedText(i7)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.getTextAfterCursor(i7, i8);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.getTextBeforeCursor(i7, i8);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.performContextMenuAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.performEditorAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z8) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.requestCursorUpdates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.setComposingRegion(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.setComposingText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        y.w wVar = this.f4049b;
        if (wVar != null) {
            return wVar.setSelection(i7, i8);
        }
        return false;
    }
}
