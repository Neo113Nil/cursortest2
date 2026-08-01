package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0126b;
import g.DialogInterfaceC0130f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157i implements InterfaceC0173y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2601a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2602b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0161m f2603c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0172x f2604e;

    /* renamed from: f, reason: collision with root package name */
    public C0156h f2605f;

    public C0157i(ContextWrapper contextWrapper) {
        this.f2601a = contextWrapper;
        this.f2602b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0173y
    public final void b(MenuC0161m menuC0161m, boolean z2) {
        InterfaceC0172x interfaceC0172x = this.f2604e;
        if (interfaceC0172x != null) {
            interfaceC0172x.b(menuC0161m, z2);
        }
    }

    @Override // k.InterfaceC0173y
    public final void c() {
        C0156h c0156h = this.f2605f;
        if (c0156h != null) {
            c0156h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0173y
    public final boolean d(C0163o c0163o) {
        return false;
    }

    @Override // k.InterfaceC0173y
    public final boolean e(SubMenuC0148E subMenuC0148E) {
        if (!subMenuC0148E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0162n dialogInterfaceOnKeyListenerC0162n = new DialogInterfaceOnKeyListenerC0162n();
        dialogInterfaceOnKeyListenerC0162n.f2633a = subMenuC0148E;
        Context context = subMenuC0148E.f2612a;
        H.j jVar = new H.j(context);
        C0126b c0126b = (C0126b) jVar.f221b;
        C0157i c0157i = new C0157i(c0126b.f2360a);
        dialogInterfaceOnKeyListenerC0162n.f2635c = c0157i;
        c0157i.f2604e = dialogInterfaceOnKeyListenerC0162n;
        subMenuC0148E.b(c0157i, context);
        C0157i c0157i2 = dialogInterfaceOnKeyListenerC0162n.f2635c;
        if (c0157i2.f2605f == null) {
            c0157i2.f2605f = new C0156h(c0157i2);
        }
        c0126b.f2365g = c0157i2.f2605f;
        c0126b.h = dialogInterfaceOnKeyListenerC0162n;
        View view = subMenuC0148E.f2623o;
        if (view != null) {
            c0126b.f2363e = view;
        } else {
            c0126b.f2362c = subMenuC0148E.f2622n;
            c0126b.d = subMenuC0148E.f2621m;
        }
        c0126b.f2364f = dialogInterfaceOnKeyListenerC0162n;
        DialogInterfaceC0130f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0162n.f2634b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0162n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0162n.f2634b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0162n.f2634b.show();
        InterfaceC0172x interfaceC0172x = this.f2604e;
        if (interfaceC0172x == null) {
            return true;
        }
        interfaceC0172x.f(subMenuC0148E);
        return true;
    }

    @Override // k.InterfaceC0173y
    public final void g(InterfaceC0172x interfaceC0172x) {
        throw null;
    }

    @Override // k.InterfaceC0173y
    public final boolean h(C0163o c0163o) {
        return false;
    }

    @Override // k.InterfaceC0173y
    public final void j(Context context, MenuC0161m menuC0161m) {
        if (this.f2601a != null) {
            this.f2601a = context;
            if (this.f2602b == null) {
                this.f2602b = LayoutInflater.from(context);
            }
        }
        this.f2603c = menuC0161m;
        C0156h c0156h = this.f2605f;
        if (c0156h != null) {
            c0156h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0173y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2603c.q(this.f2605f.getItem(i), this, 0);
    }
}
