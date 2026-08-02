package defpackage;

import android.view.ViewTreeObserver;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fnd implements ViewTreeObserver.OnTouchModeChangeListener {
    final /* synthetic */ fng a;

    public fnd(fng fngVar) {
        this.a = fngVar;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        EditText editText;
        if (z) {
            return;
        }
        fng fngVar = this.a;
        if (fngVar.hasWindowFocus()) {
            int i = fngVar.r;
            if (i == 0) {
                throw null;
            }
            if ((i != 4 && i != 3) || (editText = fngVar.k) == null || editText.isFocused()) {
                return;
            }
            editText.post(new fnh(editText, 1));
        }
    }
}
