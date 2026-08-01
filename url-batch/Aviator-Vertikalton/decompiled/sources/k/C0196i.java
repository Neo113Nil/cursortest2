package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0151d;
import g.DialogInterfaceC0155h;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196i implements InterfaceC0212y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f3044a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f3045b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0200m f3046c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f3047d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0211x f3048e;

    /* renamed from: f, reason: collision with root package name */
    public C0195h f3049f;

    public C0196i(ContextWrapper contextWrapper) {
        this.f3044a = contextWrapper;
        this.f3045b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0212y
    public final void b(MenuC0200m menuC0200m, boolean z2) {
        InterfaceC0211x interfaceC0211x = this.f3048e;
        if (interfaceC0211x != null) {
            interfaceC0211x.b(menuC0200m, z2);
        }
    }

    @Override // k.InterfaceC0212y
    public final void c() {
        C0195h c0195h = this.f3049f;
        if (c0195h != null) {
            c0195h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0212y
    public final boolean d(C0202o c0202o) {
        return false;
    }

    @Override // k.InterfaceC0212y
    public final boolean e(SubMenuC0187E subMenuC0187E) {
        if (!subMenuC0187E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0201n dialogInterfaceOnKeyListenerC0201n = new DialogInterfaceOnKeyListenerC0201n();
        dialogInterfaceOnKeyListenerC0201n.f3079a = subMenuC0187E;
        Context context = subMenuC0187E.f3057a;
        H.j jVar = new H.j(context);
        C0151d c0151d = (C0151d) jVar.f242b;
        C0196i c0196i = new C0196i(c0151d.f2543a);
        dialogInterfaceOnKeyListenerC0201n.f3081c = c0196i;
        c0196i.f3048e = dialogInterfaceOnKeyListenerC0201n;
        subMenuC0187E.b(c0196i, context);
        C0196i c0196i2 = dialogInterfaceOnKeyListenerC0201n.f3081c;
        if (c0196i2.f3049f == null) {
            c0196i2.f3049f = new C0195h(c0196i2);
        }
        c0151d.f2549g = c0196i2.f3049f;
        c0151d.h = dialogInterfaceOnKeyListenerC0201n;
        View view = subMenuC0187E.f3069o;
        if (view != null) {
            c0151d.f2547e = view;
        } else {
            c0151d.f2545c = subMenuC0187E.f3068n;
            c0151d.f2546d = subMenuC0187E.f3067m;
        }
        c0151d.f2548f = dialogInterfaceOnKeyListenerC0201n;
        DialogInterfaceC0155h a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0201n.f3080b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0201n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0201n.f3080b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0201n.f3080b.show();
        InterfaceC0211x interfaceC0211x = this.f3048e;
        if (interfaceC0211x == null) {
            return true;
        }
        interfaceC0211x.f(subMenuC0187E);
        return true;
    }

    @Override // k.InterfaceC0212y
    public final void g(InterfaceC0211x interfaceC0211x) {
        throw null;
    }

    @Override // k.InterfaceC0212y
    public final boolean h(C0202o c0202o) {
        return false;
    }

    @Override // k.InterfaceC0212y
    public final void j(Context context, MenuC0200m menuC0200m) {
        if (this.f3044a != null) {
            this.f3044a = context;
            if (this.f3045b == null) {
                this.f3045b = LayoutInflater.from(context);
            }
        }
        this.f3046c = menuC0200m;
        C0195h c0195h = this.f3049f;
        if (c0195h != null) {
            c0195h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0212y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f3046c.q(this.f3049f.getItem(i), this, 0);
    }
}
