package W;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends U.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2770a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2771b;

    public c(TextView textView, d dVar) {
        this.f2770a = new WeakReference(textView);
        this.f2771b = new WeakReference(dVar);
    }

    @Override // U.h
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f2770a.get();
        InputFilter inputFilter = (InputFilter) this.f2771b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    U.j a7 = U.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a7.getClass();
                        length = text.length();
                    }
                    CharSequence e7 = a7.e(text, 0, length);
                    if (text == e7) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e7);
                    int selectionEnd = Selection.getSelectionEnd(e7);
                    textView.setText(e7);
                    if (e7 instanceof Spannable) {
                        Spannable spannable = (Spannable) e7;
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
