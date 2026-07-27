package a1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import w2.C1294c;

/* renamed from: a1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394i extends C1294c {

    /* renamed from: i, reason: collision with root package name */
    public View f4884i;

    /* JADX WARN: Type inference failed for: r4v0, types: [a1.h] */
    @Override // w2.C1294c
    public final void g() {
        int ime;
        View view = this.f4884i;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.g();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: a1.h
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i2) {
                atomicBoolean.set((i2 & 8) != 0);
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

    @Override // w2.C1294c
    public final void p() {
        int ime;
        View view = this.f4884i;
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
