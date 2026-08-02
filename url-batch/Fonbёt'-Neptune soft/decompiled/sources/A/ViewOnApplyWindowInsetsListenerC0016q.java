package A;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: A.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0016q implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public T f56a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f57b;

    public ViewOnApplyWindowInsetsListenerC0016q(View view, InterfaceC0011l interfaceC0011l) {
        this.f57b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        T a2 = T.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            r.a(windowInsets, this.f57b);
            if (a2.equals(this.f56a)) {
                throw null;
            }
        }
        this.f56a = a2;
        throw null;
    }
}
