package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public w0 f571a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0020p f573c;

    public E(View view, InterfaceC0020p interfaceC0020p) {
        this.f572b = view;
        this.f573c = interfaceC0020p;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 g2 = w0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0020p interfaceC0020p = this.f573c;
        if (i < 30) {
            F.a(windowInsets, this.f572b);
            if (g2.equals(this.f571a)) {
                return interfaceC0020p.d(view, g2).f();
            }
        }
        this.f571a = g2;
        w0 d = interfaceC0020p.d(view, g2);
        if (i >= 30) {
            return d.f();
        }
        WeakHashMap weakHashMap = Q.f578a;
        D.c(view);
        return d.f();
    }
}
