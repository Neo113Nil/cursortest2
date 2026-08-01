package K;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024u extends A0.c {

    /* renamed from: c, reason: collision with root package name */
    public View f661c;

    /* JADX WARN: Type inference failed for: r4v0, types: [K.t] */
    @Override // A0.c
    public final void s() {
        int ime;
        View view = this.f661c;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.s();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: K.t
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r4);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r4);
        ime = WindowInsets.Type.ime();
        windowInsetsController.hide(ime);
    }
}
