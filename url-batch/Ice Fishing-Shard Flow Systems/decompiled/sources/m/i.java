package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import i.C0518e;
import i.DialogInterfaceC0522i;

/* loaded from: classes.dex */
public final class i implements z, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public Context f6397d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f6398e;

    /* renamed from: i, reason: collision with root package name */
    public m f6399i;

    /* renamed from: l, reason: collision with root package name */
    public ExpandedMenuView f6400l;

    /* renamed from: m, reason: collision with root package name */
    public y f6401m;

    /* renamed from: n, reason: collision with root package name */
    public h f6402n;

    public i(ContextWrapper contextWrapper) {
        this.f6397d = contextWrapper;
        this.f6398e = LayoutInflater.from(contextWrapper);
    }

    @Override // m.z
    public final void a(m mVar, boolean z7) {
        y yVar = this.f6401m;
        if (yVar != null) {
            yVar.a(mVar, z7);
        }
    }

    @Override // m.z
    public final void d() {
        h hVar = this.f6402n;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // m.z
    public final boolean f(o oVar) {
        return false;
    }

    @Override // m.z
    public final void g(Context context, m mVar) {
        if (this.f6397d != null) {
            this.f6397d = context;
            if (this.f6398e == null) {
                this.f6398e = LayoutInflater.from(context);
            }
        }
        this.f6399i = mVar;
        h hVar = this.f6402n;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // m.z
    public final boolean h() {
        return false;
    }

    @Override // m.z
    public final boolean i(F f7) {
        boolean hasVisibleItems = f7.hasVisibleItems();
        Context context = f7.f6410a;
        if (!hasVisibleItems) {
            return false;
        }
        n nVar = new n();
        nVar.f6434d = f7;
        B6.p pVar = new B6.p(context);
        C0518e c0518e = (C0518e) pVar.f234c;
        i iVar = new i(c0518e.f5417a);
        nVar.f6436i = iVar;
        iVar.f6401m = nVar;
        f7.b(iVar, context);
        i iVar2 = nVar.f6436i;
        if (iVar2.f6402n == null) {
            iVar2.f6402n = new h(iVar2);
        }
        c0518e.f5428m = iVar2.f6402n;
        c0518e.f5429n = nVar;
        View view = f7.f6423o;
        if (view != null) {
            c0518e.f5421e = view;
        } else {
            c0518e.f5419c = f7.f6422n;
            c0518e.f5420d = f7.f6421m;
        }
        c0518e.f5427l = nVar;
        DialogInterfaceC0522i b7 = pVar.b();
        nVar.f6435e = b7;
        b7.setOnDismissListener(nVar);
        WindowManager.LayoutParams attributes = nVar.f6435e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        nVar.f6435e.show();
        y yVar = this.f6401m;
        if (yVar == null) {
            return true;
        }
        yVar.i(f7);
        return true;
    }

    @Override // m.z
    public final void j(y yVar) {
        throw null;
    }

    @Override // m.z
    public final boolean k(o oVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        this.f6399i.q(this.f6402n.getItem(i2), this, 0);
    }
}
