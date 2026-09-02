package w0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends androidx.emoji2.text.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3562a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f3563b;

    public d(TextView textView, e eVar) {
        this.f3562a = new WeakReference(textView);
        this.f3563b = new WeakReference(eVar);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f3562a.get();
        InputFilter inputFilter = (InputFilter) this.f3563b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    l a2 = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a2.getClass();
                        length = text.length();
                    }
                    CharSequence e4 = a2.e(text, 0, length);
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
