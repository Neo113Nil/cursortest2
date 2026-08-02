package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahq extends aid {
    private EditText aj;
    private CharSequence ak;
    private final Runnable al = new nc(this, 15, null);
    private long am = -1;

    private final EditTextPreference aL() {
        return (EditTextPreference) aK();
    }

    private final void aM(boolean z) {
        this.am = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // defpackage.aid
    protected final void aF(View view) {
        super.aF(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.aj = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.aj.setText(this.ak);
        EditText editText2 = this.aj;
        editText2.setSelection(editText2.getText().length());
        aL();
    }

    @Override // defpackage.aid
    public final void aG(boolean z) {
        if (z) {
            String obj = this.aj.getText().toString();
            EditTextPreference aL = aL();
            if (aL.L(obj)) {
                aL.i(obj);
            }
        }
    }

    @Override // defpackage.aid
    protected final void aH() {
        aM(true);
        aI();
    }

    public final void aI() {
        long j = this.am;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.aj;
        if (editText == null || !editText.isFocused()) {
            aM(false);
            return;
        }
        if (((InputMethodManager) this.aj.getContext().getSystemService("input_method")).showSoftInput(this.aj, 0)) {
            aM(false);
            return;
        }
        EditText editText2 = this.aj;
        Runnable runnable = this.al;
        editText2.removeCallbacks(runnable);
        this.aj.postDelayed(runnable, 50L);
    }

    @Override // defpackage.aid
    protected final boolean aJ() {
        return true;
    }

    @Override // defpackage.aid, defpackage.ar, defpackage.bd
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle == null) {
            this.ak = aL().g;
        } else {
            this.ak = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.aid, defpackage.ar, defpackage.bd
    public final void i(Bundle bundle) {
        super.i(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ak);
    }
}
