package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tj extends jj {
    public final WeakReference a;
    public final WeakReference b;

    public tj(TextView textView, uj ujVar) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(ujVar);
    }

    @Override // defpackage.jj
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    lj a = lj.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a.getClass();
                        length = text.length();
                    }
                    CharSequence e = a.e(text, 0, length);
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
