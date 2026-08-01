package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0125b;
import g.DialogInterfaceC0129f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156i implements InterfaceC0172y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2650a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2651b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0160m f2652c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0171x f2653e;

    /* renamed from: f, reason: collision with root package name */
    public C0155h f2654f;

    public C0156i(ContextWrapper contextWrapper) {
        this.f2650a = contextWrapper;
        this.f2651b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0172y
    public final void b(MenuC0160m menuC0160m, boolean z2) {
        InterfaceC0171x interfaceC0171x = this.f2653e;
        if (interfaceC0171x != null) {
            interfaceC0171x.b(menuC0160m, z2);
        }
    }

    @Override // k.InterfaceC0172y
    public final void c() {
        C0155h c0155h = this.f2654f;
        if (c0155h != null) {
            c0155h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0172y
    public final boolean d(C0162o c0162o) {
        return false;
    }

    @Override // k.InterfaceC0172y
    public final boolean f(SubMenuC0147E subMenuC0147E) {
        if (!subMenuC0147E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0161n dialogInterfaceOnKeyListenerC0161n = new DialogInterfaceOnKeyListenerC0161n();
        dialogInterfaceOnKeyListenerC0161n.f2682a = subMenuC0147E;
        Context context = subMenuC0147E.f2661a;
        H.j jVar = new H.j(context);
        C0125b c0125b = (C0125b) jVar.f274b;
        C0156i c0156i = new C0156i(c0125b.f2421a);
        dialogInterfaceOnKeyListenerC0161n.f2684c = c0156i;
        c0156i.f2653e = dialogInterfaceOnKeyListenerC0161n;
        subMenuC0147E.b(c0156i, context);
        C0156i c0156i2 = dialogInterfaceOnKeyListenerC0161n.f2684c;
        if (c0156i2.f2654f == null) {
            c0156i2.f2654f = new C0155h(c0156i2);
        }
        c0125b.f2426g = c0156i2.f2654f;
        c0125b.h = dialogInterfaceOnKeyListenerC0161n;
        View view = subMenuC0147E.f2672o;
        if (view != null) {
            c0125b.f2424e = view;
        } else {
            c0125b.f2423c = subMenuC0147E.f2671n;
            c0125b.d = subMenuC0147E.f2670m;
        }
        c0125b.f2425f = dialogInterfaceOnKeyListenerC0161n;
        DialogInterfaceC0129f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0161n.f2683b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0161n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0161n.f2683b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0161n.f2683b.show();
        InterfaceC0171x interfaceC0171x = this.f2653e;
        if (interfaceC0171x == null) {
            return true;
        }
        interfaceC0171x.h(subMenuC0147E);
        return true;
    }

    @Override // k.InterfaceC0172y
    public final void g(InterfaceC0171x interfaceC0171x) {
        throw null;
    }

    @Override // k.InterfaceC0172y
    public final boolean h(C0162o c0162o) {
        return false;
    }

    @Override // k.InterfaceC0172y
    public final void j(Context context, MenuC0160m menuC0160m) {
        if (this.f2650a != null) {
            this.f2650a = context;
            if (this.f2651b == null) {
                this.f2651b = LayoutInflater.from(context);
            }
        }
        this.f2652c = menuC0160m;
        C0155h c0155h = this.f2654f;
        if (c0155h != null) {
            c0155h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0172y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2652c.q(this.f2654f.getItem(i), this, 0);
    }
}
