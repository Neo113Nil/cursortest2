package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0099b;
import g.DialogInterfaceC0103f;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165i implements InterfaceC0181y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2804a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2805b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0169m f2806c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0180x f2807e;

    /* renamed from: f, reason: collision with root package name */
    public C0164h f2808f;

    public C0165i(ContextWrapper contextWrapper) {
        this.f2804a = contextWrapper;
        this.f2805b = LayoutInflater.from(contextWrapper);
    }

    @Override // l.InterfaceC0181y
    public final void b(MenuC0169m menuC0169m, boolean z2) {
        InterfaceC0180x interfaceC0180x = this.f2807e;
        if (interfaceC0180x != null) {
            interfaceC0180x.b(menuC0169m, z2);
        }
    }

    @Override // l.InterfaceC0181y
    public final void c() {
        C0164h c0164h = this.f2808f;
        if (c0164h != null) {
            c0164h.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC0181y
    public final void d(Context context, MenuC0169m menuC0169m) {
        if (this.f2804a != null) {
            this.f2804a = context;
            if (this.f2805b == null) {
                this.f2805b = LayoutInflater.from(context);
            }
        }
        this.f2806c = menuC0169m;
        C0164h c0164h = this.f2808f;
        if (c0164h != null) {
            c0164h.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC0181y
    public final boolean e(SubMenuC0156E subMenuC0156E) {
        if (!subMenuC0156E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0170n dialogInterfaceOnKeyListenerC0170n = new DialogInterfaceOnKeyListenerC0170n();
        dialogInterfaceOnKeyListenerC0170n.f2837a = subMenuC0156E;
        Context context = subMenuC0156E.f2815a;
        I.i iVar = new I.i(context);
        C0099b c0099b = (C0099b) iVar.f336b;
        C0165i c0165i = new C0165i(c0099b.f2300a);
        dialogInterfaceOnKeyListenerC0170n.f2839c = c0165i;
        c0165i.f2807e = dialogInterfaceOnKeyListenerC0170n;
        subMenuC0156E.b(c0165i, context);
        C0165i c0165i2 = dialogInterfaceOnKeyListenerC0170n.f2839c;
        if (c0165i2.f2808f == null) {
            c0165i2.f2808f = new C0164h(c0165i2);
        }
        c0099b.f2305g = c0165i2.f2808f;
        c0099b.f2306h = dialogInterfaceOnKeyListenerC0170n;
        View view = subMenuC0156E.f2827o;
        if (view != null) {
            c0099b.f2303e = view;
        } else {
            c0099b.f2302c = subMenuC0156E.f2826n;
            c0099b.d = subMenuC0156E.f2825m;
        }
        c0099b.f2304f = dialogInterfaceOnKeyListenerC0170n;
        DialogInterfaceC0103f a2 = iVar.a();
        dialogInterfaceOnKeyListenerC0170n.f2838b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0170n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0170n.f2838b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0170n.f2838b.show();
        InterfaceC0180x interfaceC0180x = this.f2807e;
        if (interfaceC0180x == null) {
            return true;
        }
        interfaceC0180x.j(subMenuC0156E);
        return true;
    }

    @Override // l.InterfaceC0181y
    public final void g(InterfaceC0180x interfaceC0180x) {
        throw null;
    }

    @Override // l.InterfaceC0181y
    public final boolean h(C0171o c0171o) {
        return false;
    }

    @Override // l.InterfaceC0181y
    public final boolean i() {
        return false;
    }

    @Override // l.InterfaceC0181y
    public final boolean k(C0171o c0171o) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2806c.q(this.f2808f.getItem(i), this, 0);
    }
}
