package t0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends androidx.emoji2.text.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3365a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3366b;

    public c(TextView textView, d dVar) {
        this.f3365a = new WeakReference(textView);
        this.f3366b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f3365a.get();
        InputFilter inputFilter = (InputFilter) this.f3366b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    l a4 = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a4.getClass();
                        length = text.length();
                    }
                    CharSequence e4 = a4.e(text, 0, length);
                    if (text == e4) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e4);
                    int selectionEnd = Selection.getSelectionEnd(e4);
                    textView.setText(e4);
                    if (e4 instanceof Spannable) {
                        Spannable spannable = (Spannable) e4;
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
