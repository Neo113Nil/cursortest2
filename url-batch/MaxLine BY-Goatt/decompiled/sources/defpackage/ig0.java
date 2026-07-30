package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ig0 extends yf0 implements Runnable {
    public final WeakReference m;
    public final WeakReference n;

    public ig0(TextView textView, jg0 jg0Var) {
        this.m = new WeakReference(textView);
        this.n = new WeakReference(jg0Var);
    }

    @Override // defpackage.yf0
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.m.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.m.get();
        InputFilter inputFilter = (InputFilter) this.n.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    ag0 a = ag0.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a.getClass();
                        length = text.length();
                    }
                    CharSequence g = a.g(0, length, 0, text);
                    if (text == g) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(g);
                    int selectionEnd = Selection.getSelectionEnd(g);
                    textView.setText(g);
                    if (g instanceof Spannable) {
                        Spannable spannable = (Spannable) g;
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
