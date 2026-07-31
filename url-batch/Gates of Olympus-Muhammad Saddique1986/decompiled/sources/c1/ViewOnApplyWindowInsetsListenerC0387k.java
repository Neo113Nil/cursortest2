package c1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import r.RunnableC0841C;

/* renamed from: c1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0387k implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public U f5603a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0382f f5605c;

    public ViewOnApplyWindowInsetsListenerC0387k(View view, InterfaceC0382f interfaceC0382f) {
        this.f5604b = view;
        this.f5605c = interfaceC0382f;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        U b3 = U.b(view, windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0382f interfaceC0382f = this.f5605c;
        if (i3 < 30) {
            AbstractC0388l.a(windowInsets, this.f5604b);
            if (b3.equals(this.f5603a)) {
                return ((RunnableC0841C) interfaceC0382f).a(view, b3).a();
            }
        }
        this.f5603a = b3;
        U a3 = ((RunnableC0841C) interfaceC0382f).a(view, b3);
        if (i3 >= 30) {
            return a3.a();
        }
        int i4 = AbstractC0394s.f5610a;
        AbstractC0386j.c(view);
        return a3.a();
    }
}
