package e4;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import c4.k;
import java.lang.ref.WeakReference;
import m.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends c4.i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f3858d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3859e;

    public c(c0 c0Var, d dVar) {
        this.f3858d = new WeakReference(c0Var);
        this.f3859e = new WeakReference(dVar);
    }

    @Override // c4.i
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f3858d.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f3858d.get();
        InputFilter inputFilter = (InputFilter) this.f3859e.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    k a9 = k.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a9.getClass();
                        length = text.length();
                    }
                    CharSequence f3 = a9.f(0, length, 0, text);
                    if (text == f3) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(f3);
                    int selectionEnd = Selection.getSelectionEnd(f3);
                    textView.setText(f3);
                    if (f3 instanceof Spannable) {
                        Spannable spannable = (Spannable) f3;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
