package U;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f9347a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9348b;

    /* renamed from: c, reason: collision with root package name */
    private f.AbstractC0105f f9349c;

    /* renamed from: d, reason: collision with root package name */
    private int f9350d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f9351e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9352f = true;

    private static class a extends f.AbstractC0105f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f9353a;

        a(EditText editText) {
            this.f9353a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0105f
        public void b() {
            super.b();
            g.b((EditText) this.f9353a.get(), 1);
        }
    }

    g(EditText editText, boolean z4) {
        this.f9347a = editText;
        this.f9348b = z4;
    }

    private f.AbstractC0105f a() {
        if (this.f9349c == null) {
            this.f9349c = new a(this.f9347a);
        }
        return this.f9349c;
    }

    static void b(EditText editText, int i4) {
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f9352f) {
            return (this.f9348b || androidx.emoji2.text.f.i()) ? false : true;
        }
        return true;
    }

    public void c(boolean z4) {
        if (this.f9352f != z4) {
            if (this.f9349c != null) {
                androidx.emoji2.text.f.c().u(this.f9349c);
            }
            this.f9352f = z4;
            if (z4) {
                b(this.f9347a, androidx.emoji2.text.f.c().e());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        if (this.f9347a.isInEditMode() || d() || i5 > i6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int e4 = androidx.emoji2.text.f.c().e();
        if (e4 != 0) {
            if (e4 == 1) {
                androidx.emoji2.text.f.c().s((Spannable) charSequence, i4, i4 + i6, this.f9350d, this.f9351e);
                return;
            } else if (e4 != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }
}
