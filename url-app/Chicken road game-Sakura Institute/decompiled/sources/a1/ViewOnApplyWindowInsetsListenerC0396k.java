package a1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import q.RunnableC1012P;

/* renamed from: a1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0396k implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public C0383T f4885a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0391f f4887c;

    public ViewOnApplyWindowInsetsListenerC0396k(View view, InterfaceC0391f interfaceC0391f) {
        this.f4886b = view;
        this.f4887c = interfaceC0391f;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0383T b4 = C0383T.b(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0391f interfaceC0391f = this.f4887c;
        if (i2 < 30) {
            AbstractC0397l.a(windowInsets, this.f4886b);
            if (b4.equals(this.f4885a)) {
                return ((RunnableC1012P) interfaceC0391f).a(view, b4).a();
            }
        }
        this.f4885a = b4;
        C0383T a4 = ((RunnableC1012P) interfaceC0391f).a(view, b4);
        if (i2 >= 30) {
            return a4.a();
        }
        int i4 = AbstractC0404s.f4892a;
        AbstractC0395j.c(view);
        return a4.a();
    }
}
