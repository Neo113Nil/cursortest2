package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0099b;
import g.DialogInterfaceC0103f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160i implements InterfaceC0176y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2674a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2675b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0164m f2676c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0175x f2677e;

    /* renamed from: f, reason: collision with root package name */
    public C0159h f2678f;

    public C0160i(ContextWrapper contextWrapper) {
        this.f2674a = contextWrapper;
        this.f2675b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        InterfaceC0175x interfaceC0175x = this.f2677e;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    @Override // k.InterfaceC0176y
    public final void c() {
        C0159h c0159h = this.f2678f;
        if (c0159h != null) {
            c0159h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean d(C0166o c0166o) {
        return false;
    }

    @Override // k.InterfaceC0176y
    public final boolean e(SubMenuC0151E subMenuC0151E) {
        if (!subMenuC0151E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0165n dialogInterfaceOnKeyListenerC0165n = new DialogInterfaceOnKeyListenerC0165n();
        dialogInterfaceOnKeyListenerC0165n.f2706a = subMenuC0151E;
        Context context = subMenuC0151E.f2685a;
        H.j jVar = new H.j(context);
        C0099b c0099b = (C0099b) jVar.f276b;
        C0160i c0160i = new C0160i(c0099b.f2182a);
        dialogInterfaceOnKeyListenerC0165n.f2708c = c0160i;
        c0160i.f2677e = dialogInterfaceOnKeyListenerC0165n;
        subMenuC0151E.b(c0160i, context);
        C0160i c0160i2 = dialogInterfaceOnKeyListenerC0165n.f2708c;
        if (c0160i2.f2678f == null) {
            c0160i2.f2678f = new C0159h(c0160i2);
        }
        c0099b.f2187g = c0160i2.f2678f;
        c0099b.h = dialogInterfaceOnKeyListenerC0165n;
        View view = subMenuC0151E.f2696o;
        if (view != null) {
            c0099b.f2185e = view;
        } else {
            c0099b.f2184c = subMenuC0151E.f2695n;
            c0099b.d = subMenuC0151E.f2694m;
        }
        c0099b.f2186f = dialogInterfaceOnKeyListenerC0165n;
        DialogInterfaceC0103f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0165n.f2707b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0165n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0165n.f2707b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0165n.f2707b.show();
        InterfaceC0175x interfaceC0175x = this.f2677e;
        if (interfaceC0175x == null) {
            return true;
        }
        interfaceC0175x.f(subMenuC0151E);
        return true;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        throw null;
    }

    @Override // k.InterfaceC0176y
    public final boolean h(C0166o c0166o) {
        return false;
    }

    @Override // k.InterfaceC0176y
    public final void j(Context context, MenuC0164m menuC0164m) {
        if (this.f2674a != null) {
            this.f2674a = context;
            if (this.f2675b == null) {
                this.f2675b = LayoutInflater.from(context);
            }
        }
        this.f2676c = menuC0164m;
        C0159h c0159h = this.f2678f;
        if (c0159h != null) {
            c0159h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2676c.q(this.f2678f.getItem(i), this, 0);
    }
}
