package I;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import i.C0531r;

/* loaded from: classes.dex */
public final class J implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public v0 f1146a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0124u f1148c;

    public J(View view, InterfaceC0124u interfaceC0124u) {
        this.f1147b = view;
        this.f1148c = interfaceC0124u;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v0 c7 = v0.c(windowInsets, view);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0124u interfaceC0124u = this.f1148c;
        if (i2 < 30) {
            K.a(windowInsets, this.f1147b);
            if (c7.equals(this.f1146a)) {
                return ((C0531r) interfaceC0124u).b(view, c7).b();
            }
        }
        this.f1146a = c7;
        v0 b7 = ((C0531r) interfaceC0124u).b(view, c7);
        if (i2 >= 30) {
            return b7.b();
        }
        view.requestApplyInsets();
        return b7.b();
    }
}
