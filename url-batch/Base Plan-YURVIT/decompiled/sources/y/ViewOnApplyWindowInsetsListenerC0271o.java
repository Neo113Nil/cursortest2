package y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0271o implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public Q f3158a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3159b;

    public ViewOnApplyWindowInsetsListenerC0271o(View view, InterfaceC0266j interfaceC0266j) {
        this.f3159b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Q a2 = Q.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0272p.a(windowInsets, this.f3159b);
            if (a2.equals(this.f3158a)) {
                throw null;
            }
        }
        this.f3158a = a2;
        throw null;
    }
}
