package M;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class D implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public t0 f703a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0020p f705c;

    public D(View view, InterfaceC0020p interfaceC0020p) {
        this.f704b = view;
        this.f705c = interfaceC0020p;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t0 g2 = t0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0020p interfaceC0020p = this.f705c;
        if (i < 30) {
            E.a(windowInsets, this.f704b);
            if (g2.equals(this.f703a)) {
                return interfaceC0020p.e(view, g2).f();
            }
        }
        this.f703a = g2;
        t0 e = interfaceC0020p.e(view, g2);
        if (i >= 30) {
            return e.f();
        }
        WeakHashMap weakHashMap = P.f711a;
        C.c(view);
        return e.f();
    }
}
