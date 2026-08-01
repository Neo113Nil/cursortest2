package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0152d;
import g.DialogInterfaceC0156h;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198i implements InterfaceC0214y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f3048a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f3049b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0202m f3050c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f3051d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0213x f3052e;

    /* renamed from: f, reason: collision with root package name */
    public C0197h f3053f;

    public C0198i(ContextWrapper contextWrapper) {
        this.f3048a = contextWrapper;
        this.f3049b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        InterfaceC0213x interfaceC0213x = this.f3052e;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, z2);
        }
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        C0197h c0197h = this.f3053f;
        if (c0197h != null) {
            c0197h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean d(C0204o c0204o) {
        return false;
    }

    @Override // k.InterfaceC0214y
    public final boolean f(SubMenuC0189E subMenuC0189E) {
        if (!subMenuC0189E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0203n dialogInterfaceOnKeyListenerC0203n = new DialogInterfaceOnKeyListenerC0203n();
        dialogInterfaceOnKeyListenerC0203n.f3083a = subMenuC0189E;
        Context context = subMenuC0189E.f3061a;
        H.j jVar = new H.j(context);
        C0152d c0152d = (C0152d) jVar.f241b;
        C0198i c0198i = new C0198i(c0152d.f2547a);
        dialogInterfaceOnKeyListenerC0203n.f3085c = c0198i;
        c0198i.f3052e = dialogInterfaceOnKeyListenerC0203n;
        subMenuC0189E.b(c0198i, context);
        C0198i c0198i2 = dialogInterfaceOnKeyListenerC0203n.f3085c;
        if (c0198i2.f3053f == null) {
            c0198i2.f3053f = new C0197h(c0198i2);
        }
        c0152d.f2553g = c0198i2.f3053f;
        c0152d.h = dialogInterfaceOnKeyListenerC0203n;
        View view = subMenuC0189E.f3073o;
        if (view != null) {
            c0152d.f2551e = view;
        } else {
            c0152d.f2549c = subMenuC0189E.f3072n;
            c0152d.f2550d = subMenuC0189E.f3071m;
        }
        c0152d.f2552f = dialogInterfaceOnKeyListenerC0203n;
        DialogInterfaceC0156h b2 = jVar.b();
        dialogInterfaceOnKeyListenerC0203n.f3084b = b2;
        b2.setOnDismissListener(dialogInterfaceOnKeyListenerC0203n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0203n.f3084b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0203n.f3084b.show();
        InterfaceC0213x interfaceC0213x = this.f3052e;
        if (interfaceC0213x == null) {
            return true;
        }
        interfaceC0213x.g(subMenuC0189E);
        return true;
    }

    @Override // k.InterfaceC0214y
    public final void g(InterfaceC0213x interfaceC0213x) {
        throw null;
    }

    @Override // k.InterfaceC0214y
    public final boolean h(C0204o c0204o) {
        return false;
    }

    @Override // k.InterfaceC0214y
    public final void j(Context context, MenuC0202m menuC0202m) {
        if (this.f3048a != null) {
            this.f3048a = context;
            if (this.f3049b == null) {
                this.f3049b = LayoutInflater.from(context);
            }
        }
        this.f3050c = menuC0202m;
        C0197h c0197h = this.f3053f;
        if (c0197h != null) {
            c0197h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f3050c.q(this.f3053f.getItem(i), this, 0);
    }
}
