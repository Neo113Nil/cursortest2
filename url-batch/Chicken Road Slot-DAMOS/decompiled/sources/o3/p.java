package o3;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends l.d {

    /* renamed from: i, reason: collision with root package name */
    public View f7430i;

    /* JADX WARN: Type inference failed for: r4v0, types: [o3.o] */
    @Override // l.d
    public final void t() {
        int ime;
        View view = this.f7430i;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.t();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: o3.o
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i3) {
                atomicBoolean.set((i3 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r42);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r42);
        ime = WindowInsets.Type.ime();
        windowInsetsController.hide(ime);
    }
}
