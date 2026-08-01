package K;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class B extends B0.d {

    /* renamed from: d, reason: collision with root package name */
    public View f393d;

    /* JADX WARN: Type inference failed for: r4v0, types: [K.A] */
    @Override // B0.d
    public final void x() {
        int ime;
        View view = this.f393d;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.x();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: K.A
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
