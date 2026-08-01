package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0121b;
import g.DialogInterfaceC0125f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153i implements InterfaceC0169y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2637a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2638b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0157m f2639c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0168x f2640e;

    /* renamed from: f, reason: collision with root package name */
    public C0152h f2641f;

    public C0153i(ContextWrapper contextWrapper) {
        this.f2637a = contextWrapper;
        this.f2638b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        InterfaceC0168x interfaceC0168x = this.f2640e;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, z2);
        }
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        C0152h c0152h = this.f2641f;
        if (c0152h != null) {
            c0152h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean d(C0159o c0159o) {
        return false;
    }

    @Override // k.InterfaceC0169y
    public final boolean f(SubMenuC0144E subMenuC0144E) {
        if (!subMenuC0144E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0158n dialogInterfaceOnKeyListenerC0158n = new DialogInterfaceOnKeyListenerC0158n();
        dialogInterfaceOnKeyListenerC0158n.f2669a = subMenuC0144E;
        Context context = subMenuC0144E.f2648a;
        H.j jVar = new H.j(context);
        C0121b c0121b = (C0121b) jVar.f290b;
        C0153i c0153i = new C0153i(c0121b.f2400a);
        dialogInterfaceOnKeyListenerC0158n.f2671c = c0153i;
        c0153i.f2640e = dialogInterfaceOnKeyListenerC0158n;
        subMenuC0144E.b(c0153i, context);
        C0153i c0153i2 = dialogInterfaceOnKeyListenerC0158n.f2671c;
        if (c0153i2.f2641f == null) {
            c0153i2.f2641f = new C0152h(c0153i2);
        }
        c0121b.f2405g = c0153i2.f2641f;
        c0121b.h = dialogInterfaceOnKeyListenerC0158n;
        View view = subMenuC0144E.f2659o;
        if (view != null) {
            c0121b.f2403e = view;
        } else {
            c0121b.f2402c = subMenuC0144E.f2658n;
            c0121b.d = subMenuC0144E.f2657m;
        }
        c0121b.f2404f = dialogInterfaceOnKeyListenerC0158n;
        DialogInterfaceC0125f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0158n.f2670b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0158n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0158n.f2670b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0158n.f2670b.show();
        InterfaceC0168x interfaceC0168x = this.f2640e;
        if (interfaceC0168x == null) {
            return true;
        }
        interfaceC0168x.g(subMenuC0144E);
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
        if (this.f2637a != null) {
            this.f2637a = context;
            if (this.f2638b == null) {
                this.f2638b = LayoutInflater.from(context);
            }
        }
        this.f2639c = menuC0157m;
        C0152h c0152h = this.f2641f;
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
        this.f2639c.q(this.f2641f.getItem(i), this, 0);
    }
}
