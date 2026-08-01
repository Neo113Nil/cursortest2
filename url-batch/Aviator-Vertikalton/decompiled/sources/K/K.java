package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public B0 f410a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0025v f412c;

    public K(View view, InterfaceC0025v interfaceC0025v) {
        this.f411b = view;
        this.f412c = interfaceC0025v;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        B0 g2 = B0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0025v interfaceC0025v = this.f412c;
        if (i < 30) {
            L.a(windowInsets, this.f411b);
            if (g2.equals(this.f410a)) {
                return interfaceC0025v.c(view, g2).f();
            }
        }
        this.f410a = g2;
        B0 c2 = interfaceC0025v.c(view, g2);
        if (i >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = X.f418a;
        J.c(view);
        return c2.f();
    }
}
