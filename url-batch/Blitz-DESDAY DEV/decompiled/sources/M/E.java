package M;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public v0 f506a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0016q f508c;

    public E(View view, InterfaceC0016q interfaceC0016q) {
        this.f507b = view;
        this.f508c = interfaceC0016q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v0 g2 = v0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0016q interfaceC0016q = this.f508c;
        if (i < 30) {
            F.a(windowInsets, this.f507b);
            if (g2.equals(this.f506a)) {
                return interfaceC0016q.d(view, g2).f();
            }
        }
        this.f506a = g2;
        v0 d = interfaceC0016q.d(view, g2);
        if (i >= 30) {
            return d.f();
        }
        WeakHashMap weakHashMap = Q.f513a;
        D.c(view);
        return d.f();
    }
}
