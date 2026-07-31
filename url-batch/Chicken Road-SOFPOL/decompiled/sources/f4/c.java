package f4;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import d4.l;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends d4.i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2722d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f2723e;

    public c(TextView textView, d dVar) {
        this.f2722d = new WeakReference(textView);
        this.f2723e = new WeakReference(dVar);
    }

    @Override // d4.i
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f2722d.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f2722d.get();
        InputFilter inputFilter = (InputFilter) this.f2723e.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    l a8 = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a8.getClass();
                        length = text.length();
                    }
                    CharSequence f6 = a8.f(0, length, 0, text);
                    if (text == f6) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(f6);
                    int selectionEnd = Selection.getSelectionEnd(f6);
                    textView.setText(f6);
                    if (f6 instanceof Spannable) {
                        Spannable spannable = (Spannable) f6;
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
