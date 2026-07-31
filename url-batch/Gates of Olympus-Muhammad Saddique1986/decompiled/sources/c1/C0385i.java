package c1;

import B.Y;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385i extends Y {

    /* renamed from: e, reason: collision with root package name */
    public View f5602e;

    /* JADX WARN: Type inference failed for: r4v0, types: [c1.h] */
    @Override // B.Y
    public final void h() {
        int ime;
        View view = this.f5602e;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.h();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: c1.h
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i3) {
                atomicBoolean.set((i3 & 8) != 0);
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

    @Override // B.Y
    public final void p() {
        int ime;
        View view = this.f5602e;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.p();
    }
}
