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
    public Context f2652a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2653b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0157m f2654c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0168x f2655e;

    /* renamed from: f, reason: collision with root package name */
    public C0152h f2656f;

    public C0153i(ContextWrapper contextWrapper) {
        this.f2652a = contextWrapper;
        this.f2653b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        InterfaceC0168x interfaceC0168x = this.f2655e;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        C0152h c0152h = this.f2656f;
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
        dialogInterfaceOnKeyListenerC0158n.f2684a = subMenuC0144E;
        Context context = subMenuC0144E.f2663a;
        H.j jVar = new H.j(context);
        C0118b c0118b = (C0118b) jVar.f228b;
        C0153i c0153i = new C0153i(c0118b.f2285a);
        dialogInterfaceOnKeyListenerC0158n.f2686c = c0153i;
        c0153i.f2655e = dialogInterfaceOnKeyListenerC0158n;
        subMenuC0144E.b(c0153i, context);
        C0153i c0153i2 = dialogInterfaceOnKeyListenerC0158n.f2686c;
        if (c0153i2.f2656f == null) {
            c0153i2.f2656f = new C0152h(c0153i2);
        }
        c0118b.f2290g = c0153i2.f2656f;
        c0118b.h = dialogInterfaceOnKeyListenerC0158n;
        View view = subMenuC0144E.f2674o;
        if (view != null) {
            c0118b.f2288e = view;
        } else {
            c0118b.f2287c = subMenuC0144E.f2673n;
            c0118b.d = subMenuC0144E.f2672m;
        }
        c0118b.f2289f = dialogInterfaceOnKeyListenerC0158n;
        DialogInterfaceC0122f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0158n.f2685b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0158n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0158n.f2685b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0158n.f2685b.show();
        InterfaceC0168x interfaceC0168x = this.f2655e;
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
        if (this.f2652a != null) {
            this.f2652a = context;
            if (this.f2653b == null) {
                this.f2653b = LayoutInflater.from(context);
            }
        }
        this.f2654c = menuC0157m;
        C0152h c0152h = this.f2656f;
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
        this.f2654c.q(this.f2656f.getItem(i), this, 0);
    }
}
