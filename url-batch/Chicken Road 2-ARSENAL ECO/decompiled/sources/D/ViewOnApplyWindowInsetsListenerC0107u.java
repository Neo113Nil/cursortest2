package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0107u implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public Y f307a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f308b;

    public ViewOnApplyWindowInsetsListenerC0107u(View view, InterfaceC0103p interfaceC0103p) {
        this.f308b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Y c7 = Y.c(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0108v.a(windowInsets, this.f308b);
            if (c7.equals(this.f307a)) {
                throw null;
            }
        }
        this.f307a = c7;
        throw null;
    }
}
