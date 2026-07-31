package a1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import r.RunnableC0789A;

/* renamed from: a1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0171i implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public Q f3554a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0168f f3556c;

    public ViewOnApplyWindowInsetsListenerC0171i(View view, InterfaceC0168f interfaceC0168f) {
        this.f3555b = view;
        this.f3556c = interfaceC0168f;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Q b2 = Q.b(view, windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0168f interfaceC0168f = this.f3556c;
        if (i3 < 30) {
            AbstractC0172j.a(windowInsets, this.f3555b);
            if (b2.equals(this.f3554a)) {
                return ((RunnableC0789A) interfaceC0168f).a(view, b2).a();
            }
        }
        this.f3554a = b2;
        Q a3 = ((RunnableC0789A) interfaceC0168f).a(view, b2);
        if (i3 >= 30) {
            return a3.a();
        }
        int i4 = AbstractC0179q.f3561a;
        AbstractC0170h.c(view);
        return a3.a();
    }
}
