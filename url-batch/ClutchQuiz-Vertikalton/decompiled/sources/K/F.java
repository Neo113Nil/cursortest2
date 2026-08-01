package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public w0 f358a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0017s f360c;

    public F(View view, InterfaceC0017s interfaceC0017s) {
        this.f359b = view;
        this.f360c = interfaceC0017s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 g2 = w0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0017s interfaceC0017s = this.f360c;
        if (i < 30) {
            G.a(windowInsets, this.f359b);
            if (g2.equals(this.f358a)) {
                return interfaceC0017s.c(view, g2).f();
            }
        }
        this.f358a = g2;
        w0 c2 = interfaceC0017s.c(view, g2);
        if (i >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = S.f365a;
        E.c(view);
        return c2.f();
    }
}
