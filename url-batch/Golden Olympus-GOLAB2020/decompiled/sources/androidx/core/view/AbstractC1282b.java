package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1282b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11937a;

    /* renamed from: b, reason: collision with root package name */
    private a f11938b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0099b f11939c;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0099b {
        void onActionProviderVisibilityChanged(boolean z4);
    }

    public AbstractC1282b(Context context) {
        this.f11937a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f11939c = null;
        this.f11938b = null;
    }

    public void h(a aVar) {
        this.f11938b = aVar;
    }

    public abstract void i(InterfaceC0099b interfaceC0099b);
}
