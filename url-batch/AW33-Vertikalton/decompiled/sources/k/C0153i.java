package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0118b;
import g.DialogInterfaceC0122f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153i implements InterfaceC0169y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2670a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2671b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0157m f2672c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0168x f2673e;

    /* renamed from: f, reason: collision with root package name */
    public C0152h f2674f;

    public C0153i(ContextWrapper contextWrapper) {
        this.f2670a = contextWrapper;
        this.f2671b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        InterfaceC0168x interfaceC0168x = this.f2673e;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        C0152h c0152h = this.f2674f;
        if (c0152h != null) {
            c0152h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean d(C0159o c0159o) {
        return false;
    }

    @Override // k.InterfaceC0169y
    public final boolean e(SubMenuC0144E subMenuC0144E) {
        if (!subMenuC0144E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0158n dialogInterfaceOnKeyListenerC0158n = new DialogInterfaceOnKeyListenerC0158n();
        dialogInterfaceOnKeyListenerC0158n.f2702a = subMenuC0144E;
        Context context = subMenuC0144E.f2681a;
        H.j jVar = new H.j(context);
        C0118b c0118b = (C0118b) jVar.f228b;
        C0153i c0153i = new C0153i(c0118b.f2286a);
        dialogInterfaceOnKeyListenerC0158n.f2704c = c0153i;
        c0153i.f2673e = dialogInterfaceOnKeyListenerC0158n;
        subMenuC0144E.b(c0153i, context);
        C0153i c0153i2 = dialogInterfaceOnKeyListenerC0158n.f2704c;
        if (c0153i2.f2674f == null) {
            c0153i2.f2674f = new C0152h(c0153i2);
        }
        c0118b.f2291g = c0153i2.f2674f;
        c0118b.h = dialogInterfaceOnKeyListenerC0158n;
        View view = subMenuC0144E.f2692o;
        if (view != null) {
            c0118b.f2289e = view;
        } else {
            c0118b.f2288c = subMenuC0144E.f2691n;
            c0118b.d = subMenuC0144E.f2690m;
        }
        c0118b.f2290f = dialogInterfaceOnKeyListenerC0158n;
        DialogInterfaceC0122f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0158n.f2703b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0158n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0158n.f2703b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0158n.f2703b.show();
        InterfaceC0168x interfaceC0168x = this.f2673e;
        if (interfaceC0168x == null) {
            return true;
        }
        interfaceC0168x.c(subMenuC0144E);
        return true;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        throw null;
    }

    @Override // k.InterfaceC0169y
    public final boolean h(C0159o c0159o) {
        return false;
    }

    @Override // k.InterfaceC0169y
    public final void j(Context context, MenuC0157m menuC0157m) {
        if (this.f2670a != null) {
            this.f2670a = context;
            if (this.f2671b == null) {
                this.f2671b = LayoutInflater.from(context);
            }
        }
        this.f2672c = menuC0157m;
        C0152h c0152h = this.f2674f;
        if (c0152h != null) {
            c0152h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2672c.q(this.f2674f.getItem(i), this, 0);
    }
}
