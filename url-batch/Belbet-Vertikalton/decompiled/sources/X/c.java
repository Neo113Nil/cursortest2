package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends V.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1351a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f1352b;

    public c(TextView textView, d dVar) {
        this.f1351a = new WeakReference(textView);
        this.f1352b = new WeakReference(dVar);
    }

    @Override // V.h
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1351a.get();
        InputFilter inputFilter = (InputFilter) this.f1352b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    V.j a2 = V.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a2.getClass();
                        length = text.length();
                    }
                    CharSequence e = a2.e(text, 0, length);
                    if (text == e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e);
                    int selectionEnd = Selection.getSelectionEnd(e);
                    textView.setText(e);
                    if (e instanceof Spannable) {
                        Spannable spannable = (Spannable) e;
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
