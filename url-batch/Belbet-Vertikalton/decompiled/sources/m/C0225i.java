package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.C0125b;
import h.DialogInterfaceC0129f;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225i implements InterfaceC0241y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f3337a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f3338b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0229m f3339c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f3340d;
    public InterfaceC0240x e;

    /* renamed from: f, reason: collision with root package name */
    public C0224h f3341f;

    public C0225i(ContextWrapper contextWrapper) {
        this.f3337a = contextWrapper;
        this.f3338b = LayoutInflater.from(contextWrapper);
    }

    @Override // m.InterfaceC0241y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        InterfaceC0240x interfaceC0240x = this.e;
        if (interfaceC0240x != null) {
            interfaceC0240x.b(menuC0229m, z2);
        }
    }

    @Override // m.InterfaceC0241y
    public final boolean c(C0231o c0231o) {
        return false;
    }

    @Override // m.InterfaceC0241y
    public final void d() {
        C0224h c0224h = this.f3341f;
        if (c0224h != null) {
            c0224h.notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC0241y
    public final void f(Context context, MenuC0229m menuC0229m) {
        if (this.f3337a != null) {
            this.f3337a = context;
            if (this.f3338b == null) {
                this.f3338b = LayoutInflater.from(context);
            }
        }
        this.f3339c = menuC0229m;
        C0224h c0224h = this.f3341f;
        if (c0224h != null) {
            c0224h.notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC0241y
    public final boolean g() {
        return false;
    }

    @Override // m.InterfaceC0241y
    public final void i(InterfaceC0240x interfaceC0240x) {
        throw null;
    }

    @Override // m.InterfaceC0241y
    public final boolean j(C0231o c0231o) {
        return false;
    }

    @Override // m.InterfaceC0241y
    public final boolean k(SubMenuC0216E subMenuC0216E) {
        if (!subMenuC0216E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0230n dialogInterfaceOnKeyListenerC0230n = new DialogInterfaceOnKeyListenerC0230n();
        dialogInterfaceOnKeyListenerC0230n.f3369a = subMenuC0216E;
        Context context = subMenuC0216E.f3348a;
        D1.p pVar = new D1.p(context);
        C0125b c0125b = (C0125b) pVar.f271b;
        C0225i c0225i = new C0225i(c0125b.f2770a);
        dialogInterfaceOnKeyListenerC0230n.f3371c = c0225i;
        c0225i.e = dialogInterfaceOnKeyListenerC0230n;
        subMenuC0216E.b(c0225i, context);
        C0225i c0225i2 = dialogInterfaceOnKeyListenerC0230n.f3371c;
        if (c0225i2.f3341f == null) {
            c0225i2.f3341f = new C0224h(c0225i2);
        }
        c0125b.f2775g = c0225i2.f3341f;
        c0125b.f2776h = dialogInterfaceOnKeyListenerC0230n;
        View view = subMenuC0216E.f3359o;
        if (view != null) {
            c0125b.e = view;
        } else {
            c0125b.f2772c = subMenuC0216E.f3358n;
            c0125b.f2773d = subMenuC0216E.f3357m;
        }
        c0125b.f2774f = dialogInterfaceOnKeyListenerC0230n;
        DialogInterfaceC0129f a2 = pVar.a();
        dialogInterfaceOnKeyListenerC0230n.f3370b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0230n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0230n.f3370b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0230n.f3370b.show();
        InterfaceC0240x interfaceC0240x = this.e;
        if (interfaceC0240x == null) {
            return true;
        }
        interfaceC0240x.g(subMenuC0216E);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f3339c.q(this.f3341f.getItem(i), this, 0);
    }
}
