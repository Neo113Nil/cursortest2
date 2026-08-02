package E;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* renamed from: E.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0017s implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public W f301a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0010k f303c;

    public ViewOnApplyWindowInsetsListenerC0017s(View view, InterfaceC0010k interfaceC0010k) {
        this.f302b = view;
        this.f303c = interfaceC0010k;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        W b3 = W.b(windowInsets, view);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0010k interfaceC0010k = this.f303c;
        if (i3 < 30) {
            AbstractC0018t.a(windowInsets, this.f302b);
            if (b3.equals(this.f301a)) {
                return interfaceC0010k.c(b3).a();
            }
        }
        this.f301a = b3;
        W c3 = interfaceC0010k.c(b3);
        if (i3 >= 30) {
            return c3.a();
        }
        Field field = A.f243a;
        r.a(view);
        return c3.a();
    }
}
