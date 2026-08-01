package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0129b;
import g.DialogInterfaceC0133f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163i implements InterfaceC0179y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2735a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2736b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0167m f2737c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0178x f2738e;

    /* renamed from: f, reason: collision with root package name */
    public C0162h f2739f;

    public C0163i(ContextWrapper contextWrapper) {
        this.f2735a = contextWrapper;
        this.f2736b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0179y
    public final void b(MenuC0167m menuC0167m, boolean z2) {
        InterfaceC0178x interfaceC0178x = this.f2738e;
        if (interfaceC0178x != null) {
            interfaceC0178x.b(menuC0167m, z2);
        }
    }

    @Override // k.InterfaceC0179y
    public final void c() {
        C0162h c0162h = this.f2739f;
        if (c0162h != null) {
            c0162h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0179y
    public final boolean d(C0169o c0169o) {
        return false;
    }

    @Override // k.InterfaceC0179y
    public final boolean f(SubMenuC0154E subMenuC0154E) {
        if (!subMenuC0154E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0168n dialogInterfaceOnKeyListenerC0168n = new DialogInterfaceOnKeyListenerC0168n();
        dialogInterfaceOnKeyListenerC0168n.f2767a = subMenuC0154E;
        Context context = subMenuC0154E.f2746a;
        H.j jVar = new H.j(context);
        C0129b c0129b = (C0129b) jVar.f236b;
        C0163i c0163i = new C0163i(c0129b.f2417a);
        dialogInterfaceOnKeyListenerC0168n.f2769c = c0163i;
        c0163i.f2738e = dialogInterfaceOnKeyListenerC0168n;
        subMenuC0154E.b(c0163i, context);
        C0163i c0163i2 = dialogInterfaceOnKeyListenerC0168n.f2769c;
        if (c0163i2.f2739f == null) {
            c0163i2.f2739f = new C0162h(c0163i2);
        }
        c0129b.f2422g = c0163i2.f2739f;
        c0129b.h = dialogInterfaceOnKeyListenerC0168n;
        View view = subMenuC0154E.f2757o;
        if (view != null) {
            c0129b.f2420e = view;
        } else {
            c0129b.f2419c = subMenuC0154E.f2756n;
            c0129b.d = subMenuC0154E.f2755m;
        }
        c0129b.f2421f = dialogInterfaceOnKeyListenerC0168n;
        DialogInterfaceC0133f b2 = jVar.b();
        dialogInterfaceOnKeyListenerC0168n.f2768b = b2;
        b2.setOnDismissListener(dialogInterfaceOnKeyListenerC0168n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0168n.f2768b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0168n.f2768b.show();
        InterfaceC0178x interfaceC0178x = this.f2738e;
        if (interfaceC0178x == null) {
            return true;
        }
        interfaceC0178x.g(subMenuC0154E);
        return true;
    }

    @Override // k.InterfaceC0179y
    public final void g(InterfaceC0178x interfaceC0178x) {
        throw null;
    }

    @Override // k.InterfaceC0179y
    public final boolean h(C0169o c0169o) {
        return false;
    }

    @Override // k.InterfaceC0179y
    public final void j(Context context, MenuC0167m menuC0167m) {
        if (this.f2735a != null) {
            this.f2735a = context;
            if (this.f2736b == null) {
                this.f2736b = LayoutInflater.from(context);
            }
        }
        this.f2737c = menuC0167m;
        C0162h c0162h = this.f2739f;
        if (c0162h != null) {
            c0162h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0179y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2737c.q(this.f2739f.getItem(i), this, 0);
    }
}
