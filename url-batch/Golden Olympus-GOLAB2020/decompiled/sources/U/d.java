package U;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f9336a;

    /* renamed from: b, reason: collision with root package name */
    private f.AbstractC0105f f9337b;

    private static class a extends f.AbstractC0105f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f9338a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference f9339b;

        a(TextView textView, d dVar) {
            this.f9338a = new WeakReference(textView);
            this.f9339b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.f.AbstractC0105f
        public void b() {
            CharSequence text;
            CharSequence p4;
            super.b();
            TextView textView = (TextView) this.f9338a.get();
            if (c(textView, (InputFilter) this.f9339b.get()) && textView.isAttachedToWindow() && text != (p4 = androidx.emoji2.text.f.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(p4);
                int selectionEnd = Selection.getSelectionEnd(p4);
                textView.setText(p4);
                if (p4 instanceof Spannable) {
                    d.b((Spannable) p4, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f9336a = textView;
    }

    private f.AbstractC0105f a() {
        if (this.f9337b == null) {
            this.f9337b = new a(this.f9336a, this);
        }
        return this.f9337b;
    }

    static void b(Spannable spannable, int i4, int i5) {
        if (i4 >= 0 && i5 >= 0) {
            Selection.setSelection(spannable, i4, i5);
        } else if (i4 >= 0) {
            Selection.setSelection(spannable, i4);
        } else if (i5 >= 0) {
            Selection.setSelection(spannable, i5);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        if (this.f9336a.isInEditMode()) {
            return charSequence;
        }
        int e4 = androidx.emoji2.text.f.c().e();
        if (e4 != 0) {
            if (e4 == 1) {
                if (i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == this.f9336a.getText()) {
                    return charSequence;
                }
                if (charSequence == null) {
                    return charSequence;
                }
                if (i4 != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i4, i5);
                }
                return androidx.emoji2.text.f.c().q(charSequence, 0, charSequence.length());
            }
            if (e4 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.c().t(a());
        return charSequence;
    }
}
