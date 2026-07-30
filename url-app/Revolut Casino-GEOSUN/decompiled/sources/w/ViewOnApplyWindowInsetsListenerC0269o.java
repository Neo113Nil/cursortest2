package w;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: w.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0269o implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public S f3073a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3074b;

    public ViewOnApplyWindowInsetsListenerC0269o(View view, InterfaceC0264j interfaceC0264j) {
        this.f3074b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        S a2 = S.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0270p.a(windowInsets, this.f3074b);
            if (a2.equals(this.f3073a)) {
                throw null;
            }
        }
        this.f3073a = a2;
        throw null;
    }
}
