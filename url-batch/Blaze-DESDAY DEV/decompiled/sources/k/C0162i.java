package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0101b;
import g.DialogInterfaceC0105f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162i implements InterfaceC0178y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2702a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2703b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0166m f2704c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0177x f2705e;

    /* renamed from: f, reason: collision with root package name */
    public C0161h f2706f;

    public C0162i(ContextWrapper contextWrapper) {
        this.f2702a = contextWrapper;
        this.f2703b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0178y
    public final void b(MenuC0166m menuC0166m, boolean z2) {
        InterfaceC0177x interfaceC0177x = this.f2705e;
        if (interfaceC0177x != null) {
            interfaceC0177x.b(menuC0166m, z2);
        }
    }

    @Override // k.InterfaceC0178y
    public final void c() {
        C0161h c0161h = this.f2706f;
        if (c0161h != null) {
            c0161h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0178y
    public final boolean d(C0168o c0168o) {
        return false;
    }

    @Override // k.InterfaceC0178y
    public final boolean f(SubMenuC0153E subMenuC0153E) {
        if (!subMenuC0153E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0167n dialogInterfaceOnKeyListenerC0167n = new DialogInterfaceOnKeyListenerC0167n();
        dialogInterfaceOnKeyListenerC0167n.f2734a = subMenuC0153E;
        Context context = subMenuC0153E.f2713a;
        H.j jVar = new H.j(context);
        C0101b c0101b = (C0101b) jVar.f293b;
        C0162i c0162i = new C0162i(c0101b.f2222a);
        dialogInterfaceOnKeyListenerC0167n.f2736c = c0162i;
        c0162i.f2705e = dialogInterfaceOnKeyListenerC0167n;
        subMenuC0153E.b(c0162i, context);
        C0162i c0162i2 = dialogInterfaceOnKeyListenerC0167n.f2736c;
        if (c0162i2.f2706f == null) {
            c0162i2.f2706f = new C0161h(c0162i2);
        }
        c0101b.f2227g = c0162i2.f2706f;
        c0101b.h = dialogInterfaceOnKeyListenerC0167n;
        View view = subMenuC0153E.f2724o;
        if (view != null) {
            c0101b.f2225e = view;
        } else {
            c0101b.f2224c = subMenuC0153E.f2723n;
            c0101b.d = subMenuC0153E.f2722m;
        }
        c0101b.f2226f = dialogInterfaceOnKeyListenerC0167n;
        DialogInterfaceC0105f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0167n.f2735b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0167n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0167n.f2735b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0167n.f2735b.show();
        InterfaceC0177x interfaceC0177x = this.f2705e;
        if (interfaceC0177x == null) {
            return true;
        }
        interfaceC0177x.g(subMenuC0153E);
        return true;
    }

    @Override // k.InterfaceC0178y
    public final void g(InterfaceC0177x interfaceC0177x) {
        throw null;
    }

    @Override // k.InterfaceC0178y
    public final boolean h(C0168o c0168o) {
        return false;
    }

    @Override // k.InterfaceC0178y
    public final void j(Context context, MenuC0166m menuC0166m) {
        if (this.f2702a != null) {
            this.f2702a = context;
            if (this.f2703b == null) {
                this.f2703b = LayoutInflater.from(context);
            }
        }
        this.f2704c = menuC0166m;
        C0161h c0161h = this.f2706f;
        if (c0161h != null) {
            c0161h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0178y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2704c.q(this.f2706f.getItem(i), this, 0);
    }
}
