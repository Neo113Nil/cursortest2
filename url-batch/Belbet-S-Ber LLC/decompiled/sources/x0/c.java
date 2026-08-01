package x0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends androidx.emoji2.text.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3842a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3843b;

    public c(TextView textView, d dVar) {
        this.f3842a = new WeakReference(textView);
        this.f3843b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f3842a.get();
        InputFilter inputFilter = (InputFilter) this.f3843b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    l a5 = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a5.getClass();
                        length = text.length();
                    }
                    CharSequence e4 = a5.e(text, 0, length);
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
