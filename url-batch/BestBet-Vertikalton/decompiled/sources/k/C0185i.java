package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0121b;
import g.DialogInterfaceC0125f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185i implements InterfaceC0202z, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f3152a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f3153b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0189m f3154c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0201y f3155e;

    /* renamed from: f, reason: collision with root package name */
    public C0184h f3156f;

    public C0185i(ContextWrapper contextWrapper) {
        this.f3152a = contextWrapper;
        this.f3153b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0202z
    public final void b(MenuC0189m menuC0189m, boolean z2) {
        InterfaceC0201y interfaceC0201y = this.f3155e;
        if (interfaceC0201y != null) {
            interfaceC0201y.b(menuC0189m, z2);
        }
    }

    @Override // k.InterfaceC0202z
    public final void c() {
        C0184h c0184h = this.f3156f;
        if (c0184h != null) {
            c0184h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0202z
    public final boolean d(C0192p c0192p) {
        return false;
    }

    @Override // k.InterfaceC0202z
    public final boolean e(SubMenuC0176F subMenuC0176F) {
        if (!subMenuC0176F.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0190n dialogInterfaceOnKeyListenerC0190n = new DialogInterfaceOnKeyListenerC0190n();
        dialogInterfaceOnKeyListenerC0190n.f3184a = subMenuC0176F;
        Context context = subMenuC0176F.f3163a;
        C0.f fVar = new C0.f(context);
        C0121b c0121b = (C0121b) fVar.f96b;
        C0185i c0185i = new C0185i((ContextThemeWrapper) c0121b.f2641c);
        dialogInterfaceOnKeyListenerC0190n.f3186c = c0185i;
        c0185i.f3155e = dialogInterfaceOnKeyListenerC0190n;
        subMenuC0176F.b(c0185i, context);
        C0185i c0185i2 = dialogInterfaceOnKeyListenerC0190n.f3186c;
        if (c0185i2.f3156f == null) {
            c0185i2.f3156f = new C0184h(c0185i2);
        }
        c0121b.i = c0185i2.f3156f;
        c0121b.f2645j = dialogInterfaceOnKeyListenerC0190n;
        View view = subMenuC0176F.f3174o;
        if (view != null) {
            c0121b.f2644g = view;
        } else {
            c0121b.f2642e = subMenuC0176F.f3173n;
            c0121b.f2643f = subMenuC0176F.f3172m;
        }
        c0121b.h = dialogInterfaceOnKeyListenerC0190n;
        DialogInterfaceC0125f a2 = fVar.a();
        dialogInterfaceOnKeyListenerC0190n.f3185b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0190n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0190n.f3185b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0190n.f3185b.show();
        InterfaceC0201y interfaceC0201y = this.f3155e;
        if (interfaceC0201y == null) {
            return true;
        }
        interfaceC0201y.c(subMenuC0176F);
        return true;
    }

    @Override // k.InterfaceC0202z
    public final void g(InterfaceC0201y interfaceC0201y) {
        throw null;
    }

    @Override // k.InterfaceC0202z
    public final boolean h(C0192p c0192p) {
        return false;
    }

    @Override // k.InterfaceC0202z
    public final void j(Context context, MenuC0189m menuC0189m) {
        if (this.f3152a != null) {
            this.f3152a = context;
            if (this.f3153b == null) {
                this.f3153b = LayoutInflater.from(context);
            }
        }
        this.f3154c = menuC0189m;
        C0184h c0184h = this.f3156f;
        if (c0184h != null) {
            c0184h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0202z
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f3154c.q(this.f3156f.getItem(i), this, 0);
    }
}
