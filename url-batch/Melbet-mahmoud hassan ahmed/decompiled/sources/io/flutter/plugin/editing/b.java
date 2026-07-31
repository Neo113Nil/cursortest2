package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import l5.p;

/* loaded from: classes.dex */
public class b extends BaseInputConnection implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private final View f17267a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17268b;

    /* renamed from: c, reason: collision with root package name */
    private final p f17269c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17270d;

    /* renamed from: e, reason: collision with root package name */
    private final EditorInfo f17271e;

    /* renamed from: f, reason: collision with root package name */
    private ExtractedTextRequest f17272f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17273g;

    /* renamed from: h, reason: collision with root package name */
    private CursorAnchorInfo.Builder f17274h;

    /* renamed from: i, reason: collision with root package name */
    private ExtractedText f17275i;

    /* renamed from: j, reason: collision with root package name */
    private InputMethodManager f17276j;

    /* renamed from: k, reason: collision with root package name */
    private final Layout f17277k;

    /* renamed from: l, reason: collision with root package name */
    private io.flutter.plugin.editing.a f17278l;

    /* renamed from: m, reason: collision with root package name */
    private final a f17279m;

    /* renamed from: n, reason: collision with root package name */
    private int f17280n;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public b(View view, int i7, p pVar, a aVar, c cVar, EditorInfo editorInfo) {
        this(view, i7, pVar, aVar, cVar, editorInfo, new FlutterJNI());
    }

    public b(View view, int i7, p pVar, a aVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f17273g = false;
        this.f17275i = new ExtractedText();
        this.f17280n = 0;
        this.f17267a = view;
        this.f17268b = i7;
        this.f17269c = pVar;
        this.f17270d = cVar;
        cVar.a(this);
        this.f17271e = editorInfo;
        this.f17279m = aVar;
        this.f17278l = new io.flutter.plugin.editing.a(flutterJNI);
        this.f17277k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f17276j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i7) {
        if (i7 == 16908319) {
            setSelection(0, this.f17270d.length());
            return true;
        }
        if (i7 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f17270d);
            int selectionEnd = Selection.getSelectionEnd(this.f17270d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f17267a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f17270d.subSequence(min, max)));
                this.f17270d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i7 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f17270d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f17270d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f17267a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f17270d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i7 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f17267a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f17267a.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.f17270d));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.f17270d));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.f17270d.delete(min2, max4);
            }
            this.f17270d.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo c() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        CursorAnchorInfo.Builder builder = this.f17274h;
        if (builder == null) {
            this.f17274h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f17274h.setSelectionRange(this.f17270d.i(), this.f17270d.h());
        int g7 = this.f17270d.g();
        int f7 = this.f17270d.f();
        if (g7 < 0 || f7 <= g7) {
            this.f17274h.setComposingText(-1, "");
        } else {
            this.f17274h.setComposingText(g7, this.f17270d.toString().subSequence(g7, f7));
        }
        return this.f17274h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f17275i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f17270d.i();
        this.f17275i.selectionEnd = this.f17270d.h();
        this.f17275i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f17270d.toString() : this.f17270d;
        return this.f17275i;
    }

    private boolean e(boolean z6, boolean z7) {
        int selectionStart = Selection.getSelectionStart(this.f17270d);
        int selectionEnd = Selection.getSelectionEnd(this.f17270d);
        boolean z8 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z6 ? Math.max(this.f17278l.b(this.f17270d, selectionEnd), 0) : Math.min(this.f17278l.a(this.f17270d, selectionEnd), this.f17270d.length());
        if (selectionStart == selectionEnd && !z7) {
            z8 = true;
        }
        if (z8) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z6, boolean z7) {
        int selectionStart = Selection.getSelectionStart(this.f17270d);
        int selectionEnd = Selection.getSelectionEnd(this.f17270d);
        boolean z8 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z7) {
            z8 = true;
        }
        beginBatchEdit();
        if (z8) {
            if (z6) {
                Selection.moveUp(this.f17270d, this.f17277k);
            } else {
                Selection.moveDown(this.f17270d, this.f17277k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f17270d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z6) {
                Selection.extendUp(this.f17270d, this.f17277k);
            } else {
                Selection.extendDown(this.f17270d, this.f17277k);
            }
            setSelection(Selection.getSelectionStart(this.f17270d), Selection.getSelectionEnd(this.f17270d));
        }
        endBatchEdit();
        return true;
    }

    @Override // io.flutter.plugin.editing.c.b
    public void a(boolean z6, boolean z7, boolean z8) {
        this.f17276j.updateSelection(this.f17267a, this.f17270d.i(), this.f17270d.h(), this.f17270d.g(), this.f17270d.f());
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        ExtractedTextRequest extractedTextRequest = this.f17272f;
        if (extractedTextRequest != null) {
            this.f17276j.updateExtractedText(this.f17267a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f17273g) {
            this.f17276j.updateCursorAnchorInfo(this.f17267a, c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f17270d.b();
        this.f17280n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i7) {
        return super.clearMetaKeyStates(i7);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f17270d.l(this);
        while (this.f17280n > 0) {
            endBatchEdit();
            this.f17280n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i7) {
        return super.commitText(charSequence, i7);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        if (this.f17270d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f17280n--;
        this.f17270d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
                return false;
            }
            int selectionEnd = Selection.getSelectionEnd(this.f17270d);
            setSelection(selectionEnd, selectionEnd);
            return true;
        }
        if (keyEvent.getKeyCode() == 21) {
            return e(true, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 22) {
            return e(false, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 19) {
            return g(true, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 20) {
            return g(false, keyEvent.isShiftPressed());
        }
        if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
            EditorInfo editorInfo = this.f17271e;
            if ((131072 & editorInfo.inputType) == 0) {
                performEditorAction(editorInfo.imeOptions & 255);
                return true;
            }
        }
        int selectionStart = Selection.getSelectionStart(this.f17270d);
        int selectionEnd2 = Selection.getSelectionEnd(this.f17270d);
        int unicodeChar = keyEvent.getUnicodeChar();
        if (selectionStart < 0 || selectionEnd2 < 0 || unicodeChar == 0) {
            return false;
        }
        int min = Math.min(selectionStart, selectionEnd2);
        int max = Math.max(selectionStart, selectionEnd2);
        beginBatchEdit();
        if (min != max) {
            this.f17270d.delete(min, max);
        }
        this.f17270d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
        int i7 = min + 1;
        setSelection(i7, i7);
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f17270d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z6 = (i7 & 1) != 0;
        if (z6 == (this.f17272f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z6 ? "on" : "off");
            z4.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f17272f = z6 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i7) {
        beginBatchEdit();
        boolean b7 = b(i7);
        endBatchEdit();
        return b7;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i7) {
        if (i7 == 0) {
            this.f17269c.n(this.f17268b);
        } else if (i7 == 1) {
            this.f17269c.f(this.f17268b);
        } else if (i7 == 2) {
            this.f17269c.e(this.f17268b);
        } else if (i7 == 3) {
            this.f17269c.k(this.f17268b);
        } else if (i7 == 4) {
            this.f17269c.l(this.f17268b);
        } else if (i7 == 5) {
            this.f17269c.g(this.f17268b);
        } else if (i7 != 7) {
            this.f17269c.d(this.f17268b);
        } else {
            this.f17269c.i(this.f17268b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f17269c.h(this.f17268b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i7) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if ((i7 & 1) != 0) {
            this.f17276j.updateCursorAnchorInfo(this.f17267a, c());
        }
        boolean z6 = (i7 & 2) != 0;
        if (z6 != this.f17273g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z6 ? "on" : "off");
            z4.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f17273g = z6;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f17279m.a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i7, int i8) {
        return super.setComposingRegion(i7, i8);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i7) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i7) : super.setComposingText(charSequence, i7);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i7, int i8) {
        beginBatchEdit();
        boolean selection = super.setSelection(i7, i8);
        endBatchEdit();
        return selection;
    }
}
